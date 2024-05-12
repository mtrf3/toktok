package X;

import com.bytedance.lighten.loader.ImagePipelineConfigFactory;

/* renamed from: X.W5g, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81716W5g implements W8C {
    public volatile W9G LIZ;
    public final /* synthetic */ V21 LIZIZ;

    @Override // X.W8C
    public final W9G LIZ() {
        if (this.LIZ == null) {
            synchronized (this) {
                if (this.LIZ == null) {
                    this.LIZ = ImagePipelineConfigFactory.LJJIJIL(((C81815W9b) this.LIZIZ).LIZ());
                }
            }
        }
        return this.LIZ;
    }

    public C81716W5g(V21 v21) {
        this.LIZIZ = v21;
    }
}
