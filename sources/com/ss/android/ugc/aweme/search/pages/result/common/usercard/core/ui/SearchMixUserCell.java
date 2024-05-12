package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui;

import X.C30581Hy;
import X.C32151Nz;
import X.C49207JSx;
import X.C49268JVg;
import X.C49396Ja4;
import X.JTE;
import X.JTG;
import X.JVM;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.SearchUserLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes9.dex */
public class SearchMixUserCell extends JTE<C49268JVg> implements GenericLifecycleObserver {
    public final C49396Ja4 LJLL;
    public SearchResultParam LJLLI;
    public final RecyclerView LJLLILLLL;
    public C49268JVg LJLLJ;
    public C49207JSx LJLLL;
    public int LJLLLL;
    public String LJLLLLLL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        EventBus.LIZJ().LJIJ(this);
    }

    public SearchMixUserCell(View view, Context context) {
        super(view, context);
        this.LJLJI.setText(context.getString(R.string.tjc));
        JVM jvm = new JVM(this);
        RecyclerView recyclerView = new RecyclerView(context, null);
        this.LJLLILLLL = recyclerView;
        SearchUserLinearLayoutManager searchUserLinearLayoutManager = new SearchUserLinearLayoutManager();
        searchUserLinearLayoutManager.LLJJIII(1);
        recyclerView.setLayoutManager(searchUserLinearLayoutManager);
        if (recyclerView.getItemAnimator() != null) {
            recyclerView.getItemAnimator().LJFF = 0L;
        }
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setPadding(0, C32151Nz.LJIILLIIL(8), 0, C32151Nz.LJIILLIIL(16));
        this.LJLJJL.addView(recyclerView);
        C49396Ja4 c49396Ja4 = new C49396Ja4(new SearchKeywordPresenter(C30581Hy.LJJIJIL(view)), jvm);
        this.LJLL = c49396Ja4;
        recyclerView.setAdapter(c49396Ja4);
        if (JTG.LIZ()) {
            recyclerView.setMotionEventSplittingEnabled(false);
        }
    }
}
