package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CPP extends AbstractC31313CQr<LinkMicBattleItemCard> {
    public static final CPP LIZJ = new CPP();

    @Override // X.InterfaceC31317CQv
    public final User LIZ(Object obj, User user) {
        LinkMicBattleItemCard t = (LinkMicBattleItemCard) obj;
        o.LJIIIZ(t, "t");
        int i = t.msgType;
        if (i == 10 || i == 20) {
            InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
            o.LJII(interfaceC05190Ih, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
            return (User) interfaceC05190Ih;
        }
        return null;
    }
}
