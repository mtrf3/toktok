package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81916WCy extends AbstractC65781Prl implements InterfaceC65784Pro<W8E> {
    public static final C81916WCy LJLIL = new C81916WCy();

    public C81916WCy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final W8E invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJII();
        }
        return null;
    }
}
