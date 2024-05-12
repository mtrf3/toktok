package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.GEo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public /* synthetic */ class C41190GEo {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        try {
            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        LIZ = iArr;
    }
}
