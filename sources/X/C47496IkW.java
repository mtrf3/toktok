package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.Queue;

/* renamed from: X.IkW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47496IkW implements InterfaceC47498IkY {
    @Override // X.InterfaceC47498IkY
    public final double LIZ(Queue<C47152Iey> queue, C47152Iey[] c47152IeyArr) {
        return LIZIZ(queue, c47152IeyArr);
    }

    @Override // X.InterfaceC47498IkY
    public final double LIZIZ(Queue<C47152Iey> queue, C47152Iey[] c47152IeyArr) {
        if (queue.size() < 1) {
            return -1.0d;
        }
        queue.toArray(c47152IeyArr);
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < queue.size(); i2++) {
            C47152Iey c47152Iey = c47152IeyArr[i2];
            i = (int) (i + c47152Iey.LJLILLLLZI);
            j += c47152Iey.LJLJI;
        }
        double d = (i * 8.0d) / (j / 1000.0d);
        if (d >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return d;
        }
        throw new IllegalArgumentException();
    }
}
