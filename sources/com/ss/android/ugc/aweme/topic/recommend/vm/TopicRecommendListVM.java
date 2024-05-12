package com.ss.android.ugc.aweme.topic.recommend.vm;

import X.A2G;
import X.C184817Nd;
import X.C184937Np;
import X.C199417s9;
import X.C2050482y;
import X.C214188as;
import X.C33Q;
import X.C34K;
import X.C48841JEv;
import X.C78404Ups;
import X.C78613UtF;
import X.C7OG;
import X.C7PR;
import X.C7PS;
import X.C7PT;
import X.C7PV;
import X.C7PY;
import X.C8HZ;
import X.InterfaceC65462ha;
import X.InterfaceC67352kd;
import X.XIA;
import X.XKX;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility;
import com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailApi;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicRecommendListVM extends AssemListViewModel<C184937Np, C184817Nd, String> implements SearchAbility {
    public C7PR LJLIL;
    public String LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public final long LJLJJLL = System.currentTimeMillis();
    public final C214188as LJLJL = C78404Ups.LIZJ(this, C7PT.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C184937Np(0);
    }

    public final C7PR gv0() {
        C7PR c7pr = this.LJLIL;
        if (c7pr != null) {
            return c7pr;
        }
        o.LJIJI("topicType");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.SearchAbility
    public final void LLIIIL(String text) {
        o.LJIIIZ(text, "text");
        this.LJLJJI = text;
        manualListRefresh();
    }

    public final void iv0(TopicRawInfo topicRawInfo) {
        boolean z;
        InterfaceC65462ha LIZIZ;
        String str = topicRawInfo.id;
        if (str == null) {
            return;
        }
        Boolean bool = topicRawInfo.isCollected;
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (this.LJLIL == null) {
            return;
        }
        if (C7PS.LIZ[gv0().ordinal()] == 1) {
            C7PV c7pv = C7PV.BOOK;
            C34K c34k = new C34K();
            if (C7OG.LIZIZ(c7pv, str) == null) {
                C7OG.LIZLLL(c7pv, str, z);
                z2 = z;
            } else {
                Boolean LIZIZ2 = C7OG.LIZIZ(c7pv, str);
                if (LIZIZ2 != null) {
                    z2 = LIZIZ2.booleanValue();
                }
            }
            c34k.element = z2;
            if (!z2) {
                if (gv0() == C7PR.BOOK) {
                    BookDetailApi.LIZ.getClass();
                    LIZIZ = C199417s9.LIZ(str);
                } else {
                    return;
                }
            } else {
                if (gv0() != C7PR.BOOK) {
                    return;
                }
                BookDetailApi.LIZ.getClass();
                LIZIZ = C199417s9.LIZIZ(str);
            }
            XIA xia = C78613UtF.LIZJ;
            XKX.LIZLLL(C48841JEv.LIZ(xia), xia, null, new C7PY(LIZIZ, c7pv, str, c34k, topicRawInfo, this, z, null), 2);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C184817Nd> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 497));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<String>> interfaceC67352kd) {
        return onLoadMore("", interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014c A[Catch: Exception -> 0x02b5, TryCatch #0 {Exception -> 0x02b5, blocks: (B:12:0x0188, B:13:0x018b, B:15:0x0191, B:16:0x019f, B:18:0x01a5, B:20:0x01ad, B:22:0x01b3, B:23:0x01d0, B:25:0x01d9, B:27:0x01e1, B:28:0x01e3, B:29:0x01e8, B:31:0x01ee, B:33:0x01fa, B:35:0x0208, B:39:0x0211, B:40:0x021b, B:42:0x024c, B:43:0x0250, B:45:0x0264, B:46:0x0268, B:48:0x0272, B:51:0x027f, B:52:0x0283, B:54:0x0287, B:56:0x029c, B:57:0x02a0, B:64:0x02a1, B:65:0x02a5, B:67:0x02a8, B:69:0x02a6, B:73:0x00c6, B:74:0x00c9, B:76:0x00cf, B:77:0x00dc, B:79:0x00e2, B:81:0x00f1, B:83:0x0100, B:86:0x010d, B:87:0x0111, B:89:0x0115, B:91:0x012a, B:92:0x012d, B:97:0x0132, B:99:0x0138, B:100:0x0142, B:102:0x014c, B:104:0x0157, B:106:0x012e, B:108:0x0052, B:110:0x0056, B:112:0x0169, B:116:0x005c, B:119:0x006e, B:121:0x0074, B:123:0x0078, B:125:0x007e, B:127:0x008f, B:129:0x009b, B:131:0x00ad, B:135:0x0163, B:136:0x0168), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0157 A[Catch: Exception -> 0x02b5, TryCatch #0 {Exception -> 0x02b5, blocks: (B:12:0x0188, B:13:0x018b, B:15:0x0191, B:16:0x019f, B:18:0x01a5, B:20:0x01ad, B:22:0x01b3, B:23:0x01d0, B:25:0x01d9, B:27:0x01e1, B:28:0x01e3, B:29:0x01e8, B:31:0x01ee, B:33:0x01fa, B:35:0x0208, B:39:0x0211, B:40:0x021b, B:42:0x024c, B:43:0x0250, B:45:0x0264, B:46:0x0268, B:48:0x0272, B:51:0x027f, B:52:0x0283, B:54:0x0287, B:56:0x029c, B:57:0x02a0, B:64:0x02a1, B:65:0x02a5, B:67:0x02a8, B:69:0x02a6, B:73:0x00c6, B:74:0x00c9, B:76:0x00cf, B:77:0x00dc, B:79:0x00e2, B:81:0x00f1, B:83:0x0100, B:86:0x010d, B:87:0x0111, B:89:0x0115, B:91:0x012a, B:92:0x012d, B:97:0x0132, B:99:0x0138, B:100:0x0142, B:102:0x014c, B:104:0x0157, B:106:0x012e, B:108:0x0052, B:110:0x0056, B:112:0x0169, B:116:0x005c, B:119:0x006e, B:121:0x0074, B:123:0x0078, B:125:0x007e, B:127:0x008f, B:129:0x009b, B:131:0x00ad, B:135:0x0163, B:136:0x0168), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012e A[Catch: Exception -> 0x02b5, TryCatch #0 {Exception -> 0x02b5, blocks: (B:12:0x0188, B:13:0x018b, B:15:0x0191, B:16:0x019f, B:18:0x01a5, B:20:0x01ad, B:22:0x01b3, B:23:0x01d0, B:25:0x01d9, B:27:0x01e1, B:28:0x01e3, B:29:0x01e8, B:31:0x01ee, B:33:0x01fa, B:35:0x0208, B:39:0x0211, B:40:0x021b, B:42:0x024c, B:43:0x0250, B:45:0x0264, B:46:0x0268, B:48:0x0272, B:51:0x027f, B:52:0x0283, B:54:0x0287, B:56:0x029c, B:57:0x02a0, B:64:0x02a1, B:65:0x02a5, B:67:0x02a8, B:69:0x02a6, B:73:0x00c6, B:74:0x00c9, B:76:0x00cf, B:77:0x00dc, B:79:0x00e2, B:81:0x00f1, B:83:0x0100, B:86:0x010d, B:87:0x0111, B:89:0x0115, B:91:0x012a, B:92:0x012d, B:97:0x0132, B:99:0x0138, B:100:0x0142, B:102:0x014c, B:104:0x0157, B:106:0x012e, B:108:0x0052, B:110:0x0056, B:112:0x0169, B:116:0x005c, B:119:0x006e, B:121:0x0074, B:123:0x0078, B:125:0x007e, B:127:0x008f, B:129:0x009b, B:131:0x00ad, B:135:0x0163, B:136:0x0168), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0191 A[Catch: Exception -> 0x02b5, TryCatch #0 {Exception -> 0x02b5, blocks: (B:12:0x0188, B:13:0x018b, B:15:0x0191, B:16:0x019f, B:18:0x01a5, B:20:0x01ad, B:22:0x01b3, B:23:0x01d0, B:25:0x01d9, B:27:0x01e1, B:28:0x01e3, B:29:0x01e8, B:31:0x01ee, B:33:0x01fa, B:35:0x0208, B:39:0x0211, B:40:0x021b, B:42:0x024c, B:43:0x0250, B:45:0x0264, B:46:0x0268, B:48:0x0272, B:51:0x027f, B:52:0x0283, B:54:0x0287, B:56:0x029c, B:57:0x02a0, B:64:0x02a1, B:65:0x02a5, B:67:0x02a8, B:69:0x02a6, B:73:0x00c6, B:74:0x00c9, B:76:0x00cf, B:77:0x00dc, B:79:0x00e2, B:81:0x00f1, B:83:0x0100, B:86:0x010d, B:87:0x0111, B:89:0x0115, B:91:0x012a, B:92:0x012d, B:97:0x0132, B:99:0x0138, B:100:0x0142, B:102:0x014c, B:104:0x0157, B:106:0x012e, B:108:0x0052, B:110:0x0056, B:112:0x0169, B:116:0x005c, B:119:0x006e, B:121:0x0074, B:123:0x0078, B:125:0x007e, B:127:0x008f, B:129:0x009b, B:131:0x00ad, B:135:0x0163, B:136:0x0168), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a6 A[Catch: Exception -> 0x02b5, TryCatch #0 {Exception -> 0x02b5, blocks: (B:12:0x0188, B:13:0x018b, B:15:0x0191, B:16:0x019f, B:18:0x01a5, B:20:0x01ad, B:22:0x01b3, B:23:0x01d0, B:25:0x01d9, B:27:0x01e1, B:28:0x01e3, B:29:0x01e8, B:31:0x01ee, B:33:0x01fa, B:35:0x0208, B:39:0x0211, B:40:0x021b, B:42:0x024c, B:43:0x0250, B:45:0x0264, B:46:0x0268, B:48:0x0272, B:51:0x027f, B:52:0x0283, B:54:0x0287, B:56:0x029c, B:57:0x02a0, B:64:0x02a1, B:65:0x02a5, B:67:0x02a8, B:69:0x02a6, B:73:0x00c6, B:74:0x00c9, B:76:0x00cf, B:77:0x00dc, B:79:0x00e2, B:81:0x00f1, B:83:0x0100, B:86:0x010d, B:87:0x0111, B:89:0x0115, B:91:0x012a, B:92:0x012d, B:97:0x0132, B:99:0x0138, B:100:0x0142, B:102:0x014c, B:104:0x0157, B:106:0x012e, B:108:0x0052, B:110:0x0056, B:112:0x0169, B:116:0x005c, B:119:0x006e, B:121:0x0074, B:123:0x0078, B:125:0x007e, B:127:0x008f, B:129:0x009b, B:131:0x00ad, B:135:0x0163, B:136:0x0168), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf A[Catch: Exception -> 0x02b5, TryCatch #0 {Exception -> 0x02b5, blocks: (B:12:0x0188, B:13:0x018b, B:15:0x0191, B:16:0x019f, B:18:0x01a5, B:20:0x01ad, B:22:0x01b3, B:23:0x01d0, B:25:0x01d9, B:27:0x01e1, B:28:0x01e3, B:29:0x01e8, B:31:0x01ee, B:33:0x01fa, B:35:0x0208, B:39:0x0211, B:40:0x021b, B:42:0x024c, B:43:0x0250, B:45:0x0264, B:46:0x0268, B:48:0x0272, B:51:0x027f, B:52:0x0283, B:54:0x0287, B:56:0x029c, B:57:0x02a0, B:64:0x02a1, B:65:0x02a5, B:67:0x02a8, B:69:0x02a6, B:73:0x00c6, B:74:0x00c9, B:76:0x00cf, B:77:0x00dc, B:79:0x00e2, B:81:0x00f1, B:83:0x0100, B:86:0x010d, B:87:0x0111, B:89:0x0115, B:91:0x012a, B:92:0x012d, B:97:0x0132, B:99:0x0138, B:100:0x0142, B:102:0x014c, B:104:0x0157, B:106:0x012e, B:108:0x0052, B:110:0x0056, B:112:0x0169, B:116:0x005c, B:119:0x006e, B:121:0x0074, B:123:0x0078, B:125:0x007e, B:127:0x008f, B:129:0x009b, B:131:0x00ad, B:135:0x0163, B:136:0x0168), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: hv0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(java.lang.String r31, X.InterfaceC67352kd<? super X.A2G<java.lang.String>> r32) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM.onLoadMore(java.lang.String, X.2kd):java.lang.Object");
    }
}
