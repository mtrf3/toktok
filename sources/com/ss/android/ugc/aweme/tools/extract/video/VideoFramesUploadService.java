package com.ss.android.ugc.aweme.tools.extract.video;

import X.C10K;
import X.C16880lQ;
import X.C19N;
import X.C1DG;
import X.C1I0;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38891fp;
import X.C38978FRm;
import X.C39579Fg7;
import X.C41859Gbn;
import X.C43753HFd;
import X.C43754HFe;
import X.C43758HFi;
import X.C44172HVg;
import X.C45039Hlz;
import X.C5L7;
import X.C60903NvH;
import X.C66163Pxv;
import X.C84763XOl;
import X.E4T;
import X.FUX;
import X.H0I;
import X.H0T;
import X.H75;
import X.H78;
import X.HG2;
import X.HG7;
import X.HGA;
import X.HGN;
import X.I9A;
import X.InterfaceC195787mI;
import X.InterfaceC64987Pex;
import X.X1D;
import Y.AgS10S1400000_7;
import Y.AgS41S1200000_7;
import Y.AgS46S0000000_7;
import Y.AgS75S0300000_7;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.SafeJobIntentService;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.e;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import defpackage.b1;
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
public class VideoFramesUploadService extends SafeJobIntentService {
    public static final String LJLIL = C16880lQ.LJLLJ(VideoFramesUploadService.class);

    /* loaded from: classes8.dex */
    public interface FramesUploadApi {
        @InterfaceC195787mI
        @E4T("/aweme/v2/aweme/vframe/update/")
        C10K<BaseResponse> uploadFrame(@InterfaceC64987Pex("aweme_id") String str, @InterfaceC64987Pex("video_id") String str2, @InterfaceC64987Pex("vframe_uri") String str3, @InterfaceC64987Pex("stickers") String str4, @InterfaceC64987Pex("aweme_type") Integer num, @InterfaceC64987Pex("vframe_type") Integer num2);

        @InterfaceC195787mI
        @E4T("/tiktok/v1/multi/vframe/update/")
        C10K<BaseResponse> uploadMultiFrame(@InterfaceC64987Pex("vframe_requests") JSONArray jSONArray);
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    public static void LIZLLL(String str) {
        C41859Gbn LIZIZ = C1I0.LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("msg = ");
        LIZ.append(str);
        LIZIZ.LIZJ("extract_frame", X1D.LIZIZ(LIZ));
        C43753HFd.LJI(null, -1, 14, str);
        C5L7.LIZIZ();
    }

    public static void LJFF(HGA hga) {
        boolean z;
        C43754HFe c43754HFe = new C43754HFe();
        c43754HFe.LIZ = hga.LIZ;
        c43754HFe.LJ = Boolean.valueOf(hga.LJIIL);
        c43754HFe.LIZLLL = Boolean.valueOf(hga.LJIIJ);
        c43754HFe.LIZIZ = hga.LJIIIZ;
        c43754HFe.LIZJ = Integer.valueOf(hga.LJIIJJI);
        if (hga.LJIILIIL > 1) {
            z = true;
        } else {
            z = false;
        }
        c43754HFe.LJII = Boolean.valueOf(z);
        c43754HFe.LJI = 1;
        C43753HFd.LJIIIIZZ(c43754HFe);
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
        String str;
        int i;
        boolean z;
        C10K LIZIZ;
        boolean z2;
        if (C44172HVg.LJIJ.isChildrenMode()) {
            return;
        }
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "aid");
        HG2.LIZ(LLJJIJIIJIL, "handle_work");
        Context applicationContext = getApplicationContext();
        if (C38891fp.LJLJI && applicationContext == null) {
            applicationContext = C38891fp.LJLILLLLZI;
        }
        C43758HFi LIZIZ2 = C43758HFi.LIZIZ(applicationContext);
        if (intent != null) {
            str = C16880lQ.LLJJIJIIJIL(intent, "authkey");
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            HG2.LIZ(LLJJIJIIJIL, "authkey_error");
            return;
        }
        HG7 hg7 = null;
        try {
            UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) new e().LIZ().LJI(str, UploadAuthKeyConfig.class);
            if (uploadAuthKeyConfig != null && uploadAuthKeyConfig.frameUploadConfig != null) {
                HG2.LIZ(LLJJIJIIJIL, "database_query");
                List<HGA> LIZJ = LIZIZ2.LIZJ();
                ArrayList arrayList = new ArrayList();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = ((ArrayList) LIZJ).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    String str2 = ((HGA) next).LJIIIIZZ;
                    Object obj = linkedHashMap.get(str2);
                    if (obj == null) {
                        obj = new ArrayList();
                        linkedHashMap.put(str2, obj);
                    }
                    ((List) obj).add(next);
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (true) {
                    i = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str3 = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    if (str3 == null || str3.length() == 0) {
                        i = 1;
                    }
                    if (i != 0) {
                        for (Object model : list) {
                            HGN hgn = new HGN();
                            o.LJIIIZ(model, "model");
                            ((ArrayList) hgn.LIZ).add(model);
                            arrayList.add(hgn);
                        }
                    } else {
                        HGN hgn2 = new HGN();
                        for (Object model2 : list) {
                            o.LJIIIZ(model2, "model");
                            ((ArrayList) hgn2.LIZ).add(model2);
                        }
                        arrayList.add(hgn2);
                    }
                }
                if (arrayList.isEmpty()) {
                    HG2.LIZ(LLJJIJIIJIL, "database_query_empty");
                    C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("extract_frame", "task is empty");
                    return;
                }
                if (C19N.LJ("enable_update_frame_query_times", true)) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        HGN hgn3 = (HGN) it3.next();
                        Iterator it4 = ((ArrayList) hgn3.LIZ).iterator();
                        while (it4.hasNext()) {
                            ((HGA) it4.next()).LJIILIIL++;
                        }
                        LIZIZ2.LIZ(hgn3);
                    }
                }
                C41859Gbn LIZIZ3 = C1I0.LIZIZ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("pending task count: ");
                LIZ.append(arrayList.size());
                LIZIZ3.LIZJ("extract_frame", X1D.LIZIZ(LIZ));
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    HGN hgn4 = (HGN) it5.next();
                    if (!((ArrayList) hgn4.LIZ).isEmpty()) {
                        if (System.currentTimeMillis() - ((HGA) ListProtector.get(hgn4.LIZ, i)).LJII > 21600000) {
                            Iterator it6 = ((ArrayList) hgn4.LIZ).iterator();
                            while (it6.hasNext()) {
                                HGA hga = (HGA) it6.next();
                                C43754HFe c43754HFe = new C43754HFe();
                                c43754HFe.LIZ = hga.LIZ;
                                c43754HFe.LJ = Boolean.valueOf(hga.LJIIL);
                                c43754HFe.LIZLLL = Boolean.valueOf(hga.LJIIJ);
                                c43754HFe.LIZIZ = hga.LJIIIZ;
                                c43754HFe.LIZJ = Integer.valueOf(hga.LJIIJJI);
                                if (hga.LJIILIIL > 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                c43754HFe.LJII = Boolean.valueOf(z);
                                c43754HFe.LJI = i;
                                c43754HFe.LJFF = -4001;
                                C43753HFd.LIZJ(c43754HFe);
                            }
                            Iterator it7 = ((ArrayList) hgn4.LIZ).iterator();
                            while (it7.hasNext()) {
                                LIZ((HGA) it7.next(), LIZIZ2);
                            }
                        } else {
                            I9A.LIZJ("extract_frame", "ready to package zip");
                            Iterator it8 = ((ArrayList) hgn4.LIZ).iterator();
                            HG2.LIZ(LLJJIJIIJIL, "create_package_task");
                            while (it8.hasNext()) {
                                HGA hga2 = (HGA) it8.next();
                                try {
                                    LIZIZ = LIZIZ(hg7, hga2);
                                    LIZIZ.LJIJI();
                                } catch (InterruptedException e) {
                                    HG2.LIZ(LLJJIJIIJIL, "create_package_task_error");
                                    C41859Gbn LJJ = C60903NvH.LJIIJJI().getPublishService().LJJ();
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("zip interrupted for awemeId: ");
                                    LIZ2.append(hga2.LIZ);
                                    LIZ2.append(", reason: ");
                                    LIZ2.append(Log.getStackTraceString(e));
                                    LJJ.LIZJ("extract_frame", X1D.LIZIZ(LIZ2));
                                }
                                if (LIZIZ.LJIILJJIL() || LIZIZ.LJIIL()) {
                                    it8.remove();
                                    LIZ(hga2, LIZIZ2);
                                    C41859Gbn LJJ2 = C60903NvH.LJIIJJI().getPublishService().LJJ();
                                    StringBuilder LIZ3 = X1D.LIZ();
                                    LIZ3.append("zip failed for awemeId: ");
                                    LIZ3.append(hga2.LIZ);
                                    LIZ3.append(", reason: ");
                                    LIZ3.append(Log.getStackTraceString(LIZIZ.LJIIJ()));
                                    LJJ2.LIZJ("extract_frame", X1D.LIZIZ(LIZ3));
                                    C43754HFe c43754HFe2 = new C43754HFe();
                                    c43754HFe2.LIZ = hga2.LIZ;
                                    c43754HFe2.LJ = Boolean.valueOf(hga2.LJIIL);
                                    c43754HFe2.LIZLLL = Boolean.valueOf(hga2.LJIIJ);
                                    c43754HFe2.LIZIZ = hga2.LJIIIZ;
                                    c43754HFe2.LIZJ = Integer.valueOf(hga2.LJIIJJI);
                                    if (hga2.LJIILIIL > 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    c43754HFe2.LJII = Boolean.valueOf(z2);
                                    c43754HFe2.LJI = i;
                                    String stackTraceString = Log.getStackTraceString(LIZIZ.LJIIJ());
                                    o.LJIIIZ(stackTraceString, "<set-?>");
                                    c43754HFe2.LJIIIZ = stackTraceString;
                                    c43754HFe2.LJFF = -2001;
                                    C43753HFd.LJIIIIZZ(c43754HFe2);
                                    hg7 = null;
                                } else {
                                    C41859Gbn LJJ3 = C60903NvH.LJIIJJI().getPublishService().LJJ();
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append("zip path: ");
                                    LIZ4.append(hga2.LJFF);
                                    LIZ4.append(", awemeId: ");
                                    LIZ4.append(hga2.LIZ);
                                    LIZ4.append(" success");
                                    LJJ3.LIZJ("extract_frame", X1D.LIZIZ(LIZ4));
                                }
                            }
                            try {
                                C10K.LJIIIZ(hgn4).LJFF(new AgS10S1400000_7(this, LIZIZ2, hgn4, uploadAuthKeyConfig, LLJJIJIIJIL, 1)).LJFF(new AgS41S1200000_7(this, LIZIZ2, LLJJIJIIJIL, 4)).LIZLLL(new AgS75S0300000_7(this, hgn4, LIZIZ2, 6)).LIZLLL(new AgS46S0000000_7(0)).LJIJI();
                                C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("extract_frame", "upload extract frame success.");
                            } catch (InterruptedException e2) {
                                C16880lQ.LLLLIIL(e2);
                            }
                            hg7 = null;
                            i = 0;
                        }
                    }
                }
                return;
            }
        } catch (Exception unused) {
        }
        HG2.LIZ(LLJJIJIIJIL, "authkey_error_2");
    }

    public static void LIZ(HGA hga, C43758HFi c43758HFi) {
        String str = hga.LIZ;
        c43758HFi.getClass();
        if (!TextUtils.isEmpty(str)) {
            c43758HFi.getWritableDatabase().delete("frames_table", "aweme_id = ?", new String[]{str});
        }
        ExtractFramesModel extractFramesModel = hga.LJI;
        if (extractFramesModel != null) {
            C39579Fg7.LJIJJLI(extractFramesModel.getExtractFramesDir());
            C39579Fg7.LJIL(hga.LJI.getExtractFramesDir());
        }
        C41859Gbn LIZIZ = C1I0.LIZIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cleanup frame, awemeId: ");
        LIZ.append(hga.LIZ);
        LIZIZ.LIZJ("extract_frame", X1D.LIZIZ(LIZ));
    }

    public static C10K LIZIZ(HG7 hg7, HGA hga) {
        if (hga == null) {
            LIZLLL("model == null");
            return C10K.LJIIIIZZ(new IllegalStateException("the upload model is null"));
        }
        if (!TextUtils.isEmpty(hga.LJFF) && new File(hga.LJFF).exists()) {
            return C10K.LJIIIZ(hga);
        }
        ExtractFramesModel extractFramesModel = hga.LJI;
        if (extractFramesModel == null) {
            return C10K.LJIIIIZZ(new IllegalStateException("the upload frameModel is null"));
        }
        List<FrameItem> allFrames = extractFramesModel.getAllFrames();
        if (allFrames.isEmpty()) {
            return C10K.LJIIIIZZ(new IllegalStateException("the upload frames is empty"));
        }
        ArrayList arrayList = new ArrayList();
        for (FrameItem frameItem : allFrames) {
            if (!C39579Fg7.LIZIZ(frameItem.getPath())) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("extract file does not exist, video id = ");
                LIZ.append(hga.LIZLLL);
                LIZ.append(", dir:");
                LIZ.append(frameItem.getPath());
                LIZLLL(X1D.LIZIZ(LIZ));
            } else if (!arrayList.contains(frameItem.getPath())) {
                arrayList.add(frameItem.getPath());
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[Original Frame] Packing, total ");
        LIZ2.append(arrayList.size());
        LIZ2.append(" files -AwemeId:");
        LIZ2.append(hga.LIZ);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (hg7 != null) {
            StringBuilder LIZJ = b1.LIZJ(LIZIZ, ", source: ");
            LIZJ.append(hg7.LIZ);
            LIZIZ = X1D.LIZIZ(LIZJ);
        }
        H78.LJI(LIZIZ);
        String LIZ3 = C38978FRm.LIZ(extractFramesModel.getExtractFramesDir(), arrayList);
        hga.LJFF = LIZ3;
        if (LIZ3 == null || !C39579Fg7.LIZIZ(LIZ3)) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("upload zipPath is empty video id = ");
            LIZ4.append(hga.LIZLLL);
            LIZ4.append(" , zipPath: ");
            LIZ4.append(hga.LJFF);
            LIZLLL(X1D.LIZIZ(LIZ4));
            return C10K.LJIIIIZZ(new IllegalStateException("the upload zipPath is empty"));
        }
        return C10K.LJIIIZ(hga);
    }

    public final C10K<HGA> LIZJ(HGA hga, UploadAuthKeyConfig uploadAuthKeyConfig) {
        boolean z;
        int i;
        FUX LIZ;
        if (C60903NvH.LJIIJJI().getAccountService() != null && C1DG.LJIIIIZZ()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C10K.LJIIIIZZ(new IllegalStateException("stop task manually for specified case"));
        }
        if (!TextUtils.isEmpty(hga.LJ)) {
            C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("extract_frame", "skip upload");
            return C10K.LJIIIZ(hga);
        }
        n nVar = new n();
        try {
            i = hga.LIZIZ;
        } catch (Throwable th) {
            LJI(hga, 0L, Log.getStackTraceString(th));
            nVar.LIZIZ(new Exception(th));
        }
        try {
            if (i != 150 && i != 152) {
                LIZ = H0I.LIZ(uploadAuthKeyConfig.frameUploadConfig);
                LIZ.LJIIIZ(new H0T(this, LIZ, hga, nVar));
                H75 h75 = new H75();
                h75.LIZJ(uploadAuthKeyConfig.imgConfig);
                LIZ.LJIIJJI(h75.LIZLLL());
                LIZ.LJIIJ(C45039Hlz.LIZLLL());
                LIZ.LIZIZ.setFilePath(1, new String[]{hga.LJFF});
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("[Original Frame] Uploading -AwemeId:");
                LIZ2.append(hga.LIZ);
                H78.LJI(X1D.LIZIZ(LIZ2));
                LIZ.LJIIL();
                return nVar.LIZ;
            }
            StringBuilder LIZ22 = X1D.LIZ();
            LIZ22.append("[Original Frame] Uploading -AwemeId:");
            LIZ22.append(hga.LIZ);
            H78.LJI(X1D.LIZIZ(LIZ22));
            LIZ.LJIIL();
            return nVar.LIZ;
        } catch (Exception e) {
            LIZ.LIZJ();
            LJI(hga, 0L, Log.getStackTraceString(e));
            throw e;
        }
        LIZ = H0I.LIZ(uploadAuthKeyConfig.photoModeRawUploadConfig);
        LIZ.LJIIIZ(new H0T(this, LIZ, hga, nVar));
        H75 h752 = new H75();
        h752.LIZJ(uploadAuthKeyConfig.imgConfig);
        LIZ.LJIIJJI(h752.LIZLLL());
        LIZ.LJIIJ(C45039Hlz.LIZLLL());
        LIZ.LIZIZ.setFilePath(1, new String[]{hga.LJFF});
    }

    public static void LJ(HGA hga, String str, int i) {
        C43754HFe c43754HFe = new C43754HFe();
        c43754HFe.LIZ = hga.LIZ;
        c43754HFe.LJ = Boolean.valueOf(hga.LJIIL);
        c43754HFe.LIZLLL = Boolean.valueOf(hga.LJIIJ);
        c43754HFe.LIZIZ = hga.LJIIIZ;
        c43754HFe.LIZJ = Integer.valueOf(hga.LJIIJJI);
        boolean z = true;
        if (hga.LJIILIIL <= 1) {
            z = false;
        }
        c43754HFe.LJII = Boolean.valueOf(z);
        o.LJIIIZ(str, "<set-?>");
        c43754HFe.LJIIIZ = str;
        c43754HFe.LJI = 0;
        c43754HFe.LJFF = Integer.valueOf(i);
        C43753HFd.LJIIIIZZ(c43754HFe);
    }

    public static void LJI(HGA hga, long j, String str) {
        C43754HFe c43754HFe = new C43754HFe();
        c43754HFe.LIZ = hga.LIZ;
        c43754HFe.LJ = Boolean.valueOf(hga.LJIIL);
        c43754HFe.LIZLLL = Boolean.valueOf(hga.LJIIJ);
        c43754HFe.LIZIZ = hga.LJIIIZ;
        c43754HFe.LIZJ = Integer.valueOf(hga.LJIIJJI);
        boolean z = true;
        if (hga.LJIILIIL <= 1) {
            z = false;
        }
        c43754HFe.LJII = Boolean.valueOf(z);
        c43754HFe.LJIIIIZZ = j;
        c43754HFe.LJI = 0;
        o.LJIIIZ(str, "<set-?>");
        c43754HFe.LJIIIZ = str;
        c43754HFe.LJFF = -3001;
        C43753HFd.LJIIIIZZ(c43754HFe);
    }
}
