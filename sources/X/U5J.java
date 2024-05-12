package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U5J implements InterfaceC76768UAy<ReplyResult> {
    public final /* synthetic */ InterfaceC75414Tik<ReplyResult> LJLIL;

    public U5J(InterfaceC75414Tik<ReplyResult> interfaceC75414Tik) {
        this.LJLIL = interfaceC75414Tik;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(ReplyResult value) {
        o.LJIIIZ(value, "value");
        InterfaceC75414Tik<ReplyResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75414Tik<ReplyResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
