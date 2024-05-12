package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileHeaderCell;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.usercard.profilev3.LiveProfileHeaderCell", f = "LiveProfileHeaderCell.kt", l = {178}, m = "requestData")
/* renamed from: X.Bi4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29508Bi4 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ LiveProfileHeaderCell LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29508Bi4(LiveProfileHeaderCell liveProfileHeaderCell, InterfaceC67352kd<? super C29508Bi4> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = liveProfileHeaderCell;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LJIIIZ(this);
    }
}
