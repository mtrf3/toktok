package com.ss.android.ugc.aweme.pns.agegate.data;

import X.EnumC86082XqQ;
import X.EnumC86085XqT;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PNSNavButton implements Serializable {

    @InterfaceC65349Pkn("action_url")
    public final String actionUrl;

    @InterfaceC65349Pkn("content")
    public final String content;

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;

    @InterfaceC65349Pkn("position")
    public final EnumC86082XqQ position;

    @InterfaceC65349Pkn("type")
    public final EnumC86085XqT type;

    /* JADX WARN: Multi-variable type inference failed */
    public PNSNavButton() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PNSNavButton copy$default(PNSNavButton pNSNavButton, EnumC86082XqQ enumC86082XqQ, EnumC86085XqT enumC86085XqT, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC86082XqQ = pNSNavButton.position;
        }
        if ((i & 2) != 0) {
            enumC86085XqT = pNSNavButton.type;
        }
        if ((i & 4) != 0) {
            str = pNSNavButton.iconUrl;
        }
        if ((i & 8) != 0) {
            str2 = pNSNavButton.content;
        }
        if ((i & 16) != 0) {
            str3 = pNSNavButton.actionUrl;
        }
        return pNSNavButton.copy(enumC86082XqQ, enumC86085XqT, str, str2, str3);
    }

    public final PNSNavButton copy(EnumC86082XqQ enumC86082XqQ, EnumC86085XqT enumC86085XqT, String str, String str2, String str3) {
        return new PNSNavButton(enumC86082XqQ, enumC86085XqT, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSNavButton)) {
            return false;
        }
        PNSNavButton pNSNavButton = (PNSNavButton) obj;
        return this.position == pNSNavButton.position && this.type == pNSNavButton.type && o.LJ(this.iconUrl, pNSNavButton.iconUrl) && o.LJ(this.content, pNSNavButton.content) && o.LJ(this.actionUrl, pNSNavButton.actionUrl);
    }

    public int hashCode() {
        EnumC86082XqQ enumC86082XqQ = this.position;
        int hashCode = (enumC86082XqQ == null ? 0 : enumC86082XqQ.hashCode()) * 31;
        EnumC86085XqT enumC86085XqT = this.type;
        int hashCode2 = (hashCode + (enumC86085XqT == null ? 0 : enumC86085XqT.hashCode())) * 31;
        String str = this.iconUrl;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.content;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.actionUrl;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PNSNavButton(position=");
        LIZ.append(this.position);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", iconUrl=");
        LIZ.append((Object) this.iconUrl);
        LIZ.append(", content=");
        LIZ.append((Object) this.content);
        LIZ.append(", actionUrl=");
        LIZ.append((Object) this.actionUrl);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
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

    public final EnumC86082XqQ getPosition() {
        return this.position;
    }

    public final EnumC86085XqT getType() {
        return this.type;
    }

    public PNSNavButton(EnumC86082XqQ enumC86082XqQ, EnumC86085XqT enumC86085XqT, String str, String str2, String str3) {
        this.position = enumC86082XqQ;
        this.type = enumC86085XqT;
        this.iconUrl = str;
        this.content = str2;
        this.actionUrl = str3;
    }

    public /* synthetic */ PNSNavButton(EnumC86082XqQ enumC86082XqQ, EnumC86085XqT enumC86085XqT, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : enumC86082XqQ, (i & 2) != 0 ? null : enumC86085XqT, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? str3 : null);
    }
}
