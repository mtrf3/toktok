package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku;

import X.C010402i;
import X.C03090Af;
import X.C16880lQ;
import X.C221108m2;
import X.C26706Ady;
import X.C47261Igj;
import X.C5H3;
import X.C62850Ola;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70216Rh6;
import X.C70218Rh8;
import X.C70228RhI;
import X.C70229RhJ;
import X.C70235RhP;
import X.C70287RiF;
import X.C70917RsP;
import X.C70918RsQ;
import X.C76732zl;
import X.C78946Uyc;
import X.C7MY;
import X.EnumC70012Rdo;
import X.EnumC70107RfL;
import X.InterfaceC70291RiJ;
import X.ORS;
import X.ORY;
import X.ORZ;
import X.RWH;
import X.RXW;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.GlobalSpecUiStyle;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS14S0102000_12;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS5S1102000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class GlobalSkuVH extends PdpHolder implements InterfaceC70291RiJ, c {
    public Map<Integer, View> _$_findViewCache;
    public boolean clickByUser;
    public final ECBaseFragment fragment;
    public final LinkedList<C70287RiF> scrapViews;
    public final C5H3 style$delegate;
    public final C5H3 vm$delegate;
    public static final C70235RhP Companion = new C70235RhP();
    public static final int NORMAL_BOTTOM_MARGIN = C7MY.LIZIZ(32);
    public static final int LAST_BOTTOM_MARGIN = C7MY.LIZIZ(24);

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

    private final IGlobalSkuStyle getStyle() {
        return (IGlobalSkuStyle) this.style$delegate.getValue();
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(RWH item) {
        String str;
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
        C76732zl c76732zl = new C76732zl();
        List<SaleProp> list = item.LIZ;
        if (list != null) {
            int i = 0;
            for (SaleProp saleProp : list) {
                int i2 = i + 1;
                SizeGuide sizeGuide = null;
                if (i >= 0) {
                    SaleProp saleProp2 = saleProp;
                    if (o.LJ(saleProp2.hasImage, Boolean.TRUE)) {
                        c76732zl.element = 1;
                    }
                    C70287RiF view = getView(item, i);
                    List<C70216Rh6> genItemInfoList = genItemInfoList(i, saleProp2);
                    SizeGuide sizeGuide2 = item.LIZLLL;
                    if (sizeGuide2 != null) {
                        str = sizeGuide2.showSalePropId;
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, saleProp2.propId)) {
                        sizeGuide = item.LIZLLL;
                    }
                    view.LJJLJLI(saleProp2.propName, genItemInfoList, i, sizeGuide, this.clickByUser, new AqS151S0200000_4(sizeGuide, this, 11));
                    ((ViewGroup) this.itemView.findViewById(R.id.kau)).addView(view);
                    view.setClickListener(this);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        View view2 = this.itemView;
        C78946Uyc.LJJIIJZLJL(view2, C62850Ola.LJI(view2, "itemView"), C70228RhI.LJLIL, new AqS170S0100000_4(c76732zl, 355));
    }

    @Override // X.InterfaceC70291RiJ
    public void onSizeGuideClick(SizeGuide sizeGuide) {
        getVm().Qw0(this.fragment, sizeGuide);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSkuVH(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a4z);
        this._$_findViewCache = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.fragment = eCBaseFragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.vm$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 104));
        this.scrapViews = new LinkedList<>();
        this.style$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 527));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<C70216Rh6> genItemInfoList(int i, SaleProp saleProp) {
        C70216Rh6 c70216Rh6;
        String[] strArr;
        boolean z;
        String[] strArr2;
        ArrayList arrayList = new ArrayList();
        List<SalePropValue> list = saleProp.salePropValueList;
        if (list != null && !list.isEmpty()) {
            for (SalePropValue salePropValue : list) {
                if (salePropValue.propValueId != null && salePropValue.propValue != null) {
                    Object obj = null;
                    if (i == 0 && o.LJ(saleProp.hasImage, Boolean.TRUE)) {
                        c70216Rh6 = new C70216Rh6(salePropValue.propValueId, salePropValue.propValue, salePropValue.image, false);
                    } else {
                        c70216Rh6 = new C70216Rh6(salePropValue.propValueId, salePropValue.propValue, null, false);
                    }
                    List<String> list2 = ((RWH) getItem()).LJ;
                    if (list2 != null && (strArr2 = (String[]) list2.toArray(new String[0])) != null) {
                        Object[] copyOf = Arrays.copyOf(strArr2, strArr2.length);
                        o.LJIIIIZZ(copyOf, "copyOf(this, size)");
                        strArr = (String[]) copyOf;
                    } else {
                        strArr = new String[0];
                    }
                    if (strArr.length == 0) {
                        strArr = new String[]{""};
                    }
                    strArr[i] = salePropValue.propValueId;
                    if (RXW.LIZ(((RWH) getItem()).LIZIZ, strArr) > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c70216Rh6.LJ = z;
                    List<String> list3 = ((RWH) getItem()).LJ;
                    if (list3 != null) {
                        obj = ORZ.LJLLLLLL(i, list3);
                    }
                    c70216Rh6.LJFF = o.LJ(obj, salePropValue.propValueId);
                    arrayList.add(c70216Rh6);
                }
            }
        }
        return arrayList;
    }

    private final C70287RiF getView(RWH rwh, int i) {
        int i2;
        C70287RiF c70287RiF = (C70287RiF) ORS.LJJLJLI(this.scrapViews);
        if (c70287RiF == null) {
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            c70287RiF = new C70287RiF(context, this.fragment, new GlobalSpecUiStyle());
        }
        C010402i c010402i = new C010402i(-1, -2);
        List<SaleProp> list = rwh.LIZ;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i == 0) {
            ((LinearLayout.LayoutParams) c010402i).topMargin = getStyle().getFirstSpecMarginTop();
            ((LinearLayout.LayoutParams) c010402i).bottomMargin = NORMAL_BOTTOM_MARGIN;
        } else if (i > 0 && i < i2 - 1) {
            ((LinearLayout.LayoutParams) c010402i).bottomMargin = NORMAL_BOTTOM_MARGIN;
        }
        if (i == i2 - 1) {
            ((LinearLayout.LayoutParams) c010402i).bottomMargin = LAST_BOTTOM_MARGIN;
        }
        c70287RiF.setLayoutParams(c010402i);
        return c70287RiF;
    }

    @Override // X.InterfaceC70291RiJ
    public void onSizeGuideShow(View view, SizeGuide sizeGuide) {
        o.LJIIIZ(sizeGuide, "sizeGuide");
        if (view != null) {
            C78946Uyc.LJJIIJZLJL(view, new C70918RsQ(0), C70229RhJ.LJLIL, C70218Rh8.LJLIL);
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
        C78946Uyc.LJJII(this.fragment, new C70917RsP(), new AqS5S1102000_12(str, i, i2, c70216Rh6, 0));
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
            C78946Uyc.LJJIIJZLJL(view, new C70918RsQ(0), new AqS162S0100000_12(c70216Rh6, 526), new AqS14S0102000_12(i, i2, c70216Rh6, 0));
        }
    }
}
