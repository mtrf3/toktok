package com.ss.ttlivestreamer.core.engine;

import X.C16880lQ;
import X.C25620zW;
import X.X1D;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttlivestreamer.core.effect.VideoEffectUtilsWrapper;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.EarlyAVLog;
import com.ss.ttlivestreamer.core.utils.JniCommon;
import com.ss.ttlivestreamer.core.utils.LibraryLoader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class MediaEngineFactory {
    public static List<String> librarylist;
    public long mNativeObj;

    public static native int nativeCheckLicense(String str);

    private native long nativeCreateAudioTrack(long j, AudioSource audioSource, String str);

    private native long nativeCreateMediaEncodeStream(long j, VideoEncoderFactory videoEncoderFactory, AudioEncoderFactory audioEncoderFactory, Transport transport);

    private native long nativeCreateVideoTrack(long j, VideoSource videoSource, String str);

    public static native long nativeGetMediaEngineFactory();

    public static native String nativeGetVersion();

    private native void nativeSetStatisticsType(int i);

    public static native void nativeSetupClassLoader();

    public synchronized void release() {
        long j = this.mNativeObj;
        if (j != 0) {
            JniCommon.nativeReleaseRef(j);
            this.mNativeObj = 0L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Boolean bool;
        List asList = Arrays.asList("c++_shared", "aaudio", "ttcrypto", "bytenn", "yuv", "fdk-aac", "bytevc0", "bytevc1enc", "iesapplogger", "ttboringssl", "lens", "ttffmpeg", "vcbasekit", "ttquic", "IESSaliency");
        ArrayList arrayList = new ArrayList();
        librarylist = arrayList;
        arrayList.addAll(asList);
        librarylist.add("audioeffect");
        librarylist.add("byteaudio");
        List<String> effectLibs = VideoEffectUtilsWrapper.getEffectLibs();
        if (effectLibs != null && !effectLibs.isEmpty()) {
            int size = effectLibs.size();
            for (int i = 0; i < size; i++) {
                if (!librarylist.contains(ListProtector.get(effectLibs, i))) {
                    librarylist.add(ListProtector.get(effectLibs, i));
                }
            }
        }
        librarylist.add("ttlivestreamercore");
        librarylist.add("avframework");
        for (String str : librarylist) {
            if (str.equals("byteaudio")) {
                try {
                    C16880lQ.LLJJJIL("byteaudio");
                } catch (Throwable unused) {
                }
            }
            if (str.equals("vcbasekit")) {
                try {
                    bool = (Boolean) Class.forName("com.ss.ttm.vcshared.VCBaseKitLoader").getDeclaredMethod("loadLibrary", new Class[0]).invoke(null, new Object[0]);
                } catch (Throwable th) {
                    EarlyAVLog.println(5, "MediaEngineFactory", "VCBaseKitLoader.loadLibrary() failed.", th);
                }
                if (bool != null && bool.booleanValue()) {
                }
            }
            if (!loadLibrary(str)) {
                try {
                    C16880lQ.LLJJJIL(str);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public static MediaEngineFactory create() {
        long nativeGetMediaEngineFactory = nativeGetMediaEngineFactory();
        if (nativeGetMediaEngineFactory != 0) {
            return new MediaEngineFactory(nativeGetMediaEngineFactory);
        }
        return null;
    }

    public static String getVersion() {
        return nativeGetVersion();
    }

    public static List<String> getLibrarylist() {
        return librarylist;
    }

    public static void loadLibrary() {
        nativeSetupClassLoader();
    }

    public void finalize() {
        super.finalize();
    }

    public MediaEngineFactory(long j) {
        this.mNativeObj = j;
    }

    public static int checkLicense(String str) {
        return nativeCheckLicense(str);
    }

    public static boolean loadLibrary(String str) {
        try {
            boolean loadLibrary = LibraryLoader.loadLibrary(str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Loading library lib");
            LIZ.append(str);
            LIZ.append(".so done (");
            LIZ.append(loadLibrary);
            LIZ.append(")");
            EarlyAVLog.println(5, "MediaEngineFactory", X1D.LIZIZ(LIZ), null);
            return loadLibrary;
        } catch (Throwable th) {
            StringBuilder LIZIZ = C25620zW.LIZIZ("Loading library lib", str, ".so error (");
            LIZIZ.append(th.getMessage());
            LIZIZ.append(")");
            EarlyAVLog.println(5, "MediaEngineFactory", X1D.LIZIZ(LIZIZ), th);
            return false;
        }
    }

    public static void setLogLevel(int i) {
        AVLog.setLevel(i);
    }

    public AudioTrack createAudioTrack(AudioSource audioSource) {
        return createAudioTrack(audioSource, null);
    }

    public VideoTrack createVideoTrack(VideoSource videoSource) {
        return createVideoTrack(videoSource, null);
    }

    public void setStatisticsType(int i) {
        nativeSetStatisticsType(i);
    }

    public AudioTrack createAudioTrack(AudioSource audioSource, String str) {
        long nativeCreateAudioTrack = nativeCreateAudioTrack(this.mNativeObj, audioSource, str);
        if (nativeCreateAudioTrack != 0) {
            return new AudioTrack(nativeCreateAudioTrack, audioSource);
        }
        return null;
    }

    public VideoTrack createVideoTrack(VideoSource videoSource, String str) {
        long nativeCreateVideoTrack = nativeCreateVideoTrack(this.mNativeObj, videoSource, str);
        if (nativeCreateVideoTrack != 0) {
            return new VideoTrack(nativeCreateVideoTrack, videoSource);
        }
        return null;
    }

    public MediaEncodeStream createMediaEncodeStream(VideoEncoderFactory videoEncoderFactory, AudioEncoderFactory audioEncoderFactory, Transport transport) {
        MediaEncodeStream mediaEncodeStream;
        long nativeCreateMediaEncodeStream = nativeCreateMediaEncodeStream(this.mNativeObj, videoEncoderFactory, audioEncoderFactory, transport);
        if (nativeCreateMediaEncodeStream != 0) {
            mediaEncodeStream = new MediaEncodeStream(nativeCreateMediaEncodeStream, transport);
        } else {
            mediaEncodeStream = null;
        }
        if (transport != null && mediaEncodeStream != null) {
            transport.setVysncModule(new VsyncModule(mediaEncodeStream.nativeGetVsyncModule(nativeCreateMediaEncodeStream)));
        }
        return mediaEncodeStream;
    }
}
