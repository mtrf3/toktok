package X;

import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.PsR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65823PsR {
    public static EnumSet LIZ(long j) {
        EnumSet result = EnumSet.noneOf(EnumC65824PsS.class);
        Iterator<E> it = EnumC65824PsS.ALL.iterator();
        while (it.hasNext()) {
            EnumC65824PsS enumC65824PsS = (EnumC65824PsS) it.next();
            if ((enumC65824PsS.getValue() & j) != 0) {
                result.add(enumC65824PsS);
            }
        }
        o.LJIIIIZZ(result, "result");
        return result;
    }
}
