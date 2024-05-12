package X;

import Y.IDDListenerS153S0100000_14;
import Y.IDTListenerS122S0100000_14;
import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VYz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC79941VYz {
    public final Context LJLIL;
    public ViewGroup LJLILLLLZI;
    public ViewGroup LJLJI;
    public VZ6 LJLJJI;
    public Dialog LJLJJL;
    public View LJLJJLL;
    public boolean LJLJL;
    public final VZ0 LJLJLJ = new VZ0(this);
    public final IDTListenerS122S0100000_14 LJLJLLL = new IDTListenerS122S0100000_14(this, 8);

    public abstract void LJ();

    public abstract C79924VYi LJFF();

    public final void LJI() {
    }

    public final void LIZJ() {
        AnimationUtils.loadAnimation(this.LJLIL, R.anim.e8);
        AnimationUtils.loadAnimation(this.LJLIL, R.anim.e9);
    }

    public final void LIZLLL() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        LayoutInflater LLZIL = C16880lQ.LLZIL(this.LJLIL);
        LJ();
        ViewGroup viewGroup = (ViewGroup) C16880lQ.LLLLIILL(LLZIL, R.layout.bri, null, false);
        this.LJLJI = viewGroup;
        viewGroup.setBackgroundColor(0);
        ViewGroup viewGroup2 = (ViewGroup) this.LJLJI.findViewById(R.id.btg);
        this.LJLILLLLZI = viewGroup2;
        layoutParams.leftMargin = 30;
        layoutParams.rightMargin = 30;
        viewGroup2.setLayoutParams(layoutParams);
        if (this.LJLJI != null) {
            Dialog dialog = new Dialog(this.LJLIL, R.style.a6l);
            this.LJLJJL = dialog;
            LJFF().getClass();
            dialog.setCancelable(true);
            this.LJLJJL.setContentView(this.LJLJI);
            Window window = this.LJLJJL.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.a97);
                window.setGravity(17);
            }
            this.LJLJJL.setOnDismissListener(new IDDListenerS153S0100000_14(this, 1));
        }
        LJ();
        ViewGroup viewGroup3 = this.LJLJI;
        viewGroup3.setFocusable(true);
        viewGroup3.setFocusableInTouchMode(true);
        viewGroup3.setOnKeyListener(this.LJLJLJ);
        this.LJLJJI = new VZ3(this);
    }

    public final void LIZ() {
        LJ();
        Dialog dialog = this.LJLJJL;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public AbstractC79941VYz(Context context) {
        this.LJLIL = context;
    }

    public final View LIZIZ(int i) {
        return this.LJLILLLLZI.findViewById(i);
    }

    public final void LJII(View view) {
        LJ();
        Dialog dialog = this.LJLJJL;
        if (dialog != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            this.LJLILLLLZI.setLayoutParams(layoutParams);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.a98);
                window.setGravity(80);
                window.setDimAmount(0.3f);
            }
        }
        this.LJLJJLL = view;
        LJ();
        Dialog dialog2 = this.LJLJJL;
        if (dialog2 != null) {
            C16880lQ.LIZ(dialog2);
            WindowManager.LayoutParams attributes = this.LJLJJL.getWindow().getAttributes();
            attributes.width = -1;
            this.LJLJJL.getWindow().setAttributes(attributes);
        }
    }
}
