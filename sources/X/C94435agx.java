package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.agx, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94435agx extends SimpleServiceLoadCallback {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ RecordConfig.Builder LIZIZ;

    public C94435agx(Activity activity, RecordConfig.Builder builder) {
        this.LIZ = activity;
        this.LIZIZ = builder;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        service.uiService().recordService().startRecord(this.LIZ, this.LIZIZ.build());
        if (!this.LIZ.isFinishing()) {
            this.LIZ.finish();
        }
    }
}
