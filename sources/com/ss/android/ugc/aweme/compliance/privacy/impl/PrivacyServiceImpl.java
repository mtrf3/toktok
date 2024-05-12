package com.ss.android.ugc.aweme.compliance.privacy.impl;

import X.AbstractC37594EpC;
import X.C47261Igj;
import X.C58096Mr6;
import X.C71977SMr;
import X.C72039SPb;
import X.C72041SPd;
import X.C72043SPf;
import X.C72045SPh;
import X.C85296Xdk;
import X.EE1;
import X.HG3;
import X.InterfaceC101453yX;
import X.RBX;
import X.SNL;
import X.SQ8;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.privacy.sdk.SdkLaunchTask;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import defpackage.t1;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PrivacyServiceImpl implements IPrivacyService {
    public static IPrivacyService LJIIIIZZ() {
        Object LIZ = C58096Mr6.LIZ(IPrivacyService.class, false);
        if (LIZ != null) {
            return (IPrivacyService) LIZ;
        }
        if (C58096Mr6.b == null) {
            synchronized (IPrivacyService.class) {
                if (C58096Mr6.b == null) {
                    C58096Mr6.b = new PrivacyServiceImpl();
                }
            }
        }
        return C58096Mr6.b;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final EE1 LIZIZ() {
        return new SdkLaunchTask();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList() {
        return C47261Igj.LJJIJ(SQ8.class);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LIZ() {
        SNL.LIZIZ().getClass();
        C72043SPf.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final boolean LIZLLL() {
        if (((RBX) HG3.LJIILL()).isLogin() || t1.LJI() || GuestModeServiceImpl.LJIIJJI().LJIIJ()) {
            return true;
        }
        C85296Xdk.LIZ.getClass();
        if (!C85296Xdk.LJFF()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJ() {
        SNL.LIZIZ().getClass();
        C72045SPh.LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final PrivacyUserSettingsV2 getPrivacyUserSettings() {
        SNL.LIZIZ().getClass();
        return C72041SPd.LJI();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final InterfaceC101453yX LJFF() {
        return C71977SMr.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final void LJI(String str) {
        SNL.LIZIZ().getClass();
        C72043SPf.LIZJ(str);
        C72039SPb.LJFF(2, str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final PrivacySettingsAgreementRecord LJII(String str) {
        SNL.LIZIZ().getClass();
        return C72041SPd.LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService
    public final PrivacySettingsRestrictionItem LIZJ(int i, String target) {
        o.LJIIIZ(target, "target");
        SNL.LIZIZ().getClass();
        return C72041SPd.LJFF(i, target);
    }
}
