package com.google.android.play.core.assetpacks;

import X.C13T;
import X.C16880lQ;
import X.C40558Fvu;
import X.C40561Fvx;
import X.C40566Fw2;
import X.C40567Fw3;
import X.InterfaceC38408F5o;
import X.InterfaceC40563Fvz;
import X.InterfaceC40570Fw6;
import android.os.Handler;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class i2 {
    public static final C13T LJ = new C13T("AssetPackManager");
    public final y LIZ;
    public final InterfaceC38408F5o<s2> LIZIZ;
    public final t LIZJ;
    public final InterfaceC38408F5o<Executor> LIZLLL;

    public i2(y yVar, InterfaceC38408F5o interfaceC38408F5o, t tVar, h0 h0Var, InterfaceC38408F5o interfaceC38408F5o2) {
        new Handler(C16880lQ.LLJJJJ());
        this.LIZ = yVar;
        this.LIZIZ = interfaceC38408F5o;
        this.LIZJ = tVar;
        this.LIZLLL = interfaceC38408F5o2;
    }

    public final void LIZ(boolean z) {
        C40558Fvu c40558Fvu;
        boolean z2;
        t tVar = this.LIZJ;
        synchronized (tVar) {
            c40558Fvu = tVar.LJ;
        }
        if (c40558Fvu != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LIZJ.LIZJ(z);
        if (z && !z2) {
            this.LIZLLL.a().execute(new Runnable(this) { // from class: com.google.android.play.core.assetpacks.f2
                public final i2 LJLIL;

                {
                    this.LJLIL = this;
                }

                public final void LIZ() {
                    i2 i2Var = this.LJLIL;
                    s2 a = i2Var.LIZIZ.a();
                    y yVar = i2Var.LIZ;
                    yVar.getClass();
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    try {
                        Iterator it = ((ArrayList) yVar.LIZJ()).iterator();
                        while (it.hasNext()) {
                            File file = (File) it.next();
                            c0 LJI = yVar.LJI(file.getName());
                            if (LJI != null) {
                                hashMap2.put(file.getName(), LJI);
                            }
                        }
                    } catch (IOException e) {
                        y.LIZJ.LIZJ("Could not process directory while scanning installed packs: %s", 6, new Object[]{e});
                    }
                    for (String str : hashMap2.keySet()) {
                        hashMap.put(str, Long.valueOf(y.LIZIZ(new File(new File(yVar.LJ(), str), String.valueOf((int) y.LIZIZ(new File(yVar.LJ(), str), true))), true)));
                    }
                    C40561Fvx LJI2 = a.LJI(hashMap);
                    Executor a2 = i2Var.LIZLLL.a();
                    final y yVar2 = i2Var.LIZ;
                    yVar2.getClass();
                    LJI2.LIZJ(a2, new InterfaceC40563Fvz(yVar2) { // from class: com.google.android.play.core.assetpacks.g2
                        public final y LJLIL;

                        {
                            this.LJLIL = yVar2;
                        }

                        @Override // X.InterfaceC40563Fvz
                        public final void onSuccess(Object obj) {
                            y yVar3 = this.LJLIL;
                            List list = (List) obj;
                            int LIZ = yVar3.LIZIZ.LIZ();
                            Iterator it2 = ((ArrayList) yVar3.LIZJ()).iterator();
                            while (it2.hasNext()) {
                                File file2 = (File) it2.next();
                                if (!list.contains(file2.getName()) && y.LIZIZ(file2, true) != LIZ) {
                                    y.LJFF(file2);
                                }
                            }
                        }
                    });
                    Executor a3 = i2Var.LIZLLL.a();
                    h2 h2Var = new InterfaceC40570Fw6() { // from class: com.google.android.play.core.assetpacks.h2
                        @Override // X.InterfaceC40570Fw6
                        public final void onFailure(Exception exc) {
                            i2.LJ.LIZJ(C16880lQ.LLLZ("Could not sync active asset packs. %s", new Object[]{exc}), 5, new Object[0]);
                        }
                    };
                    C40566Fw2<ResultT> c40566Fw2 = LJI2.LIZIZ;
                    C40567Fw3 c40567Fw3 = new C40567Fw3(a3, h2Var);
                    synchronized (c40566Fw2.LIZ) {
                        if (c40566Fw2.LIZIZ == null) {
                            c40566Fw2.LIZIZ = new ArrayDeque();
                        }
                        ((ArrayDeque) c40566Fw2.LIZIZ).add(c40567Fw3);
                    }
                    LJI2.LIZLLL();
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        LIZ();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }
}
