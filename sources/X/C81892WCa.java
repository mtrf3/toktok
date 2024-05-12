package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81892WCa extends AbstractC65781Prl implements InterfaceC65784Pro<QGQ<? extends QGS>> {
    public static final C81892WCa LJLIL = new C81892WCa();

    public C81892WCa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final QGQ<? extends QGS> invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIIJ();
        }
        return null;
    }
}
