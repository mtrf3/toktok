package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U4Y implements InterfaceC76768UAy<LeaveGroupResult> {
    public final /* synthetic */ InterfaceC75414Tik<LeaveGroupResult> LJLIL;

    public U4Y(C75912Tqm c75912Tqm) {
        this.LJLIL = c75912Tqm;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(LeaveGroupResult value) {
        o.LJIIIZ(value, "value");
        InterfaceC75414Tik<LeaveGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75414Tik<LeaveGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
