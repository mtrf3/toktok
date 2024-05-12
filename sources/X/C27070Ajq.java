package X;

import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.MainOrderInfoVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import fjb.a;
import java.util.HashMap;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.MainOrderInfoVH$ShopSkuAdapter$jumpUserRightSecondPage$1$2", f = "MainOrderInfoVH.kt", l = {842}, m = "invokeSuspend")
/* renamed from: X.Ajq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27070Ajq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ MainOrderInfoVH LJLILLLLZI;
    public final /* synthetic */ UserRightDetail LJLJI;
    public final /* synthetic */ HashMap<String, Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27070Ajq(MainOrderInfoVH mainOrderInfoVH, UserRightDetail userRightDetail, HashMap<String, Object> hashMap, InterfaceC67352kd<? super C27070Ajq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = mainOrderInfoVH;
        this.LJLJI = userRightDetail;
        this.LJLJJI = hashMap;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27070Ajq(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            FragmentManager fragmentManager = this.LJLILLLLZI.LJLILLLLZI.getFragmentManager();
            UserRightDetail userRightDetail = this.LJLJI;
            String str = userRightDetail.name;
            String str2 = userRightDetail.description;
            View itemView = this.LJLILLLLZI.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            String LJJIJ = C79234V7u.LJJIJ(itemView);
            HashMap<String, Object> hashMap = this.LJLJJI;
            this.LJLIL = 1;
            if (fragmentManager == null) {
                LIZ = C76800UCe.LIZ;
            } else {
                C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                C27072Ajs.LIZ = c84654XKg;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                hashMap.put("page_name", "free_return_via_drop_off");
                C26224AQy c26224AQy = new C26224AQy();
                if (str == null) {
                    str = "";
                }
                c26224AQy.LJ = str;
                if (str2 == null) {
                    str2 = "";
                }
                c26224AQy.LIZIZ(str2);
                ASL LIZ2 = c26224AQy.LIZ();
                LIZ2.LJ(new DialogInterfaceOnDismissListenerC27071Ajr(LJJIJ, elapsedRealtime, hashMap));
                LIZ2.LIZ.show(fragmentManager, "returnFree");
                if (LJJIJ != null) {
                    C78946Uyc.LJJIII(LJJIJ, new C70922RsU(), new AqS170S0100000_4((HashMap) hashMap, (HashMap<String, Object>) 1068));
                }
                LIZ = c84654XKg.LIZ();
                if (LIZ != enumC58928NAu) {
                    LIZ = C76800UCe.LIZ;
                }
            }
            if (LIZ == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
