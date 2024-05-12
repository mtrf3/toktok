package com.bytedance.pumbaa.bpea.adapter;

import X.C141335gf;
import X.C3C5;
import X.C46432IKe;
import X.C58096Mr6;
import X.C58607MzL;
import X.C58608MzM;
import X.C76800UCe;
import X.EP3;
import X.FJA;
import com.bytedance.pumbaa.bpea.adapter.api.IBPEAService;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BPEAServiceImp implements IBPEAService {
    public static IBPEAService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IBPEAService.class, false);
        if (LIZ != null) {
            return (IBPEAService) LIZ;
        }
        if (C58096Mr6.LJJIJ == null) {
            synchronized (IBPEAService.class) {
                if (C58096Mr6.LJJIJ == null) {
                    C58096Mr6.LJJIJ = new BPEAServiceImp();
                }
            }
        }
        return C58096Mr6.LJJIJ;
    }

    @Override // com.bytedance.pumbaa.bpea.adapter.api.IBPEAService
    public final boolean isInit() {
        return BPEAPumbaaService.LJFF.get();
    }

    @Override // com.bytedance.pumbaa.bpea.adapter.api.IBPEAService
    public final void LIZ(C58607MzL c58607MzL) {
        EP3.LIZIZ = c58607MzL;
    }

    @Override // com.bytedance.pumbaa.bpea.adapter.api.IBPEAService
    public final void LIZIZ(FJA initBlock) {
        Object LIZ;
        o.LJIIIZ(initBlock, "initBlock");
        try {
            initBlock.invoke();
            C46432IKe.LIZ(new C58608MzM());
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
    }
}
