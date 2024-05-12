package com.ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class FetchFavoriteListResponseTemplate extends FetchFavoriteListResponse {
    public final transient FetchFavoriteListResponse kFavoriteModel;

    /* JADX WARN: Multi-variable type inference failed */
    public FetchFavoriteListResponseTemplate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse r4 = r5.getKFavoriteModel()
            r3 = 0
            if (r4 == 0) goto L7f
            java.util.List r0 = r4.getData()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data r0 = (com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data) r0
            if (r0 == 0) goto L7f
            java.util.List r1 = r0.getBind_effects()
            if (r1 == 0) goto L7f
        L1b:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L79
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r3)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L2c
        L2b:
            return r1
        L2c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r1.next()
            com.ss.ugc.effectplatform.model.Effect r0 = (com.ss.ugc.effectplatform.model.Effect) r0
            X.C62850Ola.LJII(r0, r2)
            goto L3b
        L4b:
            if (r4 == 0) goto L5e
            java.util.List r0 = r4.getData()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data r0 = (com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data) r0
            if (r0 == 0) goto L5e
            r0.setBind_effects(r2)
        L5e:
            java.util.List r0 = super.getData()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L77
            java.util.List r0 = super.getData()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data r0 = (com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data) r0
            r0.setBind_effects(r2)
        L77:
            r1 = r2
            goto L2b
        L79:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L2b
        L7f:
            java.util.List r0 = super.getData()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data r0 = (com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data) r0
            java.util.List r1 = r0.getBind_effects()
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate.getBindEffects():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollectEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse r4 = r5.getKFavoriteModel()
            r3 = 0
            if (r4 == 0) goto L7f
            java.util.List r0 = r4.getData()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data r0 = (com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data) r0
            if (r0 == 0) goto L7f
            java.util.List r1 = r0.getCollection()
            if (r1 == 0) goto L7f
        L1b:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L79
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r3)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L2c
        L2b:
            return r1
        L2c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r1.next()
            com.ss.ugc.effectplatform.model.Effect r0 = (com.ss.ugc.effectplatform.model.Effect) r0
            X.C62850Ola.LJII(r0, r2)
            goto L3b
        L4b:
            if (r4 == 0) goto L5e
            java.util.List r0 = r4.getData()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data r0 = (com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data) r0
            if (r0 == 0) goto L5e
            r0.setCollection(r2)
        L5e:
            java.util.List r0 = super.getData()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L77
            java.util.List r0 = super.getData()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data r0 = (com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data) r0
            r0.setCollection(r2)
        L77:
            r1 = r2
            goto L2b
        L79:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L2b
        L7f:
            java.util.List r0 = super.getData()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data r0 = (com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data) r0
            java.util.List r1 = r0.getCollection()
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate.getCollectEffects():java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        /*
            r5 = this;
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse r4 = r5.getKFavoriteModel()
            r3 = 0
            if (r4 == 0) goto L7f
            java.util.List r0 = r4.getData()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data r0 = (com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data) r0
            if (r0 == 0) goto L7f
            java.util.List r1 = r0.getEffects()
            if (r1 == 0) goto L7f
        L1b:
            boolean r0 = r1.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L79
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r3)
            boolean r0 = r0 instanceof com.ss.android.ugc.effectmanager.effect.model.Effect
            if (r0 == 0) goto L2c
        L2b:
            return r1
        L2c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L3b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r1.next()
            com.ss.ugc.effectplatform.model.Effect r0 = (com.ss.ugc.effectplatform.model.Effect) r0
            X.C62850Ola.LJII(r0, r2)
            goto L3b
        L4b:
            if (r4 == 0) goto L5e
            java.util.List r0 = r4.getData()
            if (r0 == 0) goto L5e
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data r0 = (com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data) r0
            if (r0 == 0) goto L5e
            r0.setEffects(r2)
        L5e:
            java.util.List r0 = super.getData()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L77
            java.util.List r0 = super.getData()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data r0 = (com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data) r0
            r0.setEffects(r2)
        L77:
            r1 = r2
            goto L2b
        L79:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L2b
        L7f:
            java.util.List r0 = super.getData()
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data r0 = (com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data) r0
            java.util.List r1 = r0.getEffects()
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate.getEffects():java.util.List");
    }

    public String getType() {
        List<FetchFavoriteListResponse.Data> data;
        FetchFavoriteListResponse.Data data2;
        String type;
        FetchFavoriteListResponse kFavoriteModel = getKFavoriteModel();
        if (kFavoriteModel != null && (data = kFavoriteModel.getData()) != null && (data2 = (FetchFavoriteListResponse.Data) ListProtector.get(data, 0)) != null && (type = data2.getType()) != null) {
            return type;
        }
        return ((FetchFavoriteListResponse.Data) ListProtector.get(super.getData(), 0)).getType();
    }

    public List<String> getUrlPrefix() {
        List<FetchFavoriteListResponse.Data> data;
        FetchFavoriteListResponse.Data data2;
        List<String> url_prefix;
        FetchFavoriteListResponse kFavoriteModel = getKFavoriteModel();
        if (kFavoriteModel != null && (data = kFavoriteModel.getData()) != null && (data2 = (FetchFavoriteListResponse.Data) ListProtector.get(data, 0)) != null && (url_prefix = data2.getUrl_prefix()) != null) {
            return url_prefix;
        }
        return ((FetchFavoriteListResponse.Data) ListProtector.get(super.getData(), 0)).getUrl_prefix();
    }

    /* loaded from: classes16.dex */
    public static class DataTemplate extends FetchFavoriteListResponse.Data {
        public final transient FetchFavoriteListResponse.Data kData;

        /* JADX WARN: Multi-variable type inference failed */
        public DataTemplate() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public FetchFavoriteListResponse.Data getKData() {
            return this.kData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public DataTemplate(FetchFavoriteListResponse.Data data) {
            super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
            this.kData = data;
        }

        public /* synthetic */ DataTemplate(FetchFavoriteListResponse.Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : data);
        }
    }

    public FetchFavoriteListResponse getKFavoriteModel() {
        return this.kFavoriteModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FetchFavoriteListResponseTemplate(FetchFavoriteListResponse fetchFavoriteListResponse) {
        super(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
        this.kFavoriteModel = fetchFavoriteListResponse;
    }

    public void setEffects(List<? extends Effect> value) {
        List<FetchFavoriteListResponse.Data> data;
        FetchFavoriteListResponse.Data data2;
        o.LJIIJ(value, "value");
        FetchFavoriteListResponse kFavoriteModel = getKFavoriteModel();
        if (kFavoriteModel != null && (data = kFavoriteModel.getData()) != null && (data2 = (FetchFavoriteListResponse.Data) ListProtector.get(data, 0)) != null) {
            data2.setEffects(value);
        }
        if (!super.getData().isEmpty()) {
            ((FetchFavoriteListResponse.Data) ListProtector.get(super.getData(), 0)).setEffects(value);
        }
    }

    public /* synthetic */ FetchFavoriteListResponseTemplate(FetchFavoriteListResponse fetchFavoriteListResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fetchFavoriteListResponse);
    }
}
