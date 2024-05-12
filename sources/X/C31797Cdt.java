package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.Cdt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public /* synthetic */ class C31797Cdt {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.State.values().length];
        LIZ = iArr;
        try {
            iArr[Lifecycle.State.DESTROYED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[Lifecycle.State.CREATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[Lifecycle.State.STARTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[Lifecycle.State.RESUMED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
