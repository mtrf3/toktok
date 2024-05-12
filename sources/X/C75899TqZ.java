package X;

import Y.IDo0S413S0100000_13;
import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyInviteGroupResult;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.TqZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75899TqZ implements InterfaceC75414Tik<ReplyInviteGroupResult> {
    public final /* synthetic */ MultiHostCrossAdapterImpl LJLIL;
    public final /* synthetic */ C75952TrQ LJLILLLLZI;
    public final /* synthetic */ InterfaceC75414Tik<ReplyInviteGroupResult> LJLJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ReplyInviteGroupResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("replyInviteGroup");
        LIZ.append(", onSuccess, value = ");
        LIZ.append(value);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLIL.LJLJLLL;
        if (linkCrossRoomDataHolder != null) {
            linkCrossRoomDataHolder.LJJLIIIJLLLLLLLZ = this.LJLILLLLZI.LJLILLLLZI;
            linkCrossRoomDataHolder.LJJLIIJ = C44432HcC.LJI();
        }
        InterfaceC75414Tik<ReplyInviteGroupResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
        if (this.LJLILLLLZI.LJLJJI != 1) {
            this.LJLIL.LLJLLIL(this.LJLILLLLZI.LJLILLLLZI, i0.LJFF("replyInviteGroup", ", replyStatus not agree"));
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("replyInviteGroup");
        LIZ.append(", onFail, error = ");
        LIZ.append(error);
        LIZ.append(", throwable = ");
        LIZ.append(th);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<ReplyInviteGroupResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
        this.LJLIL.LLJLLIL(this.LJLILLLLZI.LJLILLLLZI, i0.LJFF("replyInviteGroup", ", replyInvite Failed"));
    }

    public C75899TqZ(MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, C75952TrQ c75952TrQ, IDo0S413S0100000_13 iDo0S413S0100000_13) {
        this.LJLIL = multiHostCrossAdapterImpl;
        this.LJLILLLLZI = c75952TrQ;
        this.LJLJI = iDo0S413S0100000_13;
    }
}
