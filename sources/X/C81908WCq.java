package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81908WCq extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C81908WCq LJLIL = new C81908WCq();

    public C81908WCq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIIZILJ();
        }
        return null;
    }
}
