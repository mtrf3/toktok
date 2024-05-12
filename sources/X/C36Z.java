package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController", f = "BlockUserController.kt", l = {234, 236, 239}, m = "onBlockAPIResponse")
/* renamed from: X.36Z, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36Z extends C3CS {
    public C784636c LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C784636c LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36Z(C784636c c784636c, InterfaceC67352kd<? super C36Z> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c784636c;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZJ(null, this);
    }
}
