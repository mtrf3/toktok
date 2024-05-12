package com.ss.ugc.effectplatform.model.net;

import X.C47261Igj;
import X.XDH;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class FetchFavoriteListResponse extends XDH<FetchFavoriteListResponse> {
    public List<? extends Data> data;
    public String message;
    public int status_code;

    /* JADX WARN: Multi-variable type inference failed */
    public FetchFavoriteListResponse() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public FetchFavoriteListResponse getResponseData() {
        return this;
    }

    @Override // X.XDH
    public boolean checkValue() {
        return !getData().isEmpty();
    }

    public final List<Effect> getCollection_effects() {
        return ((Data) ListProtector.get(getData(), 0)).getCollection();
    }

    public final List<Effect> getEffect_list() {
        return ((Data) ListProtector.get(getData(), 0)).getEffects();
    }

    @Override // X.XDH
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // X.XDH
    public int getStatusCode() {
        return getStatus_code();
    }

    /* loaded from: classes16.dex */
    public static class Data {
        public List<? extends Effect> bind_effects;
        public List<? extends Effect> collection;
        public List<? extends Effect> effects;
        public String type;
        public List<String> url_prefix;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        public List<Effect> getBind_effects() {
            return this.bind_effects;
        }

        public List<Effect> getCollection() {
            return this.collection;
        }

        public List<Effect> getEffects() {
            return this.effects;
        }

        public String getType() {
            return this.type;
        }

        public List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public void setBind_effects(List<? extends Effect> list) {
            o.LJIIJ(list, "<set-?>");
            this.bind_effects = list;
        }

        public void setCollection(List<? extends Effect> list) {
            o.LJIIJ(list, "<set-?>");
            this.collection = list;
        }

        public void setEffects(List<? extends Effect> list) {
            o.LJIIJ(list, "<set-?>");
            this.effects = list;
        }

        public void setType(String str) {
            o.LJIIJ(str, "<set-?>");
            this.type = str;
        }

        public void setUrl_prefix(List<String> list) {
            o.LJIIJ(list, "<set-?>");
            this.url_prefix = list;
        }

        public Data(String type, List<? extends Effect> effects, List<? extends Effect> collection, List<? extends Effect> bind_effects, List<String> url_prefix) {
            o.LJIIJ(type, "type");
            o.LJIIJ(effects, "effects");
            o.LJIIJ(collection, "collection");
            o.LJIIJ(bind_effects, "bind_effects");
            o.LJIIJ(url_prefix, "url_prefix");
            this.type = type;
            this.effects = effects;
            this.collection = collection;
            this.bind_effects = bind_effects;
            this.url_prefix = url_prefix;
        }

        public /* synthetic */ Data(String str, List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ArrayList() : list2, (i & 8) != 0 ? new ArrayList() : list3, (i & 16) != 0 ? new ArrayList() : list4);
        }
    }

    public List<Data> getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // X.XDH
    public /* bridge */ /* synthetic */ FetchFavoriteListResponse getResponseData() {
        getResponseData();
        return this;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setCollection_effects(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        if (getData().isEmpty()) {
            setData(C47261Igj.LJII(new Data(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0)));
        }
        ((Data) ListProtector.get(getData(), 0)).setCollection(value);
    }

    public void setData(List<? extends Data> list) {
        o.LJIIJ(list, "<set-?>");
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setEffect_list(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        if (getData().isEmpty()) {
            setData(C47261Igj.LJII(new Data(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0)));
        }
        ((Data) ListProtector.get(getData(), 0)).setEffects(value);
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public FetchFavoriteListResponse(List<? extends Data> data, String str, int i) {
        o.LJIIJ(data, "data");
        this.data = data;
        this.message = str;
        this.status_code = i;
    }

    public /* synthetic */ FetchFavoriteListResponse(List list, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
