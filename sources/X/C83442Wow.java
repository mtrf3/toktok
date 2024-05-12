package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.actionai.jni.ExecutionContext;
import com.ss.android.ugc.aweme.actionai.action.data.TextRecommendInputParam;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.text.TextRecommendAction", f = "TextRecommendAction.kt", l = {64, 78}, m = "execute-BWLJW6A")
/* renamed from: X.Wow, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83442Wow extends C3CS {
    public C83438Wos LJLIL;
    public ExecutionContext LJLILLLLZI;
    public TextRecommendInputParam LJLJI;
    public Object LJLJJI;
    public long LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C83438Wos LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83442Wow(C83438Wos c83438Wos, InterfaceC67352kd<? super C83442Wow> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c83438Wos;
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
