package com.ss.ugc.effectplatform.model.net;

import X.XDH;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EffectListPreloadResponse extends XDH<EffectListPreloadResponse> {
    public List<? extends Effect> bind_effects;
    public List<? extends Effect> collection;
    public List<? extends Effect> data;
    public String message;
    public final List<String> preloading_effect_id_list;
    public int status_code;
    public List<String> url_prefix;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public EffectListPreloadResponse getResponseData() {
        return this;
    }

    @Override // X.XDH
    public boolean checkValue() {
        return !this.data.isEmpty();
    }

    public final List<Effect> getPreloadEffectList() {
        ArrayList arrayList = new ArrayList();
        List<? extends Effect> list = this.data;
        if (list != null) {
            arrayList.addAll(list);
        }
        List<? extends Effect> list2 = this.collection;
        if (list2 != null) {
            arrayList.addAll(list2);
        }
        List<? extends Effect> list3 = this.bind_effects;
        if (list3 != null) {
            arrayList.addAll(list3);
        }
        return arrayList;
    }

    public final List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    public final List<Effect> getCollection() {
        return this.collection;
    }

    public final List<Effect> getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<String> getPreloading_effect_id_list() {
        return this.preloading_effect_id_list;
    }

    @Override // X.XDH
    public /* bridge */ /* synthetic */ EffectListPreloadResponse getResponseData() {
        getResponseData();
        return this;
    }

    @Override // X.XDH
    public String getResponseMessage() {
        return this.message;
    }

    @Override // X.XDH
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public final void setBind_effects(List<? extends Effect> list) {
        o.LJIIJ(list, "<set-?>");
        this.bind_effects = list;
    }

    public final void setCollection(List<? extends Effect> list) {
        o.LJIIJ(list, "<set-?>");
        this.collection = list;
    }

    public final void setData(List<? extends Effect> list) {
        o.LJIIJ(list, "<set-?>");
        this.data = list;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUrl_prefix(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.url_prefix = list;
    }

    public EffectListPreloadResponse(List<String> preloading_effect_id_list, List<? extends Effect> data, List<? extends Effect> collection, List<? extends Effect> bind_effects, List<String> url_prefix, int i, String str) {
        o.LJIIJ(preloading_effect_id_list, "preloading_effect_id_list");
        o.LJIIJ(data, "data");
        o.LJIIJ(collection, "collection");
        o.LJIIJ(bind_effects, "bind_effects");
        o.LJIIJ(url_prefix, "url_prefix");
        this.preloading_effect_id_list = preloading_effect_id_list;
        this.data = data;
        this.collection = collection;
        this.bind_effects = bind_effects;
        this.url_prefix = url_prefix;
        this.status_code = i;
        this.message = str;
    }

    public /* synthetic */ EffectListPreloadResponse(List list, List list2, List list3, List list4, List list5, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? new ArrayList() : list2, (i2 & 4) != 0 ? new ArrayList() : list3, (i2 & 8) != 0 ? new ArrayList() : list4, (i2 & 16) != 0 ? new ArrayList() : list5, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? null : str);
    }
}
