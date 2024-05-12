package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Gke, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42408Gke extends SimpleServiceLoadCallback {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ ActivityC45651qj LIZIZ;
    public final /* synthetic */ RecordConfig.Builder LIZJ;
    public final /* synthetic */ MusicModel LIZLLL;
    public final /* synthetic */ Context LJ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        if (this.LIZ) {
            service.uiService().recordService().openAlbumWithMusic(this.LIZIZ, this.LIZJ.build(), this.LIZLLL);
        } else {
            service.uiService().recordService().startRecord(this.LJ, this.LIZJ.build());
        }
    }

    public C42408Gke(boolean z, ActivityC45651qj activityC45651qj, RecordConfig.Builder builder, MusicModel musicModel, Context context) {
        this.LIZ = z;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = builder;
        this.LIZLLL = musicModel;
        this.LJ = context;
    }
}
