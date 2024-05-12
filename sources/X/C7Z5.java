package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7Z5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7Z5 implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Aweme LJLIL;
    public final InterfaceC72642tA<C50420Jqa> LJLILLLLZI;
    public final C7NR LJLJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_person_x_mark;
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
        return R.raw.icon_2pt_person_x_mark;
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
    public final int LJJII() {
        return R.string.tix;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
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
        return "unfollow";
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

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("author_id", this.LJLIL.getAuthorUid());
        c188727au.LJIIIZ("enter_from", this.LJLJI.LIZ);
        c188727au.LJIIIZ("enter_method", "click_dot_button");
        c188727au.LJIIIZ("group_id", C227768wm.LIZIZ(this.LJLIL));
        NowPostInfo nowPostInfo = this.LJLIL.nowPostInfo;
        if (nowPostInfo != null) {
            str = nowPostInfo.getNowMediaType();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("now_type", str);
        c188727au.LJIIIZ("now_card_type", Z89.LIZIZ.LJIIZILJ(this.LJLIL));
        FMX.LJIIL("click_unfollow", c188727au.LIZ);
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LIZ(R.string.tcl);
        c26227ARb.LJII = false;
        UC0.LIZJ(c26227ARb, new AqS169S0100000_3(this, 712));
        c26227ARb.LJI().LIZLLL();
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C7Z5(Aweme aweme, InterfaceC72642tA<C50420Jqa> interfaceC72642tA, C7NR c7nr) {
        o.LJIIIZ(aweme, "aweme");
        this.LJLIL = aweme;
        this.LJLILLLLZI = interfaceC72642tA;
        this.LJLJI = c7nr;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
