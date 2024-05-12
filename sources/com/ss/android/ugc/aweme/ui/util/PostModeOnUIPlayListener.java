package com.ss.android.ugc.aweme.ui.util;

import X.C203257yL;
import X.C2043680i;
import X.C222688oa;
import X.C48662J7y;
import X.C56462Jm;
import X.IPH;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;

/* loaded from: classes4.dex */
public final class PostModeOnUIPlayListener extends C48662J7y {
    public final Aweme LLLZLL;
    public final PostModeDetailParams LLLZLZ;
    public final PostModeTimeLoggerViewModel LLLZZ;

    @Override // X.IDP
    public final void LJLLL(Aweme aweme) {
    }

    @Override // X.IDP, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayPause(String str) {
        super.onPlayPause(str);
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModel = this.LLLZZ;
        if (postModeTimeLoggerViewModel != null) {
            postModeTimeLoggerViewModel.jv0(this.LLLZLL, this.LLLZLZ);
        }
    }

    @Override // X.IDP, X.C2LB
    public final void LJIIIIZZ(Activity activity, Fragment fragment) {
        Lifecycle lifecycle;
        super.LJIIIIZZ(activity, fragment);
        if (fragment != null && (lifecycle = fragment.getLifecycle()) != null) {
            lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.aweme.ui.util.PostModeOnUIPlayListener$onAttach$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_RESUME) {
                        onResume();
                    } else if (event == Lifecycle.Event.ON_PAUSE) {
                        onPause();
                    } else if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    PostModeOnUIPlayListener.this.LJLILLLLZI = null;
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
                public final void onPause() {
                    PostModeOnUIPlayListener.this.LJL();
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
                public final void onResume() {
                    PostModeOnUIPlayListener.this.LJLILLLLZI();
                }
            });
        }
    }

    @Override // X.IDP, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str, IPH iph) {
        C222688oa.LJJJIL(this, str, iph);
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModel = this.LLLZZ;
        if (postModeTimeLoggerViewModel != null) {
            postModeTimeLoggerViewModel.kv0();
        }
        PostModeDetailParams postModeDetailParams = this.LLLZLZ;
        if (postModeDetailParams != null && postModeDetailParams.needMobVideoPlay) {
            return;
        }
        C203257yL.LIZ(this.LLLZLL, postModeDetailParams);
    }

    public PostModeOnUIPlayListener(Aweme aweme, PostModeDetailParams postModeDetailParams, PostModeTimeLoggerViewModel postModeTimeLoggerViewModel, String str, int i, C2043680i c2043680i) {
        super(i, c2043680i, str);
        this.LLLZLL = aweme;
        this.LLLZLZ = postModeDetailParams;
        this.LLLZZ = postModeTimeLoggerViewModel;
        this.LLILLIZIL = new C56462Jm();
    }
}
