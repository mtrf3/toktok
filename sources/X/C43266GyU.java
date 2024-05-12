package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.service.ComplianceServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.AboutAdInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GyU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43266GyU implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Aweme LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final String LJLJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_question_mark_circle_ltr;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_question_mark_circle_fill_ltr;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "ad_personalization_new";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        AwemeRawAd awemeRawAd;
        AboutAdInfo aboutThisAd;
        Integer contentType;
        if (!this.LJLIL.isAd() || this.LJLIL.getAwemeRawAd() == null || (awemeRawAd = this.LJLIL.getAwemeRawAd()) == null || (aboutThisAd = awemeRawAd.getAboutThisAd()) == null || (contentType = aboutThisAd.getContentType()) == null || contentType.intValue() != 1) {
            return R.string.a9_;
        }
        return R.string.gdg;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AboutAdInfo aboutThisAd;
        Integer contentType;
        if (!this.LJLIL.isAd() || this.LJLIL.getAwemeRawAd() == null || (awemeRawAd = this.LJLIL.getAwemeRawAd()) == null || awemeRawAd.getAboutThisAd() == null || (awemeRawAd2 = this.LJLIL.getAwemeRawAd()) == null || awemeRawAd2.getAboutThisAd() == null) {
            return false;
        }
        AwemeRawAd awemeRawAd3 = this.LJLIL.getAwemeRawAd();
        if (awemeRawAd3 != null && (aboutThisAd = awemeRawAd3.getAboutThisAd()) != null && (contentType = aboutThisAd.getContentType()) != null && contentType.intValue() == 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    public C43266GyU(ActivityC45651qj act, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(act, "act");
        this.LJLIL = aweme;
        this.LJLILLLLZI = act;
        this.LJLJI = "share_panel";
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        AboutAdInfo aboutThisAd;
        Integer contentType;
        AwemeRawAd awemeRawAd;
        AboutAdInfo aboutThisAd2;
        Integer contentType2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "otherclick", this.LJLIL.getAwemeRawAd());
        LIZLLL.LIZJ("about_tiktok_ads", "refer");
        LIZLLL.LIZIZ("share_panel", "enter_from");
        LIZLLL.LJI();
        AwemeRawAd awemeRawAd2 = this.LJLIL.getAwemeRawAd();
        if (awemeRawAd2 == null || (aboutThisAd2 = awemeRawAd2.getAboutThisAd()) == null || (contentType2 = aboutThisAd2.getContentType()) == null || contentType2.intValue() != 1) {
            AwemeRawAd awemeRawAd3 = this.LJLIL.getAwemeRawAd();
            if (awemeRawAd3 == null || (aboutThisAd = awemeRawAd3.getAboutThisAd()) == null || (contentType = aboutThisAd.getContentType()) == null || contentType.intValue() != 2 || (awemeRawAd = this.LJLIL.getAwemeRawAd()) == null) {
                return;
            }
            ComplianceServiceImpl.LIZ().LJIJJLI(this.LJLILLLLZI, awemeRawAd, this.LJLJI);
            return;
        }
        ComplianceServiceImpl.LIZ().LJIIJ(this.LJLILLLLZI, this.LJLIL.getAwemeRawAd(), this.LJLJI);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
