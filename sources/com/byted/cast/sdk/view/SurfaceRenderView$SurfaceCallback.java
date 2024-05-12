package com.byted.cast.sdk.view;

import X.C90652Zhw;
import X.X1D;
import android.view.SurfaceHolder;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.sdk.view.IRenderView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes29.dex */
public final class SurfaceRenderView$SurfaceCallback implements SurfaceHolder.Callback {
    public ContextManager.CastContext mCastContext;
    public int mFormat;
    public int mHeight;
    public boolean mIsFormatChanged;
    public CastLogger mLogger;
    public Map<IRenderView.IRenderCallback, Object> mRenderCallbackMap = new ConcurrentHashMap();
    public SurfaceHolder mSurfaceHolder;
    public WeakReference<C90652Zhw> mWeakSurfaceView;
    public int mWidth;

    public void addRenderCallback(IRenderView.IRenderCallback iRenderCallback) {
        SurfaceRenderView$InternalSurfaceHolder surfaceRenderView$InternalSurfaceHolder;
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addRenderCallback:");
        LIZ.append(this.mSurfaceHolder);
        castLogger.i("SurfaceRenderView", X1D.LIZIZ(LIZ));
        this.mRenderCallbackMap.put(iRenderCallback, iRenderCallback);
        if (this.mSurfaceHolder != null) {
            surfaceRenderView$InternalSurfaceHolder = new SurfaceRenderView$InternalSurfaceHolder(this.mWeakSurfaceView.get(), this.mSurfaceHolder);
            iRenderCallback.onSurfaceCreated(surfaceRenderView$InternalSurfaceHolder, this.mWidth, this.mHeight);
            CastLogger castLogger2 = this.mLogger;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSurfaceCreated:");
            LIZ2.append(this.mSurfaceHolder);
            castLogger2.i("SurfaceRenderView", X1D.LIZIZ(LIZ2));
        } else {
            surfaceRenderView$InternalSurfaceHolder = null;
        }
        if (this.mIsFormatChanged) {
            if (surfaceRenderView$InternalSurfaceHolder == null) {
                surfaceRenderView$InternalSurfaceHolder = new SurfaceRenderView$InternalSurfaceHolder(this.mWeakSurfaceView.get(), this.mSurfaceHolder);
            }
            iRenderCallback.onSurfaceChanged(surfaceRenderView$InternalSurfaceHolder, this.mFormat, this.mWidth, this.mHeight);
        }
    }

    public void removeRenderCallback(IRenderView.IRenderCallback iRenderCallback) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeRenderCallback:");
        LIZ.append(iRenderCallback);
        castLogger.i("SurfaceRenderView", X1D.LIZIZ(LIZ));
        this.mRenderCallbackMap.remove(iRenderCallback);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surfaceCreated:");
        LIZ.append(surfaceHolder);
        castLogger.i("SurfaceRenderView", X1D.LIZIZ(LIZ));
        this.mSurfaceHolder = surfaceHolder;
        this.mIsFormatChanged = false;
        this.mFormat = 0;
        this.mWidth = 0;
        this.mHeight = 0;
        SurfaceRenderView$InternalSurfaceHolder surfaceRenderView$InternalSurfaceHolder = new SurfaceRenderView$InternalSurfaceHolder(this.mWeakSurfaceView.get(), this.mSurfaceHolder);
        Iterator<IRenderView.IRenderCallback> it = this.mRenderCallbackMap.keySet().iterator();
        while (it.hasNext()) {
            it.next().onSurfaceCreated(surfaceRenderView$InternalSurfaceHolder, 0, 0);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surfaceDestroyed:");
        LIZ.append(surfaceHolder);
        castLogger.i("SurfaceRenderView", X1D.LIZIZ(LIZ));
        this.mSurfaceHolder = null;
        this.mIsFormatChanged = false;
        this.mFormat = 0;
        this.mWidth = 0;
        this.mHeight = 0;
        SurfaceRenderView$InternalSurfaceHolder surfaceRenderView$InternalSurfaceHolder = new SurfaceRenderView$InternalSurfaceHolder(this.mWeakSurfaceView.get(), this.mSurfaceHolder);
        Iterator<IRenderView.IRenderCallback> it = this.mRenderCallbackMap.keySet().iterator();
        while (it.hasNext()) {
            it.next().onSurfaceDestroyed(surfaceRenderView$InternalSurfaceHolder);
        }
    }

    public SurfaceRenderView$SurfaceCallback(C90652Zhw c90652Zhw, ContextManager.CastContext castContext) {
        this.mCastContext = castContext;
        this.mLogger = ContextManager.getLogger(castContext);
        this.mWeakSurfaceView = new WeakReference<>(c90652Zhw);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        CastLogger castLogger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("surfaceChanged:");
        LIZ.append(surfaceHolder);
        castLogger.i("SurfaceRenderView", X1D.LIZIZ(LIZ));
        this.mSurfaceHolder = surfaceHolder;
        this.mIsFormatChanged = true;
        this.mFormat = i;
        this.mWidth = i2;
        this.mHeight = i3;
        SurfaceRenderView$InternalSurfaceHolder surfaceRenderView$InternalSurfaceHolder = new SurfaceRenderView$InternalSurfaceHolder(this.mWeakSurfaceView.get(), this.mSurfaceHolder);
        Iterator<IRenderView.IRenderCallback> it = this.mRenderCallbackMap.keySet().iterator();
        while (it.hasNext()) {
            it.next().onSurfaceChanged(surfaceRenderView$InternalSurfaceHolder, i, i2, i3);
        }
    }
}
