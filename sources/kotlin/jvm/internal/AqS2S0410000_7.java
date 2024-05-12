package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C41759GaB;
import X.C41775GaR;
import X.C48203Ivv;
import X.C60903NvH;
import X.C68322mC;
import X.C76800UCe;
import X.C77412UZs;
import X.EF7;
import X.HPU;
import X.InterfaceC65784Pro;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.services.sparrow.DmtSparrowServiceImplKt;
import com.ss.android.ugc.aweme.services.sparrow.PublishXServiceImpl;
import com.ss.android.ugc.aweme.services.video.VideoRecordEntranceServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class AqS2S0410000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$0();
            default:
                return null;
        }
    }

    public final Map<String, Object> invoke$0() {
        String str;
        String effectVersion;
        ((PublishXServiceImpl) this.l3).printPublishModelInOfflineStorage((PublishModel) this.l1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C68322mC c68322mC = (C68322mC) this.l2;
        PublishModel publishModel = (PublishModel) this.l1;
        C41759GaB c41759GaB = (C41759GaB) this.l0;
        boolean z = this.z4;
        linkedHashMap.put("publish_id", c68322mC.element);
        linkedHashMap.put("publish_type", Integer.valueOf(publishModel.publishType));
        String stackTraceString = Log.getStackTraceString(c41759GaB);
        o.LJIIIIZZ(stackTraceString, "getStackTraceString(error)");
        linkedHashMap.put("stacktrace", stackTraceString);
        linkedHashMap.put("is_by_design", Boolean.valueOf(z));
        linkedHashMap.put("publish_duration", Integer.valueOf(c41759GaB.getPublishDuration()));
        linkedHashMap.put("authkey", "");
        linkedHashMap.put("create_aweme", "");
        String serverLogId = c41759GaB.getServerLogId();
        if (serverLogId == null) {
            serverLogId = "";
        }
        linkedHashMap.put("log_id", serverLogId);
        linkedHashMap.put("error_code", Integer.valueOf(c41759GaB.getErrorCode()));
        Object failedTaskTag = c41759GaB.getFailedTaskTag();
        String str2 = "unknown";
        if (failedTaskTag == null) {
            failedTaskTag = "unknown";
        }
        linkedHashMap.put("failed_task", failedTaskTag);
        C60903NvH.LJIIJJI().getPublishService().LJJIIJ();
        C41775GaR.LIZ();
        linkedHashMap.put("build_info", "unknown");
        linkedHashMap.put("uid", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
        C60903NvH.LJIIJJI().getApplicationService().getClass();
        String serverDeviceId = AppLog.getServerDeviceId();
        o.LJIIIIZZ(serverDeviceId, "getAPI().applicationService.deviceId");
        linkedHashMap.put("did", serverDeviceId);
        linkedHashMap.put("version_name", EF7.LJII());
        linkedHashMap.put("version_code", Long.valueOf(EF7.LJI()));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("app_id", Integer.valueOf(EF7.LJIIIZ));
        C60903NvH.LJIIJJI().LJIJJLI();
        linkedHashMap2.put("is_debug", Boolean.FALSE);
        linkedHashMap2.put("is_login_in", Boolean.valueOf(C60903NvH.LJIIJJI().getAccountService().isLogin()));
        linkedHashMap2.put("channel", EF7.LJIILIIL);
        Application application = C60903NvH.LJ;
        o.LJIIIIZZ(application, "getApplication()");
        linkedHashMap2.put("network_type", C48203Ivv.LIZIZ(application).toString());
        IAVSettingsService avSettingsService = AVServiceImpl.LIZ().avSettingsService();
        if (avSettingsService == null || (str = avSettingsService.getVESDKVersion()) == null) {
            str = "unknown";
        }
        linkedHashMap2.put("vesdk_version", str);
        IAVSettingsService avSettingsService2 = AVServiceImpl.LIZ().avSettingsService();
        if (avSettingsService2 != null && (effectVersion = avSettingsService2.getEffectVersion()) != null) {
            str2 = effectVersion;
        }
        linkedHashMap2.put("effectsdk_version", str2);
        String json = GsonProtectorUtils.toJson(DmtSparrowServiceImplKt.getGson(), linkedHashMap2);
        o.LJIIIIZZ(json, "getGson().toJson(deviceInfo)");
        linkedHashMap.put("device_info", json);
        linkedHashMap.put("qiaofu_report_url", "");
        linkedHashMap.put("status", 1);
        linkedHashMap.put("comment", "to be implemented");
        return linkedHashMap;
    }

    public static final Object invoke$0(AqS2S0410000_7 aqS2S0410000_7) {
        CreativeInfo LJIJI = C77412UZs.LJIJI((Intent) aqS2S0410000_7.l0);
        RecordConfig.Builder builder = new RecordConfig.Builder();
        StitchParams stitchParams = (StitchParams) aqS2S0410000_7.l3;
        boolean z = aqS2S0410000_7.z4;
        Intent intent = (Intent) aqS2S0410000_7.l0;
        builder.shootWay("stitch");
        builder.stitchParams(stitchParams);
        builder.creationId(LJIJI.getCreationId());
        builder.recordFromFeed(z);
        builder.ttsVoiceIDs(intent.getStringArrayListExtra("tts_voice_ids"));
        builder.ttsVoiceRefIDs(intent.getStringArrayListExtra("tts_voice_ref_ids"));
        builder.vcVoiceIDs(intent.getStringArrayListExtra("vc_voice_ids"));
        builder.vcVoiceRefIDs(intent.getStringArrayListExtra("vc_voice_ref_ids"));
        RecordConfig build = builder.build();
        ((HPU) aqS2S0410000_7.l1).getClass();
        Intent LIZ = HPU.LIZ(build);
        if (((Intent) aqS2S0410000_7.l0).hasExtra("duet_and_stitch_router_config")) {
            Parcelable parcelableExtra = ((Intent) aqS2S0410000_7.l0).getParcelableExtra("duet_and_stitch_router_config");
            o.LJII(parcelableExtra, "null cannot be cast to non-null type android.os.Parcelable");
            LIZ.putExtra("duet_and_stitch_router_config", parcelableExtra);
        }
        VideoRecordEntranceServiceImpl.Companion.getINSTANCE().startToolPermissionActivity((Context) aqS2S0410000_7.l2, LIZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S0410000_7(Intent intent, HPU hpu, Context context, StitchParams stitchParams, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = intent;
        this.l1 = hpu;
        this.l2 = context;
        this.l3 = stitchParams;
        this.z4 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS2S0410000_7(PublishXServiceImpl publishXServiceImpl, PublishXServiceImpl publishXServiceImpl2, PublishModel publishModel, C68322mC<String> c68322mC, C41759GaB c41759GaB, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l3 = publishXServiceImpl;
        this.l1 = publishXServiceImpl2;
        this.l2 = publishModel;
        this.l0 = c68322mC;
        this.z4 = c41759GaB;
    }
}
