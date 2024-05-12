package com.ss.android.ugc.aweme.views;

import X.AbstractC156316Bn;
import X.AbstractViewOnClickListenerC55470Lpq;
import X.ActivityC45651qj;
import X.AnonymousClass605;
import X.AnonymousClass611;
import X.AnonymousClass632;
import X.AnonymousClass635;
import X.AnonymousClass636;
import X.AnonymousClass654;
import X.AnonymousClass699;
import X.C03880Dg;
import X.C138615cH;
import X.C139205dE;
import X.C143625kM;
import X.C143635kN;
import X.C145955o7;
import X.C145995oB;
import X.C152535yj;
import X.C152605yq;
import X.C153175zl;
import X.C1539662m;
import X.C1545664u;
import X.C1551667c;
import X.C1551967f;
import X.C158246Iy;
import X.C158296Jd;
import X.C158326Jg;
import X.C158396Jn;
import X.C158436Jr;
import X.C158516Jz;
import X.C158706Ks;
import X.C159286My;
import X.C165166e0;
import X.C16880lQ;
import X.C168986kA;
import X.C173516rT;
import X.C19K;
import X.C234529Ii;
import X.C235119Kp;
import X.C253179wf;
import X.C26227ARb;
import X.C41021G8b;
import X.C41658GWo;
import X.C43150Gwc;
import X.C48203Ivv;
import X.C5S1;
import X.C60903NvH;
import X.C60N;
import X.C61447O9r;
import X.C61B;
import X.C65300Pk0;
import X.C68W;
import X.C69W;
import X.C6DB;
import X.C6F2;
import X.C6GI;
import X.C6JV;
import X.C6K8;
import X.C6KT;
import X.C6KU;
import X.C6KY;
import X.C6KZ;
import X.C6LO;
import X.C6LV;
import X.C6LY;
import X.C6O9;
import X.C6OA;
import X.C6OC;
import X.C6OE;
import X.C6VO;
import X.C6Y2;
import X.C73318Sq2;
import X.C76800UCe;
import X.C78685UuP;
import X.C78857UxB;
import X.C78866UxK;
import X.C78915Uy7;
import X.C78983UzD;
import X.C79004UzY;
import X.C79057V0z;
import X.C82573Wav;
import X.C82580Wb2;
import X.C83728WtY;
import X.C8H9;
import X.C9KF;
import X.DialogC158506Jy;
import X.DialogC254009y0;
import X.EnumC158826Le;
import X.EnumC83729WtZ;
import X.EnumC83730Wta;
import X.FMX;
import X.G8P;
import X.GI1;
import X.GI3;
import X.GLI;
import X.H78;
import X.H7B;
import X.H7R;
import X.H8F;
import X.HX4;
import X.InterfaceC135405Tc;
import X.InterfaceC139695e1;
import X.InterfaceC143655kP;
import X.InterfaceC145455nJ;
import X.InterfaceC145815nt;
import X.InterfaceC150615vd;
import X.InterfaceC153045zY;
import X.InterfaceC158456Jt;
import X.InterfaceC158496Jx;
import X.InterfaceC162066Xq;
import X.InterfaceC163006aW;
import X.InterfaceC168976k9;
import X.InterfaceC173506rS;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.OQN;
import X.ORZ;
import X.UC0;
import X.ViewOnClickListenerC1556568z;
import X.ViewOnClickListenerC158316Jf;
import Y.AObjectS80S0300000_2;
import Y.ARunnableS21S0200000_2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.selectsheet.TuxSingleSelectionSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordScene;
import com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverActivity;
import com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverFragment;
import com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment;
import com.ss.android.ugc.aweme.infoSticker.customsticker.EditPreviewStickerViewModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordScene;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.CaptionUtterance;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import com.ss.android.ugc.aweme.shortvideo.model.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.InlineCaptionViewModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes3.dex */
public class IDlS62S0100000_2 extends AbstractViewOnClickListenerC55470Lpq {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC55470Lpq
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            case 10:
                LIZ$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZ$11(this, view);
                return;
            case 12:
                LIZ$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LIZ$13(this, view);
                return;
            case 14:
                LIZ$14(this, view);
                return;
            case 15:
                LIZ$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LIZ$16(this, view);
                return;
            case 17:
                LIZ$17(this, view);
                return;
            case 18:
                LIZ$18(this, view);
                return;
            case 19:
                LIZ$19(this, view);
                return;
            case 20:
                LIZ$20(this, view);
                return;
            case 21:
                LIZ$21(this, view);
                return;
            case 22:
                LIZ$22(this, view);
                return;
            case 23:
                LIZ$23(this, view);
                return;
            case 24:
                LIZ$24(this, view);
                return;
            case 25:
                LIZ$25(this, view);
                return;
            case 26:
                LIZ$26(this, view);
                return;
            case 27:
                LIZ$27(this, view);
                return;
            case 28:
                LIZ$28(this, view);
                return;
            case 29:
                LIZ$29(this, view);
                return;
            case 30:
                LIZ$30(this, view);
                return;
            case 31:
                LIZ$31(this, view);
                return;
            case 32:
                LIZ$32(this, view);
                return;
            case 33:
                LIZ$33(this, view);
                return;
            case 34:
                LIZ$34(this, view);
                return;
            case 35:
                LIZ$35(this, view);
                return;
            case 36:
                LIZ$36(this, view);
                return;
            case 37:
                LIZ$37(this, view);
                return;
            case 38:
                LIZ$38(this, view);
                return;
            case 39:
                LIZ$39(this, view);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                LIZ$40(this, view);
                return;
            case 41:
                LIZ$41(this, view);
                return;
            case 42:
                LIZ$42(this, view);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                LIZ$43(this, view);
                return;
            case 44:
                LIZ$44(this, view);
                return;
            case 45:
                LIZ$45(this, view);
                return;
            case 46:
                LIZ$46(this, view);
                return;
            case 47:
                LIZ$47(this, view);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                LIZ$48(this, view);
                return;
            case C61447O9r.LJIIJ:
                LIZ$49(this, view);
                return;
            case 50:
                LIZ$50(this, view);
                return;
            case 51:
                LIZ$51(this, view);
                return;
            case 52:
                LIZ$52(this, view);
                return;
            case 53:
                LIZ$53(this, view);
                return;
            case 54:
                LIZ$54(this, view);
                return;
            case 55:
                LIZ$55(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDlS62S0100000_2(FTCVideoPublishFragment fTCVideoPublishFragment, int i) {
        super(600L);
        this.$t = i;
        switch (i) {
            case 39:
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                this.l0 = fTCVideoPublishFragment;
                return;
            default:
                this.l0 = fTCVideoPublishFragment;
                return;
        }
    }

    public static final void LIZ$0(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        ((AbstractC156316Bn) iDlS62S0100000_2.l0).LJFF();
    }

    public static final void LIZ$1(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        ((AbstractC156316Bn) iDlS62S0100000_2.l0).LJFF();
    }

    public static final void LIZ$10(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        InterfaceC162066Xq interfaceC162066Xq = ((FTCChooseCoverFragment) iDlS62S0100000_2.l0).LJLIL;
        if (interfaceC162066Xq != null) {
            VideoPublishEditModel LIZLLL = interfaceC162066Xq.LIZLLL();
            InterfaceC162066Xq interfaceC162066Xq2 = ((FTCChooseCoverFragment) iDlS62S0100000_2.l0).LJLIL;
            if (interfaceC162066Xq2 != null) {
                InterfaceC153045zY editor = interfaceC162066Xq2.getEditor();
                C60903NvH.LJIIJJI().LJFF().LIZIZ(LIZLLL, editor.LLILZ().width, editor.LLILZ().height, !OQN.LJIIIIZZ(LIZLLL.mVideoCoverStartTm, ((FTCChooseCoverFragment) iDlS62S0100000_2.l0).LJLILLLLZI / 1000.0f), new AqS149S0200000_2((FTCChooseCoverFragment) iDlS62S0100000_2.l0, LIZLLL, 12));
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("creation_id", LIZLLL.getCreationId());
                c145995oB.LJI("enter_from", "video_edit_page");
                c145995oB.LJI("shoot_way", "direct_shoot");
                c145995oB.LJI("shoot_entrance", "direct_shoot");
                FMX.LJIIL("save_cover_edit", c145995oB.LIZ);
                return;
            }
            o.LJIJI("mDependency");
            throw null;
        }
        o.LJIJI("mDependency");
        throw null;
    }

    public static final void LIZ$11(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        Rect rect;
        InterfaceC153045zY value;
        o.LJIIIZ(v, "v");
        if (!((C158706Ks) iDlS62S0100000_2.l0).LJLJLJ) {
            return;
        }
        int id = v.getId();
        if (id == R.id.a9w) {
            CheckBox checkBox = ((C158706Ks) iDlS62S0100000_2.l0).LLF;
            if (checkBox != null) {
                if (checkBox.isEnabled()) {
                    InterfaceC153045zY value2 = ((C158706Ks) iDlS62S0100000_2.l0).LJLILLLLZI.Ll0().Kh().getValue();
                    if (value2 != null) {
                        rect = value2.t5();
                    } else {
                        rect = null;
                    }
                    if (((C158706Ks) iDlS62S0100000_2.l0).LLF != null) {
                        ((C158706Ks) iDlS62S0100000_2.l0).getUiActions().LJFF.invoke(Boolean.valueOf(!(!r0.isChecked())));
                        if (rect != null) {
                            C158706Ks c158706Ks = (C158706Ks) iDlS62S0100000_2.l0;
                            if ((rect.left > 0 || rect.top > 0 || rect.right > 0 || rect.bottom > 0) && (value = c158706Ks.LJLILLLLZI.Ll0().Kh().getValue()) != null) {
                                value.LIZ(rect.left, rect.top, rect.right, rect.bottom);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    o.LJIJI("checkBox");
                    throw null;
                }
                return;
            }
            o.LJIJI("checkBox");
            throw null;
        }
        if (id == R.id.n9k) {
            ((C158706Ks) iDlS62S0100000_2.l0).getUiActions().LIZJ.invoke(Boolean.FALSE, -1, C78857UxB.LJJIIJ(1476788483, "bpea-pause_when_touch_video"));
            return;
        }
        if (id == R.id.af2) {
            ((C158706Ks) iDlS62S0100000_2.l0).getUiActions().LIZLLL.invoke(C78857UxB.LJJIIJ(1476788484, "bpea-pause_when_back_record"));
        } else {
            if (id != R.id.f8p || ((C158706Ks) iDlS62S0100000_2.l0).LJLILLLLZI.FS()) {
                return;
            }
            ((C158706Ks) iDlS62S0100000_2.l0).getUiActions().LIZIZ.invoke();
        }
    }

    public static final void LIZ$12(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        if (((C158706Ks) iDlS62S0100000_2.l0).getUiStates().LJ.LJLJJI) {
            InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = ((C158706Ks) iDlS62S0100000_2.l0).getUiActions().LJIIIZ;
            Boolean bool = Boolean.FALSE;
            interfaceC88472Yns.invoke(bool);
            C6LO c6lo = ((C158706Ks) iDlS62S0100000_2.l0).LJLZ;
            if (c6lo != null) {
                InterfaceC135405Tc interfaceC135405Tc = c6lo.LJLILLLLZI;
                if (interfaceC135405Tc != null) {
                    interfaceC135405Tc.LIZJ();
                }
                ((C158706Ks) iDlS62S0100000_2.l0).getUiActions().LIZJ.invoke(bool, -1, C78857UxB.LJJIIJ(1476788483, "bpea-pause_when_click"));
                ((C158706Ks) iDlS62S0100000_2.l0).LJLILLLLZI.jY("click");
                return;
            }
            o.LJIJI("audioRecordStartButton");
            throw null;
        }
        if (((C158706Ks) iDlS62S0100000_2.l0).LJLILLLLZI.FS()) {
            return;
        }
        ((C158706Ks) iDlS62S0100000_2.l0).getUiActions().LJIIIZ.invoke(Boolean.TRUE);
        C6LO c6lo2 = ((C158706Ks) iDlS62S0100000_2.l0).LJLZ;
        if (c6lo2 != null) {
            InterfaceC135405Tc interfaceC135405Tc2 = c6lo2.LJLILLLLZI;
            if (interfaceC135405Tc2 != null) {
                interfaceC135405Tc2.LIZIZ();
            }
            ((C158706Ks) iDlS62S0100000_2.l0).getUiActions().LIZ.invoke(C78857UxB.LJJIIJ(1476788239, "bpea-start_when_click"));
            ((C158706Ks) iDlS62S0100000_2.l0).LJLILLLLZI.hu("click");
            return;
        }
        o.LJIJI("audioRecordStartButton");
        throw null;
    }

    public static final void LIZ$13(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        if (!((EditAudioRecordScene) iDlS62S0100000_2.l0).clickable) {
            return;
        }
        int id = v.getId();
        if (id == R.id.m1h) {
            ((EditAudioRecordScene) iDlS62S0100000_2.l0).cancel();
            return;
        }
        if (id == R.id.mij) {
            ((EditAudioRecordScene) iDlS62S0100000_2.l0).save();
            return;
        }
        if (id == R.id.n9k) {
            EditAudioRecordScene.pause$default((EditAudioRecordScene) iDlS62S0100000_2.l0, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_VIDEO_LAYOUT, EnumC158826Le.USER_OPERATION), 3, null);
            return;
        }
        if (id == R.id.af2) {
            ((EditAudioRecordScene) iDlS62S0100000_2.l0).backRecord();
            return;
        }
        if (id != R.id.f8p) {
            return;
        }
        EditAudioRecordScene editAudioRecordScene = (EditAudioRecordScene) iDlS62S0100000_2.l0;
        if (editAudioRecordScene.isPaused) {
            return;
        }
        editAudioRecordScene.start(false, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.AUDIO_START_RECORD_PLAY, HX4.EDIT));
        ((EditAudioRecordScene) iDlS62S0100000_2.l0).doLoudnessBalance();
    }

    public static final void LIZ$14(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        EditAudioRecordScene editAudioRecordScene = (EditAudioRecordScene) iDlS62S0100000_2.l0;
        if (editAudioRecordScene.audioRecordStartButtonShortClicking) {
            editAudioRecordScene.setAudioRecordStartButtonShortClicking(false);
            C6KU c6ku = ((EditAudioRecordScene) iDlS62S0100000_2.l0).audioRecordStartButton;
            if (c6ku != null) {
                C6KT c6kt = c6ku.LJLILLLLZI;
                if (c6kt != null) {
                    c6kt.LJLJJI.end();
                    c6kt.LJLJI.start();
                    EditAudioRecordScene.pause$default((EditAudioRecordScene) iDlS62S0100000_2.l0, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_CLICK_RECORD, EnumC158826Le.USER_OPERATION), 3, null);
                    ((EditAudioRecordScene) iDlS62S0100000_2.l0).recordDubEnd("click");
                    return;
                }
                o.LJIJI("centerView");
                throw null;
            }
            o.LJIJI("audioRecordStartButton");
            throw null;
        }
        if (editAudioRecordScene.isPaused) {
            return;
        }
        editAudioRecordScene.setAudioRecordStartButtonShortClicking(true);
        C6KU c6ku2 = ((EditAudioRecordScene) iDlS62S0100000_2.l0).audioRecordStartButton;
        if (c6ku2 != null) {
            C6KT c6kt2 = c6ku2.LJLILLLLZI;
            if (c6kt2 != null) {
                c6kt2.LJLJI.end();
                c6kt2.LJLJJI.start();
                ((EditAudioRecordScene) iDlS62S0100000_2.l0).start(true, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.AUDIO_START_RECORD_START, HX4.EDIT));
                ((EditAudioRecordScene) iDlS62S0100000_2.l0).recordDubStart("click");
                return;
            }
            o.LJIJI("centerView");
            throw null;
        }
        o.LJIJI("audioRecordStartButton");
        throw null;
    }

    public static final void LIZ$15(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        ((InterfaceC65784Pro) iDlS62S0100000_2.l0).invoke();
    }

    public static final void LIZ$16(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        InterfaceC158456Jt hintTextStateChanged = ((C158326Jg) iDlS62S0100000_2.l0).getHintTextStateChanged();
        if (hintTextStateChanged != null) {
            hintTextStateChanged.LIZIZ();
        }
        final C158326Jg c158326Jg = (C158326Jg) iDlS62S0100000_2.l0;
        c158326Jg.LJLLLL = 2;
        C158396Jn c158396Jn = c158326Jg.LJLJI;
        if (c158396Jn != null) {
            c158396Jn.clearFocus();
            c158326Jg.LJI();
            c158326Jg.LJLLJ = System.currentTimeMillis();
            DialogC158506Jy dialogC158506Jy = new DialogC158506Jy(c158326Jg.getContext(), c158326Jg.LJLLJ);
            c158326Jg.LJLL = dialogC158506Jy;
            dialogC158506Jy.LJLJL = c158326Jg.LJLLL;
            InterfaceC158496Jx interfaceC158496Jx = c158326Jg.LJZ;
            if (interfaceC158496Jx != null) {
                C158396Jn c158396Jn2 = c158326Jg.LJLJI;
                if (c158396Jn2 != null) {
                    interfaceC158496Jx.LIZ(String.valueOf(c158396Jn2.getText()));
                } else {
                    o.LJIJI("edLiveTitle");
                    throw null;
                }
            }
            DialogC158506Jy dialogC158506Jy2 = c158326Jg.LJLL;
            if (dialogC158506Jy2 != null) {
                dialogC158506Jy2.LJLJJLL = new C158436Jr(c158326Jg, dialogC158506Jy2);
                if (!new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/shortvideo/edit/infosticker/interact/livecountdown/datepick/LiveCDDatePickerDialog", "show", dialogC158506Jy2, new Object[0], "void", new C65300Pk0(false, "()V", "6969313825273385901")).LIZ) {
                    dialogC158506Jy2.show();
                }
            }
            DialogC158506Jy dialogC158506Jy3 = c158326Jg.LJLL;
            if (dialogC158506Jy3 != null) {
                C6K8 c6k8 = new C6K8() { // from class: X.6Ji
                    @Override // X.C6K8
                    public final void LIZ(long j, String str, String str2, String str3, String str4) {
                        C43588H8u.LIZLLL(str, "days", str2, "hours", str3, "minutes", str4, "seconds");
                        C158326Jg.this.setSelectTimeMiles(j);
                        C158326Jg.this.LJII(str, str2, str3, str4, false);
                        InterfaceC158496Jx liveCDEditStateListener = C158326Jg.this.getLiveCDEditStateListener();
                        if (liveCDEditStateListener != null) {
                            C158396Jn c158396Jn3 = C158326Jg.this.LJLJI;
                            if (c158396Jn3 != null) {
                                liveCDEditStateListener.LIZ(String.valueOf(c158396Jn3.getText()));
                            } else {
                                o.LJIJI("edLiveTitle");
                                throw null;
                            }
                        }
                    }
                };
                C158516Jz c158516Jz = (C158516Jz) dialogC158506Jy3.LJLJJI.getValue();
                if (c158516Jz != null) {
                    c158516Jz.setDateChangedListener(c6k8);
                }
            }
            ((C158326Jg) iDlS62S0100000_2.l0).LIZIZ();
            return;
        }
        o.LJIJI("edLiveTitle");
        throw null;
    }

    public static final void LIZ$17(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        C6Y2 c6y2 = ((VEChooseVideoCoverFragment) iDlS62S0100000_2.l0).LJLLL;
        if (c6y2 == null) {
            return;
        }
        VideoPublishEditModel LIZLLL = c6y2.LIZLLL();
        InterfaceC153045zY editor = ((VEChooseVideoCoverFragment) iDlS62S0100000_2.l0).LJLLL.getEditor();
        boolean wl = ((VEChooseVideoCoverFragment) iDlS62S0100000_2.l0).wl();
        EffectTextModel effectTextModel = new EffectTextModel();
        C6VO LJFF = C60903NvH.LJIIJJI().LJFF();
        editor.LLILZ();
        editor.LLILZ();
        LJFF.LIZ(LIZLLL, effectTextModel, wl, true, new AObjectS80S0300000_2(iDlS62S0100000_2, effectTextModel, LIZLLL, 0));
    }

    public static final void LIZ$18(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        ((VEChooseVideoCoverFragment) iDlS62S0100000_2.l0).Dl(null);
    }

    public static final void LIZ$19(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        View view = ((C1551967f) iDlS62S0100000_2.l0).LJZL;
        if (view != null) {
            view.performClick();
        }
        View.OnClickListener onClickListener = ((C1551967f) iDlS62S0100000_2.l0).LLJJIJIIJIL;
        if (onClickListener != null) {
            onClickListener.onClick(v);
        }
    }

    public static final void LIZ$2(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        H7B.LIZ("VEVideoPublishEditActivity nextStep OnClick");
        ((InterfaceC143655kP) ((AnonymousClass611) iDlS62S0100000_2.l0).LJLJJI.getValue()).Ru();
    }

    public static final void LIZ$20(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        ((InterfaceC65784Pro) iDlS62S0100000_2.l0).invoke();
    }

    public static final void LIZ$21(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        ((C159286My) iDlS62S0100000_2.l0).LLJILJIL();
    }

    public static final void LIZ$22(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        ((C159286My) iDlS62S0100000_2.l0).LLJILJILJ();
        ((C159286My) iDlS62S0100000_2.l0).getEditPreviewApi().lN();
        C159286My c159286My = (C159286My) iDlS62S0100000_2.l0;
        InterfaceC145815nt interfaceC145815nt = (InterfaceC145815nt) c159286My.LLD.LIZ(c159286My, C159286My.LLIIIJ[0]);
        if (interfaceC145815nt != null) {
            interfaceC145815nt.ap("start quick Publish");
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C159286My) iDlS62S0100000_2.l0).LJLIL.LJIIIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        } else {
            o.LJIJI("quickPost");
            throw null;
        }
    }

    public static final void LIZ$23(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C159286My) iDlS62S0100000_2.l0).LJLIL.LJIIJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        } else {
            o.LJIJI("clickEditorPro");
            throw null;
        }
    }

    public static final void LIZ$24(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        InterfaceC150615vd interfaceC150615vd;
        InterfaceC163006aW publishService = C60903NvH.LJIIJJI().getPublishService();
        if (publishService.LJJIII(((C159286My) iDlS62S0100000_2.l0).getEditModel())) {
            if (H7R.LJJJJL(((C159286My) iDlS62S0100000_2.l0).getEditModel())) {
                InterfaceC143655kP editPreviewApi = ((C159286My) iDlS62S0100000_2.l0).getEditPreviewApi();
                if ((editPreviewApi instanceof InterfaceC150615vd) && (interfaceC150615vd = (InterfaceC150615vd) editPreviewApi) != null) {
                    interfaceC150615vd.L80().setValue(new ARunnableS21S0200000_2(publishService, (C159286My) iDlS62S0100000_2.l0, 22));
                    return;
                }
                return;
            }
            C159286My c159286My = (C159286My) iDlS62S0100000_2.l0;
            C6F2 c6f2 = (C6F2) c159286My.LLF.LIZ(c159286My, C159286My.LLIIIJ[2]);
            if (c6f2 == null) {
                return;
            }
            c6f2.LLJILJILJ(new Runnable() { // from class: X.6N0
                @Override // java.lang.Runnable
                public final void run() {
                }
            }, new ARunnableS21S0200000_2(publishService, (C159286My) iDlS62S0100000_2.l0, 23));
        }
    }

    public static final void LIZ$25(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        String str;
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(((AnonymousClass605) iDlS62S0100000_2.l0).LLJILJIL().creativeModel.musicBuzModel);
        if (extractAVMusic != null) {
            AnonymousClass605 anonymousClass605 = (AnonymousClass605) iDlS62S0100000_2.l0;
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", anonymousClass605.LLJILJIL().getCreationId());
            FlowDataMusicInfo flowDataMusicInfo = anonymousClass605.LLJILJIL().creativeFlowData.getFlowDataMusicInfo();
            if (flowDataMusicInfo != null && flowDataMusicInfo.isSelectedByAuto()) {
                str = "auto";
            } else {
                str = "manual";
            }
            c145995oB.LJI("music_selected_method", str);
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("music_id", anonymousClass605.LLJILJIL().getMusicId());
            c145995oB.LJI("music_edited_from", extractAVMusic.getEditFrom());
            c145995oB.LJI("enter_method", "entrance_icon");
            c145995oB.LIZ(0, "is_editor_pro");
            VideoPublishEditModel LLJILJIL = anonymousClass605.LLJILJIL();
            if (C78685UuP.LJJJZ(LLJILJIL.getMusicOriginWithCheck())) {
                c145995oB.LIZLLL("music_selected_from", LLJILJIL.getMusicOriginWithCheck());
            }
            FMX.LJIIL("unselect_music", c145995oB.LIZ);
            C145995oB c145995oB2 = new C145995oB();
            c145995oB2.LJI("music_selected_from", anonymousClass605.LJLLJ);
            c145995oB2.LJI("music_id", anonymousClass605.LJLLILLLL);
            c145995oB2.LJI("enter_from", "video_edit_page");
            c145995oB2.LJI("type", "unselect");
            c145995oB2.LIZIZ(System.currentTimeMillis() - anonymousClass605.LJLLL, "duration");
            FMX.LJIIL("show_music_title_duration", c145995oB2.LIZ);
            anonymousClass605.LJLLL = -1L;
        }
        AnonymousClass632.LIZIZ(((AnonymousClass605) iDlS62S0100000_2.l0).getSceneContext());
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((AnonymousClass605) iDlS62S0100000_2.l0).LJLILLLLZI.LJIIIZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        } else {
            o.LJIJI("clearMusic");
            throw null;
        }
    }

    public static final void LIZ$26(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(((AnonymousClass605) iDlS62S0100000_2.l0).LLJILJIL().creativeModel.musicBuzModel);
        if (extractAVMusic != null) {
            AnonymousClass605 anonymousClass605 = (AnonymousClass605) iDlS62S0100000_2.l0;
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("creation_id", anonymousClass605.LLJILJIL().getCreationId());
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("music_id", anonymousClass605.LLJILJIL().getMusicId());
            c145995oB.LJI("music_edited_from", extractAVMusic.getEditFrom());
            c145995oB.LJI("enter_method", "entrance_icon");
            c145995oB.LIZ(0, "is_editor_pro");
            FMX.LJIIL("edit_music", c145995oB.LIZ);
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((AnonymousClass605) iDlS62S0100000_2.l0).LJLILLLLZI.LJIIJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        } else {
            o.LJIJI("cutMusic");
            throw null;
        }
    }

    public static final void LIZ$27(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        AnonymousClass632.LIZIZ(((AnonymousClass605) iDlS62S0100000_2.l0).getSceneContext());
        if (C79004UzY.LJJIJL(((AnonymousClass605) iDlS62S0100000_2.l0).LLJILJIL().canvasVideoData)) {
            if (MusicBeanUtilKt.extractAVMusic(((AnonymousClass605) iDlS62S0100000_2.l0).LLJILJIL().creativeModel.musicBuzModel) == null) {
                C5S1 c5s1 = new C5S1(((AnonymousClass605) iDlS62S0100000_2.l0).requireSceneContext());
                c5s1.LIZJ(R.string.qb_);
                c5s1.LJ();
                return;
            } else {
                InterfaceC145455nJ interfaceC145455nJ = (InterfaceC145455nJ) ((AnonymousClass605) iDlS62S0100000_2.l0).LJLJLLL.getValue();
                if (interfaceC145455nJ == null) {
                    return;
                }
                interfaceC145455nJ.show();
                return;
            }
        }
        C41658GWo.LIZLLL().LJFF = C78983UzD.LJJJJJL(((AnonymousClass605) iDlS62S0100000_2.l0).LLJILJIL());
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((AnonymousClass605) iDlS62S0100000_2.l0).LJLILLLLZI.LJIIIIZZ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        } else {
            o.LJIJI("openMusicPanel");
            throw null;
        }
    }

    public static final void LIZ$28(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        if (view != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(((AnonymousClass605) iDlS62S0100000_2.l0).getResources().getText(R.string.qb_).toString());
            creativeToastBuilder.duration(3000L);
            C78915Uy7.LJJIJ(view, 3008, creativeToastBuilder);
        }
    }

    public static final void LIZ$29(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        C6LY c6ly = ((C6LV) iDlS62S0100000_2.l0).LJLLILLLL;
        if (c6ly != null) {
            c6ly.LLFZ(null);
        }
    }

    public static final void LIZ$3(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        C143635kN.LIZ((InterfaceC143655kP) ((C61B) iDlS62S0100000_2.l0).LJLLI.getValue());
    }

    public static final void LIZ$30(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        boolean z;
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = ((C139205dE) iDlS62S0100000_2.l0).getUiActions().LJLJJI;
        C6LV c6lv = ((C139205dE) iDlS62S0100000_2.l0).LJLILLLLZI;
        if (c6lv != null) {
            View view2 = c6lv.LJLIL;
            if (view2 != null) {
                if (view2.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC88472Yns.invoke(Boolean.valueOf(z));
                return;
            }
            o.LJIJI("playView");
            throw null;
        }
        o.LJIJI("ttsPanelView");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
    
        if (r1 != 4) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
    
        if (r0 != 2) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$31(com.ss.android.ugc.aweme.views.IDlS62S0100000_2 r9, android.view.View r10) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.views.IDlS62S0100000_2.LIZ$31(com.ss.android.ugc.aweme.views.IDlS62S0100000_2, android.view.View):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$32(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        int i;
        o.LJIIIZ(v, "v");
        InlineCaptionFragment inlineCaptionFragment = (InlineCaptionFragment) iDlS62S0100000_2.l0;
        TuxIconView tuxIconView = inlineCaptionFragment.LLIFFJFJJ;
        if (tuxIconView != null) {
            int i2 = 0;
            if (o.LJ(v, tuxIconView)) {
                C69W c69w = inlineCaptionFragment.LLILII;
                if (c69w != null) {
                    int i3 = c69w.LJLILLLLZI;
                    if (i3 >= 0) {
                        i2 = i3;
                    }
                    CaptionUtterance captionUtterance = (CaptionUtterance) ORZ.LJLLLLLL(i2, c69w.LJLIL);
                    if (captionUtterance != null) {
                        i = captionUtterance.LIZLLL().length();
                    } else {
                        i = -1;
                    }
                    inlineCaptionFragment.vm(i2, i, "click_adjust_icon");
                    return;
                }
                o.LJIJI("mSubtitleAdapter");
                throw null;
            }
            TuxIconView tuxIconView2 = inlineCaptionFragment.LLIIII;
            if (tuxIconView2 != null) {
                if (o.LJ(v, tuxIconView2)) {
                    H78.LIZ("InlineCaptionFragment -> click delete");
                    ActivityC45651qj mo49getActivity = inlineCaptionFragment.mo49getActivity();
                    o.LJI(mo49getActivity);
                    C26227ARb c26227ARb = new C26227ARb(mo49getActivity);
                    c26227ARb.LIZ(R.string.chd);
                    UC0.LIZJ(c26227ARb, new AqS168S0100000_2(inlineCaptionFragment, 595));
                    c26227ARb.LJI().LIZLLL();
                    return;
                }
                TuxIconView tuxIconView3 = inlineCaptionFragment.LLII;
                if (tuxIconView3 != null) {
                    if (o.LJ(v, tuxIconView3)) {
                        VideoPublishEditModel em = inlineCaptionFragment.em();
                        if (em != null) {
                            FMX.LJIIL("click_change_text_style", H8F.LJIILJJIL(1, em, ((InlineCaptionViewModel) inlineCaptionFragment.Ml()).gv0(inlineCaptionFragment.LLILLIZIL)).LIZ);
                        }
                        C69W c69w2 = inlineCaptionFragment.LLILII;
                        if (c69w2 != null) {
                            int i4 = c69w2.LJLILLLLZI;
                            if (i4 <= 0) {
                                i4 = 1;
                            }
                            EditorProContext Jl = inlineCaptionFragment.Jl();
                            if (i4 % 2 != 0) {
                                InlineCaptionViewModel inlineCaptionViewModel = (InlineCaptionViewModel) inlineCaptionFragment.Ml();
                                C69W c69w3 = inlineCaptionFragment.LLILII;
                                if (c69w3 != null) {
                                    inlineCaptionViewModel.hv0(((CaptionUtterance) ListProtector.get(c69w3.LJLIL, i4)).LIZIZ(), Jl);
                                    return;
                                } else {
                                    o.LJIJI("mSubtitleAdapter");
                                    throw null;
                                }
                            }
                            InlineCaptionViewModel inlineCaptionViewModel2 = (InlineCaptionViewModel) inlineCaptionFragment.Ml();
                            C69W c69w4 = inlineCaptionFragment.LLILII;
                            if (c69w4 != null) {
                                inlineCaptionViewModel2.hv0(((CaptionUtterance) ListProtector.get(c69w4.LJLIL, i4 - 1)).LIZIZ(), Jl);
                                return;
                            } else {
                                o.LJIJI("mSubtitleAdapter");
                                throw null;
                            }
                        }
                        o.LJIJI("mSubtitleAdapter");
                        throw null;
                    }
                    LinearLayout linearLayout = inlineCaptionFragment.LLD;
                    if (linearLayout != null) {
                        if (!o.LJ(v, linearLayout)) {
                            return;
                        }
                        VideoPublishEditModel em2 = inlineCaptionFragment.em();
                        if (em2 != null) {
                            FMX.LJIIL("click_change_create_caption_language", H8F.LJIILJJIL(1, em2, ((InlineCaptionViewModel) inlineCaptionFragment.Ml()).gv0(inlineCaptionFragment.LLILLIZIL)).LIZ);
                        }
                        if (AnonymousClass636.LJJI(C79057V0z.LJJI(inlineCaptionFragment.Jl())) && !C138615cH.LIZ(C79057V0z.LJJI(inlineCaptionFragment.Jl()), inlineCaptionFragment.em())) {
                            ActivityC45651qj mo49getActivity2 = inlineCaptionFragment.mo49getActivity();
                            if (mo49getActivity2 == null) {
                                return;
                            }
                            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                            String string = inlineCaptionFragment.getString(R.string.fmf);
                            o.LJIIIIZZ(string, "getString(R.string.edito…ion_language_error_toast)");
                            creativeToastBuilder.message(string);
                            C78915Uy7.LJJIIZI(mo49getActivity2, 3027, creativeToastBuilder);
                            return;
                        }
                        Context context = inlineCaptionFragment.getContext();
                        o.LJI(context);
                        if (!C48203Ivv.LJ(context)) {
                            ActivityC45651qj mo49getActivity3 = inlineCaptionFragment.mo49getActivity();
                            if (mo49getActivity3 == null) {
                                return;
                            }
                            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                            String string2 = inlineCaptionFragment.getString(R.string.bxi);
                            o.LJIIIIZZ(string2, "getString(R.string.auto_…toin_network_unavailable)");
                            creativeToastBuilder2.message(string2);
                            C78915Uy7.LJJIIZI(mo49getActivity3, 6001, creativeToastBuilder2);
                            return;
                        }
                        if (C152535yj.LIZIZ() == null) {
                            return;
                        }
                        inlineCaptionFragment.Jl().getPlayer().pause();
                        H78.LIZ("InlineCaptionFragment -> showLanguageList");
                        InlineCaptionViewModel inlineCaptionViewModel3 = (InlineCaptionViewModel) inlineCaptionFragment.Ml();
                        String currentLanguage = inlineCaptionFragment.LLILLIZIL;
                        FragmentManager fragmentManager = inlineCaptionFragment.getFragmentManager();
                        ActivityC45651qj requireActivity = inlineCaptionFragment.requireActivity();
                        o.LJIIIIZZ(requireActivity, "requireActivity()");
                        inlineCaptionViewModel3.getClass();
                        o.LJIIIZ(currentLanguage, "currentLanguage");
                        if (inlineCaptionViewModel3.LJLJI == null) {
                            inlineCaptionViewModel3.LJLJI = C152535yj.LIZJ();
                        }
                        ArrayList arrayList = new ArrayList();
                        List<LanguageDetail> list = inlineCaptionViewModel3.LJLJI;
                        if (list != null) {
                            for (LanguageDetail languageDetail : list) {
                                String str = languageDetail.localName;
                                arrayList.add(new C253179wf(str, o.LJ(str, currentLanguage), languageDetail, 2));
                            }
                        }
                        C152605yq c152605yq = inlineCaptionViewModel3.LJLJJI;
                        C235119Kp c235119Kp = new C235119Kp();
                        C9KF c9kf = new C9KF();
                        String string3 = requireActivity.getString(R.string.chg);
                        o.LJIIIIZZ(string3, "activity.getString(R.str…g.caption_language_title)");
                        c9kf.LIZJ = string3;
                        c235119Kp.LIZJ = c9kf;
                        C234529Ii LIZJ = s1.LIZJ();
                        LIZJ.LIZJ = R.raw.icon_x_mark_small;
                        LIZJ.LIZIZ(new AqS152S0100000_2(inlineCaptionViewModel3, 959));
                        c235119Kp.LIZIZ(LIZJ);
                        c235119Kp.LIZLLL = true;
                        TuxSingleSelectionSheet tuxSingleSelectionSheet = c152605yq.LIZ;
                        tuxSingleSelectionSheet.LJLLI = c235119Kp;
                        tuxSingleSelectionSheet.LJLLILLLL = 0;
                        tuxSingleSelectionSheet.LJLLL = arrayList;
                        AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(inlineCaptionViewModel3, 596);
                        TuxSingleSelectionSheet tuxSingleSelectionSheet2 = c152605yq.LIZ;
                        tuxSingleSelectionSheet2.LJLLLL = aqS168S0100000_2;
                        if (fragmentManager == null) {
                            return;
                        }
                        tuxSingleSelectionSheet2.show(fragmentManager, (String) null);
                        return;
                    }
                    o.LJIJI("mLanguageLayout");
                    throw null;
                }
                o.LJIJI("mIvFont");
                throw null;
            }
            o.LJIJI("mIvDelete");
            throw null;
        }
        o.LJIJI("mIvEdit");
        throw null;
    }

    public static final void LIZ$33(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        ((C60N) iDlS62S0100000_2.l0).LLJILJIL();
    }

    public static final void LIZ$34(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        ((C153175zl) iDlS62S0100000_2.l0).LLJJIII();
    }

    public static final void LIZ$35(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        C43150Gwc.LIZLLL("camera_start");
        ((C153175zl) iDlS62S0100000_2.l0).LLJJIII();
    }

    public static final void LIZ$36(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        ((C145955o7) iDlS62S0100000_2.l0).LLJILJIL();
    }

    public static final void LIZ$37(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        C143635kN.LIZ((InterfaceC143655kP) ((C143625kM) iDlS62S0100000_2.l0).LJLJI.getValue());
    }

    public static final void LIZ$38(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        String str;
        o.LJIIIZ(v, "v");
        C1539662m c1539662m = (C1539662m) iDlS62S0100000_2.l0;
        c1539662m.getClass();
        int i = 3;
        if (AnonymousClass699.LIZIZ().LIZIZ.LJLIL) {
            int i2 = c1539662m.LJLJL;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                }
            } else {
                i = 4;
            }
            c1539662m.LJLJL = i;
        } else {
            int i3 = c1539662m.LJLJL;
            if (i3 != 1) {
                if (i3 != 2) {
                    i = 1;
                }
            } else {
                i = 2;
            }
            c1539662m.LJLJL = i;
        }
        c1539662m.LIZLLL();
        C1551667c c1551667c = c1539662m.LJLJI;
        o.LJI(c1551667c);
        c1551667c.LJIIIIZZ(c1539662m.LJLJL, c1539662m.LJLL);
        int i4 = c1539662m.LJLJL;
        c1539662m.LJLJLJ = i4;
        InterfaceC139695e1 interfaceC139695e1 = c1539662m.LLFF;
        if (interfaceC139695e1 != null) {
            if (c1539662m.LLIIL) {
                str = "caption";
            } else {
                str = "text";
            }
            interfaceC139695e1.LJIIIIZZ(i4, 1, str, null);
        }
        ((C1539662m) iDlS62S0100000_2.l0).LLFII = "1";
    }

    public static final void LIZ$39(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        String str;
        String obj;
        C145995oB c145995oB = new C145995oB();
        VideoPublishEditModel videoPublishEditModel = ((FTCVideoPublishFragment) iDlS62S0100000_2.l0).LJLIL;
        if (videoPublishEditModel != null) {
            c145995oB.LJI("creation_id", videoPublishEditModel.getCreationId());
            VideoPublishEditModel videoPublishEditModel2 = ((FTCVideoPublishFragment) iDlS62S0100000_2.l0).LJLIL;
            if (videoPublishEditModel2 != null) {
                int i = videoPublishEditModel2.draftId;
                if (i != 0) {
                    c145995oB.LIZ(i, "draft_id");
                }
                c145995oB.LIZLLL("enter_from", "video_edit_page");
                c145995oB.LIZLLL("shoot_entrance", "direct_shoot");
                c145995oB.LIZLLL("shoot_way", "direct_shoot");
                FMX.LJIIL("click_save", c145995oB.LIZ);
                Editable text = ((C19K) ((FTCVideoPublishFragment) iDlS62S0100000_2.l0)._$_findCachedViewById(R.id.czk)).getText();
                if (text == null || (obj = text.toString()) == null || (str = s.LJZI(obj).toString()) == null) {
                    str = "";
                }
                VideoPublishEditModel videoPublishEditModel3 = ((FTCVideoPublishFragment) iDlS62S0100000_2.l0).LJLIL;
                if (videoPublishEditModel3 != null) {
                    videoPublishEditModel3.setTitle(str);
                    final FTCVideoPublishFragment fTCVideoPublishFragment = (FTCVideoPublishFragment) iDlS62S0100000_2.l0;
                    if (fTCVideoPublishFragment.LJLJLJ == null) {
                        ActivityC45651qj requireActivity = fTCVideoPublishFragment.requireActivity();
                        o.LJIIIIZZ(requireActivity, "requireActivity()");
                        DialogC254009y0 dialogC254009y0 = new DialogC254009y0(requireActivity);
                        dialogC254009y0.setCancelable(false);
                        fTCVideoPublishFragment.LJLJLJ = dialogC254009y0;
                    }
                    DialogC254009y0 dialogC254009y02 = fTCVideoPublishFragment.LJLJLJ;
                    if (dialogC254009y02 != null && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/shortvideo/widget/StatusLoadingDialog", "show", dialogC254009y02, new Object[0], "void", new C65300Pk0(false, "()V", "5610467799285873165")).LIZ) {
                        dialogC254009y02.show();
                    }
                    GI1 gi1 = new GI1() { // from class: X.6Z4
                        @Override // X.GI1
                        public final InterfaceC88472Yns<AwemeDraft, C76800UCe> LIZ() {
                            return null;
                        }

                        @Override // X.GI1
                        public final void LIZIZ(C142535ib c142535ib) {
                            FTCVideoPublishFragment fTCVideoPublishFragment2 = FTCVideoPublishFragment.this;
                            fTCVideoPublishFragment2.LJIJ();
                            VideoPublishEditModel videoPublishEditModel4 = fTCVideoPublishFragment2.LJLIL;
                            if (videoPublishEditModel4 != null) {
                                Iterator<EditVideoSegment> it = videoPublishEditModel4.getPreviewInfo().getVideoList().iterator();
                                long j = 0;
                                while (it.hasNext()) {
                                    j += it.next().getVideoFileInfo().getDuration() / 1000;
                                }
                                C145995oB LIZ = UFE.LIZ(j, "duration");
                                VideoPublishEditModel videoPublishEditModel5 = fTCVideoPublishFragment2.LJLIL;
                                if (videoPublishEditModel5 != null) {
                                    LIZ.LJI("creation_id", videoPublishEditModel5.getCreationId());
                                    LIZ.LJI("shoot_way", "direct_shoot");
                                    LIZ.LJI("enter_from", "personal_homepage");
                                    LIZ.LJI("shoot_entrance", "direct_shoot");
                                    VideoPublishEditModel videoPublishEditModel6 = fTCVideoPublishFragment2.LJLIL;
                                    if (videoPublishEditModel6 != null) {
                                        LIZ.LJI("prop_list", videoPublishEditModel6.mStickerID);
                                        VideoPublishEditModel videoPublishEditModel7 = fTCVideoPublishFragment2.LJLIL;
                                        if (videoPublishEditModel7 != null) {
                                            LIZ.LJI("effect_list", videoPublishEditModel7.getEditEffectListStr());
                                            VideoPublishEditModel videoPublishEditModel8 = fTCVideoPublishFragment2.LJLIL;
                                            if (videoPublishEditModel8 != null) {
                                                LIZ.LJI("filter_list", videoPublishEditModel8.mCurFilterIds);
                                                FMX.LJIIL("video_save_end", LIZ.LIZ);
                                                VideoPublishEditModel videoPublishEditModel9 = fTCVideoPublishFragment2.LJLIL;
                                                if (videoPublishEditModel9 != null) {
                                                    if (videoPublishEditModel9.creativeModel.draftInfoModel.isDraft) {
                                                        C2U8.LIZ(new C6Z5(1));
                                                    } else {
                                                        C2U8.LIZ(new C6Z5(2));
                                                    }
                                                    SmartRoute buildRoute = SmartRouter.buildRoute(fTCVideoPublishFragment2.mo49getActivity(), "//kids/main");
                                                    buildRoute.withParam("key_init_page_index", 4);
                                                    buildRoute.open();
                                                    H78.LIZ("NewKidsMode, Publish SaveDraft and goto KidsMain.");
                                                    C2U8.LIZ(new C6Z6());
                                                    C2U8.LIZ(new IEvent() { // from class: X.6Z7
                                                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                                        public final /* synthetic */ IEvent post() {
                                                            C2U8.LIZ(this);
                                                            return this;
                                                        }

                                                        @Override // com.ss.android.ugc.governance.eventbus.IEvent
                                                        public final /* synthetic */ IEvent postSticky() {
                                                            C2U8.LIZIZ(this);
                                                            return this;
                                                        }
                                                    });
                                                    Intent intent = new Intent();
                                                    intent.putExtra("publish result", "PublishActivity success");
                                                    ActivityC45651qj mo49getActivity = fTCVideoPublishFragment2.mo49getActivity();
                                                    if (mo49getActivity != null) {
                                                        mo49getActivity.setResult(-1, intent);
                                                    }
                                                    ActivityC45651qj mo49getActivity2 = fTCVideoPublishFragment2.mo49getActivity();
                                                    if (mo49getActivity2 != null) {
                                                        mo49getActivity2.finish();
                                                    }
                                                    fTCVideoPublishFragment2.requireActivity().overridePendingTransition(0, R.anim.y);
                                                    return;
                                                }
                                                o.LJIJI("mModel");
                                                throw null;
                                            }
                                            o.LJIJI("mModel");
                                            throw null;
                                        }
                                        o.LJIJI("mModel");
                                        throw null;
                                    }
                                    o.LJIJI("mModel");
                                    throw null;
                                }
                                o.LJIJI("mModel");
                                throw null;
                            }
                            o.LJIJI("mModel");
                            throw null;
                        }

                        @Override // X.GI1
                        public final void LIZJ(C142535ib c142535ib) {
                            FTCVideoPublishFragment fTCVideoPublishFragment2 = FTCVideoPublishFragment.this;
                            boolean LJIJ = C30581Hy.LJIJ(c142535ib.LJLIL);
                            fTCVideoPublishFragment2.LJIJ();
                            if (LJIJ) {
                                C5S1 c5s1 = new C5S1(C44172HVg.LIZ);
                                c5s1.LIZLLL(fTCVideoPublishFragment2.getString(R.string.ez8));
                                c5s1.LJ();
                            } else {
                                C5S1 c5s12 = new C5S1(C44172HVg.LIZ);
                                c5s12.LIZLLL(fTCVideoPublishFragment2.getString(R.string.ez9));
                                c5s12.LJ();
                            }
                        }
                    };
                    VideoPublishEditModel videoPublishEditModel4 = fTCVideoPublishFragment.LJLIL;
                    if (videoPublishEditModel4 != null) {
                        GI3.LJII(new G8P(new C41021G8b(videoPublishEditModel4, new GLI("FTCVideoPublishFragment", 0)), gi1));
                        return;
                    } else {
                        o.LJIJI("mModel");
                        throw null;
                    }
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    public static final void LIZ$4(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        C43150Gwc.LIZLLL("camera_start");
        C143635kN.LIZ((InterfaceC143655kP) ((C61B) iDlS62S0100000_2.l0).LJLLI.getValue());
    }

    public static final void LIZ$40(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        ActivityC45651qj requireActivity = ((FTCVideoPublishFragment) iDlS62S0100000_2.l0).requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        VideoPublishEditModel videoPublishEditModel = ((FTCVideoPublishFragment) iDlS62S0100000_2.l0).LJLIL;
        if (videoPublishEditModel != null) {
            Intent intent = new Intent(requireActivity, (Class<?>) FTCChooseCoverActivity.class);
            intent.addFlags(536870912);
            intent.addFlags(67108864);
            C78866UxK.LJJLIIIJLLLLLLLZ(intent, videoPublishEditModel);
            C16880lQ.LJI(requireActivity, intent, 4);
            requireActivity.overridePendingTransition(R.anim.x, R.anim.y);
            C145995oB c145995oB = new C145995oB();
            VideoPublishEditModel videoPublishEditModel2 = ((FTCVideoPublishFragment) iDlS62S0100000_2.l0).LJLIL;
            if (videoPublishEditModel2 != null) {
                c145995oB.LJI("creation_id", videoPublishEditModel2.getCreationId());
                c145995oB.LJI("enter_from", "video_post_page");
                VideoPublishEditModel videoPublishEditModel3 = ((FTCVideoPublishFragment) iDlS62S0100000_2.l0).LJLIL;
                if (videoPublishEditModel3 != null) {
                    int i = videoPublishEditModel3.draftId;
                    if (i != 0) {
                        c145995oB.LIZ(i, "draft_id");
                    }
                    FMX.LJIIL("select_cover", c145995oB.LIZ);
                    C145995oB c145995oB2 = new C145995oB();
                    VideoPublishEditModel videoPublishEditModel4 = ((FTCVideoPublishFragment) iDlS62S0100000_2.l0).LJLIL;
                    if (videoPublishEditModel4 != null) {
                        c145995oB2.LJI("creation_id", videoPublishEditModel4.getCreationId());
                        c145995oB2.LJI("enter_from", "video_edit_page");
                        c145995oB2.LJI("shoot_entrance", "direct_shoot");
                        c145995oB2.LJI("shoot_way", "direct_shoot");
                        FMX.LJIIL("cover_click", c145995oB2.LIZ);
                        return;
                    }
                    o.LJIJI("mModel");
                    throw null;
                }
                o.LJIJI("mModel");
                throw null;
            }
            o.LJIJI("mModel");
            throw null;
        }
        o.LJIJI("mModel");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$41(com.ss.android.ugc.aweme.views.IDlS62S0100000_2 r10, android.view.View r11) {
        /*
            com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder r1 = new com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder
            r1.<init>()
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment r0 = (com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment) r0
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r0.addObserver(r1)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment r0 = (com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment) r0
            r4 = 2131369114(0x7f0a1c9a, float:1.8358197E38)
            android.view.View r5 = r0._$_findCachedViewById(r4)
            java.lang.String r3 = "ivCover"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r3)
            r7 = 1
            r5.buildDrawingCache(r7)
            r6 = 0
            r9 = 0
            X.FaE r2 = X.C37203Eit.LIZJ     // Catch: X.Q0C -> L41
            java.lang.String r1 = "bpea-get_video_cover_ftc"
            r0 = 1476435971(0x5800a003, float:5.6569893E14)
            X.UxG r0 = X.C78857UxB.LJJIIJ(r0, r1)     // Catch: X.Q0C -> L41
            r2.getClass()     // Catch: X.Q0C -> L41
            android.graphics.Bitmap r1 = X.C39214FaE.LIZIZ(r5, r0)     // Catch: X.Q0C -> L41
            if (r1 == 0) goto L41
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565     // Catch: X.Q0C -> L41
            android.graphics.Bitmap r2 = r1.copy(r0, r6)     // Catch: X.Q0C -> L41
            goto L42
        L41:
            r2 = r9
        L42:
            r5.destroyDrawingCache()
            java.lang.Object r1 = r10.l0
            com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment r1 = (com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment) r1
            android.graphics.Bitmap r0 = r1.LJLJJL
            if (r0 == 0) goto L4e
            r2 = r0
        L4e:
            com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder.LJLIL = r2
            X.1qj r5 = r1.requireActivity()
            java.lang.String r0 = "requireActivity()"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r0)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment r0 = (com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment) r0
            android.view.View r8 = r0._$_findCachedViewById(r4)
            kotlin.jvm.internal.o.LJIIIIZZ(r8, r3)
            java.lang.Object r1 = r10.l0
            com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment r1 = (com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment) r1
            r0 = 2131378696(0x7f0a4208, float:1.8377632E38)
            android.view.View r4 = r1._$_findCachedViewById(r0)
            java.lang.String r0 = "tvChooseCover"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment r0 = (com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishFragment) r0
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r0.LJLIL
            if (r1 == 0) goto Lb1
            android.content.Intent r3 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity> r0 = com.ss.android.ugc.aweme.ftc.pages.FTCVideoPublishPreviewActivity.class
            r3.<init>(r5, r0)
            X.H7R.LJJLIIJ(r3, r1)
            java.lang.String r1 = "transition_view_v1"
            X.C16360ka.LJIJJLI(r8, r1)
            java.lang.String r0 = "transition_view_v2"
            X.C16360ka.LJIJJLI(r4, r0)
            X.0iV r2 = new X.0iV
            r2.<init>(r8, r1)
            X.0iV r1 = new X.0iV
            r1.<init>(r4, r0)
            r0 = 2
            X.0iV[] r0 = new X.C15070iV[r0]
            r0[r6] = r2
            r0[r7] = r1
            X.1AT r0 = X.C020506f.LIZJ(r5, r0)
            android.os.Bundle r0 = r0.LIZLLL()
            X.C78598Ut0.LJIJJ(r3, r5)
            r5.startActivity(r3, r0)
            return
        Lb1:
            java.lang.String r0 = "mModel"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.views.IDlS62S0100000_2.LIZ$41(com.ss.android.ugc.aweme.views.IDlS62S0100000_2, android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01c4, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0132, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$42(com.ss.android.ugc.aweme.views.IDlS62S0100000_2 r22, android.view.View r23) {
        /*
            Method dump skipped, instructions count: 1455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.views.IDlS62S0100000_2.LIZ$42(com.ss.android.ugc.aweme.views.IDlS62S0100000_2, android.view.View):void");
    }

    public static final void LIZ$43(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        AnonymousClass635 LJIIIIZZ;
        o.LJIIIZ(v, "v");
        C6OE c6oe = ((C6OC) iDlS62S0100000_2.l0).LIZJ.LIZLLL;
        int i = 0;
        if (c6oe != null && (LJIIIIZZ = c6oe.LJIIIIZZ()) != null && LJIIIIZZ.LJIJI) {
            C6OC c6oc = (C6OC) iDlS62S0100000_2.l0;
            if (!c6oc.LJ) {
                c6oc.LIZJ.LIZLLL.LIZJ(c6oc.LIZIZ.getContext());
                return;
            }
        }
        C6O9 c6o9 = (C6O9) ((C6OC) iDlS62S0100000_2.l0).LIZLLL.getValue();
        if (c6o9 != null) {
            C6OE c6oe2 = c6o9.LIZJ.LIZLLL;
            if (c6oe2 != null) {
                i = c6oe2.LJ(c6o9.LJI.LJ);
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf == null || valueOf.intValue() != 0) {
                return;
            }
            ((C6OC) iDlS62S0100000_2.l0).LIZJ.LJII.LJLIL.invoke();
        }
    }

    public static final void LIZ$44(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        C6OA c6oa = ((C6OC) iDlS62S0100000_2.l0).LIZJ;
        C6OE c6oe = c6oa.LIZLLL;
        if (c6oe != null) {
            c6oe.LJIIJ(c6oa.LIZJ.LJ);
        }
        ((C6OC) iDlS62S0100000_2.l0).LIZJ();
    }

    public static final void LIZ$45(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C158246Iy) iDlS62S0100000_2.l0).LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LIZ$46(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        C173516rT c173516rT = (C173516rT) iDlS62S0100000_2.l0;
        InterfaceC173506rS interfaceC173506rS = c173516rT.LJLILLLLZI;
        if (interfaceC173506rS != null) {
            interfaceC173506rS.LIZ(c173516rT.getAdapterPosition(), v);
        }
    }

    public static final void LIZ$47(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        String str;
        C1545664u c1545664u = (C1545664u) iDlS62S0100000_2.l0;
        c1545664u.getClass();
        if (AnonymousClass699.LIZIZ().LIZIZ.LJLIL) {
            int i = c1545664u.LJLLJ;
            if (i == 1) {
                c1545664u.LJLLJ = 4;
            } else if (i == 4) {
                c1545664u.LJLLJ = 2;
            } else if (i == 2) {
                c1545664u.LJLLJ = 3;
            } else {
                c1545664u.LJLLJ = 1;
            }
        } else {
            int i2 = c1545664u.LJLLJ;
            if (i2 == 1) {
                c1545664u.LJLLJ = 2;
            } else if (i2 == 2) {
                c1545664u.LJLLJ = 3;
            } else {
                c1545664u.LJLLJ = 1;
            }
        }
        c1545664u.LJIJJ();
        c1545664u.LJLJI.LJIILJJIL(c1545664u.LJLLJ, c1545664u.LJLLLLLL);
        int i3 = c1545664u.LJLLJ;
        c1545664u.LJLLL = i3;
        InterfaceC139695e1 interfaceC139695e1 = c1545664u.LLIIIL;
        if (interfaceC139695e1 != null) {
            if (c1545664u.LLILZLL) {
                str = "caption";
            } else {
                str = "text";
            }
            interfaceC139695e1.LJIIIIZZ(i3, 0, str, null);
        }
    }

    public static final void LIZ$48(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        ((ViewOnClickListenerC1556568z) iDlS62S0100000_2.l0).onClick(v);
    }

    public static final void LIZ$49(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        ((C6DB) iDlS62S0100000_2.l0).LJ();
        C6GI c6gi = ((C6DB) iDlS62S0100000_2.l0).LIZIZ;
        if (c6gi != null) {
            c6gi.LJIIIIZZ();
        }
    }

    public static final void LIZ$5(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        C1545664u c1545664u = (C1545664u) iDlS62S0100000_2.l0;
        AnonymousClass654 anonymousClass654 = c1545664u.LLJIJIL;
        if (anonymousClass654 != null) {
            anonymousClass654.LIZ(C68W.LJII(c1545664u.getTextWrapList()), ((C1545664u) iDlS62S0100000_2.l0).LLFFF);
        }
    }

    public static final void LIZ$50(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        ((C6DB) iDlS62S0100000_2.l0).LJ();
        C6GI c6gi = ((C6DB) iDlS62S0100000_2.l0).LIZIZ;
        if (c6gi != null) {
            c6gi.LJIIIIZZ();
        }
    }

    public static final void LIZ$51(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        C82573Wav c82573Wav = (C82573Wav) iDlS62S0100000_2.l0;
        int i = c82573Wav.LLIILZL;
        if (i == 2) {
            Activity activity = c82573Wav.mActivity;
            if (activity != null) {
                activity.onBackPressed();
                return;
            }
            return;
        }
        if (c82573Wav.LLIIJI) {
            return;
        }
        if (i == 1) {
            EditPreviewStickerViewModel editPreviewStickerViewModel = c82573Wav.LJLZ;
            if (editPreviewStickerViewModel != null) {
                C73318Sq2 c73318Sq2 = editPreviewStickerViewModel.LJLJJLL;
                if (c73318Sq2 != null) {
                    c73318Sq2.dispose();
                }
                editPreviewStickerViewModel.setState(C82580Wb2.LJLIL);
                return;
            }
            o.LJIJI("viewModel");
            throw null;
        }
        Activity activity2 = c82573Wav.mActivity;
        if (activity2 == null) {
            return;
        }
        activity2.onBackPressed();
    }

    public static final void LIZ$52(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        C168986kA c168986kA = (C168986kA) iDlS62S0100000_2.l0;
        InterfaceC168976k9 interfaceC168976k9 = c168986kA.LJLJJL;
        if (interfaceC168976k9 != null) {
            interfaceC168976k9.LIZ(c168986kA.getBindingAdapterPosition(), v);
        }
    }

    public static final void LIZ$53(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        C8H9 c8h9 = ((ViewOnClickListenerC158316Jf) iDlS62S0100000_2.l0).LJLJJI;
        if (c8h9 != null) {
            c8h9.performClick();
        }
    }

    public static final void LIZ$54(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        C158326Jg mChild;
        DialogC158506Jy dialogC158506Jy;
        if (((ViewOnClickListenerC158316Jf) iDlS62S0100000_2.l0).LIZLLL() && (mChild = ((ViewOnClickListenerC158316Jf) iDlS62S0100000_2.l0).getMChild()) != null && (dialogC158506Jy = mChild.LJLL) != null) {
            dialogC158506Jy.dismiss();
        }
    }

    public static final void LIZ$55(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        String str;
        C6JV liveCDStickerController;
        C158326Jg mChild = ((ViewOnClickListenerC158316Jf) iDlS62S0100000_2.l0).getMChild();
        if (mChild != null) {
            mChild.LJI();
        }
        Context context = ((ViewOnClickListenerC158316Jf) iDlS62S0100000_2.l0).getContext();
        o.LJIIIIZZ(context, "context");
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJ(R.string.dwy);
        c26227ARb.LIZ(R.string.dwv);
        UC0.LIZJ(c26227ARb, new AqS168S0100000_2((ViewOnClickListenerC158316Jf) iDlS62S0100000_2.l0, 625));
        c26227ARb.LJI().LIZLLL();
        C158296Jd c158296Jd = ((ViewOnClickListenerC158316Jf) iDlS62S0100000_2.l0).LLF;
        if (c158296Jd != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_from", "video_edit_page");
            c145995oB.LJI("enter_method", "click_main_panel");
            c145995oB.LJI("shoot_way", c158296Jd.LIZ.mShootWay);
            c145995oB.LJI("creation_id", c158296Jd.LIZ.getCreationId());
            c145995oB.LJI("content_source", H8F.LJI(c158296Jd.LIZ));
            c145995oB.LJI("content_type", H8F.LJII(c158296Jd.LIZ));
            ViewOnClickListenerC158316Jf viewOnClickListenerC158316Jf = c158296Jd.LIZIZ;
            if (viewOnClickListenerC158316Jf != null && (liveCDStickerController = viewOnClickListenerC158316Jf.getLiveCDStickerController()) != null) {
                str = liveCDStickerController.LLII;
            } else {
                str = null;
            }
            c145995oB.LJI("prop_id", str);
            FMX.LJIIL("livesdk_cd_sticker_cancel", c145995oB.LIZ);
        }
    }

    public static final void LIZ$6(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        if (C165166e0.LIZ()) {
            C1545664u c1545664u = (C1545664u) iDlS62S0100000_2.l0;
            if (!c1545664u.LLIL) {
                AnonymousClass632.LIZ(c1545664u.LJLIL);
                return;
            }
        }
        C1545664u c1545664u2 = (C1545664u) iDlS62S0100000_2.l0;
        AnonymousClass654 anonymousClass654 = c1545664u2.LLJIJIL;
        if (anonymousClass654 != null) {
            anonymousClass654.LIZ(C68W.LJII(c1545664u2.getTextWrapList()), ((C1545664u) iDlS62S0100000_2.l0).LLFFF);
        }
    }

    public static final void LIZ$7(IDlS62S0100000_2 iDlS62S0100000_2, View view) {
        C1545664u c1545664u = (C1545664u) iDlS62S0100000_2.l0;
        AnonymousClass654 anonymousClass654 = c1545664u.LLJIJIL;
        if (anonymousClass654 != null) {
            anonymousClass654.LIZIZ(c1545664u.LLFFF);
        }
        ((C1545664u) iDlS62S0100000_2.l0).LJIJ();
    }

    public static final void LIZ$8(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        if (!((FTCEditAudioRecordScene) iDlS62S0100000_2.l0).clickable) {
            return;
        }
        int id = v.getId();
        if (id == R.id.m1h) {
            ((FTCEditAudioRecordScene) iDlS62S0100000_2.l0).cancel();
            return;
        }
        if (id == R.id.mij) {
            ((FTCEditAudioRecordScene) iDlS62S0100000_2.l0).save();
            return;
        }
        if (id == R.id.n9k) {
            FTCEditAudioRecordScene.pause$default((FTCEditAudioRecordScene) iDlS62S0100000_2.l0, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_FTC_VIDEO_LAYOUT, EnumC158826Le.USER_OPERATION), 3, null);
        } else if (id == R.id.af2) {
            ((FTCEditAudioRecordScene) iDlS62S0100000_2.l0).backRecord();
        } else {
            if (id != R.id.f8p) {
                return;
            }
            ((FTCEditAudioRecordScene) iDlS62S0100000_2.l0).start(false, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.FTC_AUDIO_START_RECORD_PLAY, HX4.EDIT));
        }
    }

    public static final void LIZ$9(IDlS62S0100000_2 iDlS62S0100000_2, View v) {
        o.LJIIIZ(v, "v");
        FTCEditAudioRecordScene fTCEditAudioRecordScene = (FTCEditAudioRecordScene) iDlS62S0100000_2.l0;
        if (fTCEditAudioRecordScene.audioRecordStartButtonShortClicking) {
            fTCEditAudioRecordScene.audioRecordStartButtonShortClicking = false;
            C6KY c6ky = fTCEditAudioRecordScene.audioRecordStartButton;
            if (c6ky != null) {
                C6KZ c6kz = c6ky.LJLILLLLZI;
                if (c6kz != null) {
                    c6kz.LJLJJI.end();
                    c6kz.LJLJI.start();
                    FTCEditAudioRecordScene.pause$default((FTCEditAudioRecordScene) iDlS62S0100000_2.l0, false, 0, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.STOP_AUDIO_FTC_CLICK_RECORD, EnumC158826Le.USER_OPERATION), 3, null);
                    ((FTCEditAudioRecordScene) iDlS62S0100000_2.l0).recordDubEnd("click");
                    return;
                }
                o.LJIJI("centerView");
                throw null;
            }
            o.LJIJI("audioRecordStartButton");
            throw null;
        }
        if (fTCEditAudioRecordScene.isPaused) {
            return;
        }
        fTCEditAudioRecordScene.audioRecordStartButtonShortClicking = true;
        C6KY c6ky2 = fTCEditAudioRecordScene.audioRecordStartButton;
        if (c6ky2 != null) {
            C6KZ c6kz2 = c6ky2.LJLILLLLZI;
            if (c6kz2 != null) {
                c6kz2.LJLJI.end();
                c6kz2.LJLJJI.start();
                ((FTCEditAudioRecordScene) iDlS62S0100000_2.l0).start(true, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.FTC_AUDIO_START_RECORD_START, HX4.EDIT));
                ((FTCEditAudioRecordScene) iDlS62S0100000_2.l0).recordDubStart("click");
                return;
            }
            o.LJIJI("centerView");
            throw null;
        }
        o.LJIJI("audioRecordStartButton");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDlS62S0100000_2(Object obj, AbstractC156316Bn<Object> abstractC156316Bn) {
        this.$t = abstractC156316Bn;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDlS62S0100000_2(Object obj, int i, int i2) {
        super(600L);
        this.$t = i;
        this.l0 = obj;
    }
}
