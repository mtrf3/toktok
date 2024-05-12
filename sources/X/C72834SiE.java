package X;

import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.choosemusic.model.MusicConsumptionInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.SiE, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72834SiE {
    public static final ArrayList<MusicConsumptionInfo> LIZ = new ArrayList<>();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C72835SiF.LJLIL);

    public static Keva LIZ() {
        return (Keva) LIZIZ.getValue();
    }

    public static void LIZIZ(MusicModel musicModel) {
        o.LJIIIZ(musicModel, "musicModel");
        int LIZJ = NetworkService.LJI().LIZJ();
        Iterator<MusicConsumptionInfo> it = LIZ.iterator();
        while (it.hasNext()) {
            MusicConsumptionInfo next = it.next();
            if (next.musicId == musicModel.getId()) {
                next.consumptionTime = LIZJ;
                return;
            }
        }
        LIZ.add(new MusicConsumptionInfo(musicModel.getId(), LIZJ));
    }
}
