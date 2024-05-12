package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;

/* loaded from: classes8.dex */
public final class GTY<T> implements InterfaceC64592gB {
    public final /* synthetic */ WM7 LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ VideoPublishEditModel LJLJI;
    public final /* synthetic */ InterfaceC153045zY LJLJJI;

    public GTY(AbstractC42651GoZ abstractC42651GoZ, Activity activity, VideoPublishEditModel videoPublishEditModel, InterfaceC153045zY interfaceC153045zY) {
        this.LJLIL = abstractC42651GoZ;
        this.LJLILLLLZI = activity;
        this.LJLJI = videoPublishEditModel;
        this.LJLJJI = interfaceC153045zY;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        AVUploadSaveModel LIZIZ;
        int i;
        boolean z;
        boolean z2;
        C133765Mu c133765Mu;
        WM7 wm7 = this.LJLIL;
        Activity activity = this.LJLILLLLZI;
        VideoPublishEditModel videoPublishEditModel = this.LJLJI;
        InterfaceC153045zY interfaceC153045zY = this.LJLJJI;
        int i2 = 0;
        if (!C1B8.LIZJ()) {
            C41571GTf.LJI("not log in");
            return;
        }
        if (interfaceC153045zY == null) {
            C41571GTf.LJI("null_start_veeditor");
            return;
        }
        if (H7R.LJJJJL(videoPublishEditModel)) {
            C41571GTf.LJI("image_mode");
            return;
        }
        if (H7R.LJJLIIIJJIZ(videoPublishEditModel)) {
            C41571GTf.LJI("text_mode");
            return;
        }
        if (videoPublishEditModel.creativeModel.forwardEditPublishData != null) {
            C41571GTf.LJI("edit quit forward publish task");
            return;
        }
        int LIZ = C00F.LIZ(31744, -1, "edit_page_pre_publish_min_file_dur", true);
        if (LIZ > 0 && interfaceC153045zY.getDuration() < LIZ) {
            C41571GTf.LJI("short_file_dur");
            return;
        }
        if (activity == null || activity.isFinishing()) {
            C41571GTf.LJI("null_start_activity");
            return;
        }
        if (GUH.LJIIZILJ() != 0) {
            C41571GTf.LJI("in_publish");
            return;
        }
        String LIZLLL = C41571GTf.LIZLLL(interfaceC153045zY, videoPublishEditModel);
        if (LIZLLL != null) {
            C41571GTf.LJI(LIZLLL);
            return;
        }
        if (C41571GTf.LJ(videoPublishEditModel)) {
            C41571GTf.LIZIZ(videoPublishEditModel, "double_start_edit_pre");
            C41571GTf.LJI("double_start_edit_pre");
            return;
        }
        if (!C41571GTf.LJ) {
            C41571GTf.LJI("cancel_before_start");
            return;
        }
        C60903NvH.LJIIJJI().getPublishService().LJIJI();
        int LIZJ = GSL.LIZJ(activity, videoPublishEditModel);
        if (((Boolean) C41567GTb.LIZ.getValue()).booleanValue()) {
            if (LIZJ != 2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("not_pre_publish_and_type_is_");
                LIZ2.append(LIZJ);
                C41571GTf.LJI(X1D.LIZIZ(LIZ2));
                return;
            }
        } else if (LIZJ == -1 || LIZJ == 0) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("not_pre_publish_and_type_is_");
            LIZ3.append(LIZJ);
            C41571GTf.LJI(X1D.LIZIZ(LIZ3));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C41571GTf.LJFF("TryStart Start");
        NLENode nLENode = null;
        if ((interfaceC153045zY instanceof C133765Mu) && (c133765Mu = (C133765Mu) interfaceC153045zY) != null) {
            nLENode = c133765Mu.LJFF().deepClone();
        }
        C41571GTf.LIZJ = nLENode;
        LIZIZ = C60903NvH.LJIIJJI().getPublishService().LJIJI().LIZIZ(videoPublishEditModel, 0, true, new O6R(), false);
        videoPublishEditModel.setSaveModel(LIZIZ);
        C43587H8t.LIZJ(H83.LIZ(videoPublishEditModel), new C44224HXg(videoPublishEditModel), EnumC43590H8w.EDIT, EnumC43590H8w.SEND_REQUEST);
        Bundle bundle = new Bundle();
        if (H7R.LJJJJL(videoPublishEditModel)) {
            i = 11;
        } else {
            i = 0;
        }
        Bundle bundle2 = wm7.mArguments;
        if (bundle2 != null) {
            z = bundle2.getBoolean("extra_enter_from_live", false);
        } else {
            z = false;
        }
        if (bundle2 != null) {
            z2 = bundle2.getBoolean("enter_record_from_other_platform", false);
        } else {
            z2 = false;
        }
        if (bundle2 != null) {
            i2 = bundle2.getInt("extra_stick_point_type", 0);
        }
        bundle.putInt("video_type", i);
        bundle.putSerializable("extra_video_publish_args", videoPublishEditModel);
        bundle.putString("shoot_way", videoPublishEditModel.mShootWay);
        bundle.putInt("extra_stick_point_type", i2);
        bundle.putBoolean("enter_record_from_other_platform", z2);
        bundle.putBoolean("extra_enter_from_live", z);
        bundle.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle.putInt("publish_permission", -1);
        bundle.putBoolean("isEditPrePublish", true);
        if (H7R.LJJL(videoPublishEditModel)) {
            bundle.putBoolean("shoutouts_video_fast_publish", true);
        }
        Publish.PublishBundle = bundle;
        bundle.putInt("pre_publish_type", LIZJ);
        if (GUH.LJIIZILJ() == 0) {
            C41571GTf.LJFF("PublishParallel start pre publish task");
            C41571GTf.LIZJ(activity, bundle, videoPublishEditModel);
        } else if (GUW.LIZIZ() || C41637GVt.LIZ()) {
            C41571GTf.LJFF("PublishParallel resume previous paused task, wait for finish");
            GUH.LJJIFFI();
            GUH.LJFF = new GTZ(activity, LIZJ, interfaceC153045zY, bundle, videoPublishEditModel);
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        C41571GTf.LJIIIZ("success", String.valueOf(currentTimeMillis2));
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("tryStartPrePublish end dur:");
        LIZ4.append(currentTimeMillis2);
        C41571GTf.LJFF(X1D.LIZIZ(LIZ4));
    }
}
