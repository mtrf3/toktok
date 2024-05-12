package X;

import defpackage.b1;
import kotlin.jvm.internal.o;

/* renamed from: X.9nW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247509nW {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null) {
            return abstractC247499nV.LJIILLIIL();
        }
        return false;
    }

    public static String LIZ(String originKey) {
        String str;
        o.LJIIIZ(originKey, "originKey");
        if (LIZIZ()) {
            StringBuilder LIZJ = b1.LIZJ(originKey, "_");
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                str = abstractC247499nV.LJIILIIL();
            } else {
                str = null;
            }
            LIZJ.append(str);
            return X1D.LIZIZ(LIZJ);
        }
        return originKey;
    }
}
