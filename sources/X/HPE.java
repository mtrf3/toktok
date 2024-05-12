package X;

import Y.IDeS403S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.zhiliaoapp.musically.R;

/* loaded from: classes8.dex */
public final class HPE {
    public static void LIZ(final Context context, final HPC hpc) {
        if (!(context instanceof ActivityC45651qj)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("reuse mv is not fragment activity:");
            LIZ.append(context);
            H7B.LIZJ(X1D.LIZIZ(LIZ));
            ((HPA) hpc).LIZ();
            return;
        }
        if (C78605Ut7.LIZLLL()) {
            H7B.LIZ("reuse mv get permission succ");
            ((HPA) hpc).LIZ();
            return;
        }
        if (!C44172HVg.LJJI.LJ().LJFF()) {
            ((HPA) hpc).LIZ();
            return;
        }
        H7B.LIZ("reuse mv support runtime permission");
        HPI hpi = new HPI() { // from class: X.HPD
            @Override // X.HPI
            public final void LIZ(int[] iArr, String[] strArr) {
                final boolean z;
                final HPC hpc2 = hpc;
                final Context context2 = context;
                if (iArr == null || iArr.length == 0 || strArr == null || strArr.length == 0) {
                    H7B.LIZJ("reuse mv permission is empty!");
                    ((HPA) hpc2).LIZ();
                    return;
                }
                for (int i : iArr) {
                    if (i == -1) {
                        H7B.LIZJ("reuse mv deny permission");
                        String[] strArr2 = {"android.permission.WRITE_EXTERNAL_STORAGE"};
                        if (Build.VERSION.SDK_INT >= 33) {
                            strArr2 = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
                        }
                        int length = strArr2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                String str = strArr2[i2];
                                if (C44172HVg.LJJI.LJ().LIZLLL(context2, str) == -1 && !C44172HVg.LJJI.LJ().LJI(C45804HyK.LJIJJ(context2), str)) {
                                    z = true;
                                    break;
                                }
                                i2++;
                            } else {
                                z = false;
                                break;
                            }
                        }
                        C62905OmT c62905OmT = new C62905OmT(context2);
                        c62905OmT.LIZ(R.string.bsc);
                        c62905OmT.LJIIIIZZ(R.string.bsd, null, false);
                        c62905OmT.LJIIJJI(R.string.dsi, new DialogInterface.OnClickListener() { // from class: X.HPF
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                boolean z2 = z;
                                Context context3 = context2;
                                HPC hpc3 = hpc2;
                                if (z2) {
                                    H7B.LIZ("reuse support open setting activity");
                                    C44172HVg.LJJI.LJ().LJ(context3);
                                } else {
                                    H7B.LIZ("reuse not support open setting activity");
                                    HPE.LIZ(context3, hpc3);
                                }
                            }
                        }, false);
                        C62906OmU c62906OmU = new C62906OmU(c62905OmT);
                        if (!(context2 instanceof Activity) || !C45804HyK.LJIJJ(context2).isFinishing()) {
                            c62906OmU.LIZLLL();
                        }
                        C24540xm.LIZ(R.string.jga, ((HPA) hpc2).LIZ, 6004);
                        return;
                    }
                    try {
                    } catch (Throwable unused) {
                    }
                    C24540xm.LIZ(R.string.jga, ((HPA) hpc2).LIZ, 6004);
                    return;
                }
                H7B.LIZ("reuse mv allow permission");
                ((HPA) hpc2).LIZ();
            }
        };
        C61099NyR LIZIZ = C61099NyR.LIZIZ(C45804HyK.LJJIFFI(context), TokenCert.with((String) C78605Ut7.LJIIJ("bpea-tools_request_storage_permission_photo_mv_anchor_target33", "bpea-tools_request_storage_permission_photo_mv_anchor")));
        if (Build.VERSION.SDK_INT >= 33) {
            LIZIZ.LIZ("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO");
        } else {
            LIZIZ.LIZ("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        LIZIZ.LIZ.LIZJ(new IDeS403S0100000_7(hpi, 6));
    }
}
