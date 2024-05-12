package com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget;

import X.AnonymousClass636;
import X.C113554cx;
import X.C113724dE;
import X.C16880lQ;
import X.C221108m2;
import X.C26048AKe;
import X.C26059AKp;
import X.C26706Ady;
import X.C27739Aud;
import X.C30591Hz;
import X.C40925G4j;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70054ReU;
import X.C70081Rev;
import X.C70173RgP;
import X.C70179RgV;
import X.C70920RsS;
import X.C73156SnQ;
import X.C76800UCe;
import X.C78450Uqc;
import X.C78565UsT;
import X.C78946Uyc;
import X.EnumC70052ReS;
import X.InterfaceC65784Pro;
import X.InterfaceC65895Ptb;
import X.InterfaceC70181RgX;
import X.MBB;
import X.OSZ;
import X.TBT;
import Y.IDeS357S0100000_12;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.core.utils.RichTextUtil;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class UsSkuBottomWidget extends SkuPanelBaseWidget implements c {
    public Map<Integer, View> _$_findViewCache;
    public final InterfaceC70181RgX buttonListener;
    public final Set<String> buttonShowSet;
    public int clickFrom;
    public final SkuPanelFragment fragment;
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

    public final SkuPanelViewModel getViewModel() {
        return (SkuPanelViewModel) this.viewModel$delegate.getValue();
    }

    private final void checkMchessPropAndAddCart() {
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
        checkLoginAndDo(new AqS162S0100000_12(this, 538));
    }

    private final void checkMchessPropAndBuyNow() {
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
        checkLoginAndDo(new AqS162S0100000_12(this, 539));
    }

    private final void checkMchessPropAndChangeSkuItem() {
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
        checkLoginAndDo(new AqS162S0100000_12(this, 540));
    }

    private final void checkMchessPropAndReplaceItem() {
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
        checkLoginAndDo(new AqS162S0100000_12(this, 541));
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public void initSubscribe() {
        super.initSubscribe();
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.ReP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getBottomAreaElem();
            }
        }, new AqS194S0100000_12(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.ReQ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getProtectionProgramText();
            }
        }, new AqS194S0100000_12(this, 121));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public void initView() {
        super.initView();
        ((C70179RgV) _$_findCachedViewById(R.id.b21)).setPdpBottomButtonListener(this.buttonListener);
    }

    public final SkuPanelFragment getFragment() {
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
            c78450Uqc.LJ = new IDeS357S0100000_12(interfaceC65784Pro, 3);
            C40925G4j.LIZ(c78450Uqc, LJI);
            return;
        }
        interfaceC65784Pro.invoke();
    }

    private final void sendUncheckedSpecData(String missingProp) {
        SkuPanelViewModel viewModel = getViewModel();
        viewModel.getClass();
        o.LJIIIZ(missingProp, "missingProp");
        C78565UsT.LJJIJ(viewModel, MBB.INSTANCE, new C70054ReU(viewModel, missingProp, null));
    }

    public final void updateAddress(C113724dE view) {
        o.LJIIIZ(view, "view");
        String string = getContext().getResources().getString(R.string.fca);
        o.LJIIIIZZ(string, "context.resources.getStr…ndeliverable_click_toast)");
        C26048AKe c26048AKe = new C26048AKe(this.fragment);
        c26048AKe.LJI(string);
        c26048AKe.LJII();
    }

    public final void updateButtonUI(PdpBottomAreaElem pdpBottomAreaElem) {
        if (pdpBottomAreaElem == null) {
            View button_container = _$_findCachedViewById(R.id.b21);
            o.LJIIIIZZ(button_container, "button_container");
            button_container.setVisibility(8);
            return;
        }
        View button_container2 = _$_findCachedViewById(R.id.b21);
        o.LJIIIIZZ(button_container2, "button_container");
        button_container2.setVisibility(0);
        List<PdpButton> list = pdpBottomAreaElem.buttons;
        if (list != null) {
            ((C70179RgV) _$_findCachedViewById(R.id.b21)).setEnableButtonVibration(true);
            ((C70179RgV) _$_findCachedViewById(R.id.b21)).LIZ(list);
        }
        if (pdpBottomAreaElem.statusNotice != null || pdpBottomAreaElem.statusSubNotice != null) {
            View layout_tips = _$_findCachedViewById(R.id.fmz);
            o.LJIIIIZZ(layout_tips, "layout_tips");
            layout_tips.setVisibility(0);
            TuxTextView tv_tips = (TuxTextView) _$_findCachedViewById(R.id.mo5);
            o.LJIIIIZZ(tv_tips, "tv_tips");
            updateTip(tv_tips, pdpBottomAreaElem.statusNotice);
            TuxTextView tv_sub_tips = (TuxTextView) _$_findCachedViewById(R.id.mlq);
            o.LJIIIIZZ(tv_sub_tips, "tv_sub_tips");
            updateTip(tv_sub_tips, pdpBottomAreaElem.statusSubNotice);
            return;
        }
        View layout_tips2 = _$_findCachedViewById(R.id.fmz);
        o.LJIIIIZZ(layout_tips2, "layout_tips");
        layout_tips2.setVisibility(8);
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
            C78946Uyc.LJJIIJ(tv_buyer_protection2, new C70920RsS(), C70173RgP.LJLIL);
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
        C16880lQ.LJIIJ(new Au2S19S0200000_12(linkRichText, this, 26, 42), tv_buyer_protection3);
    }

    public UsSkuBottomWidget(int i, SkuPanelFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this._$_findViewCache = new LinkedHashMap();
        this.clickFrom = i;
        this.fragment = fragment;
        this.layoutId = R.layout.a9n;
        C65776Prg LIZ = C65352Pkq.LIZ(SkuPanelViewModel.class);
        this.viewModel$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 124));
        this.buttonShowSet = new LinkedHashSet();
        this.buttonListener = new C70081Rev(this);
    }

    private final void updateTip(TuxTextView tuxTextView, LinkRichText linkRichText) {
        if (linkRichText != null) {
            tuxTextView.setVisibility(0);
            tuxTextView.setText(RichTextUtil.LIZJ(RichTextUtil.LIZ, getContext(), linkRichText, null, 0, false, null, null, 124));
            tuxTextView.setTextColor(linkRichText.LIZ(getContext()));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        tuxTextView.setVisibility(8);
    }

    public final void addToCart(PdpButton button, C113724dE view) {
        o.LJIIIZ(button, "button");
        o.LJIIIZ(view, "view");
        if (view.isClickable()) {
            C26059AKp.LIZ().LIZ("ec_sku_user_transform", C27739Aud.LJI(C113554cx.LJJLIIIIJ(new OSZ("trans_from_type", "1"))));
            Integer num = button.buttonStatus;
            int value = EnumC70052ReS.DISABLE.getValue();
            if (num == null || num.intValue() != value) {
                checkMchessPropAndAddCart();
            } else {
                SkuPanelViewModel.Uv0(getViewModel(), button.clickHint);
            }
        }
    }

    public final void buyNow(PdpButton button, C113724dE view) {
        o.LJIIIZ(button, "button");
        o.LJIIIZ(view, "view");
        if (view.isClickable()) {
            C26059AKp.LIZ().LIZ("ec_sku_user_transform", C27739Aud.LJI(C113554cx.LJJLIIIIJ(new OSZ("trans_from_type", "2"))));
            Integer num = button.buttonStatus;
            int value = EnumC70052ReS.DISABLE.getValue();
            if (num == null || num.intValue() != value) {
                if (this.clickFrom == 10) {
                    checkMchessPropAndReplaceItem();
                    return;
                } else {
                    checkMchessPropAndBuyNow();
                    return;
                }
            }
            SkuPanelViewModel.Uv0(getViewModel(), button.clickHint);
        }
    }

    public final void changeSkuItem(PdpButton button, C113724dE view) {
        o.LJIIIZ(button, "button");
        o.LJIIIZ(view, "view");
        C26059AKp.LIZ().LIZ("ec_sku_user_transform", C27739Aud.LJI(C113554cx.LJJLIIIIJ(new OSZ("trans_from_type", "2"))));
        Integer num = button.buttonStatus;
        int value = EnumC70052ReS.DISABLE.getValue();
        if (num == null || num.intValue() != value) {
            checkMchessPropAndChangeSkuItem();
        } else {
            SkuPanelViewModel.Uv0(getViewModel(), button.clickHint);
        }
    }
}
