package com.lynx.canvas;

import X.AnonymousClass028;
import X.C16880lQ;
import X.C25620zW;
import X.C58556MyW;
import X.JBR;
import X.O5Y;
import X.P60;
import X.PPO;
import X.VNU;
import X.X1D;
import Y.IDBReceiverS9S0100000_11;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.MotionEvent;
import android.view.TextureView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes12.dex */
public class UICanvasView extends TextureView implements TextureView.SurfaceTextureListener, P60 {
    public static final boolean LJLLLL = "vivo".equalsIgnoreCase(Build.MANUFACTURER);
    public final Context LJLIL;
    public SurfaceHolder LJLILLLLZI;
    public String LJLJI;
    public long LJLJJI;
    public Boolean LJLJJL;
    public Rect LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public Rect LJLJLLL;
    public Rect LJLL;
    public IDBReceiverS9S0100000_11 LJLLI;
    public boolean LJLLILLLL;
    public float LJLLJ;
    public boolean LJLLL;

    private native long nativeCreateCanvasView(String str, long j, int i, int i2);

    private native void nativeDestroyCanvasView(long j);

    private native void nativeDispatchTouchEvent(long j, ByteBuffer byteBuffer);

    private native void nativeViewLayoutUpdate(long j, int i, int i2, int i3, int i4, int i5, int i6);

    public final void LIZLLL() {
        setNeedAlphaWorkaround(false);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void LIZ() {
        O5Y.LJJJ("KryptonCanvasView", "UICanvasView destroy");
        if (this.LJLJJI != 0) {
            if (this.LJLILLLLZI != null) {
                O5Y.LJJLIIIJJI("KryptonCanvasView", "Destroy surface during UICanvasView destroyed.");
                this.LJLILLLLZI.LIZ(this.LJLJJI);
                this.LJLILLLLZI = null;
            }
            nativeDestroyCanvasView(this.LJLJJI);
            this.LJLJJI = 0L;
        }
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        O5Y.LJJJ("KryptonCanvasView", "onAttachedToWindow");
        super.onAttachedToWindow();
        if (this.LJLLILLLL) {
            O5Y.LJJLIIIJJI("KryptonCanvasView", "initScreenLockWorkaround multiple times.");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("initScreenLockWorkaround ");
        LIZ.append(this);
        O5Y.LJJJ("KryptonCanvasView", X1D.LIZIZ(LIZ));
        if (this.LJLLI == null) {
            this.LJLLI = new IDBReceiverS9S0100000_11(this, 1);
        }
        IntentFilter LIZ2 = AnonymousClass028.LIZ("android.intent.action.SCREEN_OFF");
        try {
            C16880lQ.LJJLIIIJILLIZJL(this.LJLLI, this.LJLIL, LIZ2);
        } catch (Exception e) {
            O5Y.LJIILIIL("KryptonCanvasView", e.getMessage());
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("register BoardCastReceiver: ");
            LIZ3.append(this.LJLLI);
            O5Y.LJIILIIL("KryptonCanvasView", X1D.LIZIZ(LIZ3));
        }
        this.LJLLILLLL = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.LJLLILLLL) {
            O5Y.LJJLIIIJJI("KryptonCanvasView", "deInitScreenLockWorkaround multiple times.");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("deInitScreenLockWorkaround ");
        LIZ.append(this);
        O5Y.LJJJ("KryptonCanvasView", X1D.LIZIZ(LIZ));
        this.LJLLILLLL = false;
        try {
            C16880lQ.LJJLIIIJL(this.LJLIL, this.LJLLI);
        } catch (Exception e) {
            O5Y.LJIILIIL("KryptonCanvasView", e.getMessage());
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("unregister BoardCastReceiver: ");
            LIZ2.append(this.LJLLI);
            O5Y.LJIILIIL("KryptonCanvasView", X1D.LIZIZ(LIZ2));
        }
    }

    public UICanvasView(Context context) {
        super(context);
        this.LJLJJL = Boolean.FALSE;
        O5Y.LJJJ("KryptonCanvasView", "UICanvasView created");
        this.LJLIL = context;
        setSurfaceTextureListener(this);
        this.LJLLJ = 1.0f;
        setOpaque(false);
        setNeedAlphaWorkaround(true);
        SurfaceHolder surfaceHolder = new SurfaceHolder(this, context.getResources().getDisplayMetrics().density);
        this.LJLILLLLZI = surfaceHolder;
        surfaceHolder.LIZIZ(this);
    }

    private void setNeedAlphaWorkaround(boolean z) {
        boolean z2;
        StringBuilder LJI = JBR.LJI("setNeedAlphaWorkaround with ", z, " isBlackListed ");
        boolean z3 = LJLLLL;
        LJI.append(z3);
        O5Y.LJJJ("KryptonCanvasView", X1D.LIZIZ(LJI));
        int i = Build.VERSION.SDK_INT;
        if (i > 28) {
            return;
        }
        if (i == 28) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 & (!z3)) {
            return;
        }
        this.LJLLL = z;
        if (z) {
            super.setAlpha(0.0f);
        } else {
            super.setAlpha(this.LJLLJ);
        }
    }

    public final void LIZJ(Rect rect) {
        if (this.LJLIL instanceof VNU) {
            if (!rect.equals(this.LJLJJLL) || this.LJLJL != getWidth() || this.LJLJLJ != getHeight()) {
                this.LJLJJLL = rect;
                this.LJLJL = getWidth();
                this.LJLJLJ = getHeight();
                long j = this.LJLJJI;
                if (j != 0) {
                    nativeViewLayoutUpdate(j, LJ(this.LJLJJLL.left), LJ(this.LJLJJLL.right), LJ(this.LJLJJLL.top), LJ(this.LJLJJLL.bottom), LJ(this.LJLJL), LJ(this.LJLJLJ));
                }
            }
        }
    }

    public final int LJ(float f) {
        return (int) ((f / this.LJLIL.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceTextureDestroyed ");
        LIZ.append(surfaceTexture);
        O5Y.LJJJ("KryptonCanvasView", X1D.LIZIZ(LIZ));
        return false;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.LJLLJ = f;
        if (!this.LJLLL) {
            super.setAlpha(f);
        }
    }

    public void setId(String str) {
        int i;
        SurfaceHolder surfaceHolder;
        StringBuilder LIZIZ = C25620zW.LIZIZ("setid with ", str, " with nativePtr: ");
        LIZIZ.append(this.LJLJJI);
        O5Y.LJJJ("KryptonCanvasView", X1D.LIZIZ(LIZIZ));
        this.LJLJI = str;
        if (!this.LJLJJL.booleanValue()) {
            if (!C58556MyW.LIZ().LIZ) {
                O5Y.LJJLIIIJJI("KryptonCanvasView", "initCanvasInternal but krypton do not init.");
                return;
            }
            Context context = this.LJLIL;
            if (context instanceof VNU) {
                VNU vnu = (VNU) context;
                if (vnu.LIZLLL() != null && vnu.LIZLLL().LIZ != null) {
                    long newNativeCanvasAppWeakPtr = vnu.LIZLLL().LIZ.newNativeCanvasAppWeakPtr();
                    if (newNativeCanvasAppWeakPtr != 0) {
                        long nativeCreateCanvasView = nativeCreateCanvasView(this.LJLJI, newNativeCanvasAppWeakPtr, LJ(this.LJLJL), LJ(this.LJLJLJ));
                        this.LJLJJI = nativeCreateCanvasView;
                        int i2 = this.LJLJL;
                        if (i2 != 0 && (i = this.LJLJLJ) != 0 && (surfaceHolder = this.LJLILLLLZI) != null) {
                            surfaceHolder.LIZJ(i2, i, nativeCreateCanvasView);
                        }
                        this.LJLJJL = Boolean.TRUE;
                        return;
                    }
                }
            }
            O5Y.LJJLIIIJJI("KryptonCanvasView", "canvas app has been destroyed.");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Set name to initialized canvas with old name ");
        LIZ.append(this.LJLJI);
        LIZ.append(" new id ");
        LIZ.append(str);
        O5Y.LJIILIIL("KryptonCanvasView", X1D.LIZIZ(LIZ));
    }

    public final void LIZIZ(MotionEvent motionEvent, Rect rect, Rect rect2) {
        this.LJLJLLL = rect;
        this.LJLL = rect2;
        long j = this.LJLJJI;
        int actionIndex = motionEvent.getActionIndex();
        int i = 5;
        if (actionIndex >= 5) {
            return;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (pointerCount <= 5) {
            i = pointerCount;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(112);
        float f = this.LJLIL.getResources().getDisplayMetrics().density;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        allocateDirect.clear();
        allocateDirect.put((byte) motionEvent.getActionMasked());
        allocateDirect.put((byte) i);
        allocateDirect.put((byte) actionIndex);
        allocateDirect.put((byte) 1);
        allocateDirect.putInt(LJ(this.LJLL.left));
        allocateDirect.putInt(LJ(this.LJLL.top));
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        for (int i2 = 0; i2 < i; i2++) {
            PPO LIZ = new PPO(motionEvent.getX(i2), motionEvent.getY(i2)).LIZ(this.LJLJLLL, this.LJLL);
            allocateDirect.putInt(motionEvent.getPointerId(i2));
            allocateDirect.putFloat(LIZ.LIZ / f);
            allocateDirect.putFloat(LIZ.LIZIZ / f);
            allocateDirect.putFloat((motionEvent.getX(i2) + rawX) / f);
            allocateDirect.putFloat((motionEvent.getY(i2) + rawY) / f);
        }
        if (this.LJLJJI == 0) {
            return;
        }
        nativeDispatchTouchEvent(j, allocateDirect);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceHolder surfaceHolder;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceTextureAvailable ");
        LIZ.append(surfaceTexture);
        LIZ.append(" wh ");
        LIZ.append(i);
        LIZ.append(" / ");
        LIZ.append(i2);
        O5Y.LJJLIIIJJI("KryptonCanvasView", X1D.LIZIZ(LIZ));
        if (this.LJLJJI != 0 && (surfaceHolder = this.LJLILLLLZI) != null) {
            surfaceHolder.LIZIZ(this);
            this.LJLILLLLZI.LIZJ(i, i2, this.LJLJJI);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onSurfaceTextureAvailable but mNativePtr and sh is ");
        LIZ2.append(this.LJLJJI);
        LIZ2.append(" / ");
        LIZ2.append(this.LJLILLLLZI);
        O5Y.LJIILIIL("KryptonCanvasView", X1D.LIZIZ(LIZ2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        SurfaceHolder surfaceHolder;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceTextureSizeChanged ");
        LIZ.append(surfaceTexture);
        LIZ.append(" wh ");
        LIZ.append(i);
        LIZ.append(" / ");
        LIZ.append(i2);
        O5Y.LJJJ("KryptonCanvasView", X1D.LIZIZ(LIZ));
        long j = this.LJLJJI;
        if (j != 0 && (surfaceHolder = this.LJLILLLLZI) != null) {
            surfaceHolder.LIZJ(i, i2, j);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onSurfaceTextureSizeChanged but mNativePtr and sh is ");
        LIZ2.append(this.LJLJJI);
        LIZ2.append(" / ");
        LIZ2.append(this.LJLILLLLZI);
        O5Y.LJIILIIL("KryptonCanvasView", X1D.LIZIZ(LIZ2));
    }

    @Override // android.view.TextureView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        try {
            super.onSizeChanged(i, i2, i3, i4);
        } catch (NullPointerException e) {
            C16880lQ.LLLLIIL(e);
            O5Y.LJIILIIL("KryptonCanvasView", "onSizeChanged before added to view tree, may produce npe on some devices");
        }
    }
}
