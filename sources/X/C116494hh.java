package X;

import androidx.lifecycle.Lifecycle;

/* renamed from: X.4hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C116494hh {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[Lifecycle.Event.values().length];
        LIZ = iArr;
        iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
        iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
        iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
        iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
        iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
    }
}
