package X;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: X.VdB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80165VdB {
    public final /* synthetic */ C80164VdA LIZ;

    public C80165VdB(C80164VdA c80164VdA) {
        this.LIZ = c80164VdA;
    }

    public final ValueAnimator LIZ(int i) {
        C80164VdA c80164VdA = this.LIZ;
        return c80164VdA.LJI(i, 0, c80164VdA.LJLJJLL, c80164VdA.LLFFF);
    }

    public final void LIZJ(EnumC80174VdK enumC80174VdK) {
        switch (C80175VdL.LIZ[enumC80174VdK.ordinal()]) {
            case 1:
                C80164VdA c80164VdA = this.LIZ;
                EnumC80174VdK enumC80174VdK2 = c80164VdA.LLJLIL;
                EnumC80174VdK enumC80174VdK3 = EnumC80174VdK.None;
                if (enumC80174VdK2 != enumC80174VdK3 && c80164VdA.LJLILLLLZI == 0) {
                    c80164VdA.LJIILIIL(enumC80174VdK3);
                    return;
                } else {
                    if (c80164VdA.LJLILLLLZI == 0) {
                        return;
                    }
                    LIZ(0);
                    return;
                }
            case 2:
                C80164VdA c80164VdA2 = this.LIZ;
                if (!c80164VdA2.LLJLIL.isOpening && c80164VdA2.LJIIJ(c80164VdA2.LLFZ)) {
                    this.LIZ.LJIILIIL(EnumC80174VdK.PullDownToRefresh);
                    return;
                } else {
                    this.LIZ.setViceState(EnumC80174VdK.PullDownToRefresh);
                    return;
                }
            case 3:
                C80164VdA c80164VdA3 = this.LIZ;
                if (c80164VdA3.LJIIJ(c80164VdA3.LLI)) {
                    C80164VdA c80164VdA4 = this.LIZ;
                    EnumC80174VdK enumC80174VdK4 = c80164VdA4.LLJLIL;
                    if (!enumC80174VdK4.isOpening && !enumC80174VdK4.isFinishing && (!c80164VdA4.LLILL || !c80164VdA4.LLIIIJ || !c80164VdA4.LLILLIZIL)) {
                        c80164VdA4.LJIILIIL(EnumC80174VdK.PullUpToLoad);
                        return;
                    }
                }
                this.LIZ.setViceState(EnumC80174VdK.PullUpToLoad);
                return;
            case 4:
                C80164VdA c80164VdA5 = this.LIZ;
                if (!c80164VdA5.LLJLIL.isOpening && c80164VdA5.LJIIJ(c80164VdA5.LLFZ)) {
                    this.LIZ.LJIILIIL(EnumC80174VdK.PullDownCanceled);
                    LIZJ(EnumC80174VdK.None);
                    return;
                } else {
                    this.LIZ.setViceState(EnumC80174VdK.PullDownCanceled);
                    return;
                }
            case 5:
                C80164VdA c80164VdA6 = this.LIZ;
                if (c80164VdA6.LJIIJ(c80164VdA6.LLI)) {
                    C80164VdA c80164VdA7 = this.LIZ;
                    if (!c80164VdA7.LLJLIL.isOpening && (!c80164VdA7.LLILL || !c80164VdA7.LLIIIJ || !c80164VdA7.LLILLIZIL)) {
                        c80164VdA7.LJIILIIL(EnumC80174VdK.PullUpCanceled);
                        LIZJ(EnumC80174VdK.None);
                        return;
                    }
                }
                this.LIZ.setViceState(EnumC80174VdK.PullUpCanceled);
                return;
            case 6:
                C80164VdA c80164VdA8 = this.LIZ;
                if (!c80164VdA8.LLJLIL.isOpening && c80164VdA8.LJIIJ(c80164VdA8.LLFZ)) {
                    this.LIZ.LJIILIIL(EnumC80174VdK.ReleaseToRefresh);
                    return;
                } else {
                    this.LIZ.setViceState(EnumC80174VdK.ReleaseToRefresh);
                    return;
                }
            case 7:
                C80164VdA c80164VdA9 = this.LIZ;
                if (c80164VdA9.LJIIJ(c80164VdA9.LLI)) {
                    C80164VdA c80164VdA10 = this.LIZ;
                    EnumC80174VdK enumC80174VdK5 = c80164VdA10.LLJLIL;
                    if (!enumC80174VdK5.isOpening && !enumC80174VdK5.isFinishing && (!c80164VdA10.LLILL || !c80164VdA10.LLIIIJ || !c80164VdA10.LLILLIZIL)) {
                        c80164VdA10.LJIILIIL(EnumC80174VdK.ReleaseToLoad);
                        return;
                    }
                }
                this.LIZ.setViceState(EnumC80174VdK.ReleaseToLoad);
                return;
            case 8:
                C80164VdA c80164VdA11 = this.LIZ;
                if (!c80164VdA11.LLJLIL.isOpening && c80164VdA11.LJIIJ(c80164VdA11.LLFZ)) {
                    this.LIZ.LJIILIIL(EnumC80174VdK.ReleaseToTwoLevel);
                    return;
                } else {
                    this.LIZ.setViceState(EnumC80174VdK.ReleaseToTwoLevel);
                    return;
                }
            case 9:
                C80164VdA c80164VdA12 = this.LIZ;
                if (!c80164VdA12.LLJLIL.isOpening && c80164VdA12.LJIIJ(c80164VdA12.LLFZ)) {
                    this.LIZ.LJIILIIL(EnumC80174VdK.RefreshReleased);
                    return;
                } else {
                    this.LIZ.setViceState(EnumC80174VdK.RefreshReleased);
                    return;
                }
            case 10:
                C80164VdA c80164VdA13 = this.LIZ;
                if (!c80164VdA13.LLJLIL.isOpening && c80164VdA13.LJIIJ(c80164VdA13.LLI)) {
                    this.LIZ.LJIILIIL(EnumC80174VdK.LoadReleased);
                    return;
                } else {
                    this.LIZ.setViceState(EnumC80174VdK.LoadReleased);
                    return;
                }
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                this.LIZ.setStateRefreshing(true);
                return;
            case 12:
                this.LIZ.setStateLoading(true);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                C80164VdA c80164VdA14 = this.LIZ;
                if (c80164VdA14.LLJLIL != EnumC80174VdK.Refreshing) {
                    return;
                }
                c80164VdA14.LJIILIIL(EnumC80174VdK.RefreshFinish);
                return;
            case 14:
                C80164VdA c80164VdA15 = this.LIZ;
                if (c80164VdA15.LLJLIL != EnumC80174VdK.Loading) {
                    return;
                }
                c80164VdA15.LJIILIIL(EnumC80174VdK.LoadFinish);
                return;
            case 15:
                this.LIZ.LJIILIIL(EnumC80174VdK.TwoLevelReleased);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                this.LIZ.LJIILIIL(EnumC80174VdK.TwoLevelFinish);
                return;
            case 17:
                this.LIZ.LJIILIIL(EnumC80174VdK.TwoLevel);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0191, code lost:
    
        if (r1 >= 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x030b, code lost:
    
        if (r7 == false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0306  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C80165VdB LIZIZ(int r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 843
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80165VdB.LIZIZ(int, boolean):X.VdB");
    }
}
