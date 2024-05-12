package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.contact.service.IMContactServiceImpl;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.contact.service.IMContactServiceImpl", f = "IMContactServiceImpl.kt", l = {86, 93}, m = "getAllUserBaseInfoFromDB")
/* renamed from: X.3GI, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GI extends C3CS {
    public Object LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ IMContactServiceImpl LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3GI(IMContactServiceImpl iMContactServiceImpl, InterfaceC67352kd<? super C3GI> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = iMContactServiceImpl;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJII(this);
    }
}
