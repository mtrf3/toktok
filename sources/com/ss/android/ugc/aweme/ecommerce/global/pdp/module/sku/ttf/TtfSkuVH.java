package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf;

import X.C16880lQ;
import X.C221108m2;
import X.C26706Ady;
import X.C5H3;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69966Rd4;
import X.C69968Rd6;
import X.C70147Rfz;
import X.C70151Rg3;
import X.C70247Rhb;
import X.C70254Rhi;
import X.C70919RsR;
import X.C70920RsS;
import X.C72545SdZ;
import X.C78946Uyc;
import X.C7MY;
import X.ORS;
import X.ORZ;
import X.RXV;
import X.RXW;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS0S1011000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS2S1211000_12;
import kotlin.jvm.internal.AqS31S0210000_12;
import kotlin.jvm.internal.AqS54S0110000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class TtfSkuVH extends ECJediViewHolder implements c {
    public static final C70151Rg3 Companion = new C70151Rg3();
    public Map<Integer, View> _$_findViewCache;
    public String[] defaultCheckedIds;
    public final ECBaseFragment fragment;
    public TuxTextView noticeTextView;
    public List<SaleProp> saleProps;
    public final LinkedList<C70247Rhb> scrapViews;
    public final C5H3 skuInteraction$delegate;
    public final C5H3 style$delegate;
    public final C5H3 vm$delegate;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final C70254Rhi getSkuInteraction() {
        return (C70254Rhi) this.skuInteraction$delegate.getValue();
    }

    public final ITtfSkcStyle getStyle() {
        return (ITtfSkcStyle) this.style$delegate.getValue();
    }

    public final PdpViewModel getVm() {
        return (PdpViewModel) this.vm$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final ECBaseFragment getFragment() {
        return this.fragment;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onCreate() {
        super.onCreate();
    }

    private final void tryAddSizeGuide(C70247Rhb c70247Rhb) {
        ProductBase productBase;
        SizeGuide sizeGuide;
        ProductPackStruct productPackStruct = getVm().LJLJLLL;
        if (productPackStruct == null || (productBase = productPackStruct.baseInfo) == null || (sizeGuide = productBase.sizeGuide) == null) {
            return;
        }
        c70247Rhb.LJJLL(sizeGuide, new AqS159S0200000_12(this, sizeGuide, 28));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(RXV vo) {
        String[] strArr;
        String str;
        ProductBase productBase;
        SizeGuide sizeGuide;
        String[] strArr2;
        o.LJIIIZ(vo, "vo");
        if (((ViewGroup) this.itemView.findViewById(R.id.k35)).getChildCount() > 0) {
            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.k35);
            o.LJIIIIZZ(viewGroup, "itemView.sku_list_container");
            LinkedList<C70247Rhb> linkedList = this.scrapViews;
            while (viewGroup.getChildCount() > 0) {
                View childAt = viewGroup.getChildAt(0);
                C16880lQ.LJLLL(childAt, viewGroup);
                if (childAt instanceof C70247Rhb) {
                    linkedList.add(childAt);
                }
            }
        }
        AttributeSet attributeSet = null;
        if (this.defaultCheckedIds == null) {
            SkuPanelState skuPanelState = getVm().LJLL;
            if (skuPanelState != null) {
                strArr2 = skuPanelState.getCheckedSkuIds();
            } else {
                strArr2 = null;
            }
            this.defaultCheckedIds = strArr2;
        }
        List<SaleProp> list = vo.LIZ;
        if (list == null || vo.LIZIZ == null) {
            return;
        }
        this.saleProps = list;
        C70254Rhi skuInteraction = getSkuInteraction();
        ECBaseFragment eCBaseFragment = this.fragment;
        List<SaleProp> list2 = vo.LIZ;
        SkuPanelState skuPanelState2 = getVm().LJLL;
        if (skuPanelState2 != null) {
            strArr = skuPanelState2.getCheckedSkuIds();
        } else {
            strArr = null;
        }
        skuInteraction.LIZLLL(eCBaseFragment, list2, strArr, getStyle());
        SkcInfo skcInfo = vo.LIZJ;
        List<SaleProp> list3 = vo.LIZ;
        int i = 0;
        for (SaleProp saleProp : list3) {
            int i2 = i + 1;
            C70247Rhb c70247Rhb = (C70247Rhb) ORS.LJJLJLI(this.scrapViews);
            if (c70247Rhb == null) {
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                c70247Rhb = new C70247Rhb(context, attributeSet);
            }
            c70247Rhb.setSkuStyle(getStyle());
            getSkuInteraction().LIZ(c70247Rhb, i, saleProp, list3, vo.LIZIZ, vo.LIZJ, new C70147Rfz(this, c70247Rhb, vo, skcInfo));
            ProductPackStruct productPackStruct = getVm().LJLJLLL;
            if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null && (sizeGuide = productBase.sizeGuide) != null) {
                str = sizeGuide.showSalePropId;
            } else {
                str = null;
            }
            if (o.LJ(str, saleProp.propId)) {
                tryAddSizeGuide(c70247Rhb);
            }
            ((ViewGroup) this.itemView.findViewById(R.id.k35)).addView(c70247Rhb);
            logWhenShow(c70247Rhb, saleProp, skcInfo, vo);
            attributeSet = null;
            i = i2;
        }
        Context context2 = this.itemView.getContext();
        o.LJIIIIZZ(context2, "itemView.context");
        TuxTextView tuxTextView = new TuxTextView(context2, null, 6, 0);
        tuxTextView.setTuxFont(51);
        tuxTextView.setTextColorRes(R.attr.eb);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = C7MY.LIZIZ(24);
        tuxTextView.setLayoutParams(layoutParams);
        ((ViewGroup) this.itemView.findViewById(R.id.k35)).addView(tuxTextView);
        this.noticeTextView = tuxTextView;
        updateNoticeText(vo.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
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
            java.util.List r1 = r0.LIZIZ(r3)
            r2 = 0
            java.lang.String[] r0 = new java.lang.String[r2]
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.String r0 = X.C63122Opy.LIZ(r0)
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r1 = X.RXW.LIZJ(r0, r6)
            if (r1 == 0) goto L5b
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice r0 = r1.purchaseNotice
            if (r0 == 0) goto L5d
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice r0 = r1.purchaseNotice
            java.lang.String r3 = r0.desc
        L3b:
            boolean r0 = X.C78685UuP.LJJJZ(r3)
            if (r0 == 0) goto L52
            com.bytedance.tux.input.TuxTextView r0 = r5.noticeTextView
            if (r0 != 0) goto L4e
        L45:
            com.bytedance.tux.input.TuxTextView r0 = r5.noticeTextView
            if (r0 != 0) goto L4a
        L49:
            return
        L4a:
            r0.setVisibility(r2)
            goto L49
        L4e:
            r0.setText(r3)
            goto L45
        L52:
            com.bytedance.tux.input.TuxTextView r0 = r5.noticeTextView
            if (r0 != 0) goto L57
            goto L49
        L57:
            r0.setVisibility(r4)
            goto L49
        L5b:
            r0 = r3
            goto L61
        L5d:
            if (r1 == 0) goto L5b
            java.lang.String r0 = r1.lowStockWarning
        L61:
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L3b
            if (r1 == 0) goto L3b
            java.lang.String r3 = r1.lowStockWarning
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.TtfSkuVH.updateNoticeText(java.util.List):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfSkuVH(ViewGroup parent, ECBaseFragment fragment) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a4o, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(fragment, "fragment");
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.vm$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 106));
        this.saleProps = C61878OQg.INSTANCE;
        this.skuInteraction$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 530));
        this.style$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 531));
        this.scrapViews = new LinkedList<>();
    }

    private final void logWhenShow(View view, SaleProp saleProp, SkcInfo skcInfo, RXV rxv) {
        String str;
        String str2;
        List<Skc> list;
        Skc skc;
        String[] strArr = this.defaultCheckedIds;
        boolean z = false;
        if (strArr == null) {
            strArr = new String[1];
            SkcInfo skcInfo2 = rxv.LIZJ;
            if (skcInfo2 == null || (list = skcInfo2.skcList) == null || (skc = (Skc) ORZ.LJLLLL(list)) == null || (str2 = skc.skcId) == null) {
                str2 = "";
            }
            strArr[0] = str2;
        }
        if (RXW.LIZ(rxv.LIZIZ, strArr) > 0) {
            z = true;
        }
        String str3 = saleProp.propId;
        SkcInfo skcInfo3 = rxv.LIZJ;
        if (skcInfo3 != null) {
            str = skcInfo3.skcPropertyId;
        } else {
            str = null;
        }
        if (o.LJ(str3, str)) {
            C78946Uyc.LJJIIJZLJL(view, new C70920RsS(), C69968Rd6.LJLIL, new AqS31S0210000_12(this, rxv, z, 3));
        } else {
            if (o.LJ(saleProp.hasImage, Boolean.TRUE)) {
                return;
            }
            C78946Uyc.LJJIIJZLJL(view, new C70920RsS(), C69966Rd4.LJLIL, new AqS54S0110000_12(rxv, z, 3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        if (r0 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void notifySkuChangeOuter(X.InterfaceC70268Rhw r50, int r51, java.lang.String r52, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo r53) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.TtfSkuVH.notifySkuChangeOuter(X.Rhw, int, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo):void");
    }

    public final void logClick(View view, int i, String str, RXV rxv, int i2) {
        boolean z;
        if (RXW.LIZ(rxv.LIZIZ, (String[]) ((ArrayList) getSkuInteraction().LIZIZ(null)).toArray(new String[0])) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            if (rxv.LIZIZ()) {
                C78946Uyc.LJJIIJ(view, new C70919RsR(), new AqS2S1211000_12(rxv, this, str, i2, z, 1));
            }
        } else {
            if (i != 1 || !rxv.LIZ()) {
                return;
            }
            C78946Uyc.LJJIIJ(view, new C70919RsR(), new AqS0S1011000_12(str, i2, z, 1));
        }
    }
}
