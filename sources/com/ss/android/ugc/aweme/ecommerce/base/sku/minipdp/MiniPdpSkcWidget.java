package com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp;

import X.C16880lQ;
import X.C221108m2;
import X.C26706Ady;
import X.C5H3;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69967Rd5;
import X.C69969Rd7;
import X.C70146Rfy;
import X.C70148Rg0;
import X.C70150Rg2;
import X.C70247Rhb;
import X.C70254Rhi;
import X.C70920RsS;
import X.C73156SnQ;
import X.C78946Uyc;
import X.C7MY;
import X.InterfaceC69848RbA;
import X.InterfaceC70268Rhw;
import X.ORS;
import X.ORZ;
import X.RXV;
import X.RXW;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpSkcViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.ITtfSkcStyle;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS31S0210000_12;
import kotlin.jvm.internal.AqS54S0110000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class MiniPdpSkcWidget extends SkuPanelBaseWidget implements c {
    public static final C70150Rg2 Companion = new C70150Rg2();
    public Map<Integer, View> _$_findViewCache;
    public String[] defaultCheckedIds;
    public final BaseSkuFragment fragment;
    public final int layoutId;
    public TuxTextView noticeTextView;
    public List<SaleProp> saleProps;
    public final LinkedList<C70247Rhb> scrapViews;
    public final C5H3 skuContainerAbility$delegate;
    public final C5H3 skuInteraction$delegate;
    public final C5H3 skuListContainer$delegate;
    public final C5H3 style$delegate;
    public final WidgetLifecycleAwareLazy widgetViewModel$delegate;

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

    private final InterfaceC69848RbA getSkuContainerAbility() {
        return (InterfaceC69848RbA) this.skuContainerAbility$delegate.getValue();
    }

    private final C70254Rhi getSkuInteraction() {
        return (C70254Rhi) this.skuInteraction$delegate.getValue();
    }

    private final ViewGroup getSkuListContainer() {
        return (ViewGroup) this.skuListContainer$delegate.getValue();
    }

    private final MiniPdpSkcViewModel getWidgetViewModel() {
        return (MiniPdpSkcViewModel) this.widgetViewModel$delegate.getValue();
    }

    public final ITtfSkcStyle getStyle() {
        return (ITtfSkcStyle) this.style$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public void initSubscribe() {
        MiniPdpSkcViewModel widgetViewModel = getWidgetViewModel();
        InterfaceC69848RbA skuContainerAbility = getSkuContainerAbility();
        widgetViewModel.LJLJLJ = skuContainerAbility;
        if (skuContainerAbility != null) {
            skuContainerAbility.tN(new AqS143S0200000_12(widgetViewModel, skuContainerAbility, 70));
            skuContainerAbility.er(new AqS178S0100000_12(widgetViewModel, 347));
        }
        C73156SnQ.LJIIIIZZ(this, getWidgetViewModel(), new TBT() { // from class: X.RdB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpSkcViewModel.SkcState) obj).getVo();
            }
        }, new AqS194S0100000_12(this, 80));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public void initView() {
        super.initView();
        ViewGroup skuListContainer = getSkuListContainer();
        if (skuListContainer != null) {
            skuListContainer.removeAllViews();
        }
    }

    public final BaseSkuFragment getFragment() {
        return this.fragment;
    }

    @Override // com.bytedance.widget.Widget
    public int getLayoutId() {
        return this.layoutId;
    }

    public MiniPdpSkcWidget(BaseSkuFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(MiniPdpSkcViewModel.class);
        AqS159S0200000_12 aqS159S0200000_12 = new AqS159S0200000_12(this, LIZ, 20);
        this.widgetViewModel$delegate = new WidgetLifecycleAwareLazy(this, aqS159S0200000_12, new AqS72S0400000_12(this, aqS159S0200000_12, LIZ, C70148Rg0.INSTANCE, 13));
        this.skuContainerAbility$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 481));
        this.layoutId = R.layout.a4o;
        this.skuInteraction$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 482));
        this.scrapViews = new LinkedList<>();
        this.skuListContainer$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 483));
        this.saleProps = C61878OQg.INSTANCE;
        this.style$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 484));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBind(RXV rxv) {
        String str;
        SizeGuide sizeGuide;
        ProductBase productBase;
        ProductBase productBase2;
        SizeGuide sizeGuide2;
        List<SaleProp> list = rxv.LIZ;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        this.saleProps = list;
        if (getSkuListContainer().getChildCount() > 0) {
            ViewGroup skuListContainer = getSkuListContainer();
            LinkedList<C70247Rhb> linkedList = this.scrapViews;
            while (skuListContainer.getChildCount() > 0) {
                View childAt = skuListContainer.getChildAt(0);
                C16880lQ.LJLLL(childAt, skuListContainer);
                if (childAt instanceof C70247Rhb) {
                    linkedList.add(childAt);
                }
            }
        }
        if (rxv.LIZ == null || rxv.LIZIZ == null) {
            return;
        }
        if (this.defaultCheckedIds == null) {
            this.defaultCheckedIds = (String[]) rxv.LIZLLL.toArray(new String[0]);
        }
        C70254Rhi skuInteraction = getSkuInteraction();
        if (skuInteraction != null) {
            skuInteraction.LIZLLL(this, rxv.LIZ, (String[]) rxv.LIZLLL.toArray(new String[0]), getStyle());
        }
        SkcInfo skcInfo = rxv.LIZJ;
        List<SaleProp> list2 = rxv.LIZ;
        int i = 0;
        for (SaleProp prop : list2) {
            int i2 = i + 1;
            View view = this.contentView;
            if (view != null) {
                C70247Rhb c70247Rhb = (C70247Rhb) ORS.LJJLJLI(this.scrapViews);
                if (c70247Rhb == null) {
                    Context context = view.getContext();
                    o.LJIIIIZZ(context, "it.context");
                    c70247Rhb = new C70247Rhb(context, null);
                }
                c70247Rhb.setSkuStyle(getStyle());
                C70254Rhi skuInteraction2 = getSkuInteraction();
                if (skuInteraction2 != null) {
                    skuInteraction2.LIZ(c70247Rhb, i, prop, list2, rxv.LIZIZ, rxv.LIZJ, new C70146Rfy(this, c70247Rhb, rxv, skcInfo));
                }
                logWhenShow(c70247Rhb, prop, rxv);
                MiniPdpSkcViewModel widgetViewModel = getWidgetViewModel();
                widgetViewModel.getClass();
                o.LJIIIZ(prop, "prop");
                ProductPackStruct productPackStruct = widgetViewModel.LJLJJLL;
                if (productPackStruct != null && (productBase2 = productPackStruct.baseInfo) != null && (sizeGuide2 = productBase2.sizeGuide) != null) {
                    str = sizeGuide2.showSalePropId;
                } else {
                    str = null;
                }
                if (o.LJ(str, prop.propId)) {
                    ProductPackStruct productPackStruct2 = getWidgetViewModel().LJLJJLL;
                    if (productPackStruct2 != null && (productBase = productPackStruct2.baseInfo) != null) {
                        sizeGuide = productBase.sizeGuide;
                    } else {
                        sizeGuide = null;
                    }
                    tryAddSizeGuide(sizeGuide, c70247Rhb);
                }
                getSkuListContainer().addView(c70247Rhb);
            }
            i = i2;
        }
        View view2 = this.contentView;
        if (view2 != null) {
            Context context2 = view2.getContext();
            o.LJIIIIZZ(context2, "it.context");
            TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
            tuxTextView.setTuxFont(51);
            tuxTextView.setTextColorRes(R.attr.eb);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.bottomMargin = C7MY.LIZIZ(12);
            tuxTextView.setLayoutParams(layoutParams);
            getSkuListContainer().addView(tuxTextView);
            this.noticeTextView = tuxTextView;
        }
        updateNoticeText(rxv.LIZIZ);
        MiniPdpSkcViewModel widgetViewModel2 = getWidgetViewModel();
        List<String> list3 = rxv.LIZLLL;
        widgetViewModel2.getClass();
        if (list3 == null) {
            return;
        }
        widgetViewModel2.setState(new AqS143S0200000_12(widgetViewModel2, (MiniPdpSkcViewModel) list3, (List<String>) 68));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateNoticeText(java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem> r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.ITtfSkcStyle r0 = r5.getStyle()
            boolean r0 = r0.getHasLowStockWarnings()
            r4 = 8
            if (r0 != 0) goto L15
            com.bytedance.tux.input.TuxTextView r0 = r5.noticeTextView
            if (r0 != 0) goto L11
        L10:
            return
        L11:
            r0.setVisibility(r4)
            goto L10
        L15:
            X.Rhi r0 = r5.getSkuInteraction()
            r3 = 0
            r2 = 0
            if (r0 == 0) goto L2d
            java.util.List r1 = r0.LIZIZ(r2)
            java.lang.String[] r0 = new java.lang.String[r3]
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L2f
        L2d:
            java.lang.String[] r0 = new java.lang.String[r3]
        L2f:
            java.lang.String r0 = X.C63122Opy.LIZ(r0)
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r1 = X.RXW.LIZJ(r0, r6)
            if (r1 == 0) goto L61
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice r0 = r1.purchaseNotice
            if (r0 == 0) goto L63
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice r0 = r1.purchaseNotice
            java.lang.String r2 = r0.desc
        L41:
            boolean r0 = X.C78685UuP.LJJJZ(r2)
            if (r0 == 0) goto L58
            com.bytedance.tux.input.TuxTextView r0 = r5.noticeTextView
            if (r0 != 0) goto L54
        L4b:
            com.bytedance.tux.input.TuxTextView r0 = r5.noticeTextView
            if (r0 != 0) goto L50
        L4f:
            return
        L50:
            r0.setVisibility(r3)
            goto L4f
        L54:
            r0.setText(r2)
            goto L4b
        L58:
            com.bytedance.tux.input.TuxTextView r0 = r5.noticeTextView
            if (r0 != 0) goto L5d
            goto L4f
        L5d:
            r0.setVisibility(r4)
            goto L4f
        L61:
            r0 = r2
            goto L67
        L63:
            if (r1 == 0) goto L61
            java.lang.String r0 = r1.lowStockWarning
        L67:
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L41
            if (r1 == 0) goto L41
            java.lang.String r2 = r1.lowStockWarning
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpSkcWidget.updateNoticeText(java.util.List):void");
    }

    private final void tryAddSizeGuide(SizeGuide sizeGuide, C70247Rhb c70247Rhb) {
        if (sizeGuide == null) {
            return;
        }
        c70247Rhb.LJJLL(sizeGuide, new AqS162S0100000_12(this, 485));
    }

    private final void logWhenShow(View view, SaleProp saleProp, RXV rxv) {
        String str;
        String str2;
        List<Skc> list;
        Skc skc;
        String[] strArr = this.defaultCheckedIds;
        boolean z = false;
        if (strArr == null) {
            strArr = new String[1];
            SkcInfo skcInfo = rxv.LIZJ;
            if (skcInfo == null || (list = skcInfo.skcList) == null || (skc = (Skc) ORZ.LJLLLL(list)) == null || (str2 = skc.skcId) == null) {
                str2 = "";
            }
            strArr[0] = str2;
        }
        if (RXW.LIZ(rxv.LIZIZ, strArr) > 0) {
            z = true;
        }
        String str3 = saleProp.propId;
        SkcInfo skcInfo2 = rxv.LIZJ;
        if (skcInfo2 != null) {
            str = skcInfo2.skcPropertyId;
        } else {
            str = null;
        }
        if (o.LJ(str3, str)) {
            C78946Uyc.LJJIIJZLJL(view, new C70920RsS(), C69969Rd7.LJLIL, new AqS31S0210000_12(this, rxv, z, 1));
        } else {
            if (o.LJ(saleProp.hasImage, Boolean.TRUE)) {
                return;
            }
            C78946Uyc.LJJIIJZLJL(view, new C70920RsS(), C69967Rd5.LJLIL, new AqS54S0110000_12(rxv, z, 2));
        }
    }

    public final void notifySkuChangeOuter(InterfaceC70268Rhw interfaceC70268Rhw, int i, String str, SkcInfo skcInfo) {
        C70254Rhi skuInteraction = getSkuInteraction();
        List<String> list = null;
        if (skuInteraction != null) {
            list = skuInteraction.LIZIZ(null);
        }
        MiniPdpSkcViewModel widgetViewModel = getWidgetViewModel();
        widgetViewModel.getClass();
        if (list == null) {
            return;
        }
        widgetViewModel.setState(new AqS143S0200000_12(widgetViewModel, (MiniPdpSkcViewModel) list, (List<String>) 68));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r1 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void logClick(android.view.View r9, int r10, java.lang.String r11, X.RXV r12, int r13) {
        /*
            r8 = this;
            r3 = r8
            X.Rhi r1 = r3.getSkuInteraction()
            r2 = 0
            if (r1 == 0) goto L19
            r0 = 0
            java.util.List r1 = r1.LIZIZ(r0)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L1b
        L19:
            java.lang.String[] r1 = new java.lang.String[r2]
        L1b:
            r2 = r12
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem> r0 = r2.LIZIZ
            int r1 = X.RXW.LIZ(r0, r1)
            r0 = 1
            if (r1 <= 0) goto L56
            r6 = 1
        L26:
            r4 = r11
            r5 = r13
            if (r10 != 0) goto L3f
            boolean r0 = r2.LIZIZ()
            if (r0 == 0) goto L3e
            X.RsR r0 = new X.RsR
            r0.<init>()
            kotlin.jvm.internal.AqS2S1211000_12 r1 = new kotlin.jvm.internal.AqS2S1211000_12
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.C78946Uyc.LJJIIJ(r9, r0, r1)
        L3e:
            return
        L3f:
            if (r10 != r0) goto L3e
            boolean r0 = r2.LIZ()
            if (r0 == 0) goto L3e
            X.RsR r2 = new X.RsR
            r2.<init>()
            kotlin.jvm.internal.AqS0S1011000_12 r1 = new kotlin.jvm.internal.AqS0S1011000_12
            r0 = 0
            r1.<init>(r4, r5, r6, r0)
            X.C78946Uyc.LJJIIJ(r9, r2, r1)
            goto L3e
        L56:
            r6 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpSkcWidget.logClick(android.view.View, int, java.lang.String, X.RXV, int):void");
    }
}
