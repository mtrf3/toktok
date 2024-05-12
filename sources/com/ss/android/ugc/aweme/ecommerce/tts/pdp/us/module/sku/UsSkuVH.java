package com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.sku;

import X.C010402i;
import X.C03090Af;
import X.C16880lQ;
import X.C19N;
import X.C1EU;
import X.C221108m2;
import X.C26706Ady;
import X.C30591Hz;
import X.C32151Nz;
import X.C45804HyK;
import X.C47261Igj;
import X.C5H3;
import X.C62850Ola;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70053ReT;
import X.C70125Rfd;
import X.C70193Rgj;
import X.C70216Rh6;
import X.C70217Rh7;
import X.C70219Rh9;
import X.C70220RhA;
import X.C70227RhH;
import X.C70230RhK;
import X.C70231RhL;
import X.C70237RhR;
import X.C70287RiF;
import X.C70917RsP;
import X.C70918RsQ;
import X.C76732zl;
import X.C78946Uyc;
import X.C7MY;
import X.EnumC70012Rdo;
import X.EnumC70107RfL;
import X.ILT;
import X.InterfaceC70291RiJ;
import X.O6R;
import X.ORS;
import X.ORY;
import X.RWI;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS14S0102000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS5S1102000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class UsSkuVH extends PdpHolder implements InterfaceC70291RiJ, c {
    public Map<Integer, View> _$_findViewCache;
    public final ECBaseFragment fragment;
    public final LinkedList<C70287RiF> scrapViews;
    public int selectAttrRank;
    public final C5H3 style$delegate;
    public final C5H3 vm$delegate;
    public static final C70237RhR Companion = new C70237RhR();
    public static final int FIRST_TOP_MARGIN = C7MY.LIZIZ(0);
    public static final int NORMAL_BOTTOM_MARGIN = C7MY.LIZIZ(16);
    public static final long CLICK_DELAY_TIME = 1000;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH
    public boolean needDivider() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final ISpecUiStyle getStyle() {
        return (ISpecUiStyle) this.style$delegate.getValue();
    }

    public final PdpViewModel getVm() {
        return (PdpViewModel) this.vm$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final boolean hasStock() {
        String[] strArr;
        SkuPanelState skuPanelState = getVm().LJLL;
        List<SkuItem> list = null;
        if (skuPanelState != null) {
            strArr = skuPanelState.getCheckedSkuIds();
        } else {
            strArr = null;
        }
        ProductPackStruct productPackStruct = getVm().LJLJLLL;
        if (productPackStruct != null) {
            list = productPackStruct.skus;
        }
        return C70053ReT.LJIIJ(list, strArr);
    }

    public final ECBaseFragment getFragment() {
        return this.fragment;
    }

    private final Map<Integer, SaleProp> getImageAndColorItems(Map<Integer, SaleProp> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            for (Map.Entry<Integer, SaleProp> entry : map.entrySet()) {
                int intValue = entry.getKey().intValue();
                SaleProp value = entry.getValue();
                if (!o.LJ(value.hasImage, Boolean.TRUE)) {
                    Integer num = value.salePropType;
                    int value2 = ILT.COLOR.getValue();
                    if (num != null && num.intValue() == value2) {
                    }
                }
                linkedHashMap.put(Integer.valueOf(intValue), value);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        r0 = r6.propName;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        r0 = genSelectSpanString(r0, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.text.SpannableStringBuilder getSelectText(X.RWI r12) {
        /*
            r11 = this;
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp> r0 = r12.LIZ
            java.lang.String r4 = ""
            r2 = 0
            if (r0 == 0) goto L84
            java.util.Iterator r10 = r0.iterator()
            r8 = 0
        L11:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L84
            java.lang.Object r6 = r10.next()
            int r9 = r8 + 1
            r1 = 0
            if (r8 < 0) goto L80
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r6 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp) r6
            java.lang.Boolean r5 = r6.hasImage
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r0)
            if (r0 != 0) goto L77
            java.lang.Integer r7 = r6.salePropType
            X.ILT r0 = X.ILT.COLOR
            int r5 = r0.getValue()
            if (r7 != 0) goto L79
        L36:
            java.util.List<java.lang.String> r5 = r12.LJ
            if (r5 == 0) goto L42
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r1 = r5.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
        L42:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem> r0 = r12.LIZIZ
            java.util.List r0 = X.C30591Hz.LJIIIZ(r8, r6, r1, r0)
            java.util.Iterator r1 = r0.iterator()
        L4c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r5 = r1.next()
            X.Rh6 r5 = (X.C70216Rh6) r5
            boolean r0 = r5.LJFF
            if (r0 == 0) goto L4c
            java.lang.String r1 = r5.LIZIZ
            boolean r0 = r5.LJ
            android.text.SpannableString r0 = r11.genSelectSpanString(r1, r0)
            if (r0 != 0) goto L6f
        L66:
            java.lang.String r0 = r6.propName
            if (r0 != 0) goto L6b
            r0 = r4
        L6b:
            android.text.SpannableString r0 = r11.genSelectSpanString(r0, r2)
        L6f:
            r3.append(r0)
            java.lang.String r0 = " · "
            r3.append(r0)
        L77:
            r8 = r9
            goto L11
        L79:
            int r0 = r7.intValue()
            if (r0 == r5) goto L77
            goto L36
        L80:
            X.C47261Igj.LJJJJJ()
            throw r1
        L84:
            com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment r0 = r11.fragment
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L9b
            android.content.res.Resources r1 = r0.getResources()
            if (r1 == 0) goto L9b
            r0 = 2131828512(0x7f111f20, float:1.9289967E38)
            java.lang.String r0 = r1.getString(r0)
            if (r0 != 0) goto Lac
        L9b:
            java.lang.Integer r0 = r12.LJFF
            if (r0 == 0) goto La4
            r2 = 1
            java.lang.String r4 = java.lang.String.valueOf(r0)
        La4:
            android.text.SpannableString r0 = r11.genSelectSpanString(r4, r2)
            r3.append(r0)
            return r3
        Lac:
            r4 = r0
            goto L9b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.sku.UsSkuVH.getSelectText(X.RWI):android.text.SpannableStringBuilder");
    }

    private final C70287RiF getView(int i) {
        C70287RiF c70287RiF = (C70287RiF) ORS.LJJLJLI(this.scrapViews);
        if (c70287RiF == null) {
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            c70287RiF = new C70287RiF(context, this.fragment, getStyle());
        }
        C010402i c010402i = new C010402i(-1, -2);
        if (i == 0) {
            ((LinearLayout.LayoutParams) c010402i).topMargin = FIRST_TOP_MARGIN;
            ((LinearLayout.LayoutParams) c010402i).bottomMargin = NORMAL_BOTTOM_MARGIN;
        } else {
            ((LinearLayout.LayoutParams) c010402i).bottomMargin = NORMAL_BOTTOM_MARGIN;
        }
        c70287RiF.setLayoutParams(c010402i);
        return c70287RiF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(RWI item) {
        o.LJIIIZ(item, "item");
        getVm();
        ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.kau);
        o.LJIIIIZZ(viewGroup, "itemView.spu_list_layout");
        LinkedList<C70287RiF> linkedList = this.scrapViews;
        while (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            C16880lQ.LJLLL(childAt, viewGroup);
            if (childAt instanceof C70287RiF) {
                linkedList.add(childAt);
            }
        }
        C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.bds));
        C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.bdr));
        this.selectAttrRank = 0;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<SaleProp> list = item.LIZ;
        if (list != null) {
            int i = 0;
            for (SaleProp saleProp : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    SaleProp saleProp2 = saleProp;
                    List<SalePropValue> list2 = saleProp2.salePropValueList;
                    if (list2 != null && list2.size() == 1) {
                        arrayList.add(saleProp2);
                    } else {
                        List<SalePropValue> list3 = saleProp2.salePropValueList;
                        if (list3 != null && list3.size() > 1) {
                            linkedHashMap.put(Integer.valueOf(i), saleProp2);
                        }
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        if (arrayList.size() >= 1) {
            this.selectAttrRank = arrayList.size() + this.selectAttrRank;
            initSingleSkuView(item, arrayList);
        }
        if (!linkedHashMap.isEmpty()) {
            initView(item, linkedHashMap);
        }
    }

    @Override // X.InterfaceC70291RiJ
    public void onSizeGuideClick(SizeGuide sizeGuide) {
        getVm().Qw0(this.fragment, sizeGuide);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsSkuVH(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a9m);
        this._$_findViewCache = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.fragment = eCBaseFragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.vm$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 122));
        this.scrapViews = new LinkedList<>();
        this.style$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 537));
    }

    private final SpannableString genSelectSpanString(String str, boolean z) {
        SpannableString spannableString = new SpannableString(str);
        if (!hasStock()) {
            spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
        } else if (z) {
            spannableString.setSpan(new ForegroundColorSpan(C1EU.LIZ(this.itemView, "itemView.context", R.attr.go)), 0, spannableString.length(), 33);
        }
        return spannableString;
    }

    private final void initSingleSkuView(RWI rwi, List<SaleProp> list) {
        C45804HyK.LJJLL(this.itemView.findViewById(R.id.bds));
        TextView textView = (TextView) this.itemView.findViewById(R.id.ltm);
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        textView.setText(C70053ReT.LJFF(context, list));
        if (rwi.LIZLLL != null && showSizeGuide(rwi, list)) {
            C45804HyK.LJJLL(this.itemView.findViewById(R.id.ltn));
            ((TextView) this.itemView.findViewById(R.id.ltn)).setText(rwi.LIZLLL.skuSizeGuideTitle);
            View findViewById = this.itemView.findViewById(R.id.ltn);
            o.LJIIIIZZ(findViewById, "itemView.ttv_single_size_guide");
            C16880lQ.LJIIJ(new Au2S19S0200000_12(this, rwi, 24, 42), findViewById);
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJZLJL(itemView, new C70918RsQ(0), C70230RhK.LJLIL, C70219Rh9.LJLIL);
            return;
        }
        C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.ltn));
    }

    private final void initView(RWI rwi, Map<Integer, SaleProp> map) {
        Map<Integer, SaleProp> map2;
        List<SaleProp> arrayList;
        String[] strArr;
        String str;
        C76732zl c76732zl = new C76732zl();
        if (C19N.LJ("ecom_sku_select_settings", true)) {
            map2 = getImageAndColorItems(map);
        } else {
            map2 = map;
        }
        Iterator<Map.Entry<Integer, SaleProp>> it = map2.entrySet().iterator();
        int i = 0;
        while (true) {
            SizeGuide sizeGuide = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, SaleProp> next = it.next();
            int intValue = next.getKey().intValue();
            SaleProp value = next.getValue();
            this.selectAttrRank++;
            if (o.LJ(value.hasImage, Boolean.TRUE)) {
                c76732zl.element = 1;
            }
            C70287RiF view = getView(i);
            List<String> list = rwi.LJ;
            if (list != null) {
                strArr = (String[]) list.toArray(new String[0]);
            } else {
                strArr = null;
            }
            List LJIIIZ = C30591Hz.LJIIIZ(intValue, value, strArr, rwi.LIZIZ);
            SizeGuide sizeGuide2 = rwi.LIZLLL;
            if (sizeGuide2 != null) {
                str = sizeGuide2.showSalePropId;
            } else {
                str = null;
            }
            if (o.LJ(str, value.propId)) {
                sizeGuide = rwi.LIZLLL;
            }
            view.LJJLJLI(value.propName, LJIIIZ, intValue, sizeGuide, false, new AqS159S0200000_12(sizeGuide, this, 29));
            view.LJJZ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
            ((ViewGroup) this.itemView.findViewById(R.id.kau)).addView(view);
            view.setClickListener(this);
            i++;
        }
        if ((!map.isEmpty()) && map.size() > map2.size()) {
            C45804HyK.LJJLL(this.itemView.findViewById(R.id.bdr));
            ((TextView) this.itemView.findViewById(R.id.lt9)).setText(getSelectText(rwi));
            this.selectAttrRank++;
            View findViewById = this.itemView.findViewById(R.id.a9h);
            o.LJIIIIZZ(findViewById, "itemView.attr_text");
            C78946Uyc.LJJIIJZLJL(findViewById, new C70918RsQ(0), C70125Rfd.LJLIL, new AqS178S0100000_12(this, 189));
        }
        if (rwi.LIZLLL != null) {
            Collection<SaleProp> values = map.values();
            if (!(values instanceof List) || (arrayList = (List) values) == null) {
                arrayList = new ArrayList<>();
            }
            if (showSizeGuide(rwi, arrayList)) {
                C45804HyK.LJJLL(this.itemView.findViewById(R.id.lto));
                ((TextView) this.itemView.findViewById(R.id.lto)).setText(rwi.LIZLLL.skuSizeGuideTitle);
                View findViewById2 = this.itemView.findViewById(R.id.lto);
                o.LJIIIIZZ(findViewById2, "itemView.ttv_size_guide");
                C78946Uyc.LJJIIJZLJL(findViewById2, new C70918RsQ(0), C70227RhH.LJLIL, C70217Rh7.LJLIL);
                View findViewById3 = this.itemView.findViewById(R.id.lto);
                o.LJIIIIZZ(findViewById3, "itemView.ttv_size_guide");
                C16880lQ.LJIIJ(new Au2S19S0200000_12(this, rwi, 25, 42), findViewById3);
                View view2 = this.itemView;
                C78946Uyc.LJJIIJZLJL(view2, C62850Ola.LJI(view2, "itemView"), C70193Rgj.LJLIL, new AqS178S0100000_12(c76732zl, 190));
                View findViewById4 = this.itemView.findViewById(R.id.a9h);
                o.LJIIIIZZ(findViewById4, "itemView.attr_text");
                C16880lQ.LJIIJ(new Au2S20S0100000_12(CLICK_DELAY_TIME, this, 28), findViewById4);
            }
        }
        C45804HyK.LJJIJIIJIL(this.itemView.findViewById(R.id.lto));
        View view22 = this.itemView;
        C78946Uyc.LJJIIJZLJL(view22, C62850Ola.LJI(view22, "itemView"), C70193Rgj.LJLIL, new AqS178S0100000_12(c76732zl, 190));
        View findViewById42 = this.itemView.findViewById(R.id.a9h);
        o.LJIIIIZZ(findViewById42, "itemView.attr_text");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(CLICK_DELAY_TIME, this, 28), findViewById42);
    }

    private final boolean showSizeGuide(RWI rwi, List<SaleProp> list) {
        String str;
        for (SaleProp saleProp : list) {
            SizeGuide sizeGuide = rwi.LIZLLL;
            if (sizeGuide != null) {
                str = sizeGuide.showSalePropId;
            } else {
                str = null;
            }
            if (o.LJ(str, saleProp.propId)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC70291RiJ
    public void onSizeGuideShow(View view, SizeGuide sizeGuide) {
        o.LJIIIZ(sizeGuide, "sizeGuide");
        if (view != null) {
            C78946Uyc.LJJIIJZLJL(view, new C70918RsQ(0), C70231RhL.LJLIL, C70220RhA.LJLIL);
        }
    }

    @Override // X.InterfaceC70291RiJ
    public void onSpecChecked(int i, int i2, C70216Rh6 c70216Rh6) {
        String str;
        String str2;
        int i3;
        String[] checkedSkuIds;
        String str3;
        SkuPanelState skuPanelState = getVm().LJLL;
        if (skuPanelState != null && (checkedSkuIds = skuPanelState.getCheckedSkuIds()) != null) {
            Object LJJJJI = ORY.LJJJJI(i, checkedSkuIds);
            if (c70216Rh6 != null) {
                str3 = c70216Rh6.LIZ;
            } else {
                str3 = null;
            }
            if (o.LJ(LJJJJI, str3)) {
                str = "cancel";
            } else {
                str = "select";
            }
        } else {
            str = null;
        }
        C78946Uyc.LJJII(this.fragment, new C70917RsP(), new AqS5S1102000_12(str, i, i2, c70216Rh6, 1));
        if (c70216Rh6 != null && c70216Rh6.LIZJ != null) {
            Image image = c70216Rh6.LIZJ;
            if (image != null) {
                EnumC70012Rdo enumC70012Rdo = EnumC70012Rdo.SKU_ENTRANCE;
                EnumC70107RfL enumC70107RfL = EnumC70107RfL.SKU;
                if (!o.LJ(str, "cancel")) {
                    i3 = i2;
                } else {
                    i3 = -1;
                }
                getVm().qx0(i, i2, c70216Rh6.LIZ, new ImageSelectData(image, enumC70012Rdo, enumC70107RfL, i3));
                return;
            }
            return;
        }
        PdpViewModel vm = getVm();
        if (c70216Rh6 == null || (str2 = c70216Rh6.LIZ) == null) {
            str2 = "";
        }
        vm.qx0(i, i2, str2, null);
    }

    @Override // X.InterfaceC70291RiJ
    public void onSpecItemBind(View view, int i, int i2, C70216Rh6 c70216Rh6) {
        if (view != null) {
            C78946Uyc.LJJIIJZLJL(view, new C70918RsQ(0), new AqS162S0100000_12(c70216Rh6, 536), new AqS14S0102000_12(i, i2, c70216Rh6, 1));
        }
    }

    public static /* synthetic */ SpannableString genSelectSpanString$default(UsSkuVH usSkuVH, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return usSkuVH.genSelectSpanString(str, z);
    }
}
