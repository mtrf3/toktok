package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.ies.cutsame.source.TemplateSourceServiceImpl", f = "TemplateSourceService.kt", l = {302, 307, 313}, m = "fetchEffect")
/* renamed from: X.6pe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C172386pe extends C3CS {
    public C172336pZ LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public InterfaceC172486po LJLJJI;
    public InterfaceC88472Yns LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ C172336pZ LJLJL;
    public int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C172386pe(C172336pZ c172336pZ, InterfaceC67352kd<? super C172386pe> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJL = c172336pZ;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJLL = obj;
        this.LJLJLJ |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJL.LIZJ(null, null, null, null, null, this);
    }
}
