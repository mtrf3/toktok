package com.ss.android.ugc.aweme.ecommerce.core.view.speclayout;

import X.C27583As7;
import X.C70289RiH;
import X.C70394Rjy;
import X.C70759Rpr;
import X.C72545SdZ;
import X.C79045V0n;
import X.C7MY;
import X.EnumC72807Shn;
import X.L9G;
import X.W5F;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ImageWithTextSpecVH extends AbsFullSpanVH {
    public final ISpecUiStyle LJLIL;
    public final Map<Integer, View> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        int noStockBg;
        C70289RiH item = (C70289RiH) obj;
        o.LJIIIZ(item, "item");
        C27583As7 c27583As7 = new C27583As7();
        c27583As7.LIZJ = "sku_detail";
        c27583As7.LIZ(this.latestItemPositionInternal);
        c27583As7.LIZIZ(item.LJLIL.toThumbFirstImageUrlModel());
        W5F LJ = C70759Rpr.LJ(item.LJLIL);
        LJ.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LJ.LJIJJLI = C70759Rpr.LIZJ;
        LJ.LJIILIIL = C7MY.LIZJ(this.itemView, "itemView.context", R.attr.cj);
        LJ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.as6);
        L9G.LIZIZ(LJ, new C70394Rjy(c27583As7));
        ((TextView) _$_findCachedViewById(R.id.as7)).setText(item.LJLILLLLZI);
        if (item.LJLJJI) {
            if (item.LJLJI) {
                noStockBg = this.LJLIL.getCheckedBg();
            } else {
                noStockBg = this.LJLIL.getNoStockAndCheckedBg();
            }
        } else if (item.LJLJI) {
            noStockBg = this.LJLIL.getNormalBg();
        } else {
            noStockBg = this.LJLIL.getNoStockBg();
        }
        _$_findCachedViewById(R.id.k9a).setBackgroundResource(noStockBg);
        ((TextView) _$_findCachedViewById(R.id.as7)).getPaint().setFlags(0);
        if (item.LJLJJI) {
            if (item.LJLJI) {
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                Integer LJI = C79045V0n.LJI(this.LJLIL.getTextCheckedColor(), context);
                if (LJI != null) {
                    ((TextView) _$_findCachedViewById(R.id.as7)).setTextColor(LJI.intValue());
                }
                _$_findCachedViewById(R.id.as6).setAlpha(1.0f);
                return;
            }
            Context context2 = this.itemView.getContext();
            o.LJIIIIZZ(context2, "itemView.context");
            Integer LJI2 = C79045V0n.LJI(this.LJLIL.getTextNoStockAndCheckColor(), context2);
            if (LJI2 != null) {
                ((TextView) _$_findCachedViewById(R.id.as7)).setTextColor(LJI2.intValue());
            }
            _$_findCachedViewById(R.id.as6).setAlpha(0.5f);
            if (!this.LJLIL.getTextStrikeThrough()) {
                return;
            }
            ((TextView) _$_findCachedViewById(R.id.as7)).getPaint().setFlags(16);
            ((TextView) _$_findCachedViewById(R.id.as7)).getPaint().setAntiAlias(true);
            return;
        }
        if (item.LJLJI) {
            Context context3 = this.itemView.getContext();
            o.LJIIIIZZ(context3, "itemView.context");
            Integer LJI3 = C79045V0n.LJI(this.LJLIL.getTextNormalColor(), context3);
            if (LJI3 != null) {
                ((TextView) _$_findCachedViewById(R.id.as7)).setTextColor(LJI3.intValue());
            }
            _$_findCachedViewById(R.id.as6).setAlpha(1.0f);
            return;
        }
        Context context4 = this.itemView.getContext();
        o.LJIIIIZZ(context4, "itemView.context");
        Integer LJI4 = C79045V0n.LJI(this.LJLIL.getTextNoStockColor(), context4);
        if (LJI4 != null) {
            ((TextView) _$_findCachedViewById(R.id.as7)).setTextColor(LJI4.intValue());
        }
        _$_findCachedViewById(R.id.as6).setAlpha(0.5f);
        if (!this.LJLIL.getTextStrikeThrough()) {
            return;
        }
        ((TextView) _$_findCachedViewById(R.id.as7)).getPaint().setFlags(16);
        ((TextView) _$_findCachedViewById(R.id.as7)).getPaint().setAntiAlias(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageWithTextSpecVH(ViewGroup parent, ISpecUiStyle style) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.zj, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(style, "style");
        this.LJLILLLLZI = new LinkedHashMap();
        this.LJLIL = style;
    }
}
