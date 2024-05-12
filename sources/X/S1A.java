package X;

import android.app.Activity;
import android.app.Dialog;
import com.ss.android.ugc.aweme.dsp.service.IMusicDspService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S1A extends HSS {
    @Override // X.S1E
    public final S1E clone() {
        return new S1A();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.MUSIC_DSP_PLAY_FULL_SONG.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        String str;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        super.LJ(eventMapBuilder);
        Aweme LJJII = LJJII();
        IMusicDspService iMusicDspService = C51645KOr.LIZIZ;
        long id = LJJII.getMusic().getId();
        com.ss.android.ugc.aweme.music.model.Dsp dsp = LJJII.getDsp();
        if (dsp == null || (str = dsp.getFullClipId()) == null) {
            str = "";
        }
        iMusicDspService.LJFF(id, str);
    }

    @Override // X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        String str;
        EnumC26289ATl LJFF = super.LJFF(list);
        EnumC26289ATl enumC26289ATl = EnumC26289ATl.NOT_FOUND;
        if (LJFF != enumC26289ATl) {
            Aweme LJJII = LJJII();
            com.ss.android.ugc.aweme.music.model.Dsp dsp = LJJII.getDsp();
            if (dsp != null && dsp.shouldShowAnchor()) {
                IMusicDspService iMusicDspService = C51645KOr.LIZIZ;
                com.ss.android.ugc.aweme.music.model.Dsp dsp2 = LJJII.getDsp();
                if (dsp2 == null || (str = dsp2.getFullClipId()) == null) {
                    str = "";
                }
                if (iMusicDspService.LJIILLIIL(str)) {
                }
            }
            return enumC26289ATl;
        }
        return LJFF;
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        String str;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        Aweme LJJII = LJJII();
        IMusicDspService iMusicDspService = C51645KOr.LIZIZ;
        Activity LJJI = LJJI();
        long id = LJJII.getMusic().getId();
        com.ss.android.ugc.aweme.music.model.Dsp dsp = LJJII.getDsp();
        if (dsp == null || (str = dsp.getFullClipId()) == null) {
            str = "";
        }
        iMusicDspService.LJI(id, LJJI, str);
        HSS.LJJIZ(this, eventMapBuilder, 6);
    }

    @Override // X.HSW, X.S1E
    public final void LJIILIIL(C7F9 chain, Dialog dialog, boolean z, boolean z2) {
        String str;
        o.LJIIIZ(chain, "chain");
        Aweme LJJII = LJJII();
        IMusicDspService iMusicDspService = C51645KOr.LIZIZ;
        long id = LJJII.getMusic().getId();
        com.ss.android.ugc.aweme.music.model.Dsp dsp = LJJII.getDsp();
        if (dsp == null || (str = dsp.getFullClipId()) == null) {
            str = "";
        }
        iMusicDspService.LJFF(id, str);
    }
}
