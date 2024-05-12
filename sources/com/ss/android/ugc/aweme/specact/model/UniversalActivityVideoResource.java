package com.ss.android.ugc.aweme.specact.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UniversalActivityVideoResource {

    @InterfaceC65349Pkn("activity_id")
    public final String activityId;

    @InterfaceC65349Pkn("resource_md5")
    public final String resourceMd5;

    @InterfaceC65349Pkn("resource_url")
    public final String resourceUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public UniversalActivityVideoResource() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UniversalActivityVideoResource)) {
            return false;
        }
        UniversalActivityVideoResource universalActivityVideoResource = (UniversalActivityVideoResource) obj;
        return o.LJ(this.activityId, universalActivityVideoResource.activityId) && o.LJ(this.resourceUrl, universalActivityVideoResource.resourceUrl) && o.LJ(this.resourceMd5, universalActivityVideoResource.resourceMd5);
    }

    public final int hashCode() {
        String str = this.activityId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.resourceUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resourceMd5;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UniversalActivityVideoResource(activityId=");
        LIZ.append(this.activityId);
        LIZ.append(", resourceUrl=");
        LIZ.append(this.resourceUrl);
        LIZ.append(", resourceMd5=");
        return q.LIZIZ(LIZ, this.resourceMd5, ')', LIZ);
    }

    public UniversalActivityVideoResource(String str, String str2, String str3) {
        this.activityId = str;
        this.resourceUrl = str2;
        this.resourceMd5 = str3;
    }

    public /* synthetic */ UniversalActivityVideoResource(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
