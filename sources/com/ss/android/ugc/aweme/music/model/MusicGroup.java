package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicGroup implements Serializable {

    @InterfaceC65349Pkn("id")
    public final String id;

    @InterfaceC65349Pkn("similar_music_list")
    public final List<Music> similarMusics;

    @InterfaceC65349Pkn("music")
    public final Music sourceMusic;

    @InterfaceC65349Pkn("source_music_id")
    public final String sourceMusicId;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicGroup() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public final String getId() {
        return this.id;
    }

    public final List<Music> getSimilarMusics() {
        return this.similarMusics;
    }

    public final Music getSourceMusic() {
        return this.sourceMusic;
    }

    public final String getSourceMusicId() {
        return this.sourceMusicId;
    }

    public boolean equals(Object obj) {
        MusicGroup musicGroup;
        String str = null;
        if ((obj instanceof MusicGroup) && (musicGroup = (MusicGroup) obj) != null) {
            str = musicGroup.id;
        }
        return o.LJ(str, this.id);
    }

    public MusicGroup(String id, Music music, List<Music> similarMusics, String sourceMusicId) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(similarMusics, "similarMusics");
        o.LJIIIZ(sourceMusicId, "sourceMusicId");
        this.id = id;
        this.sourceMusic = music;
        this.similarMusics = similarMusics;
        this.sourceMusicId = sourceMusicId;
    }

    public /* synthetic */ MusicGroup(String str, Music music, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : music, (i & 4) != 0 ? new ArrayList() : list, (i & 8) != 0 ? "" : str2);
    }
}
