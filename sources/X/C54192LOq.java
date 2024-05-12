package X;

import Y.IDComparatorS34S0000000_6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.feed.ui.FollowTabViewLifecycleObserver;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.service.protection.TooltipProtectionSetting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.LOq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54192LOq implements InterfaceC82692Wcq {
    public final /* synthetic */ FollowTabViewLifecycleObserver LIZ;

    @Override // X.InterfaceC82692Wcq
    public final void LIZJ() {
        Context context;
        ActivityC45651qj LJJIFFI;
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        InterfaceC54194LOs interfaceC54194LOs;
        C54193LOr LIZLLL;
        String str;
        Integer num;
        Integer num2;
        boolean z;
        String str2;
        LIV socialTabNoticeData = LHM.LIZIZ.LIZIZ().getSocialTabNoticeData();
        InterfaceC54196LOu LJIIJJI = this.LIZ.LJIIJJI();
        if (LJIIJJI != null && (LIZLLL = LJIIJJI.LIZLLL()) != null) {
            LQ7 lq7 = new LQ7("enter_homepage_follow");
            Integer num3 = null;
            if (socialTabNoticeData != null) {
                str = socialTabNoticeData.LJLIL;
                num = Integer.valueOf(socialTabNoticeData.LJLILLLLZI);
                num2 = Integer.valueOf(socialTabNoticeData.LJLJI);
                num3 = Integer.valueOf(socialTabNoticeData.LJLJJI);
            } else {
                str = null;
                num = null;
                num2 = null;
            }
            lq7.LJIILL(str, num, num2, num3);
            lq7.LJIILLIIL = "click_bubble";
            lq7.LIZLLL = "homepage_hot";
            lq7.LJIL = LIZLLL.LIZ;
            lq7.LJJ = LIZLLL.LIZIZ;
            C88545Yp3 c88545Yp3 = C88545Yp3.LIZIZ;
            if (c88545Yp3 != null) {
                z = c88545Yp3.isConnected();
            } else {
                z = false;
            }
            lq7.LJJIFFI = z;
            if (c88545Yp3 == null || (str2 = c88545Yp3.LJIILJJIL()) == null) {
                str2 = "";
            }
            lq7.LJJII = str2;
            lq7.LJIILIIL();
        }
        if (TooltipProtectionSetting.INSTANCE.isKillSwitchDisabled() && (interfaceC54194LOs = this.LIZ.LJLLLLLL) != null && interfaceC54194LOs.shouldShow()) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "homepage_hot");
            c188727au.LJIIIZ("position", "follow_tab");
            c188727au.LJIIIZ("content", "Live!");
            c188727au.LJIIIZ("product_line", "live");
            c188727au.LJIIIZ("sub_type", "follow_live");
            c188727au.LJIIIZ("tooltip_id", "2002");
            c188727au.LJIIIZ("click_method", "click");
            FMX.LJIIL("click_tooltip", c188727au.LIZ);
        }
        View view = this.LIZ.LJLIL;
        if (view != null && (context = view.getContext()) != null && (LJJIFFI = C45804HyK.LJJIFFI(context)) != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LJJIFFI)) != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null) {
            LJIL.lZ(new Bundle(), "Following");
        }
    }

    @Override // X.InterfaceC82692Wcq
    public final void LIZ() {
        int i;
        Object obj;
        List<User> list;
        User user;
        if (C53295Kvr.LIZJ()) {
            LHM.LIZIZ.LIZIZ().redDotLogic().Go0();
        }
        FollowTabViewLifecycleObserver followTabViewLifecycleObserver = this.LIZ;
        followTabViewLifecycleObserver.getClass();
        if (C53295Kvr.LIZJ() || (i = followTabViewLifecycleObserver.LJLZ) == -1) {
            return;
        }
        followTabViewLifecycleObserver.LJIJI(i);
        C54195LOt.LIZ = false;
        Iterator it = ORZ.LLILII(new IDComparatorS34S0000000_6(10), ((LinkedHashMap) followTabViewLifecycleObserver.LJLLILLLL).values()).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
            C36307EMt c36307EMt = (C36307EMt) obj;
            if (FollowTabViewLifecycleObserver.LJIIZILJ(c36307EMt.LJLIL) && C54362LVe.LJIIZILJ(c36307EMt.LJLIL)) {
                break;
            }
        }
        C36307EMt c36307EMt2 = (C36307EMt) obj;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("notice_type", FollowTabViewLifecycleObserver.LJIIIZ(followTabViewLifecycleObserver.LJLZ));
        c188727au.LJIIIZ("action_type", "show");
        if (c36307EMt2 != null && (list = c36307EMt2.LJLJI) != null && (user = (User) ORZ.LJLLLL(list)) != null) {
            c188727au.LJI("to_user_id", user.getUid());
        }
        int i2 = followTabViewLifecycleObserver.LJLZ;
        if (i2 == 41) {
            c188727au.LIZLLL(C54362LVe.LJIILJJIL(i2), "number_cnt");
        }
        if (followTabViewLifecycleObserver.LJLZ == 38) {
            c188727au.LIZLLL(1, "live_notice_type");
        }
        FMX.LJIIL("homepage_follow_notice", c188727au.LIZ);
        followTabViewLifecycleObserver.LJLZ = -1;
    }

    @Override // X.InterfaceC82692Wcq
    public final void LIZIZ() {
        C54193LOr LIZLLL;
        String str;
        boolean z;
        if (C53295Kvr.LIZJ()) {
            LHM.LIZIZ.LIZIZ().redDotLogic().St0();
        }
        FollowTabViewLifecycleObserver followTabViewLifecycleObserver = this.LIZ;
        if (followTabViewLifecycleObserver.LJLZ == -1) {
            View view = followTabViewLifecycleObserver.LJLILLLLZI;
            if (view != null && view.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                followTabViewLifecycleObserver.LJLZ = 40;
                View view2 = followTabViewLifecycleObserver.LJLILLLLZI;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            TextView textView = followTabViewLifecycleObserver.LJLJJI;
            if (textView != null && textView.getVisibility() == 0) {
                followTabViewLifecycleObserver.LJLZ = 41;
                TextView textView2 = followTabViewLifecycleObserver.LJLJJI;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            }
            View view3 = followTabViewLifecycleObserver.LJLL;
            if (view3 != null && view3.getVisibility() == 0) {
                followTabViewLifecycleObserver.LJLZ = 38;
                View view4 = followTabViewLifecycleObserver.LJLL;
                if (view4 != null) {
                    view4.setVisibility(8);
                }
            }
        }
        InterfaceC54196LOu LJIIJJI = this.LIZ.LJIIJJI();
        if (LJIIJJI != null && (LIZLLL = LJIIJJI.LIZLLL()) != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("notice_type", "live");
            c188727au.LJIIIZ("action_type", "show");
            c188727au.LIZLLL(LIZLLL.LIZ, "live_notice_type");
            c188727au.LIZLLL(LIZLLL.LIZIZ, "anchor_bubble_num");
            ArrayList<String> arrayList = LIZLLL.LIZJ;
            if (arrayList != null) {
                str = Arrays.toString(arrayList.toArray());
                o.LJIIIIZZ(str, "toString(it.toArray())");
            } else {
                str = "[]";
            }
            c188727au.LJIIIZ("anchor_bubble_list", str);
            FMX.LJIIL("homepage_follow_notice", c188727au.LIZ);
            C54195LOt.LIZ = false;
        }
        InterfaceC54194LOs interfaceC54194LOs = this.LIZ.LJLLLLLL;
        if (TooltipProtectionSetting.INSTANCE.isKillSwitchDisabled() && interfaceC54194LOs != null && interfaceC54194LOs.shouldShow()) {
            interfaceC54194LOs.LIZIZ("2002");
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", "homepage_hot");
            c188727au2.LJIIIZ("position", "follow_tab");
            c188727au2.LJIIIZ("content", "Live!");
            c188727au2.LJIIIZ("product_line", "live");
            c188727au2.LJIIIZ("sub_type", "follow_live");
            c188727au2.LJIIIZ("tooltip_id", "2002");
            FMX.LJIIL("show_tooltip", c188727au2.LIZ);
        }
    }

    public C54192LOq(FollowTabViewLifecycleObserver followTabViewLifecycleObserver) {
        this.LIZ = followTabViewLifecycleObserver;
    }
}
