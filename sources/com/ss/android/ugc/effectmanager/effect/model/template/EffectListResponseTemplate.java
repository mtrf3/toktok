package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectListResponseTemplate extends EffectListResponse {
    public List<? extends Effect> bindEffects;
    public final transient EffectListResponse kEffectList;
    public List<String> urlPrefix;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectListResponseTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.net.EffectListResponse r3 = r4.getKEffectList()
            if (r3 == 0) goto L4d
            java.util.List r1 = r3.getBind_effects()
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
            r3.setBind_effects(r2)
        L42:
            super.setBind_effects(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = super.getBind_effects()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate.getBindEffects():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollection() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.net.EffectListResponse r3 = r4.getKEffectList()
            if (r3 == 0) goto L4d
            java.util.List r1 = r3.getCollection_list()
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
            r3.setCollection_list(r2)
        L42:
            r4.setCollection_list(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = r4.getCollection_list()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate.getCollection():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getData() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.net.EffectListResponse r3 = r4.getKEffectList()
            if (r3 == 0) goto L4d
            java.util.List r1 = r3.getEffect_list()
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
            r3.setEffect_list(r2)
        L42:
            r4.setEffect_list(r2)
            r1 = r2
            goto L1d
        L47:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L1d
        L4d:
            java.util.List r1 = r4.getEffect_list()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate.getData():java.util.List");
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null && (url_prefix = kEffectList.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return super.getUrl_prefix();
    }

    public EffectListResponse getKEffectList() {
        return this.kEffectList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EffectListResponseTemplate(EffectListResponse effectListResponse) {
        super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
        this.kEffectList = effectListResponse;
        this.bindEffects = new ArrayList();
        this.urlPrefix = new ArrayList();
    }

    public void setBindEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.bindEffects = value;
        EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null) {
            kEffectList.setBind_effects(value);
        }
        super.setBind_effects(value);
    }

    public void setCollection(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null) {
            kEffectList.setCollection_list(value);
        }
        setCollection_list(value);
    }

    public void setData(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null) {
            kEffectList.setEffect_list(value);
        }
        setEffect_list(value);
    }

    public void setUrlPrefix(List<String> value) {
        o.LJIIJ(value, "value");
        this.urlPrefix = value;
        EffectListResponse kEffectList = getKEffectList();
        if (kEffectList != null) {
            kEffectList.setUrl_prefix(value);
        }
        super.setUrl_prefix(value);
    }

    public /* synthetic */ EffectListResponseTemplate(EffectListResponse effectListResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectListResponse);
    }
}
