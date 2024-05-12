package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.Xna, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85906Xna implements EUJ, InterfaceC85903XnX {
    public static final C85906Xna LJLIL = new C85906Xna();
    public static final Queue<String> LJLILLLLZI = new ArrayBlockingQueue(10);

    @Override // X.EUJ
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
    }

    static {
        C47261Igj.LJII("digg_push", "comment_push", "follow_push", "mention_push", "im_push");
        C221108m2.LIZIZ(C85907Xnb.LJLIL);
    }

    @Override // X.InterfaceC85903XnX
    public final void LLJJ() {
        Queue<String> queue = LJLILLLLZI;
        if (queue == null || queue.isEmpty()) {
            return;
        }
        ((ArrayBlockingQueue) queue).poll();
    }

    @Override // X.InterfaceC85903XnX
    public final void vx() {
        Queue<String> queue = LJLILLLLZI;
        if (queue == null || queue.isEmpty()) {
            return;
        }
        ((ArrayBlockingQueue) queue).poll();
    }

    @Override // X.EUJ
    public final void A1(PushSettings settings) {
        o.LJIIIZ(settings, "settings");
    }
}
