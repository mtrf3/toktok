package com.ss.android.ugc.aweme.ecommerce.base.sku.widget;

import X.AnonymousClass636;
import X.C113724dE;
import X.C16880lQ;
import X.C221108m2;
import X.C26706Ady;
import X.C30591Hz;
import X.C40925G4j;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70054ReU;
import X.C70194Rgk;
import X.C70195Rgl;
import X.C70920RsS;
import X.C76800UCe;
import X.C78450Uqc;
import X.C78565UsT;
import X.C78946Uyc;
import X.InterfaceC65784Pro;
import X.InterfaceC65895Ptb;
import X.MBB;
import X.SY4;
import Y.IDeS357S0100000_12;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.ss.android.ugc.aweme.utils.Au2S3S0210000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS61S0201000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class SkuPanelBottomWidget extends SkuPanelBaseWidget implements c {
    public Map<Integer, View> _$_findViewCache;
    public LinearLayout addFavouriteBtn;
    public C113724dE addToCartBtn;
    public C113724dE buyNowBtn;
    public SY4 checkoutBtn;
    public int clickFrom;
    public boolean clickable;
    public boolean everHideBuyNow;
    public final BaseSkuFragment fragment;
    public final int layoutId;
    public boolean logBottomTip;
    public final C5H3 viewModel$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final void setCheckoutClickAction() {
        SY4 sy4 = this.checkoutBtn;
        if (sy4 != null) {
            C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 22, 42), sy4);
        } else {
            o.LJIJI("checkoutBtn");
            throw null;
        }
    }

    public final SkuPanelViewModel getViewModel() {
        return (SkuPanelViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x02e0, code lost:
    
        if (r4 != null) goto L343;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initView() {
        /*
            Method dump skipped, instructions count: 958
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBottomWidget.initView():void");
    }

    public final void checkMchessPropAndAddCart() {
        String Kv0 = getMViewModel().Kv0();
        if (Kv0 != null) {
            String string = getContainer().getContext().getResources().getString(R.string.f3u, Kv0);
            o.LJIIIIZZ(string, "container.context.resour…oast_choose, missingProp)");
            if (this.contentView != null) {
                SkuPanelViewModel.Uv0(getViewModel(), string);
            }
            getViewModel().getClass();
            SkuPanelViewModel.gw0(Kv0);
            sendUncheckedSpecData(Kv0);
            return;
        }
        checkLoginAndDo(new AqS162S0100000_12(this, 504));
    }

    public final void checkMchessPropAndBuyNow() {
        String Kv0 = getMViewModel().Kv0();
        if (Kv0 != null) {
            if (this.contentView != null) {
                String string = getContainer().getContext().getResources().getString(R.string.f3u, Kv0);
                o.LJIIIIZZ(string, "container.context.resour…oast_choose, missingProp)");
                SkuPanelViewModel.Uv0(getViewModel(), string);
                getViewModel().getClass();
                SkuPanelViewModel.gw0(Kv0);
                sendUncheckedSpecData(Kv0);
                return;
            }
            return;
        }
        checkLoginAndDo(new AqS162S0100000_12(this, 505));
    }

    public final void checkMchessPropAndChangeSkuItem() {
        String Kv0 = getMViewModel().Kv0();
        if (Kv0 != null) {
            if (this.contentView != null) {
                String string = getContainer().getContext().getResources().getString(R.string.f3u, Kv0);
                o.LJIIIIZZ(string, "container.context.resour…oast_choose, missingProp)");
                SkuPanelViewModel.Uv0(getViewModel(), string);
            }
            getViewModel().getClass();
            SkuPanelViewModel.gw0(Kv0);
            sendUncheckedSpecData(Kv0);
            return;
        }
        checkLoginAndDo(new AqS162S0100000_12(this, 506));
    }

    public final void checkMchessPropAndReplaceItem() {
        String Kv0 = getMViewModel().Kv0();
        if (Kv0 != null) {
            if (this.contentView != null) {
                String string = getContainer().getContext().getResources().getString(R.string.f3u, Kv0);
                o.LJIIIIZZ(string, "container.context.resour…oast_choose, missingProp)");
                SkuPanelViewModel.Uv0(getViewModel(), string);
            }
            getViewModel().getClass();
            SkuPanelViewModel.gw0(Kv0);
            sendUncheckedSpecData(Kv0);
            return;
        }
        checkLoginAndDo(new AqS162S0100000_12(this, 508));
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final BaseSkuFragment getFragment() {
        return this.fragment;
    }

    @Override // com.bytedance.widget.Widget
    public int getLayoutId() {
        return this.layoutId;
    }

    private final void checkLoginAndDo(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        IAccountService LJIJ = AccountService.LJIJ();
        if (!LJIJ.LJFF().isLogin()) {
            InterfaceC65895Ptb LJI = LJIJ.LJI();
            C78450Uqc c78450Uqc = new C78450Uqc();
            c78450Uqc.LIZ = getActivity();
            c78450Uqc.LJ = new IDeS357S0100000_12(interfaceC65784Pro, 2);
            C40925G4j.LIZ(c78450Uqc, LJI);
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public final void sendUncheckedSpecData(String missingProp) {
        SkuPanelViewModel viewModel = getViewModel();
        viewModel.getClass();
        o.LJIIIZ(missingProp, "missingProp");
        C78565UsT.LJJIJ(viewModel, MBB.INSTANCE, new C70054ReU(viewModel, missingProp, null));
    }

    public final void updateProtectionProgramText(LinkRichText linkRichText) {
        int LJIIIIZZ;
        View tv_buyer_protection = _$_findCachedViewById(R.id.m1a);
        o.LJIIIIZZ(tv_buyer_protection, "tv_buyer_protection");
        int i = 0;
        if (linkRichText == null) {
            i = 8;
        }
        tv_buyer_protection.setVisibility(i);
        if (linkRichText == null) {
            return;
        }
        if (!this.logBottomTip) {
            this.logBottomTip = true;
            View tv_buyer_protection2 = _$_findCachedViewById(R.id.m1a);
            o.LJIIIIZZ(tv_buyer_protection2, "tv_buyer_protection");
            C78946Uyc.LJJIIJ(tv_buyer_protection2, new C70920RsS(), C70195Rgl.LJLIL);
        }
        ((TextView) _$_findCachedViewById(R.id.m1a)).setText(RichTextUtil.LIZJ(RichTextUtil.LIZ, getContext(), linkRichText, null, 0, false, null, null, 124));
        TextView textView = (TextView) _$_findCachedViewById(R.id.m1a);
        String str = linkRichText.textColor;
        if (str != null) {
            LJIIIIZZ = C30591Hz.LJJIIJZLJL(str);
        } else {
            LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, getContext());
        }
        textView.setTextColor(LJIIIIZZ);
        View tv_buyer_protection3 = _$_findCachedViewById(R.id.m1a);
        o.LJIIIIZZ(tv_buyer_protection3, "tv_buyer_protection");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(linkRichText, this, 20, 42), tv_buyer_protection3);
    }

    public SkuPanelBottomWidget(int i, BaseSkuFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this._$_findViewCache = new LinkedHashMap();
        this.clickFrom = i;
        this.fragment = fragment;
        this.layoutId = R.layout.a7i;
        C65776Prg LIZ = C65352Pkq.LIZ(SkuPanelViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 80));
    }

    public final void setAddCartClickAction(boolean z, AddToCartButton addToCartButton) {
        C113724dE c113724dE = this.addToCartBtn;
        if (c113724dE != null) {
            C16880lQ.LJIIJ(new Au2S3S0210000_12(this, z, addToCartButton, 1), c113724dE);
        } else {
            o.LJIJI("addToCartBtn");
            throw null;
        }
    }

    public final void setBuyNowClickAction(boolean z, AddToCartButton addToCartButton) {
        C113724dE c113724dE = this.buyNowBtn;
        if (c113724dE != null) {
            C16880lQ.LJIIJ(new Au2S3S0210000_12(this, z, addToCartButton, 0), c113724dE);
        } else {
            o.LJIJI("buyNowBtn");
            throw null;
        }
    }

    public final void updateAddFavouriteBtn(Integer num, boolean z) {
        int i;
        LinearLayout linearLayout = this.addFavouriteBtn;
        if (linearLayout != null) {
            TuxIconView tuxIconView = (TuxIconView) linearLayout.findViewById(R.id.vj);
            if (z) {
                i = R.raw.icon_bookmark_fill;
            } else {
                i = R.raw.icon_bookmark;
            }
            tuxIconView.setIconRes(i);
            LinearLayout linearLayout2 = this.addFavouriteBtn;
            if (linearLayout2 != null) {
                ((TuxTextView) linearLayout2.findViewById(R.id.vk)).setTextColorRes(R.attr.go);
                LinearLayout linearLayout3 = this.addFavouriteBtn;
                if (linearLayout3 != null) {
                    ((TuxIconView) linearLayout3.findViewById(R.id.vj)).setTintColorRes(R.attr.go);
                    LinearLayout linearLayout4 = this.addFavouriteBtn;
                    if (linearLayout4 != null) {
                        C16880lQ.LJIIJ(new C70194Rgk(this, z), linearLayout4);
                        return;
                    } else {
                        o.LJIJI("addFavouriteBtn");
                        throw null;
                    }
                }
                o.LJIJI("addFavouriteBtn");
                throw null;
            }
            o.LJIJI("addFavouriteBtn");
            throw null;
        }
        o.LJIJI("addFavouriteBtn");
        throw null;
    }

    public final void updateBuyButton(BuyButton buyButton, int i) {
        Boolean bool;
        int i2 = this.clickFrom;
        if ((i2 == 0 || i2 == 2) && !this.everHideBuyNow) {
            C113724dE c113724dE = this.buyNowBtn;
            if (c113724dE != null) {
                int i3 = 0;
                if (buyButton != null && (bool = buyButton.isHide) != null && !(!bool.booleanValue())) {
                    i3 = 8;
                }
                c113724dE.setVisibility(i3);
            } else {
                o.LJIJI("buyNowBtn");
                throw null;
            }
        }
        b.LJIL(buyButton, new AqS162S0100000_12(this, 507), new AqS61S0201000_12(this, i, buyButton, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateShowCart(X.SY4 r6, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton r7, X.InterfaceC65784Pro<X.C76800UCe> r8, X.InterfaceC65784Pro<X.C76800UCe> r9, int r10, boolean r11) {
        /*
            r5 = this;
            if (r7 == 0) goto L5e
            java.lang.Integer r2 = r7.status
        L4:
            r4 = 1
            r3 = 0
            if (r2 != 0) goto L13
        L8:
            r0 = 8
            r6.setVisibility(r0)
        Ld:
            if (r11 == 0) goto L12
            r6.setVisibility(r3)
        L12:
            return
        L13:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L4b
            r6.setVisibility(r3)
            android.content.Context r1 = r6.getContext()
            java.lang.String r2 = "btnView.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r2)
            r0 = 2130968600(0x7f040018, float:1.7545858E38)
            int r0 = X.AnonymousClass636.LJIIIIZZ(r0, r1)
            r6.setBackgroundColor(r0)
            android.content.Context r1 = r6.getContext()
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r2)
            r0 = 2130968758(0x7f0400b6, float:1.7546179E38)
            int r0 = X.AnonymousClass636.LJIIIIZZ(r0, r1)
            r6.setTextColor(r0)
            r6.setEnabled(r3)
            r6.setSupportClickWhenDisable(r4)
            r8.invoke()
            goto Ld
        L4b:
            int r0 = r2.intValue()
            if (r0 != r4) goto L8
            r6.setVisibility(r3)
            r6.setButtonVariant(r10)
            r6.setEnabled(r4)
            r9.invoke()
            goto Ld
        L5e:
            r2 = 0
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBottomWidget.updateShowCart(X.SY4, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton, X.Pro, X.Pro, int, boolean):void");
    }

    public static /* synthetic */ void updateShowCart$default(SkuPanelBottomWidget skuPanelBottomWidget, SY4 sy4, AddToCartButton addToCartButton, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            z = false;
        }
        skuPanelBottomWidget.updateShowCart(sy4, addToCartButton, interfaceC65784Pro, interfaceC65784Pro2, i, z);
    }
}
