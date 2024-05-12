package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;

/* renamed from: X.Nnb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60427Nnb extends AbstractC60629Nqr<C60422NnW> {
    public final C60702Ns2 LJLJL = new C60702Ns2(this);
    public final /* synthetic */ C60647Nr9 LJLJLJ;

    @Override // X.AbstractC60629Nqr
    public final boolean LIZIZ() {
        return this.LJLJLJ.LJLJJI;
    }

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        LJ("onPageFinished", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
        LJ("onReceivedError", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
        LJ("onReceivedHttpError", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
        LJ("onReceivedHttpAuthRequest", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
        LJ("onReceivedSslError", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
        LJ("onPageStarted", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
        LJ("shouldOverrideUrlLoading", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
        LJ("onLoadResource", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
        LJ("shouldInterceptRequest", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
        LJ("onRenderProcessGone", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
    }

    public C60427Nnb(C60647Nr9 c60647Nr9) {
        this.LJLJLJ = c60647Nr9;
    }
}
