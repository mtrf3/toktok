package com.google.android.play.core.assetpacks;

import X.C64075PCt;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes7.dex */
public /* synthetic */ class t0 implements b1 {
    public final Object LIZ;
    public final Object LIZIZ;

    public /* synthetic */ t0(c1 c1Var, Bundle bundle) {
        this.LIZ = c1Var;
        this.LIZIZ = bundle;
    }

    @Override // com.google.android.play.core.assetpacks.b1
    public final Object a() {
        c1 c1Var = (c1) this.LIZ;
        Bundle bundle = (Bundle) this.LIZIZ;
        c1Var.getClass();
        int i = bundle.getInt("session_id");
        if (i != 0) {
            Map<Integer, z0> map = c1Var.LJ;
            Integer valueOf = Integer.valueOf(i);
            if (((HashMap) map).containsKey(valueOf)) {
                if (((z0) ((HashMap) c1Var.LJ).get(valueOf)).LIZJ.LIZJ == 6) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!l1.LIZLLL(r2.LIZJ.LIZJ, bundle.getInt(C64075PCt.LIZ("status", c1.LIZLLL(bundle)))));
            }
        }
        return Boolean.TRUE;
    }

    public t0() {
        this.LIZ = new CopyOnWriteArraySet();
        this.LIZIZ = new ConcurrentHashMap();
    }
}
