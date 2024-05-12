package X;

import Y.ACallableS113S0100000_10;
import Y.AgS1S1112000_10;
import android.os.Vibrator;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.OZi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62114OZi implements OX5 {
    public ActivityC86117Xqz LIZ;
    public InterfaceC62130OZy LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public boolean LJFF;
    public C57426MgI LJI;
    public boolean LJIIIIZZ;
    public final Long LJIIJJI;
    public List<InterfaceC58734N3i> LJIILIIL;
    public List<InterfaceC58734N3i> LJIILJJIL;
    public String LJ = "default";
    public final C62126OZu LJIIL = new C62126OZu("QRCodeScanPresenter");
    public final R39 LJIIIZ = new R39();
    public final C62129OZx LJII = new C62129OZx();
    public final QrCodeScanService LJIIJ = QrCodeScanImpl.LJIIJ();

    public final void LIZLLL(String str) {
        ActivityC86117Xqz activityC86117Xqz = this.LIZ;
        if (activityC86117Xqz == null || activityC86117Xqz.isDestroyed() || TextUtils.isEmpty(str)) {
            return;
        }
        this.LJIIIIZZ = true;
        this.LJIIJ.LIZ(str, this.LIZ, new C1YZ(this));
    }

    public C62114OZi(ActivityC86117Xqz activityC86117Xqz, InterfaceC62130OZy interfaceC62130OZy) {
        this.LJIIJJI = 0L;
        this.LIZ = activityC86117Xqz;
        this.LIZIZ = interfaceC62130OZy;
        this.LJIIJJI = Long.valueOf(System.currentTimeMillis());
    }

    public final void LIZJ(String str, String str2) {
        ActivityC86117Xqz activityC86117Xqz = this.LIZ;
        if (activityC86117Xqz == null || activityC86117Xqz.isDestroyed()) {
            return;
        }
        this.LJIIIIZZ = true;
        try {
            this.LJIIJ.LJIIIZ(str, str2, this.LIZ, AVExternalServiceImpl.LIZ().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera(), new C62120OZo(this));
        } catch (Exception unused) {
        }
    }

    public static void LIZIZ(String str, String str2, String str3, boolean z) {
        String str4;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "scan");
        if (z) {
            str4 = "scan_album";
        } else {
            str4 = "scan_cam";
        }
        c188727au.LJIIIZ("enter_method", str4);
        c188727au.LJIIIZ(str2, str3);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    public final void LIZ(int i, int i2, String str, String str2, boolean z) {
        this.LIZJ = z;
        if (C2NU.LIZ.LIZIZ()) {
            ACallableS113S0100000_10 aCallableS113S0100000_10 = new ACallableS113S0100000_10(this, 0);
            C10C c10c = C10K.LJIIIIZZ;
            C10K.LIZIZ(aCallableS113S0100000_10, c10c, null).LJ(new OX3(this, str2, str, i2), C10K.LJI, null).LJ(new AgS1S1112000_10(i2, i, this, str, z, 1), c10c, null);
            Vibrator vibrator = (Vibrator) this.LIZ.getSystemService("vibrator");
            if (vibrator != null) {
                vibrator.vibrate(200L);
                return;
            }
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIIZZ(R.string.img);
        c26045AKb.LJIIJ();
    }
}
