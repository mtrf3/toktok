package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.notification.viewmodel;

import X.A2G;
import X.C221108m2;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C87123bQ;
import X.C87243bc;
import X.C87263be;
import X.C87493c1;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoStickerNotificationUserViewModel extends AssemListViewModel<C87493c1, C87123bQ, Long> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LIZLLL(this, C87263be.class, "key_video_sticker_notification_config"), true);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C87243bc.LJLIL);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C87493c1(0);
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C87123bQ> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 74));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        long j;
        Long l = ((C87263be) this.LJLIL.getValue()).LJLIL;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        return gv0(20, j, 0L, interfaceC67352kd);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        long j;
        long longValue = l.longValue();
        Long l2 = ((C87263be) this.LJLIL.getValue()).LJLIL;
        if (l2 != null) {
            j = l2.longValue();
        } else {
            j = 0;
        }
        return gv0(20, j, longValue, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[Catch: Exception -> 0x00b5, TryCatch #0 {Exception -> 0x00b5, blocks: (B:13:0x004f, B:14:0x0052, B:16:0x0058, B:18:0x0067, B:20:0x006d, B:21:0x007c, B:23:0x0082, B:25:0x0093, B:27:0x009f, B:29:0x00ab, B:31:0x0091, B:33:0x0031), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067 A[Catch: Exception -> 0x00b5, TryCatch #0 {Exception -> 0x00b5, blocks: (B:13:0x004f, B:14:0x0052, B:16:0x0058, B:18:0x0067, B:20:0x006d, B:21:0x007c, B:23:0x0082, B:25:0x0093, B:27:0x009f, B:29:0x00ab, B:31:0x0091, B:33:0x0031), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(int r13, long r14, long r16, X.InterfaceC67352kd r18) {
        /*
            r12 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C87233bb
            if (r0 == 0) goto L20
            r11 = r3
            X.3bb r11 = (X.C87233bb) r11
            int r2 = r11.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r11.LJLJI = r2
        L14:
            java.lang.Object r5 = r11.LJLIL
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJI
            r3 = 1
            if (r0 == 0) goto L2e
            if (r0 != r3) goto L26
            goto L4f
        L20:
            X.3bb r11 = new X.3bb
            r11.<init>(r12, r3)
            goto L14
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r5)
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r4 = X.C74722wW.LIZ()     // Catch: java.lang.Exception -> Lb5
            X.Ol8 r0 = r12.LJLILLLLZI     // Catch: java.lang.Exception -> Lb5
            java.lang.Object r5 = r0.getValue()     // Catch: java.lang.Exception -> Lb5
            java.lang.String r0 = "<get-curSecUid>(...)"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lb5
            r11.LJLJI = r3     // Catch: java.lang.Exception -> Lb5
            r6 = r14
            r10 = r13
            r8 = r16
            java.lang.Object r5 = r4.getNotificationVideoStickerUserList(r5, r6, r8, r10, r11)     // Catch: java.lang.Exception -> Lb5
            if (r5 != r1) goto L52
            return r1
        L4f:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Exception -> Lb5
        L52:
            com.ss.android.ugc.aweme.emoji.stickerstore.api.Video2StickerSceneResponse r5 = (com.ss.android.ugc.aweme.emoji.stickerstore.api.Video2StickerSceneResponse) r5     // Catch: java.lang.Exception -> Lb5
            int r0 = r5.status_code     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto L67
            X.A2F r1 = X.A2G.LIZ     // Catch: java.lang.Exception -> Lb5
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Exception -> Lb5
            r0.<init>()     // Catch: java.lang.Exception -> Lb5
            r1.getClass()     // Catch: java.lang.Exception -> Lb5
            X.A2I r0 = X.A2F.LIZJ(r0)     // Catch: java.lang.Exception -> Lb5
            return r0
        L67:
            java.util.List r1 = r5.getStickerList()     // Catch: java.lang.Exception -> Lb5
            if (r1 == 0) goto L91
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lb5
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)     // Catch: java.lang.Exception -> Lb5
            r4.<init>(r0)     // Catch: java.lang.Exception -> Lb5
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Exception -> Lb5
        L7c:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto L93
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> Lb5
            com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker r1 = (com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker) r1     // Catch: java.lang.Exception -> Lb5
            X.3bQ r0 = new X.3bQ     // Catch: java.lang.Exception -> Lb5
            r0.<init>(r1)     // Catch: java.lang.Exception -> Lb5
            r4.add(r0)     // Catch: java.lang.Exception -> Lb5
            goto L7c
        L91:
            X.OQg r4 = X.C61878OQg.INSTANCE     // Catch: java.lang.Exception -> Lb5
        L93:
            java.lang.Boolean r1 = r5.getHasMore()     // Catch: java.lang.Exception -> Lb5
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lb5
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)     // Catch: java.lang.Exception -> Lb5
            if (r0 == 0) goto Lab
            X.A2F r2 = X.A2G.LIZ     // Catch: java.lang.Exception -> Lb5
            java.lang.Long r1 = r5.getCursor()     // Catch: java.lang.Exception -> Lb5
            r0 = 0
            X.A2V r0 = X.A2F.LJ(r2, r0, r1, r4, r3)     // Catch: java.lang.Exception -> Lb5
            goto Lb4
        Lab:
            X.A2F r0 = X.A2G.LIZ     // Catch: java.lang.Exception -> Lb5
            r0.getClass()     // Catch: java.lang.Exception -> Lb5
            X.A2H r0 = X.A2F.LIZ(r4)     // Catch: java.lang.Exception -> Lb5
        Lb4:
            return r0
        Lb5:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.notification.viewmodel.VideoStickerNotificationUserViewModel.gv0(int, long, long, X.2kd):java.lang.Object");
    }
}
