package X;

import Y.ARunnableS28S0200000_9;
import Y.AfS61S0100000_9;
import android.os.Message;
import com.ss.android.ugc.aweme.ecommerce.video.api.VideoRecommendApi;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedRequest;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.video.vo.ECAwemeListModel$refreshList$3", f = "ECAwemeListModel.kt", l = {329, 345}, m = "invokeSuspend")
/* renamed from: X.LvD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55803LvD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C55781Lur LJLILLLLZI;
    public final /* synthetic */ M89 LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55803LvD(C55781Lur c55781Lur, M89 m89, int i, long j, String str, InterfaceC67352kd<? super C55803LvD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c55781Lur;
        this.LJLJI = m89;
        this.LJLJJI = i;
        this.LJLJJL = j;
        this.LJLJJLL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55803LvD(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        CommonFeedModel commonFeedModel;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        String str3 = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj2);
                    commonFeedModel = (CommonFeedModel) obj2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj2);
                commonFeedModel = (CommonFeedModel) obj2;
            }
        } else {
            C141335gf.LIZJ(obj2);
            String str4 = "search_video_in_stream";
            if (((ArrayList) this.LJLILLLLZI.LJLJI).size() < 2) {
                C55805LvF c55805LvF = VideoRecommendApi.LIZ;
                M89 m89 = this.LJLJI;
                if (m89 != null) {
                    str2 = m89.getFrom();
                } else {
                    str2 = null;
                }
                if (!o.LJ(str2, "from_ecom_search")) {
                    str4 = "ttmall_video_in_stream";
                }
                CommonFeedRequest commonFeedRequest = new CommonFeedRequest(str4, 0, 6, this.LJLJJI, null, this.LJLJJL, C47261Igj.LJJIJ(new Long(this.LJLILLLLZI.LJLIL)), ORZ.LLJI(this.LJLILLLLZI.LJLILLLLZI), this.LJLJJLL, 16, null);
                c55805LvF.getClass();
                AbstractC73672Svk LIZ = C55805LvF.LIZ(commonFeedRequest);
                this.LJLIL = 1;
                XKS xks = new XKS(1, C78555UsJ.LJJII(this));
                xks.LJIIL();
                xks.LJIILIIL(new AqS175S0100000_9(LIZ.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(xks, 59), new AfS61S0100000_9(xks, 60)), 506));
                obj2 = xks.LJIIJJI();
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
                commonFeedModel = (CommonFeedModel) obj2;
            } else {
                C55805LvF c55805LvF2 = VideoRecommendApi.LIZ;
                M89 m892 = this.LJLJI;
                if (m892 != null) {
                    str = m892.getFrom();
                } else {
                    str = null;
                }
                if (!o.LJ(str, "from_ecom_search")) {
                    str4 = "ttmall_video_in_stream";
                }
                CommonFeedRequest commonFeedRequest2 = new CommonFeedRequest(str4, 1, 6, this.LJLJJI, null, this.LJLJJL, C47261Igj.LJJIJ(new Long(this.LJLILLLLZI.LJLIL)), ORZ.LLJI(this.LJLILLLLZI.LJLILLLLZI), this.LJLJJLL, 16, null);
                c55805LvF2.getClass();
                AbstractC73672Svk LIZ2 = C55805LvF.LIZ(commonFeedRequest2);
                this.LJLIL = 2;
                XKS xks2 = new XKS(1, C78555UsJ.LJJII(this));
                xks2.LJIIL();
                xks2.LJIILIIL(new AqS175S0100000_9(LIZ2.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(xks2, 61), new AfS61S0100000_9(xks2, 62)), 507));
                obj2 = xks2.LJIIJJI();
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
                commonFeedModel = (CommonFeedModel) obj2;
            }
        }
        C55781Lur c55781Lur = this.LJLILLLLZI;
        if (commonFeedModel != null) {
            str3 = commonFeedModel.getSessionId();
        }
        c55781Lur.LJLJJI = str3;
        if (commonFeedModel != null) {
            this.LJLILLLLZI.LJIIIZ(commonFeedModel, this.LJLJI);
            Message obtainMessage = this.LJLILLLLZI.mHandler.obtainMessage(0);
            o.LJIIIIZZ(obtainMessage, "mHandler.obtainMessage(MSG_REQUEST)");
            obtainMessage.obj = commonFeedModel;
            C55781Lur c55781Lur2 = this.LJLILLLLZI;
            c55781Lur2.LJLJJL.post(new ARunnableS28S0200000_9(obtainMessage, c55781Lur2, 65));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
