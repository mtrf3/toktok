package X;

/* renamed from: X.UFw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public /* synthetic */ class C76896UFw {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[UG0.values().length];
        try {
            iArr[UG0.BITMAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[UG0.URI.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[UG0.URL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC76899UFz.values().length];
        try {
            iArr2[EnumC76899UFz.DONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC76899UFz.DELETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC76899UFz.BACK.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        LIZIZ = iArr2;
    }
}
