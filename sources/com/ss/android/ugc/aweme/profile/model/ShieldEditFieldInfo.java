package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShieldEditFieldInfo implements Serializable {

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("shield_edit_field")
    public final Integer shieldEditField;

    /* JADX WARN: Multi-variable type inference failed */
    public ShieldEditFieldInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ShieldEditFieldInfo copy$default(ShieldEditFieldInfo shieldEditFieldInfo, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = shieldEditFieldInfo.shieldEditField;
        }
        if ((i & 2) != 0) {
            str = shieldEditFieldInfo.link;
        }
        return shieldEditFieldInfo.copy(num, str);
    }

    public final ShieldEditFieldInfo copy(Integer num, String link) {
        o.LJIIIZ(link, "link");
        return new ShieldEditFieldInfo(num, link);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShieldEditFieldInfo)) {
            return false;
        }
        ShieldEditFieldInfo shieldEditFieldInfo = (ShieldEditFieldInfo) obj;
        return o.LJ(this.shieldEditField, shieldEditFieldInfo.shieldEditField) && o.LJ(this.link, shieldEditFieldInfo.link);
    }

    public int hashCode() {
        Integer num = this.shieldEditField;
        return this.link.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShieldEditFieldInfo(shieldEditField=");
        LIZ.append(this.shieldEditField);
        LIZ.append(", link=");
        return q.LIZIZ(LIZ, this.link, ')', LIZ);
    }

    public final String getLink() {
        return this.link;
    }

    public final Integer getShieldEditField() {
        return this.shieldEditField;
    }

    public ShieldEditFieldInfo(Integer num, String link) {
        o.LJIIIZ(link, "link");
        this.shieldEditField = num;
        this.link = link;
    }

    public /* synthetic */ ShieldEditFieldInfo(Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? "" : str);
    }
}
