package X;

import Y.ACListenerS31S0100000_11;
import Y.ARunnableS46S0100000_10;
import Y.ARunnableS47S0100000_11;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QNt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class DialogC66909QNt extends Dialog {
    public OCP LJLIL;
    public ImageView LJLILLLLZI;
    public O5V LJLJI;
    public ViewGroup LJLJJI;
    public Button LJLJJL;
    public Button LJLJJLL;
    public Context LJLJL;
    public FrameLayout LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public final String LJLLJ;
    public QNS LJLLL;
    public QO2 LJLLLL;
    public DialogInterface.OnDismissListener LJLLLLLL;
    public C66908QNs LJLZ;
    public EnumC66913QNx LJZ;
    public final int LJZI;
    public final QNH LJZL;
    public final C66910QNu LL;
    public final QO0 LLD;
    public final ComponentCallbacksC66911QNv LLF;

    public final synchronized void LIZ() {
        if (this.LJLJL == null && this.LJLIL == null) {
            return;
        }
        this.LJLJL = null;
        OCP ocp = this.LJLIL;
        if (ocp.LIZ != null) {
            ocp.LIZIZ.post(new ARunnableS46S0100000_10(ocp, 211));
            ocp.LIZIZ = null;
            ocp.LIZ = null;
        }
        this.LJLIL = null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.LJLJI != null) {
            getWindow().getDecorView().post(new ARunnableS47S0100000_11(this, 144));
            this.LJLJI = null;
        }
        if (this.LJLLI) {
            return;
        }
        this.LJLLI = true;
        if (isShowing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
        }
        Activity activity = this.LJZL.LIZ;
        if (activity != null) {
            activity.unregisterComponentCallbacks(this.LLF);
        }
        C66908QNs c66908QNs = this.LJLZ;
        if (c66908QNs != null) {
            Activity activity2 = c66908QNs.LJLIL;
            if (activity2 != null) {
                activity2.getApplication().unregisterActivityLifecycleCallbacks(c66908QNs);
            }
            this.LJLZ = null;
        }
        DialogInterface.OnDismissListener onDismissListener = this.LJLLLLLL;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
        QNB qnb = QNC.LIZ;
        QNL qnl = qnb.LIZIZ;
        if (qnl != null) {
            qnb.LIZIZ.sendMessageDelayed(qnl.obtainMessage(1, this), 10000L);
        }
        QNS qns = this.LJLLL;
        if (qns != null && !this.LJLJLLL) {
            qns.onFail(3);
            this.LJLLL = null;
        }
        if (!this.LJLL) {
            String name = this.LJZ.getName();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("style", name);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            String LIZIZ = OCR.LIZIZ("bytedcert.goToClose", "bytedcert.goToClose", jSONObject);
            OCP ocp = this.LJLIL;
            if (ocp != null) {
                ocp.LIZ(LIZIZ);
            }
        }
        if (!this.LJLJLLL) {
            EnumC66913QNx enumC66913QNx = this.LJZ;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("duration", System.currentTimeMillis() - QN2.LIZ);
                jSONObject2.put("result", enumC66913QNx.getName());
                jSONObject2.put("key", "close");
                QN2.LIZJ("turing_verify_sdk", jSONObject2);
            } catch (JSONException e2) {
                if (C61349O5x.LIZ < 3) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
            LIZ();
        }
        QNB qnb2 = QNC.LIZ;
        QNL qnl2 = qnb2.LIZIZ;
        if (qnl2 != null) {
            qnb2.LIZIZ.sendMessage(qnl2.obtainMessage(3, null));
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C16880lQ.LLLZIIL(R.layout.bo_, C16880lQ.LLZIL(this.LJLJL), null));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        getWindow().setAttributes(attributes);
        this.LJLJJI = (ViewGroup) findViewById(R.id.na6);
        findViewById(R.id.l4_);
        this.LJLJJL = (Button) findViewById(R.id.aw7);
        this.LJLJJLL = (Button) findViewById(R.id.aw8);
        this.LJLILLLLZI = (ImageView) findViewById(R.id.g7r);
        this.LJLJI = (O5V) findViewById(R.id.n39);
        this.LJLJLJ = (FrameLayout) findViewById(R.id.c_9);
        ACListenerS31S0100000_11 aCListenerS31S0100000_11 = new ACListenerS31S0100000_11(this, 16);
        C16880lQ.LJIILIIL(this.LJLJJL, aCListenerS31S0100000_11);
        C16880lQ.LJIILIIL(this.LJLJJLL, aCListenerS31S0100000_11);
        this.LJLJI.LIZ(this.LLD);
        QO2 qo2 = new QO2(this.LJZL.LIZIZ());
        this.LJLLLL = qo2;
        this.LJLJI.setOnTouchListener(qo2);
        if (this.LJZL.LJ) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(1000L);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            this.LJLILLLLZI.startAnimation(rotateAnimation);
            this.LJLJLJ.setBackgroundColor(-2013265920);
        } else {
            this.LJLILLLLZI.setVisibility(8);
        }
        Activity activity = this.LJZL.LIZ;
        if (activity != null) {
            activity.registerComponentCallbacks(this.LLF);
        }
        C66908QNs c66908QNs = this.LJLZ;
        Activity activity2 = c66908QNs.LJLIL;
        if (activity2 != null) {
            activity2.getApplication().registerActivityLifecycleCallbacks(c66908QNs);
        }
        setCanceledOnTouchOutside(this.LJZL.LIZJ);
        setCancelable(true);
        this.LJLIL = new OCP(this.LL, this.LJLJI);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadUrl = ");
        LIZ.append(this.LJLLJ);
        X1D.LIZIZ(LIZ);
        O5V o5v = this.LJLJI;
        String str = this.LJLLJ;
        String LIZLLL = C37037EgD.LIZ.LIZLLL(o5v, str);
        if (!TextUtils.isEmpty(LIZLLL)) {
            str = LIZLLL;
        }
        o5v.loadUrl(str);
        if (this.LJZL.LIZJ()) {
            DisplayMetrics displayMetrics = this.LJLJL.getResources().getDisplayMetrics();
            ViewGroup.LayoutParams layoutParams = this.LJLJI.getLayoutParams();
            layoutParams.width = displayMetrics.widthPixels;
            layoutParams.height = displayMetrics.heightPixels;
            this.LJLJI.setLayoutParams(layoutParams);
            this.LJLJI.setVisibility(0);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.LJLLLL.LIZ(motionEvent);
        if (this.LJZL.LIZJ) {
            if (this.LJLJJI.getVisibility() == 0) {
                this.LJZ = EnumC66913QNx.CLOSE_FB_MASK;
            } else {
                this.LJZ = EnumC66913QNx.CLOSE_REASON_MASK;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.LJLLLLLL = onDismissListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogC66909QNt(X.QNH r3, X.QNS r4) {
        /*
            r2 = this;
            android.app.Activity r1 = r3.LIZ
            java.util.Objects.requireNonNull(r1)
            r0 = 2131886882(0x7f120322, float:1.9408355E38)
            r2.<init>(r1, r0)
            r0 = 0
            r2.LJLJLLL = r0
            r2.LJLL = r0
            r2.LJLLI = r0
            r2.LJLLILLLL = r0
            r0 = 0
            r2.LJLLLL = r0
            X.QNx r0 = X.EnumC66913QNx.CLOSE_REASON_APP
            r2.LJZ = r0
            X.QNu r0 = new X.QNu
            r0.<init>(r2)
            r2.LL = r0
            X.QO0 r0 = new X.QO0
            r0.<init>(r2)
            r2.LLD = r0
            X.QNv r0 = new X.QNv
            r0.<init>(r2)
            r2.LLF = r0
            r2.LJZL = r3
            int r0 = r3.LJ()
            r2.LJZI = r0
            java.lang.String r0 = r3.LJFF()
            r2.LJLLJ = r0
            r2.LJLLL = r4
            android.app.Activity r0 = r3.LIZ
            X.C78840Uwu.LJIILJJIL(r0)
            X.QNs r1 = new X.QNs
            android.app.Activity r0 = r3.LIZ
            r1.<init>(r0)
            r2.LJLZ = r1
            r2.LJLJL = r0
            X.QNy r0 = new X.QNy
            r0.<init>(r2)
            r2.setOnKeyListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC66909QNt.<init>(X.QNH, X.QNS):void");
    }
}
