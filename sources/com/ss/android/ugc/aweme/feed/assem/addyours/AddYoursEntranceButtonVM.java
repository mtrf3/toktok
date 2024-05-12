package com.ss.android.ugc.aweme.feed.assem.addyours;

import X.AbstractC226378uX;
import X.C188727au;
import X.C226348uU;
import X.C226358uV;
import X.C33Q;
import X.FMX;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* loaded from: classes4.dex */
public final class AddYoursEntranceButtonVM extends FeedBaseViewModel<C226358uV> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C226358uV(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r9 != 0) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kv0(com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation r24, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct> r25) {
        /*
            r23 = this;
            r6 = r24
            r3 = r25
            boolean r0 = r3 instanceof X.C226368uW
            if (r0 == 0) goto L8a
            r8 = r3
            X.8uW r8 = (X.C226368uW) r8
            int r2 = r8.LJLJJLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8a
            int r2 = r2 - r1
            r8.LJLJJLL = r2
        L16:
            java.lang.Object r9 = r8.LJLJJI
            X.NAu r7 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLJJLL
            r5 = 1
            if (r0 == 0) goto L4c
            if (r0 != r5) goto L92
            X.2mC r4 = r8.LJLJI
            com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation r6 = r8.LJLILLLLZI
            X.2mC r0 = r8.LJLIL
            X.C141335gf.LIZJ(r9)
        L2a:
            if (r9 != 0) goto L46
        L2c:
            com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct r9 = new com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct
            r10 = 0
            java.lang.String r12 = r6.getTopicText()
            r19 = 0
            r21 = 1019(0x3fb, float:1.428E-42)
            r11 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r16 = r10
            r17 = r10
            r18 = r10
            r22 = r10
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21, r22)
        L46:
            r4.element = r9
            r4 = r0
        L49:
            T r0 = r4.element
            return r0
        L4c:
            X.2mC r4 = X.C793239k.LIZ(r9)
            if (r6 == 0) goto L49
            java.lang.String r0 = r6.getTopicText()
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L49
            java.lang.Long r3 = r6.getTopicId()
            if (r3 == 0) goto L88
            long r1 = r3.longValue()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            boolean r0 = X.C30591Hz.LJIJJLI(r0)
            if (r0 == 0) goto L88
            long r1 = r3.longValue()
            X.8l2 r0 = X.C220488l2.LIZIZ
            r8.LJLIL = r4
            r8.LJLILLLLZI = r6
            r8.LJLJI = r4
            r8.LJLJJLL = r5
            java.lang.Object r9 = r0.LIZ(r1, r8)
            if (r9 != r7) goto L86
            return r7
        L86:
            r0 = r4
            goto L2a
        L88:
            r0 = r4
            goto L2c
        L8a:
            X.8uW r8 = new X.8uW
            r0 = r23
            r8.<init>(r0, r3)
            goto L16
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM.kv0(com.ss.android.ugc.aweme.addyours.model.AddYoursRecommendation, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void lv0(String str, VideoItemParams videoItemParams) {
        AbstractC226378uX abstractC226378uX;
        if (videoItemParams == null || videoItemParams.getAweme() == null || (abstractC226378uX = ((C226358uV) getState()).LJLIL) == null) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", videoItemParams.mEventType);
        c188727au.LIZLLL(videoItemParams.getAweme().getAwemeType(), "aweme_type");
        c188727au.LJIIIZ("group_id", videoItemParams.getAweme().getAid());
        c188727au.LIZLLL(videoItemParams.getAweme().getFollowStatus(), "follow_status");
        c188727au.LJIIIZ("author_id", videoItemParams.getAweme().getAuthorUid());
        c188727au.LJFF(abstractC226378uX.LIZ, "add_yours_id");
        c188727au.LJIIIZ("add_yours_title", abstractC226378uX.LIZIZ);
        c188727au.LIZLLL(abstractC226378uX instanceof C226348uU ? 1 : 0, "is_operation_set");
        FMX.LJIIL(str, c188727au.LIZ);
    }
}
