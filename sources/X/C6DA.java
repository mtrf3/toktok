package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6DA, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6DA {
    public static final List<C6DA> LJIIIZ = new ArrayList();
    public final View LIZ;
    public final C6GI LIZIZ;
    public boolean LIZJ;
    public InterfaceC82683Wch LIZLLL;
    public final Context LJ;
    public final C139355dT LJFF;
    public final Handler LJI;
    public WHL LJII;
    public int LJIIIIZZ;

    public boolean LIZ(C6DL c6dl) {
        o.LJIIIZ(c6dl, "<this>");
        return false;
    }

    public abstract View LJFF();

    public final View LIZJ() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) C74275TDb.LIZIZ(this.LJ, 0.5f));
        View view = new View(this.LJ);
        layoutParams.leftMargin = (int) C74275TDb.LIZIZ(this.LJ, 12.0f);
        layoutParams.rightMargin = (int) C74275TDb.LIZIZ(this.LJ, 12.0f);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, this.LJ));
        view.setAlpha(0.2f);
        return view;
    }

    public final LinearLayout LIZLLL() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.LJ);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setMinimumWidth((int) C74275TDb.LIZIZ(this.LJ, 104.0f));
        linearLayout.setGravity(16);
        return linearLayout;
    }

    public final void LJ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LIZLLL;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    public final boolean LJII() {
        this.LJI.removeCallbacksAndMessages(null);
        InterfaceC82683Wch interfaceC82683Wch = this.LIZLLL;
        if (interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) {
            InterfaceC82683Wch interfaceC82683Wch2 = this.LIZLLL;
            if (interfaceC82683Wch2 != null) {
                interfaceC82683Wch2.dismiss();
            }
            this.LIZLLL = null;
            return true;
        }
        this.LIZLLL = null;
        return false;
    }

    public void LJIIIZ() {
        ((ArrayList) LJIIIZ).add(this);
    }

    public void LJIIJ() {
        ((ArrayList) LJIIIZ).remove(this);
    }

    public final void LJIIJJI(int i) {
        if (i <= 0) {
            return;
        }
        this.LJIIIIZZ = i;
    }

    public C6DA(View contentView, AbstractC38911fr abstractC38911fr) {
        o.LJIIIZ(contentView, "contentView");
        this.LIZ = contentView;
        this.LIZIZ = abstractC38911fr;
        Context context = contentView.getContext();
        o.LJIIIIZZ(context, "contentView.context");
        this.LJ = context;
        this.LJFF = new C139355dT();
        this.LJI = new Handler();
        this.LJII = WHL.TOP;
        this.LJIIIIZZ = 1;
    }

    public final LinearLayout LIZIZ(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C74275TDb.LIZIZ(this.LJ, 44.0f));
        LinearLayout linearLayout = new LinearLayout(this.LJ);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setMinimumWidth((int) C74275TDb.LIZIZ(this.LJ, 104.0f));
        AttributeSet attributeSet = null;
        TuxTextView tuxTextView = new TuxTextView(this.LJ, attributeSet, 6, 0);
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, this.LJ));
        tuxTextView.setTuxFont(102);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.LJ.getString(i2));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart((int) C74275TDb.LIZIZ(this.LJ, 4.0f));
        layoutParams2.setMarginEnd((int) C74275TDb.LIZIZ(this.LJ, 12.0f));
        tuxTextView.setLayoutParams(layoutParams2);
        C170736mz c170736mz = new C170736mz(this.LJ, null);
        c170736mz.setImageResource(i);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        if (C74275TDb.LJFF(this.LJ)) {
            layoutParams3.setMarginEnd((int) C74275TDb.LIZIZ(this.LJ, 12.0f));
        } else {
            layoutParams3.setMarginStart((int) C74275TDb.LIZIZ(this.LJ, 12.0f));
        }
        c170736mz.setLayoutParams(layoutParams3);
        linearLayout.addView(c170736mz, 0);
        linearLayout.addView(tuxTextView, 1);
        c170736mz.setLayoutDirection(0);
        return linearLayout;
    }

    public final boolean LJIIIIZZ(PointF pointF, boolean z) {
        float LIZIZ = C74275TDb.LIZIZ(this.LJ, 41.0f);
        float LIZIZ2 = (LIZIZ * this.LJIIIIZZ) + C74275TDb.LIZIZ(this.LJ, 12.0f) + C74275TDb.LIZIZ(this.LJ, 60.0f);
        Object LLILL = C16880lQ.LLILL(C16880lQ.LLLLL(this.LJ), "window");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) LLILL).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        if (z) {
            float f = pointF.x;
            if (f < 0.0f || pointF.y < LIZIZ2 || f > width) {
                return true;
            }
            return false;
        }
        float f2 = pointF.x;
        if (f2 < 0.0f || f2 > width || pointF.y > height - LIZIZ2) {
            return true;
        }
        return false;
    }

    public static PointF LJI(RectF rectF, float f, boolean z) {
        PointF pointF = new PointF();
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        float f5 = rectF.bottom;
        float[] fArr = {f2, f3, f4, f3, f2, f5, f4, f5};
        Matrix matrix = new Matrix();
        float f6 = fArr[2];
        float f7 = fArr[0];
        float LIZ = C1I0.LIZ(f6, f7, 2.0f, f7);
        float f8 = fArr[5];
        float f9 = fArr[3];
        matrix.postRotate(f, LIZ, ((f8 - f9) / 2.0f) + f9);
        matrix.mapPoints(fArr);
        float f10 = fArr[1] + fArr[3];
        float f11 = fArr[5] + fArr[7];
        if (f10 < f11 && !z) {
            pointF.set((fArr[0] + fArr[2]) / 2.0f, f10 / 2.0f);
        } else {
            pointF.set((fArr[4] + fArr[6]) / 2.0f, f11 / 2.0f);
        }
        return pointF;
    }

    public void LJIIL(RectF helpBoxRect, int i, int i2, float f, boolean z) {
        o.LJIIIZ(helpBoxRect, "helpBoxRect");
        PointF LJI = LJI(helpBoxRect, f, false);
        WHL whl = WHL.TOP;
        this.LJII = whl;
        if (LJIIIIZZ(LJI, true)) {
            LJI = LJI(helpBoxRect, f, true);
            this.LJII = WHL.BOTTOM;
            if (LJIIIIZZ(LJI, false)) {
                LJI.x = i;
                LJI.y = i2;
                this.LJII = whl;
            }
        }
        if (LIZ(new C6DL(this.LJ))) {
            C6DJ c6dj = new C6DJ(this.LJ);
            c6dj.LJIIIIZZ(AnonymousClass636.LJIIIIZZ(R.attr.gy, this.LJ));
            c6dj.LJI(this.LJII);
            c6dj.LJIIJJI(new AqS168S0100000_2(this, 516));
            c6dj.LIZ.LJFF = 4;
            c6dj.LIZ((int) LJI.x, (int) LJI.y);
            c6dj.LIZ.LJII = -1001L;
            InterfaceC82683Wch LIZJ = c6dj.LIZJ();
            this.LIZLLL = LIZJ;
            LIZJ.show();
            return;
        }
        C142425iQ c142425iQ = new C142425iQ(this.LJ);
        c142425iQ.LJIIIIZZ(AnonymousClass636.LJIIIIZZ(R.attr.gy, this.LJ));
        c142425iQ.LIZ.LJFF = 4;
        c142425iQ.LIZ((int) LJI.x, (int) LJI.y);
        c142425iQ.LJI(this.LJII);
        c142425iQ.LIZLLL(LJFF());
        c142425iQ.LJIIJ(null, true);
        C82682Wcg c82682Wcg = c142425iQ.LIZ;
        c82682Wcg.LJIJJLI = true;
        c82682Wcg.LJII = -1001L;
        InterfaceC82683Wch LIZJ2 = c142425iQ.LIZJ();
        this.LIZLLL = LIZJ2;
        LIZJ2.show();
    }
}
