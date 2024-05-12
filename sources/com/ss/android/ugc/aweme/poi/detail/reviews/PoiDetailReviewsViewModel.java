package com.ss.android.ugc.aweme.poi.detail.reviews;

import X.C198807rA;
import X.C198907rK;
import X.C198917rL;
import X.C198927rM;
import X.C198977rR;
import X.C199057rZ;
import X.C72808Sho;
import X.C73969T1h;
import X.C78685UuP;
import X.EnumC199017rV;
import X.EnumC199037rX;
import X.HG3;
import X.InterfaceC199107re;
import X.InterfaceC64592gB;
import X.RBX;
import X.T16;
import X.XKX;
import Y.AfS0S1211000_3;
import Y.AfS2S0100100_3;
import Y.AfS55S0100000_3;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.AqS54S0201000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiDetailReviewsViewModel extends AssemViewModel<C198807rA> implements InterfaceC199107re {
    public C72808Sho<PoiReviewsApi.PoiReviewModel> LJLIL;
    public final String LJLILLLLZI = TranslationServiceImpl.LJJIJ().LJJIIZI();
    public final HashMap<String, String> LJLJI = new HashMap<>();

    @Override // X.InterfaceC199107re
    public final String LJJLIIIJJI() {
        return "poi_detail";
    }

    @Override // X.InterfaceC199107re
    public final boolean ly() {
        return false;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C198807rA defaultState() {
        return new C198807rA(null, null, Boolean.FALSE, null, null);
    }

    @Override // X.InterfaceC199107re
    public final String kP() {
        return getState().LJLJJI;
    }

    @Override // X.InterfaceC199107re
    public final void UN(PoiReviewsApi.PoiReviewModel poiReviewModel) {
        String str;
        String str2;
        String str3;
        String str4;
        PoiReviewsApi.PoiReviewUserModel poiReviewUserModel = poiReviewModel.author;
        if (poiReviewUserModel != null) {
            str = poiReviewUserModel.userId;
        } else {
            str = null;
        }
        if (!o.LJ(str, ((RBX) HG3.LJIILL()).getCurUserId()) || (str2 = poiReviewModel.poiId) == null || (str3 = poiReviewModel.reviewId) == null) {
            return;
        }
        PoiReviewsApi.PoiReviewModel poiReviewModel2 = C198977rR.LIZIZ;
        if (poiReviewModel2 != null) {
            str4 = poiReviewModel2.reviewId;
        } else {
            str4 = null;
        }
        if (o.LJ(str3, str4)) {
            C198977rR.LIZ = null;
            C198977rR.LIZIZ = null;
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C198907rK(str2, str3, poiReviewModel, this, null), 3);
    }

    @Override // X.InterfaceC199107re
    public final void dA(PoiReviewsApi.PoiReviewModel item) {
        o.LJIIIZ(item, "item");
        C72808Sho<PoiReviewsApi.PoiReviewModel> c72808Sho = this.LJLIL;
        if (c72808Sho != null) {
            Integer valueOf = Integer.valueOf(c72808Sho.LJIIIZ(item));
            if (valueOf.intValue() != -1) {
                hv0(valueOf.intValue(), PoiReviewsApi.PoiReviewModel.LIZ(item, null, null, !item.LJLIL, false, null, 3583));
            }
        }
    }

    public final void gv0(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        PoiReviewsApi.LIZ.getClass();
        C199057rZ.LIZ().getPoiReviewsList(str, EnumC199037rX.POI_DETAIL_PAGE.getValue(), 20, 0L).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS2S0100100_3(currentTimeMillis, this, 1), new AfS55S0100000_3(this, 34));
    }

    @Override // X.InterfaceC199107re
    public final void Kl(PoiReviewsApi.PoiReviewModel review, boolean z) {
        String str;
        C72808Sho<PoiReviewsApi.PoiReviewModel> c72808Sho;
        int value;
        boolean z2;
        long j;
        boolean z3;
        Long l;
        o.LJIIIZ(review, "review");
        String str2 = review.poiId;
        if (str2 != null && (str = review.reviewId) != null && (c72808Sho = this.LJLIL) != null) {
            Integer valueOf = Integer.valueOf(c72808Sho.LJIIIZ(review));
            if (valueOf.intValue() != -1 && 1 != 0) {
                int intValue = valueOf.intValue();
                if (z) {
                    value = EnumC199017rV.CANCEL_LIKE.getValue();
                } else {
                    value = EnumC199017rV.LIKE.getValue();
                }
                boolean z4 = !z;
                PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel = review.userStatus;
                if (poiReviewUserStatusModel != null) {
                    z2 = o.LJ(poiReviewUserStatusModel.liked, Boolean.TRUE);
                } else {
                    z2 = false;
                }
                PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel = review.statistics;
                if (poiReviewStatisticsModel != null && (l = poiReviewStatisticsModel.likeCount) != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel2 = review.userStatus;
                if (poiReviewUserStatusModel2 != null) {
                    z3 = o.LJ(poiReviewUserStatusModel2.disliked, Boolean.TRUE);
                } else {
                    z3 = false;
                }
                XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C198927rM(value, intValue, j, this, review, str2, str, null, z2, z3, z4), 3);
            }
        }
    }

    @Override // X.InterfaceC199107re
    public final void M00(PoiReviewsApi.PoiReviewModel review, boolean z) {
        String str;
        C72808Sho<PoiReviewsApi.PoiReviewModel> c72808Sho;
        int value;
        boolean z2;
        long j;
        boolean z3;
        Long l;
        o.LJIIIZ(review, "review");
        String str2 = review.poiId;
        if (str2 != null && (str = review.reviewId) != null && (c72808Sho = this.LJLIL) != null) {
            Integer valueOf = Integer.valueOf(c72808Sho.LJIIIZ(review));
            if (valueOf.intValue() != -1 && 1 != 0) {
                int intValue = valueOf.intValue();
                if (z) {
                    value = EnumC199017rV.CANCEL_DISLIKE.getValue();
                } else {
                    value = EnumC199017rV.DISLIKE.getValue();
                }
                PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel = review.userStatus;
                if (poiReviewUserStatusModel != null) {
                    z2 = o.LJ(poiReviewUserStatusModel.liked, Boolean.TRUE);
                } else {
                    z2 = false;
                }
                PoiReviewsApi.PoiReviewStatisticsModel poiReviewStatisticsModel = review.statistics;
                if (poiReviewStatisticsModel != null && (l = poiReviewStatisticsModel.likeCount) != null) {
                    j = l.longValue();
                } else {
                    j = 0;
                }
                boolean z4 = !z;
                PoiReviewsApi.PoiReviewUserStatusModel poiReviewUserStatusModel2 = review.userStatus;
                if (poiReviewUserStatusModel2 != null) {
                    z3 = o.LJ(poiReviewUserStatusModel2.disliked, Boolean.TRUE);
                } else {
                    z3 = false;
                }
                XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C198917rL(value, intValue, j, this, review, str2, str, null, z2, z3, z4), 3);
            }
        }
    }

    @Override // X.InterfaceC199107re
    public final void NQ(PoiReviewsApi.PoiReviewModel item, boolean z) {
        C72808Sho<PoiReviewsApi.PoiReviewModel> c72808Sho;
        String str;
        String str2;
        o.LJIIIZ(item, "item");
        if (z != item.LJLILLLLZI && (c72808Sho = this.LJLIL) != null) {
            Integer valueOf = Integer.valueOf(c72808Sho.LJIIIZ(item));
            if (valueOf.intValue() != -1) {
                int intValue = valueOf.intValue();
                PoiReviewsApi.PoiReviewContentModel poiReviewContentModel = item.content;
                if (poiReviewContentModel == null || (str = poiReviewContentModel.text) == null) {
                    return;
                }
                if (z && ((str2 = item.LJLJI) == null || str2.length() == 0)) {
                    if (C78685UuP.LJJJZ(this.LJLJI.get(str))) {
                        hv0(intValue, PoiReviewsApi.PoiReviewModel.LIZ(item, null, null, false, z, this.LJLJI.get(str), 1023));
                        return;
                    } else {
                        PoiReviewsApi.LIZ.getClass();
                        C199057rZ.LIZ().getTranslation(this.LJLILLLLZI, str, 5).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS0S1211000_3(this, str, intValue, item, z, 0), new InterfaceC64592gB() { // from class: X.7ra
                            @Override // X.InterfaceC64592gB
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            }
                        });
                        return;
                    }
                }
                hv0(intValue, PoiReviewsApi.PoiReviewModel.LIZ(item, null, null, false, z, null, 3071));
            }
        }
    }

    public final void hv0(int i, PoiReviewsApi.PoiReviewModel poiReviewModel) {
        withState(new AqS54S0201000_3(this, i, poiReviewModel, 6));
    }
}
