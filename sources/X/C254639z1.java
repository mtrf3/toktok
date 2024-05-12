package X;

import Y.ACListenerS39S0200000_4;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.PaidContentBannerCampaign;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("paid_content_banner_popup_task")
/* renamed from: X.9z1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254639z1 extends M71 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final PaidContentBannerCampaign LJLJI;

    @Override // X.M74
    public final boolean canShow() {
        return true;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C254639z1(C235769Nc c235769Nc, PaidContentBannerCampaign campaign) {
        super(c235769Nc);
        o.LJIIIZ(campaign, "campaign");
        this.LJLIL = "profile_page";
        this.LJLILLLLZI = "bottom_bar";
        this.LJLJI = campaign;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        long j;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ != null) {
            AKH akh = new AKH(LIZJ);
            akh.LIZ.LJ = this.LJLJI.getPaidContentBannerTitleText();
            String paidContentBannerLinkText = this.LJLJI.getPaidContentBannerLinkText();
            A21 a21 = akh.LIZ;
            a21.LJFF = paidContentBannerLinkText;
            a21.LIZJ = true;
            if (C19N.LJ("creator_m10n_android_paid_content_profile_banner_duration_param_is_enabled", false)) {
                j = this.LJLJI.getPaidContentBannerDuration() * 1000;
            } else {
                j = 3000;
            }
            akh.LIZ.LIZIZ = j;
            akh.LIZ.LJIIIIZZ = C7MY.LIZIZ(90);
            AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(wrapper, this, 136);
            A21 a212 = akh.LIZ;
            a212.LJIIL = aqS135S0200000_4;
            a212.LJIIJJI = new ACListenerS39S0200000_4(this, akh, 56);
            akh.LIZIZ();
            if (!C254649z2.LIZ(this.LJLJI.getPaidContentBannerCampaignId())) {
                String campaignId = this.LJLJI.getPaidContentBannerCampaignId();
                o.LJIIIZ(campaignId, "campaignId");
                C62822Ol8 c62822Ol8 = C254649z2.LIZ;
                Object value = c62822Ol8.getValue();
                o.LJIIIIZZ(value, "<get-repo>(...)");
                StringBuilder LIZ = X1D.LIZ();
                Object value2 = c62822Ol8.getValue();
                o.LJIIIIZZ(value2, "<get-repo>(...)");
                String string = ((Keva) value2).getString("paid_content_banner_showed_campaigns", "");
                o.LJIIIIZZ(string, "repo.getString(PAID_CONT…NER_SHOWED_CAMPAIGNS, \"\")");
                LIZ.append(string);
                LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
                LIZ.append('_');
                LIZ.append(campaignId);
                LIZ.append(',');
                ((Keva) value).storeString("paid_content_banner_showed_campaigns", X1D.LIZIZ(LIZ));
            }
            String campaignId2 = this.LJLJI.getPaidContentBannerCampaignId();
            String enterFrom = this.LJLIL;
            String position = this.LJLILLLLZI;
            o.LJIIIZ(campaignId2, "campaignId");
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(position, "position");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("campaign_id", campaignId2);
            c188727au.LJIIIZ("position", position);
            c188727au.LJIIIZ("enter_from", enterFrom);
            FMX.LJIIL("paid_content_profile_banner_show", c188727au.LIZ);
        }
    }
}
