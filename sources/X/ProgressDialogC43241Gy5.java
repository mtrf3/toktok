package X;

import Y.IDRunnableS6S0101000;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Gy5 */
/* loaded from: classes8.dex */
public final class ProgressDialogC43241Gy5 extends ProgressDialog implements DialogInterface.OnKeyListener {
    public final boolean LJLIL;
    public boolean LJLILLLLZI;
    public CharSequence LJLJI;
    public Drawable LJLJJI;
    public String LJLJJL;
    public long LJLJJLL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(4, this, 7);
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            iDRunnableS6S0101000.run();
        } else {
            C38816FLg.LIZJ(iDRunnableS6S0101000);
        }
    }

    public ProgressDialogC43241Gy5(Context context) {
        super(context, 3);
        this.LJLIL = true;
    }

    public static /* synthetic */ void LIZ(ProgressDialogC43241Gy5 progressDialogC43241Gy5) {
        progressDialogC43241Gy5.getClass();
        try {
            C74040T4a c74040T4a = (C74040T4a) progressDialogC43241Gy5.findViewById(R.id.f6h);
            if (c74040T4a != null) {
                c74040T4a.LIZIZ();
            }
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View findViewById;
        TextView textView;
        super.onCreate(bundle);
        setContentView(R.layout.bir);
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
            if (this.LJLILLLLZI && (findViewById = findViewById(R.id.j71)) != null) {
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C04270Et.LIZIZ(getContext(), R.drawable.a13)}));
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
            C74040T4a c74040T4a = (C74040T4a) findViewById(R.id.f6h);
            if (c74040T4a != null) {
                c74040T4a.setIndeterminate(z);
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
        C74040T4a c74040T4a = (C74040T4a) findViewById(R.id.f6h);
        if (c74040T4a != null) {
            c74040T4a.setProgress(i);
        }
    }

    public static ProgressDialogC43241Gy5 LIZIZ(Context context, String str) {
        ProgressDialogC43241Gy5 progressDialogC43241Gy5 = new ProgressDialogC43241Gy5(context);
        progressDialogC43241Gy5.setCancelable(false);
        progressDialogC43241Gy5.setIndeterminate(false);
        progressDialogC43241Gy5.setMax(100);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null && !LJIJJ.isFinishing() && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/shortvideo/view/AwemeProgressDialog", "show", progressDialogC43241Gy5, new Object[0], "void", new C65300Pk0(false, "()V", "-8689176916674394245")).LIZ) {
            progressDialogC43241Gy5.show();
        }
        progressDialogC43241Gy5.setMessage(str);
        View findViewById = progressDialogC43241Gy5.findViewById(R.id.ia9);
        if (findViewById != null) {
            if (progressDialogC43241Gy5.LJLIL) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
        return progressDialogC43241Gy5;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time", (currentTimeMillis - this.LJLJJLL) / 1000);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            FUA.LIZJ("ug_save_video_click_back", jSONObject);
            return false;
        }
        return false;
    }
}
