package com.ss.avframework.livestreamv2.core.interact;

import X.AnonymousClass028;
import X.X1D;
import android.util.AndroidRuntimeException;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioSink;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.IInputAudioStream;
import com.ss.ttlivestreamer.livestreamv2.core.IAudioDeviceControl;
import com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class InteractAudioSink implements AudioSink {
    public boolean isRenderAble = true;
    public IAudioDeviceControl.IAudioTrack mAudioRender;
    public InteractEngineBuilder mBuilder;
    public String mName;
    public IInputAudioStream mOutAudioStream;
    public IRecorderManager mRecorderMgr;

    public void release() {
        synchronized (this) {
            IInputAudioStream iInputAudioStream = this.mOutAudioStream;
            if (iInputAudioStream != null) {
                IRecorderManager iRecorderManager = this.mRecorderMgr;
                if (iRecorderManager != null) {
                    iRecorderManager.removeAudioTrack(iInputAudioStream.getAudioTrack());
                    this.mRecorderMgr = null;
                }
                IAudioDeviceControl.IAudioTrack iAudioTrack = this.mAudioRender;
                if (iAudioTrack != null) {
                    iAudioTrack.setQuirks(0L);
                    this.mAudioRender.setAudioTrack(null);
                }
                this.mOutAudioStream.stop();
                this.mOutAudioStream.release();
                this.mOutAudioStream = null;
            }
            IAudioDeviceControl.IAudioTrack iAudioTrack2 = this.mAudioRender;
            if (iAudioTrack2 != null) {
                iAudioTrack2.dispose();
                this.mAudioRender = null;
            }
        }
    }

    public IInputAudioStream getOutAudioStream() {
        return this.mOutAudioStream;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSink
    public void setRenderAble(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("render old state:");
        LIZ.append(this.isRenderAble);
        LIZ.append(", new state:");
        LIZ.append(z);
        AVLog.ioi("InteractAudioSink", X1D.LIZIZ(LIZ));
        this.isRenderAble = z;
    }

    public InteractAudioSink(InteractEngineBuilder interactEngineBuilder, String str, int i, int i2) {
        this.mBuilder = interactEngineBuilder;
        this.mName = str;
        if (!interactEngineBuilder.isByteAudioEnabled()) {
            AVLog.iow("InteractAudioSink", "Using livecore audio capture, should use livecore audio play too.");
            IInputAudioStream createInputAudioStream = interactEngineBuilder.getLiveCore().createInputAudioStream();
            this.mOutAudioStream = createInputAudioStream;
            if (createInputAudioStream == null) {
                AVLog.iow("InteractAudioSink", "mOutAudioStream is null, maybe LiveStream is being released.");
                return;
            }
            createInputAudioStream.start();
            IRecorderManager recorderMgr = interactEngineBuilder.getLiveCore().getRecorderMgr();
            this.mRecorderMgr = recorderMgr;
            recorderMgr.addAudioTrack(this.mOutAudioStream.getAudioTrack());
            IAudioDeviceControl audioDeviceControl = this.mBuilder.getLiveCore().getAudioDeviceControl();
            if (audioDeviceControl != null) {
                IAudioDeviceControl.IAudioTrack createTrack = audioDeviceControl.createTrack(this.mName, i, i2, 16);
                this.mAudioRender = createTrack;
                if (createTrack != null) {
                    createTrack.setVolume(1.0f);
                    this.mAudioRender.setAudioTrack(this.mOutAudioStream.getAudioTrack());
                    this.mAudioRender.setQuirks(2L);
                }
                this.mBuilder.getLiveCore().startAudioPlayer();
                return;
            }
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("Not client mix and not livecore capture audio, why livecore audio sink?");
        if (!AnonymousClass028.LJI(androidRuntimeException, "InteractAudioSink.InteractAudioSink")) {
        } else {
            throw androidRuntimeException;
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioSink
    public void onPlaybackAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        ByteBuffer byteBuffer2;
        if (!this.isRenderAble) {
            return;
        }
        byteBuffer.position(0);
        if (!byteBuffer.isDirect()) {
            byteBuffer2 = ByteBuffer.allocateDirect(byteBuffer.capacity());
            byteBuffer.position(0);
            byteBuffer2.position(0);
            byteBuffer2.put(byteBuffer);
        } else {
            byteBuffer2 = byteBuffer;
        }
        long j2 = j * 1000;
        IAudioDeviceControl.IAudioTrack iAudioTrack = this.mAudioRender;
        if (iAudioTrack != null) {
            iAudioTrack.onData(byteBuffer2, i2, i3, i, j2 * 1000);
        }
    }
}
