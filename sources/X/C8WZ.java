package X;

/* renamed from: X.8WZ, reason: invalid class name */
/* loaded from: classes4.dex */
public /* synthetic */ class C8WZ {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[C8WY.values().length];
        try {
            iArr[C8WY.ON_ATTACH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[C8WY.ON_CREATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[C8WY.ON_CREATE_VIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[C8WY.ON_VIEW_CREATED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[C8WY.ON_ACTIVITY_CREATED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[C8WY.ON_START.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[C8WY.ON_RESUME.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        LIZ = iArr;
    }
}
