package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public class CustomizedEffectsResponseTemplate extends CustomizedEffectsResponse {
    public List<? extends Effect> customEffects;
    public final transient CustomizedEffectsResponse kCustomizedEffectsResponse;
    public List<? extends Effect> templateEffects;

    /* JADX WARN: Multi-variable type inference failed */
    public CustomizedEffectsResponseTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCustomEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse r4 = r5.getKCustomizedEffectsResponse()
            if (r4 == 0) goto L4b
            java.util.List r3 = r4.getCustom_effects()
            if (r3 == 0) goto L4b
        Lc:
            r1 = 0
            if (r3 == 0) goto L15
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L17
        L15:
            r3 = 0
        L16:
            return r3
        L17:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L22
            if (r3 == 0) goto L50
            goto L16
        L22:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r3, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        L31:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r1.next()
            com.ss.ugc.effectplatform.model.Effect r0 = (com.ss.ugc.effectplatform.model.Effect) r0
            X.C62850Ola.LJII(r0, r2)
            goto L31
        L41:
            if (r4 == 0) goto L46
            r4.setCustom_effects(r2)
        L46:
            super.setCustom_effects(r2)
            r3 = r2
            goto L16
        L4b:
            java.util.List r3 = super.getCustom_effects()
            goto Lc
        L50:
            X.Eqm r1 = new X.Eqm
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.effectmanager.effect.model.Effect>"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.CustomizedEffectsResponseTemplate.getCustomEffects():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r3 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getTemplateEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.CustomizedEffectsResponse r4 = r5.getKCustomizedEffectsResponse()
            if (r4 == 0) goto L4b
            java.util.List r3 = r4.getTemplate_effects()
            if (r3 == 0) goto L4b
        Lc:
            r1 = 0
            if (r3 == 0) goto L15
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L17
        L15:
            r3 = 0
        L16:
            return r3
        L17:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L22
            if (r3 == 0) goto L50
            goto L16
        L22:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r3, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r3.iterator()
        L31:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r0 = r1.next()
            com.ss.ugc.effectplatform.model.Effect r0 = (com.ss.ugc.effectplatform.model.Effect) r0
            X.C62850Ola.LJII(r0, r2)
            goto L31
        L41:
            if (r4 == 0) goto L46
            r4.setTemplate_effects(r2)
        L46:
            super.setTemplate_effects(r2)
            r3 = r2
            goto L16
        L4b:
            java.util.List r3 = super.getTemplate_effects()
            goto Lc
        L50:
            X.Eqm r1 = new X.Eqm
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.effectmanager.effect.model.Effect>"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.CustomizedEffectsResponseTemplate.getTemplateEffects():java.util.List");
    }

    public CustomizedEffectsResponse getKCustomizedEffectsResponse() {
        return this.kCustomizedEffectsResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomizedEffectsResponseTemplate(CustomizedEffectsResponse customizedEffectsResponse) {
        super(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        this.kCustomizedEffectsResponse = customizedEffectsResponse;
    }

    public void setCustomEffects(List<? extends Effect> list) {
        this.customEffects = list;
        CustomizedEffectsResponse kCustomizedEffectsResponse = getKCustomizedEffectsResponse();
        if (kCustomizedEffectsResponse != null) {
            kCustomizedEffectsResponse.setCustom_effects(list);
        }
        super.setCustom_effects(list);
    }

    public void setTemplateEffects(List<? extends Effect> list) {
        this.templateEffects = list;
        CustomizedEffectsResponse kCustomizedEffectsResponse = getKCustomizedEffectsResponse();
        if (kCustomizedEffectsResponse != null) {
            kCustomizedEffectsResponse.setTemplate_effects(list);
        }
        super.setTemplate_effects(list);
    }

    public /* synthetic */ CustomizedEffectsResponseTemplate(CustomizedEffectsResponse customizedEffectsResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : customizedEffectsResponse);
    }
}
