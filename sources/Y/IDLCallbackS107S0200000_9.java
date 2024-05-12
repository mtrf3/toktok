package Y;

import X.ActivityC45651qj;
import X.C42398GkU;
import X.K3H;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.detail.panel.CreativeHubPanel;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDLCallbackS107S0200000_9 implements IExternalService.ServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onDismiss() {
        switch (this.$t) {
            case 0:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 1:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 2:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 3:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 4:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onFailed() {
        switch (this.$t) {
            case 0:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 1:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 2:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 3:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 4:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                return;
            case 1:
                onLoad$1(this, asyncAVService, j);
                return;
            case 2:
                onLoad$2(this, asyncAVService, j);
                return;
            case 3:
                onLoad$3(this, asyncAVService, j);
                return;
            case 4:
                onLoad$4(this, asyncAVService, j);
                return;
            default:
                return;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onOK() {
        switch (this.$t) {
            case 0:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 1:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 2:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 3:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 4:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            default:
                return;
        }
    }

    public IDLCallbackS107S0200000_9(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLoad$0(IDLCallbackS107S0200000_9 iDLCallbackS107S0200000_9, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        Activity context = (Activity) iDLCallbackS107S0200000_9.l0;
        Uri routeUri = (Uri) iDLCallbackS107S0200000_9.l1;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(routeUri, "routeUri");
    }

    public static final void onLoad$1(IDLCallbackS107S0200000_9 iDLCallbackS107S0200000_9, AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        Activity activity = ((CreativeHubPanel) iDLCallbackS107S0200000_9.l0).activity;
        o.LJIIIIZZ(activity, "activity");
        LIZ.startRecord(activity, ((RecordConfig.Builder) iDLCallbackS107S0200000_9.l1).build());
    }

    public static final void onLoad$2(IDLCallbackS107S0200000_9 iDLCallbackS107S0200000_9, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        FaceStickerBean.sCurPropSource = "search";
        service.uiService().recordService().startRecord((Activity) iDLCallbackS107S0200000_9.l0, ((RecordConfig.Builder) iDLCallbackS107S0200000_9.l1).build());
    }

    public static final void onLoad$3(IDLCallbackS107S0200000_9 iDLCallbackS107S0200000_9, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((ActivityC45651qj) iDLCallbackS107S0200000_9.l0, ((RecordConfig.Builder) iDLCallbackS107S0200000_9.l1).build());
    }

    public static final void onLoad$4(IDLCallbackS107S0200000_9 iDLCallbackS107S0200000_9, AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        Context context = ((K3H) iDLCallbackS107S0200000_9.l0).itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        LIZ.startRecord(context, ((RecordConfig.Builder) iDLCallbackS107S0200000_9.l1).build());
    }
}
