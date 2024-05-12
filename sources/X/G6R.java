package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G6R {
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(G6T.LJLIL);
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(G6Q.LJLIL);

    public final int LIZ(G6S g6s) {
        C62822Ol8 c62822Ol8 = LIZIZ;
        if (((java.util.Map) c62822Ol8.getValue()).get(g6s.LJLIL) == null) {
            Object value = this.LIZ.getValue();
            o.LJIIIIZZ(value, "<get-keva>(...)");
            int i = ((Keva) value).getInt(g6s.LJLIL, 0);
            ((java.util.Map) c62822Ol8.getValue()).put(g6s.LJLIL, Integer.valueOf(i));
            return i;
        }
        Integer num = (Integer) ((java.util.Map) c62822Ol8.getValue()).get(g6s.LJLIL);
        if (num != null) {
            return num.intValue();
        }
        return g6s.LJLILLLLZI;
    }
}
