package Y;

import X.C145995oB;
import X.C40211FqJ;
import X.C46006I3u;
import X.C76800UCe;
import X.C78934UyQ;
import X.C82380WUu;
import X.FMX;
import X.GJT;
import X.GXR;
import X.HC8;
import X.HZ2;
import X.I3X;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import android.app.Activity;
import android.content.DialogInterface;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.app.PushCameraBlurActivity;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.IDLCallbackS16S0200000_7;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDCListenerS160S0100000_7 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void onClick$4(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        ((InterfaceC88471Ynr) iDCListenerS160S0100000_7.l0).invoke(dialogInterface, Integer.valueOf(i));
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                return;
            case 1:
                onClick$1(this, dialogInterface, i);
                return;
            case 2:
                onClick$2(this, dialogInterface, i);
                return;
            case 3:
                onClick$3(this, dialogInterface, i);
                return;
            case 4:
                onClick$4(this, dialogInterface, i);
                return;
            case 5:
                onClick$5(this, dialogInterface, i);
                return;
            case 6:
                onClick$6(this, dialogInterface, i);
                return;
            case 7:
                onClick$7(this, dialogInterface, i);
                return;
            case 8:
                onClick$8(this, dialogInterface, i);
                return;
            case 9:
                onClick$9(this, dialogInterface, i);
                return;
            case 10:
                onClick$10(this, dialogInterface, i);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, dialogInterface, i);
                return;
            case 12:
                onClick$12(this, dialogInterface, i);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, dialogInterface, i);
                return;
            case 14:
                onClick$14(this, dialogInterface, i);
                return;
            case 15:
                onClick$15(this, dialogInterface, i);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onClick$16(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS160S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDCListenerS160S0100000_7(String str, String str2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.l0 = str2;
    }

    public static final void onClick$0(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        C40211FqJ.LIZIZ((Activity) iDCListenerS160S0100000_7.l0);
    }

    public static final void onClick$1(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        ((Activity) iDCListenerS160S0100000_7.l0).finish();
    }

    public static final void onClick$10(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        VideoEditViewModel videoEditViewModel = ((C46006I3u) iDCListenerS160S0100000_7.l0).LJLJI;
        if (videoEditViewModel != null) {
            List<VideoSegment> kv0 = videoEditViewModel.kv0();
            ((C46006I3u) iDCListenerS160S0100000_7.l0).getClass();
            HC8.LIZLLL("exit_clip_popup_cancel", kv0);
            return;
        }
        o.LJIJI("videoEditViewModel");
        throw null;
    }

    public static final void onClick$11(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        Activity activity = ((C46006I3u) iDCListenerS160S0100000_7.l0).mActivity;
        if (activity != null) {
            activity.finish();
        }
        VideoEditViewModel videoEditViewModel = ((C46006I3u) iDCListenerS160S0100000_7.l0).LJLJI;
        if (videoEditViewModel != null) {
            List<VideoSegment> kv0 = videoEditViewModel.kv0();
            ((C46006I3u) iDCListenerS160S0100000_7.l0).getClass();
            HC8.LIZLLL("exit_clip_popup_confirm", kv0);
            return;
        }
        o.LJIJI("videoEditViewModel");
        throw null;
    }

    public static final void onClick$12(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        ((InterfaceC65784Pro) iDCListenerS160S0100000_7.l0).invoke();
    }

    public static final void onClick$13(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        if (((C82380WUu) iDCListenerS160S0100000_7.l0).getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", ((C82380WUu) iDCListenerS160S0100000_7.l0).LJLJJI.LJI());
        c145995oB.LJI("shoot_way", ((C82380WUu) iDCListenerS160S0100000_7.l0).LJLJJI.shootWay);
        int i2 = ((C82380WUu) iDCListenerS160S0100000_7.l0).LJLJJI.draftId;
        if (i2 != 0) {
            c145995oB.LIZ(i2, "draft_id");
        }
        String str = ((C82380WUu) iDCListenerS160S0100000_7.l0).LJLJJI.newDraftId;
        o.LJIIIIZZ(str, "shortVideoContext.newDraftId");
        if (str.length() > 0) {
            c145995oB.LIZLLL("new_draft_id", ((C82380WUu) iDCListenerS160S0100000_7.l0).LJLJJI.newDraftId);
        }
        if (((C82380WUu) iDCListenerS160S0100000_7.l0).LJLJJI.cameraComponentModel.isRetakeMode) {
            c145995oB.LIZLLL("action_type", "reshoot");
        }
        FMX.LJIIL("delete_clip", c145995oB.LIZ);
        I3X i3x = ((C82380WUu) iDCListenerS160S0100000_7.l0).LJLJI;
        if (i3x != null) {
            HZ2.LIZIZ(i3x);
        }
    }

    public static final void onClick$14(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        ((C82380WUu) iDCListenerS160S0100000_7.l0).getLifecycle().getCurrentState();
    }

    public static final void onClick$15(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        GJT.LIZ.logRestoreDialogClick(true);
        C78934UyQ.LJLIL.getBridgeService().getClass();
        AnchorListManager.LIZJ(null);
        ((InterfaceC88472Yns) iDCListenerS160S0100000_7.l0).invoke(Boolean.TRUE);
        dialogInterface.dismiss();
    }

    public static final void onClick$16(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        ((InterfaceC65784Pro) iDCListenerS160S0100000_7.l0).invoke();
    }

    public static final void onClick$2(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        ((PushCameraBlurActivity) iDCListenerS160S0100000_7.l0).LLFII();
        dialogInterface.dismiss();
    }

    public static final void onClick$3(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        ((PushCameraBlurActivity) iDCListenerS160S0100000_7.l0).finish();
    }

    public static final void onClick$5(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.shootWay("restore_crash");
        builder.restoreType(2);
        builder.creationId(UUID.randomUUID().toString());
        IExternalService LIZ = AVExternalServiceImpl.LIZ();
        KidsMainActivity kidsMainActivity = (KidsMainActivity) iDCListenerS160S0100000_7.l0;
        LIZ.asyncService(kidsMainActivity, "restore_crash", new IDLCallbackS16S0200000_7(kidsMainActivity, builder, 11));
        dialogInterface.dismiss();
    }

    public static final void onClick$6(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialog, int i) {
        IAVPublishService publishService;
        KidsMainActivity kidsMainActivity = (KidsMainActivity) iDCListenerS160S0100000_7.l0;
        o.LJIIIIZZ(dialog, "dialog");
        kidsMainActivity.getClass();
        IExternalService LIZ = AVExternalServiceImpl.LIZ();
        if (LIZ != null && (publishService = LIZ.publishService()) != null) {
            publishService.cancelRestoreOnMain();
        }
        dialog.dismiss();
    }

    public static final void onClick$7(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        ((MvChoosePhotoScene) iDCListenerS160S0100000_7.l0).LLLZL(false);
    }

    public static final void onClick$8(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        ((HashMap) iDCListenerS160S0100000_7.l0).put("to_status", "cancel");
        GXR.LIZ("shoot_video_delete_confirm", (HashMap) iDCListenerS160S0100000_7.l0);
    }

    public static final void onClick$9(IDCListenerS160S0100000_7 iDCListenerS160S0100000_7, DialogInterface dialogInterface, int i) {
        ((InterfaceC65784Pro) iDCListenerS160S0100000_7.l0).invoke();
    }
}
