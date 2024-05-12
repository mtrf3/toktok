package com.ss.android.ugc.aweme.impl;

import X.C1DH;
import X.C35393Dun;
import X.C35810E3q;
import X.C36524EVc;
import X.C40438Fty;
import X.C40443Fu3;
import X.C58096Mr6;
import X.C61491OBj;
import com.bytedance.common.jato.JatoXL;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class OptimizerHelperServiceImpl implements IOptimizerHelperService {
    public static IOptimizerHelperService LJIIIZ() {
        Object LIZ = C58096Mr6.LIZ(IOptimizerHelperService.class, false);
        if (LIZ != null) {
            return (IOptimizerHelperService) LIZ;
        }
        if (C58096Mr6.p1 == null) {
            synchronized (IOptimizerHelperService.class) {
                if (C58096Mr6.p1 == null) {
                    C58096Mr6.p1 = new OptimizerHelperServiceImpl();
                }
            }
        }
        return C58096Mr6.p1;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final boolean LIZJ() {
        return ((Boolean) C35393Dun.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJII() {
        if (C40438Fty.LJI) {
            return;
        }
        C40438Fty.LJI = true;
        C40443Fu3.LIZ("search_sug").start();
        C1DH.LJJIJIIJIL(5000L, C40438Fty.LJII);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final boolean LIZ() {
        return JatoXL.isInited();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LIZLLL() {
        C40438Fty.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJ() {
        C35810E3q.LJIILJJIL();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJFF() {
        C35810E3q.LJIILIIL();
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LIZIZ(long j) {
        C35810E3q.LJFF(j);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJI(boolean z) {
        C61491OBj.LJLIL = z;
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void k4(long j) {
        C35810E3q.LJIIJJI(j);
    }

    @Override // com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService
    public final void LJIIIIZZ(long j, int... iArr) {
        C36524EVc.LIZ(j, Arrays.copyOf(iArr, iArr.length));
    }
}
