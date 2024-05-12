package com.bytedance.helios.apimonitor;

import X.AbstractC66121PxF;
import X.C113554cx;
import X.C66059PwF;
import X.C66063PwJ;
import X.C66120PxE;
import X.C66130PxO;
import X.C66132PxQ;
import X.C66137PxV;
import X.C66147Pxf;
import X.C66148Pxg;
import X.C66149Pxh;
import X.C66154Pxm;
import X.HandlerThreadC65936PuG;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.PQ0;
import X.X1D;
import Y.ARunnableS15S0101000_11;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class CustomAnchorMonitorImpl extends C66154Pxm {
    public static Handler customDetectHandler;
    public static final CustomAnchorMonitorImpl INSTANCE = new CustomAnchorMonitorImpl();
    public static final Map<Integer, Map<String, C66147Pxf>> caseMap = C113554cx.LJJLIIIIJ(new OSZ(1, new LinkedHashMap()), new OSZ(2, new LinkedHashMap()));
    public static final Map<Integer, List<C66120PxE>> resourceList = C113554cx.LJJLIIIIJ(new OSZ(1, new ArrayList()), new OSZ(2, new ArrayList()));
    public static final Map<Integer, Integer> deviceUsingCount = C113554cx.LJJLIIIIJ(new OSZ(1, 0), new OSZ(2, 0));

    private final boolean initHandler() {
        if (customDetectHandler == null) {
            synchronized (this) {
                HandlerThreadC65936PuG.LIZ();
                HandlerThreadC65936PuG handlerThreadC65936PuG = HandlerThreadC65936PuG.LJLIL;
                o.LJIIIIZZ(handlerThreadC65936PuG, "WorkerThread.get()");
                Looper looper = handlerThreadC65936PuG.getLooper();
                if (looper == null) {
                    C66063PwJ.LIZ("CustomAnchor", "initHandler: looper is null!", null);
                    return false;
                }
                if (customDetectHandler == null) {
                    customDetectHandler = new Handler(looper);
                }
                return true;
            }
        }
        return true;
    }

    public final String[] getBlockedCaseId() {
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        return heliosEnvImpl.LJIIJ.customAnchor.disabledCaseId;
    }

    public final long getDetectDelay() {
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        return heliosEnvImpl.LJIIJ.customAnchor.detectDelay;
    }

    public final boolean isEnabled() {
        HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
        o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
        return heliosEnvImpl.LJIIJ.customAnchor.enabled;
    }

    public final Map<Integer, Map<String, C66147Pxf>> getCaseMap() {
        return caseMap;
    }

    public final Handler getCustomDetectHandler() {
        return customDetectHandler;
    }

    public final Map<Integer, Integer> getDeviceUsingCount() {
        return deviceUsingCount;
    }

    public final Map<Integer, List<C66120PxE>> getResourceList() {
        return resourceList;
    }

    private final void decreaseCount(int i) {
        int intValue;
        Map<Integer, Integer> map = deviceUsingCount;
        synchronized (map) {
            Integer num = map.get(Integer.valueOf(i));
            if (num != null && (intValue = num.intValue()) > 0) {
                map.put(Integer.valueOf(i), Integer.valueOf(intValue - 1));
            }
        }
    }

    private final int deviceCount(int i) {
        int i2;
        Map<Integer, Integer> map = deviceUsingCount;
        synchronized (map) {
            Integer num = map.get(Integer.valueOf(i));
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
        }
        return i2;
    }

    private final void increaseCount(int i) {
        Map<Integer, Integer> map = deviceUsingCount;
        synchronized (map) {
            Integer num = map.get(Integer.valueOf(i));
            if (num != null) {
                map.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    public final void attachActionDetector(AbstractC66121PxF actionDetector) {
        o.LJIIIZ(actionDetector, "actionDetector");
        if (actionDetector instanceof C66130PxO) {
            actionDetector.LIZJ = new C66148Pxg();
        } else {
            if (!(actionDetector instanceof C66132PxQ)) {
                return;
            }
            actionDetector.LIZJ = new C66149Pxh();
        }
    }

    public final void setCustomDetectHandler(Handler handler) {
        customDetectHandler = handler;
    }

    public final void checkDevice(C66147Pxf c66147Pxf, int i) {
        synchronized (c66147Pxf) {
            Map<String, C66147Pxf> map = caseMap.get(Integer.valueOf(i));
            if (map != null) {
                map.remove(c66147Pxf.LIZ);
            }
            o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
            String LIZLLL = PQ0.LIZLLL();
            CustomAnchorMonitorImpl customAnchorMonitorImpl = INSTANCE;
            if (customAnchorMonitorImpl.deviceCount(i) == 0 && o.LJ(LIZLLL, c66147Pxf.LIZJ)) {
                List<C66120PxE> list = resourceList.get(Integer.valueOf(i));
                if (list != null) {
                    synchronized (list) {
                        boolean z = !list.isEmpty();
                        if (i == 2 && (!C66137PxV.LIZIZ.isEmpty())) {
                            return;
                        }
                        if (z) {
                            customAnchorMonitorImpl.reportPrivacyEvent(c66147Pxf, i, (C66120PxE) ORZ.LLFF(list));
                            list.clear();
                        }
                    }
                }
            }
        }
    }

    private final void reportPrivacyEvent(C66147Pxf c66147Pxf, int i, C66120PxE c66120PxE) {
        if (isEnabled()) {
            if (ORY.LJJIJIIJIL(c66147Pxf.LIZ, getBlockedCaseId())) {
                return;
            }
            c66120PxE.LLD = 8;
            c66120PxE.LLF.add("CustomAnchor");
            c66120PxE.LLIIJI = c66147Pxf;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("report ");
            LIZ.append(c66147Pxf);
            LIZ.append(", DeviceType: ");
            LIZ.append(i);
            C66063PwJ.LIZ("CustomAnchor", X1D.LIZIZ(LIZ), null);
            C66059PwF.LIZIZ(c66120PxE);
        }
    }

    @Override // X.C66154Pxm
    public void startUsing(int i, String caseId, String description) {
        Map<String, C66147Pxf> map;
        o.LJIIIZ(caseId, "caseId");
        o.LJIIIZ(description, "description");
        if (!isEnabled() || ORY.LJJIJIIJIL(caseId, getBlockedCaseId()) || !initHandler() || (map = caseMap.get(Integer.valueOf(i))) == null) {
            return;
        }
        C66147Pxf c66147Pxf = map.get(caseId);
        if (c66147Pxf == null) {
            c66147Pxf = new C66147Pxf(caseId);
        }
        synchronized (c66147Pxf) {
            c66147Pxf.LJFF = System.currentTimeMillis();
            c66147Pxf.LIZLLL = description;
            o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
            c66147Pxf.LIZIZ = PQ0.LIZLLL();
        }
        map.put(caseId, c66147Pxf);
        INSTANCE.increaseCount(i);
    }

    @Override // X.C66154Pxm
    public void stopUsing(int i, String caseId, String description) {
        Map<String, C66147Pxf> map;
        o.LJIIIZ(caseId, "caseId");
        o.LJIIIZ(description, "description");
        if (!isEnabled() || ORY.LJJIJIIJIL(caseId, getBlockedCaseId()) || !initHandler() || (map = caseMap.get(Integer.valueOf(i))) == null) {
            return;
        }
        C66147Pxf c66147Pxf = map.get(caseId);
        if (c66147Pxf == null) {
            c66147Pxf = new C66147Pxf(caseId);
        }
        synchronized (c66147Pxf) {
            c66147Pxf.LJ = description;
            c66147Pxf.LJI = System.currentTimeMillis();
            o.LJIIIIZZ(PQ0.LJFF, "LifecycleMonitor.get()");
            c66147Pxf.LIZJ = PQ0.LIZLLL();
        }
        CustomAnchorMonitorImpl customAnchorMonitorImpl = INSTANCE;
        customAnchorMonitorImpl.decreaseCount(i);
        if (customAnchorMonitorImpl.deviceCount(i) > 0) {
            return;
        }
        Handler handler = customDetectHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = customDetectHandler;
        if (handler2 == null) {
            return;
        }
        handler2.postDelayed(new ARunnableS15S0101000_11(i, c66147Pxf, 3), customAnchorMonitorImpl.getDetectDelay());
    }
}
