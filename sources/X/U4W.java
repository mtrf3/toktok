package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U4W implements InterfaceC76768UAy<CancelApplyJoinGroupResult> {
    public final /* synthetic */ InterfaceC75414Tik<CancelApplyJoinGroupResult> LJLIL;

    public U4W(C75900Tqa c75900Tqa) {
        this.LJLIL = c75900Tqa;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(CancelApplyJoinGroupResult value) {
        o.LJIIIZ(value, "value");
        InterfaceC75414Tik<CancelApplyJoinGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75414Tik<CancelApplyJoinGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
