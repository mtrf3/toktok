package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCf, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81897WCf extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C81897WCf LJLIL = new C81897WCf();

    public C81897WCf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIJI();
        }
        return null;
    }
}
