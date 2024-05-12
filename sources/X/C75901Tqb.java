package X;

import Y.IDo0S413S0100000_13;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.Tqb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75901Tqb implements InterfaceC75414Tik<CancelInviteJoinGroupResult> {
    public final /* synthetic */ InterfaceC75414Tik<CancelInviteJoinGroupResult> LJLIL;
    public final /* synthetic */ MultiHostCrossAdapterImpl LJLILLLLZI;
    public final /* synthetic */ C75919Tqt LJLJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(CancelInviteJoinGroupResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelInviteGroup");
        LIZ.append(", onSuccess, value = ");
        LIZ.append(value);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<CancelInviteJoinGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
        this.LJLILLLLZI.LLJLLIL(this.LJLJI.LJLILLLLZI, "cancelInviteGroup");
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        boolean z;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelInviteGroup");
        LIZ.append(", onFail, error = ");
        LIZ.append(error);
        LIZ.append(", throwable = ");
        LIZ.append(th);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<CancelInviteJoinGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
        if (th != null && (th instanceof C29401Dk) && ((C276516r) th).getErrorCode() == C75925Tqz.LIZ.LJLJJI) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("cancelInviteGroup");
        LIZ2.append(", onFail, tryDestroySession = ");
        LIZ2.append(z);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
        if (z) {
            this.LJLILLLLZI.LLJLLIL(this.LJLJI.LJLILLLLZI, "cancelInviteGroup");
        }
    }

    public C75901Tqb(IDo0S413S0100000_13 iDo0S413S0100000_13, MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, C75919Tqt c75919Tqt) {
        this.LJLIL = iDo0S413S0100000_13;
        this.LJLILLLLZI = multiHostCrossAdapterImpl;
        this.LJLJI = c75919Tqt;
    }
}
