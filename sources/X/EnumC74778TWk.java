package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TWk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC74778TWk {
    FLOATING_FIX("float_fix"),
    FLOATING("float"),
    GRID_FIX("grid_fix"),
    GRID("grid"),
    NORMAL("normal"),
    ONE_TO_N("1vN");

    public String LJLIL;

    public static EnumC74778TWk valueOf(String str) {
        return (EnumC74778TWk) V0N.LJJJ(EnumC74778TWk.class, str);
    }

    public final String getStrVal() {
        return this.LJLIL;
    }

    public final void setStrVal(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    EnumC74778TWk(String str) {
        this.LJLIL = str;
    }
}
