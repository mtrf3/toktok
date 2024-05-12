package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel$delete$1", f = "PoiReviewListViewModel.kt", l = {344, 359}, m = "invokeSuspend")
/* renamed from: X.7rJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198897rJ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ PoiReviewsApi.PoiReviewModel LJLJJI;
    public final /* synthetic */ PoiReviewListViewModel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C198897rJ(String str, String str2, PoiReviewsApi.PoiReviewModel poiReviewModel, PoiReviewListViewModel poiReviewListViewModel, InterfaceC67352kd<? super C198897rJ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = poiReviewModel;
        this.LJLJJL = poiReviewListViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C198897rJ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            PoiReviewsApi.LIZ.getClass();
            PoiReviewsApi LIZ = C199057rZ.LIZ();
            String str2 = this.LJLILLLLZI;
            String str3 = this.LJLJI;
            int value = EnumC199017rV.DELETE.getValue();
            String str4 = this.LJLJJI.serverParam;
            this.LJLIL = 1;
            obj = LIZ.doPoiReviewInteract(str2, str3, value, str4, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((BaseResponse) obj).status_code == 0) {
            this.LJLJJL.listRemoveItem((PoiReviewListViewModel) this.LJLJJI);
            PoiReviewsApi.PoiReviewUserModel poiReviewUserModel = this.LJLJJI.author;
            if (poiReviewUserModel != null) {
                str = poiReviewUserModel.userId;
            } else {
                str = null;
            }
            if (o.LJ(str, ((RBX) HG3.LJIILL()).getCurUserId())) {
                PoiReviewListViewModel.gv0(this.LJLJJL, this.LJLILLLLZI);
            }
            List<PoiReviewsApi.PoiReviewModel> list = ((C7VC) this.LJLJJL.getState()).LJLJJL.LJLJJI;
            if (list != null && list.size() == 0) {
                PoiReviewListViewModel poiReviewListViewModel = this.LJLJJL;
                this.LJLIL = 2;
                if (poiReviewListViewModel.onRefresh(this) == enumC58928NAu) {
                    return enumC58928NAu;
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
