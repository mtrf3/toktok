package com.bytedance.ies.safemode.SmartProtected.fastboot;

import X.C03880Dg;
import X.C221108m2;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65803Ps7;
import X.C66461Q6n;
import X.FTT;
import X.FTY;
import X.HP7;
import X.InterfaceC74236TBo;
import X.TBT;
import Y.ACListenerS26S0100000_6;
import Y.IDCListenerS282S0100000_6;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhiliaoapp.musically.R;

/* loaded from: classes7.dex */
public final class FastBootBlankActivity extends Activity {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJI;
    public static final FTT LJLJJI;
    public HP7 LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(FTY.LJLIL);

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(FastBootBlankActivity.class), "spHelper", "getSpHelper()Lcom/bytedance/ies/safemode/configstore/SpHelper;");
        C65352Pkq.LIZ.getClass();
        LJLJI = new InterfaceC74236TBo[]{tbt};
        LJLJJI = new FTT();
    }

    public final C66461Q6n LIZ() {
        return (C66461Q6n) this.LJLILLLLZI.getValue();
    }

    @Override // android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        HP7 hp7 = this.LJLIL;
        if (hp7 != null) {
            hp7.dismiss();
        }
        this.LJLIL = null;
    }

    @Override // android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        super.onCreate(bundle);
        setContentView(R.layout.e_);
        String string = getString(R.string.bkq);
        String string2 = getString(R.string.bkr);
        HP7 hp7 = new HP7(this);
        hp7.LJLJJL = string2;
        String string3 = getString(R.string.bko);
        ACListenerS26S0100000_6 aCListenerS26S0100000_6 = new ACListenerS26S0100000_6(this, 0);
        hp7.LJLJL = string3;
        hp7.LJLJLLL = aCListenerS26S0100000_6;
        String string4 = getString(R.string.bkn);
        ACListenerS26S0100000_6 aCListenerS26S0100000_62 = new ACListenerS26S0100000_6(this, 1);
        hp7.LJLJJLL = string4;
        hp7.LJLL = aCListenerS26S0100000_62;
        hp7.LJLJLJ = string;
        this.LJLIL = hp7;
        hp7.setOnCancelListener(new IDCListenerS282S0100000_6(this, 0));
        HP7 hp72 = this.LJLIL;
        if (hp72 == null || new C03880Dg(2).LIZJ(300000, "com/bytedance/ies/safemode/SmartProtected/utils/dialog/CustomDialog", "show", hp72, new Object[0], "void", new C65300Pk0(false, "()V", "-8899329698188751703")).LIZ) {
            return;
        }
        hp72.show();
    }
}
