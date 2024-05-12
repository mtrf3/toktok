package com.ss.android.ugc.tiktok.addyours.ui.vm;

import X.A2G;
import X.C2050482y;
import X.C218768iG;
import X.C219058ij;
import X.C33Q;
import X.C8HZ;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UserRecommendListViewModel extends AssemListViewModel<C219058ij, C218768iG, Long> {
    public Long LJLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C219058ij(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C218768iG> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 618));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:1|(2:3|(21:5|6|7|(1:(2:10|11)(2:57|58))(5:59|60|(1:62)(1:68)|63|(2:65|66)(1:67))|12|(4:15|(3:17|18|19)(1:21)|20|13)|22|23|(4:26|(3:28|29|30)(1:32)|31|24)|33|34|(3:38|36|35)|39|40|(2:43|41)|44|45|(1:47)(1:56)|48|49|(1:51)(2:53|54)))|71|6|7|(0)(0)|12|(1:13)|22|23|(1:24)|33|34|(2:36|35)|39|40|(1:41)|44|45|(0)(0)|48|49|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0129, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012a, code lost:
    
        r0 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:11:0x005f, B:12:0x0062, B:13:0x0077, B:15:0x007d, B:18:0x0089, B:23:0x008d, B:24:0x0096, B:26:0x009c, B:29:0x00ab, B:34:0x00af, B:35:0x00be, B:38:0x00c6, B:40:0x00d6, B:41:0x00eb, B:43:0x00f1, B:45:0x0100, B:47:0x010d, B:48:0x011b, B:56:0x011f, B:60:0x003d, B:62:0x0042, B:63:0x0046), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:11:0x005f, B:12:0x0062, B:13:0x0077, B:15:0x007d, B:18:0x0089, B:23:0x008d, B:24:0x0096, B:26:0x009c, B:29:0x00ab, B:34:0x00af, B:35:0x00be, B:38:0x00c6, B:40:0x00d6, B:41:0x00eb, B:43:0x00f1, B:45:0x0100, B:47:0x010d, B:48:0x011b, B:56:0x011f, B:60:0x003d, B:62:0x0042, B:63:0x0046), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6 A[Catch: all -> 0x0129, LOOP:2: B:35:0x00be->B:38:0x00c6, LOOP_END, TRY_ENTER, TryCatch #0 {all -> 0x0129, blocks: (B:11:0x005f, B:12:0x0062, B:13:0x0077, B:15:0x007d, B:18:0x0089, B:23:0x008d, B:24:0x0096, B:26:0x009c, B:29:0x00ab, B:34:0x00af, B:35:0x00be, B:38:0x00c6, B:40:0x00d6, B:41:0x00eb, B:43:0x00f1, B:45:0x0100, B:47:0x010d, B:48:0x011b, B:56:0x011f, B:60:0x003d, B:62:0x0042, B:63:0x0046), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1 A[Catch: all -> 0x0129, LOOP:3: B:41:0x00eb->B:43:0x00f1, LOOP_END, TryCatch #0 {all -> 0x0129, blocks: (B:11:0x005f, B:12:0x0062, B:13:0x0077, B:15:0x007d, B:18:0x0089, B:23:0x008d, B:24:0x0096, B:26:0x009c, B:29:0x00ab, B:34:0x00af, B:35:0x00be, B:38:0x00c6, B:40:0x00d6, B:41:0x00eb, B:43:0x00f1, B:45:0x0100, B:47:0x010d, B:48:0x011b, B:56:0x011f, B:60:0x003d, B:62:0x0042, B:63:0x0046), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:11:0x005f, B:12:0x0062, B:13:0x0077, B:15:0x007d, B:18:0x0089, B:23:0x008d, B:24:0x0096, B:26:0x009c, B:29:0x00ab, B:34:0x00af, B:35:0x00be, B:38:0x00c6, B:40:0x00d6, B:41:0x00eb, B:43:0x00f1, B:45:0x0100, B:47:0x010d, B:48:0x011b, B:56:0x011f, B:60:0x003d, B:62:0x0042, B:63:0x0046), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0137 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f A[Catch: all -> 0x0129, TRY_LEAVE, TryCatch #0 {all -> 0x0129, blocks: (B:11:0x005f, B:12:0x0062, B:13:0x0077, B:15:0x007d, B:18:0x0089, B:23:0x008d, B:24:0x0096, B:26:0x009c, B:29:0x00ab, B:34:0x00af, B:35:0x00be, B:38:0x00c6, B:40:0x00d6, B:41:0x00eb, B:43:0x00f1, B:45:0x0100, B:47:0x010d, B:48:0x011b, B:56:0x011f, B:60:0x003d, B:62:0x0042, B:63:0x0046), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r16) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:3|(18:5|6|7|(1:(2:10|11)(2:51|52))(5:53|54|(1:56)(1:62)|57|(2:59|60)(1:61))|12|(4:15|(3:17|18|19)(1:21)|20|13)|22|23|(4:26|(3:28|29|30)(1:32)|31|24)|33|34|(2:37|35)|38|39|(1:41)(1:50)|42|43|(1:45)(2:47|48)))|65|6|7|(0)(0)|12|(1:13)|22|23|(1:24)|33|34|(1:35)|38|39|(0)(0)|42|43|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ef, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f0, code lost:
    
        r1 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[Catch: all -> 0x00ef, TryCatch #0 {all -> 0x00ef, blocks: (B:11:0x0059, B:12:0x005c, B:13:0x0071, B:15:0x0077, B:18:0x0083, B:23:0x0087, B:24:0x0090, B:26:0x0096, B:29:0x00a5, B:34:0x00a9, B:35:0x00b8, B:37:0x00be, B:39:0x00d0, B:41:0x00d4, B:42:0x00e1, B:50:0x00e5, B:54:0x0037, B:56:0x003c, B:57:0x0040), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[Catch: all -> 0x00ef, TryCatch #0 {all -> 0x00ef, blocks: (B:11:0x0059, B:12:0x005c, B:13:0x0071, B:15:0x0077, B:18:0x0083, B:23:0x0087, B:24:0x0090, B:26:0x0096, B:29:0x00a5, B:34:0x00a9, B:35:0x00b8, B:37:0x00be, B:39:0x00d0, B:41:0x00d4, B:42:0x00e1, B:50:0x00e5, B:54:0x0037, B:56:0x003c, B:57:0x0040), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[Catch: all -> 0x00ef, LOOP:2: B:35:0x00b8->B:37:0x00be, LOOP_END, TryCatch #0 {all -> 0x00ef, blocks: (B:11:0x0059, B:12:0x005c, B:13:0x0071, B:15:0x0077, B:18:0x0083, B:23:0x0087, B:24:0x0090, B:26:0x0096, B:29:0x00a5, B:34:0x00a9, B:35:0x00b8, B:37:0x00be, B:39:0x00d0, B:41:0x00d4, B:42:0x00e1, B:50:0x00e5, B:54:0x0037, B:56:0x003c, B:57:0x0040), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4 A[Catch: all -> 0x00ef, TryCatch #0 {all -> 0x00ef, blocks: (B:11:0x0059, B:12:0x005c, B:13:0x0071, B:15:0x0077, B:18:0x0083, B:23:0x0087, B:24:0x0090, B:26:0x0096, B:29:0x00a5, B:34:0x00a9, B:35:0x00b8, B:37:0x00be, B:39:0x00d0, B:41:0x00d4, B:42:0x00e1, B:50:0x00e5, B:54:0x0037, B:56:0x003c, B:57:0x0040), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5 A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #0 {all -> 0x00ef, blocks: (B:11:0x0059, B:12:0x005c, B:13:0x0071, B:15:0x0077, B:18:0x0083, B:23:0x0087, B:24:0x0090, B:26:0x0096, B:29:0x00a5, B:34:0x00a9, B:35:0x00b8, B:37:0x00be, B:39:0x00d0, B:41:0x00d4, B:42:0x00e1, B:50:0x00e5, B:54:0x0037, B:56:0x003c, B:57:0x0040), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(long r14, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r16) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.tiktok.addyours.ui.vm.UserRecommendListViewModel.gv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(l.longValue(), interfaceC67352kd);
    }
}
