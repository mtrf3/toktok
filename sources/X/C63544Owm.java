package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase", f = "SendMsgUseCase.kt", l = {129, 137, 146, 156, 163, 194, 196, 245}, m = "send-0E7RQCE")
/* renamed from: X.Owm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63544Owm extends C3CS {
    public C63537Owf LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public C63120Opw LJLJJI;
    public C63588OxU LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C63537Owf LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63544Owm(C63537Owf c63537Owf, InterfaceC67352kd<? super C63544Owm> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c63537Owf;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LJ = this.LJLJL.LJ(null, null, this);
        if (LJ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJ;
        }
        return C3C5.m6boximpl(LJ);
    }
}
