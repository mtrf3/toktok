package com.byted.cast.capture.surface;

import X.X1D;
import android.graphics.SurfaceTexture;
import android.opengl.GLES30;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.byted.cast.capture.surface.gles.EglCore;
import com.byted.cast.capture.surface.gles.FullFrameRect;
import com.byted.cast.capture.surface.gles.Texture2dProgram;
import com.byted.cast.capture.surface.gles.WindowSurface;
import com.byted.cast.mediacommon.MediaMonitor;
import com.byted.cast.mediacommon.MediaSetting;
import com.byted.cast.mediacommon.VideoProfile;
import com.byted.cast.mediacommon.utils.Logger;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes29.dex */
public class GLSurfaceManager implements SurfaceTexture.OnFrameAvailableListener {
    public int mDefaultBufferHeight;
    public int mDefaultBufferWidth;
    public WindowSurface mDefaultOutputSurface;
    public EglCore mEglCore;
    public FullFrameRect mFullFrameBlit;
    public MainHandler mHandler;
    public HandlerThread mHandlerThread;
    public Surface mInputSurface;
    public SurfaceTexture mInputTexture;
    public ArrayList<WindowSurface> mOutputSurfaces;
    public int mTextureId;
    public VideoProfile mVideoProfile;
    public final float[] mTmpMatrix = new float[16];
    public final Object mSync = new Object();
    public int frame_cnt = 0;
    public long time_cnt = 0;
    public long size_cnt = 0;
    public long last_t = 0;
    public long diff_t = 0;
    public long current_time = 0;
    public double frequent = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public long biterate = 0;

    private void removeAllSurfaces() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeAllSurfaces: ");
        LIZ.append(this.mOutputSurfaces.size());
        Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ));
        synchronized (this.mSync) {
            WindowSurface windowSurface = this.mDefaultOutputSurface;
            if (windowSurface != null) {
                windowSurface.release();
                this.mDefaultOutputSurface = null;
                this.mHandler.removeMessages(0);
            }
            Iterator<WindowSurface> it = this.mOutputSurfaces.iterator();
            while (it.hasNext()) {
                WindowSurface next = it.next();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("releaseSurface: ");
                LIZ2.append(next);
                Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ2));
                next.release();
            }
            this.mOutputSurfaces.clear();
        }
    }

    public void insertFrame() {
        Logger.i("GLSurfaceManager", "insertFrame: ");
        VideoProfile videoProfile = this.mVideoProfile;
        if (videoProfile == null || this.mHandler == null || videoProfile.isEnableModifyFps()) {
            return;
        }
        this.mHandler.sendEmptyMessage(1);
    }

    public void release() {
        Logger.i("GLSurfaceManager", "release: ");
        releaseInitTexture();
        EglCore eglCore = this.mEglCore;
        if (eglCore != null) {
            eglCore.release();
            this.mEglCore = null;
        }
        removeAllSurfaces();
    }

    public void releaseInitTexture() {
        Logger.i("GLSurfaceManager", "releaseInitTexture: ");
        SurfaceTexture surfaceTexture = this.mInputTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mInputTexture = null;
        }
        Surface surface = this.mInputSurface;
        if (surface != null) {
            surface.release();
            this.mInputSurface = null;
        }
        WindowSurface windowSurface = this.mDefaultOutputSurface;
        if (windowSurface != null) {
            windowSurface.makeCurrent();
            FullFrameRect fullFrameRect = this.mFullFrameBlit;
            if (fullFrameRect != null) {
                fullFrameRect.deleteTextures(this.mTextureId);
                this.mFullFrameBlit.release(true);
                this.mFullFrameBlit = null;
            }
            this.mDefaultOutputSurface.makeUnCurrent();
        }
        GLES30.glDisable(36784);
        this.mTextureId = 0;
    }

    public void drawFrame() {
        printFPS(System.nanoTime() / 1000, 0);
        synchronized (this.mSync) {
            if (this.mInputTexture == null) {
                return;
            }
            WindowSurface windowSurface = this.mDefaultOutputSurface;
            if (windowSurface != null) {
                drawWindowSurface(windowSurface);
            }
            Iterator<WindowSurface> it = this.mOutputSurfaces.iterator();
            while (it.hasNext()) {
                drawWindowSurface(it.next());
            }
        }
    }

    public Surface getInputSurface() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getInputSurface: ");
        LIZ.append(this.mInputTexture);
        Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ));
        if (this.mInputSurface == null) {
            Logger.e("GLSurfaceManager", "getInputSurface error, mInputSurface is NULL");
        }
        return this.mInputSurface;
    }

    public SurfaceTexture getInputTexture() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getInputTexture: ");
        LIZ.append(this.mInputTexture);
        Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ));
        if (this.mInputTexture == null) {
            Logger.e("GLSurfaceManager", "getInputTexture error, mInputTexture is NULL");
        }
        return this.mInputTexture;
    }

    /* loaded from: classes29.dex */
    public static class MainHandler extends Handler {
        public WeakReference<GLSurfaceManager> mWeakActivity;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            GLSurfaceManager gLSurfaceManager = this.mWeakActivity.get();
            if (gLSurfaceManager == null) {
                return;
            }
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    return;
                }
            } else {
                Object obj = message.obj;
                if (obj instanceof Integer) {
                    int intValue = ((Integer) obj).intValue();
                    Message obtain = Message.obtain();
                    obtain.obj = Integer.valueOf(intValue);
                    obtain.what = 0;
                    sendMessageDelayed(obtain, intValue);
                    gLSurfaceManager.drawFrame();
                    return;
                }
            }
            gLSurfaceManager.drawFrame();
        }

        public MainHandler(GLSurfaceManager gLSurfaceManager, Looper looper) {
            super(looper);
            this.mWeakActivity = new WeakReference<>(gLSurfaceManager);
        }
    }

    public GLSurfaceManager(VideoProfile videoProfile) {
        Logger.i("GLSurfaceManager", "creat GLSurfaceManager");
        this.mVideoProfile = videoProfile;
        this.mEglCore = new EglCore(null, 1);
        this.mOutputSurfaces = new ArrayList<>();
        HandlerThread handlerThread = new HandlerThread("GLSurfaceManager", -16);
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new MainHandler(this, this.mHandlerThread.getLooper());
    }

    private void drawWindowSurface(WindowSurface windowSurface) {
        windowSurface.makeCurrent();
        try {
            this.mInputTexture.updateTexImage();
            this.mInputTexture.getTransformMatrix(this.mTmpMatrix);
            this.mFullFrameBlit.drawFrame(this.mTextureId, this.mTmpMatrix);
            windowSurface.setPresentationTime(System.nanoTime());
            windowSurface.swapBuffers();
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("drawWindowSurface error:");
            LIZ.append(e);
            Logger.e("GLSurfaceManager", X1D.LIZIZ(LIZ));
        }
        windowSurface.makeUnCurrent();
    }

    public void changeSurfaceFillType(MediaSetting.FILL_TYPE fill_type) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("changeSurfaceFillType:");
        LIZ.append(fill_type);
        Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ));
        synchronized (this.mSync) {
            WindowSurface windowSurface = this.mDefaultOutputSurface;
            if (windowSurface != null) {
                windowSurface.setType(fill_type);
                this.mDefaultOutputSurface.reSize(this.mDefaultBufferWidth, this.mDefaultBufferHeight);
            }
            Iterator<WindowSurface> it = this.mOutputSurfaces.iterator();
            while (it.hasNext()) {
                WindowSurface next = it.next();
                next.setType(fill_type);
                next.reSize(this.mDefaultBufferWidth, this.mDefaultBufferHeight);
            }
        }
    }

    public boolean getPicture(String str) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getPicture: ");
        LIZ.append(str);
        Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ));
        MediaMonitor.onMonitor("MediaCapture_ScreenShot", str);
        synchronized (this.mSync) {
            z = false;
            try {
                WindowSurface windowSurface = this.mDefaultOutputSurface;
                if (windowSurface != null) {
                    windowSurface.makeCurrent();
                    boolean saveFrame = this.mDefaultOutputSurface.saveFrame(new File(str));
                    this.mDefaultOutputSurface.makeUnCurrent();
                    z = saveFrame;
                }
            } catch (IOException e) {
                MediaMonitor.onMonitor("MediaCapture_Error", 100006, "getPicture", e.toString());
                e.printStackTrace();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("getPicture error ");
                LIZ2.append(e);
                Logger.e("GLSurfaceManager", X1D.LIZIZ(LIZ2));
                return false;
            }
        }
        if (z) {
            MediaMonitor.onMonitor("MediaCapture_ScreenShot_Sucess", "");
        }
        return z;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.mInputTexture != null && !this.mVideoProfile.isEnableModifyFps()) {
            this.mHandler.sendEmptyMessage(1);
        }
    }

    public void removeSurface(Surface surface) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeSurface:");
        LIZ.append(surface);
        LIZ.append(" size:");
        LIZ.append(this.mOutputSurfaces.size());
        Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ));
        if (surface == null) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("removeSurface:");
        LIZ2.append(surface);
        LIZ2.append(" size:");
        LIZ2.append(this.mOutputSurfaces.size());
        MediaMonitor.onMonitor("MediaCapture_GLManager_RemoveSurface", X1D.LIZIZ(LIZ2));
        synchronized (this.mSync) {
            WindowSurface windowSurface = this.mDefaultOutputSurface;
            if (windowSurface != null && windowSurface.getSurface() == surface) {
                releaseInitTexture();
                this.mDefaultOutputSurface.release();
                this.mDefaultOutputSurface = null;
                this.mHandler.removeMessages(0);
                MediaMonitor.onMonitor("MediaCapture_GLManager_RemoveSurface_Sucess", "");
                return;
            }
            Iterator<WindowSurface> it = this.mOutputSurfaces.iterator();
            while (it.hasNext()) {
                WindowSurface next = it.next();
                if (next.getSurface() == surface) {
                    next.release();
                    this.mOutputSurfaces.remove(next);
                    MediaMonitor.onMonitor("MediaCapture_GLManager_RemoveSurface_Sucess", "");
                    return;
                }
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("not find surface:");
            LIZ3.append(surface);
            MediaMonitor.onMonitor("MediaCapture_Error", 100005, "removeSurface", X1D.LIZIZ(LIZ3));
        }
    }

    public void setVideoProfile(VideoProfile videoProfile) {
        this.mVideoProfile = videoProfile;
    }

    public void printFPS(long j, int i) {
        this.frame_cnt++;
        this.time_cnt += ((System.nanoTime() / 1000) - j) / 1000;
        this.size_cnt += i;
        if (this.last_t == 0) {
            this.last_t = System.currentTimeMillis();
            return;
        }
        if (this.frame_cnt != 100) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.current_time = currentTimeMillis;
        long j2 = currentTimeMillis - this.last_t;
        this.diff_t = j2;
        this.frequent = 100000.0d / j2;
        this.biterate = (this.size_cnt * 8) / j2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("current frequent ");
        LIZ.append(this.frequent);
        LIZ.append(" biterate:");
        LIZ.append(this.biterate);
        LIZ.append("kbps encode:");
        LIZ.append(this.time_cnt / 100);
        LIZ.append("ms");
        Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("type:GLSurfaceManager frequent:");
        LIZ2.append(this.frequent);
        LIZ2.append(" biterate:");
        LIZ2.append(this.biterate);
        LIZ2.append("kbps encode:");
        LIZ2.append(this.time_cnt / 100);
        LIZ2.append("ms");
        MediaMonitor.onMonitor("MediaCapture_Encoder_Statistics", X1D.LIZIZ(LIZ2));
        this.last_t = this.current_time;
        this.frame_cnt = 0;
        this.time_cnt = 0L;
        this.size_cnt = 0L;
    }

    public void setDefaultBufferSize(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDefaultBufferSize: ");
        LIZ.append(i);
        LIZ.append("x");
        LIZ.append(i2);
        Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ));
        this.mDefaultBufferWidth = i;
        this.mDefaultBufferHeight = i2;
    }

    public void setDefaultOutputSurface(Surface surface, MediaSetting.FILL_TYPE fill_type) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addSurface:");
        LIZ.append(surface);
        LIZ.append(" type:");
        LIZ.append(fill_type);
        LIZ.append(" w:");
        LIZ.append(this.mDefaultBufferWidth);
        LIZ.append(" h:");
        LIZ.append(this.mDefaultBufferHeight);
        MediaMonitor.onMonitor("MediaCapture_GLManager_AddSurface", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setDefaultOutputSurface surface:");
        LIZ2.append(surface);
        Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ2));
        synchronized (this.mSync) {
            try {
                WindowSurface windowSurface = new WindowSurface(this.mEglCore, surface, true);
                this.mDefaultOutputSurface = windowSurface;
                if (this.mInputTexture == null) {
                    initTexture(windowSurface, this.mDefaultBufferWidth, this.mDefaultBufferHeight);
                }
                this.mDefaultOutputSurface.setType(fill_type);
                this.mDefaultOutputSurface.reSize(this.mDefaultBufferWidth, this.mDefaultBufferHeight);
                Iterator<WindowSurface> it = this.mOutputSurfaces.iterator();
                while (it.hasNext()) {
                    it.next().reSize(this.mDefaultBufferWidth, this.mDefaultBufferHeight);
                }
            } catch (Exception e) {
                e.printStackTrace();
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("setDefaultOutputSurface Error: ");
                LIZ3.append(e);
                Logger.e("GLSurfaceManager", X1D.LIZIZ(LIZ3));
            }
        }
        if (this.mVideoProfile.isEnableModifyFps()) {
            Message obtain = Message.obtain();
            obtain.obj = Integer.valueOf(1000 / this.mVideoProfile.getFps());
            obtain.what = 0;
            this.mHandler.sendMessage(obtain);
        }
    }

    private void initTexture(WindowSurface windowSurface, int i, int i2) {
        GLES30.glHint(36784, 36786);
        windowSurface.makeCurrent();
        try {
            FullFrameRect fullFrameRect = new FullFrameRect(new Texture2dProgram(Texture2dProgram.ProgramType.TEXTURE_EXT));
            this.mFullFrameBlit = fullFrameRect;
            this.mTextureId = fullFrameRect.createTextureObject();
            this.mInputTexture = new SurfaceTexture(this.mTextureId);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mTextureId:");
            LIZ.append(this.mTextureId);
            LIZ.append(" InputTexture");
            LIZ.append(this.mInputTexture);
            LIZ.append("w:");
            LIZ.append(i);
            LIZ.append("h:");
            LIZ.append(i2);
            LIZ.append("mOutputSurface: w");
            LIZ.append(windowSurface.getDrawWidth());
            LIZ.append(" h");
            LIZ.append(windowSurface.getDrawHeight());
            Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ));
            this.mInputTexture.setDefaultBufferSize(i, i2);
            this.mInputSurface = new Surface(this.mInputTexture);
            this.mInputTexture.setOnFrameAvailableListener(this);
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("initTexture error:");
            LIZ2.append(e);
            Logger.e("GLSurfaceManager", X1D.LIZIZ(LIZ2));
        }
        windowSurface.makeUnCurrent();
    }

    public void addSurface(Surface surface, MediaSetting.FILL_TYPE fill_type, boolean z) {
        WindowSurface windowSurface;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addSurface:");
        LIZ.append(surface);
        LIZ.append(" type:");
        LIZ.append(fill_type);
        LIZ.append(" size:");
        LIZ.append(this.mOutputSurfaces.size());
        LIZ.append(" release:");
        LIZ.append(z);
        Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("addSurface:");
        LIZ2.append(surface);
        LIZ2.append(" type:");
        LIZ2.append(fill_type);
        LIZ2.append(" size:");
        LIZ2.append(this.mOutputSurfaces.size());
        LIZ2.append(" release:");
        LIZ2.append(z);
        MediaMonitor.onMonitor("MediaCapture_GLManager_AddSurface", X1D.LIZIZ(LIZ2));
        if (surface == null) {
            Logger.e("GLSurfaceManager", "surface is NULL!!!");
            MediaMonitor.onMonitor("MediaCapture_Error", 100005, "addSurface", "surface is null");
            return;
        }
        synchronized (this.mSync) {
            Iterator<WindowSurface> it = this.mOutputSurfaces.iterator();
            while (it.hasNext()) {
                if (it.next().getSurface() == surface) {
                    Logger.e("GLSurfaceManager", "addSurface: same surface");
                    MediaMonitor.onMonitor("MediaCapture_Error", 100005, "addSurface", "addSurface: same surface");
                    return;
                }
            }
            int i = 0;
            while (true) {
                try {
                    Thread.sleep(200L);
                    try {
                        windowSurface = new WindowSurface(this.mEglCore, surface, z);
                        break;
                    } catch (Exception unused) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("creatWindowSurface Error , try again ");
                        LIZ3.append(i);
                        Logger.e("GLSurfaceManager", X1D.LIZIZ(LIZ3));
                        i++;
                        if (i >= 5) {
                            windowSurface = null;
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    MediaMonitor.onMonitor("MediaCapture_Error", 100005, "addSurface", e.toString());
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("addSurface Error: ");
                    LIZ4.append(e);
                    Logger.e("GLSurfaceManager", X1D.LIZIZ(LIZ4));
                    return;
                }
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("mOutputSurface: w");
            LIZ5.append(windowSurface.getDrawWidth());
            LIZ5.append(" h");
            LIZ5.append(windowSurface.getDrawHeight());
            Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ5));
            windowSurface.setType(fill_type);
            windowSurface.reSize(this.mDefaultBufferWidth, this.mDefaultBufferHeight);
            this.mOutputSurfaces.add(windowSurface);
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("mOutputSurface: w");
            LIZ6.append(windowSurface.getDrawWidth());
            LIZ6.append(" h");
            LIZ6.append(windowSurface.getDrawHeight());
            Logger.i("GLSurfaceManager", X1D.LIZIZ(LIZ6));
            MediaMonitor.onMonitor("MediaCapture_GLManager_AddSurface_Success", "");
        }
    }
}
