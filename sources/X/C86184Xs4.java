package X;

import Y.IDCListenerS52S0200000_10;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;

/* renamed from: X.Xs4, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C86184Xs4 {
    public final Activity LIZJ;
    public final Resources LIZLLL;
    public final Fragment LJ;
    public final String LJFF;
    public final String LJI;
    public final WeakHandler LJII;
    public final InterfaceC26321AUr LJIIIIZZ;
    public DialogC254019y1 LJIIIZ;
    public final int LJIIJJI;
    public final InterfaceC26319AUp LJIIL;
    public final int LIZ = LiveCoverMinSizeSetting.DEFAULT;
    public final int LIZIZ = LiveCoverMinSizeSetting.DEFAULT;
    public final int LJIIJ = 1;
    public boolean LJIILIIL = false;
    public boolean LJIILJJIL = false;
    public final IComplianceBusinessService LJIILL = ComplianceBusinessServiceImpl.LJJJJIZL();

    public static int LIZIZ(int i) {
        if (i != 0) {
            if (i == 3) {
                return 10009;
            }
            if (i == 5) {
                return 10011;
            }
            if (i == 9) {
                return 10017;
            }
        }
        return 10004;
    }

    public final boolean LIZJ() {
        if (TextUtils.isEmpty(this.LJFF)) {
            C26045AKb c26045AKb = new C26045AKb(this.LIZJ);
            c26045AKb.LJIIIIZZ(R.string.qb6);
            c26045AKb.LJIIJ();
            C36922EeM.LJFF(new Exception("SD card is not available"));
            return true;
        }
        return false;
    }

    public final boolean LJI() {
        if (TextUtils.isEmpty(this.LJFF)) {
            C26045AKb c26045AKb = new C26045AKb(this.LIZJ);
            c26045AKb.LJIIIIZZ(R.string.qb6);
            c26045AKb.LJIIJ();
            C36922EeM.LJFF(new Exception("SD card is not available"));
            return true;
        }
        return false;
    }

    public final File LIZLLL() {
        if (!C39579Fg7.LJIILJJIL() || !C39579Fg7.LJIILL() || TextUtils.isEmpty("head")) {
            return null;
        }
        File LLIIIZ = C16880lQ.LLIIIZ(this.LIZJ);
        if (LLIIIZ == null) {
            LLIIIZ = C16880lQ.LLLLLLLLLL();
            C78983UzD.LJIILL("HeadUploadHelper: cache dir == null");
        }
        File file = new File(LLIIIZ, "head");
        C39579Fg7.LJFF(file);
        return file;
    }

    public String LJ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJFF);
        LIZ.append("/");
        LIZ.append(this.LJI);
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZ(InterfaceC63015OoF interfaceC63015OoF) {
        this.LJ.getLifecycle().addObserver(this.LJIILL.LJIIJ(this.LJ.getContext(), R.string.g0n, "", "", "", interfaceC63015OoF));
    }

    public final android.net.Uri LJFF(String str) {
        File file = new File(str);
        if (!file.exists()) {
            try {
                File file2 = new File(this.LJFF);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
                return null;
            }
        }
        return android.net.Uri.fromFile(file);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[Catch: Exception -> 0x00b4, TryCatch #1 {Exception -> 0x00b4, blocks: (B:19:0x0045, B:21:0x0049, B:26:0x007f), top: B:18:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[Catch: Exception -> 0x00b4, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b4, blocks: (B:19:0x0045, B:21:0x0049, B:26:0x007f), top: B:18:0x0045 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(int r8) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86184Xs4.LJIIIIZZ(int):void");
    }

    public final void LJIIJJI(int i) {
        if (!LiveOuterService.LJJJLL().LJJIJ()) {
            C87030YDq.LIZIZ.getStartCameraActivity().invoke(this.LIZJ, this.LJ, Integer.valueOf(LIZIZ(i)), this.LJFF, this.LJI);
            return;
        }
        if (this.LJ == null) {
            LiveOuterService.LJJJLL().LJJJLIIL(this.LIZJ, LIZIZ(i), LJFF(LJ()));
            this.LIZJ.overridePendingTransition(0, 0);
            return;
        }
        LiveOuterService.LJJJLL().LJJ(this.LJ, LIZIZ(i), LJFF(LJ()));
        ActivityC45651qj mo49getActivity = this.LJ.mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        mo49getActivity.overridePendingTransition(0, 0);
    }

    public final void LJIIL(int i) {
        boolean z;
        InterfaceC26319AUp interfaceC26319AUp = this.LJIIL;
        EnumC26325AUv enumC26325AUv = EnumC26325AUv.TAKE_PHOTO;
        interfaceC26319AUp.LJII(enumC26325AUv);
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (C61184Nzo.LIZ(this.LIZJ) == -1) {
                if (!C1AR.LJI(this.LIZJ, "android.permission.CAMERA")) {
                    this.LJIIL.LJI(enumC26325AUv, false);
                    LJIIJ(R.string.sci, R.string.cgl, enumC26325AUv);
                    return;
                } else {
                    C26045AKb c26045AKb = new C26045AKb(this.LIZJ);
                    c26045AKb.LJIIIZ(this.LIZJ.getString(R.string.jg9));
                    c26045AKb.LJIIJ();
                    return;
                }
            }
            C73040SlY.LJII(this.LIZJ, "live_image_popup", "take_photo");
            LJIIJJI(i);
            return;
        }
        C61099NyR.LIZIZ(this.LIZJ, TokenCert.with("bpea-profile_avatar_take_photo")).LIZ("android.permission.CAMERA").LIZJ(new C86186Xs6(this, i));
    }

    public final void LJIILJJIL(final int i) {
        String str;
        String str2;
        this.LJIIL.LJII(EnumC26325AUv.UPLOAD_PHOTO);
        if (Build.VERSION.SDK_INT < 33) {
            str2 = "bpea-profile_avatar_start_gallery";
            str = "android.permission.READ_EXTERNAL_STORAGE";
        } else {
            str = "android.permission.READ_MEDIA_IMAGES";
            str2 = "bpea-profile_avatar_start_gallery_target_33";
        }
        if (C38891fp.LJIIJ(this.LIZJ, str) != 0) {
            try {
                C61099NyR.LIZIZ(this.LIZJ, TokenCert.with(str2)).LIZ(str).LIZJ(new C86185Xs5(this, i, str));
            } catch (Throwable unused) {
                this.LJIIL.LJI(EnumC26325AUv.UPLOAD_PHOTO, false);
            }
        } else if (C158096Ij.LIZ && this.LJ != null) {
            LIZ(new InterfaceC63015OoF() { // from class: X.XsB
                @Override // X.InterfaceC63015OoF
                public final void LIZ() {
                    C86184Xs4.this.LJIIIIZZ(i);
                }
            });
        } else {
            LJIIIIZZ(i);
        }
    }

    public static String[] LJIIIZ(Resources resources, short... sArr) {
        String[] stringArray = resources.getStringArray(R.array.af);
        String[] strArr = new String[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            strArr[i] = stringArray[sArr[i]];
        }
        return strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
    
        if (r4 > r1.outHeight) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJII(int r19, int r20, android.content.Intent r21) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86184Xs4.LJII(int, int, android.content.Intent):boolean");
    }

    public final void LJIIJ(int i, int i2, EnumC26325AUv enumC26325AUv) {
        C62905OmT c62905OmT = new C62905OmT(this.LIZJ);
        c62905OmT.LJ(i);
        c62905OmT.LIZ(i2);
        c62905OmT.LJI(R.string.cg_);
        c62905OmT.LJIIJJI(R.string.gs9, new IDCListenerS52S0200000_10(this, enumC26325AUv, 3), false);
        C279017q.LIZLLL(c62905OmT);
    }

    public C86184Xs4(Activity activity, Fragment fragment, WeakHandler weakHandler, InterfaceC26321AUr interfaceC26321AUr, int i, InterfaceC26319AUp interfaceC26319AUp) {
        this.LJIIJJI = EnumC78978Uz8.PROFILE.getValue();
        this.LIZJ = activity;
        this.LJ = fragment;
        this.LJII = weakHandler;
        this.LJIIIIZZ = interfaceC26321AUr;
        if (i > 0) {
            this.LJIIJJI = i;
        }
        this.LJIIL = interfaceC26319AUp;
        File LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            this.LJFF = LIZLLL.getPath();
        } else {
            this.LJFF = "";
        }
        this.LJI = "head.data";
        this.LIZLLL = activity.getResources();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(android.net.Uri r18, boolean r19, int r20, android.content.Intent r21, boolean r22, java.lang.String r23) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86184Xs4.LJIILIIL(android.net.Uri, boolean, int, android.content.Intent, boolean, java.lang.String):void");
    }
}
