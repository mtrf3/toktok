package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FetchHotEffectResponse extends FetchHotEffectResponseTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel;

    /* JADX WARN: Multi-variable type inference failed */
    public FetchHotEffectResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* loaded from: classes16.dex */
    public static final class Data extends FetchHotEffectResponseTemplate.DataTemplate implements Serializable {
        public final transient FetchHotEffectResponse.Data kData;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public List<com.ss.ugc.effectplatform.model.Effect> getCollection() {
            List<com.ss.ugc.effectplatform.model.Effect> collection;
            FetchHotEffectResponse.Data kData = getKData();
            if (kData != null && (collection = kData.getCollection()) != null) {
                return collection;
            }
            return super.getCollection();
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public List<com.ss.ugc.effectplatform.model.Effect> getEffects() {
            List<com.ss.ugc.effectplatform.model.Effect> effects;
            FetchHotEffectResponse.Data kData = getKData();
            if (kData != null && (effects = kData.getEffects()) != null) {
                return effects;
            }
            return super.getEffects();
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public String getRecId() {
            String recId;
            FetchHotEffectResponse.Data kData = getKData();
            if (kData != null && (recId = kData.getRecId()) != null) {
                return recId;
            }
            return super.getRecId();
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public List<String> getUrl_prefix() {
            List<String> url_prefix;
            FetchHotEffectResponse.Data kData = getKData();
            if (kData != null && (url_prefix = kData.getUrl_prefix()) != null) {
                return url_prefix;
            }
            return super.getUrl_prefix();
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.DataTemplate
        public FetchHotEffectResponse.Data getKData() {
            return this.kData;
        }

        public Data(FetchHotEffectResponse.Data data) {
            super(data);
            this.kData = data;
            FetchHotEffectResponse.Data kData = getKData();
            if (kData != null) {
                List<com.ss.ugc.effectplatform.model.Effect> collection = kData.getCollection();
                if (collection != null) {
                    super.setCollection(collection);
                }
                List<com.ss.ugc.effectplatform.model.Effect> effects = kData.getEffects();
                if (effects != null) {
                    super.setEffects(effects);
                }
                FetchHotEffectResponse.Extra extra = kData.getExtra();
                if (extra != null) {
                    setExtra(extra);
                }
                String recId = kData.getRecId();
                if (recId != null) {
                    super.setRecId(recId);
                }
                List<String> url_prefix = kData.getUrl_prefix();
                if (url_prefix != null) {
                    super.setUrl_prefix(url_prefix);
                }
            }
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public void setCollection(List<? extends com.ss.ugc.effectplatform.model.Effect> value) {
            o.LJIIJ(value, "value");
            FetchHotEffectResponse.Data kData = getKData();
            if (kData != null) {
                kData.setCollection(value);
            }
            super.setCollection(value);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public void setEffects(List<? extends com.ss.ugc.effectplatform.model.Effect> value) {
            o.LJIIJ(value, "value");
            FetchHotEffectResponse.Data kData = getKData();
            if (kData != null) {
                kData.setEffects(value);
            }
            super.setEffects(value);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public void setRecId(String str) {
            FetchHotEffectResponse.Data kData = getKData();
            if (kData != null) {
                kData.setRecId(str);
            }
            super.setRecId(str);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Data
        public void setUrl_prefix(List<String> value) {
            o.LJIIJ(value, "value");
            FetchHotEffectResponse.Data kData = getKData();
            if (kData != null) {
                kData.setUrl_prefix(value);
            }
            super.setUrl_prefix(value);
        }

        public /* synthetic */ Data(FetchHotEffectResponse.Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : data);
        }
    }

    /* loaded from: classes16.dex */
    public static final class Extra extends FetchHotEffectResponseTemplate.ExtraTemplate implements Serializable {
        public final transient FetchHotEffectResponse.Extra kData;

        /* JADX WARN: Multi-variable type inference failed */
        public Extra() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Extra
        public String getRec_id() {
            String rec_id;
            FetchHotEffectResponse.Extra kData = getKData();
            if (kData != null && (rec_id = kData.getRec_id()) != null) {
                return rec_id;
            }
            return super.getRec_id();
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.ExtraTemplate
        public FetchHotEffectResponse.Extra getKData() {
            return this.kData;
        }

        public Extra(FetchHotEffectResponse.Extra extra) {
            super(extra);
            this.kData = extra;
            FetchHotEffectResponse.Extra kData = getKData();
            if (kData != null) {
                List<CategoryPageModel.FilterEffect> filtered_effects = kData.getFiltered_effects();
                if (filtered_effects != null) {
                    setFiltered_effects(filtered_effects);
                }
                String rec_id = kData.getRec_id();
                if (rec_id != null) {
                    super.setRec_id(rec_id);
                }
            }
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse.Extra
        public void setRec_id(String str) {
            FetchHotEffectResponse.Extra kData = getKData();
            if (kData != null) {
                kData.setRec_id(str);
            }
            super.setRec_id(str);
        }

        public /* synthetic */ Extra(FetchHotEffectResponse.Extra extra, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : extra);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public List<Effect> getCollection() {
        return super.getCollection();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public FetchHotEffectResponse.Data getData() {
        FetchHotEffectResponse.Data data;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel = getKFetchHotModel();
        if (kFetchHotModel != null && (data = kFetchHotModel.getData()) != null) {
            return data;
        }
        return super.getData();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public List<Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public String getMessage() {
        String message;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel = getKFetchHotModel();
        if (kFetchHotModel != null && (message = kFetchHotModel.getMessage()) != null) {
            return message;
        }
        return super.getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public String getRecId() {
        String recId;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel = getKFetchHotModel();
        if (kFetchHotModel != null && (recId = kFetchHotModel.getRecId()) != null) {
            return recId;
        }
        return super.getRecId();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public int getStatus_code() {
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel = getKFetchHotModel();
        if (kFetchHotModel != null) {
            return kFetchHotModel.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public List<String> getUrlPrefix() {
        List<String> urlPrefix;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel = getKFetchHotModel();
        if (kFetchHotModel != null && (urlPrefix = kFetchHotModel.getUrlPrefix()) != null) {
            return urlPrefix;
        }
        return super.getUrlPrefix();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse getKFetchHotModel() {
        return this.kFetchHotModel;
    }

    public FetchHotEffectResponse(com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse fetchHotEffectResponse) {
        super(fetchHotEffectResponse);
        this.kFetchHotModel = fetchHotEffectResponse;
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel = getKFetchHotModel();
        if (kFetchHotModel != null) {
            List<com.ss.ugc.effectplatform.model.Effect> collection_list = kFetchHotModel.getCollection_list();
            if (collection_list != null) {
                setCollection_list(collection_list);
            }
            FetchHotEffectResponse.Data data = kFetchHotModel.getData();
            if (data != null) {
                super.setData(data);
            }
            List<com.ss.ugc.effectplatform.model.Effect> effect_list = kFetchHotModel.getEffect_list();
            if (effect_list != null) {
                setEffect_list(effect_list);
            }
            setFromCache(kFetchHotModel.isFromCache());
            String message = kFetchHotModel.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            String recId = kFetchHotModel.getRecId();
            if (recId != null) {
                super.setRecId(recId);
            }
            super.setStatus_code(kFetchHotModel.getStatus_code());
            List<String> urlPrefix = kFetchHotModel.getUrlPrefix();
            if (urlPrefix != null) {
                super.setUrlPrefix(urlPrefix);
            }
        }
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public void setData(FetchHotEffectResponse.Data value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel = getKFetchHotModel();
        if (kFetchHotModel != null) {
            kFetchHotModel.setData(value);
        }
        super.setData(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate
    public void setEffects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        super.setEffects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public void setMessage(String str) {
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel = getKFetchHotModel();
        if (kFetchHotModel != null) {
            kFetchHotModel.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public void setRecId(String str) {
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel = getKFetchHotModel();
        if (kFetchHotModel != null) {
            kFetchHotModel.setRecId(str);
        }
        super.setRecId(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public void setStatus_code(int i) {
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel = getKFetchHotModel();
        if (kFetchHotModel != null) {
            kFetchHotModel.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse
    public void setUrlPrefix(List<String> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse kFetchHotModel = getKFetchHotModel();
        if (kFetchHotModel != null) {
            kFetchHotModel.setUrlPrefix(value);
        }
        super.setUrlPrefix(value);
    }

    public /* synthetic */ FetchHotEffectResponse(com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse fetchHotEffectResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fetchHotEffectResponse);
    }
}
