package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4IW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4IW {
    public static AbstractC65590Pog LIZ(int i, List labels) {
        o.LJIIIZ(labels, "labels");
        if (labels.size() <= 10) {
            C65587Pod builder = AbstractC65590Pog.builder();
            if (labels.isEmpty()) {
                builder.LIZIZ(new C4IN("", 4));
                AbstractC65590Pog LJ = builder.LJ();
                o.LJIIIIZZ(LJ, "listBuilder.add(LabelUIP…YPE_EMPTY_STATE)).build()");
                return LJ;
            }
            Iterator it = labels.iterator();
            while (it.hasNext()) {
                builder.LIZIZ(new C4IN((String) it.next(), 1));
            }
            if (i != 0) {
                if (i == 1) {
                    builder.LIZIZ(new C4IN("", 2));
                }
            } else {
                builder.LIZIZ(new C4IN("", 3));
            }
            AbstractC65590Pog LJ2 = builder.LJ();
            o.LJIIIIZZ(LJ2, "listBuilder.build()");
            return LJ2;
        }
        throw new IllegalStateException("No more than 10 labels allowed for each sticker");
    }
}
