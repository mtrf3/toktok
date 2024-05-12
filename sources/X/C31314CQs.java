package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.CQs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31314CQs extends AbstractC31313CQr<SocialMessage> {
    public static final C31314CQs LIZJ = new C31314CQs();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        SocialMessage t = (SocialMessage) obj;
        o.LJIIIZ(t, "t");
        return t.user;
    }

    @Override // X.AbstractC31313CQr
    public final boolean LIZLLL(CQQ publicScreenContext, CR6 t) {
        o.LJIIIZ(t, "t");
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        if (LJ(t, publicScreenContext.LJII) || !publicScreenContext.LJFF || LJFF(publicScreenContext, t)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC31313CQr
    public final boolean LJII(CR6 cr6, boolean z) {
        SocialMessage t = (SocialMessage) cr6;
        o.LJIIIZ(t, "t");
        if (z) {
            return false;
        }
        long j = t.action;
        if (j != 3 && j != 1 && j != 2) {
            return false;
        }
        return true;
    }
}
