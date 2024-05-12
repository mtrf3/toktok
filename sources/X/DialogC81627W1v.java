package X;

import Y.ACListenerS34S0100000_14;
import Y.ARunnableS15S0110000_9;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.W1v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class DialogC81627W1v extends Dialog {
    public InterfaceC81628W1w LJLIL;
    public boolean LJLILLLLZI;

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "3154707295514357711")).LIZ) {
            super.show();
        }
        View findViewById = findViewById(R.id.j71);
        if (findViewById == null) {
            return;
        }
        findViewById.post(new ARunnableS15S0110000_9(findViewById, 8));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        super.cancel();
        if (!this.LJLILLLLZI) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("page_name", "notification_setting_page");
            c188727au.LJIIIZ("button_name", "background");
            c188727au.LJIIIZ("exp_name", "email_notification_phase2");
            FMX.LJIIL("click_email_bind_popup_page", c188727au.LIZ);
        }
        this.LJLILLLLZI = false;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        if (getWindow() == null) {
            return;
        }
        Window window = getWindow();
        if (window != null) {
            C28289B8j.LIZIZ(0, window);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(KL2.LJIIJJI(getContext()), -2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC81627W1v(Context context) {
        super(context, R.style.a95);
        o.LJIIIZ(context, "context");
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.dimAmount = 0.5f;
            }
            if (window != null) {
                window.addFlags(2);
                window.setAttributes(attributes);
            }
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ckj);
        setCanceledOnTouchOutside(true);
        C16880lQ.LJJJJI((TuxTextView) findViewById(R.id.lz0), new ACListenerS34S0100000_14(this, 98));
        C16880lQ.LJJJJI((TuxTextView) findViewById(R.id.m1c), new ACListenerS34S0100000_14(this, 99));
    }
}
