package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Uyh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78951Uyh {
    public static AbstractC78953Uyj LIZ(String str) {
        C78958Uyo c78958Uyo = C78958Uyo.LIZIZ;
        if (o.LJ(str, "from_left_to_right")) {
            return c78958Uyo;
        }
        C78959Uyp c78959Uyp = C78959Uyp.LIZIZ;
        if (o.LJ(str, "from_right_to_left")) {
            return c78959Uyp;
        }
        C78960Uyq c78960Uyq = C78960Uyq.LIZIZ;
        if (o.LJ(str, "from_top_to_bottom")) {
            return c78960Uyq;
        }
        C78957Uyn c78957Uyn = C78957Uyn.LIZIZ;
        if (o.LJ(str, "from_bottom_to_top")) {
            return c78957Uyn;
        }
        C78955Uyl c78955Uyl = C78955Uyl.LIZIZ;
        if (o.LJ(str, "resize")) {
            return c78955Uyl;
        }
        C78954Uyk c78954Uyk = C78954Uyk.LIZIZ;
        if (o.LJ(str, "opacity")) {
            return c78954Uyk;
        }
        C78956Uym c78956Uym = C78956Uym.LIZIZ;
        if (o.LJ(str, "scale")) {
            return c78956Uym;
        }
        return null;
    }
}
