package com.ss.android.ugc.aweme.topic.common.creator.vm;

import X.A2G;
import X.C182347Dq;
import X.C184817Nd;
import X.C2050482y;
import X.C214188as;
import X.C33Q;
import X.C78404Ups;
import X.C7PO;
import X.C7PR;
import X.C8HZ;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicSearchViewModel extends AssemListViewModel<C182347Dq, C184817Nd, Long> implements SearchAbility, RefreshAbility {
    public String LJLIL;
    public C7PR LJLILLLLZI;
    public final C214188as LJLJI = C78404Ups.LIZJ(this, C7PO.LJLIL);
    public final long LJLJJI = System.currentTimeMillis();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C182347Dq(0);
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        manualListRefresh();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility
    public final void LLIIIL(String text) {
        o.LJIIIZ(text, "text");
        this.LJLIL = text;
        manualListRefresh();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C184817Nd> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 489));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(0L, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0056 A[Catch: Exception -> 0x02b9, TRY_ENTER, TryCatch #0 {Exception -> 0x02b9, blocks: (B:13:0x0182, B:14:0x0185, B:16:0x0189, B:18:0x018d, B:19:0x019b, B:21:0x01a1, B:23:0x01a9, B:25:0x01af, B:26:0x01c9, B:28:0x01d2, B:30:0x01da, B:31:0x01dc, B:32:0x01e1, B:34:0x01e7, B:36:0x01f3, B:38:0x0201, B:42:0x020a, B:43:0x0214, B:45:0x021f, B:46:0x0223, B:48:0x0241, B:49:0x024a, B:51:0x025a, B:52:0x025e, B:54:0x0272, B:55:0x0276, B:62:0x0299, B:63:0x029d, B:66:0x02a0, B:68:0x029e, B:71:0x00cb, B:72:0x00ce, B:73:0x00d7, B:75:0x00db, B:76:0x00e8, B:78:0x00ee, B:80:0x00fd, B:82:0x010a, B:85:0x011a, B:87:0x0124, B:89:0x012d, B:91:0x0118, B:92:0x00d2, B:93:0x00d5, B:95:0x0044, B:97:0x0048, B:103:0x0056, B:105:0x005a, B:106:0x0063, B:108:0x006d, B:110:0x0075, B:112:0x0084, B:114:0x008a, B:118:0x00a6, B:120:0x00ac, B:125:0x0137, B:127:0x013b, B:130:0x0149, B:132:0x014d, B:137:0x016c, B:139:0x0170, B:142:0x02aa), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0137 A[Catch: Exception -> 0x02b9, TryCatch #0 {Exception -> 0x02b9, blocks: (B:13:0x0182, B:14:0x0185, B:16:0x0189, B:18:0x018d, B:19:0x019b, B:21:0x01a1, B:23:0x01a9, B:25:0x01af, B:26:0x01c9, B:28:0x01d2, B:30:0x01da, B:31:0x01dc, B:32:0x01e1, B:34:0x01e7, B:36:0x01f3, B:38:0x0201, B:42:0x020a, B:43:0x0214, B:45:0x021f, B:46:0x0223, B:48:0x0241, B:49:0x024a, B:51:0x025a, B:52:0x025e, B:54:0x0272, B:55:0x0276, B:62:0x0299, B:63:0x029d, B:66:0x02a0, B:68:0x029e, B:71:0x00cb, B:72:0x00ce, B:73:0x00d7, B:75:0x00db, B:76:0x00e8, B:78:0x00ee, B:80:0x00fd, B:82:0x010a, B:85:0x011a, B:87:0x0124, B:89:0x012d, B:91:0x0118, B:92:0x00d2, B:93:0x00d5, B:95:0x0044, B:97:0x0048, B:103:0x0056, B:105:0x005a, B:106:0x0063, B:108:0x006d, B:110:0x0075, B:112:0x0084, B:114:0x008a, B:118:0x00a6, B:120:0x00ac, B:125:0x0137, B:127:0x013b, B:130:0x0149, B:132:0x014d, B:137:0x016c, B:139:0x0170, B:142:0x02aa), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a1 A[Catch: Exception -> 0x02b9, TryCatch #0 {Exception -> 0x02b9, blocks: (B:13:0x0182, B:14:0x0185, B:16:0x0189, B:18:0x018d, B:19:0x019b, B:21:0x01a1, B:23:0x01a9, B:25:0x01af, B:26:0x01c9, B:28:0x01d2, B:30:0x01da, B:31:0x01dc, B:32:0x01e1, B:34:0x01e7, B:36:0x01f3, B:38:0x0201, B:42:0x020a, B:43:0x0214, B:45:0x021f, B:46:0x0223, B:48:0x0241, B:49:0x024a, B:51:0x025a, B:52:0x025e, B:54:0x0272, B:55:0x0276, B:62:0x0299, B:63:0x029d, B:66:0x02a0, B:68:0x029e, B:71:0x00cb, B:72:0x00ce, B:73:0x00d7, B:75:0x00db, B:76:0x00e8, B:78:0x00ee, B:80:0x00fd, B:82:0x010a, B:85:0x011a, B:87:0x0124, B:89:0x012d, B:91:0x0118, B:92:0x00d2, B:93:0x00d5, B:95:0x0044, B:97:0x0048, B:103:0x0056, B:105:0x005a, B:106:0x0063, B:108:0x006d, B:110:0x0075, B:112:0x0084, B:114:0x008a, B:118:0x00a6, B:120:0x00ac, B:125:0x0137, B:127:0x013b, B:130:0x0149, B:132:0x014d, B:137:0x016c, B:139:0x0170, B:142:0x02aa), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db A[Catch: Exception -> 0x02b9, TryCatch #0 {Exception -> 0x02b9, blocks: (B:13:0x0182, B:14:0x0185, B:16:0x0189, B:18:0x018d, B:19:0x019b, B:21:0x01a1, B:23:0x01a9, B:25:0x01af, B:26:0x01c9, B:28:0x01d2, B:30:0x01da, B:31:0x01dc, B:32:0x01e1, B:34:0x01e7, B:36:0x01f3, B:38:0x0201, B:42:0x020a, B:43:0x0214, B:45:0x021f, B:46:0x0223, B:48:0x0241, B:49:0x024a, B:51:0x025a, B:52:0x025e, B:54:0x0272, B:55:0x0276, B:62:0x0299, B:63:0x029d, B:66:0x02a0, B:68:0x029e, B:71:0x00cb, B:72:0x00ce, B:73:0x00d7, B:75:0x00db, B:76:0x00e8, B:78:0x00ee, B:80:0x00fd, B:82:0x010a, B:85:0x011a, B:87:0x0124, B:89:0x012d, B:91:0x0118, B:92:0x00d2, B:93:0x00d5, B:95:0x0044, B:97:0x0048, B:103:0x0056, B:105:0x005a, B:106:0x0063, B:108:0x006d, B:110:0x0075, B:112:0x0084, B:114:0x008a, B:118:0x00a6, B:120:0x00ac, B:125:0x0137, B:127:0x013b, B:130:0x0149, B:132:0x014d, B:137:0x016c, B:139:0x0170, B:142:0x02aa), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0124 A[Catch: Exception -> 0x02b9, TryCatch #0 {Exception -> 0x02b9, blocks: (B:13:0x0182, B:14:0x0185, B:16:0x0189, B:18:0x018d, B:19:0x019b, B:21:0x01a1, B:23:0x01a9, B:25:0x01af, B:26:0x01c9, B:28:0x01d2, B:30:0x01da, B:31:0x01dc, B:32:0x01e1, B:34:0x01e7, B:36:0x01f3, B:38:0x0201, B:42:0x020a, B:43:0x0214, B:45:0x021f, B:46:0x0223, B:48:0x0241, B:49:0x024a, B:51:0x025a, B:52:0x025e, B:54:0x0272, B:55:0x0276, B:62:0x0299, B:63:0x029d, B:66:0x02a0, B:68:0x029e, B:71:0x00cb, B:72:0x00ce, B:73:0x00d7, B:75:0x00db, B:76:0x00e8, B:78:0x00ee, B:80:0x00fd, B:82:0x010a, B:85:0x011a, B:87:0x0124, B:89:0x012d, B:91:0x0118, B:92:0x00d2, B:93:0x00d5, B:95:0x0044, B:97:0x0048, B:103:0x0056, B:105:0x005a, B:106:0x0063, B:108:0x006d, B:110:0x0075, B:112:0x0084, B:114:0x008a, B:118:0x00a6, B:120:0x00ac, B:125:0x0137, B:127:0x013b, B:130:0x0149, B:132:0x014d, B:137:0x016c, B:139:0x0170, B:142:0x02aa), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012d A[Catch: Exception -> 0x02b9, TryCatch #0 {Exception -> 0x02b9, blocks: (B:13:0x0182, B:14:0x0185, B:16:0x0189, B:18:0x018d, B:19:0x019b, B:21:0x01a1, B:23:0x01a9, B:25:0x01af, B:26:0x01c9, B:28:0x01d2, B:30:0x01da, B:31:0x01dc, B:32:0x01e1, B:34:0x01e7, B:36:0x01f3, B:38:0x0201, B:42:0x020a, B:43:0x0214, B:45:0x021f, B:46:0x0223, B:48:0x0241, B:49:0x024a, B:51:0x025a, B:52:0x025e, B:54:0x0272, B:55:0x0276, B:62:0x0299, B:63:0x029d, B:66:0x02a0, B:68:0x029e, B:71:0x00cb, B:72:0x00ce, B:73:0x00d7, B:75:0x00db, B:76:0x00e8, B:78:0x00ee, B:80:0x00fd, B:82:0x010a, B:85:0x011a, B:87:0x0124, B:89:0x012d, B:91:0x0118, B:92:0x00d2, B:93:0x00d5, B:95:0x0044, B:97:0x0048, B:103:0x0056, B:105:0x005a, B:106:0x0063, B:108:0x006d, B:110:0x0075, B:112:0x0084, B:114:0x008a, B:118:0x00a6, B:120:0x00ac, B:125:0x0137, B:127:0x013b, B:130:0x0149, B:132:0x014d, B:137:0x016c, B:139:0x0170, B:142:0x02aa), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0118 A[Catch: Exception -> 0x02b9, TryCatch #0 {Exception -> 0x02b9, blocks: (B:13:0x0182, B:14:0x0185, B:16:0x0189, B:18:0x018d, B:19:0x019b, B:21:0x01a1, B:23:0x01a9, B:25:0x01af, B:26:0x01c9, B:28:0x01d2, B:30:0x01da, B:31:0x01dc, B:32:0x01e1, B:34:0x01e7, B:36:0x01f3, B:38:0x0201, B:42:0x020a, B:43:0x0214, B:45:0x021f, B:46:0x0223, B:48:0x0241, B:49:0x024a, B:51:0x025a, B:52:0x025e, B:54:0x0272, B:55:0x0276, B:62:0x0299, B:63:0x029d, B:66:0x02a0, B:68:0x029e, B:71:0x00cb, B:72:0x00ce, B:73:0x00d7, B:75:0x00db, B:76:0x00e8, B:78:0x00ee, B:80:0x00fd, B:82:0x010a, B:85:0x011a, B:87:0x0124, B:89:0x012d, B:91:0x0118, B:92:0x00d2, B:93:0x00d5, B:95:0x0044, B:97:0x0048, B:103:0x0056, B:105:0x005a, B:106:0x0063, B:108:0x006d, B:110:0x0075, B:112:0x0084, B:114:0x008a, B:118:0x00a6, B:120:0x00ac, B:125:0x0137, B:127:0x013b, B:130:0x0149, B:132:0x014d, B:137:0x016c, B:139:0x0170, B:142:0x02aa), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.7au] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(long r27, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r29) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.common.creator.vm.TopicSearchViewModel.gv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(l.longValue(), interfaceC67352kd);
    }
}
