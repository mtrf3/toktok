package Y;

import X.BVA;
import X.C0NB;
import X.C30134BsA;
import X.C30605Bzl;
import X.C31079CHr;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import android.view.View;
import com.bytedance.android.live.banner.IBannerService;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.qa.QuestionEx;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public class AObjectS122S0200000_5 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final Object invoke$0(AObjectS122S0200000_5 aObjectS122S0200000_5, Object obj) {
        C76800UCe lambda$loadBanners$59;
        lambda$loadBanners$59 = ((AbsAudienceInteractionFragment) aObjectS122S0200000_5.l0).lambda$loadBanners$59((IBannerService) aObjectS122S0200000_5.l1, (C30134BsA) obj);
        return lambda$loadBanners$59;
    }

    public static final Object invoke$1(AObjectS122S0200000_5 aObjectS122S0200000_5, Object obj) {
        C76800UCe lambda$loadGamePartnerShipInfo$38;
        lambda$loadGamePartnerShipInfo$38 = ((AbsAudienceInteractionFragment) aObjectS122S0200000_5.l0).lambda$loadGamePartnerShipInfo$38((LiveRecyclableWidget) aObjectS122S0200000_5.l1, (C30605Bzl) obj);
        return lambda$loadGamePartnerShipInfo$38;
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$2(AObjectS122S0200000_5 aObjectS122S0200000_5, Object obj) {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) aObjectS122S0200000_5.l0;
        View view = (View) aObjectS122S0200000_5.l1;
        liveEmojiInputDialogFragment.getClass();
        if (((Boolean) obj).booleanValue()) {
            if (view.getVisibility() != 0) {
                view.setVisibility(0);
                C31079CHr.LJ(liveEmojiInputDialogFragment.LJLJJI, "keyboard");
                C0NB.LJ("InputFragment", "Receive StarCommentEntranceVisibleEvent, true.");
            }
        } else {
            view.setVisibility(8);
            C0NB.LJ("InputFragment", "Receive StarCommentEntranceVisibleEvent, false.");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AObjectS122S0200000_5 aObjectS122S0200000_5, Object obj) {
        BVA bva = (BVA) aObjectS122S0200000_5.l0;
        QuestionEx questionEx = (QuestionEx) aObjectS122S0200000_5.l1;
        bva.getClass();
        if (((Boolean) obj).booleanValue()) {
            bva.L(questionEx);
        }
        return C76800UCe.LIZ;
    }

    public AObjectS122S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public AObjectS122S0200000_5(BVA bva, QuestionEx questionEx, int i, int i2) {
        this.$t = i2;
        this.l0 = bva;
        this.l1 = questionEx;
    }
}
