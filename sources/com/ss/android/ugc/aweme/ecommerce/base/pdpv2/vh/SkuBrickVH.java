package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh;

import X.AbstractC030109x;
import X.AbstractC27664AtQ;
import X.AbstractC28931Bp;
import X.C0A2;
import X.C16880lQ;
import X.C1EU;
import X.C27425ApZ;
import X.C27426Apa;
import X.C32I;
import X.C47261Igj;
import X.C62562cu;
import X.C70300RiS;
import X.C70759Rpr;
import X.C78946Uyc;
import X.C8YN;
import X.EnumC70012Rdo;
import X.EnumC70107RfL;
import X.EnumC70209Rgz;
import X.EnumC72807Shn;
import X.ORY;
import X.ORZ;
import X.RXW;
import X.TBT;
import X.W5F;
import X.X1D;
import Y.ARunnableS48S0100000_12;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBodyViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SkuBizData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SkuBrickVO;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuBrickVH extends BaseBrickVH<SkuBrickVO> {
    public int LJLJLLL;
    public EnumC70209Rgz LJLL;
    public final C27425ApZ LJLLI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void V() {
        AbstractC28931Bp abstractC28931Bp;
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.isc);
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        ((RecyclerView) this.itemView.findViewById(R.id.isc)).setAdapter(this.LJLLI);
        ((RecyclerView) this.itemView.findViewById(R.id.isc)).setHasFixedSize(true);
        AbstractC030109x itemAnimator = ((RecyclerView) this.itemView.findViewById(R.id.isc)).getItemAnimator();
        if ((itemAnimator instanceof AbstractC28931Bp) && (abstractC28931Bp = (AbstractC28931Bp) itemAnimator) != null) {
            abstractC28931Bp.LJI = false;
        }
        C8YN.LJII(this, L(), new TBT() { // from class: X.Ri5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C27723AuN) obj).LJLILLLLZI;
            }
        }, null, new AqS194S0100000_12(this, 207), 6);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final String getModuleName() {
        return "sku";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int f0() {
        List<Image> LJIIL;
        C0A2 layoutManager = ((RecyclerView) this.itemView.findViewById(R.id.isc)).getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int LLILL = linearLayoutManager.LLILL();
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        int i = this.LJLJLLL;
        int i2 = 0;
        if (i - LLILL < 2) {
            return Math.max(0, i - 2);
        }
        if (LLILLJJLI - i >= 2) {
            return i;
        }
        SkuBrickVO skuBrickVO = (SkuBrickVO) getItem();
        if (skuBrickVO != null && (LJIIL = skuBrickVO.LJIIL()) != null) {
            i2 = C47261Igj.LJJI(LJIIL);
        }
        return Math.min(i2, this.LJLJLLL + 2);
    }

    public SkuBrickVH() {
        super(R.layout.a4p);
        this.LJLJLLL = -1;
        this.LJLL = EnumC70209Rgz.AVAILABLE;
        C27425ApZ c27425ApZ = new C27425ApZ(new AqS194S0100000_12(this, 72));
        c27425ApZ.setHasStableIds(true);
        this.LJLLI = c27425ApZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[] a0() {
        int i;
        Object obj;
        String[] checkedSkuIds;
        SkuBizData skuBizData;
        List<SaleProp> list;
        AbstractC27664AtQ abstractC27664AtQ = (AbstractC27664AtQ) getItem();
        if (abstractC27664AtQ != null && (skuBizData = (SkuBizData) abstractC27664AtQ.LIZ()) != null && (list = skuBizData.skuProps) != null) {
            i = list.size();
        } else {
            i = 0;
        }
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "";
        }
        for (int i3 = 0; i3 < i; i3++) {
            SkuPanelState skuPanelState = N().LJLLL;
            if (skuPanelState == null || (checkedSkuIds = skuPanelState.getCheckedSkuIds()) == null || (obj = ORY.LJJJJI(i3, checkedSkuIds)) == null) {
                obj = "";
            }
            strArr[i3] = obj;
        }
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.BaseBrickVH
    public final void T(SkuBrickVO skuBrickVO) {
        SkuPanelState skuPanelState;
        String[] checkedSkuIds;
        Object LJJJ;
        AbstractC27664AtQ abstractC27664AtQ;
        SkuBizData skuBizData;
        List<SaleProp> list;
        SaleProp saleProp;
        List<SalePropValue> list2;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        String[] strArr;
        List<Image> LJIIL;
        C62562cu c62562cu;
        Image image;
        SkuBrickVO data = skuBrickVO;
        o.LJIIIZ(data, "data");
        List<SaleProp> list3 = null;
        if (L().LJLIL != 0 && (skuPanelState = N().LJLLL) != null && (checkedSkuIds = skuPanelState.getCheckedSkuIds()) != null && (LJJJ = ORY.LJJJ(checkedSkuIds)) != null && !o.LJ(LJJJ, "") && (abstractC27664AtQ = (AbstractC27664AtQ) getItem()) != null && (skuBizData = (SkuBizData) abstractC27664AtQ.LIZ()) != null && (list = skuBizData.skuProps) != null && (saleProp = (SaleProp) ORZ.LJLLLLLL(0, list)) != null && (list2 = saleProp.salePropValueList) != null) {
            i = 0;
            for (SalePropValue salePropValue : list2) {
                int i5 = i + 1;
                if (i >= 0) {
                    if (o.LJ(salePropValue.propValueId, LJJJ)) {
                        break;
                    } else {
                        i = i5;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        i = -1;
        this.LJLJLLL = i;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.i5x);
        o.LJIIIIZZ(imageView, "itemView.product_image");
        if (!data.LJIIL().isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        int i6 = 8;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        View findViewById = this.itemView.findViewById(R.id.jlb);
        o.LJIIIIZZ(findViewById, "itemView.select_indicator");
        if ((!data.LJIIL().isEmpty()) && this.LJLJLLL == -1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        findViewById.setVisibility(i3);
        View findViewById2 = this.itemView.findViewById(R.id.cd9);
        o.LJIIIIZZ(findViewById2, "itemView.divider");
        if (!data.LJIIL().isEmpty()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        findViewById2.setVisibility(i4);
        View findViewById3 = this.itemView.findViewById(R.id.isc);
        o.LJIIIIZZ(findViewById3, "itemView.recycle_sku_images");
        if (!data.LJIIL().isEmpty()) {
            i6 = 0;
        }
        findViewById3.setVisibility(i6);
        if (!data.LJIIL().isEmpty()) {
            SkuBrickVO skuBrickVO2 = (SkuBrickVO) getItem();
            if (skuBrickVO2 != null && (image = skuBrickVO2.productFirstImage) != null) {
                c62562cu = image.toThumbFirstImageUrlModel();
            } else {
                c62562cu = null;
            }
            W5F LIZLLL = C70759Rpr.LIZLLL(c62562cu);
            LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
            LIZLLL.LJIIJJI = C1EU.LIZ(this.itemView, "itemView.context", R.attr.cj);
            LIZLLL.LJIJJLI = C70759Rpr.LIZIZ;
            LIZLLL.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.i5x);
            C16880lQ.LLJJJ(LIZLLL);
        }
        SkuBrickVO skuBrickVO3 = (SkuBrickVO) getItem();
        if (skuBrickVO3 != null && (LJIIL = skuBrickVO3.LJIIL()) != null && (!LJIIL.isEmpty())) {
            if (this.LJLJLLL >= 0) {
                Image image2 = (Image) ORZ.LJLLLLLL(this.LJLJLLL, data.LJIIL());
                if (image2 != null) {
                    i0(new ImageSelectData(image2, EnumC70012Rdo.SKU_ENTRANCE, EnumC70107RfL.SKU, this.LJLJLLL), Integer.valueOf(this.LJLJLLL));
                }
            } else {
                Image image3 = data.productFirstImage;
                if (image3 != null) {
                    i0(new ImageSelectData(image3, EnumC70012Rdo.SKU_ENTRANCE, EnumC70107RfL.PRODUCT, -1), null);
                }
            }
            View findViewById4 = this.itemView.findViewById(R.id.i5x);
            o.LJIIIIZZ(findViewById4, "itemView.product_image");
            C16880lQ.LJIIJ(new Au2S19S0200000_12(this, data, 49, 42), findViewById4);
            this.itemView.findViewById(R.id.isc).post(new ARunnableS48S0100000_12(this, 83));
        } else {
            l0(this.LJLJLLL);
            TextView textView = (TextView) this.itemView.findViewById(R.id.jml);
            SkuPanelState skuPanelState2 = N().LJLLL;
            if (skuPanelState2 != null) {
                strArr = skuPanelState2.getCheckedSkuIds();
            } else {
                strArr = null;
            }
            SkuBizData LIZ = data.LIZ();
            if (LIZ != null) {
                list3 = LIZ.skuProps;
            }
            textView.setText(c0(strArr, list3, this.LJLL));
        }
        View findViewById5 = this.itemView.findViewById(R.id.k2w);
        o.LJIIIIZZ(findViewById5, "itemView.sku_entrance_layout");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 76, 42), findViewById5);
    }

    public final void X(SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append(", ");
        }
    }

    public final SpannableString g0(String str) {
        if (str == null) {
            str = " ";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(C1EU.LIZ(this.itemView, "itemView.context", R.attr.go)), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l0(int i) {
        AbstractC27664AtQ abstractC27664AtQ;
        SkuBizData skuBizData;
        List<SaleProp> list;
        SaleProp saleProp;
        List<SalePropValue> list2;
        SalePropValue salePropValue;
        String str;
        SkuPanelState skuPanelState;
        String[] a0 = a0();
        if (a0.length == 0) {
            return;
        }
        if (i == -1) {
            SkuBrickVO skuBrickVO = (SkuBrickVO) getItem();
            if (skuBrickVO != null && !skuBrickVO.LJIILIIL()) {
                a0[0] = "";
            }
        } else if (i >= 0 && (abstractC27664AtQ = (AbstractC27664AtQ) getItem()) != null && (skuBizData = (SkuBizData) abstractC27664AtQ.LIZ()) != null && (list = skuBizData.skuProps) != null && (saleProp = (SaleProp) ORZ.LJLLLLLL(0, list)) != null && (list2 = saleProp.salePropValueList) != null && (salePropValue = (SalePropValue) ORZ.LJLLLLLL(i, list2)) != null && (str = salePropValue.propValueId) != null) {
            a0[0] = str;
        }
        C70300RiS N = N();
        SkuPanelState skuPanelState2 = N().LJLLL;
        if (skuPanelState2 == null || (skuPanelState = SkuPanelState.copy$default(skuPanelState2, null, null, null, null, a0, null, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, 1048559, null)) == null) {
            skuPanelState = new SkuPanelState("", "", null, null, a0, 1, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, 1048512, null);
        }
        N.LJLLL = skuPanelState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC70209Rgz h0(int i, String[] strArr) {
        List<SkuItem> list;
        SkuBizData skuBizData;
        List<SaleProp> list2;
        SaleProp saleProp;
        List<SalePropValue> list3;
        SalePropValue salePropValue;
        String str;
        SkuBizData skuBizData2;
        if (strArr.length == 0) {
            return EnumC70209Rgz.ALL_STOCK_OUT;
        }
        AbstractC27664AtQ abstractC27664AtQ = (AbstractC27664AtQ) getItem();
        if (abstractC27664AtQ != null && (skuBizData2 = (SkuBizData) abstractC27664AtQ.LIZ()) != null) {
            list = skuBizData2.skuItems;
        } else {
            list = null;
        }
        AbstractC27664AtQ abstractC27664AtQ2 = (AbstractC27664AtQ) getItem();
        if (abstractC27664AtQ2 != null && (skuBizData = (SkuBizData) abstractC27664AtQ2.LIZ()) != null && (list2 = skuBizData.skuProps) != null && (saleProp = (SaleProp) ORZ.LJLLLLLL(0, list2)) != null && (list3 = saleProp.salePropValueList) != null && (salePropValue = (SalePropValue) ORZ.LJLLLLLL(i, list3)) != null && (str = salePropValue.propValueId) != null) {
            if (RXW.LIZ(list, new String[]{str}) == 0) {
                return EnumC70209Rgz.ALL_STOCK_OUT;
            }
            int length = strArr.length - 1;
            if (1 <= length) {
                for (int i2 = 1; o.LJ(strArr[i2], ""); i2++) {
                    if (i2 != length) {
                    }
                }
                strArr[0] = str;
                if (RXW.LIZ(list, strArr) == 0) {
                    return EnumC70209Rgz.CUR_COMBO_STOCK_OUT;
                }
                return EnumC70209Rgz.AVAILABLE;
            }
            return EnumC70209Rgz.AVAILABLE;
        }
        return EnumC70209Rgz.ALL_STOCK_OUT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i0(ImageSelectData imageSelectData, Integer num) {
        SkuBrickVO skuBrickVO;
        List<Image> LJIIL;
        int indexOf;
        ArrayList arrayList;
        List<Image> LJIIL2;
        boolean z;
        String[] strArr;
        SkuBizData skuBizData;
        ArrayList arrayList2;
        List<Image> LJIIL3;
        EnumC70107RfL enumC70107RfL = imageSelectData.source;
        EnumC70107RfL enumC70107RfL2 = EnumC70107RfL.PRODUCT;
        if (enumC70107RfL == enumC70107RfL2 || (skuBrickVO = (SkuBrickVO) getItem()) == null || (LJIIL = skuBrickVO.LJIIL()) == null) {
            indexOf = -1;
        } else {
            indexOf = LJIIL.indexOf(imageSelectData.image);
        }
        this.LJLJLLL = indexOf;
        if (num != null) {
            num.intValue();
            this.LJLJLLL = num.intValue();
        }
        l0(this.LJLJLLL);
        String[] a0 = a0();
        List<SaleProp> list = null;
        if (imageSelectData.source == enumC70107RfL2) {
            this.itemView.findViewById(R.id.jlb).setVisibility(0);
            C27425ApZ c27425ApZ = this.LJLLI;
            SkuBrickVO skuBrickVO2 = (SkuBrickVO) getItem();
            if (skuBrickVO2 != null && (LJIIL3 = skuBrickVO2.LJIIL()) != null) {
                arrayList2 = new ArrayList(C32I.LJJL(LJIIL3, 10));
                int i = 0;
                for (Image image : LJIIL3) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList2.add(new C27426Apa(image, false, h0(i, a0), i));
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            } else {
                arrayList2 = null;
            }
            c27425ApZ.submitList(arrayList2);
        } else {
            this.itemView.findViewById(R.id.jlb).setVisibility(4);
            C27425ApZ c27425ApZ2 = this.LJLLI;
            SkuBrickVO skuBrickVO3 = (SkuBrickVO) getItem();
            if (skuBrickVO3 != null && (LJIIL2 = skuBrickVO3.LJIIL()) != null) {
                arrayList = new ArrayList(C32I.LJJL(LJIIL2, 10));
                int i3 = 0;
                for (Image image2 : LJIIL2) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        Image image3 = image2;
                        if (i3 == this.LJLJLLL) {
                            z = true;
                        } else {
                            z = false;
                        }
                        EnumC70209Rgz h0 = h0(i3, a0);
                        if (z) {
                            this.LJLL = h0;
                        }
                        arrayList.add(new C27426Apa(image3, z, h0, i3));
                        i3 = i4;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            } else {
                arrayList = null;
            }
            c27425ApZ2.submitList(arrayList);
            if (this.LJLJLLL > 0) {
                RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.isc);
                o.LJIIIIZZ(recyclerView, "itemView.recycle_sku_images");
                C78946Uyc.LJJIIZI(f0(), recyclerView);
            }
        }
        PdpBodyViewModel L = L();
        L.getClass();
        L.setState(new AqS170S0100000_4(imageSelectData, 1118));
        TextView textView = (TextView) this.itemView.findViewById(R.id.jml);
        SkuPanelState skuPanelState = N().LJLLL;
        if (skuPanelState != null) {
            strArr = skuPanelState.getCheckedSkuIds();
        } else {
            strArr = null;
        }
        AbstractC27664AtQ abstractC27664AtQ = (AbstractC27664AtQ) getItem();
        if (abstractC27664AtQ != null && (skuBizData = (SkuBizData) abstractC27664AtQ.LIZ()) != null) {
            list = skuBizData.skuProps;
        }
        textView.setText(c0(strArr, list, this.LJLL));
    }

    public final void Y(String str, SpannableStringBuilder spannableStringBuilder, SaleProp saleProp) {
        SalePropValue salePropValue;
        if (!o.LJ(str, "")) {
            List<SalePropValue> list = saleProp.salePropValueList;
            if (list != null) {
                Iterator<SalePropValue> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        salePropValue = it.next();
                        if (o.LJ(salePropValue.propValueId, str)) {
                            break;
                        }
                    } else {
                        salePropValue = null;
                        break;
                    }
                }
                SalePropValue salePropValue2 = salePropValue;
                if (salePropValue2 != null) {
                    X(spannableStringBuilder);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(saleProp.propName);
                    LIZ.append(": ");
                    spannableStringBuilder.append((CharSequence) X1D.LIZIZ(LIZ));
                    spannableStringBuilder.append((CharSequence) g0(salePropValue2.propValue));
                    return;
                }
                return;
            }
            return;
        }
        X(spannableStringBuilder);
        spannableStringBuilder.append((CharSequence) saleProp.propName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
    
        if (r3 != false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder c0(java.lang.String[] r10, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp> r11, X.EnumC70209Rgz r12) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.SkuBrickVH.c0(java.lang.String[], java.util.List, X.Rgz):android.text.SpannableStringBuilder");
    }
}
