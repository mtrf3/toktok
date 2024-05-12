package X;

import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import kotlin.jvm.internal.o;

/* renamed from: X.OWz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62053OWz {
    public static OX0 LIZ(MusicDetail musicDetail) {
        o.LJIIIZ(musicDetail, "musicDetail");
        Music music = musicDetail.music;
        if (music == null) {
            return OX0.NONE;
        }
        return new OX0(music.isPgc(), music.getPreviewPageShowMode(), !C77412UZs.LJIJ(musicDetail).getEnableNormalUiElements());
    }
}
