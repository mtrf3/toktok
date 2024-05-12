package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.processor.SkylightDMModule", f = "SkylightDMModule.kt", l = {137}, m = "loadDmList")
/* renamed from: X.4hF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116214hF extends C3CS {
    public C116194hD LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C116194hD LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116214hF(C116194hD c116194hD, InterfaceC67352kd<? super C116214hF> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c116194hD;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJII(this);
    }
}
