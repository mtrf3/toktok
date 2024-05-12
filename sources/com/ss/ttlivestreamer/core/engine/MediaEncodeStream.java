package com.ss.ttlivestreamer.core.engine;

import X.X1D;
import com.ss.ttlivestreamer.core.statics.StaticsReport;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public class MediaEncodeStream extends MediaEditorStream implements StaticsReport.StaticReportInterface {
    public InternalObserver mInternalObserver;
    public long mNativeObj;
    public List<MediaTrack> mTracks;
    public Transport mTransport;
    public final List<Transport> mTransportList;
    public VsyncModule mVsyncModule;

    /* loaded from: classes12.dex */
    public interface Observer {
        void onMediaEncodeStreamEvent(int i, int i2, long j, String str);
    }

    private native void nativeAddTrack(long j, MediaTrack mediaTrack);

    private native int nativeAddTransport(Transport transport, long j);

    private native TEBundle nativeGetParameter(long j);

    private native double nativeGetStaticsInfoWithKey(long j, String str);

    private native boolean nativeGetStaticsReport(long j, StaticsReport staticsReport);

    private native void nativeRegisterObserver(long j, Object obj);

    private native void nativeRelease(long j);

    private native void nativeRemoveTrack(long j, MediaTrack mediaTrack);

    private native void nativeRemoveTransport(Transport transport, long j);

    private native void nativeRequestIDRFrame(long j);

    private native void nativeSetAudioBitrate(int i, long j);

    private native void nativeSetEstimateTimeInterval(long j, int i);

    private native void nativeSetIsAddCropInfo(long j, boolean z);

    private native void nativeSetParameter(long j, TEBundle tEBundle);

    private native void nativeSetSITICaculator(long j, SITICalculator sITICalculator);

    private native void nativeSetVideoEncoderFactory(long j, VideoEncoderFactory videoEncoderFactory);

    private native void nativeStart(long j);

    private native void nativeStartRecord(long j, String str);

    private native void nativeStop(long j);

    private native void nativeStopRecord(long j);

    public static native long nativeToEditorStream(long j);

    private native void nativeUnRegisterObserver(long j, Object obj);

    public native long nativeGetVsyncModule(long j);

    @Override // com.ss.ttlivestreamer.core.engine.MediaEditorStream
    public synchronized void release() {
        if (this.mNativeObj == 0) {
            return;
        }
        stop();
        for (Transport transport : this.mTransportList) {
            nativeRemoveTransport(transport, this.mNativeObj);
            transport.release();
        }
        this.mTransportList.clear();
        for (MediaTrack mediaTrack : this.mTracks) {
            nativeRemoveTrack(this.mNativeObj, mediaTrack);
            mediaTrack.release();
        }
        this.mTracks.clear();
        nativeSetVideoEncoderFactory(this.mNativeObj, null);
        if (this.mTransport != null) {
            this.mTransport = null;
        }
        VsyncModule vsyncModule = this.mVsyncModule;
        if (vsyncModule != null) {
            vsyncModule.release();
            this.mVsyncModule = null;
        }
        nativeUnRegisterObserver(this.mNativeObj, this.mInternalObserver);
        this.mInternalObserver.release();
        this.mInternalObserver = null;
        super.release();
        nativeRelease(this.mNativeObj);
        this.mNativeObj = 0L;
    }

    public TEBundle getParameter() {
        return nativeGetParameter(this.mNativeObj);
    }

    public void requestIDRFrame() {
        nativeRequestIDRFrame(this.mNativeObj);
    }

    public void start() {
        nativeStart(this.mNativeObj);
    }

    public void stop() {
        nativeStop(this.mNativeObj);
    }

    public void stopRecord() {
        nativeStopRecord(this.mNativeObj);
    }

    public VsyncModule getVsyncModule() {
        return this.mVsyncModule;
    }

    /* loaded from: classes12.dex */
    public class InternalObserver extends NativeObject implements Observer {
        public Observer mObserver;

        public void onChanged() {
        }

        public InternalObserver() {
        }

        public void registerObserver(Observer observer) {
            this.mObserver = observer;
        }

        @Override // com.ss.ttlivestreamer.core.engine.MediaEncodeStream.Observer
        public void onMediaEncodeStreamEvent(int i, int i2, long j, String str) {
            Observer observer = this.mObserver;
            if (observer != null) {
                observer.onMediaEncodeStreamEvent(i, i2, j, str);
            }
        }
    }

    public void addTrack(MediaTrack mediaTrack) {
        nativeAddTrack(this.mNativeObj, mediaTrack);
        this.mTracks.add(mediaTrack);
    }

    public int addTransport(Transport transport) {
        if (!this.mTransportList.contains(transport)) {
            this.mTransportList.add(transport);
            return nativeAddTransport(transport, this.mNativeObj);
        }
        return -1;
    }

    public boolean containTrack(MediaTrack mediaTrack) {
        return this.mTracks.contains(mediaTrack);
    }

    public double getStaticsInfoWithKey(String str) {
        return nativeGetStaticsInfoWithKey(this.mNativeObj, str);
    }

    @Override // com.ss.ttlivestreamer.core.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return nativeGetStaticsReport(this.mNativeObj, staticsReport);
    }

    public void registerObserver(Observer observer) {
        this.mInternalObserver.registerObserver(observer);
    }

    public void removeTrack(MediaTrack mediaTrack) {
        if (this.mTracks.remove(mediaTrack)) {
            nativeRemoveTrack(this.mNativeObj, mediaTrack);
        }
    }

    public void removeTransport(Transport transport) {
        if (this.mTransportList.contains(transport)) {
            this.mTransportList.remove(transport);
            nativeRemoveTransport(transport, this.mNativeObj);
        }
    }

    public void setAudioBitrate(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioBitrate: ");
        LIZ.append(i);
        AVLog.iod("MediaEncodeStream", X1D.LIZIZ(LIZ));
        nativeSetAudioBitrate(i, this.mNativeObj);
    }

    public void setEstimateTimeInterval(int i) {
        nativeSetEstimateTimeInterval(this.mNativeObj, i);
    }

    public void setIsAddCropInfo(boolean z) {
        nativeSetIsAddCropInfo(this.mNativeObj, z);
    }

    public void setParameter(TEBundle tEBundle) {
        nativeSetParameter(this.mNativeObj, tEBundle);
    }

    public void setSITICaculator(SITICalculator sITICalculator) {
        nativeSetSITICaculator(this.mNativeObj, sITICalculator);
    }

    public void startRecord(String str) {
        nativeStartRecord(this.mNativeObj, str);
    }

    public MediaEncodeStream(long j, Transport transport) {
        super(nativeToEditorStream(j));
        this.mTransportList = new CopyOnWriteArrayList();
        this.mNativeObj = j;
        this.mTransport = transport;
        this.mVsyncModule = new VsyncModule(nativeGetVsyncModule(j));
        this.mTracks = new CopyOnWriteArrayList();
        InternalObserver internalObserver = new InternalObserver();
        this.mInternalObserver = internalObserver;
        nativeRegisterObserver(this.mNativeObj, internalObserver);
    }
}
