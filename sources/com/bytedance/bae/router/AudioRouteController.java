package com.bytedance.bae.router;

import X.X1D;
import com.bytedance.realx.base.RXLogging;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes12.dex */
public class AudioRouteController implements IAudioRouteCallback {
    public static int EVENT_ONLY_LOG = 0;
    public static int EVENT_SCO_FAILED_FORCE_TO_MEDIA_MODE = 1;
    public int currentRouting = -1;
    public boolean isMediaMode = true;
    public ReadWriteLock lock;
    public AudioRouteDeviceManager mAudioRouteDeviceManager;
    public long nativeAudioRouteControllerPtr;
    public Lock rLock;
    public Lock wLock;

    private native void onDeviceEvent(long j, int i, boolean z);

    private native void onError(long j, int i);

    private String getCaptureDeviceName() {
        String captureDeviceName;
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                captureDeviceName = "nativePtr is 0";
            } else {
                captureDeviceName = this.mAudioRouteDeviceManager.getCaptureDeviceName();
            }
            return captureDeviceName;
        } finally {
            this.rLock.unlock();
        }
    }

    private String getRenderDeviceName() {
        String renderDeviceName;
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                renderDeviceName = "nativePtr is 0";
            } else {
                renderDeviceName = this.mAudioRouteDeviceManager.getRenderDeviceName();
            }
            return renderDeviceName;
        } finally {
            this.rLock.unlock();
        }
    }

    private String getSessionInfo() {
        String sessionInfo;
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                sessionInfo = "nativePtr is 0";
            } else {
                sessionInfo = this.mAudioRouteDeviceManager.getSessionInfo();
            }
            return sessionInfo;
        } finally {
            this.rLock.unlock();
        }
    }

    private int init() {
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr != 0 && initAudioRouteDeviceManager() == 0) {
                return this.mAudioRouteDeviceManager.getDeviceState();
            }
            return -1;
        } finally {
            this.rLock.unlock();
        }
    }

    private int initAudioRouteDeviceManager() {
        int init = this.mAudioRouteDeviceManager.init();
        if (init != 0) {
            release();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("init failed. code: ");
            LIZ.append(init);
            RXLogging.e("AudioRouteController", X1D.LIZIZ(LIZ));
        }
        return init;
    }

    private int release() {
        int i;
        this.wLock.lock();
        RXLogging.i("AudioRouteController", "AudioRouteController: release begin");
        try {
            this.nativeAudioRouteControllerPtr = 0L;
            AudioRouteDeviceManager audioRouteDeviceManager = this.mAudioRouteDeviceManager;
            if (audioRouteDeviceManager != null) {
                i = audioRouteDeviceManager.release();
                this.mAudioRouteDeviceManager = null;
            } else {
                i = 0;
            }
            this.currentRouting = -1;
            this.isMediaMode = true;
            return i;
        } finally {
            RXLogging.i("AudioRouteController", "AudioRouteController: release end");
            this.wLock.unlock();
        }
    }

    private void restartBluetoothSco() {
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                return;
            }
            AudioRouteDeviceManager audioRouteDeviceManager = this.mAudioRouteDeviceManager;
            if (audioRouteDeviceManager != null) {
                audioRouteDeviceManager.restartBluetoothSco();
            }
        } finally {
            this.rLock.unlock();
        }
    }

    public AudioRouteController(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.lock = reentrantReadWriteLock;
        this.rLock = reentrantReadWriteLock.readLock();
        this.wLock = this.lock.writeLock();
        this.nativeAudioRouteControllerPtr = j;
        this.mAudioRouteDeviceManager = new AudioRouteDeviceManager(this);
    }

    private int setSkipBluetoothConnectPermissionAbility(boolean z) {
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr != 0) {
                AudioRouteDeviceManager audioRouteDeviceManager = this.mAudioRouteDeviceManager;
                if (audioRouteDeviceManager != null) {
                    audioRouteDeviceManager.release();
                    this.mAudioRouteDeviceManager.setSkipBluetoothConnectPermissionAbility(z, this);
                    if (initAudioRouteDeviceManager() == 0) {
                        return this.mAudioRouteDeviceManager.getDeviceState();
                    }
                } else {
                    this.rLock.unlock();
                    return 0;
                }
            }
            return -1;
        } finally {
            this.rLock.unlock();
        }
    }

    private int setAudioRoute(int i, boolean z) {
        int i2;
        this.rLock.lock();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioRouteController: setAudioRoute, begin, routing: ");
        LIZ.append(i);
        LIZ.append(", isMediaMode: ");
        LIZ.append(z);
        RXLogging.i("AudioRouteController", X1D.LIZIZ(LIZ));
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("AudioRouteController: setAudioRoute, end, routing: ");
                LIZ2.append(i);
                LIZ2.append(", isMediaMode: ");
                LIZ2.append(z);
                RXLogging.i("AudioRouteController", X1D.LIZIZ(LIZ2));
                this.rLock.unlock();
                return -5;
            }
            this.isMediaMode = z;
            int audioRoute = this.mAudioRouteDeviceManager.setAudioRoute(i, z);
            if (audioRoute == 0) {
                i2 = i;
            } else {
                i2 = this.currentRouting;
            }
            this.currentRouting = i2;
            return audioRoute;
        } finally {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("AudioRouteController: setAudioRoute, end, routing: ");
            LIZ3.append(i);
            LIZ3.append(", isMediaMode: ");
            LIZ3.append(z);
            RXLogging.i("AudioRouteController", X1D.LIZIZ(LIZ3));
            this.rLock.unlock();
        }
    }

    @Override // com.bytedance.bae.router.IAudioRouteCallback
    public void onDeviceEvent(int i, boolean z) {
        this.rLock.lock();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDeviceEvent, begin, deviceType: ");
        LIZ.append(i);
        LIZ.append(", connected: ");
        LIZ.append(z);
        RXLogging.i("AudioRouteController", X1D.LIZIZ(LIZ));
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("AudioRouteController: onDeviceEvent(Java) deviceType:");
            LIZ2.append(i);
            LIZ2.append(", connected:");
            LIZ2.append(z);
            RXLogging.e("AudioRouteController", X1D.LIZIZ(LIZ2));
            onDeviceEvent(this.nativeAudioRouteControllerPtr, i, z);
        } finally {
            RXLogging.i("AudioRouteController", "AudioRouteController: onDeviceEvent, end");
            this.rLock.unlock();
        }
    }

    @Override // com.bytedance.bae.router.IAudioRouteCallback
    public void onError(int i, String str) {
        this.rLock.lock();
        try {
            if (this.nativeAudioRouteControllerPtr == 0) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioRouteController: ERROR-");
            LIZ.append(i);
            LIZ.append(":");
            LIZ.append(str);
            RXLogging.e("AudioRouteController", X1D.LIZIZ(LIZ));
            if (i == EVENT_SCO_FAILED_FORCE_TO_MEDIA_MODE) {
                onError(this.nativeAudioRouteControllerPtr, i);
            }
        } finally {
            this.rLock.unlock();
        }
    }
}
