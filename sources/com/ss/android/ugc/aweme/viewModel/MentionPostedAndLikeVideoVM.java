package com.ss.android.ugc.aweme.viewmodel;

import X.A2G;
import X.C33Q;
import X.C8HZ;
import X.C9QW;
import X.InterfaceC67352kd;
import X.SRI;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MentionPostedAndLikeVideoVM extends BaseVideoListVM<SRI, C9QW, Long> {
    public int LJLJLLL;
    public int LJLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new SRI(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        withState(new AqS178S0100000_12(this, 437));
        super.manualListRefresh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<Aweme> kv0(List<? extends Aweme> list) {
        ITalentAdRevenueShareService LJIIJJI = TalentAdRevenueShareServiceImpl.LJIIJJI();
        if (list == 0 || LJIIJJI == null || LJIIJJI.LJIIIIZZ() == null || LJIIJJI.LJIIIIZZ().isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            if (aweme != null) {
                if (aweme.getAwemeRawAd() != null) {
                    List<String> LJIIIIZZ = LJIIJJI.LJIIIIZZ();
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    o.LJI(awemeRawAd);
                    if (!LJIIIIZZ.contains(awemeRawAd.getCreativeIdStr())) {
                    }
                }
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C9QW> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS178S0100000_12(newListState, (C8HZ<ImageItem>) 306));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        this.LJLJJLL = true;
        return lv0(this.LJLJLJ, 0L, (String) this.LJLJJL.getValue(), interfaceC67352kd);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return lv0(this.LJLJLJ, ((Number) obj).longValue(), (String) this.LJLJJL.getValue(), interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0153 A[Catch: Exception -> 0x01ee, TryCatch #0 {Exception -> 0x01ee, blocks: (B:14:0x0142, B:15:0x0145, B:16:0x014d, B:18:0x0153, B:19:0x015b, B:21:0x016b, B:23:0x0173, B:24:0x0177, B:26:0x017d, B:28:0x0192, B:30:0x0198, B:32:0x019c, B:34:0x01a0, B:35:0x01aa, B:37:0x01b2, B:40:0x01d6, B:42:0x01c0, B:43:0x01cb, B:53:0x0148, B:54:0x014b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x017d A[Catch: Exception -> 0x01ee, LOOP:0: B:24:0x0177->B:26:0x017d, LOOP_END, TryCatch #0 {Exception -> 0x01ee, blocks: (B:14:0x0142, B:15:0x0145, B:16:0x014d, B:18:0x0153, B:19:0x015b, B:21:0x016b, B:23:0x0173, B:24:0x0177, B:26:0x017d, B:28:0x0192, B:30:0x0198, B:32:0x019c, B:34:0x01a0, B:35:0x01aa, B:37:0x01b2, B:40:0x01d6, B:42:0x01c0, B:43:0x01cb, B:53:0x0148, B:54:0x014b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01b2 A[Catch: Exception -> 0x01ee, TryCatch #0 {Exception -> 0x01ee, blocks: (B:14:0x0142, B:15:0x0145, B:16:0x014d, B:18:0x0153, B:19:0x015b, B:21:0x016b, B:23:0x0173, B:24:0x0177, B:26:0x017d, B:28:0x0192, B:30:0x0198, B:32:0x019c, B:34:0x01a0, B:35:0x01aa, B:37:0x01b2, B:40:0x01d6, B:42:0x01c0, B:43:0x01cb, B:53:0x0148, B:54:0x014b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d6 A[Catch: Exception -> 0x01ee, TryCatch #0 {Exception -> 0x01ee, blocks: (B:14:0x0142, B:15:0x0145, B:16:0x014d, B:18:0x0153, B:19:0x015b, B:21:0x016b, B:23:0x0173, B:24:0x0177, B:26:0x017d, B:28:0x0192, B:30:0x0198, B:32:0x019c, B:34:0x01a0, B:35:0x01aa, B:37:0x01b2, B:40:0x01d6, B:42:0x01c0, B:43:0x01cb, B:53:0x0148, B:54:0x014b), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object lv0(int r19, long r20, java.lang.String r22, X.InterfaceC67352kd r23) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewmodel.MentionPostedAndLikeVideoVM.lv0(int, long, java.lang.String, X.2kd):java.lang.Object");
    }
}
