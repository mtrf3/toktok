package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.0Jm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public /* synthetic */ class C05500Jm {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        try {
            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
