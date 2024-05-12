package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCz, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81917WCz extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC81842WAc> {
    public static final C81917WCz LJLIL = new C81917WCz();

    public C81917WCz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC81842WAc invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            LJJIJIIJIL.LJIJJ();
            return null;
        }
        return null;
    }
}
