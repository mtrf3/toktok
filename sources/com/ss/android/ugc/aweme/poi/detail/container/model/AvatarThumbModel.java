package com.ss.android.ugc.aweme.poi.detail.container.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AvatarThumbModel implements Serializable {

    @InterfaceC65349Pkn("uri")
    public final String uri;

    @InterfaceC65349Pkn("url_list")
    public final List<String> urlList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvatarThumbModel copy$default(AvatarThumbModel avatarThumbModel, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarThumbModel.uri;
        }
        if ((i & 2) != 0) {
            list = avatarThumbModel.urlList;
        }
        return avatarThumbModel.copy(str, list);
    }

    public final AvatarThumbModel copy(String str, List<String> list) {
        return new AvatarThumbModel(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarThumbModel)) {
            return false;
        }
        AvatarThumbModel avatarThumbModel = (AvatarThumbModel) obj;
        return o.LJ(this.uri, avatarThumbModel.uri) && o.LJ(this.urlList, avatarThumbModel.urlList);
    }

    public int hashCode() {
        String str = this.uri;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AvatarThumbModel(uri=");
        LIZ.append(this.uri);
        LIZ.append(", urlList=");
        return C1NE.LIZIZ(LIZ, this.urlList, ')', LIZ);
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public AvatarThumbModel(String str, List<String> list) {
        this.uri = str;
        this.urlList = list;
    }
}
