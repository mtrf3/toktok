package X;

import Y.ACListenerS42S0200000_7;
import Y.ARunnableS15S0101000_11;
import Y.AUListenerS95S0100000_7;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Hrk */
/* loaded from: classes8.dex */
public final class AlertDialogC45396Hrk extends AlertDialog implements DialogInterface.OnKeyListener {
    public final boolean LJLIL;
    public boolean LJLILLLLZI;
    public CharSequence LJLJI;
    public boolean LJLJJI;
    public int LJLJJL;
    public Drawable LJLJJLL;
    public String LJLJL;
    public long LJLJLJ;
    public int LJLJLLL;
    public InterfaceC45398Hrm LJLL;
    public TextView LJLLI;
    public C74040T4a LJLLILLLL;
    public TextView LJLLJ;
    public TextView LJLLL;
    public View LJLLLL;
    public C54258LRe LJLLLLLL;

    public final void LIZIZ() {
        TuxIconView tuxIconView;
        if (this.LJLILLLLZI && (tuxIconView = (TuxIconView) findViewById(R.id.b3p)) != null) {
            tuxIconView.setAlpha(0.0f);
            tuxIconView.setVisibility(0);
            C16880lQ.LJJJ(tuxIconView, new ACListenerS42S0200000_7(tuxIconView, this, 34));
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ARunnableS15S0101000_11 aRunnableS15S0101000_11 = new ARunnableS15S0101000_11(6, this, 15);
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            aRunnableS15S0101000_11.run();
        } else {
            C38816FLg.LIZJ(aRunnableS15S0101000_11);
        }
        C54258LRe c54258LRe = this.LJLLLLLL;
        if (c54258LRe != null) {
            c54258LRe.LJIIJ("download_dialog", false, null);
        }
    }

    public static /* synthetic */ void LIZ(AlertDialogC45396Hrk alertDialogC45396Hrk) {
        if (alertDialogC45396Hrk.LJLLILLLL == null) {
            alertDialogC45396Hrk.LJLLILLLL = (C74040T4a) alertDialogC45396Hrk.findViewById(R.id.f6h);
        }
        alertDialogC45396Hrk.LJLLILLLL.LIZIZ();
        super.dismiss();
    }

    public final void LIZJ(int i) {
        if (this.LJLILLLLZI) {
            TextView textView = this.LJLLL;
            if (textView != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i);
                LIZ.append("%");
                textView.setText(X1D.LIZIZ(LIZ));
            }
            C74040T4a c74040T4a = this.LJLLILLLL;
            if (c74040T4a != null) {
                c74040T4a.setProgress(i);
            }
        }
        this.LJLJJL = i;
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        C74040T4a c74040T4a;
        int i;
        super.onCreate(bundle);
        setContentView(R.layout.v0);
        this.LJLLLL = findViewById(R.id.j71);
        this.LJLLI = (TextView) findViewById(R.id.ghd);
        this.LJLLILLLL = (C74040T4a) findViewById(R.id.f6h);
        this.LJLLJ = (TextView) findViewById(R.id.l8p);
        findViewById(R.id.b3p);
        this.LJLLL = (TextView) findViewById(R.id.ia9);
        this.LJLILLLLZI = true;
        C54258LRe LIZ = LRD.LIZ(getContext());
        this.LJLLLLLL = LIZ;
        LIZ.LJIIJ("download_dialog", true, null);
        setMessage(this.LJLJI);
        boolean z = this.LJLJJI;
        if (this.LJLILLLLZI) {
            C74040T4a c74040T4a2 = this.LJLLILLLL;
            if (c74040T4a2 != null) {
                c74040T4a2.setIndeterminate(z);
            }
            TextView textView = this.LJLLL;
            if (textView != null) {
                if (z) {
                    i = 4;
                } else {
                    i = 0;
                }
                textView.setVisibility(i);
            }
        }
        this.LJLJJI = z;
        int i2 = this.LJLJLLL;
        if (this.LJLILLLLZI && (c74040T4a = this.LJLLILLLL) != null) {
            c74040T4a.setMaxProgress(i2);
        }
        this.LJLJLLL = i2;
        LIZJ(this.LJLJJL);
        String str = this.LJLJL;
        if (this.LJLILLLLZI && this.LJLLJ != null && !C38354F3m.LJ(str)) {
            this.LJLLJ.setText(str);
            KL2.LJIILLIIL(0, this.LJLLJ);
        }
        this.LJLJL = str;
        if (this.LJLILLLLZI) {
            if (this.LJLIL) {
                TextView textView2 = this.LJLLL;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            } else {
                TextView textView3 = this.LJLLL;
                if (textView3 != null) {
                    textView3.setVisibility(4);
                }
            }
        }
        Drawable drawable = this.LJLJJLL;
        if (drawable != null) {
            if (this.LJLILLLLZI) {
                this.LJLLLL.setBackground(new LayerDrawable(new Drawable[]{drawable, C04270Et.LIZIZ(getContext(), R.drawable.a13)}));
            }
            this.LJLJJLL = drawable;
        }
        setOnKeyListener(this);
        this.LJLJLJ = System.currentTimeMillis();
        if (C45354Hr4.LIZ()) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.setBackgroundDrawable(null);
            Display defaultDisplay = ((WindowManager) C16880lQ.LLILL(getContext(), "window")).getDefaultDisplay();
            attributes.width = defaultDisplay.getWidth();
            attributes.height = defaultDisplay.getHeight();
            window.setAttributes(attributes);
        }
    }

    @Override // android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        TextView textView;
        int i;
        if (this.LJLILLLLZI && (textView = this.LJLLI) != null) {
            textView.setText(charSequence);
            TextView textView2 = this.LJLLI;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                i = 0;
            }
            textView2.setVisibility(i);
        }
        this.LJLJI = charSequence;
    }

    public AlertDialogC45396Hrk(Context context, int i) {
        super(context, i);
        this.LJLIL = true;
        this.LJLJLLL = 100;
    }

    public final void LJ(int i, Context context) {
        ValueAnimator valueAnimator;
        ObjectAnimator objectAnimator;
        if (this.LJLILLLLZI) {
            AnimatorSet animatorSet = new AnimatorSet();
            View findViewById = findViewById(R.id.j71);
            this.LJLLLL = findViewById;
            ObjectAnimator objectAnimator2 = null;
            if (findViewById != null) {
                valueAnimator = ValueAnimator.ofInt(findViewById.getWidth(), i);
                valueAnimator.addUpdateListener(new AUListenerS95S0100000_7(this, 4));
                valueAnimator.setInterpolator(new LinearInterpolator());
                valueAnimator.setDuration(200L);
                valueAnimator.setTarget(this.LJLLLL);
            } else {
                valueAnimator = null;
            }
            View findViewById2 = findViewById(R.id.b3p);
            if (findViewById2 != null) {
                objectAnimator = ObjectAnimator.ofFloat(findViewById2, "alpha", 0.0f, 1.0f);
                objectAnimator.setDuration(200L);
            } else {
                objectAnimator = null;
            }
            TextView textView = (TextView) findViewById(R.id.ghd);
            this.LJLLI = textView;
            if (textView != null) {
                objectAnimator2 = ObjectAnimator.ofFloat(textView, "alpha", 1.0f, 1.0f);
                objectAnimator2.setDuration(100L);
                objectAnimator2.addListener(new C45397Hrl(context, this));
            }
            animatorSet.play(valueAnimator).with(objectAnimator);
            animatorSet.play(objectAnimator).before(objectAnimator2);
            animatorSet.start();
        }
    }

    public static AlertDialogC45396Hrk LIZLLL(Context context, String str, int i) {
        C74040T4a c74040T4a;
        AlertDialogC45396Hrk alertDialogC45396Hrk = new AlertDialogC45396Hrk(context, i);
        alertDialogC45396Hrk.setCancelable(false);
        if (alertDialogC45396Hrk.LJLILLLLZI) {
            C74040T4a c74040T4a2 = alertDialogC45396Hrk.LJLLILLLL;
            if (c74040T4a2 != null) {
                c74040T4a2.setIndeterminate(false);
            }
            TextView textView = alertDialogC45396Hrk.LJLLL;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
        alertDialogC45396Hrk.LJLJJI = false;
        if (alertDialogC45396Hrk.LJLILLLLZI && (c74040T4a = alertDialogC45396Hrk.LJLLILLLL) != null) {
            c74040T4a.setMaxProgress(100);
        }
        alertDialogC45396Hrk.LJLJLLL = 100;
        alertDialogC45396Hrk.setMessage(str);
        if (alertDialogC45396Hrk.LJLILLLLZI && alertDialogC45396Hrk.LJLLJ != null && !C38354F3m.LJ(null)) {
            alertDialogC45396Hrk.LJLLJ.setText((CharSequence) null);
            KL2.LJIILLIIL(0, alertDialogC45396Hrk.LJLLJ);
        }
        alertDialogC45396Hrk.LJLJL = null;
        if (alertDialogC45396Hrk.LJLILLLLZI) {
            if (alertDialogC45396Hrk.LJLIL) {
                TextView textView2 = alertDialogC45396Hrk.LJLLL;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
            } else {
                TextView textView3 = alertDialogC45396Hrk.LJLLL;
                if (textView3 != null) {
                    textView3.setVisibility(4);
                }
            }
        }
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            if (!V1B.LJJZZI(LJIJJ, true)) {
                return alertDialogC45396Hrk;
            }
            if (!LJIJJ.isFinishing() && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/shortvideo/view/AwemeCancelableProgressDialog", "show", alertDialogC45396Hrk, new Object[0], "void", new C65300Pk0(false, "()V", "-5313157934846824465")).LIZ) {
                alertDialogC45396Hrk.show();
            }
        }
        return alertDialogC45396Hrk;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("time", (currentTimeMillis - this.LJLJLJ) / 1000);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            FUA.LIZJ("ug_save_video_click_back", jSONObject);
            return false;
        }
        return false;
    }
}
