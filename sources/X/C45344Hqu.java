package X;

import Y.ACallableS110S0100000_7;
import Y.ARunnableS13S0110000_7;
import Y.ARunnableS43S0100000_7;
import Y.IDHandlerS20S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.provider.impl.GScope;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.share.downloadv2.event.newet.DownloadFinishEvent;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import v5.n;

/* renamed from: X.Hqu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45344Hqu extends AbsDownloadListener {
    public static boolean LLILZLL;
    public Context LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public AlertDialogC45396Hrk LJLL;
    public String LJLLI;
    public final String LJLLILLLL;
    public final OSZ<Integer, String> LJLLJ;
    public InterfaceC43172Gwy LJLLL;
    public String LJLLLL;
    public UrlModel LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public final C8BR<?, ?> LL;
    public int LLD;
    public Aweme LLF;
    public String LLFF;
    public ACLCommonShare LLFFF;
    public C45351Hr1 LLFII;
    public long LLFZ;
    public long LLI;
    public InterfaceC45358Hr8 LLIFFJFJJ;
    public AbstractC45355Hr5 LLII;
    public WaterMarkBuilder LLIIII;
    public final C45386Hra LLIIIILZ;
    public boolean LLIIIJ;
    public final C44934HkI LLIIIL;
    public String LLIIIZ;
    public String LLIIJI;
    public final Bundle LLIIJLIL;
    public String LLIIL;
    public int LLIILII;
    public final IDHandlerS20S0100000_7 LLIILZL;
    public long LLIIZ;
    public long LLIL;
    public String LLILII;
    public String LLILIL;
    public JSONObject LLILL;
    public int LLILLIZIL;
    public Integer LLILLJJLI;
    public String LLILLL;
    public final ARunnableS43S0100000_7 LLILZ;
    public final C45345Hqv LLILZIL;

    public final void LJII() {
        C44938HkM.LIZIZ = false;
        C44938HkM.LIZJ = false;
        if (this.LLIILZL.hasMessages(1)) {
            this.LLIILZL.removeMessages(1);
        }
        if (C44938HkM.LIZLLL) {
            C39579Fg7.LJIL(this.LJLJJLL);
            LJIIIIZZ();
            C44938HkM.LIZLLL = false;
            return;
        }
        LJIIIIZZ();
        C38816FLg.LIZJ(new ARunnableS43S0100000_7(this, 151));
        if (o.LJ(this.LLIIL, "long_press_download")) {
            Aweme aweme = this.LLF;
            if (aweme != null) {
                C45441HsT.LIZIZ(aweme, "mask", this.LJLLLL, 0);
            } else {
                o.LJIJI("mAweme");
                throw null;
            }
        } else {
            Aweme aweme2 = this.LLF;
            if (aweme2 != null) {
                C45441HsT.LIZIZ(aweme2, this.LJLLILLLL, this.LJLLLL, 0);
            } else {
                o.LJIJI("mAweme");
                throw null;
            }
        }
        V16.LJJZ(GScope.LJLIL, Long.valueOf(System.currentTimeMillis() - this.LLIIZ), 1, null, null, 0);
        V16.LJJLIIIIJ(DownloadFinishEvent.class);
    }

    public final void LJ() {
        Context context = this.LJLIL;
        if (context instanceof Activity) {
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            o.LJI(LJIJJ);
            if (LJIJJ.isFinishing()) {
                return;
            }
            Activity LJIJJ2 = C45804HyK.LJIJJ(this.LJLIL);
            o.LJI(LJIJJ2);
            if (LJIJJ2.isDestroyed()) {
                return;
            }
        }
        AlertDialogC45396Hrk alertDialogC45396Hrk = this.LJLL;
        if (alertDialogC45396Hrk != null) {
            o.LJI(alertDialogC45396Hrk);
            if (alertDialogC45396Hrk.isShowing()) {
                AlertDialogC45396Hrk alertDialogC45396Hrk2 = this.LJLL;
                o.LJI(alertDialogC45396Hrk2);
                alertDialogC45396Hrk2.dismiss();
            }
        }
    }

    public final String LJFF() {
        return C29822Bn8.LIZ(this.LJLIL, R.string.q_k, "mContext.resources.getString(R.string.saving)");
    }

    public final void LJIIIIZZ() {
        C39579Fg7.LJIL(this.LJLJJL);
    }

    public final boolean LJIIIZ() {
        if (o.LJ(this.LLFF, "download_action") || o.LJ(this.LLFF, "share_download")) {
            return true;
        }
        return false;
    }

    public final boolean LJIILIIL() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJJI);
        this.LJLJL = JBR.LJFF(LIZ, this.LJLLI, "_mute.mp4", LIZ);
        String str = this.LJLJJLL;
        o.LJI(str);
        String str2 = this.LJLJL;
        o.LJI(str2);
        n nVar = new n();
        AVExternalServiceImpl.LIZ().abilityService().processService().muteVideo(str, str2, new HN7(nVar));
        C10K<TResult> c10k = nVar.LIZ;
        o.LJIIIIZZ(c10k, "taskCompletionSource.task");
        try {
            c10k.LJIJI();
            C39579Fg7.LJIL(this.LJLJJLL);
            Integer num = (Integer) c10k.LJIIJJI();
            if (num != null && num.intValue() == 0) {
                this.LJLJJLL = this.LJLJL;
                return true;
            }
            String str3 = this.LJLJJLL;
            Long valueOf = Long.valueOf(this.LLFZ);
            String str4 = this.LJLLLL;
            if (!this.LJZ && !this.LJLZ) {
                z = false;
                C10K.LIZJ(new CallableC45371HrL((Integer) c10k.LJIIJJI(), valueOf, str3, str4, z));
                this.LLILLIZIL = 7;
                this.LLILLJJLI = (Integer) c10k.LJIIJJI();
                this.LLILLL = "mute_audio";
                C39579Fg7.LJIL(this.LJLJL);
                return false;
            }
            z = true;
            C10K.LIZJ(new CallableC45371HrL((Integer) c10k.LJIIJJI(), valueOf, str3, str4, z));
            this.LLILLIZIL = 7;
            this.LLILLJJLI = (Integer) c10k.LJIIJJI();
            this.LLILLL = "mute_audio";
            C39579Fg7.LJIL(this.LJLJL);
            return false;
        } catch (InterruptedException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }

    public final void LJI(boolean z) {
        C44938HkM.LIZIZ = false;
        C44938HkM.LIZJ = false;
        if (this.LLIILZL.hasMessages(1)) {
            this.LLIILZL.removeMessages(1);
        }
        if (z) {
            C39579Fg7.LJIL(this.LJLJJLL);
            LJIIIIZZ();
        }
        C38816FLg.LIZJ(new ARunnableS13S0110000_7(this, z, 1));
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onCanceled(entity);
        Aweme aweme = this.LLF;
        if (aweme != null) {
            C44938HkM.LJFF(C45382HrW.LIZJ(3, aweme, 0, this.LLIIJI, this.LLIIJLIL, 4), "");
            C44938HkM.LIZIZ = false;
            this.LLIIIILZ.LIZJ(this.LJLIL);
            AbstractC45355Hr5 abstractC45355Hr5 = this.LLII;
            if (abstractC45355Hr5 != null) {
                abstractC45355Hr5.LIZ(System.currentTimeMillis(), 0L, 0, "", false, this.LLIIJI, -1, this.LLIILII);
            }
            if (C44938HkM.LIZLLL) {
                C39579Fg7.LJIL(this.LJLJJLL);
                LJIIIIZZ();
                C44938HkM.LIZLLL = false;
                return;
            } else {
                InterfaceC43172Gwy interfaceC43172Gwy = this.LJLLL;
                if (interfaceC43172Gwy != null) {
                    interfaceC43172Gwy.onCancel();
                    return;
                }
                return;
            }
        }
        o.LJIJI("mAweme");
        throw null;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onProgress(DownloadInfo entity) {
        int i;
        o.LJIIIZ(entity, "entity");
        super.onProgress(entity);
        int curBytes = (int) ((((float) entity.getCurBytes()) / ((float) entity.getTotalBytes())) * 100);
        C45351Hr1 c45351Hr1 = this.LLFII;
        if (c45351Hr1 != null) {
            i = c45351Hr1.LIZ(EnumC45352Hr2.VIDEO_DOWNLOAD_TYPE, curBytes);
        } else {
            i = 0;
        }
        this.LJLJLLL = i;
        if (i >= 100) {
            this.LJLJLLL = 100;
        } else if (i < 0) {
            this.LJLJLLL = 0;
        }
        C38816FLg.LIZJ(this.LLILZ);
        Aweme aweme = this.LLF;
        if (aweme != null) {
            C44938HkM.LJFF(C45382HrW.LIZIZ(2, aweme, this.LJLJLLL, this.LLIIJI, this.LLIIJLIL), this.LLIIJI);
        } else {
            o.LJIJI("mAweme");
            throw null;
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onStart(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onStart(entity);
        Aweme aweme = this.LLF;
        if (aweme != null) {
            C44938HkM.LJFF(C45382HrW.LIZJ(1, aweme, 0, this.LLIIJI, this.LLIIJLIL, 4), this.LLIIJI);
            C44938HkM.LIZIZ = true;
            AbstractC45355Hr5 abstractC45355Hr5 = this.LLII;
            if (abstractC45355Hr5 != null) {
                abstractC45355Hr5.LIZJ(System.currentTimeMillis(), this.LLIIJI);
                return;
            }
            return;
        }
        o.LJIJI("mAweme");
        throw null;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo entity) {
        o.LJIIIZ(entity, "entity");
        super.onSuccessed(entity);
        C44938HkM.LIZIZ = false;
        this.LLIIIILZ.LIZJ(this.LJLIL);
        if (C44938HkM.LIZLLL) {
            C39579Fg7.LJIL(this.LJLJJLL);
            LJIIIIZZ();
            C44938HkM.LIZLLL = false;
            return;
        }
        Aweme aweme = this.LLF;
        if (aweme != null) {
            String aid = aweme.getAid();
            Aweme aweme2 = this.LLF;
            if (aweme2 != null) {
                C62411OeV.LIZ(aid, Integer.valueOf(aweme2.getAwemeType()), this.LL, this.LJLLJ);
                String targetFilePath = entity.getTargetFilePath();
                if (targetFilePath != null) {
                    this.LJLJJL = targetFilePath;
                    if (targetFilePath.length() == 0) {
                        return;
                    }
                    File file = new File(targetFilePath);
                    AbstractC45355Hr5 abstractC45355Hr5 = this.LLII;
                    if (abstractC45355Hr5 != null) {
                        long j = 0;
                        if (abstractC45355Hr5.LIZIZ != 0) {
                            long currentTimeMillis = System.currentTimeMillis();
                            AbstractC45355Hr5 abstractC45355Hr52 = this.LLII;
                            if (abstractC45355Hr52 != null) {
                                j = abstractC45355Hr52.LIZIZ;
                            }
                            this.LLFZ = currentTimeMillis - j;
                            this.LLI = file.length() / this.LLFZ;
                            RuntimeBehaviorServiceImpl.LJ().LIZ("download_success");
                            AbstractC45355Hr5 abstractC45355Hr53 = this.LLII;
                            if (abstractC45355Hr53 != null) {
                                abstractC45355Hr53.LIZIZ(this.LLIILII, targetFilePath, this.LLIIJI);
                            }
                            if (!this.LJZ && !this.LJLZ) {
                                long length = file.length();
                                Long valueOf = Long.valueOf(this.LLFZ);
                                String str = this.LJLLLL;
                                Aweme aweme3 = this.LLF;
                                if (aweme3 != null) {
                                    Boolean valueOf2 = Boolean.valueOf(LJIIL(aweme3, this.LJLLILLLL));
                                    UrlModel urlModel = this.LJLLLLLL;
                                    Aweme aweme4 = this.LLF;
                                    if (aweme4 != null) {
                                        C45373HrN.LIZ(length, urlModel, valueOf2, -1, valueOf, targetFilePath, str, "success", false, aweme4.isPrivate());
                                        Aweme aweme5 = this.LLF;
                                        if (aweme5 == null) {
                                            o.LJIJI("mAweme");
                                            throw null;
                                        }
                                        C45373HrN.LIZIZ(aweme5, this.LLIIJI, this.LJLLILLLL, "short", C45373HrN.LIZLLL(this.LJLLLLLL), 0, -1);
                                    } else {
                                        o.LJIJI("mAweme");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mAweme");
                                    throw null;
                                }
                            }
                        }
                    }
                    MobClick obtain = MobClick.obtain();
                    obtain.setEventName(this.LLILII);
                    obtain.setLabelName(this.LLILIL);
                    obtain.setValue(String.valueOf(System.currentTimeMillis() - this.LLIL));
                    obtain.setJsonObject(this.LLILL);
                    FMX.onEvent(obtain);
                    if (file.length() < 2000) {
                        Boolean supportFilterErrorFile = C2YJ.LIZIZ.LIZ.getSupportFilterErrorFile();
                        o.LJIIIIZZ(supportFilterErrorFile, "get().supportFilterErrorFile");
                        if (supportFilterErrorFile.booleanValue()) {
                            LJIIIIZZ();
                            String str2 = this.LJLLLL;
                            o.LJI(str2);
                            if (ujb.o.LJJJLIIL(str2, "http://", false)) {
                                String str3 = this.LJLLLL;
                                o.LJI(str3);
                                this.LJLLLL = ujb.o.LJJJJZ(str3, "http://", "https://", false);
                                C45386Hra c45386Hra = this.LLIIIILZ;
                                c45386Hra.getClass();
                                c45386Hra.LIZJ = this;
                                Aweme aweme6 = this.LLF;
                                if (aweme6 != null) {
                                    String LIZ = C41823GbD.LIZ(aweme6, this.LJLLLL);
                                    this.LJLLLL = LIZ;
                                    AbstractC45355Hr5 abstractC45355Hr54 = this.LLII;
                                    if (abstractC45355Hr54 != null) {
                                        abstractC45355Hr54.LIZ = LIZ;
                                    }
                                    if (LIZ != null) {
                                        C45386Hra c45386Hra2 = this.LLIIIILZ;
                                        Context context = this.LJLIL;
                                        Aweme aweme7 = this.LLF;
                                        if (aweme7 != null) {
                                            String aid2 = aweme7.getAid();
                                            o.LJIIIIZZ(aid2, "mAweme.aid");
                                            StringBuilder LIZ2 = X1D.LIZ();
                                            c45386Hra2.LIZ(aid2, LIZ, JBR.LJFF(LIZ2, this.LJLLI, ".mp4", LIZ2), this.LJLILLLLZI, context);
                                            return;
                                        }
                                        o.LJIJI("mAweme");
                                        throw null;
                                    }
                                    return;
                                }
                                o.LJIJI("mAweme");
                                throw null;
                            }
                            this.LJLJLJ = 3;
                            onFailed(null, new BaseException(-1, "Download hijacked"));
                            return;
                        }
                    }
                    C10K.LIZIZ(new ACallableS110S0100000_7(this, 65), C38995FSd.LIZLLL(), null);
                    return;
                }
                return;
            }
            o.LJIJI("mAweme");
            throw null;
        }
        o.LJIJI("mAweme");
        throw null;
    }

    public final boolean LJIIJJI(ACLCommonShare aCLCommonShare, boolean z) {
        if (LJIIIZ()) {
            if (z) {
                if (aCLCommonShare == null) {
                    return false;
                }
                int transcode = aCLCommonShare.getTranscode();
                if (transcode != 2 && transcode != 3) {
                    return false;
                }
            } else if (aCLCommonShare == null || aCLCommonShare.getTranscode() != 2) {
                return false;
            }
        } else {
            Aweme aweme = this.LLF;
            if (aweme != null) {
                if (C62814Ol0.LJJIIZ(aweme) || C62814Ol0.LJIIIZ(aweme)) {
                    return false;
                }
                boolean isReviewed = aweme.isReviewed();
                if (C62814Ol0.LJIL(aweme)) {
                    return isReviewed;
                }
                if (!aweme.isImage()) {
                    if (!z) {
                        return false;
                    }
                    if (!isReviewed) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                            if (!SettingsManager.LIZ("pk_allow_client_watermark", true)) {
                                return false;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
            } else {
                o.LJIJI("mAweme");
                throw null;
            }
        }
        return true;
    }

    public final boolean LJIIL(Aweme aweme, String str) {
        boolean z;
        Music music;
        if (LJIIIZ()) {
            ACLCommonShare aCLCommonShare = this.LLFFF;
            if (aCLCommonShare == null || !aCLCommonShare.getMute()) {
                return false;
            }
        } else {
            if (str != null && C36699Eal.LIZ != null && aweme.getMusic() != null && aweme.getMusic().isMuteShare()) {
                List<String> list = C36699Eal.LIZ;
                o.LJI(list);
                String lowerCase = str.toLowerCase();
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
                if (list.contains(lowerCase)) {
                    z = true;
                    music = aweme.getMusic();
                    if (music != null || !music.isPreventDownload() || !C85990Xow.LJIIJ()) {
                        return z;
                    }
                }
            }
            z = false;
            music = aweme.getMusic();
            return music != null ? z : z;
        }
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        long j;
        boolean z;
        super.onFailed(downloadInfo, baseException);
        boolean z2 = false;
        C44938HkM.LIZIZ = false;
        this.LLIIIILZ.LIZJ(this.LJLIL);
        if (baseException == null) {
            LJI(false);
            return;
        }
        if (C44938HkM.LIZLLL) {
            C39579Fg7.LJIL(this.LJLJJLL);
            LJIIIIZZ();
            C44938HkM.LIZLLL = false;
            return;
        }
        Aweme aweme = this.LLF;
        if (aweme != null) {
            C45347Hqx.LIZ(aweme, baseException, this.LJLLLL);
            int errorCode = baseException.getErrorCode();
            long currentTimeMillis = System.currentTimeMillis();
            AbstractC45355Hr5 abstractC45355Hr5 = this.LLII;
            if (abstractC45355Hr5 != null) {
                j = abstractC45355Hr5.LIZIZ;
            } else {
                j = 0;
            }
            Long valueOf = Long.valueOf(currentTimeMillis - j);
            String str = this.LJLLLL;
            if (this.LJZ || this.LJLZ) {
                z = true;
            } else {
                z = false;
            }
            Integer valueOf2 = Integer.valueOf(errorCode);
            String errorMessage = baseException.getErrorMessage();
            Aweme aweme2 = this.LLF;
            if (aweme2 != null) {
                Boolean valueOf3 = Boolean.valueOf(LJIIL(aweme2, this.LJLLILLLL));
                UrlModel urlModel = this.LJLLLLLL;
                Aweme aweme3 = this.LLF;
                if (aweme3 != null) {
                    C45373HrN.LIZ(-1L, urlModel, valueOf3, valueOf2, valueOf, null, str, errorMessage, z, aweme3.isPrivate());
                    if (this.LJLJLJ < 3) {
                        AbstractC45355Hr5 abstractC45355Hr52 = this.LLII;
                        if (abstractC45355Hr52 != null) {
                            abstractC45355Hr52.LIZ(System.currentTimeMillis(), -1L, errorCode, baseException.getErrorMessage(), false, this.LLIIJI, 0, this.LLIILII);
                        }
                        this.LJLJLJ++;
                        if (baseException.getErrorCode() == 1036) {
                            String str2 = this.LJLLLL;
                            if (str2 != null) {
                                String tmpDir = C66580QBc.LJIIZILJ(this.LJLIL);
                                C39579Fg7.LJ(tmpDir, false);
                                this.LJLJLJ = 3;
                                C45386Hra c45386Hra = this.LLIIIILZ;
                                c45386Hra.getClass();
                                c45386Hra.LIZJ = this;
                                C45386Hra c45386Hra2 = this.LLIIIILZ;
                                Context context = this.LJLIL;
                                Aweme aweme4 = this.LLF;
                                if (aweme4 != null) {
                                    String aid = aweme4.getAid();
                                    o.LJIIIIZZ(aid, "mAweme.aid");
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append(this.LJLLI);
                                    LIZ.append(".mp4");
                                    String LIZIZ = X1D.LIZIZ(LIZ);
                                    o.LJIIIIZZ(tmpDir, "tmpDir");
                                    c45386Hra2.LIZ(aid, str2, LIZIZ, tmpDir, context);
                                    return;
                                }
                                o.LJIJI("mAweme");
                                throw null;
                            }
                            return;
                        }
                        UrlModel urlModel2 = this.LJLLLLLL;
                        if (urlModel2 != null && !C79004UzY.LJJIFFI(urlModel2.getUrlList())) {
                            this.LJLLLL = (String) ListProtector.get(urlModel2.getUrlList(), this.LJLJLJ % urlModel2.getUrlList().size());
                        }
                        this.LJLLLL = C78983UzD.LJJ(this.LJLLLL);
                        C45386Hra c45386Hra3 = this.LLIIIILZ;
                        c45386Hra3.getClass();
                        c45386Hra3.LIZJ = this;
                        Aweme aweme5 = this.LLF;
                        if (aweme5 != null) {
                            String LIZ2 = C41823GbD.LIZ(aweme5, this.LJLLLL);
                            this.LJLLLL = LIZ2;
                            AbstractC45355Hr5 abstractC45355Hr53 = this.LLII;
                            if (abstractC45355Hr53 != null) {
                                abstractC45355Hr53.LIZ = LIZ2;
                            }
                            if (LIZ2 != null) {
                                C45386Hra c45386Hra4 = this.LLIIIILZ;
                                Context context2 = this.LJLIL;
                                Aweme aweme6 = this.LLF;
                                if (aweme6 != null) {
                                    String aid2 = aweme6.getAid();
                                    o.LJIIIIZZ(aid2, "mAweme.aid");
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    c45386Hra4.LIZ(aid2, LIZ2, JBR.LJFF(LIZ3, this.LJLLI, ".mp4", LIZ3), this.LJLILLLLZI, context2);
                                    return;
                                }
                                o.LJIJI("mAweme");
                                throw null;
                            }
                            return;
                        }
                        o.LJIJI("mAweme");
                        throw null;
                    }
                    Aweme aweme7 = this.LLF;
                    if (aweme7 != null) {
                        C44938HkM.LJFF(C45382HrW.LIZJ(5, aweme7, 0, this.LLIIJI, this.LLIIJLIL, 4), "");
                        LJI(false);
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(baseException.getErrorMessage());
                        LIZ4.append("    ***  Number of Retries *** :");
                        LIZ4.append(this.LJLJLJ);
                        String LIZIZ2 = X1D.LIZIZ(LIZ4);
                        EF7.LIZIZ();
                        try {
                            z2 = C2NU.LIZ.LIZIZ();
                        } catch (Exception unused) {
                        }
                        if (z2) {
                            C198517qh c198517qh = new C198517qh();
                            c198517qh.LIZ.put("errorCode", Integer.valueOf(errorCode));
                            c198517qh.LIZ.put("errorDes", LIZIZ2);
                            JSONObject LJ = c198517qh.LJ();
                            if (errorCode == 1052) {
                                LJ.putOpt("availableStorageSize", Long.valueOf(C268513p.LIZJ(EF7.LIZIZ())));
                                LJ.putOpt("totalStorageSize", Long.valueOf(C268513p.LJ(EF7.LIZIZ())));
                            }
                            C09900aA.LJIIJJI("aweme_download_error_rate", 1, LJ);
                        }
                        String LIZLLL = C72972SkS.LIZLLL(errorCode, "");
                        if (errorCode > 0) {
                            Aweme aweme8 = this.LLF;
                            if (aweme8 != null) {
                                if (aweme8.isPrivate()) {
                                    LIZLLL = C42398GkU.LIZIZ(LIZLLL, 'P');
                                }
                            } else {
                                o.LJIJI("mAweme");
                                throw null;
                            }
                        }
                        RuntimeBehaviorServiceImpl.LJ().event("download_error", LIZLLL);
                        C1GE.LJIILL("aweme_movie_download_log", "", LIZIZ2, this.LJLLLL);
                        AbstractC45355Hr5 abstractC45355Hr54 = this.LLII;
                        if (abstractC45355Hr54 != null) {
                            abstractC45355Hr54.LIZ(System.currentTimeMillis(), -1L, errorCode, baseException.getErrorMessage(), true, this.LLIIJI, 0, this.LLIILII);
                        }
                        this.LLILLIZIL = 1;
                        this.LLILLJJLI = Integer.valueOf(baseException.getErrorCode());
                        this.LLILLL = baseException.getErrorMessage();
                        return;
                    }
                    o.LJIJI("mAweme");
                    throw null;
                }
                o.LJIJI("mAweme");
                throw null;
            }
            o.LJIJI("mAweme");
            throw null;
        }
        o.LJIJI("mAweme");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0576  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.ss.android.ugc.aweme.feed.model.Aweme r26, java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45344Hqu.LJIIJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean):void");
    }

    public C45344Hqu(Context context, int i, boolean z, String str) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LLIIIILZ = new C45386Hra();
        this.LLIIIL = new C44934HkI();
        this.LLIIIZ = "";
        this.LLIIJI = "";
        this.LLIIJLIL = new Bundle();
        this.LLIIL = "download_to_share";
        this.LLIILZL = new IDHandlerS20S0100000_7(this, C16880lQ.LLJJJJ(), 3);
        this.LLIL = -1L;
        this.LLILLIZIL = 100;
        this.LLILZ = new ARunnableS43S0100000_7(this, 152);
        this.LLILZIL = new C45345Hqv(this);
        this.LJLZ = z;
        String LJIIZILJ = C66580QBc.LJIIZILJ(this.LJLIL);
        o.LJIIIIZZ(LJIIZILJ, "getShareTempDataDir(mContext)");
        this.LJLILLLLZI = LJIIZILJ;
        String LJIILLIIL = C66580QBc.LJIILLIIL(this.LJLIL);
        o.LJIIIIZZ(LJIILLIIL, "getSharePictureDir(mContext)");
        this.LJLJI = LJIILLIIL;
        String LJIILL = C66580QBc.LJIILL(this.LJLIL);
        o.LJIIIIZZ(LJIILL, "getShareOutDir(mContext)");
        this.LJLJJI = LJIILL;
        C8BR<?, ?> c8br = new C8BR<>();
        this.LL = c8br;
        c8br.LJJ(new C43169Gwv());
        this.LJLLILLLL = str;
        C44938HkM.LJIIIIZZ = str;
        this.LJLLJ = C193657ir.LJFF(i);
    }
}
