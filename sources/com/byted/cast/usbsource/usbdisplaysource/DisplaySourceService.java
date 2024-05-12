package com.byted.cast.usbsource.usbdisplaysource;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.view.Display;
import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.mediacommon.IMediaRecorder;
import com.byted.cast.mediacommon.IMediaRecorderCallback;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.usbsource.usbcommon.Logger;
import com.byted.cast.usbsource.usbcommon.Service;
import com.byted.cast.usbsource.usbcommon.Transport;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class DisplaySourceService extends Service {
    public static final Object sSync = new Object();
    public volatile long audio_frame_cnt;
    public Handler heartbeatTimehandler;
    public int mAudioSource;
    public int mBitrate;
    public final Callbacks mCallbacks;
    public int mCodectype;
    public Context mContext;
    public boolean mDump;
    public volatile long mFirstFrameTime;
    public volatile long mLastRecevieSinkHeartBeatTime;
    public Transport mLocalTransport;
    public final Logger mLogger;
    public IMediaRecorder mMediaRecorder;
    public int mMicScale;
    public volatile long mQueryTime;
    public IMediaRecorderCallback mRecorderListener;
    public volatile long mResponseTime;
    public MediaSetting mSetting;
    public boolean mSinkAvailable;
    public int mSinkFps;
    public int mSinkHeight;
    public int mSinkWidth;
    public volatile long video_frame_cnt;

    /* loaded from: classes29.dex */
    public interface Callbacks {
        void onDisconnect();

        void onDisplayAdded(Display display);

        void onDisplayRemoved(Display display);
    }

    private void handleSinkAvailable() {
        Logger logger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisplaySourceService handleSinkAvailable:");
        LIZ.append(this.mSinkAvailable);
        logger.log(X1D.LIZIZ(LIZ));
        this.mSinkAvailable = true;
        this.heartbeatTimehandler.sendEmptyMessage(0);
        this.mLastRecevieSinkHeartBeatTime = 0L;
        if (this.mMediaRecorder != null) {
            setAudioSource(this.mAudioSource, this.mMicScale);
            this.mMediaRecorder.setDisplay(this.mSinkWidth, this.mSinkHeight, this.mBitrate, this.mSinkFps);
            this.mMediaRecorder.setResizeScreen(false);
            Utils.onConnect(this.mSinkWidth, this.mSinkHeight, this.mSinkFps);
        }
    }

    public void pause() {
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.pause();
        }
    }

    public void resume() {
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            iMediaRecorder.resume();
        }
    }

    public void sendQuery() {
        this.mLogger.log("DisplaySourceService Sending MSG_QUERY");
        Utils.sendSourceEvent("USB_Msg_Query", "");
        Transport transport = this.mLocalTransport;
        if (transport != null) {
            transport.flushData();
        }
        this.mQueryTime = System.currentTimeMillis();
        Transport transport2 = this.mLocalTransport;
        if (transport2 != null && transport2.sendData(1, 1, 100, 100L, Utils.mConnectId.getBytes(), true)) {
            this.mLogger.log("MSG_QUERY ok");
        }
    }

    public void startRecorder() {
        MirrorInfo mirrorInfo;
        if (!this.mSinkAvailable) {
            return;
        }
        sendMessage(4);
        if (this.mMediaRecorder != null) {
            this.mLogger.log("DisplaySourceService startRecorder");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("display sink available: width=");
            LIZ.append(this.mSinkWidth);
            LIZ.append(", height=");
            LIZ.append(this.mSinkHeight);
            LIZ.append(", fps=");
            LIZ.append(this.mSinkFps);
            LIZ.append(" b:");
            LIZ.append(this.mBitrate);
            LIZ.append(" codectype:");
            LIZ.append(this.mCodectype);
            LIZ.append("audioSource:");
            LIZ.append(this.mAudioSource);
            LIZ.append("micscale:");
            LIZ.append(this.mMicScale);
            Utils.sendSourceEvent("USB_Start_Recorder", X1D.LIZIZ(LIZ));
            Utils.addMediaRecorderCallback(this.mMediaRecorder);
            this.mMediaRecorder.addMediaRecorderCallback(this.mRecorderListener);
            if (Utils.enable && (mirrorInfo = Utils.mMirrorInfo) != null && mirrorInfo.getVideoSrc() == 2 && Utils.mSurfaceListener != null) {
                this.mMediaRecorder.setCaptureSource(MediaSetting.VIDEO_SOURCE_TYPE.EXTERNAL_SURFACE);
                this.mMediaRecorder.setInputSurfaceListener(Utils.mSurfaceListener);
                this.mMediaRecorder.prepareVideoEncoder();
            } else {
                if (Utils.mMirrorInfo != null) {
                    this.mMediaRecorder.setCaptureSource(MediaSetting.VIDEO_SOURCE_TYPE.values()[Utils.mMirrorInfo.getVideoSrc()]);
                } else {
                    this.mMediaRecorder.setCaptureSource(MediaSetting.VIDEO_SOURCE_TYPE.SCREEN);
                }
                this.mMediaRecorder.requestMediaRecord();
                this.mMediaRecorder.start();
            }
        }
    }

    public void stopRecorder() {
        if (!this.mSinkAvailable) {
            return;
        }
        sendMessage(5);
        if (this.mMediaRecorder != null) {
            this.mLogger.log("DisplaySourceService stopRecorder");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("time:");
            LIZ.append(System.currentTimeMillis() - this.mResponseTime);
            Utils.sendSourceEvent("USB_Stop_Recorder", X1D.LIZIZ(LIZ));
            this.mMediaRecorder.removeMediaRecorderCallback(this.mRecorderListener);
            Utils.removeMediaRecorderCallback(this.mMediaRecorder);
            this.mMediaRecorder.stop();
            Utils.onStopRecorder();
            this.mFirstFrameTime = 0L;
            this.video_frame_cnt = 0L;
            this.audio_frame_cnt = 0L;
        }
    }

    public void stopService() {
        this.mLogger.log("DisplaySourceService stopTransport");
        Utils.sendSourceEvent("USB_Stop_Service", "");
        handleSinkNotAvailable(0);
        unregisterService();
        Transport transport = this.mLocalTransport;
        if (transport != null) {
            transport.close();
        }
        this.mLocalTransport = null;
    }

    private boolean parseParam(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        Logger logger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisplaySourceService parseParam:");
        LIZ.append(remaining);
        LIZ.append("content:");
        LIZ.append(byteBuffer.toString());
        logger.log(X1D.LIZIZ(LIZ));
        if (remaining < 4 || remaining > 28) {
            this.mLogger.logError("parseParam Error");
            return false;
        }
        this.mSinkWidth = byteBuffer.getInt();
        if (remaining >= 8) {
            this.mSinkHeight = byteBuffer.getInt();
            if (remaining >= 12) {
                this.mSinkFps = byteBuffer.getInt();
                if (remaining >= 16) {
                    this.mBitrate = byteBuffer.getInt();
                    if (remaining >= 20) {
                        this.mCodectype = byteBuffer.getInt();
                        if (remaining >= 24) {
                            this.mAudioSource = byteBuffer.getInt();
                            if (remaining >= 28) {
                                this.mMicScale = byteBuffer.getInt();
                            }
                        }
                    }
                }
            }
        }
        Logger logger2 = this.mLogger;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("DisplaySourceService parseParam: width=");
        LIZ2.append(this.mSinkWidth);
        LIZ2.append(", height=");
        LIZ2.append(this.mSinkHeight);
        LIZ2.append(", fps=");
        LIZ2.append(this.mSinkFps);
        LIZ2.append(" b:");
        LIZ2.append(this.mBitrate);
        LIZ2.append(", codectype:");
        LIZ2.append(this.mCodectype);
        LIZ2.append(", audioSource:");
        LIZ2.append(this.mAudioSource);
        LIZ2.append(", micScale:");
        LIZ2.append(this.mMicScale);
        logger2.log(X1D.LIZIZ(LIZ2));
        return true;
    }

    private void sendMessage(int i) {
        Transport transport = this.mLocalTransport;
        if (transport != null && transport.sendData(1, i, 100, 100L, null, true)) {
            Logger logger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sendMessage:");
            LIZ.append(i);
            logger.log(X1D.LIZIZ(LIZ));
        }
    }

    public void handleSinkNotAvailable(int i) {
        Logger logger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisplaySourceService handleSinkNotAvailable:");
        LIZ.append(this.mSinkAvailable);
        logger.log(X1D.LIZIZ(LIZ));
        this.heartbeatTimehandler.removeMessages(0);
        Utils.onDisconnect(i);
        this.mQueryTime = 0L;
        this.mResponseTime = 0L;
        this.mFirstFrameTime = 0L;
        this.video_frame_cnt = 0L;
        this.audio_frame_cnt = 0L;
        this.mLastRecevieSinkHeartBeatTime = 0L;
        this.mSinkWidth = 0;
        this.mSinkHeight = 0;
        this.mSinkFps = 0;
        this.mBitrate = 0;
        this.mCodectype = 0;
        this.mAudioSource = 1;
        this.mMicScale = 0;
        stopRecorder();
        this.mSinkAvailable = false;
    }

    public void sendStop(byte[] bArr) {
        Transport transport = this.mLocalTransport;
        if (transport != null && transport.sendData(1, 0, 100, 100L, bArr, true)) {
            this.mLogger.log("sendStop ok");
        }
    }

    public void setAudioCert(Object obj) {
        if (this.mMediaRecorder != null && obj != null) {
            this.mLogger.log("DisplaySourceService setAudioCert");
            this.mMediaRecorder.setAudioCert(obj);
        }
    }

    public void setAudioStopCert(Object obj) {
        if (this.mMediaRecorder != null && obj != null) {
            this.mLogger.log("DisplaySourceService setAudioCert");
            this.mMediaRecorder.setAudioStopCert(obj);
        }
    }

    public void setMediaProjection(MediaProjection mediaProjection) {
        MirrorInfo mirrorInfo;
        if (!this.mSinkAvailable) {
            return;
        }
        if (mediaProjection == null) {
            Logger logger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setMediaProjection : ");
            LIZ.append(mediaProjection);
            logger.logError(X1D.LIZIZ(LIZ));
            sendMessage(7);
            return;
        }
        sendMessage(6);
        if (this.mMediaRecorder != null) {
            this.mLogger.log("DisplaySourceService setMediaProjection");
            this.mMediaRecorder.setMediaProjection(mediaProjection);
            if (Utils.enable && (mirrorInfo = Utils.mMirrorInfo) != null && mirrorInfo.getVideoSrc() == 2) {
                this.mMediaRecorder.start();
            }
        }
    }

    public void startService(ParcelFileDescriptor parcelFileDescriptor) {
        this.mLogger.log("DisplaySourceService startTransport");
        UsbAccessoryStreamTransport usbAccessoryStreamTransport = new UsbAccessoryStreamTransport(this.mLogger, parcelFileDescriptor);
        this.mLocalTransport = usbAccessoryStreamTransport;
        setTransport(usbAccessoryStreamTransport);
        registerService();
        this.mLocalTransport.startReading();
        sendQuery();
    }

    public void dumpFile(byte[] bArr, String str) {
        String path = C16880lQ.LLIIJI(this.mContext, null).getPath();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(path);
        LIZ.append(str);
        try {
            FileChannel channel = new FileOutputStream(new File(X1D.LIZIZ(LIZ)), true).getChannel();
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.position(0);
            channel.write(wrap);
            channel.close();
        } catch (IOException unused) {
        }
    }

    public void setAudioSource(int i, int i2) {
        Logger logger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisplaySourceService setAudioSource:");
        LIZ.append(i);
        LIZ.append("micScale:");
        LIZ.append(i2);
        logger.log(X1D.LIZIZ(LIZ));
        IMediaRecorder iMediaRecorder = this.mMediaRecorder;
        if (iMediaRecorder != null) {
            if (i == 0) {
                iMediaRecorder.setAudioEnable(false);
                return;
            }
            if (i == 1) {
                iMediaRecorder.setAudioEnable(true);
                this.mMediaRecorder.enableAudioMix(false);
                this.mMediaRecorder.setAudioSource(8);
                return;
            }
            if (i == 2) {
                iMediaRecorder.setAudioEnable(true);
                this.mMediaRecorder.enableAudioMix(false);
                this.mMediaRecorder.setAudioSource(1);
            } else {
                if (i == 3) {
                    iMediaRecorder.setAudioEnable(true);
                    this.mMediaRecorder.enableAudioMix(true);
                    this.mMediaRecorder.setAudioSource(8);
                    this.mMediaRecorder.setAudioMixScale(i2);
                    this.mMediaRecorder.setSeparateAudio(false);
                    return;
                }
                if (i != 4) {
                    return;
                }
                iMediaRecorder.setAudioEnable(true);
                this.mMediaRecorder.enableAudioMix(true);
                this.mMediaRecorder.setAudioSource(8);
                this.mMediaRecorder.setSeparateAudio(true);
            }
        }
    }

    public DisplaySourceService(Context context, Callbacks callbacks, Logger logger) {
        super(context, 2);
        this.mAudioSource = 1;
        this.heartbeatTimehandler = new Handler() { // from class: com.byted.cast.usbsource.usbdisplaysource.DisplaySourceService.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what != 0) {
                    return;
                }
                if (DisplaySourceService.this.mLastRecevieSinkHeartBeatTime != 0 && System.currentTimeMillis() - DisplaySourceService.this.mLastRecevieSinkHeartBeatTime > 5000) {
                    DisplaySourceService.this.mLogger.logError("DisplaySourceService HeartBeat Timeout!!!");
                    DisplaySourceService.this.handleSinkNotAvailable(2);
                } else {
                    sendMessageDelayed(Message.obtain(this, 0), 1000L);
                }
            }
        };
        this.mRecorderListener = new IMediaRecorderCallback() { // from class: com.byted.cast.usbsource.usbdisplaysource.DisplaySourceService.2
            public byte[] spspps;

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onAudioEncoder(String str, int i, int i2, int i3, int i4) {
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onPaused() {
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onResumed() {
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onStopped() {
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onVideoEncoder(String str, int i, int i2, int i3, int i4) {
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onAudioRecordFailed(int i) {
                Utils.onError(i, "onAudioRecordFailed");
                Logger logger2 = DisplaySourceService.this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DisplaySourceService onAudioRecordFailed: ");
                LIZ.append(i);
                logger2.logError(X1D.LIZIZ(LIZ));
                DisplaySourceService.this.sendStop(null);
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onVideoRecordError(int i, String str) {
                Utils.onError(i, str);
                Logger logger2 = DisplaySourceService.this.mLogger;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("DisplaySourceService onVideoRecordError: ");
                LIZ.append(i);
                LIZ.append(" message:");
                LIZ.append(str);
                logger2.logError(X1D.LIZIZ(LIZ));
                DisplaySourceService.this.sendStop(null);
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onAudioFrameAvailable(byte[] bArr, int i, MediaSetting.ACODEC_ID acodec_id, long j) {
                DisplaySourceService displaySourceService = DisplaySourceService.this;
                if (!displaySourceService.mSinkAvailable || displaySourceService.mLocalTransport == null || displaySourceService.mAudioSource == 4) {
                    return;
                }
                if (displaySourceService.mDump) {
                    displaySourceService.dumpFile(bArr, "/audio.aac");
                }
                if (!DisplaySourceService.this.mLocalTransport.sendData(1, 3, 20, j, bArr, false)) {
                    Utils.sendSourceEvent("USB_ERROR", 300005, "sendData error, transport was closed", "");
                }
                DisplaySourceService.this.audio_frame_cnt++;
                if (DisplaySourceService.this.audio_frame_cnt != 100) {
                    return;
                }
                DisplaySourceService.this.audio_frame_cnt = 0L;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("source", "audio");
                    jSONObject.put("encode", ((System.nanoTime() / 1000) - j) / 1000);
                    Utils.sendSourceEvent("USB_Encoder_Statistics", jSONObject.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onAudioPcm(byte[] bArr, int i, int i2, int i3, int i4, long j) {
                Transport transport;
                DisplaySourceService displaySourceService = DisplaySourceService.this;
                if (!displaySourceService.mSinkAvailable || (transport = displaySourceService.mLocalTransport) == null || displaySourceService.mAudioSource != 4) {
                    return;
                }
                if (bArr.length < 4 || bArr[0] != 66 || bArr[1] != 121 || bArr[2] != 116 || bArr[3] != 101) {
                    displaySourceService.mLogger.logError("DisplaySourceService onAudioPcm Do not has type: Byte!!!");
                } else if (!transport.sendData(1, 3, 20, j, bArr, false)) {
                    Utils.sendSourceEvent("USB_ERROR", 300005, "sendData error, transport was closed", "");
                }
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onVideoFrameCodec(byte[] bArr, int i, int i2, int i3, MediaSetting.VideoFormat videoFormat, long j, int i4) {
                DisplaySourceService displaySourceService = DisplaySourceService.this;
                if (!displaySourceService.mSinkAvailable || displaySourceService.mLocalTransport == null) {
                    return;
                }
                if (displaySourceService.mDump) {
                    displaySourceService.dumpFile(bArr, "/video.h264");
                }
                if (DisplaySourceService.this.mFirstFrameTime == 0) {
                    Utils.onStartRecorder();
                    DisplaySourceService.this.mFirstFrameTime = System.currentTimeMillis();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("time:");
                    LIZ.append(DisplaySourceService.this.mFirstFrameTime - DisplaySourceService.this.mResponseTime);
                    Utils.sendSourceEvent("USB_First_Frame_Delay", X1D.LIZIZ(LIZ));
                }
                byte[] bArr2 = new byte[bArr.length];
                this.spspps = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, i);
                Logger logger2 = DisplaySourceService.this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("DisplaySourceService onVideoFrameCodec: ");
                LIZ2.append(i);
                logger2.log(X1D.LIZIZ(LIZ2));
            }

            @Override // com.byted.cast.mediacommon.IMediaRecorderCallback
            public void onVideoFrameAvailable(byte[] bArr, int i, int i2, int i3, MediaSetting.VideoFormat videoFormat, long j, int i4, int i5) {
                boolean z;
                DisplaySourceService displaySourceService = DisplaySourceService.this;
                if (!displaySourceService.mSinkAvailable || displaySourceService.mLocalTransport == null) {
                    return;
                }
                if (displaySourceService.mDump) {
                    displaySourceService.dumpFile(bArr, "/video.h264");
                }
                if (i5 == 1 && !DisplaySourceService.this.mLocalTransport.sendData(1, 2, 0, 0L, this.spspps, true)) {
                    Utils.sendSourceEvent("USB_ERROR", 300005, "sendData error, transport was closed", "");
                }
                Transport transport = DisplaySourceService.this.mLocalTransport;
                if (i5 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!transport.sendData(1, 2, 10, j, bArr, z)) {
                    Utils.sendSourceEvent("USB_ERROR", 300005, "sendData error, transport was closed", "");
                }
                DisplaySourceService.this.video_frame_cnt++;
                if (DisplaySourceService.this.video_frame_cnt != 100) {
                    return;
                }
                DisplaySourceService.this.video_frame_cnt = 0L;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("source", "video");
                    jSONObject.put("encode", ((System.nanoTime() / 1000) - j) / 1000);
                    Utils.sendSourceEvent("USB_Encoder_Statistics", jSONObject.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        this.mContext = context;
        this.mCallbacks = callbacks;
        this.mLogger = logger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DisplaySourceService mContext: ");
        LIZ.append(this.mContext);
        logger.log(X1D.LIZIZ(LIZ));
        MediaSetting mediaSetting = new MediaSetting(false, false);
        this.mSetting = mediaSetting;
        mediaSetting.getVideoProfile().setNeedResize(false);
        this.mSetting.setConfig(Utils.config);
        try {
            Class<?> cls = Class.forName("com.byted.cast.capture.ByteMediaRecorder");
            this.mMediaRecorder = (IMediaRecorder) cls.getMethod("getInstance", Context.class, MediaSetting.class).invoke(cls, this.mContext, this.mSetting);
        } catch (Throwable th) {
            this.mMediaRecorder = null;
            Logger logger2 = this.mLogger;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("create ByteMediaRecorder fail : ");
            LIZ2.append(th.toString());
            logger2.logError(X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.byted.cast.usbsource.usbcommon.Service, com.byted.cast.usbsource.usbcommon.Transport.Callback
    public void onMessageReceived(int i, int i2, ByteBuffer byteBuffer) {
        int i3;
        int i4;
        int i5;
        switch (i2) {
            case 0:
                startRecorder();
                return;
            case 1:
                if (this.mResponseTime == 0) {
                    this.mResponseTime = System.currentTimeMillis();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("time:");
                    LIZ.append(this.mResponseTime - this.mQueryTime);
                    Utils.sendSourceEvent("USB_Msg_Query_Success", X1D.LIZIZ(LIZ));
                }
                this.mLogger.log("DisplaySourceService Received MSG_SINK_AVAILABLE");
                Utils.sendSourceEvent("USB_Sink_Avaliable", byteBuffer.toString());
                if (parseParam(byteBuffer)) {
                    int i6 = this.mSinkWidth;
                    if (i6 >= 0 && i6 <= 4096 && (i3 = this.mSinkHeight) >= 0 && i3 <= 4096 && (i4 = this.mSinkFps) >= 0 && i4 <= 800 && (i5 = this.mBitrate) >= 0 && i5 <= 20480) {
                        this.mLogger.log("DisplaySourceService Receive MSG_SINK_AVAILABLE message.");
                        handleSinkAvailable();
                        return;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("DisplaySourceService ERROR w:");
                    LIZ2.append(this.mSinkWidth);
                    LIZ2.append(" h:");
                    LIZ2.append(this.mSinkHeight);
                    LIZ2.append(" fps:");
                    LIZ2.append(this.mSinkFps);
                    LIZ2.append(" bitrate:");
                    LIZ2.append(this.mBitrate);
                    LIZ2.append(" codetype:");
                    LIZ2.append(this.mCodectype);
                    Utils.sendSourceEvent("USB_ERROR", 300007, X1D.LIZIZ(LIZ2), "");
                    Logger logger = this.mLogger;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("DisplaySourceService ERROR w ");
                    LIZ3.append(this.mSinkWidth);
                    LIZ3.append(" h ");
                    LIZ3.append(this.mSinkHeight);
                    LIZ3.append(" fps");
                    LIZ3.append(this.mSinkFps);
                    LIZ3.append(" bitrate:");
                    LIZ3.append(this.mBitrate);
                    LIZ3.append(" codetype:");
                    LIZ3.append(this.mCodectype);
                    logger.logError(X1D.LIZIZ(LIZ3));
                    return;
                }
                Utils.sendSourceEvent("USB_ERROR", 300007, byteBuffer.toString(), "");
                this.mLogger.logError("DisplaySourceService Receive invalid MSG_SINK_AVAILABLE message.");
                return;
            case 2:
                this.mLogger.log("DisplaySourceService Received MSG_SINK_NOT_AVAILABLE");
                Utils.sendSourceEvent("USB_Sink_NotAvaliable", "");
                handleSinkNotAvailable(1);
                sendStop(null);
                return;
            case 3:
                if (this.mMediaRecorder == null) {
                    return;
                }
                this.mLogger.log("DisplaySourceService Received MSG_SINK_REQUERT_IDR");
                this.mMediaRecorder.requestIDR();
                return;
            case 4:
                this.mLogger.log("DisplaySourceService Received MSG_SINK_REQUERT_HANDSHAKES");
                sendQuery();
                return;
            case 5:
                this.mLogger.log("DisplaySourceService Received MSG_SINK_SET_AUDIO_SOURCE");
                if (!parseParam(byteBuffer)) {
                    return;
                }
                setAudioSource(this.mAudioSource, this.mMicScale);
                return;
            case 6:
                this.mLogger.log("DisplaySourceService Received MSG_TRANSPORT_DISCONNECT");
                handleSinkNotAvailable(2);
                return;
            case 7:
                this.mLogger.log("DisplaySourceService Received MSG_SINK_HEARTBEAT");
                this.mLastRecevieSinkHeartBeatTime = System.currentTimeMillis();
                return;
            default:
                return;
        }
    }
}
