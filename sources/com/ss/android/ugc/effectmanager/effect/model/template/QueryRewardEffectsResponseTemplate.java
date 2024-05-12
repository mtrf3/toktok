package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class QueryRewardEffectsResponseTemplate extends QueryRewardEffectsResponse {
    public final transient QueryRewardEffectsResponse kQueryRewardEffectsResponse;
    public List<? extends Effect> rewardEffects;

    /* JADX WARN: Multi-variable type inference failed */
    public QueryRewardEffectsResponseTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getRewardEffects() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse r3 = r4.getKQueryRewardEffectsResponse()
            if (r3 == 0) goto L4d
            java.util.List r1 = r3.getReward_effects()
            if (r1 == 0) goto L4d
        Lc:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L47
            r0 = 0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r0)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L1e
        L1d:
            return r1
        L1e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r1.next()
            com.ss.ugc.effectplatform.model.Effect r0 = (com.ss.ugc.effectplatform.model.Effect) r0
            X.C62850Ola.LJII(r0, r2)
            goto L2d
        L3d:
            if (r3 == 0) goto L42
            r3.setReward_effects(r2)
        L42:
            super.setReward_effects(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = super.getReward_effects()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.QueryRewardEffectsResponseTemplate.getRewardEffects():java.util.List");
    }

    public QueryRewardEffectsResponse getKQueryRewardEffectsResponse() {
        return this.kQueryRewardEffectsResponse;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QueryRewardEffectsResponseTemplate(com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse r11) {
        /*
            r10 = this;
            r2 = 0
            r3 = 0
            r8 = 63
            r1 = r10
            r4 = r2
            r5 = r3
            r6 = r3
            r7 = r2
            r9 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.kQueryRewardEffectsResponse = r11
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.rewardEffects = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.QueryRewardEffectsResponseTemplate.<init>(com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse):void");
    }

    public void setRewardEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.rewardEffects = value;
        QueryRewardEffectsResponse kQueryRewardEffectsResponse = getKQueryRewardEffectsResponse();
        if (kQueryRewardEffectsResponse != null) {
            kQueryRewardEffectsResponse.setReward_effects(value);
        }
        super.setReward_effects(value);
    }

    public /* synthetic */ QueryRewardEffectsResponseTemplate(QueryRewardEffectsResponse queryRewardEffectsResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : queryRewardEffectsResponse);
    }
}
