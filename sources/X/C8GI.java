package X;

/* renamed from: X.8GI, reason: invalid class name */
/* loaded from: classes4.dex */
public enum C8GI {
    LINK_TYPE_EXTERNAL("external"),
    LINK_TYPE_INTERNAL("internal"),
    LINK_TYPE_POP("sub_pop"),
    LINK_TYPE_UPGRADE("upgrade");

    public final String LJLIL;

    public static C8GI valueOf(String str) {
        return (C8GI) V0N.LJJJ(C8GI.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    C8GI(String str) {
        this.LJLIL = str;
    }
}
