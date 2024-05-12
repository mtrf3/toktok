package X;

import Y.ACListenerS32S0100000_12;
import Y.AObserverS80S0100000_12;
import Y.AfS53S0100000_1;
import Y.AfS64S0100000_12;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TLS implements InterfaceC164256cX {
    public final TLQ LIZ;
    public InterfaceC74483TLb LIZIZ;
    public TLW LIZJ;
    public TM8 LIZLLL;
    public C74485TLd LJ;
    public View LJFF;
    public boolean LJI;
    public final int LJII;
    public final C5H3 LJIIIIZZ;
    public final C5H3 LJIIIZ;
    public final C5H3 LJIIJ;
    public final C5H3 LJIIJJI;
    public final C5H3 LJIIL;
    public final C5H3 LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public final C73893SzJ LJIILLIIL;
    public final C73893SzJ LJIIZILJ;
    public final C73893SzJ LJIJ;
    public final C73893SzJ LJIJI;
    public final C73893SzJ LJIJJ;
    public final C73893SzJ LJIJJLI;
    public final C73893SzJ LJIL;
    public final C73849Syb LJJ;
    public final C73318Sq2 LJJI;
    public ViewGroup LJJIFFI;
    public final ViewGroup LJJII;
    public final LifecycleOwner LJJIII;
    public final TLJ LJJIIJ;

    @Override // X.InterfaceC164256cX
    public final void b3() {
        this.LJI = true;
    }

    @Override // X.InterfaceC164256cX
    public final void Z2() {
        int i = this.LJII;
        if (i > 0) {
            C16880lQ.LJLI(Looper.myQueue(), new TLT(this, 0, i));
        }
    }

    @Override // X.InterfaceC164256cX
    public final C73426Srm a3() {
        C73893SzJ c73893SzJ = this.LJIILLIIL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.InterfaceC164256cX
    public final C73426Srm c3() {
        C73893SzJ c73893SzJ = this.LJIIZILJ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.InterfaceC164256cX
    public final C73426Srm d3() {
        C73893SzJ c73893SzJ = this.LJIJI;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.InterfaceC164256cX
    public final C73426Srm e3() {
        C73893SzJ c73893SzJ = this.LJIJJ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.InterfaceC164256cX
    public final C73426Srm f3() {
        C73893SzJ c73893SzJ = this.LJIL;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.InterfaceC164256cX
    public final C73426Srm g3() {
        C73893SzJ c73893SzJ = this.LJIJ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    @Override // X.InterfaceC164256cX
    public final void hide() {
        if (this.LIZ.LIZJ) {
            InterfaceC74483TLb interfaceC74483TLb = this.LIZIZ;
            if (interfaceC74483TLb != null) {
                interfaceC74483TLb.hide();
                return;
            } else {
                o.LJIJI("transitionView");
                throw null;
            }
        }
        InterfaceC74483TLb interfaceC74483TLb2 = this.LIZIZ;
        if (interfaceC74483TLb2 != null) {
            interfaceC74483TLb2.LIZJ();
        } else {
            o.LJIJI("transitionView");
            throw null;
        }
    }

    @Override // X.InterfaceC164256cX
    public final void loadData() {
        TLZ Rp;
        TLJ tlj = this.LJJIIJ;
        if (tlj != null && (Rp = tlj.Rp()) != null) {
            Rp.go();
        }
    }

    @Override // X.InterfaceC164256cX
    public final void show() {
        TLZ Rp;
        if (!this.LJIILJJIL) {
            ViewGroup viewGroup = this.LJJIFFI;
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.emj);
                o.LJIIIIZZ(findViewById, "content.findViewById(R.id.info_viewpager)");
                ViewPager viewPager = (ViewPager) findViewById;
                View findViewById2 = viewGroup.findViewById(R.id.kk4);
                o.LJIIIIZZ(findViewById2, "content.findViewById(R.id.sticker_tab)");
                C80695Vlj c80695Vlj = (C80695Vlj) findViewById2;
                View findViewById3 = viewGroup.findViewById(R.id.em5);
                o.LJIIIIZZ(findViewById3, "content.findViewById(R.i…ker_content_with_loading)");
                c80695Vlj.setTabMargin(0);
                TLX tlx = this.LIZ.LJIIZILJ;
                Drawable LIZ = LIZ(tlx.LJI);
                if (LIZ != null) {
                    viewPager.setBackground(LIZ);
                }
                Drawable LIZ2 = LIZ(tlx.LJFF);
                if (LIZ2 != null) {
                    View findViewById4 = viewGroup.findViewById(R.id.kk5);
                    o.LJIIIIZZ(findViewById4, "content.findViewById(R.id.sticker_tab_container)");
                    findViewById4.setBackground(LIZ2);
                }
                InterfaceC88472Yns<? super ViewPager, C76800UCe> interfaceC88472Yns = tlx.LJII;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(viewPager);
                }
                InterfaceC88472Yns<? super C80695Vlj, C76800UCe> interfaceC88472Yns2 = tlx.LJIIIIZZ;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(c80695Vlj);
                }
                TLW tlw = new TLW(viewPager, c80695Vlj, findViewById3, this.LIZ.LJIIIIZZ);
                C73318Sq2 c73318Sq2 = this.LJJI;
                C73893SzJ<OSZ<RTV, Integer>> c73893SzJ = tlw.LIZJ;
                C73426Srm LIZ3 = IA2.LIZ(c73893SzJ, c73893SzJ);
                AfS53S0100000_1 afS53S0100000_1 = new AfS53S0100000_1(this, 47);
                C73982T1u c73982T1u = C73982T1u.LJLIL;
                c73318Sq2.LIZ(LIZ3.LJJJLIIL(afS53S0100000_1, c73982T1u));
                findViewById3.setVisibility(0);
                if (tlw.LIZIZ.getCount() > 0) {
                    viewPager.setCurrentItem(0, false);
                }
                this.LIZJ = tlw;
                ViewGroup viewGroup2 = this.LJJIFFI;
                if (viewGroup2 != null) {
                    ViewGroup searchInputView = (ViewGroup) viewGroup2.findViewById(R.id.ema);
                    View searchContentView = viewGroup2.findViewById(R.id.emd);
                    Drawable LIZ4 = LIZ(this.LIZ.LJIIZILJ.LIZLLL);
                    if (LIZ4 != null) {
                        o.LJIIIIZZ(searchInputView, "searchInputView");
                        searchInputView.setBackground(LIZ4);
                    }
                    Drawable LIZ5 = LIZ(this.LIZ.LJIIZILJ.LJ);
                    if (LIZ5 != null) {
                        o.LJIIIIZZ(searchContentView, "searchContentView");
                        searchContentView.setBackground(LIZ5);
                    }
                    o.LJIIIIZZ(searchInputView, "searchInputView");
                    AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(this, 1009);
                    o.LJIIIIZZ(searchContentView, "searchContentView");
                    Context context = viewGroup2.getContext();
                    if (!(context instanceof Activity)) {
                        context = null;
                    }
                    TLQ tlq = this.LIZ;
                    TM8 tm8 = new TM8(searchInputView, aqS162S0100000_12, searchContentView, (Activity) context, tlq.LJIILJJIL, tlq.LJIILLIIL, tlq.LJIJI);
                    this.LIZLLL = tm8;
                    tm8.LJ(this.LIZ.LIZ);
                    if (this.LIZ.LIZ) {
                        C73318Sq2 c73318Sq22 = this.LJJI;
                        TM8 tm82 = this.LIZLLL;
                        o.LJI(tm82);
                        c73318Sq22.LIZ(tm82.LIZLLL().LJJJLIIL(new AfS64S0100000_12(this, 81), c73982T1u));
                    }
                    boolean z = this.LIZ.LJ;
                    ViewGroup viewGroup3 = this.LJJIFFI;
                    if (viewGroup3 != null) {
                        TLW tlw2 = this.LIZJ;
                        o.LJI(tlw2);
                        View findViewById5 = viewGroup3.findViewById(R.id.kgu);
                        o.LJIIIIZZ(findViewById5, "content.findViewById(R.i…cker_design_bottom_sheet)");
                        C74485TLd c74485TLd = new C74485TLd(findViewById5, tlw2.LIZLLL, z);
                        this.LJ = c74485TLd;
                        if (z) {
                            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = c74485TLd.LIZ;
                            if (viewPagerBottomSheetBehavior != null) {
                                viewPagerBottomSheetBehavior.setState(5);
                            }
                            C73318Sq2 c73318Sq23 = this.LJJI;
                            C74485TLd c74485TLd2 = this.LJ;
                            o.LJI(c74485TLd2);
                            c73318Sq23.LIZ(c74485TLd2.LIZ().LJJJLIIL(new AfS64S0100000_12(this, 69), c73982T1u));
                        }
                        ViewGroup viewGroup4 = this.LJJIFFI;
                        if (viewGroup4 != null) {
                            C74482TLa c74482TLa = new C74482TLa(viewGroup4);
                            if (this.LIZ.LJFF) {
                                c74482TLa.LIZ(new ACListenerS32S0100000_12(this, 105));
                            } else {
                                c74482TLa.LIZIZ();
                            }
                            TLJ tlj = this.LJJIIJ;
                            if (tlj != null && (Rp = tlj.Rp()) != null) {
                                Rp.getPageState().observe(this.LJJIII, new AObserverS80S0100000_12(this, 52));
                                Rp.N90().observe(this.LJJIII, new AObserverS80S0100000_12(this, 53));
                            }
                            C73318Sq2 c73318Sq24 = this.LJJI;
                            InterfaceC74483TLb interfaceC74483TLb = this.LIZIZ;
                            if (interfaceC74483TLb != null) {
                                c73318Sq24.LIZ(interfaceC74483TLb.LIZ().LJJJJZI(new AfS64S0100000_12(this, 80)));
                                this.LJIILJJIL = true;
                            } else {
                                o.LJIJI("transitionView");
                                throw null;
                            }
                        } else {
                            o.LJIJI("content");
                            throw null;
                        }
                    } else {
                        o.LJIJI("content");
                        throw null;
                    }
                } else {
                    o.LJIJI("content");
                    throw null;
                }
            } else {
                o.LJIJI("content");
                throw null;
            }
        }
        if (this.LIZ.LIZJ) {
            InterfaceC74483TLb interfaceC74483TLb2 = this.LIZIZ;
            if (interfaceC74483TLb2 != null) {
                interfaceC74483TLb2.show();
                return;
            } else {
                o.LJIJI("transitionView");
                throw null;
            }
        }
        InterfaceC74483TLb interfaceC74483TLb3 = this.LIZIZ;
        if (interfaceC74483TLb3 != null) {
            interfaceC74483TLb3.LIZIZ();
        } else {
            o.LJIJI("transitionView");
            throw null;
        }
    }

    public final Drawable LIZ(int i) {
        if (i == 0) {
            return null;
        }
        Context context = this.LJJII.getContext();
        o.LJIIIIZZ(context, "root.context");
        return context.getResources().getDrawable(i);
    }

    public TLS(ViewGroup viewGroup, C164246cW c164246cW, TLJ tlj, InterfaceC88472Yns interfaceC88472Yns) {
        InterfaceC74483TLb c83097WjN;
        Integer num;
        float f;
        this.LJJII = viewGroup;
        this.LJJIII = c164246cW;
        this.LJJIIJ = tlj;
        TLQ tlq = new TLQ(null);
        this.LIZ = tlq;
        this.LJII = 24;
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        final C164366ci c164366ci = (C164366ci) this;
        this.LJIIIIZZ = C221108m2.LIZ(enumC221088m0, new AqS162S0100000_12(c164366ci, 1004));
        this.LJIIIZ = C221108m2.LIZ(enumC221088m0, new AqS162S0100000_12(c164366ci, 1003));
        this.LJIIJ = C221108m2.LIZ(enumC221088m0, new AqS162S0100000_12(c164366ci, 999));
        this.LJIIJJI = C221108m2.LIZ(enumC221088m0, new AqS162S0100000_12(c164366ci, 1000));
        this.LJIIL = C221108m2.LIZ(enumC221088m0, new AqS162S0100000_12(c164366ci, 1002));
        this.LJIILIIL = C221108m2.LIZ(enumC221088m0, new AqS162S0100000_12(c164366ci, 1005));
        this.LJIILLIIL = new C73893SzJ();
        this.LJIIZILJ = new C73893SzJ();
        this.LJIJ = new C73893SzJ();
        new C73893SzJ();
        this.LJIJI = new C73893SzJ();
        this.LJIJJ = new C73893SzJ();
        this.LJIJJLI = new C73893SzJ();
        new C73893SzJ();
        this.LJIL = new C73893SzJ();
        this.LJJ = new C73849Syb();
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LJJI = c73318Sq2;
        interfaceC88472Yns.invoke(tlq);
        View LIZ = C28289B8j.LIZ(viewGroup, R.layout.crn, viewGroup, false);
        if (LIZ != null) {
            ViewGroup viewGroup2 = (ViewGroup) LIZ;
            this.LJJIFFI = viewGroup2;
            View findViewById = viewGroup2.findViewById(R.id.em2);
            C16880lQ.LJIIJ(ViewOnClickListenerC74490TLi.LJLIL, findViewById);
            Drawable LIZ2 = LIZ(tlq.LJIIZILJ.LIZJ);
            if (LIZ2 != null) {
                findViewById.setBackground(LIZ2);
            }
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null);
            if (marginLayoutParams != null) {
                Context context = findViewById.getContext();
                o.LJIIIIZZ(context, "context");
                boolean z = tlq.LIZ;
                int i = tlq.LJIIZILJ.LIZ;
                if (i != -2 && i != -1) {
                    if (z) {
                        f = 500.0f;
                    } else {
                        f = 300.0f;
                    }
                    num = Integer.valueOf(Math.max((int) C74275TDb.LIZIZ(context, f), i));
                } else {
                    num = null;
                }
                Context context2 = findViewById.getContext();
                o.LJIIIIZZ(context2, "context");
                int LIZIZ = (int) C74275TDb.LIZIZ(context2, tlq.LJIIZILJ.LIZIZ);
                marginLayoutParams.topMargin = num != null ? Math.max(C74275TDb.LIZLLL(context2) - num.intValue(), LIZIZ) : LIZIZ;
            }
            ViewGroup viewGroup3 = this.LJJIFFI;
            if (viewGroup3 != null) {
                viewGroup.addView(viewGroup3);
                ViewGroup viewGroup4 = this.LJJIFFI;
                if (viewGroup4 != null) {
                    View findViewById2 = viewGroup4.findViewById(R.id.amf);
                    this.LJFF = findViewById2;
                    if (findViewById2 != null) {
                        findViewById2.setVisibility(8);
                        findViewById2.setOnTouchListener(ViewOnTouchListenerC74489TLh.LJLIL);
                    }
                    ViewGroup viewGroup5 = this.LJJIFFI;
                    if (viewGroup5 != null) {
                        if (tlq.LIZLLL) {
                            c83097WjN = new C74491TLj();
                        } else {
                            c83097WjN = new C83097WjN(viewGroup5, this.LJFF, viewGroup5.findViewById(R.id.kgu), C83100WjQ.LJLIL);
                        }
                        this.LIZIZ = c83097WjN;
                        c73318Sq2.LIZ(c83097WjN.a3().LJJJLIIL(new AfS64S0100000_12(c164366ci, 75), C73982T1u.LJLIL));
                        InterfaceC74483TLb interfaceC74483TLb = this.LIZIZ;
                        if (interfaceC74483TLb != null) {
                            interfaceC74483TLb.LIZJ();
                            if (!tlq.LJIJ) {
                                loadData();
                            }
                            c164246cW.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.ss.android.ugc.tools.infosticker.view.internal.main.InfoStickerView$1
                                @Override // androidx.lifecycle.LifecycleEventObserver
                                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                    if (event == Lifecycle.Event.ON_DESTROY) {
                                        onDestroy();
                                    }
                                }

                                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                                public final void onDestroy() {
                                    if (!c164366ci.LJJI.LJLILLLLZI) {
                                        c164366ci.LJJI.dispose();
                                    }
                                }
                            });
                            return;
                        }
                        o.LJIJI("transitionView");
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
}
