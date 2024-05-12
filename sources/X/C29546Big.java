package X;

import com.bytedance.android.live.liveinteract.multihost.usercard.CoHostUserCardCell;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.android.live.liveinteract.multihost.usercard.CoHostUserCardCell", f = "CoHostUserCardCell.kt", l = {186}, m = "requestData")
/* renamed from: X.Big, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29546Big extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ CoHostUserCardCell LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29546Big(CoHostUserCardCell coHostUserCardCell, InterfaceC67352kd<? super C29546Big> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = coHostUserCardCell;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIIIZ(this);
    }
}
