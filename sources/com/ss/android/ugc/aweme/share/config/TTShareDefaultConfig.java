package com.ss.android.ugc.aweme.share.config;

import X.EnumC62459OfH;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareTitleProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SheetActionProtocol;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;

/* loaded from: classes11.dex */
public abstract class TTShareDefaultConfig<T extends BaseSharePackage> extends ShareConfiguration<BaseSharePackage> {
    public final String LJLIL = EnumC62459OfH.SHARE_DEFAULT.getType();

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public String LIZJ() {
        return this.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public CustomSharePanelBarProtocol LIZ(BaseSharePackage baseSharePackage) {
        return new TTCustomSharePanelBarProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public ShareChannelProtocol LJ(BaseSharePackage baseSharePackage) {
        return new TTShareChannelProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public SharePanelLogicProtocol LJFF(BaseSharePackage baseSharePackage) {
        return new TTSharePanelLogicProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public ShareTitleProtocol LJI(BaseSharePackage baseSharePackage) {
        return new TTShareTitleProtocol(baseSharePackage);
    }

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public SheetActionProtocol LJII(BaseSharePackage baseSharePackage) {
        return new TTSheetActionProtocol(baseSharePackage);
    }
}
