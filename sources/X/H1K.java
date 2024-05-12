package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.uploader.retrofit.UploaderRetrofitService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H1K extends AbstractC43455H3r {
    public C67996QmO LJFF;
    public VideoPublishEditModel LJI;
    public long LJII;
    public String LJIIIIZZ;
    public C43859HJf LJIIIZ;

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.PUGC_TEMPLATE_UPLOAD;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        boolean z;
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    this.LJI = ((C43403H1r) next).LIZ;
                    this.LJFF = c67996QmO;
                    this.LJII = System.currentTimeMillis();
                    VideoPublishEditModel videoPublishEditModel = this.LJI;
                    if (videoPublishEditModel != null) {
                        this.LJIIIIZZ = videoPublishEditModel.getCreationId();
                        VideoPublishEditModel videoPublishEditModel2 = this.LJI;
                        if (videoPublishEditModel2 != null) {
                            if (videoPublishEditModel2.creativeModel.pugcTemplateData.canPostTemplate && videoPublishEditModel2.ttStoryUploadModel == null) {
                                long currentTimeMillis = System.currentTimeMillis();
                                VideoPublishEditModel videoPublishEditModel3 = this.LJI;
                                if (videoPublishEditModel3 != null) {
                                    String str = videoPublishEditModel3.creativeModel.pugcTemplateData.pugcTemplateZipUrl;
                                    if (str == null || str.length() == 0) {
                                        VideoPublishEditModel videoPublishEditModel4 = this.LJI;
                                        if (videoPublishEditModel4 != null) {
                                            NLEModel LIZ = C132435Hr.LIZ(videoPublishEditModel4);
                                            List<String> list = videoPublishEditModel4.creativeModel.pugcTemplateData.fixedSlots;
                                            if (G6Z.LIZ() == 2 || G6Z.LIZ() == 1) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            str = C132435Hr.LIZIZ(LIZ, videoPublishEditModel4, list, z);
                                            videoPublishEditModel4.creativeModel.pugcTemplateData.pugcTemplateZipUrl = str;
                                        } else {
                                            o.LJIJI("editModel");
                                            throw null;
                                        }
                                    }
                                    if (str.length() == 0) {
                                        LJIIL(new H1P("build_zip_failed"), 10100);
                                        return;
                                    }
                                    long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                                    float LIZ2 = ((float) C78496UrM.LIZ(str)) / 1024.0f;
                                    C145995oB LIZ3 = UFE.LIZ(currentTimeMillis2, "duration");
                                    LIZ3.LIZJ(Float.valueOf(LIZ2), "size");
                                    LIZ3.LJI("creation_id", this.LJIIIIZZ);
                                    FMX.LJIIL("pugc_template_zip_build_event", LIZ3.LIZ);
                                    VideoPublishEditModel videoPublishEditModel5 = this.LJI;
                                    if (videoPublishEditModel5 != null) {
                                        String creationId = videoPublishEditModel5.getCreationId();
                                        o.LJIIIIZZ(creationId, "editModel.creationId");
                                        System.currentTimeMillis();
                                        LJII().LIZIZ();
                                        C76L<UploadAuthKeyConfig> ugcTemplateUploadAuthKeyConfig = ((UploaderRetrofitService) V0N.LJIILIIL(UploaderRetrofitService.class)).getUgcTemplateUploadAuthKeyConfig(creationId, "pugc");
                                        H1L h1l = new H1L(this, str);
                                        ugcTemplateUploadAuthKeyConfig.LJFF(new RunnableC65751PrH(ugcTemplateUploadAuthKeyConfig, h1l), EnumC169566l6.LJLIL);
                                        return;
                                    }
                                    o.LJIJI("editModel");
                                    throw null;
                                }
                                o.LJIJI("editModel");
                                throw null;
                            }
                            C2U6 c2u6 = new C2U6(null);
                            C67996QmO c67996QmO2 = this.LJFF;
                            if (c67996QmO2 != null) {
                                c67996QmO2.LJ(c2u6, true);
                                return;
                            } else {
                                o.LJIJI("nodeCallback");
                                throw null;
                            }
                        }
                        o.LJIJI("editModel");
                        throw null;
                    }
                    o.LJIJI("editModel");
                    throw null;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    public final void LJIIL(H1P h1p, int i) {
        C67996QmO c67996QmO = this.LJFF;
        if (c67996QmO != null) {
            c67996QmO.LIZLLL(i, h1p);
        } else {
            o.LJIJI("nodeCallback");
            throw null;
        }
    }

    public final void LJIIJJI(long j, Long l, boolean z) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(z ? 1 : 0, "status");
        c145995oB.LIZJ(l, "error_code");
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LJI("creation_id", this.LJIIIIZZ);
        FMX.LJIIL("pugc_template_upload_event", c145995oB.LIZ);
    }
}
