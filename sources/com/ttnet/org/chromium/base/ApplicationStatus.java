package com.ttnet.org.chromium.base;

import X.C66684QFc;
import X.InterfaceC48472J0q;
import X.VI4;
import Y.ARunnableS20S0000000_14;
import android.app.Activity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes15.dex */
public class ApplicationStatus {
    public static final Map<Activity, Object> LIZ = Collections.synchronizedMap(new HashMap());
    public static VI4 LIZIZ;
    public static C66684QFc<InterfaceC48472J0q> LIZJ;

    public static void LIZ() {
        synchronized (LIZ) {
        }
    }

    public static int getStateForApplication() {
        synchronized (LIZ) {
        }
        return 0;
    }

    public static void registerThreadSafeNativeApplicationStateListener() {
        ARunnableS20S0000000_14 aRunnableS20S0000000_14 = new ARunnableS20S0000000_14(7);
        if (ThreadUtils.LIZJ()) {
            aRunnableS20S0000000_14.run();
        } else {
            ThreadUtils.LIZ().post(aRunnableS20S0000000_14);
        }
    }

    public static boolean hasVisibleActivities() {
        int stateForApplication = getStateForApplication();
        if (stateForApplication == 1 || stateForApplication == 2) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(InterfaceC48472J0q interfaceC48472J0q) {
        if (LIZJ == null) {
            LIZJ = new C66684QFc<>();
        }
        C66684QFc<InterfaceC48472J0q> c66684QFc = LIZJ;
        if (c66684QFc.LJLJJL) {
            c66684QFc.LJLILLLLZI.getClass();
        }
        if (interfaceC48472J0q == null || ((ArrayList) c66684QFc.LJLIL).contains(interfaceC48472J0q)) {
            return;
        }
        ((ArrayList) c66684QFc.LJLIL).add(interfaceC48472J0q);
    }
}
