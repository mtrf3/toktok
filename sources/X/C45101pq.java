package X;

import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;

/* renamed from: X.1pq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C45101pq extends QXX {
    public final Context LJLIL;
    public final WindowManager LJLILLLLZI;
    public final WindowManager.LayoutParams LJLJI;
    public View LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;

    public final boolean LLIIIJ() {
        return !this.LJLJL;
    }

    public final void LLLLZLLLI() {
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(1, this, 3);
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            iDRunnableS6S0101000.run();
        } else {
            C15610jN.LIZ().post(iDRunnableS6S0101000);
        }
    }

    public void dismiss() {
        if (!this.LJLJL) {
            WindowManager windowManager = this.LJLILLLLZI;
            View view = this.LJLJJI;
            C51639KOl.LIZIZ(new Object[]{view});
            windowManager.removeView(view);
            this.LJLJL = true;
        }
    }

    public final void init() {
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(0, this, 0);
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            iDRunnableS6S0101000.run();
        } else {
            C15610jN.LIZ().post(iDRunnableS6S0101000);
        }
    }

    public final View getContentView() {
        return this.LJLJJI;
    }

    public C45101pq(Context context) {
        super((Object) null);
        this.LJLJL = true;
        this.LJLIL = context;
        this.LJLILLLLZI = (WindowManager) C16880lQ.LLILL(context, "window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.LJLJI = layoutParams;
        layoutParams.format = 1;
        layoutParams.flags = 552;
        layoutParams.windowAnimations = 0;
    }

    public final void LJJ(int i) {
        if (this.LJLJL) {
            return;
        }
        this.LJLJI.x = i;
        this.LJLJJL = i;
        LLLLZLLLI();
    }

    public final void LJJI(int i) {
        if (this.LJLJL) {
            return;
        }
        this.LJLJI.y = i;
        this.LJLJJLL = i;
        LLLLZLLLI();
    }

    public final void LLLLZ(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.LJLJI;
        layoutParams.gravity = 8388659;
        layoutParams.x = i;
        this.LJLJJL = i;
        layoutParams.y = i2;
        this.LJLJJLL = i2;
    }

    public final void LLLLZIL(int i, int i2) {
        WindowManager.LayoutParams layoutParams = this.LJLJI;
        layoutParams.width = i;
        layoutParams.height = i2;
        LLLLZLLLI();
    }

    public final void LLLLZLLIL(int i, int i2) {
        if (this.LJLJL) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.LJLJI;
        layoutParams.x = i;
        this.LJLJJL = i;
        layoutParams.y = i2;
        this.LJLJJLL = i2;
        LLLLZLLLI();
    }
}
