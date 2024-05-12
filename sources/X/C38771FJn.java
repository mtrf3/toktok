package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.FJn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public /* synthetic */ class C38771FJn {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        try {
            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
