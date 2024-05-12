package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyJoinGroupResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U9M implements InterfaceC76768UAy<CancelApplyJoinGroupResult> {
    public final /* synthetic */ C76677U7l LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    @Override // X.InterfaceC76768UAy
    public final void LIZJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
    }

    @Override // X.InterfaceC76768UAy
    public final void LIZIZ(CancelApplyJoinGroupResult value) {
        o.LJIIIZ(value, "value");
        this.LJLIL.LIZ.LLILZLL(this.LJLILLLLZI);
    }

    public U9M(C76677U7l c76677U7l, long j) {
        this.LJLIL = c76677U7l;
        this.LJLILLLLZI = j;
    }
}
