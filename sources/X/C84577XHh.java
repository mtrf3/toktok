package X;

/* renamed from: X.XHh, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public /* synthetic */ class C84577XHh {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC84576XHg.values().length];
        try {
            iArr[EnumC84576XHg.Query.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC84576XHg.Optimistic.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC84576XHg.Rollback.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC84576XHg.Mutation.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
