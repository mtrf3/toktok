package X;

import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class G6E implements R3Y {
    public final /* synthetic */ VideoPublishContainerScene LJLIL;

    @Override // X.R3Y
    public final void onCancel() {
    }

    @Override // X.R3Y
    public final void onSuccess() {
        List<C15070iV<Class<?>, IAVPublishExtension<?>>> list = this.LJLIL.LLJILJILJ;
        if (list != null) {
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                ((IAVPublishExtension) ((C15070iV) it.next()).LIZIZ).onAccountUpdate();
            }
        }
    }

    public G6E(VideoPublishContainerScene videoPublishContainerScene) {
        this.LJLIL = videoPublishContainerScene;
    }
}
