package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7cx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC189997cx {
    REGIONAL("regional", "1"),
    UN_CLAIMED_STORE("store", "2"),
    CLAIMED_STORE("store", "2"),
    INDEPENDENT("independent", "3");

    public static final C189987cw Companion = new C189987cw();
    public String LJLIL;
    public String typeCode;

    public static EnumC189997cx valueOf(String str) {
        return (EnumC189997cx) V0N.LJJJ(EnumC189997cx.class, str);
    }

    public final String getTypeName() {
        return this.LJLIL;
    }

    public final void setTypeName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLIL = str;
    }

    EnumC189997cx(String str, String str2) {
        this.LJLIL = str;
        this.typeCode = str2;
    }
}
