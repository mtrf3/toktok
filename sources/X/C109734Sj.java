package X;

/* renamed from: X.4Sj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public /* synthetic */ class C109734Sj {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC109724Si.values().length];
        try {
            iArr[EnumC109724Si.ONLY_FILTERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC109724Si.STRANGER_AND_FILTERED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC109724Si.STRANGER_INCLUDE_FILTERED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC109754Sl.values().length];
        try {
            iArr2[EnumC109754Sl.BATCH_DELETE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[EnumC109754Sl.BATCH_MARK_AS_READ.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC109754Sl.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        LIZIZ = iArr2;
    }
}
