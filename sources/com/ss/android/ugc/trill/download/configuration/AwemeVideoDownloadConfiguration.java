package com.ss.android.ugc.trill.download.configuration;

import X.AbstractC44957Hkf;
import X.C44956Hke;
import X.C65352Pkq;
import X.C65776Prg;
import com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.MuteAudioAbilityProtocol;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.WaterMarkAbilityProtocol;
import com.ss.android.ugc.trill.download.protocol.AwemeVideoDownloadAbilityProtocol;
import com.ss.android.ugc.trill.download.protocol.AwemeVideoMuteAudioAbilityProtocol;
import com.ss.android.ugc.trill.download.protocol.AwemeVideoWaterMarkAbilityProtocol;
import com.ss.android.ugc.trill.download.ui.AwemeUIProtocol;

/* loaded from: classes8.dex */
public final class AwemeVideoDownloadConfiguration extends DownloadConfiguration<C44956Hke> {
    public final C65776Prg LJLIL = C65352Pkq.LIZ(C44956Hke.class);

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration
    public final AwemeUIProtocol LIZJ() {
        return new AwemeUIProtocol();
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration
    public final C65776Prg LIZLLL() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration
    public final DownloadAbilityProtocol LIZ(AbstractC44957Hkf abstractC44957Hkf) {
        AwemeVideoDownloadAbilityProtocol awemeVideoDownloadAbilityProtocol = new AwemeVideoDownloadAbilityProtocol(abstractC44957Hkf);
        if (awemeVideoDownloadAbilityProtocol.LJLILLLLZI != null && (abstractC44957Hkf instanceof C44956Hke)) {
            return awemeVideoDownloadAbilityProtocol;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration
    public final MuteAudioAbilityProtocol LJ(AbstractC44957Hkf abstractC44957Hkf) {
        AwemeVideoMuteAudioAbilityProtocol awemeVideoMuteAudioAbilityProtocol = new AwemeVideoMuteAudioAbilityProtocol(abstractC44957Hkf);
        if (awemeVideoMuteAudioAbilityProtocol.LJLIL != null && (abstractC44957Hkf instanceof C44956Hke)) {
            return awemeVideoMuteAudioAbilityProtocol;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration
    public final WaterMarkAbilityProtocol LJFF(AbstractC44957Hkf abstractC44957Hkf) {
        AwemeVideoWaterMarkAbilityProtocol awemeVideoWaterMarkAbilityProtocol = new AwemeVideoWaterMarkAbilityProtocol(abstractC44957Hkf);
        if (awemeVideoWaterMarkAbilityProtocol.LJLIL != null && (abstractC44957Hkf instanceof C44956Hke)) {
            return awemeVideoWaterMarkAbilityProtocol;
        }
        return null;
    }
}
