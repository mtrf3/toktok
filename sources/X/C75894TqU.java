package X;

import Y.IDo0S413S0100000_13;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostMultiAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.TqU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75894TqU implements InterfaceC75414Tik<CancelApplyResult> {
    public final /* synthetic */ C75878TqE LJLIL;
    public final /* synthetic */ C76002TsE LJLILLLLZI;
    public final /* synthetic */ InterfaceC75414Tik<CancelApplyResult> LJLJI;
    public final /* synthetic */ C75883TqJ LJLJJI;
    public final /* synthetic */ MultiHostMultiAdapterImpl LJLJJL;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(CancelApplyResult cancelApplyResult) {
        CancelApplyResult value = cancelApplyResult;
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelApply, onSuccess, value = ");
        LIZ.append(value);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        this.LJLIL.LJJIIZI(this.LJLILLLLZI.LIZIZ, value.logId, "");
        InterfaceC75414Tik<CancelApplyResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
        C75883TqJ c75883TqJ = this.LJLJJI;
        if (c75883TqJ != null) {
            this.LJLJJL.LLJJJJ(c75883TqJ.LIZ);
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        boolean z;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelApply, onFail, error = ");
        LIZ.append(error);
        LIZ.append(", throwable = ");
        LIZ.append(th);
        C0NB.LJIIIZ("MultiHostMultiAdapter", X1D.LIZIZ(LIZ));
        this.LJLIL.LJJIIJ(this.LJLILLLLZI.LIZIZ, "", th);
        InterfaceC75414Tik<CancelApplyResult> interfaceC75414Tik = this.LJLJI;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
        if (th != null && (th instanceof C29401Dk) && ((C276516r) th).getErrorCode() == C75925Tqz.LIZ.LJLJJI) {
            z = false;
        } else {
            z = true;
        }
        C75883TqJ c75883TqJ = this.LJLJJI;
        if (c75883TqJ != null) {
            MultiHostMultiAdapterImpl multiHostMultiAdapterImpl = this.LJLJJL;
            C0RN.LIZLLL("cancelApply, onFail, tryDestroySession = ", z, "MultiHostMultiAdapter");
            if (z) {
                multiHostMultiAdapterImpl.LLJJJJ(c75883TqJ.LIZ);
            }
        }
    }

    public C75894TqU(C75878TqE c75878TqE, C76002TsE c76002TsE, IDo0S413S0100000_13 iDo0S413S0100000_13, C75883TqJ c75883TqJ, MultiHostMultiAdapterImpl multiHostMultiAdapterImpl) {
        this.LJLIL = c75878TqE;
        this.LJLILLLLZI = c76002TsE;
        this.LJLJI = iDo0S413S0100000_13;
        this.LJLJJI = c75883TqJ;
        this.LJLJJL = multiHostMultiAdapterImpl;
    }
}
