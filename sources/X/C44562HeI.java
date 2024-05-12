package X;

import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HeI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44562HeI extends AbstractC44652Hfk<VEVideoEncodeConfigParams> {
    public final C44537Hdt LIZIZ;
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
        int[] LJIIJJI;
        VEVideoEncodeConfigParams vEVideoEncodeConfigParams2 = vEVideoEncodeConfigParams;
        C44537Hdt c44537Hdt = this.LIZIZ;
        VideoPublishEditModel videoPublishEditModel = c44537Hdt.LIZ;
        if (videoPublishEditModel.isPhotoMvMode) {
            C44549He5 c44549He5 = c44537Hdt.LIZIZ;
            LJIIJJI = C44729Hgz.LJJJIL(videoPublishEditModel, c44549He5.LJ.LIZ, c44549He5.LIZ(c44537Hdt.LIZ()));
        } else if (H7R.LJJJLL(videoPublishEditModel)) {
            LJIIJJI = C44729Hgz.LJJJI(videoPublishEditModel);
        } else if (videoPublishEditModel.isMvThemeVideoType()) {
            LJIIJJI = C44729Hgz.LJJJLIIL(videoPublishEditModel);
        } else if (videoPublishEditModel.isDuet()) {
            LJIIJJI = C44729Hgz.LJIILJJIL(videoPublishEditModel);
        } else if (videoPublishEditModel.hasText()) {
            C44537Hdt c44537Hdt2 = this.LIZIZ;
            LJIIJJI = C44729Hgz.LJJJLL(videoPublishEditModel, c44537Hdt2.LIZIZ.LIZ(c44537Hdt2.LIZ()));
        } else {
            C44537Hdt c44537Hdt3 = this.LIZIZ;
            LJIIJJI = C44729Hgz.LJIIJJI(videoPublishEditModel, c44537Hdt3.LIZIZ.LIZ(c44537Hdt3.LIZ()));
        }
        vEVideoEncodeConfigParams2.setOutputSize(new CompileConfigResolution(LJIIJJI[0], LJIIJJI[1], null, null, 12, null));
        AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(vEVideoEncodeConfigParams2, 16);
        AqS173S0100000_7 aqS173S0100000_72 = new AqS173S0100000_7(vEVideoEncodeConfigParams2, 17);
        AqS173S0100000_7 aqS173S0100000_73 = new AqS173S0100000_7(vEVideoEncodeConfigParams2, 18);
        if (H7R.LJJJZ(videoPublishEditModel) || (H7R.LIZJ(videoPublishEditModel) && (LJIIJJI[0] > videoPublishEditModel.videoWidth() || LJIIJJI[1] > videoPublishEditModel.videoHeight()))) {
            C5Z5.LIZIZ("UploadResizeModel; resizeModel : 3, resizeX : 0.0f, resizeY : 0.0f");
            aqS173S0100000_7.invoke(3);
            aqS173S0100000_72.invoke(Float.valueOf(0.0f));
            aqS173S0100000_73.invoke(Float.valueOf(0.0f));
        } else if (videoPublishEditModel.isFastImport || videoPublishEditModel.isDuet() || videoPublishEditModel.isStitchMode() || videoPublishEditModel.isLibraryMaterialUsed()) {
            C5Z5.LIZIZ("UploadResizeModel; resizeModel : 1");
            aqS173S0100000_7.invoke(1);
        }
        if (H7R.LJJLIIIJJIZ(videoPublishEditModel)) {
            C5Z5.LIZIZ("UploadResizeModel; resizeModel : 1");
            aqS173S0100000_7.invoke(1);
        } else if (H7R.LJJIL(videoPublishEditModel)) {
            C5Z5.LIZIZ("UploadResizeModel; resizeModel : 4");
            aqS173S0100000_7.invoke(4);
        }
        if (C143205jg.LJFF(videoPublishEditModel)) {
            C5Z5.LIZIZ("UploadResizeModel; resizeModel : 2");
            aqS173S0100000_7.invoke(2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44562HeI(InterfaceC44653Hfl strategy, C44537Hdt initParams) {
        super(strategy);
        C44579HeZ c44579HeZ = C44579HeZ.LIZ;
        String name = c44579HeZ.key;
        int i = c44579HeZ.priority;
        o.LJIIIZ(strategy, "strategy");
        o.LJIIIZ(initParams, "initParams");
        o.LJIIIZ(name, "name");
        this.LIZIZ = initParams;
        this.LIZJ = "upload";
        this.LIZLLL = name;
        this.LJ = i;
    }
}
