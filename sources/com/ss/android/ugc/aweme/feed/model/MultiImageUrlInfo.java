package com.ss.android.ugc.aweme.feed.model;

import X.C31461Li;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MultiImageUrlInfo implements Serializable {

    @InterfaceC65349Pkn("bitrate_image")
    public UrlModel image;

    @InterfaceC65349Pkn("name")
    public String name;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiImageUrlInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MultiImageUrlInfo copy$default(MultiImageUrlInfo multiImageUrlInfo, String str, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = multiImageUrlInfo.name;
        }
        if ((i & 2) != 0) {
            urlModel = multiImageUrlInfo.image;
        }
        return multiImageUrlInfo.copy(str, urlModel);
    }

    public final MultiImageUrlInfo copy(String str, UrlModel urlModel) {
        return new MultiImageUrlInfo(str, urlModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiImageUrlInfo)) {
            return false;
        }
        MultiImageUrlInfo multiImageUrlInfo = (MultiImageUrlInfo) obj;
        return o.LJ(this.name, multiImageUrlInfo.name) && o.LJ(this.image, multiImageUrlInfo.image);
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        UrlModel urlModel = this.image;
        return hashCode + (urlModel != null ? urlModel.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiImageUrlInfo(name=");
        LIZ.append(this.name);
        LIZ.append(", image=");
        return C31461Li.LIZLLL(LIZ, this.image, ')', LIZ);
    }

    public final UrlModel getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public MultiImageUrlInfo(String str, UrlModel urlModel) {
        this.name = str;
        this.image = urlModel;
    }

    public /* synthetic */ MultiImageUrlInfo(String str, UrlModel urlModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : urlModel);
    }
}
