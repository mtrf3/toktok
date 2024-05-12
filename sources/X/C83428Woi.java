package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.framework.BaseSelectionUIMicroAction", f = "BaseSelectionUIMicroAction.kt", l = {71}, m = "execute-238auH8$suspendImpl")
/* renamed from: X.Woi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83428Woi extends C3CS {
    public C83427Woh LJLIL;
    public C83429Woj LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C83427Woh<I> LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83428Woi(C83427Woh<I> c83427Woh, InterfaceC67352kd<? super C83428Woi> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c83427Woh;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LIZJ = C83427Woh.LIZJ(this.LJLJJI, null, null, null, this);
        if (LIZJ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZJ;
        }
        return C3C5.m6boximpl(LIZJ);
    }
}
