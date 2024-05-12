package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCp, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81907WCp extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C81907WCp LJLIL = new C81907WCp();

    public C81907WCp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJJIII();
        }
        return null;
    }
}
