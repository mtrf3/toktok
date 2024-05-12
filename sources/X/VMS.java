package X;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes15.dex */
public enum VMS {
    monitor("monitor", true),
    webMonitor("webMonitor", true),
    webBlank("webBlank", true),
    webFetch("webFetch", true),
    webJSB("webJSB", true),
    webInject("webInject", true),
    lynxMonitor("lynxMonitor", true),
    lynxPerf("lynxPerf", true),
    lynxBlank("lynxBlank", true),
    lynxFetch("lynxFetch", true),
    lynxJsb("lynxJsb", true),
    webAutoReport("webAutoReport", true),
    webUpdatePageData("webUpdatePageData", true),
    webTTWebDelegate("webTTWebDelegate", true),
    teaReport("teaReport", true),
    webResourceLoader("webResourceLoader", true),
    lynxResourceLoader("lynxResourceLoader", true),
    checkSelf("checkSelf", true),
    eventStream("eventStream", true),
    blankBitmap("blankBitmap", true),
    webDomainWhiteList("webDomainWhiteList", false),
    logType("logType", false),
    vidReport("vidReport", false);

    public EnumC53699L5r LJLIL = EnumC53699L5r.DEFAULT;
    public boolean enabled;

    public boolean isEnabled() {
        boolean z = this.enabled;
        EnumC53699L5r enumC53699L5r = this.LJLIL;
        if (enumC53699L5r != EnumC53699L5r.DEFAULT) {
            if (enumC53699L5r == EnumC53699L5r.ON) {
                return true;
            }
            return false;
        }
        return z;
    }

    public boolean not() {
        return !isEnabled();
    }

    public static void resetAll(long j) {
        for (int i = 0; i <= C53741L7h.LIZIZ; i++) {
            try {
                boolean z = true;
                if (i != 0) {
                    j >>= 1;
                }
                VMS vms = (VMS) ((ConcurrentHashMap) C53741L7h.LIZ).get(Integer.valueOf(i));
                if (vms != null) {
                    if (j % 2 == 0) {
                        z = false;
                    }
                    vms.enabled = z;
                }
            } catch (Throwable th) {
                C77117UOj.LJIILLIIL("startup_handle", th);
                return;
            }
        }
    }

    public static VMS valueOf(String str) {
        return (VMS) V0N.LJJJ(VMS.class, str);
    }

    public void setEnableManually(EnumC53699L5r enumC53699L5r) {
        this.LJLIL = enumC53699L5r;
    }

    VMS(String str, boolean z) {
        this.enabled = z;
        ((ConcurrentHashMap) C53741L7h.LIZ).put(Integer.valueOf(r4), this);
        if (r4 > C53741L7h.LIZIZ) {
            C53741L7h.LIZIZ = r4;
        }
    }
}
