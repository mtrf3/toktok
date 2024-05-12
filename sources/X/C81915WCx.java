package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81915WCx extends AbstractC65781Prl implements InterfaceC65784Pro<W8B> {
    public static final C81915WCx LJLIL = new C81915WCx();

    public C81915WCx() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final W8B invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LIZJ();
        }
        return null;
    }
}
