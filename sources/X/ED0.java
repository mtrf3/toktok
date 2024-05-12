package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.log.FeedEcCardProductRecUtil", f = "FeedEcCardProductRecUtil.kt", l = {BaseNotice.CREATOR}, m = "reportRecProductImpress")
/* loaded from: classes7.dex */
public final class ED0 extends C3CS {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ ED1 LJLILLLLZI;
    public int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ED0(ED1 ed1, InterfaceC67352kd<? super ED0> interfaceC67352kd) {
        super(interfaceC67352kd);
        this.LJLILLLLZI = ed1;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        this.LJLIL = obj;
        this.LJLJI |= LiveLayoutPreloadThreadPriority.DEFAULT;
        return this.LJLILLLLZI.LIZ(null, null, this);
    }
}
