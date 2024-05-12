package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.text.TextApplyAction", f = "TextApplyAction.kt", l = {67}, m = "execute-BWLJW6A")
/* renamed from: X.Hpx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45285Hpx extends C3CS {
    public C45284Hpw LJLIL;
    public C45241HpF LJLILLLLZI;
    public long LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C45284Hpw LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45285Hpx(C45284Hpw c45284Hpw, InterfaceC67352kd<? super C45285Hpx> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c45284Hpw;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LIZJ = this.LJLJJL.LIZJ(null, this);
        if (LIZJ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZJ;
        }
        return C3C5.m6boximpl(LIZJ);
    }
}
