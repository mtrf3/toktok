package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.voiceconversion.repo.VoiceConversionRecordService;

/* renamed from: X.HcX, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44453HcX implements HWI {
    public final /* synthetic */ VoiceConversionRecordService LJLIL;
    public final /* synthetic */ MusicModel LJLILLLLZI;

    @Override // X.HWI
    public final void LIZIZ() {
        String str;
        C84913XUf c84913XUf = this.LJLIL.LIZLLL;
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

    public C44453HcX(VoiceConversionRecordService voiceConversionRecordService, MusicModel musicModel) {
        this.LJLIL = voiceConversionRecordService;
        this.LJLILLLLZI = musicModel;
    }
}
