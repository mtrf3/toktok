package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U4X implements InterfaceC76768UAy<CancelInviteJoinGroupResult> {
    public final /* synthetic */ InterfaceC75414Tik<CancelInviteJoinGroupResult> LJLIL;

    public U4X(C75901Tqb c75901Tqb) {
        this.LJLIL = c75901Tqb;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(CancelInviteJoinGroupResult value) {
        o.LJIIIZ(value, "value");
        InterfaceC75414Tik<CancelInviteJoinGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75414Tik<CancelInviteJoinGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
