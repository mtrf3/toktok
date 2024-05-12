package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.049, reason: invalid class name */
/* loaded from: classes.dex */
public /* synthetic */ class AnonymousClass049 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
        iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
        iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 5;
        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 6;
        iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
        LIZ = iArr;
    }
}
