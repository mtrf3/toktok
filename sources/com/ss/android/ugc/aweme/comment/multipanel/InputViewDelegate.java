package com.ss.android.ugc.aweme.comment.multipanel;

import X.C105374Bp;
import X.C105454Bx;
import X.InterfaceC105344Bm;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;

/* loaded from: classes2.dex */
public class InputViewDelegate implements InterfaceC105344Bm {
    public final InterfaceC105344Bm LJLIL;

    @Override // X.InterfaceC105344Bm
    public final void LLLLLZIL() {
    }

    @Override // X.InterfaceC105344Bm
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public /* bridge */ /* synthetic */ void onDestroy() {
        C105374Bp.LIZ(this);
    }

    @Override // X.InterfaceC105344Bm
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public /* bridge */ /* synthetic */ void onPause() {
        C105374Bp.LIZIZ(this);
    }

    @Override // X.InterfaceC105344Bm
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public /* bridge */ /* synthetic */ void onResume() {
        C105374Bp.LIZJ(this);
    }

    public InputViewDelegate(InterfaceC105344Bm interfaceC105344Bm) {
        this.LJLIL = interfaceC105344Bm;
    }

    @Override // X.InterfaceC105344Bm
    public final void Cf(String str) {
        this.LJLIL.Cf(str);
    }

    @Override // X.InterfaceC105344Bm
    public final void LLLZLZ(C105454Bx c105454Bx) {
        this.LJLIL.LLLZLZ(c105454Bx);
    }

    @Override // X.InterfaceC105344Bm
    public final void j2(CommentPersonalizedEmoji commentPersonalizedEmoji) {
        this.LJLIL.j2(commentPersonalizedEmoji);
    }
}
