package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.8O1, reason: invalid class name */
/* loaded from: classes4.dex */
public /* synthetic */ class C8O1 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        try {
            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        LIZ = iArr;
    }
}
