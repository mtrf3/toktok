package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.actionai.jni.ActionExecuteCallback;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.text.AddTextOneAction$selectionUIMicroAction$1", f = "AddTextOneAction.kt", l = {47, 50}, m = "onChange")
/* renamed from: X.Woq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83436Woq extends C3CS {
    public C83434Woo LJLIL;
    public ActionExecuteCallback LJLILLLLZI;
    public C45241HpF LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C83434Woo LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83436Woq(C83434Woo c83434Woo, InterfaceC67352kd<? super C83436Woq> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c83434Woo;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(null, null, this);
    }
}
