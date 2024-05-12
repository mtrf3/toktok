package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.processor.SkylightDMModule", f = "SkylightDMModule.kt", l = {77}, m = "fetch")
/* renamed from: X.4hE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116204hE extends C3CS {
    public C116194hD LJLIL;
    public Object LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C116194hD LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116204hE(C116194hD c116194hD, InterfaceC67352kd<? super C116204hE> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c116194hD;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZIZ(this);
    }
}
