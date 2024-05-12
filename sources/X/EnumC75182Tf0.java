package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Tf0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public enum EnumC75182Tf0 {
    SINGLE_LIVE("single_live"),
    COHOST("cohost"),
    MULTI_GUEST("multi_guest");

    public String LJLIL;

    public static EnumC75182Tf0 valueOf(String str) {
        return (EnumC75182Tf0) V0N.LJJJ(EnumC75182Tf0.class, str);
    }

    public final String getType() {
        return this.LJLIL;
    }

    public final void setType(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    EnumC75182Tf0(String str) {
        this.LJLIL = str;
    }
}
