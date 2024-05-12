package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* loaded from: classes15.dex */
public final class WD1 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final WD1 LJLIL = new WD1();

    public WD1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            LJJIJIIJIL.LJJ();
            return null;
        }
        return null;
    }
}
