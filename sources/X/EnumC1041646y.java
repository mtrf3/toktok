package X;

/* renamed from: X.46y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC1041646y {
    NOT_INTERACT("not_interact"),
    READY_TO_INTERACT("ready_to_interact"),
    INTERACTED("interact"),
    NOT_AVAILABLE("not_available");

    public final String LJLIL;

    public static EnumC1041646y valueOf(String str) {
        return (EnumC1041646y) V0N.LJJJ(EnumC1041646y.class, str);
    }

    public final String getValue() {
        return this.LJLIL;
    }

    EnumC1041646y(String str) {
        this.LJLIL = str;
    }
}
