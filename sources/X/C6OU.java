package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.6OU, reason: invalid class name */
/* loaded from: classes3.dex */
public /* synthetic */ class C6OU {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        try {
            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        LIZ = iArr;
    }
}
