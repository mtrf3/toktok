package X;

import Y.ARunnableS0S0301100_13;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U89 implements InterfaceC76768UAy<ReplyResult> {
    public final /* synthetic */ U7F LJLIL;
    public final /* synthetic */ LinkMessage LJLILLLLZI;
    public final /* synthetic */ ReplyInviteData LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(ReplyResult replyResult) {
        ReplyResult value = replyResult;
        o.LJIIIZ(value, "value");
        C15610jN.LIZIZ(new ARunnableS0S0301100_13(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, value, this.LJLJJL, 1));
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        C15610jN.LIZIZ(new ARunnableS0S0301100_13(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, th, this.LJLJJL, 0));
    }

    public U89(U7F u7f, LinkMessage linkMessage, ReplyInviteData replyInviteData, int i, long j) {
        this.LJLIL = u7f;
        this.LJLILLLLZI = linkMessage;
        this.LJLJI = replyInviteData;
        this.LJLJJI = i;
        this.LJLJJL = j;
    }
}
