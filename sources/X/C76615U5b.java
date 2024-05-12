package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.linkcore.LinkCoreService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.o;

/* renamed from: X.U5b, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76615U5b {
    public Room LIZ;

    public final synchronized C76614U5a LIZ(Context context) {
        C76614U5a c76614U5a;
        o.LJIIIZ(context, "context");
        Room room = this.LIZ;
        if (room != null) {
            String valueOf = String.valueOf(room.getId());
            C76616U5c c76616U5c = C76616U5c.LIZ;
            c76614U5a = (C76614U5a) c76616U5c.LIZ(valueOf);
            if (c76614U5a == null) {
                LinkCoreService linkCoreService = new LinkCoreService();
                Room room2 = this.LIZ;
                if (room2 != null) {
                    linkCoreService.LIZ(room2);
                    Context LLLLL = C16880lQ.LLLLL(context);
                    o.LJIIIIZZ(LLLLL, "context.applicationContext");
                    Room room3 = this.LIZ;
                    if (room3 != null) {
                        c76614U5a = new C76614U5a(LLLLL, room3, linkCoreService);
                        c76616U5c.LIZIZ(valueOf, c76614U5a);
                    } else {
                        o.LJIJI("room");
                        throw null;
                    }
                } else {
                    o.LJIJI("room");
                    throw null;
                }
            }
        } else {
            o.LJIJI("room");
            throw null;
        }
        return c76614U5a;
    }
}
