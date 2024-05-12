package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7Z9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7Z9 implements InterfaceC62486Ofi {
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
    public final int LJIJ() {
        return R.raw.icon_lock_large_fill;
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
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "privacy";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        String str;
        C188727au c188727au = new C188727au();
        if (C54838Lfe.LJIIZILJ(this.LJLIL)) {
            str = "story";
        } else {
            str = "post";
        }
        c188727au.LJIIIZ("post_type", str);
        FMX.LJIIL("video_privacy_setting_button_show", c188727au.LIZ);
        return R.raw.icon_2pt_lock;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        if (C54838Lfe.LJJI(this.LJLIL)) {
            return R.string.ryv;
        }
        return R.string.p_8;
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
        String str2;
        String str3;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        String tabName = sharePackage.extras.getString("tab_name", "");
        String imprId = sharePackage.extras.getString("impr_id", "");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", this.LJLIL.getAid());
        c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
        c188727au.LJIIIZ("panel_source", this.LJLJI);
        c188727au.LJIIIZ("impr_id", imprId);
        if (TextUtils.equals(this.LJLILLLLZI, "personal_homepage")) {
            c188727au.LJI("tab_name", tabName);
        }
        if (Z89.LIZIZ.LIZIZ(this.LJLIL)) {
            NowPostInfo nowPostInfo = this.LJLIL.nowPostInfo;
            if (nowPostInfo != null) {
                str3 = nowPostInfo.getNowMediaType();
            } else {
                str3 = null;
            }
            c188727au.LJI("now_type", str3);
        }
        if (C54838Lfe.LJJI(this.LJLIL)) {
            str = "story";
        } else {
            str = "post";
        }
        c188727au.LJI("story_type", str);
        c188727au.LIZLLL(((RBX) HG3.LJIILL()).getCurUser().isSecret() ? 1 : 0, "is_private");
        c188727au.LJI("enter_method", "share_panel");
        if (TCM.LJIIIZ(this.LJLIL)) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJI("is_allow_pugc_template", str2);
        FMX.LJIIL("click_privacy_setting_video", c188727au.LIZ);
        ShareDependService.LIZ.getClass();
        ShareDependService LIZ = C44498HdG.LIZ();
        Aweme aweme = this.LJLIL;
        o.LJIIIIZZ(tabName, "tabName");
        String str4 = this.LJLILLLLZI;
        o.LJIIIIZZ(imprId, "imprId");
        LIZ.LJIL(context, aweme, tabName, str4, "share_panel", imprId);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C7Z9(String eventType, Aweme aweme, String panelSource) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(panelSource, "panelSource");
        this.LJLIL = aweme;
        this.LJLILLLLZI = eventType;
        this.LJLJI = panelSource;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
