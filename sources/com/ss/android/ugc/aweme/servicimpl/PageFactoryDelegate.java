package com.ss.android.ugc.aweme.servicimpl;

import X.C1DG;
import X.C53066KsA;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C82343WTj;
import X.I23;
import X.I24;
import X.InterfaceC45854Hz8;
import X.L2L;
import X.WU3;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.gamora.PageFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class PageFactoryDelegate implements PageFactory {
    public static PageFactory LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(PageFactory.class, false);
        if (LIZ != null) {
            return (PageFactory) LIZ;
        }
        if (C58096Mr6.o6 == null) {
            synchronized (PageFactory.class) {
                if (C58096Mr6.o6 == null) {
                    C58096Mr6.o6 = new PageFactoryDelegate();
                }
            }
        }
        return C58096Mr6.o6;
    }

    @Override // com.ss.android.ugc.gamora.PageFactory
    public final InterfaceC45854Hz8 LIZ(String str) {
        C62822Ol8 c62822Ol8 = C53066KsA.LIZ;
        if (!((Boolean) c62822Ol8.getValue()).booleanValue()) {
            if (!AVInitializerImpl.LIZIZ) {
                return null;
            }
            return WU3.LIZIZ;
        }
        if (!AVInitializerImpl.LIZIZ) {
            return null;
        }
        if (C1DG.LJIIIIZZ()) {
            return new C82343WTj();
        }
        if (L2L.LIZLLL() == 0 || (((Boolean) c62822Ol8.getValue()).booleanValue() && o.LJ(str, "direct_shoot"))) {
            return new I23();
        }
        return new I24();
    }
}
