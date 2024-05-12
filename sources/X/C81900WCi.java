package X;

import android.content.Context;
import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;

/* renamed from: X.WCi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81900WCi extends AbstractC65781Prl implements InterfaceC65784Pro<Context> {
    public static final C81900WCi LJLIL = new C81900WCi();

    public C81900WCi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Context invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.getContext();
        }
        return null;
    }
}
