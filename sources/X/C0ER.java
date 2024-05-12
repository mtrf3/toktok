package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;

/* renamed from: X.0ER, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0ER {
    public static volatile C0ER LIZ;

    public static int LIZIZ(int i) {
        if (i == -7) {
            return 4;
        }
        if (i != -6) {
            if (i != -5) {
                if (i != -3) {
                    if (i != -2) {
                        if (i == -1) {
                            return 4;
                        }
                        if (i == 4) {
                            return 1;
                        }
                        if (i != 6) {
                            return 0;
                        }
                    }
                }
            }
            return 3;
        }
        return 2;
    }

    public static C0ER LIZJ() {
        if (LIZ == null) {
            synchronized (C0ER.class) {
                if (LIZ == null) {
                    LIZ = new C0ER();
                }
            }
        }
        return LIZ;
    }

    public static int LIZLLL(String str, String str2) {
        DownloadInfo LIZJ;
        int i;
        if (!TextUtils.isEmpty(str2)) {
            C0EP.LJFF().getClass();
            LIZJ = C0EP.LIZLLL(str2);
        } else {
            C0EP.LJFF().getClass();
            LIZJ = C0EP.LIZJ(str);
        }
        if (LIZJ != null) {
            i = LIZIZ(LIZJ.getStatus());
            if (i == 2 && !LIZJ.isDownloaded()) {
                return 0;
            }
        } else {
            i = 0;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r1 != 6) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(java.lang.String r1, java.lang.String r2, X.C29541Dy r3) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L80
            X.0EP r0 = X.C0EP.LJFF()
            r0.getClass()
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = X.C0EP.LIZLLL(r2)
        L11:
            if (r2 == 0) goto L24
            int r0 = r2.getStatus()
            int r1 = LIZIZ(r0)
            r0 = 2
            if (r1 != r0) goto L49
            boolean r0 = r2.isDownloaded()
            if (r0 != 0) goto L4b
        L24:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "registerCallback:"
            r1.append(r0)
            java.lang.String r0 = r3.LIZIZ()
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "LiveReplyDownloader"
            X.C0NB.LIZIZ(r0, r1)
            X.0EP r1 = X.C0EP.LJFF()
            java.lang.String r0 = r3.LIZIZ()
            r1.LJII(r0, r3)
            return
        L49:
            if (r2 == 0) goto L24
        L4b:
            int r1 = r2.getStatus()
            if (r3 != 0) goto L52
            goto L24
        L52:
            r0 = -7
            if (r1 == r0) goto L77
            r0 = -6
            if (r1 == r0) goto L73
            r0 = -5
            if (r1 == r0) goto L6f
            r0 = -3
            if (r1 == r0) goto L73
            r0 = -2
            if (r1 == r0) goto L6f
            r0 = -1
            if (r1 == r0) goto L77
            r0 = 4
            if (r1 == r0) goto L6b
            r0 = 6
            if (r1 == r0) goto L73
            goto L24
        L6b:
            r3.onProgress(r2)
            goto L24
        L6f:
            r3.onPause(r2)
            goto L24
        L73:
            r3.LIZ(r2)
            goto L24
        L77:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException
            r0.<init>()
            r3.onFailed(r2, r0)
            goto L24
        L80:
            X.0EP r0 = X.C0EP.LJFF()
            r0.getClass()
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = X.C0EP.LIZJ(r1)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ER.LJ(java.lang.String, java.lang.String, X.1Dy):void");
    }

    public static void LJI(Context context, int i, String str, String str2, C0EN c0en) {
        if (c0en instanceof C29541Dy) {
            ((C29541Dy) c0en).LIZJ = false;
        }
        if (Build.VERSION.SDK_INT >= 33 || C76944UHs.LIZIZ(context, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE")) {
            C0NB.LIZIZ("LiveReplyDownloader", "submitDownloadTaskNoRequestPermission meet");
            LIZ(context, i, str, str2, "mp4", c0en);
        } else if (c0en != null) {
            C0NB.LIZIZ("LiveReplyDownloader", "submitDownloadTaskNoRequestPermission downloadCallBack != null");
            c0en.onFailed(null, new BaseException());
        } else {
            C0NB.LIZIZ("LiveReplyDownloader", "submitDownloadTaskNoRequestPermission downloadCallBack else");
        }
    }

    public final void LJFF(final Context context, final int i, final String str, final String str2, final C73079SmB c73079SmB) {
        if (1 == i) {
            LIZ(context, 1, str, str2, "mp4", c73079SmB);
        } else if (Build.VERSION.SDK_INT >= 33) {
            LIZ(context, i, str, str2, "mp4", c73079SmB);
        } else {
            new C77276UUm(C29306Beo.LIZIZ(context), TokenCert.with("bpea-bpea-submit_download_task_in_live_replay_video_player")).LIZ(new InterfaceC78910Uy2() { // from class: X.1Dx
                public final /* synthetic */ String LJ = "mp4";

                @Override // X.InterfaceC78910Uy2
                public final /* synthetic */ void LIZ(String... strArr) {
                }

                @Override // X.InterfaceC78910Uy2
                public final /* synthetic */ void LIZJ(String... strArr) {
                }

                @Override // X.InterfaceC78910Uy2
                public final /* synthetic */ void LJ(String str3, String... strArr) {
                }

                @Override // X.InterfaceC78910Uy2
                public final /* synthetic */ void LJFF(String... strArr) {
                }

                @Override // X.InterfaceC78910Uy2
                public final void LIZIZ(String... strArr) {
                    C0NB.LIZIZ("LiveReplyDownloader", "onPermissionDenied");
                }

                @Override // X.InterfaceC78910Uy2
                public final void LIZLLL(String... strArr) {
                    C0NB.LIZIZ("LiveReplyDownloader", "onPermissionGrant");
                    C0ER c0er = C0ER.this;
                    Context context2 = context;
                    int i2 = i;
                    String str3 = str;
                    String str4 = str2;
                    String str5 = this.LJ;
                    C0EN c0en = c73079SmB;
                    c0er.getClass();
                    C0ER.LIZ(context2, i2, str3, str4, str5, c0en);
                }
            }, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(android.content.Context r10, int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, X.C0EN r15) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ER.LIZ(android.content.Context, int, java.lang.String, java.lang.String, java.lang.String, X.0EN):void");
    }
}
