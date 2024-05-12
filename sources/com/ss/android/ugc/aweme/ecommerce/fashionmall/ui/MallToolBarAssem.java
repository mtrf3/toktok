package com.ss.android.ugc.aweme.ecommerce.fashionmall.ui;

import X.ActivityC45651qj;
import X.AnonymousClass030;
import X.C113554cx;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C188787b0;
import X.C212428Vi;
import X.C214298b3;
import X.C26338AVi;
import X.C32151Nz;
import X.C36746EbW;
import X.C38350F3i;
import X.C3C5;
import X.C45804HyK;
import X.C47261Igj;
import X.C51762KTe;
import X.C55096Ljo;
import X.C56045Lz7;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76542zS;
import X.C76800UCe;
import X.C78565UsT;
import X.C78613UtF;
import X.C78847Ux1;
import X.C78897Uxp;
import X.C78926UyI;
import X.C7MY;
import X.C87953cl;
import X.C8VV;
import X.C8YN;
import X.C9BE;
import X.E2C;
import X.InterfaceC53896LDg;
import X.InterfaceC65350Pko;
import X.K65;
import X.K7K;
import X.KAK;
import X.KH8;
import X.KHA;
import X.KKT;
import X.KKU;
import X.KKW;
import X.KKX;
import X.KKY;
import X.KLA;
import X.MBB;
import X.O6R;
import X.OSZ;
import X.TBT;
import X.XKQ;
import X.XKX;
import X.Z9N;
import Y.ARunnableS27S0200000_8;
import Y.IDObjectS329S0100000_8;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.ViewSwitcher;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.hox.Hox;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.vm.ShopMainViewModel;
import com.ss.android.ugc.aweme.utils.Au2S17S0100000_8;
import com.ss.android.ugc.aweme.vision.EComPhotoSearchServiceImpl;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.AqS31S1000000_8;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* loaded from: classes9.dex */
public final class MallToolBarAssem extends UISlotAssem implements InterfaceC53896LDg {
    public final C214298b3 LJLJLLL;
    public String LJLL;
    public volatile String LJLLI;
    public volatile int LJLLILLLL;
    public volatile boolean LJLLJ;
    public final List<Word> LJLLL;
    public Map<String, String> LJLLLL;
    public final Set<Word> LJLLLLLL;
    public boolean LJLZ;
    public XKQ LJZ;
    public final long LJZI;
    public final Map<Integer, View> LJZL = new LinkedHashMap();

    public final void L3() {
        C36746EbW.LIZ(3, "startSearchWordAnimation");
        if (this.LJLLJ && ((ArrayList) this.LJLLL).size() > 1) {
            this.LJLZ = true;
        }
        this.LJZ = XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C78613UtF.LIZJ, null, new KHA(this, null), 2);
    }

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.ao_;
    }

    public MallToolBarAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ShopMainViewModel.class);
        this.LJLJLLL = C78926UyI.LJ(this, LIZ, c9be, new AqS158S0100000_8((InterfaceC65350Pko) LIZ, 51), KKW.INSTANCE, null);
        this.LJLL = "";
        this.LJLLI = "";
        this.LJLLL = new ArrayList();
        this.LJLLLL = E2C.LIZJ("traffic_source_list", new JSONArray((Collection) C47261Igj.LJJIJ(6)).toString());
        this.LJLLLLLL = new LinkedHashSet();
        this.LJZI = 5000L;
    }

    @Override // X.C8W0
    public final void onPause() {
        super.onPause();
        C36746EbW.LIZ(3, "onPause");
        C51762KTe c51762KTe = FashionMallFragment.LJZ;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        c51762KTe.getClass();
        if (C51762KTe.LIZ(LIZ)) {
            C36746EbW.LIZ(3, "pauseSearchWordAnimation");
            XKQ xkq = this.LJZ;
            if (xkq != null) {
                xkq.LIZIZ(null);
            }
            this.LJZ = null;
            this.LJLZ = false;
        }
    }

    @Override // X.C8W0
    public final void onResume() {
        super.onResume();
        C36746EbW.LIZ(3, "onResume");
        C51762KTe c51762KTe = FashionMallFragment.LJZ;
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        c51762KTe.getClass();
        if (C51762KTe.LIZ(LIZ)) {
            L3();
        }
    }

    public final void H3(Word word) {
        if (!this.LJLLLLLL.contains(word)) {
            this.LJLLLLLL.add(word);
            C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
            OSZ[] oszArr = new OSZ[4];
            oszArr[0] = new OSZ("words_position", String.valueOf(this.LJLLILLLL));
            oszArr[1] = new OSZ("words_content", this.LJLL);
            String id = word.getId();
            if (id == null) {
                id = "";
            }
            oszArr[2] = new OSZ("group_id", id);
            oszArr[3] = new OSZ("impr_id", this.LJLLI);
            Map LJJL = C113554cx.LJJL(oszArr);
            c56045Lz7.getClass();
            C76542zS.LIZJ("trending_words_show", new AqS174S0100000_8(LJJL, (Map<String, String>) 204));
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        C36746EbW.LIZ(3, "onNodeHide");
        C36746EbW.LIZ(3, "pauseSearchWordAnimation");
        XKQ xkq = this.LJZ;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJZ = null;
        this.LJLZ = false;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        C36746EbW.LIZ(3, "onNodeShow");
        L3();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        View findViewById;
        o.LJIIIZ(view, "view");
        C36746EbW.LIZ(3, "onViewCreated");
        Context context = getContext();
        if (context == null) {
            return;
        }
        View view2 = KKY.LIZ.get();
        int i = 0;
        if (view2 == null || !o.LJ(view2.getContext(), context)) {
            view2 = AnonymousClass030.LIZLLL(context, R.layout.ao9, null, false, "from(context).inflate(R.…opping_cart, null, false)");
            KKY.LIZ = new WeakReference<>(view2);
        }
        FashionMallFragment.LJZ.getClass();
        if (C51762KTe.LIZIZ()) {
            ActivityC45651qj LIZ = C212428Vi.LIZ(this);
            if (LIZ != null && (findViewById = LIZ.findViewById(R.id.j5x)) != null) {
                findViewById.post(new ARunnableS27S0200000_8(findViewById, this, 86));
            }
            View inbox_helper = _$_findCachedViewById(R.id.ekl);
            o.LJIIIIZZ(inbox_helper, "inbox_helper");
            K3(inbox_helper, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), C7MY.LIZIZ(4), C7MY.LIZIZ(8), O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.jyy));
            C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.e2_));
            ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
            if (LIZ2 != null) {
                Hox.LJLLI.LIZ(LIZ2).hv0("Shop", new KKU(this));
            }
            TopTabAbility LJJLIIIJL = C78847Ux1.LJJLIIIJL(C55096Ljo.LJIIZILJ(this));
            if (LJJLIIIJL != null) {
                LJJLIIIJL.yh0(false, true);
            }
        } else {
            try {
                ViewParent parent = view2.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C16880lQ.LJLLL(view2, viewGroup);
                }
                ((FrameLayout) _$_findCachedViewById(R.id.jyy)).addView(view2);
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C8VV.LIZJ(this, new AqS139S0200000_8(this, view2, 2));
        ActivityC45651qj LIZ3 = C212428Vi.LIZ(this);
        if (LIZ3 != null) {
            C188787b0 c188787b0 = Hox.LJLLI;
            c188787b0.LIZ(LIZ3).hv0("SHOP_MALL", this);
            c188787b0.LIZ(LIZ3).hv0("Shop", this);
        }
        Context context2 = getContext();
        if (context2 != null) {
            this.LJLL = Z9N.LIZIZ.LLIIII(context2);
            ((ViewSwitcher) _$_findCachedViewById(R.id.lly)).setFactory(new KKT(context2, this));
            ((TextSwitcher) _$_findCachedViewById(R.id.lly)).setText(this.LJLL);
            C78565UsT.LJJIIZI(this, MBB.INSTANCE, new KH8(this, null));
        }
        View inbox_helper2 = _$_findCachedViewById(R.id.ekl);
        o.LJIIIIZZ(inbox_helper2, "inbox_helper");
        C16880lQ.LJIIJ(new Au2S17S0100000_8(this, 4), inbox_helper2);
        View ts_search_query = _$_findCachedViewById(R.id.lly);
        o.LJIIIIZZ(ts_search_query, "ts_search_query");
        K3(ts_search_query, O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)));
        _$_findCachedViewById(R.id.jeh).setVisibility(0);
        C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
        FashionMallFragment.LJZ.getClass();
        String str = FashionMallFragment.LJZI;
        if (str == null) {
            str = "";
        }
        c56045Lz7.getClass();
        C76542zS.LIZJ("tiktokec_search_entrance_show", new AqS31S1000000_8(str, 4));
        AqS174S0100000_8 aqS174S0100000_8 = new AqS174S0100000_8(this, 238);
        View search_button = _$_findCachedViewById(R.id.jeh);
        o.LJIIIIZZ(search_button, "search_button");
        C16880lQ.LJIIJ(new Au2S17S0100000_8(aqS174S0100000_8, 3), search_button);
        Context context3 = getContext();
        if (context3 != null) {
            K65.LIZ.getClass();
            int i2 = -1;
            if (K65.LIZIZ() && (viewGroup2 = (ViewGroup) _$_findCachedViewById(R.id.ekl)) != null) {
                Iterator it = new IDObjectS329S0100000_8(viewGroup2, 2).iterator();
                while (true) {
                    KKX kkx = (KKX) it;
                    if (!kkx.hasNext()) {
                        break;
                    }
                    Object next = kkx.next();
                    int i3 = i + 1;
                    if (i >= 0) {
                        if (((View) next).getId() == R.id.jeh) {
                            i2 = i;
                        }
                        i = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            EComPhotoSearchServiceImpl.LJFF().LIZJ(context3, i2, K7K.MALL, (ViewGroup) _$_findCachedViewById(R.id.ekl), new C78897Uxp(), null);
        }
        C8YN.LJII(this, this.LJLJLLL.getValue(), new TBT() { // from class: X.KKZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C55978Ly2) obj).LJLJLJ;
            }
        }, null, C87953cl.LJLIL, 6);
    }

    public static void I3(Context context, String str, Map map) {
        int i;
        String str2;
        Integer LJJIL;
        C56045Lz7.LIZ.getClass();
        C76542zS.LIZJ("rd_search_entrance_click", new AqS31S1000000_8("search_middle_page", 3));
        String str3 = (String) map.get("hint_position");
        boolean z = false;
        if (str3 != null && (LJJIL = C38350F3i.LJJIL(str3)) != null) {
            i = LJJIL.intValue();
        } else {
            i = 0;
        }
        if (KLA.LIZ() != 0) {
            str2 = "//ec/search";
        } else {
            str2 = "//search";
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, str2);
        buildRoute.withParam("enter_from", C56045Lz7.LIZIZ());
        buildRoute.withParam("in_single_stack", true);
        buildRoute.withParam("set_hint_by_sug_word", false);
        KAK kak = KAK.SHOP;
        buildRoute.withParam("target_tab", kak.getTabName());
        if (KLA.LIZ() == 0) {
            z = true;
        }
        buildRoute.withParam("keep_tab_position", z);
        String str4 = (String) map.get("hint_group_id");
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        buildRoute.withParam("hint_group_id", str4);
        String str6 = (String) map.get("hint_imp_id");
        if (str6 == null) {
            str6 = "";
        }
        buildRoute.withParam("hint_imp_id", str6);
        buildRoute.withParam("hint_position", i);
        String str7 = (String) map.get("traffic_source_list");
        if (str7 == null) {
            str7 = "[]";
        }
        buildRoute.withParam("traffic_source_list", str7);
        if (KLA.LIZ() == 2) {
            str5 = kak.getTabName();
        }
        buildRoute.withParam("single_tab_type", str5);
        buildRoute.withParam("blankpage_enter_from", C56045Lz7.LIZIZ());
        buildRoute.withParam("blankpage_enter_method", "enter");
        buildRoute.withParam("search_from", C56045Lz7.LIZIZ());
        if (!ujb.o.LJJJJJL(str)) {
            buildRoute.withParam("search_hint_word", str);
        }
        buildRoute.open();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_method", "enter");
        c188727au.LJIIIZ("enter_from", C56045Lz7.LIZIZ());
        c188727au.LJIIIZ("search_entrance", C56045Lz7.LIZIZ());
        Map<String, String> map2 = c188727au.LIZ;
        o.LJIIIIZZ(map2, "newBuilder()\n           …               .builder()");
        C76542zS.LIZ("enter_search_blankpage", map2);
    }

    public final void K3(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Context context = getContext();
        if (context != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                C26338AVi.LJII(marginLayoutParams, context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), 32);
            }
            view.requestLayout();
        }
    }
}
