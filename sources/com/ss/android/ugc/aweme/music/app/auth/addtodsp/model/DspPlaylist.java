package com.ss.android.ugc.aweme.music.app.auth.addtodsp.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class DspPlaylist implements Serializable {

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("image_url")
    public final String imageUrl;

    @InterfaceC65349Pkn("name")
    public final String name;

    public static /* synthetic */ DspPlaylist copy$default(DspPlaylist dspPlaylist, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dspPlaylist.id;
        }
        if ((i & 2) != 0) {
            str2 = dspPlaylist.name;
        }
        if ((i & 4) != 0) {
            str3 = dspPlaylist.imageUrl;
        }
        return dspPlaylist.copy(str, str2, str3);
    }

    public final DspPlaylist copy(String str, String str2, String str3) {
        return new DspPlaylist(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DspPlaylist)) {
            return false;
        }
        DspPlaylist dspPlaylist = (DspPlaylist) obj;
        return o.LJ(this.id, dspPlaylist.id) && o.LJ(this.name, dspPlaylist.name) && o.LJ(this.imageUrl, dspPlaylist.imageUrl);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DspPlaylist(id=");
        LIZ.append(this.id);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", imageUrl=");
        LIZ.append(this.imageUrl);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public DspPlaylist(String str, String str2, String str3) {
        this.id = str;
        this.name = str2;
        this.imageUrl = str3;
    }
}
