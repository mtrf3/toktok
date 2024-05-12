package yq4;

import X.C39269Fb7;
import X.C40396FtI;
import X.C45041Hm1;
import X.C58096Mr6;
import X.C58264Mto;
import X.C58265Mtp;
import X.C58266Mtq;
import X.C58267Mtr;
import X.C58268Mts;
import X.C58269Mtt;
import X.C58270Mtu;
import X.C58274Mty;
import X.C58275Mtz;
import X.C58284Mu8;
import X.C62911OmZ;
import X.GJA;
import X.OU8;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IComplianceService;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.service.ComplianceServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.AgeAppealService;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.compliance.api.services.algorefresh.IAlgoRefreshService;
import com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.ComplianceBusinessServiceEmptyImpl;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService;
import com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService;
import com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.IConsentService;
import com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService;
import com.ss.android.ugc.aweme.compliance.business.policy.CompliancePolicyServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeAppealServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.BanAppealServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ChildModeServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceSettingsServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PrivateAccountServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ReportServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TermsConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.share.ShareWarningInfoServiceImpl;
import com.ss.android.ugc.aweme.compliance.common.serviceimpl.ComplianceMonitorServiceImpl;
import com.ss.android.ugc.aweme.compliance.consent.serviceimpl.ConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.AlgoRefreshServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.AntiAddictionServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.FamilyPairingServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.ProtectionServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class a {
    public static final a LIZ = new a();
    public static IReportService LIZIZ;
    public static IAntiAddictionService LIZJ;
    public static IBanAppealService LIZLLL;
    public static IComplianceBusinessService LJ;
    public static IAlgoRefreshService LJFF;
    public static IComplianceService LJI;
    public static IAgeGateService LJII;
    public static IPrivateAccountService LJIIIIZZ;
    public static IComplianceSettingsService LJIIIZ;
    public static ITermsConsentService LJIIJ;
    public static IConsentService LJIIJJI;
    public static IComplianceMonitorService LJIIL;
    public static IPolicyNoticeService LJIILIIL;
    public static IProtectionService LJIILJJIL;
    public static IFamilyPairingService LJIILL;
    public static IChildModeService LJIILLIIL;
    public static ITpcConsentService LJIIZILJ;
    public static IPrivacyService LJIJ;
    public static IShareWarningInfoService LJIJI;
    public static AgeAppealService LJIJJ;
    public static ICompliancePolicyService LJIJJLI;

    public static AgeAppealService LIZ() {
        AgeAppealService ageAppealService;
        AgeAppealService ageAppealService2 = LJIJJ;
        if (ageAppealService2 != null) {
            return ageAppealService2;
        }
        Object LIZ2 = C58096Mr6.LIZ(AgeAppealService.class, false);
        if (LIZ2 != null) {
            ageAppealService = (AgeAppealService) LIZ2;
        } else {
            if (C58096Mr6.LLLZL == null) {
                synchronized (AgeAppealService.class) {
                    if (C58096Mr6.LLLZL == null) {
                        C58096Mr6.LLLZL = new AgeAppealServiceImpl();
                    }
                }
            }
            ageAppealService = C58096Mr6.LLLZL;
        }
        LJIJJ = ageAppealService;
        if (ageAppealService == null) {
            LJIJJ = new C58264Mto();
        }
        return LJIJJ;
    }

    public static final IAgeGateService LIZIZ() {
        IAgeGateService iAgeGateService = LJII;
        if (iAgeGateService != null) {
            return iAgeGateService;
        }
        IAgeGateService LJJ = AgeGateServiceImpl.LJJ();
        LJII = LJJ;
        if (LJJ == null) {
            LJII = new OU8();
        }
        IAgeGateService iAgeGateService2 = LJII;
        o.LJI(iAgeGateService2);
        return iAgeGateService2;
    }

    public static IAlgoRefreshService LIZJ() {
        IAlgoRefreshService iAlgoRefreshService;
        IAlgoRefreshService iAlgoRefreshService2 = LJFF;
        if (iAlgoRefreshService2 != null) {
            return iAlgoRefreshService2;
        }
        Object LIZ2 = C58096Mr6.LIZ(IAlgoRefreshService.class, false);
        if (LIZ2 != null) {
            iAlgoRefreshService = (IAlgoRefreshService) LIZ2;
        } else {
            if (C58096Mr6.c == null) {
                synchronized (IAlgoRefreshService.class) {
                    if (C58096Mr6.c == null) {
                        C58096Mr6.c = new AlgoRefreshServiceImpl();
                    }
                }
            }
            iAlgoRefreshService = C58096Mr6.c;
        }
        LJFF = iAlgoRefreshService;
        if (iAlgoRefreshService == null) {
            LJFF = new C58268Mts();
        }
        IAlgoRefreshService iAlgoRefreshService3 = LJFF;
        o.LJI(iAlgoRefreshService3);
        return iAlgoRefreshService3;
    }

    public static final IAntiAddictionService LIZLLL() {
        IAntiAddictionService iAntiAddictionService;
        IAntiAddictionService iAntiAddictionService2 = LIZJ;
        if (iAntiAddictionService2 != null) {
            return iAntiAddictionService2;
        }
        Object LIZ2 = C58096Mr6.LIZ(IAntiAddictionService.class, false);
        if (LIZ2 != null) {
            iAntiAddictionService = (IAntiAddictionService) LIZ2;
        } else {
            if (C58096Mr6.d == null) {
                synchronized (IAntiAddictionService.class) {
                    if (C58096Mr6.d == null) {
                        C58096Mr6.d = new AntiAddictionServiceImpl();
                    }
                }
            }
            iAntiAddictionService = C58096Mr6.d;
        }
        LIZJ = iAntiAddictionService;
        if (iAntiAddictionService == null) {
            LIZJ = new C58275Mtz();
        }
        IAntiAddictionService iAntiAddictionService3 = LIZJ;
        o.LJI(iAntiAddictionService3);
        return iAntiAddictionService3;
    }

    public static final IBanAppealService LJ() {
        IBanAppealService iBanAppealService = LIZLLL;
        if (iBanAppealService != null) {
            return iBanAppealService;
        }
        IBanAppealService LJIIL2 = BanAppealServiceImpl.LJIIL();
        LIZLLL = LJIIL2;
        if (LJIIL2 == null) {
            LIZLLL = new IBanAppealService() { // from class: X.9RQ
                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void LIZ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void LIZIZ(ActivityC45651qj context) {
                    o.LJIIIZ(context, "context");
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final boolean LIZJ() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final boolean LIZLLL() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final boolean LJ(int i) {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void LJFF() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final AgsWarningInfo LJI() {
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void LJII(ActivityC45651qj activityC45651qj) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void LJIIIIZZ(ActivityC45651qj activityC45651qj) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final String LJIIIZ() {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void LJIIJ() {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final boolean LJIIJJI() {
                    return false;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService
                public final void jumpToAgsStatusPage(Context context, String enterFrom) {
                    o.LJIIIZ(context, "context");
                    o.LJIIIZ(enterFrom, "enterFrom");
                }
            };
        }
        IBanAppealService iBanAppealService2 = LIZLLL;
        o.LJI(iBanAppealService2);
        return iBanAppealService2;
    }

    public static final IComplianceBusinessService LJFF() {
        IComplianceBusinessService iComplianceBusinessService = LJ;
        if (iComplianceBusinessService != null) {
            return iComplianceBusinessService;
        }
        IComplianceBusinessService LJJJJIZL = ComplianceBusinessServiceImpl.LJJJJIZL();
        LJ = LJJJJIZL;
        if (LJJJJIZL == null) {
            LJ = new ComplianceBusinessServiceEmptyImpl();
        }
        IComplianceBusinessService iComplianceBusinessService2 = LJ;
        o.LJI(iComplianceBusinessService2);
        return iComplianceBusinessService2;
    }

    public static final IChildModeService LJI() {
        IChildModeService iChildModeService;
        IChildModeService iChildModeService2 = LJIILLIIL;
        if (iChildModeService2 != null) {
            return iChildModeService2;
        }
        Object LIZ2 = C58096Mr6.LIZ(IChildModeService.class, false);
        if (LIZ2 != null) {
            iChildModeService = (IChildModeService) LIZ2;
        } else {
            if (C58096Mr6.LLLZZ == null) {
                synchronized (IChildModeService.class) {
                    if (C58096Mr6.LLLZZ == null) {
                        C58096Mr6.LLLZZ = new ChildModeServiceImpl();
                    }
                }
            }
            iChildModeService = C58096Mr6.LLLZZ;
        }
        LJIILLIIL = iChildModeService;
        if (iChildModeService == null) {
            LJIILLIIL = new C58284Mu8();
        }
        IChildModeService iChildModeService3 = LJIILLIIL;
        o.LJI(iChildModeService3);
        return iChildModeService3;
    }

    public static final ICompliancePolicyService LJII() {
        ICompliancePolicyService iCompliancePolicyService;
        ICompliancePolicyService iCompliancePolicyService2 = LJIJJLI;
        if (iCompliancePolicyService2 != null) {
            return iCompliancePolicyService2;
        }
        Object LIZ2 = C58096Mr6.LIZ(ICompliancePolicyService.class, false);
        if (LIZ2 != null) {
            iCompliancePolicyService = (ICompliancePolicyService) LIZ2;
        } else {
            if (C58096Mr6.LLLZIL == null) {
                synchronized (ICompliancePolicyService.class) {
                    if (C58096Mr6.LLLZIL == null) {
                        C58096Mr6.LLLZIL = new CompliancePolicyServiceImpl();
                    }
                }
            }
            iCompliancePolicyService = C58096Mr6.LLLZIL;
        }
        LJIJJLI = iCompliancePolicyService;
        if (iCompliancePolicyService == null) {
            LJIJJLI = new C58269Mtt();
        }
        return LJIJJLI;
    }

    public static IConsentService LJIIIIZZ() {
        IConsentService iConsentService;
        IConsentService iConsentService2 = LJIIJJI;
        if (iConsentService2 != null) {
            return iConsentService2;
        }
        Object LIZ2 = C58096Mr6.LIZ(IConsentService.class, false);
        if (LIZ2 != null) {
            iConsentService = (IConsentService) LIZ2;
        } else {
            if (C58096Mr6.LLZZZZ == null) {
                synchronized (IConsentService.class) {
                    if (C58096Mr6.LLZZZZ == null) {
                        C58096Mr6.LLZZZZ = new ConsentServiceImpl();
                    }
                }
            }
            iConsentService = C58096Mr6.LLZZZZ;
        }
        LJIIJJI = iConsentService;
        if (iConsentService == null) {
            LJIIJJI = new C58270Mtu();
        }
        IConsentService iConsentService3 = LJIIJJI;
        o.LJI(iConsentService3);
        return iConsentService3;
    }

    public static final IFamilyPairingService LJIIIZ() {
        IFamilyPairingService iFamilyPairingService;
        IFamilyPairingService iFamilyPairingService2 = LJIILL;
        if (iFamilyPairingService2 != null) {
            return iFamilyPairingService2;
        }
        Object LIZ2 = C58096Mr6.LIZ(IFamilyPairingService.class, false);
        if (LIZ2 != null) {
            iFamilyPairingService = (IFamilyPairingService) LIZ2;
        } else {
            if (C58096Mr6.e == null) {
                synchronized (IFamilyPairingService.class) {
                    if (C58096Mr6.e == null) {
                        C58096Mr6.e = new FamilyPairingServiceImpl();
                    }
                }
            }
            iFamilyPairingService = C58096Mr6.e;
        }
        LJIILL = iFamilyPairingService;
        if (iFamilyPairingService == null) {
            LJIILL = new C58265Mtp();
        }
        IFamilyPairingService iFamilyPairingService3 = LJIILL;
        o.LJI(iFamilyPairingService3);
        return iFamilyPairingService3;
    }

    public static final IComplianceService LJIIJ() {
        IComplianceService iComplianceService = LJI;
        if (iComplianceService != null) {
            return iComplianceService;
        }
        IComplianceService LIZ2 = ComplianceServiceImpl.LIZ();
        LJI = LIZ2;
        if (LIZ2 == null) {
            LJI = new GJA();
        }
        IComplianceService iComplianceService2 = LJI;
        o.LJI(iComplianceService2);
        return iComplianceService2;
    }

    public static final IComplianceMonitorService LJIIJJI() {
        IComplianceMonitorService iComplianceMonitorService;
        IComplianceMonitorService iComplianceMonitorService2 = LJIIL;
        if (iComplianceMonitorService2 != null) {
            return iComplianceMonitorService2;
        }
        Object LIZ2 = C58096Mr6.LIZ(IComplianceMonitorService.class, false);
        if (LIZ2 != null) {
            iComplianceMonitorService = (IComplianceMonitorService) LIZ2;
        } else {
            if (C58096Mr6.LLZZJLIL == null) {
                synchronized (IComplianceMonitorService.class) {
                    if (C58096Mr6.LLZZJLIL == null) {
                        C58096Mr6.LLZZJLIL = new ComplianceMonitorServiceImpl();
                    }
                }
            }
            iComplianceMonitorService = C58096Mr6.LLZZJLIL;
        }
        LJIIL = iComplianceMonitorService;
        if (iComplianceMonitorService == null) {
            LJIIL = new C58266Mtq();
        }
        IComplianceMonitorService iComplianceMonitorService3 = LJIIL;
        o.LJI(iComplianceMonitorService3);
        return iComplianceMonitorService3;
    }

    public static final IPolicyNoticeService LJIIL() {
        IPolicyNoticeService iPolicyNoticeService;
        IPolicyNoticeService iPolicyNoticeService2 = LJIILIIL;
        if (iPolicyNoticeService2 != null) {
            return iPolicyNoticeService2;
        }
        Object LIZ2 = C58096Mr6.LIZ(IPolicyNoticeService.class, false);
        if (LIZ2 != null) {
            iPolicyNoticeService = (IPolicyNoticeService) LIZ2;
        } else {
            if (C58096Mr6.LLZILL == null) {
                synchronized (IPolicyNoticeService.class) {
                    if (C58096Mr6.LLZILL == null) {
                        C58096Mr6.LLZILL = new PolicyNoticeServiceImpl();
                    }
                }
            }
            iPolicyNoticeService = C58096Mr6.LLZILL;
        }
        LJIILIIL = iPolicyNoticeService;
        if (iPolicyNoticeService == null) {
            LJIILIIL = new IPolicyNoticeService() { // from class: X.8GO
                @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
                public final void LIZ(String str, String str2, String str3, String str4, Integer num, Integer num2, Boolean bool, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
                public final View LIZIZ(View rootView) {
                    o.LJIIIZ(rootView, "rootView");
                    return null;
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
                public final void LIZJ(Context context) {
                    o.LJIIIZ(context, "context");
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
                public final void LIZLLL(boolean z) {
                }
            };
        }
        IPolicyNoticeService iPolicyNoticeService3 = LJIILIIL;
        o.LJI(iPolicyNoticeService3);
        return iPolicyNoticeService3;
    }

    public static final IPrivacyService LJIILIIL() {
        IPrivacyService iPrivacyService = LJIJ;
        if (iPrivacyService != null) {
            return iPrivacyService;
        }
        IPrivacyService LJIIIIZZ2 = PrivacyServiceImpl.LJIIIIZZ();
        LJIJ = LJIIIIZZ2;
        if (LJIIIIZZ2 == null) {
            LJIJ = new C45041Hm1();
        }
        IPrivacyService iPrivacyService2 = LJIJ;
        o.LJI(iPrivacyService2);
        return iPrivacyService2;
    }

    public static final IPrivateAccountService LJIILJJIL() {
        IPrivateAccountService iPrivateAccountService;
        IPrivateAccountService iPrivateAccountService2 = LJIIIIZZ;
        if (iPrivateAccountService2 != null) {
            return iPrivateAccountService2;
        }
        Object LIZ2 = C58096Mr6.LIZ(IPrivateAccountService.class, false);
        if (LIZ2 != null) {
            iPrivateAccountService = (IPrivateAccountService) LIZ2;
        } else {
            if (C58096Mr6.LLZL == null) {
                synchronized (IPrivateAccountService.class) {
                    if (C58096Mr6.LLZL == null) {
                        C58096Mr6.LLZL = new PrivateAccountServiceImpl();
                    }
                }
            }
            iPrivateAccountService = C58096Mr6.LLZL;
        }
        LJIIIIZZ = iPrivateAccountService;
        if (iPrivateAccountService == null) {
            LJIIIIZZ = new C58267Mtr();
        }
        IPrivateAccountService iPrivateAccountService3 = LJIIIIZZ;
        o.LJI(iPrivateAccountService3);
        return iPrivateAccountService3;
    }

    public static final IProtectionService LJIILL() {
        IProtectionService iProtectionService = LJIILJJIL;
        if (iProtectionService != null) {
            return iProtectionService;
        }
        IProtectionService LJJ = ProtectionServiceImpl.LJJ();
        LJIILJJIL = LJJ;
        if (LJJ == null) {
            LJIILJJIL = new C40396FtI();
        }
        IProtectionService iProtectionService2 = LJIILJJIL;
        o.LJI(iProtectionService2);
        return iProtectionService2;
    }

    public static final IReportService LJIILLIIL() {
        IReportService iReportService;
        IReportService iReportService2 = LIZIZ;
        if (iReportService2 != null) {
            return iReportService2;
        }
        Object LIZ2 = C58096Mr6.LIZ(IReportService.class, false);
        if (LIZ2 != null) {
            iReportService = (IReportService) LIZ2;
        } else {
            if (C58096Mr6.LLZLI == null) {
                synchronized (IReportService.class) {
                    if (C58096Mr6.LLZLI == null) {
                        C58096Mr6.LLZLI = new ReportServiceImpl();
                    }
                }
            }
            iReportService = C58096Mr6.LLZLI;
        }
        LIZIZ = iReportService;
        if (iReportService == null) {
            LIZIZ = new IReportService() { // from class: X.2Y6
                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final void LIZ(String str, String str2, String str3, String str4, String str5, String str6) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final void LIZIZ(Activity activity, Uri.Builder builder) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final void LIZJ(Activity activity, Uri.Builder builder) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final String LIZLLL(Aweme aweme) {
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final void LJ(Activity activity, Aweme aweme) {
                    o.LJIIIZ(aweme, "aweme");
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final void LJFF(Activity activity, Uri.Builder builder, Bundle bundle) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final void LJI(java.util.Map<String, String> map) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final void LJII(String str, String str2, String str3, String str4, String str5, String str6, Aweme aweme, String str7, String str8, String str9, Context context, String str10, int i) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.report.IReportService
                public final String LJIIIIZZ(String str) {
                    return "";
                }
            };
        }
        IReportService iReportService3 = LIZIZ;
        o.LJI(iReportService3);
        return iReportService3;
    }

    public static final IComplianceSettingsService LJIIZILJ() {
        IComplianceSettingsService iComplianceSettingsService = LJIIIZ;
        if (iComplianceSettingsService != null) {
            return iComplianceSettingsService;
        }
        IComplianceSettingsService LJJIFFI = ComplianceSettingsServiceImpl.LJJIFFI();
        LJIIIZ = LJJIFFI;
        if (LJJIFFI == null) {
            LJIIIZ = new C62911OmZ();
        }
        IComplianceSettingsService iComplianceSettingsService2 = LJIIIZ;
        o.LJI(iComplianceSettingsService2);
        return iComplianceSettingsService2;
    }

    public static final IShareWarningInfoService LJIJ() {
        IShareWarningInfoService iShareWarningInfoService;
        IShareWarningInfoService iShareWarningInfoService2 = LJIJI;
        if (iShareWarningInfoService2 != null) {
            return iShareWarningInfoService2;
        }
        Object LIZ2 = C58096Mr6.LIZ(IShareWarningInfoService.class, false);
        if (LIZ2 != null) {
            iShareWarningInfoService = (IShareWarningInfoService) LIZ2;
        } else {
            if (C58096Mr6.LLZLLLL == null) {
                synchronized (IShareWarningInfoService.class) {
                    if (C58096Mr6.LLZLLLL == null) {
                        C58096Mr6.LLZLLLL = new ShareWarningInfoServiceImpl();
                    }
                }
            }
            iShareWarningInfoService = C58096Mr6.LLZLLLL;
        }
        LJIJI = iShareWarningInfoService;
        if (iShareWarningInfoService == null) {
            LJIJI = new IShareWarningInfoService() { // from class: X.2Kn
                @Override // com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService
                public final void LIZ(Aweme aweme) {
                }

                @Override // com.ss.android.ugc.aweme.compliance.api.services.share.IShareWarningInfoService
                public final boolean LIZIZ(Context activity, Aweme aweme, Bundle bundle, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
                    o.LJIIIZ(activity, "activity");
                    return false;
                }
            };
        }
        return LJIJI;
    }

    public static final ITermsConsentService LJIJI() {
        ITermsConsentService iTermsConsentService = LJIIJ;
        if (iTermsConsentService != null) {
            return iTermsConsentService;
        }
        ITermsConsentService LJII2 = TermsConsentServiceImpl.LJII();
        LJIIJ = LJII2;
        if (LJII2 == null) {
            LJIIJ = new C58274Mty();
        }
        ITermsConsentService iTermsConsentService2 = LJIIJ;
        o.LJI(iTermsConsentService2);
        return iTermsConsentService2;
    }

    public static final ITpcConsentService LJIJJ() {
        ITpcConsentService iTpcConsentService = LJIIZILJ;
        if (iTpcConsentService != null) {
            return iTpcConsentService;
        }
        ITpcConsentService LJIIZILJ2 = TpcConsentServiceImpl.LJIIZILJ();
        LJIIZILJ = LJIIZILJ2;
        if (LJIIZILJ2 == null) {
            LJIIZILJ = new C39269Fb7();
        }
        ITpcConsentService iTpcConsentService2 = LJIIZILJ;
        o.LJI(iTpcConsentService2);
        return iTpcConsentService2;
    }
}
