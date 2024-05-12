package X;

import android.graphics.Bitmap;

/* renamed from: X.Rq3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70771Rq3 extends AbstractC85293Wj {
    public final /* synthetic */ C27606AsU LJLIL;
    public final /* synthetic */ C70763Rpv LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        C27606AsU c27606AsU = this.LJLIL;
        c27606AsU.LJFF = bitmap;
        this.LJLILLLLZI.LJ.setParams(c27606AsU);
    }

    public C70771Rq3(C27606AsU c27606AsU, C70763Rpv c70763Rpv) {
        this.LJLIL = c27606AsU;
        this.LJLILLLLZI = c70763Rpv;
    }
}
