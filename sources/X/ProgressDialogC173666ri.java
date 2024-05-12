package X;

import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6ri */
/* loaded from: classes3.dex */
public final class ProgressDialogC173666ri extends ProgressDialog implements DialogInterface.OnKeyListener {
    public final boolean LJLIL;
    public boolean LJLILLLLZI;
    public CharSequence LJLJI;
    public Drawable LJLJJI;
    public String LJLJJL;
    public long LJLJJLL;
    public final Handler LJLJL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(6, this, 13);
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            iDRunnableS6S0101000.run();
        } else {
            this.LJLJL.post(iDRunnableS6S0101000);
        }
    }

    public ProgressDialogC173666ri(Context context) {
        super(context, 3);
        this.LJLIL = true;
        this.LJLJL = new Handler(C16880lQ.LLJJJJ());
    }

    public static /* synthetic */ void LIZ(ProgressDialogC173666ri progressDialogC173666ri) {
        progressDialogC173666ri.getClass();
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        TextView textView;
        super.onCreate(bundle);
        setContentView(R.layout.ajs);
        this.LJLILLLLZI = true;
        setMessage(this.LJLJI);
        setIndeterminate(false);
        String str = this.LJLJJL;
        if (this.LJLILLLLZI && (textView = (TextView) findViewById(R.id.l8p)) != null && !C38354F3m.LJ(str)) {
            textView.setText(str);
            KL2.LJIILLIIL(0, textView);
        }
        this.LJLJJL = str;
        Drawable drawable = this.LJLJJI;
        if (drawable != null) {
            if (this.LJLILLLLZI) {
                findViewById(R.id.j71);
            }
            this.LJLJJI = drawable;
        }
        setOnKeyListener(this);
        this.LJLJJLL = System.currentTimeMillis();
    }

    @Override // android.app.ProgressDialog
    public final void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.LJLILLLLZI) {
            ProgressBar progressBar = (ProgressBar) findViewById(R.id.f6h);
            if (progressBar != null) {
                progressBar.setIndeterminate(z);
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
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.f6h);
        if (progressBar != null) {
            progressBar.setProgress(i);
        }
    }

    public static ProgressDialogC173666ri LIZIZ(Context context, String str) {
        ProgressDialogC173666ri progressDialogC173666ri = new ProgressDialogC173666ri(context);
        progressDialogC173666ri.setCancelable(false);
        progressDialogC173666ri.setIndeterminate(false);
        progressDialogC173666ri.setMax(100);
        if ((context instanceof Activity) && !((Activity) context).isFinishing() && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/cut_ui_impl/process/CancellableProgressDialog", "show", progressDialogC173666ri, new Object[0], "void", new C65300Pk0(false, "()V", "6482555153224415905")).LIZ) {
            progressDialogC173666ri.show();
        }
        progressDialogC173666ri.setMessage(str);
        View findViewById = progressDialogC173666ri.findViewById(R.id.ia9);
        if (findViewById != null) {
            if (progressDialogC173666ri.LJLIL) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
        return progressDialogC173666ri;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                new JSONObject().put("time", (currentTimeMillis - this.LJLJJLL) / 1000);
                return false;
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                return false;
            }
        }
        return false;
    }
}
