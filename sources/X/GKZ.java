package X;

import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcTemplateEditPreviewScene;

/* loaded from: classes8.dex */
public final class GKZ implements GHB {
    public final /* synthetic */ PUgcTemplateEditPreviewScene LJLIL;

    public GKZ(PUgcTemplateEditPreviewScene pUgcTemplateEditPreviewScene) {
        this.LJLIL = pUgcTemplateEditPreviewScene;
    }

    @Override // X.GHB
    public final boolean onBackPressed() {
        GKY gky = this.LJLIL.LJLZ;
        if (gky != null) {
            gky.LIZLLL();
            return false;
        }
        return false;
    }
}
