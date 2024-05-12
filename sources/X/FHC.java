package X;

import com.bytedance.ies.abmock.SaveConfigType$ConfigType;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.p;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHC {
    public static volatile FHC LJII;
    public static final Object LJIIIIZZ = new Object();
    public volatile FI3 LIZJ;
    public volatile InterfaceC38688FGi LIZLLL;
    public int LJ;
    public final java.util.Map<String, Object> LIZ = new ConcurrentHashMap();
    public final java.util.Map<String, Object> LIZIZ = new ConcurrentHashMap();
    public final Gson LJFF = new Gson();
    public boolean LJI = false;

    public static FHC LIZIZ() {
        if (LJII == null) {
            synchronized (FHC.class) {
                if (LJII == null) {
                    LJII = new FHC();
                }
            }
        }
        return LJII;
    }

    public final void LIZ() {
        ((ConcurrentHashMap) this.LIZIZ).clear();
        if (this.LJI) {
            for (Map.Entry entry : ((ConcurrentHashMap) this.LIZ).entrySet()) {
                if (entry != null && entry.getValue() == LJIIIIZZ && entry.getKey() != null) {
                    ((ConcurrentHashMap) this.LIZ).remove(entry.getKey());
                }
            }
        }
    }

    public final void LIZLLL(String str) {
        if (str != null) {
            ((ConcurrentHashMap) this.LIZ).remove(str);
            ((ConcurrentHashMap) this.LIZIZ).remove(str);
        }
    }

    public final InterfaceC38716FHk LJFF(int i, String key) {
        if (i == 1) {
            return FHK.LIZJ;
        }
        if (this.LIZLLL != null && this.LIZLLL.LJFF()) {
            FHB fhb = FHB.LJ;
            if (fhb.LJIIIZ().contains(key)) {
                if (FHR.LIZ) {
                    o.LJIIJ(key, "key");
                    if (!C38715FHj.LIZLLL) {
                        C38715FHj.LIZIZ.offer(key);
                        if (!C38715FHj.LIZJ && (!C38715FHj.LIZJ || C38715FHj.LIZ == null)) {
                            C38715FHj.LIZJ = true;
                            C38715FHj.LIZ = new PthreadThread(FHN.LJLIL, "ABMockRecord");
                            PthreadThread pthreadThread = C38715FHj.LIZ;
                            if (pthreadThread != null) {
                                pthreadThread.start();
                            }
                        }
                    }
                }
                return fhb;
            }
        }
        return FHE.LIZLLL;
    }

    public final Object LIZJ(String key, SaveConfigType$ConfigType configType, Class cls) {
        boolean z;
        m mVar;
        Object obj;
        if (this.LIZJ.enable() && (obj = this.LIZJ.get(key)) != null) {
            if (cls != null && !obj.getClass().isAssignableFrom(cls) && (obj instanceof m)) {
                return GsonProtectorUtils.fromJson(this.LJFF, (j) obj, cls);
            }
            return obj;
        }
        try {
            Object obj2 = ((ConcurrentHashMap) this.LIZ).get(key);
            if (obj2 == null) {
                obj2 = ((ConcurrentHashMap) this.LIZIZ).get(key);
                if (key != null) {
                }
                if (obj2 == null) {
                    o.LJIIJ(key, "key");
                    o.LJIIJ(configType, "configType");
                    boolean z2 = false;
                    boolean LJFF = false;
                    int LJIILJJIL = 0;
                    z2 = false;
                    if (C38681FGb.LIZJ) {
                        LinkedList<InterfaceC38730FHy> linkedList = C38681FGb.LIZIZ;
                        if (linkedList.size() != 0) {
                            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                            Iterator<InterfaceC38730FHy> it = linkedList.iterator();
                            while (it.hasNext()) {
                                InterfaceC38730FHy interceptor = it.next();
                                o.LJFF(interceptor, "interceptor");
                                java.util.Map<String, j> LIZ = interceptor.LIZ();
                                o.LJFF(LIZ, "interceptor.allValue");
                                concurrentHashMap.putAll(LIZ);
                            }
                            C38681FGb.LIZ = concurrentHashMap;
                        }
                        C38681FGb.LIZJ = false;
                    }
                    j jVar = (j) ((ConcurrentHashMap) C38681FGb.LIZ).get(key);
                    if (jVar != null) {
                        try {
                            switch (C38708FHc.LIZ[configType.ordinal()]) {
                                case 1:
                                    if ((jVar instanceof p) && (jVar.LJIJ().LJLIL instanceof Number)) {
                                        if (jVar.LJIILJJIL() != 0) {
                                            LJFF = true;
                                        }
                                    } else {
                                        LJFF = jVar.LJFF();
                                    }
                                    return Boolean.valueOf(LJFF);
                                case 2:
                                    if ((jVar instanceof p) && (jVar.LJIJ().LJLIL instanceof Boolean)) {
                                        if (jVar.LJFF()) {
                                            LJIILJJIL = 1;
                                        }
                                    } else {
                                        LJIILJJIL = jVar.LJIILJJIL();
                                    }
                                    return Integer.valueOf(LJIILJJIL);
                                case 3:
                                    return Long.valueOf(jVar.LJIJJLI());
                                case 4:
                                    return Double.valueOf(jVar.LJIIIZ());
                                case 5:
                                    return Float.valueOf(jVar.LJIIJ());
                                case 6:
                                    return jVar.LJJIFFI();
                                case 7:
                                    return FHE.LIZLLL.LJIIJ().LIZJ(jVar, String[].class);
                                case 8:
                                    FHC LIZIZ = LIZIZ();
                                    LIZIZ.getClass();
                                    FH3 fh3 = FH3.LIZLLL;
                                    m LIZ2 = fh3.LIZ();
                                    if (LIZ2 != null) {
                                        z = LIZ2.LJJIJLIJ(key);
                                    } else {
                                        z = false;
                                    }
                                    if (!z) {
                                        mVar = (m) LIZIZ.LJFF(0, key).LIZIZ(key, m.class);
                                    } else {
                                        mVar = (m) fh3.LIZIZ(key);
                                    }
                                    p LJJIJL = jVar.LJIIZILJ().LJJIJL("_replace");
                                    if (LJJIJL != null && (LJJIJL.LJLIL instanceof Boolean)) {
                                        z2 = LJJIJL.LJFF();
                                    }
                                    if (mVar != null && !z2) {
                                        java.util.Set<Map.Entry<String, j>> entrySet = jVar.LJIIZILJ().entrySet();
                                        o.LJFF(entrySet, "jsonElement.asJsonObject.entrySet()");
                                        for (Map.Entry<String, j> entry : entrySet) {
                                            mVar.LJJII(entry.getKey(), entry.getValue());
                                        }
                                        if (cls == null && (!o.LJ(cls, String[].class)) && (!o.LJ(jVar.getClass(), cls))) {
                                            return LIZIZ().LJFF.LIZJ(mVar, cls);
                                        }
                                        return mVar;
                                    }
                                    mVar = jVar.LJIIZILJ();
                                    return cls == null ? mVar : mVar;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    return null;
                }
                return obj2;
            }
        } finally {
            if (key != null) {
                FH1.LJI.getClass();
                FH1.LIZ(key);
            }
        }
    }

    public final void LJ(Object obj, String str, boolean z, boolean z2) {
        FH1.LJI.getClass();
        FH1.LJIIJ(str);
        if (!z2 && obj != null) {
            if (z) {
                ((ConcurrentHashMap) this.LIZ).put(str, obj);
            } else {
                ((ConcurrentHashMap) this.LIZIZ).put(str, obj);
            }
        }
    }
}
