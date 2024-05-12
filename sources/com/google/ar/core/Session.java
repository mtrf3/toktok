package com.google.ar.core;

import X.C16880lQ;
import X.C93528aSK;
import X.EnumC93529aSL;
import X.EnumC93531aSN;
import X.V0N;
import android.content.Context;
import android.os.Build;
import com.google.ar.core.Config;
import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes34.dex */
public class Session {
    public final C93528aSK faceCache;
    public final long nativeSymbolTableHandle;
    public long nativeWrapperHandle;
    public SharedCamera sharedCamera;

    private native long[] nativeAcquireAllAnchors(long j);

    private native int nativeCheckModuleAvailability(long j, int i);

    private native void nativeCloseSession(long j);

    private native void nativeConfigure(long j, long j2);

    private native long nativeCreateAnchor(long j, Pose pose);

    public static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr);

    public static native long nativeCreateSessionWrapperFromHandle(long j, long j2);

    private native int nativeEstimateFeatureMapQualityForHosting(long j, Pose pose);

    private native long nativeGetCameraConfig(long j);

    private native void nativeGetConfig(long j, long j2);

    private native int nativeGetPlaybackStatus(long j);

    private native void nativeGetRandomAccessStats(long j, long j2);

    private native int nativeGetRecordingStatus(long j);

    private native long[] nativeGetSupportedCameraConfigs(long j);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j, long j2);

    private native long nativeGetSymbolTable(long j);

    private native long nativeHostCloudAnchor(long j, long j2);

    private native long nativeHostCloudAnchorWithTtl(long j, long j2, int i);

    private native boolean nativeIsSupported(long j, long j2);

    private native void nativePause(long j);

    private native void nativeRecordExternalDataTrackSample(long j, byte[] bArr, byte[] bArr2);

    private native void nativeRequestModuleInstallDeferred(long j, int[] iArr);

    private native void nativeRequestModuleInstallImmediate(long j, int[] iArr);

    private native long nativeResolveCloudAnchor(long j, String str);

    private native void nativeResume(long j);

    private native int nativeSetCameraConfig(long j, long j2);

    private native void nativeSetCameraTextureName(long j, int i);

    private native void nativeSetCameraTextureNames(long j, int[] iArr);

    private native void nativeSetDisplayGeometry(long j, int i, int i2, int i3);

    private native void nativeSetPlaybackDataset(long j, String str);

    private native void nativeStartRecording(long j, long j2);

    private native void nativeStopRecording(long j);

    private native void nativeUpdate(long j, long j2);

    public boolean isSharedCameraUsed() {
        return this.sharedCamera != null;
    }

    public native long[] nativeAcquireAllTrackables(long j, int i);

    public native void nativeDestroySessionWrapper(long j);

    public native long nativeGetSessionNativeHandle(long j);

    public native boolean nativeIsDepthModeSupported(long j, int i);

    public native boolean nativeIsDepthModeSupportedPrivate(long j, int i);

    public native long nativeReleaseSessionOwnership(long j);

    public static void loadDynamicSymbolsAfterSessionCreate() {
        if (Build.VERSION.SDK_INT >= 24) {
            ArImage.nativeLoadSymbols();
            ImageMetadata.nativeLoadSymbols();
        }
    }

    private void pauseSharedCameraIfInUse() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            sharedCamera.pause();
        }
    }

    public void close() {
        nativeCloseSession(this.nativeWrapperHandle);
    }

    public void finalize() {
        long j = this.nativeWrapperHandle;
        if (j != 0) {
            nativeDestroySessionWrapper(j);
            this.nativeWrapperHandle = 0L;
        }
        super.finalize();
    }

    public Collection<Anchor> getAllAnchors() {
        return convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.nativeWrapperHandle));
    }

    public CameraConfig getCameraConfig() {
        return new CameraConfig(this, nativeGetCameraConfig(this.nativeWrapperHandle));
    }

    public Config getConfig() {
        Config config = new Config(this);
        getConfig(config);
        return config;
    }

    public PlaybackStatus getPlaybackStatus() {
        return PlaybackStatus.forNumber(nativeGetPlaybackStatus(this.nativeWrapperHandle));
    }

    public RecordingStatus getRecordingStatus() {
        return RecordingStatus.forNumber(nativeGetRecordingStatus(this.nativeWrapperHandle));
    }

    public SharedCamera getSharedCamera() {
        SharedCamera sharedCamera = this.sharedCamera;
        if (sharedCamera != null) {
            return sharedCamera;
        }
        throw new IllegalStateException("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
    }

    public List<CameraConfig> getSupportedCameraConfigs() {
        return convertNativeCameraConfigsToCollection(nativeGetSupportedCameraConfigs(this.nativeWrapperHandle));
    }

    public void resume() {
        nativeResume(this.nativeWrapperHandle);
    }

    public void stopRecording() {
        nativeStopRecording(this.nativeWrapperHandle);
    }

    public Frame update() {
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.nativeHandle);
        return frame;
    }

    public Session() {
        this.faceCache = new C93528aSK();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    public void pause() {
        pauseSharedCameraIfInUse();
        nativePause(this.nativeWrapperHandle);
    }

    /* loaded from: classes34.dex */
    public enum Feature {
        FRONT_CAMERA(1),
        SHARED_CAMERA(1000),
        DO_NOT_USE_ACTIVE_DEPTH_SENSOR(5),
        MOTION_TRACKING_ODOMETRY(6),
        HIT_TEST_WITH_DEPTH(7);

        public final int nativeCode;

        public static Feature valueOf(String str) {
            return (Feature) V0N.LJJJ(Feature.class, str);
        }

        Feature(int i) {
            this.nativeCode = i;
        }
    }

    /* loaded from: classes34.dex */
    public enum FeatureMapQuality {
        INSUFFICIENT(0),
        SUFFICIENT(1),
        GOOD(2);

        public final int nativeCode;

        public static FeatureMapQuality forNumber(int i) {
            for (FeatureMapQuality featureMapQuality : values()) {
                if (featureMapQuality.nativeCode == i) {
                    return featureMapQuality;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native FeatureMapQuality, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        public static FeatureMapQuality valueOf(String str) {
            return (FeatureMapQuality) V0N.LJJJ(FeatureMapQuality.class, str);
        }

        FeatureMapQuality(int i) {
            this.nativeCode = i;
        }
    }

    public Session(long j) {
        this.faceCache = new C93528aSK();
        this.sharedCamera = null;
        this.nativeWrapperHandle = j;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(j);
    }

    public static Session createForSharedCamera(Context context) {
        return new Session(context, EnumSet.of(Feature.SHARED_CAMERA));
    }

    public static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        }
        return byteBuffer.order(ByteOrder.nativeOrder());
    }

    public static void throwExceptionFromArStatus(int i) {
        throwExceptionFromArStatus(null, i, null, null);
    }

    public ModuleAvailability checkModuleAvailability(Module module) {
        return ModuleAvailability.forNumber(nativeCheckModuleAvailability(this.nativeWrapperHandle, module.nativeCode));
    }

    public void configure(Config config) {
        nativeConfigure(this.nativeWrapperHandle, config.nativeHandle);
    }

    public Collection<Anchor> convertNativeAnchorsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new Anchor(j, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List<CameraConfig> convertNativeCameraConfigsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(new CameraConfig(this, j));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.nativeWrapperHandle, pose), this);
    }

    public Trackable createTrackable(long j) {
        int internalGetType = TrackableBase.internalGetType(this.nativeWrapperHandle, j);
        for (EnumC93531aSN enumC93531aSN : EnumC93531aSN.values()) {
            if (enumC93531aSN.LJLIL == internalGetType) {
                switch (enumC93531aSN.ordinal()) {
                    case 0:
                    case 1:
                        return null;
                    case 2:
                        return new Plane(j, this);
                    case 3:
                        return new Point(j, this);
                    case 4:
                        return new AugmentedImage(j, this);
                    case 5:
                        C93528aSK c93528aSK = this.faceCache;
                        synchronized (c93528aSK) {
                            try {
                                Map<Long, AugmentedFace> map = c93528aSK.LIZ;
                                try {
                                    Long valueOf = Long.valueOf(j);
                                    try {
                                        try {
                                            try {
                                                AugmentedFace augmentedFace = (AugmentedFace) ((LinkedHashMap) map).get(valueOf);
                                                if (augmentedFace == null) {
                                                    try {
                                                        try {
                                                            AugmentedFace augmentedFace2 = new AugmentedFace(j, this);
                                                            try {
                                                                try {
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                }
                                                                try {
                                                                    ((HashMap) c93528aSK.LIZ).put(valueOf, augmentedFace2);
                                                                    return augmentedFace2;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th3) {
                                                                th = th3;
                                                            }
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                        }
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                    }
                                                } else {
                                                    return augmentedFace;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                            }
                        }
                    case 6:
                        return new DepthPoint(j, this);
                    case 7:
                        return new InstantPlacementPoint(j, this);
                    default:
                        throw null;
                }
            }
        }
        TrackableBase.internalReleaseNativeHandle(this.nativeSymbolTableHandle, j);
        return null;
    }

    public FeatureMapQuality estimateFeatureMapQualityForHosting(Pose pose) {
        return FeatureMapQuality.forNumber(nativeEstimateFeatureMapQualityForHosting(this.nativeWrapperHandle, pose));
    }

    public <T extends Trackable> Collection<T> getAllTrackables(Class<T> cls) {
        EnumC93531aSN enumC93531aSN;
        EnumC93531aSN[] values = EnumC93531aSN.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC93531aSN = values[i];
                Class<?> cls2 = enumC93531aSN.LJLILLLLZI;
                if (cls2 != null && cls2.equals(cls)) {
                    break;
                }
                i++;
            } else {
                enumC93531aSN = EnumC93531aSN.UNKNOWN_TO_JAVA;
                break;
            }
        }
        if (enumC93531aSN == EnumC93531aSN.UNKNOWN_TO_JAVA) {
            return Collections.emptyList();
        }
        return convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.nativeWrapperHandle, enumC93531aSN.LJLIL));
    }

    public void getConfig(Config config) {
        nativeGetConfig(this.nativeWrapperHandle, config.nativeHandle);
    }

    public List<CameraConfig> getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        if (cameraConfigFilter != null) {
            long[] nativeGetSupportedCameraConfigsWithFilter = nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.nativeHandle);
            ArrayList arrayList = new ArrayList(nativeGetSupportedCameraConfigsWithFilter.length);
            for (long j : nativeGetSupportedCameraConfigsWithFilter) {
                arrayList.add(new CameraConfig(this, j));
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public Anchor hostCloudAnchor(Anchor anchor) {
        return new Anchor(nativeHostCloudAnchor(this.nativeWrapperHandle, anchor.nativeHandle), this);
    }

    public boolean isDepthModeSupported(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupported(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isDepthModeSupportedPrivate(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupportedPrivate(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isSupported(Config config) {
        return nativeIsSupported(this.nativeWrapperHandle, config.nativeHandle);
    }

    public void requestModuleInstallDeferred(List<Module> list) {
        int[] iArr = new int[list.size()];
        Iterator<Module> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().nativeCode;
            i++;
        }
        nativeRequestModuleInstallDeferred(this.nativeWrapperHandle, iArr);
    }

    public void requestModuleInstallImmediate(List<Module> list) {
        int[] iArr = new int[list.size()];
        Iterator<Module> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().nativeCode;
            i++;
        }
        nativeRequestModuleInstallImmediate(this.nativeWrapperHandle, iArr);
    }

    public Anchor resolveCloudAnchor(String str) {
        return new Anchor(nativeResolveCloudAnchor(this.nativeWrapperHandle, str), this);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.nativeHandle);
    }

    public void setCameraTextureName(int i) {
        nativeSetCameraTextureName(this.nativeWrapperHandle, i);
    }

    public void setCameraTextureNames(int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            nativeSetCameraTextureNames(this.nativeWrapperHandle, iArr);
            return;
        }
        throw new IllegalArgumentException("textureIds must be an array with at least 1 entry.");
    }

    public void setPlaybackDataset(String str) {
        nativeSetPlaybackDataset(this.nativeWrapperHandle, str);
    }

    public void startRecording(RecordingConfig recordingConfig) {
        if (recordingConfig != null) {
            nativeStartRecording(this.nativeWrapperHandle, recordingConfig.nativeHandle);
            return;
        }
        throw new IllegalArgumentException();
    }

    public Session(Context context) {
        this(context, EnumSet.noneOf(Feature.class));
    }

    public Session(Context context, Set<Feature> set) {
        this.faceCache = new C93528aSK();
        this.sharedCamera = null;
        C16880lQ.LLJJJIL("arcore_sdk_jni");
        int[] iArr = new int[set.size() + 1];
        Iterator<Feature> it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().nativeCode;
            i++;
        }
        iArr[i] = 0;
        long nativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(Feature.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }

    public <T extends Trackable> Collection<T> convertNativeTrackablesToCollection(Class<T> cls, long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            Trackable createTrackable = createTrackable(j);
            if (createTrackable != null) {
                arrayList.add(cls.cast(createTrackable));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Anchor hostCloudAnchorWithTtl(Anchor anchor, int i) {
        return new Anchor(nativeHostCloudAnchorWithTtl(this.nativeWrapperHandle, anchor.nativeHandle, i), this);
    }

    public void recordExternalDataTrackSample(UUID uuid, ByteBuffer byteBuffer) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            nativeRecordExternalDataTrackSample(this.nativeWrapperHandle, wrap.array(), byteBuffer.array());
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        nativeRecordExternalDataTrackSample(this.nativeWrapperHandle, wrap.array(), bArr);
    }

    public void setDisplayGeometry(int i, int i2, int i3) {
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i, i2, i3);
    }

    public static void throwExceptionFromArStatus(String str, int i, String[] strArr, int[] iArr) {
        int i2;
        for (EnumC93529aSL enumC93529aSL : EnumC93529aSL.values()) {
            if (enumC93529aSL.LJLIL == i) {
                Class<? extends Exception> cls = enumC93529aSL.LJLILLLLZI;
                if (cls == null) {
                    return;
                }
                if (strArr == null || iArr == null || (i2 = strArr.length) != iArr.length) {
                    i2 = 0;
                }
                String str2 = enumC93529aSL.LJLJI;
                if (str2 == null) {
                    if (str == null) {
                        throw cls.getConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                } else if (str == null) {
                    str = str2;
                } else if (str.length() != 0) {
                    str = str2.concat(str);
                } else {
                    str = new String(str2);
                }
                Exception newInstance = enumC93529aSL.LJLILLLLZI.getConstructor(String.class).newInstance(str);
                StackTraceElement[] stackTrace = newInstance.getStackTrace();
                StackTraceElement[] stackTraceElementArr = new StackTraceElement[stackTrace.length + i2];
                int i3 = 0;
                while (i3 < i2) {
                    stackTraceElementArr[i3] = new StackTraceElement("ARCore", "native", strArr[i3], iArr[i3]);
                    i3++;
                }
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stackTraceElementArr[i3] = stackTraceElement;
                    i3++;
                }
                newInstance.setStackTrace(stackTraceElementArr);
                throw newInstance;
            }
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Unexpected error code: ");
        sb.append(i);
        throw new FatalException(sb.toString());
    }
}
