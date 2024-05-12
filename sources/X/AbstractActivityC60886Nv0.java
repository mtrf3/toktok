package X;

import Y.IDBReceiverS6S0100000_6;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Nv0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractActivityC60886Nv0 extends C29S {
    public static volatile int LJLJJI;
    public static final java.util.Set<String> LJLJJL = new HashSet();
    public static final OJM<AbstractActivityC60886Nv0> LJLJJLL = new OJM<>();
    public static int LJLJL = 0;
    public final OJM<InterfaceC60887Nv1> LJLIL = new OJM<>();
    public IDBReceiverS6S0100000_6 LJLILLLLZI;
    public String LJLJI;

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onDestroy() {
        C10760bY.LIZ(this).LIZLLL(this.LJLILLLLZI);
        super.onDestroy();
        if (!this.LJLIL.isEmpty()) {
            Iterator<InterfaceC60887Nv1> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                InterfaceC60887Nv1 next = it.next();
                if (next != null) {
                    next.onDestroy();
                }
            }
            this.LJLIL.LJLIL.clear();
        }
        try {
            ((HashSet) LJLJJL).remove(this.LJLJI);
        } catch (Throwable unused) {
        }
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onPause() {
        super.onPause();
        InterfaceC40105Fob LIZ = C39328Fc4.LIZ();
        if (LIZ != null) {
            LIZ.onActivityPaused(this);
        }
        if (!this.LJLIL.isEmpty()) {
            Iterator<InterfaceC60887Nv1> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                InterfaceC60887Nv1 next = it.next();
                if (next != null) {
                    next.onPause();
                }
            }
        }
    }

    @Override // X.ActivityC45651qj, android.app.Activity
    public void onResume() {
        super.onResume();
        InterfaceC40105Fob LIZ = C39328Fc4.LIZ();
        if (LIZ != null) {
            LIZ.onActivityResumed(this);
        }
        if (!this.LJLIL.isEmpty()) {
            Iterator<InterfaceC60887Nv1> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                InterfaceC60887Nv1 next = it.next();
                if (next != null) {
                    next.onResume();
                }
            }
        }
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStart() {
        InterfaceC39329Fc5 interfaceC39329Fc5;
        super.onStart();
        if (LJLJL == 0 && (interfaceC39329Fc5 = C39328Fc4.LIZIZ) != null) {
            interfaceC39329Fc5.LIZ();
        }
        LJLJL++;
    }

    @Override // X.C29S, X.ActivityC45651qj, android.app.Activity
    public void onStop() {
        InterfaceC39329Fc5 interfaceC39329Fc5;
        super.onStop();
        int i = LJLJL - 1;
        LJLJL = i;
        if (i == 0 && (interfaceC39329Fc5 = C39328Fc4.LIZIZ) != null) {
            interfaceC39329Fc5.LIZ();
        }
        if (!this.LJLIL.isEmpty()) {
            Iterator<InterfaceC60887Nv1> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                InterfaceC60887Nv1 next = it.next();
                if (next != null) {
                    next.onStop();
                }
            }
        }
    }

    @Override // X.C29S
    public final void onSupportContentChanged() {
        super.onSupportContentChanged();
        View findViewById = findViewById(R.id.nq);
        if (findViewById == null) {
            return;
        }
        ViewParent parent = findViewById.getParent();
        if (!FrameLayout.class.isInstance(parent)) {
            return;
        }
        View findViewById2 = findViewById(android.R.id.content);
        if (FrameLayout.class.isInstance(findViewById2)) {
            ViewGroup viewGroup = (ViewGroup) findViewById2;
            if (viewGroup.getChildCount() != 1) {
                return;
            }
            View childAt = viewGroup.getChildAt(0);
            viewGroup.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) parent;
            viewGroup2.addView(childAt);
            findViewById2.setId(-1);
            viewGroup2.setId(android.R.id.content);
        }
    }

    public void setStatusBarColor() {
        getWindow().setStatusBarColor(getResources().getColor(R.color.g2));
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && bundle.containsKey("abs_Activity_Key")) {
            this.LJLJI = bundle.getString("abs_Activity_Key");
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C16880lQ.LJLLILLLL(getClass()));
            LIZ.append("@");
            int i = LJLJJI;
            LJLJJI = i + 1;
            LIZ.append(i);
            this.LJLJI = X1D.LIZIZ(LIZ);
        }
        this.LJLILLLLZI = new IDBReceiverS6S0100000_6(this, 2);
        C10760bY.LIZ(this).LIZIZ(this.LJLILLLLZI, new IntentFilter("com.ss.android.common.app.action.exit_app"));
        try {
            LJLJJLL.LJIIZILJ(this);
            ((HashSet) LJLJJL).add(this.LJLJI);
        } catch (Throwable unused) {
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        if (bundle != null && bundle.containsKey("abs_Activity_Key")) {
            this.LJLJI = bundle.getString("abs_Activity_Key");
        }
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putString("abs_Activity_Key", this.LJLJI);
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
    }

    @Override // X.C29S, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        setStatusBarColor();
    }

    @Override // X.C29S, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        setStatusBarColor();
    }

    @Override // X.ActivityC45651qj, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
