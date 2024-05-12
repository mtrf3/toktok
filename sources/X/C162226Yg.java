package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.6Yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public /* synthetic */ class C162226Yg {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        LIZ = iArr;
        try {
            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[Lifecycle.Event.ON_PAUSE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
