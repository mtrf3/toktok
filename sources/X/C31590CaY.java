package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import java.util.Iterator;
import java.util.PriorityQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.CaY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31590CaY {
    public final PriorityQueue<GiftMessage> LIZ = new PriorityQueue<>(1000, C31591CaZ.LJLIL);

    public final int LIZ() {
        return this.LIZ.size();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<GiftMessage> it = this.LIZ.iterator();
        while (it.hasNext()) {
            GiftMessage next = it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" Coin:");
            LIZ.append(next.mGift.diamondCount);
            LIZ.append(" Combo:");
            LIZ.append(next.comboCount);
            LIZ.append(',');
            sb.append(X1D.LIZIZ(LIZ));
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }
}
