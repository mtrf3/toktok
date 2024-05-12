package com.ss.android.ugc.aweme.viewmodel;

import X.A2G;
import X.C33Q;
import X.C8HZ;
import X.C9QW;
import X.InterfaceC67352kd;
import X.SRI;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MentionMusicVideoVM extends BaseVideoListVM<SRI, C9QW, Long> {
    public String LJLJLLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new SRI(0);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        withState(new AqS178S0100000_12(this, 433));
        super.manualListRefresh();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C9QW> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS178S0100000_12(newListState, (C8HZ<ImageItem>) 305));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        this.LJLJJLL = true;
        String str = this.LJLJLLL;
        if (str != null) {
            return kv0(this.LJLJLJ, 0L, str, interfaceC67352kd);
        }
        o.LJIJI("musicId");
        throw null;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        long longValue = ((Number) obj).longValue();
        String str = this.LJLJLLL;
        if (str != null) {
            return kv0(this.LJLJLJ, longValue, str, interfaceC67352kd);
        }
        o.LJIJI("musicId");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00be A[Catch: Exception -> 0x0142, TryCatch #3 {Exception -> 0x0142, blocks: (B:12:0x00aa, B:13:0x00ad, B:15:0x00be, B:16:0x00c2, B:18:0x00c8, B:20:0x00da, B:22:0x00ed, B:24:0x00f1, B:26:0x00f7, B:28:0x00fb, B:30:0x0117, B:32:0x011b, B:33:0x0130, B:34:0x0133, B:36:0x0101, B:38:0x0109, B:40:0x0126), top: B:11:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ed A[Catch: Exception -> 0x0142, TryCatch #3 {Exception -> 0x0142, blocks: (B:12:0x00aa, B:13:0x00ad, B:15:0x00be, B:16:0x00c2, B:18:0x00c8, B:20:0x00da, B:22:0x00ed, B:24:0x00f1, B:26:0x00f7, B:28:0x00fb, B:30:0x0117, B:32:0x011b, B:33:0x0130, B:34:0x0133, B:36:0x0101, B:38:0x0109, B:40:0x0126), top: B:11:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011b A[Catch: Exception -> 0x0142, TryCatch #3 {Exception -> 0x0142, blocks: (B:12:0x00aa, B:13:0x00ad, B:15:0x00be, B:16:0x00c2, B:18:0x00c8, B:20:0x00da, B:22:0x00ed, B:24:0x00f1, B:26:0x00f7, B:28:0x00fb, B:30:0x0117, B:32:0x011b, B:33:0x0130, B:34:0x0133, B:36:0x0101, B:38:0x0109, B:40:0x0126), top: B:11:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0130 A[Catch: Exception -> 0x0142, TryCatch #3 {Exception -> 0x0142, blocks: (B:12:0x00aa, B:13:0x00ad, B:15:0x00be, B:16:0x00c2, B:18:0x00c8, B:20:0x00da, B:22:0x00ed, B:24:0x00f1, B:26:0x00f7, B:28:0x00fb, B:30:0x0117, B:32:0x011b, B:33:0x0130, B:34:0x0133, B:36:0x0101, B:38:0x0109, B:40:0x0126), top: B:11:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0109 A[Catch: Exception -> 0x0142, TryCatch #3 {Exception -> 0x0142, blocks: (B:12:0x00aa, B:13:0x00ad, B:15:0x00be, B:16:0x00c2, B:18:0x00c8, B:20:0x00da, B:22:0x00ed, B:24:0x00f1, B:26:0x00f7, B:28:0x00fb, B:30:0x0117, B:32:0x011b, B:33:0x0130, B:34:0x0133, B:36:0x0101, B:38:0x0109, B:40:0x0126), top: B:11:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126 A[Catch: Exception -> 0x0142, TryCatch #3 {Exception -> 0x0142, blocks: (B:12:0x00aa, B:13:0x00ad, B:15:0x00be, B:16:0x00c2, B:18:0x00c8, B:20:0x00da, B:22:0x00ed, B:24:0x00f1, B:26:0x00f7, B:28:0x00fb, B:30:0x0117, B:32:0x011b, B:33:0x0130, B:34:0x0133, B:36:0x0101, B:38:0x0109, B:40:0x0126), top: B:11:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kv0(int r22, long r23, java.lang.String r25, X.InterfaceC67352kd r26) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.viewmodel.MentionMusicVideoVM.kv0(int, long, java.lang.String, X.2kd):java.lang.Object");
    }
}
