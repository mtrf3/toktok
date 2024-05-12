package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81904WCm extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C81904WCm LJLIL = new C81904WCm();

    public C81904WCm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIILLIIL();
        }
        return null;
    }
}
