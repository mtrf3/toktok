package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import fjb.a;
import kotlin.jvm.internal.AqS134S0200000_3;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel$delete$1", f = "PoiDetailReviewsViewModel.kt", l = {358}, m = "invokeSuspend")
/* renamed from: X.7rK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198907rK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ PoiReviewsApi.PoiReviewModel LJLJJI;
    public final /* synthetic */ PoiDetailReviewsViewModel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C198907rK(String str, String str2, PoiReviewsApi.PoiReviewModel poiReviewModel, PoiDetailReviewsViewModel poiDetailReviewsViewModel, InterfaceC67352kd<? super C198907rK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = poiReviewModel;
        this.LJLJJL = poiDetailReviewsViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C198907rK(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            PoiReviewsApi.LIZ.getClass();
            PoiReviewsApi LIZ = C199057rZ.LIZ();
            String str = this.LJLILLLLZI;
            String str2 = this.LJLJI;
            int value = EnumC199017rV.DELETE.getValue();
            String str3 = this.LJLJJI.serverParam;
            this.LJLIL = 1;
            obj = LIZ.doPoiReviewInteract(str, str2, value, str3, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (((BaseResponse) obj).status_code == 0) {
            PoiDetailReviewsViewModel poiDetailReviewsViewModel = this.LJLJJL;
            PoiReviewsApi.PoiReviewModel poiReviewModel = this.LJLJJI;
            poiDetailReviewsViewModel.getClass();
            poiDetailReviewsViewModel.withState(new AqS134S0200000_3(poiDetailReviewsViewModel, poiReviewModel, 197));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
