package X;

import Y.ACListenerS39S0200000_4;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.PaidContentAwareBannerSetting;
import com.ss.android.ugc.aweme.service.IPaidContentAwareBannerService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("paid_content_aware_banner_popup_task")
/* renamed from: X.9yn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C254499yn extends M71 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final PaidContentAwareBannerSetting LJLJI;
    public final C73318Sq2 LJLJJI;
    public final C62822Ol8 LJLJJL;

    @Override // X.M74
    public final boolean canShow() {
        return true;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ != null) {
            AKH akh = new AKH(LIZJ);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_series_dollar;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            akh.LIZLLL(new AqS167S0100000_1(c2068389v, 15), true);
            akh.LIZ.LJ = this.LJLJI.getAwareBannerMessageText();
            String awareBannerCtaButtonText = this.LJLJI.getAwareBannerCtaButtonText();
            A21 a21 = akh.LIZ;
            a21.LJFF = awareBannerCtaButtonText;
            a21.LJIIIZ = 2;
            a21.LIZIZ = LivePlayEnforceIntervalSetting.DEFAULT;
            a21.LIZJ = true;
            int LIZIZ = C7MY.LIZIZ(90);
            A21 a212 = akh.LIZ;
            a212.LJIIIIZZ = LIZIZ;
            a212.LJIIJJI = new ACListenerS39S0200000_4(this, akh, 55);
            akh.LIZ.LJIIL = new AqS135S0200000_4(wrapper, this, 135);
            akh.LIZIZ();
            C62822Ol8 c62822Ol8 = C254439yh.LIZ;
            Object value = c62822Ol8.getValue();
            o.LJIIIIZZ(value, "<get-bannerVisitRepo>(...)");
            int i = ((Keva) value).getInt(((RBX) HG3.LJIILL()).getCurUserId(), 0) + 1;
            Object value2 = c62822Ol8.getValue();
            o.LJIIIIZZ(value2, "<get-bannerVisitRepo>(...)");
            ((Keva) value2).storeInt(((RBX) HG3.LJIILL()).getCurUserId(), i);
            C78999UzT.LJFF(((IPaidContentAwareBannerService) this.LJLJJL.getValue()).LJ().LJJIIJ(T16.LIZ()).LJJI(), this.LJLJJI);
            String campaignId = this.LJLJI.getAwareBannerSchema();
            String enterFrom = this.LJLIL;
            String position = this.LJLILLLLZI;
            o.LJIIIZ(campaignId, "campaignId");
            o.LJIIIZ(enterFrom, "enterFrom");
            o.LJIIIZ(position, "position");
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("campaign_id", campaignId);
            c188727au.LJIIIZ("position", position);
            c188727au.LJIIIZ("enter_from", enterFrom);
            FMX.LJIIL("paid_content_profile_banner_show_mobile_creation", c188727au.LIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C254499yn(C235769Nc c235769Nc, PaidContentAwareBannerSetting paidContentAwareBannerSetting, C73318Sq2 compositeDisposable) {
        super(c235769Nc);
        o.LJIIIZ(compositeDisposable, "compositeDisposable");
        this.LJLIL = "profile_page";
        this.LJLILLLLZI = "bottom_bar";
        this.LJLJI = paidContentAwareBannerSetting;
        this.LJLJJI = compositeDisposable;
        this.LJLJJL = C221108m2.LIZIZ(C254459yj.LJLIL);
    }
}
