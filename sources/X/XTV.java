package X;

import android.content.SharedPreferences;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.FavoriteRecommendedMusicResponse;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XTV {
    public static final XTV LJIIIZ = XTX.LIZ;
    public C84886XTe LIZ;
    public InterfaceC84885XTd LIZIZ;
    public FavoriteRecommendedMusicResponse LIZLLL;
    public boolean LJ;
    public int LJFF;
    public boolean LJI;
    public boolean LJIIIIZZ;
    public List<MusicModel> LIZJ = new ArrayList();
    public final XTW LJII = new XTW();

    public static CollectedMusicList LIZIZ() {
        String string = XTZ.LIZIZ.LIZ.getString("collect_music_list", "");
        if (string == null || string.length() == 0) {
            return null;
        }
        try {
            return (CollectedMusicList) ET1.LIZ.LJI(string, CollectedMusicList.class);
        } catch (Exception unused) {
            SharedPreferences.Editor edit = XTZ.LIZIZ.LIZ.edit();
            edit.remove("collect_music_list");
            edit.commit();
            return null;
        }
    }

    public final void LIZJ() {
        boolean LJJJLL;
        if (this.LJII.LIZ) {
            if (this.LJIIIIZZ) {
                LJJJLL = MusicService.LJJLIIIJJI().LJJJJIZL();
            } else {
                LJJJLL = MusicService.LJJLIIIJJI().LJJJLL();
            }
            if (!LJJJLL) {
                return;
            }
            this.LJII.getClass();
            XKX.LIZLLL(C780334l.LJLIL, null, null, new XTU(this, null), 3);
        }
    }

    public static void LIZ(CollectedMusicList collectedMusicList) {
        XTZ xtz = XTZ.LIZIZ;
        String json = GsonProtectorUtils.toJson(ET1.LIZ, collectedMusicList);
        o.LJIIIIZZ(json, "GSON.toJson(collectMusicList)");
        xtz.getClass();
        SharedPreferences.Editor edit = xtz.LIZ.edit();
        edit.putString("collect_music_list", json);
        edit.commit();
    }
}
