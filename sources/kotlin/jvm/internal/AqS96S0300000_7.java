package kotlin.jvm.internal;

import X.AbstractC42152GgW;
import X.AbstractC44912Hjw;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass621;
import X.AnonymousClass636;
import X.C10K;
import X.C121514pn;
import X.C122034qd;
import X.C133765Mu;
import X.C152875zH;
import X.C164826dS;
import X.C165706es;
import X.C16880lQ;
import X.C17N;
import X.C188727au;
import X.C34K;
import X.C36922EeM;
import X.C39557Ffl;
import X.C41028G8i;
import X.C41341GKj;
import X.C41625GVh;
import X.C41627GVj;
import X.C42117Gfx;
import X.C42150GgU;
import X.C42303Gix;
import X.C42662Gok;
import X.C42688GpA;
import X.C42691GpD;
import X.C42897GsX;
import X.C43213Gxd;
import X.C43393H1h;
import X.C43397H1l;
import X.C43403H1r;
import X.C43422H2k;
import X.C43425H2n;
import X.C43427H2p;
import X.C44172HVg;
import X.C44226HXi;
import X.C44229HXl;
import X.C44336Hae;
import X.C44436HcG;
import X.C44546He2;
import X.C44716Hgm;
import X.C44913Hjx;
import X.C45054HmE;
import X.C45087Hml;
import X.C45465Hsr;
import X.C45500HtQ;
import X.C45501HtR;
import X.C45508HtY;
import X.C46066I6c;
import X.C46072I6i;
import X.C5OG;
import X.C5S1;
import X.C5V8;
import X.C5XM;
import X.C60903NvH;
import X.C61878OQg;
import X.C62850Ola;
import X.C63A;
import X.C67996QmO;
import X.C68322mC;
import X.C71897SJp;
import X.C72037SOz;
import X.C76800UCe;
import X.C77357UXp;
import X.C78915Uy7;
import X.C78983UzD;
import X.C82622Wbi;
import X.C82632Wbs;
import X.C84488XDw;
import X.EnumC121564ps;
import X.EnumC122254qz;
import X.EnumC123874tb;
import X.EnumC164816dR;
import X.EnumC42282Gic;
import X.EnumC42283Gid;
import X.EnumC42692GpE;
import X.EnumC43531H6p;
import X.EnumC43998HOo;
import X.ExecutorC142245i8;
import X.ExecutorC149205tM;
import X.FMX;
import X.G6W;
import X.G7X;
import X.G8J;
import X.GGO;
import X.GLA;
import X.H3D;
import X.H49;
import X.H7O;
import X.H7R;
import X.HD4;
import X.HRO;
import X.IB3;
import X.IBJ;
import X.InterfaceC153045zY;
import X.InterfaceC43636HAq;
import X.InterfaceC45510Hta;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC74236TBo;
import X.InterfaceC83865Wvl;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.OSZ;
import X.WM7;
import X.WUK;
import X.X1D;
import X.XFV;
import X.XFW;
import Y.ACallableS110S0100000_7;
import Y.ARunnableS18S0300000_7;
import Y.ARunnableS21S0200000_2;
import Y.ARunnableS43S0100000_7;
import Y.IDFactoryS63S0000000_7;
import Y.IDLCallbackS18S0300000_7;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.commercialize.mission.CommerceMissionServiceImpl;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.BaseVisibilityViewModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AvatarUpdateInfoStruct;
import com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.external.ui.EditConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.pugc.PUgcSlotData;
import com.ss.android.ugc.aweme.sticker.data.CaptionStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.Utterance;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.gamora.recorder.localmedia.LocalMediaArgument;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.VEWatermarkParam;
import com.zhiliaoapp.musically.R;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public class AqS96S0300000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$0();
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this);
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$17(this);
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case 24:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final RecordMVViewModel invoke$0() {
        return (JediViewModel) C165706es.LJIIIIZZ((WM7) this.l0, null, new IDFactoryS63S0000000_7(6), 2).get(C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
    }

    public final void invoke$1() {
        ((H7O) this.l0).dismissDialog();
        C42662Gok.LJFF((Activity) this.l1, C16880lQ.LLJJIJI((Intent) this.l2));
    }

    public final void invoke$2() {
        C16880lQ.LJFF(((HRO) this.l0).requireActivity(), ((LocalMediaArgument) this.l2).requestCode, (Intent) this.l1);
    }

    public static final Object invoke$0(AqS96S0300000_7 aqS96S0300000_7) {
        super/*android.app.Activity*/.onSaveInstanceState((Bundle) aqS96S0300000_7.l1, (PersistableBundle) aqS96S0300000_7.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS96S0300000_7 aqS96S0300000_7) {
        ((CommerceToolsMusicService) aqS96S0300000_7.l0).LJFF((AVMusic) aqS96S0300000_7.l1, (Integer) aqS96S0300000_7.l2);
        ((CommerceToolsMusicService) aqS96S0300000_7.l0).LIZJ((AVMusic) aqS96S0300000_7.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS96S0300000_7 aqS96S0300000_7) {
        if (C5OG.LIZ()) {
            C42691GpD c42691GpD = (C42691GpD) aqS96S0300000_7.l0;
            EnumC42692GpE enumC42692GpE = c42691GpD.LIZIZ;
            if (enumC42692GpE == EnumC42692GpE.NONE) {
                EnumC42692GpE enumC42692GpE2 = EnumC42692GpE.ACTIVITY_CREATED;
                if (enumC42692GpE != enumC42692GpE2) {
                    c42691GpD.LIZIZ = enumC42692GpE2;
                    c42691GpD.LIZ.LIZ((Activity) aqS96S0300000_7.l1, (Bundle) aqS96S0300000_7.l2);
                }
                return C76800UCe.LIZ;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("invoke onDestroyView() first, current state ");
            LIZ.append(((C42691GpD) aqS96S0300000_7.l0).LIZIZ);
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        throw new IllegalStateException("onActivityCreated must run on ui thread");
    }

    public static final Object invoke$11(AqS96S0300000_7 aqS96S0300000_7) {
        ExecutorC149205tM executorC149205tM = ExecutorC149205tM.LJLILLLLZI;
        executorC149205tM.LJLIL.postDelayed(new ARunnableS18S0300000_7((C43213Gxd) aqS96S0300000_7.l0, (Activity) aqS96S0300000_7.l1, (VideoPublishEditModel) aqS96S0300000_7.l2, 5), 50L);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS96S0300000_7 aqS96S0300000_7) {
        ((InterfaceC88472Yns) aqS96S0300000_7.l0).invoke((TuxIconView) aqS96S0300000_7.l1);
        ((C42897GsX) aqS96S0300000_7.l2).LIZ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$13(AqS96S0300000_7 aqS96S0300000_7) {
        return CommerceMissionServiceImpl.LJIIIIZZ().LIZLLL(new C42688GpA((BaseVisibilityViewModel) aqS96S0300000_7.l0, (Fragment) aqS96S0300000_7.l1, (C72037SOz) aqS96S0300000_7.l2));
    }

    public static final Object invoke$14(AqS96S0300000_7 aqS96S0300000_7) {
        VEWatermarkParam vEWatermarkParam;
        String str;
        List<Utterance> list;
        C43422H2k c43422H2k = (C43422H2k) aqS96S0300000_7.l0;
        SynthetiseResult synthetiseResult = (SynthetiseResult) aqS96S0300000_7.l1;
        C43403H1r c43403H1r = c43422H2k.LJIIJ;
        if (c43403H1r != null) {
            VideoPublishEditModel videoPublishEditModel = c43403H1r.LIZ;
            c43422H2k.LJIJJLI = H3D.CaptionSynthesis;
            C67996QmO c67996QmO = c43422H2k.LJIILJJIL;
            if (c67996QmO == null) {
                o.LJIJI("nodeCallback");
                throw null;
            }
            c67996QmO.LIZIZ(new C43393H1h("CompileWithCaptionTask", "CompileWithCaptionTask startAddCaptionsAndWaterMark"), EnumC43531H6p.OUTER);
            C152875zH LIZ = c43422H2k.LJII().LIZ();
            String draftDir = videoPublishEditModel.draftDir();
            o.LJIIIIZZ(draftDir, "editModel.draftDir()");
            C133765Mu LIZ2 = LIZ.LIZ(draftDir);
            VEWatermarkParam vEWatermarkParam2 = c43422H2k.LJII;
            if (vEWatermarkParam2 != null) {
                vEWatermarkParam2.needExtFile = false;
            }
            C122034qd LJJI = C17N.LJJI(LIZ2);
            if (LJJI != null) {
                NLETrack nLETrack = new NLETrack();
                nLETrack.LJJ(true);
                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                nLETrackSlot.setStartTime(0L);
                nLETrackSlot.setEndTime(synthetiseResult.videoLength * 1000);
                NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
                nLESegmentVideo.LJIJJLI(0L);
                nLESegmentVideo.LJIJJ(synthetiseResult.videoLength * 1000);
                NLEResourceAV nLEResourceAV = new NLEResourceAV();
                nLEResourceAV.LJIILIIL(EnumC123874tb.VIDEO);
                nLEResourceAV.LJIIIZ(synthetiseResult.outputFile);
                nLESegmentVideo.LJIILL(nLEResourceAV);
                nLETrackSlot.LJIIL(nLESegmentVideo);
                nLETrack.LIZIZ(nLETrackSlot);
                LJJI.LJIIJ.LJ().addTrack(nLETrack);
                if (!H49.LIZLLL(videoPublishEditModel)) {
                    vEWatermarkParam = c43422H2k.LJII;
                } else {
                    vEWatermarkParam = null;
                }
                C43397H1l c43397H1l = c43422H2k.LJIIL;
                if (c43397H1l != null) {
                    VEVideoEncodeSettings LIZJ = C44546He2.LIZJ(videoPublishEditModel, synthetiseResult, vEWatermarkParam, LIZ2, c43397H1l.LJLIL);
                    List<InteractStickerStruct> LJI = C164826dS.LJI(videoPublishEditModel.getMainBusinessContext(), 11, EnumC164816dR.TRACK_PAGE_EDIT);
                    C67996QmO c67996QmO2 = c43422H2k.LJIILJJIL;
                    if (c67996QmO2 == null) {
                        o.LJIJI("nodeCallback");
                        throw null;
                    }
                    c67996QmO2.LIZIZ(new C43393H1h("CompileWithCaptionTask", "begin to check caption data"), EnumC43531H6p.OUTER);
                    if (LJI != null && LJI.size() > 0) {
                        videoPublishEditModel.captionStruct = ((InteractStickerStruct) ListProtector.get(LJI, 0)).getCaptionStruct();
                    }
                    if (videoPublishEditModel.captionStruct != null) {
                        C67996QmO c67996QmO3 = c43422H2k.LJIILJJIL;
                        if (c67996QmO3 == null) {
                            o.LJIJI("nodeCallback");
                            throw null;
                        }
                        c67996QmO3.LIZIZ(new C43393H1h("CompileWithCaptionTask", "caption struct is not null"), EnumC43531H6p.OUTER);
                        CaptionStruct captionStruct = videoPublishEditModel.captionStruct;
                        if (captionStruct == null || (list = captionStruct.getUtterances()) == null) {
                            list = C61878OQg.INSTANCE;
                        }
                        for (Utterance utterance : list) {
                            C121514pn c121514pn = new C121514pn(EnumC121564ps.AUTO_SUBTITLE);
                            c121514pn.LJIIZILJ = true;
                            c121514pn.LIZJ = utterance.getStartTime();
                            c121514pn.LIZLLL = utterance.getEndTime();
                            C122034qd LJJI2 = C17N.LJJI(LIZ2);
                            if (LJJI2 != null) {
                                LJJI2.LJIIIIZZ().LJJIIJ(c121514pn);
                                String str2 = c121514pn.LIZ;
                                if (str2 != null) {
                                    ((List) c43422H2k.LJJI.getValue()).add(str2);
                                }
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    }
                    LIZ2.LLLF();
                    C43425H2n c43425H2n = new C43425H2n(LIZ2, synthetiseResult, videoPublishEditModel, c43422H2k);
                    C43427H2p c43427H2p = new C43427H2p(c43422H2k, synthetiseResult, LIZ2);
                    LIZ2.LLIIJLIL(c43425H2n);
                    LIZ2.LLILL(c43427H2p);
                    ((ArrayList) c43422H2k.LJIJI).add(new ARunnableS21S0200000_2(LIZ2, c43422H2k, 48));
                    VEWatermarkParam vEWatermarkParam3 = c43422H2k.LJII;
                    if (vEWatermarkParam3 != null) {
                        str = vEWatermarkParam3.extFile;
                    } else {
                        str = null;
                    }
                    LIZ2.LLIILZL(str, LIZJ);
                    ((C43422H2k) aqS96S0300000_7.l0).LJII().LIZLLL().LIZJ();
                    C10K.LIZJ(new ACallableS110S0100000_7((Runnable) new ARunnableS43S0100000_7((InterfaceC153045zY) aqS96S0300000_7.l2, 102), 37));
                    return C76800UCe.LIZ;
                }
                o.LJIJI("publishId");
                throw null;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        o.LJIJI("editModelContainer");
        throw null;
    }

    public static /* bridge */ /* synthetic */ Object invoke$15(AqS96S0300000_7 aqS96S0300000_7) {
        aqS96S0300000_7.invoke$1();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS96S0300000_7 aqS96S0300000_7) {
        String creationId = ((G8J) aqS96S0300000_7.l0).LJII.getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        String str = ((G8J) aqS96S0300000_7.l0).LJII.mShootWay;
        o.LJIIIIZZ(str, "model.mShootWay");
        String valueOf = String.valueOf(((G8J) aqS96S0300000_7.l0).LJII.draftId);
        String contentType = H7R.LJIIIZ(((G8J) aqS96S0300000_7.l0).LJII);
        String contentSource = H7R.LJIIIIZZ(((G8J) aqS96S0300000_7.l0).LJII);
        String musicId = ((G8J) aqS96S0300000_7.l0).LJII.getMusicId();
        boolean LJJJJJL = C78983UzD.LJJJJJL(((G8J) aqS96S0300000_7.l0).LJII);
        o.LJIIIZ(contentType, "contentType");
        o.LJIIIZ(contentSource, "contentSource");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", creationId);
        c188727au.LJIIIZ("shoot_way", str);
        c188727au.LJIIIZ("draft_id", valueOf);
        c188727au.LJIIIZ("enter_from", "video_edit_page");
        c188727au.LJIIIZ("content_type", contentType);
        c188727au.LJIIIZ("content_source", contentSource);
        c188727au.LJIIIZ("music_id", musicId);
        c188727au.LJIIIZ("click_type", "post anyway");
        c188727au.LIZLLL(LJJJJJL ? 1 : 0, "is_sub_only_video");
        FMX.LJIIL("sound_copyright_check_post_notice_click", c188727au.LIZ);
        ((G7X) aqS96S0300000_7.l1).LIZIZ((AbstractC42152GgW) aqS96S0300000_7.l2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS96S0300000_7 aqS96S0300000_7) {
        C45500HtQ c45500HtQ = (C45500HtQ) aqS96S0300000_7.l0;
        InterfaceC45510Hta interfaceC45510Hta = c45500HtQ.LLIL;
        if (interfaceC45510Hta != null) {
            MediaModel mediaModel = (MediaModel) aqS96S0300000_7.l1;
            View view = (View) aqS96S0300000_7.l2;
            if (mediaModel instanceof MyMediaModel) {
                interfaceC45510Hta.LIZLLL((MyMediaModel) mediaModel, view);
                c45500HtQ.LLILIL = false;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS96S0300000_7 aqS96S0300000_7) {
        boolean z;
        String str;
        Resources resources;
        if (!C45508HtY.LIZIZ(((MediaModel) aqS96S0300000_7.l0).fileLocalUriPath, true)) {
            C5S1 c5s1 = new C5S1((Activity) aqS96S0300000_7.l1);
            Activity activity = (Activity) aqS96S0300000_7.l1;
            if (activity != null && (resources = activity.getResources()) != null) {
                str = resources.getString(R.string.h46);
            } else {
                str = null;
            }
            c5s1.LIZLLL(str);
            c5s1.LJ();
        } else {
            C45500HtQ c45500HtQ = (C45500HtQ) aqS96S0300000_7.l2;
            c45500HtQ.getClass();
            if (C42117Gfx.LJ() && c45500HtQ.LLIIII != 15) {
                z = true;
            } else {
                z = false;
            }
            MediaModel mediaModel = (MediaModel) aqS96S0300000_7.l0;
            C45500HtQ c45500HtQ2 = (C45500HtQ) aqS96S0300000_7.l2;
            c45500HtQ.LLJLIL(false, z, mediaModel, c45500HtQ2.LLIIIILZ, new AqS154S0200000_7(c45500HtQ2, mediaModel, 79));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS96S0300000_7 aqS96S0300000_7) {
        C45501HtR c45501HtR = (C45501HtR) aqS96S0300000_7.l0;
        C45465Hsr c45465Hsr = c45501HtR.LLIIZ;
        if (c45465Hsr != null) {
            MediaModel mediaModel = (MediaModel) aqS96S0300000_7.l1;
            View view = (View) aqS96S0300000_7.l2;
            if (mediaModel instanceof MyMediaModel) {
                c45465Hsr.LIZLLL((MyMediaModel) mediaModel, view);
                c45501HtR.LLIL = false;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS96S0300000_7 aqS96S0300000_7) {
        AVExternalServiceImpl.LIZ().asyncService("other_platform", new IDLCallbackS18S0300000_7((Context) aqS96S0300000_7.l1, (CreativeInitialModel) aqS96S0300000_7.l0, (EditConfig) aqS96S0300000_7.l2, 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS96S0300000_7 aqS96S0300000_7) {
        String str;
        Resources resources;
        if (!C45508HtY.LIZIZ(((MediaModel) aqS96S0300000_7.l0).fileLocalUriPath, true)) {
            C5S1 c5s1 = new C5S1((Activity) aqS96S0300000_7.l1);
            Activity activity = (Activity) aqS96S0300000_7.l1;
            if (activity != null && (resources = activity.getResources()) != null) {
                str = resources.getString(R.string.h46);
            } else {
                str = null;
            }
            c5s1.LIZLLL(str);
            c5s1.LJ();
        } else {
            C45501HtR c45501HtR = (C45501HtR) aqS96S0300000_7.l2;
            MediaModel mediaModel = (MediaModel) aqS96S0300000_7.l0;
            c45501HtR.LLJLIL(false, mediaModel, c45501HtR.LLIIIILZ, new AqS154S0200000_7(c45501HtR, mediaModel, 83));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS96S0300000_7 aqS96S0300000_7) {
        InterfaceC43636HAq LJJIII = C60903NvH.LJIIJJI().LJJIII();
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS96S0300000_7.l0;
        InterfaceC83865Wvl mediaController = ((HD4) aqS96S0300000_7.l1).LJIIL.invoke().getMediaController();
        HD4 hd4 = (HD4) aqS96S0300000_7.l1;
        CreativeInfo creativeInfo = ((ShortVideoContext) ((InterfaceC65784Pro) aqS96S0300000_7.l2).invoke()).creativeInfo;
        o.LJIIIIZZ(creativeInfo, "shortVideoContextProvider().creativeInfo");
        return LJJIII.getPhotoModule(activityC45651qj, mediaController, hd4, creativeInfo);
    }

    public static final Object invoke$22(AqS96S0300000_7 aqS96S0300000_7) {
        ((C44436HcG) aqS96S0300000_7.l0).LJIIJJI((EffectListResponse) aqS96S0300000_7.l1, (StringBuilder) aqS96S0300000_7.l2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$23(AqS96S0300000_7 aqS96S0300000_7) {
        if (C41028G8i.LIZ()) {
            CreativeLoadingDialog creativeLoadingDialog = (CreativeLoadingDialog) ((C68322mC) aqS96S0300000_7.l0).element;
            if (creativeLoadingDialog != null) {
                creativeLoadingDialog.dismiss();
            }
        } else {
            Dialog dialog = (Dialog) ((C68322mC) aqS96S0300000_7.l1).element;
            if (dialog != null && dialog.isShowing()) {
                Dialog dialog2 = (Dialog) ((C68322mC) aqS96S0300000_7.l1).element;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                ((DraftViewModel) aqS96S0300000_7.l2).getClass();
                C42303Gix.LIZ(1016, GGO.DISMISS, EnumC42283Gid.DUAL_BALL, EnumC42282Gic.CLOSE_VISIBLE_5S, null);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS96S0300000_7 aqS96S0300000_7) {
        C41625GVh c41625GVh = ((C41627GVj) aqS96S0300000_7.l0).LJLJJL;
        Bitmap value = (Bitmap) aqS96S0300000_7.l1;
        c41625GVh.getClass();
        o.LJIIIZ(value, "value");
        c41625GVh.LJ.setValue(value);
        C41625GVh c41625GVh2 = ((C41627GVj) aqS96S0300000_7.l0).LJLJJL;
        c41625GVh2.LJFF.setValue((Bitmap) aqS96S0300000_7.l2);
        ((C41627GVj) aqS96S0300000_7.l0).LJLJJL.LJI.setValue(null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS96S0300000_7 aqS96S0300000_7) {
        int i;
        String shortId;
        C44336Hae c44336Hae = (C44336Hae) aqS96S0300000_7.l0;
        C82632Wbs c82632Wbs = c44336Hae.LJLJJI;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C44336Hae.LJLJL;
        Context context = (Context) c82632Wbs.LIZ(c44336Hae, interfaceC74236TBoArr[0]);
        if (((C34K) aqS96S0300000_7.l1).element) {
            i = R.string.r81;
        } else {
            i = R.string.r85;
        }
        Object[] objArr = new Object[1];
        User user = (User) aqS96S0300000_7.l2;
        o.LJIIIZ(user, "user");
        String uniqueId = user.getUniqueId();
        if (uniqueId == null || uniqueId.length() == 0) {
            shortId = user.getShortId();
            o.LJIIIIZZ(shortId, "{\n            user.shortId\n        }");
        } else {
            shortId = user.getUniqueId();
            o.LJIIIIZZ(shortId, "{\n            user.uniqueId\n        }");
        }
        objArr[0] = shortId;
        String string = context.getString(i, objArr);
        o.LJIIIIZZ(string, "activity.getString(\n    …nvitee)\n                )");
        C44336Hae c44336Hae2 = (C44336Hae) aqS96S0300000_7.l0;
        Activity activity = (Activity) c44336Hae2.LJLJJI.LIZ(c44336Hae2, interfaceC74236TBoArr[0]);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(string);
        C78915Uy7.LJJIIZI(activity, 3040, creativeToastBuilder);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS96S0300000_7 aqS96S0300000_7) {
        C41341GKj c41341GKj = (C41341GKj) aqS96S0300000_7.l0;
        if (!c41341GKj.LJLJJI) {
            PUgcSlotData pUgcSlotData = c41341GKj.LJLJJL;
            if (pUgcSlotData != null) {
                if (!pUgcSlotData.isFixed) {
                    View view = (View) aqS96S0300000_7.l1;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(R.string.qa);
                    C78915Uy7.LJJIJ(view, 6008, creativeToastBuilder);
                    return C76800UCe.LIZ;
                }
            } else {
                o.LJIJI("slot");
                throw null;
            }
        }
        C71897SJp c71897SJp = c41341GKj.LJLJI;
        boolean z = true;
        if (c71897SJp.isChecked()) {
            z = false;
        }
        c71897SJp.setChecked(z);
        if (((C41341GKj) aqS96S0300000_7.l0).getAbsoluteAdapterPosition() != -1) {
            ((InterfaceC88471Ynr) aqS96S0300000_7.l2).invoke(Integer.valueOf(((C41341GKj) aqS96S0300000_7.l0).getAbsoluteAdapterPosition()), Boolean.valueOf(((C41341GKj) aqS96S0300000_7.l0).LJLJI.isChecked()));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS96S0300000_7 aqS96S0300000_7) {
        C36922EeM.LIZLLL(4, "download-request-permission", "download permission is granted, start download.");
        ExecutorC142245i8.LJLILLLLZI.LIZ(500L, new ARunnableS18S0300000_7((AbstractC44912Hjw) aqS96S0300000_7.l0, (Activity) aqS96S0300000_7.l1, (C44913Hjx) aqS96S0300000_7.l2, 18));
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$28(AqS96S0300000_7 aqS96S0300000_7) {
        aqS96S0300000_7.invoke$2();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS96S0300000_7 aqS96S0300000_7) {
        if (((List) aqS96S0300000_7.l0).size() == ((List) aqS96S0300000_7.l1).size()) {
            ((InterfaceC88471Ynr) aqS96S0300000_7.l2).invoke(IBJ.COMPLETE, (List) aqS96S0300000_7.l1);
        } else {
            ((InterfaceC88471Ynr) aqS96S0300000_7.l2).invoke(IBJ.ERROR, (List) aqS96S0300000_7.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS96S0300000_7 aqS96S0300000_7) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C5XM LLJJL;
        boolean z;
        if (((C44716Hgm) aqS96S0300000_7.l0).LIZJ()) {
            AutoCutModel autoCutModel = ((C45054HmE) aqS96S0300000_7.l1).LLJLIL().creativeModel.autoCutModel;
            C44716Hgm c44716Hgm = (C44716Hgm) aqS96S0300000_7.l0;
            AnonymousClass636.LJIJJLI(autoCutModel, c44716Hgm.LIZIZ, c44716Hgm.LIZ, c44716Hgm.LIZJ, c44716Hgm.LJIIIZ, c44716Hgm.LJIIJJI);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EditAutoCutComponent applyAutoCutData: ");
            NLEModel nLEModel = ((C44716Hgm) aqS96S0300000_7.l0).LJII;
            List list = null;
            if (nLEModel != null) {
                str = nLEModel.getUUID();
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(", templateId: ");
            LIZ.append(((C44716Hgm) aqS96S0300000_7.l0).LJIIIZ);
            X1D.LIZIZ(LIZ);
            C44716Hgm c44716Hgm2 = (C44716Hgm) aqS96S0300000_7.l0;
            NLEModel nLEModel2 = c44716Hgm2.LJII;
            if (nLEModel2 != null) {
                C45054HmE c45054HmE = (C45054HmE) aqS96S0300000_7.l1;
                C34K c34k = (C34K) aqS96S0300000_7.l2;
                if (c44716Hgm2.LIZ == C63A.AUTO_CUT && c44716Hgm2.LIZIZ > 0) {
                    c45054HmE.LLIIIL();
                }
                if (c44716Hgm2.LIZJ == EnumC43998HOo.CUT_SAME.getValue()) {
                    z = true;
                } else {
                    z = false;
                }
                C5V8.LJ(nLEModel2, z);
                c34k.element = c45054HmE.LLF(nLEModel2);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("EditAutoCutComponent applyAutoCutData: avMusic=");
            AVMusic aVMusic = ((C44716Hgm) aqS96S0300000_7.l0).LJ;
            if (aVMusic != null) {
                str2 = aVMusic.getMusicId();
            } else {
                str2 = null;
            }
            LIZ2.append(str2);
            LIZ2.append(", musicPath=");
            LIZ2.append(((C44716Hgm) aqS96S0300000_7.l0).LJFF);
            LIZ2.append(", templateType: ");
            LIZ2.append(((C44716Hgm) aqS96S0300000_7.l0).LIZJ);
            X1D.LIZIZ(LIZ2);
            if (((C44716Hgm) aqS96S0300000_7.l0).LIZJ == EnumC43998HOo.CUT_SAME.getValue()) {
                if (MusicBeanUtilKt.extractAVMusic(((C45054HmE) aqS96S0300000_7.l1).LLJLIL().creativeModel.musicBuzModel) != null) {
                    ((C45054HmE) aqS96S0300000_7.l1).clearMusic();
                }
                NLEModel nLEModel3 = ((C44716Hgm) aqS96S0300000_7.l0).LJII;
                if (nLEModel3 != null) {
                    float f = WUK.LJIIZILJ;
                    Iterator LIZJ = t1.LIZJ(nLEModel3, "nleModel.tracks");
                    while (LIZJ.hasNext()) {
                        NLETrack track = (NLETrack) LIZJ.next();
                        o.LJIIIIZZ(track, "track");
                        if (o.LJ(C77357UXp.LJIILL(track), "cutsame")) {
                            Iterator<NLETrackSlot> it = track.LJIILL().iterator();
                            while (it.hasNext()) {
                                NLETrackSlot next = it.next();
                                NLESegmentAudio LIZLLL = C62850Ola.LIZLLL(next, "slot");
                                if (LIZLLL != null) {
                                    LIZLLL.LJIL(f);
                                }
                                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(next.LJI());
                                if (LJJ != null && o.LJ(LJJ.getExtra("is_mutable"), "true")) {
                                    LJJ.LJIL(0.0f);
                                    String audioType = EnumC122254qz.CUTSAME_USER.name();
                                    o.LJIIIZ(audioType, "audioType");
                                    next.setExtra("AudioTrackType", audioType);
                                }
                            }
                        }
                    }
                }
            } else {
                C44716Hgm c44716Hgm3 = (C44716Hgm) aqS96S0300000_7.l0;
                if (c44716Hgm3.LJFF != null && c44716Hgm3.LJ != null) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("EditAutoCutComponent applyAutoCutData: applyMusic=");
                    AVMusic aVMusic2 = ((C44716Hgm) aqS96S0300000_7.l0).LJ;
                    if (aVMusic2 != null) {
                        str3 = aVMusic2.getMusicId();
                    } else {
                        str3 = null;
                    }
                    LIZ3.append(str3);
                    LIZ3.append(", musicPath=");
                    LIZ3.append(((C44716Hgm) aqS96S0300000_7.l0).LJFF);
                    LIZ3.append(", name=");
                    AVMusic aVMusic3 = ((C44716Hgm) aqS96S0300000_7.l0).LJ;
                    if (aVMusic3 != null) {
                        str4 = aVMusic3.getName();
                    } else {
                        str4 = null;
                    }
                    LIZ3.append(str4);
                    X1D.LIZIZ(LIZ3);
                    AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(((C45054HmE) aqS96S0300000_7.l1).LLJLIL().creativeModel.musicBuzModel);
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("EditAutoCutComponent applyAutoCutData: currentMusic=");
                    if (extractAVMusic != null) {
                        str5 = extractAVMusic.getMusicId();
                    } else {
                        str5 = null;
                    }
                    LIZ4.append(str5);
                    LIZ4.append(", musicPath=");
                    if (extractAVMusic != null) {
                        str6 = extractAVMusic.path;
                    } else {
                        str6 = null;
                    }
                    LIZ4.append(str6);
                    LIZ4.append(", name=");
                    if (extractAVMusic != null) {
                        str7 = extractAVMusic.getName();
                    } else {
                        str7 = null;
                    }
                    LIZ4.append(str7);
                    X1D.LIZIZ(LIZ4);
                    if (extractAVMusic != null && o.LJ(extractAVMusic.path, ((C44716Hgm) aqS96S0300000_7.l0).LJFF)) {
                        String musicId = extractAVMusic.getMusicId();
                        AVMusic aVMusic4 = ((C44716Hgm) aqS96S0300000_7.l0).LJ;
                        if (aVMusic4 != null) {
                            str8 = aVMusic4.getMusicId();
                        } else {
                            str8 = null;
                        }
                        if (o.LJ(musicId, str8)) {
                            ((C45054HmE) aqS96S0300000_7.l1).clearMusic();
                        }
                    }
                    C44716Hgm c44716Hgm4 = (C44716Hgm) aqS96S0300000_7.l0;
                    String str9 = c44716Hgm4.LJFF;
                    if (str9 != null) {
                        C45054HmE c45054HmE2 = (C45054HmE) aqS96S0300000_7.l1;
                        AVMusic aVMusic5 = c44716Hgm4.LJ;
                        if (aVMusic5 != null) {
                            c45054HmE2.LJZI(aVMusic5, str9, C45087Hml.LJIIJJI(c45054HmE2.Ll0()));
                        }
                    }
                }
            }
            if (((C44716Hgm) aqS96S0300000_7.l0).LIZ == C63A.SOUND_SYNC && (LLJJL = ((C45054HmE) aqS96S0300000_7.l1).LLJJL()) != null) {
                LLJJL.RU(false);
            }
            if (((C34K) aqS96S0300000_7.l2).element) {
                List<TextStickerData> list2 = ((C44716Hgm) aqS96S0300000_7.l0).LJIIJ;
                if (list2 != null) {
                    list = ORZ.LLJI(list2);
                }
                ActivityC45651qj activity = ((C45054HmE) aqS96S0300000_7.l1).getActivity();
                C82622Wbi c82622Wbi = ((C45054HmE) aqS96S0300000_7.l1).LJLL;
                OSZ osz = new OSZ(Integer.valueOf(((C44716Hgm) aqS96S0300000_7.l0).LIZIZ), ((C44716Hgm) aqS96S0300000_7.l0).LIZ);
                C45054HmE c45054HmE3 = (C45054HmE) aqS96S0300000_7.l1;
                C5V8.LIZIZ(list, activity, c82622Wbi, osz, c45054HmE3.LLILIL, c45054HmE3.LLJLIL());
                ((C45054HmE) aqS96S0300000_7.l1).LLJLIL().creativeModel.autoCutModel.curRecommendTitleList = ((C45054HmE) aqS96S0300000_7.l1).LLILIL.get(new OSZ(Integer.valueOf(((C44716Hgm) aqS96S0300000_7.l0).LIZIZ), ((C44716Hgm) aqS96S0300000_7.l0).LIZ));
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(AqS96S0300000_7 aqS96S0300000_7) {
        XFW xfw = XFV.LJFF;
        Application application = C44172HVg.LIZ;
        o.LJIIIIZZ(application, "application");
        xfw.LIZ(application).LIZ();
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS96S0300000_7.l0;
        if (interfaceC88472Yns == null) {
            ((IAVEffectService.IAVEffectReadyCallback) aqS96S0300000_7.l1).finish(C84488XDw.LIZ((Context) aqS96S0300000_7.l2, null));
        } else {
            ((IAVEffectService.IAVEffectReadyCallback) aqS96S0300000_7.l1).finish(C84488XDw.LIZ((Context) aqS96S0300000_7.l2, new AqS173S0100000_7(interfaceC88472Yns, (InterfaceC88472Yns<? super String, C76800UCe>) 415)));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS96S0300000_7 aqS96S0300000_7) {
        AvatarUpdateInfoStruct avatarUpdateInfoStruct = ((AnonymousClass621) aqS96S0300000_7.l0).LJJLIIIJJI().creativeModel.changeAvatarModel.avatarStruct;
        String str = ((AvatarUri) aqS96S0300000_7.l1).uri;
        o.LJIIIIZZ(str, "it.uri");
        avatarUpdateInfoStruct.setNewAvatarUri(str);
        ChangeAvatarModel changeAvatarModel = ((AnonymousClass621) aqS96S0300000_7.l0).LJJLIIIJJI().creativeModel.changeAvatarModel;
        List<String> list = ((AvatarUri) aqS96S0300000_7.l1).urlList;
        o.LJIIIIZZ(list, "it.urlList");
        String str2 = (String) ORZ.LJLLLL(list);
        if (str2 == null) {
            str2 = "";
        }
        changeAvatarModel.getClass();
        changeAvatarModel.newAvatarUrl = str2;
        ((InterfaceC65784Pro) aqS96S0300000_7.l2).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS96S0300000_7 aqS96S0300000_7) {
        ((C46066I6c) aqS96S0300000_7.l0).LLLJ();
        C46066I6c c46066I6c = (C46066I6c) aqS96S0300000_7.l0;
        C46072I6i c46072I6i = c46066I6c.LLJILJIL;
        if (c46072I6i != null) {
            c46072I6i.LJIIL((AVMusic) aqS96S0300000_7.l1, c46066I6c.LJLIIL().getMMusicStart(), false, false, false, (InterfaceC65784Pro) aqS96S0300000_7.l2);
            return C76800UCe.LIZ;
        }
        o.LJIJI("musicSyncController");
        throw null;
    }

    public static final Object invoke$6(AqS96S0300000_7 aqS96S0300000_7) {
        ((G7X) aqS96S0300000_7.l0).LIZ((G6W) aqS96S0300000_7.l1);
        ((InterfaceC65784Pro) aqS96S0300000_7.l2).invoke();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r1.LIZ((com.ss.android.ugc.effectmanager.effect.model.Effect) r3.l2) == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AqS96S0300000_7 r3) {
        /*
            java.lang.Object r2 = r3.l0
            X.HXl r2 = (X.C44229HXl) r2
            java.lang.Object r0 = r3.l1
            X.HXi r0 = (X.C44226HXi) r0
            X.I0N r0 = r0.getStickerApiComponent()
            if (r0 == 0) goto L30
            X.TEZ r0 = r0.LLLLL()
            if (r0 == 0) goto L30
            X.THp r0 = r0.LJJJJLL()
            if (r0 == 0) goto L30
            X.SrB r1 = r0.LJ()
            if (r1 == 0) goto L30
            java.lang.Object r0 = r3.l2
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = (com.ss.android.ugc.effectmanager.effect.model.Effect) r0
            boolean r1 = r1.LIZ(r0)
            r0 = 1
            if (r1 != r0) goto L30
        L2b:
            r2.LIZJ = r0
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L30:
            r0 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS96S0300000_7.invoke$7(kotlin.jvm.internal.AqS96S0300000_7):java.lang.Object");
    }

    public static final Object invoke$8(AqS96S0300000_7 aqS96S0300000_7) {
        AvatarUpdateInfoStruct avatarUpdateInfoStruct = ((GLA) aqS96S0300000_7.l0).LIZIZ.creativeModel.changeAvatarModel.avatarStruct;
        String str = ((AvatarUri) aqS96S0300000_7.l1).uri;
        o.LJIIIIZZ(str, "it.uri");
        avatarUpdateInfoStruct.setNewAvatarUri(str);
        ChangeAvatarModel changeAvatarModel = ((GLA) aqS96S0300000_7.l0).LIZIZ.creativeModel.changeAvatarModel;
        List<String> list = ((AvatarUri) aqS96S0300000_7.l1).urlList;
        o.LJIIIIZZ(list, "it.urlList");
        String str2 = (String) ORZ.LJLLLL(list);
        if (str2 == null) {
            str2 = "";
        }
        changeAvatarModel.getClass();
        changeAvatarModel.newAvatarUrl = str2;
        ((InterfaceC65784Pro) aqS96S0300000_7.l2).invoke();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS96S0300000_7(ActivityC45651qj activityC45651qj, ActivityC45651qj activityC45651qj2, HD4 hd4, InterfaceC65784Pro<? extends ShortVideoContext> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = activityC45651qj;
        this.l1 = activityC45651qj2;
        this.l2 = hd4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS96S0300000_7(C68322mC c68322mC, C68322mC<CreativeLoadingDialog> c68322mC2, C68322mC<ProgressDialog> c68322mC3, DraftViewModel draftViewModel) {
        super(0);
        this.$t = draftViewModel;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
        this.l2 = c68322mC3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS96S0300000_7(AnonymousClass621 anonymousClass621, AnonymousClass621 anonymousClass6212, AvatarUri avatarUri, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = anonymousClass621;
        this.l1 = anonymousClass6212;
        this.l2 = avatarUri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS96S0300000_7(G8J g8j, G8J g8j2, G7X g7x, AbstractC42152GgW<?> abstractC42152GgW) {
        super(0);
        this.$t = abstractC42152GgW;
        this.l0 = g8j;
        this.l1 = g8j2;
        this.l2 = g7x;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS96S0300000_7(C41341GKj c41341GKj, C41341GKj c41341GKj2, View view, InterfaceC88471Ynr<? super Integer, ? super Boolean, ? extends Object> interfaceC88471Ynr) {
        super(0);
        this.$t = interfaceC88471Ynr;
        this.l0 = c41341GKj;
        this.l1 = c41341GKj2;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS96S0300000_7(GLA gla, GLA gla2, AvatarUri avatarUri, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = gla;
        this.l1 = gla2;
        this.l2 = avatarUri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(C41627GVj c41627GVj, Bitmap bitmap, Bitmap bitmap2, int i) {
        super(0);
        this.$t = i;
        this.l0 = c41627GVj;
        this.l1 = bitmap;
        this.l2 = bitmap2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(C42150GgU c42150GgU, G6W g6w, InterfaceC65784Pro interfaceC65784Pro, int i) {
        super(0);
        this.$t = i;
        this.l0 = c42150GgU;
        this.l1 = g6w;
        this.l2 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(C42691GpD c42691GpD, Activity activity, Bundle bundle, int i) {
        super(0);
        this.$t = i;
        this.l0 = c42691GpD;
        this.l1 = activity;
        this.l2 = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(C43213Gxd c43213Gxd, Activity activity, VideoPublishEditModel videoPublishEditModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c43213Gxd;
        this.l1 = activity;
        this.l2 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(C43422H2k c43422H2k, SynthetiseResult synthetiseResult, InterfaceC153045zY interfaceC153045zY, int i) {
        super(0);
        this.$t = i;
        this.l0 = c43422H2k;
        this.l1 = synthetiseResult;
        this.l2 = interfaceC153045zY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(H7O h7o, Activity activity, Intent intent, int i) {
        super(0);
        this.$t = i;
        this.l0 = h7o;
        this.l1 = activity;
        this.l2 = intent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(HRO hro, Intent intent, LocalMediaArgument localMediaArgument, int i) {
        super(0);
        this.$t = i;
        this.l0 = hro;
        this.l1 = intent;
        this.l2 = localMediaArgument;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(C44229HXl c44229HXl, C44226HXi c44226HXi, Effect effect, int i) {
        super(0);
        this.$t = i;
        this.l0 = c44229HXl;
        this.l1 = c44226HXi;
        this.l2 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(C44336Hae c44336Hae, C34K c34k, User user, int i) {
        super(0);
        this.$t = i;
        this.l0 = c44336Hae;
        this.l1 = c34k;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(C44436HcG c44436HcG, EffectListResponse effectListResponse, StringBuilder sb, int i) {
        super(0);
        this.$t = i;
        this.l0 = c44436HcG;
        this.l1 = effectListResponse;
        this.l2 = sb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(C44716Hgm c44716Hgm, C45054HmE c45054HmE, C34K c34k, int i) {
        super(0);
        this.$t = i;
        this.l0 = c44716Hgm;
        this.l1 = c45054HmE;
        this.l2 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(C45500HtQ c45500HtQ, MyMediaModel myMediaModel, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = c45500HtQ;
        this.l1 = myMediaModel;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(C45501HtR c45501HtR, MyMediaModel myMediaModel, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = c45501HtR;
        this.l1 = myMediaModel;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS96S0300000_7(C46066I6c c46066I6c, C46066I6c c46066I6c2, AVMusic aVMusic, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(0);
        this.$t = interfaceC65784Pro;
        this.l0 = c46066I6c;
        this.l1 = c46066I6c2;
        this.l2 = aVMusic;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(WM7 wm7, InterfaceC65350Pko interfaceC65350Pko, InterfaceC65350Pko interfaceC65350Pko2, int i) {
        super(0);
        this.$t = i;
        this.l0 = wm7;
        this.l1 = interfaceC65350Pko;
        this.l2 = interfaceC65350Pko2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(Activity activity, AbstractC44912Hjw abstractC44912Hjw, C44913Hjx c44913Hjx, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC44912Hjw;
        this.l1 = activity;
        this.l2 = c44913Hjx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(Context context, IAVEffectService.IAVEffectReadyCallback iAVEffectReadyCallback, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC88472Yns;
        this.l1 = iAVEffectReadyCallback;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(SAAActivity sAAActivity, Bundle bundle, PersistableBundle persistableBundle, int i) {
        super(0);
        this.$t = i;
        this.l0 = sAAActivity;
        this.l1 = bundle;
        this.l2 = persistableBundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(CommerceToolsMusicService commerceToolsMusicService, AVMusic aVMusic, Integer num, int i) {
        super(0);
        this.$t = i;
        this.l0 = commerceToolsMusicService;
        this.l1 = aVMusic;
        this.l2 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(BaseVisibilityViewModel baseVisibilityViewModel, Fragment fragment, C72037SOz c72037SOz, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseVisibilityViewModel;
        this.l1 = fragment;
        this.l2 = c72037SOz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(CreativeInitialModel creativeInitialModel, Context context, EditConfig editConfig, int i) {
        super(0);
        this.$t = i;
        this.l0 = creativeInitialModel;
        this.l1 = context;
        this.l2 = editConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(MyMediaModel myMediaModel, Activity activity, C45500HtQ c45500HtQ, int i) {
        super(0);
        this.$t = i;
        this.l0 = myMediaModel;
        this.l1 = activity;
        this.l2 = c45500HtQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(MyMediaModel myMediaModel, Activity activity, C45501HtR c45501HtR, int i) {
        super(0);
        this.$t = i;
        this.l0 = myMediaModel;
        this.l1 = activity;
        this.l2 = c45501HtR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS96S0300000_7(List list, List<IB3> list2, List<VEFrame> list3, InterfaceC88471Ynr<? super IBJ, ? super List<? extends VEFrame>, C76800UCe> interfaceC88471Ynr) {
        super(0);
        this.$t = interfaceC88471Ynr;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = list3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS96S0300000_7(AqS111S0300000_7 aqS111S0300000_7, TuxIconView tuxIconView, C42897GsX c42897GsX, int i) {
        super(0);
        this.$t = i;
        this.l0 = aqS111S0300000_7;
        this.l1 = tuxIconView;
        this.l2 = c42897GsX;
    }
}
