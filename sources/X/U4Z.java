package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U4Z implements InterfaceC76768UAy<ApplyGroupResult> {
    public final /* synthetic */ InterfaceC75414Tik<ApplyGroupResult> LJLIL;

    public U4Z(C75891TqR c75891TqR) {
        this.LJLIL = c75891TqR;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(ApplyGroupResult value) {
        o.LJIIIZ(value, "value");
        InterfaceC75414Tik<ApplyGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75414Tik<ApplyGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
