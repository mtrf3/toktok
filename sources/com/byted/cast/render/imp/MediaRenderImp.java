package com.byted.cast.render.imp;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.os.Build;
import android.view.Surface;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.render.IAudioFrameListener;
import com.byted.cast.mediacommon.render.ILatencyListener;
import com.byted.cast.mediacommon.render.IVideoFrameListener;
import com.byted.cast.mediacommon.render.MediaRenderState;
import com.byted.cast.mediacommon.render.parameters.AudioParameter;
import com.byted.cast.mediacommon.render.parameters.CodecId;
import com.byted.cast.mediacommon.render.parameters.MediaParameter;
import com.byted.cast.mediacommon.render.parameters.MediaRenderErrorCode;
import com.byted.cast.mediacommon.render.parameters.VideoParameter;
import com.byted.cast.render.datasource.IDataSourceListener;
import com.byted.cast.render.datasource.UrlDataSource;
import com.byted.cast.render.decoder.IMediaDecoder;
import com.byted.cast.render.decoder.IMediaDecoderListener;
import com.byted.cast.render.decoder.MediaCodecDecoder;
import com.byted.cast.render.decoder.NativeVideoDecoder;
import com.byted.cast.render.jitterbuffer.AudioJitterBuffer;
import com.byted.cast.render.jitterbuffer.JitterBufferListener;
import com.byted.cast.render.jitterbuffer.VideoJitterBuffer;
import com.byted.cast.render.parser.AVParser;
import com.byted.cast.render.render.audio.AudioTrackRender;
import com.byted.cast.render.render.audio.IAudioRender;
import com.byted.cast.render.render.video.IVideoRender;
import com.byted.cast.render.render.video.NativeRender;
import com.byted.cast.render.utils.Dump;
import com.byted.cast.render.utils.LatencyControl;
import com.byted.cast.render.utils.Logger;
import com.byted.cast.render.utils.Utils;
import java.io.File;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes29.dex */
public class MediaRenderImp {
    public static int instances;
    public String TAG;
    public final LatencyControl audioLatencyControl;
    public AVParser avParser;
    public final String deviceName;
    public boolean isUseVideoNativeDecoder;
    public boolean isUseVideoRender;
    public String renderDumpPath;
    public final String userId;
    public IMediaDecoder videoDecoder;
    public final LatencyControl videoLatencyControl;
    public VideoParameter videoParameter;
    public final HashMap<Integer, IMediaDecoder> audioDecoders = new HashMap<>();
    public AudioJitterBuffer audioJitterBuffer = null;
    public VideoJitterBuffer videoJitterBuffer = null;
    public IAudioRender audioRender = null;
    public IVideoRender videoRender = null;
    public Surface surface = null;
    public int channels = 2;
    public int sampleRate = 48000;
    public int bitWidth = 16;
    public int bitRate = 64;
    public int frameSize = 4096;
    public int width = 1920;
    public int height = 1080;
    public int stride = 1920;
    public int sliceHeight = 1080;
    public int renderColorFormat = 19;
    public final HashMap<Integer, AudioParameter> audioParameters = new HashMap<>();
    public IVideoFrameListener videoFrameListener = null;
    public IAudioFrameListener audioFrameListener = null;
    public int vaildVideoFramesIndex = 0;
    public int vaildAudioFramesIndex = 0;
    public boolean isPlayAudio = true;
    public float gain = 1.0f;
    public boolean isOpenJitterBuffer = true;
    public int videoJitterBufferDelayMs = 100;
    public int audioJitterBufferDelayMs = 100;
    public VideoJitterBuffer.JITTER_MODE videoJitterBufferMode = VideoJitterBuffer.JITTER_MODE.QUALITY_STATIC_MODE;
    public AudioJitterBuffer.JITTER_MODE audioJitterBufferMode = AudioJitterBuffer.JITTER_MODE.QUALITY_STATIC_MODE;
    public final Dump dumpPacket = new Dump();
    public final Dump dumpFrame = new Dump();
    public final Dump dumpAudio = new Dump();
    public final Dump dumpPcm = new Dump();
    public File dumpEnableFile = null;
    public File ffmpegEnableFile = null;
    public File renderEnableFile = null;
    public File audioEnableFile = null;
    public boolean isOpenDumpFrame = false;
    public boolean isOpenDumpAudio = false;
    public final int MaxDumpFrames = 50;
    public int curDumpFrames = 0;
    public Context context = null;
    public UrlDataSource urlDataSource = null;

    private void initAudioJitterBuffer() {
        AudioJitterBuffer audioJitterBuffer = new AudioJitterBuffer();
        this.audioJitterBuffer = audioJitterBuffer;
        audioJitterBuffer.setJitterCallback(new JitterBufferListener() { // from class: com.byted.cast.render.imp.MediaRenderImp.2
            @Override // com.byted.cast.render.jitterbuffer.JitterBufferListener
            public void onAudioReadyToPlay() {
                MediaRenderImp mediaRenderImp = MediaRenderImp.this;
                if (mediaRenderImp.audioRender == null) {
                    mediaRenderImp.startAudioRender();
                }
            }

            @Override // com.byted.cast.render.jitterbuffer.JitterBufferListener
            public void onAVSmoothOutput(byte[] bArr, long j) {
                IAudioRender iAudioRender = MediaRenderImp.this.audioRender;
                if (iAudioRender != null) {
                    iAudioRender.render(bArr, bArr.length);
                    MediaRenderImp.this.audioLatencyControl.rendered(0, j);
                }
            }
        });
        audioJitterBuffer.setAudioFormat(this.sampleRate, this.channels, this.bitWidth / 8);
        this.audioJitterBuffer.setJitterMode(this.audioJitterBufferMode);
        this.audioJitterBuffer.setJitterPrefetchSize((((((this.audioJitterBufferDelayMs * this.channels) * (this.bitWidth / 8)) * this.sampleRate) / 1000) / this.frameSize) + 1);
        this.audioJitterBuffer.setVideoJitterBuffer(this.videoJitterBuffer);
        VideoJitterBuffer videoJitterBuffer = this.videoJitterBuffer;
        if (videoJitterBuffer != null) {
            videoJitterBuffer.setAudioJitterBuffer(this.audioJitterBuffer);
        }
    }

    private void initVideoDecoder() {
        VideoParameter videoParameter = this.videoParameter;
        if (videoParameter == null) {
            return;
        }
        if (this.isUseVideoNativeDecoder) {
            this.videoDecoder = new NativeVideoDecoder(this.userId, videoParameter.codecId);
        } else {
            MediaCodecDecoder mediaCodecDecoder = new MediaCodecDecoder(this.userId, videoParameter.codecId);
            mediaCodecDecoder.setVideoJitterBuffer(this.videoJitterBuffer);
            VideoParameter videoParameter2 = this.videoParameter;
            mediaCodecDecoder.config_video_parameters(videoParameter2.width, videoParameter2.height, videoParameter2.fps);
            this.videoDecoder = mediaCodecDecoder;
        }
        if (!this.isUseVideoRender && !this.isUseVideoNativeDecoder) {
            ((MediaCodecDecoder) this.videoDecoder).setSurface(this.surface);
        }
        this.videoDecoder.setMediaDecoderListener(new IMediaDecoderListener() { // from class: com.byted.cast.render.imp.MediaRenderImp.3
            @Override // com.byted.cast.render.decoder.IMediaDecoderListener
            public void OnAVFrameAvailable(byte[] bArr, long j) {
                IVideoRender iVideoRender;
                MediaRenderImp.this.videoLatencyControl.decoded(0, j);
                MediaRenderImp mediaRenderImp = MediaRenderImp.this;
                if (mediaRenderImp.isOpenDumpFrame && mediaRenderImp.dumpFrame.isReady() && bArr != null) {
                    MediaRenderImp mediaRenderImp2 = MediaRenderImp.this;
                    if (mediaRenderImp2.curDumpFrames < 50) {
                        mediaRenderImp2.dumpFrame.writeData(bArr);
                        MediaRenderImp.this.curDumpFrames++;
                    }
                }
                MediaRenderImp mediaRenderImp3 = MediaRenderImp.this;
                if ((mediaRenderImp3.isUseVideoRender || mediaRenderImp3.isUseVideoNativeDecoder) && (iVideoRender = mediaRenderImp3.videoRender) != null && bArr != null) {
                    iVideoRender.render(bArr, bArr.length);
                }
            }

            @Override // com.byted.cast.render.decoder.IMediaDecoderListener
            public void OnAVFrameRendered(byte[] bArr, long j) {
                MediaRenderImp.this.videoLatencyControl.rendered(0, j);
            }

            @Override // com.byted.cast.render.decoder.IMediaDecoderListener
            public void OnError(int i, String str) {
                MediaRenderErrorCode.onError(MediaRenderImp.this.userId, i, str);
                MediaRenderImp mediaRenderImp = MediaRenderImp.this;
                IVideoFrameListener iVideoFrameListener = mediaRenderImp.videoFrameListener;
                if (iVideoFrameListener != null) {
                    iVideoFrameListener.onError(mediaRenderImp.userId, 0, i);
                }
            }

            @Override // com.byted.cast.render.decoder.IMediaDecoderListener
            public void OnVideoSizeChanged(int i, int i2, int i3, int i4, int i5) {
                MediaRenderImp mediaRenderImp = MediaRenderImp.this;
                mediaRenderImp.width = i;
                mediaRenderImp.height = i2;
                mediaRenderImp.stride = i3;
                mediaRenderImp.sliceHeight = i4;
                String str = mediaRenderImp.TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("OnVideoSizeChanged: newWidth: ");
                LIZ.append(i);
                LIZ.append(", newHeight: ");
                LIZ.append(i2);
                LIZ.append(", newStride: ");
                LIZ.append(i3);
                LIZ.append(", newSliceHeight: ");
                LIZ.append(i4);
                LIZ.append(", colorFormat:");
                LIZ.append(i5);
                Logger.i(str, X1D.LIZIZ(LIZ));
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("userId", MediaRenderImp.this.userId);
                    jSONObject.put("width", i);
                    jSONObject.put("height", i2);
                    jSONObject.put("stride", i3);
                    jSONObject.put("sliceHeight", i4);
                    jSONObject.put("colorFormat", i5);
                    MediaMonitor.onSinkMonitor("MediaRender_VideoSizeChanged", jSONObject.toString());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                MediaRenderImp mediaRenderImp2 = MediaRenderImp.this;
                mediaRenderImp2.renderColorFormat = i5;
                if (mediaRenderImp2.deviceName.equals("cupid_p2")) {
                    MediaRenderImp mediaRenderImp3 = MediaRenderImp.this;
                    int i6 = mediaRenderImp3.stride;
                    int i7 = mediaRenderImp3.width;
                    if (i6 < i7) {
                        mediaRenderImp3.stride = i7;
                        mediaRenderImp3.sliceHeight = mediaRenderImp3.height;
                    }
                    mediaRenderImp3.renderColorFormat = 1;
                }
                MediaRenderImp mediaRenderImp4 = MediaRenderImp.this;
                IVideoFrameListener iVideoFrameListener = mediaRenderImp4.videoFrameListener;
                if (iVideoFrameListener != null) {
                    iVideoFrameListener.OnVideoSizeChanged(mediaRenderImp4.userId, 0, i, i2, 0);
                }
                MediaRenderImp mediaRenderImp5 = MediaRenderImp.this;
                if (mediaRenderImp5.isUseVideoRender || mediaRenderImp5.isUseVideoNativeDecoder) {
                    IVideoRender iVideoRender = mediaRenderImp5.videoRender;
                    if (iVideoRender != null) {
                        iVideoRender.stop();
                        MediaRenderImp.this.videoRender = null;
                    }
                    MediaRenderImp.this.startVideoRender();
                }
            }
        });
    }

    private void initVideoJitterBuffer() {
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initVideoJitterBuffer audioJitterBuffer = ");
        LIZ.append(this.audioJitterBuffer);
        Logger.d(str, X1D.LIZIZ(LIZ));
        String str2 = this.TAG;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("initVideoJitterBuffer videoJitterBufferMode = ");
        LIZ2.append(this.videoJitterBufferMode);
        Logger.d(str2, X1D.LIZIZ(LIZ2));
        VideoJitterBuffer videoJitterBuffer = new VideoJitterBuffer();
        this.videoJitterBuffer = videoJitterBuffer;
        videoJitterBuffer.setAudioJitterBuffer(this.audioJitterBuffer);
        this.videoJitterBuffer.setJitterMode(this.videoJitterBufferMode);
        this.videoJitterBuffer.setJitterCallback(new JitterBufferListener() { // from class: com.byted.cast.render.imp.MediaRenderImp.1
            @Override // com.byted.cast.render.jitterbuffer.JitterBufferListener
            public void onAudioReadyToPlay() {
            }

            @Override // com.byted.cast.render.jitterbuffer.JitterBufferListener
            public void onAVSmoothOutput(byte[] bArr, long j) {
                MediaRenderImp mediaRenderImp = MediaRenderImp.this;
                if (mediaRenderImp.videoDecoder != null) {
                    mediaRenderImp.videoLatencyControl.decodeIn(0, j);
                    MediaRenderImp.this.videoDecoder.sendPacket(bArr, j);
                }
            }
        });
        this.videoJitterBuffer.setJitterDelay(this.videoJitterBufferDelayMs);
        AudioJitterBuffer audioJitterBuffer = this.audioJitterBuffer;
        if (audioJitterBuffer != null) {
            audioJitterBuffer.setVideoJitterBuffer(this.videoJitterBuffer);
        }
    }

    public void startAudioRender() {
        AudioTrackRender audioTrackRender = new AudioTrackRender(this.userId);
        this.audioRender = audioTrackRender;
        audioTrackRender.config_audio_parameters(this.sampleRate, this.channels, this.bitWidth);
        this.audioRender.start();
    }

    public void startVideoRender() {
        NativeRender nativeRender = new NativeRender(this.userId, this.deviceName, Build.VERSION.SDK_INT);
        this.videoRender = nativeRender;
        nativeRender.config_video_parameters(this.width, this.height, this.stride, this.sliceHeight, this.renderColorFormat);
        this.videoRender.setSurface(this.surface);
        String str = this.renderDumpPath;
        if (str != null) {
            this.videoRender.setDumpPath(str);
            this.videoRender.isOpenDump(this.isOpenDumpFrame);
        }
        this.videoRender.start();
    }

    public MediaRenderImp(String str) {
        this.TAG = "MediaRenderImp";
        this.isUseVideoRender = false;
        this.isUseVideoNativeDecoder = false;
        this.userId = str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.TAG);
        LIZ.append("/");
        LIZ.append(str);
        this.TAG = X1D.LIZIZ(LIZ);
        this.videoLatencyControl = new LatencyControl(str, "video");
        this.audioLatencyControl = new LatencyControl(str, "audio");
        String property = Utils.getProperty("ro.product.name", "");
        this.deviceName = property;
        if (instances > 0) {
            if (property.equals("VIDAA_TV") || property.equals("KKHi3751V563") || property.equals("aosp_arbutus") || property.equals("xmen") || property.equals("aosp_pitaya") || property.equals("PD2183")) {
                this.isUseVideoRender = true;
            }
            if (property.equals("dredd") || property.equals("HiTV-M1")) {
                this.isUseVideoNativeDecoder = true;
            }
        }
        String str2 = this.TAG;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("created mediarender success, userId: ");
        LIZ2.append(str);
        Logger.i(str2, X1D.LIZIZ(LIZ2));
    }

    private IMediaDecoder createAudioDecoder(final int i) {
        AudioParameter audioParameter;
        if (!this.audioParameters.containsKey(Integer.valueOf(i)) || (audioParameter = this.audioParameters.get(Integer.valueOf(i))) == null) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.userId);
        LIZ.append(":");
        LIZ.append(i);
        MediaCodecDecoder mediaCodecDecoder = new MediaCodecDecoder(X1D.LIZIZ(LIZ), audioParameter.codecId);
        mediaCodecDecoder.config_audio_parameters(audioParameter.sampleRate, audioParameter.channels, audioParameter.bitWidth, audioParameter.frameSize);
        mediaCodecDecoder.setMediaDecoderListener(new IMediaDecoderListener() { // from class: com.byted.cast.render.imp.MediaRenderImp.4
            @Override // com.byted.cast.render.decoder.IMediaDecoderListener
            public void OnAVFrameRendered(byte[] bArr, long j) {
            }

            @Override // com.byted.cast.render.decoder.IMediaDecoderListener
            public void OnVideoSizeChanged(int i2, int i3, int i4, int i5, int i6) {
            }

            @Override // com.byted.cast.render.decoder.IMediaDecoderListener
            public void OnAVFrameAvailable(byte[] bArr, long j) {
                MediaRenderImp.this.audioLatencyControl.decoded(i, j);
                MediaRenderImp mediaRenderImp = MediaRenderImp.this;
                if (mediaRenderImp.isOpenDumpAudio && mediaRenderImp.dumpPcm.isReady()) {
                    MediaRenderImp.this.dumpPcm.writeData(bArr);
                }
                MediaRenderImp mediaRenderImp2 = MediaRenderImp.this;
                AudioJitterBuffer audioJitterBuffer = mediaRenderImp2.audioJitterBuffer;
                if (audioJitterBuffer != null) {
                    audioJitterBuffer.append(bArr, j);
                } else {
                    IAudioRender iAudioRender = mediaRenderImp2.audioRender;
                    if (iAudioRender != null) {
                        iAudioRender.render(bArr, bArr.length);
                        MediaRenderImp.this.audioLatencyControl.rendered(i, j);
                    }
                }
                MediaRenderImp mediaRenderImp3 = MediaRenderImp.this;
                IAudioFrameListener iAudioFrameListener = mediaRenderImp3.audioFrameListener;
                if (iAudioFrameListener != null) {
                    iAudioFrameListener.onAudioOutput(mediaRenderImp3.userId, i, bArr, mediaRenderImp3.sampleRate, mediaRenderImp3.channels, mediaRenderImp3.bitWidth, mediaRenderImp3.bitRate, j);
                }
            }

            @Override // com.byted.cast.render.decoder.IMediaDecoderListener
            public void OnError(int i2, String str) {
                MediaRenderErrorCode.onError(MediaRenderImp.this.userId, i2, str);
                MediaRenderImp mediaRenderImp = MediaRenderImp.this;
                IAudioFrameListener iAudioFrameListener = mediaRenderImp.audioFrameListener;
                if (iAudioFrameListener != null) {
                    iAudioFrameListener.onError(mediaRenderImp.userId, i, i2);
                }
            }
        });
        return mediaCodecDecoder;
    }

    public MediaRenderState getAudioState(int i) {
        if (!this.audioDecoders.containsKey(Integer.valueOf(i))) {
            return MediaRenderState.STATE_UNINITIALIZED;
        }
        return this.audioDecoders.get(Integer.valueOf(i)).getState();
    }

    public Object getParameter(MediaParameter mediaParameter) {
        boolean z;
        if (mediaParameter == MediaParameter.Audio_Render_BitWidth) {
            return Integer.valueOf(this.bitWidth);
        }
        if (mediaParameter == MediaParameter.Audio_Render_SampleRate) {
            return Integer.valueOf(this.sampleRate);
        }
        if (mediaParameter == MediaParameter.Audio_Render_Channel) {
            return Integer.valueOf(this.channels);
        }
        if (mediaParameter == MediaParameter.Audio_Render_SessionId) {
            IAudioRender iAudioRender = this.audioRender;
            if (iAudioRender != null) {
                return ((AudioTrackRender) iAudioRender).getParameter(mediaParameter);
            }
            return null;
        }
        if (mediaParameter == MediaParameter.Audio_IsAutoPlay) {
            return Boolean.valueOf(this.isPlayAudio);
        }
        if (mediaParameter == MediaParameter.Video_Decoder_IsSetSurface) {
            if (this.surface != null) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        if (mediaParameter == MediaParameter.Audio_Render_volume) {
            return Float.valueOf(this.gain);
        }
        if (mediaParameter == MediaParameter.Audio_Render_max_vol) {
            IAudioRender iAudioRender2 = this.audioRender;
            if (iAudioRender2 != null) {
                return Float.valueOf(iAudioRender2.getMaxVol());
            }
            return null;
        }
        if (mediaParameter == MediaParameter.Audio_Render_min_vol) {
            IAudioRender iAudioRender3 = this.audioRender;
            if (iAudioRender3 != null) {
                return Float.valueOf(iAudioRender3.getMinVol());
            }
            return null;
        }
        if (mediaParameter == MediaParameter.Render_IsUseSoftDecoder) {
            return Boolean.valueOf(this.isUseVideoNativeDecoder);
        }
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setParameter key not found! key: ");
        LIZ.append(mediaParameter);
        Logger.e(str, X1D.LIZIZ(LIZ));
        return null;
    }

    public MediaRenderState getVideoState(int i) {
        IMediaDecoder iMediaDecoder = this.videoDecoder;
        if (iMediaDecoder == null) {
            return MediaRenderState.STATE_UNINITIALIZED;
        }
        return iMediaDecoder.getState();
    }

    public void sendAVStream(byte[] bArr) {
        AVParser aVParser = this.avParser;
        if (aVParser != null) {
            aVParser.sendStream(bArr);
        }
    }

    public void setAudioFrameListener(IAudioFrameListener iAudioFrameListener) {
        this.audioFrameListener = iAudioFrameListener;
    }

    public void setUrl(String str) {
        if (!str.isEmpty()) {
            UrlDataSource urlDataSource = new UrlDataSource();
            this.urlDataSource = urlDataSource;
            urlDataSource.setDataListener(new IDataSourceListener() { // from class: com.byted.cast.render.imp.MediaRenderImp.5
                @Override // com.byted.cast.render.datasource.IDataSourceListener
                public void onAudioPacketAvailable(byte[] bArr, long j) {
                    MediaRenderImp.this.sendAudioPacket(0, bArr, j);
                }

                @Override // com.byted.cast.render.datasource.IDataSourceListener
                public void onVideoPacketAvailable(byte[] bArr, long j) {
                    MediaRenderImp.this.sendVideoPacket(0, bArr, j);
                }
            });
            this.urlDataSource.setUrl(str);
        }
    }

    public void setVideoFrameListener(IVideoFrameListener iVideoFrameListener) {
        this.videoFrameListener = iVideoFrameListener;
    }

    public boolean startAudioPlayer(int i) {
        IMediaDecoder iMediaDecoder;
        if (!this.audioDecoders.containsKey(Integer.valueOf(i))) {
            iMediaDecoder = createAudioDecoder(i);
            if (this.audioDecoders.isEmpty()) {
                if (this.isOpenJitterBuffer) {
                    initAudioJitterBuffer();
                }
                startAudioRender();
            }
            this.audioDecoders.put(Integer.valueOf(i), iMediaDecoder);
        } else {
            iMediaDecoder = this.audioDecoders.get(Integer.valueOf(i));
        }
        if (iMediaDecoder != null) {
            iMediaDecoder.start();
        }
        AudioJitterBuffer audioJitterBuffer = this.audioJitterBuffer;
        if (audioJitterBuffer != null) {
            audioJitterBuffer.start();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", this.userId);
            jSONObject.put("result", "succ");
            MediaMonitor.onSinkMonitor("MediaRender_StartAudioPlayer", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Logger.i(this.TAG, "audioPlayer start success");
        return true;
    }

    public boolean startVideoPlayer(int i) {
        if (this.isOpenJitterBuffer && this.videoJitterBuffer == null) {
            initVideoJitterBuffer();
        }
        initVideoDecoder();
        VideoJitterBuffer videoJitterBuffer = this.videoJitterBuffer;
        if (videoJitterBuffer != null) {
            videoJitterBuffer.start();
        }
        IMediaDecoder iMediaDecoder = this.videoDecoder;
        if (iMediaDecoder != null) {
            iMediaDecoder.start();
        }
        UrlDataSource urlDataSource = this.urlDataSource;
        if (urlDataSource != null) {
            urlDataSource.start();
        }
        instances++;
        Logger.i(this.TAG, "videoPlayer start success");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", this.userId);
            jSONObject.put("result", "succ");
            MediaMonitor.onSinkMonitor("MediaRender_StartVideoPlayer", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean stopAudioPlayer(int i) {
        Logger.i(this.TAG, "AudioPlayer stop");
        if (!this.audioDecoders.containsKey(Integer.valueOf(i))) {
            String str = this.TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioPlayer is not exist, id: ");
            LIZ.append(i);
            Logger.e(str, X1D.LIZIZ(LIZ));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userId", this.userId);
                jSONObject.put("result", "failed");
                MediaMonitor.onSinkMonitor("MediaRender_StopAudioPlayer", jSONObject.toString());
                return false;
            } catch (JSONException e) {
                e.printStackTrace();
                return false;
            }
        }
        IMediaDecoder iMediaDecoder = this.audioDecoders.get(Integer.valueOf(i));
        if (iMediaDecoder != null) {
            iMediaDecoder.stop();
        }
        this.audioDecoders.remove(Integer.valueOf(i));
        this.audioParameters.remove(Integer.valueOf(i));
        if (this.audioDecoders.isEmpty()) {
            AudioJitterBuffer audioJitterBuffer = this.audioJitterBuffer;
            if (audioJitterBuffer != null) {
                audioJitterBuffer.stop();
                this.audioJitterBuffer = null;
            }
            IAudioRender iAudioRender = this.audioRender;
            if (iAudioRender != null) {
                iAudioRender.stop();
                this.audioRender = null;
            }
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("userId", this.userId);
            jSONObject2.put("result", "succ");
            MediaMonitor.onSinkMonitor("MediaRender_StopAudioPlayer", jSONObject2.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        Logger.i(this.TAG, "AudioPlayer stop success");
        return true;
    }

    public boolean stopVideoPlayer(int i) {
        Logger.i(this.TAG, "VideoPlayer stop");
        IVideoRender iVideoRender = this.videoRender;
        if (iVideoRender != null) {
            iVideoRender.stop();
            this.videoRender = null;
        }
        IMediaDecoder iMediaDecoder = this.videoDecoder;
        if (iMediaDecoder != null) {
            iMediaDecoder.stop();
        }
        VideoJitterBuffer videoJitterBuffer = this.videoJitterBuffer;
        if (videoJitterBuffer != null) {
            videoJitterBuffer.stop();
        }
        UrlDataSource urlDataSource = this.urlDataSource;
        if (urlDataSource != null) {
            urlDataSource.stop();
        }
        this.urlDataSource = null;
        this.avParser = null;
        this.videoDecoder = null;
        this.videoJitterBuffer = null;
        this.videoParameter = null;
        instances--;
        Logger.i(this.TAG, "VideoPlayer stop success");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("userId", this.userId);
            jSONObject.put("result", "succ");
            MediaMonitor.onSinkMonitor("MediaRender_StopVideoPlayer", jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return true;
    }

    public void setAudioParameter(int i, AudioParameter audioParameter) {
        if (this.audioParameters.containsKey(Integer.valueOf(i))) {
            this.audioParameters.remove(Integer.valueOf(i));
        }
        this.audioParameters.put(Integer.valueOf(i), audioParameter);
        int i2 = audioParameter.frameSize;
        if (i2 == 0) {
            i2 = 4096;
        }
        this.frameSize = i2;
        this.sampleRate = audioParameter.sampleRate;
        this.channels = audioParameter.channels;
        this.bitWidth = audioParameter.bitWidth;
        String str = this.TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Audio player sampleRate: ");
        LIZ.append(this.sampleRate);
        LIZ.append(",channels: ");
        LIZ.append(this.channels);
        LIZ.append(", bitWidth: ");
        LIZ.append(this.bitWidth);
        Logger.i(str, X1D.LIZIZ(LIZ));
    }

    public void setParameter(MediaParameter mediaParameter, Object obj) {
        if (mediaParameter == MediaParameter.Audio_Render_routingChangedListener) {
            IAudioRender iAudioRender = this.audioRender;
            if (iAudioRender != null) {
                iAudioRender.setParameter(mediaParameter, obj);
                return;
            }
            return;
        }
        if (mediaParameter == MediaParameter.Audio_Render_volume) {
            float floatValue = ((Float) obj).floatValue();
            this.gain = floatValue;
            IAudioRender iAudioRender2 = this.audioRender;
            if (iAudioRender2 == null) {
                return;
            }
            iAudioRender2.setVolume(floatValue);
            return;
        }
        if (mediaParameter == MediaParameter.Audio_IsAutoPlay) {
            this.isPlayAudio = ((Boolean) obj).booleanValue();
            return;
        }
        if (mediaParameter == MediaParameter.Audio_Render_BitWidth) {
            this.bitWidth = ((Integer) obj).intValue();
            return;
        }
        if (mediaParameter == MediaParameter.Audio_Render_SampleRate) {
            this.sampleRate = ((Integer) obj).intValue();
            return;
        }
        if (mediaParameter == MediaParameter.Audio_Render_Channel) {
            this.channels = ((Integer) obj).intValue();
            return;
        }
        if (mediaParameter == MediaParameter.Audio_Render_FrameSize) {
            this.frameSize = ((Integer) obj).intValue();
            return;
        }
        if (mediaParameter == MediaParameter.Audio_Render_BitRate) {
            this.bitRate = ((Integer) obj).intValue();
            return;
        }
        if (mediaParameter == MediaParameter.Video_JitterBuffer_Delay) {
            this.videoJitterBufferDelayMs = ((Integer) obj).intValue();
            return;
        }
        if (mediaParameter == MediaParameter.Audio_JitterBuffer_Delay) {
            this.audioJitterBufferDelayMs = ((Integer) obj).intValue();
            return;
        }
        if (mediaParameter == MediaParameter.Video_JitterBuffer_Mode) {
            String str = this.TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Video_JitterBuffer_Mode ");
            Integer num = (Integer) obj;
            LIZ.append(num);
            Logger.d(str, X1D.LIZIZ(LIZ));
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        Logger.e(this.TAG, "UnSupported videoJitterBuffer Mode");
                        return;
                    } else {
                        this.videoJitterBufferMode = VideoJitterBuffer.JITTER_MODE.QUALITY_STATIC_MODE;
                        return;
                    }
                }
                this.videoJitterBufferMode = VideoJitterBuffer.JITTER_MODE.QUALITY_DYNAMIC_MODE;
                return;
            }
            this.videoJitterBufferMode = VideoJitterBuffer.JITTER_MODE.LOW_LATENCY_MODE;
            return;
        }
        if (mediaParameter == MediaParameter.Audio_JitterBuffer_Mode) {
            String str2 = this.TAG;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Audio_JitterBuffer_Mode ");
            Integer num2 = (Integer) obj;
            LIZ2.append(num2);
            Logger.d(str2, X1D.LIZIZ(LIZ2));
            int intValue2 = num2.intValue();
            if (intValue2 != 0) {
                if (intValue2 != 1) {
                    if (intValue2 != 2) {
                        Logger.e(this.TAG, "UnSupported audioJitterBuffer Mode");
                        return;
                    } else {
                        this.audioJitterBufferMode = AudioJitterBuffer.JITTER_MODE.QUALITY_STATIC_MODE;
                        return;
                    }
                }
                this.audioJitterBufferMode = AudioJitterBuffer.JITTER_MODE.QUALITY_DYNAMIC_MODE;
                return;
            }
            this.audioJitterBufferMode = AudioJitterBuffer.JITTER_MODE.LOW_LATENCY_MODE;
            return;
        }
        if (mediaParameter == MediaParameter.Render_IsOpenJitterBuffer) {
            this.isOpenJitterBuffer = ((Boolean) obj).booleanValue();
            return;
        }
        if (mediaParameter == MediaParameter.Render_videoLatencyListener) {
            this.videoLatencyControl.setLatencyListener((ILatencyListener) obj);
            return;
        }
        if (mediaParameter == MediaParameter.Render_audioLatencyListener) {
            this.audioLatencyControl.setLatencyListener((ILatencyListener) obj);
            return;
        }
        if (mediaParameter == MediaParameter.Render_dumpFilePath) {
            Dump dump = this.dumpPacket;
            String str3 = (String) obj;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(this.userId);
            LIZ3.append(".h264");
            dump.setFilePath(str3, X1D.LIZIZ(LIZ3));
            Dump dump2 = this.dumpFrame;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(this.userId);
            LIZ4.append(".yuv");
            dump2.setFilePath(str3, X1D.LIZIZ(LIZ4));
            Dump dump3 = this.dumpAudio;
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(this.userId);
            LIZ5.append(".aac");
            dump3.setFilePath(str3, X1D.LIZIZ(LIZ5));
            Dump dump4 = this.dumpPcm;
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append(this.userId);
            LIZ6.append(".pcm");
            dump4.setFilePath(str3, X1D.LIZIZ(LIZ6));
            this.renderDumpPath = str3;
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append(this.renderDumpPath);
            String str4 = File.separator;
            LIZ7.append(str4);
            LIZ7.append("dump_enable");
            this.dumpEnableFile = new File(X1D.LIZIZ(LIZ7));
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append(this.renderDumpPath);
            LIZ8.append(str4);
            LIZ8.append("ffmpeg_enable");
            this.ffmpegEnableFile = new File(X1D.LIZIZ(LIZ8));
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append(this.renderDumpPath);
            LIZ9.append(str4);
            LIZ9.append("audio_dump");
            this.audioEnableFile = new File(X1D.LIZIZ(LIZ9));
            if (this.ffmpegEnableFile.exists()) {
                this.isUseVideoNativeDecoder = true;
            }
            StringBuilder LIZ10 = X1D.LIZ();
            LIZ10.append(this.renderDumpPath);
            LIZ10.append(str4);
            LIZ10.append("nativeRender_enable");
            File file = new File(X1D.LIZIZ(LIZ10));
            this.renderEnableFile = file;
            if (!file.exists() || instances <= 0) {
                return;
            }
            this.isUseVideoRender = true;
            return;
        }
        if (mediaParameter == MediaParameter.Render_context) {
            Context context = (Context) obj;
            this.context = context;
            if (this.dumpEnableFile != null) {
                return;
            }
            String path = C16880lQ.LLIIJI(context, null).getPath();
            Dump dump5 = this.dumpPacket;
            StringBuilder LIZ11 = X1D.LIZ();
            LIZ11.append(this.userId);
            LIZ11.append(".h264");
            dump5.setFilePath(path, X1D.LIZIZ(LIZ11));
            Dump dump6 = this.dumpFrame;
            StringBuilder LIZ12 = X1D.LIZ();
            LIZ12.append(this.userId);
            LIZ12.append(".yuv");
            dump6.setFilePath(path, X1D.LIZIZ(LIZ12));
            Dump dump7 = this.dumpAudio;
            StringBuilder LIZ13 = X1D.LIZ();
            LIZ13.append(this.userId);
            LIZ13.append(".aac");
            dump7.setFilePath(path, X1D.LIZIZ(LIZ13));
            Dump dump8 = this.dumpPcm;
            StringBuilder LIZ14 = X1D.LIZ();
            LIZ14.append(this.userId);
            LIZ14.append(".pcm");
            dump8.setFilePath(path, X1D.LIZIZ(LIZ14));
            this.renderDumpPath = path;
            StringBuilder LIZ15 = X1D.LIZ();
            LIZ15.append(this.renderDumpPath);
            String str5 = File.separator;
            LIZ15.append(str5);
            LIZ15.append("dump_enable");
            this.dumpEnableFile = new File(X1D.LIZIZ(LIZ15));
            StringBuilder LIZ16 = X1D.LIZ();
            LIZ16.append(this.renderDumpPath);
            LIZ16.append(str5);
            LIZ16.append("ffmpeg_enable");
            this.ffmpegEnableFile = new File(X1D.LIZIZ(LIZ16));
            StringBuilder LIZ17 = X1D.LIZ();
            LIZ17.append(this.renderDumpPath);
            LIZ17.append(str5);
            LIZ17.append("audio_dump");
            this.audioEnableFile = new File(X1D.LIZIZ(LIZ17));
            if (this.ffmpegEnableFile.exists()) {
                this.isUseVideoNativeDecoder = true;
            }
            StringBuilder LIZ18 = X1D.LIZ();
            LIZ18.append(this.renderDumpPath);
            LIZ18.append(str5);
            LIZ18.append("nativeRender_enable");
            File file2 = new File(X1D.LIZIZ(LIZ18));
            this.renderEnableFile = file2;
            if (!file2.exists() || instances <= 0) {
                return;
            }
            this.isUseVideoRender = true;
            return;
        }
        if (mediaParameter == MediaParameter.Render_IsUseSoftDecoder) {
            this.isUseVideoNativeDecoder = ((Boolean) obj).booleanValue();
            return;
        }
        String str6 = this.TAG;
        StringBuilder LIZ19 = X1D.LIZ();
        LIZ19.append("setParameter key not found! key: ");
        LIZ19.append(mediaParameter);
        Logger.e(str6, X1D.LIZIZ(LIZ19));
    }

    public void setSurface(int i, Surface surface) {
        this.surface = surface;
    }

    public void setVideoParameter(int i, VideoParameter videoParameter) {
        this.videoParameter = videoParameter;
    }

    public void sendAudioPacket(int i, byte[] bArr, long j) {
        boolean z = true;
        int i2 = this.vaildAudioFramesIndex + 1;
        this.vaildAudioFramesIndex = i2;
        this.audioLatencyControl.sendDataIn(i, i2, j);
        File file = this.audioEnableFile;
        if (file == null || !file.exists()) {
            z = false;
        }
        this.isOpenDumpAudio = z;
        if (z && this.dumpAudio.isReady()) {
            this.dumpAudio.writeData(bArr);
        }
        IMediaDecoder iMediaDecoder = this.audioDecoders.get(Integer.valueOf(i));
        if (iMediaDecoder != null) {
            this.audioLatencyControl.decodeIn(i, j);
            iMediaDecoder.sendPacket(bArr, j);
        }
    }

    public void sendVideoPacket(int i, byte[] bArr, long j) {
        boolean z;
        int i2;
        long j2 = j;
        int i3 = this.vaildVideoFramesIndex + 1;
        this.vaildVideoFramesIndex = i3;
        this.videoLatencyControl.sendDataIn(i, i3, j2 * 1000);
        File file = this.dumpEnableFile;
        if (file != null && file.exists()) {
            z = true;
        } else {
            z = false;
        }
        this.isOpenDumpFrame = z;
        if (z && this.dumpPacket.isReady()) {
            this.dumpPacket.writeData(bArr);
        }
        IVideoRender iVideoRender = this.videoRender;
        if (iVideoRender != null) {
            iVideoRender.isOpenDump(this.isOpenDumpFrame);
        }
        VideoJitterBuffer videoJitterBuffer = this.videoJitterBuffer;
        if (videoJitterBuffer != null) {
            if (this.videoParameter.codecId == CodecId.H264) {
                i2 = bArr[4] & 31;
            } else {
                i2 = (bArr[4] >> 1) & 63;
            }
            if (i2 == 7) {
                j2 = 0;
            }
            videoJitterBuffer.append(bArr, j2 * 1000);
            return;
        }
        if (this.videoDecoder != null) {
            this.videoLatencyControl.decodeIn(i, j2);
            this.videoDecoder.sendPacket(bArr, j2);
        } else {
            Logger.e(this.TAG, "videoJitterBuffer and videoDecoder is null");
        }
    }
}
