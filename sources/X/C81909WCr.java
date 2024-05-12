package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81909WCr extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC81819W9f> {
    public static final C81909WCr LJLIL = new C81909WCr();

    public C81909WCr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC81819W9f invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIJJLI();
        }
        return null;
    }
}
