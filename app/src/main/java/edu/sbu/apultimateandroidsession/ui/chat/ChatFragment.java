package edu.sbu.apultimateandroidsession.ui.chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.sbu.apultimateandroidsession.Message;
import edu.sbu.apultimateandroidsession.R;

public class ChatFragment extends Fragment {
    private List<Message> list;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_chat, container,false);


        Message[] items = {
                new Message("Indigo", "Hiii asdasda da"),
                new Message("Red", "Hiii asd asd ad"),
                new Message("Self", "Hiiia sdasd asd"),
                new Message("Green", "qwewqe qw eqwe 123 123"),
                new Message("Amber", " asdasd asd asd as das"),
                new Message("Self", "a sda sdas dasd as dsa "),
                new Message("Indigo", "Hiii asdasda da"),
                new Message("Red", "Hiii asd asd ad"),
                new Message("Self", "Hiiia sdasd asd"),
                new Message("Green", "qwewqe qw eqwe 123 123"),
                new Message("Amber", " asdasd asd asd as das"),
                new Message("Self", "a sda sdas dasd as dsa "),
                new Message("Indigo", "Hiii asdasda da"),
                new Message("Red", "Hiii asd asd ad"),
                new Message("Self", "Hiiia sdasd asd"),
                new Message("Green", "qwewqe  qwewq eqwewqe qwewqe qwewqeqwe wqeq wewq qwewqeq wewqeq   qwew qeqwewqe qw e qwe 123 123"),
                new Message("Amber", " asdasd asd asd as das"),
                new Message("Self", "a sda sdas dasd as dsa "),
                new Message("Indigo", "Hiii asdasda da"),
                new Message("Red", "Hiii asd asd ad"),
                new Message("Self", "Hiiia sdasd asd"),
                new Message("Green", "qwewqe qw eqwe 123 123"),
                new Message("Amber", " asdasd asd asd as das"),
                new Message("Self", "a sda sdas dasd as dsa ")
        };
        list = new ArrayList<>();
        list.addAll(Arrays.asList(items));

        RecyclerView recyclerView = root.findViewById(R.id.message_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        MessageListAdapter adapter = new MessageListAdapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        return root;
    }
}
