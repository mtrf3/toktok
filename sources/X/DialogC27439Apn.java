package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.ss.android.ugc.aweme.ecommerce.router.Strategy;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.Apn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class DialogC27439Apn extends OOS {
    public Strategy LJLJLLL;

    @Override // android.app.Dialog
    public final void onBackPressed() {
        Strategy strategy = this.LJLJLLL;
        if (strategy != null) {
            strategy.onBackPressed(new AqS154S0100000_4(this, 1147));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        super.onBackPressed();
    }

    public static void LJJI(View view) {
        View view2;
        if (!o.LJ(Build.MODEL, "M2004J19C")) {
            return;
        }
        if (view != null) {
            view.setFitsSystemWindows(false);
        }
        Object obj = null;
        if (view != null) {
            obj = view.getParent();
        }
        if ((obj instanceof ViewGroup) && (view2 = (View) obj) != null) {
            LJJI(view2);
        }
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setStatusBarColor(0);
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void setContentView(int i) {
        View inflate = View.inflate(getContext(), i, null);
        super.setContentView(inflate);
        LJJI(inflate);
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void setContentView(View view) {
        o.LJIIIZ(view, "view");
        super.setContentView(view);
        LJJI(view);
    }

    public DialogC27439Apn(Context context, int i) {
        super(context, i);
    }

    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o.LJIIIZ(view, "view");
        super.setContentView(view, layoutParams);
        LJJI(view);
    }
}
