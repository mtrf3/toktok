package X;

/* renamed from: X.Tmt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public /* synthetic */ class C75671Tmt {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[EnumC75672Tmu.values().length];
        try {
            iArr[EnumC75672Tmu.IDLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC75672Tmu.INVITER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC75672Tmu.INVITEE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC75672Tmu.APPLY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[EnumC75674Tmw.values().length];
        try {
            iArr2[EnumC75674Tmw.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[EnumC75674Tmw.SUPPORT_MULTI.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        LIZIZ = iArr2;
        int[] iArr3 = new int[EnumC75419Tip.values().length];
        try {
            iArr3[EnumC75419Tip.StatePreparing.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[EnumC75419Tip.StateJoined.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[EnumC75419Tip.StateLinked.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        LIZJ = iArr3;
    }
}
