package X;

import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Scf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72489Scf extends AbstractC72278SYg<String> {
    public final /* synthetic */ MufListPageViewModel LIZIZ;

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onRefresh(InterfaceC67352kd<? super A2G<String>> continuation) {
        o.LJIIIZ(continuation, "continuation");
        XKX.LIZLLL(this.LIZIZ.getAssemVMScope(), C78613UtF.LIZJ, null, new C72495Scl(this.LIZIZ, continuation, null), 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72489Scf(C57939MoZ c57939MoZ, MufListPageViewModel mufListPageViewModel) {
        super(c57939MoZ);
        this.LIZIZ = mufListPageViewModel;
    }

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onLoadMore(InterfaceC67352kd continuation, Object obj) {
        String params = (String) obj;
        o.LJIIIZ(continuation, "continuation");
        o.LJIIIZ(params, "params");
        XKX.LIZLLL(this.LIZIZ.getAssemVMScope(), C78613UtF.LIZJ, null, new C72494Sck(this.LIZIZ, params, continuation, null), 2);
    }
}
