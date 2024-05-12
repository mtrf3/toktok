package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.PermitResult;
import kotlin.jvm.internal.o;

/* renamed from: X.Tqi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75908Tqi implements InterfaceC75414Tik<PermitResult> {
    @Override // X.InterfaceC75414Tik
    public final void onSuccess(PermitResult value) {
        o.LJIIIZ(value, "value");
        B5G.LIZIZ().LJJJ = new C75648TmW("invitee");
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        if (th != null) {
            BPP.LJ(C15380j0.LIZLLL(), th);
            C75516TkO.LIZ.LIZIZ(703, "permit multi_cohost application failed", th, null);
        }
    }
}
