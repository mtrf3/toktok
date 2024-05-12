package X;

import Y.ACListenerS34S0100000_14;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.W1r, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class DialogC81623W1r extends Dialog {
    public InterfaceC81624W1s LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public TextView LJLJJLL;
    public TextView LJLJL;
    public TextView LJLJLJ;
    public TextView LJLJLLL;

    public DialogC81623W1r(Y5K y5k) {
        super(y5k);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.amk);
        setCanceledOnTouchOutside(false);
        this.LJLJJLL = (TextView) findViewById(R.id.ed8);
        if (TextUtils.isEmpty(this.LJLILLLLZI)) {
            this.LJLJJLL.setVisibility(8);
        } else {
            this.LJLJJLL.setVisibility(0);
            this.LJLJJLL.setText(this.LJLILLLLZI);
        }
        this.LJLJL = (TextView) findViewById(R.id.ed6);
        if (TextUtils.isEmpty(this.LJLJI)) {
            this.LJLJL.setVisibility(8);
        } else {
            this.LJLJL.setText(this.LJLJI);
            this.LJLJL.setVisibility(0);
        }
        TextView textView = (TextView) findViewById(R.id.ed5);
        this.LJLJLJ = textView;
        textView.setText(this.LJLJJI);
        TextView textView2 = (TextView) findViewById(R.id.ed7);
        this.LJLJLLL = textView2;
        textView2.setText(this.LJLJJL);
        C16880lQ.LJIJI(this.LJLJLJ, new ACListenerS34S0100000_14(this, 85));
        C16880lQ.LJIJI(this.LJLJLLL, new ACListenerS34S0100000_14(this, 86));
    }

    public static void LIZ(Y5K y5k, String str, String str2, String str3, String str4, InterfaceC81624W1s interfaceC81624W1s) {
        DialogC81623W1r dialogC81623W1r = new DialogC81623W1r(y5k);
        dialogC81623W1r.LJLILLLLZI = str;
        dialogC81623W1r.LJLJI = str2;
        dialogC81623W1r.LJLJJI = str4;
        dialogC81623W1r.LJLJJL = str3;
        dialogC81623W1r.LJLIL = interfaceC81624W1s;
        Window window = dialogC81623W1r.getWindow();
        if (window != null) {
            C28289B8j.LIZIZ(0, window);
        }
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/pipo/ocr/view/ECommerceDialog", "show", dialogC81623W1r, new Object[0], "void", new C65300Pk0(false, "()V", "-6072374434108882156")).LIZ) {
            return;
        }
        dialogC81623W1r.show();
    }
}
