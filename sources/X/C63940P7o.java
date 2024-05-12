package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: X.P7o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63940P7o {
    public static byte[] LIZIZ(P9U p9u) {
        int i;
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int min = Math.min(FileUtils.BUFFER_SIZE, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = p9u.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return LIZ(arrayDeque, i2);
                }
                i3 += read;
                i2 += read;
            }
            long j = min;
            if (min < 4096) {
                i = 4;
            } else {
                i = 2;
            }
            long j2 = j * i;
            if (j2 > 2147483647L) {
                min = Integer.MAX_VALUE;
            } else if (j2 < -2147483648L) {
                min = LiveLayoutPreloadThreadPriority.DEFAULT;
            } else {
                min = (int) j2;
            }
        }
        if (p9u.read() == -1) {
            return LIZ(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static byte[] LIZ(Queue<byte[]> queue, int i) {
        ArrayDeque arrayDeque = (ArrayDeque) queue;
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }
}
