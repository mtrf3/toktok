package X;

import android.text.TextUtils;

/* renamed from: X.0E3, reason: invalid class name */
/* loaded from: classes.dex */
public enum C0E3 {
    CLOSED("closed"),
    EXPIRED("expired"),
    INIT("init"),
    SUCCESS("success"),
    FAILED("failed"),
    UNKNOW("unknow");

    public final String LJLIL;

    public String getStatus() {
        return this.LJLIL;
    }

    public static C0E3 getOrderStatus(String str) {
        for (C0E3 c0e3 : values()) {
            if (TextUtils.equals(c0e3.LJLIL, str)) {
                return c0e3;
            }
        }
        return UNKNOW;
    }

    public static C0E3 valueOf(String str) {
        return (C0E3) V0N.LJJJ(C0E3.class, str);
    }

    C0E3(String str) {
        this.LJLIL = str;
    }
}
