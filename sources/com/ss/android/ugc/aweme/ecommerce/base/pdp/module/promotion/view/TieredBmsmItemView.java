package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.view;

import X.C16880lQ;
import X.C221108m2;
import X.C26706Ady;
import X.C27570Aru;
import X.C5H3;
import X.C62850Ola;
import X.C70759Rpr;
import X.C79045V0n;
import X.EnumC72807Shn;
import X.OUP;
import X.W5F;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.IPromotionStyle;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class TieredBmsmItemView extends ConstraintLayout implements c {
    public Map<Integer, View> _$_findViewCache;
    public final Integer bitType;
    public final C5H3 style$delegate;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TieredBmsmItemView(Context context, Integer num) {
        this(context, num, null, 0, 12, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TieredBmsmItemView(Context context, Integer num, AttributeSet attributeSet) {
        this(context, num, attributeSet, 0, 8, null);
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

    public final IPromotionStyle getStyle() {
        return (IPromotionStyle) this.style$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final void initView(Context context, Image image, String str) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(image, "image");
        View initView$lambda$0 = _$_findCachedViewById(R.id.icq);
        o.LJIIIIZZ(initView$lambda$0, "initView$lambda$0");
        C27570Aru.LJIIIZ(initView$lambda$0, getStyle().getImageWidth());
        C27570Aru.LJII(getStyle().getImageHeight(), initView$lambda$0);
        TuxTextView initView$lambda$1 = (TuxTextView) _$_findCachedViewById(R.id.i47);
        o.LJIIIIZZ(initView$lambda$1, "initView$lambda$1");
        OUP.LJJLIIIJILLIZJL(initView$lambda$1, str);
        initView$lambda$1.setTuxFont(getStyle().getImagePriceTextFont());
        W5F LIZLLL = C70759Rpr.LIZLLL(image);
        LIZLLL.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LIZLLL.LJIJJLI = getStyle().getImageRadiusOptions();
        LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cj, context);
        LIZLLL.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.icq);
        C16880lQ.LLJJJ(LIZLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TieredBmsmItemView(Context context, Integer num, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        this.bitType = num;
        this.style$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 232));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a8e, this, true);
        setVisibility(0);
    }

    public /* synthetic */ TieredBmsmItemView(Context context, Integer num, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, num, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }
}
