package X;

/* renamed from: X.L3c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public /* synthetic */ class C53632L3c {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EnumC53631L3b.values().length];
        try {
            iArr[EnumC53631L3b.MUTUAL_FOLLOW.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC53631L3b.SINGLE_FOLLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC53631L3b.SINGLE_FOLLOWED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC53631L3b.UNFOLLOW.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
    }
}
