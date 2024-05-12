package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hgx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44727Hgx {
    public static AutoCutThemeData LIZ(MusicModel musicModel, C63A source, int i, String str, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        o.LJIIIZ(source, "source");
        List<String> urlList = musicModel.convertToMusic().getCoverMedium().getUrlList();
        o.LJIIIIZZ(urlList, "musicModel.convertToMusic().coverMedium.urlList");
        String str2 = (String) ORZ.LJLLLL(urlList);
        MusicBuzModel musicBuzModel = null;
        if (str2 == null) {
            String localThumbPath = musicModel.getLocalThumbPath();
            if (localThumbPath != null) {
                str2 = new File(localThumbPath).toURI().toURL().toString();
            } else {
                str2 = null;
            }
        }
        int ordinal = source.ordinal();
        String musicId = musicModel.getMusicId();
        String name = musicModel.getName();
        if (interfaceC88472Yns != null) {
            musicBuzModel = (MusicBuzModel) interfaceC88472Yns.invoke(musicModel);
        }
        return new AutoCutThemeData(ordinal, 0, null, i, null, null, null, musicId, str2, name, musicBuzModel, z, str, null, 8308, null);
    }
}
