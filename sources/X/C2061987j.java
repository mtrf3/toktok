package X;

import Y.IDgS137S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.share.ShareFlavorService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS84S1100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.87j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2061987j implements InterfaceC62486Ofi {
    public static final /* synthetic */ int LJLL = 0;
    public final Activity LJLIL;
    public final Aweme LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public C203727z6 LJLJLLL;

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
        return R.raw.icon_bookmark_fill;
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
        return "favorite";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62519OgF.LIZ(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        Aweme aweme = this.LJLILLLLZI;
        if (aweme == null || !aweme.isCollected()) {
            return R.raw.icon_2pt_bookmark;
        }
        return R.raw.icon_2pt_bookmark_fill;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        if (this.LJLILLLLZI.isCollected()) {
            ShareFlavorService.LIZ.getClass();
            C2062987t.LIZ().LIZ();
            return R.string.bnx;
        }
        ShareFlavorService.LIZ.getClass();
        C2062987t.LIZ().LIZLLL();
        return R.string.bnw;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    public final void LIZJ(Context context) {
        int i;
        String str;
        ActivityC45651qj activityC45651qj;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            Activity activity = null;
            if (!aweme.isCollected()) {
                String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
                Aweme aweme2 = this.LJLILLLLZI;
                if (aweme2 != null) {
                    str = aweme2.getAuthorUid();
                } else {
                    str = null;
                }
                if ((!curSecUserId.equals(str)) && !C55511LqV.LJIIIIZZ(this.LJLILLLLZI) && FavoriteServiceImpl.LJIJJLI().LJIIL() && !Keva.getRepo("keva_favorite_notify_optimize_repo").getBoolean("keva_has_shown_favorite_notify_optimize_sheet", false) && FavoriteServiceImpl.LJIJJLI().LJIILL()) {
                    if (context != null) {
                        activity = C45804HyK.LJIJJ(context);
                    }
                    if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null) {
                        C2062387n.LIZ(activityC45651qj, this.LJLJI, this.LJLILLLLZI);
                        return;
                    }
                    return;
                }
            }
            if (!C52535Kjb.LIZ()) {
                if (this.LJLJLLL == null) {
                    C203727z6 c203727z6 = new C203727z6();
                    this.LJLJLLL = c203727z6;
                    c203727z6.LJLJJLL = this.LJLJI;
                }
                C203727z6 c203727z62 = this.LJLJLLL;
                if (c203727z62 != null) {
                    c203727z62.LJLILLLLZI = new InterfaceC203737z7() { // from class: X.87k
                        @Override // X.InterfaceC203737z7
                        public final void aB(Exception exc) {
                        }

                        @Override // X.InterfaceC203737z7
                        public final void ix() {
                            String str2 = "";
                            if (!C2061987j.this.LJLILLLLZI.isCollected()) {
                                C2061987j.this.LJLILLLLZI.setCollectStatus(1);
                                AwemeService.LIZ().g6(1, C2061987j.this.LJLILLLLZI.getAid());
                                C2U8.LIZ(new C50420Jqa(54, C2061987j.this.LJLILLLLZI));
                                String aid = C2061987j.this.LJLILLLLZI.getAid();
                                if (aid != null) {
                                    str2 = aid;
                                }
                                C2U8.LIZ(new C193097hx(str2, 1, false));
                                if (o.LJ("homepage_hot", C2061987j.this.LJLJI)) {
                                    C2MY.LIZ().LJFF(6);
                                    return;
                                }
                                return;
                            }
                            C2061987j.this.LJLILLLLZI.setCollectStatus(0);
                            AwemeService.LIZ().g6(0, C2061987j.this.LJLILLLLZI.getAid());
                            C2U8.LIZ(new C50420Jqa(54, C2061987j.this.LJLILLLLZI));
                            String aid2 = C2061987j.this.LJLILLLLZI.getAid();
                            if (aid2 != null) {
                                str2 = aid2;
                            }
                            C2U8.LIZ(new C193097hx(str2, 0, false));
                        }

                        @Override // X.InterfaceC203737z7
                        public final void gd(String str2) {
                            if (str2 != null && FavoriteServiceImpl.LJIJJLI().LJI() <= 0) {
                                C26045AKb c26045AKb = new C26045AKb(C2061987j.this.LJLIL);
                                c26045AKb.LJIIIZ(str2);
                                c26045AKb.LJIIJ();
                            }
                        }
                    };
                    c203727z62.LJIILL(2, this.LJLILLLLZI.getAid(), Integer.valueOf(1 ^ (this.LJLILLLLZI.isCollected() ? 1 : 0)), Integer.valueOf(this.LJLILLLLZI.getAwemeType()));
                    return;
                } else {
                    o.LJIJI("collectActionPresenter");
                    throw null;
                }
            }
            Boolean LIZIZ = AwemeCollectionAgent.LJIIZILJ().LIZIZ(this.LJLILLLLZI);
            String aid = this.LJLILLLLZI.getAid();
            if (aid == null) {
                return;
            }
            Boolean bool = Boolean.TRUE;
            if (o.LJ(LIZIZ, bool)) {
                i = R.string.cgd;
            } else {
                i = R.string.dgl;
            }
            String string = FKM.LIZ().getString(i);
            o.LJIIIIZZ(string, "application.getString(msgId)");
            if (!o.LJ(LIZIZ, bool)) {
                AwemeCollectionAgent.LJIJ().LJII(aid, C113554cx.LJJLIIIIJ(new OSZ("privacy_setting", 0)), new AqS84S1100000_3(this, string, 0), new AqS185S0100000_3(this, 167));
            } else {
                C87P.LIZIZ(AwemeCollectionAgent.LJIJ(), aid, C113554cx.LJJLIIIIJ(new OSZ("privacy_setting", 0)), new AqS84S1100000_3(this, string, 1), null, 8);
            }
        }
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
        String region;
        PhotoModeImageInfo photoModeImageInfo;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (!this.LJLILLLLZI.isCollected()) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LJLJI);
            c188727au.LJIIIZ("group_id", this.LJLILLLLZI.getAid());
            c188727au.LJIIIZ("author_id", this.LJLILLLLZI.getAuthorUid());
            c188727au.LJIIIZ("enter_method", "click_share_button");
            c188727au.LJIIIZ("panel_source", this.LJLJJI);
            c188727au.LJIIIZ("tag_id", this.LJLJJL);
            c188727au.LJFF(Boolean.valueOf(this.LJLILLLLZI.isHighlighted()), "is_highlighted");
            c188727au.LIZLLL(this.LJLILLLLZI.getOriginalPos(), "rank_index");
            c188727au.LIZLLL(this.LJLILLLLZI.getAwemeType(), "aweme_type");
            c188727au.LIZLLL(C227768wm.LJIILIIL(this.LJLILLLLZI), "pic_cnt");
            Aweme aweme = this.LJLILLLLZI;
            if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && photoModeImageInfo.hasTitle()) {
                i = 1;
            } else {
                i = 0;
            }
            c188727au.LIZLLL(i, "has_title");
            V0N.LJI(c188727au, this.LJLILLLLZI);
            if (o.LJ(this.LJLJI, "homepage_nearby")) {
                LQA lqa = LQA.LIZIZ;
                String str = this.LJLJI;
                java.util.Map<String, String> map = c188727au.LIZ;
                o.LJII(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
                lqa.LJII(str, (HashMap) map, this.LJLILLLLZI, true);
            }
            C51556KLg.LIZ.getClass();
            java.util.Map LJIIJJI = C51556KLg.LIZ().LJIIJJI(this.LJLILLLLZI, null);
            if (!LJIIJJI.isEmpty()) {
                c188727au.LJIIIIZZ(LJIIJJI);
            }
            java.util.Map LJIIJJI2 = C51556KLg.LIZ().LJIIJJI(this.LJLILLLLZI, null);
            if (true ^ LJIIJJI2.isEmpty()) {
                c188727au.LJIIIIZZ(LJIIJJI2);
            }
            Z9N.LIZIZ.LJJIFFI().LIZ(c188727au, this.LJLILLLLZI);
            if (this.LJLJLJ.length() > 0) {
                c188727au.LJI("from_page", this.LJLJLJ);
            }
            if (o.LJ("homepage_country", this.LJLJI) && this.LJLILLLLZI.getAuthor() != null) {
                if (this.LJLILLLLZI.getAuthor() == null) {
                    region = "";
                } else {
                    region = this.LJLILLLLZI.getAuthor().getRegion();
                }
                c188727au.LJI("country_name", region);
            }
            if (this.LJLJJLL.length() > 0) {
                c188727au.LJI("parent_tag_id", this.LJLJJLL);
            }
            if (this.LJLJL.length() > 0) {
                c188727au.LJI("category_name", this.LJLJL);
            }
            if (!o.LJ(this.LJLJI, "from_music")) {
                c188727au.LIZLLL(CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(context, this.LJLILLLLZI), "music_name");
            }
            c188727au.LJIIIIZZ(C2KM.LIZIZ(C2S6.LIZ(context).getPreviousPage(), C2S6.LIZ(context).getFromGroupId()));
            C222578oP.LIZJ(c188727au, this.LJLILLLLZI, null, null, 14);
            C57258Mda.LIZIZ(c188727au, "favourite_video", C2S6.LIZ(context).getInboxLogExtra());
            if (C224888s8.LJ(this.LJLJI)) {
                c188727au.LJI("play_mode", C224888s8.LIZJ());
            }
            C220488l2.LIZIZ.LJII(this.LJLILLLLZI, c188727au);
            c188727au.LIZLLL(this.LJLILLLLZI.aigcInfo.getAIGCLabelType(), "aigc_theme_status");
            if (C227768wm.LJJIIJ(this.LJLJI)) {
                c188727au.LJI("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(this.LJLILLLLZI)));
                FMX.LJIILJJIL("favourite_video", C227768wm.LJJIIZI(c188727au.LIZ));
            } else {
                FMX.LJIIL("favourite_video", c188727au.LIZ);
            }
            C38987FRv.LJI(LSC.SHARE);
        } else {
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", this.LJLJI);
            c188727au2.LJIIIZ("group_id", this.LJLILLLLZI.getAid());
            c188727au2.LJIIIZ("author_id", this.LJLILLLLZI.getAuthorUid());
            c188727au2.LJIIIZ("enter_method", "click_share_button");
            c188727au2.LJIIIZ("panel_source", this.LJLJJI);
            c188727au2.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(this.LJLILLLLZI)));
            c188727au2.LIZLLL(this.LJLILLLLZI.getAwemeType(), "aweme_type");
            c188727au2.LIZLLL(C227768wm.LJIILIIL(this.LJLILLLLZI), "pic_cnt");
            c188727au2.LJIIIIZZ(C2KM.LIZIZ(C2S6.LIZ(context).getPreviousPage(), C2S6.LIZ(context).getFromGroupId()));
            c188727au2.LIZLLL(this.LJLILLLLZI.aigcInfo.getAIGCLabelType(), "aigc_theme_status");
            FMX.LJIIL("cancel_favourite_video", c188727au2.LIZ);
        }
        if (C63081OpJ.LJJLIIIJLJLI(this.LJLILLLLZI)) {
            C05L.LIZLLL(context, R.string.b96);
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            String aid = this.LJLILLLLZI.getAid();
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
            String str2 = this.LJLJI;
            C40883G2t c40883G2t = new C40883G2t();
            c40883G2t.LIZLLL("group_id", aid);
            c40883G2t.LIZLLL("author_id", this.LJLILLLLZI.getAuthorUid());
            c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(aid));
            J9P.LIZIZ(LJJLIIIJ, str2, "click_favorite_video", (Bundle) c40883G2t.LIZ, new IDgS137S0200000_3(this, context, 3));
            return;
        }
        LIZJ(context);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }

    public C2061987j(Activity activity, Aweme aweme, String enterFrom, String enterMethod, String tagId, String parentTagId, String categoryName, String fromPage) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(tagId, "tagId");
        o.LJIIIZ(parentTagId, "parentTagId");
        o.LJIIIZ(categoryName, "categoryName");
        o.LJIIIZ(fromPage, "fromPage");
        this.LJLIL = activity;
        this.LJLILLLLZI = aweme;
        this.LJLJI = enterFrom;
        this.LJLJJI = enterMethod;
        this.LJLJJL = tagId;
        this.LJLJJLL = parentTagId;
        this.LJLJL = categoryName;
        this.LJLJLJ = fromPage;
    }
}
