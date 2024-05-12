package X;

import Y.ARunnableS12S0101000_8;
import android.app.Activity;
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
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6rl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ProgressDialogC173696rl extends ProgressDialog implements DialogInterface.OnKeyListener {
    public final boolean LJLIL;
    public boolean LJLILLLLZI;
    public CharSequence LJLJI;
    public Drawable LJLJJI;
    public String LJLJJL;
    public long LJLJJLL;
    public final Handler LJLJL;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ARunnableS12S0101000_8 aRunnableS12S0101000_8 = new ARunnableS12S0101000_8(5, this, 33);
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            aRunnableS12S0101000_8.run();
        } else {
            this.LJLJL.post(aRunnableS12S0101000_8);
        }
    }

    public ProgressDialogC173696rl(Context context) {
        super(context, 3);
        this.LJLIL = true;
        this.LJLJL = new Handler(C16880lQ.LLJJJJ());
    }

    public static /* synthetic */ void LIZ(ProgressDialogC173696rl progressDialogC173696rl) {
        progressDialogC173696rl.getClass();
        try {
            C74063T4x c74063T4x = (C74063T4x) progressDialogC173696rl.findViewById(R.id.f6h);
            if (c74063T4x != null) {
                c74063T4x.LIZIZ();
            }
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public final void LIZJ(Boolean bool) {
        int i;
        ImageView imageView = (ImageView) findViewById(R.id.eay);
        if (imageView != null) {
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View findViewById;
        TextView textView;
        super.onCreate(bundle);
        setContentView(R.layout.cr7);
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
                findViewById.setBackground(new LayerDrawable(new Drawable[]{drawable, C04270Et.LIZIZ(getContext(), R.drawable.c8u)}));
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

    public static ProgressDialogC173696rl LIZIZ(Context context, String str) {
        ProgressDialogC173696rl progressDialogC173696rl = new ProgressDialogC173696rl(context);
        progressDialogC173696rl.setCancelable(false);
        progressDialogC173696rl.setIndeterminate(false);
        progressDialogC173696rl.setMax(100);
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null && !LJIJJ.isFinishing() && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/tools/view/dialog/CancellableAVProgressDialog", "show", progressDialogC173696rl, new Object[0], "void", new C65300Pk0(false, "()V", "-3837608355313822778")).LIZ) {
            progressDialogC173696rl.show();
        }
        progressDialogC173696rl.setMessage(str);
        View findViewById = progressDialogC173696rl.findViewById(R.id.ia9);
        if (findViewById != null) {
            if (progressDialogC173696rl.LJLIL) {
                findViewById.setVisibility(0);
            } else {
                findViewById.setVisibility(4);
            }
        }
        return progressDialogC173696rl;
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
            C60903NvH.LJIIJJI().LJJIIZI().LJIJ("ug_save_video_click_back", jSONObject);
            return false;
        }
        return false;
    }
}
