package X;

import Y.ARunnableS28S0200000_9;
import Y.AfS61S0100000_9;
import android.os.Message;
import com.ss.android.ugc.aweme.ecommerce.video.api.VideoRecommendApi;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedModel;
import com.ss.android.ugc.aweme.ecommerce.video.dto.CommonFeedRequest;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import fjb.a;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.video.vo.ECAwemeListModel$loadMoreList$2", f = "ECAwemeListModel.kt", l = {331}, m = "invokeSuspend")
/* renamed from: X.LvC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55802LvC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public C68322mC LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ C55781Lur LJLJJI;
    public final /* synthetic */ M89 LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ long LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55802LvC(C55781Lur c55781Lur, M89 m89, int i, long j, InterfaceC67352kd<? super C55802LvC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = c55781Lur;
        this.LJLJJL = m89;
        this.LJLJJLL = i;
        this.LJLJL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55802LvC(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C68322mC LIZ;
        String str;
        String str2;
        String str3;
        C68322mC c68322mC;
        AnchorCustomData anchorCustomData;
        T t;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        String str4 = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    c68322mC = this.LJLILLLLZI;
                    LIZ = this.LJLIL;
                    C141335gf.LIZJ(obj2);
                    t = obj2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                LIZ = C793239k.LIZ(obj2);
                M89 m89 = this.LJLJJL;
                C55781Lur c55781Lur = this.LJLJJI;
                int i2 = this.LJLJJLL;
                long j = this.LJLJL;
                C55805LvF c55805LvF = VideoRecommendApi.LIZ;
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
                String str5 = c55781Lur.LJLJJI;
                List LJJIJ = C47261Igj.LJJIJ(new Long(c55781Lur.LJLIL));
                List LLJI = ORZ.LLJI(c55781Lur.LJLILLLLZI);
                if (m89 != null && (anchorCustomData = m89.getAnchorCustomData()) != null) {
                    str3 = anchorCustomData.getPageName();
                } else {
                    str3 = null;
                }
                CommonFeedRequest commonFeedRequest = new CommonFeedRequest(str2, 2, 6, i2, str5, j, LJJIJ, LLJI, str3);
                c55805LvF.getClass();
                AbstractC73672Svk LIZ2 = C55805LvF.LIZ(commonFeedRequest);
                this.LJLIL = LIZ;
                this.LJLILLLLZI = LIZ;
                this.LJLJI = 1;
                XKS xks = new XKS(1, C78555UsJ.LJJII(this));
                xks.LJIIL();
                xks.LJIILIIL(new AqS175S0100000_9(LIZ2.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(xks, 55), new AfS61S0100000_9(xks, 56)), 504));
                Object LJIIJJI = xks.LJIIJJI();
                if (LJIIJJI == enumC58928NAu) {
                    return enumC58928NAu;
                }
                c68322mC = LIZ;
                t = LJIIJJI;
            }
            c68322mC.element = t;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        String str6 = this.LJLJJI.LJLJJI;
        if (str6 == null || ujb.o.LJJJJJL(str6)) {
            C55781Lur c55781Lur2 = this.LJLJJI;
            CommonFeedModel commonFeedModel = (CommonFeedModel) LIZ.element;
            if (commonFeedModel != null) {
                str4 = commonFeedModel.getSessionId();
            }
            c55781Lur2.LJLJJI = str4;
        }
        CommonFeedModel commonFeedModel2 = (CommonFeedModel) LIZ.element;
        if (commonFeedModel2 != null) {
            this.LJLJJI.LJIIIZ(commonFeedModel2, this.LJLJJL);
        }
        Message obtainMessage = this.LJLJJI.mHandler.obtainMessage(0);
        o.LJIIIIZZ(obtainMessage, "mHandler.obtainMessage(MSG_REQUEST)");
        Object obj3 = LIZ.element;
        if (obj3 == null) {
            obj3 = this.LJLJJI.mData;
        }
        obtainMessage.obj = obj3;
        C55781Lur c55781Lur3 = this.LJLJJI;
        c55781Lur3.LJLJJL.post(new ARunnableS28S0200000_9(obtainMessage, c55781Lur3, 63));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
