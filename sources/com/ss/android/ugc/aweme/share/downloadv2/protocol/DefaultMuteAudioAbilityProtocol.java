package com.ss.android.ugc.aweme.share.downloadv2.protocol;

import X.AbstractC44957Hkf;
import X.C10K;
import X.QZV;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.MuteAudioAbilityProtocol;
import com.ss.android.ugc.trill.download.DownloadServiceImpl;

/* loaded from: classes8.dex */
public abstract class DefaultMuteAudioAbilityProtocol extends MuteAudioAbilityProtocol {
    public final QZV LJLIL;

    public DefaultMuteAudioAbilityProtocol(AbstractC44957Hkf abstractC44957Hkf) {
        super(abstractC44957Hkf);
        this.LJLIL = DownloadServiceImpl.LJ().LIZ(abstractC44957Hkf);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.MuteAudioAbilityProtocol
    public final C10K<Integer> LIZJ(String str, String str2) {
        QZV qzv = this.LJLIL;
        if (qzv != null) {
            return qzv.LJIILL(str, str2);
        }
        return null;
    }
}
