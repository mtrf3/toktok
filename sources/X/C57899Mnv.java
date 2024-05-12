package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.source.processor.AuthProcessor", f = "AuthProcessor.kt", l = {144}, m = "fetchAuthMatchedUserList")
/* renamed from: X.Mnv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57899Mnv extends C3CS {
    public C57897Mnt LJLIL;
    public EnumC58046MqI LJLILLLLZI;
    public InterfaceC88472Yns LJLJI;
    public C57866MnO LJLJJI;
    public EnumC58046MqI LJLJJL;
    public long LJLJJLL;
    public /* synthetic */ Object LJLJL;
    public final /* synthetic */ C57897Mnt LJLJLJ;
    public int LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57899Mnv(C57897Mnt c57897Mnt, InterfaceC67352kd<? super C57899Mnv> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJLJ = c57897Mnt;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLJL = obj;
        this.LJLJLLL |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLJLJ.LIZIZ(null, null, this);
    }
}
