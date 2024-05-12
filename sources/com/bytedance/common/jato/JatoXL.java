package com.bytedance.common.jato;

import X.C48693J9d;
import X.EG1;
import X.EVK;
import X.EVL;
import X.EVM;
import X.EVN;
import X.EVP;
import X.EVQ;
import X.EVT;
import X.EVU;
import X.EVV;
import X.EVY;
import X.EVZ;
import X.InterfaceC36130EFy;
import Y.ARunnableS10S0101000_6;
import Y.ARunnableS12S1000000_6;
import Y.ARunnableS13S0000000_6;
import Y.ARunnableS14S0100100_6;
import Y.ARunnableS17S0300000_6;
import Y.ARunnableS1S0001000_6;
import Y.ARunnableS1S0010000_6;
import Y.ARunnableS42S0100000_6;
import Y.ARunnableS8S0000100_6;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.view.TextureView;
import com.bytedance.common.jato.boost.CpusetManager;
import com.bytedance.common.jato.jit.JitBlock;
import com.bytedance.common.jato.logcut.LogCut;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public class JatoXL {
    public static volatile boolean isInited;
    public static EVN sAdrenalin;
    public static JatoXLConfig sConfig;
    public static volatile boolean sDisableGcBlocker;

    public static void disableClassVerify() {
        disableClassVerify(null);
    }

    public static void shrinkWebviewNative() {
    }

    public static synchronized JatoXLConfig getConfig() {
        JatoXLConfig jatoXLConfig;
        synchronized (JatoXL.class) {
            jatoXLConfig = sConfig;
        }
        return jatoXLConfig;
    }

    public static void initInternal() {
        JatoXLConfig jatoXLConfig = sConfig;
        if (jatoXLConfig.isEnabledCpuSetFeature) {
            jatoXLConfig.mExecuteService.execute(new ARunnableS13S0000000_6(9));
        }
        JatoXLConfig jatoXLConfig2 = sConfig;
        if (jatoXLConfig2.mUseJitBlock) {
            InterfaceC36130EFy interfaceC36130EFy = jatoXLConfig2.mMonitor;
            if (interfaceC36130EFy != null) {
                JitBlock.LIZJ = interfaceC36130EFy;
            }
            JitBlock.LIZIZ(jatoXLConfig2.mIsAddref);
            long j = sConfig.mBlockInterval;
            if (j > 0) {
                JitBlock.LJ(j);
            }
            int i = sConfig.mPriority;
            if (i != -1) {
                JitBlock.LJFF(i);
            }
        }
        JatoXLConfig jatoXLConfig3 = sConfig;
        if (jatoXLConfig3.mUseLogCut) {
            InterfaceC36130EFy interfaceC36130EFy2 = jatoXLConfig3.mMonitor;
            if (interfaceC36130EFy2 != null) {
                LogCut.setMonitor(interfaceC36130EFy2);
            }
            LogCut.initLogCut(sConfig.mLogCutType);
        }
    }

    public static synchronized boolean isInited() {
        boolean z;
        synchronized (JatoXL.class) {
            if (isInited) {
                if (sConfig != null) {
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    public static void resetPriority() {
        try {
            Map<Integer, Integer> map = EVM.LIZLLL;
            if (((ConcurrentHashMap) map).get(-1) != null) {
                Process.setThreadPriority(0, ((Integer) ((ConcurrentHashMap) map).get(-1)).intValue());
            }
        } catch (Throwable unused) {
        }
    }

    public static void shrinkVM() {
        shrinkVM(512, 2048);
    }

    public static void disableJitCodeCacheGc() {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS13S0000000_6(10));
        }
    }

    public static void enableClassVerify() {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS13S0000000_6(5));
        }
    }

    public static void enableJitCodeCacheGc() {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS13S0000000_6(8));
        }
    }

    public static void lightJitBlockStart() {
        if (isInited()) {
            JitBlock.LIZJ();
        }
    }

    public static void lightJitBlockStop() {
        if (isInited()) {
            JitBlock.LIZLLL();
        }
    }

    public static void logCutStart() {
        if (isInited()) {
            LogCut.logCutStart();
        }
    }

    public static void logCutStop() {
        if (isInited()) {
            LogCut.logCutStop();
        }
    }

    public static void optTextureBufferQueue() {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS13S0000000_6(7));
        }
    }

    public static void releaseBoost() {
        EVK LIZJ;
        if (isInited() && sConfig.mExecuteService != null && (LIZJ = EVK.LIZJ()) != null) {
            synchronized (LIZJ) {
                EVL evl = LIZJ.LIZIZ;
                if (evl != null) {
                    evl.release();
                }
            }
        }
    }

    public static void resetRenderThread() {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS13S0000000_6(12));
        }
    }

    public static void trimDexMap() {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS13S0000000_6(6));
        }
    }

    public static void weakRefUnblock() {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS13S0000000_6(11));
        }
    }

    public static void bindBigCore() {
        CpusetManager.bindBigCore();
    }

    public static void bindLittleCore() {
        CpusetManager.bindLittleCore();
    }

    public static EVN getAdrenalin() {
        return sAdrenalin;
    }

    public static void resetCoreBind() {
        CpusetManager.resetCoreBind();
    }

    public static void bindBigCore(int i) {
        CpusetManager.bindBigCore(i);
    }

    public static void bindLittleCore(int i) {
        CpusetManager.bindLittleCore(i);
    }

    public static void boostGLESInit(boolean z) {
        if (!isInited() || sConfig.mExecuteService == null || Build.VERSION.SDK_INT < 29) {
            return;
        }
        sConfig.mExecuteService.execute(new ARunnableS1S0010000_6(z, 0));
    }

    public static void disableClassVerify(EVY evy) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS42S0100000_6(evy, 13));
        }
    }

    public static synchronized boolean init(JatoXLConfig jatoXLConfig) {
        synchronized (JatoXL.class) {
            if (isInited) {
                return true;
            }
            if (jatoXLConfig == null) {
                return false;
            }
            if (!C48693J9d.LJFF()) {
                return false;
            }
            sConfig = jatoXLConfig;
            isInited = true;
            initInternal();
            return true;
        }
    }

    public static void initAdrenalin(Application application) {
        ExecutorService executorService;
        if (sAdrenalin == null && isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS42S0100000_6(application, 14));
        }
    }

    public static void initBoostFramework(Context context) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS42S0100000_6(context, 15));
        }
    }

    public static void initScheduler(int i) {
        JatoXLConfig jatoXLConfig;
        ExecutorService executorService;
        if (isInited() && (executorService = (jatoXLConfig = sConfig).mExecuteService) != null && jatoXLConfig.mContext != null) {
            executorService.execute(new ARunnableS1S0001000_6(i, 3));
        }
    }

    public static void requestBlockGc(long j) {
        if (isInited() && sConfig.mExecuteService != null && !sDisableGcBlocker) {
            sConfig.mExecuteService.execute(new ARunnableS8S0000100_6(j, 2));
        }
    }

    public static void resetCoreBind(int i) {
        CpusetManager.resetCoreBind(i);
    }

    public static void resetPriority(int i) {
        try {
            Map<Integer, Integer> map = EVM.LIZLLL;
            if (((ConcurrentHashMap) map).get(Integer.valueOf(i)) != null) {
                Process.setThreadPriority(i, ((Integer) ((ConcurrentHashMap) map).get(Integer.valueOf(i))).intValue());
            }
        } catch (Throwable unused) {
        }
    }

    public static void setDisableGcBlocker(boolean z) {
        sDisableGcBlocker = z;
    }

    public static void setLockMaxSpinsAsync(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS1S0001000_6(i, 1));
        }
    }

    public static void setMaxGcBlockDuration(int i) {
        if (isInited()) {
            EG1.LIZ().LLLLJI(i);
        }
    }

    public static void setPriority(int i) {
        EVM.LIZ(-1, i);
    }

    public static void setThreadSuspendTimeoutInSeconds(int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS1S0001000_6(i, 2));
        }
    }

    public static void startBlockGc(String str) {
        if (isInited() && sConfig.mExecuteService != null && !sDisableGcBlocker) {
            sConfig.mExecuteService.execute(new ARunnableS12S1000000_6(str, 1));
        }
    }

    public static void stopBlockGc(String str) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS12S1000000_6(str, 2));
        }
    }

    public static void tryCpuBoost(long j) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S0000100_6(j, 3));
        }
    }

    public static void tryGpuBoost(long j) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS8S0000100_6(j, 4));
        }
    }

    public static void boostRenderThread(Application application, int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null && application != null) {
            executorService.execute(new ARunnableS10S0101000_6(i, application, 4));
        }
    }

    public static void createProfileForMethods(ArrayList<EVZ> arrayList, long j) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS14S0100100_6(j, arrayList, 0));
        }
    }

    public static void optXmlCache(Resources resources, int i) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS10S0101000_6(i, resources, 3));
        }
    }

    public static void optimizeSurfaceHandler(TextureView textureView, boolean z) {
        Field field;
        SurfaceTexture surfaceTexture;
        if (textureView == null || (field = EVQ.LIZIZ) == null) {
            return;
        }
        Class cls = EVQ.LIZ;
        if ((cls != null && cls.isInstance(textureView)) || (surfaceTexture = textureView.getSurfaceTexture()) == null) {
            return;
        }
        try {
            Handler handler = (Handler) field.get(surfaceTexture);
            if (handler != null && !(handler instanceof EVP)) {
                field.set(surfaceTexture, new EVP(handler, z));
            }
        } catch (Exception unused) {
        }
    }

    public static void setPriority(int i, int i2) {
        EVM.LIZ(i, i2);
    }

    public static void shrinkVM(int i, int i2) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new EVV(i, i2));
        }
    }

    public static void boostHwui(boolean z, boolean z2, boolean z3) {
        if (!isInited() || sConfig.mExecuteService == null || Build.VERSION.SDK_INT < 28) {
            return;
        }
        sConfig.mExecuteService.execute(new EVT(z, z2, z3));
    }

    public static void setFastNative(String[] strArr, String[] strArr2, String[] strArr3) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new ARunnableS17S0300000_6(strArr, strArr2, strArr3, 0));
        }
    }

    public static void setJitOptions(int i, int i2, int i3, int i4, int i5) {
        ExecutorService executorService;
        if (isInited() && (executorService = sConfig.mExecuteService) != null) {
            executorService.execute(new EVU(i, i2, i3, i4, i5));
        }
    }
}
