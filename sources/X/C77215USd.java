package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.contact.ContactRequestAuthProcessor", f = "ContactRequestAuthProcessor.kt", l = {32, 47}, m = "process")
/* renamed from: X.USd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77215USd extends C3CS {
    public C77211URz LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ USZ LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77215USd(USZ usz, InterfaceC67352kd<? super C77215USd> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = usz;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LIZ(null, this);
    }
}
