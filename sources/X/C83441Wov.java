package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.actionai.jni.ExecutionContext;
import com.ss.android.ugc.aweme.actionai.action.data.TemplateRecommendInputParam;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.template.AutoCutRecommendAction", f = "AutoCutRecommendAction.kt", l = {88, 103}, m = "execute-BWLJW6A")
/* renamed from: X.Wov, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83441Wov extends C3CS {
    public C83437Wor LJLIL;
    public ExecutionContext LJLILLLLZI;
    public TemplateRecommendInputParam LJLJI;
    public Object LJLJJI;
    public long LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C83437Wor LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83441Wov(C83437Wor c83437Wor, InterfaceC67352kd<? super C83441Wov> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c83437Wor;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LIZJ = this.LJLJL.LIZJ(null, null, this);
        if (LIZJ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZJ;
        }
        return C3C5.m6boximpl(LIZJ);
    }
}
