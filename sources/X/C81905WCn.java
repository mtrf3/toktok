package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81905WCn extends AbstractC65781Prl implements InterfaceC65784Pro<W87> {
    public static final C81905WCn LJLIL = new C81905WCn();

    public C81905WCn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final W87 invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJJIIJZLJL();
        }
        return null;
    }
}
