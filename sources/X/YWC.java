package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.manager.dao.room.IMUserDaoWithRoom", f = "IMUserDaoWithRoom.kt", l = {35}, m = "insertOrReplaceIMUser")
/* loaded from: classes16.dex */
public final class YWC extends C3CS {
    public YW2 LJLIL;
    public Object LJLILLLLZI;
    public boolean LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ YW2 LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YWC(YW2 yw2, InterfaceC67352kd<? super YWC> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = yw2;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LJIJI(null, this, false);
    }
}
