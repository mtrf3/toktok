package X;

import Y.ACListenerS35S0100000_15;
import Y.ARunnableS2S1100000_1;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xjm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class DialogC85670Xjm extends Dialog {
    public final C85671Xjn LJLIL;
    public View LJLILLLLZI;
    public TextView LJLJI;
    public C89S LJLJJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public InterfaceC85669Xjl LJLJL;
    public View.OnClickListener LJLJLJ;
    public View.OnClickListener LJLJLLL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
    }

    @Override // android.app.Dialog
    public final void show() {
        if (!new C03880Dg(2).LIZJ(300000, "android/app/Dialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "6354913932516980527")).LIZ) {
            super.show();
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_type", this.LJLIL.LJ);
        FMX.LJIIL("phone_verification_channel_alert", c35936E8m.LIZ);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.o2);
        this.LJLILLLLZI = findViewById(R.id.b3n);
        this.LJLJI = (TextView) findViewById(R.id.mo6);
        this.LJLJJI = (C89S) findViewById(R.id.m4n);
        this.LJLJJL = (TextView) findViewById(R.id.m6s);
        this.LJLJJLL = (TextView) findViewById(R.id.mj9);
        TextView textView = this.LJLJI;
        if (textView != null) {
            textView.setText(this.LJLIL.LIZ);
        }
        C89S c89s = this.LJLJJI;
        if (c89s != null) {
            C85671Xjn c85671Xjn = this.LJLIL;
            String str = c85671Xjn.LIZIZ;
            String str2 = c85671Xjn.LJFF;
            if (str != null && str.length() != 0) {
                c89s.setText(str);
                c89s.post(new ARunnableS2S1100000_1(c89s, str2, 5));
            }
        }
        TextView textView2 = this.LJLJJL;
        if (textView2 != null) {
            textView2.setText(this.LJLIL.LIZJ);
        }
        TextView textView3 = this.LJLJJLL;
        if (textView3 != null) {
            textView3.setText(this.LJLIL.LIZLLL);
        }
        View view = this.LJLILLLLZI;
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS35S0100000_15(this, 158), view);
        }
        TextView textView4 = this.LJLJJL;
        if (textView4 != null) {
            C16880lQ.LJIJI(textView4, new ACListenerS35S0100000_15(this, 159));
        }
        TextView textView5 = this.LJLJJLL;
        if (textView5 != null) {
            C16880lQ.LJIJI(textView5, new ACListenerS35S0100000_15(this, 160));
        }
        setCanceledOnTouchOutside(false);
    }

    public DialogC85670Xjm(ActivityC45651qj activityC45651qj, C85671Xjn c85671Xjn) {
        super(activityC45651qj, R.style.a4v);
        this.LJLIL = c85671Xjn;
    }
}
