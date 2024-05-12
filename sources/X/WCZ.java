package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;
import com.fackbook.imagepipeline.IImagePipelineOutService;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class WCZ extends AbstractC65781Prl implements InterfaceC65784Pro<HashMap<String, W9L>> {
    public static final WCZ LJLIL = new WCZ();

    public WCZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HashMap<String, W9L> invoke() {
        IImagePipelineOutService LJJIJIIJIL = ImagePipelineConfigFactory.LJJIJIIJIL();
        if (LJJIJIIJIL != null) {
            return LJJIJIIJIL.LJI();
        }
        return null;
    }
}
