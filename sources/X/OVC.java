package X;

import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.EditorProAnchorConfig;
import com.ss.android.ugc.gamora.editorpro.anchor.EditorProAnchorActivity;

/* loaded from: classes11.dex */
public final class OVC extends SimpleServiceLoadCallback {
    public final /* synthetic */ EditorProAnchorActivity LIZ;
    public final /* synthetic */ EditorProAnchorConfig LIZIZ;

    public OVC(EditorProAnchorActivity editorProAnchorActivity, EditorProAnchorConfig editorProAnchorConfig) {
        this.LIZ = editorProAnchorActivity;
        this.LIZIZ = editorProAnchorConfig;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startEditorProAnchorAlbum(this.LIZ, this.LIZIZ);
    }
}
