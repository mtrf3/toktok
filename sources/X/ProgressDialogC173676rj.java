package X;

import Y.ARunnableS12S0101000_8;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6rj */
/* loaded from: classes3.dex */
public final class ProgressDialogC173676rj extends ProgressDialog implements DialogInterface.OnKeyListener {
    public final boolean LJLIL;
    public boolean LJLILLLLZI;
    public CharSequence LJLJI;
    public Drawable LJLJJI;
    public String LJLJJL;
    public final Handler LJLJJLL;

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ARunnableS12S0101000_8 aRunnableS12S0101000_8 = new ARunnableS12S0101000_8(2, this, 0);
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            aRunnableS12S0101000_8.run();
        } else {
            this.LJLJJLL.post(aRunnableS12S0101000_8);
        }
    }

    public ProgressDialogC173676rj(Context context) {
        super(context, 3);
        this.LJLIL = true;
        this.LJLJJLL = new Handler(C16880lQ.LLJJJJ());
    }

    public static /* synthetic */ void LIZ(ProgressDialogC173676rj progressDialogC173676rj) {
        C74063T4x c74063T4x = (C74063T4x) progressDialogC173676rj.findViewById(R.id.f6h);
        if (c74063T4x != null) {
            c74063T4x.LIZIZ();
        }
        super.dismiss();
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View findViewById;
        TextView textView;
        super.onCreate(bundle);
        setContentView(R.layout.crw);
        this.LJLILLLLZI = true;
        setMessage(this.LJLJI);
        setIndeterminate(false);
        String str = this.LJLJJL;
        if (this.LJLILLLLZI && (textView = (TextView) findViewById(R.id.l8p)) != null && str != null && str.length() == 0) {
            textView.setText(str);
            textView.setVisibility(0);
        }
        this.LJLJJL = str;
        Drawable drawable = this.LJLJJI;
        if (drawable != null) {
            if (this.LJLILLLLZI && (findViewById = findViewById(R.id.j71)) != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C04270Et.LIZIZ(getContext(), R.drawable.c8n)}));
            }
            this.LJLJJI = drawable;
        }
        setOnKeyListener(this);
    }

    @Override // android.app.ProgressDialog
    public final void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.LJLILLLLZI) {
            C74063T4x c74063T4x = (C74063T4x) findViewById(R.id.f6h);
            if (c74063T4x != null) {
                c74063T4x.setIndeterminate(z);
            }
            View findViewById = findViewById(R.id.ia9);
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            findViewById.setVisibility(i);
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        TextView textView;
        int i;
        super.setMessage(charSequence);
        if (this.LJLILLLLZI && (textView = (TextView) findViewById(R.id.ghd)) != null) {
            textView.setText(charSequence);
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
        }
        this.LJLJI = charSequence;
    }

    @Override // android.app.ProgressDialog
    public final void setProgress(int i) {
        super.setProgress(i);
        TextView textView = (TextView) findViewById(R.id.ia9);
        if (textView != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append("%");
            textView.setText(X1D.LIZIZ(LIZ));
        }
        C74063T4x c74063T4x = (C74063T4x) findViewById(R.id.f6h);
        if (c74063T4x != null) {
            c74063T4x.setProgress(i);
        }
    }
}
