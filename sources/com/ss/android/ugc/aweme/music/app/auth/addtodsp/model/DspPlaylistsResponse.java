package com.ss.android.ugc.aweme.music.app.auth.addtodsp.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class DspPlaylistsResponse extends BaseResponse {

    @InterfaceC65349Pkn("has_more")
    public Boolean hasMore;

    @InterfaceC65349Pkn("next_offset")
    public Long nextOffset;

    @InterfaceC65349Pkn("next_offset_str")
    public String nextOffsetStr;

    @InterfaceC65349Pkn("playlists")
    public List<DspPlaylist> playlists;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DspPlaylistsResponse)) {
            return false;
        }
        DspPlaylistsResponse dspPlaylistsResponse = (DspPlaylistsResponse) obj;
        return o.LJ(this.playlists, dspPlaylistsResponse.playlists) && o.LJ(this.hasMore, dspPlaylistsResponse.hasMore) && o.LJ(this.nextOffset, dspPlaylistsResponse.nextOffset) && o.LJ(this.nextOffsetStr, dspPlaylistsResponse.nextOffsetStr);
    }

    public final int hashCode() {
        List<DspPlaylist> list = this.playlists;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.hasMore;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l = this.nextOffset;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.nextOffsetStr;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DspPlaylistsResponse(playlists=");
        LIZ.append(this.playlists);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", nextOffset=");
        LIZ.append(this.nextOffset);
        LIZ.append(", nextOffsetStr=");
        LIZ.append(this.nextOffsetStr);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public DspPlaylistsResponse(List<DspPlaylist> list, Boolean bool, Long l, String str) {
        this.playlists = list;
        this.hasMore = bool;
        this.nextOffset = l;
        this.nextOffsetStr = str;
    }
}
