package X;

import Y.ACallableS115S0100000_12;
import Y.AgS5S1210000_15;
import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.XSd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C84859XSd {
    public InterfaceC84871XSp LIZ;
    public int LIZIZ;
    public XTR LIZJ;
    public final C84864XSi LJ;
    public XT7 LJFF;
    public boolean LJI;
    public MusicModel LJII;
    public XT0 LJIIIIZZ;
    public final C1HQ<String, Boolean> LJIIIZ = new C1HQ<>();
    public final C0R4 LIZLLL = new C0R4(3);

    public static String LIZIZ(int i, int i2) {
        if (i2 == 0) {
            switch (i) {
                case 0:
                    return "edit_page_list";
                case 1:
                    return "edit_page_favourite";
                case 2:
                    return "edit_page_search";
                case 3:
                    return "edit_page_banner";
                case 4:
                default:
                    return "";
                case 5:
                case 6:
                    return "edit_page_local";
                case 7:
                    return "single_song";
                case 8:
                    return "edit_page_fm";
                case 9:
                    return "sticker_rec";
                case 10:
                    return "challenge_rec";
            }
        }
        if (i2 != 2) {
            return "";
        }
        switch (i) {
            case 0:
                return "shoot_page_list";
            case 1:
                return "shoot_page_favourite";
            case 2:
                return "shoot_page_search";
            case 3:
                return "shoot_page_banner";
            case 4:
            case 7:
            default:
                return "";
            case 5:
            case 6:
                return "shoot_page_local";
            case 8:
                return "shoot_page_fm";
            case 9:
                return "sticker_rec";
            case 10:
                return "challenge_rec";
        }
    }

    public void LIZJ() {
        throw null;
    }

    public C84859XSd(InterfaceC84871XSp interfaceC84871XSp) {
        this.LIZ = interfaceC84871XSp;
        C84864XSi c84864XSi = new C84864XSi(this.LIZ.LJJIZ());
        this.LJ = c84864XSi;
        c84864XSi.LJ = 1;
    }

    public final void LIZ(int i, MusicModel musicModel, boolean z) {
        if (this.LIZ == null || musicModel == null) {
            return;
        }
        this.LJII = musicModel;
        this.LJI = false;
        if (musicModel.isLocalMusic()) {
            AVExternalServiceImpl.LIZ().abilityService().infoService().mp3Legal(musicModel.getLocalPath(), new C84867XSl((C84880XSy) this, musicModel, i));
            return;
        }
        LIZJ();
        Activity LJJIZ = this.LIZ.LJJIZ();
        if (LJJIZ == null || !SS0.LIZIZ(musicModel, LJJIZ, true)) {
            this.LIZ.LJJJJIZL(musicModel, new Exception(LJJIZ.getString(R.string.iia)));
            return;
        }
        if (musicModel.getMusicType().equals(MusicModel.MusicType.ONLINE)) {
            String musicId = musicModel.getMusicId();
            InterfaceC84871XSp interfaceC84871XSp = this.LIZ;
            if (interfaceC84871XSp != null) {
                Activity context = interfaceC84871XSp.LJJIZ();
                XTM cancelType = XTM.VISIBLE_AFTER_5S;
                C67407Qct c67407Qct = new C67407Qct(this, musicId);
                o.LJIIIZ(context, "context");
                o.LJIIIZ(cancelType, "cancelType");
                XTR xtr = new XTR(context, cancelType);
                xtr.LJLJLJ = c67407Qct;
                xtr.setCancelable(false);
                if (V1B.LJJZZI(context, true) && !context.isFinishing() && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/kids/music/ui/DoubleBallLoadingDialog", "show", xtr, new Object[0], "void", new C65300Pk0(false, "()V", "-4053083455391939650")).LIZ) {
                    xtr.show();
                }
                this.LIZJ = xtr;
            }
            this.LJIIIZ.put(musicModel.getMusicId(), Boolean.TRUE);
            String LIZIZ = LIZIZ(i, this.LIZIZ);
            AVExternalServiceImpl.LIZ().provideAVPerformance().start("av_music_download", "MusicDownloadPlayHelper start");
            if (TextUtils.isEmpty(musicModel.getBindChallengeId()) || TextUtils.equals(musicModel.getBindChallengeId(), CardStruct.IStatusCode.DEFAULT)) {
                LIZLLL(musicModel, LIZIZ, z);
            } else {
                C10K.LIZJ(new ACallableS115S0100000_12(musicModel, 5)).LJ(new AgS5S1210000_15((C84880XSy) this, z, LIZIZ, musicModel, 0), C10K.LJIIIIZZ, null);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x016c, code lost:
    
        r5.countDown();
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0275 A[Catch: all -> 0x03d2, TryCatch #0 {all -> 0x03d2, blocks: (B:3:0x0037, B:8:0x004b, B:10:0x005b, B:13:0x0092, B:15:0x00a0, B:18:0x00ae, B:20:0x00b7, B:22:0x0123, B:25:0x012b, B:26:0x0130, B:30:0x016c, B:31:0x016f, B:32:0x015e, B:34:0x0187, B:36:0x01b4, B:37:0x01c2, B:38:0x021d, B:39:0x01e5, B:43:0x0220, B:45:0x0239, B:46:0x023c, B:48:0x0256, B:51:0x026b, B:53:0x0275, B:55:0x02b3, B:56:0x02d5, B:58:0x02db, B:60:0x02e7, B:62:0x02f0, B:64:0x0326, B:65:0x032a, B:67:0x0330, B:69:0x0338, B:70:0x0345, B:73:0x034b, B:74:0x0286, B:78:0x0354, B:80:0x035e, B:81:0x0366, B:83:0x03c9, B:85:0x03cc), top: B:2:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0354 A[Catch: all -> 0x03d2, TryCatch #0 {all -> 0x03d2, blocks: (B:3:0x0037, B:8:0x004b, B:10:0x005b, B:13:0x0092, B:15:0x00a0, B:18:0x00ae, B:20:0x00b7, B:22:0x0123, B:25:0x012b, B:26:0x0130, B:30:0x016c, B:31:0x016f, B:32:0x015e, B:34:0x0187, B:36:0x01b4, B:37:0x01c2, B:38:0x021d, B:39:0x01e5, B:43:0x0220, B:45:0x0239, B:46:0x023c, B:48:0x0256, B:51:0x026b, B:53:0x0275, B:55:0x02b3, B:56:0x02d5, B:58:0x02db, B:60:0x02e7, B:62:0x02f0, B:64:0x0326, B:65:0x032a, B:67:0x0330, B:69:0x0338, B:70:0x0345, B:73:0x034b, B:74:0x0286, B:78:0x0354, B:80:0x035e, B:81:0x0366, B:83:0x03c9, B:85:0x03cc), top: B:2:0x0037 }] */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.VzG, T, X.XSU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r26, java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84859XSd.LIZLLL(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String, boolean):void");
    }

    public final void LJ(MusicModel musicModel, String str, String str2) {
        InterfaceC84871XSp interfaceC84871XSp = this.LIZ;
        if (interfaceC84871XSp == null) {
            return;
        }
        this.LJI = true;
        if (interfaceC84871XSp.LJJIZ() == null) {
            return;
        }
        LIZJ();
        XTP.LIZ().pause();
        AVExternalServiceImpl.LIZ().publishService().setCurMusic(musicModel, 0);
        XTR xtr = this.LIZJ;
        if (xtr != null) {
            xtr.dismiss();
        }
        this.LIZ.LJJII(musicModel, str, str2);
    }
}
