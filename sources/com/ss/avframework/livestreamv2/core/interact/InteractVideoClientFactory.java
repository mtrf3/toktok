package com.ss.avframework.livestreamv2.core.interact;

import X.C16880lQ;
import X.C7MY;
import X.X1D;
import android.util.AndroidRuntimeException;
import com.ss.avframework.livestreamv2.core.interact.media.MediaEngine;
import com.ss.avframework.livestreamv2.core.interact.video.VideoClient;
import com.ss.avframework.livestreamv2.core.interact.video.VideoClientFactory;
import com.ss.ttlivestreamer.core.buffer.SurfaceWithExtData;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.utils.ZlibCompressUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class InteractVideoClientFactory implements VideoClientFactory, LiveCore.ILiveCoreVideoFrameAvailableListener {
    public MediaEngine mEngine;
    public ByteBuffer mSeiBuffer;
    public String TAG = "InteractVideoClientFactory";
    public final ArrayList<LiveCore.ILiveCoreVideoFrameAvailableListener> mVideoClients = new ArrayList<>();
    public List<Object> mSeiList = new ArrayList();

    private int peekSeiSize() {
        int size;
        synchronized (this.mSeiList) {
            size = this.mSeiList.size();
        }
        return size;
    }

    private Object popSei() {
        Object obj;
        synchronized (this.mSeiList) {
            if (!this.mSeiList.isEmpty()) {
                obj = this.mSeiList.remove(0);
            } else {
                obj = null;
            }
        }
        return obj;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClientFactory
    public VideoClient create() {
        InteractVideoClient interactVideoClient;
        AVLog.d(this.TAG, "Create video client ");
        synchronized (this.mVideoClients) {
            if (this.mVideoClients.isEmpty()) {
                this.mEngine.addLiveCoreVideoFrameListener(this);
            }
            interactVideoClient = new InteractVideoClient();
            interactVideoClient.setDumpFrameParams(this.mEngine.getBuilder().getDumpFrameParams());
            this.mVideoClients.add(interactVideoClient);
        }
        return interactVideoClient;
    }

    private ByteBuffer getExtraSei() {
        Object popSei = popSei();
        if (popSei instanceof ByteBuffer) {
            return (ByteBuffer) popSei;
        }
        if ((popSei instanceof String) && popSei != null) {
            String str = (String) popSei;
            int length = str.length();
            ByteBuffer byteBuffer = this.mSeiBuffer;
            if (byteBuffer == null || byteBuffer.capacity() < length + 64) {
                this.mSeiBuffer = ByteBuffer.allocateDirect(length + 64);
                if (length > 1024) {
                    String str2 = this.TAG;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("sei length ");
                    LIZ.append(length);
                    LIZ.append(" is too large.");
                    AVLog.iow(str2, X1D.LIZIZ(LIZ));
                }
            }
            int i = 3;
            int i2 = 0;
            while (true) {
                int i3 = i - 1;
                if (i <= 0) {
                    break;
                }
                i2 = EffectWrapper.AlgorithmResult.buildBufferFromString(str, this.mSeiBuffer);
                if (i2 != 0) {
                    if (i2 > 0) {
                        this.mSeiBuffer.position(0);
                        this.mSeiBuffer.limit(i2);
                        return this.mSeiBuffer.slice();
                    }
                } else {
                    this.mSeiBuffer = ByteBuffer.allocateDirect(this.mSeiBuffer.capacity() * 2);
                    i = i3;
                }
            }
            StringBuilder LJ = C7MY.LJ("BUG !  size ", i2, " buffer len ");
            LJ.append(this.mSeiBuffer.capacity());
            LJ.append(" VS ");
            LJ.append(length);
            LJ.append(" | sei ");
            LJ.append(popSei);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LJ));
            TTLSSladarBugReportUtils tTLSSladarBugReportUtils = TTLSSladarBugReportUtils.getInstance();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.TAG);
            LIZ2.append(".getExtraSei");
            tTLSSladarBugReportUtils.report(androidRuntimeException, X1D.LIZIZ(LIZ2));
            if (!TTLSBuildConfig.canThrowException()) {
                return null;
            }
            throw androidRuntimeException;
        }
        return null;
    }

    public InteractVideoClientFactory(MediaEngine mediaEngine) {
        this.mEngine = mediaEngine;
    }

    private void pushSei(Object obj) {
        synchronized (this.mSeiList) {
            if ((obj instanceof ByteBuffer) && ZlibCompressUtils.isContourInfo((ByteBuffer) obj)) {
                for (int i = 0; i < this.mSeiList.size(); i++) {
                    Object obj2 = this.mSeiList.get(i);
                    if ((obj2 instanceof ByteBuffer) && ZlibCompressUtils.isContourInfo((ByteBuffer) obj2)) {
                        this.mSeiList.set(i, obj);
                        break;
                    }
                }
            }
            this.mSeiList.add(obj);
            if (DebugLogUtils.isEnableDebugLog()) {
                String str = this.TAG;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("push sei[");
                LIZ.append(this.mSeiList.size());
                LIZ.append("] [");
                LIZ.append(obj);
                LIZ.append("]");
                AVLog.e(str, X1D.LIZIZ(LIZ));
            }
            if (this.mSeiList.size() > 30) {
                AVLog.e(this.TAG, "SEI buffer overflow with drop old sei...");
                this.mSeiList.remove(0);
            }
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClientFactory
    public void destroy(VideoClient videoClient) {
        AVLog.d(this.TAG, "Destroy video client ");
        synchronized (this.mVideoClients) {
            this.mVideoClients.remove((InteractVideoClient) videoClient);
            if (this.mVideoClients.isEmpty()) {
                this.mEngine.addLiveCoreVideoFrameListener(this);
                this.mEngine.removeLiveCoreVideoFrameListener(this);
            }
        }
    }

    public void fillSurfaceSeiIfNeed(SurfaceWithExtData surfaceWithExtData) {
        ByteBuffer[] extData = surfaceWithExtData.getExtData();
        if (extData[0] == null && peekSeiSize() > 0) {
            extData[0] = getExtraSei();
        }
    }

    public void needSaveSei(String str, Object obj) {
        int size;
        synchronized (this.mVideoClients) {
            size = this.mVideoClients.size();
        }
        if (size > 0 && (obj instanceof JSONObject)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, obj);
                pushSei(jSONObject.toString());
                return;
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                AVLog.ioe(this.TAG, "Saving sei failed. ", e);
                TTLSSladarBugReportUtils tTLSSladarBugReportUtils = TTLSSladarBugReportUtils.getInstance();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.TAG);
                LIZ.append(".needSaveSei");
                tTLSSladarBugReportUtils.report(e, X1D.LIZIZ(LIZ));
                if (!TTLSBuildConfig.canThrowException()) {
                    return;
                } else {
                    throw new AndroidRuntimeException(e);
                }
            }
        }
        if ((obj instanceof ByteBuffer) && ZlibCompressUtils.isContourInfo((ByteBuffer) obj)) {
            pushSei(obj);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore.ILiveCoreVideoFrameAvailableListener
    public void onI420FrameAvailable(ByteBuffer byteBuffer, int i, int i2, long j, Object... objArr) {
        Object[] objArr2 = objArr;
        if (objArr2.length < 1) {
            objArr2 = new Object[]{null};
        }
        if (objArr2[0] == null && peekSeiSize() > 0) {
            objArr2[0] = getExtraSei();
        }
        synchronized (this.mVideoClients) {
            Iterator<LiveCore.ILiveCoreVideoFrameAvailableListener> it = this.mVideoClients.iterator();
            while (it.hasNext()) {
                it.next().onI420FrameAvailable(byteBuffer, i, i2, j, objArr2);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
        Object[] objArr2 = objArr;
        if (objArr2.length < 1) {
            objArr2 = new Object[]{null};
        }
        if (objArr2[0] == null && peekSeiSize() > 0) {
            objArr2[0] = getExtraSei();
        }
        synchronized (this.mVideoClients) {
            Iterator<LiveCore.ILiveCoreVideoFrameAvailableListener> it = this.mVideoClients.iterator();
            while (it.hasNext()) {
                it.next().onTextureFrameAvailable(eGLContext, i, z, i2, i3, j, fArr, objArr2);
            }
        }
    }
}
