package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AIGCInfo;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.GZw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41744GZw extends AbstractC43455H3r {
    public AIGCInfo LJFF;
    public VideoPublishEditModel LJI;

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.UPDATE_AIGC_INFO_BEFORE_SAVE_LOCAL;
    }

    public static void LJIIJJI(int i, long j) {
        H78.LIZ("AIGCManager -> mobUpdateMetadata");
        long currentTimeMillis = System.currentTimeMillis() - j;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(i, "is_video");
        c145995oB.LIZIZ(currentTimeMillis, "update_duration");
        FMX.LJIIL("update_metadata", c145995oB.LIZ);
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        List<String> imageModeLocalPaths;
        o.LJIIIZ(args, "args");
        if (!C40980G6m.LIZ()) {
            C60903NvH.LJIIJJI().LJJIIJ();
            c67996QmO.LJ(null, true);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    VideoPublishEditModel videoPublishEditModel = ((C43403H1r) next).LIZ;
                    this.LJI = videoPublishEditModel;
                    if (videoPublishEditModel != null) {
                        this.LJFF = videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo;
                        if (H7R.LJJJJL(videoPublishEditModel)) {
                            VideoPublishEditModel videoPublishEditModel2 = this.LJI;
                            if (videoPublishEditModel2 != null) {
                                AVUploadSaveModel saveModel = videoPublishEditModel2.getSaveModel();
                                if (saveModel != null && (imageModeLocalPaths = saveModel.getImageModeLocalPaths()) != null) {
                                    int i = 0;
                                    for (String str : imageModeLocalPaths) {
                                        int i2 = i + 1;
                                        if (i >= 0) {
                                            String str2 = str;
                                            VideoPublishEditModel videoPublishEditModel3 = this.LJI;
                                            if (videoPublishEditModel3 != null) {
                                                C43134GwM.LIZJ(((SingleImageData) ListProtector.get(videoPublishEditModel3.getImageAlbumData().getImageList(), i)).getImageAIGCType(), str2);
                                                i = i2;
                                            } else {
                                                o.LJIJI("editModel");
                                                throw null;
                                            }
                                        } else {
                                            C47261Igj.LJJJJJ();
                                            throw null;
                                        }
                                    }
                                }
                                LJIIJJI(0, currentTimeMillis);
                                c67996QmO.LJ(null, false);
                                return;
                            }
                            o.LJIJI("editModel");
                            throw null;
                        }
                        AIGCInfo aIGCInfo = this.LJFF;
                        if (aIGCInfo != null) {
                            int i3 = aIGCInfo.AIGCSwitchStatusWhenCompile;
                            int i4 = aIGCInfo.AIGCLabelType;
                            if (i3 != i4 && i4 == 2) {
                                VideoPublishEditModel videoPublishEditModel4 = this.LJI;
                                if (videoPublishEditModel4 != null) {
                                    int i5 = videoPublishEditModel4.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType;
                                    InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
                                    VideoPublishEditModel videoPublishEditModel5 = this.LJI;
                                    if (videoPublishEditModel5 != null) {
                                        CreativeInfo creativeInfo = videoPublishEditModel5.creativeInfo;
                                        o.LJIIIIZZ(creativeInfo, "editModel.creativeInfo");
                                        String LJIIIZ = LIZIZ.LJIIIZ(creativeInfo);
                                        VideoPublishEditModel videoPublishEditModel6 = this.LJI;
                                        if (videoPublishEditModel6 != null) {
                                            String localTempPath = videoPublishEditModel6.getLocalTempPath();
                                            if (VEUtils.setMetaData(localTempPath, LJIIIZ, C51029K0z.LJJIIZI(new OSZ("aigc_info", new JSONObject().put("aigc_label_type", i5).toString()))) > 0) {
                                                StringBuilder LIZ = X1D.LIZ();
                                                LIZ.append("AIGCManager -> setMetadata() -> aigcInfo = ");
                                                LIZ.append(new JSONObject().put("aigc_label_type", i5));
                                                H78.LIZ(X1D.LIZIZ(LIZ));
                                                VideoPublishEditModel videoPublishEditModel7 = this.LJI;
                                                if (videoPublishEditModel7 != null) {
                                                    AVUploadSaveModel saveModel2 = videoPublishEditModel7.getSaveModel();
                                                    if (saveModel2 != null) {
                                                        saveModel2.setLocalTempPath(LJIIIZ);
                                                    }
                                                    C16880lQ.LLLZZIL(new File(localTempPath));
                                                } else {
                                                    o.LJIJI("editModel");
                                                    throw null;
                                                }
                                            }
                                            LJIIJJI(1, currentTimeMillis);
                                            c67996QmO.LJ(null, false);
                                            return;
                                        }
                                        o.LJIJI("editModel");
                                        throw null;
                                    }
                                    o.LJIJI("editModel");
                                    throw null;
                                }
                                o.LJIJI("editModel");
                                throw null;
                            }
                        }
                        c67996QmO.LJ(null, false);
                        return;
                    }
                    o.LJIJI("editModel");
                    throw null;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
