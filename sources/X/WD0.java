package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* loaded from: classes15.dex */
public final class WD0 extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC79240V8a> {
    public static final WD0 LJLIL = new WD0();

    public WD0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC79240V8a invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            LJJIJIIJIL.LJJI();
            return null;
        }
        return null;
    }
}
