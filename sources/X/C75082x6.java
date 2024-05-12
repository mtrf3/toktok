package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.AudienceProductCountApi;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.ProductCount;
import com.ss.android.ugc.aweme.services.BaseUserService;
import fjb.a;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.ECAudienceWidget$handleProductNumberChange$1", f = "ECAudienceWidget.kt", l = {1202}, m = "invokeSuspend")
/* renamed from: X.2x6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75082x6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C71188Rwm LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75082x6(C71188Rwm c71188Rwm, int i, InterfaceC67352kd<? super C75082x6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c71188Rwm;
        this.LJLJI = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75082x6(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        ProductCount productCount;
        Integer num;
        Long l;
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLIL;
        BaseResponse baseResponse = null;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C71188Rwm c71188Rwm = this.LJLILLLLZI;
                AudienceProductCountApi audienceProductCountApi = (AudienceProductCountApi) C67332kb.LIZ().create(AudienceProductCountApi.class);
                Room room = c71188Rwm.LJLJLLL;
                if (room != null) {
                    l = new Long(room.getId());
                } else {
                    l = null;
                }
                String valueOf = String.valueOf(l);
                String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
                if (currentUserID == null) {
                    currentUserID = "";
                }
                Room room2 = c71188Rwm.LJLJLLL;
                if (room2 != null) {
                    str = new Long(room2.getOwnerUserId()).toString();
                } else {
                    str = null;
                }
                boolean LJ = o.LJ(currentUserID, str);
                this.LJLIL = 1;
                obj = audienceProductCountApi.getProductsCount(valueOf, LJ, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            baseResponse = (BaseResponse) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        C71188Rwm c71188Rwm2 = this.LJLILLLLZI;
        if (baseResponse != null && (productCount = (ProductCount) baseResponse.getData()) != null && (num = productCount.total) != null) {
            i = num.intValue();
        } else {
            i = this.LJLJI;
        }
        c71188Rwm2.LLJILLL = i;
        c71188Rwm2.LLJJ = 0;
        C71150RwA.LIZ = i;
        c71188Rwm2.LJJIIJZLJL(true);
        c71188Rwm2.LJIILLIIL(i);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
