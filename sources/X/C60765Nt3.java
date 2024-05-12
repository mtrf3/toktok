package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;

/* renamed from: X.Nt3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60765Nt3 extends AbstractC60629Nqr<C60401NnB> {
    public final C60766Nt4 LJLJL;
    public final /* synthetic */ C60762Nt0 LJLJLJ;

    @Override // X.AbstractC60629Nqr
    public final boolean LIZIZ() {
        return this.LJLJLJ.LJLJJI;
    }

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        LJ("onPermissionRequest", this.LJLJL, LiveCenterDelayLoadSetting.DEFAULT);
    }

    public C60765Nt3(C60762Nt0 c60762Nt0) {
        this.LJLJLJ = c60762Nt0;
        this.LJLJL = new C60766Nt4(this, c60762Nt0);
    }
}
