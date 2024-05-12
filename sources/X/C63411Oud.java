package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.bytedance.im.core.repair.completeness.ConversationCompletenessCheckerImpl", f = "ConversationCompletenessChecker.kt", l = {66}, m = "checkAndReport")
/* renamed from: X.Oud, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63411Oud extends C3CS {
    public C63410Ouc LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public /* synthetic */ Object LJLJJI;
    public final /* synthetic */ C63410Ouc LJLJJL;
    public int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63411Oud(C63410Ouc c63410Ouc, InterfaceC67352kd<? super C63411Oud> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJL = c63410Ouc;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJJI = obj;
        this.LJLJJLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJL.LIZ(0, null, this);
    }
}
