package com.bytedance.android.livesdk.model;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class KaraokeSong {

    @InterfaceC65349Pkn("accompaniment_info")
    public AccompanimentStruct accompanimentInfo;

    @InterfaceC65349Pkn("audio_info")
    public AudioStruct audioInfo;

    @InterfaceC65349Pkn("duration")
    public int duration;

    @InterfaceC65349Pkn("id")
    public long id;

    @InterfaceC65349Pkn("is_added")
    public boolean isAdded;

    @InterfaceC65349Pkn("is_favorite")
    public boolean isFavorite;

    @InterfaceC65349Pkn("is_request")
    public boolean isRequest;

    @InterfaceC65349Pkn("lyric_info")
    public LyricStruct lyricInfo;

    @InterfaceC65349Pkn("postlude")
    public int postlude;

    @InterfaceC65349Pkn("prelude")
    public int prelude;

    @InterfaceC65349Pkn("song_status")
    public int songStatus;

    @InterfaceC65349Pkn("title")
    public String title = "";

    @InterfaceC65349Pkn("display_artist")
    public String displayArtist = "";

    @InterfaceC65349Pkn("album")
    public String album = "";

    @InterfaceC65349Pkn("cover_vid")
    public String coverVid = "";

    @InterfaceC65349Pkn("cover_urls")
    public List<String> coverUrls = new ArrayList();

    @InterfaceC65349Pkn("label_ids")
    public List<Long> labelIds = new ArrayList();
}
