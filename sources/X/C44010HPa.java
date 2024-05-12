package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;

/* renamed from: X.HPa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44010HPa implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ MusicModel LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ Activity LJ;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        String localPath;
        o.LJIIIZ(service, "service");
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay("anchor_combine_tts");
        builder.voiceEffectId(this.LIZ);
        builder.voiceEffectName(this.LIZIZ);
        builder.musicModel(this.LIZJ);
        if (this.LIZLLL) {
            MusicModel musicModel = this.LIZJ;
            String str = null;
            if (musicModel != null) {
                str = musicModel.getMusicId();
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            builder.musicId(str);
            if (musicModel != null && (localPath = musicModel.getLocalPath()) != null) {
                str2 = localPath;
            }
            builder.musicPath(str2);
        }
        service.uiService().recordService().startRecord(this.LJ, builder.build());
    }

    public C44010HPa(String str, String str2, MusicModel musicModel, boolean z, Activity activity) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = musicModel;
        this.LIZLLL = z;
        this.LJ = activity;
    }
}
