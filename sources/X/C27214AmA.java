package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.core.engine.TemplateApi$Companion", f = "TemplateApi.kt", l = {33}, m = "loadBizParserInfo")
/* renamed from: X.AmA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27214AmA extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C27213Am9 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27214AmA(C27213Am9 c27213Am9, InterfaceC67352kd<? super C27214AmA> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = c27213Am9;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(this);
    }
}
