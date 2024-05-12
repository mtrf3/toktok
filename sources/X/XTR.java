package X;

import Y.ACListenerS35S0100000_15;
import Y.ARunnableS51S0100000_15;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XTR extends ProgressDialog implements DialogInterface.OnKeyListener {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final XTM LJLIL;
    public ViewGroup LJLILLLLZI;
    public ImageView LJLJI;
    public TextView LJLJJI;
    public C223338pd LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public InterfaceC84874XSs LJLJLJ;

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        super.onCreate(bundle);
        setContentView(R.layout.bgg);
        this.LJLILLLLZI = (ViewGroup) findViewById(R.id.j71);
        this.LJLJI = (ImageView) findViewById(R.id.b3o);
        this.LJLJJI = (TextView) findViewById(R.id.ib2);
        this.LJLJJL = (C223338pd) findViewById(R.id.ci0);
        int i = XTN.LIZ[this.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && (viewGroup = this.LJLILLLLZI) != null) {
                    viewGroup.postDelayed(new ARunnableS51S0100000_15(this, 114), 5000L);
                }
            } else {
                ImageView imageView = this.LJLJI;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
            }
        } else {
            ImageView imageView2 = this.LJLJI;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        this.LJLJJLL = true;
        setProgress(this.LJLJL);
        C223338pd c223338pd = this.LJLJJL;
        if (c223338pd != null) {
            c223338pd.LIZIZ();
        }
        setCanceledOnTouchOutside(false);
        ImageView imageView3 = this.LJLJI;
        if (imageView3 != null) {
            C16880lQ.LJIILLIIL(imageView3, new ACListenerS35S0100000_15(this, 247));
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        int i;
        super.setMessage(charSequence);
        if (this.LJLJJLL) {
            TextView textView = this.LJLJJI;
            if (textView != null) {
                textView.setText(charSequence);
            }
            TextView textView2 = this.LJLJJI;
            if (textView2 != null) {
                if (TextUtils.isEmpty(charSequence)) {
                    i = 8;
                } else {
                    i = 0;
                }
                textView2.setVisibility(i);
            }
        }
    }

    @Override // android.app.ProgressDialog
    public final void setProgress(int i) {
        if (i < this.LJLJL) {
            return;
        }
        if (this.LJLJJLL) {
            TextView textView = this.LJLJJI;
            o.LJI(textView);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getContext().getResources().getString(R.string.rjz));
            LIZ.append(i);
            LIZ.append('%');
            textView.setText(X1D.LIZIZ(LIZ));
        }
        this.LJLJL = i;
    }

    public XTR(Context context, XTM xtm) {
        super(context, R.style.a8n);
        this.LJLIL = xtm;
    }
}
