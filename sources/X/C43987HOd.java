package X;

import android.app.Activity;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.DMCameraModel;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.dm.DMPath;
import com.ss.android.ugc.aweme.services.external.ui.DMAlbumParams;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.HOd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43987HOd implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ int LJFF;

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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        CreativeInitialModel creativeInitialModel = new CreativeInitialModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16383, 0 == true ? 1 : 0);
        DMCameraModel dMCameraModel = creativeInitialModel.dmCameraModel;
        String str = this.LIZJ;
        String str2 = this.LIZLLL;
        String str3 = this.LJ;
        int i = this.LJFF;
        dMCameraModel.enterFromDM = true;
        dMCameraModel.enterDM = str;
        dMCameraModel.receiverNickname = str2;
        DMAlbumParams LIZ = C43988HOe.LIZ(i, str3, C43988HOe.LIZLLL());
        dMCameraModel.shouldDisplayTnsNoticeAlbum = LIZ.getShouldDisplayTnsNotice();
        dMCameraModel.tnsNoticeRes = LIZ.getChooseMediaTnSNoticeRes();
        dMCameraModel.sessionID = str3;
        dMCameraModel.maxSelectableVideoDuration = LIZ.getMaxSelectableVideoDuration();
        if (!C92363js.LIZ() || (!C43992HOi.LIZ ? C43988HOe.LIZIZ().getInt("keva_key_display_shooting_tns_flag_new", 0) > 0 : C43988HOe.LIZIZ().getInt("keva_key_display_shooting_tns_flag_new", 0) < H5J.LIZ().getAlbumConfig().getShowSafetyNoticeTime())) {
            C4ML c4ml = C4ML.LJLIL;
            Keva repo = C43988HOe.LIZIZ();
            o.LJIIIIZZ(repo, "repo");
            c4ml.invoke(repo);
            creativeInitialModel.dmCameraModel.shouldDisplayTnsNoticeShooting = true;
        }
        String LIZ2 = AnonymousClass629.LIZ("randomUUID().toString()");
        new DMPath(LIZ2).genCreativeResourceDirPath(true);
        IRecordService recordService = service.uiService().recordService();
        Activity activity = this.LIZ;
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.creationId(LIZ2);
        builder.shootWay("chat_shoot");
        builder.enterFrom(this.LIZIZ);
        builder.enterMethod("click");
        builder.initialInputModel(creativeInitialModel);
        recordService.startRecord(activity, builder.build());
    }

    public C43987HOd(int i, Activity activity, String str, String str2, String str3, String str4) {
        this.LIZ = activity;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = i;
    }
}
