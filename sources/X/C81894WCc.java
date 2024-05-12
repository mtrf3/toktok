package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81894WCc extends AbstractC65781Prl implements InterfaceC65784Pro<W4P<Boolean>> {
    public static final C81894WCc LJLIL = new C81894WCc();

    public C81894WCc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final W4P<Boolean> invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJIIIZ();
        }
        return null;
    }
}
