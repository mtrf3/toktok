package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.bytedance.ies.actionai.jni.ExecutionContext;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.framework.MicroActionChain$nextWithLastResult$1", f = "MicroActionChain.kt", l = {25, 36}, m = "execute-BWLJW6A")
/* renamed from: X.WpP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83471WpP extends C3CS {
    public Object LJLIL;
    public ExecutionContext LJLILLLLZI;
    public ActionExecuteCallback LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C83469WpN LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83471WpP(C83469WpN c83469WpN, InterfaceC67352kd<? super C83471WpP> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c83469WpN;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LIZ = this.LJLJJL.LIZ(null, null, null, this);
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C3C5.m6boximpl(LIZ);
    }
}
