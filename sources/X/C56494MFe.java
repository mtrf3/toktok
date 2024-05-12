package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.MFe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56494MFe implements IExternalService.ServiceLoadCallback {
    public final /* synthetic */ View LIZ;
    public final /* synthetic */ String LIZIZ;

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

    public C56494MFe(View view, String str) {
        this.LIZ = view;
        this.LIZIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        Context context = this.LIZ.getContext();
        o.LJIIIIZZ(context, "it.context");
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay("optimize_profile");
        builder.creationId(this.LIZIZ);
        builder.enterFrom("personal_homepage");
        LIZ.startRecord(context, builder.build());
    }
}
