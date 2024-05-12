package X;

import android.graphics.Bitmap;
import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81901WCj extends AbstractC65781Prl implements InterfaceC65784Pro<Bitmap.Config> {
    public static final C81901WCj LJLIL = new C81901WCj();

    public C81901WCj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Bitmap.Config invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LIZ();
        }
        return null;
    }
}
