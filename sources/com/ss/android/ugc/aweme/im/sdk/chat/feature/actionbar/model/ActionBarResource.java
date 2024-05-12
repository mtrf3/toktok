package com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ActionBarResource {

    @InterfaceC65349Pkn("md5")
    public final String md5;

    @InterfaceC65349Pkn("resource_url")
    public final String resourceUrl;

    @InterfaceC65349Pkn("version")
    public final Long version;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionBarResource() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ActionBarResource copy$default(ActionBarResource actionBarResource, Long l, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = actionBarResource.version;
        }
        if ((i & 2) != 0) {
            str = actionBarResource.md5;
        }
        if ((i & 4) != 0) {
            str2 = actionBarResource.resourceUrl;
        }
        return actionBarResource.copy(l, str, str2);
    }

    public final ActionBarResource copy(Long l, String str, String str2) {
        return new ActionBarResource(l, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionBarResource)) {
            return false;
        }
        ActionBarResource actionBarResource = (ActionBarResource) obj;
        return o.LJ(this.version, actionBarResource.version) && o.LJ(this.md5, actionBarResource.md5) && o.LJ(this.resourceUrl, actionBarResource.resourceUrl);
    }

    public int hashCode() {
        Long l = this.version;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.md5;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.resourceUrl;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActionBarResource(version=");
        LIZ.append(this.version);
        LIZ.append(", md5=");
        LIZ.append(this.md5);
        LIZ.append(", resourceUrl=");
        return q.LIZIZ(LIZ, this.resourceUrl, ')', LIZ);
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getResourceUrl() {
        return this.resourceUrl;
    }

    public final Long getVersion() {
        return this.version;
    }

    public ActionBarResource(Long l, String str, String str2) {
        this.version = l;
        this.md5 = str;
        this.resourceUrl = str2;
    }

    public /* synthetic */ ActionBarResource(Long l, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
