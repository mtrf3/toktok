package com.ss.android.ugc.aweme.hybridkit.task;

import X.AbstractC38233EzV;
import X.C03880Dg;
import X.C0RN;
import X.C16880lQ;
import X.C221108m2;
import X.C27740Aue;
import X.C35546DxG;
import X.C37742Era;
import X.C37750Eri;
import X.C37756Ero;
import X.C37757Erp;
import X.C37831Et1;
import X.C38232EzU;
import X.C38253Ezp;
import X.C38502F9e;
import X.C38559FBj;
import X.C39519Ff9;
import X.C62822Ol8;
import X.C65300Pk0;
import X.CH3;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FBF;
import X.FBG;
import X.FBH;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.vmsdk.worker.JsWorker;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class HybridKitConfigTask implements EE1, LifecycleOwner {
    public static String LJLIL;
    public static volatile boolean LJLILLLLZI;
    public static int LJLJI;
    public static final C62822Ol8 LJLJJI;
    public static final C62822Ol8 LJLJJL;
    public static final C62822Ol8 LJLJJLL;

    @Override // X.EEY
    public final String key() {
        return "HybridKitConfigTask";
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
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    static {
        C38559FBj c38559FBj = (C38559FBj) C38559FBj.LIZIZ.getValue();
        new FBF();
        FBG provider = FBG.LJLIL;
        o.LJIIJ(provider, "provider");
        FBH fbh = new FBH(provider);
        c38559FBj.getClass();
        c38559FBj.LIZ = fbh;
        LJLIL = "";
        LJLJI = 47;
        LJLJJI = C221108m2.LIZIZ(CH3.LJLIL);
        LJLJJL = C221108m2.LIZIZ(C37756Ero.LJLIL);
        LJLJJLL = C221108m2.LIZIZ(C37757Erp.LJLIL);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = ProcessLifecycleOwner.get().getLifecycle();
        o.LJIIIIZZ(lifecycle, "get().getLifecycle()");
        return lifecycle;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.MAIN;
    }

    public static void LIZLLL(Context context) {
        if (!JsWorker.isIsInitialised()) {
            JsWorker.initialize();
        }
        if (context != null) {
            C37742Era.LIZLLL = context;
        }
        C38232EzU c38232EzU = new C38232EzU();
        ConcurrentHashMap<String, AbstractC38233EzV> concurrentHashMap = C38502F9e.LIZ;
        if (concurrentHashMap.get(c38232EzU.LIZ) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("update prefetch config, bid = ");
            LIZ.append(c38232EzU.LIZ);
            C37750Eri.LIZ(X1D.LIZIZ(LIZ));
        }
        concurrentHashMap.put(c38232EzU.LIZ, c38232EzU);
        C37831Et1.LIZIZ(C38253Ezp.class, null, 6);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x014b A[Catch: all -> 0x0198, TryCatch #1 {all -> 0x0198, blocks: (B:27:0x012b, B:29:0x014b, B:30:0x014f, B:38:0x0195), top: B:26:0x012b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0195 A[Catch: all -> 0x0198, TRY_LEAVE, TryCatch #1 {all -> 0x0198, blocks: (B:27:0x012b, B:29:0x014b, B:30:0x014f, B:38:0x0195), top: B:26:0x012b }] */
    @Override // X.EEY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run(android.content.Context r25) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hybridkit.task.HybridKitConfigTask.run(android.content.Context):void");
    }

    public static boolean LJII(Context context, String str) {
        List<ResolveInfo> queryIntentActivities;
        C62822Ol8 c62822Ol8 = LJLJJL;
        List list = (List) c62822Ol8.getValue();
        if (list == null || list.isEmpty()) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", C35546DxG.LIZ(str));
        intent.setFlags(268435456);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        List list2 = (List) c62822Ol8.getValue();
        if (list2 != null) {
            PackageManager packageManager = C27740Aue.LIZ(context).getPackageManager();
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 0}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "-4645647334470495213"));
            if (LIZJ.LIZ) {
                queryIntentActivities = (List) LIZJ.LIZIZ;
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            }
            o.LJIIIIZZ(queryIntentActivities, "getActivity(context).pac…tentActivities(intent, 0)");
            if (context != null && (!queryIntentActivities.isEmpty())) {
                if (list2.contains("*")) {
                    C16880lQ.LIZJ(context, intent);
                    return true;
                }
                Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                while (it.hasNext()) {
                    if (list2.contains(it.next().activityInfo.packageName)) {
                        C16880lQ.LIZJ(context, intent);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
