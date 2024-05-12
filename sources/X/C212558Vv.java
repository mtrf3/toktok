package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.8Vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public /* synthetic */ class C212558Vv {
    public static final /* synthetic */ int[] LIZ;
    public static final /* synthetic */ int[] LIZIZ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        try {
            iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        LIZ = iArr;
        int[] iArr2 = new int[Lifecycle.State.values().length];
        try {
            iArr2[Lifecycle.State.CREATED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[Lifecycle.State.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[Lifecycle.State.RESUMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        LIZIZ = iArr2;
    }
}
