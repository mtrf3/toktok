package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U6N implements InterfaceC76768UAy<RechargeResult> {
    public final /* synthetic */ InterfaceC75414Tik<RechargeResult> LJLIL;

    public U6N(InterfaceC75414Tik<RechargeResult> interfaceC75414Tik) {
        this.LJLIL = interfaceC75414Tik;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(RechargeResult value) {
        o.LJIIIZ(value, "value");
        InterfaceC75414Tik<RechargeResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75414Tik<RechargeResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
