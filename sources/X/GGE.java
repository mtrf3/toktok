package X;

import androidx.lifecycle.Lifecycle;

/* loaded from: classes8.dex */
public /* synthetic */ class GGE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        LIZ = iArr;
        try {
            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
    }
}
