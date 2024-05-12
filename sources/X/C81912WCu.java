package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81912WCu extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C81912WCu LJLIL = new C81912WCu();

    public C81912WCu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIILIIL();
        }
        return null;
    }
}
