package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.wavepublish.utils.UploadResumeInfo;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Gwj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43157Gwj {
    public static boolean LIZJ;
    public static final Object LIZ = new Object();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C43158Gwk.LJLIL);
    public static final HashMap<String, UploadResumeInfo> LIZLLL = new HashMap<>();

    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!C43161Gwn.LIZ()) {
            return;
        }
        if (!LJIIIZ(videoPublishEditModel, true, true)) {
            videoPublishEditModel.setCompileFinished(false);
            videoPublishEditModel.setSynthesisFileHash("");
            return;
        }
        String draftPrimaryKey = videoPublishEditModel.getDraftPrimaryKey();
        o.LJIIIIZZ(draftPrimaryKey, "editModel.draftPrimaryKey");
        UploadResumeInfo LIZLLL2 = LIZLLL(draftPrimaryKey, true);
        if (LIZLLL2 != null) {
            videoPublishEditModel.setCompileFinished(LIZLLL2.isCompileFinished());
            videoPublishEditModel.mOutputFile = LIZLLL2.getOutputFilePath();
            videoPublishEditModel.mParallelUploadOutputFile = LIZLLL2.getSynthesisFilePath();
            videoPublishEditModel.setSynthesisFileHash(LIZLLL2.getSynthesisFileHash());
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("convertToEditModel, output: ");
        LIZ2.append(videoPublishEditModel.mOutputFile);
        LIZ2.append(", synthesis: ");
        LIZ2.append(videoPublishEditModel.getSynthesisFilePath());
        String msg = X1D.LIZIZ(LIZ2);
        o.LJIIIZ(msg, "msg");
    }

    public static void LIZIZ(String str) {
        if (str.length() == 0) {
            return;
        }
        synchronized (LIZ) {
            ((Keva) LIZIZ.getValue()).erase(str);
            LIZLLL.remove(str);
        }
    }

    public static String LJ(VideoPublishEditModel videoPublishEditModel) {
        String draftPrimaryKey = videoPublishEditModel.getDraftPrimaryKey();
        if (draftPrimaryKey == null) {
            return videoPublishEditModel.getCreationId();
        }
        return draftPrimaryKey;
    }

    public static void LJFF(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        if (!C43161Gwn.LIZ()) {
            return;
        }
        if (!C44687HgJ.LIZIZ(editModel.getSynthesisFilePath()) || !C44687HgJ.LIZIZ(editModel.getOutputFile())) {
            editModel.setCompileFinished(false);
            editModel.setSynthesisFileHash("");
            String LJ = LJ(editModel);
            o.LJIIIIZZ(LJ, "editModel.infoKey");
            LIZIZ(LJ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("compile failed, output: ");
            LIZ2.append(editModel.mOutputFile);
            LIZ2.append(", synthesis: ");
            LIZ2.append(editModel.getSynthesisFilePath());
            String msg = X1D.LIZIZ(LIZ2);
            o.LJIIIZ(msg, "msg");
            return;
        }
        editModel.setCompileFinished(true);
        editModel.setSynthesisFileHash(C173376rF.LJFF(new File(editModel.getSynthesisFilePath())));
        boolean isCompileFinished = editModel.isCompileFinished();
        String outputFile = editModel.getOutputFile();
        o.LJIIIIZZ(outputFile, "editModel.outputFile");
        String synthesisFilePath = editModel.getSynthesisFilePath();
        o.LJIIIIZZ(synthesisFilePath, "editModel.synthesisFilePath");
        String synthesisFileHash = editModel.getSynthesisFileHash();
        o.LJIIIIZZ(synthesisFileHash, "editModel.synthesisFileHash");
        UploadResumeInfo uploadResumeInfo = new UploadResumeInfo(isCompileFinished, outputFile, synthesisFilePath, synthesisFileHash);
        String LJ2 = LJ(editModel);
        o.LJIIIIZZ(LJ2, "editModel.infoKey");
        if (LJ2.length() != 0) {
            String LJLILLLLZI = C78880UxY.LJLILLLLZI(uploadResumeInfo);
            synchronized (LIZ) {
                ((Keva) LIZIZ.getValue()).storeString(LJ2, LJLILLLLZI);
                LIZLLL.put(LJ2, uploadResumeInfo);
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("compile done, output: ");
        LIZ3.append(editModel.mOutputFile);
        LIZ3.append(", synthesis: ");
        LIZ3.append(editModel.getSynthesisFilePath());
        String msg2 = X1D.LIZIZ(LIZ3);
        o.LJIIIZ(msg2, "msg");
    }

    public static void LJI(VideoPublishEditModel editModel) {
        o.LJIIIZ(editModel, "editModel");
        if (!C43161Gwn.LIZ()) {
            return;
        }
        editModel.setCompileFinished(false);
        editModel.setSynthesisFileHash("");
        String LJ = LJ(editModel);
        o.LJIIIIZZ(LJ, "editModel.infoKey");
        LIZIZ(LJ);
        if (LIZJ) {
            return;
        }
        LIZJ = true;
        long currentTimeMillis = System.currentTimeMillis();
        java.util.Map<String, ?> all = ((Keva) LIZIZ.getValue()).getAll();
        o.LJIIIIZZ(all, "keva.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            o.LJIIIIZZ(key, "entry.key");
            UploadResumeInfo LIZLLL2 = LIZLLL(key, true);
            if (LIZLLL2 != null) {
                if (!LIZLLL2.isCompileFinished()) {
                    String key2 = entry.getKey();
                    o.LJIIIIZZ(key2, "entry.key");
                    LIZJ(key2, LIZLLL2);
                } else if (!C44687HgJ.LIZIZ(LIZLLL2.getOutputFilePath()) || !C44687HgJ.LIZIZ(LIZLLL2.getSynthesisFilePath())) {
                    String key3 = entry.getKey();
                    o.LJIIIIZZ(key3, "entry.key");
                    LIZJ(key3, LIZLLL2);
                } else if (currentTimeMillis - new File(LIZLLL2.getSynthesisFilePath()).lastModified() > ((Number) C43159Gwl.LIZ.getValue()).longValue()) {
                    String key4 = entry.getKey();
                    o.LJIIIIZZ(key4, "entry.key");
                    LIZJ(key4, LIZLLL2);
                }
            }
        }
    }

    public static void LJIIIIZZ(String str) {
        if (!C43161Gwn.LIZ()) {
            return;
        }
        if (str.length() != 0) {
            String str2 = C41658GWo.LIZLLL().LJI;
            if (str2 == null) {
                str2 = "";
            }
            if (!o.LJ(str, str2)) {
                LIZJ(str, null);
                return;
            }
        }
        C78983UzD.LJIILL("can't delete publish file");
    }

    public static void LIZJ(String str, UploadResumeInfo uploadResumeInfo) {
        if (!C43161Gwn.LIZ()) {
            return;
        }
        if (uploadResumeInfo == null && (uploadResumeInfo = LIZLLL(str, false)) == null) {
            return;
        }
        LIZIZ(str);
        C44687HgJ.LJIILJJIL(uploadResumeInfo.getSynthesisFilePath());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.3C4, java.lang.Object] */
    public static UploadResumeInfo LIZLLL(String str, boolean z) {
        boolean z2;
        UploadResumeInfo uploadResumeInfo;
        if (str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        UploadResumeInfo uploadResumeInfo2 = null;
        if (z2) {
            return null;
        }
        synchronized (LIZ) {
            if (z) {
                HashMap<String, UploadResumeInfo> hashMap = LIZLLL;
                if (hashMap.containsKey(str)) {
                    return hashMap.get(str);
                }
            }
            String string = ((Keva) LIZIZ.getValue()).getString(str, null);
            if (string != null) {
                try {
                    UploadResumeInfo uploadResumeInfo3 = (UploadResumeInfo) C78880UxY.LJJIIZI(string, UploadResumeInfo.class);
                    C3C5.m7constructorimpl(uploadResumeInfo3);
                    uploadResumeInfo = uploadResumeInfo3;
                } catch (Throwable th) {
                    ?? LIZ2 = C141335gf.LIZ(th);
                    C3C5.m7constructorimpl(LIZ2);
                    uploadResumeInfo = LIZ2;
                }
                if (!C3C5.m12isFailureimpl(uploadResumeInfo)) {
                    uploadResumeInfo2 = uploadResumeInfo;
                }
                uploadResumeInfo2 = uploadResumeInfo2;
                if (uploadResumeInfo2 != null) {
                    LIZLLL.put(str, uploadResumeInfo2);
                    return uploadResumeInfo2;
                }
            }
            LIZLLL.remove(str);
            return uploadResumeInfo2;
        }
    }

    public static void LJII(VideoPublishEditModel editModel, boolean z) {
        o.LJIIIZ(editModel, "editModel");
        if (!C43161Gwn.LIZ()) {
            return;
        }
        if (z) {
            String LJ = LJ(editModel);
            o.LJIIIIZZ(LJ, "editModel.infoKey");
            LIZJ(LJ, null);
        } else {
            String LJ2 = LJ(editModel);
            o.LJIIIIZZ(LJ2, "editModel.infoKey");
            LIZIZ(LJ2);
        }
    }

    public static boolean LJIIIZ(VideoPublishEditModel editModel, boolean z, boolean z2) {
        UploadResumeInfo LIZLLL2;
        o.LJIIIZ(editModel, "editModel");
        if (!C43161Gwn.LIZ()) {
            return false;
        }
        String infoKey = LJ(editModel);
        o.LJIIIIZZ(infoKey, "infoKey");
        if (infoKey.length() == 0 || !z || (LIZLLL2 = LIZLLL(infoKey, false)) == null) {
            return false;
        }
        if (!z2 && (editModel.isCompileFinished() != LIZLLL2.isCompileFinished() || !o.LJ(LIZLLL2.getSynthesisFilePath(), editModel.getSynthesisFilePath()) || !o.LJ(LIZLLL2.getOutputFilePath(), editModel.getOutputFile()))) {
            LIZIZ(infoKey);
            return false;
        }
        if (!LIZLLL2.isCompileFinished() || !C44687HgJ.LIZIZ(LIZLLL2.getOutputFilePath()) || !C44687HgJ.LIZIZ(LIZLLL2.getSynthesisFilePath())) {
            LIZIZ(infoKey);
            return false;
        }
        if (o.LJ(C173376rF.LJFF(new File(LIZLLL2.getSynthesisFilePath())), LIZLLL2.getSynthesisFileHash())) {
            return true;
        }
        LIZIZ(infoKey);
        return false;
    }
}
