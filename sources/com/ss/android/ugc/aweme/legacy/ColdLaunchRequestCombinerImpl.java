package com.ss.android.ugc.aweme.legacy;

import X.C58096Mr6;
import X.EI5;
import X.InterfaceC36167EHj;
import com.ss.android.ugc.aweme.request_combine.BaseCombineMode;
import com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner;

/* loaded from: classes7.dex */
public class ColdLaunchRequestCombinerImpl implements IColdLaunchRequestCombiner {
    public final EI5 LIZ = EI5.LIZ;

    public static IColdLaunchRequestCombiner LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IColdLaunchRequestCombiner.class, false);
        if (LIZ != null) {
            return (IColdLaunchRequestCombiner) LIZ;
        }
        if (C58096Mr6.a2 == null) {
            synchronized (IColdLaunchRequestCombiner.class) {
                if (C58096Mr6.a2 == null) {
                    C58096Mr6.a2 = new ColdLaunchRequestCombinerImpl();
                }
            }
        }
        return C58096Mr6.a2;
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final boolean LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final void LIZ(InterfaceC36167EHj interfaceC36167EHj) {
        this.LIZ.LIZ(interfaceC36167EHj);
    }

    @Override // com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner
    public final BaseCombineMode getResponse(String str) {
        return this.LIZ.getResponse(str);
    }
}
