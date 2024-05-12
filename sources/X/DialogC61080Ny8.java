package X;

import android.view.View;
import android.view.Window;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Ny8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogC61080Ny8 extends C18Z {
    public final InterfaceC61087NyF LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r6.LJLJJI > r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
    
        if (r1 != 3) goto L10;
     */
    @Override // android.app.Dialog, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "ev"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            int r1 = r7.getAction()
            if (r1 == 0) goto L56
            r5 = 1
            if (r1 == r5) goto L4e
            r0 = 2
            if (r1 == r0) goto L21
            r0 = 3
            if (r1 == r0) goto L4e
        L14:
            r5 = 0
        L15:
            X.NyF r0 = r6.LJLJI
            if (r0 == 0) goto L1c
            r0.LIZ(r5)
        L1c:
            boolean r0 = super.dispatchTouchEvent(r7)
            return r0
        L21:
            float r4 = r7.getX()
            float r3 = r7.getY()
            float r1 = r6.LJLJJI
            float r0 = r6.LJLJJLL
            float r0 = r4 - r0
            float r0 = java.lang.Math.abs(r0)
            float r0 = r0 + r1
            r6.LJLJJI = r0
            float r2 = r6.LJLJJL
            float r0 = r6.LJLJL
            float r0 = r3 - r0
            float r1 = java.lang.Math.abs(r0)
            float r1 = r1 + r2
            r6.LJLJJL = r1
            r6.LJLJJLL = r4
            r6.LJLJL = r3
            float r0 = r6.LJLJJI
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L14
            goto L15
        L4e:
            X.NyF r0 = r6.LJLJI
            if (r0 == 0) goto L14
            r0.LIZIZ()
            goto L14
        L56:
            r0 = 0
            r6.LJLJJI = r0
            r6.LJLJJL = r0
            float r0 = r7.getX()
            r6.LJLJJLL = r0
            float r0 = r7.getY()
            r6.LJLJL = r0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC61080Ny8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(View view) {
        o.LJIIIZ(view, "view");
        LJIJI(1);
        super.setContentView(view);
        Window window = getWindow();
        if (window != null) {
            C28289B8j.LIZIZ(0, window);
        }
    }

    @Override // X.C18Z, android.app.Dialog
    public final void setContentView(int i) {
        LJIJI(1);
        super.setContentView(i);
        Window window = getWindow();
        if (window != null) {
            C28289B8j.LIZIZ(0, window);
        }
    }

    public DialogC61080Ny8(ActivityC45651qj activityC45651qj, C61081Ny9 c61081Ny9) {
        super(activityC45651qj, R.style.a_q);
        this.LJLJI = c61081Ny9;
    }
}
