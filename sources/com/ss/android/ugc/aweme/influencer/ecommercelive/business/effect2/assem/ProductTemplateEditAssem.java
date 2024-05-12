package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem;

import X.C16880lQ;
import X.C214298b3;
import X.C45455Hsh;
import X.C47704Ins;
import X.C55749LuL;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71302Ryc;
import X.C71603S8h;
import X.C76917UGr;
import X.C78685UuP;
import X.C78926UyI;
import X.C8VC;
import X.C8YN;
import X.C9BD;
import X.C9BE;
import X.InterfaceC187177Wf;
import X.ORZ;
import X.S87;
import X.S8G;
import X.S8H;
import X.S8I;
import X.S8K;
import X.S8L;
import X.S8N;
import X.S8O;
import X.S8R;
import X.T5T;
import X.TBT;
import X.W5F;
import X.W5U;
import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ProductTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldProduct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.utils.FixedKeyboardMonitor;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ProductTemplateEditViewModel;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductTemplateEditAssem extends UISlotAssem implements S87, S8R, InterfaceC187177Wf {
    public final C214298b3 LJLL;
    public final C214298b3 LJLLI;
    public S8H LJLLILLLL;
    public FixedKeyboardMonitor LJLLJ;
    public Map<Integer, View> LJLLL = new LinkedHashMap();
    public final C55749LuL LJLJLLL = new C55749LuL(C47704Ins.LIZJ(this, C71603S8h.class, null), checkSupervisorPrepared());

    private final void initSubscribe() {
        C8YN.LJII(this, L3(), new TBT() { // from class: X.S8P
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((S8J) obj).LJLILLLLZI;
            }
        }, null, S8K.LJLIL, 6);
        C8YN.LJII(this, L3(), new TBT() { // from class: X.S8M
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((S8J) obj).LJLIL;
            }
        }, null, S8G.INSTANCE, 6);
    }

    @Override // X.InterfaceC187177Wf
    public void LLLLLILLIL() {
    }

    public void _$_clearFindViewByIdCache() {
        this.LJLLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLLL;
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

    @Override // X.S87, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int v3() {
        return R.layout.aqh;
    }

    public ProductTemplateEditAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ProductTemplateEditViewModel.class);
        this.LJLL = C78926UyI.LJ(this, LIZ, c9be, new AqS162S0100000_12(LIZ, 645), S8N.INSTANCE, null);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(BillboardGlobalViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ2, c9bd, new AqS162S0100000_12(LIZ2, 646), S8O.INSTANCE, null);
    }

    private final C71603S8h K3() {
        return (C71603S8h) this.LJLJLLL.getValue();
    }

    public final S8H H3() {
        S8H s8h = this.LJLLILLLL;
        if (s8h != null) {
            return s8h;
        }
        S8H s8h2 = null;
        try {
            s8h2 = (S8H) C8VC.LIZIZ(this, C65352Pkq.LIZ(S8H.class), null);
        } catch (Throwable unused) {
        }
        this.LJLLILLLL = s8h2;
        return s8h2;
    }

    public final BillboardGlobalViewModel I3() {
        return (BillboardGlobalViewModel) this.LJLLI.getValue();
    }

    public final ProductTemplateEditViewModel L3() {
        return (ProductTemplateEditViewModel) this.LJLL.getValue();
    }

    @Override // X.InterfaceC187177Wf
    public void S2() {
        T5T etContent = (T5T) _$_findCachedViewById(R.id.cz8);
        o.LJIIIIZZ(etContent, "etContent");
        C76917UGr.LJIILLIIL(etContent);
    }

    @Override // X.S8R
    public boolean T9() {
        TemplateFieldProduct templateFieldProduct = L3().getState().LJLIL;
        if (templateFieldProduct != null) {
            return C78685UuP.LJJJZ(templateFieldProduct.productImage);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r1 != null) goto L17;
     */
    @Override // X.S87
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem Uf() {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ProductTemplateEditViewModel r0 = r9.L3()
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ProductTemplateItem r5 = r0.LJLIL
            X.33Q r6 = r0.getState()
            X.S8J r6 = (X.S8J) r6
            java.util.List r0 = r5.LJJLJLI()
            r4 = 0
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField r8 = (com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField) r8
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldProduct r1 = r6.LJLIL
            java.lang.String r7 = ""
            if (r1 == 0) goto L21
            java.lang.String r3 = r1.productId
            if (r3 != 0) goto L22
        L21:
            r3 = r7
        L22:
            r2 = 0
            if (r1 == 0) goto L33
            java.lang.String r0 = r1.productOriginImage
            if (r0 != 0) goto L7a
            java.lang.String r0 = r1.productImage
            if (r0 != 0) goto L7a
        L2d:
            if (r1 == 0) goto L33
            java.lang.String r1 = r1.productIndex
            if (r1 != 0) goto L35
        L33:
            java.lang.String r1 = "0"
        L35:
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData r0 = r8.fieldData
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldProduct r0 = r0.fieldProduct
            if (r0 == 0) goto L47
            java.lang.String r0 = r0.productOriginImage
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldProduct r2 = new com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldProduct
            r2.<init>(r3, r7, r0, r1)
        L47:
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData r0 = r8.fieldData
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldText r1 = r0.fieldText
            r0.getClass()
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData r0 = new com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData
            r0.<init>(r1, r2)
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField r3 = com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField.L(r8, r0)
            java.util.List r0 = r5.LJJLJLI()
            r2 = 1
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField r1 = (com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField) r1
            java.lang.String r0 = r6.LJLILLLLZI
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField r1 = X.C30581Hy.LJJIJIIJIL(r1, r0)
            r0 = 2
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField[] r0 = new com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField[r0]
            r0[r4] = r3
            r0[r2] = r1
            java.util.ArrayList r1 = X.C47261Igj.LJII(r0)
            r0 = 959(0x3bf, float:1.344E-42)
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ProductTemplateItem r0 = com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ProductTemplateItem.LIZ(r5, r1, r4, r0)
            return r0
        L7a:
            r7 = r0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.ProductTemplateEditAssem.Uf():com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem");
    }

    @Override // X.S87
    public String f3() {
        View flPreviewContainer = _$_findCachedViewById(R.id.dbw);
        o.LJIIIIZZ(flPreviewContainer, "flPreviewContainer");
        return C45455Hsh.LIZIZ(flPreviewContainer);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public void onDestroy() {
        super.onDestroy();
        FixedKeyboardMonitor fixedKeyboardMonitor = this.LJLLJ;
        if (fixedKeyboardMonitor != null) {
            fixedKeyboardMonitor.LIZIZ();
        }
    }

    public final void M3(C71302Ryc c71302Ryc) {
        S8H H3;
        ProductTemplateEditViewModel L3 = L3();
        String str = c71302Ryc.LJLIL;
        String productImage = c71302Ryc.LJLJJI;
        String productImageOrigin = c71302Ryc.LJLILLLLZI;
        int i = c71302Ryc.LJLJJL;
        L3.getClass();
        o.LJIIIZ(productImage, "productImage");
        o.LJIIIZ(productImageOrigin, "productImageOrigin");
        L3.setState(new S8L(str, productImage, productImageOrigin, i));
        if (L3.getState().LJLILLLLZI.length() > 0 && (H3 = H3()) != null) {
            H3.ef();
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (!(K3().LJLIL instanceof ProductTemplateItem)) {
            return;
        }
        TemplateItem templateItem = K3().LJLIL;
        o.LJII(templateItem, "null cannot be cast to non-null type com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ProductTemplateItem");
        ProductTemplateItem productTemplateItem = (ProductTemplateItem) templateItem;
        ProductTemplateEditViewModel L3 = L3();
        L3.getClass();
        L3.LJLIL = productTemplateItem;
        L3.setState(new AqS178S0100000_12(productTemplateItem, 513));
        getActualLifecycleOwner();
        FixedKeyboardMonitor fixedKeyboardMonitor = new FixedKeyboardMonitor(this);
        this.LJLLJ = fixedKeyboardMonitor;
        fixedKeyboardMonitor.LIZ(view, this);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(productTemplateItem.LJLL());
        LJIIIIZZ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.ewm);
        C16880lQ.LLJJJ(LJIIIIZZ);
        TemplateField templateField = (TemplateField) ORZ.LJLLLLLL(1, productTemplateItem.LJJLJLI());
        if (templateField != null && (templateFieldData = templateField.fieldData) != null && (templateFieldText = templateFieldData.fieldText) != null) {
            ((TextView) _$_findCachedViewById(R.id.cz8)).setText(templateFieldText.content);
            ((TextView) _$_findCachedViewById(R.id.cz8)).setHint(templateFieldText.defaultContent);
            ((TextView) _$_findCachedViewById(R.id.cz8)).setFilters(new InputFilter[]{new InputFilter.LengthFilter(templateFieldText.limit)});
        }
        ((TextView) _$_findCachedViewById(R.id.cz8)).addTextChangedListener(new S8I(this));
        T5T etContent = (T5T) _$_findCachedViewById(R.id.cz8);
        o.LJIIIIZZ(etContent, "etContent");
        C76917UGr.LJIJJ(etContent);
        View tvSelect = _$_findCachedViewById(R.id.lxw);
        o.LJIIIIZZ(tvSelect, "tvSelect");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, productTemplateItem, 27, 42), tvSelect);
        initSubscribe();
    }
}
