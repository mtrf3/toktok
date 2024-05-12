package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: X.Pqf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65713Pqf {
    public static int LIZ(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return j < -2147483648L ? LiveLayoutPreloadThreadPriority.DEFAULT : (int) j;
    }

    public static int[] LIZIZ(Collection<? extends Number> collection) {
        if (collection instanceof C65714Pqg) {
            C65714Pqg c65714Pqg = (C65714Pqg) collection;
            return Arrays.copyOfRange(c65714Pqg.LJLIL, c65714Pqg.LJLILLLLZI, c65714Pqg.LJLJI);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
