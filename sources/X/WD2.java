package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* loaded from: classes15.dex */
public final class WD2 extends AbstractC65781Prl implements InterfaceC65784Pro<AbstractC78853Ux7> {
    public static final WD2 LJLIL = new WD2();

    public WD2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final AbstractC78853Ux7 invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            LJJIJIIJIL.LIZIZ();
            return null;
        }
        return null;
    }
}
