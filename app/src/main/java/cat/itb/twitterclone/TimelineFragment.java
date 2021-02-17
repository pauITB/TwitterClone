package cat.itb.twitterclone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class TimelineFragment extends Fragment {

    TextView tweet;
    NavigationView navigationView;
    BottomNavigationView bottomNavigationView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.timeline_fragment,container,false);
        tweet = v.findViewById(R.id.tweet);
        navigationView = v.findViewById(R.id.navigationView);
        bottomNavigationView = v.findViewById(R.id.bottomNavigationView);


        return v;
    }
}
