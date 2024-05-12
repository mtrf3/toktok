package Y;

import X.BZI;
import X.C28787BRn;
import X.C29841BnR;
import X.C31319CQx;
import X.C31510CYg;
import X.C76800UCe;
import X.CN1;
import X.CQO;
import X.CYY;
import X.InterfaceC65784Pro;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* loaded from: classes6.dex */
public class AObjectS125S0200000_5 implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS125S0200000_5 aObjectS125S0200000_5) {
        String str;
        C31319CQx c31319CQx = (C31319CQx) aObjectS125S0200000_5.l0;
        CQO cqo = (CQO) aObjectS125S0200000_5.l1;
        if (c31319CQx.LJLILLLLZI != null && c31319CQx.LLIILZL != null) {
            BZI LIZ = C28787BRn.LIZ("livesdk_pin_comment_icon_click");
            LIZ.LJIILLIIL(c31319CQx.dataChannel);
            if (c31319CQx.LLIILZL.LJIIZILJ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LIZ.LJIJJ(str, "is_extended_comment_filed");
            LIZ.LJIJJ(C29841BnR.LIZIZ(c31319CQx.LLIILZL.LJI, c31319CQx.dataChannel), "admin_type");
            LIZ.LJJIIJZLJL();
            ((IPublicScreenService) CN1.LIZ(IPublicScreenService.class)).XO(cqo.LJIJJLI);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AObjectS125S0200000_5 aObjectS125S0200000_5) {
        C31319CQx c31319CQx = (C31319CQx) aObjectS125S0200000_5.l0;
        CQO cqo = (CQO) aObjectS125S0200000_5.l1;
        c31319CQx.getClass();
        MESSAGE message = cqo.LJIJJLI;
        if (message instanceof ChatMessage) {
            c31319CQx.LJLLILLLL((ChatMessage) message, cqo);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AObjectS125S0200000_5 aObjectS125S0200000_5) {
        return new RankEntranceWidget((C31510CYg) aObjectS125S0200000_5.l0, ((CYY) aObjectS125S0200000_5.l1).LJLJJI);
    }

    public AObjectS125S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
