package com.ss.android.ugc.aweme.ecommerce.core.view.speclayout;

import X.C27162AlK;
import X.C32151Nz;
import X.C70288RiG;
import X.C72545SdZ;
import X.C79045V0n;
import X.O6R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecUiStyle;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TextSpecVH extends AbsFullSpanVH {
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
        int noStockTextBg;
        C70288RiG item = (C70288RiG) obj;
        o.LJIIIZ(item, "item");
        ((TextView) _$_findCachedViewById(R.id.as7)).setText(item.LJLIL);
        if (item.LJLJI) {
            if (item.LJLILLLLZI) {
                noStockTextBg = this.LJLIL.getCheckedTextBg();
            } else {
                noStockTextBg = this.LJLIL.getNoStockAndCheckedTextBg();
            }
        } else if (item.LJLILLLLZI) {
            noStockTextBg = this.LJLIL.getNormalTextBg();
        } else {
            noStockTextBg = this.LJLIL.getNoStockTextBg();
        }
        _$_findCachedViewById(R.id.k9a).setBackgroundResource(noStockTextBg);
        ((TextView) _$_findCachedViewById(R.id.as7)).getPaint().setFlags(0);
        if (item.LJLJI) {
            if (item.LJLILLLLZI) {
                Context context = this.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                Integer LJI = C79045V0n.LJI(this.LJLIL.getTextCheckedColor(), context);
                if (LJI != null) {
                    ((TextView) _$_findCachedViewById(R.id.as7)).setTextColor(LJI.intValue());
                }
            } else {
                Context context2 = this.itemView.getContext();
                o.LJIIIIZZ(context2, "itemView.context");
                Integer LJI2 = C79045V0n.LJI(this.LJLIL.getTextNoStockAndCheckColor(), context2);
                if (LJI2 != null) {
                    ((TextView) _$_findCachedViewById(R.id.as7)).setTextColor(LJI2.intValue());
                }
                if (this.LJLIL.getTextStrikeThrough()) {
                    ((TextView) _$_findCachedViewById(R.id.as7)).getPaint().setFlags(16);
                    ((TextView) _$_findCachedViewById(R.id.as7)).getPaint().setAntiAlias(true);
                }
            }
        } else if (item.LJLILLLLZI) {
            Context context3 = this.itemView.getContext();
            o.LJIIIIZZ(context3, "itemView.context");
            Integer LJI3 = C79045V0n.LJI(this.LJLIL.getTextNormalColor(), context3);
            if (LJI3 != null) {
                ((TextView) _$_findCachedViewById(R.id.as7)).setTextColor(LJI3.intValue());
            }
        } else {
            Context context4 = this.itemView.getContext();
            o.LJIIIIZZ(context4, "itemView.context");
            Integer LJI4 = C79045V0n.LJI(this.LJLIL.getTextNoStockColor(), context4);
            if (LJI4 != null) {
                ((TextView) _$_findCachedViewById(R.id.as7)).setTextColor(LJI4.intValue());
            }
            if (this.LJLIL.getTextStrikeThrough()) {
                ((TextView) _$_findCachedViewById(R.id.as7)).getPaint().setFlags(16);
                ((TextView) _$_findCachedViewById(R.id.as7)).getPaint().setAntiAlias(true);
            }
        }
        int LJJIIZ = (C27162AlK.LIZ - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)) * 2)) - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)) * 2);
        if (LJJIIZ > 0) {
            ((TextView) _$_findCachedViewById(R.id.as7)).setMaxWidth(LJJIIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSpecVH(ViewGroup parent, ISpecUiStyle style) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a0p, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(style, "style");
        this.LJLILLLLZI = new LinkedHashMap();
        this.LJLIL = style;
    }
}
