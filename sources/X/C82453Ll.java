package X;

/* renamed from: X.3Ll, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public /* synthetic */ class C82453Ll {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC82443Lk.values().length];
        try {
            iArr[EnumC82443Lk.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC82443Lk.PRIMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC82443Lk.SECONDARY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC82443Lk.NULL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC82403Lg.values().length];
        try {
            iArr2[EnumC82403Lg.UNREAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC82403Lg.NOT_REPLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[EnumC82403Lg.FOLLOWING.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        LIZIZ = iArr2;
    }
}
