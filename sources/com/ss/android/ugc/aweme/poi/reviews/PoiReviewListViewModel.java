package com.ss.android.ugc.aweme.poi.reviews;

import X.A2G;
import X.C198897rJ;
import X.C198937rN;
import X.C198947rO;
import X.C198977rR;
import X.C199057rZ;
import X.C199127rg;
import X.C33Q;
import X.C72808Sho;
import X.C73969T1h;
import X.C78540Us4;
import X.C78685UuP;
import X.C7VC;
import X.C8HZ;
import X.EnumC199017rV;
import X.EnumC199037rX;
import X.EnumC199047rY;
import X.HG3;
import X.InterfaceC199107re;
import X.InterfaceC64592gB;
import X.InterfaceC67352kd;
import X.RBX;
import X.T16;
import X.X1D;
import X.XKX;
import Y.AfS0S1211000_3;
import Y.AfS55S0100000_3;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl;
import java.util.HashMap;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PoiReviewListViewModel extends AssemListViewModel<C7VC, PoiReviewsApi.PoiReviewModel, Long> implements InterfaceC199107re {
    public static final HashMap<String, Boolean> LJLLJ = new HashMap<>();
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public PoiReviewsApi.PoiReviewSummaryModel LJLJJI;
    public String LJLJJL;
    public long LJLJL;
    public long LJLJLJ;
    public boolean LJLL;
    public boolean LJLJJLL = true;
    public EnumC199037rX LJLJLLL = EnumC199037rX.POI_REVIEW_LANDING;
    public final String LJLLI = TranslationServiceImpl.LJJIJ().LJJIIZI();
    public final HashMap<String, String> LJLLILLLL = new HashMap<>();

    @Override // X.InterfaceC199107re
    public final String LJJLIIIJJI() {
        return "poi_reviews";
    }

    @Override // X.InterfaceC199107re
    public final boolean ly() {
        return true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C7VC(0);
    }

    public final boolean hv0() {
        if (this.LJLJL == 0 && this.LJLJLJ == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC199107re
    public final String kP() {
        return ((C7VC) getState()).LJLILLLLZI;
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
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C198897rJ(str2, str3, poiReviewModel, this, null), 3);
    }

    @Override // X.InterfaceC199107re
    public final void dA(PoiReviewsApi.PoiReviewModel item) {
        o.LJIIIZ(item, "item");
        C72808Sho<ITEM> c72808Sho = this.state;
        if (c72808Sho != 0) {
            Integer valueOf = Integer.valueOf(c72808Sho.LJIIIZ(item));
            if (valueOf.intValue() != -1) {
                listSetItemAt(valueOf.intValue(), (int) PoiReviewsApi.PoiReviewModel.LIZ(item, null, null, !item.LJLIL, false, null, 3583));
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<PoiReviewsApi.PoiReviewModel> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS134S0200000_3(this, (PoiReviewListViewModel) newListState, (C8HZ<PoiReviewsApi.PoiReviewModel>) 135));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        this.LJLJLJ = 0L;
        this.LJLJL = 0L;
        this.LJLJLLL = EnumC199037rX.POI_REVIEW_LANDING;
        return iv0(0L, interfaceC67352kd);
    }

    public static void gv0(PoiReviewListViewModel poiReviewListViewModel, String poiId) {
        int value = EnumC199047rY.REVIEW_LANDING_PAGE.getValue();
        poiReviewListViewModel.getClass();
        o.LJIIIZ(poiId, "poiId");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchEligible - poiId: ");
        LIZ.append(poiId);
        C199127rg.LIZ(X1D.LIZIZ(LIZ));
        PoiReviewsApi.LIZ.getClass();
        C78540Us4.LJJIIZ(C199057rZ.LIZ().isReviewEligible(poiId, value)).LJJJLIIL(new AfS55S0100000_3(poiReviewListViewModel, 67), new InterfaceC64592gB() { // from class: X.7rW
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("fetchEligible - ");
                LIZ2.append(obj);
                C199127rg.LIZ(X1D.LIZIZ(LIZ2));
            }
        });
    }

    @Override // X.InterfaceC199107re
    public final void Kl(PoiReviewsApi.PoiReviewModel review, boolean z) {
        String str;
        C72808Sho<ITEM> c72808Sho;
        int value;
        boolean z2;
        long j;
        boolean z3;
        Long l;
        o.LJIIIZ(review, "review");
        String str2 = review.poiId;
        if (str2 != null && (str = review.reviewId) != null && (c72808Sho = this.state) != 0) {
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
                XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C198947rO(value, intValue, j, this, review, str2, str, null, z2, z3, z4), 3);
            }
        }
    }

    @Override // X.InterfaceC199107re
    public final void M00(PoiReviewsApi.PoiReviewModel review, boolean z) {
        String str;
        C72808Sho<ITEM> c72808Sho;
        int value;
        boolean z2;
        long j;
        boolean z3;
        Long l;
        o.LJIIIZ(review, "review");
        String str2 = review.poiId;
        if (str2 != null && (str = review.reviewId) != null && (c72808Sho = this.state) != 0) {
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
                XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C198937rN(value, intValue, j, this, review, str2, str, null, z2, z3, z4), 3);
            }
        }
    }

    @Override // X.InterfaceC199107re
    public final void NQ(PoiReviewsApi.PoiReviewModel item, boolean z) {
        C72808Sho<ITEM> c72808Sho;
        String str;
        String str2;
        o.LJIIIZ(item, "item");
        if (z != item.LJLILLLLZI && (c72808Sho = this.state) != 0) {
            Integer valueOf = Integer.valueOf(c72808Sho.LJIIIZ(item));
            if (valueOf.intValue() != -1) {
                int intValue = valueOf.intValue();
                PoiReviewsApi.PoiReviewContentModel poiReviewContentModel = item.content;
                if (poiReviewContentModel == null || (str = poiReviewContentModel.text) == null) {
                    return;
                }
                if (z && ((str2 = item.LJLJI) == null || str2.length() == 0)) {
                    if (C78685UuP.LJJJZ(this.LJLLILLLL.get(str))) {
                        listSetItemAt(intValue, (int) PoiReviewsApi.PoiReviewModel.LIZ(item, null, null, false, z, this.LJLLILLLL.get(str), 1023));
                        return;
                    } else {
                        PoiReviewsApi.LIZ.getClass();
                        C199057rZ.LIZ().getTranslation(this.LJLLI, str, 5).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS0S1211000_3(this, str, intValue, item, z, 1), new InterfaceC64592gB() { // from class: X.7rb
                            @Override // X.InterfaceC64592gB
                            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                            }
                        });
                        return;
                    }
                }
                listSetItemAt(intValue, (int) PoiReviewsApi.PoiReviewModel.LIZ(item, null, null, false, z, null, 3071));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9 A[Catch: Exception -> 0x01de, TRY_LEAVE, TryCatch #1 {Exception -> 0x01de, blocks: (B:11:0x0099, B:12:0x009c, B:14:0x00a5, B:16:0x00b2, B:18:0x00b8, B:20:0x00c5, B:22:0x00c9, B:26:0x00d0, B:29:0x00d5, B:33:0x00dc, B:37:0x00e4, B:39:0x00e8, B:41:0x00ec, B:42:0x00f1, B:45:0x00f6, B:47:0x0100, B:49:0x0104, B:50:0x0108, B:52:0x010e, B:55:0x0116, B:60:0x011a, B:62:0x0120, B:64:0x012d, B:66:0x0131, B:68:0x0135, B:69:0x013a, B:71:0x0140, B:80:0x0154, B:81:0x0157, B:83:0x015d, B:84:0x0161, B:86:0x0167, B:87:0x016b, B:89:0x0179, B:92:0x018a, B:94:0x0195, B:96:0x019d, B:98:0x01a7, B:100:0x01ba, B:102:0x01c9, B:104:0x01cf, B:105:0x01d4, B:110:0x00c1, B:111:0x00c3, B:115:0x00ae, B:116:0x00b0), top: B:10:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e A[Catch: Exception -> 0x01de, TryCatch #1 {Exception -> 0x01de, blocks: (B:11:0x0099, B:12:0x009c, B:14:0x00a5, B:16:0x00b2, B:18:0x00b8, B:20:0x00c5, B:22:0x00c9, B:26:0x00d0, B:29:0x00d5, B:33:0x00dc, B:37:0x00e4, B:39:0x00e8, B:41:0x00ec, B:42:0x00f1, B:45:0x00f6, B:47:0x0100, B:49:0x0104, B:50:0x0108, B:52:0x010e, B:55:0x0116, B:60:0x011a, B:62:0x0120, B:64:0x012d, B:66:0x0131, B:68:0x0135, B:69:0x013a, B:71:0x0140, B:80:0x0154, B:81:0x0157, B:83:0x015d, B:84:0x0161, B:86:0x0167, B:87:0x016b, B:89:0x0179, B:92:0x018a, B:94:0x0195, B:96:0x019d, B:98:0x01a7, B:100:0x01ba, B:102:0x01c9, B:104:0x01cf, B:105:0x01d4, B:110:0x00c1, B:111:0x00c3, B:115:0x00ae, B:116:0x00b0), top: B:10:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120 A[Catch: Exception -> 0x01de, TryCatch #1 {Exception -> 0x01de, blocks: (B:11:0x0099, B:12:0x009c, B:14:0x00a5, B:16:0x00b2, B:18:0x00b8, B:20:0x00c5, B:22:0x00c9, B:26:0x00d0, B:29:0x00d5, B:33:0x00dc, B:37:0x00e4, B:39:0x00e8, B:41:0x00ec, B:42:0x00f1, B:45:0x00f6, B:47:0x0100, B:49:0x0104, B:50:0x0108, B:52:0x010e, B:55:0x0116, B:60:0x011a, B:62:0x0120, B:64:0x012d, B:66:0x0131, B:68:0x0135, B:69:0x013a, B:71:0x0140, B:80:0x0154, B:81:0x0157, B:83:0x015d, B:84:0x0161, B:86:0x0167, B:87:0x016b, B:89:0x0179, B:92:0x018a, B:94:0x0195, B:96:0x019d, B:98:0x01a7, B:100:0x01ba, B:102:0x01c9, B:104:0x01cf, B:105:0x01d4, B:110:0x00c1, B:111:0x00c3, B:115:0x00ae, B:116:0x00b0), top: B:10:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015d A[Catch: Exception -> 0x01de, TryCatch #1 {Exception -> 0x01de, blocks: (B:11:0x0099, B:12:0x009c, B:14:0x00a5, B:16:0x00b2, B:18:0x00b8, B:20:0x00c5, B:22:0x00c9, B:26:0x00d0, B:29:0x00d5, B:33:0x00dc, B:37:0x00e4, B:39:0x00e8, B:41:0x00ec, B:42:0x00f1, B:45:0x00f6, B:47:0x0100, B:49:0x0104, B:50:0x0108, B:52:0x010e, B:55:0x0116, B:60:0x011a, B:62:0x0120, B:64:0x012d, B:66:0x0131, B:68:0x0135, B:69:0x013a, B:71:0x0140, B:80:0x0154, B:81:0x0157, B:83:0x015d, B:84:0x0161, B:86:0x0167, B:87:0x016b, B:89:0x0179, B:92:0x018a, B:94:0x0195, B:96:0x019d, B:98:0x01a7, B:100:0x01ba, B:102:0x01c9, B:104:0x01cf, B:105:0x01d4, B:110:0x00c1, B:111:0x00c3, B:115:0x00ae, B:116:0x00b0), top: B:10:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167 A[Catch: Exception -> 0x01de, TryCatch #1 {Exception -> 0x01de, blocks: (B:11:0x0099, B:12:0x009c, B:14:0x00a5, B:16:0x00b2, B:18:0x00b8, B:20:0x00c5, B:22:0x00c9, B:26:0x00d0, B:29:0x00d5, B:33:0x00dc, B:37:0x00e4, B:39:0x00e8, B:41:0x00ec, B:42:0x00f1, B:45:0x00f6, B:47:0x0100, B:49:0x0104, B:50:0x0108, B:52:0x010e, B:55:0x0116, B:60:0x011a, B:62:0x0120, B:64:0x012d, B:66:0x0131, B:68:0x0135, B:69:0x013a, B:71:0x0140, B:80:0x0154, B:81:0x0157, B:83:0x015d, B:84:0x0161, B:86:0x0167, B:87:0x016b, B:89:0x0179, B:92:0x018a, B:94:0x0195, B:96:0x019d, B:98:0x01a7, B:100:0x01ba, B:102:0x01c9, B:104:0x01cf, B:105:0x01d4, B:110:0x00c1, B:111:0x00c3, B:115:0x00ae, B:116:0x00b0), top: B:10:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179 A[Catch: Exception -> 0x01de, TryCatch #1 {Exception -> 0x01de, blocks: (B:11:0x0099, B:12:0x009c, B:14:0x00a5, B:16:0x00b2, B:18:0x00b8, B:20:0x00c5, B:22:0x00c9, B:26:0x00d0, B:29:0x00d5, B:33:0x00dc, B:37:0x00e4, B:39:0x00e8, B:41:0x00ec, B:42:0x00f1, B:45:0x00f6, B:47:0x0100, B:49:0x0104, B:50:0x0108, B:52:0x010e, B:55:0x0116, B:60:0x011a, B:62:0x0120, B:64:0x012d, B:66:0x0131, B:68:0x0135, B:69:0x013a, B:71:0x0140, B:80:0x0154, B:81:0x0157, B:83:0x015d, B:84:0x0161, B:86:0x0167, B:87:0x016b, B:89:0x0179, B:92:0x018a, B:94:0x0195, B:96:0x019d, B:98:0x01a7, B:100:0x01ba, B:102:0x01c9, B:104:0x01cf, B:105:0x01d4, B:110:0x00c1, B:111:0x00c3, B:115:0x00ae, B:116:0x00b0), top: B:10:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018a A[Catch: Exception -> 0x01de, TryCatch #1 {Exception -> 0x01de, blocks: (B:11:0x0099, B:12:0x009c, B:14:0x00a5, B:16:0x00b2, B:18:0x00b8, B:20:0x00c5, B:22:0x00c9, B:26:0x00d0, B:29:0x00d5, B:33:0x00dc, B:37:0x00e4, B:39:0x00e8, B:41:0x00ec, B:42:0x00f1, B:45:0x00f6, B:47:0x0100, B:49:0x0104, B:50:0x0108, B:52:0x010e, B:55:0x0116, B:60:0x011a, B:62:0x0120, B:64:0x012d, B:66:0x0131, B:68:0x0135, B:69:0x013a, B:71:0x0140, B:80:0x0154, B:81:0x0157, B:83:0x015d, B:84:0x0161, B:86:0x0167, B:87:0x016b, B:89:0x0179, B:92:0x018a, B:94:0x0195, B:96:0x019d, B:98:0x01a7, B:100:0x01ba, B:102:0x01c9, B:104:0x01cf, B:105:0x01d4, B:110:0x00c1, B:111:0x00c3, B:115:0x00ae, B:116:0x00b0), top: B:10:0x0099 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(long r18, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r20) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.PoiReviewListViewModel.iv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return iv0(l.longValue(), interfaceC67352kd);
    }
}
