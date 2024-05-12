package X;

import Y.ACListenerS21S0100000_1;
import Y.ACallableS3S2000000_1;
import Y.ARunnableS8S0000000_1;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4jN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class DialogC117534jN extends C18Z {
    public final View LJLJI;
    public final View LJLJJI;
    public final View LJLJJL;
    public final String LJLJJLL;
    public boolean LJLJL;

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.LJLJL) {
            String enterFrom = this.LJLJJLL;
            o.LJIIIZ(enterFrom, "enterFrom");
            C10K.LIZIZ(new ACallableS3S2000000_1("got_it", enterFrom, 0), C10K.LJI, null);
        } else {
            String enterFrom2 = this.LJLJJLL;
            o.LJIIIZ(enterFrom2, "enterFrom");
            C10K.LIZIZ(new ACallableS3S2000000_1("close", enterFrom2, 0), C10K.LJI, null);
        }
        super.dismiss();
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS8S0000000_1(4), 1000L);
    }

    @Override // X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        WindowManager.LayoutParams layoutParams;
        View decorView;
        super.onCreate(bundle);
        setContentView(this.LJLJI);
        setCanceledOnTouchOutside(true);
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -2;
            }
        } else {
            layoutParams = null;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setGravity(80);
        }
        Window window4 = getWindow();
        if (window4 != null && (decorView = window4.getDecorView()) != null) {
            decorView.setPadding(0, 0, 0, 0);
        }
        Window window5 = getWindow();
        if (window5 != null) {
            C28289B8j.LIZIZ(0, window5);
        }
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.4jO
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                int measuredWidth = DialogC117534jN.this.LJLJI.findViewById(R.id.ai_).getMeasuredWidth() / DialogC117534jN.this.LJLJI.findViewById(R.id.ai_).getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams2 = DialogC117534jN.this.LJLJI.findViewById(R.id.ai_).getLayoutParams();
                layoutParams2.height = DialogC117534jN.this.LJLJI.findViewById(R.id.aic).getMeasuredHeight();
                layoutParams2.width = DialogC117534jN.this.LJLJI.findViewById(R.id.aic).getMeasuredHeight() * measuredWidth;
                DialogC117534jN.this.LJLJI.findViewById(R.id.ai_).setLayoutParams(layoutParams2);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC117534jN(Activity activity, String enterFrom) {
        super(activity, 0);
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLJJLL = "";
        View inflate = View.inflate(activity, R.layout.ug, null);
        o.LJIIIIZZ(inflate, "inflate(context, R.layou…ialog_charge_ready, null)");
        this.LJLJI = inflate;
        View findViewById = inflate.findViewById(R.id.aia);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.bemobi_close_btn)");
        this.LJLJJI = findViewById;
        View findViewById2 = inflate.findViewById(R.id.aib);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.bemobi_got_it_btn)");
        this.LJLJJL = findViewById2;
        this.LJLJJLL = enterFrom;
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && AnonymousClass636.LJIILJJIL(LJIIIIZZ)) {
            ((ImageView) findViewById).setImageResource(R.drawable.a05);
        }
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 248), findViewById);
        C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 249), findViewById2);
    }
}
