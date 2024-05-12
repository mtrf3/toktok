package com.ss.avframework.livestreamv2.core.interact.audio;

import X.C16880lQ;
import X.X1D;
import android.media.AudioTrack;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class PcmPlayer {
    public boolean inited;
    public AudioTrack mAudioTrack;

    public void release() {
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.mAudioTrack.stop();
                this.mAudioTrack.release();
            }
            this.mAudioTrack = null;
        }
    }

    public boolean isInited() {
        return this.inited;
    }

    public void playPcmData(ByteBuffer byteBuffer) {
        if (this.inited) {
            this.mAudioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
    }

    public PcmPlayer(int i, int i2) {
        int i3;
        String LIZIZ;
        if (i2 != 1) {
            if (i2 != 2) {
                DebugLogUtils.isEnableDebugLog();
                return;
            }
            i3 = 12;
        } else {
            i3 = 4;
        }
        try {
            AudioTrack audioTrack = new AudioTrack(3, i, i3, 2, AudioTrack.getMinBufferSize(i, i3, 2), 1);
            this.mAudioTrack = audioTrack;
            if (audioTrack.getState() != 1) {
                if (DebugLogUtils.isEnableDebugLog()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Create AudioTrack failed");
                    if (this.mAudioTrack == null) {
                        LIZIZ = "!";
                    } else {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append(": state ");
                        LIZ2.append(this.mAudioTrack.getState());
                        LIZIZ = X1D.LIZIZ(LIZ2);
                    }
                    LIZ.append(LIZIZ);
                    X1D.LIZIZ(LIZ);
                    return;
                }
                return;
            }
            this.mAudioTrack.play();
            this.inited = true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public void playPcmData(byte[] bArr, int i, int i2) {
        if (this.inited) {
            this.mAudioTrack.write(bArr, i, i2);
        }
    }
}
