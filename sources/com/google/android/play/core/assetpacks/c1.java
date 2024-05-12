package com.google.android.play.core.assetpacks;

import X.C13T;
import X.C16880lQ;
import X.InterfaceC38408F5o;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public final class c1 {
    public static final C13T LJI = new C13T("ExtractorSessionStoreView");
    public final y LIZ;
    public final InterfaceC38408F5o<s2> LIZIZ;
    public final q0 LIZJ;
    public final InterfaceC38408F5o<Executor> LIZLLL;
    public final Map<Integer, z0> LJ = new HashMap();
    public final ReentrantLock LJFF = new ReentrantLock();

    public c1(y yVar, q0 q0Var, InterfaceC38408F5o interfaceC38408F5o, InterfaceC38408F5o interfaceC38408F5o2) {
        this.LIZ = yVar;
        this.LIZIZ = interfaceC38408F5o;
        this.LIZJ = q0Var;
        this.LIZLLL = interfaceC38408F5o2;
    }

    public static String LIZLLL(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new m0("Session without pack received.");
        }
        return (String) ListProtector.get(stringArrayList, 0);
    }

    public final void LIZ() {
        this.LJFF.unlock();
    }

    public final z0 LIZJ(int i) {
        Map<Integer, z0> map = this.LJ;
        Integer valueOf = Integer.valueOf(i);
        z0 z0Var = (z0) ((HashMap) map).get(valueOf);
        if (z0Var != null) {
            return z0Var;
        }
        throw new m0(C16880lQ.LLLZ("Could not find session %d while trying to get it", new Object[]{valueOf}), i);
    }

    public final <T> T LIZIZ(b1<T> b1Var) {
        try {
            this.LJFF.lock();
            return b1Var.a();
        } finally {
            LIZ();
        }
    }
}
