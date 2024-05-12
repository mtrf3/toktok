package X;

import com.bytedance.android.live.liveinteract.multiguestv3.usercard.MultiGuestUserCardCell;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.liveinteract.multiguestv3.usercard.MultiGuestUserCardCell", f = "MultiGuestUserCardCell.kt", l = {198}, m = "requestData")
/* renamed from: X.Bik, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29550Bik extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ MultiGuestUserCardCell LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29550Bik(MultiGuestUserCardCell multiGuestUserCardCell, InterfaceC67352kd<? super C29550Bik> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = multiGuestUserCardCell;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIIIZ(this);
    }
}
