package Y;

import X.ActivityC45651qj;
import X.C42398GkU;
import X.C44065HRd;
import X.C44087HRz;
import X.C5Z2;
import X.C60903NvH;
import X.C76800UCe;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.detail.panel.LibraryFeedPanel;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.kids.setting.items.clearcache.KidsDiskClearActivity;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.service.IToolsVQEvaluationService;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.VQEvaluationConfig;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDLCallbackS18S0300000_7 implements IExternalService.ServiceLoadCallback {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            case 5:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 6:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 7:
                IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                return;
            case 8:
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
                onFailed$4(this);
                return;
            case 5:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 6:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 7:
                IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                return;
            case 8:
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
            case 5:
                onLoad$5(this, asyncAVService, j);
                return;
            case 6:
                onLoad$6(this, asyncAVService, j);
                return;
            case 7:
                onLoad$7(this, asyncAVService, j);
                return;
            case 8:
                onLoad$8(this, asyncAVService, j);
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
            case 5:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 6:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 7:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            case 8:
                IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                return;
            default:
                return;
        }
    }

    public static final void onFailed$4(IDLCallbackS18S0300000_7 iDLCallbackS18S0300000_7) {
        ((C44065HRd) iDLCallbackS18S0300000_7.l0).LIZ();
    }

    public static final void onLoad$0(IDLCallbackS18S0300000_7 iDLCallbackS18S0300000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord((Activity) iDLCallbackS18S0300000_7.l0, ((RecordConfig.Builder) iDLCallbackS18S0300000_7.l1).build(), (Challenge) iDLCallbackS18S0300000_7.l2);
    }

    public static final void onLoad$1(IDLCallbackS18S0300000_7 iDLCallbackS18S0300000_7, AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        Activity activity = ((LibraryFeedPanel) iDLCallbackS18S0300000_7.l0).activity;
        o.LJIIIIZZ(activity, "activity");
        LIZ.startRecord(activity, ((RecordConfig.Builder) iDLCallbackS18S0300000_7.l1).build(), (MusicModel) iDLCallbackS18S0300000_7.l2, true);
    }

    public static final void onLoad$2(IDLCallbackS18S0300000_7 iDLCallbackS18S0300000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        CreativeInitialModel creativeInitialModel = (CreativeInitialModel) iDLCallbackS18S0300000_7.l0;
        if (creativeInitialModel != null) {
            creativeInitialModel.vqEvaluationConfig = null;
            VQEvaluationConfig vQEvaluationConfig = creativeInitialModel.vqEvaluationConfig;
            if (vQEvaluationConfig != null) {
                Context context = (Context) iDLCallbackS18S0300000_7.l1;
                C5Z2.LIZJ("VQEvaluation ; VQEvaluationConfig : " + GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), vQEvaluationConfig));
                IToolsVQEvaluationService iToolsVQEvaluationService = (IToolsVQEvaluationService) ServiceManager.get().getService(IToolsVQEvaluationService.class);
                if (iToolsVQEvaluationService != null) {
                    iToolsVQEvaluationService.LIZJ(context, vQEvaluationConfig);
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
            }
        }
        service.uiService().editService().startEdit((Context) iDLCallbackS18S0300000_7.l1, (EditConfig) iDLCallbackS18S0300000_7.l2);
    }

    public static final void onLoad$3(IDLCallbackS18S0300000_7 iDLCallbackS18S0300000_7, AsyncAVService asyncAVService, long j) {
        C42398GkU.LIZ(asyncAVService, "service").startRecord(((C44087HRz) iDLCallbackS18S0300000_7.l0).LJIIIZ().LIZ(), ((RecordConfig.Builder) iDLCallbackS18S0300000_7.l1).build(), (MusicModel) iDLCallbackS18S0300000_7.l2, true);
    }

    public static final void onLoad$4(IDLCallbackS18S0300000_7 iDLCallbackS18S0300000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        C44065HRd c44065HRd = (C44065HRd) iDLCallbackS18S0300000_7.l0;
        Activity activity = c44065HRd.LIZ;
        if (activity != null) {
            service.uiService().recordService().startStitch(activity, (Intent) iDLCallbackS18S0300000_7.l1, (StitchParams) iDLCallbackS18S0300000_7.l2, c44065HRd.LJIJJ);
        }
        C44065HRd c44065HRd2 = (C44065HRd) iDLCallbackS18S0300000_7.l0;
        c44065HRd2.LJ(c44065HRd2.LJIILL, null, true);
        ((C44065HRd) iDLCallbackS18S0300000_7.l0).LIZ();
    }

    public static final void onLoad$5(IDLCallbackS18S0300000_7 iDLCallbackS18S0300000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        ((IExternalService) iDLCallbackS18S0300000_7.l0).draftService().openDraftActivity((KidsDiskClearActivity) iDLCallbackS18S0300000_7.l1, (Bundle) iDLCallbackS18S0300000_7.l2);
    }

    public static final void onLoad$6(IDLCallbackS18S0300000_7 iDLCallbackS18S0300000_7, AsyncAVService asyncAVService, long j) {
        IRecordService LIZ = C42398GkU.LIZ(asyncAVService, "service");
        ActivityC45651qj act = (ActivityC45651qj) iDLCallbackS18S0300000_7.l0;
        o.LJIIIIZZ(act, "act");
        LIZ.startRecord(act, ((RecordConfig.Builder) iDLCallbackS18S0300000_7.l1).build(), (MusicModel) iDLCallbackS18S0300000_7.l2, true);
    }

    public static final void onLoad$7(IDLCallbackS18S0300000_7 iDLCallbackS18S0300000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        boolean isVideoRecordNewActivityInStack = service.uiService().recordService().isVideoRecordNewActivityInStack();
        boolean LJIILJJIL = LiveOuterService.LJJJLL().LJIILJJIL();
        boolean isBroadcastSmoothGoLive = LiveOuterService.LJJJLL().isBroadcastSmoothGoLive();
        boolean LJ = LiveOuterService.LJJJLL().LJ();
        if (o.LJ(UriProtector.getQueryParameter((Uri) iDLCallbackS18S0300000_7.l0, "tab"), "live") && !LJIILJJIL && !isVideoRecordNewActivityInStack && !LJ && isBroadcastSmoothGoLive) {
            service.uiService().recordService().startIndependentLiveActivity((Activity) iDLCallbackS18S0300000_7.l1, ((RecordConfig.Builder) iDLCallbackS18S0300000_7.l2).build());
        } else {
            service.uiService().recordService().startRecord((Activity) iDLCallbackS18S0300000_7.l1, ((RecordConfig.Builder) iDLCallbackS18S0300000_7.l2).build());
        }
    }

    public static final void onLoad$8(IDLCallbackS18S0300000_7 iDLCallbackS18S0300000_7, AsyncAVService service, long j) {
        o.LJIIIZ(service, "service");
        boolean LJIILJJIL = LiveOuterService.LJJJLL().LJIILJJIL();
        boolean isVideoRecordNewActivityInStack = service.uiService().recordService().isVideoRecordNewActivityInStack();
        boolean isBroadcastSmoothGoLive = LiveOuterService.LJJJLL().isBroadcastSmoothGoLive();
        boolean LJ = LiveOuterService.LJJJLL().LJ();
        if (o.LJ(UriProtector.getQueryParameter((Uri) iDLCallbackS18S0300000_7.l0, "tab"), "live") && !LJIILJJIL && !isVideoRecordNewActivityInStack && !LJ && isBroadcastSmoothGoLive) {
            service.uiService().recordService().startIndependentLiveActivity((Activity) iDLCallbackS18S0300000_7.l1, ((RecordConfig.Builder) iDLCallbackS18S0300000_7.l2).build());
        } else {
            service.uiService().recordService().startRecord((Activity) iDLCallbackS18S0300000_7.l1, ((RecordConfig.Builder) iDLCallbackS18S0300000_7.l2).build());
        }
    }

    public IDLCallbackS18S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
        this.l2 = obj3;
    }
}
