package X;

import Y.ARunnableS44S0100000_8;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.discover.model.SearchHorCommonData;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.discover.model.SearchUserHorizontalData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.ss.android.ugc.aweme.search.ecommerce.ECommerceGeneralSearchWidgetServiceImpl;
import com.ss.android.ugc.aweme.search.pages.result.common.core.config.SearchVideoAndUserOptimizeExperiment;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchAwemeCardForUser;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.SearchApiNew;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Ja7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49399Ja7 {
    public final ViewStub LIZ;
    public final ViewGroup LIZIZ = null;
    public final ViewGroup LIZJ;
    public LinearLayout LIZLLL;
    public C80001VaX LJ;
    public View LJFF;
    public View LJI;
    public View LJII;
    public View LJIIIIZZ;
    public JTI LJIIIZ;
    public SearchAwemeCardForUser LJIIJ;
    public C49402JaA LJIIJJI;
    public InterfaceC49419JaR LJIIL;
    public SearchUser LJIILIIL;
    public C49397Ja5 LJIILJJIL;
    public JQA LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public AqS158S0100000_8 LJIJI;
    public C49403JaB LJIJJ;

    public final void LJFF() {
        SearchUserHorizontalData searchUserHorizontalData;
        SearchHorCommonData commonData;
        List<Aweme> list;
        C49421JaT.LIZ = false;
        SearchUser searchUser = this.LJIILIIL;
        if (searchUser != null && (searchUserHorizontalData = searchUser.searchUserHorizontalData) != null && (commonData = searchUserHorizontalData.getCommonData()) != null && commonData.getHasMoreHorizontalData()) {
            SearchUser searchUser2 = this.LJIILIIL;
            if (searchUser2 == null || (list = searchUser2.awemeCards) == null || list.size() < 10) {
                View view = this.LJI;
                if (view != null) {
                    view.setVisibility(8);
                    View view2 = this.LJII;
                    if (view2 != null) {
                        view2.setVisibility(0);
                        if (o.LJ(C49424JaW.LIZ.getValue(), 1)) {
                            LJI();
                            return;
                        }
                        View view3 = this.LJIIIIZZ;
                        if (view3 == null) {
                            return;
                        }
                        view3.post(new ARunnableS44S0100000_8(this, 85));
                        return;
                    }
                    o.LJIJI("swipeForLoadingIcon");
                    throw null;
                }
                o.LJIJI("swipeForMoreHintText");
                throw null;
            }
        }
    }

    public final void LIZJ() {
        SearchUser searchUser;
        if (C34082DZe.LJLILLLLZI.LJJII() && ((searchUser = this.LJIILIIL) == null || searchUser.playlists == null)) {
            return;
        }
        this.LJIILLIIL = true;
        LinearLayout linearLayout = this.LIZLLL;
        if (linearLayout != null) {
            C49402JaA c49402JaA = new C49402JaA(linearLayout);
            LinearLayout linearLayout2 = this.LIZLLL;
            if (linearLayout2 != null) {
                View it = c49402JaA.LJI;
                if (it == null) {
                    MG8 LJJII = MixFeedService.LJJIJIIJIL().LJJII(linearLayout, false, true, "general_search", c49402JaA.LJII);
                    if ((LJJII instanceof InterfaceC49416JaO) && LJJII != null) {
                        c49402JaA.LJFF = LJJII;
                        it = LJJII.itemView;
                        c49402JaA.LJI = it;
                        o.LJIIIIZZ(it, "it");
                    } else {
                        throw new IllegalStateException("Unknown playlist view holder");
                    }
                }
                linearLayout2.addView(it, 0);
                this.LJIIJJI = c49402JaA;
                C49397Ja5 c49397Ja5 = this.LJIILJJIL;
                JQA jqa = this.LJIILL;
                c49402JaA.LJ = c49397Ja5;
                c49402JaA.LIZLLL = jqa;
                c49402JaA.LIZ(this.LJIILIIL);
                return;
            }
            o.LJIJI("rootView");
            throw null;
        }
        o.LJIJI("rootView");
        throw null;
    }

    public final void LIZLLL() {
        View view;
        SearchUser searchUser;
        ProductGroup productGroup;
        if (C34082DZe.LJLILLLLZI.LJJII()) {
            C49410JaI.LIZ.getClass();
            if (!C49410JaI.LIZ() || (searchUser = this.LJIILIIL) == null || (productGroup = searchUser.productGroup) == null || !o.LJ(productGroup.showEntrance, Boolean.TRUE)) {
                return;
            }
        }
        if (this.LIZLLL != null) {
            this.LJIIZILJ = true;
            C78927UyJ LIZ = ECommerceGeneralSearchWidgetServiceImpl.LIZJ().LIZ();
            if (LIZ != null) {
                LinearLayout linearLayout = this.LIZLLL;
                View view2 = null;
                if (linearLayout != null) {
                    InterfaceC49419JaR searchShowcaseEntranceView = LIZ.getSearchShowcaseEntranceView(linearLayout);
                    C49098JOs.LIZ.getClass();
                    int LJFF = C49098JOs.LJFF();
                    C49430Jac c49430Jac = (C49430Jac) searchShowcaseEntranceView;
                    c49430Jac.LIZLLL = this.LJIJJ;
                    if (LJFF > 0 && (view = c49430Jac.LIZJ) != null) {
                        C26338AVi.LJI(view, AnonymousClass391.LIZJ(LJFF), null, AnonymousClass391.LIZJ(LJFF), null, false, 26);
                    }
                    LinearLayout linearLayout2 = this.LIZLLL;
                    if (linearLayout2 != null) {
                        View view3 = c49430Jac.LIZJ;
                        if (view3 instanceof View) {
                            view2 = view3;
                        }
                        linearLayout2.addView(view2, 0);
                        this.LJIIL = searchShowcaseEntranceView;
                        searchShowcaseEntranceView.bindData(this.LJIILIIL);
                        return;
                    }
                    o.LJIJI("rootView");
                    throw null;
                }
                o.LJIJI("rootView");
                throw null;
            }
        }
    }

    public final void LJ() {
        SearchAwemeCardForUser searchAwemeCardForUser;
        RecyclerView recyclerView;
        Integer num;
        Integer num2;
        RecyclerView recyclerView2;
        String str;
        if (this.LJIIIZ != null) {
            return;
        }
        this.LJIJ = true;
        LinearLayout linearLayout = this.LIZLLL;
        if (linearLayout != null) {
            this.LJIIIIZZ = linearLayout.findViewById(R.id.n15);
            LinearLayout linearLayout2 = this.LIZLLL;
            if (linearLayout2 != null) {
                View findViewById = linearLayout2.findViewById(R.id.a04);
                o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.aladdin_scroll_layout)");
                this.LJ = (C80001VaX) findViewById;
                LinearLayout linearLayout3 = this.LIZLLL;
                if (linearLayout3 != null) {
                    View findViewById2 = linearLayout3.findViewById(R.id.a05);
                    o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.…addin_scroll_more_layout)");
                    this.LJFF = findViewById2;
                    LinearLayout linearLayout4 = this.LIZLLL;
                    if (linearLayout4 != null) {
                        View findViewById3 = linearLayout4.findViewById(R.id.a07);
                        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.…ddin_swipe_for_more_text)");
                        this.LJI = findViewById3;
                        LinearLayout linearLayout5 = this.LIZLLL;
                        if (linearLayout5 != null) {
                            View findViewById4 = linearLayout5.findViewById(R.id.g8l);
                            o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.loading_icon)");
                            this.LJII = findViewById4;
                            LinearLayout linearLayout6 = this.LIZLLL;
                            if (linearLayout6 != null) {
                                JTI jti = new JTI(linearLayout6);
                                this.LJIIIZ = jti;
                                if (this.LJIILIIL.cardType() == 1) {
                                    searchAwemeCardForUser = new SearchAwemeCardForUser(jti);
                                } else {
                                    searchAwemeCardForUser = null;
                                }
                                if (!(searchAwemeCardForUser instanceof SearchAwemeCardForUser)) {
                                    searchAwemeCardForUser = null;
                                }
                                this.LJIIJ = searchAwemeCardForUser;
                                if (searchAwemeCardForUser != null) {
                                    JQA jqa = this.LJIILL;
                                    if (jqa != null) {
                                        str = jqa.LJJIIJZLJL;
                                    } else {
                                        str = null;
                                    }
                                    searchAwemeCardForUser.LJLLJ = str;
                                }
                                JTI jti2 = this.LJIIIZ;
                                if (jti2 != null && (recyclerView2 = jti2.LJLILLLLZI) != null) {
                                    C26338AVi.LJIIIZ(recyclerView2, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), null, 27);
                                }
                                C49098JOs.LIZ.getClass();
                                Integer valueOf = Integer.valueOf(C49098JOs.LJFF());
                                if (valueOf.intValue() > 0) {
                                    int intValue = valueOf.intValue();
                                    JTI jti3 = this.LJIIIZ;
                                    if (jti3 != null && (recyclerView = jti3.LJLILLLLZI) != null) {
                                        Integer valueOf2 = Integer.valueOf(C49098JOs.LJ());
                                        int intValue2 = valueOf2.intValue();
                                        if (intValue2 > 0 && intValue - intValue2 > 0) {
                                            num = Integer.valueOf(intValue - valueOf2.intValue());
                                        } else {
                                            num = null;
                                        }
                                        Integer LIZJ = AnonymousClass391.LIZJ(intValue);
                                        if (num != null) {
                                            num2 = C1FJ.LIZIZ(num);
                                        } else {
                                            num2 = null;
                                        }
                                        C26338AVi.LJIIIZ(recyclerView, LIZJ, null, num2, null, 26);
                                    }
                                }
                                View view = this.LJFF;
                                if (view != null) {
                                    view.setVisibility(0);
                                    C49421JaT.LIZJ = false;
                                    C80001VaX c80001VaX = this.LJ;
                                    if (c80001VaX != null) {
                                        c80001VaX.setEnable(true);
                                        c80001VaX.setOnScrollToEndListener(new AqS158S0100000_8(this, 484));
                                        c80001VaX.setOnScrollThresholdHitListener(C49405JaD.LJLIL);
                                        c80001VaX.setOnNestedScrollAcceptedListener(C49406JaE.LJLIL);
                                        return;
                                    }
                                    o.LJIJI("customScrollLayout");
                                    throw null;
                                }
                                o.LJIJI("swipeForMoreHintLayout");
                                throw null;
                            }
                            o.LJIJI("rootView");
                            throw null;
                        }
                        o.LJIJI("rootView");
                        throw null;
                    }
                    o.LJIJI("rootView");
                    throw null;
                }
                o.LJIJI("rootView");
                throw null;
            }
            o.LJIJI("rootView");
            throw null;
        }
        o.LJIJI("rootView");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [android.graphics.Rect, T] */
    public final void LJI() {
        String str;
        String str2;
        String str3;
        AbstractC73672Svk horizontalLoadmore;
        SearchUserHorizontalData searchUserHorizontalData;
        JQA jqa = this.LJIILL;
        if (jqa == null || (str = jqa.LJII) == null) {
            str = "";
        }
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        View view = this.LJIIIIZZ;
        c50651JuJ.getClass();
        C50321Joz LIZLLL = C50651JuJ.LIZLLL(view);
        if (LIZLLL == null || (str2 = LIZLLL.getSearchKeyword()) == null) {
            str2 = "";
        }
        SearchUser searchUser = this.LJIILIIL;
        View view2 = this.LJI;
        if (view2 != null) {
            View view3 = this.LJII;
            if (view3 != null) {
                C80001VaX c80001VaX = this.LJ;
                if (c80001VaX != null) {
                    int i = C49421JaT.LIZLLL;
                    AqS190S0100000_8 aqS190S0100000_8 = new AqS190S0100000_8(this, 53);
                    try {
                        C49421JaT.LIZIZ = System.currentTimeMillis();
                        C49421JaT.LIZJ = true;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "rotation", 0.0f, 180.0f, 360.0f);
                        ofFloat.setRepeatMode(1);
                        ofFloat.setRepeatCount(-1);
                        ofFloat.setInterpolator(new LinearInterpolator());
                        ofFloat.setDuration(1500L);
                        ofFloat.start();
                        SearchApiNew.RealApi LIZ = SearchApiNew.LIZ();
                        C68322mC c68322mC = new C68322mC();
                        c68322mC.element = new Rect();
                        if (searchUser == null || (searchUserHorizontalData = searchUser.searchUserHorizontalData) == null || (str3 = searchUserHorizontalData.getBacktrace()) == null) {
                            str3 = "";
                        }
                        horizontalLoadmore = LIZ.horizontalLoadmore(str, str2, str3, str, "", 0L, null);
                        AbstractC73638SvC.LJIIZILJ(horizontalLoadmore).LJJIIJ(T16.LIZ()).LJIJJ(T16.LIZ()).LIZ(new C49408JaG(str, searchUser, ofFloat, view3, c68322mC, c80001VaX, aqS190S0100000_8, i, view2));
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                o.LJIJI("customScrollLayout");
                throw null;
            }
            o.LJIJI("swipeForLoadingIcon");
            throw null;
        }
        o.LJIJI("swipeForMoreHintText");
        throw null;
    }

    public final void LJII() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        JTI jti = this.LJIIIZ;
        if (jti != null && (recyclerView2 = jti.LJLILLLLZI) != null) {
            recyclerView2.LJLI(0);
        }
        C49402JaA c49402JaA = this.LJIIJJI;
        View view = null;
        if (c49402JaA != null) {
            view = c49402JaA.LJI;
        }
        if ((view instanceof RecyclerView) && (recyclerView = (RecyclerView) view) != null) {
            recyclerView.LJLI(0);
        }
    }

    public final void LJIIIIZZ() {
        LinearLayout linearLayout = this.LIZLLL;
        if (linearLayout != null) {
            C79043V0l.LJJIIZI(linearLayout);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.discover.model.SearchUser r13) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49399Ja7.LIZ(com.ss.android.ugc.aweme.discover.model.SearchUser):void");
    }

    public final void LIZIZ(SearchUser searchUser) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        View LLLLIILL;
        LinearLayout linearLayout5;
        if (C34082DZe.LJLILLLLZI.LJJII()) {
            this.LJIILIIL = searchUser;
            if (this.LIZLLL == null) {
                if (this.LIZIZ != null) {
                    if (((SearchVideoAndUserOptimizeExperiment.OptimizeConfig) SearchVideoAndUserOptimizeExperiment.LIZIZ.getValue()).userLayoutOptimize) {
                        LLLLIILL = C50365Jph.LIZIZ(R.layout.cj3, this.LIZIZ);
                    } else {
                        LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZIZ.getContext()), R.layout.cj3, this.LIZIZ, false);
                    }
                    if ((LLLLIILL instanceof LinearLayout) && (linearLayout5 = (LinearLayout) LLLLIILL) != null) {
                        this.LIZLLL = linearLayout5;
                    } else {
                        throw new IllegalArgumentException("View configuration error");
                    }
                } else if (this.LIZ != null) {
                    if (((SearchVideoAndUserOptimizeExperiment.OptimizeConfig) SearchVideoAndUserOptimizeExperiment.LIZIZ.getValue()).userLayoutOptimize) {
                        ViewParent parent = this.LIZ.getParent();
                        o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        View LIZIZ = C50365Jph.LIZIZ(R.layout.cj3, (ViewGroup) parent);
                        if ((LIZIZ instanceof LinearLayout) && (linearLayout4 = (LinearLayout) LIZIZ) != null) {
                            this.LIZLLL = linearLayout4;
                            ViewGroup viewGroup = this.LIZJ;
                            if (viewGroup != null) {
                                viewGroup.addView(linearLayout4, -1, -2);
                            }
                        } else {
                            throw new IllegalArgumentException("View configuration error");
                        }
                    } else {
                        this.LIZ.setLayoutResource(R.layout.cj3);
                        View inflate = this.LIZ.inflate();
                        if ((inflate instanceof LinearLayout) && (linearLayout3 = (LinearLayout) inflate) != null) {
                            this.LIZLLL = linearLayout3;
                        } else {
                            throw new IllegalArgumentException("ViewStub configuration error");
                        }
                    }
                }
            }
            if (!this.LJIJ) {
                LJ();
            }
            if (!this.LJIILLIIL) {
                LIZJ();
            }
            if (!this.LJIIZILJ) {
                LIZLLL();
                return;
            }
            return;
        }
        this.LJIILIIL = searchUser;
        if (this.LIZLLL != null) {
            return;
        }
        ViewGroup viewGroup2 = this.LIZIZ;
        if (viewGroup2 != null) {
            View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup2.getContext()), R.layout.cj3, this.LIZIZ, false);
            if ((LLLLIILL2 instanceof LinearLayout) && (linearLayout2 = (LinearLayout) LLLLIILL2) != null) {
                this.LIZLLL = linearLayout2;
            } else {
                throw new IllegalArgumentException("View configuration error");
            }
        } else {
            ViewStub viewStub = this.LIZ;
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.cj3);
                View inflate2 = this.LIZ.inflate();
                if ((inflate2 instanceof LinearLayout) && (linearLayout = (LinearLayout) inflate2) != null) {
                    this.LIZLLL = linearLayout;
                } else {
                    throw new IllegalArgumentException("ViewStub configuration error");
                }
            }
        }
        LJ();
        LIZJ();
        LIZLLL();
    }

    public C49399Ja7(ViewStub viewStub, ViewGroup viewGroup) {
        this.LIZ = viewStub;
        this.LIZJ = viewGroup;
    }
}
