package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteData;

/* loaded from: classes14.dex */
public final class U7S<T> implements InterfaceC64592gB {
    public final /* synthetic */ U7F LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ ReplyInviteData LJLJJL;

    public U7S(U7F u7f, long j, int i, long j2, ReplyInviteData replyInviteData) {
        this.LJLIL = u7f;
        this.LJLILLLLZI = j;
        this.LJLJI = i;
        this.LJLJJI = j2;
        this.LJLJJL = replyInviteData;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        U7F u7f = this.LJLIL;
        String valueOf = String.valueOf(this.LJLILLLLZI);
        int i = this.LJLJI;
        OSZ LJIILL = UC0.LJIILL(th);
        String LJIJ = UC0.LJIJ(th);
        String str2 = "";
        if (LJIJ == null) {
            LJIJ = "";
        }
        UA9.LJJIJIL(i, this.LJLJJI, C31012CFc.LIZIZ(), u7f, valueOf, LJIJ, LJIILL, false);
        U7F u7f2 = this.LJLIL;
        U7W u7w = u7f2.LJIJ;
        long LIZIZ = C31012CFc.LIZIZ() - this.LJLJJI;
        String LJIJ2 = UC0.LJIJ(th);
        if (LJIJ2 != null) {
            str2 = LJIJ2;
        }
        int LJIILJJIL = UC0.LJIILJJIL(th);
        if (this.LJLJJL.getReplyStatus() == 1) {
            str = "agree";
        } else {
            str = "reject";
        }
        J7I.LJIIIZ(u7w, u7f2, "reply_invite", LIZIZ, str2, LJIILJJIL, new OSZ("reply_status", str), false, null, 192);
    }
}
