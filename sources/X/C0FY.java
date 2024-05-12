package X;

import android.util.JsonToken;

/* renamed from: X.0FY, reason: invalid class name */
/* loaded from: classes.dex */
public /* synthetic */ class C0FY {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[JsonToken.values().length];
        LIZ = iArr;
        try {
            iArr[JsonToken.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
