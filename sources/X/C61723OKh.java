package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OKh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61723OKh implements InterfaceC62486Ofi {
    public final Aweme LJLIL;
    public final Integer LJLILLLLZI;
    public final Activity LJLJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_fire;
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
        return R.raw.icon_fire_fill;
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
        return R.string.phc;
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
        return "promote_for_others";
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        if (this.LJLIL.getHasPromoteEntry() == 1) {
            return true;
        }
        return false;
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
        int i;
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        NQA nqa = NQA.LIZIZ;
        String LIZJ = nqa.LIZJ();
        if (!enable()) {
            Activity activity = this.LJLJI;
            if (activity != null) {
                C26045AKb c26045AKb = new C26045AKb(activity);
                c26045AKb.LJIIIZ(this.LJLIL.getPromoteToast());
                c26045AKb.LJIIJ();
            }
        } else {
            String itemId = this.LJLIL.getAid();
            long currentTimeMillis = System.currentTimeMillis();
            if (C59406NTe.LJ()) {
                String builder = UriProtector.parse(C59406NTe.LJFF(Long.valueOf(currentTimeMillis), itemId, "video")).buildUpon().appendQueryParameter("session_id", LIZJ).appendQueryParameter("promote_by", "2").toString();
                o.LJIIIIZZ(builder, "parse(schema).buildUpon(…              .toString()");
                if (nqa.LIZ()) {
                    android.net.Uri parse = UriProtector.parse(builder);
                    o.LJIIIIZZ(parse, "parse(schema)");
                    String uri = C78939UyV.LJJJJJ(parse, C47261Igj.LJJIJIL("enable_prefetch", "enable_pending_js_task")).toString();
                    o.LJIIIIZZ(uri, "tempUri.toString()");
                    C59406NTe.LJIIL(context, uri);
                } else {
                    SmartRouter.buildRoute(context, builder).open();
                }
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("entry_from", "video");
                c198517qh.LIZ.put("item_id", itemId);
                c198517qh.LIZ.put("carrier_region", C85990Xow.LJ());
                c198517qh.LIZ.put("url", builder);
                C09900aA.LJIIJJI("promote_entry_check", 1, c198517qh.LJ());
            } else {
                ShareDependService.LIZ.getClass();
                ShareDependService LIZ = C44498HdG.LIZ();
                o.LJIIIIZZ(itemId, "itemId");
                C76L LIZ2 = LIZ.LIZ(itemId, currentTimeMillis, "2");
                C61719OKd c61719OKd = new C61719OKd(this, context);
                LIZ2.LJFF(new RunnableC65751PrH(LIZ2, c61719OKd), ExecutorC142245i8.LJLILLLLZI);
            }
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        int accountType = curUser.getAccountType();
        if (curUser.getCommerceUserInfo() != null) {
            i = curUser.getCommerceUserInfo().getPromotePayType();
        } else {
            i = 0;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("group_id", this.LJLIL.getAid());
        c188727au.LIZLLL(accountType, "user_account_type");
        c188727au.LJIIIZ("enter_from", "video");
        c188727au.LIZLLL(C2043280e.LIZIZ() ? 1 : 0, "smart_toast_show");
        if (this.LJLIL.getAwemeType() != 150) {
            str = "video";
        } else {
            str = "photo";
        }
        c188727au.LJIIIZ("content_type", str);
        c188727au.LIZLLL(i, "promote_version");
        c188727au.LJIIIZ("promote_by", "others");
        c188727au.LIZLLL(enable() ? 1 : 0, "video_status");
        if (!enable()) {
            c188727au.LJI("unavailable_reason", this.LJLIL.getPromoteToastKey());
        }
        FMX.LJIIL("Promote_video_entrance_click", c188727au.LIZ);
        nqa.LJII(LIZJ, "video", "others");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView iconView, View view, int i) {
        o.LJIIIZ(iconView, "iconView");
        Integer num = this.LJLILLLLZI;
        if (num != null) {
            iconView.startAnimation(AnimationUtils.loadAnimation(iconView.getContext(), num.intValue()));
        }
    }

    public C61723OKh(Aweme aweme, String eventType, Integer num, Activity activity) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(eventType, "eventType");
        this.LJLIL = aweme;
        this.LJLILLLLZI = num;
        this.LJLJI = activity;
    }
}
