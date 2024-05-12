package com.ss.ugc.effectplatform.model.net;

import X.XDH;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class SearchEffectResponse extends XDH<SearchEffectResponse> {
    public List<? extends Effect> bind_effects;
    public List<? extends Effect> collection;
    public int cursor;
    public List<? extends Effect> effects;
    public boolean has_more;
    public String message;
    public int status_code;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchEffectResponse() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r1
            r7 = r3
            r9 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.net.SearchEffectResponse.<init>():void");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public SearchEffectResponse getResponseData() {
        return this;
    }

    @Override // X.XDH
    public boolean checkValue() {
        return !getEffect_list().isEmpty();
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

    public int getCursor() {
        return this.cursor;
    }

    public final List<Effect> getEffect_list() {
        return this.effects;
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public String getMessage() {
        return this.message;
    }

    @Override // X.XDH
    public /* bridge */ /* synthetic */ SearchEffectResponse getResponseData() {
        getResponseData();
        return this;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public void setBind_effects(List<? extends Effect> list) {
        o.LJIIJ(list, "<set-?>");
        this.bind_effects = list;
    }

    public final void setCollection_list(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.collection = value;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public final void setEffect_list(List<? extends Effect> value) {
        o.LJIIJ(value, "value");
        this.effects = value;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public SearchEffectResponse(boolean z, int i, List<? extends Effect> effects, List<? extends Effect> collection, List<? extends Effect> bind_effects, int i2, String str) {
        o.LJIIJ(effects, "effects");
        o.LJIIJ(collection, "collection");
        o.LJIIJ(bind_effects, "bind_effects");
        this.has_more = z;
        this.cursor = i;
        this.effects = effects;
        this.collection = collection;
        this.bind_effects = bind_effects;
        this.status_code = i2;
        this.message = str;
    }

    public /* synthetic */ SearchEffectResponse(boolean z, int i, List list, List list2, List list3, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? new ArrayList() : list, (i3 & 8) != 0 ? new ArrayList() : list2, (i3 & 16) != 0 ? new ArrayList() : list3, (i3 & 32) == 0 ? i2 : 0, (i3 & 64) != 0 ? null : str);
    }
}
