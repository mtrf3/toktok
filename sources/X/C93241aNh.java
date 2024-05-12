package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.aNh, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final /* synthetic */ class C93241aNh {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;
    public static final /* synthetic */ int[] LIZJ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        LIZ = iArr;
        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
        iArr[Lifecycle.Event.ON_START.ordinal()] = 3;
        iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 5;
        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
        iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
        int[] iArr2 = new int[Lifecycle.State.values().length];
        LIZIZ = iArr2;
        iArr2[Lifecycle.State.INITIALIZED.ordinal()] = 1;
        iArr2[Lifecycle.State.DESTROYED.ordinal()] = 2;
        iArr2[Lifecycle.State.CREATED.ordinal()] = 3;
        iArr2[Lifecycle.State.STARTED.ordinal()] = 4;
        iArr2[Lifecycle.State.RESUMED.ordinal()] = 5;
        int[] iArr3 = new int[EnumC93240aNg.values().length];
        LIZJ = iArr3;
        iArr3[EnumC93240aNg.FOREGROUND.ordinal()] = 1;
        iArr3[EnumC93240aNg.BACKGROUND.ordinal()] = 2;
    }
}
