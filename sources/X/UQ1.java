package X;

import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;

/* loaded from: classes14.dex */
public /* synthetic */ class UQ1 {
    public static final /* synthetic */ int[] LIZ;

    static {
        int[] iArr = new int[IMListenerType.values().length];
        try {
            iArr[IMListenerType.ASYNC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IMListenerType.SYNC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IMListenerType.ASYNC_BUFFER_FREE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        LIZ = iArr;
    }
}
