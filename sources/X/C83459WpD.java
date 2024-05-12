package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.template.AutoCutChangeOneAction$microActionChain$2$1", f = "AutoCutChangeOneAction.kt", l = {78}, m = "execute-238auH8")
/* renamed from: X.WpD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83459WpD extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C83453Wp7 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83459WpD(C83453Wp7 c83453Wp7, InterfaceC67352kd<? super C83459WpD> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c83453Wp7;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LIZ = this.LJLILLLLZI.LIZ(null, null, null, this);
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C3C5.m6boximpl(LIZ);
    }
}
