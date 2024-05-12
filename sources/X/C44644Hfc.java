package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.compileConfig.strategies.source.CanvasCompileConfigParams;
import kotlin.jvm.internal.o;

/* renamed from: X.Hfc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44644Hfc extends AbstractC44652Hfk<CanvasCompileConfigParams> {
    public final C44648Hfg LIZIZ;
    public final C44647Hff LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final int LJFF;

    @Override // X.InterfaceC44653Hfl
    public final String LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC44653Hfl
    public final String getName() {
        return this.LJ;
    }

    @Override // X.InterfaceC44653Hfl
    public final int getPriority() {
        return this.LJFF;
    }

    @Override // X.AbstractC44652Hfk
    public final void LIZIZ(CanvasCompileConfigParams canvasCompileConfigParams) {
        OSZ osz;
        CompileConfigResolution compileConfigResolution;
        CanvasCompileConfigParams canvasCompileConfigParams2 = canvasCompileConfigParams;
        if (this.LIZIZ.LIZIZ || !C44761HhV.LIZ()) {
            return;
        }
        C44648Hfg c44648Hfg = this.LIZIZ;
        CompileConfigResolution maxSize = this.LIZJ.LIZ.LIZ;
        o.LJIIIZ(c44648Hfg, "<this>");
        o.LJIIIZ(maxSize, "maxSize");
        Bitmap bitmap = c44648Hfg.LIZJ;
        if (bitmap == null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            C44694HgQ.LIZLLL(c44648Hfg.LIZ, options);
            osz = new OSZ(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        } else {
            osz = new OSZ(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(c44648Hfg.LIZJ.getHeight()));
        }
        int intValue = ((Number) osz.getFirst()).intValue();
        int intValue2 = ((Number) osz.getSecond()).intValue();
        if (intValue != 0 && intValue2 != 0) {
            CompileConfigResolution compileConfigResolution2 = new CompileConfigResolution(intValue, intValue2, null, null, 12, null);
            if (maxSize.getWidth() * compileConfigResolution2.getHeight() > compileConfigResolution2.getWidth() * maxSize.getHeight()) {
                if (compileConfigResolution2.getHeight() <= maxSize.getHeight()) {
                    compileConfigResolution = new CompileConfigResolution((maxSize.getWidth() * compileConfigResolution2.getHeight()) / maxSize.getHeight(), compileConfigResolution2.getHeight(), null, null, 12, null);
                }
            } else if (compileConfigResolution2.getWidth() <= maxSize.getWidth()) {
                compileConfigResolution = new CompileConfigResolution(compileConfigResolution2.getWidth(), (maxSize.getHeight() * compileConfigResolution2.getWidth()) / maxSize.getWidth(), null, null, 12, null);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PreviewCanvasResolution ; DynamicSize ; maxSize : ");
            LIZ.append(maxSize);
            LIZ.append(" ; realSize : ");
            LIZ.append(compileConfigResolution);
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ));
            canvasCompileConfigParams2.setOutputSize(compileConfigResolution);
        }
        compileConfigResolution = maxSize;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PreviewCanvasResolution ; DynamicSize ; maxSize : ");
        LIZ2.append(maxSize);
        LIZ2.append(" ; realSize : ");
        LIZ2.append(compileConfigResolution);
        C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
        canvasCompileConfigParams2.setOutputSize(compileConfigResolution);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44644Hfc(InterfaceC44653Hfl strategy, C44648Hfg initParams, C44647Hff strategiesResult) {
        super(strategy);
        C44649Hfh c44649Hfh = C44649Hfh.LIZ;
        String name = c44649Hfh.key;
        int i = c44649Hfh.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(strategiesResult, "strategiesResult");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = strategiesResult;
        this.LIZLLL = "preview";
        this.LJ = name;
        this.LJFF = i;
    }
}
