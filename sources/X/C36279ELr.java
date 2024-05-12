package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.PsiTask", f = "ContactFilterByPsi.kt", l = {456, 463, 473}, m = "findIntersect")
/* renamed from: X.ELr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36279ELr extends C3CS {
    public C36283ELv LJLIL;
    public C36281ELt LJLILLLLZI;
    public /* synthetic */ Object LJLJI;
    public final /* synthetic */ C36283ELv LJLJJI;
    public int LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36279ELr(C36283ELv c36283ELv, InterfaceC67352kd<? super C36279ELr> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJJI = c36283ELv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJI = obj;
        this.LJLJJL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJJI.LIZLLL(null, null, this);
    }
}
