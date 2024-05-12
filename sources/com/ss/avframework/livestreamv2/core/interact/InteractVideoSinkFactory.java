package com.ss.avframework.livestreamv2.core.interact;

import X.AnonymousClass028;
import X.X1D;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.ss.avframework.livestreamv2.core.interact.media.MediaEngine;
import com.ss.avframework.livestreamv2.core.interact.video.VideoSink;
import com.ss.avframework.livestreamv2.core.interact.video.VideoSinkFactory;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class InteractVideoSinkFactory implements VideoSinkFactory {
    public InteractEngineBuilder mBuilder;
    public final MediaEngine mEngine;
    public final GLThread mGLThread;
    public final Handler mHandler;
    public Map<String, InteractVideoSink> mVideoSinkMap = new ConcurrentHashMap();

    public void release() {
        if (!this.mVideoSinkMap.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.mVideoSinkMap.size());
            LIZ.append(" InteractVideoSink has not been released.");
            String LIZIZ = X1D.LIZIZ(LIZ);
            AVLog.iow("InteractVideoSinkFactory", LIZIZ);
            AVLog.logKibana(5, "InteractVideoSinkFactory", LIZIZ, null);
            Iterator<Map.Entry<String, InteractVideoSink>> it = this.mVideoSinkMap.entrySet().iterator();
            while (it.hasNext()) {
                InteractVideoSink value = it.next().getValue();
                if (value != null) {
                    value.release();
                    it.remove();
                }
            }
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(LIZIZ);
            if (AnonymousClass028.LJI(androidRuntimeException, "InteractVideoSinkFactory.release")) {
                throw androidRuntimeException;
            }
        }
        SafeHandlerThreadPoolExecutor.unlockThread(this.mGLThread);
    }

    public Map<String, InteractVideoSink> getAllVideoSink() {
        return this.mVideoSinkMap;
    }

    public InteractVideoSinkFactory(MediaEngine mediaEngine) {
        InteractEngineBuilder builder = mediaEngine.getBuilder();
        this.mBuilder = builder;
        this.mEngine = mediaEngine;
        VPassInteractCfg vPassInteractCfg = builder.mVPassInteractCfg;
        if (vPassInteractCfg.using_share_gl_thread || vPassInteractCfg.convert_texture_with_share_gl_thread) {
            GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("GLInteractVideoSinkFactory");
            this.mGLThread = lockGLThread;
            lockGLThread.start();
            this.mHandler = lockGLThread.getHandler();
            return;
        }
        this.mGLThread = null;
        this.mHandler = null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSinkFactory
    public void destroy(VideoSink videoSink) {
        if (videoSink != null) {
            InteractVideoSink remove = this.mVideoSinkMap.remove(videoSink.getInteractId());
            if (remove != videoSink) {
                if (remove != null) {
                    remove.release();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("remove ");
                LIZ.append(videoSink.getInteractId());
                LIZ.append(": expect ");
                LIZ.append(videoSink);
                LIZ.append(", actual ");
                LIZ.append(remove);
                String LIZIZ = X1D.LIZIZ(LIZ);
                AVLog.iow("InteractVideoSinkFactory", LIZIZ);
                AVLog.logKibana(5, "InteractVideoSinkFactory", LIZIZ, null);
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(LIZIZ);
                if (AnonymousClass028.LJI(androidRuntimeException, "InteractVideoSinkFactory.destroy")) {
                    throw androidRuntimeException;
                }
            }
            ((InteractVideoSink) videoSink).release();
        }
    }

    public InteractVideoSink getVideoSink(String str) {
        return this.mVideoSinkMap.get(str);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoSinkFactory
    public VideoSink create(String str, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        InteractVideoSink interactVideoSink = new InteractVideoSink(str, z, i, z2, this.mEngine, this.mHandler, z3, z4);
        interactVideoSink.setDumpFrameParams(this.mEngine.getBuilder().getDumpFrameParams());
        this.mVideoSinkMap.put(str, interactVideoSink);
        return interactVideoSink;
    }
}
