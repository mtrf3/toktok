package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81910WCs extends AbstractC65781Prl implements InterfaceC65784Pro<W9O> {
    public static final C81910WCs LJLIL = new C81910WCs();

    public C81910WCs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final W9O invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIIL();
        }
        return null;
    }
}
