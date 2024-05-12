package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81902WCk extends AbstractC65781Prl implements InterfaceC65784Pro<W9L> {
    public static final C81902WCk LJLIL = new C81902WCk();

    public C81902WCk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final W9L invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LIZLLL();
        }
        return null;
    }
}
