package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostMultiAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import kotlin.jvm.internal.o;

/* renamed from: X.TqO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75888TqO implements InterfaceC75414Tik<ReplyResult> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ C75878TqE LJLILLLLZI;
    public final /* synthetic */ C75911Tql LJLJI;
    public final /* synthetic */ MultiHostMultiAdapterImpl LJLJJI;
    public final /* synthetic */ InterfaceC75414Tik<ReplyResult> LJLJJL;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ReplyResult replyResult) {
        ReplyResult value = replyResult;
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("replyInvite, onSuccess, value = ");
        LIZ.append(value);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (this.LJLIL) {
            this.LJLILLLLZI.LJIL(this.LJLJI.LIZIZ, value.logId);
        } else {
            C75878TqE c75878TqE = this.LJLILLLLZI;
            C75911Tql c75911Tql = this.LJLJI;
            c75878TqE.LJJJJI(c75911Tql.LIZJ, c75911Tql.LIZIZ, 0L, value.logId);
        }
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLJJI.LJLL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJJLIIIJLLLLLLLZ = this.LJLJI.LIZIZ;
            linkCrossRoomDataHolder.LJJLIIJ = C44432HcC.LJI();
        }
        InterfaceC75414Tik<ReplyResult> interfaceC75414Tik = this.LJLJJL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
        if (this.LJLJI.LIZJ != 1) {
            this.LJLJJI.LLJJ("replyStatus not agree");
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("replyInvite, onFail, error = ");
        LIZ.append(error);
        LIZ.append(", throwable = ");
        LIZ.append(th);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        if (this.LJLIL) {
            C75878TqE c75878TqE = this.LJLILLLLZI;
            AbstractC75865Tq1.LJIIIZ(c75878TqE.LIZLLL, "rival_user_id", Long.valueOf(this.LJLJI.LIZIZ), true);
            c75878TqE.LJIIJ(th);
            c75878TqE.LJIIJJI();
            c75878TqE.LJIILLIIL("accept_invite_failed");
        } else {
            C75878TqE c75878TqE2 = this.LJLILLLLZI;
            C75911Tql c75911Tql = this.LJLJI;
            c75878TqE2.LJJJI(c75911Tql.LIZJ, c75911Tql.LIZIZ, 0L, th);
        }
        InterfaceC75414Tik<ReplyResult> interfaceC75414Tik = this.LJLJJL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
        this.LJLJJI.LLJJ("replyInvite Failed");
    }

    public C75888TqO(boolean z, C75878TqE c75878TqE, C75911Tql c75911Tql, MultiHostMultiAdapterImpl multiHostMultiAdapterImpl, InterfaceC75414Tik<ReplyResult> interfaceC75414Tik) {
        this.LJLIL = z;
        this.LJLILLLLZI = c75878TqE;
        this.LJLJI = c75911Tql;
        this.LJLJJI = multiHostMultiAdapterImpl;
        this.LJLJJL = interfaceC75414Tik;
    }
}
