package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import o3.IDaS467S0100000_4;
import o3.h0;

/* loaded from: classes5.dex */
public final class AI8 extends LinearLayout {
    public static final int LLI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(6));
    public static final int LLIFFJFJJ = C7MY.LIZIZ(1);
    public final C62822Ol8 LJLIL;
    public boolean LJLILLLLZI;
    public CharSequence LJLJI;
    public int LJLJJI;
    public AI9 LJLJJL;
    public boolean LJLJJLL;
    public AKC LJLJL;
    public CharSequence LJLJLJ;
    public CharSequence LJLJLLL;
    public CharSequence LJLL;
    public boolean LJLLI;
    public AET LJLLILLLL;
    public final boolean LJLLJ;
    public final AIA LJLLL;
    public boolean LJLLLL;
    public InterfaceC88472Yns<? super Boolean, C76800UCe> LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public final int LJZI;
    public final int LJZL;
    public final int LL;
    public final int LLD;
    public final int LLF;
    public boolean LLFF;
    public Boolean LLFFF;
    public Boolean LLFII;
    public final java.util.Map<Integer, View> LLFZ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AI8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LLFZ;
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

    public final void LIZIZ() {
        int i;
        int LIZIZ;
        if (!this.LJLLJ) {
            return;
        }
        View configLayout$lambda$13 = LIZ(R.id.lao);
        int i2 = 0;
        if (this.LLFF) {
            i = this.LJLZ;
            if (i <= 0) {
                i = C7MY.LIZIZ(8);
            }
        } else {
            i = 0;
        }
        int i3 = this.LJZ;
        if (i3 <= 0) {
            i3 = C7MY.LIZIZ(17);
        }
        if (!getSubtitleIsShow()) {
            i2 = i3;
        }
        o.LJIIIIZZ(configLayout$lambda$13, "configLayout$lambda$13");
        C26338AVi.LJI(configLayout$lambda$13, Integer.valueOf(i), Integer.valueOf(i3), null, Integer.valueOf(i2), false, 20);
        View LIZ = LIZ(R.id.ks_);
        AI4 ai4 = null;
        if (getSubtitleIsShow() && LIZ != null) {
            int i4 = this.LJZI;
            if (i4 > 0) {
                C26338AVi.LJI(LIZ, null, Integer.valueOf(i4), null, null, false, 29);
            } else {
                AI9 ai9 = this.LJLJJL;
                if (ai9 != null) {
                    ai4 = ai9.LIZ();
                }
                if (o.LJ(ai4, AI6.LIZIZ) || o.LJ(ai4, AEN.LIZIZ)) {
                    LIZIZ = C7MY.LIZIZ(9);
                } else {
                    LIZIZ = C7MY.LIZIZ(6);
                }
                C26338AVi.LJI(LIZ, null, Integer.valueOf(LIZIZ), null, null, false, 29);
            }
        }
        AI9 ai92 = this.LJLJJL;
        if (ai92 != null) {
            ai92.LJIIIZ();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
    }

    private final SpannableString getAlertBadgeString() {
        return (SpannableString) this.LJLIL.getValue();
    }

    public final void LJFF() {
        AI9 ai9;
        View LJ;
        if (this.LJLLI && (ai9 = this.LJLJJL) != null && (!(ai9 instanceof AEM))) {
            View cell_container = LIZ(R.id.b86);
            o.LJIIIIZZ(cell_container, "cell_container");
            C78897Uxp.LJJJJJL(cell_container, 0.0f);
            AI9 ai92 = this.LJLJJL;
            if ((ai92 instanceof AEY) || ai92 == null || (LJ = ai92.LJ()) == null) {
                return;
            }
            LJ.setClickable(false);
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            ((ViewGroup) LIZ(R.id.b86)).setForeground(null);
        }
    }

    private final boolean getSubtitleIsShow() {
        if (LIZ(R.id.ks_).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void LIZLLL() {
        CharSequence LLD;
        CharSequence charSequence;
        CharSequence LIZLLL;
        CharSequence charSequence2;
        View LIZ = LIZ(R.id.b86);
        CharSequence charSequence3 = this.LJLL;
        if (charSequence3 == null || charSequence3.length() == 0) {
            ArrayList arrayList = new ArrayList();
            if (this.LLFF && (charSequence2 = this.LJLJLLL) != null && charSequence2.length() != 0) {
                arrayList.add(this.LJLJLLL);
            }
            CharSequence charSequence4 = this.LJLJI;
            if (charSequence4 != null && charSequence4.length() != 0) {
                arrayList.add(this.LJLJI);
            }
            CharSequence subtitle = getSubtitle();
            if (subtitle != null && subtitle.length() != 0) {
                arrayList.add(getSubtitle());
            }
            AI9 ai9 = this.LJLJJL;
            if (ai9 != null && (LIZLLL = ai9.LIZLLL()) != null && LIZLLL.length() != 0) {
                arrayList.add(LIZLLL);
            }
            if (this.LJLILLLLZI && (charSequence = this.LJLJLJ) != null && charSequence.length() != 0) {
                arrayList.add(this.LJLJLJ);
            }
            LLD = ORZ.LLD(arrayList, ", ", "", null, null, 60);
        } else {
            LLD = this.LJLL;
        }
        LIZ.setContentDescription(LLD);
    }

    public final CharSequence getSubtitle() {
        return ((AppCompatTextView) LIZ(R.id.ks_)).getText();
    }

    public final AI9 getAccessory() {
        return this.LJLJJL;
    }

    public final CharSequence getAlertBadgeDescription() {
        return this.LJLJLJ;
    }

    public final boolean getCellEnabled() {
        return this.LJLLI;
    }

    public final CharSequence getCustomContentDescription() {
        return this.LJLL;
    }

    public final CharSequence getIconDescription() {
        return this.LJLJLLL;
    }

    public final AKC getInset() {
        return this.LJLJL;
    }

    public final boolean getShowAlertBadge() {
        return this.LJLILLLLZI;
    }

    public final CharSequence getTitle() {
        return this.LJLJI;
    }

    public final int getTitleMaxLines() {
        return this.LJLJJI;
    }

    public final AET getVariant() {
        return this.LJLLILLLL;
    }

    public final boolean getWithSeparator() {
        return this.LJLJJLL;
    }

    private final void setViewEnable(boolean z) {
        int i;
        int i2;
        TextView textView = (TextView) LIZ(R.id.lao);
        if (z) {
            i = LIZJ(this.LJLLILLLL);
        } else {
            i = this.LJLLL.LJFF;
        }
        textView.setTextColor(i);
        TextView textView2 = (TextView) LIZ(R.id.ks_);
        AIA aia = this.LJLLL;
        if (z) {
            i2 = aia.LIZJ;
        } else {
            i2 = aia.LJFF;
        }
        textView2.setTextColor(i2);
        LJI(z);
        AI9 ai9 = this.LJLJJL;
        if (ai9 != null) {
            ai9.LJIIIIZZ(z);
        }
        LJFF();
    }

    private final void setWithIcon(boolean z) {
        int i;
        this.LLFF = z;
        ImageView imageView = (ImageView) LIZ(R.id.ebu);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        LIZIZ();
    }

    public final int LIZJ(AET aet) {
        int i = AEU.LIZ[aet.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.LJLLL.LIZIZ;
            }
            throw new C162476Zf();
        }
        return this.LJLLL.LIZ;
    }

    public final void LJI(boolean z) {
        int i;
        if (!this.LJLLLL) {
            TuxIconView tuxIconView = (TuxIconView) LIZ(R.id.ebu);
            if (z) {
                int i2 = AEU.LIZ[this.LJLLILLLL.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = this.LJLLL.LJ;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    i = this.LJLLL.LIZLLL;
                }
            } else {
                i = this.LJLLL.LJFF;
            }
            tuxIconView.setTintColor(i);
        }
    }

    public final void setAccessory(AI9 ai9) {
        View view;
        ViewGroup viewGroup;
        AI9 ai92 = this.LJLJJL;
        if (ai92 != null) {
            ConstraintLayout cell_container = (ConstraintLayout) LIZ(R.id.b86);
            o.LJIIIIZZ(cell_container, "cell_container");
            View accessoryView = ai92.LJ();
            View title_tv = LIZ(R.id.lao);
            o.LJIIIIZZ(title_tv, "title_tv");
            o.LJIIIZ(accessoryView, "accessoryView");
            C16880lQ.LJLZ(accessoryView, cell_container);
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII(cell_container);
            anonymousClass064.LJFF(accessoryView.getId());
            anonymousClass064.LJIIIIZZ(title_tv.getId(), 7, cell_container.getId(), 7);
            anonymousClass064.LIZIZ(cell_container);
            ((ViewGroup) LIZ(R.id.d1l)).removeAllViews();
            ai92.LIZJ();
        }
        if (ai9 != null) {
            ConstraintLayout cell_container2 = (ConstraintLayout) LIZ(R.id.b86);
            o.LJIIIIZZ(cell_container2, "cell_container");
            View accessoryView2 = ai9.LJ();
            View title_tv2 = LIZ(R.id.lao);
            o.LJIIIIZZ(title_tv2, "title_tv");
            o.LJIIIZ(accessoryView2, "accessoryView");
            ViewParent parent = accessoryView2.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C16880lQ.LJLLL(accessoryView2, viewGroup);
            }
            accessoryView2.setId(R.id.lv7);
            cell_container2.addView(accessoryView2);
            int id = accessoryView2.getId();
            int id2 = title_tv2.getId();
            int id3 = cell_container2.getId();
            AnonymousClass064 anonymousClass0642 = new AnonymousClass064();
            anonymousClass0642.LJII(cell_container2);
            anonymousClass0642.LJIIIIZZ(id, 3, id3, 3);
            anonymousClass0642.LJIIIIZZ(id, 7, id3, 7);
            anonymousClass0642.LJIIIIZZ(id2, 7, id, 6);
            anonymousClass0642.LJIJJ(0.0f, id2);
            anonymousClass0642.LJIIIIZZ(id, 6, id2, 7);
            anonymousClass0642.LJIJJ(1.0f, id);
            anonymousClass0642.LJIILL(id2).LIZLLL.LJJJJ = 1;
            anonymousClass0642.LIZIZ(cell_container2);
            C26338AVi.LJI(accessoryView2, Integer.valueOf(C2OB.LIZIZ), null, null, null, false, 30);
            View cell_container3 = LIZ(R.id.b86);
            o.LJIIIIZZ(cell_container3, "cell_container");
            ai9.LJIIIIZZ(cell_container3.isEnabled());
            if (o.LJ(ai9.LIZ(), AIB.LIZIZ) && (view = ((AID) ai9).LIZIZ) != null) {
                ViewGroup viewGroup2 = (ViewGroup) LIZ(R.id.d1l);
                viewGroup2.setVisibility(0);
                viewGroup2.addView(view);
            }
        }
        this.LJLJJL = ai9;
        LIZLLL();
        h0.LJIJI(LIZ(R.id.b86), new IDaS467S0100000_4(this, 3));
        LJFF();
        LIZIZ();
    }

    public final void setAlertBadgeDescription(CharSequence charSequence) {
        this.LJLJLJ = charSequence;
        LIZLLL();
    }

    public final void setCellEnabled(boolean z) {
        this.LJLLI = z;
        setViewEnable(z);
    }

    public final void setCustomContentDescription(CharSequence charSequence) {
        this.LJLL = charSequence;
        LIZLLL();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.LJLLJ) {
            LIZ(R.id.b86).setEnabled(z);
            setViewEnable(z);
        }
    }

    public final void setIcon(C2068389v c2068389v) {
        boolean z = false;
        if (c2068389v != null) {
            ((TuxIconView) LIZ(R.id.ebu)).setIconRes(c2068389v.LIZ);
            this.LJLLLL = false;
            Integer num = c2068389v.LIZLLL;
            if (num != null) {
                ((TuxIconView) LIZ(R.id.ebu)).setTintColor(num.intValue());
                this.LJLLLL = true;
            }
            Integer num2 = c2068389v.LJ;
            if (num2 != null) {
                ((TuxIconView) LIZ(R.id.ebu)).setTintColorRes(num2.intValue());
                this.LJLLLL = true;
            }
            LJI(this.LJLLI);
            z = true;
        }
        setWithIcon(z);
    }

    public final void setIconDescription(CharSequence charSequence) {
        this.LJLJLLL = charSequence;
        LIZLLL();
    }

    public final void setInset(AKC akc) {
        this.LJLJL = akc;
        if (akc != null) {
            int px = akc.toPx();
            View cell_container = LIZ(R.id.b86);
            o.LJIIIIZZ(cell_container, "cell_container");
            C26338AVi.LJIIIZ(cell_container, Integer.valueOf(px), null, Integer.valueOf(px), null, 26);
        }
    }

    public final void setLoading(boolean z) {
        AI9 ai9 = this.LJLJJL;
        if (ai9 != null) {
            ai9.LJIIJ(z);
        }
    }

    public final void setOnClickListener(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        if (!isClickable()) {
            setClickable(true);
        }
        this.LJLLLLLL = interfaceC88472Yns;
    }

    public final void setShowAlertBadge(boolean z) {
        this.LJLILLLLZI = z;
        CharSequence charSequence = this.LJLJI;
        if (charSequence != null) {
            setTitle(charSequence);
        }
    }

    public final void setSubtitle(CharSequence charSequence) {
        int visibility = LIZ(R.id.ks_).getVisibility();
        if (charSequence == null || charSequence.length() == 0) {
            LIZ(R.id.ks_).setVisibility(8);
        } else {
            ((TextView) LIZ(R.id.ks_)).setText(charSequence);
            LIZ(R.id.ks_).setVisibility(0);
            if (!(charSequence instanceof String)) {
                ((TextView) LIZ(R.id.ks_)).setMovementMethod(AnonymousClass898.LIZ);
                LIZ(R.id.ks_).setClickable(false);
                LIZ(R.id.ks_).setLongClickable(false);
            } else {
                ((TextView) LIZ(R.id.ks_)).setMovementMethod(null);
            }
        }
        LIZLLL();
        if (visibility != LIZ(R.id.ks_).getVisibility()) {
            LIZIZ();
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.LJLJI = charSequence;
        if (this.LJLILLLLZI) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) getAlertBadgeString());
            ((TextView) LIZ(R.id.lao)).setText(spannableStringBuilder);
        } else {
            ((TextView) LIZ(R.id.lao)).setText(charSequence);
        }
        LIZLLL();
    }

    public final void setTitleMaxLines(int i) {
        this.LJLJJI = i;
        ((TextView) LIZ(R.id.lao)).setMaxLines(i);
    }

    public final void setVariant(AET value) {
        o.LJIIIZ(value, "value");
        this.LJLLILLLL = value;
        ((TextView) LIZ(R.id.lao)).setTextColor(LIZJ(value));
    }

    public final void setWithSeparator(boolean z) {
        int i;
        this.LJLJJLL = z;
        View LIZ = LIZ(R.id.joq);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        LIZ.setVisibility(i);
    }

    public final void setIcon(InterfaceC88472Yns<? super ImageView, C76800UCe> func) {
        o.LJIIIZ(func, "func");
        View icon_iv = LIZ(R.id.ebu);
        o.LJIIIIZZ(icon_iv, "icon_iv");
        func.invoke(icon_iv);
        setWithIcon(true);
    }

    public final void LJ(boolean z, boolean z2) {
        int i;
        int i2;
        if (o.LJ(this.LLFFF, Boolean.valueOf(z)) && o.LJ(this.LLFII, Boolean.valueOf(z2))) {
            return;
        }
        this.LLFFF = Boolean.valueOf(z);
        this.LLFII = Boolean.valueOf(z2);
        int i3 = 0;
        if (this.LL >= 0) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZ = Integer.valueOf(this.LJZL);
            if (z) {
                c110614Vt.LJIIIIZZ = Float.valueOf(this.LL);
                c110614Vt.LJIIIZ = Float.valueOf(this.LL);
            }
            if (z2) {
                c110614Vt.LJIIJ = Float.valueOf(this.LL);
                c110614Vt.LJIIJJI = Float.valueOf(this.LL);
            }
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c110614Vt.LIZ(context)});
            int i4 = this.LLF;
            layerDrawable.setLayerInset(0, i4, 0, i4, 0);
            setBackground(layerDrawable);
        }
        int i5 = this.LLF;
        if (i5 > 0 && (i = this.LLD) > 0) {
            if (z) {
                i2 = i;
            } else {
                i2 = 0;
            }
            if (z2) {
                i3 = i;
            }
            C26338AVi.LJIIIZ(this, Integer.valueOf(i5), Integer.valueOf(i2), Integer.valueOf(this.LLF), Integer.valueOf(i3), 16);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r1.getVisibility() == 0) goto L7;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            X.AI9 r2 = r8.LJLJJL
            r3 = 0
            if (r2 == 0) goto L24
            X.AI4 r1 = r2.LIZ()
            X.AD6 r0 = X.AD6.LIZIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L38
            android.view.View r1 = r2.LJ()
        L15:
            boolean r0 = r1 instanceof com.bytedance.tux.input.TuxTextView
            if (r0 == 0) goto L24
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L24
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.setMaxWidth(r0)
            r3 = r1
        L24:
            X.AI9 r0 = r8.LJLJJL
            r7 = 2131377913(0x7f0a3ef9, float:1.8376044E38)
            if (r0 == 0) goto L32
            android.view.View r0 = r8.LIZ(r7)
            r0.requestLayout()
        L32:
            super.onMeasure(r9, r10)
            if (r3 != 0) goto L58
            return
        L38:
            X.AI5 r0 = X.AI5.LIZIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L56
            android.view.View r1 = r2.LJ()
            java.lang.String r0 = "null cannot be cast to non-null type com.bytedance.tux.table.accessory.DisclosureView"
            kotlin.jvm.internal.o.LJII(r1, r0)
            X.AIG r1 = (X.AIG) r1
            com.bytedance.tux.input.TuxTextView r1 = r1.getLabelTv$tux_theme_release()
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L56
            goto L15
        L56:
            r1 = r3
            goto L15
        L58:
            X.AI9 r2 = r8.LJLJJL
            if (r2 != 0) goto L5d
            return
        L5d:
            android.view.View r0 = r8.LIZ(r7)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r0 = r0.getLineCount()
            r1 = 1
            if (r0 <= r1) goto Lef
            int r0 = X.C2OB.LIZ
            r3.setMaxWidth(r0)
            super.onMeasure(r9, r10)
            android.view.View r0 = r8.LIZ(r7)
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r0 = r0.getLineCount()
            if (r0 != r1) goto Lef
            int r6 = r2.LIZIZ()
            boolean r0 = r8.LLFF
            r4 = 0
            if (r0 == 0) goto Lf0
            r0 = 12
            int r5 = X.C7MY.LIZIZ(r0)
        L8d:
            android.view.View r0 = r8.LIZ(r7)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.text.TextPaint r2 = r0.getPaint()
            android.view.View r0 = r8.LIZ(r7)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.CharSequence r1 = r0.getText()
            android.view.View r0 = r8.LIZ(r7)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.CharSequence r0 = r0.getText()
            int r0 = r0.length()
            float r0 = r2.measureText(r1, r4, r0)
            int r4 = (int) r0
            int r2 = android.view.View.MeasureSpec.getSize(r9)
            int r0 = r8.getPaddingLeft()
            int r2 = r2 - r0
            int r0 = r8.getPaddingRight()
            int r2 = r2 - r0
            r1 = 2131364071(0x7f0a08e7, float:1.8347969E38)
            android.view.View r0 = r8.LIZ(r1)
            int r0 = r0.getPaddingLeft()
            int r2 = r2 - r0
            android.view.View r0 = r8.LIZ(r1)
            int r0 = r0.getPaddingRight()
            int r2 = r2 - r0
            int r2 = r2 - r4
            r0 = 2131368359(0x7f0a19a7, float:1.8356666E38)
            android.view.View r0 = r8.LIZ(r0)
            int r0 = r0.getMeasuredWidth()
            int r2 = r2 - r0
            int r2 = r2 - r5
            int r0 = X.C2OB.LIZIZ
            int r2 = r2 - r0
            int r2 = r2 - r6
            r3.setMaxWidth(r2)
            super.onMeasure(r9, r10)
        Lef:
            return
        Lf0:
            r5 = 0
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AI8.onMeasure(int, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AI8(android.content.Context r16, android.util.AttributeSet r17, int r18) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AI8.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
