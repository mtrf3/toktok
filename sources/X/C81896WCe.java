package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81896WCe extends AbstractC65781Prl implements InterfaceC65784Pro<W6O> {
    public static final C81896WCe LJLIL = new C81896WCe();

    public C81896WCe() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final W6O invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJJII();
        }
        return null;
    }
}
