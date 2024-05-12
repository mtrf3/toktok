package com.ss.ugc.effectplatform.model.net;

import X.XDH;
import com.ss.ugc.effectplatform.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class QueryRewardEffectsResponse extends XDH<QueryRewardEffectsResponse> {
    public boolean has_more;
    public String message;
    public int next_cursor;
    public List<? extends Effect> reward_effects;
    public int status_code;
    public List<String> url_prefix;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public QueryRewardEffectsResponse() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r7 = 63
            r0 = r9
            r3 = r1
            r4 = r2
            r5 = r2
            r6 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.model.net.QueryRewardEffectsResponse.<init>():void");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // X.XDH
    public QueryRewardEffectsResponse getResponseData() {
        return this;
    }

    @Override // X.XDH
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // X.XDH
    public int getStatusCode() {
        return getStatus_code();
    }

    public boolean getHas_more() {
        return this.has_more;
    }

    public String getMessage() {
        return this.message;
    }

    public int getNext_cursor() {
        return this.next_cursor;
    }

    @Override // X.XDH
    public /* bridge */ /* synthetic */ QueryRewardEffectsResponse getResponseData() {
        getResponseData();
        return this;
    }

    public List<Effect> getReward_effects() {
        return this.reward_effects;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public List<String> getUrl_prefix() {
        return this.url_prefix;
    }

    public void setHas_more(boolean z) {
        this.has_more = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setNext_cursor(int i) {
        this.next_cursor = i;
    }

    public void setReward_effects(List<? extends Effect> list) {
        o.LJIIJ(list, "<set-?>");
        this.reward_effects = list;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setUrl_prefix(List<String> list) {
        o.LJIIJ(list, "<set-?>");
        this.url_prefix = list;
    }

    public QueryRewardEffectsResponse(List<String> url_prefix, int i, String str, boolean z, int i2, List<? extends Effect> reward_effects) {
        o.LJIIJ(url_prefix, "url_prefix");
        o.LJIIJ(reward_effects, "reward_effects");
        this.url_prefix = url_prefix;
        this.status_code = i;
        this.message = str;
        this.has_more = z;
        this.next_cursor = i2;
        this.reward_effects = reward_effects;
    }

    public /* synthetic */ QueryRewardEffectsResponse(List list, int i, String str, boolean z, int i2, List list2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? new ArrayList() : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? false : z, (i3 & 16) == 0 ? i2 : 0, (i3 & 32) != 0 ? new ArrayList() : list2);
    }
}
