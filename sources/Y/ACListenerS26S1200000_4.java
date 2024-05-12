package Y;

import X.C119244m8;
import X.C188727au;
import X.C244659iv;
import X.C247279n9;
import X.C250349s6;
import X.C251009tA;
import X.C251349ti;
import X.C254379yb;
import X.C25589A2n;
import X.C25750A8s;
import X.C26227ARb;
import X.C31461Li;
import X.C35936E8m;
import X.C62822Ol8;
import X.C6ZT;
import X.C77123UOp;
import X.C85990Xow;
import X.C95J;
import X.CK3;
import X.FMX;
import X.HG3;
import X.InterfaceC247459nR;
import X.RBX;
import X.SY4;
import android.content.Context;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.touchpoint.core.model.Bubble;
import com.bytedance.touchpoint.core.model.FeedButton;
import com.bytedance.touchpoint.core.model.Picture;
import com.bytedance.touchpoint.core.model.PopupView;
import com.bytedance.touchpoint.core.model.Video;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.creatortools.api.ShowCaseModel;
import com.ss.android.ugc.aweme.feed.assem.statecontrol.StateControlMediaAssem;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionListAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ACListenerS26S1200000_4 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS26S1200000_4 aCListenerS26S1200000_4, View view) {
        String str;
        ((CreatorToolsActivity) aCListenerS26S1200000_4.l1).LLILIL("click_creator_showcase");
        SmartRouter.buildRoute((CreatorToolsActivity) aCListenerS26S1200000_4.l1, ((ShowCaseModel) aCListenerS26S1200000_4.l2).clickSchema).open();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("EVENT_ORIGIN_FEATURE", "TEMAI");
        c188727au.LJIIIZ("page_name", "creator_tools");
        c188727au.LJIIIZ("author_id", ((RBX) HG3.LJIILL()).getCurUserId());
        c188727au.LJIIIZ("country", aCListenerS26S1200000_4.s0);
        c188727au.LJIIIZ("click_for", "tiktok_showcase");
        boolean z = ((ShowCaseModel) aCListenerS26S1200000_4.l2).havePermission;
        String str2 = "yes";
        if (z) {
            str = "yes";
        } else {
            str = "no";
        }
        c188727au.LJIIIZ("is_onboard_ecom", str);
        if (!C25750A8s.LIZ()) {
            str2 = "no";
        }
        c188727au.LJIIIZ("enable_showcase", str2);
        FMX.LJIIL("tiktokec_creator_tools_module_click", c188727au.LIZ);
    }

    public static final void onClick$1(ACListenerS26S1200000_4 aCListenerS26S1200000_4, View view) {
        Context context = ((SY4) aCListenerS26S1200000_4.l1).getContext();
        if (context != null) {
            StateControlMediaAssem stateControlMediaAssem = (StateControlMediaAssem) aCListenerS26S1200000_4.l2;
            String str = aCListenerS26S1200000_4.s0;
            stateControlMediaAssem.getClass();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("object_id", ((RBX) HG3.LJIILL()).getCurUserId());
            c188727au.LJIIIZ("country_code", C85990Xow.LIZ());
            c188727au.LJIIIZ("enter_from", stateControlMediaAssem.getEnterFrom());
            FMX.LJIIL("scm_tag_click", c188727au.LIZ);
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("object_id", ((RBX) HG3.LJIILL()).getCurUserId());
            c188727au2.LJIIIZ("country_code", C85990Xow.LIZ());
            c188727au2.LJIIIZ("previous_page", stateControlMediaAssem.getEnterFrom());
            FMX.LJIIL("scm_description_pop", c188727au2.LIZ);
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LJFF(context.getString(R.string.qaf));
            c26227ARb.LJIIIZ = new C244659iv(context, R.raw.icon_info_circle_fill, Integer.valueOf(R.attr.go), 8, 0);
            c26227ARb.LIZIZ(context.getString(R.string.qae));
            C77123UOp.LJIILL(c26227ARb, new AqS47S1200000_4(context, stateControlMediaAssem, str, 15));
            c26227ARb.LIZJ(new AqS170S0100000_4(stateControlMediaAssem, 952));
            c26227ARb.LJI().LIZLLL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:297:0x06ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$2(Y.ACListenerS26S1200000_4 r12, android.view.View r13) {
        /*
            Method dump skipped, instructions count: 2088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS26S1200000_4.onClick$2(Y.ACListenerS26S1200000_4, android.view.View):void");
    }

    public static final void onClick$3(ACListenerS26S1200000_4 aCListenerS26S1200000_4, View view) {
        String str;
        String str2;
        if (C6ZT.LIZ(view)) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(((C119244m8) aCListenerS26S1200000_4.l1).getContext(), C31461Li.LIZJ("profile_rba_info_schema", "", "getInstance().getStringV…hemaSettings::class.java)"));
        buildRoute.withParam("company_name", aCListenerS26S1200000_4.s0);
        buildRoute.withParam("category", ((User) aCListenerS26S1200000_4.l2).getCategory());
        String uid = ((User) aCListenerS26S1200000_4.l2).getUid();
        IAccountUserService LJIILL = HG3.LJIILL();
        String str3 = null;
        if (LJIILL != null) {
            str = ((RBX) LJIILL).getCurUserId();
        } else {
            str = null;
        }
        String str4 = "self";
        if (o.LJ(uid, str)) {
            str2 = "self";
        } else {
            str2 = "other";
        }
        buildRoute.withParam("type", str2);
        buildRoute.open();
        C35936E8m c35936E8m = new C35936E8m();
        String uid2 = ((User) aCListenerS26S1200000_4.l2).getUid();
        IAccountUserService LJIILL2 = HG3.LJIILL();
        if (LJIILL2 != null) {
            str3 = ((RBX) LJIILL2).getCurUserId();
        }
        if (!o.LJ(uid2, str3)) {
            str4 = "other";
        }
        c35936E8m.LIZLLL("type", str4);
        FMX.LJIIL("ttelite_profile_click_RBA_info", c35936E8m.LIZ);
    }

    public static final void onClick$4(ACListenerS26S1200000_4 aCListenerS26S1200000_4, View view) {
        C251349ti c251349ti = ((C251009tA) aCListenerS26S1200000_4.l1).LLIIL;
        if (c251349ti != null) {
            c251349ti.LIZ();
        }
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", aCListenerS26S1200000_4.s0);
            interfaceC247459nR.LIZIZ("widget_bubble2_close_click", linkedHashMap);
        }
        C250349s6.LIZIZ((Bubble) aCListenerS26S1200000_4.l2, "close");
    }

    public static final void onClick$5(ACListenerS26S1200000_4 aCListenerS26S1200000_4, View view) {
        Integer num;
        SmartRouter.buildRoute(((PaidContentCollectionListAssem) aCListenerS26S1200000_4.l1).getContext(), aCListenerS26S1200000_4.s0).open();
        C62822Ol8 c62822Ol8 = C254379yb.LIZIZ;
        Object value = c62822Ol8.getValue();
        o.LJIIIIZZ(value, "<get-tooltipTimeSpanRepo>(...)");
        String string = ((Keva) value).getString(C254379yb.LIZ(), String.valueOf(System.currentTimeMillis()));
        o.LJIIIIZZ(string, "tooltipTimeSpanRepo.getS…tTimeMillis().toString())");
        if (!o.LJ(string, "9223372036854775807")) {
            String timeStamp = String.valueOf(System.currentTimeMillis());
            o.LJIIIZ(timeStamp, "timeStamp");
            Object value2 = c62822Ol8.getValue();
            o.LJIIIIZZ(value2, "<get-tooltipTimeSpanRepo>(...)");
            ((Keva) value2).storeString(C254379yb.LIZ(), timeStamp);
        }
        PaidContentCollectionListAssem paidContentCollectionListAssem = (PaidContentCollectionListAssem) aCListenerS26S1200000_4.l1;
        PaidCollectionListResponse paidCollectionListResponse = (PaidCollectionListResponse) aCListenerS26S1200000_4.l2;
        paidContentCollectionListAssem.getClass();
        if (paidCollectionListResponse != null) {
            C188727au LIZ = CK3.LIZ("enter_from", "personal_homepage");
            List<CollectionDetailModel> list = paidCollectionListResponse.collectionList;
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            LIZ.LJFF(num, "collection_cnt");
            C25589A2n.LIZIZ(LIZ, paidCollectionListResponse);
            FMX.LJIIL("click_go_to_series_portal", LIZ.LIZ);
        }
    }

    public static final void onClick$6(ACListenerS26S1200000_4 aCListenerS26S1200000_4, View view) {
        String str;
        PopupView popupView;
        FeedButton feedButton;
        Video video = (Video) aCListenerS26S1200000_4.l2;
        if (video != null && (popupView = video.popupView) != null && (feedButton = popupView.button) != null) {
            str = feedButton.jumpLink;
        } else {
            str = null;
        }
        ((C247279n9) aCListenerS26S1200000_4.l1).LJIIJ(str, aCListenerS26S1200000_4.s0);
    }

    public static final void onClick$7(ACListenerS26S1200000_4 aCListenerS26S1200000_4, View view) {
        String str;
        FeedButton feedButton;
        Picture picture = (Picture) aCListenerS26S1200000_4.l2;
        if (picture != null && (feedButton = picture.button) != null) {
            str = feedButton.jumpLink;
        } else {
            str = null;
        }
        ((C247279n9) aCListenerS26S1200000_4.l1).LJIIJ(str, aCListenerS26S1200000_4.s0);
    }

    public ACListenerS26S1200000_4(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
