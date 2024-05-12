package X;

import com.bytedance.android.livesdk.dataChannel.BroadcastSceneGlobalChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Stack;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C38 {
    public static final Stack<C37> LIZ = new Stack<>();

    public static void LIZ(boolean z, C37 c37) {
        C37 c372;
        Stack<C37> stack = LIZ;
        if (!stack.isEmpty()) {
            c372 = stack.peek();
        } else {
            c372 = C37.UNKNOWN;
        }
        if (z) {
            if (c372 != c37) {
                stack.push(c37);
            }
        } else if (c372 == c37) {
            stack.pop();
        }
        if ((!stack.isEmpty()) && stack.peek() != c372) {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            C37 peek = stack.peek();
            o.LJIIIIZZ(peek, "sceneStack.peek()");
            dataChannelGlobal.tv0(BroadcastSceneGlobalChannel.class, peek);
        }
    }
}
