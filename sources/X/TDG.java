package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TDG extends FrameLayout {
    public View LJLIL;
    public C72790ShW LJLILLLLZI;
    public FrameLayout LJLJI;
    public View LJLJJI;
    public TextView LJLJJL;
    public View LJLJJLL;
    public View LJLJL;
    public ColorStateList LJLJLJ;
    public final ColorStateList LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public Drawable LJLLJ;
    public final boolean LJLLL;
    public final int LJLLLL;
    public final int LJLLLLLL;
    public final int LJLZ;
    public final int LJZ;
    public final int LJZI;
    public final int LJZL;
    public final boolean LL;
    public final int LLD;
    public final int LLF;
    public final int LLFF;
    public final int LLFFF;
    public final int LLFII;
    public final int LLFZ;
    public final boolean LLI;
    public final boolean LLIFFJFJJ;
    public final int LLII;
    public final int LLIIII;
    public final int LLIIIILZ;
    public final int LLIIIJ;
    public final int LLIIIL;
    public final boolean LLIIIZ;
    public final boolean LLIIJI;
    public final int LLIIJLIL;
    public final int LLIIL;
    public final boolean LLIILII;
    public final boolean LLIILZL;
    public final boolean LLIIZ;
    public final boolean LLIL;
    public final boolean LLILII;
    public final boolean LLILIL;
    public final int LLILL;

    public int LJI() {
        return R.layout.crd;
    }

    public final boolean LJIIJJI() {
        if (this.LLIL || (this.LLIIZ && this.LLILIL)) {
            return true;
        }
        return false;
    }

    public View getBorderLayout() {
        if (this.LLIFFJFJJ && this.LJLJJLL == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            View LIZLLL = LIZLLL(context);
            FrameLayout frameLayout = this.LJLJI;
            if (frameLayout != null) {
                frameLayout.addView(LIZLLL);
                this.LJLJJLL = LIZLLL;
            } else {
                o.LJIJI("imageLayoutContainer");
                throw null;
            }
        }
        return this.LJLJJLL;
    }

    public final C72790ShW getDynamicView() {
        C72790ShW c72790ShW = this.LJLILLLLZI;
        if (c72790ShW != null) {
            c72790ShW.setClipToOutline(true);
            C72790ShW c72790ShW2 = this.LJLILLLLZI;
            if (c72790ShW2 != null) {
                c72790ShW2.setOutlineProvider(new C74258TCk(this));
                C72790ShW c72790ShW3 = this.LJLILLLLZI;
                if (c72790ShW3 != null) {
                    return c72790ShW3;
                }
                o.LJIJI("imageView");
                throw null;
            }
            o.LJIJI("imageView");
            throw null;
        }
        o.LJIJI("imageView");
        throw null;
    }

    public final C72790ShW getImageView() {
        C72790ShW c72790ShW = this.LJLILLLLZI;
        if (c72790ShW != null) {
            return c72790ShW;
        }
        o.LJIJI("imageView");
        throw null;
    }

    public final View getImageViewContainer() {
        View view = this.LJLIL;
        if (view != null) {
            return view;
        }
        o.LJIJI("imageViewContainer");
        throw null;
    }

    public final Drawable getPlaceHolderDrawableCached() {
        if (this.LJLLJ == null) {
            this.LJLLJ = getPlaceHolderDrawable();
        }
        return this.LJLLJ;
    }

    public void LIZ() {
        int i;
        int i2;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context, this.LLII);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        int LIZIZ2 = (int) C74275TDb.LIZIZ(context2, this.LLIIJLIL);
        boolean z = this.LLIFFJFJJ;
        if (z) {
            i = (LIZIZ2 * 2) + (LIZIZ * 2) + this.LJLLLLLL;
        } else {
            i = this.LJLLLLLL;
        }
        this.LJLLI = i;
        if (z) {
            i2 = (LIZIZ2 * 2) + (LIZIZ * 2) + this.LJLZ;
        } else {
            i2 = this.LJLZ;
        }
        this.LJLLILLLL = i2;
    }

    public final Drawable getPlaceHolderDrawable() {
        int color = getResources().getColor(R.color.xz);
        if (this.LJZL != 0) {
            return C78880UxY.LJLIL(getResources().getDrawable(this.LJZL), getResources().getColor(R.color.y0));
        }
        if (this.LJLLL) {
            TDY tdy = new TDY();
            tdy.LIZLLL(1);
            tdy.LIZIZ(color);
            tdy.LJ(color, 0);
            return tdy.LIZ();
        }
        TDY tdy2 = new TDY();
        tdy2.LIZLLL(0);
        tdy2.LIZIZ(color);
        tdy2.LJ(color, 0);
        tdy2.LIZJ(this.LJLLLL);
        return tdy2.LIZ();
    }

    public final int getBorderColorRes() {
        return this.LLIIII;
    }

    public final int getBorderPadding() {
        return this.LLIIJLIL;
    }

    public final int getBorderRadius() {
        return this.LLILL;
    }

    public final View getBorderView() {
        return this.LJLJJLL;
    }

    public final int getBorderWidth() {
        return this.LLII;
    }

    public final int getContainerHeight() {
        return this.LJZI;
    }

    public final int getContainerWidth() {
        return this.LJZ;
    }

    public final View getDotView() {
        return this.LJLJL;
    }

    public final boolean getEnableBorder() {
        return this.LLIFFJFJJ;
    }

    public final boolean getEnableCellStyle() {
        return this.LLILII;
    }

    public final boolean getEnableExpandBorder() {
        return this.LLIL;
    }

    public final boolean getEnableNewStickerPanel() {
        return this.LLIIZ;
    }

    public final int getImageMarginLeft() {
        return this.LLF;
    }

    public final int getImageMarginTop() {
        return this.LLD;
    }

    public final int getImgHeight() {
        return this.LJLZ;
    }

    public final int getImgLayoutHeight() {
        return this.LJLLILLLL;
    }

    public final int getImgLayoutWidth() {
        return this.LJLLI;
    }

    public final int getImgWidth() {
        return this.LJLLLLLL;
    }

    public final int getRoundRadius() {
        return this.LJLLLL;
    }

    public final int getRoundRadiusForIcon() {
        return this.LLIIIL;
    }

    public final boolean getSimpleLayoutMode() {
        return this.LLIILZL;
    }

    public final TextView getTextView() {
        return this.LJLJJL;
    }

    public final void LIZJ(Context context) {
        Drawable placeHolderDrawable;
        o.LJIIIZ(context, "context");
        LIZ();
        View LJFF = LJFF(context);
        this.LJLIL = LJFF;
        if (LJFF != null) {
            C72790ShW image = (C72790ShW) LJFF.findViewById(R.id.csp);
            V92 LIZ = new C79077V1t(getResources()).LIZ();
            V8L v8l = new V8L();
            boolean z = this.LJLLL;
            v8l.LIZIZ = z;
            if (!z) {
                v8l.LJFF(this.LLIIIL);
            }
            LIZ.LJIL(v8l);
            if (C82894Wg6.LIZIZ.LJIIIIZZ()) {
                placeHolderDrawable = getPlaceHolderDrawableCached();
            } else {
                placeHolderDrawable = getPlaceHolderDrawable();
            }
            LIZ.LJIILL(placeHolderDrawable, 1);
            LIZ.LJIILL(placeHolderDrawable, 5);
            o.LJIIIIZZ(image, "image");
            image.setHierarchy(LIZ);
            this.LJLILLLLZI = image;
            if (this.LL) {
                View LJII = LJII(context);
                this.LJLJJI = LJII;
                if (LJII != null) {
                    TextView textView = (TextView) LJII;
                    if (this.LLI) {
                        textView.setSingleLine();
                    }
                    textView.setTextSize(1, this.LLIIL);
                    this.LJLJJL = textView;
                    this.LJLJLJ = textView.getTextColors();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
            }
            LinearLayout linearLayout = new LinearLayout(context);
            LIZIZ(linearLayout, this.LLIIJI);
            addView(linearLayout);
            FrameLayout frameLayout = new FrameLayout(context);
            this.LJLJI = frameLayout;
            View view = this.LJLIL;
            if (view != null) {
                LJIIIZ(view, frameLayout, this.LJLLI, this.LJLLILLLL, this.LLIIJI);
                FrameLayout frameLayout2 = this.LJLJI;
                if (frameLayout2 != null) {
                    View view2 = this.LJLIL;
                    if (view2 != null) {
                        frameLayout2.addView(view2);
                        View view3 = this.LJLJI;
                        if (view3 != null) {
                            linearLayout.addView(view3);
                            View view4 = this.LJLJJI;
                            if (view4 != null) {
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view4.getLayoutParams());
                                layoutParams.gravity = 1;
                                layoutParams.topMargin = (int) C74275TDb.LIZIZ(context, this.LLFF);
                                layoutParams.bottomMargin = (int) C74275TDb.LIZIZ(context, this.LLFFF);
                                layoutParams.leftMargin = (int) C74275TDb.LIZIZ(context, this.LLFII);
                                layoutParams.rightMargin = (int) C74275TDb.LIZIZ(context, this.LLFZ);
                                view4.setLayoutParams(layoutParams);
                                linearLayout.addView(view4);
                            }
                            if (this.LLIIIZ) {
                                View LJ = LJ(context);
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(LJ.getLayoutParams());
                                layoutParams2.gravity = 8388661;
                                LJ.setLayoutParams(layoutParams2);
                                linearLayout.addView(LJ);
                                this.LJLJL = LJ;
                            }
                            LJIIIIZZ(false, true);
                            LJIIJ(false);
                            return;
                        }
                        o.LJIJI("imageLayoutContainer");
                        throw null;
                    }
                    o.LJIJI("imageViewContainer");
                    throw null;
                }
                o.LJIJI("imageLayoutContainer");
                throw null;
            }
            o.LJIJI("imageViewContainer");
            throw null;
        }
        o.LJIJI("imageViewContainer");
        throw null;
    }

    public View LIZLLL(Context context) {
        GradientDrawable LIZ;
        int LIZIZ = (int) C74275TDb.LIZIZ(context, this.LLII);
        int LIZIZ2 = (((int) C74275TDb.LIZIZ(context, this.LLIIJLIL)) * 2) + (LIZIZ * 2);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(this.LJLLLLLL + LIZIZ2, LIZIZ2 + this.LJLZ);
        View view = new View(context);
        view.setLayoutParams(layoutParams);
        int color = context.getResources().getColor(this.LLIIII);
        if (this.LJLLL) {
            TDY tdy = new TDY();
            tdy.LIZLLL(1);
            tdy.LIZIZ(0);
            tdy.LJ(color, LIZIZ);
            LIZ = tdy.LIZ();
        } else {
            TDY tdy2 = new TDY();
            tdy2.LIZLLL(0);
            tdy2.LIZIZ(0);
            tdy2.LJ(color, LIZIZ);
            tdy2.LIZJ(this.LLILL);
            LIZ = tdy2.LIZ();
        }
        view.setBackground(LIZ);
        return view;
    }

    public View LJ(Context context) {
        o.LJIIIZ(context, "context");
        int LIZIZ = (int) C74275TDb.LIZIZ(context, 6.0f);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(LIZIZ, LIZIZ);
        View view = new View(context);
        view.setLayoutParams(layoutParams);
        int color = getResources().getColor(this.LLIIIILZ);
        TDY tdy = new TDY();
        tdy.LIZLLL(1);
        tdy.LIZIZ(color);
        tdy.LJ(color, (int) C74275TDb.LIZIZ(context, this.LLIIIJ));
        view.setBackground(tdy.LIZ());
        return view;
    }

    public View LJFF(Context context) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        o.LJIIIZ(context, "context");
        FrameLayout frameLayout = new FrameLayout(context);
        View content = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), LJI(), frameLayout, false);
        if (this.LLIIJI) {
            i = -2;
        } else {
            i = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i);
        o.LJIIIIZZ(content, "content");
        content.setLayoutParams(layoutParams2);
        frameLayout.addView(content);
        if (this.LLIIJI) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.LJLLLLLL, this.LJLZ);
        }
        frameLayout.setLayoutParams(layoutParams);
        return frameLayout;
    }

    public View LJII(Context context) {
        o.LJIIIZ(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        C8HN c8hn = new C8HN(context);
        c8hn.setLayoutParams(layoutParams);
        c8hn.setGravity(17);
        return c8hn;
    }

    public void LJIIJ(boolean z) {
        int i;
        View view = this.LJLJL;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void setBorderView(View view) {
        this.LJLJJLL = view;
    }

    public void setCustomSelected(boolean z) {
        LJIIIIZZ(z, false);
    }

    public final void setDotView(View view) {
        this.LJLJL = view;
    }

    public final void setImgLayoutHeight(int i) {
        this.LJLLILLLL = i;
    }

    public final void setImgLayoutWidth(int i) {
        this.LJLLI = i;
    }

    public final void setPlaceHolderDrawableCached(Drawable drawable) {
        this.LJLLJ = drawable;
    }

    public void setText(CharSequence charSequence) {
        TextView textView;
        if (charSequence != null && charSequence.length() != 0 && (textView = this.LJLJJL) != null) {
            if (((int) textView.getPaint().measureText(charSequence, 0, charSequence.length())) > this.LJLLLLLL) {
                if (this.LLI) {
                    textView.setGravity(8388611);
                } else {
                    textView.setGravity(17);
                }
            } else {
                textView.setGravity(17);
            }
            textView.setText(charSequence);
        }
    }

    public void LIZIZ(LinearLayout linearLayout, boolean z) {
        int i;
        if (z) {
            i = -1;
        } else {
            i = -2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, -2);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
    }

    public void LJIIIIZZ(boolean z, boolean z2) {
        View borderLayout;
        int i;
        if (this.LJLL == z && !z2) {
            return;
        }
        this.LJLL = z;
        TextView textView = this.LJLJJL;
        if (textView != null) {
            if (z) {
                this.LJLJLJ = textView.getTextColors();
                textView.setTextColor(this.LJLJLLL);
                if (this.LLI) {
                    textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                }
            } else {
                ColorStateList colorStateList = this.LJLJLJ;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
            }
            textView.setEllipsize(null);
            if (this.LLIILII) {
                textView.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
        if ((this.LJLJJLL != null || z) && (borderLayout = getBorderLayout()) != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            borderLayout.setVisibility(i);
        }
    }

    public void LJIIIZ(View imageViewContainer, FrameLayout frameLayout, int i, int i2, boolean z) {
        LinearLayout.LayoutParams layoutParams;
        o.LJIIIZ(imageViewContainer, "imageViewContainer");
        if (z) {
            layoutParams = new LinearLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new LinearLayout.LayoutParams(i, i2);
        }
        layoutParams.gravity = 1;
        frameLayout.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(imageViewContainer.getLayoutParams());
        layoutParams2.gravity = 17;
        imageViewContainer.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TDG(Context context, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z3, boolean z4, int i14, int i15, int i16, int i17, int i18, boolean z5, boolean z6, boolean z7, int i19, int i20, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, int i21, int i22, int i23) {
        super(context);
        int i24 = i5;
        int i25 = i7;
        int i26 = i8;
        int i27 = i19;
        boolean z14 = z6;
        boolean z15 = z5;
        int i28 = i18;
        int i29 = i11;
        int i30 = i12;
        int i31 = i20;
        boolean z16 = z8;
        boolean z17 = z11;
        boolean z18 = z9;
        boolean z19 = z10;
        boolean z20 = z12;
        boolean z21 = z13;
        int i32 = i21;
        int i33 = (i22 & 32) != 0 ? 0 : i4;
        i24 = (i22 & 64) != 0 ? 0 : i24;
        i25 = (i22 & 512) != 0 ? 0 : i25;
        i26 = (i22 & 1024) != 0 ? 0 : i26;
        i29 = (i22 & FileUtils.BUFFER_SIZE) != 0 ? 0 : i29;
        i30 = (i22 & 16384) != 0 ? 0 : i30;
        i28 = (4194304 & i22) != 0 ? i : i28;
        z15 = (8388608 & i22) != 0 ? true : z15;
        z14 = (16777216 & i22) != 0 ? false : z14;
        z7 = (33554432 & i22) != 0 ? false : z7;
        i27 = (67108864 & i22) != 0 ? 0 : i27;
        i31 = (134217728 & i22) != 0 ? 0 : i31;
        z16 = (268435456 & i22) != 0 ? false : z16;
        z18 = (536870912 & i22) != 0 ? false : z18;
        z19 = (1073741824 & i22) != 0 ? false : z19;
        z17 = (i22 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? false : z17;
        z20 = (i23 & 1) != 0 ? false : z20;
        z21 = (i23 & 2) != 0 ? false : z21;
        i32 = (i23 & 4) != 0 ? 0 : i32;
        o.LJIIIZ(context, "context");
        this.LJLLL = z;
        this.LJLLLL = i;
        this.LJLLLLLL = i2;
        this.LJLZ = i3;
        this.LJZ = i33;
        this.LJZI = i24;
        this.LJZL = i6;
        this.LL = z2;
        this.LLD = i25;
        this.LLF = i26;
        this.LLFF = i9;
        this.LLFFF = i10;
        this.LLFII = i29;
        this.LLFZ = i30;
        this.LLI = z3;
        this.LLIFFJFJJ = z4;
        this.LLII = i14;
        this.LLIIII = i15;
        this.LLIIIILZ = i16;
        this.LLIIIJ = i17;
        this.LLIIIL = i28;
        this.LLIIIZ = z15;
        this.LLIIJI = z14;
        this.LLIIJLIL = i27;
        this.LLIIL = i31;
        this.LLIILII = z16;
        this.LLIILZL = z18;
        this.LLIIZ = z19;
        this.LLIL = z17;
        this.LLILII = z20;
        this.LLILIL = z21;
        this.LLILL = i32;
        ColorStateList colorStateList = getResources().getColorStateList(i13);
        o.LJIIIIZZ(colorStateList, "resources.getColorStateList(textColorSelected)");
        this.LJLJLLL = colorStateList;
        this.LJLLI = getImgWidth();
        this.LJLLILLLL = getImgHeight();
        if (!z7) {
            LIZJ(context);
        }
    }
}
