package com.ss.android.ugc.aweme.tools.draft.music;

import X.C10K;
import X.C43882HKc;
import X.C47918IrK;
import X.C60903NvH;
import X.C6BK;
import X.C76800UCe;
import X.C86793Y4n;
import X.H7B;
import X.InterfaceC169146kQ;
import X.InterfaceC88473Ynt;
import Y.ACallableS39S0400000_2;
import Y.AgS120S0100000_2;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes3.dex */
public final class DraftOnlineMusicProcessor implements GenericLifecycleObserver, InterfaceC169146kQ {
    public final AwemeDraft LJLIL;
    public InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super String, C76800UCe> LJLILLLLZI;
    public boolean LJLJI = true;
    public String LJLJJI;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        this.LJLILLLLZI = null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC169146kQ
    public final void LIZ() {
        String str;
        if (C47918IrK.LIZ(C60903NvH.LJ)) {
            AwemeDraft awemeDraft = this.LJLIL;
            AVMusic aVMusic = awemeDraft.LIZLLL;
            o.LJI(aVMusic);
            n nVar = new n();
            C10K.LIZJ(new ACallableS39S0400000_2(this, aVMusic, awemeDraft, nVar, 0));
            C10K<TResult> c10k = nVar.LIZ;
            o.LJIIIIZZ(c10k, "musicHandleTask.task");
            c10k.LJ(new AgS120S0100000_2(this, 22), C10K.LJIIIIZZ, null);
            return;
        }
        AVMusic aVMusic2 = this.LJLIL.LIZLLL;
        if (aVMusic2 != null && C86793Y4n.LJIILL(aVMusic2)) {
            AwemeDraft awemeDraft2 = this.LJLIL;
            AVMusic aVMusic3 = awemeDraft2.LIZLLL;
            if (aVMusic3 != null) {
                str = C86793Y4n.LJIILLIIL(aVMusic3);
            } else {
                str = null;
            }
            awemeDraft2.LJI = str;
            H7B.LIZ("draft_music_process, Network not available, Online music file exist");
            InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super String, C76800UCe> interfaceC88473Ynt = this.LJLILLLLZI;
            if (interfaceC88473Ynt == null) {
                return;
            }
            Boolean bool = Boolean.TRUE;
            interfaceC88473Ynt.invoke(bool, bool, null);
            return;
        }
        H7B.LIZJ("draft_music_process, Network not available, Online music file not exist, draft resume fail");
        InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super String, C76800UCe> interfaceC88473Ynt2 = this.LJLILLLLZI;
        if (interfaceC88473Ynt2 == null) {
            return;
        }
        Boolean bool2 = Boolean.FALSE;
        interfaceC88473Ynt2.invoke(bool2, bool2, null);
    }

    public DraftOnlineMusicProcessor(AwemeDraft awemeDraft, InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super String, C76800UCe> interfaceC88473Ynt) {
        this.LJLIL = awemeDraft;
        this.LJLILLLLZI = interfaceC88473Ynt;
    }

    public final void LIZIZ(int i, String str, String str2) {
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("errorDesc", str);
        c6bk.LIZ.put("music_id", str2);
        C43882HKc.LIZLLL(i, "draft_music_permission_check_rate", c6bk.LJ(), true);
    }
}
