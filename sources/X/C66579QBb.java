package X;

import android.os.Message;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.model.message.RoomNotifyMessage;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.kakao.KakaoAuth;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: X.QBb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C66579QBb implements InterfaceC88472Yns {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        WeakHandler weakHandler;
        boolean z = true;
        switch (this.LJLIL) {
            case 0:
                return AbsAudienceInteractionFragment.lambda$loadWidgetWithFirstFrameP2$50((InterfaceC29879Bo3) this.LJLILLLLZI, (RoomNotifyMessage) obj);
            case 1:
                ((GiftWidget) this.LJLILLLLZI).LLFFF((List) obj);
                return C76800UCe.LIZ;
            case 2:
                KakaoAuth kakaoAuth = (KakaoAuth) this.LJLILLLLZI;
                Throwable th = (Throwable) obj;
                kakaoAuth.getClass();
                Q8M q8m = new Q8M(kakaoAuth.LJLJI.LIZIZ, 2);
                if (th != null) {
                    z = false;
                }
                q8m.LIZ = z;
                q8m.LIZIZ = new C66504Q8e(new Exception(th));
                kakaoAuth.LJLJJL.hv0(new AuthResult(q8m));
                return null;
            case 3:
                Aweme aweme = (Aweme) this.LJLILLLLZI;
                C58620MzY c58620MzY = (C58620MzY) obj;
                c58620MzY.LJII(NMB.LJIIJJI, EnumC59755Ncl.FILTER_WITH_SAME_AWEME);
                c58620MzY.LJII(NMB.LJIILJJIL, aweme.getAwemeRawAd().getCreativeIdStr());
                return null;
            case 4:
                C169776lR c169776lR = (C169776lR) this.LJLILLLLZI;
                c169776lR.LJJJJLI = 1;
                c169776lR.LJIILL();
                c169776lR.LJIL();
                return C76800UCe.LIZ;
            default:
                C56548MHg c56548MHg = (C56548MHg) this.LJLILLLLZI;
                Message message = (Message) obj;
                if (c56548MHg.LJLIL != 0 && (weakHandler = c56548MHg.LJLLI) != null) {
                    weakHandler.sendMessage(message);
                }
                return null;
        }
    }

    public /* synthetic */ C66579QBb(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
