package com.ss.ttlivestreamer.core.recorder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class SystemMediaRecorder implements MediaRecorder {
    public String mFileName;
    public int mFormat;
    public MediaMuxer mMediaMuxer;

    @Override // com.ss.ttlivestreamer.core.recorder.MediaRecorder
    public void release() {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.release();
            } catch (Exception e) {
                AVLog.w("SystemMediaRecorder", e.toString());
            }
            this.mMediaMuxer = null;
        }
    }

    @Override // com.ss.ttlivestreamer.core.recorder.MediaRecorder
    public int start() {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer == null) {
            return -1;
        }
        try {
            mediaMuxer.start();
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.ss.ttlivestreamer.core.recorder.MediaRecorder
    public int stop() {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.stop();
                return 0;
            } catch (Exception e) {
                AVLog.w("SystemMediaRecorder", e.toString());
                return 0;
            }
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.recorder.MediaRecorder
    public int addTrack(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            return mediaMuxer.addTrack(mediaFormat);
        }
        return -1;
    }

    public SystemMediaRecorder(String str, int i) {
        this.mFileName = str;
        this.mFormat = i;
        try {
            this.mMediaMuxer = new MediaMuxer(this.mFileName, this.mFormat);
        } catch (IOException unused) {
            this.mMediaMuxer = null;
        }
    }

    @Override // com.ss.ttlivestreamer.core.recorder.MediaRecorder
    public int writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        MediaMuxer mediaMuxer = this.mMediaMuxer;
        if (mediaMuxer != null) {
            try {
                mediaMuxer.writeSampleData(i, byteBuffer, bufferInfo);
                return 0;
            } catch (Exception e) {
                AVLog.e("SystemMediaRecorder", e.toString());
                return -1;
            }
        }
        return 0;
    }
}
