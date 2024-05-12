package X;

import android.os.Message;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BAl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28343BAl implements InterfaceC28344BAm {
    public final BG4 LJLIL;
    public final HandlerC28345BAn LJLILLLLZI = new HandlerC28345BAn(this);

    public C28343BAl(BG4 bg4) {
        this.LJLIL = bg4;
    }

    @Override // X.InterfaceC28344BAm
    public final void handleMsg(Message message) {
        List list;
        if (message == null) {
            return;
        }
        int i = message.what;
        Object obj = message.obj;
        if (obj instanceof Exception) {
            if (i != 21 && i != 22 && (obj instanceof C29401Dk)) {
                o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.live.api.exceptions.server.ApiServerException");
                C30868C9o.LJI(((C29401Dk) obj).getPrompt());
                return;
            }
            return;
        }
        if (22 == i || 21 == i) {
            if (obj instanceof List) {
                try {
                    if (obj instanceof List) {
                        list = (List) obj;
                    } else {
                        list = null;
                    }
                    BG4 bg4 = this.LJLIL;
                    if (bg4 != null && list != null) {
                        bg4.T1(C65777Prh.LIZIZ(list));
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    C0NB.LJI("LiveLandNoMorePresenter", th);
                    return;
                }
            }
            return;
        }
        if (i == 12) {
        }
    }
}
