package X;

import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* renamed from: X.DvG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35422DvG {
    public static AbstractC35420DvE LIZ(g gVar, int i) {
        if (i >= gVar.size()) {
            return null;
        }
        j LJJIIZ = gVar.LJJIIZ(i);
        o.LJFF(LJJIIZ, "jsonArray.get(index)");
        m LJIIZILJ = LJJIIZ.LJIIZILJ();
        j LJJIJ = LJIIZILJ.LJJIJ("action");
        o.LJFF(LJJIJ, "jsonObject.get(ACTION_KEY)");
        String LJJIFFI = LJJIJ.LJJIFFI();
        if (LJJIFFI != null) {
            int hashCode = LJJIFFI.hashCode();
            if (hashCode != -1233049061) {
                if (hashCode != 430051577) {
                    if (hashCode == 962642266 && LJJIFFI.equals("replaceParams")) {
                        return new C35424DvI(gVar, LJIIZILJ, i);
                    }
                } else if (LJJIFFI.equals("replacePath")) {
                    return new C35421DvF(gVar, LJIIZILJ, i);
                }
            } else if (LJJIFFI.equals("replaceURL")) {
                return new C35423DvH(gVar, LJIIZILJ, i);
            }
        }
        throw new IllegalArgumentException("cannot parse action");
    }
}
