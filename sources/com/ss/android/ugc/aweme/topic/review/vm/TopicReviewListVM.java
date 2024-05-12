package com.ss.android.ugc.aweme.topic.review.vm;

import X.A2G;
import X.C185967Ro;
import X.C186127Se;
import X.C186137Sf;
import X.C186147Sg;
import X.C186177Sj;
import X.C2050482y;
import X.C33Q;
import X.C72808Sho;
import X.C78613UtF;
import X.C8HZ;
import X.InterfaceC67352kd;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicReviewListVM extends AssemListViewModel<C186127Se, C186177Sj, Long> {
    public String LJLIL = "";
    public int LJLILLLLZI = 1;
    public final Map<String, String> LJLJI = new LinkedHashMap();
    public final C185967Ro LJLJJI = new C185967Ro();
    public final C186147Sg LJLJJL = new C186147Sg();

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C186127Se(new C8HZ(null, null, 15));
    }

    public final void hv0(C186177Sj item) {
        o.LJIIIZ(item, "item");
        C72808Sho<ITEM> c72808Sho = this.state;
        if (c72808Sho != 0) {
            Integer valueOf = Integer.valueOf(c72808Sho.LJIIIZ(item));
            int i = -1;
            if (valueOf.intValue() != -1 && 1 != 0) {
                int intValue = valueOf.intValue();
                TopicReview topicReview = item.LJLIL;
                int diggCount = topicReview.getDiggCount();
                if (!item.LJLIL.getUserDigged()) {
                    i = 1;
                }
                TopicReview review = TopicReview.copy$default(topicReview, null, 0, null, 0, null, diggCount + i, !item.LJLIL.getUserDigged(), 0L, null, false, 927, null);
                boolean z = item.LJLILLLLZI;
                o.LJIIIZ(review, "review");
                listSetItemAt(intValue, (int) new C186177Sj(review, z));
                XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C186137Sf(item, this, intValue, null), 2);
            }
        }
    }

    public final void iv0(C186177Sj item) {
        o.LJIIIZ(item, "item");
        C72808Sho<ITEM> c72808Sho = this.state;
        if (c72808Sho != 0) {
            Integer valueOf = Integer.valueOf(c72808Sho.LJIIIZ(item));
            if (valueOf.intValue() != -1) {
                int intValue = valueOf.intValue();
                boolean z = !item.LJLILLLLZI;
                TopicReview review = item.LJLIL;
                o.LJIIIZ(review, "review");
                listSetItemAt(intValue, (int) new C186177Sj(review, z));
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C186177Sj> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS169S0100000_3(newListState, (C8HZ<C2050482y>) 499));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(0L, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: Exception -> 0x008e, LOOP:0: B:15:0x005b->B:17:0x0061, LOOP_END, TryCatch #0 {Exception -> 0x008e, blocks: (B:13:0x0045, B:14:0x0048, B:15:0x005b, B:17:0x0061, B:19:0x0071, B:21:0x0075, B:23:0x0084, B:26:0x0031), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075 A[Catch: Exception -> 0x008e, TryCatch #0 {Exception -> 0x008e, blocks: (B:13:0x0045, B:14:0x0048, B:15:0x005b, B:17:0x0061, B:19:0x0071, B:21:0x0075, B:23:0x0084, B:26:0x0031), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[Catch: Exception -> 0x008e, TRY_LEAVE, TryCatch #0 {Exception -> 0x008e, blocks: (B:13:0x0045, B:14:0x0048, B:15:0x005b, B:17:0x0061, B:19:0x0071, B:21:0x0075, B:23:0x0084, B:26:0x0031), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(long r14, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r16) {
        /*
            r13 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C186167Si
            if (r0 == 0) goto L20
            r12 = r3
            X.7Si r12 = (X.C186167Si) r12
            int r2 = r12.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r12.LJLJI = r2
        L14:
            java.lang.Object r7 = r12.LJLIL
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLJI
            r5 = 1
            if (r0 == 0) goto L2e
            if (r0 != r5) goto L26
            goto L45
        L20:
            X.7Si r12 = new X.7Si
            r12.<init>(r13, r3)
            goto L14
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r7)
            X.7Sg r0 = r13.LJLJJL     // Catch: java.lang.Exception -> L8e
            X.7Sk r6 = r0.LIZIZ     // Catch: java.lang.Exception -> L8e
            java.lang.String r7 = r13.LJLIL     // Catch: java.lang.Exception -> L8e
            int r8 = r13.LJLILLLLZI     // Catch: java.lang.Exception -> L8e
            r12.LJLJI = r5     // Catch: java.lang.Exception -> L8e
            r11 = 10
            r9 = r14
            java.lang.Object r7 = r6.LJJJIL(r7, r8, r9, r11, r12)     // Catch: java.lang.Exception -> L8e
            if (r7 != r1) goto L48
            return r1
        L45:
            X.C141335gf.LIZJ(r7)     // Catch: java.lang.Exception -> L8e
        L48:
            com.ss.android.ugc.aweme.topic.review.model.TopicReviewListResp r7 = (com.ss.android.ugc.aweme.topic.review.model.TopicReviewListResp) r7     // Catch: java.lang.Exception -> L8e
            java.util.List<com.ss.android.ugc.aweme.topic.review.model.TopicReview> r1 = r7.reviewList     // Catch: java.lang.Exception -> L8e
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Exception -> L8e
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)     // Catch: java.lang.Exception -> L8e
            r6.<init>(r0)     // Catch: java.lang.Exception -> L8e
            java.util.Iterator r3 = r1.iterator()     // Catch: java.lang.Exception -> L8e
        L5b:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L71
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Exception -> L8e
            com.ss.android.ugc.aweme.topic.review.model.TopicReview r2 = (com.ss.android.ugc.aweme.topic.review.model.TopicReview) r2     // Catch: java.lang.Exception -> L8e
            X.7Sj r1 = new X.7Sj     // Catch: java.lang.Exception -> L8e
            r0 = 0
            r1.<init>(r2, r0)     // Catch: java.lang.Exception -> L8e
            r6.add(r1)     // Catch: java.lang.Exception -> L8e
            goto L5b
        L71:
            boolean r0 = r7.hasMore     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L84
            X.A2F r4 = X.A2G.LIZ     // Catch: java.lang.Exception -> L8e
            long r2 = r7.cursor     // Catch: java.lang.Exception -> L8e
            java.lang.Long r1 = new java.lang.Long     // Catch: java.lang.Exception -> L8e
            r1.<init>(r2)     // Catch: java.lang.Exception -> L8e
            r0 = 0
            X.A2V r0 = X.A2F.LJ(r4, r0, r1, r6, r5)     // Catch: java.lang.Exception -> L8e
            goto L98
        L84:
            X.A2F r0 = X.A2G.LIZ     // Catch: java.lang.Exception -> L8e
            r0.getClass()     // Catch: java.lang.Exception -> L8e
            X.A2H r0 = X.A2F.LIZ(r6)     // Catch: java.lang.Exception -> L8e
            goto L98
        L8e:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM.gv0(long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        return gv0(l.longValue(), interfaceC67352kd);
    }
}
