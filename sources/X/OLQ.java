package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import java.util.concurrent.CancellationException;
import ujb.o;
import v82.IDdS502S0100000_10;

/* loaded from: classes11.dex */
public final class OLQ {
    public static final /* synthetic */ int LIZ = 0;

    public static Integer LIZJ(String str) {
        boolean z;
        Object LIZ2;
        if (str == null || o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            LIZ2 = Integer.valueOf(Color.parseColor(str));
            C3C5.m7constructorimpl(LIZ2);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (!C3C5.m12isFailureimpl(LIZ2)) {
            obj = LIZ2;
        }
        return (Integer) obj;
    }

    public static void LIZIZ(ViewGroup viewGroup, Image image) {
        int i;
        kotlin.jvm.internal.o.LJIIIZ(viewGroup, "<this>");
        if (image == null) {
            return;
        }
        W5F LJIIIZ = W5U.LJIIIZ(image.toImageUrlModel());
        Integer width = image.getWidth();
        int i2 = 0;
        if (width != null) {
            i = width.intValue();
        } else {
            i = 0;
        }
        Integer height = image.getHeight();
        if (height != null) {
            i2 = height.intValue();
        }
        if (i > 0 && i2 > 0) {
            LJIIIZ.LJIIIZ = i;
            LJIIIZ.LJIIJ = i2;
        }
        LJIIIZ.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LJIIIZ.LJJI = KL0.HIGH;
        LJIIIZ.LIZIZ("feed_ec_card");
        LJIIIZ.LJIIIZ(new IDdS502S0100000_10(viewGroup, 4));
    }

    public static void LJFF(TuxTextView tuxTextView, String str, Integer num) {
        Integer LIZ2 = LIZ(str, null, tuxTextView.getContext(), num);
        if (LIZ2 != null) {
            tuxTextView.setTextColor(LIZ2.intValue());
        }
    }

    public static Integer LIZ(String str, String str2, Context context, Integer num) {
        Integer LJI;
        Integer LIZJ;
        Integer LIZJ2 = LIZJ(str);
        if (LIZJ2 != null) {
            return LIZJ2;
        }
        if (str2 == null || o.LJJJJJL(str2) || (LIZJ = LIZJ(str2)) == null) {
            if (context != null && num != null && (LJI = C79045V0n.LJI(num.intValue(), context)) != null) {
                return LJI;
            }
            return null;
        }
        return LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0098 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #0 {all -> 0x00a3, blocks: (B:31:0x001c, B:33:0x0022, B:36:0x002e, B:19:0x0082, B:21:0x0098, B:14:0x005c, B:16:0x0066, B:18:0x006c, B:28:0x0090), top: B:30:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.SY4 r8, java.lang.String r9, java.lang.String r10, java.lang.Integer r11, int r12, int r13) {
        /*
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r10 = r1
        L6:
            r0 = r13 & 8
            if (r0 == 0) goto Lb
            r11 = r1
        Lb:
            r0 = r13 & 16
            r2 = 0
            if (r0 == 0) goto L11
            r12 = 0
        L11:
            r0 = r13 & 32
            r7 = 1
            if (r0 == 0) goto L1a
            r6 = 1
        L17:
            if (r10 == 0) goto L5c
            goto L1c
        L1a:
            r6 = 0
            goto L17
        L1c:
            boolean r0 = kotlin.jvm.internal.o.LJ(r10, r9)     // Catch: java.lang.Throwable -> La3
            if (r0 != 0) goto L5c
            java.lang.Integer r5 = LIZJ(r9)     // Catch: java.lang.Throwable -> La3
            java.lang.Integer r4 = LIZJ(r10)     // Catch: java.lang.Throwable -> La3
            if (r5 == 0) goto L5c
            if (r4 == 0) goto L5c
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> La3
            r3.<init>()     // Catch: java.lang.Throwable -> La3
            r3.setShape(r2)     // Catch: java.lang.Throwable -> La3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> La3
            float r0 = X.C32151Nz.LJIIZILJ(r0)     // Catch: java.lang.Throwable -> La3
            r3.setCornerRadius(r0)     // Catch: java.lang.Throwable -> La3
            r3.setGradientType(r2)     // Catch: java.lang.Throwable -> La3
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT     // Catch: java.lang.Throwable -> La3
            r3.setOrientation(r0)     // Catch: java.lang.Throwable -> La3
            r0 = 2
            int[] r1 = new int[r0]     // Catch: java.lang.Throwable -> La3
            int r0 = r5.intValue()     // Catch: java.lang.Throwable -> La3
            r1[r2] = r0     // Catch: java.lang.Throwable -> La3
            int r0 = r4.intValue()     // Catch: java.lang.Throwable -> La3
            r1[r7] = r0     // Catch: java.lang.Throwable -> La3
            r3.setColors(r1)     // Catch: java.lang.Throwable -> La3
            goto L82
        L5c:
            android.content.Context r0 = r8.getContext()     // Catch: java.lang.Throwable -> La3
            java.lang.Integer r0 = LIZ(r9, r1, r0, r11)     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto La3
            int r1 = r0.intValue()     // Catch: java.lang.Throwable -> La3
            if (r12 <= 0) goto L90
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch: java.lang.Throwable -> La3
            r3.<init>()     // Catch: java.lang.Throwable -> La3
            r3.setShape(r2)     // Catch: java.lang.Throwable -> La3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> La3
            float r0 = X.C32151Nz.LJIIZILJ(r0)     // Catch: java.lang.Throwable -> La3
            r3.setCornerRadius(r0)     // Catch: java.lang.Throwable -> La3
            r3.setColor(r1)     // Catch: java.lang.Throwable -> La3
        L82:
            android.graphics.drawable.StateListDrawable r1 = new android.graphics.drawable.StateListDrawable     // Catch: java.lang.Throwable -> La3
            r1.<init>()     // Catch: java.lang.Throwable -> La3
            int[] r0 = new int[r2]     // Catch: java.lang.Throwable -> La3
            r1.addState(r0, r3)     // Catch: java.lang.Throwable -> La3
            r8.setBackground(r1)     // Catch: java.lang.Throwable -> La3
            goto L96
        L90:
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable     // Catch: java.lang.Throwable -> La3
            r3.<init>(r1)     // Catch: java.lang.Throwable -> La3
            goto L82
        L96:
            if (r6 == 0) goto La3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> La3
            float r0 = X.C32151Nz.LJIIZILJ(r0)     // Catch: java.lang.Throwable -> La3
            X.C78897Uxp.LJJJJJL(r8, r0)     // Catch: java.lang.Throwable -> La3
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OLQ.LIZLLL(X.SY4, java.lang.String, java.lang.String, java.lang.Integer, int, int):void");
    }

    public static void LJ(ViewGroup viewGroup, String str, String str2, String str3, String str4, Integer num, int i, int i2) {
        Drawable drawable;
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            str4 = null;
        }
        if ((i2 & 16) != 0) {
            num = null;
        }
        if ((i2 & 32) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.o.LJIIIZ(viewGroup, "<this>");
        if (str3 != null) {
            try {
                if (!kotlin.jvm.internal.o.LJ(str3, str)) {
                    Integer LIZJ = LIZJ(str);
                    Integer LIZJ2 = LIZJ(str3);
                    if (LIZJ != null && LIZJ2 != null) {
                        List LJJIJIL = C47261Igj.LJJIJIL(LIZJ, LIZJ2);
                        Integer LIZJ3 = LIZJ(str2);
                        if (LIZJ3 != null) {
                            ListProtector.add(LJJIJIL, 1, LIZJ3);
                        }
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(0);
                        gradientDrawable.setCornerRadius(C32151Nz.LJIIZILJ(Integer.valueOf(i)));
                        gradientDrawable.setGradientType(0);
                        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
                        gradientDrawable.setColors(ORZ.LLJ(LJJIJIL));
                        drawable = gradientDrawable;
                        viewGroup.setBackground(drawable);
                    }
                }
            } catch (Throwable unused) {
                return;
            }
        }
        Integer LIZ2 = LIZ(str, str4, viewGroup.getContext(), num);
        if (LIZ2 != null) {
            int intValue = LIZ2.intValue();
            if (i > 0) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(C32151Nz.LJIIZILJ(Integer.valueOf(i)));
                gradientDrawable2.setColor(intValue);
                drawable = gradientDrawable2;
            } else {
                drawable = new ColorDrawable(intValue);
            }
            viewGroup.setBackground(drawable);
        }
    }
}
