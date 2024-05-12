package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.Cdv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C31799Cdv {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[Lifecycle.State.values().length];
        LIZ = iArr;
        Lifecycle.State state = Lifecycle.State.RESUMED;
        iArr[state.ordinal()] = 1;
        Lifecycle.State state2 = Lifecycle.State.CREATED;
        iArr[state2.ordinal()] = 2;
        Lifecycle.State state3 = Lifecycle.State.STARTED;
        iArr[state3.ordinal()] = 3;
        int[] iArr2 = new int[Lifecycle.State.values().length];
        LIZIZ = iArr2;
        iArr2[state.ordinal()] = 1;
        iArr2[state3.ordinal()] = 2;
        iArr2[state2.ordinal()] = 3;
    }
}
