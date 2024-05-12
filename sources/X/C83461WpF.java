package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.action.microaction.template.AutoCutChangeOneAction$selectionUIMicroAction$1", f = "AutoCutChangeOneAction.kt", l = {50}, m = "onChange")
/* renamed from: X.WpF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83461WpF extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C83455Wp9 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83461WpF(C83455Wp9 c83455Wp9, InterfaceC67352kd<? super C83461WpF> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c83455Wp9;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, null, this);
    }
}
