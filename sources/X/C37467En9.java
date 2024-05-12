package X;

import java.io.InputStream;

/* renamed from: X.En9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37467En9 {
    public static final String LIZ(InterfaceC37464En6 interfaceC37464En6) {
        Object LJI;
        InputStream data;
        if (interfaceC37464En6 == null) {
            LJI = null;
        } else {
            try {
                LJI = interfaceC37464En6.LJI();
            } catch (Throwable th) {
                LJI = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LJI);
            }
        }
        C3C5.m7constructorimpl(LJI);
        if (C3C5.m12isFailureimpl(LJI)) {
            LJI = null;
        }
        String str = (String) LJI;
        if (interfaceC37464En6 == null || (data = interfaceC37464En6.getData()) == null) {
            return null;
        }
        return C37270Ejy.LIZ(data, str);
    }
}
