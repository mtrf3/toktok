package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.8Vy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C212588Vy {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.State.values().length];
        LIZ = iArr;
        iArr[Lifecycle.State.INITIALIZED.ordinal()] = 1;
        iArr[Lifecycle.State.DESTROYED.ordinal()] = 2;
        iArr[Lifecycle.State.CREATED.ordinal()] = 3;
        iArr[Lifecycle.State.STARTED.ordinal()] = 4;
        iArr[Lifecycle.State.RESUMED.ordinal()] = 5;
    }
}
