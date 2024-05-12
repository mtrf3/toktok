package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.XGGoodsOrderMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.CRj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31331CRj extends AbstractC31313CQr<XGGoodsOrderMessage> {
    public static final C31331CRj LIZJ = new C31331CRj();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        XGGoodsOrderMessage t = (XGGoodsOrderMessage) obj;
        o.LJIIIZ(t, "t");
        return t.user;
    }
}
