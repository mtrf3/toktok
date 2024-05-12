package X;

import Y.ARunnableS25S0200000_6;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.OiH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62645OiH implements InterfaceC62486Ofi, InterfaceC38336F2u<Object> {
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

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
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "top";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        if (!this.LJLIL.isTop()) {
            return R.raw.icon_2pt_pin;
        }
        return R.raw.icon_2pt_pin_fill;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        if (!this.LJLIL.isTop()) {
            return R.raw.icon_pin_fill;
        }
        return R.raw.icon_pin_slash_fill;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        if (this.LJLIL.isTop()) {
            return R.string.jm7;
        }
        return R.string.jm5;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        AwemeCommerceStruct commerceVideoAuthInfo = this.LJLIL.getCommerceVideoAuthInfo();
        boolean z = false;
        if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.getDarkPostStatus() == 1) {
            z = true;
        }
        return !z;
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

    @Override // X.InterfaceC38336F2u
    public final void LIZJ(Object obj) {
        int i;
        String str;
        Aweme aweme = this.LJLIL;
        aweme.setIsTop(!aweme.isTop() ? 1 : 0);
        this.LJLIL.setAttrUpdated(true);
        Context LIZIZ = EF7.LIZIZ();
        if (this.LJLIL.isTop()) {
            i = R.string.jm6;
        } else {
            i = R.string.jm8;
        }
        String string = LIZIZ.getString(i);
        o.LJIIIIZZ(string, "if (aweme.isTop()) conte…ofile_unpinned_toast_btn)");
        C5S1 c5s1 = new C5S1(LIZIZ);
        c5s1.LIZLLL(string);
        c5s1.LJ();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", this.LJLIL.getAid());
        c188727au.LJIIIZ("author_id", this.LJLIL.getAuthor().getUid());
        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
        c188727au.LJIIIZ("panel_source", this.LJLJI);
        if (this.LJLIL.isTop()) {
            str = "top";
        } else {
            str = "top_cancel";
        }
        c188727au.LJIIIZ("final_status", str);
        c188727au.LIZLLL(this.LJLIL.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        FMX.LJIIL("click_video_top", c188727au.LIZ);
        C2U8.LIZ(new C62646OiI());
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC38336F2u
    public final void onError(Exception exc) {
        String str;
        C1A7.LJIJJLI(EF7.LIZIZ(), exc, R.string.img);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", this.LJLIL.getAid());
        c188727au.LJIIIZ("author_id", this.LJLIL.getAuthor().getUid());
        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
        c188727au.LJIIIZ("panel_source", this.LJLJI);
        if (this.LJLIL.isTop()) {
            str = "top";
        } else {
            str = "top_cancel";
        }
        c188727au.LJIIIZ("final_status", str);
        c188727au.LIZLLL(this.LJLIL.isSubOnlyVideo() ? 1 : 0, "is_sub_only_video");
        FMX.LJIIL("click_video_top", c188727au.LIZ);
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
        if (this.LJLIL.isPrivate() && !this.LJLIL.isTop()) {
            C05L.LIZLLL(context, R.string.pbe);
            return;
        }
        AwemeCommerceStruct commerceVideoAuthInfo = this.LJLIL.getCommerceVideoAuthInfo();
        if (commerceVideoAuthInfo != null && commerceVideoAuthInfo.getDarkPostStatus() == 1 && !this.LJLIL.isTop()) {
            C05L.LIZLLL(context, R.string.ee9);
            return;
        }
        String aid = this.LJLIL.getAid();
        boolean z = !this.LJLIL.isTop();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C66619QCp("item_id", aid));
        if (z) {
            str = C36306EMs.LIZ;
        } else {
            str = C36306EMs.LIZIZ;
        }
        C38334F2s c38334F2s = new C38334F2s(str, EnumC38335F2t.POST, arrayList, String.class);
        c38334F2s.LIZ = this;
        c38334F2s.LJI = false;
        C38816FLg.LJ(new ARunnableS25S0200000_6(c38334F2s, EF7.LIZIZ(), 17));
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C62645OiH(String enterFrom, Aweme aweme, String panelSource) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(panelSource, "panelSource");
        this.LJLIL = aweme;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = panelSource;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
