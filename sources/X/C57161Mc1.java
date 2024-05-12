package X;

import com.ss.android.ugc.aweme.compliance.protection.antiaddiction.ContinuousTimeCalculator;

/* renamed from: X.Mc1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57161Mc1 implements InterfaceC48810JDq {
    public final /* synthetic */ ContinuousTimeCalculator LIZ;

    @Override // X.InterfaceC48810JDq
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC48810JDq
    public final void LIZ() {
        this.LIZ.mHandler.sendEmptyMessageDelayed(100004, ContinuousTimeCalculator.getBackgroundValue());
        C57408Mg0.LJFF(2);
    }

    public C57161Mc1(ContinuousTimeCalculator continuousTimeCalculator) {
        this.LIZ = continuousTimeCalculator;
    }
}
