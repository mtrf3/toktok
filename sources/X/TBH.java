package X;

import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes13.dex */
public final class TBH {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(TBI.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(TBG.LJLIL);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(android.graphics.Canvas r5, X.OSZ<java.lang.Boolean, java.lang.Boolean> r6, boolean r7) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            boolean r0 = X.C30922CBq.LIZIZ
            if (r0 != 0) goto La
            return
        La:
            java.lang.Object r0 = r6.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r6.getSecond()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L36
            java.lang.String r3 = "v & a"
        L24:
            X.Ol8 r0 = X.TBH.LIZIZ
            java.lang.Object r2 = r0.getValue()
            android.graphics.Paint r2 = (android.graphics.Paint) r2
            r1 = 1092616192(0x41200000, float:10.0)
            r0 = 1125515264(0x43160000, float:150.0)
            r5.drawText(r3, r1, r0, r2)
        L33:
            if (r7 != 0) goto L54
            return
        L36:
            java.lang.Object r0 = r6.getFirst()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L45
            java.lang.String r3 = "v"
            goto L24
        L45:
            java.lang.Object r0 = r6.getSecond()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L33
            java.lang.String r3 = "a"
            goto L24
        L54:
            X.Ol8 r4 = X.TBH.LIZ
            java.lang.Object r3 = r4.getValue()
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            int r2 = r5.getWidth()
            int r1 = r5.getHeight()
            r0 = 0
            r3.setBounds(r0, r0, r2, r1)
            java.lang.Object r0 = r4.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.draw(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TBH.LIZIZ(android.graphics.Canvas, X.OSZ, boolean):void");
    }

    public static final void LIZJ(ImageView imageView, float f, float f2) {
        if (imageView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = C15380j0.LIZ(f);
        layoutParams.height = C15380j0.LIZ(f2);
        imageView.setLayoutParams(layoutParams);
    }

    public static final void LIZ(int i, C47061t0 c47061t0, C47121t6 c47121t6, C47121t6 c47121t62) {
        if (i <= C15380j0.LIZ(80.0f)) {
            LIZJ(c47061t0, 50.0f, 30.0f);
        } else if (i > C15380j0.LIZ(80.0f) && i <= C15380j0.LIZ(110.0f)) {
            LIZJ(c47061t0, 60.0f, 36.0f);
        } else if (i > C15380j0.LIZ(110.0f) && i <= C15380j0.LIZ(210.0f)) {
            LIZJ(c47061t0, 88.0f, 53.0f);
        } else if (i > C15380j0.LIZ(210.0f)) {
            LIZJ(c47061t0, 188.0f, 113.0f);
        }
        if (i < C15380j0.LIZ(160.0f)) {
            if (c47121t6 != null) {
                c47121t6.setVisibility(8);
            }
            if (c47121t62 == null) {
                return;
            }
            c47121t62.setVisibility(8);
            return;
        }
        if (i >= C15380j0.LIZ(160.0f) && i < C15380j0.LIZ(220.0f)) {
            if (c47121t6 != null) {
                c47121t6.setVisibility(0);
            }
            if (c47121t62 != null) {
                c47121t62.setVisibility(0);
            }
            if (c47121t6 != null) {
                c47121t6.setTextSize(10.0f);
            }
            if (c47121t62 == null) {
                return;
            }
            c47121t62.setTextSize(10.0f);
            return;
        }
        if (i <= C15380j0.LIZ(220.0f)) {
            return;
        }
        if (c47121t6 != null) {
            c47121t6.setVisibility(0);
        }
        if (c47121t62 != null) {
            c47121t62.setVisibility(0);
        }
        if (c47121t6 != null) {
            c47121t6.setTextSize(17.0f);
        }
        if (c47121t62 == null) {
            return;
        }
        c47121t62.setTextSize(15.0f);
    }
}
