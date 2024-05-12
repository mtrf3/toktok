package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.template.AutoCutApplyAction", f = "AutoCutApplyAction.kt", l = {104, 110}, m = "execute-BWLJW6A")
/* renamed from: X.Hp8, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45234Hp8 extends C3CS {
    public C45233Hp7 LJLIL;
    public C45241HpF LJLILLLLZI;
    public Object LJLJI;
    public long LJLJJI;
    public /* synthetic */ Object LJLJJL;
    public final /* synthetic */ C45233Hp7 LJLJJLL;
    public int LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45234Hp8(C45233Hp7 c45233Hp7, InterfaceC67352kd<? super C45234Hp8> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJLL = c45233Hp7;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJL = obj;
        this.LJLJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LIZJ = this.LJLJJLL.LIZJ(null, this);
        if (LIZJ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZJ;
        }
        return C3C5.m6boximpl(LIZJ);
    }
}
