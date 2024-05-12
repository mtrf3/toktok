package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.U4a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76588U4a implements InterfaceC76768UAy<InviteGroupResult> {
    public final /* synthetic */ InterfaceC75414Tik<InviteGroupResult> LJLIL;

    public C76588U4a(C75890TqQ c75890TqQ) {
        this.LJLIL = c75890TqQ;
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(InviteGroupResult value) {
        o.LJIIIZ(value, "value");
        InterfaceC75414Tik<InviteGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.onSuccess(value);
        }
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        InterfaceC75414Tik<InviteGroupResult> interfaceC75414Tik = this.LJLIL;
        if (interfaceC75414Tik != null) {
            interfaceC75414Tik.LJ(error, th);
        }
    }
}
