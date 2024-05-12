package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.0I5, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0I5 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.State.values().length];
        LIZ = iArr;
        iArr[Lifecycle.State.CREATED.ordinal()] = 1;
        iArr[Lifecycle.State.STARTED.ordinal()] = 2;
        iArr[Lifecycle.State.RESUMED.ordinal()] = 3;
        iArr[Lifecycle.State.DESTROYED.ordinal()] = 4;
    }
}
