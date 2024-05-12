package com.ss.android.ugc.aweme.commercialize.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AdQuestionnaire implements Serializable {

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("gecko_channel")
    public List<String> geckoChannel;

    @InterfaceC65349Pkn("id")
    public int id;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("show_interval")
    public Integer showInterval;

    /* JADX WARN: Multi-variable type inference failed */
    public AdQuestionnaire() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdQuestionnaire copy$default(AdQuestionnaire adQuestionnaire, int i, String str, Integer num, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = adQuestionnaire.id;
        }
        if ((i2 & 2) != 0) {
            str = adQuestionnaire.content;
        }
        if ((i2 & 4) != 0) {
            num = adQuestionnaire.showInterval;
        }
        if ((i2 & 8) != 0) {
            str2 = adQuestionnaire.schema;
        }
        if ((i2 & 16) != 0) {
            list = adQuestionnaire.geckoChannel;
        }
        return adQuestionnaire.copy(i, str, num, str2, list);
    }

    public final AdQuestionnaire copy(int i, String str, Integer num, String str2, List<String> list) {
        return new AdQuestionnaire(i, str, num, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQuestionnaire)) {
            return false;
        }
        AdQuestionnaire adQuestionnaire = (AdQuestionnaire) obj;
        return this.id == adQuestionnaire.id && o.LJ(this.content, adQuestionnaire.content) && o.LJ(this.showInterval, adQuestionnaire.showInterval) && o.LJ(this.schema, adQuestionnaire.schema) && o.LJ(this.geckoChannel, adQuestionnaire.geckoChannel);
    }

    public int hashCode() {
        int i = this.id * 31;
        String str = this.content;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.showInterval;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.schema;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.geckoChannel;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AdQuestionnaire(id=");
        LIZ.append(this.id);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", showInterval=");
        LIZ.append(this.showInterval);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", geckoChannel=");
        return C1NE.LIZIZ(LIZ, this.geckoChannel, ')', LIZ);
    }

    public final String getContent() {
        return this.content;
    }

    public final List<String> getGeckoChannel() {
        return this.geckoChannel;
    }

    public final int getId() {
        return this.id;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final Integer getShowInterval() {
        return this.showInterval;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setGeckoChannel(List<String> list) {
        this.geckoChannel = list;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setShowInterval(Integer num) {
        this.showInterval = num;
    }

    public AdQuestionnaire(int i, String str, Integer num, String str2, List<String> list) {
        this.id = i;
        this.content = str;
        this.showInterval = num;
        this.schema = str2;
        this.geckoChannel = list;
    }

    public /* synthetic */ AdQuestionnaire(int i, String str, Integer num, String str2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : str2, (i2 & 16) == 0 ? list : null);
    }
}
