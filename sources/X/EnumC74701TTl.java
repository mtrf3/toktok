package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TTl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC74701TTl {
    ANCHOR("anchor"),
    AUDIENCE("audience");

    public String LJLIL;
    public String LJLILLLLZI = "user_type";

    public static EnumC74701TTl valueOf(String str) {
        return (EnumC74701TTl) V0N.LJJJ(EnumC74701TTl.class, str);
    }

    public final String getKey() {
        return this.LJLILLLLZI;
    }

    public final String getValue() {
        return this.LJLIL;
    }

    public final void setKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLILLLLZI = str;
    }

    public final void setValue(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    EnumC74701TTl(String str) {
        this.LJLIL = str;
    }
}
