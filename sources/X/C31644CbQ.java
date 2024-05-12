package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import au3.IDdS56S0100000_5;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeBackground;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.FontStyle;
import com.bytedance.android.live.base.model.user.IconConfig;
import com.bytedance.android.live.base.model.user.NumberConfig;
import com.bytedance.android.live.base.model.user.ProfileCardPanel;
import com.bytedance.android.live.base.model.user.ProfileContent;
import com.bytedance.android.live.base.model.user.ProjectionConfig;
import com.bytedance.android.live.base.model.user.SeparatorConfig;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileBadgeOptimizeSetting;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CbQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31644CbQ extends ConstraintLayout {
    public final C62822Ol8 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public boolean LJLLI;

    private final C73117Smn getBadgeBackground() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-badgeBackground>(...)");
        return (C73117Smn) value;
    }

    private final C47061t0 getBadgeShadow() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-badgeShadow>(...)");
        return (C47061t0) value;
    }

    private final G4P getBadgeText() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-badgeText>(...)");
        return (G4P) value;
    }

    private final LinearLayout getContentContainer() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-contentContainer>(...)");
        return (LinearLayout) value;
    }

    private final LinearLayout getContentContainerOpt() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-contentContainerOpt>(...)");
        return (LinearLayout) value;
    }

    private final View getDivideLine() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-divideLine>(...)");
        return (View) value;
    }

    private final ConstraintLayout getParentGroup() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-parentGroup>(...)");
        return (ConstraintLayout) value;
    }

    private final LiveIconView getPersonIcon() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-personIcon>(...)");
        return (LiveIconView) value;
    }

    private final C47121t6 getPersonNumber() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-personNumber>(...)");
        return (C47121t6) value;
    }

    public final C73117Smn getBadgeIcon() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-badgeIcon>(...)");
        return (C73117Smn) value;
    }

    public static final int LJJZZI(String str) {
        if (str == null) {
            return 0;
        }
        try {
            if (str.length() == 0) {
                return 0;
            }
            return Color.parseColor(str);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void LJJLJLI(BadgeStruct badgeStruct) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        String str;
        String str2;
        CombineBadgeBackground combineBadgeBackground;
        long j;
        float f2;
        int LIZIZ;
        FontStyle fontStyle;
        String str3;
        FontStyle fontStyle2;
        SeparatorConfig separatorConfig;
        String str4;
        long j2;
        ProjectionConfig projectionConfig;
        CombineBadgeStruct combineBadgeStruct = badgeStruct.combineBadgeStruct;
        if (combineBadgeStruct == null) {
            return;
        }
        C31644CbQ c31644CbQ = this;
        C73117Smn badgeBackground = c31644CbQ.getBadgeBackground();
        if ((((int) badgeStruct.greyedByClient) & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        badgeBackground.setGray(z);
        G4P badgeText = c31644CbQ.getBadgeText();
        if ((((int) badgeStruct.greyedByClient) & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        badgeText.setGray(z2);
        C73117Smn badgeIcon = c31644CbQ.getBadgeIcon();
        if ((((int) badgeStruct.greyedByClient) & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        badgeIcon.setGray(z3);
        c31644CbQ.LJJZ(c31644CbQ.getBadgeBackground(), combineBadgeStruct.background, 0, C15380j0.LIZ(8.0f), 0.5f);
        C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(combineBadgeStruct.icon);
        LJIIIZ.LIZLLL(ImageView.ScaleType.FIT_XY);
        LJIIIZ.LJIIJJI = new IDdS56S0100000_5(c31644CbQ, 15);
        LJIIIZ.LJIIJJI(c31644CbQ.getBadgeIcon());
        G4P badgeText2 = c31644CbQ.getBadgeText();
        CharSequence LIZ = C30793C6r.LIZ(combineBadgeStruct.text);
        if (LIZ == null) {
            LIZ = combineBadgeStruct.str;
        }
        badgeText2.setText(LIZ);
        FontStyle fontStyle3 = combineBadgeStruct.fontStyle;
        if (fontStyle3 != null) {
            f = fontStyle3.fontSize;
        } else {
            f = 14.0f;
        }
        badgeText2.setTextSize(f);
        C23010vJ.LJ(700, badgeText2);
        FontStyle fontStyle4 = combineBadgeStruct.fontStyle;
        if (fontStyle4 != null) {
            str = fontStyle4.fontColor;
        } else {
            str = null;
        }
        badgeText2.setTextColor(LJJZZI(str));
        ProfileCardPanel profileCardPanel = combineBadgeStruct.profileCardPanel;
        if (profileCardPanel != null && (projectionConfig = profileCardPanel.projectionConfig) != null && projectionConfig.useProjection) {
            C78720Uuy LJIIIZ2 = C15650jR.LIZ().LJIIIZ(projectionConfig.icon);
            LJIIIZ2.LIZLLL(ImageView.ScaleType.FIT_CENTER);
            LJIIIZ2.LJIIJJI(c31644CbQ.getBadgeShadow());
            C29306Beo.LJJLJLI(c31644CbQ.getBadgeShadow());
        }
        ProfileCardPanel profileCardPanel2 = combineBadgeStruct.profileCardPanel;
        C31644CbQ c31644CbQ2 = c31644CbQ;
        if (profileCardPanel2 != null) {
            ProfileContent profileContent = profileCardPanel2.profileContent;
            c31644CbQ2 = c31644CbQ;
            if (profileContent != null) {
                if (profileContent.useContent) {
                    if (LiveProfileBadgeOptimizeSetting.INSTANCE.enable()) {
                        FontStyle fontStyle5 = combineBadgeStruct.fontStyle;
                        if (fontStyle5 != null && (str4 = fontStyle5.fontColor) != null) {
                            int LJJLL = c31644CbQ.LJJLL(0.1f, str4);
                            int LJJLL2 = c31644CbQ.LJJLL(0.8f, str4);
                            LinearLayout contentContainerOpt = c31644CbQ.getContentContainerOpt();
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(LJJLL);
                            gradientDrawable.setCornerRadius(C15380j0.LIZ(48.0f));
                            contentContainerOpt.setBackground(gradientDrawable);
                            c31644CbQ.getPersonIcon().setIconTint(LJJLL2);
                            c31644CbQ.getPersonNumber().setTextColor(LJJLL2);
                            C47121t6 personNumber = c31644CbQ.getPersonNumber();
                            NumberConfig numberConfig = profileContent.numberConfig;
                            if (numberConfig != null) {
                                j2 = numberConfig.number;
                            } else {
                                j2 = 0;
                            }
                            personNumber.setText(b.LJIILLIIL(j2));
                        }
                        C29306Beo.LJJLJLI(c31644CbQ.getContentContainerOpt());
                        c31644CbQ2 = c31644CbQ;
                    } else {
                        View divideLine = c31644CbQ.getDivideLine();
                        ProfileCardPanel profileCardPanel3 = combineBadgeStruct.profileCardPanel;
                        if (profileCardPanel3 != null && (separatorConfig = profileCardPanel3.separatorConfig) != null) {
                            str2 = separatorConfig.color;
                        } else {
                            str2 = null;
                        }
                        divideLine.setBackground(new ColorDrawable(LJJZZI(str2)));
                        C29306Beo.LJJLJLI(c31644CbQ.getDivideLine());
                        c31644CbQ.getContentContainer().removeAllViews();
                        List<IconConfig> list = profileContent.iconList;
                        if (list != null) {
                            for (IconConfig iconConfig : list) {
                                C47061t0 c47061t0 = new C47061t0(c31644CbQ.getContext());
                                C78720Uuy LJIIIZ3 = C15650jR.LIZ().LJIIIZ(iconConfig.icon);
                                LJIIIZ3.LIZLLL(ImageView.ScaleType.FIT_XY);
                                LJIIIZ3.LJIIL = Boolean.TRUE;
                                LJIIIZ3.LJIIJJI(c47061t0);
                                LinearLayout contentContainer = c31644CbQ.getContentContainer();
                                FrameLayout frameLayout = new FrameLayout(c31644CbQ.getContext());
                                c31644CbQ.LJJZ(frameLayout, iconConfig.background, 1, 0.0f, 1.0f);
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C15380j0.LIZ(16.0f), C15380j0.LIZ(16.0f));
                                layoutParams.gravity = 17;
                                frameLayout.addView(c47061t0, layoutParams);
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(C15380j0.LIZ(18.0f), C15380j0.LIZ(18.0f));
                                layoutParams2.setMarginEnd(C15380j0.LIZ(-4.0f));
                                contentContainer.addView(frameLayout, layoutParams2);
                            }
                        }
                        LinearLayout contentContainer2 = c31644CbQ.getContentContainer();
                        FrameLayout frameLayout2 = new FrameLayout(c31644CbQ.getContext());
                        NumberConfig numberConfig2 = profileContent.numberConfig;
                        if (numberConfig2 != null) {
                            combineBadgeBackground = numberConfig2.background;
                        } else {
                            combineBadgeBackground = null;
                        }
                        C31644CbQ c31644CbQ3 = c31644CbQ;
                        c31644CbQ3.LJJZ(frameLayout2, combineBadgeBackground, 0, C15380j0.LIZ(8.0f), 1.0f);
                        C47121t6 c47121t6 = new C47121t6(frameLayout2.getContext(), null);
                        c47121t6.setMinWidth(C15380j0.LIZ(16.0f));
                        c47121t6.setGravity(17);
                        NumberConfig numberConfig3 = profileContent.numberConfig;
                        if (numberConfig3 != null) {
                            j = numberConfig3.number;
                        } else {
                            j = 0;
                        }
                        c47121t6.setText(b.LJIILLIIL(j));
                        NumberConfig numberConfig4 = profileContent.numberConfig;
                        if (numberConfig4 != null && (fontStyle2 = numberConfig4.fontStyle) != null) {
                            f2 = fontStyle2.fontSize;
                        } else {
                            f2 = 10.0f;
                        }
                        c47121t6.setTextSize(f2);
                        NumberConfig numberConfig5 = profileContent.numberConfig;
                        if (numberConfig5 != null && (fontStyle = numberConfig5.fontStyle) != null && (str3 = fontStyle.fontColor) != null) {
                            LIZIZ = Integer.valueOf(LJJZZI(str3)).intValue();
                        } else {
                            LIZIZ = C15380j0.LIZIZ(R.color.cn);
                        }
                        c47121t6.setTextColor(LIZIZ);
                        c47121t6.setIncludeFontPadding(false);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams3.setMarginStart(C15380j0.LIZ(4.0f));
                        layoutParams3.setMarginEnd(C15380j0.LIZ(4.0f));
                        layoutParams3.topMargin = C15380j0.LIZ(2.0f);
                        layoutParams3.bottomMargin = C15380j0.LIZ(2.0f);
                        frameLayout2.addView(c47121t6, layoutParams3);
                        contentContainer2.addView(frameLayout2);
                        C29306Beo.LJJLJLI(c31644CbQ3.getContentContainer());
                        c31644CbQ2 = c31644CbQ3;
                    }
                } else {
                    C29306Beo.LJI(c31644CbQ.getDivideLine());
                    C29306Beo.LJI(c31644CbQ.getContentContainer());
                    C29306Beo.LJI(c31644CbQ.getContentContainerOpt());
                    c31644CbQ2 = c31644CbQ;
                }
            }
        }
        if (!c31644CbQ2.LJLLI) {
            c31644CbQ2.getBadgeText().measure(0, 0);
            if (c31644CbQ2.getBadgeText().getMeasuredWidth() < C15380j0.LJFF(R.dimen.afa)) {
                ViewGroup.LayoutParams layoutParams4 = c31644CbQ2.getBadgeText().getLayoutParams();
                o.LJII(layoutParams4, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4;
                marginLayoutParams.setMarginStart(((C15380j0.LJFF(R.dimen.afa) - c31644CbQ2.getBadgeText().getMeasuredWidth()) / 2) + marginLayoutParams.getMarginStart());
                c31644CbQ2.getBadgeText().setLayoutParams(marginLayoutParams);
            }
        }
        c31644CbQ2.LJLLI = true;
    }

    public final int LJJLL(float f, String str) {
        int LJJZZI;
        try {
            StringBuilder sb = new StringBuilder(str);
            String hexString = Integer.toHexString((int) (f * 255));
            o.LJIIIIZZ(hexString, "toHexString((alpha * 255).toInt())");
            String upperCase = hexString.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            if (str.length() == 7) {
                sb.insert(1, upperCase);
                LJJZZI = LJJZZI(sb.toString());
            } else if (str.length() == 9) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('#');
                LIZ.append(upperCase);
                LIZ.append(sb.substring(3, 9));
                LJJZZI = LJJZZI(X1D.LIZIZ(LIZ));
            } else {
                LJJZZI = LJJZZI(sb.toString());
            }
            return LJJZZI;
        } catch (Exception unused) {
            return LJJZZI(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31644CbQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
        this.LJLIL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 454));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 447));
        this.LJLJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 449));
        this.LJLJJI = C221108m2.LIZIZ(new AqS155S0100000_5(this, 448));
        this.LJLJJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 450));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 453));
        this.LJLJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 451));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 452));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 455));
        this.LJLL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 456));
        ViewGroup.inflate(context, R.layout.cyf, this);
        setWillNotDraw(false);
        if (LiveProfileBadgeOptimizeSetting.INSTANCE.enable() && C15380j0.LJIIL() <= C15380j0.LIZ(360.0f)) {
            getParentGroup().setMinWidth(C15380j0.LIZ(100.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0013, code lost:
    
        if (r6 != null) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZ(android.view.View r5, com.bytedance.android.live.base.model.user.CombineBadgeBackground r6, int r7, float r8, float r9) {
        /*
            r4 = this;
            r3 = 0
            if (r6 == 0) goto La1
            com.bytedance.android.live.base.model.ImageModel r0 = r6.image
            if (r0 == 0) goto L15
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L13
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L72
        L13:
            if (r6 == 0) goto La1
        L15:
            java.lang.String r0 = r6.backgroundColorCode
        L17:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L48
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setShape(r7)
            r2.setCornerRadius(r8)
            if (r6 == 0) goto L46
            java.lang.String r0 = r6.backgroundColorCode
        L2c:
            int r0 = LJJZZI(r0)
            r2.setColor(r0)
            int r1 = X.C15380j0.LIZ(r9)
            if (r6 == 0) goto L3b
            java.lang.String r3 = r6.borderColorCode
        L3b:
            int r0 = LJJZZI(r3)
            r2.setStroke(r1, r0)
            r5.setBackground(r2)
        L45:
            return
        L46:
            r0 = r3
            goto L2c
        L48:
            if (r6 == 0) goto L70
            java.lang.String r0 = r6.borderColorCode
        L4c:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L45
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setShape(r7)
            r2.setCornerRadius(r8)
            int r1 = X.C15380j0.LIZ(r9)
            if (r6 == 0) goto L65
            java.lang.String r3 = r6.borderColorCode
        L65:
            int r0 = LJJZZI(r3)
            r2.setStroke(r1, r0)
            r5.setBackground(r2)
            goto L45
        L70:
            r0 = r3
            goto L4c
        L72:
            android.graphics.drawable.GradientDrawable r2 = new android.graphics.drawable.GradientDrawable
            r2.<init>()
            r2.setShape(r7)
            r2.setCornerRadius(r8)
            int r1 = X.C15380j0.LIZ(r9)
            if (r6 == 0) goto L9f
            java.lang.String r0 = r6.borderColorCode
        L85:
            int r0 = LJJZZI(r0)
            r2.setStroke(r1, r0)
            r5.setBackground(r2)
            X.BQO r0 = X.C15650jR.LIZ()
            if (r6 == 0) goto L97
            com.bytedance.android.live.base.model.ImageModel r3 = r6.image
        L97:
            X.Uuy r0 = r0.LJIIIZ(r3)
            r0.LJIIJJI(r5)
            goto L45
        L9f:
            r0 = r3
            goto L85
        La1:
            r0 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31644CbQ.LJJZ(android.view.View, com.bytedance.android.live.base.model.user.CombineBadgeBackground, int, float, float):void");
    }
}
