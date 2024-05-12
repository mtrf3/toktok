package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* loaded from: classes15.dex */
public final class WCY extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Set<? extends InterfaceC81754W6s>> {
    public static final WCY LJLIL = new WCY();

    public WCY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Set<? extends InterfaceC81754W6s> invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIIJJI();
        }
        return null;
    }
}
