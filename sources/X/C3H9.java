package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.im.service.model.IMUser;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.relations.data.core.sort.RecentWithRecTypeCollator", f = "RecentWithRecTypeCollator.kt", l = {22, LiveBroadcastTaskResourceIdSetting.DEFAULT, C61447O9r.LJIIJ}, m = "sort")
/* renamed from: X.3H9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3H9 extends C3CS {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public Object LJLJJI;
    public IMUser LJLJJL;
    public Object LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C3H8 LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3H9(C3H8 c3h8, InterfaceC67352kd<? super C3H9> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c3h8;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.LJIILL(null, this);
    }
}
