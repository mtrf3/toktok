package com.google.android.play.core.appupdate;

import X.C13T;
import X.C16880lQ;
import X.C39776FjI;
import X.C40561Fvx;
import X.C40573Fw9;
import X.C40580FwG;
import X.C67585Qfl;
import X.InterfaceC40572Fw8;
import X.InterfaceC40578FwE;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class p {
    public static final C13T LJ = new C13T("AppUpdateService");
    public static final Intent LJFF = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    public final C67585Qfl<InterfaceC40578FwE> LIZ;
    public final String LIZIZ;
    public final Context LIZJ;
    public final q LIZLLL;

    public static <T> C40561Fvx LIZIZ() {
        LJ.LIZJ("onError(%d)", 6, new Object[]{-9});
        com.google.android.play.core.install.a aVar = new com.google.android.play.core.install.a(-9);
        C40561Fvx c40561Fvx = new C40561Fvx();
        synchronized (c40561Fvx.LIZ) {
            if (!c40561Fvx.LIZJ) {
                c40561Fvx.LIZJ = true;
                c40561Fvx.LJ = aVar;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        c40561Fvx.LIZIZ.LIZ(c40561Fvx);
        return c40561Fvx;
    }

    public static Bundle LIZJ() {
        Map map;
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        synchronized (C40573Fw9.class) {
            Map<String, Map<String, Integer>> map2 = C40573Fw9.LIZ;
            if (!((HashMap) map2).containsKey("app_update")) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 10900);
                ((HashMap) map2).put("app_update", hashMap);
            }
            map = (Map) ((HashMap) map2).get("app_update");
        }
        bundle2.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 10900);
        return bundle;
    }

    public p(Context context, q qVar) {
        this.LIZIZ = context.getPackageName();
        this.LIZJ = context;
        this.LIZLLL = qVar;
        if (C39776FjI.LIZ(context)) {
            Context LLLLL = C16880lQ.LLLLL(context);
            this.LIZ = new C67585Qfl<>(LLLLL == null ? context : LLLLL, LJ, "AppUpdateService", LJFF, new InterfaceC40572Fw8() { // from class: com.google.android.play.core.appupdate.j
                @Override // X.InterfaceC40572Fw8
                public final Object LIZ(IBinder iBinder) {
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
                    if (queryLocalInterface instanceof InterfaceC40578FwE) {
                        return queryLocalInterface;
                    }
                    return new C40580FwG(iBinder);
                }
            });
        }
    }

    public static Bundle LIZ(p pVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(LIZJ());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(C16880lQ.LLLLLLZ(pVar.LIZJ.getPackageManager(), pVar.LIZJ.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            LJ.LIZJ("The current version of the app could not be retrieved", 6, new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }
}
