package X;

/* renamed from: X.4vr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC125274vr {
    EFFECT_RENDERING_ERROR(-20000, "EFFECT_RENDERING_ERROR"),
    EFFECT_CACHE_ERROR(-20001, "EFFECT_CACHE_ERROR"),
    APPLY_TIME_OUT_ERROR(-20002, "APPLY_TIME_OUT_ERROR"),
    TEMPLATEMODEL_NULL_ERROR(-20003, "TEMPLATEMODEL_NULL_ERROR"),
    EFFECT_PATH_NOT_EXIST_ERROR(-20004, "EFFECT_PATH_NOT_EXIST_ERROR");

    public final int LJLIL;
    public final String LJLILLLLZI;

    public static EnumC125274vr valueOf(String str) {
        return (EnumC125274vr) V0N.LJJJ(EnumC125274vr.class, str);
    }

    public final int getCode() {
        return this.LJLIL;
    }

    public final String getMsg() {
        return this.LJLILLLLZI;
    }

    EnumC125274vr(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
