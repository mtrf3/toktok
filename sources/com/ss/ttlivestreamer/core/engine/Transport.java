package com.ss.ttlivestreamer.core.engine;

import com.ss.ttlivestreamer.core.statics.StaticsReport;
import com.ss.ttlivestreamer.core.transport.PushStreamStallRecorder;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public abstract class Transport extends NativeObject implements StaticsReport.StaticReportInterface {
    public EventObserver mObserver;

    /* loaded from: classes12.dex */
    public interface EventObserver {
        void onTransportEvent(int i, int i2, long j, String str);
    }

    public static native void nativeEnableVideoFrameStatistics(boolean z);

    private native TEBundle nativeGetParameter();

    public static native void nativeResetSeiMgr();

    private native void nativeSetParameter(TEBundle tEBundle);

    public static native void nativeSetSeiSourceAble(boolean z);

    public void abortRequest() {
    }

    public int addSeiField(String str, Object obj, int i) {
        return 0;
    }

    public int addSeiField(String str, Object obj, int i, long j, boolean z, boolean z2) {
        return 0;
    }

    public int addSeiField(String str, Object obj, int i, long j, boolean z, boolean z2, int i2) {
        return 0;
    }

    public void addUserMetaData(String str, String str2, int i) {
    }

    public void clearNetInfoInt64Value() {
    }

    public long getInt64Value(int i) {
        return 0L;
    }

    @Override // com.ss.ttlivestreamer.core.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    public String getString(int i) {
        return null;
    }

    public VsyncModule getVsyncModule() {
        return null;
    }

    public abstract void registerFeedbackObserber(FeedbackObserver feedbackObserver);

    public void sendPacket(MediaPacket mediaPacket) {
    }

    public void sendPacket(Buffer buffer, int i) {
    }

    public void setPushStreamStallRecorder(PushStreamStallRecorder pushStreamStallRecorder) {
    }

    public void setVysncModule(VsyncModule vsyncModule) {
    }

    public boolean setupUrl(String str) {
        return false;
    }

    public void transReconnectProc() {
    }

    public void transReconnectStart(String str) {
    }

    public void transReconnectStop() {
    }

    public abstract void unRegisterFeedbackObserber(FeedbackObserver feedbackObserver);

    public TEBundle getParameter() {
        return nativeGetParameter();
    }

    public static void ResetSeiMgr() {
        nativeResetSeiMgr();
    }

    /* loaded from: classes12.dex */
    public abstract class FeedbackObserver {
        public abstract void onFeedback(String str);

        public FeedbackObserver() {
        }
    }

    public static void EnableVideoFrameStatistics(boolean z) {
        nativeEnableVideoFrameStatistics(z);
    }

    public static void SetSeiSourceAble(boolean z) {
        nativeSetSeiSourceAble(z);
    }

    public void setEventObserver(EventObserver eventObserver) {
        this.mObserver = eventObserver;
    }

    public void setParameter(TEBundle tEBundle) {
        nativeSetParameter(tEBundle);
    }

    public void onEvent(int i, int i2, long j, String str) {
        EventObserver eventObserver = this.mObserver;
        if (eventObserver != null) {
            eventObserver.onTransportEvent(i, i2, j, str);
        }
    }

    /* loaded from: classes12.dex */
    public static class MediaPacket {
        public ByteBuffer buffer;
        public int flags;
        public boolean isVideo;
        public int offset;
        public long presentationTimeUs;
        public int size;

        public void set(ByteBuffer byteBuffer, boolean z, int i, int i2, long j, int i3) {
            this.buffer = byteBuffer;
            this.offset = i;
            this.size = i2;
            this.presentationTimeUs = j;
            this.flags = i3;
            this.isVideo = z;
        }
    }
}
