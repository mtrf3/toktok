package Y;

import X.C124614un;
import X.C145995oB;
import X.C147295qH;
import X.C169786lS;
import X.C172106pC;
import X.C41658GWo;
import X.C45828Hyi;
import X.C60903NvH;
import X.C6AL;
import X.C6FS;
import X.C79057V0z;
import X.FMX;
import X.H8F;
import X.I9T;
import X.InterfaceC145485nM;
import X.Q8U;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordScene;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordScene;
import com.ss.android.ugc.aweme.shortvideo.subtitle.EditCaptionScene;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionTextFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDCListenerS156S0100000_2 implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

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
            case 17:
                onClick$17(this, dialogInterface, i);
                return;
            default:
                return;
        }
    }

    public IDCListenerS156S0100000_2(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        ((C172106pC) iDCListenerS156S0100000_2.l0).getClass();
        try {
            dialogInterface.dismiss();
        } catch (Exception unused) {
        }
        DialogInterface.OnClickListener onClickListener = ((C172106pC) iDCListenerS156S0100000_2.l0).LJFF;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }

    public static final void onClick$1(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        ((C172106pC) iDCListenerS156S0100000_2.l0).getClass();
        try {
            dialogInterface.dismiss();
        } catch (Exception unused) {
        }
        DialogInterface.OnClickListener onClickListener = ((C172106pC) iDCListenerS156S0100000_2.l0).LJI;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }

    public static final void onClick$10(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        InterfaceC145485nM interfaceC145485nM = ((C147295qH) iDCListenerS156S0100000_2.l0).LJLLI;
        if (interfaceC145485nM != null) {
            interfaceC145485nM.LLIL();
            ((C147295qH) iDCListenerS156S0100000_2.l0).LLLII();
        } else {
            o.LJIJI("editEffectApi");
            throw null;
        }
    }

    public static final void onClick$11(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        C124614un.LJIILJJIL(((InlineCaptionTextFragment) iDCListenerS156S0100000_2.l0).Jl());
        C79057V0z.LJIIL(((InlineCaptionTextFragment) iDCListenerS156S0100000_2.l0).Jl());
        InlineCaptionTextFragment inlineCaptionTextFragment = (InlineCaptionTextFragment) iDCListenerS156S0100000_2.l0;
        C79057V0z.LJJJJL(inlineCaptionTextFragment.Jl(), "quit_edit_caption_text", inlineCaptionTextFragment.LLIIII);
        inlineCaptionTextFragment.mm();
        inlineCaptionTextFragment.Hl();
    }

    public static final void onClick$12(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        ((EditCaptionScene) iDCListenerS156S0100000_2.l0).cancel();
    }

    public static final void onClick$13(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        C6AL c6al = (C6AL) iDCListenerS156S0100000_2.l0;
        c6al.LIZ(c6al.LJIIJ);
    }

    public static final void onClick$14(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        ((ImageEditRootScene) iDCListenerS156S0100000_2.l0).LLLILZ();
    }

    public static final void onClick$15(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        VideoPublishEditModel videoPublishEditModel = ((ImageEditRootScene) iDCListenerS156S0100000_2.l0).LJLLJ;
        if (videoPublishEditModel != null) {
            o.LJIIIIZZ(videoPublishEditModel.newDraftId, "mModel.newDraftId");
            if (!ujb.o.LJJJJJL(r1)) {
                VideoPublishEditModel videoPublishEditModel2 = ((ImageEditRootScene) iDCListenerS156S0100000_2.l0).LJLLJ;
                if (videoPublishEditModel2 != null) {
                    H8F.LJIIZILJ(videoPublishEditModel2);
                } else {
                    o.LJIJI("mModel");
                    throw null;
                }
            }
            ((ImageEditRootScene) iDCListenerS156S0100000_2.l0).LLLILZ();
            return;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final void onClick$16(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        VideoPublishEditModel videoPublishEditModel = ((ImageEditRootScene) iDCListenerS156S0100000_2.l0).LJLLJ;
        if (videoPublishEditModel != null) {
            o.LJIIIIZZ(videoPublishEditModel.newDraftId, "mModel.newDraftId");
            if (!ujb.o.LJJJJJL(r1)) {
                VideoPublishEditModel videoPublishEditModel2 = ((ImageEditRootScene) iDCListenerS156S0100000_2.l0).LJLLJ;
                if (videoPublishEditModel2 != null) {
                    H8F.LJIIZILJ(videoPublishEditModel2);
                } else {
                    o.LJIJI("mModel");
                    throw null;
                }
            }
            ((ImageEditRootScene) iDCListenerS156S0100000_2.l0).LLLLILI(false);
            return;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final void onClick$17(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        C169786lS c169786lS = (C169786lS) iDCListenerS156S0100000_2.l0;
        c169786lS.getClass();
        dialogInterface.dismiss();
        c169786lS.LJJJJ = 1;
        c169786lS.LJIILIIL();
        c169786lS.LJIJI();
    }

    public static final void onClick$2(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        ((FTCEditAudioRecordScene) iDCListenerS156S0100000_2.l0).useModelParam();
    }

    public static final void onClick$3(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        ((EditAudioRecordScene) iDCListenerS156S0100000_2.l0).useModelParam();
    }

    public static final void onClick$4(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        C6FS LLLIILIL = ((VideoEditContainerScene) iDCListenerS156S0100000_2.l0).LLLIILIL();
        if (LLLIILIL != null) {
            LLLIILIL.lc();
        }
    }

    public static final void onClick$5(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        VideoPublishEditModel videoPublishEditModel = ((VideoEditContainerScene) iDCListenerS156S0100000_2.l0).LJZL;
        if (videoPublishEditModel.recordMode == 1) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("to_status", "cancel");
            c145995oB.LJI("prop_id", videoPublishEditModel.mStickerID);
            Q8U.LIZJ(c145995oB, "shoot_way", videoPublishEditModel.mShootWay, videoPublishEditModel, "creation_id");
            FMX.LJIIL("back_to_shoot_confirm", c145995oB.LIZ);
        }
    }

    public static final void onClick$6(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        ((C6FS) iDCListenerS156S0100000_2.l0).mG();
    }

    public static final void onClick$7(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) iDCListenerS156S0100000_2.l0;
        if (!TextUtils.isEmpty(videoEditContainerScene.LJZL.newDraftId)) {
            H8F.LJIIZILJ(videoEditContainerScene.LJZL);
        }
        C60903NvH.LJIIJJI().LJIIIZ().LIZ();
        I9T.LJI(videoEditContainerScene.LJLZ, I9T.LIZJ(videoEditContainerScene.LJZL.creativeModel.musicBuzModel), videoEditContainerScene.LJZL.creativeModel.musicBuzModel);
        C41658GWo.LIZLLL().LJI = "";
        videoEditContainerScene.LLLJL(C45828Hyi.LJIILJJIL);
        videoEditContainerScene.LLLII();
    }

    public static final void onClick$8(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        C6FS LLLIILIL = ((VideoEditContainerScene) iDCListenerS156S0100000_2.l0).LLLIILIL();
        if (LLLIILIL != null) {
            LLLIILIL.DF();
        }
    }

    public static final void onClick$9(IDCListenerS156S0100000_2 iDCListenerS156S0100000_2, DialogInterface dialogInterface, int i) {
        ((EditCaptionScene) iDCListenerS156S0100000_2.l0).cancel();
    }
}
