package X;

import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity;

/* renamed from: X.HSz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44113HSz extends SimpleServiceLoadCallback {
    public final /* synthetic */ AppWidgetLinkProxyActivity LIZ;
    public final /* synthetic */ String LIZIZ;

    public C44113HSz(AppWidgetLinkProxyActivity appWidgetLinkProxyActivity, String str) {
        this.LIZ = appWidgetLinkProxyActivity;
        this.LIZIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        AppWidgetLinkProxyActivity appWidgetLinkProxyActivity = this.LIZ;
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.interceptBackground(false);
        builder.shootWay("camera_shortcut");
        builder.creationId(this.LIZIZ);
        builder.enterFrom("camera_shortcut");
        builder.enterMethod("click_camera_shortcut");
        LIZ.startRecord(appWidgetLinkProxyActivity, builder.build());
    }
}
