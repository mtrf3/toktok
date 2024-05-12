package com.ss.android.ugc.now.interaction.assem;

import X.A2G;
import X.C1806977h;
import X.C2050482y;
import X.C33Q;
import X.C77B;
import X.C77H;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.comment.model.InteractionBubbleCacheState;
import com.ss.android.ugc.aweme.comment.model.InteractionBubbles;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class InteractionBubbleListVM extends AssemListViewModel<C77H, InterfaceC57784Mm4, PaginationCursor> {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C77H(0);
    }

    public InteractionBubbleListVM() {
        boolean z;
        if ((((Number) C1806977h.LIZ.getValue()).intValue() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        this.LJLIL = z;
        this.LJLILLLLZI = C1806977h.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kv0(X.InterfaceC67352kd r15) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM.kv0(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 598));
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x00ee, code lost:
    
        if (r9 != 4) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor>> r16) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM.onRefresh(X.2kd):java.lang.Object");
    }

    public final void gv0(long j, List list) {
        InteractionBubbles interactionBubbles;
        C77H c77h = (C77H) getVmDispatcher().getState();
        Aweme aweme = c77h.LJLILLLLZI;
        if (aweme != null && (interactionBubbles = aweme.getInteractionBubbles()) != null) {
            int i = C77B.LIZ[interactionBubbles.getCacheState().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3 && i != 4) {
                    return;
                }
                Aweme aweme2 = c77h.LJLILLLLZI;
                if (aweme2 != null) {
                    aweme2.setInteractionBubbleComments(list, Long.valueOf(j));
                }
                Aweme aweme3 = c77h.LJLILLLLZI;
                if (aweme3 == null) {
                    return;
                }
                aweme3.setInteractionBubbleState(InteractionBubbleCacheState.ALL_CACHE);
                return;
            }
            Aweme aweme4 = c77h.LJLILLLLZI;
            if (aweme4 != null) {
                aweme4.setInteractionBubbleComments(list, Long.valueOf(j));
            }
            Aweme aweme5 = c77h.LJLILLLLZI;
            if (aweme5 == null) {
                return;
            }
            aweme5.setInteractionBubbleState(InteractionBubbleCacheState.COMMENT_CACHE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor r14, X.InterfaceC67352kd<? super com.ss.android.ugc.now.interaction.model.CommentItemList> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.AnonymousClass779
            if (r0 == 0) goto L1e
            r2 = r15
            X.779 r2 = (X.AnonymousClass779) r2
            int r3 = r2.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L1e
            int r3 = r3 - r1
            r2.LJLJI = r3
        L12:
            java.lang.Object r4 = r2.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r2.LJLJI
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L24
            goto L66
        L1e:
            X.779 r2 = new X.779
            r2.<init>(r13, r15)
            goto L12
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2c:
            X.C141335gf.LIZJ(r4)
            boolean r0 = X.C73Q.LIZ()     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L37
            r10 = 0
            goto L38
        L37:
            r10 = 1
        L38:
            X.33Q r0 = r13.getState()     // Catch: java.lang.Exception -> L77
            X.77H r0 = (X.C77H) r0     // Catch: java.lang.Exception -> L77
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJLILLLLZI     // Catch: java.lang.Exception -> L77
            if (r0 == 0) goto L71
            java.lang.String r5 = r0.getAid()     // Catch: java.lang.Exception -> L77
            if (r5 == 0) goto L71
            com.ss.android.ugc.now.interaction.api.InteractionApiService r4 = com.ss.android.ugc.now.interaction.api.InteractionApiService.LIZIZ     // Catch: java.lang.Exception -> L77
            long r6 = r14.getCursor()     // Catch: java.lang.Exception -> L77
            X.776 r0 = X.AnonymousClass776.COMMENT_LIST_SCENARIO_NOW_BULLET     // Catch: java.lang.Exception -> L77
            int r11 = r0.getValue()     // Catch: java.lang.Exception -> L77
            r8 = 20
            r9 = 0
            r12 = 8
            X.Svk r0 = X.AnonymousClass775.LIZ(r4, r5, r6, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L77
            r2.LJLJI = r1     // Catch: java.lang.Exception -> L77
            java.lang.Object r4 = X.C77318UWc.LIZIZ(r0, r2)     // Catch: java.lang.Exception -> L77
            if (r4 != r3) goto L69
            return r3
        L66:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Exception -> L77
        L69:
            com.ss.android.ugc.now.interaction.model.CommentItemList r4 = (com.ss.android.ugc.now.interaction.model.CommentItemList) r4     // Catch: java.lang.Exception -> L77
            java.lang.String r0 = "{\n            val sortin…           data\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)     // Catch: java.lang.Exception -> L77
            return r4
        L71:
            X.77D r0 = new X.77D     // Catch: java.lang.Exception -> L77
            r0.<init>()     // Catch: java.lang.Exception -> L77
            throw r0     // Catch: java.lang.Exception -> L77
        L77:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM.hv0(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor r15, X.InterfaceC67352kd<? super com.ss.android.ugc.now.interaction.model.LikeListResponse> r16) {
        /*
            r14 = this;
            r4 = r16
            boolean r0 = r4 instanceof X.C77A
            if (r0 == 0) goto L20
            r3 = r4
            X.77A r3 = (X.C77A) r3
            int r2 = r3.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r3.LJLJI = r2
        L14:
            java.lang.Object r4 = r3.LJLIL
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJI
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L26
            goto L79
        L20:
            X.77A r3 = new X.77A
            r3.<init>(r14, r4)
            goto L14
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L84
            r4.<init>()     // Catch: java.lang.Exception -> L84
            java.lang.String r5 = "now_reaction"
            java.lang.Integer r0 = new java.lang.Integer     // Catch: java.lang.Exception -> L84
            r0.<init>(r1)     // Catch: java.lang.Exception -> L84
            r4.put(r5, r0)     // Catch: java.lang.Exception -> L84
            com.ss.android.ugc.now.interaction.api.InteractionApiService r5 = com.ss.android.ugc.now.interaction.api.InteractionApiService.LIZIZ     // Catch: java.lang.Exception -> L84
            X.33Q r0 = r14.getState()     // Catch: java.lang.Exception -> L84
            X.77H r0 = (X.C77H) r0     // Catch: java.lang.Exception -> L84
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.LJLILLLLZI     // Catch: java.lang.Exception -> L84
            if (r0 == 0) goto L52
            java.lang.String r6 = r0.getAid()     // Catch: java.lang.Exception -> L84
            if (r6 != 0) goto L54
        L52:
            java.lang.String r6 = ""
        L54:
            long r7 = r15.getOffset()     // Catch: java.lang.Exception -> L84
            long r9 = r15.getOffset()     // Catch: java.lang.Exception -> L84
            r11 = 20
            X.4eE r0 = X.EnumC114344eE.LIKE_LIST_SCENARIO_NOW_BULLET     // Catch: java.lang.Exception -> L84
            int r12 = r0.getValue()     // Catch: java.lang.Exception -> L84
            com.google.gson.Gson r0 = X.C69432nz.LIZ()     // Catch: java.lang.Exception -> L84
            java.lang.String r13 = r0.LJIILL(r4)     // Catch: java.lang.Exception -> L84
            X.Svk r0 = r5.fetchLikeList(r6, r7, r9, r11, r12, r13)     // Catch: java.lang.Exception -> L84
            r3.LJLJI = r1     // Catch: java.lang.Exception -> L84
            java.lang.Object r4 = X.C77318UWc.LIZIZ(r0, r3)     // Catch: java.lang.Exception -> L84
            if (r4 != r2) goto L7c
            return r2
        L79:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Exception -> L84
        L7c:
            com.ss.android.ugc.now.interaction.model.LikeListResponse r4 = (com.ss.android.ugc.now.interaction.model.LikeListResponse) r4     // Catch: java.lang.Exception -> L84
            java.lang.String r0 = "{\n            val extra:…           data\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)     // Catch: java.lang.Exception -> L84
            return r4
        L84:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM.iv0(com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(PaginationCursor paginationCursor, InterfaceC67352kd<? super A2G<PaginationCursor>> interfaceC67352kd) {
        return kv0(interfaceC67352kd);
    }

    public final void jv0(List<? extends User> list, boolean z, PaginationCursor paginationCursor) {
        InteractionBubbles interactionBubbles;
        C77H c77h = (C77H) getVmDispatcher().getState();
        Aweme aweme = c77h.LJLILLLLZI;
        if (aweme != null && (interactionBubbles = aweme.getInteractionBubbles()) != null) {
            int i = C77B.LIZ[interactionBubbles.getCacheState().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return;
                        }
                    }
                }
                Aweme aweme2 = c77h.LJLILLLLZI;
                if (aweme2 != null) {
                    aweme2.setInteractionBubbleLikes(list, Boolean.valueOf(z), Long.valueOf(paginationCursor.getCursor()), Long.valueOf(paginationCursor.getOffset()));
                }
                Aweme aweme3 = c77h.LJLILLLLZI;
                if (aweme3 == null) {
                    return;
                }
                aweme3.setInteractionBubbleState(InteractionBubbleCacheState.ALL_CACHE);
                return;
            }
            Aweme aweme4 = c77h.LJLILLLLZI;
            if (aweme4 != null) {
                aweme4.setInteractionBubbleLikes(list, Boolean.valueOf(z), Long.valueOf(paginationCursor.getCursor()), Long.valueOf(paginationCursor.getOffset()));
            }
            Aweme aweme5 = c77h.LJLILLLLZI;
            if (aweme5 == null) {
                return;
            }
            aweme5.setInteractionBubbleState(InteractionBubbleCacheState.LIKE_CACHE);
        }
    }
}
