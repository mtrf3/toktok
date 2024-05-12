package com.ss.android.ugc.aweme.upvote.detail.repostlist;

import X.A2G;
import X.AnonymousClass783;
import X.C2050482y;
import X.C33Q;
import X.C72808Sho;
import X.C78K;
import X.C8HZ;
import X.HG3;
import X.InterfaceC67352kd;
import X.M89;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RepostListViewModel extends BaseDetailShareVM<AnonymousClass783, C78K, Long> {
    public static final /* synthetic */ int LJLJJL = 0;
    public long LJLIL;
    public String LJLILLLLZI = "";
    public final Set<String> LJLJI = new LinkedHashSet();
    public String LJLJJI = "";

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new AnonymousClass783(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
        o.LJIIIZ(aid, "aid");
        int i = -1;
        if (!o.LJ(this.LJLILLLLZI, HG3.LJIILL().getCurUserId())) {
            return -1;
        }
        List<ITEM> listGetAll = listGetAll();
        if (listGetAll != 0) {
            Iterator it = listGetAll.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(((C78K) it.next()).LJLIL.getAid(), aid)) {
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
    public final Aweme getAwemeFromItem(C78K c78k) {
        C78K item = c78k;
        o.LJIIIZ(item, "item");
        return item.LJLIL;
    }

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        if (o.LJ(this.LJLJJI, "personal_homepage")) {
            return 1000;
        }
        return LiveNetAdaptiveHurryTimeSetting.DEFAULT;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C78K> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 526));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        this.LJLJI.clear();
        return gv0(21, 0L, this.LJLILLLLZI, 0, interfaceC67352kd);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    /* renamed from: hv0, reason: merged with bridge method [inline-methods] */
    public final void listAddItemAt(int i, C78K element) {
        o.LJIIIZ(element, "element");
        if (!o.LJ(this.LJLILLLLZI, HG3.LJIILL().getCurUserId())) {
            return;
        }
        C72808Sho<ITEM> c72808Sho = this.state;
        if (c72808Sho != 0 && ((ArrayList) c72808Sho.LJII()).contains(element)) {
            return;
        }
        super.listAddItemAt(i, (int) element);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return gv0(21, ((Number) obj).longValue(), this.LJLILLLLZI, 0, interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return Long.valueOf(this.LJLIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[Catch: Exception -> 0x012f, TryCatch #0 {Exception -> 0x012f, blocks: (B:11:0x005d, B:12:0x0060, B:13:0x0071, B:15:0x0077, B:18:0x008c, B:23:0x0090, B:24:0x009f, B:26:0x00a5, B:28:0x00b3, B:29:0x00c5, B:31:0x00cb, B:33:0x00da, B:34:0x00de, B:36:0x00e4, B:38:0x00f2, B:40:0x0106, B:41:0x0108, B:43:0x0111, B:46:0x0125, B:48:0x0122, B:52:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5 A[Catch: Exception -> 0x012f, LOOP:1: B:24:0x009f->B:26:0x00a5, LOOP_END, TryCatch #0 {Exception -> 0x012f, blocks: (B:11:0x005d, B:12:0x0060, B:13:0x0071, B:15:0x0077, B:18:0x008c, B:23:0x0090, B:24:0x009f, B:26:0x00a5, B:28:0x00b3, B:29:0x00c5, B:31:0x00cb, B:33:0x00da, B:34:0x00de, B:36:0x00e4, B:38:0x00f2, B:40:0x0106, B:41:0x0108, B:43:0x0111, B:46:0x0125, B:48:0x0122, B:52:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb A[Catch: Exception -> 0x012f, LOOP:2: B:29:0x00c5->B:31:0x00cb, LOOP_END, TryCatch #0 {Exception -> 0x012f, blocks: (B:11:0x005d, B:12:0x0060, B:13:0x0071, B:15:0x0077, B:18:0x008c, B:23:0x0090, B:24:0x009f, B:26:0x00a5, B:28:0x00b3, B:29:0x00c5, B:31:0x00cb, B:33:0x00da, B:34:0x00de, B:36:0x00e4, B:38:0x00f2, B:40:0x0106, B:41:0x0108, B:43:0x0111, B:46:0x0125, B:48:0x0122, B:52:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e4 A[Catch: Exception -> 0x012f, LOOP:3: B:34:0x00de->B:36:0x00e4, LOOP_END, TryCatch #0 {Exception -> 0x012f, blocks: (B:11:0x005d, B:12:0x0060, B:13:0x0071, B:15:0x0077, B:18:0x008c, B:23:0x0090, B:24:0x009f, B:26:0x00a5, B:28:0x00b3, B:29:0x00c5, B:31:0x00cb, B:33:0x00da, B:34:0x00de, B:36:0x00e4, B:38:0x00f2, B:40:0x0106, B:41:0x0108, B:43:0x0111, B:46:0x0125, B:48:0x0122, B:52:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106 A[Catch: Exception -> 0x012f, TryCatch #0 {Exception -> 0x012f, blocks: (B:11:0x005d, B:12:0x0060, B:13:0x0071, B:15:0x0077, B:18:0x008c, B:23:0x0090, B:24:0x009f, B:26:0x00a5, B:28:0x00b3, B:29:0x00c5, B:31:0x00cb, B:33:0x00da, B:34:0x00de, B:36:0x00e4, B:38:0x00f2, B:40:0x0106, B:41:0x0108, B:43:0x0111, B:46:0x0125, B:48:0x0122, B:52:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0111 A[Catch: Exception -> 0x012f, TryCatch #0 {Exception -> 0x012f, blocks: (B:11:0x005d, B:12:0x0060, B:13:0x0071, B:15:0x0077, B:18:0x008c, B:23:0x0090, B:24:0x009f, B:26:0x00a5, B:28:0x00b3, B:29:0x00c5, B:31:0x00cb, B:33:0x00da, B:34:0x00de, B:36:0x00e4, B:38:0x00f2, B:40:0x0106, B:41:0x0108, B:43:0x0111, B:46:0x0125, B:48:0x0122, B:52:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125 A[Catch: Exception -> 0x012f, TRY_LEAVE, TryCatch #0 {Exception -> 0x012f, blocks: (B:11:0x005d, B:12:0x0060, B:13:0x0071, B:15:0x0077, B:18:0x008c, B:23:0x0090, B:24:0x009f, B:26:0x00a5, B:28:0x00b3, B:29:0x00c5, B:31:0x00cb, B:33:0x00da, B:34:0x00de, B:36:0x00e4, B:38:0x00f2, B:40:0x0106, B:41:0x0108, B:43:0x0111, B:46:0x0125, B:48:0x0122, B:52:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122 A[Catch: Exception -> 0x012f, TryCatch #0 {Exception -> 0x012f, blocks: (B:11:0x005d, B:12:0x0060, B:13:0x0071, B:15:0x0077, B:18:0x008c, B:23:0x0090, B:24:0x009f, B:26:0x00a5, B:28:0x00b3, B:29:0x00c5, B:31:0x00cb, B:33:0x00da, B:34:0x00de, B:36:0x00e4, B:38:0x00f2, B:40:0x0106, B:41:0x0108, B:43:0x0111, B:46:0x0125, B:48:0x0122, B:52:0x003d), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(int r14, long r15, java.lang.String r17, int r18, X.InterfaceC67352kd r19) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.repostlist.RepostListViewModel.gv0(int, long, java.lang.String, int, X.2kd):java.lang.Object");
    }
}
