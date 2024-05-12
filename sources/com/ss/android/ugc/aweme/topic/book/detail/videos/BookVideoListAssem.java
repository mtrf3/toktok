package com.ss.android.ugc.aweme.topic.book.detail.videos;

import X.C020506f;
import X.C184077Kh;
import X.C184897Nl;
import X.C185837Rb;
import X.C185907Ri;
import X.C212428Vi;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C2K0;
import X.C47704Ins;
import X.C55096Ljo;
import X.C55230Lly;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C8W0;
import X.C8YN;
import X.EV9;
import X.InterfaceC55235Lm3;
import X.InterfaceC65784Pro;
import X.RBY;
import X.SYL;
import X.TBT;
import Y.IDcS7S0200000_3;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.detail.prefab.DetailListAssem;
import com.ss.android.ugc.aweme.detail.prefab.ability.InnerFlowAbility;
import com.ss.android.ugc.aweme.detail.prefab.videos.BasicDetailVideoCell;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookVideoListVM;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BookVideoListAssem extends DetailListAssem implements InnerFlowAbility<C185907Ri> {
    public final C55749LuL LJLLLL;
    public final C214378bB LJLLLLLL;

    public BookVideoListAssem() {
        InterfaceC65784Pro LJIILJJIL;
        new LinkedHashMap();
        this.LJLLLL = new C55749LuL(C47704Ins.LIZJ(this, C184897Nl.class, null), checkSupervisorPrepared());
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(this, 1063);
        C65776Prg LIZ = C65352Pkq.LIZ(BookVideoListVM.class);
        C185837Rb c185837Rb = C185837Rb.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJIILJJIL = new AqS153S0100000_3((C8W0) this, 1062);
        } else {
            LJIILJJIL = C78926UyI.LJIILJJIL(this, true);
        }
        this.LJLLLLLL = new C214378bB(LIZ, aqS153S0100000_3, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C184077Kh.LJLIL, c185837Rb, LJIILJJIL, C78926UyI.LJIIZILJ(this, true));
    }

    @Override // com.ss.android.ugc.aweme.prefab.ListAssem
    public final AssemListViewModel P3() {
        return (AssemListViewModel) this.LJLLLLLL.getValue();
    }

    public final C184897Nl W3() {
        return (C184897Nl) this.LJLLLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.DetailListAssem, com.ss.android.ugc.aweme.prefab.ListAssem, com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        BookVideoListVM bookVideoListVM = (BookVideoListVM) this.LJLLLLLL.getValue();
        C184897Nl W3 = W3();
        String str3 = "";
        if (W3 == null || (str = W3.LJLIL) == null) {
            str = "";
        }
        bookVideoListVM.LJLIL = str;
        BookVideoListVM bookVideoListVM2 = (BookVideoListVM) this.LJLLLLLL.getValue();
        C184897Nl W32 = W3();
        if (W32 != null && (str2 = W32.LJLILLLLZI) != null) {
            str3 = str2;
        }
        bookVideoListVM2.LJLILLLLZI = str3;
        SYL M3 = M3();
        M3.LLLF.LJZL(BasicDetailVideoCell.class);
        M3.getContext();
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(3, 1, false);
        wrapGridLayoutManager.LLIILII = new IDcS7S0200000_3(this, wrapGridLayoutManager, 3);
        M3.setLayoutManager(wrapGridLayoutManager);
        U3();
        C8YN.LJII(this, (AssemViewModel) this.LJLLLLLL.getValue(), new TBT() { // from class: X.7Rd
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C185887Rg) obj).LJLIL;
            }
        }, null, new AqS185S0100000_3(this, 90), 6);
        Fragment LIZLLL = C212428Vi.LIZLLL(this);
        if (LIZLLL != null) {
            InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(LIZLLL, null);
            C2K0 LIZ = C55096Ljo.LIZ(LIZJ, InnerFlowAbility.class, null);
            if (LIZ == null) {
                C55096Ljo.LJIIJJI(LIZJ, this, InnerFlowAbility.class, null);
            } else {
                try {
                    InvocationHandler invocationHandler = Proxy.getInvocationHandler(LIZ);
                    if (invocationHandler instanceof EV9) {
                        ((EV9) invocationHandler).LIZ.add(this);
                    } else {
                        throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                    }
                } catch (IllegalArgumentException unused) {
                    EV9 ev9 = new EV9();
                    ev9.LIZ.add(this);
                    ev9.LIZ.add(LIZ);
                    Object newProxyInstance = Proxy.newProxyInstance(InnerFlowAbility.class.getClassLoader(), new Class[]{InnerFlowAbility.class}, ev9);
                    if (newProxyInstance != null) {
                        C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, InnerFlowAbility.class, null);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.InnerFlowAbility<com.ss.android.ugc.aweme.detail.prefab.videos.DetailVideoItem>");
                    }
                }
            }
        }
        R3();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.InnerFlowAbility
    public final void ct(C185907Ri c185907Ri, View itemView) {
        String str;
        String str2;
        C185907Ri item = c185907Ri;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(itemView, "itemView");
        RBY LJFF = AccountService.LJIJ().LJFF();
        SmartRoute buildRoute = SmartRouter.buildRoute(itemView.getContext(), "aweme://aweme/detail/");
        buildRoute.withParam("activity_has_activity_options", true);
        Bundle bundle = new Bundle();
        bundle.putString("id", item.LJLILLLLZI.getAid());
        bundle.putString("userid", LJFF.getCurUserId());
        bundle.putString("sec_userid", LJFF.getCurSecUserId());
        bundle.putInt("video_type", 46);
        bundle.putString("enter_from", "book_detail_page");
        bundle.putString("video_from", "BOOK_VIDEO_LIST_ENTRANCE");
        HashMap hashMap = new HashMap();
        C184897Nl W3 = W3();
        String str3 = "";
        if (W3 == null || (str = W3.LJLIL) == null) {
            str = "";
        }
        hashMap.put("book_id", str);
        C184897Nl W32 = W3();
        if (W32 != null && (str2 = W32.LJLILLLLZI) != null) {
            str3 = str2;
        }
        hashMap.put("page_id", str3);
        bundle.putSerializable("feed_param_extra", hashMap);
        buildRoute.withParam(bundle);
        buildRoute.withBundleAnimation(C020506f.LIZ(itemView, itemView.getWidth(), itemView.getHeight()).LIZLLL());
        buildRoute.open();
    }
}
