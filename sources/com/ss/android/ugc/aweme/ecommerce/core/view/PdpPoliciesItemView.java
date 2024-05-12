package com.ss.android.ugc.aweme.ecommerce.core.view;

import X.C024607u;
import X.C16880lQ;
import X.C26338AVi;
import X.C26706Ady;
import X.C26715Ae7;
import X.C32151Nz;
import X.C62850Ola;
import X.C70759Rpr;
import X.C79045V0n;
import X.C7MY;
import X.O6R;
import X.SE8;
import X.UC0;
import X.W5F;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDesc;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDescBlock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.DefaultPoliciesItemViewStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.IReturnPoliciesItemViewStyle;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public class PdpPoliciesItemView extends ConstraintLayout implements c {
    public Map<Integer, View> _$_findViewCache;
    public final SE8 binding;
    public final IReturnPoliciesItemViewStyle style;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PdpPoliciesItemView(Context context) {
        this(context, null, 0, 0 == true ? 1 : 0, 14, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PdpPoliciesItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PdpPoliciesItemView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final SE8 getBinding() {
        return this.binding;
    }

    public final IReturnPoliciesItemViewStyle getStyle() {
        return this.style;
    }

    public final void setDesc(UserRightDetail userRightDetail) {
        o.LJIIIZ(userRightDetail, "userRightDetail");
        List<UserRightDesc> list = userRightDetail.userRightDesc;
        if (list != null) {
            Iterator<UserRightDesc> it = list.iterator();
            while (it.hasNext()) {
                List<UserRightDescBlock> list2 = it.next().block_list;
                if (list2 != null) {
                    LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.c7a);
                    o.LJIIIIZZ(linearLayout, "this.desc_container");
                    C26715Ae7.LIZIZ(linearLayout, list2, this.style);
                }
            }
        }
    }

    public final void setIcon(Image image) {
        int i;
        ImageView icon = (ImageView) _$_findCachedViewById(R.id.e_q);
        o.LJIIIIZZ(icon, "icon");
        if (image != null && this.style.getStartIconVisibility() == 0) {
            i = 0;
        } else {
            i = 8;
        }
        icon.setVisibility(i);
        View icon2 = _$_findCachedViewById(R.id.e_q);
        o.LJIIIIZZ(icon2, "icon");
        if (icon2.getVisibility() == 0) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context);
            LIZLLL.LJJIIJZLJL = (ImageView) _$_findCachedViewById(R.id.e_q);
            C16880lQ.LLJJJ(LIZLLL);
        }
    }

    public final void setTitle(String str) {
        if (str != null) {
            ((TextView) _$_findCachedViewById(R.id.title)).setText(str);
            View title = _$_findCachedViewById(R.id.title);
            o.LJIIIIZZ(title, "title");
            C26338AVi.LJI(title, Integer.valueOf(this.style.getStartIconMarginStart()), null, null, null, false, 30);
        }
    }

    public final void setDesc(String str) {
        if (str != null) {
            View desc = _$_findCachedViewById(R.id.desc);
            o.LJIIIIZZ(desc, "desc");
            desc.setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.desc)).setText(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpPoliciesItemView(Context context, AttributeSet attributeSet, int i, Integer num) {
        super(context, attributeSet, i);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        SE8 se8 = (SE8) C024607u.LIZ(C16880lQ.LLZIL(context), R.layout.a3j, this, true, ViewDataBinding.LIZIZ(null));
        o.LJIIIIZZ(se8, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = se8;
        IReturnPoliciesItemViewStyle iReturnPoliciesItemViewStyle = (IReturnPoliciesItemViewStyle) UC0.LJIIJJI(this, "product_detail", num, null, null, 12);
        iReturnPoliciesItemViewStyle = iReturnPoliciesItemViewStyle == null ? new DefaultPoliciesItemViewStyle() : iReturnPoliciesItemViewStyle;
        this.style = iReturnPoliciesItemViewStyle;
        se8.LJIILLIIL(iReturnPoliciesItemViewStyle);
        setPadding(iReturnPoliciesItemViewStyle.getPagePaddingHorizontal(), C7MY.LIZIZ(24), iReturnPoliciesItemViewStyle.getPagePaddingHorizontal(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
    }

    public /* synthetic */ PdpPoliciesItemView(Context context, AttributeSet attributeSet, int i, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? 0 : num);
    }
}
