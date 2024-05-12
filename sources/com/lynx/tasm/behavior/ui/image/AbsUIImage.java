package com.lynx.tasm.behavior.ui.image;

import X.VNU;
import X.VPD;
import android.content.Context;
import android.view.View;
import com.lynx.tasm.behavior.ui.LynxUI;

/* loaded from: classes15.dex */
public abstract class AbsUIImage<T extends View> extends LynxUI<T> {
    @VPD(name = "auto-size")
    public void setAutoSize(boolean z) {
    }

    @VPD(name = "blur-radius")
    public abstract void setBlurRadius(String str);

    @VPD(name = "capInsets")
    public abstract void setCapInsets(String str);

    @VPD(name = "cap-insets")
    public void setCapInsetsBackUp(String str) {
    }

    @VPD(name = "cap-insets-scale")
    public void setCapInsetsScale(String str) {
    }

    @VPD(defaultBoolean = false, name = "cover-start")
    public abstract void setCoverStart(boolean z);

    @VPD(defaultBoolean = false, name = "disable-default-placeholder")
    public void setDisableDefaultPlaceholder(boolean z) {
    }

    @VPD(name = "disable-default-resize")
    public void setDisableDefaultResize(boolean z) {
    }

    @VPD(name = "loop-count")
    public abstract void setLoopCount(int i);

    @VPD(name = "mode")
    public abstract void setObjectFit(String str);

    @VPD(name = "placeholder")
    public abstract void setPlaceholder(String str);

    @VPD(name = "prefetch-height")
    public abstract void setPreFetchHeight(String str);

    @VPD(name = "prefetch-width")
    public abstract void setPreFetchWidth(String str);

    @VPD(defaultBoolean = false, name = "repeat")
    public abstract void setRepeat(boolean z);

    @VPD(name = "src")
    public abstract void setSource(String str);

    public AbsUIImage(VNU vnu) {
        super(vnu);
    }

    public AbsUIImage(Context context) {
        super(context);
    }
}
