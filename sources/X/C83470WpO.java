package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.actionai.jni.ActionExecuteCallback;
import com.bytedance.ies.actionai.jni.ExecutionContext;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.framework.MicroActionChain$next$1", f = "MicroActionChain.kt", l = {54, 64}, m = "execute-BWLJW6A")
/* renamed from: X.WpO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83470WpO extends C3CS {
    public Object LJLIL;
    public ExecutionContext LJLILLLLZI;
    public ActionExecuteCallback LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C83468WpM LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83470WpO(C83468WpM c83468WpM, InterfaceC67352kd<? super C83470WpO> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c83468WpM;
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
