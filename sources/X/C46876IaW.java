package X;

import com.ss.android.ugc.playerkit.model.DashAutoBitrateSet;

/* renamed from: X.IaW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46876IaW implements IY3 {
    public final /* synthetic */ DashAutoBitrateSet LIZ;

    @Override // X.IY3
    public final double LIZ() {
        return this.LIZ.firstParam;
    }

    @Override // X.IY3
    public final double LIZIZ() {
        return this.LIZ.thirdParam;
    }

    @Override // X.IY3
    public final double LIZJ() {
        return this.LIZ.minBitrate;
    }

    @Override // X.IY3
    public final double LIZLLL() {
        return this.LIZ.fourthParam;
    }

    @Override // X.IY3
    public final double LJ() {
        return this.LIZ.secondParam;
    }

    public C46876IaW(DashAutoBitrateSet dashAutoBitrateSet) {
        this.LIZ = dashAutoBitrateSet;
    }
}
