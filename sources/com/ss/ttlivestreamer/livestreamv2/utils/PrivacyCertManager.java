package com.ss.ttlivestreamer.livestreamv2.utils;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.C84134X0g;
import X.X1D;
import android.util.AndroidRuntimeException;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.entry.auth.CertAuthEntry;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes12.dex */
public class PrivacyCertManager {
    public static PrivacyCertManager instance;
    public ThreadLocal<CertUnit>[] certList = new ThreadLocal[2];
    public final Object certListFence = new Object();

    /* loaded from: classes12.dex */
    public static class CertUnit {
        public Cert cert;
        public int certType;
        public String methodName;

        private String getDataType(int i) {
            if (i == 0) {
                return "video";
            }
            if (i != 1) {
                return null;
            }
            return "audio";
        }

        public void check() {
            String dataType = getDataType(this.certType);
            CertAuthEntry.checkSDKCert(this.cert, new String[]{dataType}, "LiveCore", this.methodName);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("checkSDKCert(");
            LIZ.append(this.cert);
            LIZ.append(", \"");
            LIZ.append(dataType);
            LIZ.append("\", \"LiveCore\", \"");
            LIZ.append(this.methodName);
            LIZ.append("\")");
            AVLog.ioi("PrivacyCertManager", X1D.LIZIZ(LIZ));
        }

        public CertUnit(int i, Cert cert, String str) {
            this.certType = i;
            this.cert = cert;
            this.methodName = str;
        }
    }

    /* loaded from: classes12.dex */
    public static class RunnableWithCert implements Runnable {
        public HashMap<Integer, CertUnit> certMap = new HashMap<>();
        public Runnable runnable;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_utils_PrivacyCertManager$RunnableWithCert_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_utils_PrivacyCertManager$RunnableWithCert__run$___twin___() {
            for (Map.Entry<Integer, CertUnit> entry : this.certMap.entrySet()) {
                PrivacyCertManager.getInstance().saveCert(entry.getKey().intValue(), entry.getValue());
            }
            Runnable runnable = this.runnable;
            if (runnable != null) {
                runnable.run();
            }
            Iterator<Integer> it = this.certMap.keySet().iterator();
            while (it.hasNext()) {
                PrivacyCertManager.getInstance().popCert(it.next().intValue());
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_utils_PrivacyCertManager$RunnableWithCert_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(RunnableWithCert runnableWithCert) {
            boolean LIZ;
            try {
                runnableWithCert.com_ss_ttlivestreamer_livestreamv2_utils_PrivacyCertManager$RunnableWithCert__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public RunnableWithCert(Runnable runnable, int[] iArr) {
            this.runnable = runnable;
            for (int i : iArr) {
                if (i >= 0 && i < 2) {
                    this.certMap.put(Integer.valueOf(i), PrivacyCertManager.getInstance().popCert(i));
                }
            }
        }
    }

    public static int com_ss_ttlivestreamer_livestreamv2_utils_PrivacyCertManager_com_ss_android_ttvecamera_TECameraCapture_connect(TECameraCapture tECameraCapture, C84134X0g c84134X0g) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100801, "com/ss/android/ttvecamera/TECameraCapture", "connect", tECameraCapture, new Object[]{c84134X0g}, "int", new C65300Pk0(false, "(Lcom/ss/android/ttvecamera/TECameraSettings;)I", "-3935869626135424111"));
        return LIZJ.LIZ ? ((Integer) LIZJ.LIZIZ).intValue() : tECameraCapture.connect(c84134X0g);
    }

    public static int com_ss_ttlivestreamer_livestreamv2_utils_PrivacyCertManager_com_ss_android_ttvecamera_TECameraCapture_connect(TECameraCapture tECameraCapture, C84134X0g c84134X0g, Cert cert) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100801, "com/ss/android/ttvecamera/TECameraCapture", "connect", tECameraCapture, new Object[]{c84134X0g, cert}, "int", new C65300Pk0(false, "(Lcom/ss/android/ttvecamera/TECameraSettings;Lcom/bytedance/bpea/basics/Cert;)I", "-3935869626135424111"));
        return LIZJ.LIZ ? ((Integer) LIZJ.LIZIZ).intValue() : tECameraCapture.connect(c84134X0g, cert);
    }

    public static int com_ss_ttlivestreamer_livestreamv2_utils_PrivacyCertManager_com_ss_android_ttvecamera_TECameraCapture_disConnect(TECameraCapture tECameraCapture) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100803, "com/ss/android/ttvecamera/TECameraCapture", "disConnect", tECameraCapture, new Object[0], "int", new C65300Pk0(false, "()I", "-3935869626135424111"));
        return LIZJ.LIZ ? ((Integer) LIZJ.LIZIZ).intValue() : tECameraCapture.disConnect();
    }

    public static int com_ss_ttlivestreamer_livestreamv2_utils_PrivacyCertManager_com_ss_android_ttvecamera_TECameraCapture_disConnect(TECameraCapture tECameraCapture, Cert cert) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100803, "com/ss/android/ttvecamera/TECameraCapture", "disConnect", tECameraCapture, new Object[]{cert}, "int", new C65300Pk0(false, "(Lcom/bytedance/bpea/basics/Cert;)I", "-3935869626135424111"));
        return LIZJ.LIZ ? ((Integer) LIZJ.LIZIZ).intValue() : tECameraCapture.disConnect(cert);
    }

    public static synchronized PrivacyCertManager getInstance() {
        PrivacyCertManager privacyCertManager;
        synchronized (PrivacyCertManager.class) {
            if (instance == null) {
                instance = new PrivacyCertManager();
            }
            privacyCertManager = instance;
        }
        return privacyCertManager;
    }

    public static void cameraDisconnectWithCert(TECameraCapture tECameraCapture) {
        CertUnit popCert = getInstance().popCert(0);
        if (popCert != null) {
            try {
                com_ss_ttlivestreamer_livestreamv2_utils_PrivacyCertManager_com_ss_android_ttvecamera_TECameraCapture_disConnect(tECameraCapture, popCert.cert);
                AVLog.ioi("PrivacyCertManager", "TECameraCapture.disConnect with Cert");
                return;
            } catch (Exception e) {
                AVLog.logToIODevice(6, "PrivacyCertManager", "cameraDisconnectWithCert failed", e);
                AVLog.logKibana(6, "PrivacyCertManager", "cameraDisconnectWithCert failed", e);
            }
        }
        com_ss_ttlivestreamer_livestreamv2_utils_PrivacyCertManager_com_ss_android_ttvecamera_TECameraCapture_disConnect(tECameraCapture);
    }

    public CertUnit popCert(int i) {
        CertUnit certUnit = null;
        if (i < 0 || i >= 2) {
            return null;
        }
        synchronized (this.certListFence) {
            ThreadLocal<CertUnit> threadLocal = this.certList[i];
            if (threadLocal != null) {
                CertUnit certUnit2 = threadLocal.get();
                this.certList[i].set(null);
                certUnit = certUnit2;
            }
        }
        return certUnit;
    }

    public static int cameraConnectWithCert(TECameraCapture tECameraCapture, C84134X0g c84134X0g) {
        CertUnit popCert = getInstance().popCert(0);
        if (popCert != null) {
            try {
                AVLog.ioi("PrivacyCertManager", "TECameraCapture.connect with Cert");
                return com_ss_ttlivestreamer_livestreamv2_utils_PrivacyCertManager_com_ss_android_ttvecamera_TECameraCapture_connect(tECameraCapture, c84134X0g, popCert.cert);
            } catch (Exception e) {
                AVLog.logToIODevice(6, "PrivacyCertManager", "cameraConnectWithCert failed", e);
                AVLog.logKibana(6, "PrivacyCertManager", "cameraConnectWithCert failed", e);
                return -1128616532;
            }
        }
        return com_ss_ttlivestreamer_livestreamv2_utils_PrivacyCertManager_com_ss_android_ttvecamera_TECameraCapture_connect(tECameraCapture, c84134X0g);
    }

    public static void switchCameraWithCert(TECameraCapture tECameraCapture, int i) {
        CertUnit popCert = getInstance().popCert(0);
        if (popCert != null) {
            try {
                tECameraCapture.switchCamera(i, popCert.cert);
                AVLog.ioi("PrivacyCertManager", "TECameraCapture.switchCamera with Cert");
                return;
            } catch (Exception e) {
                AVLog.logToIODevice(6, "PrivacyCertManager", "switchCameraWithCert failed", e);
                AVLog.logKibana(6, "PrivacyCertManager", "switchCameraWithCert failed", e);
                return;
            }
        }
        tECameraCapture.switchCamera(i);
    }

    public void saveCert(int i, CertUnit certUnit) {
        if (i < 0 || i >= 2) {
            return;
        }
        synchronized (this.certListFence) {
            ThreadLocal<CertUnit> threadLocal = this.certList[i];
            if (threadLocal != null && threadLocal.get() != null) {
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("save cert while it's not emptied before.");
                TTLSSladarBugReportUtils.getInstance().report(androidRuntimeException, "PrivacyCertManager.saveCert");
                if (!TTLSBuildConfig.canThrowException()) {
                    AVLog.ioe("PrivacyCertManager", "save cert while it's not emptied before.");
                    AVLog.logKibana(6, "PrivacyCertManager", "save cert while it's not emptied before.", new Throwable());
                } else {
                    throw androidRuntimeException;
                }
            }
            ThreadLocal<CertUnit>[] threadLocalArr = this.certList;
            if (threadLocalArr[i] == null) {
                threadLocalArr[i] = new ThreadLocal<>();
            }
            this.certList[i].set(certUnit);
        }
    }

    public void saveCert(int i, Cert cert, String str) {
        saveCert(i, new CertUnit(i, cert, str));
    }
}
