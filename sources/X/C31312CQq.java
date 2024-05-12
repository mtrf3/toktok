package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.CQq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31312CQq extends AbstractC31313CQr<EmoteChatMessage> {
    public static final C31312CQq LIZJ = new C31312CQq();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        EmoteChatMessage t = (EmoteChatMessage) obj;
        o.LJIIIZ(t, "t");
        return t.user;
    }

    @Override // X.AbstractC31313CQr
    public final boolean LIZLLL(CQQ publicScreenContext, CR6 t) {
        o.LJIIIZ(t, "t");
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        return !LJ(t, publicScreenContext.LJII);
    }

    @Override // X.AbstractC31313CQr
    public final boolean LJIIIZ(CR6 t, boolean z) {
        o.LJIIIZ(t, "t");
        if (t.isHistoryMessage) {
            return false;
        }
        return super.LJIIIZ(t, z);
    }

    @Override // X.AbstractC31313CQr
    public final boolean LIZJ(User user, boolean z, EmoteChatMessage t) {
        o.LJIIIZ(t, "t");
        if (t.isHistoryMessage) {
            return false;
        }
        return super.LIZJ(user, z, t);
    }
}
