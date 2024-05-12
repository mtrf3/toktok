package com.ss.android.ugc.aweme.servicimpl;

import X.C221108m2;
import X.C58096Mr6;
import X.C58227MtD;
import X.C62822Ol8;
import X.WMH;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.gamora.TTEPPageFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class TTEPPageFactoryDelegate implements TTEPPageFactory {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C58227MtD.LJLIL);

    public static TTEPPageFactory LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(TTEPPageFactory.class, false);
        if (LIZ != null) {
            return (TTEPPageFactory) LIZ;
        }
        if (C58096Mr6.q6 == null) {
            synchronized (TTEPPageFactory.class) {
                if (C58096Mr6.q6 == null) {
                    C58096Mr6.q6 = new TTEPPageFactoryDelegate();
                }
            }
        }
        return C58096Mr6.q6;
    }

    @Override // com.ss.android.ugc.gamora.TTEPPageFactory
    public final void LIZ(WMH wmh) {
        TTEPPageFactory tTEPPageFactory;
        o.LJIIIZ(wmh, "<this>");
        if (!AVInitializerImpl.LIZIZ || (tTEPPageFactory = (TTEPPageFactory) this.LIZ.getValue()) == null) {
            return;
        }
        tTEPPageFactory.LIZ(wmh);
    }
}
