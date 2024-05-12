package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* renamed from: X.TeS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75148TeS implements InterfaceC75414Tik<CancelInviteResult> {
    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(CancelInviteResult value) {
        o.LJIIIZ(value, "value");
    }
}
