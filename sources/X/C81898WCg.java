package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81898WCg extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC81739W6d> {
    public static final C81898WCg LJLIL = new C81898WCg();

    public C81898WCg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC81739W6d invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJ();
        }
        return null;
    }
}
