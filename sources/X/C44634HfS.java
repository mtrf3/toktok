package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.compileConfig.strategies.source.CanvasCompileConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.HfS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44634HfS implements InterfaceC44653Hfl<CanvasCompileConfigParams> {
    public final C44639HfX LIZ;
    public final C44628HfM LIZIZ;

    @Override // X.InterfaceC44653Hfl
    public final CanvasCompileConfigParams execute() {
        C44639HfX c44639HfX = this.LIZ;
        String str = c44639HfX.LIZ;
        CompileConfigResolution maxResolution = this.LIZIZ.LIZ.LIZ;
        int i = c44639HfX.LIZJ;
        boolean z = C34065DYn.LIZ;
        Bitmap.Config config = Bitmap.Config.RGB_565;
        o.LJIIIZ(str, "<this>");
        o.LJIIIZ(maxResolution, "maxResolution");
        o.LJIIIZ(config, "config");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SourceCanvasResolution CanvasBitmapWithPixelLimit ; maxResolution : ");
        LIZ.append(maxResolution);
        LIZ.append(" ; factor : ");
        LIZ.append(i);
        C5Z5.LIZ(X1D.LIZIZ(LIZ));
        OSZ osz = new OSZ(Integer.valueOf(maxResolution.getWidth() * i), Integer.valueOf(maxResolution.getHeight() * i));
        int intValue = ((Number) osz.getFirst()).intValue();
        int intValue2 = ((Number) osz.getSecond()).intValue();
        if (z) {
            CanvasCompileConfigParams canvasCompileConfigParams = new CanvasCompileConfigParams();
            canvasCompileConfigParams.setOutputSize(maxResolution);
            canvasCompileConfigParams.setOutputBitmap(C44729Hgz.LJI(str, intValue, intValue2, config));
            return canvasCompileConfigParams;
        }
        CanvasCompileConfigParams canvasCompileConfigParams2 = new CanvasCompileConfigParams();
        canvasCompileConfigParams2.setOutputSize(maxResolution);
        canvasCompileConfigParams2.setOutputBitmap(C44729Hgz.LJIIJ(str, intValue, intValue2, config));
        return canvasCompileConfigParams2;
    }

    public C44634HfS(C44639HfX initParams, C44628HfM strategiesResult) {
        String name = C44637HfV.LIZ.key;
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(strategiesResult, "strategiesResult");
        o.LJIIIZ(name, "name");
        this.LIZ = initParams;
        this.LIZIZ = strategiesResult;
    }
}
