package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel$like$1", f = "PoiReviewListViewModel.kt", l = {578}, m = "invokeSuspend")
/* renamed from: X.7rO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198947rO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ PoiReviewsApi.PoiReviewModel LJLJJL;
    public final /* synthetic */ PoiReviewListViewModel LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ long LJLJLJ;
    public final /* synthetic */ boolean LJLJLLL;
    public final /* synthetic */ boolean LJLL;
    public final /* synthetic */ boolean LJLLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C198947rO(int i, int i2, long j, PoiReviewListViewModel poiReviewListViewModel, PoiReviewsApi.PoiReviewModel poiReviewModel, String str, String str2, InterfaceC67352kd interfaceC67352kd, boolean z, boolean z2, boolean z3) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = i;
        this.LJLJJL = poiReviewModel;
        this.LJLJJLL = poiReviewListViewModel;
        this.LJLJL = i2;
        this.LJLJLJ = j;
        this.LJLJLLL = z;
        this.LJLL = z2;
        this.LJLLI = z3;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        String str = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        int i = this.LJLJJI;
        PoiReviewsApi.PoiReviewModel poiReviewModel = this.LJLJJL;
        return new C198947rO(i, this.LJLJL, this.LJLJLJ, this.LJLJJLL, poiReviewModel, str, str2, interfaceC67352kd, this.LJLJLLL, this.LJLL, this.LJLLI);
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
            final long j = this.LJLJLJ;
            final boolean z = this.LJLJLLL;
            final boolean z2 = this.LJLL;
            final boolean z3 = this.LJLLI;
            InterfaceC64672gJ<XGX<C199087rc>> interfaceC64672gJ = new InterfaceC64672gJ<XGX<C199087rc>>() { // from class: X.7rS
                @Override // X.InterfaceC64672gJ
                public final Object emit(XGX<C199087rc> xgx, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
                    PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel;
                    PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel2;
                    PoiReviewsApi.PoiReviewModel LIZ2;
                    PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel3;
                    XGX<C199087rc> xgx2 = xgx;
                    PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel = null;
                    if (xgx2 instanceof XGW) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("like - motaSuccess: ");
                        LIZ3.append(xgx2);
                        C199127rg.LIZ(X1D.LIZIZ(LIZ3));
                        BaseResponse baseResponse = ((C199087rc) ((XGW) xgx2).LJ).LIZ;
                        if (baseResponse != null && baseResponse.status_code == 0) {
                            PoiReviewListViewModel poiReviewListViewModel2 = poiReviewListViewModel;
                            int i3 = i2;
                            if (z3) {
                                PoiReviewsApi.PoiReviewModel poiReviewModel2 = poiReviewModel;
                                if (poiReviewModel2.statistics != null) {
                                    poiReviewStatisticsModel3 = new PoiReviewsApi.PoiReviewStatisticsModel(new Long(j + 1));
                                } else {
                                    poiReviewStatisticsModel3 = null;
                                }
                                if (poiReviewModel.userStatus != null) {
                                    poiReviewUserStatusModel = new PoiReviewsApi.PoiReviewUserStatusModel(Boolean.valueOf(z3), Boolean.FALSE);
                                }
                                LIZ2 = PoiReviewsApi.PoiReviewModel.LIZ(poiReviewModel2, poiReviewStatisticsModel3, poiReviewUserStatusModel, false, false, null, 3999);
                            } else {
                                PoiReviewsApi.PoiReviewModel poiReviewModel3 = poiReviewModel;
                                if (poiReviewModel3.statistics != null) {
                                    poiReviewStatisticsModel2 = new PoiReviewsApi.PoiReviewStatisticsModel(new Long(Math.max(0L, j - 1)));
                                } else {
                                    poiReviewStatisticsModel2 = null;
                                }
                                if (poiReviewModel.userStatus != null) {
                                    poiReviewUserStatusModel = new PoiReviewsApi.PoiReviewUserStatusModel(Boolean.valueOf(z3), Boolean.FALSE);
                                }
                                LIZ2 = PoiReviewsApi.PoiReviewModel.LIZ(poiReviewModel3, poiReviewStatisticsModel2, poiReviewUserStatusModel, false, false, null, 3999);
                            }
                            poiReviewListViewModel2.listSetItemAt(i3, (int) LIZ2);
                        }
                    } else if (xgx2 instanceof XGT) {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("like - motaError: ");
                        LIZ4.append(xgx2);
                        C199127rg.LIZ(X1D.LIZIZ(LIZ4));
                        PoiReviewListViewModel poiReviewListViewModel3 = poiReviewListViewModel;
                        int i4 = i2;
                        PoiReviewsApi.PoiReviewModel poiReviewModel4 = poiReviewModel;
                        if (poiReviewModel4.statistics != null) {
                            poiReviewStatisticsModel = new PoiReviewsApi.PoiReviewStatisticsModel(new Long(j));
                        } else {
                            poiReviewStatisticsModel = null;
                        }
                        if (poiReviewModel.userStatus != null) {
                            poiReviewUserStatusModel = new PoiReviewsApi.PoiReviewUserStatusModel(Boolean.valueOf(z), Boolean.valueOf(z2));
                        }
                        poiReviewListViewModel3.listSetItemAt(i4, (int) PoiReviewsApi.PoiReviewModel.LIZ(poiReviewModel4, poiReviewStatisticsModel, poiReviewUserStatusModel, false, false, null, 3999));
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
