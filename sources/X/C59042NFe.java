package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.commercialize.profile.impl.ad.CommerceProfileFeedModule", f = "CommerceProfileFeedModule.kt", l = {312}, m = "fetchNextAdBatch-BWLJW6A")
/* renamed from: X.NFe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59042NFe extends C3CS {
    public C59041NFd LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C59041NFd LJLJI;
    public int LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59042NFe(C59041NFd c59041NFd, InterfaceC67352kd<? super C59042NFe> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLJI = c59041NFd;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLILLLLZI = obj;
        this.LJLJJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        Object LIZIZ = this.LJLJI.LIZIZ(0, null, null, this);
        if (LIZIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZIZ;
        }
        return C3C5.m6boximpl(LIZIZ);
    }
}
