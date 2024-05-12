package o7a;

import X.C018905p;
import X.C119774mz;
import kotlin.jvm.internal.o;
import p8.a;

/* loaded from: classes9.dex */
public final class a {
    public static void LIZ(a.c cVar, C119774mz c119774mz, C018905p c018905p) {
        int i;
        String str = cVar.LIZ;
        o.LJIIIIZZ(str, "type.value");
        if (o.LJ(str, "left")) {
            i = -1;
        } else if (o.LJ(str, "right")) {
            i = 1;
        } else {
            i = 0;
        }
        c119774mz.setGravity(i);
    }
}
