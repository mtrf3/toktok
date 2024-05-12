package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.SearchAlbumParams;
import com.ss.android.ugc.aweme.shortvideo.model.SearchCreationExtraData;

/* renamed from: X.Gks, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42422Gks extends SimpleServiceLoadCallback {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ SearchCreationExtraData LIZJ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").openSearchAlbum(this.LIZ, new SearchAlbumParams("hashtag_search", "general_search", System.currentTimeMillis(), new CreativeInfo(this.LIZIZ, 0, null, 6, null), this.LIZJ));
    }

    public C42422Gks(Activity activity, String str, SearchCreationExtraData searchCreationExtraData) {
        this.LIZ = activity;
        this.LIZIZ = str;
        this.LIZJ = searchCreationExtraData;
    }
}
