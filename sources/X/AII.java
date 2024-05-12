package X;

import Y.ACListenerS24S0100000_4;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AII extends ConstraintLayout {
    public CharSequence LJLIL;
    public AET LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public AKC LJLJL;
    public View LJLJLJ;
    public final boolean LJLJLLL;
    public final AIH LJLL;
    public boolean LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;
    public final int LJLLLL;
    public final java.util.Map<Integer, View> LJLLLLLL;

    public final View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this.LJLLLLLL;
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

    public final void LJJLJLI() {
        int i;
        int i2;
        if (!this.LJLJLLL) {
            return;
        }
        View configLayout$lambda$15 = _$_findCachedViewById(R.id.l_j);
        int i3 = 0;
        if (this.LJLJJI) {
            i = this.LJLLILLLL;
            if (i <= 0) {
                i = C7MY.LIZIZ(8);
            }
        } else {
            i = 0;
        }
        int i4 = this.LJLLJ;
        if (i4 <= 0) {
            i4 = C7MY.LIZIZ(16);
        }
        if (getSubtitleIsShow()) {
            i2 = 0;
        } else {
            i2 = i4;
        }
        o.LJIIIIZZ(configLayout$lambda$15, "configLayout$lambda$15");
        C26338AVi.LJIIIZ(configLayout$lambda$15, Integer.valueOf(i), Integer.valueOf(i4), null, Integer.valueOf(i2), 20);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.ks_);
        if (getSubtitleIsShow() && _$_findCachedViewById != null) {
            if (this.LJLJJI && (i3 = this.LJLLILLLL) <= 0) {
                i3 = C7MY.LIZIZ(8);
            }
            int i5 = this.LJLLL;
            if (i5 > 0) {
                C26338AVi.LJI(_$_findCachedViewById, null, Integer.valueOf(i5), null, null, false, 29);
            } else {
                C26338AVi.LJI(_$_findCachedViewById, Integer.valueOf(i3), Integer.valueOf(C7MY.LIZIZ(6)), null, null, false, 28);
            }
        }
    }

    private final boolean getSubtitleIsShow() {
        if (_$_findCachedViewById(R.id.ks_).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final CharSequence getSubtitle() {
        return ((AppCompatTextView) _$_findCachedViewById(R.id.ks_)).getText();
    }

    public final boolean getCellEnabled() {
        return this.LJLJI;
    }

    public final View getCustomView() {
        return this.LJLJLJ;
    }

    public final AKC getInset() {
        return this.LJLJL;
    }

    public final CharSequence getTitle() {
        return this.LJLIL;
    }

    public final AET getVariant() {
        return this.LJLILLLLZI;
    }

    public final boolean getWithInfoIcon() {
        return this.LJLJJL;
    }

    public final boolean getWithSeparator() {
        return this.LJLJJLL;
    }

    private final void setAccessory(C2068389v c2068389v) {
        if (c2068389v != null) {
            ((TuxIconView) _$_findCachedViewById(R.id.mu)).setIconRes(c2068389v.LIZ);
            Integer num = c2068389v.LIZLLL;
            if (num != null) {
                ((TuxIconView) _$_findCachedViewById(R.id.mu)).setTintColor(num.intValue());
            }
            Integer num2 = c2068389v.LJ;
            if (num2 != null) {
                ((TuxIconView) _$_findCachedViewById(R.id.mu)).setTintColorRes(num2.intValue());
            }
        }
    }

    private final void setViewEnable(boolean z) {
        int i;
        int i2;
        TextView textView = (TextView) _$_findCachedViewById(R.id.lao);
        if (z) {
            i = LJJLL(this.LJLILLLLZI);
        } else {
            i = this.LJLL.LJFF;
        }
        textView.setTextColor(i);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.ks_);
        AIH aih = this.LJLL;
        if (z) {
            i2 = aih.LIZJ;
        } else {
            i2 = aih.LJFF;
        }
        textView2.setTextColor(i2);
        LJJZ(z);
        TuxIconView accessory = (TuxIconView) _$_findCachedViewById(R.id.mu);
        o.LJIIIIZZ(accessory, "accessory");
        if (z) {
            accessory.setTintColor(this.LJLLLL);
        } else {
            accessory.setTintColor(this.LJLL.LJFF);
        }
        accessory.setEnabled(z);
        if (this.LJLJI) {
            View cell_container = _$_findCachedViewById(R.id.b86);
            o.LJIIIIZZ(cell_container, "cell_container");
            C78897Uxp.LJJJJJL(cell_container, 0.0f);
            _$_findCachedViewById(R.id.mu).setClickable(false);
            return;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        ((ViewGroup) _$_findCachedViewById(R.id.b86)).setForeground(null);
    }

    private final void setWithIcon(boolean z) {
        int i;
        this.LJLJJI = z;
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.ebu);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        LJJLJLI();
    }

    public final int LJJLL(AET aet) {
        int i = AEV.LIZ[aet.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.LJLL.LIZIZ;
            }
            throw new C162476Zf();
        }
        return this.LJLL.LIZ;
    }

    public final void LJJZ(boolean z) {
        int i;
        if (!this.LJLLI) {
            TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.ebu);
            if (z) {
                int i2 = AEV.LIZ[this.LJLILLLLZI.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = this.LJLL.LJ;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    i = this.LJLL.LIZLLL;
                }
            } else {
                i = this.LJLL.LJFF;
            }
            tuxIconView.setTintColor(i);
        }
    }

    public final void setCellEnabled(boolean z) {
        this.LJLJI = z;
        setViewEnable(z);
    }

    public final void setCustomView(View view) {
        if (this.LJLJLJ != null) {
            ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.mw);
            View view2 = this.LJLJLJ;
            if (C78996UzQ.LJJIIJZLJL(view2)) {
                C78996UzQ.LJI();
            }
            viewGroup.removeView(view2);
        }
        int i = 0;
        if (view != null) {
            ((ViewGroup) _$_findCachedViewById(R.id.mw)).addView(view, 0);
        }
        this.LJLJLJ = view;
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.mu);
        if (view != null) {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public final void setIcon(C2068389v c2068389v) {
        boolean z = false;
        if (c2068389v != null) {
            ((TuxIconView) _$_findCachedViewById(R.id.ebu)).setIconRes(c2068389v.LIZ);
            this.LJLLI = false;
            Integer num = c2068389v.LIZLLL;
            if (num != null) {
                ((TuxIconView) _$_findCachedViewById(R.id.ebu)).setTintColor(num.intValue());
                this.LJLLI = true;
            }
            Integer num2 = c2068389v.LJ;
            if (num2 != null) {
                ((TuxIconView) _$_findCachedViewById(R.id.ebu)).setTintColorRes(num2.intValue());
                this.LJLLI = true;
            }
            LJJZ(this.LJLJI);
            z = true;
        }
        setWithIcon(z);
    }

    public final void setInfoIcon(C2068389v c2068389v) {
        if (c2068389v != null) {
            ((TuxIconView) _$_findCachedViewById(R.id.elx)).setIconRes(c2068389v.LIZ);
            Integer num = c2068389v.LIZLLL;
            if (num != null) {
                ((TuxIconView) _$_findCachedViewById(R.id.mu)).setTintColor(num.intValue());
            }
            Integer num2 = c2068389v.LJ;
            if (num2 != null) {
                ((TuxIconView) _$_findCachedViewById(R.id.elx)).setTintColorRes(num2.intValue());
            }
        }
    }

    public final void setInset(AKC value) {
        o.LJIIIZ(value, "value");
        this.LJLJL = value;
        int px = value.toPx();
        View cell_container = _$_findCachedViewById(R.id.b86);
        o.LJIIIIZZ(cell_container, "cell_container");
        C26338AVi.LJIIIZ(cell_container, Integer.valueOf(px), null, Integer.valueOf(px), null, 26);
    }

    public final void setShowArrow(boolean z) {
        int i;
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.mu);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public final void setSubtitle(CharSequence charSequence) {
        int visibility = _$_findCachedViewById(R.id.ks_).getVisibility();
        if (charSequence == null || charSequence.length() == 0) {
            _$_findCachedViewById(R.id.ks_).setVisibility(8);
            _$_findCachedViewById(R.id.ks_).setClickable(false);
        } else {
            ((TextView) _$_findCachedViewById(R.id.ks_)).setText(charSequence);
            _$_findCachedViewById(R.id.ks_).setVisibility(0);
            if (!(charSequence instanceof String)) {
                ((TextView) _$_findCachedViewById(R.id.ks_)).setMovementMethod(AnonymousClass898.LIZ);
                _$_findCachedViewById(R.id.ks_).setClickable(false);
                _$_findCachedViewById(R.id.ks_).setLongClickable(false);
            } else {
                ((TextView) _$_findCachedViewById(R.id.ks_)).setMovementMethod(null);
                _$_findCachedViewById(R.id.ks_).setClickable(true);
            }
        }
        if (visibility != _$_findCachedViewById(R.id.ks_).getVisibility()) {
            LJJLJLI();
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.LJLIL = charSequence;
        ((TextView) _$_findCachedViewById(R.id.lao)).setText(charSequence);
    }

    public final void setVariant(AET value) {
        o.LJIIIZ(value, "value");
        this.LJLILLLLZI = value;
        ((TextView) _$_findCachedViewById(R.id.lao)).setTextColor(LJJLL(value));
    }

    public final void setWithInfoIcon(boolean z) {
        int i;
        this.LJLJJL = z;
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.elx);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    public final void setWithSeparator(boolean z) {
        int i;
        this.LJLJJLL = z;
        View _$_findCachedViewById = _$_findCachedViewById(R.id.joq);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        _$_findCachedViewById.setVisibility(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AII(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ks);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AII(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        this.LJLLLLLL = C62850Ola.LJFF(context, "context");
        this.LJLILLLLZI = AET.NORMAL;
        this.LJLJI = true;
        AKC akc = AKC.PADDING_16;
        this.LJLJL = akc;
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c10, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.enabled, android.R.attr.checked, R.attr.sa, R.attr.sb, R.attr.sc, R.attr.sd, R.attr.se, R.attr.sf, R.attr.sg, R.attr.sh, R.attr.si, R.attr.sj, R.attr.sk, R.attr.sl, R.attr.sm, R.attr.sn, R.attr.so, R.attr.sp, R.attr.sq, R.attr.sr, R.attr.ss, R.attr.st, R.attr.su, R.attr.sv, R.attr.sw, R.attr.sx, R.attr.sy, R.attr.sz, R.attr.t0, R.attr.t1, R.attr.t2, R.attr.bq_, R.attr.bqa, R.attr.bqb, R.attr.bqc, R.attr.bqf, R.attr.brm, R.attr.bs7, R.attr.btc, R.attr.btv, R.attr.buj, R.attr.buk}, i, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…\n            0,\n        )");
        int color = obtainStyledAttributes.getColor(27, 0);
        int color2 = obtainStyledAttributes.getColor(28, 0);
        int color3 = obtainStyledAttributes.getColor(24, 0);
        int color4 = obtainStyledAttributes.getColor(14, 0);
        this.LJLL = new AIH(color, color2, color3, color4, obtainStyledAttributes.getColor(15, 0), obtainStyledAttributes.getColor(26, 0));
        this.LJLLILLLL = obtainStyledAttributes.getDimensionPixelSize(17, -1);
        this.LJLLJ = obtainStyledAttributes.getDimensionPixelSize(30, -1);
        this.LJLLL = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        obtainStyledAttributes.getColor(3, -1);
        obtainStyledAttributes.getDimensionPixelSize(6, -1);
        obtainStyledAttributes.getDimensionPixelSize(5, -1);
        obtainStyledAttributes.getDimensionPixelSize(4, -1);
        int i2 = obtainStyledAttributes.getInt(29, 0);
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.lao);
        setTitle(C16880lQ.LLLZLZ(obtainStyledAttributes, 40));
        o.LJIIIIZZ(tuxTextView, "title_tv.also {\n        …_tux_title)\n            }");
        tuxTextView.setTuxFont(i2);
        tuxTextView.setTextColor(color);
        int i3 = obtainStyledAttributes.getInt(25, 0);
        TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.ks_);
        setSubtitle(C16880lQ.LLLZLZ(obtainStyledAttributes, 39));
        o.LJIIIIZZ(tuxTextView2, "subtitle_tv.also {\n     …x_subtitle)\n            }");
        tuxTextView2.setTuxFont(i3);
        tuxTextView2.setTextColor(color3);
        int resourceId = obtainStyledAttributes.getResourceId(36, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(16, -1);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = resourceId;
        c2068389v.LIZLLL = Integer.valueOf(color4);
        setIcon(c2068389v);
        if (dimensionPixelSize > 0) {
            ((TuxIconView) _$_findCachedViewById(R.id.ebu)).setIconWidth(dimensionPixelSize);
            ((TuxIconView) _$_findCachedViewById(R.id.ebu)).setIconHeight(dimensionPixelSize);
        }
        if (resourceId != 0) {
            z = true;
        } else {
            z = false;
        }
        setWithIcon(z);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.joq);
        _$_findCachedViewById.findViewById(R.id.joq).setBackgroundColor(obtainStyledAttributes.getColor(23, 0));
        setWithSeparator(obtainStyledAttributes.getBoolean(38, false));
        setInset(akc);
        int color5 = obtainStyledAttributes.getColor(2, 0);
        this.LJLLLL = color5;
        int resourceId2 = obtainStyledAttributes.getResourceId(9, 0);
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = resourceId2;
        c2068389v2.LIZLLL = Integer.valueOf(color5);
        setAccessory(c2068389v2);
        obtainStyledAttributes.recycle();
        this.LJLJLLL = true;
        setViewEnable(true);
        LJJLJLI();
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.b86), new ACListenerS24S0100000_4(this, 116));
    }
}
