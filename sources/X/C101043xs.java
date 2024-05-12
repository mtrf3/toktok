package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import o3.IDaS88S0000000_1;
import o3.h0;

/* renamed from: X.3xs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101043xs extends FrameLayout {
    public boolean LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public TuxTextView LJLL;
    public TuxTextView LJLLI;
    public C116424ha LJLLILLLL;
    public View LJLLJ;
    public TuxTextView LJLLL;
    public boolean LJLLLL;
    public RelativeLayout LJLLLLLL;
    public C119624mk LJLZ;
    public C119624mk LJZ;
    public TuxTextView LJZI;
    public TuxTextView LJZL;
    public ImageView LL;
    public ViewGroup LLD;
    public ViewGroup LLF;
    public InterfaceC101063xu LLFF;
    public CharSequence LLFFF;
    public CharSequence LLFII;
    public final ACListenerS21S0100000_1 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C101043xs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    private final InterfaceC1040946r getCenterAvatarLoader() {
        return (InterfaceC1040946r) this.LLIFFJFJJ.getValue();
    }

    private final InterfaceC1040946r getLeftAvatarLoader() {
        return (InterfaceC1040946r) this.LLI.getValue();
    }

    public final void LIZ() {
        TuxTextView tuxTextView;
        if (this.LLFFF.length() != 0 || (tuxTextView = this.LJZL) == null) {
            return;
        }
        tuxTextView.setVisibility(8);
    }

    public final void LIZIZ() {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_arrow_left_ltr;
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(24));
        c2068389v.LJ = Integer.valueOf(R.attr.go);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        setLeftIcon(new C101053xt(c2068389v.LIZ(context), R.string.c37));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF() {
        /*
            r7 = this;
            android.view.View r0 = r7.LJLLJ
            r4 = 0
            if (r0 == 0) goto Lb3
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
        L9:
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L10
            r4 = r1
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L10:
            android.view.ViewGroup r0 = r7.LLD
            r6 = 8
            r3 = 0
            if (r0 == 0) goto L47
            int r0 = r0.getVisibility()
            if (r0 != r6) goto L47
            android.view.ViewGroup r0 = r7.LLF
            if (r0 == 0) goto L47
            int r0 = r0.getVisibility()
            if (r0 != r6) goto L47
            if (r4 == 0) goto L3e
            android.content.Context r1 = r7.getContext()
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = X.KL2.LIZJ(r1, r0)
            int r0 = (int) r0
            r4.setMarginStart(r0)
            r4.leftMargin = r0
            r4.setMarginEnd(r0)
            r4.rightMargin = r0
        L3e:
            android.view.View r0 = r7.LJLLJ
            if (r0 != 0) goto L43
        L42:
            return
        L43:
            r0.setLayoutParams(r4)
            goto L42
        L47:
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r3)
            android.view.ViewGroup r0 = r7.LLD
            if (r0 == 0) goto L86
            int r0 = r0.getVisibility()
            if (r0 != r6) goto L86
        L59:
            r2 = 0
        L5a:
            android.view.ViewGroup r0 = r7.LLF
            if (r0 == 0) goto L76
            int r0 = r0.getVisibility()
            if (r0 != r6) goto L76
        L64:
            r1 = 0
        L65:
            boolean r0 = r7.LJLLLL
            if (r0 == 0) goto L96
            if (r4 == 0) goto L3e
            r4.setMarginStart(r3)
            r4.leftMargin = r3
            r4.setMarginEnd(r3)
            r4.rightMargin = r3
            goto L3e
        L76:
            android.view.ViewGroup r0 = r7.LLF
            if (r0 == 0) goto L7d
            r0.measure(r5, r1)
        L7d:
            android.view.ViewGroup r0 = r7.LLF
            if (r0 == 0) goto L64
            int r1 = r0.getMeasuredWidth()
            goto L65
        L86:
            android.view.ViewGroup r0 = r7.LLD
            if (r0 == 0) goto L8d
            r0.measure(r5, r1)
        L8d:
            android.view.ViewGroup r0 = r7.LLD
            if (r0 == 0) goto L59
            int r2 = r0.getMeasuredWidth()
            goto L5a
        L96:
            if (r4 == 0) goto L3e
            int r2 = r2 - r1
            if (r2 < 0) goto Lae
            r0 = 0
            if (r2 > 0) goto La9
        L9e:
            r4.setMarginStart(r0)
            r4.leftMargin = r0
            r4.setMarginEnd(r3)
            r4.rightMargin = r3
            goto L3e
        La9:
            int r3 = java.lang.Math.abs(r2)
            goto L9e
        Lae:
            int r0 = java.lang.Math.abs(r2)
            goto L9e
        Lb3:
            r1 = r4
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101043xs.LJFF():void");
    }

    public final C119624mk getCenterAvatar() {
        return this.LJZ;
    }

    public final TextView getRightTexView() {
        return this.LJLLI;
    }

    public final View getRightView() {
        return this.LLF;
    }

    public final void setCenterAvatarVisibility(int i) {
        C119624mk c119624mk = this.LJZ;
        if (c119624mk != null) {
            c119624mk.setVisibility(i);
        }
        LJFF();
    }

    public final void setLeftAvatarMarginStart(int i) {
        RelativeLayout relativeLayout = this.LJLLLLLL;
        if (relativeLayout != null) {
            relativeLayout.setPaddingRelative(i, 0, 0, 0);
        }
    }

    public final void setLeftIcon(C101053xt drawableWithDesc) {
        o.LJIIIZ(drawableWithDesc, "drawableWithDesc");
        Drawable drawable = drawableWithDesc.LIZ;
        final int i = drawableWithDesc.LIZIZ;
        if (this.LJLLILLLL == null) {
            this.LJLLILLLL = new C116424ha(getContext(), null);
        }
        final C116424ha c116424ha = this.LJLLILLLL;
        if (c116424ha != null) {
            c116424ha.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            c116424ha.setImageDrawable(drawable);
            h0.LJIJI(c116424ha, new C16120kC() { // from class: X.4DF
                @Override // X.C16120kC
                public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
                    o.LJIIIZ(host, "host");
                    o.LJIIIZ(info, "info");
                    super.onInitializeAccessibilityNodeInfo(host, info);
                    if (i != -1) {
                        info.LJIJ(c116424ha.getContext().getResources().getString(i));
                    }
                }
            });
        }
        ViewGroup viewGroup = this.LLD;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(this.LJLLILLLL);
            viewGroup.setVisibility(0);
            viewGroup.setContentDescription(viewGroup.getContext().getResources().getString(R.string.c37));
            h0.LJIJI(viewGroup, new IDaS88S0000000_1(3));
        }
        LJFF();
    }

    public final void setLeftText(String str) {
        this.LJLILLLLZI = str;
        int i = 0;
        if (this.LJLL == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            this.LJLL = new TuxTextView(context, null, 6, i);
        }
        TuxTextView tuxTextView = this.LJLL;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(41);
            tuxTextView.setTextColor(this.LJLJL);
            tuxTextView.setText(this.LJLILLLLZI);
        }
        ViewGroup viewGroup = this.LLD;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(this.LJLL);
            viewGroup.setVisibility(0);
            viewGroup.setContentDescription(this.LJLILLLLZI);
        }
        LJFF();
    }

    public final void setLeftTextColor(int i) {
        this.LJLJL = i;
        TuxTextView tuxTextView = this.LJLL;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(i);
        }
    }

    public final void setLeftTitleVisible(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        this.LJLLLL = z;
        View view = this.LJLLJ;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        if (z) {
            TuxTextView tuxTextView = this.LJLLL;
            if (tuxTextView != null) {
                tuxTextView.setVisibility(8);
            }
            RelativeLayout relativeLayout = this.LJLLLLLL;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            layoutParams2.addRule(13, 0);
            layoutParams2.addRule(15);
        } else {
            TuxTextView tuxTextView2 = this.LJLLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setVisibility(0);
            }
            RelativeLayout relativeLayout2 = this.LJLLLLLL;
            if (relativeLayout2 != null) {
                relativeLayout2.setVisibility(8);
            }
            layoutParams2.addRule(13);
        }
        View view2 = this.LJLLJ;
        if (view2 == null) {
            return;
        }
        view2.setLayoutParams(layoutParams2);
    }

    public final void setLeftViewVisiblity(int i) {
        ViewGroup viewGroup = this.LLD;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        }
        LJFF();
    }

    public final void setOnTitlebarClickListener(InterfaceC101063xu interfaceC101063xu) {
        this.LLFF = interfaceC101063xu;
    }

    public final void setRightDotVisibility(int i) {
        ImageView imageView = this.LL;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(i);
    }

    public final void setRightIcon(C95063oE resId) {
        o.LJIIIZ(resId, "resId");
        setRightIcons(resId);
    }

    public final void setRightIconDescription(int i) {
        View childAt;
        ViewGroup viewGroup = this.LLF;
        if (viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null || i == -1) {
            return;
        }
        childAt.setContentDescription(C97343ru.LJFF(i));
    }

    public final void setRightIcons(C100113wN... iconsWithDesc) {
        int i;
        o.LJIIIZ(iconsWithDesc, "iconsWithDesc");
        int length = iconsWithDesc.length;
        TuxIconView[] tuxIconViewArr = new TuxIconView[length];
        int length2 = iconsWithDesc.length;
        for (int i2 = 0; i2 < length2; i2++) {
            C100113wN c100113wN = iconsWithDesc[i2];
            C2068389v c2068389v = c100113wN.LIZ;
            int i3 = c100113wN.LIZIZ;
            c2068389v.LIZJ = C7MY.LIZIZ(24);
            c2068389v.LIZIZ = C7MY.LIZIZ(24);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
            tuxIconView.setTuxIcon(c2068389v);
            Integer num = c2068389v.LJ;
            if (num != null) {
                i = num.intValue();
            } else {
                i = R.attr.go;
            }
            tuxIconView.setTintColorRes(i);
            tuxIconView.setId(c2068389v.LIZ);
            if (i3 != -1) {
                tuxIconView.setContentDescription(C97343ru.LJFF(i3));
            }
            int LIZJ = (int) KL2.LIZJ(getContext(), 8.0f);
            int LIZJ2 = (int) KL2.LIZJ(getContext(), 10.0f);
            tuxIconView.setPadding(LIZJ, LIZJ2, LIZJ, LIZJ2);
            tuxIconViewArr[i2] = tuxIconView;
        }
        ViewGroup viewGroup = this.LLF;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        for (int i4 = 0; i4 < length; i4++) {
            TuxIconView tuxIconView2 = tuxIconViewArr[i4];
            if (tuxIconView2 != null) {
                C16880lQ.LJJJ(tuxIconView2, this.LLFZ);
            }
            ViewGroup viewGroup2 = this.LLF;
            if (viewGroup2 != null) {
                viewGroup2.addView(tuxIconView2);
            }
        }
        ViewGroup viewGroup3 = this.LLF;
        if (viewGroup3 != null) {
            viewGroup3.setVisibility(0);
        }
        ViewGroup viewGroup4 = this.LLF;
        if (viewGroup4 != null) {
            viewGroup4.setContentDescription(getResources().getString(R.string.h74));
        }
        LJFF();
    }

    public final void setRightText(String str) {
        this.LJLJI = str;
        int i = 0;
        if (this.LJLLI == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, i);
            h0.LJIJI(tuxTextView, new IDaS88S0000000_1(4));
            this.LJLLI = tuxTextView;
        }
        TuxTextView tuxTextView2 = this.LJLLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(42);
            tuxTextView2.setTextColor(this.LJLJLJ);
            tuxTextView2.setText(this.LJLJI);
            C16880lQ.LJJJJI(tuxTextView2, this.LLFZ);
        }
        ViewGroup viewGroup = this.LLF;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(this.LJLLI);
            viewGroup.setVisibility(0);
            viewGroup.setContentDescription(this.LJLJI);
        }
        LJFF();
    }

    public final void setRightTextColor(int i) {
        this.LJLJLJ = i;
        TuxTextView tuxTextView = this.LJLLI;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(i);
        }
    }

    public final void setRightTextVisibility(int i) {
        TuxTextView tuxTextView = this.LJLLI;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(i);
        }
        LJFF();
    }

    public final void setRightTuxFont(int i) {
        TuxTextView tuxTextView = this.LJLLI;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(i);
        }
    }

    public final void setTitle(String title) {
        o.LJIIIZ(title, "title");
        this.LJLJJI = title;
        if (this.LJLLLL) {
            TuxTextView tuxTextView = this.LJZI;
            if (tuxTextView != null) {
                C116724i4 c116724i4 = new C116724i4();
                c116724i4.LIZLLL(title);
                tuxTextView.setText(c116724i4.LIZ);
            }
        } else {
            TuxTextView tuxTextView2 = this.LJLLL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(title);
            }
        }
        TuxTextView tuxTextView3 = this.LJLLL;
        if (tuxTextView3 != null) {
            tuxTextView3.requestLayout();
        }
    }

    public final void setTitleTextColor(int i) {
        this.LJLJLLL = i;
        TuxTextView tuxTextView = this.LJLLL;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(i);
        }
    }

    public final void setLeftIcon(C100113wN iconWithDescription) {
        int i;
        o.LJIIIZ(iconWithDescription, "iconWithDescription");
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6, null);
        C2068389v c2068389v = iconWithDescription.LIZ;
        int i2 = iconWithDescription.LIZIZ;
        tuxIconView.setTuxIcon(c2068389v);
        Integer num = c2068389v.LJ;
        if (num != null) {
            i = num.intValue();
        } else {
            i = R.attr.go;
        }
        tuxIconView.setTintColorRes(i);
        tuxIconView.setId(c2068389v.LIZ);
        ViewGroup viewGroup = this.LLD;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            viewGroup.addView(tuxIconView);
            viewGroup.setVisibility(0);
            if (i2 != -1) {
                viewGroup.setContentDescription(viewGroup.getContext().getResources().getString(i2));
            }
        }
        LJFF();
    }

    public final void setLeftText(int i) {
        setLeftText(getResources().getString(i));
    }

    public final void setRightIcon(C100113wN c100113wN) {
        if (c100113wN != null) {
            setRightIcons(c100113wN);
        }
    }

    public final void setRightIcons(C95063oE... resId) {
        o.LJIIIZ(resId, "resId");
        ArrayList arrayList = new ArrayList();
        for (C95063oE c95063oE : resId) {
            int i = c95063oE.LIZ;
            int i2 = c95063oE.LIZIZ;
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = i;
            c2068389v.LJ = Integer.valueOf(R.attr.go);
            arrayList.add(new C100113wN(c2068389v, i2));
        }
        C100113wN[] c100113wNArr = (C100113wN[]) arrayList.toArray(new C100113wN[0]);
        setRightIcons((C100113wN[]) Arrays.copyOf(c100113wNArr, c100113wNArr.length));
    }

    public final void setRightText(int i) {
        setRightText(getResources().getString(i));
    }

    public final void setTitle(CharSequence charSequence) {
        String str;
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        this.LJLJJI = str;
        TuxTextView tuxTextView = this.LJLLL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setText(charSequence);
    }

    public final void setTitle(int i) {
        String string = getResources().getString(i);
        o.LJIIIIZZ(string, "resources.getString(resid)");
        setTitle(string);
    }

    public final void LIZLLL(Boolean bool, String str) {
        boolean z;
        CharSequence charSequence;
        C116724i4 c116724i4 = new C116724i4();
        if (str != null) {
            c116724i4.LIZIZ(str);
        }
        if (((String) this.LLFFF).length() > 0) {
            z = true;
        } else {
            z = false;
        }
        ViewGroup.LayoutParams layoutParams = null;
        if (z) {
            TuxTextView tuxTextView = this.LJZL;
            if (tuxTextView != null) {
                tuxTextView.setText(this.LLFFF);
            }
            this.LLFII = c116724i4.LIZ;
        } else {
            TuxTextView tuxTextView2 = this.LJZL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(c116724i4.LIZ);
            }
            TuxTextView tuxTextView3 = this.LJZL;
            if (tuxTextView3 == null || (charSequence = tuxTextView3.getText()) == null) {
                charSequence = "";
            }
            this.LLFII = charSequence;
        }
        TuxTextView tuxTextView4 = this.LJZL;
        if (tuxTextView4 != null) {
            tuxTextView4.setVisibility(0);
        }
        if (o.LJ(bool, Boolean.FALSE)) {
            TuxTextView tuxTextView5 = this.LJZL;
            if (tuxTextView5 != null) {
                layoutParams = tuxTextView5.getLayoutParams();
            }
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = 0;
            TuxTextView tuxTextView6 = this.LJZL;
            if (tuxTextView6 == null) {
                return;
            }
            tuxTextView6.setLayoutParams(layoutParams2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C101043xs(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C101043xs.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static void LIZJ(C101043xs c101043xs, boolean z, UrlModel urlModel, String str, String str2, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        C119624mk c119624mk = c101043xs.LJZ;
        if (c119624mk != null) {
            c119624mk.setVisibility(0);
        }
        if (C1041346v.LIZ()) {
            String str3 = "";
            if (z) {
                InterfaceC1040946r centerAvatarLoader = c101043xs.getCenterAvatarLoader();
                if (centerAvatarLoader != null) {
                    if (str2 != null) {
                        str3 = str2;
                    }
                    C1040846q.LIZ(centerAvatarLoader, str3, null, urlModel, 0, 0, 26);
                    return;
                }
                return;
            }
            InterfaceC1040946r centerAvatarLoader2 = c101043xs.getCenterAvatarLoader();
            if (centerAvatarLoader2 == null) {
                return;
            }
            if (str == null) {
                str = "";
            }
            C1040846q.LIZIZ(centerAvatarLoader2, str, urlModel, 0, 12);
            return;
        }
        C45S.LJFF(c101043xs.LJZ, urlModel, "ImTextTitleBar: CenterAvatar", R.raw.icon_color_default_avatar, R.drawable.b0p, null, null, 992);
    }

    public static void LJ(C101043xs c101043xs, boolean z, UrlModel urlModel, C100083wK c100083wK, UrlModel urlModel2, String str, String str2, int i) {
        String str3 = str;
        C100083wK c100083wK2 = c100083wK;
        UrlModel urlModel3 = urlModel2;
        String str4 = null;
        if ((i & 4) != 0) {
            c100083wK2 = null;
        }
        if ((i & 8) != 0) {
            urlModel3 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) == 0) {
            str4 = str2;
        }
        c101043xs.getClass();
        if (C1041346v.LIZ()) {
            String str5 = "";
            if (z) {
                InterfaceC1040946r leftAvatarLoader = c101043xs.getLeftAvatarLoader();
                if (leftAvatarLoader != null) {
                    if (str4 != null) {
                        str5 = str4;
                    }
                    C1040846q.LIZ(leftAvatarLoader, str5, null, urlModel, 0, 0, 26);
                    return;
                }
                return;
            }
            InterfaceC1040946r leftAvatarLoader2 = c101043xs.getLeftAvatarLoader();
            if (leftAvatarLoader2 == null) {
                return;
            }
            if (str3 == null) {
                str3 = "";
            }
            C1040846q.LIZIZ(leftAvatarLoader2, str3, urlModel, 0, 12);
            return;
        }
        C119624mk c119624mk = c101043xs.LJLZ;
        if (c119624mk == null || c119624mk.getContext() == null) {
            return;
        }
        C119624mk c119624mk2 = c101043xs.LJLZ;
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.drawable.b0p;
        C119624mk c119624mk3 = c101043xs.LJLZ;
        o.LJII(c119624mk3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.AvatarImageView");
        Context context = c119624mk3.getContext();
        o.LJIIIIZZ(context, "leftAvatar as AvatarImageView).context");
        SY9 LIZ = c2068389v.LIZ(context);
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_color_default_avatar;
        C119624mk c119624mk4 = c101043xs.LJLZ;
        o.LJII(c119624mk4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.ui.AvatarImageView");
        Context context2 = c119624mk4.getContext();
        o.LJIIIIZZ(context2, "leftAvatar as AvatarImageView).context");
        C45S.LIZLLL(c119624mk2, urlModel, "ImTextTitleBar: LeftAvatar", c2068389v2.LIZ(context2), LIZ, c100083wK2, urlModel3);
    }
}
