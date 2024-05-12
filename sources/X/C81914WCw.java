package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81914WCw extends AbstractC65781Prl implements InterfaceC65784Pro<W8K> {
    public static final C81914WCw LJLIL = new C81914WCw();

    public C81914WCw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final W8K invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJFF();
        }
        return null;
    }
}
