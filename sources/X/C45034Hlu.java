package X;

import com.ss.android.ugc.aweme.assem.ToolsActivityAssem;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;

/* renamed from: X.Hlu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45034Hlu implements IAVPublishService.PublishProgressController {
    public final /* synthetic */ ToolsActivityAssem LJLIL;
    public final /* synthetic */ PublishModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public C45034Hlu(ToolsActivityAssem toolsActivityAssem, PublishModel publishModel, boolean z) {
        this.LJLIL = toolsActivityAssem;
        this.LJLILLLLZI = publishModel;
        this.LJLJI = z;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IAVPublishService.PublishProgressController
    public final boolean initHide() {
        if (!this.LJLIL.C3(this.LJLILLLLZI) && !this.LJLJI) {
            return true;
        }
        return false;
    }
}
