package com.ss.android.ugc.aweme.paidcontent.viewmodel;

import X.A2G;
import X.A3U;
import X.A3V;
import X.A40;
import X.A4E;
import X.C211568Sa;
import X.C221108m2;
import X.C25594A2s;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C8HZ;
import X.EnumC25627A3z;
import X.HG3;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.M89;
import X.RBX;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.model.PriceInfo;
import com.ss.android.ugc.aweme.model.PurchaseParams;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IPaidContentCollectionPlayProgressService;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentDetailVideoListViewModel extends BaseDetailShareVM<A3V, A3U, Integer> {
    public static final /* synthetic */ int LJLJJL = 0;
    public PaidContentCollectionDetailDescriptionAssem LJLILLLLZI;
    public List<A3U> LJLIL = new ArrayList();
    public final C55749LuL LJLJI = new C55749LuL(C47704Ins.LIZLLL(this, C25594A2s.class, "paid_content_collection_detail_hierarchy_data_key"), true);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(A4E.LJLIL);

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new A3V(0);
    }

    public final C25594A2s gv0() {
        return (C25594A2s) this.LJLJI.getValue();
    }

    public final IPaidContentCollectionPlayProgressService hv0() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-playProgressService>(...)");
        return (IPaidContentCollectionPlayProgressService) value;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
        String str;
        o.LJIIIZ(aid, "aid");
        List<ITEM> listGetAll = listGetAll();
        int i = -1;
        if (listGetAll != 0) {
            Iterator it = listGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Aweme aweme = ((A3U) it.next()).LJLIL.getAweme();
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (o.LJ(str, aid)) {
                    i = i2;
                    if (i2 >= 0) {
                        listRemoveItemAt(i2);
                    }
                } else {
                    i2++;
                }
            }
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme getAwemeFromItem(A3U a3u) {
        Aweme aweme;
        PaidContentInfo paidContentInfo;
        A3U item = a3u;
        o.LJIIIZ(item, "item");
        if ((item.LJLILLLLZI || item.LJLJI || item.LJLIL.isIntro() || (C211568Sa.LIZ() && (aweme = item.LJLIL.getAweme()) != null && (paidContentInfo = aweme.mPaidContentInfo) != null && paidContentInfo.getShouldShowPreview())) && !item.LJLIL.isReported()) {
            return item.LJLIL.getAweme();
        }
        return null;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<A3U> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS170S0100000_4(newListState, (C8HZ<InterfaceC57784Mm4>) 516));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        setState(A40.LJLIL);
        return jv0(0, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object jv0(int r21, X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r22) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailVideoListViewModel.jv0(int, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        int intValue = ((Number) obj).intValue();
        setState(A40.LJLIL);
        return jv0(intValue, interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Integer getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return 0;
    }

    public final void iv0(PaidVideoItem item, Context context, CollectionDetailModel collectionDetailModel, Float f) {
        String str;
        String str2;
        String str3;
        Serializable serializable;
        String str4;
        String str5;
        Long l;
        PaidContentInfo paidContentInfo;
        float paidContentResumeTimestamp;
        PaidContentInfo paidContentInfo2;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(collectionDetailModel, "collectionDetailModel");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://aweme/detail/");
        Bundle bundle = new Bundle();
        Aweme aweme = item.getAweme();
        Long l2 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        bundle.putString("id", str);
        bundle.putString("enter_from", gv0().LJLILLLLZI);
        bundle.putString("refer", "paid_series_detail_page");
        bundle.putString("video_from", "from_paid_content_detail_video_list_entrance");
        SettingsManager.LIZLLL().getClass();
        boolean z = false;
        bundle.putBoolean("block_screen_recording", SettingsManager.LIZ("paid_content_prevent_screen_recording", false));
        HashMap hashMap = new HashMap();
        hashMap.put("paid_content_session_id", gv0().LJLJJLL);
        bundle.putSerializable("feed_param_extra", hashMap);
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        User collectionCreator = collectionDetailModel.getCollectionCreator();
        if (collectionCreator != null) {
            str2 = collectionCreator.getUid();
        } else {
            str2 = null;
        }
        boolean equals = curUserId.equals(str2);
        Aweme aweme2 = item.getAweme();
        if ((aweme2 != null && (paidContentInfo2 = aweme2.mPaidContentInfo) != null && paidContentInfo2.getShouldShowPreview()) || (!equals && item.isIntro() && !collectionDetailModel.getHasPurchasedCollection())) {
            z = true;
        }
        bundle.putBoolean("should_show_preview", z);
        User collectionCreator2 = collectionDetailModel.getCollectionCreator();
        if (collectionCreator2 != null) {
            str3 = collectionCreator2.getUid();
        } else {
            str3 = null;
        }
        bundle.putString("creator_uid", str3);
        bundle.putString("video_id", String.valueOf(item.getPaidVideoId()));
        Intent intent = gv0().LJLJJI;
        if (intent != null) {
            serializable = intent.getSerializableExtra("anchor_event_map");
        } else {
            serializable = null;
        }
        bundle.putBoolean("is_from_anchor", serializable instanceof HashMap);
        long collectionId = collectionDetailModel.getCollectionId();
        Long voucherId = collectionDetailModel.getVoucherId();
        PriceInfo priceInfo = collectionDetailModel.getPriceInfo();
        if (priceInfo != null) {
            str4 = priceInfo.getIapId();
        } else {
            str4 = null;
        }
        PriceInfo discountedPriceInfo = collectionDetailModel.getDiscountedPriceInfo();
        if (discountedPriceInfo != null) {
            str5 = discountedPriceInfo.getIapId();
        } else {
            str5 = null;
        }
        PriceInfo priceInfo2 = collectionDetailModel.getPriceInfo();
        if (priceInfo2 != null) {
            l = Long.valueOf(priceInfo2.getDiamondId());
        } else {
            l = null;
        }
        PriceInfo discountedPriceInfo2 = collectionDetailModel.getDiscountedPriceInfo();
        if (discountedPriceInfo2 != null) {
            l2 = Long.valueOf(discountedPriceInfo2.getDiamondId());
        }
        bundle.putParcelable("purchase_params", new PurchaseParams(collectionId, voucherId, str4, str5, l, l2, EnumC25627A3z.SERIES_LIST));
        bundle.putBoolean("is_intro_video", item.isIntro());
        Aweme aweme3 = item.getAweme();
        if (aweme3 != null && (paidContentInfo = aweme3.mPaidContentInfo) != null && item.getVideoDuration() != 0) {
            if (f != null) {
                paidContentResumeTimestamp = f.floatValue();
            } else {
                paidContentResumeTimestamp = ((float) (paidContentInfo.getPaidContentResumeTimestamp() * 1000)) / ((float) item.getVideoDuration());
            }
            bundle.putFloat("extra_seek_progress", paidContentResumeTimestamp);
        }
        buildRoute.withParam(bundle);
        buildRoute.open(1002);
    }
}
