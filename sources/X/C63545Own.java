package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase", f = "SendMsgUseCase.kt", l = {267}, m = "getResponseFromNetworkRequest")
/* renamed from: X.Own, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63545Own extends C3CS {
    public C63537Owf LJLIL;
    public C63588OxU LJLILLLLZI;
    public C109544Rq LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C63537Owf LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63545Own(C63537Owf c63537Owf, InterfaceC67352kd<? super C63545Own> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c63537Owf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZJ(null, null, this);
    }
}
