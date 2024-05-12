package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GU7 {
    public static boolean LIZIZ;
    public static GV6 LIZJ;
    public static GU9 LIZLLL;
    public static final GU7 LIZ = new GU7();
    public static final MutableLiveData<Boolean> LJ = new MutableLiveData<>(Boolean.FALSE);

    public static final void LIZ(boolean z) {
        String publishId;
        GUU guu;
        GUQ guq;
        C41594GUc c41594GUc;
        VideoPublishEditModel videoPublishEditModel;
        long j;
        GU9 gu9 = LIZLLL;
        GU9 gu92 = null;
        if (gu9 == null || (publishId = gu9.LIZIZ) == null || publishId.length() == 0) {
            return;
        }
        o.LJIIIZ(publishId, "publishId");
        GUJ guj = GUH.LIZIZ;
        synchronized (guj) {
            guu = guj.LIZIZ.get(publishId);
            if (guu == null) {
                GUJ.LJ(null, publishId);
            } else if (guu.LIZLLL instanceof GOS) {
                GUJ.LJ(null, publishId);
            }
            guu = null;
        }
        if (guu != null && (guq = guu.LJI) != null && (c41594GUc = guq.LJLLJ) != null && c41594GUc.LIZ()) {
            if (guq != null) {
                C41574GTi c41574GTi = new C41574GTi();
                c41574GTi.LIZ = "cancel_edit_page_save";
                guq.LIZIZ(c41574GTi.LIZ());
            }
            GU9 gu93 = LIZLLL;
            if (gu93 != null) {
                videoPublishEditModel = gu93.LJ;
            } else {
                videoPublishEditModel = null;
            }
            if (gu93 != null) {
                j = gu93.LJIIJ;
            } else {
                j = 0;
            }
            LJFF(videoPublishEditModel, "cancel", j, false);
        }
        LJ.postValue(Boolean.FALSE);
        GU9 gu94 = LIZLLL;
        if (gu94 != null) {
            gu92 = GU9.LIZ(gu94, null, false, null, z, null, 1983);
        }
        LIZLLL = gu92;
    }

    public static Object LIZJ(InterfaceC67352kd interfaceC67352kd) {
        Object LJFF;
        AwemeDraft LJ2 = C1DG.LJFF().LJ(new C41363GLf(new CreativeInfo("SaveLocalDraftID", 0, null, 6, null), false));
        if (LJ2 != null && (LJFF = C60903NvH.LJIIJJI().LJJJI().LJFF().LJFF(new GPP(LJ2, new C41360GLc("save local", "deleteLegacySaveToLocalDraft"), null, null, 60), interfaceC67352kd)) == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJFF;
        }
        return C76800UCe.LIZ;
    }

    public static void LIZLLL(String msg) {
        o.LJIIIZ(msg, "msg");
        C60903NvH.LJIIJJI().getPublishService().LJJ().LIZJ("edit_save_local_task", msg);
    }

    public static void LJI(VideoPublishEditModel videoPublishEditModel) {
        GU9 gu9 = null;
        if (LIZIZ) {
            LIZLLL("compiling so waiting");
            GU9 gu92 = LIZLLL;
            if (gu92 != null) {
                gu9 = GU9.LIZ(gu92, null, false, null, true, null, 1983);
            }
            LIZLLL = gu9;
            return;
        }
        videoPublishEditModel.setSaveModel(C60903NvH.LJIIJJI().getPublishService().LJIJI().LIZIZ(videoPublishEditModel, 1, true, new C44432HcC(), true));
        AVUploadSaveModel saveModel = videoPublishEditModel.getSaveModel();
        int i = 0;
        if (saveModel != null) {
            saveModel.setWaterMark(false);
        }
        AVUploadSaveModel saveModel2 = videoPublishEditModel.getSaveModel();
        if (saveModel2 != null) {
            saveModel2.setSaveToAlbum(true);
        }
        AVUploadSaveModel saveModel3 = videoPublishEditModel.getSaveModel();
        if (saveModel3 != null) {
            saveModel3.setSaveWithCaption(true);
        }
        C43587H8t.LIZJ(H83.LIZ(videoPublishEditModel), new C44224HXg(videoPublishEditModel), EnumC43590H8w.EDIT, EnumC43590H8w.SEND_REQUEST);
        Bundle bundle = new Bundle();
        if (H7R.LJJJJL(videoPublishEditModel)) {
            i = 11;
        }
        bundle.putInt("video_type", i);
        bundle.putSerializable("extra_video_publish_args", videoPublishEditModel);
        bundle.putString("shoot_way", videoPublishEditModel.mShootWay);
        bundle.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle.putInt("publish_permission", -1);
        if (H7R.LJJL(videoPublishEditModel)) {
            bundle.putBoolean("shoutouts_video_fast_publish", true);
        }
        bundle.putInt("pre_publish_type", 2);
        bundle.putBoolean("isEditSave", true);
        LIZLLL("start publisher");
        PublishModel LJFF = C43001GuD.LJFF(bundle);
        AqS189S0100000_7 aqS189S0100000_7 = new AqS189S0100000_7(videoPublishEditModel, 78);
        GUQ LJIIIZ = GUH.LJIIIZ(LJFF);
        LJIIIZ.LIZ(new GAB(null, aqS189S0100000_7));
        GUH.LIZIZ.LIZ(LJIIIZ.LJLJJL);
        GUH.LIZLLL.execute(LJIIIZ);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PublishScheduler | startNewPublish creationId:");
        LIZ2.append(LJFF.creationId);
        LIZ2.append(" publishId:");
        LIZ2.append(LJIIIZ.LJLJJL.LIZIZ);
        H7B.LIZ(X1D.LIZIZ(LIZ2));
        String str = LJIIIZ.LJLJJL.LIZIZ;
        GU9 gu93 = LIZLLL;
        if (gu93 != null) {
            gu9 = GU9.LIZ(gu93, str, false, null, false, null, 2045);
        }
        LIZLLL = gu9;
    }

    public static boolean LJIIIIZZ(VideoPublishEditModel model) {
        GU9 gu9;
        o.LJIIIZ(model, "model");
        GU9 gu92 = LIZLLL;
        String str = null;
        if (gu92 != null) {
            str = gu92.LIZJ;
        }
        if (!o.LJ(str, model.creativeModel.editSaveLocalModel.flowId) || (gu9 = LIZLLL) == null || gu9.LIZLLL || gu9.LJII == null || gu9 == null || gu9.LJIIIIZZ != H7R.LJJJJL(model) || model.isEnterFromDM() || model.isSaveLocalWithWaterMark() || C00F.LIZ(31744, 0, "studio_reuse_save_local_merge_file", true) != 1) {
            return false;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJI("creation_id", model.getCreationId());
        c188727au.LJI("shoot_way", model.mShootWay);
        c188727au.LJI("content_type", H7R.LJIIIZ(model));
        c188727au.LJI("content_source", H7R.LJIIIIZZ(model));
        FMX.LJIIL("merge_reuse_save_local_file", c188727au.LIZ);
        return true;
    }

    public static void LIZIZ(int i, int i2) {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity != null) {
            C24540xm.LIZ(i, topActivity, i2);
        }
    }

    public static void LJ(int i, VideoPublishEditModel videoPublishEditModel) {
        C188727au c188727au = new C188727au();
        c188727au.LJI("creation_id", videoPublishEditModel.getCreationId());
        c188727au.LJI("shoot_way", videoPublishEditModel.mShootWay);
        c188727au.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        c188727au.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        c188727au.LIZLLL(H7R.LJJJJL(videoPublishEditModel) ? 1 : 0, "is_image_album");
        c188727au.LIZLLL(i, "error_code");
        FMX.LJIIL("click_save_local_error", c188727au.LIZ);
    }

    public static void LJFF(VideoPublishEditModel videoPublishEditModel, String str, long j, boolean z) {
        String creationId;
        if (videoPublishEditModel == null) {
            return;
        }
        if (o.LJ(videoPublishEditModel.getCreationId(), "SaveLocalDraftID")) {
            GU9 gu9 = LIZLLL;
            if (gu9 != null) {
                creationId = gu9.LIZ;
            } else {
                creationId = null;
            }
        } else {
            creationId = videoPublishEditModel.getCreationId();
        }
        C188727au LIZ2 = CK3.LIZ("creation_id", creationId);
        LIZ2.LJI("shoot_way", videoPublishEditModel.mShootWay);
        LIZ2.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        LIZ2.LJI("content_source", H7R.LJIIIIZZ(videoPublishEditModel));
        LIZ2.LIZLLL(H7R.LJJJJL(videoPublishEditModel) ? 1 : 0, "is_image_album");
        LIZ2.LIZLLL(z ? 1 : 0, "is_copy_draft");
        LIZ2.LJI("event", str);
        LIZ2.LJ(System.currentTimeMillis() - j, "duration");
        FMX.LJIIL("save_local_stage", LIZ2.LIZ);
    }

    public static void LJII(VideoPublishEditModel videoPublishEditModel, InterfaceC153045zY interfaceC153045zY, boolean z, boolean z2, int i) {
        boolean z3 = z2;
        InterfaceC153045zY interfaceC153045zY2 = interfaceC153045zY;
        boolean z4 = z;
        if ((i & 2) != 0) {
            interfaceC153045zY2 = null;
        }
        if ((i & 4) != 0) {
            z4 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        LJFF(videoPublishEditModel, "start", System.currentTimeMillis(), false);
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new GU8(videoPublishEditModel, z3, interfaceC153045zY2, z4, null), 3);
    }
}
