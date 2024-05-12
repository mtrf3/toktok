package com.google.android.play.core.assetpacks;

import X.C16880lQ;
import X.C40648FxM;
import X.InterfaceC38408F5o;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class t1 {
    public final y LIZ;
    public final InterfaceC38408F5o<s2> LIZIZ;
    public final c1 LIZJ;
    public final InterfaceC38408F5o<Executor> LIZLLL;
    public final q0 LJ;
    public final C40648FxM LJFF;

    public t1(y yVar, InterfaceC38408F5o<s2> interfaceC38408F5o, c1 c1Var, InterfaceC38408F5o<Executor> interfaceC38408F5o2, q0 q0Var, C40648FxM c40648FxM) {
        this.LIZ = yVar;
        this.LIZIZ = interfaceC38408F5o;
        this.LIZJ = c1Var;
        this.LIZLLL = interfaceC38408F5o2;
        this.LJ = q0Var;
        this.LJFF = c40648FxM;
    }

    public final void LIZ(final q1 q1Var) {
        y yVar = this.LIZ;
        String str = q1Var.LIZIZ;
        int i = q1Var.LIZJ;
        long j = q1Var.LIZLLL;
        yVar.getClass();
        File file = new File(yVar.LIZLLL(i, j, str), "_packs");
        y yVar2 = this.LIZ;
        String str2 = q1Var.LIZIZ;
        int i2 = q1Var.LIZJ;
        long j2 = q1Var.LIZLLL;
        yVar2.getClass();
        File file2 = new File(new File(yVar2.LIZLLL(i2, j2, str2), "_slices"), "_metadata");
        boolean z = false;
        if (file.exists() && file2.exists()) {
            File LJII = this.LIZ.LJII(q1Var.LIZJ, q1Var.LIZLLL, q1Var.LIZIZ);
            LJII.mkdirs();
            if (file.renameTo(LJII)) {
                C16880lQ.LLLZZIL(new File(this.LIZ.LJII(q1Var.LIZJ, q1Var.LIZLLL, q1Var.LIZIZ), "merge.tmp"));
                y yVar3 = this.LIZ;
                String str3 = q1Var.LIZIZ;
                int i3 = q1Var.LIZJ;
                long j3 = q1Var.LIZLLL;
                yVar3.getClass();
                File file3 = new File(yVar3.LJII(i3, j3, str3), "_metadata");
                file3.mkdirs();
                if (file2.renameTo(file3)) {
                    C40648FxM c40648FxM = this.LJFF;
                    synchronized (c40648FxM) {
                        if (!c40648FxM.LIZIZ.get()) {
                            c40648FxM.LIZ();
                        }
                        Object obj = ((HashMap) c40648FxM.LIZ).get("assetOnlyUpdates");
                        if (obj instanceof Boolean) {
                            z = ((Boolean) obj).booleanValue();
                        }
                    }
                    Executor a = this.LIZLLL.a();
                    if (z) {
                        a.execute(new Runnable(this, q1Var) { // from class: com.google.android.play.core.assetpacks.r1
                            public final t1 LJLIL;
                            public final q1 LJLILLLLZI;

                            {
                                this.LJLIL = this;
                                this.LJLILLLLZI = q1Var;
                            }

                            public final void LIZ() {
                                t1 t1Var = this.LJLIL;
                                q1 q1Var2 = this.LJLILLLLZI;
                                y yVar4 = t1Var.LIZ;
                                String str4 = q1Var2.LIZIZ;
                                int i4 = q1Var2.LIZJ;
                                long j4 = q1Var2.LIZLLL;
                                yVar4.getClass();
                                File file4 = new File(yVar4.LJ(), str4);
                                if (!file4.exists()) {
                                    return;
                                }
                                for (File file5 : file4.listFiles()) {
                                    if (!file5.getName().equals(String.valueOf(i4)) && !file5.getName().equals("stale.tmp")) {
                                        y.LJFF(file5);
                                    } else if (file5.getName().equals(String.valueOf(i4))) {
                                        for (File file6 : file5.listFiles()) {
                                            if (!file6.getName().equals(String.valueOf(j4))) {
                                                y.LJFF(file6);
                                            }
                                        }
                                    }
                                }
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
                    } else {
                        final y yVar4 = this.LIZ;
                        yVar4.getClass();
                        a.execute(new Runnable(yVar4) { // from class: com.google.android.play.core.assetpacks.s1
                            public final y LJLIL;

                            {
                                this.LJLIL = yVar4;
                            }

                            public final void LIZ() {
                                Iterator it = ((ArrayList) this.LJLIL.LIZJ()).iterator();
                                while (it.hasNext()) {
                                    File file4 = (File) it.next();
                                    if (file4.listFiles() != null) {
                                        y.LIZ(file4);
                                        long LIZIZ = y.LIZIZ(file4, false);
                                        if (r5.LIZIZ.LIZ() != LIZIZ) {
                                            try {
                                                new File(new File(file4, String.valueOf(LIZIZ)), "stale.tmp").createNewFile();
                                            } catch (IOException unused) {
                                                y.LIZJ.LIZJ("Could not write staleness marker.", 6, new Object[0]);
                                            }
                                        }
                                        for (File file5 : file4.listFiles()) {
                                            y.LIZ(file5);
                                        }
                                    }
                                }
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
                    final c1 c1Var = this.LIZJ;
                    final String str4 = q1Var.LIZIZ;
                    final int i4 = q1Var.LIZJ;
                    final long j4 = q1Var.LIZLLL;
                    c1Var.getClass();
                    c1Var.LIZIZ(new b1(c1Var, str4, i4, j4) { // from class: com.google.android.play.core.assetpacks.u0
                        public final c1 LIZ;
                        public final String LIZIZ;
                        public final int LIZJ;
                        public final long LIZLLL;

                        {
                            this.LIZ = c1Var;
                            this.LIZIZ = str4;
                            this.LIZJ = i4;
                            this.LIZLLL = j4;
                        }

                        @Override // com.google.android.play.core.assetpacks.b1
                        public final Object a() {
                            int i5;
                            final c1 c1Var2 = this.LIZ;
                            String str5 = this.LIZIZ;
                            int i6 = this.LIZJ;
                            long j5 = this.LIZLLL;
                            c1Var2.getClass();
                            final List asList = Arrays.asList(str5);
                            z0 z0Var = (z0) ((Map) c1Var2.LIZIZ(new b1(c1Var2, asList) { // from class: com.google.android.play.core.assetpacks.v0
                                public final c1 LIZ;
                                public final List LIZIZ;

                                {
                                    this.LIZ = c1Var2;
                                    this.LIZIZ = asList;
                                }

                                @Override // com.google.android.play.core.assetpacks.b1
                                public final Object a() {
                                    int i7;
                                    c1 c1Var3 = this.LIZ;
                                    List list = this.LIZIZ;
                                    c1Var3.getClass();
                                    HashMap hashMap = new HashMap();
                                    for (z0 z0Var2 : ((HashMap) c1Var3.LJ).values()) {
                                        String str6 = z0Var2.LIZJ.LIZ;
                                        if (list.contains(str6)) {
                                            z0 z0Var3 = (z0) hashMap.get(str6);
                                            if (z0Var3 == null) {
                                                i7 = -1;
                                            } else {
                                                i7 = z0Var3.LIZ;
                                            }
                                            if (i7 < z0Var2.LIZ) {
                                                hashMap.put(str6, z0Var2);
                                            }
                                        }
                                    }
                                    return hashMap;
                                }
                            })).get(str5);
                            if (z0Var == null || (i5 = z0Var.LIZJ.LIZJ) == 5 || i5 == 6 || i5 == 4) {
                                c1.LJI.LIZJ(C16880lQ.LLLZ("Could not find pack %s while trying to complete it", new Object[]{str5}), 6, new Object[0]);
                            }
                            y yVar5 = c1Var2.LIZ;
                            if (yVar5.LIZLLL(i6, j5, str5).exists()) {
                                y.LJFF(yVar5.LIZLLL(i6, j5, str5));
                            }
                            z0Var.LIZJ.LIZJ = 4;
                            return null;
                        }
                    });
                    this.LJ.LIZ(q1Var.LIZIZ);
                    this.LIZIZ.a().LIZJ(q1Var.LIZ, q1Var.LIZIZ);
                    return;
                }
                throw new m0("Cannot move metadata files to final location.", q1Var.LIZ);
            }
            throw new m0("Cannot move merged pack files to final location.", q1Var.LIZ);
        }
        throw new m0(C16880lQ.LLLZ("Cannot find pack files to move for pack %s.", new Object[]{q1Var.LIZIZ}), q1Var.LIZ);
    }
}
