package com.ss.android.ugc.aweme.tools.policysecurity;

import X.C10K;
import X.C16880lQ;
import X.C19N;
import X.C1I0;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C40084FoG;
import X.C41859Gbn;
import X.C43379H0t;
import X.C43753HFd;
import X.C43754HFe;
import X.C43887HKh;
import X.C60903NvH;
import X.C66163Pxv;
import X.C68322mC;
import X.C78983UzD;
import X.C84763XOl;
import X.E4T;
import X.EnumC43889HKj;
import X.HG5;
import X.HGH;
import X.HGJ;
import X.HLJ;
import X.I9A;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.ORZ;
import X.X1D;
import Y.AgS110S0200000_7;
import Y.AgS124S0100000_7;
import Y.AgS75S0300000_7;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.SafeJobIntentService;
import com.google.gson.internal.b;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadVideoConfig;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadTask;
import com.ss.android.ugc.aweme.uploader.factory.AbstractVideoUploader;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import v5.n;

/* loaded from: classes8.dex */
public final class OriginalSoundUploadService extends SafeJobIntentService {

    /* loaded from: classes8.dex */
    public interface AudioUploadApi {
        @InterfaceC195787mI
        @E4T("/aweme/v2/aweme/audiotrack/update/")
        C10K<BaseResponse> uploadAudio(@InterfaceC64987Pex("aweme_id") String str, @InterfaceC64987Pex("audiotrack_uri") String str2);

        @InterfaceC195787mI
        @E4T("/tiktok/v1/multi/audiotrack/update/")
        C10K<BaseResponse> uploadMultiAudio(@InterfaceC64987Pex("audio_requests") JSONArray jSONArray);
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // androidx.core.app.SafeJobIntentService, androidx.core.app.JobIntentService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.core.app.JobIntentService
    public final void onHandleWork(Intent intent) {
        UploadVideoConfig uploadVideoConfig;
        boolean z;
        o.LJIIIZ(intent, "intent");
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        o.LJIIIIZZ(applicationContext, "applicationContext");
        HG5 LIZ = HGH.LIZ(applicationContext);
        String LIZ2 = C43379H0t.LIZ();
        if (TextUtils.isEmpty(LIZ2)) {
            return;
        }
        try {
            UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson().LJI(LIZ2, UploadAuthKeyConfig.class);
            if (uploadAuthKeyConfig != null && (uploadVideoConfig = uploadAuthKeyConfig.videoConfig) != null) {
                ArrayList<OriginalSoundUploadTask> LIZIZ = LIZ.LIZIZ();
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<OriginalSoundUploadTask> it = LIZIZ.iterator();
                while (it.hasNext()) {
                    OriginalSoundUploadTask next = it.next();
                    String str = next.unionId;
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(str, obj);
                    }
                    ((List) obj).add(next);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List<OriginalSoundUploadTask> list = (List) entry.getValue();
                    if (str2 == null || str2.length() == 0) {
                        for (OriginalSoundUploadTask originalSoundUploadTask : list) {
                            HGJ hgj = new HGJ();
                            hgj.LIZ(originalSoundUploadTask);
                            arrayList.add(hgj);
                        }
                    } else {
                        HGJ hgj2 = new HGJ();
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            hgj2.LIZ((OriginalSoundUploadTask) it2.next());
                        }
                        arrayList.add(hgj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (System.currentTimeMillis() - ((OriginalSoundUploadTask) ORZ.LJLLJ(((HGJ) next2).LIZ)).updateTime > 21600000) {
                        arrayList2.add(next2);
                    }
                }
                arrayList.removeAll(arrayList2);
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    HGJ hgj3 = (HGJ) it4.next();
                    LIZJ(hgj3, LIZ);
                    Iterator it5 = ((ArrayList) hgj3.LIZ).iterator();
                    while (it5.hasNext()) {
                        OriginalSoundUploadTask originalSoundUploadTask2 = (OriginalSoundUploadTask) it5.next();
                        C43754HFe c43754HFe = new C43754HFe();
                        c43754HFe.LIZ = originalSoundUploadTask2.awemeId;
                        c43754HFe.LJ = Boolean.valueOf(originalSoundUploadTask2.isBackup);
                        c43754HFe.LIZLLL = Boolean.valueOf(originalSoundUploadTask2.isDraft);
                        c43754HFe.LIZIZ = originalSoundUploadTask2.matchFactors;
                        c43754HFe.LIZJ = Integer.valueOf(originalSoundUploadTask2.origin);
                        if (originalSoundUploadTask2.queryTimes > 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c43754HFe.LJII = Boolean.valueOf(z);
                        c43754HFe.LJI = 0;
                        c43754HFe.LJFF = -4002;
                        C43753HFd.LIZJ(c43754HFe);
                    }
                }
                C1I0.LIZIZ().LIZJ("original_sound", "pending task count: " + arrayList.size());
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    HGJ multiModel = (HGJ) it6.next();
                    if (C19N.LJ("enable_update_frame_query_times", true)) {
                        o.LJIIIZ(multiModel, "multiModel");
                        Iterator it7 = ((ArrayList) multiModel.LIZ).iterator();
                        while (it7.hasNext()) {
                            OriginalSoundUploadTask originalSoundUploadTask3 = (OriginalSoundUploadTask) it7.next();
                            originalSoundUploadTask3.queryTimes++;
                            LIZ.LIZ(originalSoundUploadTask3);
                        }
                    }
                    Iterator it8 = ((ArrayList) multiModel.LIZ).iterator();
                    while (it8.hasNext()) {
                        OriginalSoundUploadTask originalSoundUploadTask4 = (OriginalSoundUploadTask) it8.next();
                        try {
                            C10K<OriginalSoundUploadTask> LIZLLL = LIZLLL(originalSoundUploadTask4, uploadVideoConfig);
                            LIZLLL.LJIJI();
                            if (LIZLLL.LJIILJJIL() || LIZLLL.LJIIL()) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("upload failed for awemeId: ");
                                LIZ3.append(originalSoundUploadTask4.awemeId);
                                LIZ3.append(", reason: ");
                                LIZ3.append(Log.getStackTraceString(LIZLLL.LJIIJ()));
                                C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("original_sound", X1D.LIZIZ(LIZ3));
                            } else {
                                C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
                                StringBuilder LIZ4 = X1D.LIZ();
                                LIZ4.append("upload uri: ");
                                LIZ4.append(originalSoundUploadTask4.audioVid);
                                LIZ4.append(", awemeId: ");
                                LIZ4.append(originalSoundUploadTask4.awemeId);
                                LIZ4.append(" success");
                                LJJ.LIZJ("original_sound", X1D.LIZIZ(LIZ4));
                            }
                        } catch (Exception e) {
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("upload interrupted for awemeId: ");
                            LIZ5.append(originalSoundUploadTask4.awemeId);
                            LIZ5.append(", reason: ");
                            LIZ5.append(Log.getStackTraceString(e));
                            I9A.LIZJ("original_sound", X1D.LIZIZ(LIZ5));
                        }
                    }
                    C10K LJIIIZ = C10K.LJIIIZ(multiModel);
                    o.LJIIIIZZ(LJIIIZ, "forResult(multiModel)");
                    LJIIIZ.LJFF(new AgS110S0200000_7(LIZ, this, 2)).LIZLLL(new AgS75S0300000_7(this, multiModel, LIZ, 0)).LIZLLL(new AgS124S0100000_7(multiModel, 15)).LJIJI();
                    C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("original_sound", "original sound upload success.");
                }
            }
        } catch (Exception unused) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("AuthkeyCache", LIZ2);
            C78983UzD.LJIILLIIL("AuthkeyCache", linkedHashMap2);
        }
    }

    public static void LIZJ(HGJ hgj, HG5 hg5) {
        Iterator it = ((ArrayList) hgj.LIZ).iterator();
        while (it.hasNext()) {
            OriginalSoundUploadTask originalSoundUploadTask = (OriginalSoundUploadTask) it.next();
            String awemeId = originalSoundUploadTask.awemeId;
            hg5.getClass();
            o.LJIIIZ(awemeId, "awemeId");
            hg5.getWritableDatabase().delete("OriginalSound", "aweme_id = ?", new String[]{awemeId});
            C16880lQ.LLLZZIL(new File(originalSoundUploadTask.originalSoundPath));
            C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cleanup original sound, awemeId: ");
            LIZ.append(originalSoundUploadTask.awemeId);
            LJJ.LIZJ("original_sound", X1D.LIZIZ(LIZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.HKh, T] */
    public final C10K<OriginalSoundUploadTask> LIZLLL(final OriginalSoundUploadTask originalSoundUploadTask, final UploadVideoConfig uploadVideoConfig) {
        if (originalSoundUploadTask.audioVid != null) {
            C10K<OriginalSoundUploadTask> LJIIIZ = C10K.LJIIIZ(originalSoundUploadTask);
            o.LJIIIIZZ(LJIIIZ, "forResult(task)");
            return LJIIIZ;
        }
        int nativeCheckAudioFile = TEVideoUtils.nativeCheckAudioFile(originalSoundUploadTask.originalSoundPath);
        if (nativeCheckAudioFile != 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("file error, ");
            C10K<OriginalSoundUploadTask> LJIIIIZZ = C10K.LJIIIIZZ(new IllegalStateException(C40084FoG.LIZ(LIZ, originalSoundUploadTask.originalSoundPath, " checkResult = ", nativeCheckAudioFile, LIZ)));
            o.LJIIIIZZ(LJIIIIZZ, "forError(IllegalStateExc…kResult = $checkResult\"))");
            return LJIIIIZZ;
        }
        final n nVar = new n();
        final C68322mC c68322mC = new C68322mC();
        try {
            EnumC43889HKj business = EnumC43889HKj.NORMAL;
            o.LJIIIZ(business, "business");
            ?? c43887HKh = new C43887HKh(uploadVideoConfig, business);
            c68322mC.element = c43887HKh;
            c43887HKh.LJI(originalSoundUploadTask.awemeId);
            ((AbstractVideoUploader) c68322mC.element).LIZLLL(new HLJ() { // from class: X.6hb
                @Override // X.HLJ
                public final void LIZ() {
                }

                @Override // X.HLJ
                public final void LIZJ() {
                }

                @Override // X.HLJ
                public final void LJ() {
                }

                @Override // X.HLJ
                public final int LIZIZ() {
                    return b.LIZIZ(UploadVideoConfig.this, "OriginalSoundUpload");
                }

                @Override // X.HLJ
                public final void LIZLLL(int i, long j, AbstractVideoUploader.VideoUploadInfo videoUploadInfo) {
                    c68322mC.element.LIZIZ();
                    if (i == 0) {
                        originalSoundUploadTask.audioVid = videoUploadInfo.getMVideoId();
                        c68322mC.element.LIZ();
                        nVar.LIZJ(originalSoundUploadTask);
                        return;
                    }
                    c68322mC.element.LIZJ();
                    if (i != 2) {
                        return;
                    }
                    c68322mC.element.LIZ();
                    n<OriginalSoundUploadTask> nVar2 = nVar;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("upload failed ");
                    LIZ2.append(j);
                    LIZ2.append('.');
                    nVar2.LIZIZ(new IllegalArgumentException(X1D.LIZIZ(LIZ2)));
                    OriginalSoundUploadService originalSoundUploadService = this;
                    OriginalSoundUploadTask originalSoundUploadTask2 = originalSoundUploadTask;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("upload errcode: ");
                    LIZ3.append(Long.valueOf(videoUploadInfo.getMErrorCode()));
                    LIZ3.append(" extra : ");
                    LIZ3.append(videoUploadInfo.getMExtra());
                    LIZ3.append(" events: null ");
                    String LIZIZ = X1D.LIZIZ(LIZ3);
                    Long valueOf = Long.valueOf(videoUploadInfo.getMErrorCode());
                    originalSoundUploadService.getClass();
                    OriginalSoundUploadService.LIZIZ(originalSoundUploadTask2, LIZIZ, valueOf);
                }
            });
            ((AbstractVideoUploader) c68322mC.element).LJ(originalSoundUploadTask.originalSoundPath);
            ((AbstractVideoUploader) c68322mC.element).LJFF();
        } catch (Exception e) {
            AbstractVideoUploader abstractVideoUploader = (AbstractVideoUploader) c68322mC.element;
            if (abstractVideoUploader != null) {
                abstractVideoUploader.LIZ();
            }
            String stackTraceString = Log.getStackTraceString(e);
            o.LJIIIIZZ(stackTraceString, "getStackTraceString(e)");
            LIZIZ(originalSoundUploadTask, stackTraceString, 0L);
            nVar.LIZIZ(e);
        }
        C10K c10k = nVar.LIZ;
        o.LJIIIIZZ(c10k, "taskCompletionSource.task");
        return c10k;
    }

    public static void LIZIZ(OriginalSoundUploadTask originalSoundUploadTask, String str, Long l) {
        long j;
        C43754HFe c43754HFe = new C43754HFe();
        c43754HFe.LIZ = originalSoundUploadTask.awemeId;
        c43754HFe.LJ = Boolean.valueOf(originalSoundUploadTask.isBackup);
        c43754HFe.LIZLLL = Boolean.valueOf(originalSoundUploadTask.isDraft);
        c43754HFe.LIZIZ = originalSoundUploadTask.matchFactors;
        c43754HFe.LIZJ = Integer.valueOf(originalSoundUploadTask.origin);
        boolean z = true;
        if (originalSoundUploadTask.queryTimes <= 1) {
            z = false;
        }
        c43754HFe.LJII = Boolean.valueOf(z);
        c43754HFe.LJI = 0;
        o.LJIIIZ(str, "<set-?>");
        c43754HFe.LJIIIZ = str;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        c43754HFe.LJIIIIZZ = j;
        c43754HFe.LJFF = -3001;
        C43753HFd.LIZ(c43754HFe);
    }

    public static void LIZ(OriginalSoundUploadTask originalSoundUploadTask, String str, int i, int i2) {
        C43754HFe c43754HFe = new C43754HFe();
        c43754HFe.LIZ = originalSoundUploadTask.awemeId;
        c43754HFe.LJ = Boolean.valueOf(originalSoundUploadTask.isBackup);
        c43754HFe.LIZLLL = Boolean.valueOf(originalSoundUploadTask.isDraft);
        c43754HFe.LIZIZ = originalSoundUploadTask.matchFactors;
        c43754HFe.LIZJ = Integer.valueOf(originalSoundUploadTask.origin);
        boolean z = true;
        if (originalSoundUploadTask.queryTimes <= 1) {
            z = false;
        }
        c43754HFe.LJII = Boolean.valueOf(z);
        c43754HFe.LJI = i2;
        c43754HFe.LJIIIZ = str;
        c43754HFe.LJFF = Integer.valueOf(i);
        C43753HFd.LIZ(c43754HFe);
    }
}
