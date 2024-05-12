package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3Fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80853Fh {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C81283Gy.LJLIL);

    public static final String LIZ() {
        String str = EnumC87514YWg.COLUMN_FOLLOW_STATUS.key + " == 2 and " + EnumC87514YWg.COLUMN_USER_SHARE_STATUS.key + " != 2";
        o.LJIIIIZZ(str, "sb.toString()");
        return str;
    }

    public static final String LIZIZ() {
        String str = EnumC87514YWg.COLUMN_FOLLOW_STATUS.key + " == 2";
        o.LJIIIIZZ(str, "sb.toString()");
        return str;
    }

    public static final String LIZJ() {
        String str = EnumC87514YWg.COLUMN_FOLLOW_STATUS.key + " == 1 and " + EnumC87514YWg.COLUMN_USER_SHARE_STATUS.key + " != 2";
        o.LJIIIIZZ(str, "sb.toString()");
        return str;
    }

    public static final String LIZLLL() {
        String str = EnumC87514YWg.COLUMN_FOLLOW_STATUS.key + " != 0";
        o.LJIIIIZZ(str, "sb.toString()");
        return str;
    }

    public static final InterfaceC80883Fk LJ() {
        return (InterfaceC80883Fk) LIZ.getValue();
    }
}
