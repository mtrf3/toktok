package com.ss.ugc.effectplatform.model.net;

import X.XDH;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class FetchHotEffectResponse extends XDH<FetchHotEffectResponse> {
    public Data data;
    public boolean isFromCache;
    public String message;
    public int status_code;

    /* loaded from: classes16.dex */
    public static class Data {
        public final CategoryEffectModel category_effects;
        public Extra extra;
        public List<String> url_prefix;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public List<Effect> getCollection() {
            return this.category_effects.getCollection();
        }

        public List<Effect> getEffects() {
            return this.category_effects.getCategory_effects();
        }

        public String getRecId() {
            Extra extra = this.extra;
            if (extra != null) {
                return extra.getRec_id();
            }
            return null;
        }

        public final Extra getExtra() {
            return this.extra;
        }

        public List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public void setCollection(List<? extends Effect> value) {
            o.LJIIJ(value, "value");
            this.category_effects.setCollection(value);
        }

        public void setEffects(List<? extends Effect> value) {
            o.LJIIJ(value, "value");
            this.category_effects.setCategory_effects(value);
        }

        public final void setExtra(Extra extra) {
            this.extra = extra;
        }

        public void setRecId(String str) {
            Extra extra = this.extra;
            if (extra != null) {
                extra.setRec_id(str);
            }
        }

        public void setUrl_prefix(List<String> list) {
            o.LJIIJ(list, "<set-?>");
            this.url_prefix = list;
        }

        public Data(CategoryEffectModel category_effects, Extra extra, List<String> url_prefix) {
            o.LJIIJ(category_effects, "category_effects");
            o.LJIIJ(url_prefix, "url_prefix");
            this.category_effects = category_effects;
            this.extra = extra;
            this.url_prefix = url_prefix;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Data(CategoryEffectModel categoryEffectModel, Extra extra, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new CategoryEffectModel(null, null, false, 0, 0, null, null, null, 255, null) : categoryEffectModel, (i & 2) != 0 ? new Extra(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : extra, (i & 4) != 0 ? new ArrayList() : list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FetchHotEffectResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public FetchHotEffectResponse getResponseData() {
        return this;
    }

    @Override // X.XDH
    public boolean checkValue() {
        if (getEffect_list() != null && (!r0.isEmpty())) {
            return true;
        }
        return false;
    }

    public final List<Effect> getCollection_list() {
        return getData().getCollection();
    }

    public final List<Effect> getEffect_list() {
        return getData().getEffects();
    }

    public String getRecId() {
        Data data = getData();
        if (data != null) {
            return data.getRecId();
        }
        return null;
    }

    @Override // X.XDH
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // X.XDH
    public int getStatusCode() {
        return getStatus_code();
    }

    public List<String> getUrlPrefix() {
        return getData().getUrl_prefix();
    }

    /* loaded from: classes16.dex */
    public static class Extra {
        public List<CategoryPageModel.FilterEffect> filtered_effects;
        public String rec_id;

        /* JADX WARN: Multi-variable type inference failed */
        public Extra() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final List<CategoryPageModel.FilterEffect> getFiltered_effects() {
            return this.filtered_effects;
        }

        public String getRec_id() {
            return this.rec_id;
        }

        public final void setFiltered_effects(List<CategoryPageModel.FilterEffect> list) {
            this.filtered_effects = list;
        }

        public void setRec_id(String str) {
            this.rec_id = str;
        }

        public Extra(String str, List<CategoryPageModel.FilterEffect> list) {
            this.rec_id = str;
            this.filtered_effects = list;
        }

        public /* synthetic */ Extra(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
        }
    }

    /* loaded from: classes16.dex */
    public static final class FilterEffect {
        public Long Id;
        public Long ReasonCode;
        public String ReasonMsg;

        /* JADX WARN: Multi-variable type inference failed */
        public FilterEffect() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final Long getId() {
            return this.Id;
        }

        public final Long getReasonCode() {
            return this.ReasonCode;
        }

        public final String getReasonMsg() {
            return this.ReasonMsg;
        }

        public final void setId(Long l) {
            this.Id = l;
        }

        public final void setReasonCode(Long l) {
            this.ReasonCode = l;
        }

        public final void setReasonMsg(String str) {
            this.ReasonMsg = str;
        }

        public FilterEffect(Long l, Long l2, String str) {
            this.Id = l;
            this.ReasonCode = l2;
            this.ReasonMsg = str;
        }

        public /* synthetic */ FilterEffect(Long l, Long l2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str);
        }
    }

    public Data getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // X.XDH
    public /* bridge */ /* synthetic */ FetchHotEffectResponse getResponseData() {
        getResponseData();
        return this;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public final boolean isFromCache() {
        return this.isFromCache;
    }

    public final void setCollection_list(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        getData().setCollection(value);
    }

    public void setData(Data data) {
        o.LJIIJ(data, "<set-?>");
        this.data = data;
    }

    public final void setEffect_list(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        getData().setEffects(value);
    }

    public final void setFromCache(boolean z) {
        this.isFromCache = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setRecId(String str) {
        Data data = getData();
        if (data != null) {
            data.setRecId(str);
        }
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setUrlPrefix(List<String> value) {
        o.LJIIJ(value, "value");
        Data data = getData();
        if (data != null) {
            data.setUrl_prefix(value);
        }
    }

    public FetchHotEffectResponse(Data data, String str, int i) {
        o.LJIIJ(data, "data");
        this.data = data;
        this.message = str;
        this.status_code = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ FetchHotEffectResponse(Data data, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new Data(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0) : data, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
