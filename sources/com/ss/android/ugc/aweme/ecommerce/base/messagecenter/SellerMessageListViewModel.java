package com.ss.android.ugc.aweme.ecommerce.base.messagecenter;

import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C67982le;
import X.C71850SHu;
import X.C88303dK;
import X.C88333dN;
import X.C8HZ;
import X.InterfaceC57784Mm4;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfo;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfoList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SellerMessageListViewModel extends AssemListViewModel<C88303dK, InterfaceC57784Mm4, C67982le> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LJFF(this, C71850SHu.class, null), true);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C88303dK(0);
    }

    public static List gv0(List list) {
        List<ConversationInfo> list2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ConversationInfoList conversationInfoList = (ConversationInfoList) it.next();
            if (conversationInfoList != null && (list2 = conversationInfoList.conversationCoreInfos) != null) {
                Iterator<ConversationInfo> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C88333dN(Integer.valueOf(conversationInfoList.LIZ), it2.next()));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List iv0(java.util.List r17) {
        /*
            Y.IDComparatorS29S0000000_1 r1 = new Y.IDComparatorS29S0000000_1
            r0 = 8
            r1.<init>(r0)
            r0 = r17
            java.util.List r1 = X.ORZ.LLILII(r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r6 = r1.iterator()
        L1c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r5 = r6.next()
            X.3dN r5 = (X.C88333dN) r5
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfo r0 = r5.LIZIZ
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage> r0 = r0.messages
            r15 = 0
            if (r0 == 0) goto L7a
            java.lang.Object r1 = X.ORZ.LLFII(r0)
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage r1 = (com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessage) r1
        L35:
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfo r0 = r5.LIZIZ
            java.lang.Long r8 = r0.conId
            java.lang.String r10 = r0.name
            java.lang.String r9 = r0.imageUrl
            if (r1 == 0) goto L76
            java.lang.String r11 = r1.content
            java.lang.Long r0 = r1.createTime
            if (r0 == 0) goto L77
            long r3 = r0.longValue()
        L49:
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfo r0 = r5.LIZIZ
            java.lang.Integer r13 = r0.unReadCount
            java.lang.String r14 = r0.clickUrl
            if (r1 == 0) goto L53
            java.lang.Long r15 = r1.createTime
        L53:
            java.lang.Integer r0 = r5.LIZ
            if (r0 != 0) goto L6c
        L57:
            r16 = 0
        L59:
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.ConversationInfo r0 = r5.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.StoreSellingPoint r0 = r0.selling
            X.4Yx r7 = new X.4Yx
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            r17 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r2.add(r7)
            goto L1c
        L6c:
            int r1 = r0.intValue()
            r0 = 4
            if (r1 != r0) goto L57
            r16 = 1
            goto L59
        L76:
            r11 = r15
        L77:
            r3 = 0
            goto L49
        L7a:
            r1 = r15
            goto L35
        L7c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel.iv0(java.util.List):java.util.List");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 37));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<X.C67982le>> r16) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    public static C67982le hv0(C67982le c67982le, List list) {
        int i;
        int i2;
        C67982le c67982le2 = new C67982le(7);
        boolean z = true;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ConversationInfoList conversationInfoList = (ConversationInfoList) it.next();
                if (conversationInfoList != null) {
                    if (conversationInfoList.LIZ == 4) {
                        Integer num = conversationInfoList.nextCursor;
                        if (num != null) {
                            i = num.intValue();
                        } else {
                            i = c67982le.LJLIL + 10;
                        }
                        c67982le2 = C67982le.L(c67982le2, i, 0, false, 6);
                    } else if (conversationInfoList.LIZ == 1) {
                        Integer num2 = conversationInfoList.nextCursor;
                        if (num2 != null) {
                            i2 = num2.intValue();
                        } else {
                            i2 = c67982le.LJLILLLLZI + 10;
                        }
                        c67982le2 = C67982le.L(c67982le2, 0, i2, false, 5);
                    }
                }
            }
            if (!list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ConversationInfoList conversationInfoList2 = (ConversationInfoList) it2.next();
                    if (conversationInfoList2 != null && o.LJ(conversationInfoList2.hasMore, Boolean.TRUE)) {
                        break;
                    }
                }
            }
        }
        z = false;
        return C67982le.L(c67982le2, 0, 0, z, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /* renamed from: jv0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onLoadMore(X.C67982le r6, X.InterfaceC67352kd<? super X.A2G<X.C67982le>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C88323dM
            if (r0 == 0) goto L65
            r3 = r7
            X.3dM r3 = (X.C88323dM) r3
            int r2 = r3.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r3.LJLJJL = r2
        L12:
            java.lang.Object r2 = r3.LJLJI
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJL
            r4 = 1
            if (r0 == 0) goto L51
            if (r0 != r4) goto L6b
            X.2le r6 = r3.LJLILLLLZI
            com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel r1 = r3.LJLIL
            X.C141335gf.LIZJ(r2)
        L24:
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L4f
            X.OQg r0 = X.C61878OQg.INSTANCE
        L2a:
            r1.getClass()
            java.util.List r0 = gv0(r0)
            java.util.List r3 = iv0(r0)
            X.2le r2 = hv0(r6, r2)
            boolean r0 = r2.LJLJI
            if (r0 == 0) goto L45
            X.A2F r1 = X.A2G.LIZ
            r0 = 0
            X.A2V r0 = X.A2F.LJ(r1, r0, r2, r3, r4)
        L44:
            return r0
        L45:
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2H r0 = X.A2F.LIZ(r3)
            goto L44
        L4f:
            r0 = r2
            goto L2a
        L51:
            X.C141335gf.LIZJ(r2)
            r3.LJLIL = r5
            r3.LJLILLLLZI = r6
            r3.LJLJJL = r4
            X.2lc r0 = com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.SellerMessageAPI.LIZ
            java.lang.Object r2 = r0.LIZ(r6, r3)
            if (r2 != r1) goto L63
            return r1
        L63:
            r1 = r5
            goto L24
        L65:
            X.3dM r3 = new X.3dM
            r3.<init>(r5, r7)
            goto L12
        L6b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerMessageListViewModel.onLoadMore(X.2le, X.2kd):java.lang.Object");
    }
}
