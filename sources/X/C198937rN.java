package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel$dislike$1", f = "PoiReviewListViewModel.kt", l = {578}, m = "invokeSuspend")
/* renamed from: X.7rN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198937rN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ PoiReviewsApi.PoiReviewModel LJLJJL;
    public final /* synthetic */ PoiReviewListViewModel LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ boolean LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ long LJLL;
    public final /* synthetic */ boolean LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C198937rN(int i, int i2, long j, PoiReviewListViewModel poiReviewListViewModel, PoiReviewsApi.PoiReviewModel poiReviewModel, String str, String str2, InterfaceC67352kd interfaceC67352kd, boolean z, boolean z2, boolean z3) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
        this.LJLJJL = poiReviewModel;
        this.LJLJJLL = poiReviewListViewModel;
        this.LJLJL = i2;
        this.LJLJLJ = z;
        this.LJLJLLL = z2;
        this.LJLL = j;
        this.LJLLI = z3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        int i = this.LJLJJI;
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LJLJJL;
        PoiReviewListViewModel poiReviewListViewModel = this.LJLJJLL;
        return new C198937rN(i, this.LJLJL, this.LJLL, poiReviewListViewModel, poiReviewModel, str, str2, interfaceC67352kd, this.LJLJLJ, this.LJLJLLL, this.LJLLI);
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
            InterfaceC65462ha LIZ = C199437sB.LIZ(this.LJLJJI, this.LJLILLLLZI, this.LJLJI, this.LJLJJL.serverParam);
            final PoiReviewListViewModel poiReviewListViewModel = this.LJLJJLL;
            final int i2 = this.LJLJL;
            final PoiReviewsApi.PoiReviewModel poiReviewModel = this.LJLJJL;
            final boolean z = this.LJLJLJ;
            final boolean z2 = this.LJLJLLL;
            final long j = this.LJLL;
            final boolean z3 = this.LJLLI;
            InterfaceC64672gJ<XGX<C199087rc>> interfaceC64672gJ = new InterfaceC64672gJ<XGX<C199087rc>>() { // from class: X.7rQ
                @Override // X.InterfaceC64672gJ
                public final Object emit(XGX<C199087rc> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel;
                    PoiReviewsApi.PoiReviewModel LIZ2;
                    PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel2;
                    long j2;
                    XGX<C199087rc> xgx2 = xgx;
                    PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel = null;
                    PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel2 = null;
                    PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel3 = null;
                    if (xgx2 instanceof XGW) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("dislike - motaSuccess: ");
                        LIZ3.append(xgx2);
                        C199127rg.LIZ(X1D.LIZIZ(LIZ3));
                        BaseResponse baseResponse = ((C199087rc) ((XGW) xgx2).LJ).LIZ;
                        if (baseResponse != null && baseResponse.status_code == 0) {
                            PoiReviewListViewModel poiReviewListViewModel2 = poiReviewListViewModel;
                            int i3 = i2;
                            boolean z4 = z3;
                            if (z4) {
                                if (poiReviewModel.userStatus != null) {
                                    poiReviewUserStatusModel2 = new PoiReviewsApi.PoiReviewUserStatusModel(Boolean.FALSE, Boolean.valueOf(z4));
                                } else {
                                    poiReviewUserStatusModel2 = null;
                                }
                                if (poiReviewModel.statistics != null) {
                                    if (z) {
                                        j2 = Math.max(0L, j - 1);
                                    } else {
                                        j2 = j;
                                    }
                                    poiReviewStatisticsModel2 = new PoiReviewsApi.PoiReviewStatisticsModel(new Long(j2));
                                }
                                LIZ2 = PoiReviewsApi.PoiReviewModel.LIZ(poiReviewModel, poiReviewStatisticsModel2, poiReviewUserStatusModel2, false, false, null, 3999);
                            } else {
                                PoiReviewsApi.PoiReviewModel poiReviewModel2 = poiReviewModel;
                                PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel4 = poiReviewModel2.userStatus;
                                if (poiReviewUserStatusModel4 != null) {
                                    poiReviewUserStatusModel3 = new PoiReviewsApi.PoiReviewUserStatusModel(poiReviewUserStatusModel4.liked, Boolean.valueOf(z4));
                                }
                                LIZ2 = PoiReviewsApi.PoiReviewModel.LIZ(poiReviewModel2, null, poiReviewUserStatusModel3, false, false, null, 4031);
                            }
                            poiReviewListViewModel2.listSetItemAt(i3, (int) LIZ2);
                        }
                    } else if (xgx2 instanceof XGT) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("dislike - motaError: ");
                        LIZ4.append(xgx2);
                        C199127rg.LIZ(X1D.LIZIZ(LIZ4));
                        PoiReviewListViewModel poiReviewListViewModel3 = poiReviewListViewModel;
                        int i4 = i2;
                        if (poiReviewModel.userStatus != null) {
                            poiReviewUserStatusModel = new PoiReviewsApi.PoiReviewUserStatusModel(Boolean.valueOf(z), Boolean.valueOf(z2));
                        } else {
                            poiReviewUserStatusModel = null;
                        }
                        if (poiReviewModel.statistics != null) {
                            poiReviewStatisticsModel = new PoiReviewsApi.PoiReviewStatisticsModel(new Long(j));
                        }
                        poiReviewListViewModel3.listSetItemAt(i4, (int) PoiReviewsApi.PoiReviewModel.LIZ(poiReviewModel, poiReviewStatisticsModel, poiReviewUserStatusModel, false, false, null, 3999));
                    }
                    return C76800UCe.LIZ;
                }
            };
            this.LJLIL = 1;
            if (LIZ.collect(interfaceC64672gJ, this) == enumC58928NAu) {
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
