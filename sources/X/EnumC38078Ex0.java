package X;

import android.text.TextUtils;

/* renamed from: X.Ex0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC38078Ex0 {
    PUBLIC,
    PROTECTED,
    PRIVATE,
    SECURE;

    @Override // java.lang.Enum
    public String toString() {
        if (this == PRIVATE) {
            return "private";
        }
        if (this == PROTECTED) {
            return "protected";
        }
        if (this == SECURE) {
            return "secure";
        }
        return "public";
    }

    public static EnumC38078Ex0 from(String str) {
        if (TextUtils.isEmpty(str)) {
            return PUBLIC;
        }
        String lowerCase = str.toLowerCase();
        if (TextUtils.equals("protected", lowerCase)) {
            return PROTECTED;
        }
        if (TextUtils.equals("private", lowerCase)) {
            return PRIVATE;
        }
        if (TextUtils.equals("secure", lowerCase)) {
            return SECURE;
        }
        return PUBLIC;
    }

    public static EnumC38078Ex0 valueOf(String str) {
        return (EnumC38078Ex0) V0N.LJJJ(EnumC38078Ex0.class, str);
    }
}
