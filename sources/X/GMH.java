package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.ForwardEditPublishData;
import com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener;
import com.ss.android.ugc.aweme.services.story.forward.QuickForwardResult;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GMH implements OnStartEditDraftListener {
    public final /* synthetic */ QuickForwardResult LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ ProgressDialogC43239Gy3 LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;

    @Override // com.ss.android.ugc.aweme.services.draft.OnStartEditDraftListener
    public final void onStart(Intent intent) {
        o.LJIIIZ(intent, "intent");
        intent.putExtra("extra_quick_forward_edit_result", new ForwardEditPublishData(this.LIZ.getCreationId(), this.LIZ.getScheduleId(), this.LIZIZ));
        C43045Guv.LIZLLL(new AqS154S0200000_7(this.LIZJ, (ProgressDialogC43239Gy3) this.LIZLLL, (InterfaceC65784Pro<C76800UCe>) 136), 0L);
    }

    public GMH(QuickForwardResult quickForwardResult, boolean z, ProgressDialogC43239Gy3 progressDialogC43239Gy3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = quickForwardResult;
        this.LIZIZ = z;
        this.LIZJ = progressDialogC43239Gy3;
        this.LIZLLL = interfaceC65784Pro;
    }
}
