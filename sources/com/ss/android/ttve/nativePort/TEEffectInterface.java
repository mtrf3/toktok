package com.ss.android.ttve.nativePort;

import X.C79380VDk;
import X.P4Q;
import X.X09;
import X.X0H;
import X.X0K;
import X.X0O;
import X.X0Q;
import X.X0T;
import X.X0W;
import X.X0X;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import java.util.List;

/* loaded from: classes15.dex */
public class TEEffectInterface {
    public TEEffectCallback mEffectCallback = new TEEffectCallback();
    public volatile long mHandle;

    private native int nativeCallEffectInterface(long j, long j2);

    private native Object nativeCallEffectInterfaceWithObjectResult(long j, long j2);

    private native int nativeCallEffectInterfaceWithResult(long j, long j2, long j3);

    private native int nativeSetEffectCallback(long j, TEEffectCallback tEEffectCallback);

    private void setEffectCallback() {
        if (this.mEffectCallback != null) {
            nativeSetEffectCallback(this.mHandle, this.mEffectCallback);
        }
    }

    public void release() {
        P4Q.LJFF("TEEffectInterface", "release...");
        this.mEffectCallback = null;
        this.mHandle = 0L;
    }

    public void unregBachAlgorithmCallback() {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.unregBachAlgorithmCallback();
        }
    }

    public TEEffectInterface(long j) {
        this.mHandle = j;
        setEffectCallback();
    }

    public int callEffectInterface(TEBundle tEBundle) {
        if (this.mHandle == 0) {
            P4Q.LJII("TEEffectInterface", "callEffectInterface, but mHandle is invalid.");
            return -1;
        }
        int nativeCallEffectInterface = nativeCallEffectInterface(this.mHandle, tEBundle.getHandle());
        tEBundle.recycle();
        return nativeCallEffectInterface;
    }

    public Object callEffectInterfaceWithResult(TEBundle tEBundle) {
        if (this.mHandle == 0) {
            P4Q.LJII("TEEffectInterface", "callEffectInterfaceWithResult, but mHandle is invalid.");
            return null;
        }
        Object nativeCallEffectInterfaceWithObjectResult = nativeCallEffectInterfaceWithObjectResult(this.mHandle, tEBundle.getHandle());
        tEBundle.recycle();
        return nativeCallEffectInterfaceWithObjectResult;
    }

    public void regBachAlgorithmCallback(List<C79380VDk> list) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.regBachAlgorithmCallback(list);
        }
    }

    public void setARTextBitmapCallback(X09 x09) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setARTextBitmapCallback(x09);
        }
    }

    public void setARTextParagraphContentCallback(X0H x0h) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setARTextParagraphContentCallback(x0h);
        }
    }

    public void setEffectAlgorithmInfoCallback(X0O x0o) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setEffectAlgorithmInfoCallback(x0o);
        }
    }

    public void setFaceDetectListener(X0X x0x) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setFaceDetectListener(x0x);
        }
    }

    public void setFaceInfoCallback(X0Q x0q) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setFaceInfoCallback(x0q);
        }
    }

    public void setLandMarkDetectCallback(X0W x0w) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setLandmarkDetectListener(x0w);
        }
    }

    public void setSkeletonDetectCallback(X0K x0k) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setSkeletonDetectCallback(x0k);
        } else {
            P4Q.LIZJ("TEEffectInterface", "setSkeletonDetectCallback failed");
        }
    }

    public void setSmartBeautyCallback(X0T x0t) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setOnSmartBeautyListener(x0t);
        }
    }

    public void setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback) {
        TEEffectCallback tEEffectCallback = this.mEffectCallback;
        if (tEEffectCallback != null) {
            tEEffectCallback.setStickerRequestCallback(iStickerRequestCallback);
        }
    }

    public int callEffectInterfaceWithResult(TEBundle tEBundle, TEBundle tEBundle2) {
        if (this.mHandle == 0) {
            P4Q.LJII("TEEffectInterface", "callEffectInterfaceWithResult, but mHandle is invalid.");
            return -1;
        }
        int nativeCallEffectInterfaceWithResult = nativeCallEffectInterfaceWithResult(this.mHandle, tEBundle.getHandle(), tEBundle2.getHandle());
        tEBundle.recycle();
        return nativeCallEffectInterfaceWithResult;
    }
}
