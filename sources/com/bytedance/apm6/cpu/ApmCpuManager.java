package com.bytedance.apm6.cpu;

import X.C09970aH;
import X.C64071PCp;
import X.C64125PEr;
import X.C64156PFw;
import X.C64157PFx;
import X.C64184PGy;
import X.C64196PHk;
import X.C64198PHm;
import X.C64199PHn;
import X.C64202PHq;
import X.C64205PHt;
import X.C64206PHu;
import X.C64207PHv;
import X.C78915Uy7;
import X.EnumC53639L3j;
import X.FQS;
import X.InterfaceC53641L3l;
import X.InterfaceC53642L3m;
import X.L7C;
import X.PD6;
import X.PGQ;
import android.text.TextUtils;
import android.util.Pair;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import oy0.a;

/* loaded from: classes12.dex */
public class ApmCpuManager {
    public static EnumC53639L3j sVersion = EnumC53639L3j.V2;
    public static volatile ApmCpuManager singleton;
    public CopyOnWriteArraySet<String> mSceneSet = new CopyOnWriteArraySet<>();

    public static ApmCpuManager getInstance() {
        if (singleton == null) {
            synchronized (ApmCpuManager.class) {
                if (singleton == null) {
                    singleton = new ApmCpuManager();
                }
            }
        }
        return singleton;
    }

    public static boolean isPowerOpt() {
        if (sVersion != EnumC53639L3j.V1) {
            return true;
        }
        return false;
    }

    public double getCpuRate() {
        return C64157PFx.LIZ.LIZ;
    }

    public String getCpuSceneString() {
        String LJIIIZ = C78915Uy7.LJIIIZ(this.mSceneSet.toArray());
        if (!TextUtils.isEmpty(LJIIIZ)) {
            return LJIIIZ;
        }
        return "";
    }

    public double getCpuSpeed() {
        return C64157PFx.LIZ.LIZIZ;
    }

    public a getCurrentCpuRateNew() {
        double d;
        a aVar = new a();
        if (FQS.LIZIZ() <= 0) {
            return aVar;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C64125PEr.LIZLLL().getClass();
        long LIZ = FQS.LIZ();
        C64125PEr.LIZLLL().getClass();
        long LIZJ = C64125PEr.LIZJ();
        try {
            Thread.sleep(360L);
        } catch (InterruptedException unused) {
        }
        C64125PEr.LIZLLL().getClass();
        long LIZ2 = FQS.LIZ();
        C64125PEr.LIZLLL().getClass();
        long LIZJ2 = C64125PEr.LIZJ() - LIZJ;
        if (LIZJ2 > 0) {
            d = (((float) LIZ2) - ((float) LIZ)) / ((float) LIZJ2);
        } else {
            d = -1.0d;
        }
        aVar.LIZ = d;
        aVar.LIZIZ = (((LIZ2 - LIZ) * 1000.0d) / (System.currentTimeMillis() - currentTimeMillis)) / FQS.LIZLLL();
        return aVar;
    }

    public Pair<Long, LinkedList<C64206PHu>> getExceptionThreadList() {
        C64184PGy c64184PGy = C64157PFx.LIZ;
        if (((AbstractCollection) c64184PGy.LIZLLL.second).isEmpty()) {
            return c64184PGy.LIZLLL;
        }
        return new Pair<>(c64184PGy.LIZLLL.first, new LinkedList((Collection) c64184PGy.LIZLLL.second));
    }

    public long getLastCpuExceptionTimestamp() {
        return C64207PHv.LIZ.LJ;
    }

    public Pair<Long, LinkedList<C64206PHu>> getThreadList() {
        C64184PGy c64184PGy = C64157PFx.LIZ;
        if (((AbstractCollection) c64184PGy.LIZJ.second).isEmpty()) {
            return c64184PGy.LIZJ;
        }
        return new Pair<>(c64184PGy.LIZJ.first, new LinkedList((Collection) c64184PGy.LIZJ.second));
    }

    public void startExceptionDetectNoStack() {
        C64198PHm c64198PHm;
        if (C09970aH.LJJ) {
            C64199PHn c64199PHn = C64207PHv.LIZ;
            synchronized (c64199PHn) {
                if (!c64199PHn.LIZ && (c64198PHm = c64199PHn.LIZJ) != null) {
                    c64199PHn.LIZ = true;
                    c64199PHn.LIZLLL = false;
                    c64199PHn.LIZIZ.LJFF(c64198PHm);
                }
            }
        }
    }

    public void stopExceptionDetectNoStack() {
        if (C09970aH.LJJ) {
            C64199PHn c64199PHn = C64207PHv.LIZ;
            synchronized (c64199PHn) {
                if (c64199PHn.LIZ && !c64199PHn.LIZLLL) {
                    c64199PHn.LIZ = false;
                    c64199PHn.LIZIZ.LJI();
                }
            }
        }
    }

    public void tmpStartExceptionDetect() {
        C64199PHn c64199PHn = C64207PHv.LIZ;
        synchronized (c64199PHn) {
            c64199PHn.LJFF = true;
        }
    }

    public a getCurrentCpuRate() {
        return getCurrentCpuRateNew();
    }

    public CopyOnWriteArraySet<String> getCpuSceneSet() {
        return this.mSceneSet;
    }

    public static void setVersion(EnumC53639L3j enumC53639L3j) {
        sVersion = enumC53639L3j;
    }

    public void setCpuDataListener(InterfaceC53641L3l interfaceC53641L3l) {
        C64156PFw.LIZ.getClass();
    }

    public void setCpuExceptionFilter(InterfaceC53642L3m interfaceC53642L3m) {
        C64207PHv.LIZ.getClass();
    }

    public void setExceptionListener(L7C l7c) {
        C64207PHv.LIZ.getClass();
    }

    public void startScene(String str) {
        this.mSceneSet.add(str);
        PGQ.LIZ().LIZ.add(str);
    }

    public void startUsageDetect(String str) {
        synchronized (C64202PHq.class) {
            C64205PHt c64205PHt = new C64205PHt();
            c64205PHt.LIZ = System.currentTimeMillis();
            C64125PEr.LIZLLL().getClass();
            c64205PHt.LIZIZ = FQS.LIZ();
            C64125PEr LIZLLL = C64125PEr.LIZLLL();
            FQS.LIZIZ();
            LIZLLL.getClass();
            c64205PHt.LIZJ = C64125PEr.LIZJ();
            ((HashMap) C64202PHq.LIZ).put(str, c64205PHt);
        }
    }

    public void stopScene(String str) {
        this.mSceneSet.remove(str);
        PGQ.LIZ().LIZ.remove(str);
    }

    public void stopUsageDetect(String str, boolean z) {
        double d;
        synchronized (C64202PHq.class) {
            Map<String, C64205PHt> map = C64202PHq.LIZ;
            C64205PHt c64205PHt = (C64205PHt) ((HashMap) map).get(str);
            if (c64205PHt != null) {
                if (c64205PHt.LIZIZ >= 0 || c64205PHt.LIZJ >= 0) {
                    C64125PEr.LIZLLL().getClass();
                    long LIZ = FQS.LIZ();
                    C64125PEr LIZLLL = C64125PEr.LIZLLL();
                    FQS.LIZIZ();
                    LIZLLL.getClass();
                    long LIZJ = C64125PEr.LIZJ() - c64205PHt.LIZJ;
                    if (LIZJ > 0) {
                        d = (LIZ - c64205PHt.LIZIZ) / LIZJ;
                    } else {
                        d = -1.0d;
                    }
                    ((HashMap) map).remove(str);
                    C64071PCp.LIZ(PD6.CPU).LIZJ(new C64196PHk(d, (((LIZ - c64205PHt.LIZIZ) * 1000.0d) / (System.currentTimeMillis() - c64205PHt.LIZ)) / FQS.LIZLLL(), str, z));
                }
            }
        }
    }
}
