package com.ss.android.ugc.aweme.ecommerce.base.sku.widget;

import X.C018905p;
import X.C119774mz;
import X.C16880lQ;
import X.C1AF;
import X.C221108m2;
import X.C45804HyK;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73156SnQ;
import X.C7MY;
import X.InterfaceC70386Rjq;
import X.OUP;
import X.S3L;
import X.TBT;
import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuPanelHeaderWidget extends SkuPanelBaseWidget {
    public SmartImageView LJLILLLLZI;
    public TuxIconView LJLJI;
    public TuxTextView LJLJJI;
    public C119774mz LJLJJL;
    public TuxTextView LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public C1AF LJLJLLL;
    public C1AF LJLL;
    public final C62822Ol8 LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public final int LJLIL = R.layout.a7n;
    public float LJLLI = 1.0f;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SkuPanelHeaderWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(SkuPanelViewModel.class);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 81));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initView() {
        int i;
        C018905p c018905p;
        C018905p c018905p2;
        C018905p c018905p3;
        C018905p c018905p4;
        C018905p c018905p5;
        C018905p c018905p6;
        C018905p c018905p7;
        C018905p c018905p8;
        super.initView();
        this.LJLILLLLZI = (SmartImageView) findView(R.id.k3i);
        this.LJLJI = (TuxIconView) findView(R.id.k3e);
        this.LJLJJI = (TuxTextView) findView(R.id.k3k);
        this.LJLJJL = (C119774mz) findView(R.id.k3n);
        this.LJLJJLL = (TuxTextView) findView(R.id.k3m);
        this.LJLJL = (TuxTextView) findView(R.id.k3j);
        this.LJLJLJ = (TuxTextView) findView(R.id.k3g);
        this.LJLJLLL = (C1AF) findView(R.id.k3h);
        this.LJLL = (C1AF) findView(R.id.k3f);
        C1AF c1af = this.LJLJLLL;
        C018905p c018905p9 = null;
        if (c1af != null) {
            c1af.setReferencedIds(new int[]{R.id.k3g, R.id.k3j});
            C1AF c1af2 = this.LJLL;
            if (c1af2 != null) {
                c1af2.setReferencedIds(new int[]{R.id.k3m, R.id.k3i});
                TuxTextView tuxTextView = this.LJLJL;
                if (tuxTextView != null) {
                    tuxTextView.getPaint().setFlags(16);
                    TuxTextView tuxTextView2 = this.LJLJL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.getPaint().setAntiAlias(true);
                        View view = this.contentView;
                        if (view != null) {
                            C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 52), view);
                        }
                        SmartImageView smartImageView = this.LJLILLLLZI;
                        if (smartImageView != null) {
                            C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS32S0100000_12(this, 53));
                            InterfaceC70386Rjq Tv0 = ((SkuPanelViewModel) this.LJLLILLLL.getValue()).Tv0();
                            View view2 = this.contentView;
                            if (view2 != null) {
                                view2.setPadding(view2.getPaddingStart(), Tv0.LJIILLIIL(), view2.getPaddingEnd(), Tv0.LJIILLIIL());
                            }
                            TuxTextView tuxTextView3 = this.LJLJJI;
                            if (tuxTextView3 != null) {
                                Tv0.LJII();
                                tuxTextView3.setTextColorRes(R.attr.go);
                                TuxTextView tuxTextView4 = this.LJLJJI;
                                if (tuxTextView4 != null) {
                                    tuxTextView4.setTuxFont(Tv0.LJIIJ());
                                    TuxTextView tuxTextView5 = this.LJLJL;
                                    if (tuxTextView5 != null) {
                                        tuxTextView5.setTextColorRes(Tv0.LJFF());
                                        TuxTextView tuxTextView6 = this.LJLJL;
                                        if (tuxTextView6 != null) {
                                            tuxTextView6.setTuxFont(Tv0.LJJ());
                                            SmartImageView smartImageView2 = this.LJLILLLLZI;
                                            if (smartImageView2 != null) {
                                                OUP.LJJJJLI(smartImageView2, Float.valueOf(Tv0.LJIJI()), null, null, 30);
                                                C119774mz c119774mz = this.LJLJJL;
                                                if (c119774mz != null) {
                                                    C45804HyK.LJJLIIIJ(Tv0.LIZLLL(), c119774mz);
                                                    TuxTextView tuxTextView7 = this.LJLJJLL;
                                                    if (tuxTextView7 != null) {
                                                        if (Tv0.LJIJJLI()) {
                                                            i = 0;
                                                        } else {
                                                            i = 8;
                                                        }
                                                        tuxTextView7.setVisibility(i);
                                                        SmartImageView smartImageView3 = this.LJLILLLLZI;
                                                        if (smartImageView3 != null) {
                                                            Context context = smartImageView3.getContext();
                                                            o.LJIIIIZZ(context, "headerImageView.context");
                                                            S3L LJIIL = Tv0.LJIIL(context);
                                                            if (LJIIL != null) {
                                                                SmartImageView smartImageView4 = this.LJLILLLLZI;
                                                                if (smartImageView4 != null) {
                                                                    smartImageView4.setCircleOptions(LJIIL);
                                                                } else {
                                                                    o.LJIJI("headerImageView");
                                                                    throw null;
                                                                }
                                                            }
                                                            SmartImageView smartImageView5 = this.LJLILLLLZI;
                                                            if (smartImageView5 != null) {
                                                                ViewGroup.LayoutParams layoutParams = smartImageView5.getLayoutParams();
                                                                if (layoutParams != null) {
                                                                    layoutParams.width = Tv0.LIZIZ();
                                                                    layoutParams.height = Tv0.LIZIZ();
                                                                } else {
                                                                    layoutParams = null;
                                                                }
                                                                smartImageView5.setLayoutParams(layoutParams);
                                                                if (Tv0.LJIILL() == -1) {
                                                                    TuxTextView tuxTextView8 = this.LJLJJI;
                                                                    if (tuxTextView8 != null) {
                                                                        ViewGroup.LayoutParams layoutParams2 = tuxTextView8.getLayoutParams();
                                                                        if (layoutParams2 instanceof C018905p) {
                                                                            c018905p5 = (C018905p) layoutParams2;
                                                                            if (c018905p5 != null) {
                                                                                c018905p5.topToTop = -1;
                                                                                c018905p5.bottomToTop = R.id.k3j;
                                                                            }
                                                                        } else {
                                                                            c018905p5 = null;
                                                                        }
                                                                        tuxTextView8.setLayoutParams(c018905p5);
                                                                        TuxIconView tuxIconView = this.LJLJI;
                                                                        if (tuxIconView != null) {
                                                                            ViewGroup.LayoutParams layoutParams3 = tuxIconView.getLayoutParams();
                                                                            if (layoutParams3 instanceof C018905p) {
                                                                                c018905p6 = (C018905p) layoutParams3;
                                                                                if (c018905p6 != null) {
                                                                                    c018905p6.topToTop = -1;
                                                                                    c018905p6.bottomToTop = R.id.k3j;
                                                                                }
                                                                            } else {
                                                                                c018905p6 = null;
                                                                            }
                                                                            tuxIconView.setLayoutParams(c018905p6);
                                                                            TuxTextView tuxTextView9 = this.LJLJL;
                                                                            if (tuxTextView9 != null) {
                                                                                ViewGroup.LayoutParams layoutParams4 = tuxTextView9.getLayoutParams();
                                                                                if (layoutParams4 instanceof C018905p) {
                                                                                    c018905p7 = (C018905p) layoutParams4;
                                                                                    if (c018905p7 != null) {
                                                                                        c018905p7.topToBottom = -1;
                                                                                        c018905p7.bottomToTop = R.id.k3n;
                                                                                        ((ViewGroup.MarginLayoutParams) c018905p7).bottomMargin = C7MY.LIZIZ(4);
                                                                                    }
                                                                                } else {
                                                                                    c018905p7 = null;
                                                                                }
                                                                                tuxTextView9.setLayoutParams(c018905p7);
                                                                                TuxTextView tuxTextView10 = this.LJLJLJ;
                                                                                if (tuxTextView10 != null) {
                                                                                    ViewGroup.LayoutParams layoutParams5 = tuxTextView10.getLayoutParams();
                                                                                    if (layoutParams5 instanceof C018905p) {
                                                                                        c018905p8 = (C018905p) layoutParams5;
                                                                                        if (c018905p8 != null) {
                                                                                            c018905p8.topToBottom = -1;
                                                                                            c018905p8.baselineToBaseline = R.id.k3j;
                                                                                        }
                                                                                    } else {
                                                                                        c018905p8 = null;
                                                                                    }
                                                                                    tuxTextView10.setLayoutParams(c018905p8);
                                                                                    C119774mz c119774mz2 = this.LJLJJL;
                                                                                    if (c119774mz2 != null) {
                                                                                        ViewGroup.LayoutParams layoutParams6 = c119774mz2.getLayoutParams();
                                                                                        if ((layoutParams6 instanceof C018905p) && (c018905p9 = (C018905p) layoutParams6) != null) {
                                                                                            c018905p9.topToBottom = -1;
                                                                                            c018905p9.bottomToBottom = R.id.k3i;
                                                                                        }
                                                                                        c119774mz2.setLayoutParams(c018905p9);
                                                                                        return;
                                                                                    }
                                                                                    o.LJIJI("promotionTag");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("discountTextView");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("originalPriceView");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("couponIcon");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("priceView");
                                                                    throw null;
                                                                }
                                                                TuxTextView tuxTextView11 = this.LJLJJI;
                                                                if (tuxTextView11 != null) {
                                                                    ViewGroup.LayoutParams layoutParams7 = tuxTextView11.getLayoutParams();
                                                                    if (layoutParams7 instanceof C018905p) {
                                                                        c018905p = (C018905p) layoutParams7;
                                                                        if (c018905p != null) {
                                                                            c018905p.topToTop = R.id.k3i;
                                                                            c018905p.bottomToTop = -1;
                                                                        }
                                                                    } else {
                                                                        c018905p = null;
                                                                    }
                                                                    tuxTextView11.setLayoutParams(c018905p);
                                                                    TuxIconView tuxIconView2 = this.LJLJI;
                                                                    if (tuxIconView2 != null) {
                                                                        ViewGroup.LayoutParams layoutParams8 = tuxIconView2.getLayoutParams();
                                                                        if (layoutParams8 instanceof C018905p) {
                                                                            c018905p2 = (C018905p) layoutParams8;
                                                                            if (c018905p2 != null) {
                                                                                c018905p2.topToTop = R.id.k3i;
                                                                                c018905p2.bottomToTop = -1;
                                                                            }
                                                                        } else {
                                                                            c018905p2 = null;
                                                                        }
                                                                        tuxIconView2.setLayoutParams(c018905p2);
                                                                        TuxTextView tuxTextView12 = this.LJLJL;
                                                                        if (tuxTextView12 != null) {
                                                                            ViewGroup.LayoutParams layoutParams9 = tuxTextView12.getLayoutParams();
                                                                            if (layoutParams9 instanceof C018905p) {
                                                                                c018905p3 = (C018905p) layoutParams9;
                                                                                if (c018905p3 != null) {
                                                                                    c018905p3.topToBottom = R.id.k3k;
                                                                                    c018905p3.bottomToTop = -1;
                                                                                }
                                                                            } else {
                                                                                c018905p3 = null;
                                                                            }
                                                                            tuxTextView12.setLayoutParams(c018905p3);
                                                                            TuxTextView tuxTextView13 = this.LJLJLJ;
                                                                            if (tuxTextView13 != null) {
                                                                                ViewGroup.LayoutParams layoutParams10 = tuxTextView13.getLayoutParams();
                                                                                if (layoutParams10 instanceof C018905p) {
                                                                                    c018905p4 = (C018905p) layoutParams10;
                                                                                    if (c018905p4 != null) {
                                                                                        c018905p4.topToBottom = R.id.k3k;
                                                                                        c018905p4.bottomToTop = -1;
                                                                                    }
                                                                                } else {
                                                                                    c018905p4 = null;
                                                                                }
                                                                                tuxTextView13.setLayoutParams(c018905p4);
                                                                                C119774mz c119774mz3 = this.LJLJJL;
                                                                                if (c119774mz3 != null) {
                                                                                    ViewGroup.LayoutParams layoutParams11 = c119774mz3.getLayoutParams();
                                                                                    if ((layoutParams11 instanceof C018905p) && (c018905p9 = (C018905p) layoutParams11) != null) {
                                                                                        c018905p9.topToBottom = R.id.k3h;
                                                                                        c018905p9.bottomToBottom = -1;
                                                                                    }
                                                                                    c119774mz3.setLayoutParams(c018905p9);
                                                                                    return;
                                                                                }
                                                                                o.LJIJI("promotionTag");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("discountTextView");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("originalPriceView");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("couponIcon");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("priceView");
                                                                throw null;
                                                            }
                                                            o.LJIJI("headerImageView");
                                                            throw null;
                                                        }
                                                        o.LJIJI("headerImageView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("specsView");
                                                    throw null;
                                                }
                                                o.LJIJI("promotionTag");
                                                throw null;
                                            }
                                            o.LJIJI("headerImageView");
                                            throw null;
                                        }
                                        o.LJIJI("originalPriceView");
                                        throw null;
                                    }
                                    o.LJIJI("originalPriceView");
                                    throw null;
                                }
                                o.LJIJI("priceView");
                                throw null;
                            }
                            o.LJIJI("priceView");
                            throw null;
                        }
                        o.LJIJI("headerImageView");
                        throw null;
                    }
                    o.LJIJI("originalPriceView");
                    throw null;
                }
                o.LJIJI("originalPriceView");
                throw null;
            }
            o.LJIJI("skuHeaderBarrier");
            throw null;
        }
        o.LJIJI("discountLineBarrier");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initSubscribe() {
        super.initSubscribe();
        SkuPanelViewModel mViewModel = getMViewModel();
        C73156SnQ.LJIIIIZZ(this, mViewModel, new TBT() { // from class: X.Rjl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentImage();
            }
        }, new AqS194S0100000_12(this, 103));
        C73156SnQ.LJIIIIZZ(this, mViewModel, new TBT() { // from class: X.Rft
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getNeedIcon();
            }
        }, new AqS194S0100000_12(this, 104));
        C73156SnQ.LJIIIIZZ(this, mViewModel, new TBT() { // from class: X.Rjp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentPrice();
            }
        }, new AqS194S0100000_12(this, 105));
        C73156SnQ.LJIIIIZZ(this, mViewModel, new TBT() { // from class: X.Rfs
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getPromotionView();
            }
        }, new AqS194S0100000_12(this, 106));
        C73156SnQ.LJIIIIZZ(this, mViewModel, new TBT() { // from class: X.Rfu
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getSpecifications();
            }
        }, new AqS194S0100000_12(this, 100));
        C73156SnQ.LJIIIIZZ(this, mViewModel, new TBT() { // from class: X.Rjo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getOriginalPrice();
            }
        }, new AqS194S0100000_12(this, 101));
        C73156SnQ.LJIIIIZZ(this, mViewModel, new TBT() { // from class: X.Rfv
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getDiscountText();
            }
        }, new AqS194S0100000_12(this, 102));
    }

    @Override // com.bytedance.widget.Widget
    public final int getLayoutId() {
        return this.LJLIL;
    }
}
