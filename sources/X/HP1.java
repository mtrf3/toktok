package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HP1 implements InterfaceC62486Ofi {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
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
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "ad_settings";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        if (((Boolean) this.LJLJI.getValue()).booleanValue()) {
            return R.string.s4y;
        }
        return R.string.qy0;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        TcmConfig LJIIZILJ = TcmServiceImpl.LJIJI().LJIIZILJ();
        if (LJIIZILJ != null && LJIIZILJ.getUseNewBCSetting()) {
            return R.raw.icon_2pt_film_star;
        }
        return R.raw.icon_2pt_horn_ltr;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        TcmConfig LJIIZILJ = TcmServiceImpl.LJIJI().LJIIZILJ();
        if (LJIIZILJ != null && LJIIZILJ.getUseNewBCSetting()) {
            return R.raw.icon_film_star_fill;
        }
        return R.raw.icon_horn_fill;
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

    public HP1(Aweme aweme, String enterFrom) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = aweme;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0200000_7(aweme, this, 85));
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        TcmConfig LJIIZILJ = TcmServiceImpl.LJIJI().LJIIZILJ();
        if (LJIIZILJ != null && LJIIZILJ.getUseNewBCSetting()) {
            TcmServiceImpl.LJIJI().LJIILJJIL(C45804HyK.LJIJJ(context), this.LJLIL);
        } else {
            ShareDependService.LIZ.getClass();
            C44498HdG.LIZ().LJJIJ(context, this.LJLIL);
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
        c188727au.LJIIIZ("group_id", this.LJLIL.getAid());
        User author = this.LJLIL.getAuthor();
        if (author == null || (str = author.getUid()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("author_id", str);
        c188727au.LJIIIZ("enter_method", "click_share_button");
        if (this.LJLIL.getAwemeType() == 150) {
            str2 = "photo mode";
        } else {
            str2 = "video";
        }
        c188727au.LJIIIZ("content_type", str2);
        if (this.LJLIL.getIsTikTokStory()) {
            str3 = "story";
        } else {
            str3 = "general content";
        }
        c188727au.LJIIIZ("shoot_way", str3);
        FMX.LJIIL("click_adsetting_entrance", c188727au.LIZ);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
        c188727au.LJIIIZ("group_id", this.LJLIL.getAid());
        User author = this.LJLIL.getAuthor();
        if (author == null || (str = author.getUid()) == null) {
            str = "";
        }
        c188727au.LJIIIZ("author_id", str);
        c188727au.LJIIIZ("enter_method", "click_share_button");
        FMX.LJIIL("show_adsetting_entrance", c188727au.LIZ);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
