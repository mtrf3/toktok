package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;

/* renamed from: X.Nnc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60428Nnc extends AbstractC60629Nqr<C60422NnW> {
    public final C60432Nng LJLJL;

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        LJ("onPageStarted", this.LJLJL, 7000);
        LJ("shouldInterceptRequest", this.LJLJL, 7000);
        LJ("shouldOverrideUrlLoading", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
        LJ("onPageFinished", this.LJLJL, 7000);
        LJ("onReceivedError", this.LJLJL, 7000);
        LJ("onReceivedHttpError", this.LJLJL, 7000);
        LJ("onReceivedSslError", this.LJLJL, 7000);
    }

    public C60428Nnc(InterfaceC60433Nnh interfaceC60433Nnh) {
        this.LJLJL = new C60432Nng(this, interfaceC60433Nnh);
    }
}
