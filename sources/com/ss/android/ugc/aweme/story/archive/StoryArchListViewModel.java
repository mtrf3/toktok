package com.ss.android.ugc.aweme.story.archive;

import X.A2G;
import X.C182357Dr;
import X.C189837ch;
import X.C2050482y;
import X.C33Q;
import X.C47261Igj;
import X.C54838Lfe;
import X.C7F4;
import X.C8HZ;
import X.InterfaceC67352kd;
import X.M89;
import X.X1D;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class StoryArchListViewModel extends BaseDetailShareVM<C182357Dr, C7F4, Long> {
    public long LJLIL;

    @Override // X.InterfaceC51679KPz
    public final int getPageType(int i) {
        return 40;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C182357Dr(0);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int deleteItemByAid(String aid) {
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
                if (o.LJ(((C7F4) it.next()).LJLIL.getAid(), aid)) {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Aweme getAwemeFromItem(C7F4 c7f4) {
        C7F4 item = c7f4;
        o.LJIIIZ(item, "item");
        Aweme originAweme = item.LJLIL;
        o.LJIIIZ(originAweme, "originAweme");
        if (!C54838Lfe.LJJI(originAweme) || originAweme.getUserStory() != null) {
            return originAweme;
        }
        Aweme aweme = new Aweme();
        aweme.setAid(originAweme.getAid());
        boolean z = true;
        Aweme R1 = AwemeService.LIZ().R1(originAweme);
        o.LJI(R1);
        boolean z2 = false;
        List LJJIJIL = C47261Igj.LJJIJIL(R1);
        Story story = originAweme.getStory();
        if (story != null) {
            z2 = story.getViewed();
        }
        long j = 1;
        long j2 = 0;
        UserStory userStory = new UserStory(LJJIJIL, j, j2, z2, j2, j2, false, 0 == true ? 1 : 0, j2, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, j, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 487412, 0 == true ? 1 : 0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("origin total count: ");
        LIZ.append(userStory.getOriginTotalCount());
        LIZ.append(", user story instance: ");
        LIZ.append(System.identityHashCode(userStory));
        C189837ch.LIZ("huangxin.2020", X1D.LIZIZ(LIZ));
        aweme.setUserStory(userStory);
        aweme.setAwemeType(40);
        aweme.setAuthor(originAweme.getAuthor());
        aweme.setRequestId(originAweme.getRequestId());
        aweme.setIsTikTokStory(true);
        return aweme;
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C7F4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 417));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(0L, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: Exception -> 0x00b7, TryCatch #0 {Exception -> 0x00b7, blocks: (B:11:0x0046, B:12:0x0049, B:14:0x0052, B:16:0x0056, B:17:0x0058, B:19:0x0060, B:20:0x0064, B:21:0x0076, B:23:0x007c, B:25:0x0091, B:27:0x0097, B:30:0x00ad, B:34:0x008f, B:38:0x0031), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[Catch: Exception -> 0x00b7, TryCatch #0 {Exception -> 0x00b7, blocks: (B:11:0x0046, B:12:0x0049, B:14:0x0052, B:16:0x0056, B:17:0x0058, B:19:0x0060, B:20:0x0064, B:21:0x0076, B:23:0x007c, B:25:0x0091, B:27:0x0097, B:30:0x00ad, B:34:0x008f, B:38:0x0031), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad A[Catch: Exception -> 0x00b7, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b7, blocks: (B:11:0x0046, B:12:0x0049, B:14:0x0052, B:16:0x0056, B:17:0x0058, B:19:0x0060, B:20:0x0064, B:21:0x0076, B:23:0x007c, B:25:0x0091, B:27:0x0097, B:30:0x00ad, B:34:0x008f, B:38:0x0031), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[Catch: Exception -> 0x00b7, TryCatch #0 {Exception -> 0x00b7, blocks: (B:11:0x0046, B:12:0x0049, B:14:0x0052, B:16:0x0056, B:17:0x0058, B:19:0x0060, B:20:0x0064, B:21:0x0076, B:23:0x007c, B:25:0x0091, B:27:0x0097, B:30:0x00ad, B:34:0x008f, B:38:0x0031), top: B:7:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(long r9, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C185237Ot
            if (r0 == 0) goto L20
            r5 = r11
            X.7Ot r5 = (X.C185237Ot) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r7 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r4 = 1
            if (r0 == 0) goto L2e
            if (r0 != r4) goto L26
            com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel r3 = r5.LJLIL
            goto L46
        L20:
            X.7Ot r5 = new X.7Ot
            r5.<init>(r8, r11)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r7)
            com.ss.android.ugc.aweme.story.api.StoryApi r2 = com.ss.android.ugc.aweme.story.api.StoryApi.LIZIZ     // Catch: java.lang.Exception -> Lb7
            r0 = 21
            X.Svk r0 = r2.getStoryArchList(r9, r0)     // Catch: java.lang.Exception -> Lb7
            r5.LJLIL = r8     // Catch: java.lang.Exception -> Lb7
            r5.LJLJJI = r4     // Catch: java.lang.Exception -> Lb7
            java.lang.Object r7 = X.C77318UWc.LIZIZ(r0, r5)     // Catch: java.lang.Exception -> Lb7
            if (r7 != r3) goto L44
            return r3
        L44:
            r3 = r8
            goto L49
        L46:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Exception -> Lb7
        L49:
            com.ss.android.ugc.aweme.story.archive.model.StoryArchiveList r7 = (com.ss.android.ugc.aweme.story.archive.model.StoryArchiveList) r7     // Catch: java.lang.Exception -> Lb7
            java.util.List r2 = r7.getItems()     // Catch: java.lang.Exception -> Lb7
            r6 = 0
            if (r2 == 0) goto L8f
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r7.extra     // Catch: java.lang.Exception -> Lb7
            if (r0 == 0) goto L8d
            java.lang.String r1 = r0.logid     // Catch: java.lang.Exception -> Lb7
        L58:
            java.lang.Object r0 = X.ORZ.LJLLLL(r2)     // Catch: java.lang.Exception -> Lb7
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0     // Catch: java.lang.Exception -> Lb7
            if (r0 == 0) goto L8b
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()     // Catch: java.lang.Exception -> Lb7
        L64:
            X.C78847Ux1.LJJJLIIL(r2, r1, r0)     // Catch: java.lang.Exception -> Lb7
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb7
            r0 = 10
            int r0 = X.C32I.LJJL(r2, r0)     // Catch: java.lang.Exception -> Lb7
            r5.<init>(r0)     // Catch: java.lang.Exception -> Lb7
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> Lb7
        L76:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lb7
            if (r0 == 0) goto L91
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Lb7
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch: java.lang.Exception -> Lb7
            X.7F4 r0 = new X.7F4     // Catch: java.lang.Exception -> Lb7
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lb7
            r5.add(r0)     // Catch: java.lang.Exception -> Lb7
            goto L76
        L8b:
            r0 = r6
            goto L64
        L8d:
            r1 = r6
            goto L58
        L8f:
            X.OQg r5 = X.C61878OQg.INSTANCE     // Catch: java.lang.Exception -> Lb7
        L91:
            boolean r0 = r7.getHasMore()     // Catch: java.lang.Exception -> Lb7
            if (r0 == 0) goto Lad
            long r0 = r7.getMaxCursor()     // Catch: java.lang.Exception -> Lb7
            r3.LJLIL = r0     // Catch: java.lang.Exception -> Lb7
            X.A2F r3 = X.A2G.LIZ     // Catch: java.lang.Exception -> Lb7
            long r1 = r7.getMaxCursor()     // Catch: java.lang.Exception -> Lb7
            java.lang.Long r0 = new java.lang.Long     // Catch: java.lang.Exception -> Lb7
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lb7
            X.A2V r0 = X.A2F.LJ(r3, r6, r0, r5, r4)     // Catch: java.lang.Exception -> Lb7
            goto Lc1
        Lad:
            X.A2F r0 = X.A2G.LIZ     // Catch: java.lang.Exception -> Lb7
            r0.getClass()     // Catch: java.lang.Exception -> Lb7
            X.A2H r0 = X.A2F.LIZ(r5)     // Catch: java.lang.Exception -> Lb7
            goto Lc1
        Lb7:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel.gv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Object obj, InterfaceC67352kd interfaceC67352kd) {
        return gv0(((Number) obj).longValue(), interfaceC67352kd);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final Long getCursorByFeedParam(int i, M89 feedParam, int i2, boolean z) {
        o.LJIIIZ(feedParam, "feedParam");
        return Long.valueOf(this.LJLIL);
    }
}
