package X;

import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.Tqm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75912Tqm implements InterfaceC75414Tik<LeaveGroupResult> {
    public final /* synthetic */ InterfaceC75414Tik<LeaveGroupResult> LJLIL;
    public final /* synthetic */ MultiHostCrossAdapterImpl LJLILLLLZI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(LeaveGroupResult value) {
        o.LJIIIZ(value, "value");
        InterfaceC75414Tik<LeaveGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leaveGroup");
        LIZ.append(", onSuccess, value = ");
        LIZ.append(value);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
    }

    public C75912Tqm(C75910Tqk c75910Tqk, MultiHostCrossAdapterImpl multiHostCrossAdapterImpl) {
        this.LJLIL = c75910Tqk;
        this.LJLILLLLZI = multiHostCrossAdapterImpl;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leaveGroup");
        LIZ.append(", onFail, error = ");
        LIZ.append(error);
        C0NB.LJIIIZ("MultiHostCrossAdapter", X1D.LIZIZ(LIZ));
        InterfaceC75414Tik<LeaveGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
        this.LJLILLLLZI.LLJLILLLLZIIL("leaveGroup", true);
    }
}
