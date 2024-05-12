package com.ss.ugc.effectplatform.model.net;

import X.XDH;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class EffectListResponse extends XDH<List<? extends Effect>> {
    public List<? extends Effect> bind_effects;
    public List<? extends Effect> collection;
    public List<? extends Effect> data;
    public String message;
    public int status_code;
    public List<String> url_prefix;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectListResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    @Override // X.XDH
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // X.XDH
    public int getStatusCode() {
        return getStatus_code();
    }

    public List<Effect> getBind_effects() {
        return this.bind_effects;
    }

    public final List<Effect> getCollection_list() {
        return this.collection;
    }

    public final List<Effect> getEffect_list() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    @Override // X.XDH
    public List<? extends Effect> getResponseData() {
        return getEffect_list();
    }

    public void setBind_effects(List<? extends Effect> list) {
        o.LJIIJ(list, "<set-?>");
        this.bind_effects = list;
    }

    public final void setCollection_list(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.collection = value;
    }

    public final void setEffect_list(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.data = value;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setUrl_prefix(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.url_prefix = list;
    }

    public EffectListResponse(List<String> url_prefix, List<? extends Effect> bind_effects, List<? extends Effect> collection, int i, String str, List<? extends Effect> data) {
        o.LJIIJ(url_prefix, "url_prefix");
        o.LJIIJ(bind_effects, "bind_effects");
        o.LJIIJ(collection, "collection");
        o.LJIIJ(data, "data");
        this.url_prefix = url_prefix;
        this.bind_effects = bind_effects;
        this.collection = collection;
        this.status_code = i;
        this.message = str;
        this.data = data;
    }

    public /* synthetic */ EffectListResponse(List list, List list2, List list3, int i, String str, List list4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? new ArrayList() : list2, (i2 & 4) != 0 ? new ArrayList() : list3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? new ArrayList() : list4);
    }
}
