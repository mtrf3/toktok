package com.ss.android.ugc.aweme.screenshot.configuration;

import X.C44498HdG;
import X.C53293Kvp;
import X.C62263Oc7;
import X.C62366Odm;
import X.C62465OfN;
import X.C65352Pkq;
import X.C65776Prg;
import X.EF7;
import X.InterfaceC62225ObV;
import X.InterfaceC62382Oe2;
import X.InterfaceC62474OfW;
import X.OQA;
import com.ss.android.ugc.aweme.feedback.screenshot.ScreenShotFeedbackService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol;
import com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol;
import com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;

/* loaded from: classes11.dex */
public final class ScreenShotUserShareConfiguration extends ScreenShotShareConfiguration<UserSharePackage> {
    public final C65776Prg LJLJI = C65352Pkq.LIZ(UserSharePackage.class);

    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final C65776Prg LIZLLL() {
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final ShareChannelProtocol LJ(final BaseSharePackage baseSharePackage) {
        return new TTShareChannelProtocol() { // from class: com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotUserShareConfiguration$getShareChannelProtocol$1
            public final C62263Oc7 LJLJI;

            @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
            public final List<InterfaceC62225ObV> g1() {
                List<InterfaceC62225ObV> g1 = super.g1();
                BaseSharePackage baseSharePackage2 = BaseSharePackage.this;
                String string = baseSharePackage2.extras.getString("enter_from");
                if (string == null) {
                    string = "";
                }
                ShareDependService.LIZ.getClass();
                InterfaceC62225ObV LIZ = OQA.LIZ(C44498HdG.LIZ(), (SharePackage) baseSharePackage2, string, 4);
                if (LIZ != null) {
                    g1.add(LIZ);
                }
                if (C53293Kvp.LIZJ() && ScreenShotFeedbackService.createIScreenShotFeedbackServicebyMonsterPlugin(false).isFeedbackEnable(true)) {
                    g1.add(new C62366Odm(EF7.LIZIZ()));
                }
                return g1;
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
            public final /* bridge */ /* synthetic */ InterfaceC62382Oe2 P1() {
                return this.LJLJI;
            }

            {
                super(BaseSharePackage.this);
                this.LJLJI = new C62263Oc7();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareDefaultConfig, com.ss.android.ugc.aweme.share.core.protocol.ShareConfiguration
    public final SharePanelLogicProtocol LJFF(final BaseSharePackage baseSharePackage) {
        return new TTSharePanelLogicProtocol(baseSharePackage) { // from class: com.ss.android.ugc.aweme.screenshot.configuration.ScreenShotUserShareConfiguration$getSharePanelLogicProtocol$1
            public final boolean LJLILLLLZI = true;
            public final C62465OfN LJLJI = new C62465OfN();

            @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
            public final InterfaceC62474OfW A0() {
                return this.LJLJI;
            }

            @Override // com.ss.android.ugc.aweme.share.config.TTSharePanelLogicProtocol, com.ss.android.ugc.aweme.share.core.protocol.SharePanelLogicProtocol
            public final boolean LLFF() {
                return this.LJLILLLLZI;
            }
        };
    }
}
