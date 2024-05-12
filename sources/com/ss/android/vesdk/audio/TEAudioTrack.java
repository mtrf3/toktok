package com.ss.android.vesdk.audio;

import X.P4Q;
import android.media.AudioTrack;
import android.os.Build;

/* loaded from: classes12.dex */
public class TEAudioTrack {
    public AudioTrack mAudioTrack;
    public int mMinBufferSize;

    public int getBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.mAudioTrack.getBufferSizeInFrames();
        }
        return this.mMinBufferSize;
    }

    public int pause() {
        P4Q.LJFF("TEAudioTrack", "pause()");
        if (this.mAudioTrack.getState() != 1) {
            return -1;
        }
        this.mAudioTrack.pause();
        return 0;
    }

    public void release() {
        P4Q.LJFF("TEAudioTrack", "release()");
        this.mAudioTrack.release();
    }

    public int start() {
        P4Q.LJFF("TEAudioTrack", "start()");
        if (this.mAudioTrack.getState() != 1) {
            return -1;
        }
        this.mAudioTrack.play();
        return 0;
    }

    public int stop() {
        P4Q.LJFF("TEAudioTrack", "stop()");
        if (this.mAudioTrack.getState() != 1) {
            return -1;
        }
        this.mAudioTrack.stop();
        this.mAudioTrack.flush();
        return 0;
    }

    public int getMinBufferSize() {
        return this.mMinBufferSize;
    }

    public TEAudioTrack(int i) {
        P4Q.LJFF("TEAudioTrack", "new()");
        this.mMinBufferSize = AudioTrack.getMinBufferSize(i, 12, 2);
        this.mAudioTrack = new AudioTrack(3, i, 12, 2, this.mMinBufferSize, 1);
    }

    public int setVolume(float f) {
        return this.mAudioTrack.setVolume(f);
    }

    public int write(byte[] bArr, int i) {
        return this.mAudioTrack.write(bArr, 0, i);
    }
}
