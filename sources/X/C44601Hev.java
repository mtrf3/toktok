package X;

import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hev, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44601Hev extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
    public final C44539Hdv LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final int LJ;

    @Override // X.InterfaceC44653Hfl
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC44653Hfl
    public final String getName() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC44653Hfl
    public final int getPriority() {
        return this.LJ;
    }

    @Override // X.AbstractC44652Hfk
    public final void LIZIZ(VEVideoEncodeConfigParams vEVideoEncodeConfigParams) {
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams2 = vEVideoEncodeConfigParams;
        C44539Hdv c44539Hdv = this.LIZIZ;
        C44609Hf3 c44609Hf3 = c44539Hdv.LIZIZ.LJFF;
        VideoPublishEditModel videoPublishEditModel = c44539Hdv.LIZ;
        int i = c44609Hf3.LIZ;
        int i2 = c44609Hf3.LIZIZ;
        boolean z = c44609Hf3.LIZJ;
        int i3 = c44609Hf3.LIZLLL;
        int i4 = c44609Hf3.LJ;
        AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(vEVideoEncodeConfigParams2, 19);
        AqS189S0100000_7 aqS189S0100000_7 = new AqS189S0100000_7(vEVideoEncodeConfigParams2, 1);
        o.LJIIIZ(videoPublishEditModel, "<this>");
        if (!H7R.LJJIL(videoPublishEditModel)) {
            return;
        }
        if (C79004UzY.LJJJI(videoPublishEditModel.canvasVideoData)) {
            C78915Uy7.LJIIJJI(videoPublishEditModel, aqS173S0100000_7);
            return;
        }
        boolean LJJIII = H7R.LJJIII(videoPublishEditModel);
        if (!LJJIII) {
            if (i2 > 0 && z) {
                i = i3;
            } else {
                i = i2;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadFps canvas -> saveToDevice = ");
        LIZ.append(videoPublishEditModel.isSaveLocalWithWaterMark());
        LIZ.append(";hasDynamicElement = ");
        LIZ.append(LJJIII);
        C1EU.LIZJ(LIZ, ";canvasFps = ", i, "; watermarkFps = ", i4);
        C5Z5.LIZ(X1D.LIZIZ(LIZ));
        if (i > 0) {
            if (z && videoPublishEditModel.isSaveLocalWithWaterMark() && !LJJIII) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("UploadFps canvas : -> setFps(");
                LIZ2.append(i4);
                LIZ2.append(", ");
                LIZ2.append(i);
                LIZ2.append(')');
                C5Z5.LIZIZ(X1D.LIZIZ(LIZ2));
                aqS189S0100000_7.invoke(Integer.valueOf(i4), Integer.valueOf(i));
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("UploadFps canvas : -> setFps(");
            LIZ3.append(i);
            LIZ3.append(')');
            C5Z5.LIZIZ(X1D.LIZIZ(LIZ3));
            aqS173S0100000_7.invoke(Integer.valueOf(i));
            return;
        }
        C78915Uy7.LJIIJJI(videoPublishEditModel, aqS173S0100000_7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44601Hev(InterfaceC44653Hfl strategy, C44539Hdv initParams) {
        super(strategy);
        C44610Hf4 c44610Hf4 = C44610Hf4.LIZ;
        String name = c44610Hf4.key;
        int i = c44610Hf4.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "upload";
        this.LIZLLL = name;
        this.LJ = i;
    }
}
