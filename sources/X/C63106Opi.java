package X;

import android.content.Context;
import com.bytedance.android.live.broadcast.api.FeedbackResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.Opi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63106Opi implements InterfaceC63111Opn {
    public final /* synthetic */ Context LIZ;

    public C63106Opi(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC63111Opn
    public final void LIZ(FeedbackResponse feedbackResponse) {
        o.LJIIIZ(feedbackResponse, "feedbackResponse");
        int i = feedbackResponse.errorCode;
        if (i == 0) {
            C63100Opc.LIZJ(this.LIZ, "", "feedback", true);
        } else {
            if (i != -1) {
                return;
            }
            C63100Opc.LIZJ(this.LIZ, "-1", "feedback", false);
        }
    }

    @Override // X.InterfaceC63111Opn
    public final void onFailed(Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        C63100Opc.LIZJ(this.LIZ, "", "feedback", false);
    }
}
