package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachGetParams;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.bean.FeedReachResponse;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM$requestFeedReachCfg$1", f = "EcVideoGuideVM.kt", l = {147}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ECL extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C56141M1p LJLILLLLZI;
    public final /* synthetic */ C56144M1s LJLJI;
    public final /* synthetic */ EcVideoGuideVM LJLJJI;
    public final /* synthetic */ C56144M1s LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECL(C56141M1p c56141M1p, C56144M1s c56144M1s, EcVideoGuideVM ecVideoGuideVM, C56144M1s c56144M1s2, InterfaceC67352kd<? super ECL> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c56141M1p;
        this.LJLJI = c56144M1s;
        this.LJLJJI = ecVideoGuideVM;
        this.LJLJJL = c56144M1s2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ECL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C64797Pbt c64797Pbt;
        Response response;
        T t;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C56141M1p c56141M1p = this.LJLILLLLZI;
                List<String> list = c56141M1p.LJI;
                String str = c56141M1p.LIZ;
                String str2 = c56141M1p.LIZIZ;
                if (C53286Kvi.LIZIZ()) {
                    i = 1;
                } else {
                    i = 0;
                }
                FeedReachGetParams feedReachGetParams = new FeedReachGetParams(list, str, str2, i, 1, null, 32, null);
                C55951Lxb.LIZ(this.LJLILLLLZI);
                String str3 = this.LJLJJI.LJLJJL;
                java.util.Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("mall_request_scene", new Integer(1)));
                ECK eck = new ECK(this.LJLJJI, feedReachGetParams, null);
                this.LJLIL = 1;
                obj = C36669EaH.LIZLLL(str3, LJJIIZI, eck, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            c64797Pbt = (C64797Pbt) obj;
        } catch (Throwable th) {
            C78983UzD.LJIIZILJ(th);
        }
        if (c64797Pbt == null || (response = (Response) c64797Pbt.LIZIZ) == null || !response.isCodeOK() || (t = response.data) == 0) {
            return C76800UCe.LIZ;
        }
        C56144M1s c56144M1s = this.LJLJI;
        c56144M1s.LJII = true;
        this.LJLJJI.getClass();
        EcVideoGuideVM.gv0((FeedReachResponse) t, c56144M1s);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
