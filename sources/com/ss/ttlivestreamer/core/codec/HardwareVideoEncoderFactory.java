package com.ss.ttlivestreamer.core.codec;

import android.os.Handler;
import com.ss.ttlivestreamer.core.engine.VideoEncoder;
import com.ss.ttlivestreamer.core.engine.VideoEncoderFactory;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusiness;

/* loaded from: classes12.dex */
public class HardwareVideoEncoderFactory extends VideoEncoderFactory {
    public Handler glEncodeHandler;
    public GLThread glEncodeThread;

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoderFactory
    public String GetSupportedFormats() {
        return "video_type=video/avc,video_enable_accelera=true,oes_texture_frame=true:video_type=video/bytevc1,video_enable_accelera=true,oes_texture_frame=true";
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoderFactory, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        GLThread gLThread = this.glEncodeThread;
        this.glEncodeThread = null;
        SafeHandlerThreadPoolExecutor.unlockThread(gLThread);
        super.release();
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void finalize() {
        release();
        super.finalize();
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoderFactory
    public VideoEncoder CreateVideoEncoder(String str, boolean z) {
        HardwareVideoEncoder byteVC1HWVideoEncoder;
        if (!z) {
            return null;
        }
        String str2 = "";
        boolean z2 = false;
        for (String str3 : str.split(",")) {
            String[] split = str3.split("=");
            if (split.length > 1) {
                if (split[0].equalsIgnoreCase("video_type")) {
                    str2 = split[1];
                } else if (split[0].equalsIgnoreCase("oes_texture_frame")) {
                    z2 = split[1].equalsIgnoreCase("true");
                }
            }
        }
        if (!z2) {
            if (this.glEncodeThread == null) {
                GLThread glThread = TTLSPreInitBusiness.getInstance().getGlThread("HardWareEncodeThread");
                this.glEncodeThread = glThread;
                if (glThread == null) {
                    GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("HardWareEncodeThread");
                    this.glEncodeThread = lockGLThread;
                    lockGLThread.start();
                }
            }
            if (this.glEncodeHandler == null) {
                this.glEncodeHandler = this.glEncodeThread.getHandler();
            }
        }
        if (z2) {
            OesTextureHWEncoder oesTextureHWEncoder = new OesTextureHWEncoder(str2.equalsIgnoreCase("video/bytevc1"));
            if (!oesTextureHWEncoder.setupCodecType()) {
                oesTextureHWEncoder.release();
                return null;
            }
            return oesTextureHWEncoder;
        }
        if (str2.equalsIgnoreCase("video/avc")) {
            byteVC1HWVideoEncoder = new H264HWVideoEncoder(this.glEncodeHandler);
            if (!byteVC1HWVideoEncoder.setupCodecType()) {
                byteVC1HWVideoEncoder.release();
                return null;
            }
        } else {
            if (!str2.equalsIgnoreCase("video/bytevc1")) {
                return null;
            }
            byteVC1HWVideoEncoder = new ByteVC1HWVideoEncoder(this.glEncodeHandler);
            if (!byteVC1HWVideoEncoder.setupCodecType()) {
                byteVC1HWVideoEncoder.release();
                return null;
            }
        }
        return byteVC1HWVideoEncoder;
    }
}
