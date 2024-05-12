package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U6K implements InterfaceC76768UAy<InviteResult> {
    public final /* synthetic */ InterfaceC75414Tik<InviteResult> LJLIL;

    public U6K(InterfaceC75414Tik<InviteResult> interfaceC75414Tik) {
        this.LJLIL = interfaceC75414Tik;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(InviteResult value) {
        o.LJIIIZ(value, "value");
        InterfaceC75414Tik<InviteResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75414Tik<InviteResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
