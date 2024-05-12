package X;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Eer, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36953Eer {
    public final C36954Ees LIZ = new C36954Ees();
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public final void LIZ(String word) {
        o.LJIIIZ(word, "word");
        if (word.length() == 0) {
            return;
        }
        C36954Ees c36954Ees = this.LIZ;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char charAt = word.charAt(i);
            C36954Ees c36954Ees2 = (C36954Ees) ((LinkedHashMap) c36954Ees.LIZ).get(Character.valueOf(charAt));
            if (c36954Ees2 == null) {
                c36954Ees2 = new C36954Ees();
                c36954Ees.LIZ.put(Character.valueOf(charAt), c36954Ees2);
            }
            c36954Ees = c36954Ees2;
        }
        c36954Ees.LIZIZ = true;
    }
}
