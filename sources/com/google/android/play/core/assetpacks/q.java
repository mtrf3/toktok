package com.google.android.play.core.assetpacks;

import X.C13T;
import X.C141415gn;
import X.C16880lQ;
import X.C39776FjI;
import X.C40561Fvx;
import X.C40579FwF;
import X.C40616Fwq;
import X.C67585Qfl;
import X.InterfaceC40572Fw8;
import X.InterfaceC40617Fwr;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class q implements s2 {
    public static final C13T LJFF = new C13T("AssetPackServiceImpl");
    public static final Intent LJI = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    public final String LIZ;
    public final q0 LIZIZ;
    public final C67585Qfl<InterfaceC40617Fwr> LIZJ;
    public final C67585Qfl<InterfaceC40617Fwr> LIZLLL;
    public final AtomicBoolean LJ = new AtomicBoolean();

    public static /* synthetic */ Bundle LJIIIIZZ(Map map) {
        Bundle LJII = LJII();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        LJII.putParcelableArrayList("installed_asset_module", arrayList);
        return LJII;
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final synchronized void LIZ() {
        if (this.LIZLLL == null) {
            LJFF.LIZJ("Keep alive connection manager is not initialized.", 5, new Object[0]);
            return;
        }
        C13T c13t = LJFF;
        c13t.LIZJ("keepAlive", 4, new Object[0]);
        if (!this.LJ.compareAndSet(false, true)) {
            c13t.LIZJ("Service is already kept alive.", 4, new Object[0]);
        } else {
            C40579FwF c40579FwF = new C40579FwF(1);
            this.LIZLLL.LIZ(new k(this, c40579FwF, c40579FwF));
        }
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void LIZJ(int i, String str) {
        LJIIIZ(i, 10, str);
    }

    public static Bundle LJII() {
        Bundle LIZ = C141415gn.LIZ("playcore_version_code", 10900);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        LIZ.putIntegerArrayList("supported_compression_formats", arrayList);
        LIZ.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return LIZ;
    }

    public static <T> C40561Fvx LJIIJ() {
        LJFF.LIZJ("onError(%d)", 6, new Object[]{-11});
        a aVar = new a(-11);
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

    @Override // com.google.android.play.core.assetpacks.s2
    public final void LIZIZ(int i) {
        if (this.LIZJ != null) {
            LJFF.LIZJ("notifySessionFailed", 4, new Object[0]);
            C40579FwF c40579FwF = new C40579FwF(1);
            this.LIZJ.LIZ(new h(this, c40579FwF, i, c40579FwF));
            return;
        }
        throw new m0("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void LJFF(List<String> list) {
        if (this.LIZJ == null) {
            return;
        }
        LJFF.LIZJ("cancelDownloads(%s)", 4, new Object[]{list});
        C40579FwF c40579FwF = new C40579FwF(1);
        this.LIZJ.LIZ(new d(this, c40579FwF, list, c40579FwF));
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final C40561Fvx LJI(Map<String, Long> map) {
        if (this.LIZJ == null) {
            return LJIIJ();
        }
        LJFF.LIZJ("syncPacks", 4, new Object[0]);
        C40579FwF c40579FwF = new C40579FwF(1);
        this.LIZJ.LIZ(new e(this, c40579FwF, map, c40579FwF));
        return (C40561Fvx) c40579FwF.LIZ;
    }

    public q(Context context, q0 q0Var) {
        this.LIZ = context.getPackageName();
        this.LIZIZ = q0Var;
        if (C39776FjI.LIZ(context)) {
            Context LLLLL = C16880lQ.LLLLL(context);
            LLLLL = LLLLL == null ? context : LLLLL;
            C13T c13t = LJFF;
            Intent intent = LJI;
            this.LIZJ = new C67585Qfl<>(LLLLL, c13t, "AssetPackService", intent, new InterfaceC40572Fw8() { // from class: com.google.android.play.core.assetpacks.t2
                @Override // X.InterfaceC40572Fw8
                public final Object LIZ(IBinder iBinder) {
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
                    if (queryLocalInterface instanceof InterfaceC40617Fwr) {
                        return queryLocalInterface;
                    }
                    return new C40616Fwq(iBinder);
                }
            });
            Context LLLLL2 = C16880lQ.LLLLL(context);
            this.LIZLLL = new C67585Qfl<>(LLLLL2 == null ? context : LLLLL2, c13t, "AssetPackService-keepAlive", intent, new InterfaceC40572Fw8() { // from class: com.google.android.play.core.assetpacks.u2
                @Override // X.InterfaceC40572Fw8
                public final Object LIZ(IBinder iBinder) {
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
                    if (queryLocalInterface instanceof InterfaceC40617Fwr) {
                        return queryLocalInterface;
                    }
                    return new C40616Fwq(iBinder);
                }
            });
        }
        LJFF.LIZJ("AssetPackService initiated.", 3, new Object[0]);
    }

    public final void LJIIIZ(int i, int i2, String str) {
        if (this.LIZJ != null) {
            LJFF.LIZJ("notifyModuleCompleted", 4, new Object[0]);
            C40579FwF c40579FwF = new C40579FwF(1);
            this.LIZJ.LIZ(new g(this, c40579FwF, i, str, c40579FwF, i2));
            return;
        }
        throw new m0("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final void LIZLLL(int i, int i2, String str, String str2) {
        if (this.LIZJ != null) {
            LJFF.LIZJ("notifyChunkTransferred", 4, new Object[0]);
            C40579FwF c40579FwF = new C40579FwF(1);
            this.LIZJ.LIZ(new f(this, c40579FwF, i, str, str2, i2, c40579FwF));
            return;
        }
        throw new m0("The Play Store app is not installed or is an unofficial version.", i);
    }

    @Override // com.google.android.play.core.assetpacks.s2
    public final C40561Fvx LJ(int i, int i2, String str, String str2) {
        if (this.LIZJ == null) {
            return LJIIJ();
        }
        LJFF.LIZJ("getChunkFileDescriptor(%s, %s, %d, session=%d)", 4, new Object[]{str, str2, Integer.valueOf(i2), Integer.valueOf(i)});
        C40579FwF c40579FwF = new C40579FwF(1);
        this.LIZJ.LIZ(new j(this, c40579FwF, i, str, str2, i2, c40579FwF));
        return (C40561Fvx) c40579FwF.LIZ;
    }
}
