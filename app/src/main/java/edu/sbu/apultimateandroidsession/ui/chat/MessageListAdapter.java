package edu.sbu.apultimateandroidsession.ui.chat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import edu.sbu.apultimateandroidsession.Message;
import edu.sbu.apultimateandroidsession.R;

public class MessageListAdapter extends RecyclerView.Adapter {
    private List<Message> list;
    MessageListAdapter(List<Message> list){
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MessageViewHolder mvh = (MessageViewHolder)holder;
        mvh.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    private class MessageViewHolder extends RecyclerView.ViewHolder{
        TextView messageText, timeText, nameText;

        MessageViewHolder(View itemView){
            super(itemView);
            messageText = itemView.findViewById(R.id.message_body);
            timeText= itemView.findViewById(R.id.message_time);
            nameText = itemView.findViewById(R.id.message_sender);
        }

        void bind(Message message) {
            messageText.setText(message.getBody());
            SimpleDateFormat formatter = new SimpleDateFormat("HH:mm", Locale.US);
            String time = formatter.format(message.getSentDate());
            timeText.setText(time);
            nameText.setText(message.getSender());
        }

    }
}
