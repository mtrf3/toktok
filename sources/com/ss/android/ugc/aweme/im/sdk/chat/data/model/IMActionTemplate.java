package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMActionTemplate {

    @InterfaceC65349Pkn("action")
    public Integer action;

    @InterfaceC65349Pkn("key")
    public Integer key;

    @InterfaceC65349Pkn("link")
    public String link;

    @InterfaceC65349Pkn("name")
    public String name;

    /* JADX WARN: Multi-variable type inference failed */
    public IMActionTemplate() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IMActionTemplate copy$default(IMActionTemplate iMActionTemplate, Integer num, Integer num2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = iMActionTemplate.key;
        }
        if ((i & 2) != 0) {
            num2 = iMActionTemplate.action;
        }
        if ((i & 4) != 0) {
            str = iMActionTemplate.name;
        }
        if ((i & 8) != 0) {
            str2 = iMActionTemplate.link;
        }
        return iMActionTemplate.copy(num, num2, str, str2);
    }

    public final IMActionTemplate copy(Integer num, Integer num2, String str, String str2) {
        return new IMActionTemplate(num, num2, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMActionTemplate)) {
            return false;
        }
        IMActionTemplate iMActionTemplate = (IMActionTemplate) obj;
        return o.LJ(this.key, iMActionTemplate.key) && o.LJ(this.action, iMActionTemplate.action) && o.LJ(this.name, iMActionTemplate.name) && o.LJ(this.link, iMActionTemplate.link);
    }

    public int hashCode() {
        Integer num = this.key;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.action;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.link;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMActionTemplate(key=");
        LIZ.append(this.key);
        LIZ.append(", action=");
        LIZ.append(this.action);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", link=");
        return q.LIZIZ(LIZ, this.link, ')', LIZ);
    }

    public final Integer getAction() {
        return this.action;
    }

    public final Integer getKey() {
        return this.key;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getName() {
        return this.name;
    }

    public final void setAction(Integer num) {
        this.action = num;
    }

    public final void setKey(Integer num) {
        this.key = num;
    }

    public final void setLink(String str) {
        this.link = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public IMActionTemplate(Integer num, Integer num2, String str, String str2) {
        this.key = num;
        this.action = num2;
        this.name = str;
        this.link = str2;
    }

    public /* synthetic */ IMActionTemplate(Integer num, Integer num2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }
}
