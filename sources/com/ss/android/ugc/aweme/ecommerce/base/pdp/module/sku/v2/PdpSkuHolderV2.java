package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2;

import X.AbstractC030109x;
import X.AbstractC28931Bp;
import X.AnonymousClass391;
import X.AnonymousClass636;
import X.C03090Af;
import X.C0A2;
import X.C16880lQ;
import X.C1EU;
import X.C221108m2;
import X.C26338AVi;
import X.C27425ApZ;
import X.C27426Apa;
import X.C32I;
import X.C47261Igj;
import X.C62562cu;
import X.C62822Ol8;
import X.C62850Ola;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70275Ri3;
import X.C70279Ri7;
import X.C70759Rpr;
import X.C73156SnQ;
import X.C78946Uyc;
import X.C7MY;
import X.EnumC70012Rdo;
import X.EnumC70107RfL;
import X.EnumC70209Rgz;
import X.EnumC72807Shn;
import X.L9G;
import X.ORY;
import X.ORZ;
import X.RX8;
import X.RXW;
import X.TBT;
import X.W5F;
import X.X1D;
import Y.ARunnableS48S0100000_12;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.SkuEntranceState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpSkuHolderV2 extends PdpHolder {
    public final Fragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C27425ApZ LJLJI;
    public int LJLJJI;
    public EnumC70209Rgz LJLJJL;
    public final Map<Integer, View> LJLJJLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int Q() {
        C0A2 layoutManager = ((RecyclerView) this.itemView.findViewById(R.id.isc)).getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int LLILL = linearLayoutManager.LLILL();
        int LLILLJJLI = linearLayoutManager.LLILLJJLI();
        int i = this.LJLJJI;
        if (i - LLILL < 2) {
            return Math.max(0, i - 2);
        }
        if (LLILLJJLI - i >= 2) {
            return i;
        }
        return Math.min(C47261Igj.LJJI(((RX8) getItem()).LIZJ), this.LJLJJI + 2);
    }

    public final PdpViewModel getVm() {
        return (PdpViewModel) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[] N() {
        int i;
        Object obj;
        String[] checkedSkuIds;
        List<SaleProp> list = ((RX8) getItem()).LIZ;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "";
        }
        for (int i3 = 0; i3 < i; i3++) {
            SkuPanelState skuPanelState = getVm().LJLL;
            if (skuPanelState == null || (checkedSkuIds = skuPanelState.getCheckedSkuIds()) == null || (obj = ORY.LJJJJI(i3, checkedSkuIds)) == null) {
                obj = "";
            }
            strArr[i3] = obj;
        }
        return strArr;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        AbstractC28931Bp abstractC28931Bp;
        super.onCreate();
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.isc);
        this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        ((RecyclerView) this.itemView.findViewById(R.id.isc)).setAdapter(this.LJLJI);
        ((RecyclerView) this.itemView.findViewById(R.id.isc)).setHasFixedSize(true);
        AbstractC030109x itemAnimator = ((RecyclerView) this.itemView.findViewById(R.id.isc)).getItemAnimator();
        if ((itemAnimator instanceof AbstractC28931Bp) && (abstractC28931Bp = (AbstractC28931Bp) itemAnimator) != null) {
            abstractC28931Bp.LJI = false;
        }
        C73156SnQ.LJIIIIZZ(this, getVm().LLIILII, new TBT() { // from class: X.Ri2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SkuEntranceState) obj).getSelectImage();
            }
        }, new AqS194S0100000_12(this, 56));
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        itemView.setTag(R.id.clh, new C70275Ri3());
    }

    public final void L(SpannableStringBuilder spannableStringBuilder) {
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append(", ");
        }
    }

    public final SpannableString T(String str) {
        if (str == null) {
            str = " ";
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(C1EU.LIZ(this.itemView, "itemView.context", R.attr.go)), 0, spannableString.length(), 33);
        return spannableString;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if (r0 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0131, code lost:
    
        if (r0 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018f, code lost:
    
        if (r55 != (-1)) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(int r55) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.PdpSkuHolderV2.X(int):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        SkuPanelState skuPanelState;
        String[] checkedSkuIds;
        Object LJJJ;
        ProductPackStruct productPackStruct;
        List<SaleProp> list;
        SaleProp saleProp;
        List<SalePropValue> list2;
        int i;
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        C62562cu c62562cu;
        String[] strArr;
        String[] checkedSkuIds2;
        List list3;
        String[] checkedSkuIds3;
        RX8 item = (RX8) obj;
        o.LJIIIZ(item, "item");
        List list4 = null;
        int i6 = 0;
        if (getVm().LJLLI != 0 && (skuPanelState = getVm().LJLL) != null && (checkedSkuIds = skuPanelState.getCheckedSkuIds()) != null && (LJJJ = ORY.LJJJ(checkedSkuIds)) != null && !o.LJ(LJJJ, "") && (productPackStruct = getVm().LJLJLLL) != null && (list = productPackStruct.saleProps) != null && (saleProp = (SaleProp) ORZ.LJLLLLLL(0, list)) != null && (list2 = saleProp.salePropValueList) != null) {
            i = 0;
            for (SalePropValue salePropValue : list2) {
                int i7 = i + 1;
                if (i >= 0) {
                    if (o.LJ(salePropValue.propValueId, LJJJ)) {
                        break;
                    } else {
                        i = i7;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        i = -1;
        this.LJLJJI = i;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.i5x);
        o.LJIIIIZZ(imageView, "itemView.product_image");
        if (!item.LIZJ.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        View findViewById = this.itemView.findViewById(R.id.i5x);
        ViewGroup.LayoutParams layoutParams = this.itemView.findViewById(R.id.i5x).getLayoutParams();
        float f2 = layoutParams.width;
        Image image = item.LIZIZ;
        if (image != null) {
            f = image.getRadio();
        } else {
            f = 1.0f;
        }
        layoutParams.height = (int) (f2 / f);
        findViewById.setLayoutParams(layoutParams);
        View findViewById2 = this.itemView.findViewById(R.id.jlb);
        o.LJIIIIZZ(findViewById2, "itemView.select_indicator");
        if ((!item.LIZJ.isEmpty()) && this.LJLJJI == -1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        findViewById2.setVisibility(i3);
        View findViewById3 = this.itemView.findViewById(R.id.cd9);
        o.LJIIIIZZ(findViewById3, "itemView.divider");
        if (!item.LIZJ.isEmpty()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        findViewById3.setVisibility(i4);
        View findViewById4 = this.itemView.findViewById(R.id.isc);
        o.LJIIIIZZ(findViewById4, "itemView.recycle_sku_images");
        if (!(!item.LIZJ.isEmpty())) {
            i6 = 8;
        }
        findViewById4.setVisibility(i6);
        View findViewById5 = this.itemView.findViewById(R.id.k2w);
        o.LJIIIIZZ(findViewById5, "itemView.sku_entrance_layout");
        if (item.LIZJ.isEmpty()) {
            i5 = 16;
        } else {
            i5 = 12;
        }
        C26338AVi.LJI(findViewById5, null, AnonymousClass391.LIZJ(i5), null, null, false, 29);
        if (item.LIZLLL) {
            TextView textView = (TextView) this.itemView.findViewById(R.id.jml);
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
            PdpViewModel vm = getVm();
            SkuPanelState skuPanelState2 = getVm().LJLL;
            if (skuPanelState2 != null && (checkedSkuIds3 = skuPanelState2.getCheckedSkuIds()) != null) {
                list3 = ORY.LJJZZIII(checkedSkuIds3);
            } else {
                list3 = null;
            }
            vm.getClass();
            vm.setState(new AqS178S0100000_12(list3, (List<Tab>) 71));
        }
        Image image2 = item.LIZIZ;
        if (image2 != null) {
            c62562cu = image2.toThumbFirstImageUrlModel();
        } else {
            c62562cu = null;
        }
        W5F LIZLLL = C70759Rpr.LIZLLL(c62562cu);
        LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LIZLLL.LJIILIIL = C7MY.LIZJ(this.itemView, "itemView.context", R.attr.cj);
        LIZLLL.LJIJJLI = C70759Rpr.LIZIZ;
        LIZLLL.LJJIIJ = (SmartImageView) this.itemView.findViewById(R.id.i5x);
        L9G.LIZ(LIZLLL);
        if (true ^ item.LIZJ.isEmpty()) {
            int i8 = this.LJLJJI;
            if (i8 >= 0) {
                Image image3 = (Image) ORZ.LJLLLLLL(i8, item.LIZJ);
                if (image3 != null) {
                    V(new ImageSelectData(image3, EnumC70012Rdo.SKU_ENTRANCE, EnumC70107RfL.SKU, this.LJLJJI), Integer.valueOf(this.LJLJJI));
                }
            } else {
                Image image4 = item.LIZIZ;
                if (image4 != null) {
                    V(new ImageSelectData(image4, EnumC70012Rdo.SKU_ENTRANCE, EnumC70107RfL.PRODUCT, -1), null);
                }
            }
            View findViewById6 = this.itemView.findViewById(R.id.i5x);
            o.LJIIIIZZ(findViewById6, "itemView.product_image");
            C16880lQ.LJIIJ(new Au2S19S0200000_12(this, item, 51, 42), findViewById6);
            this.itemView.findViewById(R.id.isc).post(new ARunnableS48S0100000_12(this, 95));
        } else {
            X(this.LJLJJI);
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.jml);
            SkuPanelState skuPanelState3 = getVm().LJLL;
            if (skuPanelState3 != null) {
                strArr = skuPanelState3.getCheckedSkuIds();
            } else {
                strArr = null;
            }
            textView2.setText(P(strArr, item.LIZ, this.LJLJJL));
            PdpViewModel vm2 = getVm();
            SkuPanelState skuPanelState4 = getVm().LJLL;
            if (skuPanelState4 != null && (checkedSkuIds2 = skuPanelState4.getCheckedSkuIds()) != null) {
                list4 = ORY.LJJZZIII(checkedSkuIds2);
            }
            vm2.getClass();
            vm2.setState(new AqS178S0100000_12(list4, (List<Tab>) 71));
        }
        View view = this.itemView;
        C78946Uyc.LJJIIJZLJL(view, C62850Ola.LJI(view, "itemView"), C70279Ri7.LJLIL, new AqS170S0100000_4(item, 1130));
        View findViewById7 = this.itemView.findViewById(R.id.k2w);
        o.LJIIIIZZ(findViewById7, "itemView.sku_entrance_layout");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 36), findViewById7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpSkuHolderV2(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a4p);
        this.LJLJJLL = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.LJLIL = eCBaseFragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 182));
        C27425ApZ c27425ApZ = new C27425ApZ(new AqS194S0100000_12(this, 217));
        c27425ApZ.setHasStableIds(true);
        this.LJLJI = c27425ApZ;
        this.LJLJJI = -1;
        this.LJLJJL = EnumC70209Rgz.AVAILABLE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EnumC70209Rgz U(int i, String[] strArr) {
        List<SkuItem> list;
        SaleProp saleProp;
        List<SalePropValue> list2;
        SalePropValue salePropValue;
        String str;
        Integer num;
        ProductPackStruct productPackStruct = getVm().LJLJLLL;
        if (productPackStruct == null || (num = productPackStruct.status) == null || num.intValue() != 2) {
            ProductPackStruct productPackStruct2 = getVm().LJLJLLL;
            if (productPackStruct2 == null || (list = productPackStruct2.skus) == null) {
                return EnumC70209Rgz.UNAVAILABLE;
            }
            if (strArr.length == 0) {
                return EnumC70209Rgz.ALL_STOCK_OUT;
            }
            List<SaleProp> list3 = ((RX8) getItem()).LIZ;
            if (list3 != null && (saleProp = (SaleProp) ORZ.LJLLLLLL(0, list3)) != null && (list2 = saleProp.salePropValueList) != null && (salePropValue = (SalePropValue) ORZ.LJLLLLLL(i, list2)) != null && (str = salePropValue.propValueId) != null) {
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
        return EnumC70209Rgz.UNAVAILABLE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V(ImageSelectData imageSelectData, Integer num) {
        int LJZ;
        boolean z;
        String[] strArr;
        String[] checkedSkuIds;
        EnumC70107RfL enumC70107RfL = imageSelectData.source;
        EnumC70107RfL enumC70107RfL2 = EnumC70107RfL.PRODUCT;
        if (enumC70107RfL == enumC70107RfL2) {
            LJZ = -1;
        } else {
            LJZ = ORZ.LJZ(imageSelectData.image, ((RX8) getItem()).LIZJ);
        }
        this.LJLJJI = LJZ;
        if (num != null) {
            num.intValue();
            this.LJLJJI = num.intValue();
        }
        X(this.LJLJJI);
        String[] N = N();
        List list = null;
        if (imageSelectData.source == enumC70107RfL2) {
            this.itemView.findViewById(R.id.jlb).setVisibility(0);
            C27425ApZ c27425ApZ = this.LJLJI;
            List<Image> list2 = ((RX8) getItem()).LIZJ;
            ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
            int i = 0;
            for (Image image : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    arrayList.add(new C27426Apa(image, false, U(i, N), i));
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            c27425ApZ.submitList(arrayList);
        } else {
            this.itemView.findViewById(R.id.jlb).setVisibility(4);
            C27425ApZ c27425ApZ2 = this.LJLJI;
            List<Image> list3 = ((RX8) getItem()).LIZJ;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list3, 10));
            int i3 = 0;
            for (Image image2 : list3) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    Image image3 = image2;
                    if (i3 == this.LJLJJI) {
                        z = true;
                    } else {
                        z = false;
                    }
                    EnumC70209Rgz U = U(i3, N);
                    if (z) {
                        this.LJLJJL = U;
                    }
                    arrayList2.add(new C27426Apa(image3, z, U, i3));
                    i3 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            c27425ApZ2.submitList(arrayList2);
            if (this.LJLJJI > 0) {
                RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.isc);
                o.LJIIIIZZ(recyclerView, "itemView.recycle_sku_images");
                C78946Uyc.LJJIIZI(Q(), recyclerView);
            }
        }
        getVm().LLIILII.Hv0(imageSelectData);
        TextView textView = (TextView) this.itemView.findViewById(R.id.jml);
        SkuPanelState skuPanelState = getVm().LJLL;
        if (skuPanelState != null) {
            strArr = skuPanelState.getCheckedSkuIds();
        } else {
            strArr = null;
        }
        textView.setText(P(strArr, ((RX8) getItem()).LIZ, this.LJLJJL));
        PdpViewModel vm = getVm();
        SkuPanelState skuPanelState2 = getVm().LJLL;
        if (skuPanelState2 != null && (checkedSkuIds = skuPanelState2.getCheckedSkuIds()) != null) {
            list = ORY.LJJZZIII(checkedSkuIds);
        }
        vm.getClass();
        vm.setState(new AqS178S0100000_12(list, (List<Tab>) 71));
    }

    public final void M(String str, SpannableStringBuilder spannableStringBuilder, SaleProp saleProp) {
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
                    L(spannableStringBuilder);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(saleProp.propName);
                    LIZ.append(": ");
                    spannableStringBuilder.append((CharSequence) X1D.LIZIZ(LIZ));
                    spannableStringBuilder.append((CharSequence) T(salePropValue2.propValue));
                    return;
                }
                return;
            }
            return;
        }
        L(spannableStringBuilder);
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
    public final android.text.SpannableStringBuilder P(java.lang.String[] r10, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp> r11, X.EnumC70209Rgz r12) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.PdpSkuHolderV2.P(java.lang.String[], java.util.List, X.Rgz):android.text.SpannableStringBuilder");
    }
}
