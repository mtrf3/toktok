package X;

import com.ss.android.ugc.aweme.actionai.sdk.ActionAISDKAgent;
import kotlin.jvm.internal.o;

/* renamed from: X.Wnv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83379Wnv implements GHB {
    public final /* synthetic */ C83374Wnq LJLIL;

    public C83379Wnv(C83374Wnq c83374Wnq) {
        this.LJLIL = c83374Wnq;
    }

    @Override // X.GHB
    public final boolean onBackPressed() {
        C83374Wnq c83374Wnq = this.LJLIL;
        if (c83374Wnq.LLFFF) {
            c83374Wnq.LLZLI();
            return true;
        }
        if (c83374Wnq.LJLLI) {
            C83348WnQ.LJIIIIZZ(c83374Wnq.LLLLIL(), ActionAISDKAgent.LJLJJLL, "click_quit");
        }
        this.LJLIL.hide();
        String creationId = this.LJLIL.LLLLIL().getCreationId();
        o.LJIIIIZZ(creationId, "publishEditModel.creationId");
        String str = ActionAISDKAgent.LJLJJLL;
        if (str == null) {
            str = "";
        }
        C83348WnQ.LIZ(creationId, str, "others");
        return true;
    }
}
