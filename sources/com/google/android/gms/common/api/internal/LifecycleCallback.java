package com.google.android.gms.common.api.internal;

import X.ActivityC45651qj;
import X.C1B3;
import X.C1B6;
import X.C67674QhC;
import X.InterfaceC67296Qb6;
import X.QH7;
import X.R17;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes12.dex */
public class LifecycleCallback {
    public final InterfaceC67296Qb6 LJLIL;

    public LifecycleCallback(InterfaceC67296Qb6 interfaceC67296Qb6) {
        this.LJLIL = interfaceC67296Qb6;
    }

    public void LIZ(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void LIZLLL(int i, int i2, Intent intent) {
    }

    public void LJ(Bundle bundle) {
    }

    public void LJFF() {
    }

    public void LJI(Bundle bundle) {
    }

    public void LJII() {
    }

    public void LJIIIIZZ() {
    }

    public final Activity LIZIZ() {
        Activity N2 = this.LJLIL.N2();
        QH7.LJIIIIZZ(N2);
        return N2;
    }

    public static InterfaceC67296Qb6 LIZJ(C67674QhC c67674QhC) {
        R17 r17;
        zzd zzdVar;
        Object obj = c67674QhC.LIZ;
        if (obj instanceof ActivityC45651qj) {
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) obj;
            WeakHashMap<ActivityC45651qj, WeakReference<zzd>> weakHashMap = zzd.LJLJJI;
            WeakReference<zzd> weakReference = weakHashMap.get(activityC45651qj);
            if (weakReference == null || (zzdVar = weakReference.get()) == null) {
                try {
                    zzdVar = (zzd) activityC45651qj.getSupportFragmentManager().LJJJIL("SupportLifecycleFragmentImpl");
                    if (zzdVar == null || zzdVar.isRemoving()) {
                        zzdVar = new zzd();
                        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
                        C1B3 LIZ = C1B6.LIZ(supportFragmentManager, supportFragmentManager);
                        LIZ.LJIIIIZZ(0, 1, zzdVar, "SupportLifecycleFragmentImpl");
                        LIZ.LJI();
                    }
                    weakHashMap.put(activityC45651qj, new WeakReference<>(zzdVar));
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
                }
            }
            return zzdVar;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            WeakHashMap<Activity, WeakReference<R17>> weakHashMap2 = R17.LJLJJI;
            WeakReference<R17> weakReference2 = weakHashMap2.get(activity);
            if (weakReference2 == null || (r17 = weakReference2.get()) == null) {
                try {
                    r17 = (R17) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (r17 == null || r17.isRemoving()) {
                        r17 = new R17();
                        activity.getFragmentManager().beginTransaction().add(r17, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap2.put(activity, new WeakReference<>(r17));
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
                }
            }
            return r17;
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static InterfaceC67296Qb6 getChimeraLifecycleFragmentImpl(C67674QhC c67674QhC) {
        throw new IllegalStateException("Method not available in SDK.");
    }
}
