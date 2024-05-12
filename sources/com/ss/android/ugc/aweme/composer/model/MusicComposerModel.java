package com.ss.android.ugc.aweme.composer.model;

import X.C43578H8k;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class MusicComposerModel extends F9E implements Serializable, Parcelable {
    public static final Parcelable.Creator<MusicComposerModel> CREATOR = new C43578H8k();

    @InterfaceC65349Pkn("end_time")
    public final int endTime;

    @InterfaceC65349Pkn("music_model")
    public final MusicModel musicModel;

    @InterfaceC65349Pkn("music_path")
    public final String musicPath;

    @InterfaceC65349Pkn("start_time")
    public final int startTime;

    public static /* synthetic */ MusicComposerModel copy$default(MusicComposerModel musicComposerModel, String str, int i, int i2, MusicModel musicModel, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = musicComposerModel.musicPath;
        }
        if ((i3 & 2) != 0) {
            i = musicComposerModel.startTime;
        }
        if ((i3 & 4) != 0) {
            i2 = musicComposerModel.endTime;
        }
        if ((i3 & 8) != 0) {
            musicModel = musicComposerModel.musicModel;
        }
        return musicComposerModel.copy(str, i, i2, musicModel);
    }

    public final MusicComposerModel copy(String musicPath, int i, int i2, MusicModel musicModel) {
        o.LJIIIZ(musicPath, "musicPath");
        o.LJIIIZ(musicModel, "musicModel");
        return new MusicComposerModel(musicPath, i, i2, musicModel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.musicPath, Integer.valueOf(this.startTime), Integer.valueOf(this.endTime), this.musicModel};
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.musicPath);
        out.writeInt(this.startTime);
        out.writeInt(this.endTime);
        out.writeSerializable(this.musicModel);
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final MusicModel getMusicModel() {
        return this.musicModel;
    }

    public final String getMusicPath() {
        return this.musicPath;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public MusicComposerModel(String musicPath, int i, int i2, MusicModel musicModel) {
        o.LJIIIZ(musicPath, "musicPath");
        o.LJIIIZ(musicModel, "musicModel");
        this.musicPath = musicPath;
        this.startTime = i;
        this.endTime = i2;
        this.musicModel = musicModel;
    }
}
