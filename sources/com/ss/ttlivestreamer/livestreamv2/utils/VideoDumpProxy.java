package com.ss.ttlivestreamer.livestreamv2.utils;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class VideoDumpProxy {
    public static Class<?> classRawVideoDumper = null;
    public static Constructor<?> constructorLiveCoreVideoDump = null;
    public static Constructor<?> constructorLiveStreamVideoDump = null;
    public static Constructor<?> constructorRawVideoDumper = null;
    public static String currentVideoSourceName = null;
    public static int isLiveCoreVideoDumpAvailable = -1;
    public static int isLiveStreamVideoDumpAvailable = -1;
    public static int isRawVideoDumperAvailable = -1;
    public static Method methodCheckFrameCount;
    public static Method methodOnTextureFrame;
    public static Method methodOnYuvFrame;
    public static Method methodRelease;
    public static Method methodUpdateDumpFile;
    public static final List<RawVideoDumperProxy> rawVideoDumperList = new ArrayList();

    /* loaded from: classes12.dex */
    public static class RawVideoDumperProxy {
        public String mParamKey;
        public Object mRawVideoDumper;

        public static Object com_ss_ttlivestreamer_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "2162017934722067951"));
            return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
        }

        private boolean isValid() {
            if (VideoDumpProxy.isRawVideoDumperAvailable == 1 && this.mRawVideoDumper != null) {
                return true;
            }
            return false;
        }

        public void release() {
            List<RawVideoDumperProxy> list = VideoDumpProxy.rawVideoDumperList;
            synchronized (list) {
                list.remove(this);
            }
            releaseRawVideoDumper();
        }

        private void releaseRawVideoDumper() {
            if (!isValid()) {
                return;
            }
            Object obj = this.mRawVideoDumper;
            this.mRawVideoDumper = null;
            try {
                if (VideoDumpProxy.methodRelease == null) {
                    VideoDumpProxy.methodRelease = VideoDumpProxy.classRawVideoDumper.getMethod("release", new Class[0]);
                }
                com_ss_ttlivestreamer_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(VideoDumpProxy.methodRelease, obj, new Object[0]);
            } catch (Exception e) {
                TTLSSladarBugReportUtils.getInstance().report(e, "VideoDumpProxy.releaseRawVideoDumper");
                if (!TTLSBuildConfig.canThrowException()) {
                } else {
                    throw new AndroidRuntimeException(e);
                }
            }
        }

        public boolean checkFrameCount() {
            if (!isValid()) {
                return false;
            }
            try {
                if (VideoDumpProxy.methodCheckFrameCount == null) {
                    VideoDumpProxy.methodCheckFrameCount = VideoDumpProxy.classRawVideoDumper.getMethod("checkFrameCount", new Class[0]);
                }
                Boolean bool = (Boolean) com_ss_ttlivestreamer_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(VideoDumpProxy.methodCheckFrameCount, this.mRawVideoDumper, new Object[0]);
                if (bool == null) {
                    return false;
                }
                if (!bool.booleanValue()) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                TTLSSladarBugReportUtils.getInstance().report(e, "VideoDumpProxy.checkFrameCount");
                if (!TTLSBuildConfig.canThrowException()) {
                    return false;
                }
                throw new AndroidRuntimeException(e);
            }
        }

        private void createRawVideoDumper(JSONObject jSONObject) {
            if (VideoDumpProxy.isRawVideoDumperAvailable == -1) {
                try {
                    Class<?> cls = Class.forName("com.ss.ttlivestreamer.livestreamv2.utils.VideoDumpDebug.RawVideoDumper");
                    VideoDumpProxy.classRawVideoDumper = cls;
                    Class<?> cls2 = Integer.TYPE;
                    VideoDumpProxy.constructorRawVideoDumper = cls.getConstructor(cls2, cls2, String.class, Boolean.TYPE);
                    VideoDumpProxy.isRawVideoDumperAvailable = 1;
                } catch (Exception unused) {
                    VideoDumpProxy.isRawVideoDumperAvailable = 0;
                }
            }
            if (VideoDumpProxy.isRawVideoDumperAvailable != 1) {
                return;
            }
            try {
                int optInt = jSONObject.optInt("startFrameCount");
                int optInt2 = jSONObject.optInt("dumpFrameCount");
                String optString = jSONObject.optString("dumpSaveDir");
                boolean optBoolean = jSONObject.optBoolean("exclusiveFileName");
                if (optInt >= 0 && optInt2 > 0 && !TextUtils.isEmpty(optString)) {
                    this.mRawVideoDumper = VideoDumpProxy.constructorRawVideoDumper.newInstance(Integer.valueOf(optInt), Integer.valueOf(optInt2), optString, Boolean.valueOf(optBoolean));
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            updateDumpFile(VideoDumpProxy.currentVideoSourceName);
        }

        public void onVideoDumpParamsChange(JSONObject jSONObject) {
            releaseRawVideoDumper();
            if (jSONObject != null && !jSONObject.isNull(this.mParamKey)) {
                createRawVideoDumper(jSONObject.optJSONObject(this.mParamKey));
            }
        }

        public void updateDumpFile(String str) {
            if (!isValid()) {
                return;
            }
            try {
                if (VideoDumpProxy.methodUpdateDumpFile == null) {
                    VideoDumpProxy.methodUpdateDumpFile = VideoDumpProxy.classRawVideoDumper.getMethod("updateDumpFile", String.class);
                }
                com_ss_ttlivestreamer_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(VideoDumpProxy.methodUpdateDumpFile, this.mRawVideoDumper, new Object[]{str});
            } catch (Exception e) {
                TTLSSladarBugReportUtils.getInstance().report(e, "VideoDumpProxy.updateDumpFile");
                if (!TTLSBuildConfig.canThrowException()) {
                } else {
                    throw new AndroidRuntimeException(e);
                }
            }
        }

        public RawVideoDumperProxy(JSONObject jSONObject, String str) {
            List<RawVideoDumperProxy> list = VideoDumpProxy.rawVideoDumperList;
            synchronized (list) {
                list.add(this);
            }
            if (!TextUtils.isEmpty(str)) {
                this.mParamKey = str;
                createRawVideoDumper(jSONObject.optJSONObject(str));
                return;
            }
            throw new AndroidRuntimeException("param key is null");
        }

        public void onYuvFrame(ByteBuffer byteBuffer, int i, int i2, int i3, String str) {
            if (!isValid()) {
                return;
            }
            try {
                if (VideoDumpProxy.methodOnYuvFrame == null) {
                    Class<?> cls = VideoDumpProxy.classRawVideoDumper;
                    Class<?> cls2 = Integer.TYPE;
                    VideoDumpProxy.methodOnYuvFrame = cls.getMethod("onYuvFrame", ByteBuffer.class, cls2, cls2, cls2, String.class);
                }
                com_ss_ttlivestreamer_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(VideoDumpProxy.methodOnYuvFrame, this.mRawVideoDumper, new Object[]{byteBuffer, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str});
            } catch (Exception e) {
                TTLSSladarBugReportUtils.getInstance().report(e, "VideoDumpProxy.onYuvFrame@1");
                if (!TTLSBuildConfig.canThrowException()) {
                } else {
                    throw new AndroidRuntimeException(e);
                }
            }
        }

        public void onTextureFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, String str) {
            if (!isValid()) {
                return;
            }
            try {
                if (VideoDumpProxy.methodOnTextureFrame == null) {
                    Class<?> cls = VideoDumpProxy.classRawVideoDumper;
                    Class<?> cls2 = Integer.TYPE;
                    VideoDumpProxy.methodOnTextureFrame = cls.getMethod("onTextureFrame", cls2, Boolean.TYPE, cls2, cls2, cls2, float[].class, String.class);
                }
                try {
                    com_ss_ttlivestreamer_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(VideoDumpProxy.methodOnTextureFrame, this.mRawVideoDumper, new Object[]{Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fArr, str});
                } catch (Exception e) {
                    e = e;
                    TTLSSladarBugReportUtils.getInstance().report(e, "VideoDumpProxy.onTextureFrame");
                    if (!TTLSBuildConfig.canThrowException()) {
                    } else {
                        throw new AndroidRuntimeException(e);
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }

        public void onYuvFrame(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, String str) {
            if (!isValid()) {
                return;
            }
            try {
                if (VideoDumpProxy.methodOnYuvFrame == null) {
                    Class<?> cls = VideoDumpProxy.classRawVideoDumper;
                    Class<?> cls2 = Integer.TYPE;
                    VideoDumpProxy.methodOnYuvFrame = cls.getMethod("onYuvFrame", ByteBuffer.class, cls2, ByteBuffer.class, cls2, ByteBuffer.class, cls2, cls2, cls2, cls2, String.class);
                }
                try {
                    com_ss_ttlivestreamer_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(VideoDumpProxy.methodOnYuvFrame, this.mRawVideoDumper, new Object[]{byteBuffer, Integer.valueOf(i), byteBuffer2, Integer.valueOf(i2), byteBuffer3, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str});
                } catch (Exception e) {
                    e = e;
                    TTLSSladarBugReportUtils.getInstance().report(e, "VideoDumpProxy.onYuvFrame@2");
                    if (!TTLSBuildConfig.canThrowException()) {
                    } else {
                        throw new AndroidRuntimeException(e);
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
    }

    /* loaded from: classes12.dex */
    public interface VideoDumpEventListener {
        void onInfo(int i, Object... objArr);
    }

    /* loaded from: classes12.dex */
    public static class VideoDumpEventListenerImpl implements VideoDumpEventListener {
        public VideoDumpEventListenerImpl() {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.utils.VideoDumpProxy.VideoDumpEventListener
        public void onInfo(int i, Object... objArr) {
            if (i == 0) {
                String str = (String) objArr[0];
                if (str != null) {
                    try {
                        str = str.substring(str.lastIndexOf(47) + 1, str.lastIndexOf(46));
                    } catch (Exception unused) {
                    }
                    Matcher matcher = PatternProtector.compile("_*\\d+x\\d+[x_]\\d+").matcher(str);
                    if (matcher.find()) {
                        str = str.substring(0, matcher.start());
                    }
                } else {
                    str = null;
                }
                VideoDumpProxy.currentVideoSourceName = str;
                List<RawVideoDumperProxy> list = VideoDumpProxy.rawVideoDumperList;
                synchronized (list) {
                    Iterator<RawVideoDumperProxy> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().updateDumpFile(str);
                    }
                }
                return;
            }
            if (i == 1) {
                List<RawVideoDumperProxy> list2 = VideoDumpProxy.rawVideoDumperList;
                synchronized (list2) {
                    Iterator<RawVideoDumperProxy> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        it2.next().onVideoDumpParamsChange((JSONObject) objArr[0]);
                    }
                }
            }
        }
    }

    public static LiveCore createLiveCoreVideoDumpInstance(LiveCore.Builder builder) {
        if (isLiveCoreVideoDumpAvailable == -1) {
            try {
                constructorLiveCoreVideoDump = Class.forName("com.ss.ttlivestreamer.livestreamv2.utils.VideoDumpDebug.LiveCoreVideoDump").getConstructor(LiveCore.Builder.class);
                isLiveCoreVideoDumpAvailable = 1;
            } catch (Exception unused) {
                isLiveCoreVideoDumpAvailable = 0;
            }
        }
        if (isLiveCoreVideoDumpAvailable != 1) {
            return null;
        }
        try {
            return (LiveCore) constructorLiveCoreVideoDump.newInstance(builder);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static ILiveStream createLiveStreamVideoDumpInstance(LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
        if (isLiveStreamVideoDumpAvailable == -1) {
            try {
                constructorLiveStreamVideoDump = Class.forName("com.ss.ttlivestreamer.livestreamv2.utils.VideoDumpDebug.LiveStreamVideoDump").getConstructor(LiveStreamBuilder.class, Handler.class, Handler.class, AudioDeviceModule.class, IVideoEffectProcessor.class, VideoDumpEventListener.class);
                isLiveStreamVideoDumpAvailable = 1;
            } catch (Exception unused) {
                isLiveStreamVideoDumpAvailable = 0;
            }
        }
        if (isLiveStreamVideoDumpAvailable != 1) {
            return null;
        }
        try {
            return (ILiveStream) constructorLiveStreamVideoDump.newInstance(liveStreamBuilder, handler, handler2, audioDeviceModule, iVideoEffectProcessor, new VideoDumpEventListenerImpl());
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }
}
