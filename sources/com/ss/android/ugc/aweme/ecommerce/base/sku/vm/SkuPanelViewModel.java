package com.ss.android.ugc.aweme.ecommerce.base.sku.vm;

import X.C113554cx;
import X.C221108m2;
import X.C26059AKp;
import X.C26867AgZ;
import X.C27504Aqq;
import X.C27739Aud;
import X.C32I;
import X.C47261Igj;
import X.C51029K0z;
import X.C52289Kfd;
import X.C52310Kfy;
import X.C53231Kup;
import X.C61878OQg;
import X.C62822Ol8;
import X.C65330PkU;
import X.C65352Pkq;
import X.C68322mC;
import X.C69991RdT;
import X.C69995RdX;
import X.C70024Re0;
import X.C70034ReA;
import X.C70053ReT;
import X.C70224RhE;
import X.C70307RiZ;
import X.C70313Rif;
import X.C70404Rk8;
import X.C70522Rm2;
import X.C70919RsR;
import X.C70925RsX;
import X.C73411SrX;
import X.C76542zS;
import X.C76800UCe;
import X.C78897Uxp;
import X.C78946Uyc;
import X.C78983UzD;
import X.C79234V7u;
import X.C79853Bl;
import X.EnumC70239RhT;
import X.InterfaceC60061Nhh;
import X.InterfaceC69847Rb9;
import X.InterfaceC70070Rek;
import X.InterfaceC70386Rjq;
import X.InterfaceC70401Rk5;
import X.InterfaceC88472Yns;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.RX6;
import X.RYT;
import X.TBT;
import X.XKI;
import X.XKQ;
import X.XLL;
import Y.AfS64S0100000_12;
import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.FragmentManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.services.apm.api.IEnsure;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SKUPanelBottomText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuSaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuWidgetV2;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOptimizedV2;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS16S0010000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS2S1001000_4;
import kotlin.jvm.internal.AqS53S1200000_12;
import kotlin.jvm.internal.AqS54S0110000_12;
import kotlin.jvm.internal.AqS65S1100000_12;
import kotlin.jvm.internal.AqS99S0101000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class SkuPanelViewModel extends JediViewModel<SkuState> implements InterfaceC69847Rb9, InterfaceC60061Nhh, InterfaceC70401Rk5 {
    public Image LJLJLJ;
    public ProductPrice LJLJLLL;
    public AddToCartButton LJLL;
    public SkuPanelState LJLLI;
    public SkuInfo LJLLILLLL;
    public SkuPanelStarter.SkuEnterParams LJLLJ;
    public ProductPackStruct LJLLL;
    public Boolean LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public final XLL LJZL;
    public final XLL LL;
    public final RX6 LLD;
    public boolean LLF;
    public SkuItem LLFF;
    public int LLFFF;
    public int LLFII;
    public Integer LLFZ;
    public String LLI;
    public Long LLIFFJFJJ;
    public String[] LLII;
    public C73411SrX LLIIII;
    public XKQ LLIIIILZ;
    public final List<Image> LJLJJLL = new ArrayList();
    public final List<String> LJLJL = new ArrayList();
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 503));
    public int LJZI = -1;

    public void Lv0() {
    }

    public boolean Zv0() {
        return true;
    }

    @Override // X.InterfaceC69847Rb9
    public final String[] nR() {
        throw null;
    }

    @Override // X.InterfaceC69847Rb9
    public final SkuPanelStarter.SkuEnterParams qu() {
        throw null;
    }

    @Override // X.InterfaceC69847Rb9
    public final SkuPanelState Ih0() {
        SkuPanelState skuPanelState = this.LJLLI;
        if (skuPanelState != null) {
            return SkuPanelState.copy$default(skuPanelState, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x012c, code lost:
    
        if (r3 == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jv0() {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel.Jv0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet, java.util.LinkedHashSet] */
    public final String Kv0() {
        String[] strArr;
        List<SaleProp> list;
        List list2;
        ?? LLJJ;
        SkuPanelState skuPanelState = this.LJLLI;
        if (skuPanelState != null) {
            strArr = skuPanelState.getCheckedSkuIds();
        } else {
            strArr = null;
        }
        SkuInfo skuInfo = this.LJLLILLLL;
        if (skuInfo != null) {
            list = skuInfo.salePropList;
        } else {
            list = null;
        }
        if (strArr != null) {
            list2 = ORY.LJJZZIII(strArr);
        } else {
            list2 = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list2 == null || list2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<SaleProp> it = list.iterator();
            while (it.hasNext()) {
                String str = it.next().propName;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            LLJJ = ORZ.LLJJ(arrayList);
            if (LLJJ == 0) {
                return null;
            }
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LLJJ = new LinkedHashSet();
            if (list != null) {
                for (SaleProp saleProp : list) {
                    String str2 = saleProp.propName;
                    if (str2 != null) {
                        LLJJ.add(str2);
                    }
                    List<SalePropValue> list3 = saleProp.salePropValueList;
                    if (list3 != null) {
                        Iterator<SalePropValue> it2 = list3.iterator();
                        while (it2.hasNext()) {
                            String str3 = it2.next().propValueId;
                            if (str3 != null) {
                                linkedHashMap.put(str3, saleProp.propName);
                            }
                        }
                    }
                }
            }
            if (list2 != null) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    Object obj = linkedHashMap.get(it3.next());
                    if (obj != null) {
                        LLJJ.remove(obj);
                    }
                }
            }
        }
        return (String) ORZ.LJLLL(LLJJ);
    }

    @Override // X.InterfaceC70401Rk5
    public final boolean LX() {
        Integer num;
        SkuItem skuItem = this.LLFF;
        if (skuItem == null || (num = skuItem.promotionLimitQuantity) == null || num.intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e0, code lost:
    
        if (r0 != null) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        if (r2 != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem Nv0() {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel.Nv0():com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem");
    }

    public final void Ov0() {
        AddToCartButton addToCartButton;
        ProductPackStruct productPackStruct = (ProductPackStruct) this.LJLLLL.getValue();
        if (productPackStruct != null) {
            if (C52289Kfd.LIZ()) {
                AddToCartButton addToCartButton2 = productPackStruct.addToCartButton;
                if (addToCartButton2 != null) {
                    addToCartButton = new AddToCartButton(2, addToCartButton2.clickHint, addToCartButton2.clickHintToastName, addToCartButton2.availableCount, addToCartButton2.buttonStyle);
                } else {
                    addToCartButton = null;
                }
                Wv0(ProductPackStruct.LIZ(productPackStruct, null, null, null, addToCartButton, null, null, null, null, -67108865, -1), false);
            } else {
                Wv0(productPackStruct, false);
            }
        } else if (productPackStruct == null) {
            setState(new AqS16S0010000_12(true, 13));
        }
        InterfaceC70070Rek.LJJLIIIJLJLI.getClass();
        this.LLIIII = (C73411SrX) C69991RdT.LIZ(C69995RdX.LJLILLLLZI, SkuPanelStarter.LIZIZ(this.LJLLJ), false, 0, true, Boolean.TRUE, null, 32).LIZJ.LJJJLIIL(new AfS64S0100000_12(this, 21), new AfS64S0100000_12(this, 22));
    }

    public int Qv0() {
        return C70053ReT.LJIIIIZZ(this.LJLLI, this.LLFF);
    }

    public InterfaceC70386Rjq Tv0() {
        return new C70224RhE();
    }

    public String[] Vv0() {
        String[] strArr;
        List<SkuItem> list;
        SkuInfo skuInfo;
        List<SkuItem> list2;
        SkuItem skuItem;
        Integer num;
        List<SkuItem> list3;
        SkuItem skuItem2;
        List<SkuSaleProp> list4;
        SkuPanelState skuPanelState = this.LJLLI;
        String[] strArr2 = null;
        if (skuPanelState != null) {
            strArr = skuPanelState.getCheckedSkuIds();
        } else {
            strArr = null;
        }
        SkuInfo skuInfo2 = this.LJLLILLLL;
        if (skuInfo2 != null && (list = skuInfo2.skuList) != null && list.size() == 1 && (skuInfo = this.LJLLILLLL) != null && (list2 = skuInfo.skuList) != null && (skuItem = (SkuItem) ORZ.LJLLLLLL(0, list2)) != null && (num = skuItem.stockNum) != null && num.intValue() > 0) {
            SkuInfo skuInfo3 = this.LJLLILLLL;
            if (skuInfo3 != null && (list3 = skuInfo3.skuList) != null && (skuItem2 = (SkuItem) ORZ.LJLLLLLL(0, list3)) != null && (list4 = skuItem2.skuSalePropList) != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(list4, 10));
                int i = 0;
                for (SkuSaleProp skuSaleProp : list4) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        String str = skuSaleProp.propValueId;
                        if (str == null) {
                            str = "";
                        }
                        arrayList.add(str);
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                strArr2 = (String[]) arrayList.toArray(new String[0]);
            }
            return strArr2;
        }
        return strArr;
    }

    @Override // X.InterfaceC70401Rk5
    public final boolean Z90() {
        Integer num;
        SkuItem skuItem = this.LLFF;
        if (skuItem == null || (num = skuItem.minBuyQuantity) == null || num.intValue() <= 1) {
            return false;
        }
        return true;
    }

    public final boolean bw0() {
        C70522Rm2 c70522Rm2 = C70522Rm2.LIZ;
        int LIZ = c70522Rm2.LIZ();
        if (LIZ >= C53231Kup.LIZ().maxCloseTime) {
            C76542zS.LIZJ("tiktokec_add_on_entrance_stop", new AqS2S1001000_4("cancel", LIZ, 0));
            return true;
        }
        int LIZIZ = c70522Rm2.LIZIZ();
        if (LIZIZ >= C53231Kup.LIZ().maxCloseTime) {
            C76542zS.LIZJ("tiktokec_add_on_entrance_stop", new AqS2S1001000_4("non_click", LIZIZ, 0));
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0009, code lost:
    
        if (r1 == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void cw0() {
        /*
            r3 = this;
            X.XKQ r0 = r3.LLIIIILZ
            if (r0 == 0) goto L23
            boolean r1 = r0.isActive()
            r0 = 1
            if (r1 != r0) goto L23
        Lb:
            r2 = 0
            if (r0 == 0) goto L15
            X.XKQ r0 = r3.LLIIIILZ
            if (r0 == 0) goto L15
            r0.LIZIZ(r2)
        L15:
            X.XIA r1 = X.C78613UtF.LIZJ
            X.RdD r0 = new X.RdD
            r0.<init>(r3, r2)
            X.XKQ r0 = X.C78565UsT.LJJIJ(r3, r1, r0)
            r3.LLIIIILZ = r0
            return
        L23:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel.cw0():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        if (r2 == null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ew0() {
        /*
            r17 = this;
            r1 = r17
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r2 = r1.LJLLI
            if (r2 != 0) goto Lc8
        L6:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r2 = r1.LJLLI
            r15 = 0
            if (r2 != 0) goto Lb1
        Lb:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r2 = r1.LJLLI
            if (r2 != 0) goto Lab
        Lf:
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r1.LJLLJ
            if (r0 == 0) goto La8
            int r0 = r0.getClickFrom()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L1b:
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r1.LJLLJ
            if (r0 == 0) goto La5
            java.util.HashMap r0 = r0.getTrackParams()
        L23:
            java.lang.String r3 = X.C69984RdM.LIZ(r2, r0)
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r0 = r1.LJLLI
            if (r0 == 0) goto La3
            java.lang.String r4 = r0.getSkuId()
        L2f:
            java.lang.Boolean r2 = r1.LJLLLLLL
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r2, r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r1.LJLLJ
            if (r0 == 0) goto La1
            int r0 = r0.getClickFrom()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L47:
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r1.LJLLJ
            if (r0 == 0) goto L9f
            java.util.HashMap r0 = r0.getTrackParams()
        L4f:
            java.lang.String r6 = X.C70172RgO.LIZIZ(r2, r0)
            java.lang.String r7 = "sku"
            com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter$SkuEnterParams r0 = r1.LJLLJ
            if (r0 == 0) goto L9d
            java.lang.String r8 = r0.getEnterFrom()
        L5d:
            r9 = 0
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r2 = r1.LJLLI
            if (r2 == 0) goto L9b
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo r0 = r1.LJLLILLLL
            if (r0 == 0) goto L99
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem> r0 = r0.skuList
        L68:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r0 = r2.getFullSkuItem(r0)
            if (r0 == 0) goto L9b
            X.RjK r11 = X.C38891fp.LJJIL(r0)
        L72:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r1.LJLLL
            if (r0 == 0) goto L97
            com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo r13 = X.C77117UOj.LJJII(r0)
        L7a:
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r2 = r1.LJLLL
            if (r2 == 0) goto L93
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance r0 = r2.promotionEntrance
            if (r0 == 0) goto L93
            java.lang.String r14 = r0.daInfo
        L84:
            java.lang.String r15 = r2.daInfo
        L86:
            r16 = 704(0x2c0, float:9.87E-43)
            r10 = r9
            r12 = r9
            X.C70307RiZ.LIZIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.Re2 r0 = X.C70026Re2.LJLIL
            r1.setState(r0)
            return
        L93:
            r14 = r15
            if (r2 == 0) goto L86
            goto L84
        L97:
            r13 = r15
            goto L7a
        L99:
            r0 = r15
            goto L68
        L9b:
            r11 = r15
            goto L72
        L9d:
            r8 = r15
            goto L5d
        L9f:
            r0 = r15
            goto L4f
        La1:
            r2 = r15
            goto L47
        La3:
            r4 = r15
            goto L2f
        La5:
            r0 = r15
            goto L23
        La8:
            r2 = r15
            goto L1b
        Lab:
            r0 = 5
            r2.setCloseFrom(r0)
            goto Lf
        Lb1:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo r0 = r1.LJLLILLLL
            if (r0 == 0) goto Lc6
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem> r0 = r0.skuList
        Lb7:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r0 = r2.getFullSkuItem(r0)
            if (r0 == 0) goto Lc4
            java.lang.String r0 = r0.skuId
        Lbf:
            r2.setSkuId(r0)
            goto Lb
        Lc4:
            r0 = r15
            goto Lbf
        Lc6:
            r0 = r15
            goto Lb7
        Lc8:
            r0 = 0
            r2.setBackToPdp(r0)
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel.ew0():void");
    }

    public final String[] fw0() {
        List list;
        List<SaleProp> list2;
        SalePropValue salePropValue;
        String str;
        String[] checkedSkuIds;
        if (this.LJLLL != null) {
            SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLLJ;
            if (skuEnterParams == null || skuEnterParams.getCheckedSkuIds() == null) {
                return null;
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.LJLLJ;
            if (skuEnterParams2 != null && (checkedSkuIds = skuEnterParams2.getCheckedSkuIds()) != null) {
                list = ORY.LJLIIIL(checkedSkuIds);
            } else {
                list = C61878OQg.INSTANCE;
            }
            if (!list.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                HashMap hashMap = new HashMap();
                for (Object obj : list) {
                    hashMap.put(obj, obj);
                }
                ProductPackStruct productPackStruct = this.LJLLL;
                if (productPackStruct != null && (list2 = productPackStruct.saleProps) != null) {
                    Iterator<SaleProp> it = list2.iterator();
                    while (it.hasNext()) {
                        List<SalePropValue> list3 = it.next().salePropValueList;
                        if (list3 != null) {
                            Iterator<SalePropValue> it2 = list3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    salePropValue = it2.next();
                                    if (hashMap.get(salePropValue.propValueId) != null) {
                                        break;
                                    }
                                } else {
                                    salePropValue = null;
                                    break;
                                }
                            }
                            SalePropValue salePropValue2 = salePropValue;
                            if (salePropValue2 != null && (str = salePropValue2.propValueId) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
                list = arrayList;
            }
            return (String[]) list.toArray(new String[0]);
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams3 = this.LJLLJ;
        if (skuEnterParams3 == null) {
            return null;
        }
        return skuEnterParams3.getCheckedSkuIds();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final SkuState kv0() {
        return new SkuState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, false, null, null, null, false, null, null, null, false, null, null, null, null, Integer.MAX_VALUE, null);
    }

    public SkuPanelViewModel() {
        XKI xki = XKI.DROP_LATEST;
        this.LJZL = C79853Bl.LIZ(0, 1, xki, 1);
        this.LL = C79853Bl.LIZ(0, 1, xki, 1);
        this.LLD = new RX6();
        this.LLFFF = 1;
        this.LLFII = 1;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C73411SrX c73411SrX = this.LLIIII;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LLIIII = null;
        C26059AKp.LIZ().LIZIZ("ec_send_sku_params_v2", this);
        EventCenter.LJ().LIZIZ("ec_send_sku_params", this);
        EventCenter.LJ().LIZIZ("ec_sku_panel_keyboard_show", this);
        C26059AKp.LIZ().LIZIZ("ec_localized_size_changed", this);
        RX6 rx6 = this.LLD;
        rx6.LIZ.clear();
        rx6.LIZIZ.clear();
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final void onStart() {
        super.onStart();
        C26059AKp.LIZ().LIZJ("ec_send_sku_params_v2", this);
        EventCenter.LJ().LIZJ("ec_send_sku_params", this);
        EventCenter.LJ().LIZJ("ec_sku_panel_keyboard_show", this);
        C26059AKp.LIZ().LIZJ("ec_localized_size_changed", this);
    }

    @Override // X.InterfaceC70401Rk5
    public final SkuInfo A70() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC70401Rk5
    public final int Kf0() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC70401Rk5
    public final int Vz() {
        return this.LLFII;
    }

    @Override // X.InterfaceC70401Rk5
    public final Integer Zm0() {
        return this.LLFZ;
    }

    @Override // X.InterfaceC70401Rk5
    public final SkuPanelStarter.SkuEnterParams ha() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC70401Rk5
    public final SkuItem xp0() {
        return this.LLFF;
    }

    public static void gw0(String str) {
        Map LJJLIL = C113554cx.LJJLIL(C70307RiZ.LIZ);
        LJJLIL.put("toast_name", str);
        C76542zS.LIZ("tiktokec_toast_show", LJJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r0 == null) goto L8;
     */
    @Override // X.InterfaceC69847Rb9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Jh(java.util.List<java.lang.String> r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r4 = r5.LJLLI
            if (r4 == 0) goto L5f
            r3 = 0
            if (r6 == 0) goto L17
            java.util.List r1 = X.ORZ.LJLL(r6)
            java.lang.String[] r0 = new java.lang.String[r3]
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L19
        L17:
            java.lang.String[] r0 = new java.lang.String[r3]
        L19:
            java.lang.String r1 = X.C63122Opy.LIZ(r0)
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r0 = r5.LJLLL
            r2 = 0
            if (r0 == 0) goto L66
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem> r0 = r0.skus
            if (r0 == 0) goto L66
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r1 = X.RXW.LIZJ(r1, r0)
        L2a:
            if (r6 == 0) goto L64
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r0 = r6.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L34:
            r4.setCheckedSkuIds(r0)
            if (r1 == 0) goto L62
            java.lang.String r0 = r1.skuId
        L3b:
            r4.setSkuId(r0)
            if (r1 == 0) goto L60
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher r0 = r1.voucherInfo
        L42:
            r4.setVoucherInfo(r0)
            if (r1 == 0) goto L49
            java.lang.String r2 = r1.warehouseId
        L49:
            r4.setWarehouseId(r2)
            r5.LLFF = r1
            if (r6 == 0) goto L5a
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r0 = r6.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 != 0) goto L5c
        L5a:
            java.lang.String[] r0 = new java.lang.String[r3]
        L5c:
            r5.kw0(r0)
        L5f:
            return
        L60:
            r0 = r2
            goto L42
        L62:
            r0 = r2
            goto L3b
        L64:
            r0 = r2
            goto L34
        L66:
            r1 = r2
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel.Jh(java.util.List):void");
    }

    public final Spannable Mv0(int i) {
        SKUPanelBottomText sKUPanelBottomText;
        boolean z;
        ProductPackStruct productPackStruct = this.LJLLL;
        if (productPackStruct != null && (sKUPanelBottomText = productPackStruct.skuPanelBottomText) != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(sKUPanelBottomText.text));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb);
            Map<String, String> map = sKUPanelBottomText.arguments;
            if (map != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : map.keySet()) {
                    String str2 = map.get(str);
                    if (str2 != null) {
                        arrayList.add(str2);
                        int indexOf = sb.indexOf(str);
                        if (indexOf == -1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        IEnsure iEnsure = C78983UzD.LJLLLL;
                        if (iEnsure != null) {
                            iEnsure.ensureFalse(z, "key not found");
                        }
                        if (indexOf >= 0) {
                            sb.replace(indexOf, str.length() + indexOf, str2);
                        }
                    }
                }
                spannableStringBuilder = new SpannableStringBuilder(sb);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int indexOf2 = sb.indexOf(str3);
                    if (indexOf2 != -1) {
                        int length = str3.length() + indexOf2;
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
                        if (indexOf2 >= 0 && length <= sb.length()) {
                            spannableStringBuilder.setSpan(foregroundColorSpan, indexOf2, length, 17);
                        }
                    }
                }
            }
            return spannableStringBuilder;
        }
        return null;
    }

    public SkuPanelBaseWidget Pv0(SkuPanelFragment fragment) {
        int i;
        o.LJIIIZ(fragment, "fragment");
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLLJ;
        if (skuEnterParams != null) {
            i = skuEnterParams.getClickFrom();
        } else {
            i = 0;
        }
        return new SkuPanelBottomWidget(i, fragment);
    }

    public SkuPanelBaseWidget Rv0(SkuPanelFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        return new SkuPanelHeaderWidget();
    }

    public SkuPanelBaseWidget Sv0(SkuPanelFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        if (C52310Kfy.LIZ()) {
            return new SkuWidgetV2(fragment);
        }
        return new SkuWidget(fragment);
    }

    public final void aw0(BaseSkuFragment baseSkuFragment) {
        ProductBase productBase;
        SizeGuide sizeGuide;
        String str;
        ProductBase productBase2;
        HashMap<String, Object> trackParams;
        ProductPackStruct productPackStruct = this.LJLLL;
        SizeGuide sizeGuide2 = null;
        if (productPackStruct == null || (productBase = productPackStruct.baseInfo) == null || (sizeGuide = productBase.sizeGuide) == null) {
            return;
        }
        String str2 = sizeGuide.skuSizeGuideSchema;
        if (str2 == null || str2.length() == 0) {
            if (baseSkuFragment == null || (str = C79234V7u.LJJIIZI(baseSkuFragment, null)) == null) {
                str = "";
                if (baseSkuFragment == null) {
                    return;
                }
            }
            FragmentManager fragmentManager = baseSkuFragment.getFragmentManager();
            if (fragmentManager != null) {
                ProductPackStruct productPackStruct2 = this.LJLLL;
                if (productPackStruct2 != null && (productBase2 = productPackStruct2.baseInfo) != null) {
                    sizeGuide2 = productBase2.sizeGuide;
                }
                C27504Aqq.LIZ(fragmentManager, str, sizeGuide2);
            }
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLLJ;
            if (skuEnterParams != null && (trackParams = skuEnterParams.getTrackParams()) != null) {
                linkedHashMap.putAll(trackParams);
            }
            if (baseSkuFragment != null) {
                for (Map.Entry<String, Object> entry : C78897Uxp.LJIJJ(baseSkuFragment).entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        linkedHashMap.put(entry.getKey(), value);
                    }
                }
            }
            linkedHashMap.put("previous_page", "sku");
            if (baseSkuFragment == null) {
                return;
            }
            Context context = baseSkuFragment.getContext();
            if (context != null) {
                C26867AgZ.LIZIZ(context, sizeGuide.skuSizeGuideSchema, C51029K0z.LJJIIZI(new OSZ("track_params", linkedHashMap)), false).open();
            }
        }
        C78946Uyc.LJJII(baseSkuFragment, new C70919RsR(), C70034ReA.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct] */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final void dw0(SkuPanelStarter.SkuRenderParams skuRenderParams) {
        ?? r1;
        String str;
        boolean z;
        Integer num;
        C68322mC c68322mC = new C68322mC();
        SkuCommonConfig skuCommonConfig = null;
        if (skuRenderParams != null) {
            r1 = skuRenderParams.getProductInfoPack();
        } else {
            r1 = 0;
        }
        c68322mC.element = r1;
        if (r1 != 0) {
            C70307RiZ.LJFF(r1);
        }
        ?? LIZ = RYT.LIZ((ProductPackStruct) c68322mC.element);
        if (LIZ != 0) {
            c68322mC.element = LIZ;
        }
        this.LJLLL = (ProductPackStruct) c68322mC.element;
        setState(new AqS178S0100000_12(c68322mC, (C68322mC<String>) 173));
        if (skuRenderParams != null) {
            String productId = skuRenderParams.getProductId();
            SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLLJ;
            if (skuEnterParams != null) {
                str = skuEnterParams.getProductId();
            } else {
                str = null;
            }
            if (o.LJ(productId, str)) {
                List<SkuItem> skuList = skuRenderParams.getSkuList();
                List<SaleProp> salePropList = skuRenderParams.getSalePropList();
                ProductPackStruct productPackStruct = (ProductPackStruct) c68322mC.element;
                if (productPackStruct != null) {
                    skuCommonConfig = productPackStruct.skuCommonConfig;
                }
                SkuInfo skuInfo = new SkuInfo(skuList, salePropList, skuCommonConfig);
                ProductPrice price = skuRenderParams.getPrice();
                Image mainPicture = skuRenderParams.getMainPicture();
                SkuPanelState skuPanelState = new SkuPanelState(skuRenderParams.getProductId(), null, false ? 1 : 0, false ? 1 : 0, skuRenderParams.getCheckedSkuIds(), skuRenderParams.getProductQuantity(), false, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, skuRenderParams.getClickSpecGroupIds(), false ? 1 : 0, false ? 1 : 0, false ? 1 : 0, 982976, false ? 1 : 0);
                String sellerId = skuRenderParams.getSellerId();
                AddToCartButton addToCartButton = skuRenderParams.getAddToCartButton();
                PdpPaymentModule paymentModule = skuRenderParams.getPaymentModule();
                String selectedAddressId = skuRenderParams.getSelectedAddressId();
                ProductPackStruct productPackStruct2 = (ProductPackStruct) c68322mC.element;
                if (productPackStruct2 == null || (num = productPackStruct2.favoriteStatus) == null || num.intValue() != 1) {
                    z = false;
                } else {
                    z = true;
                }
                Xv0(skuInfo, price, mainPicture, skuPanelState, sellerId, addToCartButton, paymentModule, selectedAddressId, z);
                jw0(this, EnumC70239RhT.SUCCESS);
            }
        }
    }

    @Override // X.InterfaceC69847Rb9
    public final void er(AqS178S0100000_12 aqS178S0100000_12) {
        JediViewModel.wv0(this, new TBT() { // from class: X.ReJ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getLocalSizeSalePropList();
            }
        }, null, new AqS178S0100000_12(aqS178S0100000_12, 457), 2, null);
    }

    public final void iw0(boolean z) {
        setState(new AqS16S0010000_12(z, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x04b2  */
    /* JADX WARN: Type inference failed for: r0v60, types: [X.Rgz, T] */
    /* JADX WARN: Type inference failed for: r0v97, types: [X.Rgz, T] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kw0(java.lang.String[] r15) {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel.kw0(java.lang.String[]):void");
    }

    public final boolean onDetectBlank(Map<String, String> params) {
        int i;
        SkuInfo skuInfo;
        List<SkuItem> list;
        List<SkuItem> list2;
        o.LJIIIZ(params, "params");
        SkuInfo skuInfo2 = this.LJLLILLLL;
        if (skuInfo2 != null && (list2 = skuInfo2.skuList) != null) {
            i = list2.size();
        } else {
            i = 0;
        }
        params.put("content_list_size", String.valueOf(i));
        SkuState lv0 = lv0();
        if (lv0.getShowLoadingView()) {
            return false;
        }
        if (lv0.getSkuDataState() == EnumC70239RhT.FAIL) {
            params.put("blank_type", "error_status");
        }
        if (this.LJLLL != null && (skuInfo = this.LJLLILLLL) != null && (list = skuInfo.skuList) != null && !list.isEmpty()) {
            return false;
        }
        params.put("blank_type", "no_meta_data");
        return true;
    }

    @Override // X.InterfaceC69847Rb9
    public final void tN(InterfaceC88472Yns<? super ProductPackStruct, C76800UCe> interfaceC88472Yns) {
        JediViewModel.wv0(this, new TBT() { // from class: X.ReB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getOriginalProductPackStruct();
            }
        }, null, new AqS178S0100000_12((InterfaceC88472Yns) interfaceC88472Yns, 174), 2, null);
    }

    @Override // X.InterfaceC69847Rb9
    public final void vs0(InterfaceC88472Yns<? super List<String>, C76800UCe> interfaceC88472Yns) {
        JediViewModel.wv0(this, new TBT() { // from class: X.ReC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuState) obj).getCheckedSkuArray();
            }
        }, null, new AqS178S0100000_12((InterfaceC88472Yns) interfaceC88472Yns, 175), 2, null);
    }

    public static void Uv0(SkuPanelViewModel skuPanelViewModel, String str) {
        skuPanelViewModel.getClass();
        skuPanelViewModel.setState(new AqS65S1100000_12(str, (Integer) null, 7));
    }

    public static void jw0(SkuPanelViewModel skuPanelViewModel, EnumC70239RhT enumC70239RhT) {
        skuPanelViewModel.getClass();
        skuPanelViewModel.setState(new AqS54S0110000_12(enumC70239RhT, false, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0231 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Hv0(java.util.Map r39, android.view.View r40) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel.Hv0(java.util.Map, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Wv0(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r52, boolean r53) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel.Wv0(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, boolean):void");
    }

    @Override // X.InterfaceC70401Rk5
    public final void Xn0(Integer num, String str) {
        setState(new AqS53S1200000_12(this, num, str, 6));
    }

    public final void hw0(int i, C70404Rk8 c70404Rk8) {
        setState(new AqS99S0101000_12(i, c70404Rk8, 9));
        SkuPanelState skuPanelState = this.LJLLI;
        if (skuPanelState != null) {
            skuPanelState.setProductQuantity(Integer.valueOf(i));
        }
        if (this.LLF) {
            cw0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        String str2;
        SkuItem skuItem;
        ProductPackStruct LIZ;
        o.LJIIIZ(eventName, "eventName");
        String str3 = null;
        SkuPanelStarter.SkuRenderParams skuRenderParams = null;
        SkuPanelStarter.SkuKeyboardVisibilityParams skuKeyboardVisibilityParams = null;
        SkuInfo skuInfo = null;
        str3 = null;
        switch (eventName.hashCode()) {
            case -1196015749:
                if (!eventName.equals("ec_localized_size_changed") || (LIZ = RYT.LIZ(this.LJLLL)) == null) {
                    return;
                }
                this.LJLLL = LIZ;
                SkuInfo skuInfo2 = this.LJLLILLLL;
                if (skuInfo2 != null) {
                    skuInfo = new SkuInfo(skuInfo2.skuList, LIZ.saleProps, skuInfo2.skuCommonConfig);
                }
                this.LJLLILLLL = skuInfo;
                setState(new AqS178S0100000_12(LIZ, 172));
                return;
            case -49893737:
                if (!eventName.equals("ec_sku_panel_keyboard_show")) {
                    return;
                }
                try {
                    Object fromJson = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LIZLLL(SkuPanelStarter.SkuKeyboardVisibilityParams.class)));
                    if (!(fromJson instanceof SkuPanelStarter.SkuKeyboardVisibilityParams)) {
                        fromJson = null;
                    }
                    skuKeyboardVisibilityParams = (SkuPanelStarter.SkuKeyboardVisibilityParams) fromJson;
                } catch (s unused) {
                }
                if (skuKeyboardVisibilityParams == null) {
                    return;
                }
                iw0(skuKeyboardVisibilityParams.getKeyboardVisibility());
                return;
            case 1117656670:
                if (!eventName.equals("ec_send_sku_params")) {
                    return;
                }
                try {
                    Object fromJson2 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(SkuPanelStarter.SkuRenderParams.class)));
                    if (!(fromJson2 instanceof SkuPanelStarter.SkuRenderParams)) {
                        fromJson2 = null;
                    }
                    skuRenderParams = (SkuPanelStarter.SkuRenderParams) fromJson2;
                } catch (s unused2) {
                }
                dw0(skuRenderParams);
                return;
            case 1523472381:
                if (eventName.equals("ec_send_sku_params_v2")) {
                    try {
                        Object fromJson3 = GsonProtectorUtils.fromJson(C27739Aud.LJFF(), str, C65330PkU.LIZJ(C65352Pkq.LJI(SkuPanelStarter.SkuRenderParams.class)));
                        if (!(fromJson3 instanceof SkuPanelStarter.SkuRenderParams)) {
                            fromJson3 = null;
                        }
                        SkuPanelStarter.SkuRenderParams skuRenderParams2 = (SkuPanelStarter.SkuRenderParams) fromJson3;
                        if (skuRenderParams2 == null) {
                            return;
                        }
                        String productId = skuRenderParams2.getProductId();
                        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLLJ;
                        if (skuEnterParams != null) {
                            str2 = skuEnterParams.getProductId();
                        } else {
                            str2 = null;
                        }
                        if (!o.LJ(productId, str2)) {
                            return;
                        }
                        SkuInfo skuInfo3 = new SkuInfo(skuRenderParams2.getSkuList(), skuRenderParams2.getSalePropList(), null);
                        ProductPrice price = skuRenderParams2.getPrice();
                        Image mainPicture = skuRenderParams2.getMainPicture();
                        String productId2 = skuRenderParams2.getProductId();
                        String str4 = null;
                        Object[] objArr = 0;
                        Object[] objArr2 = 0;
                        Object[] objArr3 = 0;
                        Object[] objArr4 = 0;
                        Object[] objArr5 = 0;
                        Object[] objArr6 = 0;
                        Object[] objArr7 = 0;
                        Object[] objArr8 = 0;
                        Object[] objArr9 = 0;
                        Object[] objArr10 = 0;
                        Object[] objArr11 = 0;
                        Object[] objArr12 = 0;
                        Object[] objArr13 = 0;
                        Object[] objArr14 = 0;
                        String[] checkedSkuIds = skuRenderParams2.getCheckedSkuIds();
                        Integer productQuantity = skuRenderParams2.getProductQuantity();
                        boolean z = false;
                        Object[] objArr15 = 0;
                        List<SkuItem> skuList = skuRenderParams2.getSkuList();
                        if (skuList != null && (skuItem = (SkuItem) ORZ.LJLLLLLL(0, skuList)) != null) {
                            str3 = skuItem.link;
                        }
                        Xv0(skuInfo3, price, mainPicture, new SkuPanelState(productId2, str4, objArr14 == true ? 1 : 0, objArr13 == true ? 1 : 0, checkedSkuIds, productQuantity, z, objArr15 == true ? 1 : 0, objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0, str3, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 1046464, objArr == true ? 1 : 0), skuRenderParams2.getSellerId(), skuRenderParams2.getAddToCartButton(), skuRenderParams2.getPaymentModule(), skuRenderParams2.getSelectedAddressId(), false);
                        jw0(this, EnumC70239RhT.SUCCESS);
                        return;
                    } catch (s unused3) {
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry] */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuVoucher] */
    public final void Iv0(Context context, String nodeId, BaseSkuFragment baseSkuFragment) {
        String str;
        boolean z;
        String str2;
        String str3;
        Integer num;
        Boolean pdpFullScreen;
        o.LJIIIZ(nodeId, "nodeId");
        this.LLIFFJFJJ = Long.valueOf(System.currentTimeMillis());
        SkuPanelState skuPanelState = this.LJLLI;
        if (skuPanelState != null) {
            skuPanelState.setBackToPdp(true);
        }
        SkuPanelState skuPanelState2 = this.LJLLI;
        if (skuPanelState2 != null) {
            skuPanelState2.setCloseFrom(1);
        }
        SkuPanelState skuPanelState3 = this.LJLLI;
        String str4 = null;
        str4 = null;
        if (skuPanelState3 != null) {
            SkuItem skuItem = this.LLFF;
            if (skuItem != null) {
                str = skuItem.skuId;
            } else {
                str = null;
            }
            skuPanelState3.setSkuId(str);
        }
        SkuPanelStarter.SkuEnterParams skuEnterParams = this.LJLLJ;
        if (skuEnterParams != null && skuEnterParams.getNeedRequest()) {
            SkuPanelState skuPanelState4 = this.LJLLI;
            if (skuPanelState4 != null) {
                skuPanelState4.setBackToPdp(false);
            }
            if (baseSkuFragment != null) {
                C78946Uyc.LJJII(baseSkuFragment, new C70925RsX(), new AqS178S0100000_12(this, 171));
            }
            C70313Rif c70313Rif = C70313Rif.LIZ;
            ProductPackStruct productPackStruct = this.LJLLL;
            SkuPanelState skuPanelState5 = this.LJLLI;
            IPdpStarter.PdpEnterParam LIZIZ = SkuPanelStarter.LIZIZ(this.LJLLJ);
            SkuPanelStarter.SkuEnterParams skuEnterParams2 = this.LJLLJ;
            if (skuEnterParams2 != null && (pdpFullScreen = skuEnterParams2.getPdpFullScreen()) != null) {
                z = pdpFullScreen.booleanValue();
            } else {
                z = false;
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams3 = this.LJLLJ;
            if (skuEnterParams3 != null) {
                str2 = skuEnterParams3.getPdpFrom();
            } else {
                str2 = null;
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams4 = this.LJLLJ;
            if (skuEnterParams4 != null) {
                str3 = skuEnterParams4.getVoucherTypeId();
            } else {
                str3 = null;
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams5 = this.LJLLJ;
            if (skuEnterParams5 != null) {
                num = skuEnterParams5.getOneStepOrderType();
            } else {
                num = null;
            }
            c70313Rif.getClass();
            str4 = null;
            C70313Rif.LIZJ(context, productPackStruct, null, skuPanelState5, LIZIZ, z, nodeId, 0, str2, str3, num, null);
        }
        Boolean bool = ECOspOptimizedV2.LIZ().optimizeCoroutine;
        if (bool != null && bool.booleanValue()) {
            SkuPanelState skuPanelState6 = this.LJLLI;
            ?? r6 = str4;
            if (skuPanelState6 != null) {
                r6 = SkuPanelState.copy$default(skuPanelState6, str4, str4, str4, str4, str4, str4, false, 0, str4, str4, str4, str4, str4, str4, str4, str4, str4, str4, this.LLIFFJFJJ, str4, 786431, str4);
            }
            SkuPanelStarter.LIZ(r6);
        }
        setState(C70024Re0.LJLIL);
    }

    public boolean Yv0(int i, String str, String str2) {
        SizeGuide sizeGuide;
        SkuInfo skuInfo;
        List<SaleProp> list;
        ProductBase productBase;
        ProductPackStruct productPackStruct = this.LJLLL;
        if (productPackStruct != null && (productBase = productPackStruct.baseInfo) != null) {
            sizeGuide = productBase.sizeGuide;
        } else {
            sizeGuide = null;
        }
        if (sizeGuide == null) {
            return false;
        }
        Integer num = sizeGuide.skuSizeGuideLoc;
        SizeGuide.Companion.getClass();
        int i2 = SizeGuide.SIZE_GUIDE_LOC_SIZE;
        if (num == null || num.intValue() != i2 || (skuInfo = this.LJLLILLLL) == null || (list = skuInfo.salePropList) == null || i != C47261Igj.LJJI(list)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ae, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Xv0(com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo r7, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice r8, com.ss.android.ugc.aweme.ecommerce.service.vo.Image r9, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState r10, java.lang.String r11, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton r12, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel.Xv0(com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPrice, com.ss.android.ugc.aweme.ecommerce.service.vo.Image, com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule, java.lang.String, boolean):void");
    }
}
