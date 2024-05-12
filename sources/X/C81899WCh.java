package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81899WCh extends AbstractC65781Prl implements InterfaceC65784Pro<W9L> {
    public static final C81899WCh LJLIL = new C81899WCh();

    public C81899WCh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final W9L invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIL();
        }
        return null;
    }
}
