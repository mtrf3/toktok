package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81893WCb extends AbstractC65781Prl implements InterfaceC65784Pro<W4P<C81738W6c>> {
    public static final C81893WCb LJLIL = new C81893WCb();

    public C81893WCb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final W4P<C81738W6c> invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJJIFFI();
        }
        return null;
    }
}
