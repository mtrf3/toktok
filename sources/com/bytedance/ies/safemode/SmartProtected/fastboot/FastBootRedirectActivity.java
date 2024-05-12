package com.bytedance.ies.safemode.SmartProtected.fastboot;

import X.C60903NvH;
import X.C65803Ps7;
import X.C78598Ut0;
import X.FTZ;
import X.X1D;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FastBootRedirectActivity extends Activity {
    @Override // android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
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
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        Intent intent = new Intent(this, (Class<?>) FastBootBlankActivity.class);
        C78598Ut0.LJIJJ(intent, this);
        startActivityForResult(intent, 1);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        List LJJ;
        List LJJ2;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == 2 && (LJJ = C60903NvH.LJJ(null, new FTZ(), false)) != null) {
            Iterator it = ((ArrayList) LJJ).iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (file.exists() && file.isDirectory() && file.getName().equals("reparo-root") && (LJJ2 = C60903NvH.LJJ(file, new FTZ(), true)) != null) {
                    Iterator it2 = ((ArrayList) LJJ2).iterator();
                    while (it2.hasNext()) {
                        File file2 = (File) it2.next();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("reparo-root list filename ");
                        o.LJFF(file2, "file");
                        LIZ.append(file2.getName());
                        String msg = X1D.LIZIZ(LIZ);
                        o.LJIIJ(msg, "msg");
                    }
                }
            }
        }
    }
}
