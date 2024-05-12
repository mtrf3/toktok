package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UNm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77094UNm {
    public final Context LIZ;
    public final C77095UNn LIZIZ;
    public final C77093UNl LIZJ;
    public EnumC77098UNq LIZLLL;

    public final View LIZJ() {
        View view = new View(this.LIZIZ.getContext());
        view.setId(R.id.e5h);
        Rect LIZIZ = C77101UNt.LIZIZ(this.LIZ);
        if (LIZIZ != null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(LIZIZ.width(), LIZIZ.height()));
        }
        view.setBackground(new ColorDrawable(AnonymousClass636.LJIIIIZZ(R.attr.d4, this.LIZ)));
        return view;
    }

    public final FrameLayout LIZLLL() {
        FrameLayout frameLayout = new FrameLayout(this.LIZIZ.getContext());
        frameLayout.setId(R.id.da3);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public final void LIZIZ() {
        View LIZJ = LIZJ();
        FrameLayout frameLayout = new FrameLayout(this.LIZIZ.getContext());
        frameLayout.setId(R.id.jir);
        List LIZJ2 = C77101UNt.LIZJ(this.LIZ);
        if (LIZJ2 != null) {
            int orientation = this.LIZIZ.getOrientation();
            View findViewById = this.LIZIZ.findViewById(R.id.da3);
            o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.first_container_id)");
            LJ(orientation, (FrameLayout) findViewById, frameLayout, (Rect) ListProtector.get(LIZJ2, 0), (Rect) ListProtector.get(LIZJ2, 1));
        }
        Integer valueOf = Integer.valueOf(this.LIZJ.LIZJ);
        if (valueOf.intValue() != -1) {
            valueOf.intValue();
            frameLayout.addView(C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZ), this.LIZJ.LIZJ, this.LIZIZ, false));
        }
        this.LIZIZ.addView(LIZJ);
        this.LIZIZ.addView(frameLayout);
        this.LIZLLL = EnumC77098UNq.DUAL_SCREEN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        if (r2 != 3) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C77094UNm(android.content.Context r6, X.C77095UNn r7, X.C77093UNl r8) {
        /*
            r5 = this;
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r5.<init>()
            r5.LIZ = r6
            r5.LIZIZ = r7
            r5.LIZJ = r8
            X.UNq r4 = X.EnumC77098UNq.SINGLE_SCREEN
            r5.LIZLLL = r4
            boolean r0 = X.C77101UNt.LJFF(r6)
            r3 = 0
            r1 = -1
            if (r0 == 0) goto Lb0
            r7.removeAllViews()
            int r2 = X.C77101UNt.LIZ(r6)
            r4 = 1
            if (r2 == 0) goto L70
            if (r2 == r4) goto L31
            r0 = 2
            if (r2 == r0) goto L70
            r0 = 3
            if (r2 == r0) goto L31
        L2c:
            X.UNq r4 = X.EnumC77098UNq.DUAL_SCREEN
        L2e:
            r5.LIZLLL = r4
            return
        L31:
            boolean r0 = r8.LJI
            if (r0 != 0) goto L39
            int r0 = r8.LJFF
            if (r0 == r1) goto L5a
        L39:
            android.widget.FrameLayout r2 = r5.LIZLLL()
            int r0 = r8.LJFF
            if (r0 == r1) goto L56
            android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r6)
            int r0 = r8.LJFF
            android.view.View r1 = X.C16880lQ.LLLLIILL(r1, r0, r7, r3)
            if (r1 == 0) goto L56
            boolean r0 = r8.LJI
            if (r0 != 0) goto L53
            r8.LJI = r4
        L53:
            r2.addView(r1)
        L56:
            r7.addView(r2)
            goto L2c
        L5a:
            java.util.List r0 = X.C77101UNt.LIZJ(r6)
            if (r0 == 0) goto L2c
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r5.LIZ(r4, r1, r0)
            goto L2c
        L70:
            boolean r0 = r8.LJ
            if (r0 != 0) goto L78
            int r0 = r8.LIZLLL
            if (r0 == r1) goto L99
        L78:
            android.widget.FrameLayout r2 = r5.LIZLLL()
            int r0 = r8.LIZLLL
            if (r0 == r1) goto L95
            android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r6)
            int r0 = r8.LIZLLL
            android.view.View r1 = X.C16880lQ.LLLLIILL(r1, r0, r7, r3)
            if (r1 == 0) goto L95
            boolean r0 = r8.LJ
            if (r0 != 0) goto L92
            r8.LJ = r4
        L92:
            r2.addView(r1)
        L95:
            r7.addView(r2)
            goto L2c
        L99:
            java.util.List r0 = X.C77101UNt.LIZJ(r6)
            if (r0 == 0) goto L2c
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r4)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r5.LIZ(r3, r1, r0)
            goto L2c
        Lb0:
            r7.removeAllViews()
            android.widget.FrameLayout r2 = r5.LIZLLL()
            int r0 = r8.LIZ
            if (r0 == r1) goto Lc8
            android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r6)
            int r0 = r8.LIZ
            android.view.View r0 = X.C16880lQ.LLLLIILL(r1, r0, r7, r3)
            r2.addView(r0)
        Lc8:
            r7.addView(r2)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77094UNm.<init>(android.content.Context, X.UNn, X.UNl):void");
    }

    public final void LIZ(int i, Rect rect, Rect rect2) {
        boolean z;
        this.LIZIZ.setOrientation(i);
        View LIZJ = LIZJ();
        FrameLayout frameLayout = new FrameLayout(this.LIZIZ.getContext());
        frameLayout.setId(R.id.da3);
        FrameLayout frameLayout2 = new FrameLayout(this.LIZIZ.getContext());
        frameLayout2.setId(R.id.jir);
        LJ(i, frameLayout, frameLayout2, rect, rect2);
        Integer valueOf = Integer.valueOf(this.LIZJ.LIZIZ);
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            valueOf.intValue();
            frameLayout.addView(C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZ), this.LIZJ.LIZIZ, this.LIZIZ, false));
        }
        Integer valueOf2 = Integer.valueOf(this.LIZJ.LIZJ);
        if (valueOf2.intValue() != -1) {
            valueOf2.intValue();
            frameLayout2.addView(C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZ), this.LIZJ.LIZJ, this.LIZIZ, false));
        }
        this.LIZIZ.addView(frameLayout);
        this.LIZIZ.addView(LIZJ);
        this.LIZIZ.addView(frameLayout2);
    }

    public static void LJ(int i, FrameLayout frameLayout, FrameLayout frameLayout2, Rect rect, Rect rect2) {
        if (i == 1) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
            layoutParams.weight = 1.0f;
            frameLayout.setLayoutParams(layoutParams);
            frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, rect2.height()));
            return;
        }
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(rect.width(), -1));
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(rect2.width(), -1));
    }
}
