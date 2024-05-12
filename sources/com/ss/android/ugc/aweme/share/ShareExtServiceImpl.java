package com.ss.android.ugc.aweme.share;

import X.AbstractC37594EpC;
import X.AbstractC62510Og6;
import X.ActivityC45651qj;
import X.AnonymousClass036;
import X.C09900aA;
import X.C107814Kz;
import X.C110614Vt;
import X.C111584Zm;
import X.C118334kf;
import X.C16880lQ;
import X.C188727au;
import X.C198517qh;
import X.C1A7;
import X.C2068389v;
import X.C227738wj;
import X.C2NU;
import X.C32151Nz;
import X.C36703Eap;
import X.C36793EcH;
import X.C39792FjY;
import X.C40328FsC;
import X.C43252GyG;
import X.C43298Gz0;
import X.C43659HBn;
import X.C43694HCw;
import X.C44384HbQ;
import X.C44498HdG;
import X.C44890Hja;
import X.C44903Hjn;
import X.C44913Hjx;
import X.C44928HkC;
import X.C44938HkM;
import X.C45367HrH;
import X.C45373HrN;
import X.C45382HrW;
import X.C46318IFu;
import X.C47261Igj;
import X.C47663InD;
import X.C4LD;
import X.C4PT;
import X.C4XM;
import X.C50420Jqa;
import X.C53172Kts;
import X.C56308M8a;
import X.C56504MFo;
import X.C58096Mr6;
import X.C5S1;
import X.C61730OKo;
import X.C62068OXo;
import X.C62177Oaj;
import X.C62178Oak;
import X.C62281OcP;
import X.C62285OcT;
import X.C62291OcZ;
import X.C62340OdM;
import X.C62355Odb;
import X.C62364Odk;
import X.C62394OeE;
import X.C62397OeH;
import X.C62403OeN;
import X.C62411OeV;
import X.C62417Oeb;
import X.C62418Oec;
import X.C62422Oeg;
import X.C62423Oeh;
import X.C62432Oeq;
import X.C62442Of0;
import X.C62443Of1;
import X.C62462OfK;
import X.C62542Ogc;
import X.C62586OhK;
import X.C62589OhN;
import X.C62608Ohg;
import X.C62619Ohr;
import X.C62628Oi0;
import X.C62629Oi1;
import X.C62634Oi6;
import X.C62686Oiw;
import X.C62708OjI;
import X.C62719OjT;
import X.C62822Ol8;
import X.C62825OlB;
import X.C64702gM;
import X.C73969T1h;
import X.C76800UCe;
import X.C78765Uvh;
import X.C79004UzY;
import X.C79493Ab;
import X.C7DI;
import X.C81184Vtc;
import X.C81303VvX;
import X.C85999Xp5;
import X.C8BR;
import X.DialogC25756A8y;
import X.EF7;
import X.EnumC62419Oed;
import X.EnumC62617Ohp;
import X.FMX;
import X.HG3;
import X.InterfaceC56305M7x;
import X.InterfaceC57312Mt;
import X.InterfaceC62225ObV;
import X.InterfaceC62452OfA;
import X.InterfaceC64712gN;
import X.InterfaceC72642tA;
import X.InterfaceC88472Yns;
import X.MFX;
import X.OSZ;
import X.OYR;
import X.OYS;
import X.RBX;
import X.SY9;
import X.T16;
import X.UVX;
import X.X1D;
import Y.ARunnableS46S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentShareACL;
import com.ss.android.ugc.aweme.comment.model.CommentShareInfo;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.ui.campaign.OperationPlatform;
import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.DownloadedVideoSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.trill.share.data.ShareDatabase;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShareExtServiceImpl extends AbstractC62510Og6 {
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJIILIIL() {
        if (e1.LIZ(31744, "enable_profile_long_press_share", true, false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final String LJJLIIIJL() {
        String str;
        SharingOperationConfig LIZ = C62285OcT.LIZ();
        if (LIZ == null || (str = LIZ.operationId) == null) {
            return "";
        }
        return str;
    }

    public static ShareExtService LJJLIIJ() {
        Object LIZ = C58096Mr6.LIZ(ShareExtService.class, false);
        if (LIZ != null) {
            return (ShareExtService) LIZ;
        }
        if (C58096Mr6.K6 == null) {
            synchronized (ShareExtService.class) {
                if (C58096Mr6.K6 == null) {
                    C58096Mr6.K6 = new ShareExtServiceImpl();
                }
            }
        }
        return C58096Mr6.K6;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LIZ() {
        C62364Odk.LIZIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C62462OfK LIZLLL() {
        return new C62462OfK();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJIJJ() {
        C107814Kz.LIZ.getClass();
        return C107814Kz.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJIFFI() {
        return e1.LIZ(31744, "share_config_refactor", true, false);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C62442Of0 LJJIIZI() {
        return new C62442Of0();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJIJL() {
        return e1.LIZ(31744, "share_panel_refactor", true, false);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C43659HBn LJJJJZ() {
        return new C43659HBn();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJJLIIL() {
        if (!C44938HkM.LIZIZ && !C44938HkM.LIZJ && !C62364Odk.LIZIZ.LJFF() && !C44890Hja.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJJZ() {
        if (C62629Oi1.LIZLLL) {
            C62822Ol8 c62822Ol8 = C79493Ab.LIZ;
            Keva keva = (Keva) c62822Ol8.getValue();
            C62822Ol8 c62822Ol82 = C79493Ab.LIZIZ;
            ((Keva) c62822Ol8.getValue()).storeInt((String) c62822Ol82.getValue(), keva.getInt((String) c62822Ol82.getValue(), 0) + 1);
        }
        C62629Oi1.LIZLLL = false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJL() {
        if (e1.LIZ(31744, "enable_use_new_share_panel", true, false)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList() {
        return C47261Igj.LJJIJ(C43298Gz0.class);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LIZJ() {
        return C39792FjY.LIZ().getBoolean("in_share_campaign_white_list", false);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final String LJI() {
        String LIZIZ = C1A7.LJIILIIL().LIZIZ("last_share_way", "outside_channel");
        o.LJIIIIZZ(LIZIZ, "getAwemeLastShareWay()");
        return LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final String LJIJ() {
        C62397OeH LIZJ = C62397OeH.LIZJ();
        LIZJ.getClass();
        try {
            ShareDatabase shareDatabase = LIZJ.LIZJ;
            if (shareDatabase != null) {
                if (shareDatabase.LJIJI().LIZ(0) != 0) {
                    String[] LIZIZ = LIZJ.LIZIZ();
                    LIZJ.LIZLLL(100, LIZIZ);
                    if (LIZIZ != null && LIZIZ.length > 0) {
                        for (String str : LIZIZ) {
                            InterfaceC62225ObV LIZIZ2 = C62281OcP.LIZIZ(OYR.LIZ, str);
                            if (LIZIZ2 != null && LIZIZ2.LIZLLL(EF7.LIZIZ())) {
                                return str;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final String[] LJJJJJL() {
        String[] strArr;
        C62397OeH.LIZJ().getClass();
        List<? extends SharePlatform> list = C36703Eap.LIZIZ;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends SharePlatform> it = C36703Eap.LIZIZ.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().platformId);
            }
            strArr = (String[]) arrayList.toArray(new String[0]);
        } else {
            strArr = new String[0];
        }
        o.LJIIIIZZ(strArr, "getInstance().gifShareList");
        return strArr;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJJJLL() {
        return C4PT.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final Map<String, InterfaceC62225ObV> LJJIII() {
        return C62423Oeh.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJJJLI() {
        return C62629Oi1.LJIIIIZZ;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final List LJJLI() {
        return C62423Oeh.LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final OSZ<Boolean, String> LJFF(Aweme aweme) {
        return C62291OcZ.LIZLLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJIIIZ(String url) {
        o.LJIIIZ(url, "url");
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("errorDesc", "url is illegal");
        c198517qh.LIZ.put("url", url);
        C09900aA.LJIIJJI("save_video_success_rate", 4, c198517qh.LJ());
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJIIJ(Aweme aweme) {
        String str;
        if (C7DI.LIZ != 0) {
            if (aweme != null) {
                str = aweme.getAuthorUid();
            } else {
                str = null;
            }
            if (o.LJ(str, C62403OeN.LIZIZ.getUid())) {
                C62403OeN.LIZ = false;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJIILLIIL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        return C62340OdM.LJIIJJI(aweme);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJIJI(Comment comment) {
        CommentShareInfo shareInfo;
        CommentShareACL acl;
        if (comment != null && (shareInfo = comment.getShareInfo()) != null && (acl = shareInfo.getAcl()) != null && acl.getCode() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C61730OKo LJJIIJ(Challenge challenge) {
        return new C61730OKo(challenge);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final Drawable LJJIIJZLJL(Activity activity) {
        Drawable LIZ;
        InterfaceC62225ObV LIZ2;
        C62397OeH.LIZJ().getClass();
        String LJJLIIIIJ = C44384HbQ.LJJLIIIIJ();
        if (TextUtils.equals(LJJLIIIIJ, "download")) {
            SY9 sy9 = new SY9(activity, R.raw.icon_2pt_arrow_to_bottom);
            sy9.LJFF(R.attr.go, activity);
            int LJIILLIIL = C32151Nz.LJIILLIIL(32);
            sy9.LJI(LJIILLIIL);
            sy9.LIZLLL(LJIILLIIL);
            C110614Vt c110614Vt = new C110614Vt();
            int LJIILLIIL2 = C32151Nz.LJIILLIIL(48);
            c110614Vt.LJII = LJIILLIIL2;
            c110614Vt.LJI = LJIILLIIL2;
            c110614Vt.LIZJ = Float.valueOf(LJIILLIIL2 / 2.0f);
            c110614Vt.LJFF = Integer.valueOf(R.attr.go);
            c110614Vt.LIZLLL = Integer.valueOf(C32151Nz.LJIILLIIL(1));
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
            LIZ = new LayerDrawable(new Drawable[]{c110614Vt.LIZ(activity), sy9});
        } else {
            if ("more".equalsIgnoreCase(LJJLIIIIJ)) {
                LJJLIIIIJ = "";
            }
            InterfaceC62225ObV LIZ3 = OYR.LIZ(activity, LJJLIIIIJ);
            if (LIZ3 != null && LIZ3.LIZLLL(activity)) {
                LIZ = LIZ3.LIZJ(activity);
            } else {
                C62397OeH LIZJ = C62397OeH.LIZJ();
                LinkedList linkedList = new LinkedList(Arrays.asList(LIZJ.LIZIZ()));
                String[] strArr = new String[linkedList.size()];
                linkedList.toArray(strArr);
                LIZJ.LIZLLL(10, strArr);
                List<String> asList = Arrays.asList(strArr);
                if (!C79004UzY.LJJIFFI(asList)) {
                    for (String str : asList) {
                        if (!TextUtils.equals(str, "chat_merge") && (LIZ2 = OYR.LIZ(activity, str)) != null && LIZ2.LIZLLL(activity)) {
                            LIZ = LIZ2.LIZJ(activity);
                            break;
                        }
                    }
                }
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_color_ellipsis_circle;
                LIZ = c2068389v.LIZ(activity);
            }
        }
        o.LJIIIIZZ(LIZ, "getInstance().getFirstAvailableIcon(activity)");
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJIIZ(SharePackage sharePackage) {
        if (sharePackage instanceof DownloadedVideoSharePackage) {
            LJIIJ(((DownloadedVideoSharePackage) sharePackage).aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJIJIL(Aweme aweme) {
        String str;
        if (C7DI.LIZ != 0) {
            if (aweme != null) {
                str = aweme.getAuthorUid();
            } else {
                str = null;
            }
            if (o.LJ(str, C62403OeN.LIZIZ.getUid())) {
                C62403OeN.LIZ = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJIJLIJ(Uri url) {
        o.LJIIIZ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(url.getHost());
        LIZ.append(url.getPath());
        X1D.LIZIZ(LIZ);
        if (C39792FjY.LIZ().getBoolean("in_share_campaign_white_list", false)) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(url.getHost());
        LIZ2.append(url.getPath());
        String LIZIZ = X1D.LIZIZ(LIZ2);
        Iterator<String> it = C62291OcZ.LIZJ.iterator();
        while (it.hasNext()) {
            if (ujb.o.LJJJLIIL(LIZIZ, it.next(), false)) {
                String queryParameter = UriProtector.getQueryParameter(url, "operation_id");
                if (queryParameter == null || queryParameter.length() == 0 || !o.LJ(queryParameter, "1") || C53172Kts.LIZIZ()) {
                    C39792FjY.LIZ().storeBoolean("in_share_campaign_white_list", false);
                    return;
                } else {
                    C39792FjY.LIZ().storeBoolean("in_share_campaign_white_list", true);
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C118334kf LJJJ(Music music) {
        return new C118334kf(music);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJJI(boolean z) {
        C62629Oi1.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJJJ(Aweme aweme) {
        return C62340OdM.LJ(aweme);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0109, code lost:
    
        if (r7.contains(com.ss.android.ugc.aweme.share.base.model.ShareContentType.VIDEO) != true) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010b, code lost:
    
        r1 = X.C62330OdC.LIZ;
        r2 = new java.util.ArrayList(X.C32I.LJJL(r1, 10));
        r1 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x011e, code lost:
    
        if (r1.hasNext() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0120, code lost:
    
        r3.add(r1.next());
        r2.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f1, code lost:
    
        if (r7 != null) goto L28;
     */
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.InterfaceC62225ObV> LJJJJIZL(com.ss.android.ugc.aweme.share.base.model.ShareContentType[] r13) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ShareExtServiceImpl.LJJJJIZL(com.ss.android.ugc.aweme.share.base.model.ShareContentType[]):java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJJJJ(String str) {
        if (e1.LIZ(31744, "enable_profile_long_press_share", true, false) && C56504MFo.LIZ.contains(str)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJJJL(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIIZZ(aweme.getAid(), "aweme.aid");
        C62403OeN.LIZ = false;
        C62403OeN.LIZ().storeLong("last_publish_success_time", System.currentTimeMillis());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.2gM] */
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJJJZI(Activity activity) {
        o.LJIIIZ(activity, "activity");
        String appLanguage = SettingServiceImpl.LIZ().getAppLanguage();
        String localKey = C85999Xp5.LIZIZ();
        EnumC62419Oed.Companion.getClass();
        if (C62628Oi0.LIZIZ(C62418Oec.LIZ(activity))) {
            o.LJIIIIZZ(localKey, "localKey");
            C62634Oi6.LIZ = new UVX(new C47663InD(appLanguage, localKey), (C64702gM) new InterfaceC64712gN() { // from class: X.2gM
                @Override // X.InterfaceC64712gN
                public final void onEvent(String str, java.util.Map<String, Object> map) {
                    if (map != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
                        }
                        C188727au c188727au = new C188727au();
                        c188727au.LJIIIIZZ(linkedHashMap);
                        FMX.LJIIL(str, c188727au.LIZ);
                        return;
                    }
                    FMX.onEventV3(str);
                }
            }, new C62586OhK());
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C111584Zm LJJJLL(Music music) {
        return new C111584Zm(music);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C62177Oaj LJJJLZIJ(Music music) {
        return new C62177Oaj(music);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJLIIIJ(String groupId) {
        o.LJIIIZ(groupId, "groupId");
        C62403OeN.LIZJ("publish_then_share", groupId);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJLIIIJILLIZJL(Aweme aweme) {
        C44938HkM.LJ = aweme;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C62355Odb LJJLIIIJJI(BaseSharePackage baseSharePackage) {
        boolean z;
        Bundle bundle = baseSharePackage.extras;
        if (bundle != null) {
            z = bundle.getBoolean("is_async_sort");
        } else {
            z = false;
        }
        String str = baseSharePackage.itemType;
        if (str == null) {
            str = "";
        }
        return new C62355Odb(str, false, z);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LIZIZ(Aweme aweme, InterfaceC57312Mt interfaceC57312Mt) {
        boolean z = false;
        if (interfaceC57312Mt == null) {
            return false;
        }
        if (((Boolean) C53172Kts.LIZIZ.getValue()).booleanValue() || C53172Kts.LIZIZ() || C53172Kts.LIZ()) {
            OSZ<Boolean, String> LJJIIJZLJL = interfaceC57312Mt.LJJIIJZLJL();
            if (LJJIIJZLJL != null) {
                Boolean first = LJJIIJZLJL.getFirst();
                o.LJIIIIZZ(first, "{\n            Log.d(\"zha…paignPair.first\n        }");
                return first.booleanValue();
            }
            List LIZ = C62291OcZ.LIZ(aweme);
            String desc = aweme.getDesc();
            String str = "";
            if (desc == null) {
                desc = "";
            }
            SharingOperationConfig LIZ2 = C62285OcT.LIZ();
            String aid = aweme.getAid();
            if (aid != null) {
                str = aid;
            }
            String LIZIZ = C62291OcZ.LIZIZ(LIZ, desc, LIZ2, str, C4LD.LIZIZ.LJJJJ(aweme));
            if (LIZIZ.length() > 0) {
                z = true;
            }
            interfaceC57312Mt.LJJIJL(new OSZ<>(Boolean.valueOf(z), LIZIZ));
            return z;
        }
        interfaceC57312Mt.LJJIJL(null);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final EnumC62617Ohp LJIIIIZZ(String itemType, String url) {
        o.LJIIIZ(itemType, "itemType");
        o.LJIIIZ(url, "url");
        return C62619Ohr.LIZ(itemType, url);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final Drawable LJIILJJIL(Activity activity, String str) {
        OYR.LIZ.getClass();
        InterfaceC62225ObV LIZ = C62281OcP.LIZ(activity, str);
        if (LIZ != null) {
            return LIZ.LIZJ(activity);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJIILL(Aweme aweme, String str) {
        int i;
        o.LJIIIZ(aweme, "aweme");
        if (C4PT.LIZ()) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        if (!o.LJ("personal_homepage", str) || !o.LJ(aweme.getAuthorUid(), C62403OeN.LIZIZ.getUid()) || (i = C7DI.LIZ) == 0 || C62403OeN.LIZIZ(Keva.getRepo("repo_guide_share").getLong("last_publish_success_time", 0L)) || C62403OeN.LIZ) {
            return false;
        }
        if (i != 3) {
            if (i != 5 || C62403OeN.LIZIZ(C62403OeN.LIZ().getLong("last_guide_share_window_show_time", 0L))) {
                return false;
            }
        } else if (C62403OeN.LIZ().getLong("last_guide_share_window_show_time", 0L) == C62403OeN.LIZ().getLong("last_guide_share_window_click_share_time", 0L)) {
            if (C62403OeN.LIZIZ(C62403OeN.LIZ().getLong("last_guide_share_window_show_time", 0L))) {
                return false;
            }
        } else {
            Date date = new Date(C62403OeN.LIZ().getLong("last_guide_share_window_show_time", 0L));
            Date date2 = new Date(System.currentTimeMillis());
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int i2 = calendar.get(1);
            int i3 = calendar.get(2);
            int i4 = calendar.get(5);
            calendar.clear();
            calendar.set(i2, i3, i4);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date2);
            int i5 = calendar2.get(1);
            int i6 = calendar2.get(2);
            int i7 = calendar2.get(5);
            calendar2.clear();
            calendar2.set(i5, i6, i7);
            if ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / 86400000 < 5) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJIIZILJ(Context context, Aweme aweme) {
        o.LJIIIZ(context, "context");
        return C227738wj.LIZ(context, aweme);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJ(Activity activity, AqS134S0200000_3 aqS134S0200000_3) {
        String str;
        OperationPlatform operationPlatform;
        SharingOperationConfig LIZ = C62285OcT.LIZ();
        if (LIZ == null || (operationPlatform = LIZ.operationPlatform) == null || (str = operationPlatform.platformId) == null) {
            str = "";
        }
        aqS134S0200000_3.invoke(new OSZ(str, C62291OcZ.LIZJ(activity)));
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJII(Fragment fragment, C50420Jqa videoEvent) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(videoEvent, "videoEvent");
        int i = videoEvent.LJLIL;
        if (i != 1) {
            if (i != 55) {
                if (i != 56) {
                    return;
                }
                Object obj = videoEvent.LJLILLLLZI;
                o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
                Aweme aweme = (Aweme) obj;
                ActivityC45651qj requireActivity = fragment.requireActivity();
                o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
                String str = videoEvent.LJLLLL;
                o.LJIIIIZZ(str, "videoEvent.enterFrom");
                String str2 = videoEvent.LJLLL;
                o.LJIIIIZZ(str2, "videoEvent.enterMethod");
                MixFeedService.LJJIJIIJIL().LJJIIZ(requireActivity, aweme, new C62542Ogc(aweme), str, str2);
                return;
            }
            Object obj2 = videoEvent.LJLILLLLZI;
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
            final Aweme aweme2 = (Aweme) obj2;
            final ActivityC45651qj requireActivity2 = fragment.requireActivity();
            o.LJIIIIZZ(requireActivity2, "fragment.requireActivity()");
            final String str3 = videoEvent.LJLLLL;
            o.LJIIIIZZ(str3, "videoEvent.enterFrom");
            final String str4 = videoEvent.LJLLL;
            o.LJIIIIZZ(str4, "videoEvent.enterMethod");
            MixFeedService.LJJIJIIJIL().LJIIIIZZ(new InterfaceC56305M7x() { // from class: X.2Kw
                @Override // X.InterfaceC56305M7x
                public final void LIZ(int i2, boolean z) {
                    if (z) {
                        if (i2 == 0) {
                            Bundle bundle = new Bundle();
                            bundle.putSerializable("key_mix_add_aweme_info", Aweme.this);
                            MixFeedService.LJJIJIIJIL().LJIILJJIL(requireActivity2, bundle, 3, str3, str4);
                            return;
                        }
                        MixFeedService.LJJIJIIJIL().LIZLLL(requireActivity2, Aweme.this, "", "", str3, str4);
                        return;
                    }
                    C5S1 c5s1 = new C5S1(requireActivity2);
                    c5s1.LIZJ(R.string.im9);
                    c5s1.LJ();
                }
            });
            return;
        }
        if (!C2NU.LIZ.LIZIZ()) {
            ActivityC45651qj mo49getActivity = fragment.mo49getActivity();
            if (mo49getActivity == null) {
                return;
            }
            C40328FsC.LIZLLL(mo49getActivity, R.string.img);
            return;
        }
        Object obj3 = videoEvent.LJLILLLLZI;
        o.LJII(obj3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.Aweme");
        Aweme aweme3 = (Aweme) obj3;
        ActivityC45651qj mo49getActivity2 = fragment.mo49getActivity();
        if (mo49getActivity2 == null) {
            return;
        }
        ShareDependService.LIZ.getClass();
        ShareDependService LIZ = C44498HdG.LIZ();
        String str5 = videoEvent.LJLLLL;
        o.LJIIIIZZ(str5, "videoEvent.enterFrom");
        String str6 = videoEvent.LJLLLL;
        o.LJIIIIZZ(str6, "videoEvent.enterFrom");
        LIZ.LJ(aweme3, str5, mo49getActivity2, "", str6, "", "", 0);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJIL(int i, String channel) {
        o.LJIIIZ(channel, "channel");
        C62397OeH.LIZJ().LIZ(i, channel);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJJIL(C43694HCw status, ActivityC45651qj activity) {
        String str;
        int i;
        List<EnumC62419Oed> LIZ;
        String str2;
        List<String> urlList;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList;
        o.LJIIIZ(status, "status");
        o.LJIIIZ(activity, "activity");
        CreateBaseAwemeResponse createBaseAwemeResponse = status.LJLJLJ;
        o.LJII(createBaseAwemeResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse");
        CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) createBaseAwemeResponse;
        AVUploadSaveModel aVUploadSaveModel = createAwemeResponse.mSaveModel;
        if (aVUploadSaveModel == null) {
            return false;
        }
        Aweme aweme = createAwemeResponse.aweme;
        if (aweme != null && aweme.getDistributeType() != 1) {
            str = "long";
        } else {
            str = "short";
        }
        boolean isWaterMark = aVUploadSaveModel.isWaterMark();
        o.LJIIIIZZ(aweme, "aweme");
        if (C62340OdM.LJIIJJI(aweme) && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            i = imageList.size();
        } else {
            i = 0;
        }
        if (!C62629Oi1.LJIIIZ && aVUploadSaveModel.getSaveToAlbum()) {
            C45373HrN.LIZIZ(aweme, "video_post_page", "download", str, null, isWaterMark ? 1 : 0, i);
        }
        if (C62629Oi1.LJIIIIZZ) {
            C62417Oeb.LIZLLL(aweme, EnumC62419Oed.LEMON8, "", activity);
        }
        int saveType = aVUploadSaveModel.getSaveType();
        if (!C36793EcH.LIZ()) {
            LIZ = C47261Igj.LJJIJIIJI(EnumC62419Oed.LINE, EnumC62419Oed.MESSENGER);
        } else {
            EnumC62419Oed.Companion.getClass();
            LIZ = C62418Oec.LIZ(activity);
        }
        for (EnumC62419Oed enumC62419Oed : LIZ) {
            if (enumC62419Oed.getSaveType() == saveType) {
                UrlModel LIZJ = C62417Oeb.LIZJ(createAwemeResponse);
                if (LIZJ != null && (urlList = LIZJ.getUrlList()) != null) {
                    str2 = (String) ListProtector.get(urlList, 0);
                } else {
                    str2 = null;
                }
                C78765Uvh.LJIILLIIL(str2);
                if (LIZJ != null) {
                    C62589OhN c62589OhN = new C62589OhN(activity, aweme, enumC62419Oed.getLabel(), LIZJ);
                    c62589OhN.setOnDismissListener(new C62422Oeg(aweme, enumC62419Oed, status, activity));
                    C81303VvX c81303VvX = c62589OhN.LIZIZ;
                    if (c81303VvX != null) {
                        c81303VvX.LIZIZ();
                        if (!c62589OhN.isShowing()) {
                            if (c62589OhN.getContentView().getParent() != null) {
                                ViewParent parent = c62589OhN.getContentView().getParent();
                                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                                C16880lQ.LJLLL(c62589OhN.getContentView(), (ViewGroup) parent);
                            }
                            C81303VvX c81303VvX2 = c62589OhN.LIZIZ;
                            if (c81303VvX2 != null) {
                                c81303VvX2.postDelayed(new ARunnableS46S0100000_10(c62589OhN, 122), 3000L);
                                View decorView = c62589OhN.LIZ.getWindow().getDecorView();
                                if (C4XM.LIZ()) {
                                    C56308M8a.LIZ();
                                }
                                C46318IFu.LIZ.getClass();
                                if (C46318IFu.LIZ()) {
                                    try {
                                        C56308M8a.LIZIZ();
                                        Window window = (Window) C56308M8a.LIZJ.get((WindowManager) C56308M8a.LIZIZ.get(c62589OhN));
                                        WindowManager.LayoutParams attributes = window.getAttributes();
                                        int i2 = attributes.flags;
                                        boolean booleanValue = ((Boolean) C56308M8a.LIZLLL.get(window)).booleanValue();
                                        C56308M8a.LIZLLL.set(window, Boolean.FALSE);
                                        attributes.flags &= -16777217;
                                        c62589OhN.showAtLocation(decorView, 48, 0, 0);
                                        C56308M8a.LIZLLL.set(window, Boolean.valueOf(booleanValue));
                                        attributes.flags = i2;
                                    } catch (Throwable unused) {
                                        c62589OhN.showAtLocation(decorView, 48, 0, 0);
                                    }
                                } else {
                                    c62589OhN.showAtLocation(decorView, 48, 0, 0);
                                }
                            } else {
                                o.LJIJI("pullUpLayout");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("pullUpLayout");
                        throw null;
                    }
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", "video_post_page");
                c188727au.LJIIIZ("platform", enumC62419Oed.getKey());
                FMX.LJIIL("share_notice_after_post", c188727au.LIZ);
                if (!C62629Oi1.LJIIIZ) {
                    C45373HrN.LIZIZ(aweme, "video_post_page", enumC62419Oed.getKey(), str, null, isWaterMark ? 1 : 0, 1);
                    C62629Oi1.LJIIIZ = true;
                }
                return true;
            }
        }
        C62629Oi1.LJIIIZ = true;
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJJJI(Activity activity, C45382HrW currentDownloadVideoStatus) {
        o.LJIIIZ(currentDownloadVideoStatus, "currentDownloadVideoStatus");
        C62608Ohg.LIZ(activity, currentDownloadVideoStatus);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C62686Oiw LJJLIIIIJ(String str, Aweme aweme) {
        if (str == null) {
            str = "";
        }
        return new C62686Oiw(str, aweme, "long_press");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.OYQ] */
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJLIIIJJIZ(final Activity activity, final InterfaceC88472Yns<? super OSZ<String, ? extends Drawable>, C76800UCe> interfaceC88472Yns) {
        C62397OeH LIZJ = C62397OeH.LIZJ();
        LIZJ.getClass();
        String LJJLIIIIJ = C44384HbQ.LJJLIIIIJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("last share type: ");
        LIZ.append(LJJLIIIIJ);
        C43252GyG.LIZ("Util", X1D.LIZIZ(LIZ));
        if ("more".equalsIgnoreCase(LJJLIIIIJ)) {
            LJJLIIIIJ = "";
        }
        if ("copy".equalsIgnoreCase(LJJLIIIIJ) && C62068OXo.LIZ()) {
            interfaceC88472Yns.invoke(new OSZ(LJJLIIIIJ, new CopyLinkChannel().LIZJ(activity)));
            return;
        }
        InterfaceC62225ObV LIZ2 = OYR.LIZ(activity, LJJLIIIIJ);
        if (LIZ2 != null && LIZ2.LIZLLL(activity)) {
            interfaceC88472Yns.invoke(new OSZ(LJJLIIIIJ, LIZ2.LIZJ(activity)));
            return;
        }
        ?? r4 = new InterfaceC88472Yns() { // from class: X.OYQ
            @Override // X.InterfaceC88472Yns
            public final Object invoke(Object obj) {
                InterfaceC88472Yns interfaceC88472Yns2 = interfaceC88472Yns;
                Activity activity2 = activity;
                ArrayList arrayList = (ArrayList) obj;
                if (!C79004UzY.LJJIFFI(arrayList)) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("channel key: ");
                        LIZ3.append(str);
                        C43252GyG.LIZ("Util", X1D.LIZIZ(LIZ3));
                        if (!TextUtils.equals(str, "chat_merge")) {
                            if ("copy".equalsIgnoreCase(str) && C62068OXo.LIZ()) {
                                interfaceC88472Yns2.invoke(new OSZ(str, new CopyLinkChannel().LIZJ(activity2)));
                                return null;
                            }
                            InterfaceC62225ObV LIZ4 = OYR.LIZ(activity2, str);
                            if (LIZ4 != null && LIZ4.LIZLLL(activity2)) {
                                interfaceC88472Yns2.invoke(new OSZ(LIZ4.key(), LIZ4.LIZJ(activity2)));
                                return null;
                            }
                        }
                    }
                }
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_color_ellipsis_circle;
                interfaceC88472Yns2.invoke(new OSZ("more", c2068389v.LIZ(activity2)));
                return null;
            }
        };
        ArrayList arrayList = new ArrayList(Arrays.asList(LIZJ.LIZIZ()));
        long currentTimeMillis = System.currentTimeMillis();
        ShareDatabase shareDatabase = C62397OeH.LIZJ().LIZJ;
        if (shareDatabase == null) {
            return;
        }
        try {
            InterfaceC62452OfA LJIJI = shareDatabase.LJIJI();
            o.LJIIIIZZ(LJIJI, "database.recordDao()");
            LJIJI.LIZLLL(0, 100).LJIJJ(T16.LIZ()).LJIIL(C73969T1h.LIZIZ()).LIZ(new OYS(currentTimeMillis, r4, arrayList));
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJLIIIJLJLI(InterfaceC62225ObV interfaceC62225ObV, C62394OeE c62394OeE) {
        if (o.LJ(interfaceC62225ObV.key(), "contact_list") && !((RBX) HG3.LJIILL()).isLogin()) {
            return;
        }
        c62394OeE.LIZIZ(interfaceC62225ObV);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJIJJLI(TuxIconView tuxIconView, DialogC25756A8y dialogC25756A8y, ActivityC45651qj activityC45651qj) {
        C62628Oi0.LJ(tuxIconView, dialogC25756A8y, activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJIL(Context context, Aweme aweme, String downloadMethod) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(downloadMethod, "downloadMethod");
        return C45367HrH.LIZ(context, aweme, downloadMethod);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJIJIIJI(Aweme aweme, String str, Bundle bundle) {
        C62708OjI.LIZ(aweme, str, bundle);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJ(String str, Integer num, C8BR<?, ?> c8br, OSZ<Integer, String> osz) {
        C62411OeV.LIZ(str, num, c8br, osz);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final boolean LJJIJ(Context context, Activity activity, C44913Hjx c44913Hjx, AqS189S0100000_7 aqS189S0100000_7) {
        ACLCommonShare downloadGeneral;
        String popupMsg;
        ACLCommonShare downloadGeneral2;
        String toastMsg;
        Integer LIZ;
        ACLCommonShare downloadMaskPanel;
        ACLCommonShare downloadMaskPanel2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(activity, "activity");
        Aweme aweme = c44913Hjx.LJFF;
        o.LJI(aweme);
        if (o.LJ(C62443Of1.LIZ, "long_press_download")) {
            AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
            if (awemeACLShare != null && (downloadMaskPanel2 = awemeACLShare.getDownloadMaskPanel()) != null) {
                popupMsg = downloadMaskPanel2.getPopupMsg();
            }
            popupMsg = null;
        } else {
            AwemeACLShare awemeACLShare2 = aweme.awemeACLShareInfo;
            if (awemeACLShare2 != null && (downloadGeneral = awemeACLShare2.getDownloadGeneral()) != null) {
                popupMsg = downloadGeneral.getPopupMsg();
            }
            popupMsg = null;
        }
        Aweme aweme2 = c44913Hjx.LJFF;
        o.LJI(aweme2);
        String str = c44913Hjx.LIZ;
        String str2 = c44913Hjx.LIZIZ;
        if (popupMsg == null || popupMsg.length() == 0) {
            if (o.LJ(C62443Of1.LIZ, "long_press_download")) {
                AwemeACLShare awemeACLShare3 = aweme.awemeACLShareInfo;
                if (awemeACLShare3 != null && (downloadMaskPanel = awemeACLShare3.getDownloadMaskPanel()) != null) {
                    toastMsg = downloadMaskPanel.getToastMsg();
                    if (toastMsg != null && toastMsg.length() > 0) {
                        C5S1 c5s1 = new C5S1(activity);
                        c5s1.LIZLLL(toastMsg);
                        c5s1.LJ();
                    }
                }
                LIZ = C62432Oeq.LIZ(aweme);
                if (LIZ != null || LIZ.intValue() != 0) {
                    return false;
                }
                return true;
            }
            AwemeACLShare awemeACLShare4 = aweme.awemeACLShareInfo;
            if (awemeACLShare4 != null && (downloadGeneral2 = awemeACLShare4.getDownloadGeneral()) != null) {
                toastMsg = downloadGeneral2.getToastMsg();
                if (toastMsg != null) {
                    C5S1 c5s12 = new C5S1(activity);
                    c5s12.LIZLLL(toastMsg);
                    c5s12.LJ();
                }
            }
            LIZ = C62432Oeq.LIZ(aweme);
            if (LIZ != null) {
                return false;
            }
            return true;
        }
        C62719OjT.LIZ(context, popupMsg, C62432Oeq.LIZ(aweme2), new C44903Hjn(aqS189S0100000_7, activity, c44913Hjx, aweme2, str, str2));
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJJIJIIJIL(Aweme aweme, String str, int i, int i2) {
        C45373HrN.LIZIZ(aweme, str, "download", "short", null, i, i2);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C44928HkC LJJI(Activity activity, Aweme aweme, String str, String str2, String str3) {
        String str4 = str;
        o.LJIIIZ(aweme, "aweme");
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        if (str3 != null) {
            str5 = str3;
        }
        return new C44928HkC(activity, aweme, str4, str2, str5);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final C62178Oak LJJIZ(Challenge challenge, boolean z, String str, String str2, String str3) {
        return new C62178Oak(challenge, str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final FrameLayout.LayoutParams LJII(Context context, int i, int i2, int i3, int i4, int i5, int i6) {
        Number valueOf;
        o.LJIIIZ(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.height = i2;
        layoutParams.width = i3;
        int LIZIZ = ((C81184Vtc.LIZIZ(context) - i) - C81184Vtc.LIZJ(context)) - i2;
        if (i6 == 2) {
            valueOf = Integer.valueOf(LIZIZ + i5);
        } else {
            valueOf = Double.valueOf((LIZIZ * 0.5d) + i5);
        }
        layoutParams.gravity = 1;
        layoutParams.topMargin = valueOf.intValue();
        layoutParams.leftMargin = i4;
        return layoutParams;
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJIIJJI(Aweme aweme, Activity activity, String profileUserId, String eneterFrom, int i, View view, Fragment fragment, InterfaceC72642tA<C50420Jqa> eventListener) {
        o.LJIIIZ(profileUserId, "profileUserId");
        o.LJIIIZ(eneterFrom, "eneterFrom");
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(eventListener, "eventListener");
        if (aweme != null && activity != null) {
            String groupId = aweme.getGroupId();
            String authorUid = aweme.getAuthorUid();
            Integer valueOf = Integer.valueOf(i);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("to_user_id", profileUserId);
            if (groupId == null) {
                groupId = "";
            }
            c188727au.LJIIIZ("group_id", groupId);
            if (authorUid == null) {
                authorUid = "";
            }
            c188727au.LJIIIZ("author_id", authorUid);
            c188727au.LJIIIZ("enter_from", eneterFrom);
            c188727au.LJIIIZ("tab_name", MFX.LIZ(valueOf));
            FMX.LJIIL("shortcut_click_trans_layer", c188727au.LIZ);
            String LIZ = MFX.LIZ(Integer.valueOf(i));
            if (C4LD.LIZIZ.LJJJJJ(LIZ)) {
                C62825OlB.LJLLJ = false;
                C62825OlB.LJLLL = false;
                Bundle LIZJ = AnonymousClass036.LIZJ("event_type", eneterFrom, "enter_method", "shortcut_panel");
                LIZJ.putString("profile_uid", profileUserId);
                LIZJ.putString("detail_tab_name", LIZ);
                if (view != null) {
                    view.setScaleX(0.99f);
                    view.setScaleY(0.99f);
                }
                C4LD.LIZ.LIZ(activity, fragment, aweme, false, eventListener, LIZJ);
                if (view != null) {
                    view.setOnTouchListener(new View.OnTouchListener() { // from class: X.2S2
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            if (motionEvent.getAction() == 1) {
                                view2.setScaleX(1.0f);
                                view2.setScaleY(1.0f);
                                return false;
                            }
                            return false;
                        }
                    });
                }
            }
        }
    }
}
