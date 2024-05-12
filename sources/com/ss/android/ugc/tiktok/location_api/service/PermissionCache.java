package com.ss.android.ugc.tiktok.location_api.service;

import X.C10K;
import X.C16880lQ;
import X.C61099NyR;
import X.C61120Nym;
import X.C76800UCe;
import X.EF7;
import X.M4A;
import X.OHI;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PermissionCache implements LifecycleEventObserver {
    public static final PermissionCache LJLIL;
    public static final ConcurrentHashMap<String, Boolean> LJLILLLLZI;
    public static Lifecycle.Event LJLJI;
    public static volatile boolean LJLJJI;

    static {
        PermissionCache permissionCache = new PermissionCache();
        LJLIL = permissionCache;
        LJLILLLLZI = new ConcurrentHashMap<>();
        LJLJI = Lifecycle.Event.ON_ANY;
        if (LJLJJI) {
            return;
        }
        if (o.LJ(C16880lQ.LLJJJJ().getThread(), C16880lQ.LLLLIIIILLL())) {
            permissionCache.LIZ();
        } else {
            C10K.LJIIIIZZ.execute(M4A.LJLIL);
        }
    }

    public final void LIZ() {
        if (LJLJJI) {
            return;
        }
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
        C61099NyR.LIZJ.add(new C61120Nym());
        LJLJJI = true;
    }

    public static boolean LIZIZ(String... checkedPermission) {
        o.LJIIIZ(checkedPermission, "checkedPermission");
        for (String str : checkedPermission) {
            ConcurrentHashMap<String, Boolean> concurrentHashMap = LJLILLLLZI;
            Boolean bool = concurrentHashMap.get(str);
            if (bool != null) {
                if (!bool.booleanValue()) {
                    return false;
                }
                if (C76800UCe.LIZ != null) {
                    continue;
                }
            }
            PermissionCache permissionCache = LJLIL;
            OHI ohi = OHI.LIZ;
            Context LIZIZ = EF7.LIZIZ();
            ohi.getClass();
            boolean LJ = OHI.LJ(LIZIZ, str);
            if (LJLJJI) {
                permissionCache.getClass();
                if (LJLJI == Lifecycle.Event.ON_RESUME) {
                    concurrentHashMap.put(str, Boolean.valueOf(LJ));
                }
            }
            if (!LJ) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        LJLJI = event;
        if (event == Lifecycle.Event.ON_PAUSE) {
            LJLILLLLZI.clear();
        }
    }
}
