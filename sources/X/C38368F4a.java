package X;

import com.lynx.react.bridge.ReadableType;

/* renamed from: X.F4a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public /* synthetic */ class C38368F4a {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ReadableType.values().length];
        try {
            iArr[ReadableType.Boolean.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ReadableType.Number.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ReadableType.String.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ReadableType.Map.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ReadableType.Array.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ReadableType.Null.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ReadableType.Int.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[ReadableType.Long.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        LIZ = iArr;
    }
}
