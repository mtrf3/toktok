package com.ss.android.ugc.aweme.screenshot.configuration;

import X.EnumC62459OfH;
import com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol;
import com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig;
import com.ss.android.ugc.aweme.share.config.TTShareTitleProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareTitleProtocol;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public abstract class ScreenShotShareConfiguration<T extends SharePackage> extends TTShareDefaultConfig<SharePackage> {
    public final String LJLILLLLZI = EnumC62459OfH.SHARE_SCREEN_SHOT.getType();

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final String LIZJ() {
        return this.LJLILLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final CustomSharePanelBarProtocol LIZ(final BaseSharePackage baseSharePackage) {
        return new TTCustomSharePanelBarProtocol(baseSharePackage) { // from class: com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotShareConfiguration$getCustomSharePanelBar$1
            public final boolean LJLIL = true;

            @Override // com.ss.android.ugc.aweme.share.config.TTCustomSharePanelBarProtocol, com.ss.android.ugc.aweme.sharer.protocol.CustomSharePanelBarProtocol
            public final boolean LLZZZIL() {
                return this.LJLIL;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareTitleProtocol LJI(final BaseSharePackage baseSharePackage) {
        return new TTShareTitleProtocol(baseSharePackage) { // from class: com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotShareConfiguration$getShareTitleProtocol$1
            public final int LJLIL;

            @Override // com.ss.android.ugc.aweme.share.config.TTShareTitleProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareTitleProtocol
            public final int LLLLIILLL() {
                return this.LJLIL;
            }

            {
                int i;
                if (ScreenShotFeedbackService.createIScreenShotFeedbackServicebyMonsterPlugin(false).isFeedbackEnable(false)) {
                    i = R.string.c6w;
                } else {
                    i = R.string.r5i;
                }
                this.LJLIL = i;
            }
        };
    }
}
