package X;

import com.ss.android.ugc.aweme.ecommerce.mall.lynxhome.model.MallV3Cache;
import com.ss.android.ugc.aweme.ecommerce.mall.preload.ECColdStartFetchTask;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.mall.preload.ECColdStartFetchTask$run$1", f = "ECColdStartFetchTask.kt", l = {53}, m = "invokeSuspend")
/* renamed from: X.KSg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51738KSg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ ECColdStartFetchTask LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51738KSg(ECColdStartFetchTask eCColdStartFetchTask, InterfaceC67352kd<? super C51738KSg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = eCColdStartFetchTask;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C51738KSg(this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        MallV3Cache LIZIZ;
        Boolean bool;
        List list;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            this.LJLJI.getClass();
            if (ECColdStartFetchTask.LIZLLL() != null) {
                ECColdStartFetchTask eCColdStartFetchTask = this.LJLJI;
                eCColdStartFetchTask.getClass();
                if (!C51751KSt.LIZ.LIZJ()) {
                    Integer num = new Integer(((Number) C51747KSp.LIZ.getValue()).intValue());
                    int intValue = num.intValue();
                    this.LJLIL = num;
                    this.LJLILLLLZI = 1;
                    if (eCColdStartFetchTask.LJII(intValue, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    C36746EbW.LIZ(3, "ShopTabV3 ImgPreload ColdStartImgPrelaod");
                    if (!C51741KSj.LIZ && C51749KSr.LIZ() != 0 && C51749KSr.LIZ() != 3 && (LIZIZ = C51751KSt.LIZIZ()) != null) {
                        java.util.Map<String, Object> data = LIZIZ.getData();
                        List list2 = null;
                        if (data != null) {
                            bool = C35685DzV.LIZ(data);
                            list = C35685DzV.LIZIZ(data);
                            list2 = C35685DzV.LIZJ(data);
                        } else {
                            bool = null;
                            list = null;
                        }
                        C51741KSj.LIZ(bool, list, list2, EnumC51740KSi.LOAD_IN_HOME_FEED.getPageName(), EnumC51744KSm.LOCAL_FIRST_REQUEST.getValue());
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
