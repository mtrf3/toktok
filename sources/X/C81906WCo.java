package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81906WCo extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC81862WAw> {
    public static final C81906WCo LJLIL = new C81906WCo();

    public C81906WCo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC81862WAw invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIILJJIL();
        }
        return null;
    }
}
