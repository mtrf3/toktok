package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.json.JSONObject;

/* renamed from: X.CiM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC32074CiM implements Runnable {
    public static final RunnableC32074CiM LJLIL = new RunnableC32074CiM();

    public static void LIZ() {
        byte[] bArr;
        boolean z;
        boolean z2;
        String str;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        File LJFF = C15510jD.LJFF("live_im_push_compress_zstd_dict", "zstd_dict_model_conf.json");
        byte[] bArr2 = null;
        if (LJFF != null) {
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(LJFF), PVC.LIZ);
            if (!(inputStreamReader instanceof BufferedReader)) {
                inputStreamReader = new BufferedReader(inputStreamReader, FileUtils.BUFFER_SIZE);
            }
            try {
                JSONObject jSONObject = new JSONObject(C77321UWf.LJIILJJIL(inputStreamReader));
                AnonymousClass636.LJFF(inputStreamReader, null);
                C87245YLx.LIZIZ = jSONObject.optInt("zstd_dict_version", -1);
                C87245YLx.LIZJ = jSONObject.optString("zstd_dict_md5");
                File LJFF2 = C15510jD.LJFF("live_im_push_compress_zstd_dict", "zstd_dict_model.zstd");
                if (LJFF2 != null) {
                    bArr = C38485F8n.LLLF(LJFF2);
                } else {
                    bArr = null;
                }
                String LIZLLL = C38352F3k.LIZLLL(bArr);
                if (LIZLLL == null || LIZLLL.length() == 0 || !TextUtils.equals(C87245YLx.LIZJ, LIZLLL)) {
                    z = false;
                } else {
                    z = true;
                }
                int i = C87245YLx.LIZIZ;
                if (i > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z) {
                    if (z2) {
                        C32079CiR.LIZJ(SystemClock.elapsedRealtime() - elapsedRealtime, String.valueOf(i));
                        bArr2 = bArr;
                        C87245YLx.LIZLLL = bArr2;
                    }
                    str = "version illegal";
                } else {
                    str = "md5 not match";
                }
                C32079CiR.LIZIZ(str, String.valueOf(i));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("zstd resource init failed reason: ");
                LIZ.append(str);
                C0NB.LJIIL("LiveZstd", X1D.LIZIZ(LIZ));
                C87245YLx.LIZLLL = bArr2;
            } finally {
            }
        } else {
            C32079CiR.LIZIZ("conf not found", String.valueOf(C87245YLx.LIZIZ));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
