package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ReplyResult;
import kotlin.jvm.internal.o;

/* renamed from: X.Tqh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75907Tqh implements InterfaceC75414Tik<ReplyResult> {
    @Override // X.InterfaceC75414Tik
    public final void onSuccess(ReplyResult value) {
        o.LJIIIZ(value, "value");
        B5G.LIZIZ().LJJJ = new C75648TmW("invitee");
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        if (th != null) {
            BPP.LJ(C15380j0.LIZLLL(), th);
            C75516TkO.LIZ.LIZIZ(702, "reply multi_cohost invitation failed", th, null);
        }
    }
}
