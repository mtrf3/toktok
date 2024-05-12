package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.template.AutoCutOneAction$selectionUIMicroAction$2$1", f = "AutoCutOneAction.kt", l = {51}, m = "onChange")
/* renamed from: X.WpG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83462WpG extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C83458WpC LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83462WpG(C83458WpC c83458WpC, InterfaceC67352kd<? super C83462WpG> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c83458WpC;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, null, this);
    }
}
