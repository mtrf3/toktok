package X;

import Y.ARunnableS12S0400000_8;
import Y.ARunnableS44S0100000_8;
import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.api.IMLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.api.MLDataCenterService;
import com.ss.android.ugc.aweme.ml.api.SmartDataTrackerService;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.J2p, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48523J2p extends AbstractC48510J2c {
    public final String LIZIZ;
    public AbstractC48521J2n LIZJ;
    public C48524J2q LIZLLL;
    public boolean LJ;
    public C47333Iht LJFF;
    public OneSmartDataTrackConfig LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;

    @Override // X.AbstractC48510J2c
    public final C35750E1i LIZIZ() {
        if (o.LJ("getSmartRunner", "getSmartRunner")) {
            C35750E1i c35750E1i = new C35750E1i();
            c35750E1i.LIZIZ(this.LIZJ, "result");
            return c35750E1i;
        }
        return null;
    }

    @Override // X.AbstractC48510J2c
    public final boolean LIZLLL() {
        AbstractC48521J2n abstractC48521J2n = this.LIZJ;
        if (abstractC48521J2n != null) {
            return abstractC48521J2n.LIZIZ();
        }
        return false;
    }

    @Override // X.AbstractC48510J2c
    public final boolean LJ() {
        AbstractC48521J2n abstractC48521J2n = this.LIZJ;
        if (abstractC48521J2n != null) {
            return abstractC48521J2n.LIZLLL();
        }
        return false;
    }

    public final void LJIIJ() {
        AbstractC48521J2n abstractC48521J2n = this.LIZJ;
        if (abstractC48521J2n != null) {
            if (!this.LJIIIZ || (this.LJII < 12 && !abstractC48521J2n.LIZLLL())) {
                C48524J2q c48524J2q = this.LIZLLL;
                if (c48524J2q != null && c48524J2q.LIZIZ && !c48524J2q.LJFF) {
                    c48524J2q.LJI.LIZ = System.currentTimeMillis();
                }
                synchronized (this) {
                    abstractC48521J2n.LJ();
                }
                C48524J2q c48524J2q2 = this.LIZLLL;
                if (c48524J2q2 != null && c48524J2q2.LIZIZ && !c48524J2q2.LJFF) {
                    c48524J2q2.LJFF = true;
                    c48524J2q2.LJII = 0;
                    c48524J2q2.LJI.LIZIZ = System.currentTimeMillis();
                }
                this.LJIIIZ = true;
            }
        }
    }

    @Override // X.AbstractC48510J2c
    public final void LJI() {
        if (LIZLLL()) {
            J3U.LIZIZ(new ARunnableS44S0100000_8(this, 135));
        }
    }

    @Override // X.AbstractC48510J2c
    public final C47333Iht LJFF() {
        return this.LJFF;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48523J2p(String name) {
        super(name);
        o.LJIIIZ(name, "name");
        this.LIZIZ = i0.LJFF("ml#", name);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r0 == null) goto L25;
     */
    @Override // X.AbstractC48510J2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.C47663InD r8) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48523J2p.LIZJ(X.InD):void");
    }

    @Override // X.AbstractC48510J2c
    public final C47333Iht LJIIIIZZ(C47322Ihi c47322Ihi) {
        long j;
        AbstractC48521J2n abstractC48521J2n = this.LIZJ;
        if (abstractC48521J2n == null || !abstractC48521J2n.LJII()) {
            return null;
        }
        if (!abstractC48521J2n.LIZJ()) {
            this.LJII++;
            if (J3Y.LIZ) {
                String str = this.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("runSync end, skip, base env not ready envNotReadyTimes:");
                LIZ.append(this.LJII);
                J3Y.LIZJ(str, X1D.LIZIZ(LIZ), null);
            }
            return new C47333Iht(-2);
        }
        if (this.LJIIIIZZ > 16) {
            if (J3Y.LIZ) {
                String str2 = this.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("runSync end, skip, continues failed failTimes:");
                LIZ2.append(this.LJIIIIZZ);
                J3Y.LIZJ(str2, X1D.LIZIZ(LIZ2), null);
            }
            return new C47333Iht(-7);
        }
        try {
            synchronized (this) {
                LJIIJ();
                if (!abstractC48521J2n.LIZLLL()) {
                    this.LJII++;
                    if (J3Y.LIZ) {
                        String str3 = this.LIZIZ;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("runSync end, skip, env not ready envNotReadyTimes:");
                        LIZ3.append(this.LJII);
                        J3Y.LIZJ(str3, X1D.LIZIZ(LIZ3), null);
                    }
                    return new C47333Iht(-2);
                }
                LJIIIZ(c47322Ihi);
                boolean z = J3Y.LIZ;
                if (z) {
                    j = System.currentTimeMillis();
                } else {
                    j = 0;
                }
                C47333Iht LJI = abstractC48521J2n.LJI(c47322Ihi);
                C48524J2q c48524J2q = this.LIZLLL;
                if (c48524J2q != null) {
                    c48524J2q.LIZJ(c47322Ihi, LJI, abstractC48521J2n);
                }
                if (z) {
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    String str4 = this.LIZIZ;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("runSync end, cost:");
                    LIZ4.append(currentTimeMillis);
                    LIZ4.append(" result:");
                    LIZ4.append(LJI);
                    J3Y.LIZ(str4, X1D.LIZIZ(LIZ4));
                }
                if (LJI != null && LJI.LIZ()) {
                    this.LJIIIIZZ = 0;
                } else {
                    this.LJIIIIZZ++;
                }
                this.LJFF = LJI;
                return LJI;
            }
        } catch (Throwable unused) {
            J3Y.LIZIZ().LIZIZ(this.LIZIZ, "runSync error:");
            return new C47333Iht(-6);
        }
    }

    public final void LJIIIZ(C47322Ihi c47322Ihi) {
        SmartSceneConfig LJJZZI;
        String str;
        Object obj;
        byte[] bArr;
        float[] fArr;
        java.util.Map<String, Object> map;
        String str2;
        java.util.Map<String, Object> map2;
        OneSmartDataTrackConfig oneSmartDataTrackConfig = this.LJI;
        InputFeaturesConfig inputFeaturesConfig = null;
        if (oneSmartDataTrackConfig != null) {
            SmartDataTrackerService.Companion.getClass();
            ISmartDataTrackerService iSmartDataTrackerService = C48580J4u.LIZ;
            if (iSmartDataTrackerService.enable(oneSmartDataTrackConfig.getScene()) && oneSmartDataTrackConfig.getTrackType() == 0) {
                String scene = oneSmartDataTrackConfig.getScene();
                C47322Ihi c47322Ihi2 = new C47322Ihi(0);
                if (c47322Ihi != null) {
                    str = c47322Ihi.LIZ;
                } else {
                    str = null;
                }
                c47322Ihi2.LIZ = str;
                if (c47322Ihi != null) {
                    obj = c47322Ihi.LJI;
                } else {
                    obj = null;
                }
                c47322Ihi2.LJI = obj;
                if (c47322Ihi != null) {
                    bArr = c47322Ihi.LJFF;
                } else {
                    bArr = null;
                }
                c47322Ihi2.LJFF = bArr;
                if (c47322Ihi != null) {
                    fArr = c47322Ihi.LJ;
                } else {
                    fArr = null;
                }
                c47322Ihi2.LJ = fArr;
                if (c47322Ihi != null) {
                    map = c47322Ihi.LIZLLL;
                } else {
                    map = null;
                }
                c47322Ihi2.LIZLLL = map;
                if (c47322Ihi != null) {
                    str2 = c47322Ihi.LIZIZ;
                } else {
                    str2 = null;
                }
                c47322Ihi2.LIZIZ = str2;
                if (c47322Ihi != null && (map2 = c47322Ihi.LIZJ) != null) {
                    c47322Ihi2.LIZ().putAll(map2);
                }
                if ((c47322Ihi instanceof IFF) && c47322Ihi2.LJI == null) {
                    c47322Ihi2.LJI = ((IFF) c47322Ihi).LJIIIIZZ;
                }
                iSmartDataTrackerService.onScenePredictCheckOrRun(scene, c47322Ihi2, null);
            }
        }
        C48524J2q c48524J2q = this.LIZLLL;
        if (c48524J2q != null) {
            c48524J2q.LIZ(0);
            if (c48524J2q.LIZIZ) {
                c48524J2q.LJIIIIZZ.LIZ = System.currentTimeMillis();
                c48524J2q.LIZJ++;
            }
            if (c48524J2q.LIZIZ) {
                c48524J2q.LJIIIZ.LIZ = System.currentTimeMillis();
            }
        }
        MLDataCenterService.Companion.getClass();
        IMLDataCenterService iMLDataCenterService = C48563J4d.LIZ;
        C47663InD c47663InD = this.LIZ;
        if (c47663InD != null && (LJJZZI = C78880UxY.LJJZZI(c47663InD)) != null) {
            inputFeaturesConfig = LJJZZI.getFeatures();
        }
        iMLDataCenterService.fillInputFeatures(inputFeaturesConfig, c47322Ihi);
        C48524J2q c48524J2q2 = this.LIZLLL;
        if (c48524J2q2 == null || !c48524J2q2.LIZIZ) {
            return;
        }
        c48524J2q2.LJIIIZ.LIZIZ = System.currentTimeMillis();
    }

    @Override // X.AbstractC48510J2c
    public final void LJII(long j, C47322Ihi c47322Ihi, C48509J2b c48509J2b) {
        AbstractC48521J2n abstractC48521J2n = this.LIZJ;
        if (abstractC48521J2n == null) {
            c48509J2b.LIZ(null);
            return;
        }
        if (!abstractC48521J2n.LIZJ()) {
            this.LJII++;
            if (J3Y.LIZ) {
                String str = this.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("runAsyncDelay end, skip, base env not ready envNotReadyTimes:");
                LIZ.append(this.LJII);
                J3Y.LIZJ(str, X1D.LIZIZ(LIZ), null);
            }
            c48509J2b.LIZ(new C47333Iht(-2));
            return;
        }
        if (this.LJIIIIZZ > 16) {
            if (J3Y.LIZ) {
                String str2 = this.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("runAsyncDelay end, skip, continues failed failTimes:");
                LIZ2.append(this.LJIIIIZZ);
                J3Y.LIZJ(str2, X1D.LIZIZ(LIZ2), null);
            }
            c48509J2b.LIZ(new C47333Iht(-7));
            return;
        }
        J3U.LIZJ(j, new ARunnableS12S0400000_8(this, abstractC48521J2n, c48509J2b, c47322Ihi, 2));
    }
}
