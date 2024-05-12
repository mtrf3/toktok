package com.ss.android.ugc.aweme.challenge.presenter;

import X.C65352Pkq;
import X.C65776Prg;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;

/* loaded from: classes11.dex */
public final class ChallengeShareConfiguration extends TTShareDefaultConfig<ChallengeSharePackageV2> {
    public final C65776Prg LJLILLLLZI = C65352Pkq.LIZ(ChallengeSharePackageV2.class);

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final C65776Prg LIZLLL() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LJ(BaseSharePackage baseSharePackage) {
        return new ChallengeShareChannelProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SheetActionProtocol LJII(BaseSharePackage baseSharePackage) {
        return new ChallengeSheetActionProtocol(baseSharePackage);
    }
}
