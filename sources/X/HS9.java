package X;

import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HS9 extends HSS {
    @Override // X.S1E
    public final S1E clone() {
        return new HS9();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ANCHOR_SOUND_SYNC.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        C188727au LJJIJIIJI = LJJIJIIJI();
        LJJJJJ(LJJIJIIJI);
        C211648Si.LIZ(LJJIJIIJI, LJJII(), LJJIIZI(), true);
        FMX.LJIIL("multi_anchor_entrance_show", LJJIJIIJI.LIZ);
        C188727au LJJIJIIJI2 = LJJIJIIJI();
        LJJJJJ(LJJIJIIJI2);
        FMX.LJIIL("anchor_entrance_show", LJJIJIIJI2.LIZ);
    }

    @Override // X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        MusicModel convertToMusicModel;
        if (PrivacyServiceImpl.LIZIZ().isChildrenMode()) {
            return EnumC26289ATl.NOT_FOUND;
        }
        Music music = LJJII().getMusic();
        if (music != null && (convertToMusicModel = music.convertToMusicModel()) != null && CommerceMediaServiceImpl.LIZJ().LIZ() && !convertToMusicModel.isCommerceMusic()) {
            return EnumC26289ATl.NOT_FOUND;
        }
        if (C00F.LIZ(31744, 0, "studio_creation_enable_sound_sync_anchor", true) == 1) {
            return super.LJFF(list);
        }
        return EnumC26289ATl.NOT_FOUND;
    }

    @Override // X.HSS, X.S1E
    public final void LJI(C188727au c188727au) {
        C188727au LJJIJIIJI = LJJIJIIJI();
        LJJJJJ(LJJIJIIJI);
        C211648Si.LIZ(LJJIJIIJI, LJJII(), LJJIIZI(), false);
        FMX.LJIIL("multi_anchor_entrance_click", LJJIJIIJI.LIZ);
        C188727au LJJIJIIJI2 = LJJIJIIJI();
        LJJJJJ(LJJIJIIJI2);
        FMX.LJIIL("anchor_entrance_click", LJJIJIIJI2.LIZ);
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        LJJJJIZL(new AqS173S0100000_7(this, 243));
        HSS.LJJIZ(this, eventMapBuilder, 6);
    }

    public final void LJJJJJ(C188727au c188727au) {
        String optString = LJJIJLIJ().optString("request_id");
        if (optString == null) {
            optString = "";
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(optString);
        c188727au.LJIIIZ("log_pb", C3A5.LIZ.LIZ(logPbBean));
    }
}
