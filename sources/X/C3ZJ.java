package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.contact.model.IMUserBaseInfo;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.data.dao.room.IMUserBaseInfoDaoBase", f = "IMUserBaseInfoDaoBase.kt", l = {37}, m = "insertOrReplaceList")
/* renamed from: X.3ZJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ZJ extends C3CS {
    public C3ZI LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public IMUserBaseInfo LJLJJI;
    public Object LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C3ZI LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3ZJ(C3ZI c3zi, InterfaceC67352kd<? super C3ZJ> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c3zi;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZJ(null, this);
    }
}
