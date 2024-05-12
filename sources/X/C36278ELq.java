package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.PsiTask", f = "ContactFilterByPsi.kt", l = {526}, m = "uploadEncryptContact")
/* renamed from: X.ELq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36278ELq extends C3CS {
    public C36281ELt LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C36283ELv LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36278ELq(C36283ELv c36283ELv, InterfaceC67352kd<? super C36278ELq> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c36283ELv;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJI.LJ(null, this);
    }
}
