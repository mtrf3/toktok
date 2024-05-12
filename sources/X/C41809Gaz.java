package X;

import Y.ACallableS84S0200000_7;
import Y.IDxS131S0200000_7;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.internal.ShareServiceImpl;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.SaveLocalHelper;
import com.ss.android.ugc.aweme.shortvideo.ui.savelocal.WatermarkMetadata;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Gaz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41809Gaz extends AbstractC43455H3r {
    public VideoPublishEditModel LJFF;
    public UploadAuthKeyConfig LJI;
    public HGA LJII;

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.ORIGINAL_FRAME_UPLOAD;
    }

    public final void LJIIJJI(C41811Gb1 c41811Gb1) {
        LJII().LJIIIIZZ();
        H1T h1t = H1T.ORIGINAL_FRAME_UPLOAD;
        String desc = h1t.getDesc();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("original frame upload failed, code=");
        LIZ.append(c41811Gb1.getCode());
        LIZ.append(", message=");
        LIZ.append(c41811Gb1.getErrorMessage());
        C41813Gb3.LIZJ(desc, X1D.LIZIZ(LIZ));
        LJII().LJIIIIZZ();
        String desc2 = h1t.getDesc();
        String stackTraceString = android.util.Log.getStackTraceString(c41811Gb1);
        o.LJIIIIZZ(stackTraceString, "getStackTraceString(cause)");
        C41813Gb3.LJFF(desc2, stackTraceString);
    }

    public final void LJIIL(BaseResponse baseResponse) {
        AVUploadSaveModel saveModel;
        boolean z;
        List<String> imageModeLocalPaths;
        String str;
        LJII().LJIIIIZZ();
        H1T h1t = H1T.ORIGINAL_FRAME_UPLOAD;
        String desc = h1t.getDesc();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("logid: ");
        LIZ.append(baseResponse.extra.logid);
        C41813Gb3.LIZJ(desc, X1D.LIZIZ(LIZ));
        VideoPublishEditModel videoPublishEditModel = this.LJFF;
        String str2 = null;
        if (videoPublishEditModel != null) {
            HGA hga = this.LJII;
            if (hga != null) {
                str2 = hga.LJ;
            }
            if (str2 == null) {
                LJII().LJIIIIZZ();
                C41813Gb3.LIZJ(h1t.getDesc(), "uri is null");
            } else {
                AVUploadSaveModel saveModel2 = videoPublishEditModel.getSaveModel();
                if (saveModel2 == null) {
                    LJII().LJIIIIZZ();
                    C41813Gb3.LIZJ(h1t.getDesc(), "save model is null");
                } else {
                    C60903NvH.LJIIJJI().getPublishService().LJIJI();
                    if (!GSL.LIZLLL(videoPublishEditModel)) {
                        LJII().LJIIIIZZ();
                        C41813Gb3.LIZJ(h1t.getDesc(), "save local disabled");
                    } else {
                        String localTempPath = videoPublishEditModel.getLocalTempPath();
                        StringBuilder LJ = SaveLocalHelper.LJ(str2);
                        String separator = File.separator;
                        o.LJIIIIZZ(separator, "separator");
                        if (!s.LJJLI(LJ, separator)) {
                            LJ.append(separator);
                        }
                        StringBuilder LJ2 = SaveLocalHelper.LJ(str2);
                        LJ2.append(separator);
                        LJ2.append("metadata.json");
                        File file = new File(LJ2.toString());
                        if (file.exists()) {
                            C39579Fg7.LJIL(file.getAbsolutePath());
                        }
                        C39579Fg7.LJ(file.getAbsolutePath(), true);
                        boolean LJJJJL = H7R.LJJJJL(videoPublishEditModel);
                        String creationId = videoPublishEditModel.getCreationId();
                        o.LJIIIIZZ(creationId, "editModel.creationId");
                        String jsonString = GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().LIZ(), new WatermarkMetadata(LJJJJL, creationId));
                        o.LJIIIIZZ(jsonString, "jsonString");
                        C38485F8n.LLLII(file, jsonString);
                        if (H7R.LJJJJL(videoPublishEditModel)) {
                            C41854Gbi.LIZ(videoPublishEditModel);
                            String sb = LJ.toString();
                            o.LJIIIIZZ(sb, "watermarkRootPath.toString()");
                            if (videoPublishEditModel.isSaveLocal()) {
                                boolean isSaveToLocalPathInsteadOfAlbum = videoPublishEditModel.isSaveToLocalPathInsteadOfAlbum();
                                boolean isSilentShare = videoPublishEditModel.isSilentShare();
                                if (videoPublishEditModel.isSaveToAlbum() || !isSaveToLocalPathInsteadOfAlbum) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                AVUploadSaveModel saveModel3 = videoPublishEditModel.getSaveModel();
                                if (saveModel3 != null && (imageModeLocalPaths = saveModel3.getImageModeLocalPaths()) != null && !imageModeLocalPaths.isEmpty() && (!isSilentShare || z)) {
                                    for (String str3 : imageModeLocalPaths) {
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append(sb);
                                        LIZ2.append(new File(str3).getName());
                                        C39579Fg7.LIZLLL(str3, X1D.LIZIZ(LIZ2));
                                    }
                                }
                            }
                        } else {
                            LJ.append(new File(localTempPath).getName());
                            String sb2 = LJ.toString();
                            o.LJIIIIZZ(sb2, "watermarkRootPath.append…empPath).name).toString()");
                            if (G8M.LIZIZ(videoPublishEditModel, ShareServiceImpl.LIZJ().LIZIZ(saveModel2.getSaveType()))) {
                                VEUtils.extractVideo(localTempPath, sb2);
                            } else {
                                C39579Fg7.LIZLLL(localTempPath, sb2);
                            }
                            if (videoPublishEditModel.isSilentShare() && (saveModel = videoPublishEditModel.getSaveModel()) != null) {
                                saveModel.setLocalSilentSharePath(sb2);
                            }
                        }
                        LJII().LJIIIIZZ();
                        C41813Gb3.LIZJ(H1T.ORIGINAL_FRAME_UPLOAD.getDesc(), "save watermark file to private path succeeded, rootPath=" + ((Object) LJ) + ", vframeId=" + str2);
                    }
                }
            }
            HGA hga2 = this.LJII;
            if (hga2 == null || (str = hga2.LJ) == null) {
                str = "";
            }
            C3UH.LIZLLL("start moderation result listening process");
            java.util.Map<String, Integer> map = C3UH.LIZ;
            if (map.containsKey(str)) {
                return;
            }
            C3UH.LIZLLL("add frameUri record");
            map.put(str, 0);
            if (!(!((LinkedHashMap) map).keySet().isEmpty())) {
                return;
            }
            if (C3UH.LIZIZ == null) {
                C3UH.LIZLLL("init timer");
                C45440HsS c45440HsS = new C45440HsS();
                C3UH.LIZIZ = c45440HsS;
                C63882f2 rxAction = C63882f2.LJLIL;
                o.LJIIJ(rxAction, "rxAction");
                AbstractC73672Svk.LJJIJIIJI(5000L, TimeUnit.MILLISECONDS).LIZ(new IDxS131S0200000_7(c45440HsS, rxAction, 0));
            }
            C3UH.LIZLLL("bindVideoAuditPushListener");
            MainServiceImpl.createIMainServicebyMonsterPlugin(false).registerModerationResultPush(C63912f5.LJLIL);
            return;
        }
        o.LJIJI("editModel");
        throw null;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        ExtractFramesModel extractFramesModel;
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43404H1s) {
                if (next != null) {
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof C43403H1r) {
                            if (next2 != null) {
                                this.LJFF = ((C43403H1r) next2).LIZ;
                                Iterator<Object> it3 = args.LIZ.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it3.next();
                                    if (next3 instanceof ERL) {
                                        if (next3 != null) {
                                            VideoCreation videoCreation = ((ERL) next3).LJLIL;
                                            o.LJII(videoCreation, "null cannot be cast to non-null type com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig");
                                            this.LJI = (UploadAuthKeyConfig) videoCreation;
                                            VideoPublishEditModel videoPublishEditModel = this.LJFF;
                                            if (videoPublishEditModel != null) {
                                                ExtractFramesModel extractFramesModel2 = videoPublishEditModel.extractFramesModel;
                                                if (extractFramesModel2 != null && (extractFramesModel = extractFramesModel2.copy(true)) != null) {
                                                    extractFramesModel.setExtractFramesDir(C43073GvN.LIZIZ(C62850Ola.LJ(), new CreativeInfo(null, 0, null, 7, null), EnumC43650HBe.WATERMARK_MODERATION, "frames", 8));
                                                    C78966Uyw.LJJJJLL(new File(extractFramesModel.getExtractFramesDir()));
                                                } else {
                                                    extractFramesModel = null;
                                                }
                                                C10K.LIZJ(new ACallableS84S0200000_7(this, extractFramesModel, 11));
                                                c67996QmO.LJ(null, false);
                                                return;
                                            }
                                            o.LJIJI("editModel");
                                            throw null;
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
    }
}
