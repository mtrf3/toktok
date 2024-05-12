package X;

import com.bytedance.ies.actionai.jni.ActionAIExecutorType;

/* renamed from: X.WoD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* synthetic */ class C83397WoD {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[ActionAIExecutorType.values().length];
        try {
            iArr[ActionAIExecutorType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ActionAIExecutorType.IO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ActionAIExecutorType.SERIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
