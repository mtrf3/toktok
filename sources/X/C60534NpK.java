package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;

/* renamed from: X.NpK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60534NpK extends AbstractC60629Nqr<C60401NnB> {
    public final C60535NpL LJLJL = new C60535NpL(this);
    public final /* synthetic */ C60647Nr9 LJLJLJ;

    @Override // X.AbstractC60629Nqr
    public final boolean LIZIZ() {
        return this.LJLJLJ.LJLJJI;
    }

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        LJ("onProgressChanged", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
        LJ("getDefaultVideoPoster", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
    }

    public C60534NpK(C60647Nr9 c60647Nr9) {
        this.LJLJLJ = c60647Nr9;
    }
}
