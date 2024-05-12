package X;

import Y.ARunnableS11S0400000_7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.AclType;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.OdM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62340OdM {
    public static boolean LJ(Aweme aweme) {
        AwemeACLShare awemeACLShare;
        AwemeACLShare awemeACLShare2;
        if (aweme != null) {
            awemeACLShare = aweme.awemeACLShareInfo;
        } else {
            awemeACLShare = null;
        }
        if (awemeACLShare == null) {
            return false;
        }
        ACLCommonShare LJI = LJI(aweme);
        if (LJI == null) {
            return true;
        }
        if (LJI.getCode() != 0 || (awemeACLShare2 = aweme.awemeACLShareInfo) == null || awemeACLShare2.getShareListStatus() != 0) {
            return false;
        }
        return true;
    }

    public static EnumC35463Dvv LJFF(String platformKey) {
        o.LJIIIZ(platformKey, "platformKey");
        if (o.LJ(platformKey, "copy") || o.LJ(platformKey, "qr_code")) {
            return EnumC35463Dvv.THIRD_PLATFORM_FLAG;
        }
        InterfaceC62225ObV LIZIZ = C62324Od6.LIZIZ(platformKey, new C62297Ocf(new C62348OdU(C84763XOl.LJIIIIZZ()), C57563MiV.LJLIL));
        if (LIZIZ != null && LIZIZ.LJIIIIZZ()) {
            return EnumC35463Dvv.THIRD_PLATFORM_FLAG;
        }
        return EnumC35463Dvv.OTHER_PLATFORM_FLAG;
    }

    public static ACLCommonShare LJI(Aweme aweme) {
        ACLCommonShare shareThirdPlatform;
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare != null && (shareThirdPlatform = awemeACLShare.getShareThirdPlatform()) != null) {
            shareThirdPlatform.setAwemeAclType(AclType.SHARE_THIRD_PLATFORM);
            return shareThirdPlatform;
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIIIZZ(java.lang.String r1) {
        /*
            java.lang.String r0 = "channelKey"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case 96619420: goto L29;
                case 486515695: goto L20;
                case 497130182: goto L17;
                case 1934780818: goto Le;
                default: goto Lc;
            }
        Lc:
            r0 = 0
        Ld:
            return r0
        Le:
            java.lang.String r0 = "whatsapp"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L31
            goto Lc
        L17:
            java.lang.String r0 = "facebook"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L31
            goto Lc
        L20:
            java.lang.String r0 = "kakaotalk"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L31
            goto Lc
        L29:
            java.lang.String r0 = "email"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc
        L31:
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62340OdM.LJIIIIZZ(java.lang.String):boolean");
    }

    public static boolean LJIIIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (aweme.getAwemeType() != 41 && aweme.getAwemeType() != 43) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003a A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIJ(java.lang.String r1) {
        /*
            java.lang.String r0 = "channelKey"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1837180097: goto L29;
                case -816556504: goto L32;
                case 3731178: goto L20;
                case 28903346: goto L17;
                case 284397090: goto Le;
                default: goto Lc;
            }
        Lc:
            r0 = 0
        Ld:
            return r0
        Le:
            java.lang.String r0 = "snapchat"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3a
            goto Lc
        L17:
            java.lang.String r0 = "instagram"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3a
            goto Lc
        L20:
            java.lang.String r0 = "zalo"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3a
            goto Lc
        L29:
            java.lang.String r0 = "whatsapp_status"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3a
            goto Lc
        L32:
            java.lang.String r0 = "instagram_story"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc
        L3a:
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62340OdM.LJIIJ(java.lang.String):boolean");
    }

    public static boolean LJIIJJI(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        if (aweme.getAwemeType() == 150) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005e A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIL(java.lang.String r1) {
        /*
            java.lang.String r0 = "channelKey"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1837180097: goto L4d;
                case -816556504: goto L44;
                case 3731178: goto L3b;
                case 28903346: goto L32;
                case 96619420: goto L56;
                case 284397090: goto L29;
                case 486515695: goto L20;
                case 497130182: goto L17;
                case 1934780818: goto Le;
                default: goto Lc;
            }
        Lc:
            r0 = 0
        Ld:
            return r0
        Le:
            java.lang.String r0 = "whatsapp"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5e
            goto Lc
        L17:
            java.lang.String r0 = "facebook"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5e
            goto Lc
        L20:
            java.lang.String r0 = "kakaotalk"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5e
            goto Lc
        L29:
            java.lang.String r0 = "snapchat"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5e
            goto Lc
        L32:
            java.lang.String r0 = "instagram"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5e
            goto Lc
        L3b:
            java.lang.String r0 = "zalo"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5e
            goto Lc
        L44:
            java.lang.String r0 = "instagram_story"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5e
            goto Lc
        L4d:
            java.lang.String r0 = "whatsapp_status"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5e
            goto Lc
        L56:
            java.lang.String r0 = "email"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lc
        L5e:
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62340OdM.LJIIL(java.lang.String):boolean");
    }

    public static boolean LJIILL(ACLCommonShare aCLCommonShare) {
        Activity LJIIIIZZ;
        String toastMsg = aCLCommonShare.getToastMsg();
        if (toastMsg != null && (LJIIIIZZ = C84763XOl.LJIIIIZZ()) != null && toastMsg.length() > 0) {
            C31811Ce7.LIZIZ(LJIIIIZZ, toastMsg);
        }
        if (aCLCommonShare.getCode() == 0) {
            return true;
        }
        return false;
    }

    public static boolean LJIILLIIL(Aweme aweme) {
        ACLCommonShare LJI = LJI(aweme);
        if (LJI == null || LJIILL(LJI)) {
            return true;
        }
        return false;
    }

    public static void LIZ(Context context, AlertDialogC45396Hrk alertDialogC45396Hrk) {
        if (context instanceof Activity) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            o.LJI(LJIJJ);
            if (LJIJJ.isFinishing()) {
                return;
            }
            Activity LJIJJ2 = C45804HyK.LJIJJ(context);
            o.LJI(LJIJJ2);
            if (LJIJJ2.isDestroyed()) {
                return;
            }
        }
        if (alertDialogC45396Hrk != null && alertDialogC45396Hrk.isShowing()) {
            alertDialogC45396Hrk.dismiss();
        }
    }

    public static ACLCommonShare LJII(Aweme aweme, String channelKey) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(channelKey, "channelKey");
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare != null) {
            ACLCommonShare shareThirdPlatform = awemeACLShare.getShareThirdPlatform();
            if (shareThirdPlatform != null) {
                shareThirdPlatform.setAwemeAclType(AclType.SHARE_THIRD_PLATFORM);
                return shareThirdPlatform;
            }
            List<ACLCommonShare> platformList = awemeACLShare.getPlatformList();
            if (platformList != null) {
                for (ACLCommonShare aCLCommonShare : platformList) {
                    if (TextUtils.equals(channelKey, aCLCommonShare.getPlatformId())) {
                        aCLCommonShare.setAwemeAclType(AclType.PLATFORM_LIST);
                        return aCLCommonShare;
                    }
                }
            }
            ACLCommonShare shareGeneral = awemeACLShare.getShareGeneral();
            if (shareGeneral != null) {
                shareGeneral.setAwemeAclType(AclType.SHARE_GENERAL);
            }
            return awemeACLShare.getShareGeneral();
        }
        return null;
    }

    public static boolean LJIILJJIL(Context context, AwemeSharePackage sharePackage, String channelKey, InterfaceC62349OdV interfaceC62349OdV) {
        ACLCommonShare aCLCommonShare;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(channelKey, "channelKey");
        AwemeACLShare awemeACLShare = sharePackage.LJIILLIIL().awemeACLShareInfo;
        Intent intent = null;
        if (awemeACLShare != null) {
            aCLCommonShare = awemeACLShare.getShareThirdPlatform();
        } else {
            aCLCommonShare = null;
        }
        if (aCLCommonShare != null) {
            interfaceC62349OdV.LIZIZ();
            return true;
        }
        ACLCommonShare LJII = LJII(sharePackage.LJIILLIIL(), channelKey);
        if (LJII != null) {
            InterfaceC62225ObV LIZIZ = C62324Od6.LIZIZ(channelKey, null);
            if (LIZIZ instanceof C62312Ocu) {
                if (LJII.getCode() == 0) {
                    C62312Ocu c62312Ocu = (C62312Ocu) LIZIZ;
                    c62312Ocu.getClass();
                    Activity LIZ = C62494Ofq.LJ.LIZ();
                    if (LIZ != null) {
                        intent = c62312Ocu.LJJII(LIZ, "image/*");
                    }
                    c62312Ocu.LJLJI = intent;
                    if (intent != null) {
                        interfaceC62349OdV.LIZIZ();
                        return true;
                    }
                }
                interfaceC62349OdV.LIZ();
                return false;
            }
            if (LJII.getCode() == 0) {
                interfaceC62349OdV.LIZIZ();
                return true;
            }
            interfaceC62349OdV.LIZ();
            return false;
        }
        interfaceC62349OdV.LIZ();
        return false;
    }

    public static void LJIJI(Context context, Aweme aweme, SharePackage sharePackage, AlertDialogC45396Hrk progressDialog) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(progressDialog, "progressDialog");
        if (C45354Hr4.LIZ()) {
            Handler handler = new Handler(C16880lQ.LLJJJJ());
            ARunnableS11S0400000_7 aRunnableS11S0400000_7 = new ARunnableS11S0400000_7(progressDialog, context, aweme, sharePackage, 5);
            int i = 0;
            try {
                SettingsManager.LIZLLL().getClass();
                i = SettingsManager.LJ("show_share_cancel_interval", 0);
            } catch (Throwable unused) {
            }
            handler.postDelayed(aRunnableS11S0400000_7, i * 1000);
        }
    }

    public static boolean LJIJJLI(Context context, AwemeSharePackage sharePackage, String channelKey, InterfaceC62350OdW interfaceC62350OdW) {
        ACLCommonShare aCLCommonShare;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(channelKey, "channelKey");
        sharePackage.LJIILLIIL();
        AwemeACLShare awemeACLShare = sharePackage.LJIILLIIL().awemeACLShareInfo;
        Intent intent = null;
        if (awemeACLShare != null) {
            aCLCommonShare = awemeACLShare.getShareThirdPlatform();
        } else {
            aCLCommonShare = null;
        }
        if (aCLCommonShare != null) {
            interfaceC62350OdW.LIZIZ();
            return true;
        }
        ACLCommonShare LJII = LJII(sharePackage.LJIILLIIL(), channelKey);
        if (LJII != null) {
            InterfaceC62225ObV LIZIZ = C62324Od6.LIZIZ(channelKey, null);
            if (LIZIZ instanceof C62312Ocu) {
                if (LJII.getCode() == 0) {
                    C62312Ocu c62312Ocu = (C62312Ocu) LIZIZ;
                    c62312Ocu.getClass();
                    Activity LIZ = C62494Ofq.LJ.LIZ();
                    if (LIZ != null) {
                        intent = c62312Ocu.LJJII(LIZ, "video/*");
                    }
                    c62312Ocu.LJLILLLLZI = intent;
                    if (intent != null) {
                        interfaceC62350OdW.LIZIZ();
                        return true;
                    }
                }
                interfaceC62350OdW.LIZ();
                return false;
            }
            if (LJII.getCode() == 0) {
                interfaceC62350OdW.LIZIZ();
                return true;
            }
            interfaceC62350OdW.LIZ();
            return false;
        }
        interfaceC62350OdW.LIZ();
        return false;
    }

    public static void LJIILIIL(int i, int i2, int i3, String str, String str2) {
        C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", str);
        LIZLLL.LJIIIZ("enter_method", "download");
        LIZLLL.LJIIIZ("now_type", str2);
        LIZLLL.LIZLLL(i, "is_today");
        LIZLLL.LIZLLL(i2, "is_self");
        LIZLLL.LIZLLL(i3, "privacy_setting");
        FMX.LJIIL("show_panel_function", LIZLLL.LIZ);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00db, code lost:
    
        if (r6.equals("now_invite") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e7, code lost:
    
        r7 = X.C62359Odf.LIZ(r5, X.EnumC62617Ohp.SHARE_NOW);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e5, code lost:
    
        if (r6.equals("now_post") != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIJ(android.content.Context r13, com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage r14, X.InterfaceC62225ObV r15, java.lang.String r16, X.InterfaceC88472Yns r17) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62340OdM.LJIJ(android.content.Context, com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage, X.ObV, java.lang.String, X.Yns):void");
    }

    public static void LJIJJ(Context context, View view, AwemeSharePackage sharePackage, InterfaceC62225ObV channel, InterfaceC88472Yns onShareSuccessCallback) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(onShareSuccessCallback, "onShareSuccessCallback");
        C44938HkM.LJIIIIZZ = channel.key();
        C62364Odk c62364Odk = C62364Odk.LIZIZ;
        c62364Odk.LJIIIIZZ();
        c62364Odk.LJII();
        if (C45367HrH.LIZ(context, sharePackage.LJIILLIIL(), "download_to_share") && C78609UtB.LJJLIIIJ(context) != null) {
            sharePackage.LJIILLIIL();
            ACLCommonShare LJII = LJII(sharePackage.LJIILLIIL(), channel.key());
            if (LJII == null) {
                return;
            }
            String toastMsg = LJII.getToastMsg();
            if (toastMsg != null && toastMsg.length() != 0 && view != null) {
                C26045AKb c26045AKb = new C26045AKb(view);
                c26045AKb.LJIIIZ(toastMsg);
                c26045AKb.LJIIJ();
            }
            if (LJII.getCode() != 0) {
                return;
            }
            String str = "";
            if (C1DF.LJJIII(sharePackage.LJIILLIIL())) {
                C45377HrR c45377HrR = new C45377HrR(context, sharePackage, channel, onShareSuccessCallback);
                Bundle bundle = sharePackage.extras;
                Z8A z8a = Z8A.LIZIZ;
                String string = bundle.getString("enter_from");
                if (string == null) {
                    string = "";
                }
                String string2 = bundle.getString("enter_method");
                if (string2 == null) {
                    string2 = "";
                }
                boolean isFromProfileLongPress = z8a.isFromProfileLongPress(string, string2);
                Bundle LIZ = C0H1.LIZ("download_method", "download_to_share");
                if (isFromProfileLongPress) {
                    C44938HkM.LJIILJJIL = false;
                    C44938HkM.LJIILIIL = bundle.getString("detail_tab_name");
                    String string3 = bundle.getString("profile_uid");
                    if (string3 == null) {
                        string3 = "";
                    }
                    LIZ.putString("profile_uid", string3);
                    String string4 = bundle.getString("enter_method");
                    if (string4 == null) {
                        string4 = "";
                    }
                    LIZ.putString("enter_method", string4);
                    String string5 = bundle.getString("enter_from");
                    if (string5 == null) {
                        string5 = "";
                    }
                    LIZ.putString("enter_from", string5);
                    String string6 = bundle.getString("detail_tab_name");
                    if (string6 == null) {
                        string6 = "";
                    }
                    LIZ.putString("detail_tab_name", string6);
                }
                String string7 = bundle.getString("enter_from");
                if (string7 == null) {
                    string7 = "";
                }
                C87760YcO.LIZ(C44953Hkb.LIZ(context, c45377HrR, sharePackage.LJIILLIIL(), string7, "download_to_share", LIZ, false, "share_download", bundle.getInt("page_type"), channel.key(), "", 0, false));
                return;
            }
            AlertDialogC45396Hrk LIZLLL = AlertDialogC45396Hrk.LIZLLL(context, context.getResources().getString(R.string.q_k), R.style.hq);
            Aweme LJIILLIIL = sharePackage.LJIILLIIL();
            C42592Gnc c42592Gnc = (C42592Gnc) C62347OdT.LIZ.getValue();
            c42592Gnc.LIZIZ = true;
            c42592Gnc.LIZ = LJII(LJIILLIIL, channel.key());
            C42593Gnd LIZ2 = c42592Gnc.LIZ();
            Bundle bundle2 = sharePackage.extras;
            if (bundle2 != null) {
                bundle2.putString("download_method", "download_to_share");
            }
            c62364Odk.LJIIIZ(sharePackage);
            LJIJI(context, LJIILLIIL, sharePackage, LIZLLL);
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
            if (LJJLIIIJ == null) {
                return;
            }
            Integer valueOf = Integer.valueOf(sharePackage.extras.getInt("page_type"));
            C45374HrO c45374HrO = new C45374HrO(LIZLLL, context, sharePackage, channel, onShareSuccessCallback, LJIILLIIL);
            String string8 = sharePackage.extras.getString("enter_from");
            if (string8 != null) {
                str = string8;
            }
            c62364Odk.LJ(LJJLIIIJ, valueOf, LJIILLIIL, c45374HrO, LIZ2, str);
        }
    }

    public static void LIZIZ(Aweme aweme, InterfaceC62225ObV channel, InterfaceC88472Yns interfaceC88472Yns, SharePackage sharePackage, String path, int i) {
        String str;
        String str2;
        String str3;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(path, "path");
        String str4 = "video_form";
        if (o.LJ(channel.key(), "snapchat")) {
            sharePackage.extras.putString("share_form", "video_form");
            if (aweme != null) {
                OYN.LIZ(EF7.LIZIZ(), sharePackage, channel, path, aweme, new C62218ObO(path, interfaceC88472Yns));
                return;
            }
            return;
        }
        String str5 = "";
        if (!C62358Ode.LIZIZ(channel, sharePackage.itemType, i)) {
            str = "";
            str2 = "";
        } else {
            str = sharePackage.description;
            str2 = sharePackage.title;
        }
        if (i != 6) {
            str3 = "";
        } else {
            str3 = OYF.LIZJ(channel, sharePackage.url, sharePackage.itemType);
            str4 = "url_video_form";
        }
        sharePackage.extras.putString("share_form", str4);
        sharePackage.extras.putString("share_url", str3);
        C62314Ocw c62314Ocw = new C62314Ocw(OYF.LJ(EF7.LIZIZ(), path), str, str2, str3, 8);
        String str6 = c62314Ocw.LJ;
        if (str6 != null) {
            str5 = str6;
        }
        ((BaseBundle) c62314Ocw.LIZ).putString("content_url", str5);
        ((BaseBundle) c62314Ocw.LIZ).putString("media_type", "video/mp4");
        interfaceC88472Yns.invoke(c62314Ocw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0264, code lost:
    
        if (X.C62344OdQ.LIZIZ(r0) != false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x012c, code lost:
    
        if (r1 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0189, code lost:
    
        if (r7 == null) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r17, android.content.Context r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21, com.ss.android.ugc.aweme.sharer.model.SharePackage r22) {
        /*
            Method dump skipped, instructions count: 813
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62340OdM.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, android.net.Uri, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.sharer.model.SharePackage):void");
    }

    public static void LJIIZILJ(AwemeSharePackage sharePackage, String channelKey, Context context, View view, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(channelKey, "channelKey");
        o.LJIIIZ(context, "context");
        Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
        if (LJJLIIIJ != null) {
            Aweme LJIILLIIL = sharePackage.LJIILLIIL();
            boolean LJ = o.LJ(channelKey, "instagram");
            int i = sharePackage.extras.getInt("page_type");
            C62221ObR c62221ObR = new C62221ObR(interfaceC88472Yns, interfaceC65784Pro);
            String string = sharePackage.extras.getString("enter_from");
            if (string == null) {
                string = "";
            }
            LIZJ(LJJLIIIJ, view, LJIILLIIL, LJ, i, channelKey, c62221ObR, string, sharePackage);
        }
    }

    public static void LIZJ(Activity activity, View view, Aweme aweme, boolean z, int i, String channelKey, InterfaceC43172Gwy interfaceC43172Gwy, String str, SharePackage sharePackage) {
        String str2;
        String str3;
        Bundle bundle;
        String string;
        Bundle bundle2;
        Bundle bundle3;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(channelKey, "channelKey");
        if (!C45367HrH.LIZ(activity, aweme, "download_to_share")) {
            return;
        }
        Z8A z8a = Z8A.LIZIZ;
        String str4 = null;
        if (sharePackage != null && (bundle3 = sharePackage.extras) != null) {
            str4 = bundle3.getString("enter_from");
        }
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        if (sharePackage == null || (bundle2 = sharePackage.extras) == null || (str2 = bundle2.getString("enter_method")) == null) {
            str2 = "";
        }
        if (z8a.isFromProfileLongPress(str4, str2) && sharePackage != null && (bundle = sharePackage.extras) != null && (string = bundle.getString("detail_tab_name")) != null) {
            str5 = string;
        }
        int LJJJIL = C79004UzY.LJJJIL(activity, aweme);
        String LIZ = AnonymousClass629.LIZ("randomUUID().toString()");
        C55247LmF.LIZIZ(GScope.LJLIL, new C62840OlQ(aweme, str, "download_to_share", str5, C79004UzY.LJJJIL(activity, aweme), LIZ), C62840OlQ.class, "Download");
        C45344Hqu c45344Hqu = new C45344Hqu(activity, i, z, channelKey);
        Bundle bundle4 = c45344Hqu.LLIIJLIL;
        bundle4.putString("download_method", "download_to_share");
        bundle4.putString("download_id", LIZ);
        if (C62814Ol0.LJIL(aweme)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        bundle4.putString("is_self_video", str3);
        bundle4.putInt("aweme_type", aweme.getAwemeType());
        C44930HkE.LIZ(c45344Hqu, sharePackage);
        c45344Hqu.LLIIJI = str;
        C44938HkM.LJI = str;
        c45344Hqu.LLIIL = "download_to_share";
        C44938HkM.LJII = "download_to_share";
        c45344Hqu.LLIILII = LJJJIL;
        C44922Hk6 c44922Hk6 = new C44922Hk6(activity, interfaceC43172Gwy);
        c45344Hqu.LJLLL = c44922Hk6;
        C44935HkJ.LIZ = c44922Hk6;
        ACLCommonShare LJII = LJII(aweme, channelKey);
        if (LJII == null) {
            return;
        }
        String popupMsg = LJII.getPopupMsg();
        if (popupMsg == null || popupMsg.length() == 0) {
            String toastMsg = LJII.getToastMsg();
            if (toastMsg != null && toastMsg.length() != 0) {
                if (sharePackage != null) {
                    sharePackage.extras.remove("share_action_key");
                    sharePackage.extras.remove("share_platform");
                }
                if (view != null) {
                    C26045AKb c26045AKb = new C26045AKb(view);
                    c26045AKb.LJIIIZ(toastMsg);
                    c26045AKb.LJIIJ();
                }
            }
            if (LJII.getCode() != 0) {
                return;
            }
            c45344Hqu.LJIIJ(aweme, "share_download", false);
            return;
        }
        C62719OjT.LIZ(activity, popupMsg, Integer.valueOf(LJII.getCode()), new C62346OdS(LJII, c45344Hqu, aweme));
    }
}
