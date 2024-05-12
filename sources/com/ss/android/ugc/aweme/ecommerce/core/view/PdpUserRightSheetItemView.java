package com.ss.android.ugc.aweme.ecommerce.core.view;

import X.AnonymousClass636;
import X.C024607u;
import X.C16880lQ;
import X.C26706Ady;
import X.C32151Nz;
import X.C45804HyK;
import X.C61328O5c;
import X.C62850Ola;
import X.C70759Rpr;
import X.C76800UCe;
import X.C79045V0n;
import X.C7MY;
import X.O6R;
import X.OUP;
import X.SE4;
import X.UC0;
import X.W5F;
import X.X1D;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.DefaultUserRightItemViewStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.IUserRightItemViewStyle;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class PdpUserRightSheetItemView extends ConstraintLayout implements c {
    public Map<Integer, View> _$_findViewCache;
    public final IUserRightItemViewStyle style;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PdpUserRightSheetItemView(Context context, int i, Integer num) {
        this(context, null, 0, i, num, 6, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PdpUserRightSheetItemView(Context context, AttributeSet attributeSet, int i, Integer num) {
        this(context, attributeSet, 0, i, num, 4, null);
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

    public final IUserRightItemViewStyle getStyle() {
        return this.style;
    }

    private final Integer getThemeColor(Integer num) {
        if (num == null) {
            return null;
        }
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3) {
                    return null;
                }
                return Integer.valueOf(R.drawable.agn);
            }
            return Integer.valueOf(R.drawable.ago);
        }
        return Integer.valueOf(R.drawable.agm);
    }

    private final Integer processColor(String str) {
        boolean z;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    z = false;
                    if (!z && str.charAt(0) != '#') {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append('#');
                        LIZ.append(str);
                        str = X1D.LIZIZ(LIZ);
                    }
                    return Integer.valueOf(Color.parseColor(str));
                }
            } catch (Exception unused) {
                return null;
            }
        }
        z = true;
        if (!z) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append('#');
            LIZ2.append(str);
            str = X1D.LIZIZ(LIZ2);
        }
        return Integer.valueOf(Color.parseColor(str));
    }

    public final void expandDesc(View view) {
        ((TuxIconView) view.findViewById(R.id.a7n)).setIconRes(R.raw.icon_chevron_up);
        ((TuxIconView) view.findViewById(R.id.a7n)).setTintColorRes(R.attr.gp);
        C45804HyK.LJJLL(view.findViewById(R.id.c76));
        View findViewById = view.findViewById(R.id.bex);
        o.LJIIIIZZ(findViewById, "view.click_hot_area");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, view, 11), findViewById);
    }

    public final void hideDesc(View view) {
        ((TuxIconView) view.findViewById(R.id.a7n)).setIconRes(R.raw.icon_chevron_down);
        ((TuxIconView) view.findViewById(R.id.a7n)).setTintColorRes(R.attr.gp);
        C45804HyK.LJJIJIIJIL(view.findViewById(R.id.c76));
        View findViewById = view.findViewById(R.id.bex);
        o.LJIIIIZZ(findViewById, "view.click_hot_area");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, view, 12), findViewById);
    }

    public final void setBackground(Image image) {
        if (image != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image.toImageUrlModel());
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context);
            LIZLLL.LJJIIJZLJL = (ImageView) _$_findCachedViewById(R.id.n0h);
            C16880lQ.LLJJJ(LIZLLL);
            setBackgroundResource(R.drawable.ago);
            getBackground().setAlpha(8);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C45804HyK.LJJIJIIJIL(_$_findCachedViewById(R.id.n0h));
    }

    public final void setColor(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        return;
                    }
                    setBackgroundResource(R.drawable.agn);
                    getBackground().setAlpha(8);
                    return;
                }
                setBackgroundResource(R.drawable.ago);
                getBackground().setAlpha(8);
                return;
            }
            setBackgroundResource(R.drawable.agm);
            getBackground().setAlpha(8);
        }
    }

    public final void setIcon(Icon icon) {
        Image image;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (AnonymousClass636.LJIILJJIL(context)) {
            if (icon != null) {
                image = icon.iconDark;
            } else {
                return;
            }
        } else if (icon == null) {
            return;
        } else {
            image = icon.icon;
        }
        if (image != null) {
            W5F LIZLLL = C70759Rpr.LIZLLL(image.toImageUrlModel());
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context2);
            LIZLLL.LJJIIJZLJL = (ImageView) _$_findCachedViewById(R.id.e_q);
            C16880lQ.LLJJJ(LIZLLL);
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.e_q));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0101  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setDesc(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.core.view.PdpUserRightSheetItemView.setDesc(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail, boolean):void");
    }

    public final void setHeaderBackground(Icon icon, Integer num) {
        Image image;
        Integer themeColor;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (AnonymousClass636.LJIILJJIL(context)) {
            if (icon != null) {
                image = icon.iconDark;
            }
            image = null;
        } else {
            if (icon != null) {
                image = icon.icon;
            }
            image = null;
        }
        if (image != null || num != null) {
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.n0j).getLayoutParams();
            layoutParams.height = C7MY.LIZIZ(40);
            _$_findCachedViewById(R.id.n0j).setLayoutParams(layoutParams);
            ((TuxTextView) _$_findCachedViewById(R.id.n0i)).setTuxFont(32);
            OUP.LJJJJLI(_$_findCachedViewById(R.id.e3s), null, C61328O5c.LIZJ(6), Float.valueOf(C32151Nz.LJIIZILJ(6)), 25);
            if (image != null) {
                W5F LIZLLL = C70759Rpr.LIZLLL(image.toImageUrlModel());
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                LIZLLL.LJIILIIL = C79045V0n.LJIIIIZZ(R.attr.cv, context2);
                LIZLLL.LJJIIJZLJL = (ImageView) _$_findCachedViewById(R.id.e3s);
                C16880lQ.LLJJJ(LIZLLL);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
        }
        if (this.style.getUseHeaderBackgroundThemeColor() && (themeColor = getThemeColor(num)) != null) {
            ((AppCompatImageView) _$_findCachedViewById(R.id.e3s)).setBackgroundResource(themeColor.intValue());
            _$_findCachedViewById(R.id.e3s).getBackground().setAlpha(24);
        }
    }

    public final void setDesc(String str, boolean z) {
        if (str != null) {
            if (z) {
                C45804HyK.LJJLIIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)), _$_findCachedViewById(R.id.iga));
            }
            ((TextView) _$_findCachedViewById(R.id.iga)).setText(str);
            C45804HyK.LJJLL(_$_findCachedViewById(R.id.iga));
        }
    }

    private final void setViewTextColor(TuxTextView tuxTextView, String str, String str2) {
        if (str == null) {
            return;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        if (AnonymousClass636.LJIILJJIL(context)) {
            str = str2;
        }
        Integer processColor = processColor(str);
        if (processColor != null) {
            tuxTextView.setTextColor(processColor.intValue());
        }
    }

    public final void setTitle(String str, String str2, String str3) {
        if (str != null) {
            ((TextView) _$_findCachedViewById(R.id.n0i)).setText(str);
        }
        TuxTextView user_right_sheet_title = (TuxTextView) _$_findCachedViewById(R.id.n0i);
        o.LJIIIIZZ(user_right_sheet_title, "user_right_sheet_title");
        setViewTextColor(user_right_sheet_title, str2, str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpUserRightSheetItemView(Context context, AttributeSet attributeSet, int i, int i2, Integer num) {
        super(context, attributeSet, i);
        IUserRightItemViewStyle iUserRightItemViewStyle;
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        SE4 se4 = (SE4) C024607u.LIZ(C16880lQ.LLZIL(context), R.layout.a55, this, true, ViewDataBinding.LIZIZ(null));
        o.LJIIIIZZ(se4, "inflate(LayoutInflater.from(context), this, true)");
        if (i2 == 1) {
            iUserRightItemViewStyle = new DefaultUserRightItemViewStyle();
        } else {
            iUserRightItemViewStyle = (IUserRightItemViewStyle) UC0.LJIIJJI(this, "product_detail", num, null, null, 12);
            if (iUserRightItemViewStyle == null) {
                iUserRightItemViewStyle = new DefaultUserRightItemViewStyle();
            }
        }
        this.style = iUserRightItemViewStyle;
        se4.LJIILLIIL(iUserRightItemViewStyle);
    }

    public static /* synthetic */ void setDesc$default(PdpUserRightSheetItemView pdpUserRightSheetItemView, UserRightDetail userRightDetail, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        pdpUserRightSheetItemView.setDesc(userRightDetail, z);
    }

    public static /* synthetic */ void setDesc$default(PdpUserRightSheetItemView pdpUserRightSheetItemView, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        pdpUserRightSheetItemView.setDesc(str, z);
    }

    public /* synthetic */ PdpUserRightSheetItemView(Context context, AttributeSet attributeSet, int i, int i2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, i2, num);
    }
}
