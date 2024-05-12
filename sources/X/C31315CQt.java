package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.CQt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31315CQt extends AbstractC31313CQr<GiftMessage> {
    public static final C31315CQt LIZJ = new C31315CQt();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        GiftMessage t = (GiftMessage) obj;
        o.LJIIIZ(t, "t");
        return t.fromUser;
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
    public final boolean LJII(CR6 t, boolean z) {
        o.LJIIIZ(t, "t");
        if (!z) {
            return true;
        }
        return false;
    }
}
