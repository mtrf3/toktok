package com.ss.android.vesdk;

import X.C151325wm;
import X.InterfaceC151875xf;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ttve.nativePort.TEImageVectorInterface;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class VEImageVectorInvoker implements InterfaceC151875xf {
    public TEImageVectorInterface mNativeVectorHandler;

    public VEImageVectorInvoker(C151325wm c151325wm) {
        TEImageInterface tEImageInterface = c151325wm.LJII;
        o.LJI(tEImageInterface);
        this.mNativeVectorHandler = new TEImageVectorInterface(tEImageInterface.getNativeHandler());
    }

    public int addVectorSticker(String str) {
        return this.mNativeVectorHandler.addVectorSticker(str);
    }

    public String getVectorCurrentGraphics(int i) {
        return this.mNativeVectorHandler.getVectorCurrentGraphics(i);
    }

    public void addVectorGraphicsWithParams(int i, String str) {
        this.mNativeVectorHandler.addVectorGraphicsWithParams(i, str, "");
    }

    public String getVectorGraphicsParamsWithId(int i, String str) {
        return this.mNativeVectorHandler.getVectorGraphicsParamsWithId(i, str);
    }

    public void removeVectorGraphicsWithId(int i, String str) {
        this.mNativeVectorHandler.removeVectorGraphicsWithId(i, str);
    }

    public void setVectorGraphicsBrushEnable(int i, Boolean bool) {
        this.mNativeVectorHandler.setVectorGraphicsBrushEnable(i, bool.booleanValue());
    }

    public void undoRedoVectorGraphics(int i, Boolean bool) {
        this.mNativeVectorHandler.setVectorGraphicsBrushEnable(i, bool.booleanValue());
    }

    public void addVectorGraphicsWithParams(int i, String str, String str2) {
        this.mNativeVectorHandler.addVectorGraphicsWithParams(i, str, str2);
    }

    public void updateVectorGraphicsParamsWithId(int i, String str, String str2, Boolean bool) {
        this.mNativeVectorHandler.updateVectorGraphicsParamsWithId(i, str, str2, bool.booleanValue());
    }
}
