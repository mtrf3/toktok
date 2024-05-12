package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;

/* loaded from: classes16.dex */
public class MusicCollectionItem {

    @InterfaceC65349Pkn("aweme_cover")
    public UrlModel awemeCover;

    @InterfaceC65349Pkn("cover")
    public UrlModel cover;

    @InterfaceC65349Pkn("is_hot")
    public boolean isHot;

    @InterfaceC65349Pkn("level")
    public int level;

    @InterfaceC65349Pkn("id_str")
    public String mcId;

    @InterfaceC65349Pkn("name")
    public String mcName;

    @InterfaceC65349Pkn("playlist_order")
    public Integer playlistOrder;

    @InterfaceC65349Pkn("share_info")
    public ShareInfo shareInfo;

    public void setPlaylistOrder(int i) {
        this.playlistOrder = Integer.valueOf(i);
    }
}
