package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TTk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC74700TTk {
    ANCHOR_LINKMIC("anchor"),
    AUDIENCE_LINKMIC("audience");

    public String LJLIL;
    public String LJLILLLLZI = "connection_type";

    public static EnumC74700TTk valueOf(String str) {
        return (EnumC74700TTk) V0N.LJJJ(EnumC74700TTk.class, str);
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

    EnumC74700TTk(String str) {
        this.LJLIL = str;
    }
}
