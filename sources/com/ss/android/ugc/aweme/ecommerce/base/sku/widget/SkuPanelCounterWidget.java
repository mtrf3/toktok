package com.ss.android.ugc.aweme.ecommerce.base.sku.widget;

import X.C110614Vt;
import X.C16880lQ;
import X.C221108m2;
import X.C26338AVi;
import X.C27570Aru;
import X.C27739Aud;
import X.C32151Nz;
import X.C45804HyK;
import X.C52922Kpq;
import X.C62822Ol8;
import X.C70399Rk3;
import X.C70402Rk6;
import X.C70403Rk7;
import X.C70410RkE;
import X.C70918RsQ;
import X.C73156SnQ;
import X.C78946Uyc;
import X.EnumC70226RhG;
import X.InterfaceC70386Rjq;
import X.KNV;
import X.O6R;
import X.TBT;
import X.X1D;
import Y.ACListenerS32S0100000_12;
import Y.IDObjectS122S0200000_12;
import Y.IDTListenerS92S0200000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS174S0200000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuPanelCounterWidget extends SkuPanelBaseWidget {
    public TuxIconView LJLILLLLZI;
    public TuxIconView LJLJI;
    public EditText LJLJJI;
    public TuxTextView LJLJJL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public final int LJLIL = R.layout.a7k;
    public long LJLJJLL = -1;
    public int LJLJL = -1;
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 510));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 509));

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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

    public final C70399Rk3 LIZ() {
        return (C70399Rk3) this.LJLJLLL.getValue();
    }

    public final void LIZIZ() {
        String str;
        SkuPanelStarter.SkuEnterParams skuEnterParams = getMViewModel().LJLLJ;
        if (skuEnterParams == null || (str = skuEnterParams.getProductId()) == null) {
            str = "";
        }
        EventCenter.LJ().LIZ("ec_sku_panel_operated", C27739Aud.LJI(new SkuPanelStarter.SkuOperationParams(str, 1)));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initSubscribe() {
        super.initSubscribe();
        SkuPanelViewModel mViewModel = getMViewModel();
        C73156SnQ.LJIIIIZZ(this, mViewModel, new TBT() { // from class: X.Rj3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getPurchaseNotice();
            }
        }, new AqS194S0100000_12(this, 99));
        C73156SnQ.LJII(this, mViewModel, new TBT() { // from class: X.Rj1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentQuantity();
            }
        }, new TBT() { // from class: X.Rj2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getCurrentQuantityLimit();
            }
        }, new IDqS436S0100000_12(this, 8));
        C73156SnQ.LJIIIIZZ(this, mViewModel, new TBT() { // from class: X.Rj0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getKeyBoardVisibility();
            }
        }, new AqS174S0200000_12(this, mViewModel, 15));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initView() {
        TuxTextView tuxTextView;
        Integer num;
        super.initView();
        this.LJLILLLLZI = (TuxIconView) findView(R.id.k3b);
        this.LJLJI = (TuxIconView) findView(R.id.k3c);
        this.LJLJJI = (EditText) findView(R.id.k3a);
        InterfaceC70386Rjq Tv0 = getMViewModel().Tv0();
        EnumC70226RhG LJIJ = Tv0.LJIJ();
        EnumC70226RhG enumC70226RhG = EnumC70226RhG.START;
        if (LJIJ == enumC70226RhG) {
            tuxTextView = (TuxTextView) findView(R.id.h4_);
        } else {
            tuxTextView = (TuxTextView) findView(R.id.h49);
        }
        this.LJLJJL = tuxTextView;
        LinearLayout linearLayout = (LinearLayout) findView(R.id.ijb);
        C52922Kpq c52922Kpq = C52922Kpq.LIZ;
        SkuPanelStarter.SkuEnterParams skuEnterParams = getMViewModel().LJLLJ;
        if (skuEnterParams != null) {
            num = skuEnterParams.getBizType();
        } else {
            num = null;
        }
        c52922Kpq.getClass();
        if (C52922Kpq.LIZ(num)) {
            linearLayout.setOrientation(0);
            if (Tv0.LJIJ() == enumC70226RhG) {
                TuxTextView tuxTextView2 = this.LJLJJL;
                if (tuxTextView2 != null) {
                    C45804HyK.LJJLIIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), tuxTextView2);
                    TextView textView = (TextView) _$_findCachedViewById(R.id.k3d);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(getContext().getString(R.string.f3k));
                    LIZ.append(':');
                    textView.setText(X1D.LIZIZ(LIZ));
                } else {
                    o.LJIJI("noticeText");
                    throw null;
                }
            }
        } else {
            linearLayout.setOrientation(1);
        }
        TuxIconView tuxIconView = this.LJLJI;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS32S0100000_12(this, 152));
            TuxIconView tuxIconView2 = this.LJLJI;
            if (tuxIconView2 != null) {
                C78946Uyc.LJJIIJ(tuxIconView2, new C70918RsQ(0), C70402Rk6.LJLIL);
                TuxIconView tuxIconView3 = this.LJLILLLLZI;
                if (tuxIconView3 != null) {
                    C16880lQ.LJJJ(tuxIconView3, new ACListenerS32S0100000_12(this, 153));
                    TuxIconView tuxIconView4 = this.LJLILLLLZI;
                    if (tuxIconView4 != null) {
                        C78946Uyc.LJJIIJ(tuxIconView4, new C70918RsQ(0), C70403Rk7.LJLIL);
                        EditText editText = this.LJLJJI;
                        if (editText != null) {
                            editText.setOnTouchListener(new IDTListenerS92S0200000_12(this, editText, 3));
                            EditText editText2 = this.LJLJJI;
                            if (editText2 != null) {
                                editText2.addTextChangedListener(new IDObjectS122S0200000_12(this, editText2, 0));
                                EditText editText3 = this.LJLJJI;
                                if (editText3 != null) {
                                    editText3.setKeyListener(new C70410RkE());
                                    ((TuxTextView) _$_findCachedViewById(R.id.k3d)).setTuxFont(Tv0.LIZJ().getGroupTitleFont());
                                    ((TuxTextView) _$_findCachedViewById(R.id.k3d)).setTextColorRes(Tv0.LIZJ().getGroupTitleColor());
                                    View sku_panel_counter_minus = _$_findCachedViewById(R.id.k3b);
                                    o.LJIIIIZZ(sku_panel_counter_minus, "sku_panel_counter_minus");
                                    C27570Aru.LJII(Tv0.LJIIIZ(), sku_panel_counter_minus);
                                    View sku_panel_counter_input = _$_findCachedViewById(R.id.k3a);
                                    o.LJIIIIZZ(sku_panel_counter_input, "sku_panel_counter_input");
                                    int LJIIIZ = Tv0.LJIIIZ();
                                    ViewGroup.LayoutParams layoutParams = sku_panel_counter_input.getLayoutParams();
                                    layoutParams.height = LJIIIZ;
                                    sku_panel_counter_input.setLayoutParams(layoutParams);
                                    View sku_panel_counter_plus = _$_findCachedViewById(R.id.k3c);
                                    o.LJIIIIZZ(sku_panel_counter_plus, "sku_panel_counter_plus");
                                    C27570Aru.LJII(Tv0.LJIIIZ(), sku_panel_counter_plus);
                                    C110614Vt c110614Vt = new C110614Vt();
                                    c110614Vt.LIZLLL = KNV.LIZIZ(0.5d);
                                    c110614Vt.LJFF = Integer.valueOf(R.attr.dz);
                                    c110614Vt.LJIIJ = Float.valueOf(Tv0.LJI());
                                    c110614Vt.LJIIIIZZ = Float.valueOf(Tv0.LJI());
                                    Context context = getContainer().getContext();
                                    o.LJIIIIZZ(context, "container.context");
                                    Drawable LIZ2 = c110614Vt.LIZ(context);
                                    C110614Vt c110614Vt2 = new C110614Vt();
                                    c110614Vt2.LIZLLL = KNV.LIZIZ(0.5d);
                                    c110614Vt2.LJFF = Integer.valueOf(R.attr.dz);
                                    c110614Vt2.LJIIJJI = Float.valueOf(Tv0.LJI());
                                    c110614Vt2.LJIIIZ = Float.valueOf(Tv0.LJI());
                                    Context context2 = getContainer().getContext();
                                    o.LJIIIIZZ(context2, "container.context");
                                    Drawable LIZ3 = c110614Vt2.LIZ(context2);
                                    if (C26338AVi.LIZJ(getContext())) {
                                        TuxIconView tuxIconView5 = this.LJLILLLLZI;
                                        if (tuxIconView5 != null) {
                                            tuxIconView5.setBackground(LIZ3);
                                            TuxIconView tuxIconView6 = this.LJLJI;
                                            if (tuxIconView6 != null) {
                                                tuxIconView6.setBackground(LIZ2);
                                                return;
                                            } else {
                                                o.LJIJI("plusBtn");
                                                throw null;
                                            }
                                        }
                                        o.LJIJI("minusBtn");
                                        throw null;
                                    }
                                    TuxIconView tuxIconView7 = this.LJLILLLLZI;
                                    if (tuxIconView7 != null) {
                                        tuxIconView7.setBackground(LIZ2);
                                        TuxIconView tuxIconView8 = this.LJLJI;
                                        if (tuxIconView8 != null) {
                                            tuxIconView8.setBackground(LIZ3);
                                            return;
                                        } else {
                                            o.LJIJI("plusBtn");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("minusBtn");
                                    throw null;
                                }
                                o.LJIJI("counterInput");
                                throw null;
                            }
                            o.LJIJI("counterInput");
                            throw null;
                        }
                        o.LJIJI("counterInput");
                        throw null;
                    }
                    o.LJIJI("minusBtn");
                    throw null;
                }
                o.LJIJI("minusBtn");
                throw null;
            }
            o.LJIJI("plusBtn");
            throw null;
        }
        o.LJIJI("plusBtn");
        throw null;
    }

    @Override // com.bytedance.widget.Widget
    public final int getLayoutId() {
        return this.LJLIL;
    }
}
