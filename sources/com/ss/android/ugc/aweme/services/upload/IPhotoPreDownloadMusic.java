package com.ss.android.ugc.aweme.services.upload;

import X.C44687HgJ;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes8.dex */
public interface IPhotoPreDownloadMusic {

    /* loaded from: classes8.dex */
    public static final class PhotoPreDownloadMusicData {
        public String musicFile;
        public MusicModel musicModel;

        /* JADX WARN: Multi-variable type inference failed */
        public PhotoPreDownloadMusicData() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean isDataValid() {
            String str;
            if (this.musicModel != null && (str = this.musicFile) != null && C44687HgJ.LIZIZ(str)) {
                return true;
            }
            return false;
        }

        public final String getMusicFile() {
            return this.musicFile;
        }

        public final MusicModel getMusicModel() {
            return this.musicModel;
        }

        public final void setMusicFile(String str) {
            this.musicFile = str;
        }

        public final void setMusicModel(MusicModel musicModel) {
            this.musicModel = musicModel;
        }

        public PhotoPreDownloadMusicData(MusicModel musicModel, String str) {
            this.musicModel = musicModel;
            this.musicFile = str;
        }

        public /* synthetic */ PhotoPreDownloadMusicData(MusicModel musicModel, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : musicModel, (i & 2) != 0 ? null : str);
        }
    }

    void firstMusicDownloadSuccess(MusicModel musicModel, String str);

    PhotoPreDownloadMusicData getPreDownloadMusicData();
}
