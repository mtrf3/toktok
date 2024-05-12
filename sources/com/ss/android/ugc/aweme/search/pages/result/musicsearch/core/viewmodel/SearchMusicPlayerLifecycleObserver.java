package com.ss.android.ugc.aweme.search.pages.result.musicsearch.core.viewmodel;

import X.ActivityC45651qj;
import X.EnumC50363Jpf;
import X.ProgressDialogC43241Gy5;
import Y.AObserverS76S0100000_8;
import Y.ARunnableS44S0100000_8;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;

/* loaded from: classes9.dex */
public class SearchMusicPlayerLifecycleObserver implements GenericLifecycleObserver {
    public final ActivityC45651qj LJLIL;
    public MusicPlayHelper LJLILLLLZI;
    public ProgressDialogC43241Gy5 LJLJI;
    public final AObserverS76S0100000_8 LJLJJI = new AObserverS76S0100000_8(this, 58);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        EnumC50363Jpf.INSTANCE.async(new ARunnableS44S0100000_8(this, 45));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        ProgressDialogC43241Gy5 progressDialogC43241Gy5 = this.LJLJI;
        if (progressDialogC43241Gy5 != null) {
            progressDialogC43241Gy5.dismiss();
        }
        this.LJLJI = null;
        MusicPlayHelper musicPlayHelper = this.LJLILLLLZI;
        if (musicPlayHelper != null) {
            musicPlayHelper.LJLJJL.removeObserver(this.LJLJJI);
        }
    }

    public SearchMusicPlayerLifecycleObserver(ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
    }
}
