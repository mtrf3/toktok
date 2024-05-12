package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HYz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44269HYz {
    public static final String LIZ;
    public static final String LIZIZ;
    public static final String LIZJ;
    public static final String LIZLLL;
    public static final C62822Ol8 LJ;

    static {
        String string = C60903NvH.LJ.getString(R.string.pvy);
        o.LJIIIIZZ(string, "getApplication().getStri…cord_mode_combine_15_tag)");
        LIZ = string;
        String string2 = C60903NvH.LJ.getString(R.string.pw1);
        o.LJIIIIZZ(string2, "getApplication().getStri…cord_mode_combine_60_tag)");
        LIZIZ = string2;
        String string3 = C60903NvH.LJ.getString(R.string.pvz);
        o.LJIIIIZZ(string3, "getApplication().getStri…ord_mode_combine_180_tag)");
        LIZJ = string3;
        String string4 = C60903NvH.LJ.getString(R.string.pw0);
        o.LJIIIIZZ(string4, "getApplication().getStri…ord_mode_combine_600_tag)");
        LIZLLL = string4;
        LJ = C221108m2.LIZIZ(C44268HYy.LJLIL);
    }

    public static String LIZ() {
        return (String) LJ.getValue();
    }

    public static int LIZIZ(String tag) {
        o.LJIIIZ(tag, "tag");
        if (o.LJ(tag, LIZ)) {
            return 10;
        }
        if (o.LJ(tag, LIZJ)) {
            return 14;
        }
        if (o.LJ(tag, LIZIZ)) {
            return 11;
        }
        if (o.LJ(tag, LIZLLL)) {
            return 18;
        }
        if (o.LJ(tag, I38.RECORD_NOW.getTag())) {
            return 16;
        }
        if (o.LJ(tag, "RecordCombinePhoto")) {
            return 17;
        }
        return 8;
    }

    public static boolean LIZJ(String tag) {
        o.LJIIIZ(tag, "tag");
        if (o.LJ(tag, LIZIZ) || o.LJ(tag, LIZJ) || o.LJ(tag, LIZLLL)) {
            return true;
        }
        return false;
    }
}
