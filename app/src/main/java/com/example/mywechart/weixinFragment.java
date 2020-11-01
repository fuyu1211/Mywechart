package com.example.mywechart;

        import android.content.Context;
        import android.os.Bundle;

        import android.app.Fragment;

        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.ItemTouchHelper;
        import androidx.recyclerview.widget.LinearLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import java.util.ArrayList;
        import java.util.List;


public class weixinFragment extends Fragment {



    private RecyclerView recyclerView;
    private List<String> mList = new ArrayList<>();
    private Context context;
    private adapter_swipe adapter;

    public weixinFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.tab01, container, false);

        recyclerView=view.findViewById(R.id.rcv_swipe);
        initData();
        initView();

        return view;
    }

    private void initData() {
        mList.add("Never Gonna Give You UP");
        mList.add("Scared To Be Lonely");
        mList.add("Once Upon a Time");
        mList.add("Ham");
        mList.add("How To Love");
        mList.add("In The Name Of Love");
        mList.add("Bloom");
        mList.add("Ghost");
        mList.add("Rather Be");
        mList.add("Wake Up");
        mList.add("Play With Fire");
        mList.add("The Cure");
        mList.add("Where Is You Love");
        mList.add("Changing");
        mList.add("Come and Get You Love");
        mList.add("Money Run Low");
        mList.add("Radioactive In The Dark");
        mList.add("Come Back To You");
        mList.add("The Heat");
        mList.add("There For You");
        mList.add("Here with You");
        mList.add("Wannabe");
        mList.add("Flowers");
        mList.add("Suck for You");
        mList.add("Take a Walk");
        mList.add("Shots");
        mList.add("Meant To Be");
        mList.add("Ferrari");
        mList.add("Hey Mamma");
        mList.add("Hands in the Fire");
    }

    private void initView(){
        context=this.getActivity();
        adapter=new adapter_swipe(context,mList);

        ItemTouchHelper.Callback callback = new SwipeItemTouchHelper(adapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(recyclerView);

        LinearLayoutManager manager=new LinearLayoutManager(context);
        manager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
    }


}