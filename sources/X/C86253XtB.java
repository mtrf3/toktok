package X;

import Y.AgS50S1100000_15;
import android.app.Activity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.fe.method.upload.I18nGetUploadConfigService;
import com.ss.android.ugc.aweme.fe.method.upload.config.UploadConfig;
import com.ss.bduploader.BDVideoUploader;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.XtB, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86253XtB extends C86251Xt9 {
    public final WeakReference<Activity> LJLJJLL;
    public final C86200XsK LJLJL;
    public final InterfaceC86221Xsf LJLJLJ;
    public final UploadConfig LJLJLLL;
    public final I18nGetUploadConfigService.UploadConfigService LJLL;

    public final void LJFF(String str) {
        Object LIZ;
        long LJIIIZ;
        this.LJLJJL = true;
        if (this.LJLJLLL != null) {
            try {
                LJIIIZ = C268613q.LJIIIZ(this.LJLJJLL.get(), UriProtector.parse(str));
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (this.LJLJLLL != null) {
                if (LJIIIZ > r0.getMaxFileSize()) {
                    C5S1 c5s1 = new C5S1(this.LJLJJLL.get());
                    c5s1.LIZJ(R.string.tn4);
                    c5s1.LJ();
                    LIZJ(0, "uploadFailed");
                } else {
                    UploadConfig uploadConfig = this.LJLJLLL;
                    if (uploadConfig != null) {
                        LJI(str, LJIIIZ, uploadConfig);
                        this.LJLJL.LIZLLL(this.LJLJJLL.get(), this);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
                C3C5.m6boximpl(LIZ);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LJII(String str) {
        if (str == null) {
            return;
        }
        this.LJLJJI = new BDVideoUploader();
        UploadConfig uploadConfig = this.LJLJLLL;
        if (uploadConfig != null && !C107244Iu.LIZIZ(uploadConfig.getVideoHostName())) {
            LJFF(str);
        } else {
            this.LJLL.getUploadAuthConfig().LJ(new AgS50S1100000_15(this, str, 1), C10K.LJIIIIZZ, null);
        }
    }

    @Override // X.C86251Xt9
    public final void LIZLLL(int i, String video_id) {
        o.LJIIIZ(video_id, "video_id");
        this.LJLL.getUploadPlayUrlResponse(video_id, 3).LJ(new C86254XtC(i, this, video_id), C10K.LJI, null);
    }

    public final void LJI(String str, long j, UploadConfig uploadConfig) {
        String str2;
        String str3;
        String str4;
        BDVideoUploader LIZIZ = LIZIZ();
        try {
            this.LJLJJLL.get();
            android.net.Uri parse = UriProtector.parse(str);
            o.LJIIIIZZ(parse, "parse(fileName)");
            LIZIZ.setMediaDataReader(new FB1(j, parse));
            UploadConfig.STSAuthConfig authorizationV2 = uploadConfig.getAuthorizationV2();
            String str5 = null;
            if (authorizationV2 != null) {
                str2 = authorizationV2.getAccessKeyId();
            } else {
                str2 = null;
            }
            LIZIZ.setTopAccessKey(str2);
            UploadConfig.STSAuthConfig authorizationV22 = uploadConfig.getAuthorizationV2();
            if (authorizationV22 != null) {
                str3 = authorizationV22.getSecretAccessKey();
            } else {
                str3 = null;
            }
            LIZIZ.setTopSecretKey(str3);
            UploadConfig.STSAuthConfig authorizationV23 = uploadConfig.getAuthorizationV2();
            if (authorizationV23 != null) {
                str4 = authorizationV23.getSessionToken();
            } else {
                str4 = null;
            }
            LIZIZ.setTopSessionToken(str4);
            UploadConfig.STSAuthConfig authorizationV24 = uploadConfig.getAuthorizationV2();
            if (authorizationV24 != null) {
                str5 = authorizationV24.getSpaceName();
            }
            LIZIZ.setSpaceName(str5);
            LIZIZ.setFileRetryCount(uploadConfig.getFileRetryCount());
            LIZIZ.setEnableHttps(uploadConfig.getEnableHttps());
            LIZIZ.setRWTimeout(uploadConfig.getSliceTimeout());
            LIZIZ.setSliceReTryCount(uploadConfig.getSliceRetryCount());
            LIZIZ.setSliceSize(uploadConfig.getSliceSize());
            LIZIZ.setSocketNum(uploadConfig.getSocketNumber());
            LIZIZ.setMaxFailTime(uploadConfig.getMaxFailTime());
            LIZIZ.setUploadDomain(uploadConfig.getVideoHostName());
            LIZIZ.setListener(new C86255XtD(this));
            LIZIZ.start();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r10 != 900) goto L9;
     */
    @Override // X.InterfaceC86201XsL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onActivityResult(int r10, int r11, android.content.Intent r12) {
        /*
            r9 = this;
            r7 = 600(0x258, float:8.41E-43)
            r5 = 0
            java.lang.String r3 = "filePath"
            java.lang.String r2 = "uploadCancel"
            r1 = 0
            r8 = 1
            if (r10 == r7) goto L80
            java.lang.String r4 = "src"
            r6 = 700(0x2bc, float:9.81E-43)
            if (r10 == r6) goto L4d
            r7 = 900(0x384, float:1.261E-42)
            r6 = 800(0x320, float:1.121E-42)
            if (r10 == r6) goto L1a
            if (r10 == r7) goto L80
        L19:
            return r8
        L1a:
            if (r11 != 0) goto L20
            r9.LIZJ(r1, r2)
            return r8
        L20:
            android.content.Intent r2 = new android.content.Intent
            java.lang.ref.WeakReference<android.app.Activity> r0 = r9.LJLJJLL
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity> r0 = com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity.class
            r2.<init>(r1, r0)
            if (r12 == 0) goto L35
            android.net.Uri r5 = r12.getData()
        L35:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r2.putExtra(r3, r0)
            r2.putExtra(r4, r6)
            java.lang.ref.WeakReference<android.app.Activity> r0 = r9.LJLJJLL
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L19
            X.C16880lQ.LJFF(r0, r7, r2)
            goto L19
        L4d:
            if (r11 != 0) goto L53
            r9.LIZJ(r1, r2)
            return r8
        L53:
            android.content.Intent r2 = new android.content.Intent
            java.lang.ref.WeakReference<android.app.Activity> r0 = r9.LJLJJLL
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity> r0 = com.ss.android.ugc.aweme.fe.method.upload.PreviewUploadActivity.class
            r2.<init>(r1, r0)
            if (r12 == 0) goto L68
            android.net.Uri r5 = r12.getData()
        L68:
            java.lang.String r0 = java.lang.String.valueOf(r5)
            r2.putExtra(r3, r0)
            r2.putExtra(r4, r6)
            java.lang.ref.WeakReference<android.app.Activity> r0 = r9.LJLJJLL
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L19
            X.C16880lQ.LJFF(r0, r7, r2)
            goto L19
        L80:
            r0 = -1
            if (r11 == r0) goto L8a
            if (r11 == 0) goto L86
            goto L19
        L86:
            r9.LIZJ(r1, r2)
            goto L19
        L8a:
            if (r12 == 0) goto L90
            java.lang.String r5 = X.C16880lQ.LLJJIJIIJIL(r12, r3)
        L90:
            r9.LJII(r5)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86253XtB.onActivityResult(int, int, android.content.Intent):boolean");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86253XtB(WeakReference contextRef, C86200XsK dialog, AbstractC86252XtA onFileSelected, UploadConfig uploadConfig) {
        super(contextRef, dialog, onFileSelected);
        o.LJIIIZ(contextRef, "contextRef");
        o.LJIIIZ(dialog, "dialog");
        o.LJIIIZ(onFileSelected, "onFileSelected");
        this.LJLJJLL = contextRef;
        this.LJLJL = dialog;
        this.LJLJLJ = onFileSelected;
        this.LJLJLLL = uploadConfig;
        this.LJLL = new I18nGetUploadConfigService().LIZ;
    }
}
