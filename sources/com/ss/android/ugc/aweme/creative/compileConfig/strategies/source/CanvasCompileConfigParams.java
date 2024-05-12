package com.ss.android.ugc.aweme.creative.compileConfig.strategies.source;

import X.C44849Hiv;
import X.C65352Pkq;
import X.InterfaceC214508bO;
import X.InterfaceC74236TBo;
import X.TBV;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.compileConfig.BaseCompileConfigParams;
import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CanvasCompileConfigParams extends BaseCompileConfigParams {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;
    public Bitmap outputBitmap;
    public final InterfaceC214508bO outputSize$delegate = new C44849Hiv(new CompileConfigResolution(0, 0, null, null, 15, null), this);

    static {
        TBV tbv = new TBV(CanvasCompileConfigParams.class, "outputSize", "getOutputSize()Lcom/ss/android/ugc/aweme/creative/compileConfig/CompileConfigResolution;", 0);
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbv};
    }

    public final CompileConfigResolution getOutputSize() {
        return (CompileConfigResolution) this.outputSize$delegate.LIZ(this, $$delegatedProperties[0]);
    }

    public final Bitmap getOutputBitmap() {
        return this.outputBitmap;
    }

    public final void setOutputBitmap(Bitmap bitmap) {
        this.outputBitmap = bitmap;
    }

    public final void setOutputSize(CompileConfigResolution compileConfigResolution) {
        o.LJIIIZ(compileConfigResolution, "<set-?>");
        this.outputSize$delegate.LIZIZ($$delegatedProperties[0], this, compileConfigResolution);
    }
}
