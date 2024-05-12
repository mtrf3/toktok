package X;

/* renamed from: X.W6k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public /* synthetic */ class C81746W6k {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC81745W6j.values().length];
        LIZ = iArr;
        try {
            iArr[EnumC81745W6j.OnCloseToDalvikHeapLimit.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[EnumC81745W6j.OnAppBackgrounded.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[EnumC81745W6j.OnSystemMemoryCriticallyLowWhileAppInForeground.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[EnumC81745W6j.OnSystemLowMemoryWhileAppInForeground.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZ[EnumC81745W6j.OnSystemLowMemoryWhileAppInBackground.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
