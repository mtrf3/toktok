package com.bytedance.common.jato;

import X.C36523EVb;
import X.EVM;
import X.InterfaceC36130EFy;
import android.app.Application;
import android.content.Context;
import com.bytedance.common.jato.boost.CpusetManager;
import java.util.concurrent.ExecutorService;

/* loaded from: classes7.dex */
public class Jato {
    public static void glPrioPromote(String str) {
    }

    public static void preloadBoostInfo() {
    }

    public static void preloadCpusetInfo() {
    }

    public static void shrinkWebviewNative() {
    }

    public static boolean isInited() {
        return JatoXL.isInited();
    }

    public static void bindBigCore() {
        CpusetManager.bindBigCore();
    }

    public static void bindLittleCore() {
        CpusetManager.bindLittleCore();
    }

    public static void disableClassVerify() {
        JatoXL.disableClassVerify();
    }

    public static void enableClassVerify() {
        JatoXL.enableClassVerify();
    }

    public static void optTextureBufferQueue() {
        JatoXL.optTextureBufferQueue();
    }

    public static void releaseBoost() {
        JatoXL.releaseBoost();
    }

    public static void resetCoreBind() {
        CpusetManager.resetCoreBind();
    }

    public static void resetPriority() {
        JatoXL.resetPriority();
    }

    public static void resetRenderThread() {
        JatoXL.resetPriority();
    }

    public static void shrinkVM() {
        JatoXL.shrinkVM();
    }

    public static void trimDexMap() {
        JatoXL.trimDexMap();
    }

    public static void bindBigCore(int i) {
        CpusetManager.bindBigCore(i);
    }

    public static void bindLittleCore(int i) {
        CpusetManager.bindLittleCore(i);
    }

    public static void boostGLESInit(boolean z) {
        JatoXL.boostGLESInit(z);
    }

    public static void initBoostFramework(Context context) {
        JatoXL.initBoostFramework(context);
    }

    public static void initScheduler(int i) {
        JatoXL.initScheduler(i);
    }

    public static void requestBlockGc(long j) {
        JatoXL.requestBlockGc(j);
    }

    public static void resetCoreBind(int i) {
        CpusetManager.resetCoreBind(i);
    }

    public static void resetPriority(int i) {
        JatoXL.resetPriority(i);
    }

    public static void setDisableGcBlocker(boolean z) {
        JatoXL.setDisableGcBlocker(z);
    }

    public static void setPriority(int i) {
        JatoXL.setPriority(i);
    }

    public static void startBlockGc(String str) {
        JatoXL.startBlockGc(str);
    }

    public static void stopBlockGc(String str) {
        JatoXL.stopBlockGc(str);
    }

    public static void tryCpuBoost(long j) {
        JatoXL.tryCpuBoost(j);
    }

    public static void tryGpuBoost(long j) {
        JatoXL.tryGpuBoost(j);
    }

    public static void boostRenderThread(Application application, int i) {
        JatoXL.boostRenderThread(application, i);
    }

    public static void setPriority(int i, int i2) {
        EVM.LIZ(i, i2);
    }

    public static void shrinkVM(int i, int i2) {
        JatoXL.shrinkVM(i, i2);
    }

    public static void boostRenderThread(Application application, int i, ExecutorService executorService) {
        JatoXL.boostRenderThread(application, i);
    }

    public static void setFastNative(String[] strArr, String[] strArr2, String[] strArr3) {
        JatoXL.setFastNative(strArr, strArr2, strArr3);
    }

    public static synchronized void init(Context context, boolean z, InterfaceC36130EFy interfaceC36130EFy, ExecutorService executorService) {
        synchronized (Jato.class) {
            init(context, z, interfaceC36130EFy, executorService, null);
        }
    }

    public static synchronized void init(Context context, boolean z, InterfaceC36130EFy interfaceC36130EFy, ExecutorService executorService, C36523EVb c36523EVb) {
        synchronized (Jato.class) {
        }
    }
}
