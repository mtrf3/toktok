package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Skc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72982Skc implements KRL {
    public final /* synthetic */ C72979SkZ LJLIL;

    @Override // X.KRL
    public final void LIZJ(String str) {
    }

    @Override // X.KRL
    public final void LJIIIIZZ(float f, int i) {
    }

    @Override // X.KRL
    public final void LJIILL(String str) {
    }

    @Override // X.KRL
    public final void LJLIIL(int i, int i2, long j) {
    }

    @Override // X.KRL
    public final void onBufferedPercent(String str, long j, int i) {
    }

    @Override // X.KRL
    public final void onBuffering(boolean z) {
    }

    @Override // X.KRL
    public final void onPausePlay(String str) {
    }

    @Override // X.KRL
    public final void onPreparePlay(String str) {
    }

    @Override // X.KRL
    public final void onResumePlay(String str) {
    }

    public C72982Skc(C72979SkZ c72979SkZ) {
        this.LJLIL = c72979SkZ;
    }

    @Override // X.KRL
    public final void onPlayCompleted(String str) {
        C72981Skb c72981Skb = this.LJLIL.LJIILLIIL;
        if (c72981Skb != null) {
            c72981Skb.getPlayHeadToLeft().invoke();
            c72981Skb.getPlayOffset().invoke(c72981Skb.getPlayHeadCenterX().LIZIZ);
        } else {
            o.LJIJI("scrollHandle");
            throw null;
        }
    }

    @Override // X.KRL
    public final void onPlayProgressChange(float f) {
        this.LJLIL.LJIIJ.LIZIZ(Float.valueOf(f / 100));
    }
}
