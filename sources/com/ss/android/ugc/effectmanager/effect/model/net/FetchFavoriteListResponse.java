package com.ss.android.ugc.effectmanager.effect.model.net;

import com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class FetchFavoriteListResponse extends FetchFavoriteListResponseTemplate implements Serializable {
    public final transient com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel;

    /* JADX WARN: Multi-variable type inference failed */
    public FetchFavoriteListResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* loaded from: classes16.dex */
    public static final class Data extends FetchFavoriteListResponseTemplate.DataTemplate implements Serializable {
        public final transient FetchFavoriteListResponse.Data kData;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public List<Effect> getBind_effects() {
            List<Effect> bind_effects;
            FetchFavoriteListResponse.Data kData = getKData();
            if (kData != null && (bind_effects = kData.getBind_effects()) != null) {
                return bind_effects;
            }
            return super.getBind_effects();
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public List<Effect> getCollection() {
            List<Effect> collection;
            FetchFavoriteListResponse.Data kData = getKData();
            if (kData != null && (collection = kData.getCollection()) != null) {
                return collection;
            }
            return super.getCollection();
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public List<Effect> getEffects() {
            List<Effect> effects;
            FetchFavoriteListResponse.Data kData = getKData();
            if (kData != null && (effects = kData.getEffects()) != null) {
                return effects;
            }
            return super.getEffects();
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public String getType() {
            String type;
            FetchFavoriteListResponse.Data kData = getKData();
            if (kData != null && (type = kData.getType()) != null) {
                return type;
            }
            return super.getType();
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public List<String> getUrl_prefix() {
            List<String> url_prefix;
            FetchFavoriteListResponse.Data kData = getKData();
            if (kData != null && (url_prefix = kData.getUrl_prefix()) != null) {
                return url_prefix;
            }
            return super.getUrl_prefix();
        }

        @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate.DataTemplate
        public FetchFavoriteListResponse.Data getKData() {
            return this.kData;
        }

        public Data(FetchFavoriteListResponse.Data data) {
            super(data);
            this.kData = data;
            FetchFavoriteListResponse.Data kData = getKData();
            if (kData != null) {
                List<Effect> bind_effects = kData.getBind_effects();
                if (bind_effects != null) {
                    super.setBind_effects(bind_effects);
                }
                List<Effect> collection = kData.getCollection();
                if (collection != null) {
                    super.setCollection(collection);
                }
                List<Effect> effects = kData.getEffects();
                if (effects != null) {
                    super.setEffects(effects);
                }
                String type = kData.getType();
                if (type != null) {
                    super.setType(type);
                }
                List<String> url_prefix = kData.getUrl_prefix();
                if (url_prefix != null) {
                    super.setUrl_prefix(url_prefix);
                }
            }
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public void setBind_effects(List<? extends Effect> value) {
            o.LJIIJ(value, "value");
            FetchFavoriteListResponse.Data kData = getKData();
            if (kData != null) {
                kData.setBind_effects(value);
            }
            super.setBind_effects(value);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public void setCollection(List<? extends Effect> value) {
            o.LJIIJ(value, "value");
            FetchFavoriteListResponse.Data kData = getKData();
            if (kData != null) {
                kData.setCollection(value);
            }
            super.setCollection(value);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public void setEffects(List<? extends Effect> value) {
            o.LJIIJ(value, "value");
            FetchFavoriteListResponse.Data kData = getKData();
            if (kData != null) {
                kData.setEffects(value);
            }
            super.setEffects(value);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public void setType(String value) {
            o.LJIIJ(value, "value");
            FetchFavoriteListResponse.Data kData = getKData();
            if (kData != null) {
                kData.setType(value);
            }
            super.setType(value);
        }

        @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse.Data
        public void setUrl_prefix(List<String> value) {
            o.LJIIJ(value, "value");
            FetchFavoriteListResponse.Data kData = getKData();
            if (kData != null) {
                kData.setUrl_prefix(value);
            }
            super.setUrl_prefix(value);
        }

        public /* synthetic */ Data(FetchFavoriteListResponse.Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : data);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public List<com.ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollectEffects() {
        return super.getCollectEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public List<FetchFavoriteListResponse.Data> getData() {
        List<FetchFavoriteListResponse.Data> data;
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel = getKFavoriteModel();
        if (kFavoriteModel != null && (data = kFavoriteModel.getData()) != null) {
            return data;
        }
        return super.getData();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public String getMessage() {
        String message;
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel = getKFavoriteModel();
        if (kFavoriteModel != null && (message = kFavoriteModel.getMessage()) != null) {
            return message;
        }
        return super.getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public int getStatus_code() {
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel = getKFavoriteModel();
        if (kFavoriteModel != null) {
            return kFavoriteModel.getStatus_code();
        }
        return super.getStatus_code();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public String getType() {
        return super.getType();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse getKFavoriteModel() {
        return this.kFavoriteModel;
    }

    public FetchFavoriteListResponse(com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse fetchFavoriteListResponse) {
        super(fetchFavoriteListResponse);
        this.kFavoriteModel = fetchFavoriteListResponse;
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel = getKFavoriteModel();
        if (kFavoriteModel != null) {
            List<Effect> collection_effects = kFavoriteModel.getCollection_effects();
            if (collection_effects != null) {
                setCollection_effects(collection_effects);
            }
            List<FetchFavoriteListResponse.Data> data = kFavoriteModel.getData();
            if (data != null) {
                super.setData(data);
            }
            List<Effect> effect_list = kFavoriteModel.getEffect_list();
            if (effect_list != null) {
                setEffect_list(effect_list);
            }
            String message = kFavoriteModel.getMessage();
            if (message != null) {
                super.setMessage(message);
            }
            super.setStatus_code(kFavoriteModel.getStatus_code());
        }
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public void setData(List<? extends FetchFavoriteListResponse.Data> value) {
        o.LJIIJ(value, "value");
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel = getKFavoriteModel();
        if (kFavoriteModel != null) {
            kFavoriteModel.setData(value);
        }
        super.setData(value);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate
    public void setEffects(List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> value) {
        o.LJIIJ(value, "value");
        super.setEffects(value);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public void setMessage(String str) {
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel = getKFavoriteModel();
        if (kFavoriteModel != null) {
            kFavoriteModel.setMessage(str);
        }
        super.setMessage(str);
    }

    @Override // com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse
    public void setStatus_code(int i) {
        com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse kFavoriteModel = getKFavoriteModel();
        if (kFavoriteModel != null) {
            kFavoriteModel.setStatus_code(i);
        }
        super.setStatus_code(i);
    }

    public /* synthetic */ FetchFavoriteListResponse(com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse fetchFavoriteListResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fetchFavoriteListResponse);
    }
}
