package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelInviteJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U9L implements InterfaceC76768UAy<CancelInviteJoinGroupResult> {
    public final /* synthetic */ C76677U7l LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(CancelInviteJoinGroupResult value) {
        o.LJIIIZ(value, "value");
        this.LJLIL.LIZ.LJJIJIIJI(this.LJLILLLLZI);
    }

    public U9L(C76677U7l c76677U7l, long j) {
        this.LJLIL = c76677U7l;
        this.LJLILLLLZI = j;
    }
}
