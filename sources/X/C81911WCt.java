package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81911WCt extends AbstractC65781Prl implements InterfaceC65784Pro<W9Q> {
    public static final C81911WCt LJLIL = new C81911WCt();

    public C81911WCt() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final W9Q invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIILL();
        }
        return null;
    }
}
