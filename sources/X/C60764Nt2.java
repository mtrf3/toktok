package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;

/* renamed from: X.Nt2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60764Nt2 extends AbstractC60629Nqr<C60401NnB> {
    public final O14 LJLJL;
    public final /* synthetic */ C60763Nt1 LJLJLJ;

    @Override // X.AbstractC60629Nqr
    public final boolean LIZIZ() {
        return this.LJLJLJ.LJLJJI;
    }

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        LJ("onShowFileChooser", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
    }

    public C60764Nt2(C60763Nt1 c60763Nt1) {
        this.LJLJLJ = c60763Nt1;
        this.LJLJL = new O14(this, c60763Nt1);
    }
}
