package com.ss.ttlivestreamer.core.transport;

import X.X1D;
import android.content.Context;
import com.ss.ttlivestreamer.core.engine.Transport;
import com.ss.ttlivestreamer.core.engine.VsyncModule;
import com.ss.ttlivestreamer.core.statics.StaticsReport;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.LibraryLoader;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import defpackage.a1;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LibRTMPTransport extends NativeTransport {
    public static boolean sRtsLibraryLoaded;
    public final Object mReleasedFense = new Object();
    public VsyncModule mVsyncModule;

    private native void nativeAbortRequest();

    private native int nativeAddSeiField(String str, Object obj, int i, long j, boolean z, boolean z2, int i2);

    private native void nativeAddUserMetaData(String str, String str2, int i);

    private native void nativeClearNetInfoInt64Value();

    private native void nativeCreateNative(boolean z, boolean z2, boolean z3, String str);

    private native long nativeGetInt64Value(int i);

    private native boolean nativeGetStaticsReport(StaticsReport staticsReport);

    private native String nativeGetString(int i);

    private native void nativeInitRtsJniEnv(Context context);

    public static native boolean nativeRtsLibraryLoaded();

    private native void nativeSetPushStreamStallRecorder(PushStreamStallRecorder pushStreamStallRecorder);

    private native boolean nativeSetupUrl(String str);

    private native void nativeTransReconnectProc();

    private native void nativeTransReconnectStart(String str);

    private native void nativeTransReconnectStop();

    @Override // com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        VsyncModule vsyncModule = this.mVsyncModule;
        if (vsyncModule != null) {
            vsyncModule.release();
            this.mVsyncModule = null;
        }
        synchronized (this.mReleasedFense) {
            super.release();
        }
    }

    public static boolean TryLoadRtsLibrary() {
        if (sRtsLibraryLoaded) {
            return true;
        }
        String str = "volcenginertc";
        try {
            boolean loadLibrary = LibraryLoader.loadLibrary("volcenginertc");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RtcNativeLibraryLoader load(");
            LIZ.append("volcenginertc");
            LIZ.append("): ");
            LIZ.append(loadLibrary);
            AVLog.ioi("LibRTMPTransport", X1D.LIZIZ(LIZ));
            str = "byterts";
            boolean loadLibrary2 = LibraryLoader.loadLibrary("byterts");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("RtcNativeLibraryLoader load(");
            LIZ2.append("byterts");
            LIZ2.append("): ");
            LIZ2.append(loadLibrary2);
            AVLog.ioi("LibRTMPTransport", X1D.LIZIZ(LIZ2));
            boolean nativeRtsLibraryLoaded = nativeRtsLibraryLoaded();
            sRtsLibraryLoaded = nativeRtsLibraryLoaded;
            return nativeRtsLibraryLoaded;
        } catch (Exception e) {
            AVLog.logToIODevice(6, "LibRTMPTransport", a1.LJ("RtcNativeLibraryLoader load(", str, ") error"), e);
            return false;
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public void abortRequest() {
        synchronized (this.mReleasedFense) {
            nativeAbortRequest();
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public void clearNetInfoInt64Value() {
        synchronized (this.mReleasedFense) {
            nativeClearNetInfoInt64Value();
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public VsyncModule getVsyncModule() {
        return this.mVsyncModule;
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public void transReconnectProc() {
        nativeTransReconnectProc();
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public void transReconnectStop() {
        nativeTransReconnectStop();
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public long getInt64Value(int i) {
        long nativeGetInt64Value;
        synchronized (this.mReleasedFense) {
            nativeGetInt64Value = nativeGetInt64Value(i);
        }
        return nativeGetInt64Value;
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport, com.ss.ttlivestreamer.core.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        super.getStaticsReport(staticsReport);
        return nativeGetStaticsReport(staticsReport);
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public String getString(int i) {
        return nativeGetString(i);
    }

    @Override // com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.Transport
    public /* bridge */ /* synthetic */ void registerFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.registerFeedbackObserber(feedbackObserver);
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public void setPushStreamStallRecorder(PushStreamStallRecorder pushStreamStallRecorder) {
        nativeSetPushStreamStallRecorder(pushStreamStallRecorder);
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public synchronized void setVysncModule(VsyncModule vsyncModule) {
        VsyncModule vsyncModule2 = this.mVsyncModule;
        if (vsyncModule2 != null) {
            vsyncModule2.release();
        }
        this.mVsyncModule = vsyncModule;
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public boolean setupUrl(String str) {
        boolean z;
        String str2;
        if (str != null) {
            z = nativeSetupUrl(str);
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Setup url ");
        LIZ.append(str);
        AVLog.iod("LibRTMPTransport", X1D.LIZIZ(LIZ));
        TEBundle parameter = getParameter();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("config:");
        if (parameter != null) {
            str2 = parameter.toString();
        } else {
            str2 = "null";
        }
        LIZ2.append(str2);
        AVLog.iod("LibRTMPTransport", X1D.LIZIZ(LIZ2));
        return z;
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public void transReconnectStart(String str) {
        nativeTransReconnectStart(str);
    }

    @Override // com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.Transport
    public /* bridge */ /* synthetic */ void unRegisterFeedbackObserber(Transport.FeedbackObserver feedbackObserver) {
        super.unRegisterFeedbackObserber(feedbackObserver);
    }

    @Override // com.ss.ttlivestreamer.core.transport.NativeTransport, com.ss.ttlivestreamer.core.engine.Transport
    public /* bridge */ /* synthetic */ void sendPacket(Buffer buffer, int i) {
        super.sendPacket(buffer, i);
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public int addSeiField(String str, Object obj, int i) {
        return addSeiField(str, obj, i, 0L, true, true);
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public void addUserMetaData(String str, String str2, int i) {
        nativeAddUserMetaData(str, str2, i);
    }

    public LibRTMPTransport(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        String str;
        if (z4) {
            TryLoadRtsLibrary();
            nativeInitRtsJniEnv(ContextUtils.getApplicationContext());
            str = "RTSV2Transport";
        } else {
            str = "LibRTMPTransport";
        }
        nativeCreateNative(z, z2, z3, str);
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public int addSeiField(String str, Object obj, int i, long j, boolean z, boolean z2) {
        return addSeiField(str, obj, i, j, z, z2, 0);
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport
    public int addSeiField(String str, Object obj, int i, long j, boolean z, boolean z2, int i2) {
        if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            if (!byteBuffer.isDirect() || byteBuffer.remaining() != byteBuffer.capacity()) {
                AVLog.ioe("LibRTMPTransport", "A DirectByteBuffer is needed and its remaining size should equals to its capacity.");
                return -1;
            }
        } else {
            if (str == null || str.isEmpty()) {
                AVLog.logToIODevice2(6, "LibRTMPTransport", "When value is not a ByteBuffer, a valid key should be specified.", (Throwable) null, "LibRTMPTransport.java::addSeiField", 10000);
                return -2;
            }
            if (obj != null && !(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unsupported value type: ");
                LIZ.append(obj.getClass().getName());
                AVLog.ioe("LibRTMPTransport", X1D.LIZIZ(LIZ));
                return -3;
            }
            if ((i2 & 1 & 1) > 0 && !(obj instanceof JSONObject)) {
                AVLog.ioe("LibRTMPTransport", "value type must be JSONObject when seiFlag is:1");
                return -4;
            }
        }
        return nativeAddSeiField(str, obj, i, j, z, z2, i2);
    }
}
