package com.ss.android.ugc.aweme.composer.model;

import X.HII;
import X.HIJ;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.ugc.aweme.CreationConfigModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class CreationConfigModelCompat extends CreationConfigModel {
    public static final Parcelable.Creator<CreationConfigModelCompat> CREATOR = new HII();
    public HIJ callback;
    public MusicComposerModel music;
    public MusicShareStoryInputData musicShareStoryData;

    /* JADX WARN: Multi-variable type inference failed */
    public CreationConfigModelCompat() {
        super(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // com.ss.ugc.aweme.CreationConfigModel, android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeInt(1);
    }

    public final HIJ getCallback() {
        return this.callback;
    }

    public final MusicComposerModel getMusic() {
        return this.music;
    }

    public MusicShareStoryInputData getMusicShareStoryData() {
        return this.musicShareStoryData;
    }

    public final void setCallback(HIJ hij) {
        this.callback = hij;
    }

    public final void setMusic(MusicComposerModel musicComposerModel) {
        this.music = musicComposerModel;
    }

    public void setMusicShareStoryData(MusicShareStoryInputData musicShareStoryInputData) {
        this.musicShareStoryData = musicShareStoryInputData;
    }
}
