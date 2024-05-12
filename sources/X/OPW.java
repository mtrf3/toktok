package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OPW extends LinearLayout {
    public final FrameLayout LJLIL;
    public final FrameLayout LJLILLLLZI;
    public final FrameLayout LJLJI;
    public final OPX LJLJJI;
    public final OPX LJLJJL;
    public final OPX LJLJJLL;
    public final TuxTextView LJLJL;
    public final int LJLJLJ;
    public final float LJLJLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OPW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return (i - i2) - 1;
    }

    @Override // android.view.ViewGroup
    public final boolean isChildrenDrawingOrderEnabled() {
        return true;
    }

    public final TuxTextView getTextView() {
        return this.LJLJL;
    }

    public final void LIZJ(List<? extends UrlModel> list) {
        List list2;
        if (list != null) {
            list2 = ORZ.LLJILJILJ(list);
        } else {
            list2 = null;
        }
        this.LJLJJI.setVisibility(8);
        this.LJLJJL.setVisibility(8);
        this.LJLJJLL.setVisibility(8);
        this.LJLIL.setVisibility(8);
        this.LJLILLLLZI.setVisibility(8);
        this.LJLJI.setVisibility(8);
        if (list2 == null || list2.isEmpty()) {
            list2 = C47261Igj.LJJIJIL(new UrlModel());
        }
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                UrlModel urlModel = (UrlModel) obj;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            LIZLLL(this.LJLJJLL, this.LJLJI, urlModel, true);
                        }
                    } else {
                        LIZLLL(this.LJLJJL, this.LJLILLLLZI, urlModel, true);
                    }
                } else {
                    LIZLLL(this.LJLJJI, this.LJLIL, urlModel, false);
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        int size = list2.size();
        if (size != 1) {
            if (size != 2) {
                if (size != 3) {
                    return;
                }
                C26338AVi.LJI(this.LJLJI, 0, 0, 0, 0, false, 16);
                return;
            }
            C26338AVi.LJI(this.LJLILLLLZI, 0, 0, 0, 0, false, 16);
            return;
        }
        C26338AVi.LJI(this.LJLIL, 0, 0, 0, 0, false, 16);
    }

    public final void LJ(long j) {
        String LJJIIJ;
        if (j > 0) {
            TuxTextView tuxTextView = this.LJLJL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('+');
            if (j < 1000) {
                LJJIIJ = String.valueOf(j);
            } else if (j < 1000000) {
                LJJIIJ = C62814Ol0.LJJIIJ(j, 1000L, "K");
            } else if (j < 1000000000) {
                LJJIIJ = C62814Ol0.LJJIIJ(j, 1000000L, "M");
            } else {
                LJJIIJ = C62814Ol0.LJJIIJ(j, 1000000000L, "B");
            }
            LIZ.append(LJJIIJ);
            tuxTextView.setText(X1D.LIZIZ(LIZ));
        }
    }

    public static final OPX LIZ(Context context, OPW opw) {
        OPX opx = new OPX(context);
        int i = opw.LJLJLJ;
        opx.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        V92 hierarchy = opx.getHierarchy();
        V8L v8l = new V8L();
        v8l.LIZIZ = true;
        hierarchy.LJIL(v8l);
        opx.setVisibility(8);
        opw.setGravity(17);
        return opx;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OPW(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = this;
            r0 = r15 & 2
            r4 = 0
            if (r0 == 0) goto L6
            r14 = r4
        L6:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r13, r0)
            r2 = 0
            r12.<init>(r13, r14, r2)
            com.bytedance.tux.input.TuxTextView r1 = new com.bytedance.tux.input.TuxTextView
            r0 = 6
            r1.<init>(r13, r4, r0, r2)
            r12.LJLJL = r1
            r0 = 20
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r5)
            int r0 = X.O6R.LJJIIZ(r0)
            r12.LJLJLJ = r0
            r6 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            float r0 = X.C32151Nz.LJIIZILJ(r11)
            r12.LJLJLLL = r0
            r3 = 1
            com.bytedance.ies.abmock.SettingsManager r1 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "ay_avatar_enable_hardware_acceleration"
            r1.getClass()     // Catch: java.lang.Throwable -> L45
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r3)     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L45
            r12.setLayerType(r3, r4)
        L45:
            boolean r0 = X.C26338AVi.LIZJ(r13)
            r12.setLayoutDirection(r0)
            r12.setLayerType(r3, r4)
            r0 = 2131362847(0x7f0a041f, float:1.8345486E38)
            r12.setId(r0)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r8 = -2
            r1.<init>(r8, r8)
            r0 = 17
            r1.gravity = r0
            r12.setLayoutParams(r1)
            r12.setOrientation(r2)
            r7 = 16
            r12.setGravity(r7)
            r12.setClipChildren(r2)
            r12.setClipToPadding(r2)
            X.OPX r4 = LIZ(r13, r12)
            r12.LJLJJI = r4
            X.OPX r10 = LIZ(r13, r12)
            r12.LJLJJL = r10
            X.OPX r9 = LIZ(r13, r12)
            r12.LJLJJLL = r9
            float r0 = X.C32151Nz.LJIIZILJ(r5)
            int r3 = X.O6R.LJJIIZ(r0)
            float r1 = (float) r3
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            r0 = -4
            int r0 = X.C7MY.LIZIZ(r0)
            android.widget.FrameLayout r5 = LIZIZ(r13, r3, r0, r1)
            r5.addView(r4)
            r12.LJLIL = r5
            android.widget.FrameLayout r4 = LIZIZ(r13, r3, r0, r1)
            r4.addView(r10)
            r12.LJLILLLLZI = r4
            android.widget.FrameLayout r3 = LIZIZ(r13, r3, r0, r1)
            android.view.ViewGroup$LayoutParams r1 = r3.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            kotlin.jvm.internal.o.LJII(r1, r0)
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.setMarginEnd(r2)
            r3.addView(r9)
            r12.LJLJI = r3
            com.bytedance.tux.input.TuxTextView r2 = r12.LJLJL
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            int r0 = X.C7MY.LIZIZ(r7)
            r1.<init>(r8, r0)
            r1.gravity = r7
            float r0 = X.C32151Nz.LJIIZILJ(r11)
            int r0 = X.O6R.LJJIIZ(r0)
            r1.setMarginStart(r0)
            r2.setLayoutParams(r1)
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r2.setGravity(r0)
            boolean r0 = X.C26338AVi.LIZJ(r13)
            if (r0 == 0) goto L100
        Le3:
            r2.setTextDirection(r6)
            r0 = 71
            r2.setTuxFont(r0)
            r0 = 2130968766(0x7f0400be, float:1.7546195E38)
            r2.setTextColorRes(r0)
            r12.addView(r5)
            r12.addView(r4)
            r12.addView(r3)
            com.bytedance.tux.input.TuxTextView r0 = r12.LJLJL
            r12.addView(r0)
            return
        L100:
            r6 = 3
            goto Le3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OPW.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static final FrameLayout LIZIZ(Context context, int i, int i2, float f) {
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.setMarginEnd(i2);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZ = Integer.valueOf(C04330Ez.LIZIZ(context, R.color.yb));
        c110614Vt.LIZJ = Float.valueOf(f);
        frameLayout.setBackground(c110614Vt.LIZ(context));
        layoutParams.gravity = 17;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setVisibility(8);
        return frameLayout;
    }

    public final void LIZLLL(OPX opx, FrameLayout frameLayout, UrlModel urlModel, boolean z) {
        Drawable LIZ;
        frameLayout.setVisibility(0);
        opx.setVisibility(0);
        C78746UvO c78746UvO = new C78746UvO(this, z);
        C81033VrB c81033VrB = opx.getHierarchy().LIZLLL;
        if (c81033VrB instanceof C81033VrB) {
            Drawable drawable = c81033VrB.LJLIL;
            if ((drawable instanceof C80628Vke) && (LIZ = ((C80628Vke) drawable).LIZ(2)) != null && LIZ.isVisible() && opx.getWidth() != 0 && opx.getHeight() != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(opx.getWidth(), opx.getHeight(), Bitmap.Config.ARGB_8888);
                LIZ.draw(new Canvas(createBitmap));
                opx.getHierarchy().LJIILLIIL(0);
                opx.getHierarchy().LJIILL(new BitmapDrawable(opx.getResources(), createBitmap), 1);
            }
        }
        C78764Uvg.LJIIIIZZ(opx, urlModel, null, c78746UvO, null);
        Resources resources = getResources();
        C79077V1t c79077V1t = new C79077V1t(resources);
        c79077V1t.LIZJ = resources.getDrawable(R.drawable.bzs);
        opx.setHierarchy(c79077V1t.LIZ());
    }
}
