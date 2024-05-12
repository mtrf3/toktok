package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJ1 {
    public float LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LJ;
    public View LJI;
    public float LJIIIIZZ;
    public CJ4 LJIIIZ;
    public boolean LIZLLL = true;
    public int LJFF = -1;
    public final Handler LJII = new Handler(C16880lQ.LLJJJJ());
    public int LJIIJ = 5;

    public final void LIZ(float f, View view, int i, EmoteModel emoteModel) {
        int i2;
        View view2;
        if (this.LJFF != i && System.currentTimeMillis() - this.LJ > 500 && Math.abs(f - this.LIZ) < 20.0f) {
            this.LIZLLL = false;
            this.LJII.removeCallbacksAndMessages(null);
        }
        int i3 = this.LJFF;
        if (i3 >= 0 && i != i3 && (view2 = this.LJI) != null) {
            view2.setBackground(new ColorDrawable(0));
        }
        if (!this.LIZLLL) {
            View findViewById = view.findViewById(R.id.f2j);
            if (emoteModel.image != null) {
                Context context = view.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                if (this.LJFF == i || findViewById == null) {
                    return;
                }
                this.LJFF = i;
                this.LJI = findViewById;
                float f2 = 126;
                int LJIIJ = (int) C87277YNd.LJIIJ(f2);
                int i4 = i % this.LJIIJ;
                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dah, C16880lQ.LLZIL(context), null);
                View findViewById2 = LLLZIIL.findViewById(R.id.fbt);
                ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (i4 == 0) {
                    marginLayoutParams.setMarginStart(C15380j0.LIZ(25.0f));
                } else if (i4 == this.LJIIJ - 1) {
                    marginLayoutParams.setMarginStart(C15380j0.LIZ(67.0f));
                } else {
                    marginLayoutParams.setMarginStart(C15380j0.LIZ(46.0f));
                }
                findViewById2.setLayoutParams(marginLayoutParams);
                CJ4 cj4 = this.LJIIIZ;
                if (cj4 != null && cj4.isShowing()) {
                    CJ4 cj42 = this.LJIIIZ;
                    o.LJI(cj42);
                    cj42.dismiss();
                } else {
                    this.LJIIIZ = new CJ4();
                }
                CJ4 cj43 = this.LJIIIZ;
                if (cj43 != null) {
                    C87277YNd.LJIIJ(f2);
                    int LJIIJ2 = (int) C87277YNd.LJIIJ(130);
                    cj43.LIZ = LLLZIIL;
                    cj43.setContentView(LLLZIIL);
                    cj43.setWidth(-2);
                    cj43.setHeight(-2);
                    cj43.setOutsideTouchable(true);
                    cj43.LIZIZ = LJIIJ2;
                }
                if (i4 == this.LJIIJ - 1) {
                    i2 = -(LJIIJ - findViewById.getWidth());
                } else {
                    i2 = (-(LJIIJ - findViewById.getWidth())) / 2;
                }
                View findViewById3 = LLLZIIL.findViewById(R.id.f59);
                o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.iv_image)");
                ImageView imageView = (ImageView) findViewById3;
                if (emoteModel.image == null) {
                    return;
                }
                CJ4 cj44 = this.LJIIIZ;
                o.LJI(cj44);
                cj44.dismiss();
                int[] iArr = new int[2];
                findViewById.getLocationInWindow(iArr);
                int i5 = iArr[0] + i2;
                int i6 = iArr[1] - cj44.LIZIZ;
                if (C4XM.LIZ()) {
                    C56308M8a.LIZ();
                }
                C46318IFu.LIZ.getClass();
                if (C46318IFu.LIZ()) {
                    try {
                        C56308M8a.LIZIZ();
                        Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(cj44));
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        int i7 = attributes.flags;
                        boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                        C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                        attributes.flags &= -16777217;
                        cj44.showAtLocation(findViewById, 0, i5, i6);
                        C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                        attributes.flags = i7;
                    } catch (Throwable unused) {
                        cj44.showAtLocation(findViewById, 0, i5, i6);
                    }
                } else {
                    cj44.showAtLocation(findViewById, 0, i5, i6);
                }
                C15640jQ.LJ(imageView, emoteModel.image, 0);
                CJ4 cj45 = this.LJIIIZ;
                o.LJI(cj45);
                cj45.update((int) C87277YNd.LJIIJ(f2), (int) C87277YNd.LJIIJ(130));
            }
        }
    }
}
