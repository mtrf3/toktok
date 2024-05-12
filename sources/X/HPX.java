package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.app.PushLoginActivity;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HPX implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ Activity LIZIZ;
    public final /* synthetic */ RecordConfig.Builder LIZJ;
    public final /* synthetic */ android.net.Uri LIZLLL;

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
        o.LJIIIZ(service, "service");
        if (this.LIZ) {
            if (!BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin()) {
                Intent intent = new Intent(this.LIZIZ, (Class<?>) PushLoginActivity.class);
                intent.putExtra("EXTRA_AV_RECORD_CONFIG", this.LIZJ.build());
                intent.putExtra("IS_LANDING_SUB_ONLY_LIVE", true);
                C16880lQ.LIZIZ(this.LIZIZ, intent);
                return;
            }
            this.LIZJ.interceptBackground(false);
            service.uiService().recordService().startRecord(this.LIZIZ, this.LIZJ.build());
            return;
        }
        boolean LJIILJJIL = LiveOuterService.LJJJLL().LJIILJJIL();
        boolean isBroadcastSmoothGoLive = LiveOuterService.LJJJLL().isBroadcastSmoothGoLive();
        boolean isVideoRecordNewActivityInStack = service.uiService().recordService().isVideoRecordNewActivityInStack();
        boolean LJ = LiveOuterService.LJJJLL().LJ();
        if (o.LJ(UriProtector.getQueryParameter(this.LIZLLL, "tab"), "live") && !LJIILJJIL && !LJ && !isVideoRecordNewActivityInStack && isBroadcastSmoothGoLive) {
            service.uiService().recordService().startIndependentLiveActivity(this.LIZIZ, this.LIZJ.build());
        } else {
            service.uiService().recordService().startRecord(this.LIZIZ, this.LIZJ.build());
        }
    }

    public HPX(boolean z, Activity activity, RecordConfig.Builder builder, android.net.Uri uri) {
        this.LIZ = z;
        this.LIZIZ = activity;
        this.LIZJ = builder;
        this.LIZLLL = uri;
    }
}
