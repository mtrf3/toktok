package com.ss.android.ugc.aweme.push.downgrade;

import X.C0RN;
import X.C38987FRv;
import X.C78685UuP;
import X.C84763XOl;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FG7;
import X.FGG;
import X.FGT;
import X.FGU;
import X.FGW;
import X.FGY;
import X.FUU;
import Y.ARunnableS42S0100000_6;
import Y.ARunnableS9S0201000_6;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class OptimizePushProcessImpl implements FGY {
    public static final OptimizePushProcessImpl LIZ = new OptimizePushProcessImpl();
    public static final List<Runnable> LIZIZ = new ArrayList();
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;

    public static void LJ() {
        FGG.LJ = true;
        ArrayList arrayList = new ArrayList();
        synchronized (LIZ) {
            List<Runnable> list = LIZIZ;
            arrayList.addAll(list);
            ((ArrayList) list).clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Runnable runnable = (Runnable) it.next();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static void LIZLLL() {
        if (!LIZJ) {
            synchronized (OptimizePushProcessImpl.class) {
                if (!LIZJ) {
                    LIZJ = true;
                    C84763XOl.LJI().LJJJJZI(new FG7());
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class StartPushProcessTask implements EE1 {
        @Override // X.EEY
        public final String key() {
            return "OptimizePushProcessImpl$StartPushProcessTask";
        }

        @Override // X.EEY
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.EEY
        public final /* synthetic */ String prefix() {
            return "task_";
        }

        @Override // X.EE1
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.EEY
        public final /* synthetic */ int targetProcess() {
            return C0RN.LIZ();
        }

        @Override // X.EEY
        public final /* synthetic */ List triggerOtherLegoComponents() {
            return null;
        }

        @Override // X.EEY
        public final /* synthetic */ EnumC36103EEx triggerType() {
            return C0RN.LIZIZ(this);
        }

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.EE1
        public final EFK type() {
            return EFK.BACKGROUND;
        }

        @Override // X.EEY
        public final void run(Context context) {
            o.LJIIIZ(context, "context");
            if (FGT.LIZ()) {
                OptimizePushProcessImpl.LIZ.getClass();
                OptimizePushProcessImpl.LJ();
            } else {
                C78685UuP.LJJIII().startPushProcess(context);
                C78685UuP.LJJIII().removeRedBadge(context);
            }
        }
    }

    public static boolean LIZJ(Context context, Intent intent) {
        boolean LIZIZ2;
        if ((C84763XOl.LJIIJJI && !C38987FRv.LIZLLL().booleanValue()) || !FGT.LIZIZ(context) || FGG.LIZLLL(context) || intent == null) {
            return false;
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            if (!TextUtils.equals(context.getPackageName(), component.getPackageName())) {
                return false;
            }
            if (!FGU.LIZ) {
                synchronized (FGU.class) {
                    if (!FGU.LIZ) {
                        FGU.LIZ(context);
                        FGU.LIZ = true;
                    }
                }
            }
            HashSet hashSet = (HashSet) FGU.LIZIZ;
            if (!hashSet.isEmpty()) {
                LIZIZ2 = hashSet.contains(component.getClassName());
            } else {
                LIZIZ2 = FGU.LIZIZ(context, intent);
            }
        } else {
            LIZIZ2 = FGU.LIZIZ(context, intent);
        }
        if (!LIZIZ2) {
            return false;
        }
        return true;
    }

    public static boolean LJFF(Context context, Runnable runnable) {
        synchronized (LIZ) {
            if (FGG.LIZLLL(context)) {
                return false;
            }
            if (FGT.LIZ()) {
                ((ArrayList) LIZIZ).add(runnable);
            }
            LIZLLL();
            if (FGT.LIZ()) {
                FGW.LIZ();
                return true;
            }
            return true;
        }
    }

    @Override // X.FGY
    public final boolean LIZIZ(Context context, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        if (!FUU.LIZ(context, intent) && LIZJ(context, intent)) {
            return LJFF(context, new ARunnableS42S0100000_6(intent, 51));
        }
        return false;
    }

    @Override // X.FGY
    public final boolean LIZ(Context context, Intent intent, ServiceConnection connection, int i) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        o.LJIIIZ(connection, "connection");
        if (!FUU.LIZ(context, intent) && LIZJ(context, intent)) {
            return LJFF(context, new ARunnableS9S0201000_6(intent, connection, i, 3));
        }
        return false;
    }
}
