package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;

/* renamed from: X.MFk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56500MFk extends SimpleServiceLoadCallback {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ RecordConfig.Builder LIZIZ;

    public C56500MFk(Activity activity, RecordConfig.Builder builder) {
        this.LIZ = activity;
        this.LIZIZ = builder;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        asyncAVService.uiService().recordService().startRecord(this.LIZ, this.LIZIZ.build());
    }
}
