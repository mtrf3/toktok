package com.ss.android.ugc.aweme.follow.task;

import X.ActivityC45651qj;
import X.C16970lZ;
import X.C35393Dun;
import X.C84763XOl;
import X.EE4;
import X.HG3;
import X.InterfaceC36076EDw;
import X.LW9;
import X.LWC;
import X.LWM;
import X.RBX;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.impl.LauncherTaskApiImpl;
import com.ss.android.ugc.aweme.task.ExtendedPreloadTask;

/* loaded from: classes10.dex */
public final class FollowPreloadTask extends ExtendedPreloadTask implements InterfaceC36076EDw {
    public final Context LJLJI;

    @Override // com.ss.android.ugc.aweme.task.ExtendedPreloadTask
    public final String LIZLLL() {
        return "enter_homepage_follow_label";
    }

    @Override // X.InterfaceC36076EDw
    public final /* synthetic */ String[] deps() {
        return null;
    }

    @Override // X.EEY
    public final String key() {
        return "FollowPreloadTask";
    }

    @Override // X.InterfaceC36076EDw
    public final int priority() {
        return 2;
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final boolean meetTrigger() {
        if (((Boolean) C35393Dun.LIZJ.getValue()).booleanValue() || ((Boolean) C35393Dun.LIZIZ.getValue()).booleanValue() || !((Boolean) LWC.LIZIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean LJII() {
        String LJ = LJ();
        if (LJ != null && LJ.equals("3")) {
            return true;
        }
        String LJ2 = LJ();
        if (LJ2 != null && LJ2.equals("2")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC36076EDw
    public final EE4 threadType() {
        return EE4.CPU;
    }

    public FollowPreloadTask(Context context) {
        this.LJLJI = context;
    }

    @Override // X.EEY
    public final void run(Context context) {
        if (!((Boolean) LWC.LIZIZ.getValue()).booleanValue() && ((RBX) HG3.LJIILL()).isLogin()) {
            LauncherTaskApiImpl.LJIIIIZZ().LIZJ();
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if (LJIIIIZZ != null && (LJIIIIZZ instanceof ActivityC45651qj)) {
                if (!LWM.LIZIZ.LIZ.LJII((ActivityC45651qj) LJIIIIZZ)) {
                    if (((Boolean) LWC.LIZJ.getValue()).booleanValue() || ((Boolean) LWC.LIZLLL.getValue()).booleanValue()) {
                        LW9.LIZIZ();
                    } else {
                        String LJ = LJ();
                        if (LJ != null && LJ.equals("3") && (((Boolean) LWC.LJ.getValue()).booleanValue() || ((Boolean) LWC.LJFF.getValue()).booleanValue())) {
                            LW9.LIZIZ();
                        }
                    }
                }
            }
        }
        if (((Boolean) C35393Dun.LIZJ.getValue()).booleanValue() && LJII() && !C16970lZ.LIZIZ(context, "follow_feed_fragment_feed_with_skylight")) {
            C16970lZ.LJFF(this.LJLJI, "follow_feed_fragment_feed_with_skylight");
        }
        if (((Boolean) C35393Dun.LIZIZ.getValue()).booleanValue() && LJII() && !C16970lZ.LIZIZ(context, "empty_guide_layout_new")) {
            C16970lZ.LJFF(this.LJLJI, "empty_guide_layout_new");
        }
    }
}
