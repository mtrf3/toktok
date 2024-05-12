package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HmN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45063HmN {
    public static final /* synthetic */ int LIZ = 0;

    public static final OSZ LIZ(int i, List orderedMusicList) {
        o.LJIIIZ(orderedMusicList, "orderedMusicList");
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ORZ.LJLLLLLL(i, orderedMusicList);
        if (autoCutThemeData == null) {
            return new OSZ(-1, null);
        }
        return new OSZ(Integer.valueOf(autoCutThemeData.indexFromSource), autoCutThemeData.LIZ());
    }

    public static final int LIZIZ(List<AutoCutThemeData> orderedMusicList, int i, C63A c63a) {
        o.LJIIIZ(orderedMusicList, "orderedMusicList");
        int i2 = 0;
        for (AutoCutThemeData autoCutThemeData : orderedMusicList) {
            if (autoCutThemeData.indexFromSource == i && autoCutThemeData.LIZ() == c63a) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static final AutoCutThemeData LIZJ(List<AutoCutThemeData> orderedMusicList, int i, C63A c63a) {
        AutoCutThemeData autoCutThemeData;
        o.LJIIIZ(orderedMusicList, "orderedMusicList");
        Iterator<AutoCutThemeData> it = orderedMusicList.iterator();
        while (true) {
            if (it.hasNext()) {
                autoCutThemeData = it.next();
                AutoCutThemeData autoCutThemeData2 = autoCutThemeData;
                if (autoCutThemeData2.indexFromSource == i && autoCutThemeData2.LIZ() == c63a) {
                    break;
                }
            } else {
                autoCutThemeData = null;
                break;
            }
        }
        return autoCutThemeData;
    }
}
