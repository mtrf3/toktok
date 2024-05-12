package X;

import Y.ACListenerS21S0100000_1;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4NU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4NU extends OOS {
    public final Activity LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4NU(Activity activity) {
        super(activity, R.style.a8j);
        o.LJIIIZ(activity, "activity");
        this.LJLJLLL = activity;
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b6y);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.setLayout(-1, -1);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.windowAnimations = R.style.a8a;
            }
        }
        SY4 sy4 = (SY4) findViewById(R.id.aza);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(this, 160));
        }
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.gmc);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS21S0100000_1(this, 161));
        }
    }
}
