package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AgeGateNavButton implements Serializable {

    @InterfaceC65349Pkn("action_url")
    public String actionUrl;

    @InterfaceC65349Pkn("content")
    public String content;

    @InterfaceC65349Pkn("icon_url")
    public String iconUrl;

    @InterfaceC65349Pkn("position")
    public Integer position;

    @InterfaceC65349Pkn("type")
    public Integer type;

    /* JADX WARN: Multi-variable type inference failed */
    public AgeGateNavButton() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AgeGateNavButton copy$default(AgeGateNavButton ageGateNavButton, Integer num, Integer num2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = ageGateNavButton.position;
        }
        if ((i & 2) != 0) {
            num2 = ageGateNavButton.type;
        }
        if ((i & 4) != 0) {
            str = ageGateNavButton.iconUrl;
        }
        if ((i & 8) != 0) {
            str2 = ageGateNavButton.content;
        }
        if ((i & 16) != 0) {
            str3 = ageGateNavButton.actionUrl;
        }
        return ageGateNavButton.copy(num, num2, str, str2, str3);
    }

    public final AgeGateNavButton copy(Integer num, Integer num2, String str, String str2, String str3) {
        return new AgeGateNavButton(num, num2, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AgeGateNavButton)) {
            return false;
        }
        AgeGateNavButton ageGateNavButton = (AgeGateNavButton) obj;
        return o.LJ(this.position, ageGateNavButton.position) && o.LJ(this.type, ageGateNavButton.type) && o.LJ(this.iconUrl, ageGateNavButton.iconUrl) && o.LJ(this.content, ageGateNavButton.content) && o.LJ(this.actionUrl, ageGateNavButton.actionUrl);
    }

    public int hashCode() {
        Integer num = this.position;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.type;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.iconUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionUrl;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AgeGateNavButton(position=");
        LIZ.append(this.position);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", iconUrl=");
        LIZ.append(this.iconUrl);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", actionUrl=");
        return q.LIZIZ(LIZ, this.actionUrl, ')', LIZ);
    }

    public final String getActionUrl() {
        return this.actionUrl;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setActionUrl(String str) {
        this.actionUrl = str;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public final void setPosition(Integer num) {
        this.position = num;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public AgeGateNavButton(Integer num, Integer num2, String str, String str2, String str3) {
        this.position = num;
        this.type = num2;
        this.iconUrl = str;
        this.content = str2;
        this.actionUrl = str3;
    }

    public /* synthetic */ AgeGateNavButton(Integer num, Integer num2, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? str3 : null);
    }
}
