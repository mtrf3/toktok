package Y;

import X.ActivityC45651qj;
import X.C05200Ii;
import X.C26227ARb;
import X.C26231ARf;
import X.C34K;
import X.C35384Due;
import X.C36871EdX;
import X.C37246Eja;
import X.C37247Ejb;
import X.C39687Fhr;
import X.C3AW;
import X.C40883G2t;
import X.C45804HyK;
import X.C52232Kei;
import X.C61098NyQ;
import X.C61099NyR;
import X.C61100NyS;
import X.C67630QgU;
import X.C73433Srt;
import X.C77127UOt;
import X.C77143UPj;
import X.C77150UPq;
import X.C77280UUq;
import X.C77337UWv;
import X.C77404UZk;
import X.C780334l;
import X.C78613UtF;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.QBA;
import X.QBH;
import X.QBJ;
import X.U15;
import X.UC0;
import X.UP3;
import X.UPB;
import X.UPG;
import X.UQ4;
import X.X5R;
import X.XKX;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;
import com.ss.android.ugc.aweme.utils.StorageCleanConfig;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.AqS117S0300000_13;
import kotlin.jvm.internal.AqS144S0200000_13;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDuS323S0100000_13 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<C77150UPq> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            case 3:
                subscribe$3(this, interfaceC73573Su9);
                return;
            case 4:
                subscribe$4(this, interfaceC73573Su9);
                return;
            case 5:
                subscribe$5(this, interfaceC73573Su9);
                return;
            case 6:
                subscribe$6(this, interfaceC73573Su9);
                return;
            case 7:
                subscribe$7(this, interfaceC73573Su9);
                return;
            case 8:
                subscribe$8(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public IDuS323S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(IDuS323S0100000_13 iDuS323S0100000_13, InterfaceC73573Su9 interfaceC73573Su9) {
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new UPB((ContactUFR) iDuS323S0100000_13.l0, interfaceC73573Su9, null), 2);
    }

    public static final void subscribe$1(IDuS323S0100000_13 iDuS323S0100000_13, InterfaceC73573Su9 interfaceC73573Su9) {
        C67630QgU.LIZ().storeLong("last_check_storage_time", System.currentTimeMillis());
        Activity context = (Activity) iDuS323S0100000_13.l0;
        o.LJIIIZ(context, "context");
        StorageCleanConfig LIZ = C77337UWv.LIZ();
        long LIZLLL = C39687Fhr.LIZLLL(context);
        long LJ = C39687Fhr.LJ(context);
        int i = LIZ.diskFreeSpaceThreshold;
        if (LIZLLL > LIZ.appUsageValueThreshold * 1048576 && LJ < i * 1048576) {
            interfaceC73573Su9.onNext(1);
            return;
        }
        Activity context2 = (Activity) iDuS323S0100000_13.l0;
        o.LJIIIZ(context2, "context");
        StorageCleanConfig LIZ2 = C77337UWv.LIZ();
        long LIZLLL2 = C39687Fhr.LIZLLL(context2);
        long LJ2 = C39687Fhr.LJ(context2);
        int i2 = LIZ2.diskFreeSpaceThreshold;
        if (LIZLLL2 < LIZ2.appUsageValueThreshold * 1048576 && LJ2 < i2 * 1048576) {
            interfaceC73573Su9.onNext(2);
        } else {
            interfaceC73573Su9.onComplete();
        }
    }

    public static final void subscribe$2(IDuS323S0100000_13 iDuS323S0100000_13, InterfaceC73573Su9 interfaceC73573Su9) {
        C61098NyQ c61098NyQ = C61099NyR.LIZIZ;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(((ContactUFR) iDuS323S0100000_13.l0).LIZJ());
        if (LJJIFFI != null) {
            C61100NyS LIZ = c61098NyQ.LIZIZ(LJJIFFI, TokenCert.Companion.with("bpea-obtain_contact_access")).LIZ("android.permission.READ_CONTACTS");
            C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
            LIZ.LIZ(new C77127UOt((ContactUFR) iDuS323S0100000_13.l0, c73433Srt));
            LIZ.LIZJ(new IDeS156S0200000_13((ContactUFR) iDuS323S0100000_13.l0, c73433Srt, 0));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final void subscribe$3(IDuS323S0100000_13 iDuS323S0100000_13, InterfaceC73573Su9 interfaceC73573Su9) {
        ContactUFR contactUFR = (ContactUFR) iDuS323S0100000_13.l0;
        contactUFR.getClass();
        UQ4.LJIILIIL(contactUFR.LIZLLL(), "user", "contact", contactUFR.LJ(), "on", "off", null, contactUFR.LJLJJL, 64);
        C26227ARb c26227ARb = new C26227ARb(contactUFR.LIZJ());
        c26227ARb.LIZIZ(UP3.LIZ());
        UC0.LIZJ(c26227ARb, new AqS144S0200000_13(contactUFR, (C73433Srt) interfaceC73573Su9, 61));
        c26227ARb.LJII = false;
        c26227ARb.LJI().LIZLLL();
    }

    public static final void subscribe$4(IDuS323S0100000_13 iDuS323S0100000_13, InterfaceC73573Su9 interfaceC73573Su9) {
        String str;
        o.LJIIIIZZ(UUID.randomUUID().toString(), "randomUUID().toString()");
        C77143UPj c77143UPj = new C77143UPj((UPG) iDuS323S0100000_13.l0, (C73433Srt) interfaceC73573Su9);
        QBA LIZIZ = QBA.LIZIZ();
        QBJ qbj = new QBJ(C45804HyK.LJJIFFI(((UPG) iDuS323S0100000_13.l0).LIZJ()));
        qbj.LIZ = "facebook";
        C40883G2t c40883G2t = new C40883G2t();
        if (C35384Due.LIZ()) {
            str = "email, user_friends";
        } else {
            str = "user_friends";
        }
        c40883G2t.LIZLLL("fb_read_permissions", str);
        Bundle bundle = (Bundle) c40883G2t.LIZ;
        Bundle bundle2 = qbj.LIZLLL;
        if (bundle2 == null) {
            qbj.LIZLLL = bundle;
        } else {
            bundle2.putAll(bundle);
        }
        qbj.LIZJ = c77143UPj;
        QBH qbh = new QBH(qbj);
        UPG.LJLLLL = true;
        LIZIZ.getClass();
        QBA.LIZJ(qbh);
    }

    public static final void subscribe$5(IDuS323S0100000_13 iDuS323S0100000_13, InterfaceC73573Su9 interfaceC73573Su9) {
        String LIZLLL = ((UPG) iDuS323S0100000_13.l0).LIZLLL();
        String LJ = ((UPG) iDuS323S0100000_13.l0).LJ();
        String LJIIIIZZ = UQ4.LJIIIIZZ();
        UPG upg = (UPG) iDuS323S0100000_13.l0;
        UQ4.LJIIL(LIZLLL, "user", "facebook", LJ, "off", LJIIIIZZ, upg.LJLLI, upg.LJLJJL);
        C26227ARb LIZ = C3AW.LIZ(((UPG) iDuS323S0100000_13.l0).LIZJ());
        LIZ.LIZIZ(C77280UUq.LIZ(((UPG) iDuS323S0100000_13.l0).LIZJ()));
        UC0.LIZJ(LIZ, new AqS144S0200000_13((UPG) iDuS323S0100000_13.l0, (C73433Srt) interfaceC73573Su9, 67));
        LIZ.LJII = false;
        if (C52232Kei.LIZ() == 1) {
            LIZ.LJ(R.string.g8i);
        }
        C26231ARf LJI = LIZ.LJI();
        C77280UUq.LIZJ(LJI, ((UPG) iDuS323S0100000_13.l0).LIZJ());
        LJI.LIZLLL();
    }

    public static final void subscribe$6(IDuS323S0100000_13 iDuS323S0100000_13, InterfaceC73573Su9 interfaceC73573Su9) {
        String LIZLLL = ((UPG) iDuS323S0100000_13.l0).LIZLLL();
        String LJ = ((UPG) iDuS323S0100000_13.l0).LJ();
        UPG upg = (UPG) iDuS323S0100000_13.l0;
        UQ4.LJIIL(LIZLLL, "user", "facebook", LJ, "on", "off", upg.LJLLI, upg.LJLJJL);
        C26227ARb LIZ = C3AW.LIZ(((UPG) iDuS323S0100000_13.l0).LIZJ());
        LIZ.LIZIZ(C77280UUq.LIZ(((UPG) iDuS323S0100000_13.l0).LIZJ()));
        UC0.LIZJ(LIZ, new AqS144S0200000_13((UPG) iDuS323S0100000_13.l0, (C73433Srt) interfaceC73573Su9, 70));
        LIZ.LJII = false;
        if (C52232Kei.LIZ() == 1) {
            LIZ.LJ(R.string.g8i);
        }
        C26231ARf LJI = LIZ.LJI();
        C77280UUq.LIZJ(LJI, ((UPG) iDuS323S0100000_13.l0).LIZJ());
        LJI.LIZLLL();
    }

    public static final void subscribe$7(IDuS323S0100000_13 iDuS323S0100000_13, InterfaceC73573Su9 interfaceC73573Su9) {
        ImageModel imageModel;
        User user;
        U15 u15 = (U15) iDuS323S0100000_13.l0;
        LinkPlayerInfo anchorInfo = u15.getAnchorInfo();
        ImageModel imageModel2 = null;
        if (anchorInfo != null && (user = anchorInfo.mUser) != null) {
            imageModel = user.getAvatarThumb();
        } else {
            imageModel = null;
        }
        User LIZIZ = C05200Ii.LIZIZ();
        if (LIZIZ != null) {
            imageModel2 = LIZIZ.getAvatarThumb();
        }
        AqS175S0100000_9 aqS175S0100000_9 = new AqS175S0100000_9((C73433Srt) interfaceC73573Su9, 525);
        C34K c34k = new C34K();
        u15.LJFF(imageModel, "image_0", new AqS117S0300000_13(u15, c34k, aqS175S0100000_9, 13));
        u15.LJFF(imageModel2, "image_1", new AqS117S0300000_13(u15, c34k, aqS175S0100000_9, 14));
    }

    public static final void subscribe$8(IDuS323S0100000_13 iDuS323S0100000_13, InterfaceC73573Su9 interfaceC73573Su9) {
        String filePath = ((C77404UZk) iDuS323S0100000_13.l0).LIZ();
        C37246Eja c37246Eja = C37247Ejb.LIZIZ;
        c37246Eja.getClass();
        o.LJIIIZ(filePath, "filePath");
        C36871EdX.LJ(filePath);
        String LIZLLL = ((C77404UZk) iDuS323S0100000_13.l0).LIZLLL();
        c37246Eja.getClass();
        C37246Eja.LIZIZ(LIZLLL);
        final C77404UZk c77404UZk = (C77404UZk) iDuS323S0100000_13.l0;
        final C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        AbsDownloadListener absDownloadListener = new AbsDownloadListener() { // from class: X.9uC
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                String LJ = C77404UZk.this.LJ();
                File file = new File(LJ);
                String str = C77404UZk.this.LIZLLL;
                if (!file.exists() || !TextUtils.equals(C38352F3k.LIZIZ(file), str)) {
                    InterfaceC73573Su9<String> interfaceC73573Su92 = c73433Srt;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("FIle in  ");
                    interfaceC73573Su92.onError(new Exception(C08380Uo.LIZ(LIZ, C77404UZk.this.LJ, " doesnot match md5", LIZ)));
                    return;
                }
                c73433Srt.onNext(LJ);
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException e) {
                o.LJIIIZ(e, "e");
                c73433Srt.onError(e);
            }
        };
        X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with(((C77404UZk) iDuS323S0100000_13.l0).LIZIZ());
        with.LJ = ((C77404UZk) iDuS323S0100000_13.l0).LIZ();
        C77404UZk c77404UZk2 = (C77404UZk) iDuS323S0100000_13.l0;
        c77404UZk2.LIZIZ();
        with.LIZJ = c77404UZk2.LIZJ(true);
        with.LJIIJ = "legacy_lottie_file";
        with.LJIIL = absDownloadListener;
        with.LIZJ();
    }
}
