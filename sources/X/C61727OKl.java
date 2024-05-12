package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OKl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61727OKl implements InterfaceC62486Ofi {
    public final Activity LJLIL;
    public final C29930Bos LJLILLLLZI;

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
        return R.raw.icon_2pt_question_mark_circle_ltr;
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
        return "live_feed_back";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        C86393XvR LJJIJIL;
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
            return LJJIJIL.LJIJI();
        }
        return 0;
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

    public C61727OKl(Activity activity, C29930Bos params) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(params, "params");
        this.LJLIL = activity;
        this.LJLILLLLZI = params;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        C86393XvR LJJIJIL;
        InterfaceC54761LeP LJJLIIJ;
        BZI LIZ;
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        ShareServiceImpl.LJJJLZIJ().LJJIIZ(this.LJLIL, this.LJLILLLLZI.LIZJ);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action_type", this.LJLILLLLZI.LJIJ);
        java.util.Map map = this.LJLILLLLZI.LJJII;
        if (map == null) {
            map = C113554cx.LJJJLIIL();
        }
        c188727au.LJII(new HashMap(map));
        c188727au.LJIIIZ("uid", ((RBX) HG3.LJIILL()).getCurUserId());
        FMX.LJIIL("livesdk_share_feedback_click", c188727au.LIZ);
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null && (LJJLIIJ = LJJIJIL.LJJLIIJ("livesdk_live_user_feedback")) != null && (LIZ = LJJLIIJ.LIZ()) != null) {
            if (sharePackage.LJIIJ()) {
                str = "portrait";
            } else {
                str = "landscape";
            }
            LIZ.LJJIFFI(C51029K0z.LJJIIZI(new OSZ("room_orientation", str)));
            LIZ.LJJIIJZLJL();
        }
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
