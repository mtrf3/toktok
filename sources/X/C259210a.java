package X;

import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.10a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C259210a {
    public static String LIZ(String str, String str2) {
        String str3;
        byte[] bytes = str.getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        StringBuilder LIZ = X1D.LIZ();
        try {
            byte[] byteArr = MessageDigest.getInstance("MD5").digest(bytes);
            StringBuffer stringBuffer = new StringBuffer();
            o.LJIIIIZZ(byteArr, "byteArr");
            for (byte b : byteArr) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append('0');
                    LIZ2.append(hexString);
                    hexString = X1D.LIZIZ(LIZ2);
                }
                stringBuffer.append(hexString);
            }
            str3 = stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("getMD5String. exception. e=");
            LIZ3.append(e);
            C0NB.LJ("DownloadHighLightFileImpl", X1D.LIZIZ(LIZ3));
            str3 = null;
        }
        return JBR.LJFF(LIZ, str3, str2, LIZ);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1cM] */
    public static void LIZIZ(String url, final String str, final String fileName, final C10Z c10z) {
        C0NB.LJIIIZ("DownloadHighLightFileImpl", "internalDownloadHighLightVideo");
        final ?? r3 = new InterfaceC19640ps() { // from class: X.1cM
            @Override // X.InterfaceC19640ps
            public final void LIZ() {
                if (C30922CBq.LIZIZ) {
                    C0NB.LJ("DownloadHighLightFileImpl", "internalDownloadHighLightVideo. onCanceled.");
                }
                try {
                    C15380j0.LIZLLL().getContentResolver().delete(UriProtector.parse(str), null, null);
                } catch (Exception unused) {
                    C0NB.LJ("DownloadHighLightFileImpl", "delete cache failure");
                }
                C10Z.this.LIZIZ(0, 2, "cancel by user");
            }

            @Override // X.InterfaceC19640ps
            public final void LIZIZ(DownloadInfo entity) {
                o.LJIIIZ(entity, "entity");
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("internalDownloadHighLightVideo. downloaded succeed. entity=");
                    LIZ.append(entity);
                    C0NB.LJIIIZ("DownloadHighLightFileImpl", X1D.LIZIZ(LIZ));
                }
                C10Z c10z2 = C10Z.this;
                String savePath = entity.getSavePath();
                o.LJIIIIZZ(savePath, "entity.savePath");
                String name = entity.getName();
                o.LJIIIIZZ(name, "entity.name");
                c10z2.LJFF(savePath, name);
            }

            public final void LIZJ(int i) {
                if (C30922CBq.LIZIZ) {
                    QZP.LIZJ("internalDownloadHighLightVideo. onStart. taskId=", i, "DownloadHighLightFileImpl");
                }
                C10Z.this.LIZ(i);
            }

            @Override // X.InterfaceC19640ps
            public final void onProgress(DownloadInfo entity) {
                o.LJIIIZ(entity, "entity");
                C10Z.this.onProgress(entity);
            }

            @Override // X.InterfaceC19640ps
            public final void onFailed(DownloadInfo entity, BaseException e) {
                o.LJIIIZ(entity, "entity");
                o.LJIIIZ(e, "e");
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("internalDownloadHighLightVideo. downloaded failed. e=");
                    LIZ.append(e);
                    C0NB.LJ("DownloadHighLightFileImpl", X1D.LIZIZ(LIZ));
                }
                C10Z c10z2 = C10Z.this;
                int errorCode = e.getErrorCode();
                String errorMessage = e.getErrorMessage();
                o.LJIIIIZZ(errorMessage, "e.errorMessage");
                c10z2.LIZIZ(1, errorCode, errorMessage);
            }
        };
        o.LJIIIZ(fileName, "fileName");
        o.LJIIIZ(url, "url");
        StringBuilder LIZLLL = C06540Nm.LIZLLL("downloadFile. fileName=", fileName, ", url=", url, ", async=");
        LIZLLL.append(false);
        C0NB.LJIIIZ("FileDownloader", X1D.LIZIZ(LIZLLL));
        DownloadTask with = C84261X5d.with(C15380j0.LIZLLL());
        with.url(url);
        with.name(fileName);
        with.savePath(str);
        with.subThreadListener(new AbsDownloadListener() { // from class: X.1nN
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onCanceled(DownloadInfo downloadInfo) {
                super.onCanceled(downloadInfo);
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onCanceled. entity=");
                    LIZ.append(downloadInfo);
                    C0NB.LJ("FileDownloader", X1D.LIZIZ(LIZ));
                }
                InterfaceC19640ps interfaceC19640ps = r3;
                if (interfaceC19640ps != null) {
                    interfaceC19640ps.LIZ();
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onProgress(DownloadInfo entity) {
                o.LJIIIZ(entity, "entity");
                super.onProgress(entity);
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onProgress. progress=");
                    LIZ.append(entity.getDownloadProcess());
                    C0NB.LJIIIZ("FileDownloader", X1D.LIZIZ(LIZ));
                }
                InterfaceC19640ps interfaceC19640ps = r3;
                if (interfaceC19640ps != null) {
                    interfaceC19640ps.onProgress(entity);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo entity) {
                o.LJIIIZ(entity, "entity");
                super.onSuccessed(entity);
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onSuccessed. download file {");
                    LIZ.append(fileName);
                    LIZ.append("} to path {");
                    LIZ.append(str);
                    LIZ.append("} success.");
                    C0NB.LJIIIZ("FileDownloader", X1D.LIZIZ(LIZ));
                }
                InterfaceC19640ps interfaceC19640ps = r3;
                if (interfaceC19640ps != null) {
                    interfaceC19640ps.LIZIZ(entity);
                }
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo entity, BaseException e) {
                o.LJIIIZ(entity, "entity");
                o.LJIIIZ(e, "e");
                super.onFailed(entity, e);
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onFailed. download file {");
                    LIZ.append(fileName);
                    LIZ.append("} to path {");
                    LIZ.append(str);
                    LIZ.append("} failure.");
                    C0NB.LJ("FileDownloader", X1D.LIZIZ(LIZ));
                }
                InterfaceC19640ps interfaceC19640ps = r3;
                if (interfaceC19640ps != null) {
                    interfaceC19640ps.onFailed(entity, e);
                }
            }
        });
        r3.LIZJ(with.download());
    }

    public final void LIZJ(final ActivityC45651qj activity, final String downloadUrl, String str, String fragmentId, final C10Z c10z) {
        final String name;
        String name2;
        String savePath;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(downloadUrl, "downloadUrl");
        o.LJIIIZ(fragmentId, "fragmentId");
        final DownloadInfo LIZ = C19650pt.LIZ(downloadUrl);
        if (LIZ == null) {
            name = LIZ(fragmentId, str);
        } else {
            name = LIZ.getName();
            o.LJIIIIZZ(name, "{\n            info.name\n        }");
        }
        if (Build.VERSION.SDK_INT >= 33) {
            DownloadInfo LIZ2 = C19650pt.LIZ(downloadUrl);
            if (LIZ2 == null) {
                name2 = LIZ(fragmentId, str);
            } else {
                name2 = LIZ2.getName();
                o.LJIIIIZZ(name2, "{\n            info.name\n        }");
            }
            android.net.Uri LJIIJ = C268613q.LJIIJ(activity, name2);
            if (C268613q.LJIIJJI(activity, LJIIJ)) {
                String uri = LJIIJ.toString();
                o.LJIIIIZZ(uri, "fileUri.toString()");
                c10z.LJFF(uri, name2);
                C0NB.LJIIIZ("DownloadHighLightFileImpl", "file is exists");
                return;
            }
            if (LIZ2 == null) {
                android.net.Uri LJFF = C268613q.LJFF(activity, name2);
                if (LJFF != null) {
                    savePath = LJFF.toString();
                    o.LJIIIIZZ(savePath, "saveUri.toString()");
                } else {
                    savePath = "";
                }
            } else {
                savePath = LIZ2.getSavePath();
                o.LJIIIIZZ(savePath, "{\n            info.savePath\n        }");
            }
            LIZIZ(downloadUrl, savePath, name2, c10z);
            return;
        }
        new C77276UUm(activity, TokenCert.Companion.with("bpea-mobile_highlight_store_video")).LIZ(new InterfaceC78910Uy2() { // from class: X.1cN
            /* JADX WARN: Failed to extract var names
            java.lang.NullPointerException
             */
            @Override // X.InterfaceC78910Uy2
            public final void LIZ(String... strArr) {
                o.LJIIIZ(strArr, OHQ.LIZIZ);
                StringBuilder sb = new StringBuilder();
                for (String str2 : strArr) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str2);
                    LIZ3.append(' ');
                    sb.append(X1D.LIZIZ(LIZ3));
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onPermissionDeniedWithReason: ");
                LIZ4.append((Object) sb);
                C0NB.LIZIZ("DownloadHighLightFileImpl", X1D.LIZIZ(LIZ4));
                C10Z c10z2 = c10z;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append((Object) sb);
                LIZ5.append(" deny");
                c10z2.LIZIZ(0, 1, X1D.LIZIZ(LIZ5));
            }

            /* JADX WARN: Failed to extract var names
            java.lang.NullPointerException
             */
            @Override // X.InterfaceC78910Uy2
            public final void LIZIZ(String... strArr) {
                o.LJIIIZ(strArr, OHQ.LIZIZ);
                StringBuilder sb = new StringBuilder();
                for (String str2 : strArr) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(str2);
                    LIZ3.append(' ');
                    sb.append(X1D.LIZIZ(LIZ3));
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onPermissionDenied: ");
                LIZ4.append((Object) sb);
                C0NB.LJ("DownloadHighLightFileImpl", X1D.LIZIZ(LIZ4));
                C10Z c10z2 = c10z;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append((Object) sb);
                LIZ5.append(" deny");
                c10z2.LIZIZ(0, 1, X1D.LIZIZ(LIZ5));
            }

            /* JADX WARN: Failed to extract var names
            java.lang.NullPointerException
             */
            @Override // X.InterfaceC78910Uy2
            public final void LIZJ(String... strArr) {
                o.LJIIIZ(strArr, OHQ.LIZIZ);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onPermissionReqStart: ");
                LIZ3.append(strArr);
                C0NB.LIZIZ("DownloadHighLightFileImpl", X1D.LIZIZ(LIZ3));
                Arrays.copyOf(strArr, strArr.length);
            }

            /* JADX WARN: Failed to extract var names
            java.lang.NullPointerException
             */
            @Override // X.InterfaceC78910Uy2
            public final void LIZLLL(String... strArr) {
                String savePath2;
                o.LJIIIZ(strArr, OHQ.LIZIZ);
                android.net.Uri LJIIJ2 = C268613q.LJIIJ(ActivityC45651qj.this, name);
                if (C268613q.LJIIJJI(ActivityC45651qj.this, LJIIJ2)) {
                    C10Z c10z2 = c10z;
                    String uri2 = LJIIJ2.toString();
                    o.LJIIIIZZ(uri2, "fileUri.toString()");
                    c10z2.LJFF(uri2, name);
                    C0NB.LJIIIZ("DownloadHighLightFileImpl", "file is exists");
                    return;
                }
                DownloadInfo downloadInfo = LIZ;
                if (downloadInfo == null) {
                    C259210a c259210a = this;
                    ActivityC45651qj activityC45651qj = ActivityC45651qj.this;
                    String str2 = name;
                    c259210a.getClass();
                    android.net.Uri LJFF2 = C268613q.LJFF(activityC45651qj, str2);
                    if (LJFF2 != null) {
                        savePath2 = LJFF2.toString();
                        o.LJIIIIZZ(savePath2, "saveUri.toString()");
                    } else {
                        savePath2 = "";
                    }
                } else {
                    savePath2 = downloadInfo.getSavePath();
                    o.LJIIIIZZ(savePath2, "{\n                      …                        }");
                }
                if (C30922CBq.LIZIZ) {
                    StringBuilder sb = new StringBuilder();
                    for (String str3 : strArr) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(str3);
                        LIZ3.append(' ');
                        sb.append(X1D.LIZIZ(LIZ3));
                    }
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("onPermissionGrant: ");
                    LIZ4.append((Object) sb);
                    C0NB.LIZIZ("DownloadHighLightFileImpl", X1D.LIZIZ(LIZ4));
                }
                C259210a c259210a2 = this;
                String str4 = downloadUrl;
                String str5 = name;
                C10Z c10z3 = c10z;
                c259210a2.getClass();
                C259210a.LIZIZ(str4, savePath2, str5, c10z3);
            }

            /* JADX WARN: Failed to extract var names
            java.lang.NullPointerException
             */
            @Override // X.InterfaceC78910Uy2
            public final void LJFF(String... strArr) {
                boolean z;
                boolean z2;
                o.LJIIIZ(strArr, OHQ.LIZIZ);
                if (C04330Ez.LIZ(ActivityC45651qj.this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (C04330Ez.LIZ(ActivityC45651qj.this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onPermissionGoSettingConfirm. readPermission=");
                LIZ3.append(z);
                LIZ3.append(", writePermission=");
                LIZ3.append(z2);
                C0NB.LIZIZ("DownloadHighLightFileImpl", X1D.LIZIZ(LIZ3));
                if (z && z2) {
                    android.net.Uri LJIIJ2 = C268613q.LJIIJ(ActivityC45651qj.this, name);
                    if (C268613q.LJIIJJI(ActivityC45651qj.this, LJIIJ2)) {
                        C10Z c10z2 = c10z;
                        String uri2 = LJIIJ2.toString();
                        o.LJIIIIZZ(uri2, "fileUri.toString()");
                        c10z2.LJFF(uri2, name);
                        C0NB.LJIIIZ("DownloadHighLightFileImpl", "file is exists");
                        return;
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder();
                for (String str2 : strArr) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(str2);
                    LIZ4.append(' ');
                    sb.append(X1D.LIZIZ(LIZ4));
                }
                C10Z c10z3 = c10z;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append((Object) sb);
                LIZ5.append(" deny");
                c10z3.LIZIZ(0, 1, X1D.LIZIZ(LIZ5));
            }

            /* JADX WARN: Failed to extract var names
            java.lang.NullPointerException
             */
            @Override // X.InterfaceC78910Uy2
            public final void LJ(String str2, String... strArr) {
                o.LJIIIZ(strArr, OHQ.LIZIZ);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onPermissionDeniedWithReason: ");
                LIZ3.append(strArr);
                C12400eC.LIZIZ(LIZ3, ", reason=", str2, LIZ3, "DownloadHighLightFileImpl");
                Arrays.copyOf(strArr, strArr.length);
            }
        }, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
    }
}
