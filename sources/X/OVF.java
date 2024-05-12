package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.ttsvoice.repo.TTSVoiceRecordService;

/* loaded from: classes11.dex */
public final class OVF implements HWI {
    public final /* synthetic */ TTSVoiceRecordService LJLIL;
    public final /* synthetic */ MusicModel LJLILLLLZI;

    @Override // X.HWI
    public final void LIZIZ() {
        String str;
        C84913XUf c84913XUf = this.LJLIL.LJ;
        if (c84913XUf != null) {
            MusicModel musicModel = this.LJLILLLLZI;
            if (musicModel != null) {
                str = musicModel.getMusicId();
            } else {
                str = null;
            }
            c84913XUf.LIZ(str);
        }
    }

    public OVF(TTSVoiceRecordService tTSVoiceRecordService, MusicModel musicModel) {
        this.LJLIL = tTSVoiceRecordService;
        this.LJLILLLLZI = musicModel;
    }
}
