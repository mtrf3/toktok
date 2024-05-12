package X;

import Y.AfS61S0100000_9;
import com.ss.android.ugc.aweme.ecommerce.video.api.VideoRecommendApi;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedRequest;
import fjb.a;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.video.vo.ECAwemeListModel$refreshList$2$firstBatchJobDeferred$1", f = "ECAwemeListModel.kt", l = {329}, m = "invokeSuspend")
/* renamed from: X.LvE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55804LvE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super CommonFeedModel>, Object> {
    public int LJLIL;
    public final /* synthetic */ M89 LJLILLLLZI;
    public final /* synthetic */ C55781Lur LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55804LvE(long j, C55781Lur c55781Lur, M89 m89, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = m89;
        this.LJLJI = c55781Lur;
        this.LJLJJI = j;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        M89 m89 = this.LJLILLLLZI;
        return new C55804LvE(this.LJLJJI, this.LJLJI, m89, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            C55805LvF c55805LvF = VideoRecommendApi.LIZ;
            M89 m89 = this.LJLILLLLZI;
            if (m89 != null) {
                str = m89.getFrom();
            } else {
                str = null;
            }
            if (o.LJ(str, "from_ecom_search")) {
                str2 = "search_video_in_stream";
            } else {
                str2 = "ttmall_video_in_stream";
            }
            CommonFeedRequest commonFeedRequest = new CommonFeedRequest(str2, 2, 6, 1, null, this.LJLJJI, C47261Igj.LJJIJ(new Long(this.LJLJI.LJLIL)), ORZ.LLJI(this.LJLJI.LJLILLLLZI), this.LJLJJL, 16, null);
            c55805LvF.getClass();
            AbstractC73672Svk LIZ = C55805LvF.LIZ(commonFeedRequest);
            this.LJLIL = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            xks.LJIILIIL(new AqS175S0100000_9(LIZ.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(xks, 57), new AfS61S0100000_9(xks, 58)), 505));
            obj2 = xks.LJIIJJI();
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj2;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super CommonFeedModel> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
