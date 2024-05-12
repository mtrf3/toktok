package com.ss.android.ugc.aweme.tools.draft.music;

import X.C09900aA;
import X.C10K;
import X.C44172HVg;
import X.C44687HgJ;
import X.C47918IrK;
import X.C60903NvH;
import X.C6BK;
import X.C76800UCe;
import X.H7B;
import X.InterfaceC169146kQ;
import X.InterfaceC88473Ynt;
import X.X1D;
import Y.ACallableS39S0400000_2;
import Y.AgS120S0100000_2;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import kotlin.jvm.internal.o;
import ujb.s;
import v5.n;

/* loaded from: classes3.dex */
public final class DraftStreamMusicProcessor implements GenericLifecycleObserver, InterfaceC169146kQ {
    public final AwemeDraft LJLIL;
    public InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super String, C76800UCe> LJLILLLLZI;
    public boolean LJLJI = true;
    public String LJLJJI;

    @Override // X.InterfaceC169146kQ
    public final void LIZ() {
        String str;
        String str2;
        AVMusic aVMusic = this.LJLIL.LIZLLL;
        if (aVMusic != null) {
            str = aVMusic.path;
        } else {
            str = null;
        }
        if (C44172HVg.LJI.LJJIFFI(str)) {
            IAnotherMusicService iAnotherMusicService = C44172HVg.LJI;
            AVMusic aVMusic2 = this.LJLIL.LIZLLL;
            if (aVMusic2 != null) {
                str2 = aVMusic2.path;
            } else {
                str2 = null;
            }
            String LIZIZ = iAnotherMusicService.LIZIZ(str2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("draft_stream_music_process, Music strem file exist: localPath - ");
            LIZ.append(LIZIZ);
            H7B.LIZ(X1D.LIZIZ(LIZ));
            this.LJLIL.LJI = LIZIZ;
            InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super String, C76800UCe> interfaceC88473Ynt = this.LJLILLLLZI;
            if (interfaceC88473Ynt != null) {
                Boolean bool = Boolean.TRUE;
                interfaceC88473Ynt.invoke(bool, bool, null);
                return;
            }
            return;
        }
        String str3 = this.LJLIL.LJI;
        if (str3 == null || str3.length() == 0 || !(!s.LJJJLZIJ(str3, "http", false)) || !C44687HgJ.LIZIZ(this.LJLIL.LJI)) {
            if (C47918IrK.LIZ(C60903NvH.LJ)) {
                H7B.LIZ("draft_stream_music_process, Network available, music file not exist");
                AwemeDraft awemeDraft = this.LJLIL;
                AVMusic aVMusic3 = awemeDraft.LIZLLL;
                if (aVMusic3 == null) {
                    return;
                }
                n nVar = new n();
                C10K.LIZJ(new ACallableS39S0400000_2(this, aVMusic3, awemeDraft, nVar, 1));
                C10K<TResult> c10k = nVar.LIZ;
                o.LJIIIIZZ(c10k, "musicHandleTask.task");
                c10k.LJ(new AgS120S0100000_2(this, 24), C10K.LJIIIIZZ, null);
                return;
            }
            H7B.LIZJ("draft_stream_music_process, Network not available, music file not exist, draft resume fail");
            InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super String, C76800UCe> interfaceC88473Ynt2 = this.LJLILLLLZI;
            if (interfaceC88473Ynt2 == null) {
                return;
            }
            interfaceC88473Ynt2.invoke(Boolean.TRUE, Boolean.FALSE, null);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("draft_stream_music_process, Music local file exist: localPath - ");
        LIZ2.append(this.LJLIL.LJI);
        H7B.LIZ(X1D.LIZIZ(LIZ2));
        InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super String, C76800UCe> interfaceC88473Ynt3 = this.LJLILLLLZI;
        if (interfaceC88473Ynt3 == null) {
            return;
        }
        Boolean bool2 = Boolean.TRUE;
        interfaceC88473Ynt3.invoke(bool2, bool2, null);
    }

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

    public DraftStreamMusicProcessor(AwemeDraft awemeDraft, InterfaceC88473Ynt<? super Boolean, ? super Boolean, ? super String, C76800UCe> interfaceC88473Ynt) {
        this.LJLIL = awemeDraft;
        this.LJLILLLLZI = interfaceC88473Ynt;
    }

    public final void LIZIZ(int i, String str, String str2) {
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("errorDesc", str);
        c6bk.LIZ.put("music_id", str2);
        C09900aA.LJIIJJI("draft_music_permission_check_rate", i, c6bk.LJ());
    }
}
