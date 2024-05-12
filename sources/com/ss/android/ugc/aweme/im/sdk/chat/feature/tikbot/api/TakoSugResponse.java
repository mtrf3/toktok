package com.ss.android.ugc.aweme.im.sdk.chat.feature.tikbot.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.s0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TakoSugResponse extends BaseResponse {

    @InterfaceC65349Pkn("event_extra")
    public final Map<String, String> eventExtra;

    @InterfaceC65349Pkn("tikbot_sugs")
    public final List<TakoSug> sugList;

    @InterfaceC65349Pkn("sug_scene")
    public final Integer sugScene;

    @InterfaceC65349Pkn("tikbot_cards")
    public final List<TakoCard> takoCards;

    /* JADX WARN: Multi-variable type inference failed */
    public TakoSugResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TakoSugResponse copy$default(TakoSugResponse takoSugResponse, List list, Map map, List list2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = takoSugResponse.sugList;
        }
        if ((i & 2) != 0) {
            map = takoSugResponse.eventExtra;
        }
        if ((i & 4) != 0) {
            list2 = takoSugResponse.takoCards;
        }
        if ((i & 8) != 0) {
            num = takoSugResponse.sugScene;
        }
        return takoSugResponse.copy(list, map, list2, num);
    }

    public final TakoSugResponse copy(List<TakoSug> list, Map<String, String> map, List<TakoCard> list2, Integer num) {
        return new TakoSugResponse(list, map, list2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TakoSugResponse)) {
            return false;
        }
        TakoSugResponse takoSugResponse = (TakoSugResponse) obj;
        return o.LJ(this.sugList, takoSugResponse.sugList) && o.LJ(this.eventExtra, takoSugResponse.eventExtra) && o.LJ(this.takoCards, takoSugResponse.takoCards) && o.LJ(this.sugScene, takoSugResponse.sugScene);
    }

    public int hashCode() {
        List<TakoSug> list = this.sugList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Map<String, String> map = this.eventExtra;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        List<TakoCard> list2 = this.takoCards;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.sugScene;
        return hashCode3 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TakoSugResponse(sugList=");
        LIZ.append(this.sugList);
        LIZ.append(", eventExtra=");
        LIZ.append(this.eventExtra);
        LIZ.append(", takoCards=");
        LIZ.append(this.takoCards);
        LIZ.append(", sugScene=");
        return s0.LIZJ(LIZ, this.sugScene, ')', LIZ);
    }

    public final Map<String, String> getEventExtra() {
        return this.eventExtra;
    }

    public final List<TakoSug> getSugList() {
        return this.sugList;
    }

    public final Integer getSugScene() {
        return this.sugScene;
    }

    public final List<TakoCard> getTakoCards() {
        return this.takoCards;
    }

    public TakoSugResponse(List<TakoSug> list, Map<String, String> map, List<TakoCard> list2, Integer num) {
        this.sugList = list;
        this.eventExtra = map;
        this.takoCards = list2;
        this.sugScene = num;
    }

    public /* synthetic */ TakoSugResponse(List list, Map map, List list2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : num);
    }
}
