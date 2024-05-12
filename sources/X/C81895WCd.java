package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81895WCd extends AbstractC65781Prl implements InterfaceC65784Pro<W4P<C81738W6c>> {
    public static final C81895WCd LJLIL = new C81895WCd();

    public C81895WCd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final W4P<C81738W6c> invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIJ();
        }
        return null;
    }
}
