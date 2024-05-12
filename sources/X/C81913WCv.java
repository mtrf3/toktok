package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81913WCv extends AbstractC65781Prl implements InterfaceC65784Pro<WB6> {
    public static final C81913WCv LJLIL = new C81913WCv();

    public C81913WCv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final WB6 invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIIIIZZ();
        }
        return null;
    }
}
