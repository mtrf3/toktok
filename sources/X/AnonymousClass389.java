package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.relation.storage.model.LocalListResponse;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.storage.source.StorageDataSource$performFullUpdate$2", f = "StorageDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.389, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass389 extends AbstractC65782Prm implements InterfaceC88473Ynt<InterfaceC64672gJ<? super LocalListResponse>, Throwable, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C34K LJLILLLLZI;
    public final /* synthetic */ AnonymousClass385 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass389(C34K c34k, AnonymousClass385 anonymousClass385, InterfaceC67352kd<? super AnonymousClass389> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLILLLLZI = c34k;
        this.LJLJI = anonymousClass385;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        Throwable th = (Throwable) this.LJLIL;
        C34K c34k = this.LJLILLLLZI;
        if (th == null) {
            z = true;
        } else {
            z = false;
        }
        c34k.element = z;
        AnonymousClass385 anonymousClass385 = this.LJLJI;
        anonymousClass385.LJFF.put("api_sum_cost", anonymousClass385.LIZIZ.invoke().longValue() - anonymousClass385.LJI);
        if (th != null) {
            anonymousClass385.LJFF.put("is_api_succeed", CardStruct.IStatusCode.DEFAULT);
            anonymousClass385.LJFF.put("api_error_msg", th.getMessage());
        } else {
            anonymousClass385.LJFF.put("is_api_succeed", "1");
        }
        anonymousClass385.LJFF.put("is_db_succeed", CardStruct.IStatusCode.DEFAULT);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(InterfaceC64672gJ<? super LocalListResponse> interfaceC64672gJ, Throwable th, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        AnonymousClass389 anonymousClass389 = new AnonymousClass389(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        anonymousClass389.LJLIL = th;
        return anonymousClass389.invokeSuspend(C76800UCe.LIZ);
    }
}
