package X;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Gy6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ProgressDialogC43242Gy6 extends ProgressDialog {
    public boolean LJLIL;
    public CharSequence LJLILLLLZI;
    public Drawable LJLJI;
    public int LJLJJI;
    public final Activity LJLJJL;

    public ProgressDialogC43242Gy6(Context context) {
        super(context, 3);
        this.LJLJJL = C45804HyK.LJIJJ(context);
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View findViewById;
        super.onCreate(bundle);
        setContentView(R.layout.blg);
        this.LJLIL = true;
        setMessage(this.LJLILLLLZI);
        setIndeterminate(false);
        setProgress(this.LJLJJI);
        Drawable drawable = this.LJLJI;
        if (drawable != null) {
            if (this.LJLIL && (findViewById = findViewById(R.id.j71)) != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, getContext().getResources().getDrawable(R.drawable.a57)}));
            }
            this.LJLJI = drawable;
        }
    }

    @Override // android.app.ProgressDialog
    public final void setIndeterminate(boolean z) {
        int i;
        super.setIndeterminate(z);
        if (this.LJLIL) {
            C74041T4b c74041T4b = (C74041T4b) findViewById(R.id.f6h);
            if (c74041T4b != null) {
                c74041T4b.setIndeterminate(z);
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
        super.setMessage(charSequence);
        if (this.LJLIL && (textView = (TextView) findViewById(R.id.ghd)) != null) {
            textView.setText(charSequence);
        }
        this.LJLILLLLZI = charSequence;
    }

    @Override // android.app.ProgressDialog
    public final void setProgress(int i) {
        super.setProgress(i);
        if (this.LJLIL) {
            TextView textView = (TextView) findViewById(R.id.ia9);
            if (textView != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i);
                LIZ.append("%");
                textView.setText(X1D.LIZIZ(LIZ));
            }
            C74041T4b c74041T4b = (C74041T4b) findViewById(R.id.f6h);
            if (c74041T4b != null) {
                c74041T4b.setProgress(i);
            }
        }
        this.LJLJJI = i;
    }
}
