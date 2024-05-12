package X;

import com.ss.android.ugc.aweme.dsp.common.model.DspMusicStruct;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ZrC, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91226ZrC {
    public static final String LIZ(DspMusicStruct dspMusicStruct) {
        List<ExternalMusicInfo> externalMusicInfos;
        o.LJIIIZ(dspMusicStruct, "<this>");
        Music music = dspMusicStruct.getMusic();
        String str = null;
        if (music != null && (externalMusicInfos = music.getExternalMusicInfos()) != null) {
            for (ExternalMusicInfo externalMusicInfo : externalMusicInfos) {
                if (o.LJ(externalMusicInfo.getPartnerName(), "resso")) {
                    str = externalMusicInfo.getPartnerSongId();
                }
            }
            if (str != null) {
                return str;
            }
        }
        return "";
    }
}
