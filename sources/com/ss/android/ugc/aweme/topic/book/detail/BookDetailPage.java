package com.ss.android.ugc.aweme.topic.book.detail;

import X.AbstractC234519Ih;
import X.ActivityC45651qj;
import X.C10A;
import X.C113554cx;
import X.C116484hg;
import X.C141335gf;
import X.C162476Zf;
import X.C184077Kh;
import X.C199377s5;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214368bA;
import X.C214378bB;
import X.C214528bQ;
import X.C234529Ii;
import X.C29S;
import X.C2K0;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C47261Igj;
import X.C55096Ljo;
import X.C55230Lly;
import X.C56412MCa;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78926UyI;
import X.C78983UzD;
import X.C7PP;
import X.C7PR;
import X.C7R7;
import X.C7RO;
import X.C7RP;
import X.C7RQ;
import X.C7RS;
import X.C7RT;
import X.C7RU;
import X.C7RV;
import X.C7RX;
import X.C7RY;
import X.C7RZ;
import X.C7S5;
import X.C7S6;
import X.C8VV;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.EV9;
import X.FMX;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC55235Lm3;
import X.InterfaceC61213O0r;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.OSZ;
import X.TBT;
import X.TBW;
import X.X1D;
import X.XKX;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemSingleListViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility;
import com.ss.android.ugc.aweme.detail.prefab.ability.NavActionProvider;
import com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookDetailVM;
import com.ss.android.ugc.aweme.topic.book.detail.vm.BookVideoListVM;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.AqS60S0110000_3;
import kotlin.jvm.internal.AqS61S0110000_4;
import kotlin.jvm.internal.o;

@InterfaceC61213O0r
/* loaded from: classes4.dex */
public final class BookDetailPage extends DetailBaseFragment implements ShootAbility, KPL, RefreshAbility, NavActionProvider, ViewPagerPageSelectedSubscriber {
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C214298b3 LJLJJLL;
    public final C214378bB LJLJL;
    public final C214298b3 LJLJLJ;
    public final C214298b3 LJLJLLL;
    public final C214378bB LJLL;
    public final String LJLLI;
    public volatile boolean LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void ZJ() {
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String lr() {
        return "book_detail_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public BookDetailPage() {
        AqS60S0110000_3 LJJ;
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        AqS60S0110000_3 LJJ2;
        RouteArgExtension routeArgExtension = RouteArgExtension.INSTANCE;
        this.LJLILLLLZI = routeArgExtension.requiredArg(this, C7RX.LJLIL, "book_id", String.class);
        this.LJLJI = routeArgExtension.requiredArg(this, C7RY.LJLIL, "tab", String.class);
        this.LJLJJI = routeArgExtension.requiredArg(this, C7RZ.LJLIL, "enter_from", String.class);
        this.LJLJJL = routeArgExtension.optionalArg(this, C7RT.LJLIL, "show_recommend", Boolean.class);
        C65776Prg LIZ = C65352Pkq.LIZ(BookDetailVM.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1058);
        C7RO c7ro = C7RO.INSTANCE;
        C214528bQ c214528bQ = C214528bQ.LJLIL;
        AqS61S0110000_4 LJJII = C78926UyI.LJJII(this, false);
        AqS60S0110000_3 LJJIIJZLJL = C78926UyI.LJJIIJZLJL(this, false);
        C184077Kh c184077Kh = C184077Kh.LJLIL;
        this.LJLJJLL = new C214298b3(LIZ, aqS153S0100000_3, c214528bQ, LJJII, LJJIIJZLJL, c184077Kh, c7ro, (InterfaceC65784Pro) null, 384);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(this, 1056);
        C65776Prg LIZ2 = C65352Pkq.LIZ(BookVideoListVM.class);
        C7RV c7rv = C7RV.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ = C78926UyI.LJJ(this, false);
        } else {
            LJJ = C78926UyI.LJJ(this, true);
        }
        this.LJLJL = new C214378bB(LIZ2, aqS153S0100000_32, c214528bQ, C78926UyI.LJJII(this, false), c184077Kh, c7rv, LJJ, C78926UyI.LJIILLIIL(this, true));
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ3 = C65352Pkq.LIZ(TopicReviewVM.class);
        AqS153S0100000_3 aqS153S0100000_33 = new AqS153S0100000_3(LIZ3, 1059);
        C7RS c7rs = C7RS.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS153S0100000_33, c214528bQ, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), c184077Kh, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c7rs, LIZ3);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS153S0100000_33, c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), c184077Kh, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c7rs, LIZ3);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJLJ = c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ4 = C65352Pkq.LIZ(TopicReviewListVM.class);
        AqS153S0100000_3 aqS153S0100000_34 = new AqS153S0100000_3(LIZ4, 1060);
        C7RU c7ru = C7RU.INSTANCE;
        if (o.LJ(c9be, c9bd)) {
            c214298b32 = new C214298b3(aqS153S0100000_34, c214528bQ, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), c184077Kh, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c7ru, LIZ4);
        } else if (c9be == null || o.LJ(c9be, c9be)) {
            c214298b32 = new C214298b3(aqS153S0100000_34, c214528bQ, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), c184077Kh, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c7ru, LIZ4);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJLLL = c214298b32;
        AqS153S0100000_3 aqS153S0100000_35 = new AqS153S0100000_3(this, 1061);
        C65776Prg LIZ5 = C65352Pkq.LIZ(TopicRecommendListVM.class);
        C7RP c7rp = C7RP.INSTANCE;
        if (C214368bA.LJIIIIZZ) {
            LJJ2 = C78926UyI.LJJ(this, false);
        } else {
            LJJ2 = C78926UyI.LJJ(this, true);
        }
        this.LJLL = new C214378bB(LIZ5, aqS153S0100000_35, c214528bQ, C78926UyI.LJJII(this, false), c184077Kh, c7rp, LJJ2, C78926UyI.LJIILLIIL(this, true));
        this.LJLLI = String.valueOf(System.currentTimeMillis());
    }

    public final String Al() {
        return (String) this.LJLILLLLZI.getValue();
    }

    public final TopicRecommendListVM Dl() {
        return (TopicRecommendListVM) this.LJLL.getValue();
    }

    public final TopicReviewVM Gl() {
        return (TopicReviewVM) this.LJLJLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        ((BookVideoListVM) this.LJLJL.getValue()).LJLJJI = true;
        xl().LJLJI = true;
        BookDetailVM xl = xl();
        xl.getClass();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(xl), null, null, new C199377s5(xl, null), 3);
        ((AssemSingleListViewModel) this.LJLJL.getValue()).manualListRefresh();
        ((AssemSingleListViewModel) this.LJLJLLL.getValue()).manualListRefresh();
        if (C7R7.LIZ() && o.LJ(this.LJLJJL.getValue(), Boolean.TRUE)) {
            TopicRecommendListVM Dl = Dl();
            Dl.getClass();
            XKX.LIZLLL(ViewModelKt.getViewModelScope(Dl), null, null, new C7PP(Dl, null), 3);
        }
    }

    public final BookDetailVM xl() {
        return (BookDetailVM) this.LJLJJLL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.NavActionProvider
    public final List<AbstractC234519Ih> MU() {
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return null;
        }
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_ellipsis_horizontal;
        LIZJ.LIZIZ(new AqS150S0200000_3(mo49getActivity, this, 50));
        return C47261Igj.LJJIJ(LIZJ);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C116484hg.LIZ("enter_from", "book_detail_page", "close_detail_page");
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void te0() {
        C212418Vh.LJIIJJI(xl(), new AqS169S0100000_3(this, 483));
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility
    public final void mj() {
        te0();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC55235Lm3 LIZJ = C55230Lly.LIZJ(this, null);
        C2K0 LIZ = C55096Ljo.LIZ(LIZJ, ShootAbility.class, null);
        if (LIZ == null) {
            C55096Ljo.LJIIJJI(LIZJ, this, ShootAbility.class, null);
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
                Object newProxyInstance = Proxy.newProxyInstance(ShootAbility.class.getClassLoader(), new Class[]{ShootAbility.class}, ev9);
                if (newProxyInstance != null) {
                    C55096Ljo.LJIIJJI(LIZJ, (C2K0) newProxyInstance, ShootAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.ShootAbility");
                }
            }
        }
        InterfaceC55235Lm3 LIZJ2 = C55230Lly.LIZJ(this, null);
        BookDetailVM xl = xl();
        C2K0 LIZ2 = C55096Ljo.LIZ(LIZJ2, FavoriteAbility.class, null);
        if (LIZ2 == null) {
            C55096Ljo.LJIIJJI(LIZJ2, xl, FavoriteAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler2 = Proxy.getInvocationHandler(LIZ2);
                if (invocationHandler2 instanceof EV9) {
                    ((EV9) invocationHandler2).LIZ.add(xl);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused2) {
                EV9 ev92 = new EV9();
                ev92.LIZ.add(xl);
                ev92.LIZ.add(LIZ2);
                Object newProxyInstance2 = Proxy.newProxyInstance(FavoriteAbility.class.getClassLoader(), new Class[]{FavoriteAbility.class}, ev92);
                if (newProxyInstance2 != null) {
                    C55096Ljo.LJIIJJI(LIZJ2, (C2K0) newProxyInstance2, FavoriteAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.FavoriteAbility");
                }
            }
        }
        InterfaceC55235Lm3 LIZJ3 = C55230Lly.LIZJ(this, null);
        C2K0 LIZ3 = C55096Ljo.LIZ(LIZJ3, RefreshAbility.class, null);
        if (LIZ3 == null) {
            C55096Ljo.LJIIJJI(LIZJ3, this, RefreshAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler3 = Proxy.getInvocationHandler(LIZ3);
                if (invocationHandler3 instanceof EV9) {
                    ((EV9) invocationHandler3).LIZ.add(this);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused3) {
                EV9 ev93 = new EV9();
                ev93.LIZ.add(this);
                ev93.LIZ.add(LIZ3);
                Object newProxyInstance3 = Proxy.newProxyInstance(RefreshAbility.class.getClassLoader(), new Class[]{RefreshAbility.class}, ev93);
                if (newProxyInstance3 != null) {
                    C55096Ljo.LJIIJJI(LIZJ3, (C2K0) newProxyInstance3, RefreshAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.RefreshAbility");
                }
            }
        }
        InterfaceC55235Lm3 LIZJ4 = C55230Lly.LIZJ(this, null);
        C2K0 LIZ4 = C55096Ljo.LIZ(LIZJ4, NavActionProvider.class, null);
        if (LIZ4 == null) {
            C55096Ljo.LJIIJJI(LIZJ4, this, NavActionProvider.class, null);
        } else {
            try {
                InvocationHandler invocationHandler4 = Proxy.getInvocationHandler(LIZ4);
                if (invocationHandler4 instanceof EV9) {
                    ((EV9) invocationHandler4).LIZ.add(this);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused4) {
                EV9 ev94 = new EV9();
                ev94.LIZ.add(this);
                ev94.LIZ.add(LIZ4);
                Object newProxyInstance4 = Proxy.newProxyInstance(NavActionProvider.class.getClassLoader(), new Class[]{NavActionProvider.class}, ev94);
                if (newProxyInstance4 != null) {
                    C55096Ljo.LJIIJJI(LIZJ4, (C2K0) newProxyInstance4, NavActionProvider.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.NavActionProvider");
                }
            }
        }
        InterfaceC55235Lm3 LIZJ5 = C55230Lly.LIZJ(this, null);
        C2K0 LIZ5 = C55096Ljo.LIZ(LIZJ5, DetailPageNameAbility.class, null);
        if (LIZ5 == null) {
            C55096Ljo.LJIIJJI(LIZJ5, this, DetailPageNameAbility.class, null);
        } else {
            try {
                InvocationHandler invocationHandler5 = Proxy.getInvocationHandler(LIZ5);
                if (invocationHandler5 instanceof EV9) {
                    ((EV9) invocationHandler5).LIZ.add(this);
                } else {
                    throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
                }
            } catch (IllegalArgumentException unused5) {
                EV9 ev95 = new EV9();
                ev95.LIZ.add(this);
                ev95.LIZ.add(LIZ5);
                Object newProxyInstance5 = Proxy.newProxyInstance(DetailPageNameAbility.class.getClassLoader(), new Class[]{DetailPageNameAbility.class}, ev95);
                if (newProxyInstance5 != null) {
                    C55096Ljo.LJIIJJI(LIZJ5, (C2K0) newProxyInstance5, DetailPageNameAbility.class, null);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility");
                }
            }
        }
        InterfaceC55235Lm3 LIZJ6 = C55230Lly.LIZJ(this, null);
        C2K0 LIZ6 = C55096Ljo.LIZ(LIZJ6, ViewPagerPageSelectedSubscriber.class, null);
        if (LIZ6 == null) {
            C55096Ljo.LJIIJJI(LIZJ6, this, ViewPagerPageSelectedSubscriber.class, null);
            return;
        }
        try {
            InvocationHandler invocationHandler6 = Proxy.getInvocationHandler(LIZ6);
            if (invocationHandler6 instanceof EV9) {
                ((EV9) invocationHandler6).LIZ.add(this);
                return;
            }
            throw new IllegalArgumentException("Proxy instance not create from AbilityInvokeHandler");
        } catch (IllegalArgumentException unused6) {
            EV9 ev96 = new EV9();
            ev96.LIZ.add(this);
            ev96.LIZ.add(LIZ6);
            Object newProxyInstance6 = Proxy.newProxyInstance(ViewPagerPageSelectedSubscriber.class.getClassLoader(), new Class[]{ViewPagerPageSelectedSubscriber.class}, ev96);
            if (newProxyInstance6 != null) {
                C55096Ljo.LJIIJJI(LIZJ6, (C2K0) newProxyInstance6, ViewPagerPageSelectedSubscriber.class, null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber");
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.ViewPagerPageSelectedSubscriber
    public final void cR(int i, C7S6 switchMethod) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(switchMethod, "switchMethod");
        int i2 = C7S5.LIZ[switchMethod.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (this.LJLLILLLL) {
                        str = "post_review";
                    } else {
                        str = "click";
                    }
                } else {
                    throw new C162476Zf();
                }
            } else {
                str = "slide";
            }
        } else {
            str = "enter_topic_detail";
        }
        Object value = this.LJLJJI.getValue();
        String LJJLIIIJ = C78983UzD.LJJLIIIJ(Gl().LJLILLLLZI);
        String str4 = Gl().LJLIL;
        Object obj = ((LinkedHashMap) Gl().LJLJI).get("topic_title");
        if (i == 0) {
            str2 = "videos";
        } else {
            str2 = "reviews";
        }
        Boolean valueOf = Boolean.valueOf(Gl().getState().LJLJJI);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        OSZ[] oszArr = new OSZ[8];
        oszArr[0] = new OSZ("enter_from", "topic_detail");
        oszArr[1] = new OSZ("enter_method", str);
        oszArr[2] = new OSZ("previous_page", value);
        oszArr[3] = new OSZ("category", LJJLIIIJ);
        oszArr[4] = new OSZ("topic_id", str4);
        oszArr[5] = new OSZ("topic_title", obj);
        oszArr[6] = new OSZ("tab_name", str2);
        if (valueOf != null) {
            if (valueOf.booleanValue()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
        } else {
            str3 = null;
        }
        oszArr[7] = new OSZ("is_score", str3);
        FMX.LJIIL("enter_topic_detail_tab", C113554cx.LJJLIIIJILLIZJL(C113554cx.LJJL(oszArr), linkedHashMap));
        this.LJLLILLLL = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        BookDetailVM xl = xl();
        String Al = Al();
        xl.getClass();
        o.LJIIIZ(Al, "<set-?>");
        xl.LJLIL = Al;
        BookVideoListVM bookVideoListVM = (BookVideoListVM) this.LJLJL.getValue();
        String Al2 = Al();
        o.LJIIIZ(Al2, "<set-?>");
        bookVideoListVM.LJLIL = Al2;
        BookVideoListVM bookVideoListVM2 = (BookVideoListVM) this.LJLJL.getValue();
        String str = this.LJLLI;
        o.LJIIIZ(str, "<set-?>");
        bookVideoListVM2.LJLILLLLZI = str;
        TopicReviewVM Gl = Gl();
        String Al3 = Al();
        Gl.getClass();
        o.LJIIIZ(Al3, "<set-?>");
        Gl.LJLIL = Al3;
        TopicReviewVM Gl2 = Gl();
        C7PR c7pr = C7PR.BOOK;
        Gl2.LJLILLLLZI = c7pr.getType();
        Gl().LJLJI.put("previous_page", this.LJLJJI.getValue());
        TopicReviewListVM topicReviewListVM = (TopicReviewListVM) this.LJLJLLL.getValue();
        String Al4 = Al();
        o.LJIIIZ(Al4, "<set-?>");
        topicReviewListVM.LJLIL = Al4;
        ((TopicReviewListVM) this.LJLJLLL.getValue()).LJLILLLLZI = c7pr.getType();
        ((TopicReviewListVM) this.LJLJLLL.getValue()).LJLJI.put("previous_page", this.LJLJJI.getValue());
        super.onViewCreated(view, bundle);
        C8VV.LIZ(this, false, new AqS169S0100000_3(this, 658));
        AssemViewModel.asyncSubscribe$default(xl(), new TBT() { // from class: X.7Po
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C185427Pm) obj).LJLIL;
            }
        }, null, new AqS169S0100000_3(this, 481), new AqS153S0100000_3(this, 1057), new AqS169S0100000_3(this, 482), 2, null);
        if (C7R7.LIZ() && o.LJ(this.LJLJJL.getValue(), Boolean.TRUE)) {
            TopicRecommendListVM Dl = Dl();
            Dl.getClass();
            Dl.LJLIL = c7pr;
            TopicRecommendListVM Dl2 = Dl();
            String Al5 = Al();
            Dl2.getClass();
            o.LJIIIZ(Al5, "<set-?>");
            Dl2.LJLILLLLZI = Al5;
            TopicRecommendListVM Dl3 = Dl();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("topic_recommend_list_vm");
            LIZ.append(Al());
            LIZ.append(this.LJLLI);
            String LIZIZ = X1D.LIZIZ(LIZ);
            Dl3.getClass();
            o.LJIIIZ(LIZIZ, "<set-?>");
            Dl3.LJLJI = LIZIZ;
            C8YN.LJII(this, Dl(), new TBT() { // from class: X.7PW
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C184937Np) obj).LJLILLLLZI;
                }
            }, null, new AqS185S0100000_3(this, 88), 6);
            TopicRecommendListVM Dl4 = Dl();
            Dl4.getClass();
            XKX.LIZLLL(ViewModelKt.getViewModelScope(Dl4), null, null, new C7PP(Dl4, null), 3);
        }
        BookDetailVM xl2 = xl();
        xl2.getClass();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(xl2), null, null, new C199377s5(xl2, null), 3);
        TopicReviewVM Gl3 = Gl();
        C7RQ c7rq = new TBT() { // from class: X.7RQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C186157Sh) obj).LJLJJLL;
            }
        };
        C56412MCa c56412MCa = new C56412MCa();
        c56412MCa.LIZ = true;
        C8YN.LJII(this, Gl3, c7rq, c56412MCa, new AqS185S0100000_3(this, 89), 4);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setId(R.id.bul);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.setBackgroundColor(-1);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            C10A.LIZIZ(frameLayout, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return frameLayout;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
