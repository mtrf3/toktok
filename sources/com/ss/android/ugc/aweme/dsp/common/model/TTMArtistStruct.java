package com.ss.android.ugc.aweme.dsp.common.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class TTMArtistStruct implements Serializable {

    @InterfaceC65349Pkn("count_albums")
    public final long countAlbums;

    @InterfaceC65349Pkn("cover")
    public final UrlModel cover;

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("name")
    public final String name;

    public static /* synthetic */ TTMArtistStruct copy$default(TTMArtistStruct tTMArtistStruct, String str, String str2, UrlModel urlModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tTMArtistStruct.id;
        }
        if ((i & 2) != 0) {
            str2 = tTMArtistStruct.name;
        }
        if ((i & 4) != 0) {
            urlModel = tTMArtistStruct.cover;
        }
        if ((i & 8) != 0) {
            j = tTMArtistStruct.countAlbums;
        }
        return tTMArtistStruct.copy(str, str2, urlModel, j);
    }

    public final TTMArtistStruct copy(String str, String str2, UrlModel urlModel, long j) {
        return new TTMArtistStruct(str, str2, urlModel, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TTMArtistStruct)) {
            return false;
        }
        TTMArtistStruct tTMArtistStruct = (TTMArtistStruct) obj;
        return o.LJ(this.id, tTMArtistStruct.id) && o.LJ(this.name, tTMArtistStruct.name) && o.LJ(this.cover, tTMArtistStruct.cover) && this.countAlbums == tTMArtistStruct.countAlbums;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.cover;
        return ((hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31) + C16880lQ.LLJIJIL(this.countAlbums);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TTMArtistStruct(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", cover=");
        LIZ.append(this.cover);
        LIZ.append(", countAlbums=");
        LIZ.append(this.countAlbums);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final long getCountAlbums() {
        return this.countAlbums;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public TTMArtistStruct(String str, String str2, UrlModel urlModel, long j) {
        this.id = str;
        this.name = str2;
        this.cover = urlModel;
        this.countAlbums = j;
    }

    public /* synthetic */ TTMArtistStruct(String str, String str2, UrlModel urlModel, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, urlModel, (i & 8) != 0 ? 0L : j);
    }
}
