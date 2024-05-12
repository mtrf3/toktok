package com.ss.android.ugc.trill.download.configuration;

import X.AbstractC44957Hkf;
import X.C44952Hka;
import X.C65352Pkq;
import X.C65776Prg;
import com.ss.android.ugc.aweme.share.base.download.configuration.DownloadConfiguration;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadAbilityProtocol;
import com.ss.android.ugc.trill.download.protocol.StoryPhotoDownloadAbilityProtocol;
import com.ss.android.ugc.trill.download.ui.AwemeUIProtocol;

/* loaded from: classes8.dex */
public final class StoryPhotoDownloadConfiguration extends DownloadConfiguration<C44952Hka> {
    public final C65776Prg LJLIL = C65352Pkq.LIZ(C44952Hka.class);

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
        StoryPhotoDownloadAbilityProtocol storyPhotoDownloadAbilityProtocol = new StoryPhotoDownloadAbilityProtocol(abstractC44957Hkf);
        if (storyPhotoDownloadAbilityProtocol.LJLILLLLZI != null && (abstractC44957Hkf instanceof C44952Hka)) {
            return storyPhotoDownloadAbilityProtocol;
        }
        return null;
    }
}
