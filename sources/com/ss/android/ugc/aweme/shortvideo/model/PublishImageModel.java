package com.ss.android.ugc.aweme.shortvideo.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishImageModel {
    public final int height;
    public final String path;
    public String uri;
    public final int width;

    public static /* synthetic */ PublishImageModel copy$default(PublishImageModel publishImageModel, String str, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = publishImageModel.path;
        }
        if ((i3 & 2) != 0) {
            i = publishImageModel.width;
        }
        if ((i3 & 4) != 0) {
            i2 = publishImageModel.height;
        }
        if ((i3 & 8) != 0) {
            str2 = publishImageModel.uri;
        }
        return publishImageModel.copy(str, i, i2, str2);
    }

    public final PublishImageModel copy(String path, int i, int i2, String str) {
        o.LJIIIZ(path, "path");
        return new PublishImageModel(path, i, i2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PublishImageModel)) {
            return false;
        }
        PublishImageModel publishImageModel = (PublishImageModel) obj;
        return o.LJ(this.path, publishImageModel.path) && this.width == publishImageModel.width && this.height == publishImageModel.height && o.LJ(this.uri, publishImageModel.uri);
    }

    public int hashCode() {
        int hashCode = ((((this.path.hashCode() * 31) + this.width) * 31) + this.height) * 31;
        String str = this.uri;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PublishImageModel(path=");
        LIZ.append(this.path);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", uri=");
        return q.LIZIZ(LIZ, this.uri, ')', LIZ);
    }

    public PublishImageModel(String path, int i, int i2, String str) {
        o.LJIIIZ(path, "path");
        this.path = path;
        this.width = i;
        this.height = i2;
        this.uri = str;
    }

    public /* synthetic */ PublishImageModel(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i3 & 8) != 0 ? null : str2);
    }
}
