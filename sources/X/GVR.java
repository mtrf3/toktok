package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.port.internal.MainActivityCallback;
import com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GVR implements IGetPublishDraftCallback {
    public final /* synthetic */ String LIZ;

    @Override // com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback
    public final void onFail() {
        GUH.LJJI("PublishBroadcastReceiver retry onFail");
    }

    public GVR(String str) {
        this.LIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.services.external.IGetPublishDraftCallback
    public final void onSuccess(AwemeDraft draft) {
        o.LJIIIZ(draft, "draft");
        String LIZ = draft.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishBroadcastReceiver retry onSuccess draftCreationId:");
        LIZ2.append(LIZ);
        GUH.LJIJJ(X1D.LIZIZ(LIZ2));
        if (!o.LJ(this.LIZ, LIZ)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("PublishBroadcastReceiver retry CreationIdNotEqual intent:");
            LIZ3.append(this.LIZ);
            LIZ3.append(" draft:");
            LIZ3.append(LIZ);
            GUH.LJJI(X1D.LIZIZ(LIZ3));
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("action_type", "publish");
        c145995oB.LJI("creation_id", LIZ);
        c145995oB.LJI("enter_from", "notification");
        c145995oB.LJI("enter_method", "click_retry");
        FMX.LJIIL("publish_retry", c145995oB.LIZ);
        C44172HVg.LJIILL.getClass();
        C2U8.LIZ(new C41668GWy(true, true));
        String LIZJ = GUH.LIZJ(GTM.LIZJ(draft, null));
        GUH.LJJIFFI();
        if (LIZJ == null) {
            H78.LIZJ("PublishFromDraft Already In publish, can not start new");
        }
        Activity LIZ4 = C42470Gle.LIZ();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("PublishBroadcastReceiver bind publishId:");
        LIZ5.append(LIZJ);
        LIZ5.append(" hostActivity:");
        LIZ5.append(LIZ4);
        GUH.LJIJJ(X1D.LIZIZ(LIZ5));
        if (LIZJ != null) {
            C78934UyQ.LJLIL.getPublishService().getClass();
            if (LIZ4 instanceof MainActivity) {
                H7B.LIZ("PublishService bindProgressHost direct bind");
                new MainActivityCallback((ActivityC45651qj) LIZ4, LIZJ, false);
            } else {
                H7B.LIZ("PublishService bindProgressHost post retry event");
                C2U8.LIZIZ(new GVS(LIZJ));
            }
        }
    }
}
