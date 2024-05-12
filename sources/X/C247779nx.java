package X;

import Y.ACallableS5S1000000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.9nx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247779nx {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, String str2) {
        Boolean bool;
        java.util.Map<String, Boolean> LJ;
        C247579nd c247579nd = (C247579nd) C95J.LIZ(1003);
        if (c247579nd != null && (LJ = c247579nd.LJ()) != null) {
            bool = LJ.get(str2);
        } else {
            bool = null;
        }
        if (!o.LJ(bool, Boolean.TRUE)) {
            return;
        }
        C10K.LIZJ(new ACallableS5S1000000_6(str, 4));
    }
}
