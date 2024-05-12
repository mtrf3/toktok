package com.ss.android.vesdk;

import X.C151325wm;
import X.InterfaceC151855xd;
import com.ss.android.ttve.nativePort.TEImageBrushInterface;
import com.ss.android.ttve.nativePort.TEImageInterface;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public class VEImageBrushInvoker implements InterfaceC151855xd {
    public TEImageBrushInterface mNativeBrushHandler;

    public void endStickerBrush() {
        this.mNativeBrushHandler.endStickerBrush();
    }

    public VEImageBrushInvoker(C151325wm c151325wm) {
        TEImageInterface tEImageInterface = c151325wm.LJII;
        o.LJI(tEImageInterface);
        this.mNativeBrushHandler = new TEImageBrushInterface(tEImageInterface.getNativeHandler());
    }

    public int addBrushSticker(String str) {
        return this.mNativeBrushHandler.addBrushSticker(str);
    }

    public void beginStickerBrush(int i) {
        this.mNativeBrushHandler.beginStickerBrush(i);
    }

    public void clearBursh(String str) {
        this.mNativeBrushHandler.clearBursh(str);
    }

    public void clearStickerBrush(int i) {
        this.mNativeBrushHandler.clearStickerBrush(i);
    }

    public String getStickerBrushState(int i) {
        return this.mNativeBrushHandler.getStickerBrushState(i);
    }

    public int removeMagnifier(Boolean bool) {
        return this.mNativeBrushHandler.removeMagnifier(bool.booleanValue());
    }

    public void setEraseMattingMask(String str) {
        this.mNativeBrushHandler.setEraseMattingMask(str);
    }

    public void setStickerBrushParams(String str) {
        this.mNativeBrushHandler.setStickerBrushParams(str);
    }

    public void setStickerBrushResource(String str) {
        this.mNativeBrushHandler.setStickerBrushResource(str);
    }

    public void enableEraseMatting(String str, Boolean bool) {
        this.mNativeBrushHandler.enableEraseMatting(str, bool.booleanValue());
    }

    public void enableImageMatting(String str, Boolean bool) {
        this.mNativeBrushHandler.enableImageMatting(str, bool.booleanValue());
    }

    public void setSmartMattingMask(String str, int i) {
        this.mNativeBrushHandler.setSmartMattingMask(str, i);
    }

    public void undoRedoBursh(String str, Boolean bool) {
        this.mNativeBrushHandler.undoRedoBursh(str, bool.booleanValue());
    }

    public void undoRedoStickerBrush(Boolean bool, int i) {
        this.mNativeBrushHandler.undoRedoStickerBrush(bool.booleanValue(), i);
    }

    public void setEffectTextureCachePathAndSize(String str, int i, int i2) {
        this.mNativeBrushHandler.setEffectTextureCachePathAndSize(str, i, i2);
    }

    public void setPaintBrushEnable(String str, String str2, Boolean bool) {
        this.mNativeBrushHandler.setPaintBrushEnable(str, str2, bool.booleanValue());
    }

    public int updateMagnifier(Float f, Float f2, Float f3, Boolean bool) {
        return this.mNativeBrushHandler.updateMagnifier(f.floatValue(), f2.floatValue(), f3.floatValue(), bool.booleanValue());
    }

    public Boolean isBrushOverlapped(String str, Float f, Float f2, Float f3, Float f4) {
        return Boolean.valueOf(this.mNativeBrushHandler.isBrushOverlapped(str, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue()));
    }

    public void setStrokeRgba(String str, Float f, Float f2, Float f3, Float f4, Long l) {
        this.mNativeBrushHandler.setStrokeRgba(str, f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue(), l.longValue());
    }

    public void setPaintParams(String str, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, int i) {
        String str2 = "";
        if (f.floatValue() >= 0.0f) {
            str2 = i0.LJFF("", "strokeSize:$strokeSize;");
        }
        if (f2.floatValue() >= 0.0f) {
            str2 = i0.LJFF(str2, "strokeStep:$strokeStep;");
        }
        if (f3.floatValue() >= 0.0f) {
            str2 = i0.LJFF(str2, "featherSize:$featherSize;");
        }
        if (f4.floatValue() >= 0.0f) {
            str2 = i0.LJFF(str2, "speedInfluence:$speedInfluence;");
        }
        if (f5.floatValue() >= 0.0f) {
            str2 = i0.LJFF(str2, "R:$R;");
        }
        if (f6.floatValue() >= 0.0f) {
            str2 = i0.LJFF(str2, "G:$G;");
        }
        if (f7.floatValue() >= 0.0f) {
            str2 = i0.LJFF(str2, "B:$B;");
        }
        if (f8.floatValue() >= 0.0f) {
            str2 = i0.LJFF(str2, "A:$A;");
        }
        if (i >= 0) {
            str2 = i0.LJFF(str2, "type:$type;");
        }
        this.mNativeBrushHandler.setPaintParams(str, str2);
    }
}
