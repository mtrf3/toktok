package X;

import Y.IDo0S413S0100000_13;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.Tqa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75900Tqa implements InterfaceC75414Tik<CancelApplyJoinGroupResult> {
    public final /* synthetic */ InterfaceC75414Tik<CancelApplyJoinGroupResult> LJLIL;
    public final /* synthetic */ C75883TqJ LJLILLLLZI;
    public final /* synthetic */ MultiHostCrossAdapterImpl LJLJI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(CancelApplyJoinGroupResult value) {
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelApplyGroup");
        LIZ.append(", onSuccess, value = ");
        LIZ.append(value);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<CancelApplyJoinGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
        C75883TqJ c75883TqJ = this.LJLILLLLZI;
        if (c75883TqJ != null) {
            this.LJLJI.LLJLLIL(c75883TqJ.LIZ, "cancelApplyGroup");
        }
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        boolean z;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelApplyGroup");
        LIZ.append(", onFail, error = ");
        LIZ.append(error);
        LIZ.append(", throwable = ");
        LIZ.append(th);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<CancelApplyJoinGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
        if (th != null && (th instanceof C29401Dk) && ((C276516r) th).getErrorCode() == C75925Tqz.LIZ.LJLJJI) {
            z = false;
        } else {
            z = true;
        }
        C75883TqJ c75883TqJ = this.LJLILLLLZI;
        if (c75883TqJ != null) {
            MultiHostCrossAdapterImpl multiHostCrossAdapterImpl = this.LJLJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("cancelApplyGroup");
            LIZ2.append(", onFail, tryResetGroupData = ");
            LIZ2.append(z);
            C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ2));
            if (z) {
                multiHostCrossAdapterImpl.LLJLLIL(c75883TqJ.LIZ, "cancelApplyGroup");
            }
        }
    }

    public C75900Tqa(IDo0S413S0100000_13 iDo0S413S0100000_13, C75883TqJ c75883TqJ, MultiHostCrossAdapterImpl multiHostCrossAdapterImpl) {
        this.LJLIL = iDo0S413S0100000_13;
        this.LJLILLLLZI = c75883TqJ;
        this.LJLJI = multiHostCrossAdapterImpl;
    }
}
