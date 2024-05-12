package com.ss.android.vesdk;

import X.C151325wm;
import X.C89456Z8y;
import X.C89457Z8z;
import X.InterfaceC151765xU;
import X.InterfaceC151775xV;
import X.InterfaceC151785xW;
import X.InterfaceC151845xc;
import X.Z90;
import com.ss.android.ttve.nativePort.TEImageALGCallbackInterface;
import com.ss.android.ttve.nativePort.TEImageInterface;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public class VEImageALGCallbackInvoker implements InterfaceC151845xc {
    public TEImageALGCallbackInterface.FInfoCallback mFInfoCallback;
    public TEImageALGCallbackInterface mNativeBrushHandler;
    public TEImageALGCallbackInterface.SceneInfoCallback mSceneInfoCallback;
    public TEImageALGCallbackInterface.SkeletonInfoCallback mSkeletonInfoCallback;

    public void unRegSceneDetectCallback() {
        this.mNativeBrushHandler.unRegisterSceneDetectCallback();
        this.mSceneInfoCallback = null;
    }

    public void unRegSkeletonDetectCallback() {
        this.mNativeBrushHandler.unRegisterSkeletonDetectCallback();
        this.mSkeletonInfoCallback = null;
    }

    public void unregFaceInfoCallback() {
        this.mNativeBrushHandler.unRegisterFaceInfoUpload();
        this.mFInfoCallback = null;
    }

    public VEImageALGCallbackInvoker(C151325wm c151325wm) {
        TEImageInterface tEImageInterface = c151325wm.LJII;
        o.LJI(tEImageInterface);
        this.mNativeBrushHandler = new TEImageALGCallbackInterface(tEImageInterface.getNativeHandler());
    }

    public void regFaceInfoCallback(InterfaceC151765xU interfaceC151765xU) {
        if (this.mFInfoCallback == null) {
            this.mFInfoCallback = new Z90();
        }
        this.mNativeBrushHandler.registerFaceInfoUpload(this.mFInfoCallback);
    }

    public void regSceneDetectCallback(InterfaceC151775xV interfaceC151775xV) {
        if (this.mSceneInfoCallback == null) {
            this.mSceneInfoCallback = new C89456Z8y();
        }
        this.mNativeBrushHandler.registerSceneDetectCallback(this.mSceneInfoCallback);
    }

    public void regSkeletonDetectCallback(InterfaceC151785xW interfaceC151785xW) {
        if (this.mSkeletonInfoCallback == null) {
            this.mSkeletonInfoCallback = new C89457Z8z();
        }
        this.mNativeBrushHandler.registerSkeletonDetectCallback(this.mSkeletonInfoCallback);
    }
}
