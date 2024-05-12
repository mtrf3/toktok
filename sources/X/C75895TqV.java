package X;

import Y.IDo0S413S0100000_13;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostMultiAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.TqV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75895TqV implements InterfaceC75414Tik<CancelInviteResult> {
    public final /* synthetic */ C75878TqE LJLIL;
    public final /* synthetic */ C76001TsD LJLILLLLZI;
    public final /* synthetic */ InterfaceC75414Tik<CancelInviteResult> LJLJI;
    public final /* synthetic */ MultiHostMultiAdapterImpl LJLJJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(CancelInviteResult cancelInviteResult) {
        CancelInviteResult value = cancelInviteResult;
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelInvite, onSuccess, value = ");
        LIZ.append(value);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        this.LJLIL.LJJIJIL(this.LJLILLLLZI.LIZIZ, value.logId, "");
        InterfaceC75414Tik<CancelInviteResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
        this.LJLJJI.LLJJJJ(this.LJLILLLLZI.LIZIZ);
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        boolean z;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelInvite, onFail, error = ");
        LIZ.append(error);
        LIZ.append(", throwable = ");
        LIZ.append(th);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        this.LJLIL.LJJIJ(this.LJLILLLLZI.LIZIZ, "", th);
        InterfaceC75414Tik<CancelInviteResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
        if (th != null && (th instanceof C29401Dk) && ((C276516r) th).getErrorCode() == C75925Tqz.LIZ.LJLJJI) {
            z = false;
        } else {
            z = true;
        }
        C0RN.LIZLLL("cancelApply, onFail, tryDestroySession = ", z, "MultiHostMultiAdapter");
        if (z) {
            this.LJLJJI.LLJJJJ(this.LJLILLLLZI.LIZIZ);
        }
    }

    public C75895TqV(C75878TqE c75878TqE, C76001TsD c76001TsD, IDo0S413S0100000_13 iDo0S413S0100000_13, MultiHostMultiAdapterImpl multiHostMultiAdapterImpl) {
        this.LJLIL = c75878TqE;
        this.LJLILLLLZI = c76001TsD;
        this.LJLJI = iDo0S413S0100000_13;
        this.LJLJJI = multiHostMultiAdapterImpl;
    }
}
