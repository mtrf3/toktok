package com.byted.cast.capture.muxer;

import X.X1D;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.utils.Logger;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes29.dex */
public class MediaMuxerWrapper {
    public static int AUDIO = 1;
    public static int VIDEO;
    public volatile boolean bWriteIDR;
    public String mOutputPath;
    public final Object mMuxerLock = new Object();
    public Track[] TrackMap = new Track[2];
    public int mWaitToStartCount = 0;
    public int mAllCount = 0;
    public volatile boolean mIsStarted = false;
    public MediaMuxer mMediaMuxer = null;

    public synchronized boolean isStarted() {
        return this.mIsStarted;
    }

    public boolean stop() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop mWaitToStartCount:");
        LIZ.append(this.mWaitToStartCount);
        LIZ.append(", mAllCount:");
        LIZ.append(this.mAllCount);
        Logger.i("MediaMuxerWrapper", X1D.LIZIZ(LIZ));
        if (!this.mIsStarted) {
            Logger.i("MediaMuxerWrapper", "already stopped");
            this.mMediaMuxer = null;
            return true;
        }
        MediaMonitor.onMonitor("MediaCapture_Muxer_Stop", "");
        synchronized (this.mMuxerLock) {
            int i = 0;
            while (true) {
                try {
                    if (this.bWriteIDR) {
                        break;
                    }
                    Logger.w("MediaMuxerWrapper", "waitting for write IDR 200 ms");
                    this.mMuxerLock.wait(200L);
                    i++;
                    if (i == 10) {
                        Logger.e("MediaMuxerWrapper", "wait 2s, Error to write idr!!!");
                        break;
                    }
                } catch (Exception e) {
                    MediaMonitor.onMonitor("MediaCapture_Error", 100007, "stop", e.toString());
                    e.printStackTrace();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("mMediaMuxer stop ERROR");
                    LIZ2.append(e);
                    Logger.e("MediaMuxerWrapper", X1D.LIZIZ(LIZ2));
                    this.mIsStarted = false;
                    this.mWaitToStartCount = 0;
                    this.mMediaMuxer = null;
                    return false;
                }
            }
            this.mMediaMuxer.stop();
            this.mMediaMuxer.release();
            this.mMediaMuxer = null;
            this.mIsStarted = false;
            this.mWaitToStartCount = 0;
            this.mMediaMuxer = null;
        }
        MediaMonitor.onMonitor("MediaCapture_Muxer_Stop_Sucess", "");
        Logger.i("MediaMuxerWrapper", "mMediaMuxer stop ok");
        return true;
    }

    public MediaMuxerWrapper() {
        int i = 0;
        while (true) {
            Track[] trackArr = this.TrackMap;
            if (i < trackArr.length) {
                trackArr[i] = new Track();
                i++;
            } else {
                return;
            }
        }
    }

    private void start() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start mWaitToStartCount:");
        LIZ.append(this.mWaitToStartCount);
        LIZ.append(", mAllCount:");
        LIZ.append(this.mAllCount);
        Logger.i("MediaMuxerWrapper", X1D.LIZIZ(LIZ));
        if (this.mIsStarted) {
            Logger.i("MediaMuxerWrapper", "already started");
            return;
        }
        int i = this.mWaitToStartCount;
        if (i > 0 && i == this.mAllCount) {
            MediaMuxer mediaMuxer = this.mMediaMuxer;
            if (mediaMuxer != null) {
                mediaMuxer.start();
            }
            this.mIsStarted = true;
            this.bWriteIDR = false;
            Logger.i("MediaMuxerWrapper", "mMediaMuxer start ok");
        }
    }

    public String getOutputPath() {
        return this.mOutputPath;
    }

    /* loaded from: classes29.dex */
    public class Track {
        public volatile boolean bNeedAddTrack;
        public MediaFormat format;
        public int trackIndex = -1;

        public Track() {
        }
    }

    public void addEncoder(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addEncoder type:");
        LIZ.append(i);
        Logger.i("MediaMuxerWrapper", X1D.LIZIZ(LIZ));
        synchronized (this.mMuxerLock) {
            if (i == VIDEO) {
                this.mAllCount++;
            } else if (i == AUDIO) {
                this.mAllCount++;
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("unsupported type:");
                LIZ2.append(i);
                Logger.e("MediaMuxerWrapper", X1D.LIZIZ(LIZ2));
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("addEncoder mAllCount");
        LIZ3.append(this.mAllCount);
        Logger.i("MediaMuxerWrapper", X1D.LIZIZ(LIZ3));
    }

    public void removeTrack(int i) {
        if (this.mIsStarted) {
            return;
        }
        synchronized (this.mMuxerLock) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("removeTrack:");
            LIZ.append(i);
            Logger.i("MediaMuxerWrapper", X1D.LIZIZ(LIZ));
            Track track = this.TrackMap[i];
            track.format = null;
            track.bNeedAddTrack = false;
            this.TrackMap[i].trackIndex = -1;
            this.bWriteIDR = true;
            this.mMuxerLock.notify();
        }
    }

    public boolean start(String str) {
        MediaFormat mediaFormat;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start file:");
        LIZ.append(str);
        LIZ.append("mIsStarted");
        LIZ.append(this.mIsStarted);
        Logger.i("MediaMuxerWrapper", X1D.LIZIZ(LIZ));
        MediaMonitor.onMonitor("MediaCapture_Muxer_Start", str);
        synchronized (this.mMuxerLock) {
            this.mOutputPath = str;
            try {
                this.mMediaMuxer = new MediaMuxer(this.mOutputPath, 0);
                if (!this.mIsStarted) {
                    for (Track track : this.TrackMap) {
                        if (track.bNeedAddTrack && (mediaFormat = track.format) != null) {
                            try {
                                track.trackIndex = this.mMediaMuxer.addTrack(mediaFormat);
                                this.mWaitToStartCount++;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("addTrack:");
                                LIZ2.append(track.trackIndex);
                                LIZ2.append(",format=");
                                LIZ2.append(track.format);
                                Logger.i("MediaMuxerWrapper", X1D.LIZIZ(LIZ2));
                                start();
                            } catch (Exception e) {
                                MediaMonitor.onMonitor("MediaCapture_Error", 100007, "start", e.toString());
                                e.printStackTrace();
                                this.mMediaMuxer = null;
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("start Error:");
                                LIZ3.append(e);
                                Logger.e("MediaMuxerWrapper", X1D.LIZIZ(LIZ3));
                            }
                        }
                    }
                }
                MediaMonitor.onMonitor("MediaCapture_Muxer_Start_Sucess", str);
            } catch (IOException e2) {
                MediaMonitor.onMonitor("MediaCapture_Error", 100007, "start", e2.toString());
                e2.printStackTrace();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("new MediaMuxer Error!!!");
                LIZ4.append(e2);
                Logger.e("MediaMuxerWrapper", X1D.LIZIZ(LIZ4));
                this.mMediaMuxer = null;
                return false;
            }
        }
        return true;
    }

    public void addTrack(int i, MediaFormat mediaFormat) {
        synchronized (this.mMuxerLock) {
            if (this.mIsStarted) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("save:TrackMap type:");
            LIZ.append(i);
            Logger.i("MediaMuxerWrapper", X1D.LIZIZ(LIZ));
            Track track = this.TrackMap[i];
            track.format = mediaFormat;
            track.bNeedAddTrack = true;
            MediaMuxer mediaMuxer = this.mMediaMuxer;
            if (mediaMuxer != null) {
                try {
                    this.TrackMap[i].trackIndex = mediaMuxer.addTrack(mediaFormat);
                    this.mWaitToStartCount++;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("addTrack:");
                    LIZ2.append(this.TrackMap[i].trackIndex);
                    LIZ2.append(",format=");
                    LIZ2.append(this.TrackMap[i].format);
                    Logger.i("MediaMuxerWrapper", X1D.LIZIZ(LIZ2));
                    start();
                } catch (Exception e) {
                    MediaMonitor.onMonitor("MediaCapture_Error", 100007, "addTrack", e.toString());
                    e.printStackTrace();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("addTrack Error:");
                    LIZ3.append(e);
                    Logger.e("MediaMuxerWrapper", X1D.LIZIZ(LIZ3));
                }
            }
        }
    }

    public void writeSampleData(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i2) {
        synchronized (this.mMuxerLock) {
            if (this.mIsStarted && this.mWaitToStartCount > 0 && this.TrackMap[i].trackIndex != -1) {
                if (!this.bWriteIDR && i2 == 1) {
                    this.bWriteIDR = true;
                    Logger.i("MediaMuxerWrapper", "bWriteIDR");
                }
                if (this.bWriteIDR) {
                    try {
                        this.mMediaMuxer.writeSampleData(this.TrackMap[i].trackIndex, byteBuffer, bufferInfo);
                    } catch (Exception e) {
                        e.printStackTrace();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("writeSampleData:type");
                        LIZ.append(i);
                        LIZ.append("error:");
                        LIZ.append(e);
                        LIZ.append("byteBufsize:");
                        LIZ.append(byteBuffer.remaining());
                        LIZ.append("byteBufcapacity:");
                        LIZ.append(byteBuffer.capacity());
                        LIZ.append("bufferInfo size:");
                        LIZ.append(bufferInfo.size);
                        LIZ.append("offset:");
                        LIZ.append(bufferInfo.offset);
                        LIZ.append("flags:");
                        LIZ.append(bufferInfo.flags);
                        LIZ.append("time:");
                        LIZ.append(bufferInfo.presentationTimeUs);
                        Logger.e("MediaMuxerWrapper", X1D.LIZIZ(LIZ));
                    }
                }
            }
        }
    }
}
