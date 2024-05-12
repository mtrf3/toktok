package X;

import Y.AObjectS42S0101000_5;
import android.app.Activity;
import android.content.ContentUris;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import com.bytedance.android.livesdk.utils.crop.CropFragment;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Cf4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31870Cf4 {
    public static SimpleDateFormat LJIIZILJ;
    public boolean LIZ;
    public final Activity LIZIZ;
    public final Resources LIZJ;
    public final Fragment LIZLLL;
    public String LJI;
    public final InterfaceC28505BGr LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILJJIL;
    public DialogC31813Ce9 LJIILL;
    public final boolean LJIILLIIL;
    public final java.util.Map<String, String> LJIILIIL = new HashMap();
    public final String LJ = C31880CfE.LIZ();
    public final String LJFF = i0.LJFF("cover", ".data");

    public final void LIZ() {
        DialogC31813Ce9 dialogC31813Ce9 = this.LJIILL;
        if (dialogC31813Ce9 != null) {
            dialogC31813Ce9.dismiss();
        }
    }

    public final void LJI() {
        if (this.LIZIZ == null) {
            return;
        }
        this.LJI = String.valueOf(System.currentTimeMillis());
        final int i = 0;
        String[] strArr = {this.LIZJ.getString(R.string.o19), this.LIZJ.getString(R.string.o1_), this.LIZJ.getString(R.string.o18)};
        AnonymousClass025 anonymousClass025 = new AnonymousClass025(this.LIZIZ);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: X.BGq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                switch (i) {
                    case 0:
                        C31870Cf4 c31870Cf4 = (C31870Cf4) this;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    c31870Cf4.getClass();
                                    return;
                                }
                                InterfaceC28505BGr interfaceC28505BGr = c31870Cf4.LJII;
                                if (interfaceC28505BGr == null) {
                                    return;
                                }
                                interfaceC28505BGr.LIZ();
                                return;
                            }
                            C31950CgM.LIZLLL(c31870Cf4.LIZIZ, c31870Cf4.LIZLLL, Boolean.valueOf(c31870Cf4.LIZ), c31870Cf4.LJ, c31870Cf4.LIZIZ());
                            return;
                        }
                        C31950CgM.LJ(c31870Cf4.LIZIZ, c31870Cf4.LIZLLL);
                        return;
                    default:
                        C29666Bkc.LJLIL((C29666Bkc) this, dialogInterface);
                        return;
                }
            }
        };
        C008901t c008901t = anonymousClass025.LIZ;
        c008901t.LJIILL = strArr;
        c008901t.LJIIZILJ = onClickListener;
        c008901t.LJIIL = true;
        anonymousClass025.LJ();
    }

    public final void LJII() {
        Activity activity = this.LIZIZ;
        if (activity == null) {
            return;
        }
        if (this.LJIILL == null) {
            C31767CdP c31767CdP = new C31767CdP(activity);
            c31767CdP.LIZIZ = activity.getString(R.string.sxv);
            c31767CdP.LIZJ = true;
            this.LJIILL = c31767CdP.LIZ();
        }
        if (!this.LJIILL.isShowing()) {
            C16880lQ.LIZ(this.LJIILL);
        }
    }

    public final String LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LJFF);
        LIZ2.append("_");
        LIZ2.append(this.LJI);
        LIZ.append(X1D.LIZIZ(LIZ2));
        LIZ.append(".jpeg");
        return X1D.LIZIZ(LIZ);
    }

    public final android.net.Uri LIZJ() {
        String LIZIZ = LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        File file = new File(C025908h.LIZIZ(LIZ, this.LJ, "/", LIZIZ, LIZ));
        if (!file.exists()) {
            try {
                File file2 = new File(this.LJ);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
                return null;
            }
        }
        Activity activity = this.LIZIZ;
        if (activity == null) {
            return null;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LIZIZ.getPackageName());
        LIZ2.append(TTLiveFileProvider.NAME);
        return FileProvider.androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(activity, X1D.LIZIZ(LIZ2), file);
    }

    public final String LIZLLL() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJFF);
        LIZ.append("_");
        LIZ.append(this.LJI);
        LIZ.append(this.LJIIL);
        return X1D.LIZIZ(LIZ);
    }

    public final void LJIIIIZZ(android.net.Uri uri) {
        android.net.Uri uri2 = null;
        C0K2.LJIIIIZZ("ttlive_upload_cover_want_crop", 0, null);
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.addFlags(1);
        intent.addFlags(2);
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("scale", true);
        intent.putExtra("aspectX", this.LJIIIIZZ);
        intent.putExtra("aspectY", this.LJIIIZ);
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        intent.putExtra("scaleUpIfNeeded", true);
        intent.putExtra("pns.sandbox.dataflow_id", 1207965441);
        String LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            LIZLLL = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        File file = new File(C025908h.LIZIZ(LIZ, this.LJ, "/", LIZLLL, LIZ));
        if (!file.exists()) {
            try {
                File file2 = new File(this.LJ);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                file.createNewFile();
            } catch (IOException unused) {
            }
        }
        uri2 = android.net.Uri.fromFile(file);
        if (uri2 != null) {
            intent.putExtra("output", uri2);
        }
        try {
            Fragment fragment = this.LIZLLL;
            if (fragment != null) {
                C16880lQ.LJII(fragment, intent, 40002);
                return;
            }
            Activity activity = this.LIZIZ;
            if (activity != null) {
                C16880lQ.LJFF(activity, 40002, intent);
            }
        } catch (Exception unused2) {
            C30868C9o.LIZLLL(R.string.t02, this.LIZIZ);
        }
    }

    public final void LJ(boolean z, android.net.Uri uri) {
        if (uri == null) {
            return;
        }
        if (!z) {
            try {
                String lastPathSegment = uri.getLastPathSegment();
                if (!C38354F3m.LJ(lastPathSegment) && lastPathSegment.contains(":")) {
                    lastPathSegment = lastPathSegment.split(":")[1];
                }
                try {
                    uri = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, CastLongProtector.parseLong(lastPathSegment));
                } catch (NumberFormatException unused) {
                }
            } catch (Exception unused2) {
                return;
            }
        }
        if (this.LJIILJJIL) {
            o.LJIIIZ(uri, "uri");
            CropFragment LIZ = C31878CfC.LIZ(false, uri);
            LIZ.LJLJJLL = new AObjectS42S0101000_5(0, this, 28);
            LIZ.show(this.LIZLLL.getChildFragmentManager(), this.LJFF);
            return;
        }
        LJIIIIZZ(uri);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017b, code lost:
    
        if (0 != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0164, code lost:
    
        if (0 == 0) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0194  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(int r11, int r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31870Cf4.LJFF(int, int, android.content.Intent):boolean");
    }

    public C31870Cf4(ActivityC45651qj activityC45651qj, Fragment fragment, int i, int i2, int i3, int i4, InterfaceC28505BGr interfaceC28505BGr, boolean z, boolean z2) {
        this.LIZIZ = activityC45651qj;
        this.LIZLLL = fragment;
        this.LJII = interfaceC28505BGr;
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
        this.LJIIJ = i3;
        this.LJIIJJI = i4;
        this.LJIILJJIL = z;
        this.LJIILLIIL = z2;
        if (activityC45651qj == null && fragment != null) {
            this.LIZIZ = fragment.mo49getActivity();
        }
        Activity activity = this.LIZIZ;
        if (activity != null) {
            this.LIZJ = activity.getResources();
        } else {
            this.LIZJ = C15380j0.LJIIJ();
        }
        this.LJIIL = "";
    }
}
