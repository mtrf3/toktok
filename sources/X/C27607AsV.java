package X;

import android.graphics.Bitmap;

/* renamed from: X.AsV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27607AsV extends AbstractC85293Wj {
    public final /* synthetic */ C27606AsU LJLIL;
    public final /* synthetic */ C27605AsT LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        C27606AsU c27606AsU = this.LJLIL;
        c27606AsU.LJFF = bitmap;
        this.LJLILLLLZI.LJLILLLLZI.setParams(c27606AsU);
    }

    public C27607AsV(C27606AsU c27606AsU, C27605AsT c27605AsT) {
        this.LJLIL = c27606AsU;
        this.LJLILLLLZI = c27605AsT;
    }
}
