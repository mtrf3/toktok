package com.ss.android.ugc.aweme.sticker.view.internal.main;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass974;
import X.C16880lQ;
import X.C2067989r;
import X.C221108m2;
import X.C28289B8j;
import X.C29S;
import X.C30581Hy;
import X.C47261Igj;
import X.C48841JEv;
import X.C62562cu;
import X.C62822Ol8;
import X.C64962gm;
import X.C72434Sbm;
import X.C73296Spg;
import X.C73318Sq2;
import X.C73426Srm;
import X.C73674Svm;
import X.C73683Svv;
import X.C73893SzJ;
import X.C73982T1u;
import X.C74371TGt;
import X.C74372TGu;
import X.C74409TIf;
import X.C74453TJx;
import X.C76800UCe;
import X.C78613UtF;
import X.C80700Vlo;
import X.C81184Vtc;
import X.C82894Wg6;
import X.C87277YNd;
import X.EnumC74379THb;
import X.IA2;
import X.InterfaceC88472Yns;
import X.LDP;
import X.OSZ;
import X.SIZ;
import X.T2R;
import X.TEJ;
import X.TF1;
import X.TF5;
import X.TG1;
import X.TG3;
import X.TG5;
import X.TG7;
import X.TG8;
import X.TG9;
import X.TGD;
import X.TGG;
import X.TGH;
import X.TGJ;
import X.TGK;
import X.TGL;
import X.TGN;
import X.TGR;
import X.TGS;
import X.TGT;
import X.TGV;
import X.TGX;
import X.TGY;
import X.TGZ;
import X.TH5;
import X.THZ;
import X.W5F;
import X.W5U;
import Y.ACListenerS32S0100000_12;
import Y.AObserverS75S0200000_12;
import Y.AObserverS80S0100000_12;
import Y.AfS51S0300000_12;
import Y.AfS61S0200000_12;
import Y.AfS64S0100000_12;
import Y.IDTListenerS120S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer;
import com.ss.android.ugc.aweme.views.IDlS19S0200000_12;
import com.ss.android.ugc.aweme.views.IDlS64S0100000_12;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS101S0300000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class AbstractStickerView implements GenericLifecycleObserver, TGH {
    public final FragmentManager LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public ViewGroup LJLJI;
    public View LJLJJI;
    public ViewGroup LJLJJL;
    public View LJLJJLL;
    public TGZ LJLJL;
    public ViewGroup LJLJLJ;
    public C80700Vlo LJLJLLL;
    public C74409TIf LJLL;
    public C74371TGt LJLLI;
    public C2067989r LJLLILLLL;
    public ViewGroup LJLLJ;
    public SearchStickerViewContainer LJLLL;
    public TG8 LJLLLL;
    public int LJLLLLLL;
    public final C73318Sq2 LJLZ;
    public boolean LJZ;
    public long LJZI;
    public final C73893SzJ<TG1> LJZL;
    public final C73893SzJ LL;
    public final C73893SzJ<Integer> LLD;
    public final C64962gm LLF;
    public boolean LLFF;
    public C73296Spg LLFFF;
    public boolean LLFII;
    public final ActivityC45651qj LLFZ;
    public final ViewGroup LLI;
    public final LifecycleOwner LLIFFJFJJ;
    public final TF5 LLII;
    public final TEJ LLIIII;
    public final TGR LLIIIILZ;
    public final TGD LLIIIJ;
    public final TGN LLIIIL;
    public final boolean LLIIIZ;
    public final TF1 LLIIJI;

    public final TGS LJ() {
        return (TGS) this.LJLILLLLZI.getValue();
    }

    public abstract TH5 LJIIJ(ViewGroup viewGroup);

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            destroy$feature_effect_record_release();
        }
    }

    @Override // X.TGO
    public final List<TGT> LIZ() {
        TG8 tg8 = this.LJLLLL;
        if (tg8 != null) {
            return tg8.LJLIL;
        }
        o.LJIJI("stickerBarViewController");
        throw null;
    }

    public final void LIZLLL() {
        AbstractC73672Svk<OSZ<Integer, Integer>> abstractC73672Svk;
        boolean z;
        if (this.LJLJL != null) {
            return;
        }
        ViewGroup viewGroup = this.LJLJI;
        if (viewGroup != null) {
            LJI(viewGroup);
            ViewGroup viewGroup2 = this.LJLJI;
            if (viewGroup2 != null) {
                TH5 LJIIJ = LJIIJ(viewGroup2);
                C73426Srm LIZIZ = LJIIJ.LIZIZ();
                AfS64S0100000_12 afS64S0100000_12 = new AfS64S0100000_12(this, 109);
                C73683Svv c73683Svv = C73674Svm.LJ;
                this.LJLZ.LIZ(LIZIZ.LJJJLIIL(afS64S0100000_12, c73683Svv));
                this.LJLZ.LIZ(LJIIJ.LIZJ().LJJJLIIL(new AfS64S0100000_12(this, 110), c73683Svv));
                this.LJLZ.LIZ(LJIIJ.yg().LJJJLIIL(new AfS64S0100000_12(this, 111), C73982T1u.LJLIL));
                this.LJLJL = LJIIJ;
                ViewGroup viewGroup3 = this.LJLJI;
                if (viewGroup3 != null) {
                    View findViewById = viewGroup3.findViewById(R.id.kkd);
                    o.LJIIIIZZ(findViewById, "content.findViewById(R.id.sticker_touch_outside)");
                    findViewById.setOnTouchListener(new IDTListenerS120S0100000_12(new AqS162S0100000_12(this, 1127), 10));
                    ViewGroup viewGroup4 = this.LJLJI;
                    if (viewGroup4 != null) {
                        TGN tgn = this.LLIIIL;
                        ViewGroup viewGroup5 = this.LJLJLJ;
                        if (viewGroup5 != null) {
                            TGJ LIZJ = tgn.LIZJ(viewGroup5);
                            if (LIZJ == null) {
                                View findViewById2 = viewGroup4.findViewById(R.id.ej3);
                                o.LJIIIIZZ(findViewById2, "content.findViewById(R.id.img_clear_sticker)");
                                LIZJ = new TGJ(findViewById2);
                            }
                            LIZJ.LIZ(new ACListenerS32S0100000_12(this, 160));
                            C74372TGu c74372TGu = this.LLIIIJ.LJLJI;
                            if (c74372TGu != null) {
                                Effect LLJJIJIIJIL = this.LLII.LIZ.LLJJIJIIJIL();
                                if (LLJJIJIIJIL != null && LLJJIJIIJIL.getTypes() != null && LLJJIJIIJIL.getTypes().contains("AR")) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                boolean z2 = !z;
                                ViewGroup viewGroup6 = this.LJLJI;
                                if (viewGroup6 != null) {
                                    View findViewById3 = viewGroup6.findViewById(R.id.fh8);
                                    o.LJIIIIZZ(findViewById3, "content.findViewById(R.id.layout_camera_icon)");
                                    this.LJLLI = new C74371TGt((ViewGroup) findViewById3, c74372TGu, z2);
                                } else {
                                    o.LJIJI("content");
                                    throw null;
                                }
                            }
                            int i = this.LLIIIJ.LJLJL;
                            if (i == 1 || i == 2) {
                                ViewGroup viewGroup7 = this.LJLJI;
                                if (viewGroup7 != null) {
                                    View findViewById4 = viewGroup7.findViewById(R.id.fmg);
                                    if (findViewById4 != null) {
                                        int i2 = this.LLIIIJ.LJLJL;
                                        View view = this.LJLJJLL;
                                        if (view != null) {
                                            ViewGroup viewGroup8 = this.LJLLJ;
                                            if (viewGroup8 != null) {
                                                AnonymousClass974 anonymousClass974 = new AnonymousClass974(i2, findViewById4, view, viewGroup8);
                                                ActivityC45651qj activityC45651qj = this.LLFZ;
                                                ViewGroup viewGroup9 = this.LJLJI;
                                                if (viewGroup9 != null) {
                                                    SearchStickerViewContainer LJ = anonymousClass974.LJ(activityC45651qj, viewGroup9, this.LLII, this.LLIIII, this.LLIIJI, this.LLIIIJ);
                                                    anonymousClass974.LJII(LJ.LJ());
                                                    this.LJLZ.LIZ(LJ.LJII().LJJJJZI(new AfS61S0200000_12(this, anonymousClass974, 12)));
                                                    this.LJLZ.LIZ(LJ.LIZ().LJJJJZI(new AfS64S0100000_12(this, 112)));
                                                    this.LJLZ.LIZ(Rc().LJJJJZI(new AfS51S0300000_12(this, LJ, anonymousClass974, 5)));
                                                    this.LJLLL = LJ;
                                                    int LJFF = LJFF();
                                                    if (LJFF >= 0 && (abstractC73672Svk = this.LLIIII.LJI) != null) {
                                                        this.LJLZ.LIZ(abstractC73672Svk.LJJJJZI(new TG5(this, LJFF)));
                                                    }
                                                    this.LLIIJI.Cr().observe(this.LLIFFJFJJ, new AObserverS80S0100000_12(this, 92));
                                                } else {
                                                    o.LJIJI("content");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("stickerViewContainer");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("stickerView");
                                            throw null;
                                        }
                                    }
                                } else {
                                    o.LJIJI("content");
                                    throw null;
                                }
                            }
                            C82894Wg6 c82894Wg6 = C82894Wg6.LIZIZ;
                            if (c82894Wg6.LIZJ().LIZJ()) {
                                ViewGroup viewGroup10 = this.LJLJI;
                                if (viewGroup10 != null) {
                                    ViewGroup viewGroup11 = (ViewGroup) viewGroup10.findViewById(R.id.fnr);
                                    ViewGroup viewGroup12 = this.LJLJI;
                                    if (viewGroup12 != null) {
                                        Context context = viewGroup12.getContext();
                                        o.LJIIIIZZ(context, "content.context");
                                        C73296Spg c73296Spg = new C73296Spg(context, null);
                                        c73296Spg.setId(R.id.kip);
                                        C87277YNd.LJJIJIIJI(c73296Spg, false);
                                        viewGroup11.addView(c73296Spg, -1, -1);
                                        this.LLFFF = c73296Spg;
                                    } else {
                                        o.LJIJI("content");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("content");
                                    throw null;
                                }
                            }
                            ViewGroup viewGroup13 = this.LJLJI;
                            if (viewGroup13 != null) {
                                FrameLayout container = (FrameLayout) viewGroup13.findViewById(R.id.fnr);
                                o.LJIIIIZZ(container, "container");
                                C2067989r c2067989r = new C2067989r(container, this.LLIIIJ.LJLLI.LJLIL);
                                if (c82894Wg6.LIZJ().LIZJ()) {
                                    c2067989r.show(false);
                                }
                                C74453TJx.LIZ(LJ().getPageState(), this.LLF, TGK.LJLIL, TGL.LJLIL).observe(this.LLIFFJFJJ, new AObserverS75S0200000_12(c2067989r, this, 38));
                                C16880lQ.LJIIJ(new ACListenerS32S0100000_12(new AqS162S0100000_12(this, 1126), 161), c2067989r.LIZIZ);
                                this.LJLLILLLL = c2067989r;
                                LJIIIZ();
                                LJ().Zj().observe(this.LLIFFJFJJ, new AObserverS80S0100000_12(this, 91));
                                return;
                            }
                            o.LJIJI("content");
                            throw null;
                        }
                        o.LJIJI("tabBarLayout");
                        throw null;
                    }
                    o.LJIJI("content");
                    throw null;
                }
                o.LJIJI("content");
                throw null;
            }
            o.LJIJI("content");
            throw null;
        }
        o.LJIJI("content");
        throw null;
    }

    public final int LJFF() {
        int i = 0;
        for (Object obj : C30581Hy.LJIILJJIL(this.LLII.LIZ.LJJJJLL().LIZ())) {
            int i2 = i + 1;
            if (i >= 0) {
                if (o.LJ(((EffectCategoryModel) obj).getKey(), "sticker_category:search")) {
                    return i;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return -1;
    }

    public final AbstractC73672Svk<Boolean> LJII() {
        C73893SzJ c73893SzJ = this.LL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public final AbstractC73672Svk<TG1> LJIIIIZZ() {
        C73893SzJ<TG1> c73893SzJ = this.LJZL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public final void LJIIIZ() {
        if (this.LJZ) {
            return;
        }
        this.LJZ = true;
        C73893SzJ<TG1> c73893SzJ = this.LJZL;
        ViewGroup viewGroup = this.LJLJI;
        if (viewGroup != null) {
            c73893SzJ.onNext(new TG3(viewGroup));
        } else {
            o.LJIJI("content");
            throw null;
        }
    }

    @Override // X.TGH
    public final void Mi() {
        ViewGroup viewGroup = this.LJLJI;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.fk5);
            o.LJIIIIZZ(findViewById, "content.findViewById(R.i…ayout_panel_sticker_info)");
            findViewById.setVisibility(8);
            View view = this.LJLJJLL;
            if (view != null) {
                view.getLayoutParams().height = -2;
                View findViewById2 = view.findViewById(R.id.kyg);
                o.LJIIIIZZ(findViewById2, "findViewById<StyleView>(R.id.tab_divider)");
                findViewById2.setVisibility(0);
                return;
            }
            o.LJIJI("stickerView");
            throw null;
        }
        o.LJIJI("content");
        throw null;
    }

    @Override // X.TGH
    public final AbstractC73672Svk<THZ> Rc() {
        C74409TIf c74409TIf = this.LJLL;
        if (c74409TIf != null) {
            return c74409TIf.LIZLLL();
        }
        o.LJIJI("transitionView");
        throw null;
    }

    @Override // X.TGH
    public final ViewGroup Uh() {
        ViewGroup viewGroup = this.LJLJI;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("content");
        throw null;
    }

    @Override // X.TGH
    public final void Z8() {
        SearchStickerViewContainer searchStickerViewContainer = this.LJLLL;
        if (searchStickerViewContainer != null) {
            searchStickerViewContainer.LJIIJJI();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy$feature_effect_record_release() {
        this.LJLZ.LIZLLL();
        C48841JEv.LIZJ(this.LLF, null);
    }

    @Override // X.TGH
    public final void hide() {
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LLIIIJ.LJLLI.LLFF;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.FALSE);
        }
        if (this.LLIIIZ) {
            C74409TIf c74409TIf = this.LJLL;
            if (c74409TIf != null) {
                c74409TIf.LIZIZ();
                return;
            } else {
                o.LJIJI("transitionView");
                throw null;
            }
        }
        C74409TIf c74409TIf2 = this.LJLL;
        if (c74409TIf2 != null) {
            c74409TIf2.LIZJ();
        } else {
            o.LJIJI("transitionView");
            throw null;
        }
    }

    @Override // X.TGH
    public final boolean isShowing() {
        C74409TIf c74409TIf = this.LJLL;
        if (c74409TIf != null) {
            EnumC74379THb enumC74379THb = c74409TIf.LIZJ;
            if (enumC74379THb == EnumC74379THb.SHOWING || enumC74379THb == EnumC74379THb.SHOWN) {
                return true;
            }
            return false;
        }
        o.LJIJI("transitionView");
        throw null;
    }

    @Override // X.TGH
    public final void show() {
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LLIIIJ.LJLLI.LLFF;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.TRUE);
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.LJZI = currentTimeMillis;
        this.LLII.LIZ.LJJJJL(currentTimeMillis);
        LIZLLL();
        if (this.LLIIIZ) {
            C74409TIf c74409TIf = this.LJLL;
            if (c74409TIf != null) {
                c74409TIf.LJ();
            } else {
                o.LJIJI("transitionView");
                throw null;
            }
        } else {
            C74409TIf c74409TIf2 = this.LJLL;
            if (c74409TIf2 != null) {
                c74409TIf2.LJFF();
            } else {
                o.LJIJI("transitionView");
                throw null;
            }
        }
        C74371TGt c74371TGt = this.LJLLI;
        if (c74371TGt == null || !c74371TGt.LJIIIZ || c74371TGt.LIZ.getBoolean("has_shown_dialog", false)) {
            return;
        }
        c74371TGt.getClass();
    }

    @Override // X.TGQ
    public final AbstractC73672Svk<Integer> yg() {
        C73893SzJ<Integer> c73893SzJ = this.LLD;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.TGH
    public final TGV Kj() {
        return this.LJLLL;
    }

    @Override // X.TGH
    public final View cb() {
        return this.LJLJJI;
    }

    @Override // X.TGH
    public final void prepare() {
        LJIIIZ();
    }

    public static final /* synthetic */ TG8 LIZJ(AbstractStickerView abstractStickerView) {
        TG8 tg8 = abstractStickerView.LJLLLL;
        if (tg8 != null) {
            return tg8;
        }
        o.LJIJI("stickerBarViewController");
        throw null;
    }

    @Override // X.TGW
    public final void Hc(int i) {
        LIZLLL();
        TGZ tgz = this.LJLJL;
        if (tgz != null) {
            tgz.Hc(i);
        } else {
            o.LJIJI("tabListView");
            throw null;
        }
    }

    @Override // X.TGO
    public final void LIZIZ(TGT stickerBarView) {
        o.LJIIIZ(stickerBarView, "stickerBarView");
        TG8 tg8 = this.LJLLLL;
        if (tg8 != null) {
            tg8.LIZIZ(stickerBarView);
        } else {
            o.LJIJI("stickerBarViewController");
            throw null;
        }
    }

    public void LJI(ViewGroup content) {
        o.LJIIIZ(content, "content");
        ViewGroup viewGroup = (ViewGroup) content.findViewById(R.id.fmq);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(content.getContext()), this.LLIIIL.LJ(), viewGroup, false);
        if (LLLLIILL != null) {
            ViewGroup viewGroup2 = (ViewGroup) LLLLIILL;
            this.LJLJLJ = viewGroup2;
            viewGroup.addView(viewGroup2);
            TGN tgn = this.LLIIIL;
            ViewGroup viewGroup3 = this.LJLJLJ;
            if (viewGroup3 != null) {
                this.LJLJLLL = tgn.LIZ(viewGroup3);
                if (this.LLIIIJ.LJLZ) {
                    Context context = content.getContext();
                    o.LJIIIIZZ(context, "content.context");
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f3);
                    C80700Vlo c80700Vlo = this.LJLJLLL;
                    if (c80700Vlo != null) {
                        c80700Vlo.setHorizontalFadingEdgeEnabled(true);
                        C80700Vlo c80700Vlo2 = this.LJLJLLL;
                        if (c80700Vlo2 != null) {
                            Context context2 = content.getContext();
                            o.LJIIIIZZ(context2, "content.context");
                            c80700Vlo2.setFadingEdgeLength(context2.getResources().getDimensionPixelSize(R.dimen.et));
                            C80700Vlo c80700Vlo3 = this.LJLJLLL;
                            if (c80700Vlo3 != null) {
                                c80700Vlo3.setTabMarginByPixel(dimensionPixelSize);
                                View findViewById = content.findViewById(R.id.ej3);
                                if (findViewById != null) {
                                    findViewById.setPadding(0, 0, 0, 0);
                                    ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                                    if (layoutParams != null) {
                                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                        Context context3 = content.getContext();
                                        o.LJIIIIZZ(context3, "content.context");
                                        int dimensionPixelSize2 = context3.getResources().getDimensionPixelSize(R.dimen.ew);
                                        marginLayoutParams.setMargins(dimensionPixelSize2 * 2, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2);
                                        Context context4 = content.getContext();
                                        o.LJIIIIZZ(context4, "content.context");
                                        marginLayoutParams.height = context4.getResources().getDimensionPixelSize(R.dimen.ei);
                                        Context context5 = content.getContext();
                                        o.LJIIIIZZ(context5, "content.context");
                                        marginLayoutParams.width = context5.getResources().getDimensionPixelSize(R.dimen.ei);
                                        findViewById.setLayoutParams(marginLayoutParams);
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    }
                                }
                                View findViewById2 = content.findViewById(R.id.fmi);
                                if (findViewById2 != null) {
                                    ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                                    Context context6 = findViewById2.getContext();
                                    o.LJIIIIZZ(context6, "it.context");
                                    layoutParams2.height = context6.getResources().getDimensionPixelSize(R.dimen.f1);
                                    findViewById2.setLayoutParams(layoutParams2);
                                }
                                View findViewById3 = content.findViewById(R.id.kz7);
                                if (findViewById3 != null) {
                                    findViewById3.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            o.LJIJI("tabLayout");
                            throw null;
                        }
                        o.LJIJI("tabLayout");
                        throw null;
                    }
                    o.LJIJI("tabLayout");
                    throw null;
                }
                return;
            }
            o.LJIJI("tabBarLayout");
            throw null;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    @Override // X.TGH
    public final void bb(boolean z) {
        TG8 tg8 = this.LJLLLL;
        if (tg8 != null) {
            tg8.bb(false);
        } else {
            o.LJIJI("stickerBarViewController");
            throw null;
        }
    }

    @Override // X.TGW
    public final void d9(List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> list) {
        o.LJIIIZ(list, "list");
        LIZLLL();
        TGZ tgz = this.LJLJL;
        if (tgz != null) {
            tgz.d9(list);
        } else {
            o.LJIJI("tabListView");
            throw null;
        }
    }

    @Override // X.TGH
    public final void B0(String stickerName, AqS159S0200000_12 aqS159S0200000_12) {
        o.LJIIIZ(stickerName, "stickerName");
        View view = this.LJLJJLL;
        if (view != null) {
            view.getLayoutParams().height = view.getMeasuredHeight();
            View findViewById = view.findViewById(R.id.kyg);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            ViewGroup viewGroup = this.LJLJI;
            if (viewGroup != null) {
                View findViewById2 = viewGroup.findViewById(R.id.fk5);
                o.LJIIIIZZ(findViewById2, "content.findViewById(R.i…ayout_panel_sticker_info)");
                findViewById2.setVisibility(0);
                TextView textView = (TextView) findViewById2.findViewById(R.id.fm9);
                if (textView != null) {
                    textView.setText(stickerName);
                }
                ImageView imageView = (ImageView) findViewById2.findViewById(R.id.fm8);
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                View findViewById3 = findViewById2.findViewById(R.id.fm7);
                if (findViewById3 != null) {
                    findViewById3.setVisibility(8);
                }
                C16880lQ.LJIIJ(new IDlS64S0100000_12(aqS159S0200000_12, 3), findViewById2);
                return;
            }
            o.LJIJI("content");
            throw null;
        }
        o.LJIJI("stickerView");
        throw null;
    }

    @Override // X.TGH
    public final void n4(String str, List list, AqS101S0300000_12 aqS101S0300000_12) {
        ViewGroup viewGroup = this.LJLJI;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.fk5);
            o.LJIIIIZZ(findViewById, "content.findViewById(R.i…ayout_panel_sticker_info)");
            C72434Sbm c72434Sbm = (C72434Sbm) findViewById.findViewById(R.id.fm8);
            if (c72434Sbm != null) {
                if (list != null) {
                    c72434Sbm.setVisibility(0);
                    W5F LJIIIZ = W5U.LJIIIZ(new C62562cu(list));
                    LJIIIZ.LJJIIJ = c72434Sbm;
                    LJIIIZ.LIZLLL(new LDP(c72434Sbm, list, aqS101S0300000_12));
                } else {
                    c72434Sbm.setVisibility(8);
                }
            }
            TextView textView = (TextView) findViewById.findViewById(R.id.fm7);
            if (str != null) {
                textView.setText(str);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            C16880lQ.LJIIJ(new IDlS19S0200000_12(list, aqS101S0300000_12, 2), findViewById);
            return;
        }
        o.LJIJI("content");
        throw null;
    }

    public AbstractStickerView(C29S activity, ViewGroup root, LifecycleOwner lifecycleOwner, TF5 requiredDependency, TEJ tej, TGG tgg, TGD stickerViewConfigure, TGN tabBarProvider, FragmentManager fragmentManager, TGS tgs, boolean z, TF1 searchStickerViewModel) {
        int i;
        FragmentManager fragmentManager2 = fragmentManager;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(root, "root");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(stickerViewConfigure, "stickerViewConfigure");
        o.LJIIIZ(tabBarProvider, "tabBarProvider");
        o.LJIIIZ(searchStickerViewModel, "searchStickerViewModel");
        this.LLFZ = activity;
        this.LLI = root;
        this.LLIFFJFJJ = lifecycleOwner;
        this.LLII = requiredDependency;
        this.LLIIII = tej;
        this.LLIIIILZ = tgg;
        this.LLIIIJ = stickerViewConfigure;
        this.LLIIIL = tabBarProvider;
        this.LLIIIZ = z;
        this.LLIIJI = searchStickerViewModel;
        if (fragmentManager2 == null) {
            if (lifecycleOwner instanceof Fragment) {
                fragmentManager2 = ((Fragment) lifecycleOwner).getChildFragmentManager();
            } else {
                fragmentManager2 = activity.getSupportFragmentManager();
            }
            o.LJIIIIZZ(fragmentManager2, "if (lifecycleOwner is Fr…ty.supportFragmentManager");
        }
        this.LJLIL = fragmentManager2;
        StickerViewImpl stickerViewImpl = (StickerViewImpl) this;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0200000_12(stickerViewImpl, tgs, 80));
        this.LJLLLLLL = -999;
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJLZ = c73318Sq2;
        this.LJZL = new C73893SzJ<>();
        this.LL = new C73893SzJ();
        this.LLD = new C73893SzJ<>();
        this.LLF = C48841JEv.LIZ(C78613UtF.LIZJ.plus(T2R.LJIIJJI()));
        lifecycleOwner.getLifecycle().addObserver(this);
        requiredDependency.LIZIZ.LIZIZ(new TG9(stickerViewImpl));
        this.LJLLLL = new TG8();
        View LIZ = C28289B8j.LIZ(root, R.layout.cqj, root, false);
        if (LIZ != null) {
            ViewGroup viewGroup = (ViewGroup) LIZ;
            this.LJLJI = viewGroup;
            if (stickerViewConfigure.LJLLI.LLF) {
                i = R.layout.bnu;
            } else {
                i = R.layout.bnt;
            }
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.kgu);
            viewGroup2.removeAllViews();
            if (C16880lQ.LLLLIILL(C16880lQ.LLZIL(root.getContext()), i, viewGroup2, true) != null) {
                this.LJLJJL = viewGroup2;
                ViewGroup viewGroup3 = this.LJLJI;
                if (viewGroup3 != null) {
                    View findViewById = viewGroup3.findViewById(R.id.fmj);
                    o.LJIIIIZZ(findViewById, "content.findViewById(R.id.layout_sticker_view)");
                    this.LJLJJLL = findViewById;
                    ViewGroup viewGroup4 = this.LJLJI;
                    if (viewGroup4 != null) {
                        View findViewById2 = viewGroup4.findViewById(R.id.fmk);
                        o.LJIIIIZZ(findViewById2, "content.findViewById(R.i…layout_sticker_view_root)");
                        this.LJLLJ = (ViewGroup) findViewById2;
                        ViewGroup viewGroup5 = this.LJLJI;
                        if (viewGroup5 != null) {
                            View findViewById3 = viewGroup5.findViewById(R.id.b3l);
                            o.LJIIIIZZ(findViewById3, "content.findViewById(R.id.can_remove_viewgroup)");
                            this.LJLJJI = findViewById3;
                            ViewGroup viewGroup6 = this.LJLJI;
                            if (viewGroup6 != null) {
                                ViewGroup viewGroup7 = this.LJLJJL;
                                if (viewGroup7 != null) {
                                    long j = stickerViewConfigure.LJLJLLL;
                                    TG7 tg7 = stickerViewConfigure.LJLLI;
                                    this.LJLL = new C74409TIf(root, viewGroup6, viewGroup7, j, tg7.LJLJLLL, tg7.LJZI);
                                    MutableLiveData mutableLiveData = new MutableLiveData();
                                    c73318Sq2.LIZ(Rc().LJJJJZI(new AfS61S0200000_12(mutableLiveData, stickerViewImpl, 13)));
                                    tej.LJ = mutableLiveData;
                                    if (stickerViewConfigure.LJLLI.LJZI) {
                                        root.setOnTouchListener(TGX.LJLIL);
                                        ViewGroup viewGroup8 = this.LJLJI;
                                        if (viewGroup8 != null) {
                                            viewGroup8.setOnTouchListener(TGY.LJLIL);
                                        } else {
                                            o.LJIJI("content");
                                            throw null;
                                        }
                                    }
                                    ViewGroup viewGroup9 = this.LJLJI;
                                    if (viewGroup9 != null) {
                                        View findViewById4 = viewGroup9.findViewById(R.id.l04);
                                        o.LJIIIIZZ(findViewById4, "content.findViewById(R.id.tag_layout)");
                                        ViewGroup.LayoutParams layoutParams = findViewById4.getLayoutParams();
                                        if (layoutParams != null) {
                                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                            int i2 = stickerViewConfigure.LJLJJI;
                                            if (i2 > 0) {
                                                marginLayoutParams.topMargin = i2;
                                            }
                                            int i3 = marginLayoutParams.topMargin;
                                            ViewGroup viewGroup10 = this.LJLJI;
                                            if (viewGroup10 != null) {
                                                marginLayoutParams.topMargin = C81184Vtc.LJFF(viewGroup10.getContext()) + i3;
                                                ViewGroup viewGroup11 = this.LJLJI;
                                                if (viewGroup11 != null) {
                                                    View findViewById5 = viewGroup11.findViewById(R.id.fmi);
                                                    if (findViewById5 != null && stickerViewConfigure.LJLIL != 0) {
                                                        findViewById5.setBackground(activity.getResources().getDrawable(stickerViewConfigure.LJLIL));
                                                    }
                                                    if (stickerViewConfigure.LJLILLLLZI != 0) {
                                                        ViewGroup viewGroup12 = this.LJLLJ;
                                                        if (viewGroup12 != null) {
                                                            viewGroup12.setBackground(activity.getResources().getDrawable(stickerViewConfigure.LJLILLLLZI));
                                                        } else {
                                                            o.LJIJI("stickerViewContainer");
                                                            throw null;
                                                        }
                                                    }
                                                    TG7 tg72 = stickerViewConfigure.LJLLI;
                                                    int i4 = 15;
                                                    if (tg72.LJLZ) {
                                                        int i5 = stickerViewConfigure.LJLLILLLL.LJLIL;
                                                        float f = tg72.LL;
                                                        if (i5 != 3) {
                                                            if (i5 != 4) {
                                                                if (f == 0.5f) {
                                                                    i4 = 20;
                                                                }
                                                            } else if (f == 0.5f) {
                                                                i4 = 16;
                                                            } else {
                                                                i4 = 12;
                                                            }
                                                        } else if (f == 0.5f) {
                                                            i4 = 9;
                                                        } else {
                                                            i4 = 6;
                                                        }
                                                        SIZ.LIZ = i4;
                                                        return;
                                                    }
                                                    SIZ.LIZ = 15;
                                                    return;
                                                }
                                                o.LJIJI("content");
                                                throw null;
                                            }
                                            o.LJIJI("content");
                                            throw null;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                                    }
                                    o.LJIJI("content");
                                    throw null;
                                }
                                o.LJIJI("bottomSheet");
                                throw null;
                            }
                            o.LJIJI("content");
                            throw null;
                        }
                        o.LJIJI("content");
                        throw null;
                    }
                    o.LJIJI("content");
                    throw null;
                }
                o.LJIJI("content");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
