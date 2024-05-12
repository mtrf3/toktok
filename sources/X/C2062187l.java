package X;

import Y.IDgS347S0100000_3;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.favorites.business.aweme.AwemeCollectionAgent;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.profile.model.CollectAwemeEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS84S1100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.87l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2062187l extends ASB implements InterfaceC203737z7 {
    public final C62435Oet LJLJJI;
    public final AS3 LJLJJL;
    public C203727z6 LJLJJLL;

    @Override // X.InterfaceC203737z7
    public final void aB(Exception exc) {
    }

    public final void LJFF() {
        Context context;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            if (!aweme.isCollected()) {
                String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
                Aweme aweme2 = this.LJLILLLLZI;
                String str = null;
                if (aweme2 != null) {
                    str = aweme2.getAuthorUid();
                }
                if ((!curSecUserId.equals(str)) && !C55511LqV.LJIIIIZZ(this.LJLILLLLZI) && FavoriteServiceImpl.LJIJJLI().LJIIL() && !Keva.getRepo("keva_favorite_notify_optimize_repo").getBoolean("keva_has_shown_favorite_notify_optimize_sheet", false) && FavoriteServiceImpl.LJIJJLI().LJIILL()) {
                    AS3 as3 = this.LJLJJL;
                    if (as3 != null) {
                        context = C27740Aue.LIZ(as3.getContext());
                    } else {
                        View view = this.LJLJJI.LJLJL;
                        if (view != null) {
                            context = view.getContext();
                        }
                        LJ();
                        return;
                    }
                    if (context != null && (context instanceof ActivityC45651qj)) {
                        C2062387n.LIZ((ActivityC45651qj) context, this.LJLJI, this.LJLILLLLZI);
                        return;
                    }
                    LJ();
                    return;
                }
            }
            LJ();
        }
    }

    @Override // X.InterfaceC203737z7
    public final void ix() {
        String str;
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            aweme.setCollectStatus(!aweme.isCollected() ? 1 : 0);
            AwemeService.LIZ().g6(aweme.getCollectStatus(), aweme.getAid());
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aid");
            C2U8.LIZ(new CollectAwemeEvent(aid, aweme.getCollectStatus(), aweme.getAwemeType()));
            Aweme aweme2 = this.LJLILLLLZI;
            if (aweme2 == null || (str = aweme2.getAid()) == null) {
                str = "";
            }
            C2U8.LIZ(new C193097hx(str, aweme.getCollectStatus(), false));
            if (o.LJ("homepage_hot", this.LJLJI)) {
                C2MY.LIZ().LJFF(6);
            }
        }
    }

    public final void LJ() {
        String aid;
        int i;
        String str;
        int i2;
        int i3 = 0;
        if (!C52535Kjb.LIZ()) {
            if (this.LJLJJLL == null) {
                this.LJLJJLL = new C203727z6();
            }
            C203727z6 c203727z6 = this.LJLJJLL;
            if (c203727z6 != null) {
                c203727z6.LJLJJLL = this.LJLJI;
                c203727z6.LJLILLLLZI = this;
                Object[] objArr = new Object[4];
                objArr[0] = 2;
                Aweme aweme = this.LJLILLLLZI;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                objArr[1] = str;
                Aweme aweme2 = this.LJLILLLLZI;
                if (aweme2 != null && aweme2.isCollected()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                objArr[2] = Integer.valueOf(1 ^ i2);
                Aweme aweme3 = this.LJLILLLLZI;
                if (aweme3 != null) {
                    i3 = aweme3.getAwemeType();
                }
                objArr[3] = Integer.valueOf(i3);
                c203727z6.LJIILL(objArr);
                return;
            }
            return;
        }
        Boolean LIZIZ = AwemeCollectionAgent.LJIIZILJ().LIZIZ(this.LJLILLLLZI);
        Aweme aweme4 = this.LJLILLLLZI;
        if (aweme4 == null || (aid = aweme4.getAid()) == null) {
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
            AwemeCollectionAgent.LJIJ().LJII(aid, C113554cx.LJJLIIIIJ(new OSZ("privacy_setting", 0)), new AqS84S1100000_3(this, string, 2), new AqS185S0100000_3(this, 168));
        } else {
            C87P.LIZIZ(AwemeCollectionAgent.LJIJ(), aid, C113554cx.LJJLIIIIJ(new OSZ("privacy_setting", 0)), new AqS84S1100000_3(this, string, 3), null, 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.ASG
    public final void LIZ(View v) {
        String str;
        boolean z;
        String str2;
        String str3;
        User user;
        Integer num;
        Boolean bool;
        Integer num2;
        int i;
        String str4;
        Dialog dialog;
        AIGCInfo aIGCInfo;
        Aweme aweme;
        int i2;
        PhotoModeImageInfo photoModeImageInfo;
        o.LJIIIZ(v, "v");
        Object[] objArr = new Object[2];
        objArr[0] = "feed long press panel";
        Aweme aweme2 = this.LJLILLLLZI;
        String str5 = null;
        r5 = null;
        Activity activity = null;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        objArr[1] = String.valueOf(str);
        String LLLZ = C16880lQ.LLLZ("click favorite button in %s, aid is %s", Arrays.copyOf(objArr, 2));
        o.LJIIIIZZ(LLLZ, "format(this, *args)");
        M8L.LIZ(LLLZ);
        C188727au c188727au = new C188727au();
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            c188727au.LJIIIIZZ(C2KM.LIZIZ(C2S6.LIZ(LJIIIIZZ).getPreviousPage(), C2S6.LIZ(LJIIIIZZ).getFromGroupId()));
        }
        Aweme aweme3 = this.LJLILLLLZI;
        if (aweme3 != null && OUP.LJJIII(aweme3)) {
            z = true;
        } else {
            z = false;
        }
        if (z && (aweme = this.LJLILLLLZI) != null && !aweme.isAd()) {
            Aweme aweme4 = this.LJLILLLLZI;
            if (aweme4 == null || (photoModeImageInfo = aweme4.getPhotoModeImageInfo()) == null || photoModeImageInfo.getTitle() == null) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            c188727au.LIZLLL(i2, "has_title");
            String string = this.LJLJJI.LJLJLJ.extras.getString("from_page");
            if (string != null) {
                c188727au.LJI("from_page", string);
            }
        }
        if (!o.LJ(this.LJLJI, "from_music")) {
            c188727au.LIZLLL(CommonFeedServiceImpl.LJJIJLIJ().LJIIZILJ(v.getContext(), this.LJLILLLLZI), "music_name");
        }
        Activity LJIIIIZZ2 = C84763XOl.LJIIIIZZ();
        String str6 = "favourite_video";
        if (LJIIIIZZ2 != null) {
            C57258Mda.LIZIZ(c188727au, "favourite_video", C2S6.LIZ(LJIIIIZZ2).getInboxLogExtra());
        }
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        c188727au.LJIIIZ("enter_from", this.LJLJI);
        Aweme aweme5 = this.LJLILLLLZI;
        if (aweme5 != null) {
            str2 = aweme5.getAid();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("group_id", str2);
        Aweme aweme6 = this.LJLILLLLZI;
        if (aweme6 != null) {
            str3 = aweme6.getAuthorUid();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("author_id", str3);
        Aweme aweme7 = this.LJLILLLLZI;
        if (aweme7 != null) {
            user = aweme7.getAuthor();
        } else {
            user = null;
        }
        c188727au.LJIIIZ("follow_status", C227768wm.LJIJ(user));
        c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZIZ(C227768wm.LJIIZILJ(this.LJLILLLLZI)));
        String str7 = this.LJLJJI.LJLJI;
        String str8 = "long_press";
        if (str7 == null) {
            str7 = "long_press";
        }
        c188727au.LJIIIZ("enter_method", str7);
        String str9 = this.LJLJJI.LJLJI;
        if (str9 != null) {
            str8 = str9;
        }
        c188727au.LJIIIZ("panel_source", str8);
        Aweme aweme8 = this.LJLILLLLZI;
        if (aweme8 != null) {
            num = Integer.valueOf(aweme8.getAwemeType());
        } else {
            num = null;
        }
        c188727au.LJFF(num, "aweme_type");
        c188727au.LIZLLL(C227768wm.LJIILIIL(this.LJLILLLLZI), "pic_cnt");
        Aweme aweme9 = this.LJLILLLLZI;
        if (aweme9 != null) {
            bool = Boolean.valueOf(aweme9.isHighlighted());
        } else {
            bool = null;
        }
        c188727au.LJFF(bool, "is_highlighted");
        Aweme aweme10 = this.LJLILLLLZI;
        if (aweme10 != null) {
            num2 = Integer.valueOf(aweme10.getOriginalPos());
        } else {
            num2 = null;
        }
        c188727au.LJFF(num2, "rank_index");
        Aweme aweme11 = this.LJLILLLLZI;
        if (aweme11 == null || !aweme11.isCollected()) {
            V0N.LJI(c188727au, this.LJLILLLLZI);
        }
        String str10 = this.LJLJJI.LJLJJI;
        if (str10 != null) {
            c188727au.LJI("from_page", str10);
        }
        String str11 = this.LJLJI;
        Aweme aweme12 = this.LJLILLLLZI;
        Z9N z9n = Z9N.LIZIZ;
        java.util.Map<String, String> LLJLLIL = z9n.LLJLLIL(str11, z9n.LJLJJLL(str11));
        if (!LLJLLIL.isEmpty()) {
            c188727au.LJIIIIZZ(C176276vv.LIZ(aweme12, LLJLLIL));
        }
        if (o.LJ(this.LJLJI, "homepage_nearby")) {
            LQA lqa = LQA.LIZIZ;
            String str12 = this.LJLJI;
            java.util.Map<String, String> map = c188727au.LIZ;
            o.LJII(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ kotlin.collections.TypeAliasesKt.HashMap<kotlin.String, kotlin.String> }");
            lqa.LJII(str12, (HashMap) map, this.LJLILLLLZI, true);
        }
        C51556KLg.LIZ.getClass();
        java.util.Map LJIIJJI = C51556KLg.LIZ().LJIIJJI(this.LJLILLLLZI, null);
        if (!LJIIJJI.isEmpty()) {
            c188727au.LJIIIIZZ(LJIIJJI);
        }
        z9n.LJJIFFI().LIZ(c188727au, this.LJLILLLLZI);
        Object LJII = c220488l2.LJII(this.LJLILLLLZI, c188727au);
        C222578oP.LIZJ(LJII, this.LJLILLLLZI, null, null, 14);
        C188727au c188727au2 = (C188727au) LJII;
        Aweme aweme13 = this.LJLILLLLZI;
        if (aweme13 != null && (aIGCInfo = aweme13.aigcInfo) != null) {
            i = aIGCInfo.getAIGCLabelType();
        } else {
            i = 0;
        }
        c188727au2.LIZLLL(i, "aigc_theme_status");
        java.util.Map<String, String> map2 = c188727au2.LIZ;
        Aweme aweme14 = this.LJLILLLLZI;
        if (aweme14 != null && aweme14.isCollected()) {
            str6 = "cancel_favourite_video";
        }
        FMX.LJIIL(str6, map2);
        Aweme aweme15 = this.LJLILLLLZI;
        if (aweme15 != null && C63081OpJ.LJJLIIIJLJLI(aweme15)) {
            AS3 as3 = this.LJLJJL;
            if ((as3 instanceof Dialog) && (dialog = (Dialog) as3) != null) {
                activity = dialog.getOwnerActivity();
            }
            if (activity != null) {
                AnonymousClass114.LIZ(activity, R.string.b96);
                return;
            }
            View view = this.LJLJJI.LJLJL;
            if (view == null) {
                return;
            }
            AnonymousClass030.LJ(view, R.string.b96);
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            Aweme aweme16 = this.LJLILLLLZI;
            if (aweme16 == null || (str4 = aweme16.getAid()) == null) {
                str4 = "";
            }
            Activity LJIIIIZZ3 = C84763XOl.LJIIIIZZ();
            String str13 = this.LJLJI;
            C40883G2t c40883G2t = new C40883G2t();
            c40883G2t.LIZLLL("group_id", str4);
            Aweme aweme17 = this.LJLILLLLZI;
            if (aweme17 != null) {
                str5 = aweme17.getAuthorUid();
            }
            c40883G2t.LIZLLL("author_id", str5);
            c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(str4));
            J9P.LIZIZ(LJIIIIZZ3, str13, "click_favorite_video", (Bundle) c40883G2t.LIZ, new IDgS347S0100000_3(this, 4));
            return;
        }
        LJFF();
    }

    @Override // X.InterfaceC203737z7
    public final void gd(String str) {
        Dialog dialog;
        Object obj = this.LJLJJL;
        if (obj != null) {
            if ((obj instanceof Dialog) && (dialog = (Dialog) obj) != null && FavoriteServiceImpl.LJIJJLI().LJI() <= 0) {
                C26045AKb c26045AKb = new C26045AKb(dialog);
                c26045AKb.LJIIIZ(str);
                c26045AKb.LJIIJ();
                return;
            }
            return;
        }
        View view = this.LJLJJI.LJLJL;
        if (view != null && FavoriteServiceImpl.LJIJJLI().LJI() <= 0) {
            C26045AKb c26045AKb2 = new C26045AKb(view);
            c26045AKb2.LJIIIZ(str);
            c26045AKb2.LJIIJ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2062187l(C62435Oet actionsManager, AS3 as3) {
        super(actionsManager, as3);
        o.LJIIIZ(actionsManager, "actionsManager");
        this.LJLJJI = actionsManager;
        this.LJLJJL = as3;
    }
}
