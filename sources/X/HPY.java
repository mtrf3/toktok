package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HPY implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ ArrayList<String> LIZJ;
    public final /* synthetic */ MusicModel LIZLLL;
    public final /* synthetic */ boolean LJ;
    public final /* synthetic */ Activity LJFF;

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
        builder.shootWay("anchor_combine_voice_conversion");
        builder.vcVoiceEffectId(this.LIZ);
        builder.vcVoiceEffectName(this.LIZIZ);
        builder.vcVoiceIDs(this.LIZJ);
        builder.musicModel(this.LIZLLL);
        if (this.LJ) {
            MusicModel musicModel = this.LIZLLL;
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
        service.uiService().recordService().startRecord(this.LJFF, builder.build());
    }

    public HPY(String str, String str2, ArrayList<String> arrayList, MusicModel musicModel, boolean z, Activity activity) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = arrayList;
        this.LIZLLL = musicModel;
        this.LJ = z;
        this.LJFF = activity;
    }
}
