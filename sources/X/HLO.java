package X;

import com.ss.android.ugc.aweme.detail.api.CheckDuetReactPermissionApi;
import com.ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.ss.android.ugc.aweme.shortvideo.duet.CheckDuetReactPermissionResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HLO implements IPrivacyConfig {
    @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig
    public final IPrivacyConfig.IPermissionBridge permissionBridge() {
        return new HLN();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IPrivacyConfig
    public final CheckDuetReactPermissionResponse checkDuetReactPermission(String awemeId, int i) {
        o.LJIIIZ(awemeId, "awemeId");
        CheckDuetReactPermissionResponse checkDuetReactPermissionResponse = ((CheckDuetReactPermissionApi.CheckDuetReactPermissionRequest) C60903NvH.LJIIJJI().getNetworkService().createRetrofit(CheckDuetReactPermissionApi.LIZ, true, CheckDuetReactPermissionApi.CheckDuetReactPermissionRequest.class)).checkDuetReactPermission(awemeId, i).execute().LIZIZ;
        o.LJIIIIZZ(checkDuetReactPermissionResponse, "api.checkDuetReactPermis…eckType).execute().body()");
        return checkDuetReactPermissionResponse;
    }
}
