package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM", f = "SharedInviteDialogVM.kt", l = {106}, m = "setupShowInfo")
/* renamed from: X.Luk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55774Luk extends C3CS {
    public SharedInviteDialogVM LJLIL;
    public C55773Luj LJLILLLLZI;
    public Object LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ SharedInviteDialogVM LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55774Luk(SharedInviteDialogVM sharedInviteDialogVM, InterfaceC67352kd<? super C55774Luk> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = sharedInviteDialogVM;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.hv0(null, null, this);
    }
}
