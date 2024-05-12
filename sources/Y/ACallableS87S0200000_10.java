package Y;

import X.AV1;
import X.AbstractC60548NpY;
import X.AbstractC61131Nyx;
import X.AnonymousClass636;
import X.C03090Af;
import X.C10K;
import X.C38262Ezy;
import X.C38281F0r;
import X.C39048FUe;
import X.C39836FkG;
import X.C39973FmT;
import X.C44498HdG;
import X.C44927HkB;
import X.C60373Nmj;
import X.C60379Nmp;
import X.C60510Now;
import X.C60537NpN;
import X.C60544NpU;
import X.C60547NpX;
import X.C60549NpZ;
import X.C60552Npc;
import X.C60743Nsh;
import X.C60876Nuq;
import X.C61224O1c;
import X.C61228O1g;
import X.C61229O1h;
import X.C61235O1n;
import X.C61258O2k;
import X.C61265O2r;
import X.C61328O5c;
import X.C62509Og5;
import X.C62619Ohr;
import X.C62848OlY;
import X.C76800UCe;
import X.C78866UxK;
import X.C79605VMb;
import X.EnumC39866Fkk;
import X.EnumC39958FmE;
import X.InterfaceC59609NaP;
import X.InterfaceC60276NlA;
import X.InterfaceC60302Nla;
import X.InterfaceC60311Nlj;
import X.InterfaceC60323Nlv;
import X.InterfaceC60597NqL;
import X.InterfaceC88472Yns;
import X.JBR;
import X.NPQ;
import X.O1D;
import X.O1E;
import X.O1I;
import X.O1K;
import X.O1M;
import X.O24;
import X.O26;
import X.O2C;
import X.O2V;
import X.O37;
import X.OQG;
import X.PVC;
import X.QXX;
import X.RunnableC60754Nss;
import X.VEH;
import X.X1D;
import X.YG5;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.LynxError;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.compliance.business.banappeal.ComplianceBusinessActivityAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;
import com.ss.android.ugc.aweme.profile.model.AGSWarningPopupWindow;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS52S1200000_10;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class ACallableS87S0200000_10 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return call$16(this);
            case 17:
                return call$17(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        try {
            InputStream LIZIZ = ((O1I) aCallableS87S0200000_10.l1).LIZIZ();
            if (LIZIZ != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        C62848OlY.LIZIZ(LIZIZ, byteArrayOutputStream, FileUtils.BUFFER_SIZE);
                        C10K LIZIZ2 = C10K.LIZIZ(new ACallableS59S0300000_10(byteArrayOutputStream.toByteArray(), LIZIZ, aCallableS87S0200000_10, 0), C10K.LJIIIIZZ, null);
                        AnonymousClass636.LJFF(byteArrayOutputStream, null);
                        AnonymousClass636.LJFF(LIZIZ, null);
                        return LIZIZ2;
                    } finally {
                    }
                } finally {
                }
            } else {
                ((C60537NpN) ((AqS141S0200000_10) aCallableS87S0200000_10.l0).l1).LIZ.printLog("ResourceLoader stream empty", EnumC39958FmE.E, "LynxKit");
                C60876Nuq c60876Nuq = ((C60537NpN) ((AqS141S0200000_10) aCallableS87S0200000_10.l0).l1).LJ;
                if (c60876Nuq == null) {
                    return null;
                }
                c60876Nuq.LJIJ(new LynxError("ResourceLoader stream empty", 100));
                return C76800UCe.LIZ;
            }
        } catch (Throwable th) {
            C60379Nmp c60379Nmp = ((C60537NpN) ((AqS141S0200000_10) aCallableS87S0200000_10.l0).l1).LIZ;
            StringBuilder LIZ = X1D.LIZ();
            c60379Nmp.printLog(C03090Af.LIZJ(LIZ, "ResourceLoader stream write error, ", th, LIZ), EnumC39958FmE.E, "LynxKit");
            C60876Nuq c60876Nuq2 = ((C60537NpN) ((AqS141S0200000_10) aCallableS87S0200000_10.l0).l1).LJ;
            if (c60876Nuq2 == null) {
                return null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            c60876Nuq2.LJIJ(new LynxError(C03090Af.LIZJ(LIZ2, "ResourceLoader stream write error, ", th, LIZ2), 100));
            return C76800UCe.LIZ;
        }
    }

    public static final Object call$1(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        if (((OQG) aCallableS87S0200000_10.l1).LJLIL.booleanValue()) {
            ShareDependService.LIZ.getClass();
            ShareDependService LIZ = C44498HdG.LIZ();
            Object[] objArr = (Object[]) aCallableS87S0200000_10.l0;
            return LIZ.LJJIIZI(((Integer) objArr[1]).intValue(), "1", (Aweme) objArr[0]);
        }
        ShareDependService.LIZ.getClass();
        ShareDependService LIZ2 = C44498HdG.LIZ();
        Object[] objArr2 = (Object[]) aCallableS87S0200000_10.l0;
        return LIZ2.LJJIIZI(((Integer) objArr2[1]).intValue(), "", (Aweme) objArr2[0]);
    }

    public static final Object call$10(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        ComplianceBusinessActivityAssem.C3(((ComplianceBusinessActivityAssem) aCallableS87S0200000_10.l0).x3(), (AGSWarningPopupWindow) aCallableS87S0200000_10.l1);
        return C76800UCe.LIZ;
    }

    public static final Object call$11(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        try {
            InputStream LIZJ = ((O26) aCallableS87S0200000_10.l1).LIZJ();
            if (LIZJ != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        C62848OlY.LIZIZ(LIZJ, byteArrayOutputStream, FileUtils.BUFFER_SIZE);
                        ((InterfaceC60597NqL) ((AqS52S1200000_10) aCallableS87S0200000_10.l0).l2).LIZ(byteArrayOutputStream.toByteArray(), null);
                        AnonymousClass636.LJFF(byteArrayOutputStream, null);
                        AnonymousClass636.LJFF(LIZJ, null);
                    } finally {
                    }
                } finally {
                }
            } else {
                ((InterfaceC60597NqL) ((AqS52S1200000_10) aCallableS87S0200000_10.l0).l2).LIZ(null, new Throwable("ResourceLoader stream empty"));
            }
        } catch (Throwable th) {
            ((InterfaceC60597NqL) ((AqS52S1200000_10) aCallableS87S0200000_10.l0).l2).LIZ(null, th);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$12(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        InputStream LIZJ = ((O26) aCallableS87S0200000_10.l1).LIZJ();
        if (LIZJ != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    C62848OlY.LIZIZ(LIZJ, byteArrayOutputStream, FileUtils.BUFFER_SIZE);
                    ((QXX) ((AqS52S1200000_10) aCallableS87S0200000_10.l0).l2).LLLILZJ(VEH.LIZ(byteArrayOutputStream.toByteArray()));
                    C39048FUe.LIZIZ.LIZ("get external js resource success", EnumC39866Fkk.I, "ExternalJSProvider");
                    AnonymousClass636.LJFF(byteArrayOutputStream, null);
                    AnonymousClass636.LJFF(LIZJ, null);
                } finally {
                }
            } finally {
            }
        } else {
            ((QXX) ((AqS52S1200000_10) aCallableS87S0200000_10.l0).l2).LLLILZJ(new VEH(-1, new Error("InputStream is null")));
            C39048FUe.LIZIZ.LIZ("get external js resource failed: InputStream is null", EnumC39866Fkk.E, "ExternalJSProvider");
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$13(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((O26) aCallableS87S0200000_10.l1).LJII);
        File file = new File(JBR.LJFF(LIZ, File.separator, "/lang.json", LIZ));
        if (!file.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                C62848OlY.LIZIZ(fileInputStream, byteArrayOutputStream, FileUtils.BUFFER_SIZE);
                ((RunnableC60754Nss) ((AqS176S0100000_10) aCallableS87S0200000_10.l0).l0).LJLJI.LLLILZJ(VEH.LIZ(byteArrayOutputStream.toString(PVC.LIZ.name())));
                AnonymousClass636.LJFF(byteArrayOutputStream, null);
                AnonymousClass636.LJFF(fileInputStream, null);
                return C76800UCe.LIZ;
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AnonymousClass636.LJFF(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final Object call$14(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        try {
            O2V o2v = (O2V) aCallableS87S0200000_10.l0;
            InterfaceC88472Yns interfaceC88472Yns = o2v.LIZIZ;
            Uri parse = UriProtector.parse(o2v.LIZJ);
            o.LJFF(parse, "Uri.parse(sourceUrl)");
            C61258O2k c61258O2k = new C61258O2k(parse);
            C61265O2r c61265O2r = new C61265O2r(new File(((O37) aCallableS87S0200000_10.l1).LIZ));
            c61265O2r.LJLJJI = 0L;
            c61265O2r.LJLJI = ((O37) aCallableS87S0200000_10.l1).LIZIZ;
            c61258O2k.LIZ = c61265O2r;
            interfaceC88472Yns.invoke(c61258O2k);
        } catch (Throwable th) {
            C39836FkG.LJII.getClass();
            if (!C38262Ezy.LIZ().LIZ) {
                C39048FUe c39048FUe = C39048FUe.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                C39048FUe.LIZIZ(c39048FUe, C61328O5c.LIZLLL(LIZ, ((O2V) aCallableS87S0200000_10.l0).LIZ.LIZ, ":resolve error ", th, LIZ), null, null, 6);
            } else {
                throw new Throwable(th);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$15(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        ProfilePageFragment profilePageFragment = (ProfilePageFragment) aCallableS87S0200000_10.l0;
        Aweme aweme = (Aweme) aCallableS87S0200000_10.l1;
        profilePageFragment.getClass();
        InterfaceC59609NaP adFlutterLandPageUtil = YG5.LIZIZ.getAdFlutterLandPageUtil();
        aweme.getAwemeRawAd();
        adFlutterLandPageUtil.LIZJ();
        synchronized (profilePageFragment.LLFF) {
            profilePageFragment.LLFFF = profilePageFragment.Ll(aweme);
            profilePageFragment.LLFII = profilePageFragment.Hl(aweme);
        }
        return null;
    }

    public static final Object call$16(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        O2C.LIZJ((O1M) aCallableS87S0200000_10.l1, (O26) aCallableS87S0200000_10.l0, null, true);
        return C76800UCe.LIZ;
    }

    public static final Object call$17(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        String str;
        JSONObject jSONObject;
        String str2;
        String str3;
        int i;
        try {
            C60547NpX c60547NpX = (C60547NpX) aCallableS87S0200000_10.l1;
            String str4 = c60547NpX.LJFF;
            int i2 = 1;
            Boolean bool = null;
            if (str4 == null) {
                AbstractC60548NpY abstractC60548NpY = c60547NpX.LIZJ;
                if (abstractC60548NpY != null) {
                    int i3 = C60552Npc.LIZ[abstractC60548NpY.LIZJ().ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                str4 = "unknown";
                            } else {
                                str4 = "rn";
                            }
                        } else {
                            str4 = "web";
                        }
                    } else {
                        str4 = "lynx";
                    }
                } else {
                    str4 = null;
                }
            }
            C60544NpU c60544NpU = (C60544NpU) aCallableS87S0200000_10.l0;
            C60547NpX c60547NpX2 = (C60547NpX) aCallableS87S0200000_10.l1;
            JSONObject jSONObject2 = c60547NpX2.LJI;
            AbstractC60548NpY abstractC60548NpY2 = c60547NpX2.LIZJ;
            if (abstractC60548NpY2 != null) {
                str = abstractC60548NpY2.LIZ();
            } else {
                str = null;
            }
            JSONObject LJJIJIIJIL = c60544NpU.LJJIJIIJIL(jSONObject2, str4, str);
            C60544NpU c60544NpU2 = (C60544NpU) aCallableS87S0200000_10.l0;
            JSONObject jSONObject3 = ((C60547NpX) aCallableS87S0200000_10.l1).LJIIIZ;
            C60510Now c60510Now = c60544NpU2.LJLJJL;
            if (c60510Now != null) {
                jSONObject = c60510Now.LJ;
            } else {
                jSONObject = null;
            }
            JSONObject LJJIJIL = C60544NpU.LJJIJIL(jSONObject3, jSONObject, str4);
            C60510Now c60510Now2 = ((C60544NpU) aCallableS87S0200000_10.l0).LJLJJL;
            String str5 = "";
            if (c60510Now2 != null) {
                String str6 = c60510Now2.LIZ;
                if (str6 != null) {
                    str5 = str6;
                }
                str2 = c60510Now2.LIZIZ;
            } else {
                str2 = null;
            }
            String str7 = ((C60547NpX) aCallableS87S0200000_10.l1).LIZ;
            if (str7 != null && str7.length() != 0) {
                str2 = ((C60547NpX) aCallableS87S0200000_10.l1).LIZ;
            }
            String str8 = ((C60547NpX) aCallableS87S0200000_10.l1).LIZIZ;
            if (str8 != null && str8.length() != 0) {
                str5 = ((C60547NpX) aCallableS87S0200000_10.l1).LIZIZ;
            }
            AbstractC60548NpY abstractC60548NpY3 = ((C60547NpX) aCallableS87S0200000_10.l1).LIZJ;
            if (abstractC60548NpY3 == null || (str3 = abstractC60548NpY3.LIZIZ()) == null) {
                str3 = ((C60547NpX) aCallableS87S0200000_10.l1).LJ;
            }
            AbstractC60548NpY abstractC60548NpY4 = ((C60547NpX) aCallableS87S0200000_10.l1).LIZJ;
            if (abstractC60548NpY4 != null) {
                if (!(abstractC60548NpY4 instanceof C60549NpZ)) {
                    abstractC60548NpY4 = null;
                }
                C60549NpZ c60549NpZ = (C60549NpZ) abstractC60548NpY4;
                if (c60549NpZ != null) {
                    InterfaceC60311Nlj<String, Object> LJII = C60373Nmj.LIZIZ().LJII(c60549NpZ.LIZ);
                    if (LJII != null) {
                        bool = LJII.getBoolean("res_memory");
                    }
                    if (o.LJ(bool, Boolean.TRUE)) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    LJJIJIIJIL.put("res_memory", i);
                }
            }
            if (!o.LJ(((C60547NpX) aCallableS87S0200000_10.l1).LJIIIIZZ, Boolean.TRUE)) {
                i2 = 0;
            }
            C60547NpX c60547NpX3 = (C60547NpX) aCallableS87S0200000_10.l1;
            C79605VMb c79605VMb = new C79605VMb(c60547NpX3.LIZLLL);
            c79605VMb.LIZLLL = LJJIJIIJIL;
            c79605VMb.LJ = c60547NpX3.LJII;
            c79605VMb.LJIIL = ((C60544NpU) aCallableS87S0200000_10.l0).LJLJI;
            c79605VMb.LJFF = c60547NpX3.LJIIJ;
            c79605VMb.LIZIZ = str5;
            c79605VMb.LIZ = str3;
            c79605VMb.LJII = LJJIJIL;
            c79605VMb.LIZIZ(i2);
            if (str2 != null) {
                c79605VMb.LJIIIZ = str2;
            }
            HybridMultiMonitor.getInstance().customReport(c79605VMb.LIZ());
        } catch (Throwable unused) {
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0092, code lost:
    
        if (r2 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$2(Y.ACallableS87S0200000_10 r8) {
        /*
            java.lang.Object r0 = r8.l0
            X.NPQ r0 = (X.NPQ) r0
            java.lang.Object r8 = r8.l1
            java.util.List r8 = (java.util.List) r8
            r0.getClass()
            java.util.Iterator r5 = r8.iterator()
            r7 = 0
            r4 = 0
        L11:
            boolean r0 = r5.hasNext()
            r6 = 1
            if (r0 == 0) goto L47
            java.lang.Object r3 = r5.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = (com.ss.android.ugc.aweme.feed.model.Aweme) r3
            com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger r2 = new com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger
            r2.<init>()
            X.N0f r1 = X.NMA.LJIIIZ
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r3.getAwemeRawAd()
            r2.LJI(r1, r0)
            if (r4 == 0) goto L38
            r1 = 31744(0x7c00, float:4.4483E-41)
            java.lang.String r0 = "awesome_splash_preload_optimize"
            int r0 = X.C00F.LIZ(r1, r7, r0, r6)
            if (r0 != 0) goto L3f
        L38:
            boolean r0 = X.NPQ.LIZ(r3)
            if (r0 == 0) goto L3f
            r4 = 1
        L3f:
            X.NPU r0 = X.NW6.LIZ()
            r0.LJIIZILJ(r3)
            goto L11
        L47:
            com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService r0 = com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl.LJJI()
            r5 = 0
            if (r0 == 0) goto L56
            r0.LJI()
            X.NHG r0 = X.NHG.LIZ
            r0.LJIILJJIL(r5, r8)
        L56:
            com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager r4 = X.NPQ.LIZIZ
            if (r4 == 0) goto Laf
            java.util.Iterator r3 = r8.iterator()
        L5e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            if (r2 != 0) goto L97
        L6c:
            com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo r1 = X.C63081OpJ.LJJJJZI(r2)
            if (r1 == 0) goto L92
            java.lang.String r0 = r2.getAuthorUid()
            r1.anchorId = r0
        L78:
            com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo r0 = X.C63081OpJ.LJJJJZI(r2)
            if (r0 == 0) goto L95
            java.lang.String r1 = r0.getAwesomeSplashId()
        L82:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L5e
            java.util.Map r0 = r4.LJ(r5)
            if (r0 == 0) goto L5e
            r0.put(r1, r2)
            goto L5e
        L92:
            if (r2 == 0) goto L95
            goto L78
        L95:
            r1 = r5
            goto L82
        L97:
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r1 = r2.getStatus()
            X.NPU r0 = X.NW6.LIZ()
            r0.LJIIJJI()
            r1.setPrivateStatus(r7)
            r1.setAllowComment(r6)
            r1.setAllowShare(r6)
            goto L6c
        Lac:
            r4.LJIIIIZZ()
        Laf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS87S0200000_10.call$2(Y.ACallableS87S0200000_10):java.lang.Object");
    }

    public static final Object call$3(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        InterfaceC60276NlA interfaceC60276NlA;
        if (((O1I) aCallableS87S0200000_10.l1).LIZLLL.LJII != null && (interfaceC60276NlA = (InterfaceC60276NlA) ((O1D) aCallableS87S0200000_10.l0).getService(InterfaceC60276NlA.class)) != null) {
            C60547NpX c60547NpX = ((O1I) aCallableS87S0200000_10.l1).LIZLLL;
            O1E LJJIJIIJIL = O1D.LJJIJIIJIL((O1D) aCallableS87S0200000_10.l0);
            String uri = ((O1I) aCallableS87S0200000_10.l1).LJFF.toString();
            o.LJFF(uri, "resInfo.srcUri.toString()");
            c60547NpX.LJIIIIZZ = Boolean.valueOf(O1K.LIZ(LJJIJIIJIL, uri));
            interfaceC60276NlA.LJ(c60547NpX);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        InterfaceC60302Nla Zf;
        try {
            C61229O1h c61229O1h = (C61229O1h) aCallableS87S0200000_10.l0;
            InterfaceC88472Yns interfaceC88472Yns = c61229O1h.LIZIZ;
            Uri parse = UriProtector.parse(c61229O1h.LIZJ);
            o.LJFF(parse, "Uri.parse(sourceUrl)");
            C61224O1c c61224O1c = new C61224O1c(parse);
            C61235O1n c61235O1n = new C61235O1n(new File(((O24) aCallableS87S0200000_10.l1).LIZ));
            c61235O1n.LJLJLLL = 0L;
            c61235O1n.LJLJLJ = ((O24) aCallableS87S0200000_10.l1).LIZIZ;
            c61224O1c.LIZ = c61235O1n;
            interfaceC88472Yns.invoke(c61224O1c);
        } catch (Throwable th) {
            InterfaceC60323Nlv interfaceC60323Nlv = ((C61229O1h) aCallableS87S0200000_10.l0).LIZLLL.LJIIJ;
            if (interfaceC60323Nlv == null || (Zf = interfaceC60323Nlv.Zf()) == null || !Zf.isDebug()) {
                C61228O1g c61228O1g = ((C61229O1h) aCallableS87S0200000_10.l0).LIZ;
                StringBuilder LIZ = X1D.LIZ();
                C39973FmT.LIZIZ(c61228O1g, C61328O5c.LIZLLL(LIZ, ((C61229O1h) aCallableS87S0200000_10.l0).LIZ.LJLIL, ":resolve error ", th, LIZ), null, null, 6);
            } else {
                throw new Throwable(th);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$5(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        try {
            InputStream LIZIZ = ((O1I) aCallableS87S0200000_10.l1).LIZIZ();
            if (LIZIZ != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        C62848OlY.LIZIZ(LIZIZ, byteArrayOutputStream, FileUtils.BUFFER_SIZE);
                        ((InterfaceC60597NqL) ((AqS176S0100000_10) aCallableS87S0200000_10.l0).l0).LIZ(byteArrayOutputStream.toByteArray(), null);
                        AnonymousClass636.LJFF(byteArrayOutputStream, null);
                        AnonymousClass636.LJFF(LIZIZ, null);
                    } finally {
                    }
                } finally {
                }
            } else {
                ((InterfaceC60597NqL) ((AqS176S0100000_10) aCallableS87S0200000_10.l0).l0).LIZ(null, new Throwable("ResourceLoader stream empty"));
            }
        } catch (Throwable th) {
            ((InterfaceC60597NqL) ((AqS176S0100000_10) aCallableS87S0200000_10.l0).l0).LIZ(null, th);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        InterfaceC60323Nlv interfaceC60323Nlv;
        InterfaceC60323Nlv interfaceC60323Nlv2;
        InputStream LIZIZ = ((O1I) aCallableS87S0200000_10.l1).LIZIZ();
        if (LIZIZ != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    C62848OlY.LIZIZ(LIZIZ, byteArrayOutputStream, FileUtils.BUFFER_SIZE);
                    ((QXX) ((AqS141S0200000_10) aCallableS87S0200000_10.l0).l1).LLLILZJ(VEH.LIZ(byteArrayOutputStream.toByteArray()));
                    AnonymousClass636.LJFF(byteArrayOutputStream, null);
                    AnonymousClass636.LJFF(LIZIZ, null);
                    WeakReference<InterfaceC60323Nlv> weakReference = ((C60743Nsh) ((AqS141S0200000_10) aCallableS87S0200000_10.l0).l0).LIZ;
                    if (weakReference == null || (interfaceC60323Nlv = weakReference.get()) == null) {
                        return null;
                    }
                    interfaceC60323Nlv.printLog("get external js resource success", EnumC39958FmE.I, "ExternalJSProvider");
                    return C76800UCe.LIZ;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass636.LJFF(LIZIZ, th);
                    throw th2;
                }
            }
        } else {
            ((QXX) ((AqS141S0200000_10) aCallableS87S0200000_10.l0).l1).LLLILZJ(new VEH(-1, new Error("InputStream is null")));
            WeakReference<InterfaceC60323Nlv> weakReference2 = ((C60743Nsh) ((AqS141S0200000_10) aCallableS87S0200000_10.l0).l0).LIZ;
            if (weakReference2 == null || (interfaceC60323Nlv2 = weakReference2.get()) == null) {
                return null;
            }
            interfaceC60323Nlv2.printLog("get external js resource failed: InputStream is null", EnumC39958FmE.E, "ExternalJSProvider");
            return C76800UCe.LIZ;
        }
    }

    public static final Object call$7(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        String replaceAll;
        String str = ((BaseSharePackage) aCallableS87S0200000_10.l0).itemType;
        ShareInfo shareInfo = ((C62509Og5) aCallableS87S0200000_10.l1).LJLILLLLZI.getShareInfo();
        if (shareInfo == null) {
            return "";
        }
        String shareUrl = shareInfo.getShareUrl();
        if (!TextUtils.isEmpty(shareUrl) && !shareUrl.contains("utm_source")) {
            C38281F0r c38281F0r = new C38281F0r(shareUrl);
            c38281F0r.LIZLLL("utm_source", "copy_link");
            c38281F0r.LIZLLL("utm_campaign", "client_share");
            c38281F0r.LIZLLL("utm_medium", "android");
            c38281F0r.LIZLLL("app", "musically");
            c38281F0r.LIZLLL("iid", AppLog.getInstallId());
            c38281F0r.LIZLLL("ugbiz_name", C78866UxK.LJJIJL(str));
            String LIZIZ = C44927HkB.LIZIZ();
            if (!TextUtils.isEmpty(LIZIZ)) {
                c38281F0r.LIZLLL("ug_btm", LIZIZ);
            }
            replaceAll = c38281F0r.LJ();
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("utm_source=");
            LIZ.append("copy_link");
            replaceAll = shareUrl.replaceAll("utm_source=\\w*_?\\w?", X1D.LIZIZ(LIZ));
        }
        shareInfo.setShareUrl(replaceAll);
        String shareUrl2 = shareInfo.getShareUrl();
        if (AV1.LJIIJJI()) {
            return shareUrl2;
        }
        return C62619Ohr.LIZIZ(str, "copy_link", shareUrl2).LIZLLL();
    }

    public static final Object call$8(ACallableS87S0200000_10 aCallableS87S0200000_10) {
        ((AbstractC61131Nyx) aCallableS87S0200000_10.l0).LJI((FeedItemList) aCallableS87S0200000_10.l1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c A[Catch: Exception -> 0x0068, TryCatch #1 {Exception -> 0x0068, blocks: (B:8:0x0024, B:10:0x003c, B:11:0x0044, B:13:0x004a, B:15:0x0062, B:23:0x001f, B:3:0x0005, B:5:0x0013, B:7:0x0019), top: B:2:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$9(Y.ACallableS87S0200000_10 r6) {
        /*
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.Object r0 = r6.l0     // Catch: java.lang.Exception -> L1e
            X.NP1 r0 = (X.NP1) r0     // Catch: java.lang.Exception -> L1e
            X.NVy r0 = r0.LJLLJ     // Catch: java.lang.Exception -> L1e
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L1e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L22
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r0)     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L22
            long r1 = r0.longValue()     // Catch: java.lang.Exception -> L1e
            goto L24
        L1e:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)     // Catch: java.lang.Exception -> L68
        L22:
            r1 = 0
        L24:
            java.lang.String r0 = "cid"
            r5.put(r0, r1)     // Catch: java.lang.Exception -> L68
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> L68
            r4.<init>()     // Catch: java.lang.Exception -> L68
            java.lang.Object r0 = r6.l1     // Catch: java.lang.Exception -> L68
            com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness r0 = (com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness) r0     // Catch: java.lang.Exception -> L68
            java.util.Map r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L68
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Exception -> L68
            if (r0 == 0) goto L62
            java.lang.Object r3 = r6.l1     // Catch: java.lang.Exception -> L68
            com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness r3 = (com.ss.android.ugc.aweme.bullet.business.PassBackWebInfoBusiness) r3     // Catch: java.lang.Exception -> L68
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Exception -> L68
        L44:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L68
            if (r0 == 0) goto L62
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Exception -> L68
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L68
            r3.getClass()     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = java.net.URLDecoder.decode(r1, r0)     // Catch: java.lang.Exception -> L68
            java.lang.String r0 = "decode(str, \"UTF-8\")"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)     // Catch: java.lang.Exception -> L68
            r4.put(r1)     // Catch: java.lang.Exception -> L68
            goto L44
        L62:
            java.lang.String r0 = "url_array"
            r5.put(r0, r4)     // Catch: java.lang.Exception -> L68
            goto L6c
        L68:
            r0 = move-exception
            X.C78983UzD.LJIIZILJ(r0)
        L6c:
            java.lang.String r0 = "aweme_ad_pass_back_web_info_url_empty"
            X.FUA.LIZJ(r0, r5)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS87S0200000_10.call$9(Y.ACallableS87S0200000_10):java.lang.Object");
    }

    public ACallableS87S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }

    public ACallableS87S0200000_10(NPQ npq, List list, Context context, int i) {
        this.$t = i;
        this.l0 = npq;
        this.l1 = list;
    }
}
