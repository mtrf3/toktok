package com.ss.android.ugc.aweme.composer.model;

import X.H9L;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicShareStoryInputData implements Parcelable, Serializable {
    public static final Parcelable.Creator<MusicShareStoryInputData> CREATOR = new H9L();

    @InterfaceC65349Pkn("cover_url")
    public UrlModel coverUrl;

    @InterfaceC65349Pkn("music")
    public MusicModel music;

    @InterfaceC65349Pkn("song_name")
    public String songName;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicShareStoryInputData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeSerializable(this.coverUrl);
        out.writeSerializable(this.music);
        out.writeString(this.songName);
    }

    public final UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public final MusicModel getMusic() {
        return this.music;
    }

    public final String getSongName() {
        return this.songName;
    }

    public final void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public final void setMusic(MusicModel musicModel) {
        o.LJIIIZ(musicModel, "<set-?>");
        this.music = musicModel;
    }

    public final void setSongName(String str) {
        this.songName = str;
    }

    public MusicShareStoryInputData(UrlModel urlModel, MusicModel music, String str) {
        o.LJIIIZ(music, "music");
        this.coverUrl = urlModel;
        this.music = music;
        this.songName = str;
    }

    public /* synthetic */ MusicShareStoryInputData(UrlModel urlModel, MusicModel musicModel, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : urlModel, (i & 2) != 0 ? new MusicModel() : musicModel, (i & 4) != 0 ? null : str);
    }
}
