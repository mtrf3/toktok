package X;

/* renamed from: X.a0B, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public /* synthetic */ class C91783a0B {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[EnumC91909a2D.values().length];
        try {
            iArr[EnumC91909a2D.OVERDUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC91909a2D.UNREPAID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC91909a2D.REPAID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC91909a2D.NO_NEED_TO_PAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC91907a2B.values().length];
        try {
            iArr2[EnumC91907a2B.BILLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC91907a2B.UNBILLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        LIZIZ = iArr2;
    }
}
