package X;

import com.ss.android.medialib.presenter.IStickerRequestCallback;

/* loaded from: classes8.dex */
public final class IB4 implements IStickerRequestCallback {
    public final /* synthetic */ C46193IAz LIZ;

    public IB4(C46193IAz c46193IAz) {
        this.LIZ = c46193IAz;
    }

    @Override // com.ss.android.medialib.presenter.IStickerRequestCallback
    public final void onStickerRequested(long j, boolean z) {
        if (C43416H2e.LIZ()) {
            C79067V1j LLLL = this.LIZ.LLLL();
            LLLL.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Effect call back, try to send messages to EE, ");
            LIZ.append(LLLL.LJLILLLLZI);
            H78.LIZIZ("MET-JADEN", X1D.LIZIZ(LIZ));
            LLLL.LJLJI.post(new RunnableC78854Ux8(LLLL, j, z));
        }
    }
}
