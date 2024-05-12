package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel;

import X.A2F;
import X.A2G;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C86883b2;
import X.C87273bf;
import X.C87473bz;
import X.C8HZ;
import X.EnumC85173Vx;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoSelectionViewModel extends AssemListViewModel<C87473bz, C86883b2, Long> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, C87273bf.class, "sticker_video_config"), true);
    public long LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C87473bz(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C86883b2> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 113));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        int i = ((C87273bf) this.LJLIL.getValue()).LJLIL;
        if (i == EnumC85173Vx.LIKED.getType()) {
            return hv0(0L, 0L, 50L, interfaceC67352kd);
        }
        if (i == EnumC85173Vx.FAVORITES.getType()) {
            return gv0(0L, 50L, interfaceC67352kd);
        }
        if (i == EnumC85173Vx.POSTED.getType()) {
            return iv0(0L, 50L, interfaceC67352kd);
        }
        return A2F.LIZIZ(A2G.LIZ);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        long longValue = l.longValue();
        int i = ((C87273bf) this.LJLIL.getValue()).LJLIL;
        if (i == EnumC85173Vx.LIKED.getType()) {
            return hv0(this.LJLILLLLZI, longValue, 50L, interfaceC67352kd);
        }
        if (i == EnumC85173Vx.FAVORITES.getType()) {
            return gv0(longValue, 50L, interfaceC67352kd);
        }
        if (i == EnumC85173Vx.POSTED.getType()) {
            return iv0(longValue, 50L, interfaceC67352kd);
        }
        return A2F.LIZIZ(A2G.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048 A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:13:0x003f, B:14:0x0042, B:16:0x0048, B:18:0x0057, B:20:0x005d, B:21:0x006c, B:23:0x0072, B:25:0x0083, B:27:0x008f, B:29:0x009b, B:31:0x0081, B:33:0x0030), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[Catch: Exception -> 0x00a5, TryCatch #0 {Exception -> 0x00a5, blocks: (B:13:0x003f, B:14:0x0042, B:16:0x0048, B:18:0x0057, B:20:0x005d, B:21:0x006c, B:23:0x0072, B:25:0x0083, B:27:0x008f, B:29:0x009b, B:31:0x0081, B:33:0x0030), top: B:7:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(long r11, long r13, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r15) {
        /*
            r10 = this;
            r3 = r15
            boolean r0 = r3 instanceof X.C86853az
            if (r0 == 0) goto L1f
            r9 = r3
            X.3az r9 = (X.C86853az) r9
            int r2 = r9.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r9.LJLJI = r2
        L13:
            java.lang.Object r5 = r9.LJLIL
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r9.LJLJI
            r3 = 1
            if (r0 == 0) goto L2d
            if (r0 != r3) goto L25
            goto L3f
        L1f:
            X.3az r9 = new X.3az
            r9.<init>(r10, r3)
            goto L13
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r5)
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r4 = X.C74722wW.LIZ()     // Catch: java.lang.Exception -> La5
            r9.LJLJI = r3     // Catch: java.lang.Exception -> La5
            r7 = r13
            r5 = r11
            java.lang.Object r5 = r4.getFavoriteVideoList(r5, r7, r9)     // Catch: java.lang.Exception -> La5
            if (r5 != r1) goto L42
            return r1
        L3f:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Exception -> La5
        L42:
            com.ss.android.ugc.aweme.emoji.stickerstore.api.Video2StickerFavoriteVideoResponse r5 = (com.ss.android.ugc.aweme.emoji.stickerstore.api.Video2StickerFavoriteVideoResponse) r5     // Catch: java.lang.Exception -> La5
            int r0 = r5.status_code     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L57
            X.A2F r1 = X.A2G.LIZ     // Catch: java.lang.Exception -> La5
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> La5
            r0.<init>()     // Catch: java.lang.Exception -> La5
            r1.getClass()     // Catch: java.lang.Exception -> La5
            X.A2I r0 = X.A2F.LIZJ(r0)     // Catch: java.lang.Exception -> La5
            return r0
        L57:
            java.util.List r1 = r5.getAwemeList()     // Catch: java.lang.Exception -> La5
            if (r1 == 0) goto L81
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> La5
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)     // Catch: java.lang.Exception -> La5
            r4.<init>(r0)     // Catch: java.lang.Exception -> La5
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> La5
        L6c:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L83
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> La5
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch: java.lang.Exception -> La5
            X.3b2 r0 = new X.3b2     // Catch: java.lang.Exception -> La5
            r0.<init>(r1)     // Catch: java.lang.Exception -> La5
            r4.add(r0)     // Catch: java.lang.Exception -> La5
            goto L6c
        L81:
            X.OQg r4 = X.C61878OQg.INSTANCE     // Catch: java.lang.Exception -> La5
        L83:
            java.lang.Boolean r1 = r5.getHasMore()     // Catch: java.lang.Exception -> La5
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> La5
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> La5
            if (r0 == 0) goto L9b
            X.A2F r2 = X.A2G.LIZ     // Catch: java.lang.Exception -> La5
            java.lang.Long r1 = r5.getCursor()     // Catch: java.lang.Exception -> La5
            r0 = 0
            X.A2V r0 = X.A2F.LJ(r2, r0, r1, r4, r3)     // Catch: java.lang.Exception -> La5
            goto La4
        L9b:
            X.A2F r0 = X.A2G.LIZ     // Catch: java.lang.Exception -> La5
            r0.getClass()     // Catch: java.lang.Exception -> La5
            X.A2H r0 = X.A2F.LIZ(r4)     // Catch: java.lang.Exception -> La5
        La4:
            return r0
        La5:
            r1 = move-exception
            java.lang.String r0 = "VideoContentViewModel"
            X.C34B.LJ(r0, r1)
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel.VideoSelectionViewModel.gv0(long, long, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c A[Catch: Exception -> 0x00a9, TryCatch #0 {Exception -> 0x00a9, blocks: (B:13:0x0043, B:14:0x0046, B:16:0x004c, B:18:0x005b, B:20:0x0061, B:21:0x0070, B:23:0x0076, B:25:0x0087, B:27:0x0093, B:29:0x009f, B:31:0x0085, B:33:0x0033), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: Exception -> 0x00a9, TryCatch #0 {Exception -> 0x00a9, blocks: (B:13:0x0043, B:14:0x0046, B:16:0x004c, B:18:0x005b, B:20:0x0061, B:21:0x0070, B:23:0x0076, B:25:0x0087, B:27:0x0093, B:29:0x009f, B:31:0x0085, B:33:0x0033), top: B:7:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(long r14, long r16, X.InterfaceC67352kd r18) {
        /*
            r13 = this;
            r6 = 0
            r3 = r18
            boolean r0 = r3 instanceof X.C86843ay
            if (r0 == 0) goto L22
            r12 = r3
            X.3ay r12 = (X.C86843ay) r12
            int r2 = r12.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r12.LJLJI = r2
        L16:
            java.lang.Object r5 = r12.LJLIL
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLJI
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            goto L43
        L22:
            X.3ay r12 = new X.3ay
            r12.<init>(r13, r3)
            goto L16
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r5)
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r5 = X.C74722wW.LIZ()     // Catch: java.lang.Exception -> La9
            r12.LJLJI = r3     // Catch: java.lang.Exception -> La9
            r10 = r16
            r8 = r14
            java.lang.Object r5 = r5.getPostedVideoList(r6, r8, r10, r12)     // Catch: java.lang.Exception -> La9
            if (r5 != r1) goto L46
            return r1
        L43:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Exception -> La9
        L46:
            com.ss.android.ugc.aweme.emoji.stickerstore.api.Video2StickerPostedVideoResponse r5 = (com.ss.android.ugc.aweme.emoji.stickerstore.api.Video2StickerPostedVideoResponse) r5     // Catch: java.lang.Exception -> La9
            int r0 = r5.status_code     // Catch: java.lang.Exception -> La9
            if (r0 == 0) goto L5b
            X.A2F r1 = X.A2G.LIZ     // Catch: java.lang.Exception -> La9
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> La9
            r0.<init>()     // Catch: java.lang.Exception -> La9
            r1.getClass()     // Catch: java.lang.Exception -> La9
            X.A2I r0 = X.A2F.LIZJ(r0)     // Catch: java.lang.Exception -> La9
            return r0
        L5b:
            java.util.List r1 = r5.getAwemeList()     // Catch: java.lang.Exception -> La9
            if (r1 == 0) goto L85
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> La9
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)     // Catch: java.lang.Exception -> La9
            r4.<init>(r0)     // Catch: java.lang.Exception -> La9
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> La9
        L70:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> La9
            if (r0 == 0) goto L87
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> La9
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch: java.lang.Exception -> La9
            X.3b2 r0 = new X.3b2     // Catch: java.lang.Exception -> La9
            r0.<init>(r1)     // Catch: java.lang.Exception -> La9
            r4.add(r0)     // Catch: java.lang.Exception -> La9
            goto L70
        L85:
            X.OQg r4 = X.C61878OQg.INSTANCE     // Catch: java.lang.Exception -> La9
        L87:
            java.lang.Boolean r1 = r5.getHasMore()     // Catch: java.lang.Exception -> La9
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> La9
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> La9
            if (r0 == 0) goto L9f
            X.A2F r2 = X.A2G.LIZ     // Catch: java.lang.Exception -> La9
            java.lang.Long r1 = r5.getMaxCreateTime()     // Catch: java.lang.Exception -> La9
            r0 = 0
            X.A2V r0 = X.A2F.LJ(r2, r0, r1, r4, r3)     // Catch: java.lang.Exception -> La9
            goto La8
        L9f:
            X.A2F r0 = X.A2G.LIZ     // Catch: java.lang.Exception -> La9
            r0.getClass()     // Catch: java.lang.Exception -> La9
            X.A2H r0 = X.A2F.LIZ(r4)     // Catch: java.lang.Exception -> La9
        La8:
            return r0
        La9:
            r1 = move-exception
            java.lang.String r0 = "VideoContentViewModel"
            X.C34B.LJ(r0, r1)
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel.VideoSelectionViewModel.iv0(long, long, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:11:0x0048, B:12:0x004b, B:14:0x0051, B:17:0x0060, B:19:0x0066, B:20:0x0075, B:22:0x007b, B:24:0x008c, B:26:0x0098, B:28:0x009e, B:29:0x00a2, B:32:0x00b3, B:34:0x008a, B:38:0x0033), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: Exception -> 0x00bd, TryCatch #0 {Exception -> 0x00bd, blocks: (B:11:0x0048, B:12:0x004b, B:14:0x0051, B:17:0x0060, B:19:0x0066, B:20:0x0075, B:22:0x007b, B:24:0x008c, B:26:0x0098, B:28:0x009e, B:29:0x00a2, B:32:0x00b3, B:34:0x008a, B:38:0x0033), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(long r13, long r15, long r17, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r19) {
        /*
            r12 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C86833ax
            if (r0 == 0) goto L22
            r11 = r3
            X.3ax r11 = (X.C86833ax) r11
            int r2 = r11.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r11.LJLJJI = r2
        L14:
            java.lang.Object r5 = r11.LJLILLLLZI
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJJI
            r3 = 1
            if (r0 == 0) goto L30
            if (r0 != r3) goto L28
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel.VideoSelectionViewModel r6 = r11.LJLIL
            goto L48
        L22:
            X.3ax r11 = new X.3ax
            r11.<init>(r12, r3)
            goto L14
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C141335gf.LIZJ(r5)
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r4 = X.C74722wW.LIZ()     // Catch: java.lang.Exception -> Lbd
            r11.LJLIL = r12     // Catch: java.lang.Exception -> Lbd
            r11.LJLJJI = r3     // Catch: java.lang.Exception -> Lbd
            r7 = r15
            r5 = r13
            r9 = r17
            java.lang.Object r5 = r4.getLikedVideoList(r5, r7, r9, r11)     // Catch: java.lang.Exception -> Lbd
            if (r5 != r1) goto L46
            return r1
        L46:
            r6 = r12
            goto L4b
        L48:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Exception -> Lbd
        L4b:
            com.ss.android.ugc.aweme.emoji.stickerstore.api.Video2StickerLikedVideoResponse r5 = (com.ss.android.ugc.aweme.emoji.stickerstore.api.Video2StickerLikedVideoResponse) r5     // Catch: java.lang.Exception -> Lbd
            int r0 = r5.status_code     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto L60
            X.A2F r1 = X.A2G.LIZ     // Catch: java.lang.Exception -> Lbd
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> Lbd
            r0.<init>()     // Catch: java.lang.Exception -> Lbd
            r1.getClass()     // Catch: java.lang.Exception -> Lbd
            X.A2I r0 = X.A2F.LIZJ(r0)     // Catch: java.lang.Exception -> Lbd
            return r0
        L60:
            java.util.List r1 = r5.getAwemeList()     // Catch: java.lang.Exception -> Lbd
            if (r1 == 0) goto L8a
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lbd
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)     // Catch: java.lang.Exception -> Lbd
            r4.<init>(r0)     // Catch: java.lang.Exception -> Lbd
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> Lbd
        L75:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto L8c
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Lbd
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r1     // Catch: java.lang.Exception -> Lbd
            X.3b2 r0 = new X.3b2     // Catch: java.lang.Exception -> Lbd
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lbd
            r4.add(r0)     // Catch: java.lang.Exception -> Lbd
            goto L75
        L8a:
            X.OQg r4 = X.C61878OQg.INSTANCE     // Catch: java.lang.Exception -> Lbd
        L8c:
            java.lang.Boolean r1 = r5.getHasMore()     // Catch: java.lang.Exception -> Lbd
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lbd
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto Lb3
            java.lang.Long r0 = r5.getMinCursor()     // Catch: java.lang.Exception -> Lbd
            if (r0 == 0) goto Lb0
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> Lbd
        La2:
            r6.LJLILLLLZI = r0     // Catch: java.lang.Exception -> Lbd
            X.A2F r2 = X.A2G.LIZ     // Catch: java.lang.Exception -> Lbd
            java.lang.Long r1 = r5.getMaxCursor()     // Catch: java.lang.Exception -> Lbd
            r0 = 0
            X.A2V r0 = X.A2F.LJ(r2, r0, r1, r4, r3)     // Catch: java.lang.Exception -> Lbd
            goto Lbc
        Lb0:
            r0 = 0
            goto La2
        Lb3:
            X.A2F r0 = X.A2G.LIZ     // Catch: java.lang.Exception -> Lbd
            r0.getClass()     // Catch: java.lang.Exception -> Lbd
            X.A2H r0 = X.A2F.LIZ(r4)     // Catch: java.lang.Exception -> Lbd
        Lbc:
            return r0
        Lbd:
            r1 = move-exception
            java.lang.String r0 = "VideoContentViewModel"
            X.C34B.LJ(r0, r1)
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.videoselection.viewmodel.VideoSelectionViewModel.hv0(long, long, long, X.2kd):java.lang.Object");
    }
}
