package X;

import Y.ACListenerS25S0100000_5;
import Y.ACListenerS40S0200000_5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.C2h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class DialogC30679C2h extends DialogC38611fN {
    public final Context LJLILLLLZI;
    public final View LJLJI;
    public TextView LJLJJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public LinearLayout LJLJLJ;
    public TextView LJLJLLL;
    public TextView LJLL;
    public InterfaceC30677C2f LJLLI;
    public InterfaceC30678C2g LJLLILLLL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        InterfaceC30677C2f interfaceC30677C2f = this.LJLLI;
        if (interfaceC30677C2f != null) {
            interfaceC30677C2f.onBackPressed();
        }
        super.onBackPressed();
    }

    @Override // X.DialogC38611fN, android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveControllableDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-4185342925383136438")).LIZ) {
            super.show();
        }
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = (int) this.LJLILLLLZI.getResources().getDimension(R.dimen.agg);
            layoutParams.height = -2;
            window.setAttributes(layoutParams);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
    }

    public DialogC30679C2h(ActivityC45651qj activityC45651qj) {
        super(activityC45651qj, R.style.ac6);
        this.LJLILLLLZI = activityC45651qj;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.d0g, C16880lQ.LLZIL(getContext()), null);
        this.LJLJI = LLLZIIL;
        setContentView(LLLZIIL);
        LJJIIJ(1);
    }

    public final void LJJIIJ(int i) {
        this.LJLJI.findViewById(R.id.lf9);
        this.LJLJI.findViewById(R.id.lf7);
        this.LJLJI.findViewById(R.id.lef);
        this.LJLJJI = (TextView) this.LJLJI.findViewById(R.id.j6j);
        this.LJLJJL = (TextView) this.LJLJI.findViewById(R.id.j6i);
        this.LJLJJLL = (TextView) this.LJLJI.findViewById(R.id.j6e);
        this.LJLJL = (TextView) this.LJLJI.findViewById(R.id.j6d);
        this.LJLJLJ = (LinearLayout) this.LJLJI.findViewById(R.id.j6f);
        this.LJLJLLL = (TextView) this.LJLJI.findViewById(R.id.j6g);
        this.LJLL = (TextView) this.LJLJI.findViewById(R.id.j6h);
        if (i == 1) {
            this.LJLJJLL.setVisibility(0);
            this.LJLJLJ.setVisibility(8);
        } else {
            if (i != 2) {
                return;
            }
            this.LJLJJLL.setVisibility(8);
            this.LJLJLJ.setVisibility(0);
        }
    }

    public final void LJJIIJZLJL(View.OnClickListener onClickListener) {
        this.LJLJL.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        if (r3 <= (r1.getHeight() + r2)) goto L11;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r1 = r6.getAction()
            r0 = 1
            if (r0 != r1) goto L34
            android.content.Context r1 = r5.getContext()
            float r0 = r6.getX()
            int r4 = (int) r0
            float r0 = r6.getY()
            int r3 = (int) r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r1)
            int r2 = r0.getScaledWindowTouchSlop()
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L2d
            android.view.Window r0 = r5.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 != 0) goto L39
        L2d:
            X.C2g r0 = r5.LJLLILLLL
            if (r0 == 0) goto L34
            r0.LIZ()
        L34:
            boolean r0 = super.onTouchEvent(r6)
            return r0
        L39:
            android.view.Window r0 = r5.getWindow()
            android.view.View r1 = r0.getDecorView()
            int r0 = -r2
            if (r4 < r0) goto L2d
            if (r3 < r0) goto L2d
            int r0 = r1.getWidth()
            int r0 = r0 + r2
            if (r4 > r0) goto L2d
            int r0 = r1.getHeight()
            int r0 = r0 + r2
            if (r3 <= r0) goto L34
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC30679C2h.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public DialogC30679C2h(Context context, C30680C2i c30680C2i) {
        super(context, R.style.ac6);
        this.LJLILLLLZI = context;
        int i = c30680C2i.LIZJ;
        View LLLZIIL = C16880lQ.LLLZIIL(i <= 0 ? R.layout.d0g : i, C16880lQ.LLZIL(getContext()), null);
        this.LJLJI = LLLZIIL;
        setContentView(LLLZIIL);
        LJJIIJ(c30680C2i.LIZIZ);
        this.LJLJJI.setText(c30680C2i.LIZLLL);
        this.LJLJJL.setText(c30680C2i.LJ);
        if (TextUtils.isEmpty(c30680C2i.LJ)) {
            this.LJLJJL.setVisibility(8);
        } else {
            this.LJLJJL.setVisibility(0);
        }
        int i2 = c30680C2i.LIZIZ;
        if (i2 == 1) {
            this.LJLJJLL.setVisibility(0);
            this.LJLJLJ.setVisibility(8);
            this.LJLJJLL.setText(c30680C2i.LJFF);
            Drawable drawable = c30680C2i.LJI;
            if (drawable != null) {
                this.LJLJJLL.setBackground(drawable);
            }
            C16880lQ.LJIJI(this.LJLJJLL, new ACListenerS40S0200000_5(this, c30680C2i, 12));
        } else if (i2 == 2) {
            this.LJLJJLL.setVisibility(8);
            this.LJLJLJ.setVisibility(0);
            this.LJLJLLL.setText((CharSequence) null);
            this.LJLL.setText((CharSequence) null);
            C16880lQ.LJIJI(this.LJLJLLL, new ACListenerS25S0100000_5(this, c30680C2i, 129));
            C16880lQ.LJIJI(this.LJLL, new ACListenerS25S0100000_5(this, c30680C2i, 130));
        }
        if (!TextUtils.isEmpty(null)) {
            this.LJLJL.setVisibility(0);
            this.LJLJL.setText((CharSequence) null);
            C16880lQ.LJIJI(this.LJLJL, null);
        }
        setCanceledOnTouchOutside(c30680C2i.LJIIIIZZ);
        setCancelable(c30680C2i.LJIIIZ);
        setOnCancelListener(null);
        setOnDismissListener(null);
        setOnShowListener(null);
    }
}
