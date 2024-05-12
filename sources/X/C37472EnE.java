package X;

import com.bytedance.pia.core.tracing.EventName;

/* renamed from: X.EnE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public /* synthetic */ class C37472EnE {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[EventName.values().length];
        LIZ = iArr;
        try {
            iArr[EventName.NavigateStart.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            LIZ[EventName.WorkerEnvironmentInitializeStart.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            LIZ[EventName.WorkerEnvironmentInitializeEnd.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            LIZ[EventName.WorkerScriptRequestStart.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            LIZ[EventName.WorkerScriptRequestEnd.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            LIZ[EventName.WorkerExecuteStart.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
