package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class FetchHotEffectResponseTemplate extends FetchHotEffectResponse {
    public final transient FetchHotEffectResponse kFetchHotModel;

    /* JADX WARN: Multi-variable type inference failed */
    public FetchHotEffectResponseTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
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
            com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse r3 = r4.getKFetchHotModel()
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.getCollection():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (r1 != null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        /*
            r4 = this;
            com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse r3 = r4.getKFetchHotModel()
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.getEffects():java.util.List");
    }

    /* loaded from: classes16.dex */
    public static class DataTemplate extends FetchHotEffectResponse.Data {
        public final transient FetchHotEffectResponse.Data kData;

        /* JADX WARN: Multi-variable type inference failed */
        public DataTemplate() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public FetchHotEffectResponse.Data getKData() {
            return this.kData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DataTemplate(FetchHotEffectResponse.Data data) {
            super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
            this.kData = data;
        }

        public /* synthetic */ DataTemplate(FetchHotEffectResponse.Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : data);
        }
    }

    /* loaded from: classes16.dex */
    public static class ExtraTemplate extends FetchHotEffectResponse.Extra {
        public final transient FetchHotEffectResponse.Extra kData;

        /* JADX WARN: Multi-variable type inference failed */
        public ExtraTemplate() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public FetchHotEffectResponse.Extra getKData() {
            return this.kData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ExtraTemplate(FetchHotEffectResponse.Extra extra) {
            super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            this.kData = extra;
        }

        public /* synthetic */ ExtraTemplate(FetchHotEffectResponse.Extra extra, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : extra);
        }
    }

    public FetchHotEffectResponse getKFetchHotModel() {
        return this.kFetchHotModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FetchHotEffectResponseTemplate(FetchHotEffectResponse fetchHotEffectResponse) {
        super(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
        this.kFetchHotModel = fetchHotEffectResponse;
    }

    public void setEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        FetchHotEffectResponse kFetchHotModel = getKFetchHotModel();
        if (kFetchHotModel != null) {
            kFetchHotModel.setEffect_list(value);
        }
        setEffect_list(value);
    }

    public /* synthetic */ FetchHotEffectResponseTemplate(FetchHotEffectResponse fetchHotEffectResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fetchHotEffectResponse);
    }
}
