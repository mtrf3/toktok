package com.ss.texturerender;

import X.C16880lQ;
import X.C46825IZh;
import X.C47772Ioy;
import X.C47876Iqe;
import X.C48263Iwt;
import X.C48264Iwu;
import X.C48265Iwv;
import X.C48266Iww;
import X.C48267Iwx;
import X.C48284IxE;
import X.C79062V1e;
import X.C79445VFx;
import X.C87400YRw;
import X.G72;
import X.IZW;
import X.InterfaceC45906Hzy;
import X.InterfaceC46840IZw;
import X.InterfaceC47916IrI;
import X.InterfaceC47921IrN;
import X.InterfaceC48268Iwy;
import X.InterfaceC48269Iwz;
import X.JBR;
import X.OFW;
import X.VBU;
import X.X1D;
import X.XXD;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class VideoSurface extends Surface implements Handler.Callback {
    public static final int SUPER_RES_STAT_BMF_V1 = 5;
    public static final int SUPER_RES_STAT_BMF_V1_OPT = 7;
    public static final int SUPER_RES_STAT_BMF_V2 = 6;
    public int LJLIL;
    public int LJLILLLLZI;
    public C48265Iwv mCheckDispatcher;
    public InterfaceC47921IrN mDrawFrameListener;
    public boolean mEnableNoRenderCheck;
    public ArrayList<C48267Iwx> mErrorListenerExts;
    public ArrayList<InterfaceC47916IrI> mErrorListeners;
    public InterfaceC48268Iwy mExtraSurfaceDrawFrameListener;
    public Object mHandlerObject;
    public InterfaceC46840IZw mHeadposeChangedListener;
    public Bundle mMsgObjectBundle;
    public Handler mNotifyHandler;
    public InterfaceC45906Hzy mOnSetSurfaceListener;
    public float mQuatW;
    public float mQuatX;
    public float mQuatY;
    public float mQuatZ;
    public C48264Iwu mRenderChecker;
    public int mRenderDevice;
    public C79445VFx mSurfaceTexture;
    public int mTexType;

    public final synchronized void LJIIZILJ() {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx != null) {
            c79445VFx.releaseOffScreenSurface(false);
            this.mSurfaceTexture = null;
        }
    }

    public final Surface LJII() {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx != null) {
            return c79445VFx.getRenderSurface();
        }
        return null;
    }

    public final void LJIILL() {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx != null) {
            c79445VFx.onTouchEvent(null);
        }
    }

    @Override // android.view.Surface
    public final void release() {
        int i = this.mTexType;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append("release");
        C48284IxE.LIZ(2, i, "VideoSurface", X1D.LIZIZ(LIZ));
        super.release();
        this.mRenderChecker.LIZ();
        LJIIZILJ();
        synchronized (this.mHandlerObject) {
            this.mDrawFrameListener = null;
            this.mNotifyHandler = null;
            ArrayList<InterfaceC47916IrI> arrayList = this.mErrorListeners;
            if (arrayList != null) {
                arrayList.clear();
            }
            ArrayList<C48267Iwx> arrayList2 = this.mErrorListenerExts;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
    }

    @Override // android.view.Surface
    public final void finalize() {
        LJIIZILJ();
        super.finalize();
    }

    public VideoSurface(C79445VFx c79445VFx) {
        super(c79445VFx);
        this.mTexType = -1;
        this.mQuatW = 1.0f;
        this.mRenderDevice = -1;
        this.mSurfaceTexture = c79445VFx;
        if (c79445VFx != null) {
            this.mTexType = c79445VFx.texType();
        }
        if (Looper.myLooper() != null) {
            this.mNotifyHandler = new Handler(this);
        } else {
            this.mNotifyHandler = new Handler(C16880lQ.LLJJJJ(), this);
        }
        this.mHandlerObject = new Object();
        this.mMsgObjectBundle = new Bundle();
        this.mRenderChecker = new C48264Iwu(this.mCheckDispatcher, c79445VFx);
    }

    public final float LIZIZ(int i) {
        switch (i) {
            case 112:
                return this.mQuatX;
            case 113:
                return this.mQuatY;
            case 114:
                return this.mQuatZ;
            case 115:
                return this.mQuatW;
            default:
                return LIZLLL(i, -1);
        }
    }

    public final int LJ(int i) {
        if (i != 133) {
            return LJI(i, -1);
        }
        return this.mRenderDevice;
    }

    public final void LJIIIZ(boolean z) {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx != null) {
            c79445VFx.ignoreSRResolutionCheck(z);
        }
    }

    public final void LJIILLIIL(boolean z) {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx != null) {
            c79445VFx.pause(z, true);
        }
    }

    public final void LJIJI(Bundle bundle) {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx != null) {
            c79445VFx.setEffect(bundle);
        }
    }

    public final void LJIL(C48265Iwv c48265Iwv) {
        if (c48265Iwv != null) {
            boolean z = this.mEnableNoRenderCheck;
            int i = c48265Iwv.LJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setEnabled, ");
            LIZ.append(z);
            C48284IxE.LIZ(2, i, "RenderCheckDispatcher", X1D.LIZIZ(LIZ));
            c48265Iwv.LIZ = z;
        }
        this.mCheckDispatcher = c48265Iwv;
        C48264Iwu c48264Iwu = this.mRenderChecker;
        c48264Iwu.LJI = c48265Iwv;
        if (c48264Iwu.LJIIIIZZ && c48265Iwv != null) {
            c48265Iwv.LIZ(c48264Iwu.LJFF, c48264Iwu);
        }
    }

    public final void LJJI(Looper looper) {
        if (looper != null) {
            this.mNotifyHandler = new Handler(looper, this);
        }
    }

    public final void LJJIFFI(C47876Iqe c47876Iqe) {
        this.mRenderChecker.LJII = c47876Iqe;
    }

    public final void LJJII(InterfaceC47916IrI interfaceC47916IrI) {
        if (this.mErrorListeners == null) {
            this.mErrorListeners = new ArrayList<>();
        }
        if (!this.mErrorListeners.contains(interfaceC47916IrI)) {
            this.mErrorListeners.add(interfaceC47916IrI);
        }
    }

    public final void LJJIIJ(int i) {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx != null) {
            c79445VFx.setSuperResolutionMode(i);
        }
    }

    public final void LJJIJ(Surface surface) {
        C79445VFx c79445VFx;
        TTVideoEngineImpl tTVideoEngineImpl;
        C47772Ioy c47772Ioy;
        InterfaceC45906Hzy interfaceC45906Hzy = this.mOnSetSurfaceListener;
        if ((interfaceC45906Hzy == null || (c47772Ioy = (tTVideoEngineImpl = (TTVideoEngineImpl) ((G72) interfaceC45906Hzy).LJLIL).LLZL) == null || c47772Ioy.onSetSurface(tTVideoEngineImpl.L7, this, surface) <= 0) && (c79445VFx = this.mSurfaceTexture) != null) {
            c79445VFx.updateSurface(surface);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C79445VFx c79445VFx;
        InterfaceC48269Iwz interfaceC48269Iwz;
        switch (message.what) {
            case 4096:
                if (this.mDrawFrameListener == null || (c79445VFx = this.mSurfaceTexture) == null) {
                    return true;
                }
                int i = message.arg1;
                int serial = c79445VFx.getSerial();
                if (i != serial) {
                    C48284IxE.LIZ(2, this.mTexType, "VideoSurface", C48263Iwt.LIZLLL("serial change :", i, ", ", serial));
                    return true;
                }
                Bundle data = message.getData();
                data.getLong("timeStamp");
                if (data.getParcelable("surface") == null) {
                    this.mQuatX = data.getFloat("quaternion_x");
                    this.mQuatY = data.getFloat("quaternion_y");
                    this.mQuatZ = data.getFloat("quaternion_z");
                    this.mQuatW = data.getFloat("quaternion_w");
                    InterfaceC47921IrN interfaceC47921IrN = this.mDrawFrameListener;
                    if (interfaceC47921IrN == null) {
                        return true;
                    }
                    interfaceC47921IrN.onDraw();
                    return true;
                }
                Surface surface = (Surface) data.getParcelable("surface");
                InterfaceC48268Iwy interfaceC48268Iwy = this.mExtraSurfaceDrawFrameListener;
                if (interfaceC48268Iwy == null || (interfaceC48269Iwz = ((C48266Iww) interfaceC48268Iwy).LIZ.LJLJL) == null) {
                    return true;
                }
                ((VBU) interfaceC48269Iwz).LJFF(surface);
                return true;
            case 4097:
                if (this.mSurfaceTexture == null) {
                    return true;
                }
                int i2 = message.arg1;
                int i3 = message.arg2;
                String obj = message.obj.toString();
                ArrayList<InterfaceC47916IrI> arrayList = this.mErrorListeners;
                if (arrayList != null) {
                    Iterator<InterfaceC47916IrI> it = arrayList.iterator();
                    while (it.hasNext()) {
                        it.next().onError(i2);
                    }
                }
                ArrayList<C48267Iwx> arrayList2 = this.mErrorListenerExts;
                if (arrayList2 == null) {
                    return true;
                }
                Iterator<C48267Iwx> it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    it2.next().getClass();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("OnErrorListenerExt (default impl) onError reason=");
                    LIZ.append(i2);
                    LIZ.append(" type=");
                    LIZ.append(i3);
                    C48284IxE.LIZ(2, -1, "VideoSurface", JBR.LJFF(LIZ, " msg=", obj, LIZ));
                }
                return true;
            case 4098:
                if (this.mHeadposeChangedListener == null || this.mSurfaceTexture == null) {
                    return true;
                }
                Bundle data2 = message.getData();
                this.mQuatX = data2.getFloat("quaternion_x");
                this.mQuatY = data2.getFloat("quaternion_y");
                this.mQuatZ = data2.getFloat("quaternion_z");
                float f = data2.getFloat("quaternion_w");
                this.mQuatW = f;
                InterfaceC46840IZw interfaceC46840IZw = this.mHeadposeChangedListener;
                if (interfaceC46840IZw == null) {
                    return true;
                }
                C87400YRw c87400YRw = new C87400YRw(this.mQuatX, this.mQuatY, this.mQuatZ, f);
                IZW setter = (IZW) ((XXD) interfaceC46840IZw).LJLIL;
                o.LJIIIZ(setter, "$setter");
                double[] dArr = (double[]) OFW.LJIIIZ(c87400YRw).LIZ;
                Math.atan2(dArr[2], dArr[8]);
                throw null;
            default:
                return true;
        }
    }

    public final float LIZLLL(int i, int i2) {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx != null) {
            return c79445VFx.getFloatOption(i, i2);
        }
        return 0.0f;
    }

    public final int LJI(int i, int i2) {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx != null) {
            return c79445VFx.getIntOption(i, i2);
        }
        return -1;
    }

    public final String LJIIIIZZ(int i, int i2) {
        if (i != 119) {
            C79445VFx c79445VFx = this.mSurfaceTexture;
            if (c79445VFx != null) {
                return c79445VFx.getStringOption(i, i2);
            }
            return "";
        }
        return "3.46.12";
    }

    public final void LJIILIIL(int i, long j) {
        if (this.mDrawFrameListener == null) {
            return;
        }
        synchronized (this.mHandlerObject) {
            Message obtainMessage = this.mNotifyHandler.obtainMessage(4096);
            this.mMsgObjectBundle.putLong("timeStamp", j);
            obtainMessage.arg1 = i;
            obtainMessage.setData(this.mMsgObjectBundle);
            obtainMessage.sendToTarget();
        }
    }

    public final Bitmap LJIJ(Bundle bundle, C46825IZh c46825IZh) {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx == null) {
            return null;
        }
        return c79445VFx.saveFrame(bundle, c46825IZh);
    }

    public final void LJIJJ(int i, Surface surface) {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx != null) {
            c79445VFx.setExtraSurface(surface, i);
        }
    }

    public final void LJIJJLI(float f, int i) {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx != null) {
            c79445VFx.setOption(i, f);
        }
    }

    public final void LJJ(int i, int i2) {
        boolean z = true;
        if (i != 1) {
            if (i != 133) {
                if (i != 33) {
                    if (i != 34) {
                        C79445VFx c79445VFx = this.mSurfaceTexture;
                        if (c79445VFx != null) {
                            c79445VFx.setOption(i, i2);
                            return;
                        }
                        return;
                    }
                    if (i2 != 1) {
                        z = false;
                    }
                    this.mEnableNoRenderCheck = z;
                    C48265Iwv c48265Iwv = this.mCheckDispatcher;
                    if (c48265Iwv == null) {
                        return;
                    }
                    int i3 = c48265Iwv.LJ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("setEnabled, ");
                    LIZ.append(z);
                    C48284IxE.LIZ(2, i3, "RenderCheckDispatcher", X1D.LIZIZ(LIZ));
                    c48265Iwv.LIZ = z;
                    return;
                }
                if (i2 == 1) {
                    C48264Iwu c48264Iwu = this.mRenderChecker;
                    C79445VFx c79445VFx2 = c48264Iwu.LJFF;
                    if (c79445VFx2 != null) {
                        int texType = c79445VFx2.texType();
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("start, isStarted: ");
                        LIZ2.append(c48264Iwu.LJIIIIZZ);
                        C48284IxE.LIZ(2, texType, "FrameRenderChecker", X1D.LIZIZ(LIZ2));
                    }
                    if (c48264Iwu.LJIIIIZZ) {
                        return;
                    }
                    c48264Iwu.LJIIIIZZ = true;
                    c48264Iwu.LJ = false;
                    c48264Iwu.LIZLLL = false;
                    c48264Iwu.LIZIZ = 0L;
                    c48264Iwu.LIZ = 0L;
                    C48265Iwv c48265Iwv2 = c48264Iwu.LJI;
                    if (c48265Iwv2 == null) {
                        return;
                    }
                    c48265Iwv2.LIZ(c48264Iwu.LJFF, c48264Iwu);
                    return;
                }
                this.mRenderChecker.LIZ();
                return;
            }
            if (this.mRenderDevice == 1) {
                return;
            }
            this.mRenderDevice = i2;
            int i4 = this.mTexType;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("render device:");
            C79062V1e.LJII(LIZ3, this.mRenderDevice, LIZ3, 2, i4, "VideoSurface");
            return;
        }
        C79445VFx c79445VFx3 = this.mSurfaceTexture;
        if (c79445VFx3 == null) {
            return;
        }
        c79445VFx3.updateVideoState(i2);
    }

    public final void LJJIIJZLJL(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        C48284IxE.LIZ(1, this.mTexType, "VideoSurface", C48263Iwt.LIZLLL("setSurfaceDimensions,W:", i, ",H:", i2));
    }

    public final boolean LJJIIZ(int i, int i2) {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx == null) {
            return false;
        }
        return c79445VFx.supportProcessResolution(i, i2);
    }

    public final void LJJIJIIJI(int i, int i2) {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx != null) {
            c79445VFx.updateTexDimension(i, i2);
        }
    }

    public final void LIZ(long j, long j2, Map<Integer, String> map) {
        C79445VFx c79445VFx = this.mSurfaceTexture;
        if (c79445VFx != null) {
            c79445VFx.frameMetaCallback(j, j2, map);
        }
    }

    public final void LJIIJJI(int i, int i2, String str) {
        ArrayList<InterfaceC47916IrI> arrayList = this.mErrorListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        synchronized (this.mHandlerObject) {
            this.mNotifyHandler.obtainMessage(4097, i, i2, str).sendToTarget();
        }
    }

    public final void LJIILJJIL(int i, Surface surface, long j) {
        if (this.mDrawFrameListener == null) {
            return;
        }
        synchronized (this.mHandlerObject) {
            Message obtainMessage = this.mNotifyHandler.obtainMessage(4096);
            Bundle bundle = new Bundle();
            bundle.putLong("timeStamp", j);
            bundle.putParcelable("surface", surface);
            obtainMessage.arg1 = i;
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void LJIIJ(float f, float f2, float f3, float f4, int i) {
        if (this.mHeadposeChangedListener == null) {
            return;
        }
        synchronized (this.mHandlerObject) {
            Message obtainMessage = this.mNotifyHandler.obtainMessage(4098);
            this.mMsgObjectBundle.putFloat("quaternion_x", f);
            this.mMsgObjectBundle.putFloat("quaternion_y", f2);
            this.mMsgObjectBundle.putFloat("quaternion_z", f3);
            this.mMsgObjectBundle.putFloat("quaternion_w", f4);
            obtainMessage.arg1 = i;
            obtainMessage.setData(this.mMsgObjectBundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void LJIIL(float f, float f2, float f3, float f4, int i) {
        if (this.mDrawFrameListener == null) {
            return;
        }
        synchronized (this.mHandlerObject) {
            Message obtainMessage = this.mNotifyHandler.obtainMessage(4096);
            this.mMsgObjectBundle.putFloat("quaternion_x", f);
            this.mMsgObjectBundle.putFloat("quaternion_y", f2);
            this.mMsgObjectBundle.putFloat("quaternion_z", f3);
            this.mMsgObjectBundle.putFloat("quaternion_w", f4);
            obtainMessage.arg1 = i;
            obtainMessage.setData(this.mMsgObjectBundle);
            obtainMessage.sendToTarget();
        }
    }
}
