package X;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.gamora.editorpro.EditorProScene;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.VideoTransitionFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.VoiceEffectPanelFragment;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.android.vesdk.VEEditor;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.51f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1281551f extends C50A {
    public final EditorProScene LJIIL;
    public final List<String> LJIILIIL;
    public final C62822Ol8 LJIILJJIL;
    public AqS152S0100000_2 LJIILL;

    @Override // X.C52A
    public final boolean LIZ(AnonymousClass523 funcItem) {
        o.LJIIIZ(funcItem, "funcItem");
        return this.LJIILIIL.contains(funcItem.LJ);
    }

    public final void LJIIJJI(boolean z) {
        CreativeInfo creativeInfo;
        NLETrackSlot selectedTrackSlot;
        EditorProContext editorProContext;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr LJIILLIIL;
        Integer valueOf;
        Object obj;
        NLETrackSlot nLETrackSlot;
        boolean z2;
        long j;
        C136695Yb c136695Yb;
        InterfaceC143655kP interfaceC143655kP;
        LiveData<InterfaceC153045zY> Kh;
        InterfaceC143655kP interfaceC143655kP2;
        LiveData<InterfaceC153045zY> Kh2;
        InterfaceC153045zY value;
        boolean z3;
        NLESegmentAudio LIZLLL;
        String str;
        EditorProContext editorProContext2;
        NLETrack mainTrack2;
        VecNLETrackSlotSPtr LJIILLIIL2;
        EditorProContext editorContext = LJI();
        o.LJIIIZ(editorContext, "editorContext");
        VideoPublishEditModel videoPublishEditModel = AnonymousClass569.LIZJ;
        if (videoPublishEditModel == null || (creativeInfo = videoPublishEditModel.creativeInfo) == null || (selectedTrackSlot = editorContext.getSelectedTrackSlot()) == null || !AnonymousClass569.LJIIL || (editorProContext = AnonymousClass569.LIZIZ) == null || (mainTrack = editorProContext.getMainTrack()) == null || (LJIILLIIL = mainTrack.LJIILLIIL()) == null || (valueOf = Integer.valueOf(LJIILLIIL.indexOf(selectedTrackSlot))) == null) {
            return;
        }
        if (valueOf.intValue() == -1 && (editorProContext2 = AnonymousClass569.LIZIZ) != null && (mainTrack2 = editorProContext2.getMainTrack()) != null && (LJIILLIIL2 = mainTrack2.LJIILLIIL()) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJIILLIIL2, 10));
            Iterator<NLETrackSlot> it = LJIILLIIL2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getUUID());
            }
            valueOf = Integer.valueOf(arrayList.indexOf(selectedTrackSlot.getUUID()));
            if (valueOf == null) {
                return;
            }
        }
        int intValue = valueOf.intValue();
        List LJJIJIIJIL = C62814Ol0.LJJIJIIJIL(C79057V0z.LJJI(editorContext), editorContext.getMainTrack());
        MultiEditVideoRecordData LJIIL = C62814Ol0.LJIIL(LJJIJIIJIL, true);
        if (LJIIL == null) {
            return;
        }
        AnonymousClass569.LIZLLL(LJIIL, C79057V0z.LJJI(editorContext));
        RetakeVideoContext retakeVideoContext = new RetakeVideoContext(creativeInfo);
        retakeVideoContext.isFromEditorPro = true;
        retakeVideoContext.isReplace = z;
        retakeVideoContext.recordData = C46104I7o.LJIIJJI(LJIIL);
        retakeVideoContext.retakeIndex = intValue;
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) ListProtector.get(LJIIL.segmentDataList, intValue);
        MultiEditVideoRecordData multiEditVideoRecordData = AnonymousClass569.LIZ;
        if (multiEditVideoRecordData != null) {
            if (!TextUtils.isEmpty(multiEditVideoRecordData.curRecordingDir) || (str = AnonymousClass569.LJIIJJI) == null || str.length() == 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(multiEditVideoRecordData.curRecordingDir);
                String LJFF = JBR.LJFF(LIZ, File.separator, "new", LIZ);
                AnonymousClass569.LJIIJJI = LJFF;
                o.LJIIIZ(LJFF, "<set-?>");
                retakeVideoContext.retakeDir = LJFF;
            } else {
                String str2 = AnonymousClass569.LJIIJJI;
                if (str2 != null) {
                    retakeVideoContext.retakeDir = str2;
                }
            }
        }
        Iterator it2 = ((ArrayList) C32151Nz.LJIJJLI(editorContext)).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                NLETrack nLETrack = (NLETrack) obj;
                if (C124574uj.LJJIL(nLETrack) || C124574uj.LJJJ(nLETrack)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack2 = (NLETrack) obj;
        if (nLETrack2 != null) {
            nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack2.LJIILLIIL());
        } else {
            nLETrackSlot = null;
        }
        long j2 = 0;
        if (nLETrackSlot != null && (LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI())) != null) {
            j2 = 0 + LIZLLL.LJIILIIL();
        }
        if (e1.LIZ(31744, "studio_editor_pro_reshoot_enable_music", true, false) && nLETrackSlot != null) {
            long startTime = selectedTrackSlot.getStartTime() - nLETrackSlot.getStartTime();
            long endTime = selectedTrackSlot.getEndTime() - nLETrackSlot.getEndTime();
            if ((startTime >= 0 || Math.abs(startTime) < 30000) && (endTime <= 0 || Math.abs(endTime) < 30000)) {
                z3 = true;
            } else {
                z3 = false;
            }
            LJIIL.useMusic = z3;
            retakeVideoContext.disableBGM = true ^ z3;
            j = Math.max(0L, startTime) + j2;
        } else {
            for (int i = 0; i < intValue; i++) {
                if (((MultiEditVideoSegmentRecordData) ListProtector.get(LJIIL.segmentDataList, i)).enable) {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = (MultiEditVideoSegmentRecordData) ListProtector.get(LJIIL.segmentDataList, i);
                    j2 = ((multiEditVideoSegmentRecordData2.getEndTime() - multiEditVideoSegmentRecordData2.getStartTime()) * 1000) + j2;
                }
            }
            if (nLETrackSlot != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            retakeVideoContext.disableBGM = z2;
            LJIIL.useMusic = false;
            j = j2;
        }
        retakeVideoContext.start = j / 1000;
        retakeVideoContext.duration = multiEditVideoSegmentRecordData.videoLength / 1000;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
        LJIIL.hasRetake = true;
        multiEditVideoStatusRecordData.currentEditIndex = intValue;
        multiEditVideoStatusRecordData.originalSegments = AnonymousClass569.LJFF;
        multiEditVideoStatusRecordData.restoreSegments = AnonymousClass569.LJI;
        multiEditVideoStatusRecordData.editSegments = AnonymousClass569.LIZ(LJJIJIIJIL, editorContext.getMainTrack());
        multiEditVideoStatusRecordData.curMultiEditVideoRecordData = LJIIL;
        multiEditVideoStatusRecordData.originMultiEditRecordData = AnonymousClass569.LJ;
        multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData = AnonymousClass569.LIZLLL;
        multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData = C6BI.LIZIZ(LJIIL, null);
        multiEditVideoStatusRecordData.recordMusic = AnonymousClass569.LJIIIZ;
        multiEditVideoStatusRecordData.originalMusicStart = AnonymousClass569.LJIIJ;
        retakeVideoContext.multiEditVideoRecordData = multiEditVideoStatusRecordData;
        final VideoPublishEditModel LJII = LJII();
        if (LJII == null) {
            return;
        }
        if (LJII.isStitchMode()) {
            retakeVideoContext.stitchParams = LJII.stitchParams;
        }
        if (C42721Gph.LIZ()) {
            LJIIL(retakeVideoContext);
            C79057V0z.LJJI(LJI()).setExtra("enter_reshoot_video_time", String.valueOf(System.currentTimeMillis()));
        }
        if (LJII.mIsFromDraft) {
            final EditorProScene editorProScene = this.LJIIL;
            o.LJIIIZ(editorProScene, "editorProScene");
            final Intent LIZ2 = C163616bV.LIZ(SceneExtensionsKt.LIZLLL(editorProScene), LJII);
            if (LIZ2 != null) {
                LIZ2.putExtra("retake_video", retakeVideoContext);
                LIZ2.putExtra("retake_shoot_mode", 1);
                LIZ2.putExtra("extra_retake_from_advanced", true);
                if (C138395bv.LIZ() && (c136695Yb = C132385Hm.LIZ) != null && (interfaceC143655kP = c136695Yb.LIZLLL) != null && (Kh = interfaceC143655kP.Kh()) != null && Kh.getValue() != null) {
                    C136695Yb c136695Yb2 = C132385Hm.LIZ;
                    if (c136695Yb2 != null && (interfaceC143655kP2 = c136695Yb2.LIZLLL) != null && (Kh2 = interfaceC143655kP2.Kh()) != null && (value = Kh2.getValue()) != null) {
                        value.LLLIL(new InterfaceC133845Nc() { // from class: X.51g
                            public final /* synthetic */ boolean LIZ = true;

                            @Override // X.InterfaceC133845Nc
                            public final void LIZ() {
                                boolean z4 = this.LIZ;
                                WM7 wm7 = editorProScene;
                                Intent intent = LIZ2;
                                VideoPublishEditModel videoPublishEditModel2 = LJII;
                                if (z4) {
                                    if (intent != null && videoPublishEditModel2 != null) {
                                        C41384GMa.LJII(new GL1(wm7, intent, videoPublishEditModel2));
                                        return;
                                    }
                                    return;
                                }
                                C41384GMa.LJII(new C41355GKx(wm7));
                            }

                            @Override // X.InterfaceC133845Nc
                            public final void LIZIZ() {
                                boolean z4 = this.LIZ;
                                WM7 wm7 = editorProScene;
                                Intent intent = LIZ2;
                                VideoPublishEditModel videoPublishEditModel2 = LJII;
                                if (z4) {
                                    if (intent != null && videoPublishEditModel2 != null) {
                                        C41384GMa.LJII(new GL1(wm7, intent, videoPublishEditModel2));
                                        return;
                                    }
                                    return;
                                }
                                C41384GMa.LJII(new C41355GKx(wm7));
                            }
                        });
                    }
                } else {
                    C41384GMa.LJII(new GL1(editorProScene, LIZ2, LJII));
                }
            }
        } else {
            C41384GMa.LJII(new GL3(this.LIZ, retakeVideoContext, LJII, true));
        }
        if (C42721Gph.LIZ()) {
            return;
        }
        LJIIL(retakeVideoContext);
        C79057V0z.LJJI(LJI()).setExtra("enter_reshoot_video_time", String.valueOf(System.currentTimeMillis()));
    }

    public final void LJIIL(RetakeVideoContext retakeVideoContext) {
        int i;
        InfoStickerModel infoStickerModel;
        Float f;
        EditModelProvider.Companion.getClass();
        EditModelProvider LIZ = C126784yI.LIZ();
        int i2 = retakeVideoContext.retakeIndex;
        EditorProContext editContext = LJI();
        o.LJIIIZ(editContext, "editContext");
        NLETrackSlot selectedTrackSlot = editContext.getSelectedTrackSlot();
        if (selectedTrackSlot != null) {
            i = C124864vC.LIZ(C79057V0z.LJJI(editContext), selectedTrackSlot);
        } else {
            i = -1;
        }
        Integer valueOf = Integer.valueOf(i);
        NLEModel LJJI = C79057V0z.LJJI(LJI());
        String uuid = C79057V0z.LJJ(LJI()).LIZLLL().LIZ().getUUID();
        o.LJIIIIZZ(uuid, "editorContext.getNLEEditor().branch.head.uuid");
        VideoPublishEditModel editModel = LIZ.getEditModel();
        if (editModel != null) {
            infoStickerModel = editModel.infoStickerModel;
        } else {
            infoStickerModel = null;
        }
        C132385Hm.LIZIZ = new C55W(i2, valueOf, LJJI, uuid, infoStickerModel, retakeVideoContext.isReplace);
        C58D c58d = (C58D) this.LJI.getValue();
        if (c58d != null) {
            f = Float.valueOf((float) c58d.getScale());
        } else {
            f = null;
        }
        C132385Hm.LJI = f;
        String newNleData = C79057V0z.LJJ(LJI()).LJIIIIZZ();
        o.LJIIIIZZ(newNleData, "newNleData");
        LIZ.updateNLEModel(newNleData);
        VideoPublishEditModel editModel2 = LIZ.getEditModel();
        if (editModel2 != null) {
            C60903NvH.LJIIJJI().LJIIJ().LJI(editModel2, editModel2.getCreationId(), 1, null);
        }
        C132385Hm.LJ = true;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("before reshoot::retakeCommitId = ");
        LIZ2.append(C79057V0z.LJJ(LJI()).LIZLLL().LIZ().getUUID());
        H7C.LJI(3, "video", "reshoot", X1D.LIZIZ(LIZ2));
        C86793Y4n.LJJIJIIJIL(this.LJIIL).LLJJI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1281551f(EditorProScene editorProScene, NavigationScene navigationScene) {
        super(SceneExtensionsKt.LIZLLL(editorProScene), navigationScene);
        o.LJIIIZ(editorProScene, "editorProScene");
        this.LJIIL = editorProScene;
        this.LJIILIIL = C47261Igj.LJJIJIL("bottom_item_root_edit", "bottom_item_edit_adjust", "bottom_item_edit_split", "bottom_item_edit_speed", "bottom_item_edit_volume", "bottom_item_edit_replace", "bottom_item_edit_copy", "bottom_item_edit_crop", "bottom_item_edit_rotate", "bottom_item_edit_delete", "bottom_item_edit_start_over", "bottom_item_edit_black_slot_delete", "bottom_item_edit_voice_effect", "bottom_item_video_transition", "bottom_item_edit_capcut");
        this.LJIILJJIL = C221108m2.LIZIZ(C1281751h.LJLIL);
    }

    @Override // X.C52A
    public final void LIZIZ(AnonymousClass523 funcItem, View view) {
        VideoPublishEditModel LJII;
        VideoPublishEditModel LJII2;
        VideoPublishEditModel LJII3;
        String str;
        InterfaceC132055Gf interfaceC132055Gf;
        long j;
        o.LJIIIZ(funcItem, "funcItem");
        if (!funcItem.LJFF) {
            return;
        }
        Object LJJIIJ = C79057V0z.LJJIIJ(LJI(), "is_clip_main_track");
        Boolean bool = Boolean.TRUE;
        if (o.LJ(LJJIIJ, bool)) {
            return;
        }
        NLETrackSlot selectedTrackSlot = LJI().getSelectedTrackSlot();
        String str2 = funcItem.LJ;
        boolean z = false;
        String str3 = "1";
        switch (str2.hashCode()) {
            case -1840447557:
                if (!str2.equals("bottom_item_edit_voice_effect")) {
                    return;
                }
                LJI().getPlayer().pause();
                LJ(new VoiceEffectPanelFragment());
                return;
            case -1557094322:
                if (!str2.equals("bottom_item_edit_start_over")) {
                    return;
                }
                LJIIJJI(false);
                VideoPublishEditModel LJII4 = LJII();
                if (LJII4 == null) {
                    return;
                }
                C5QW.LJIJJLI("start_over", LJII4, LJI(), null, null, false, 56);
                return;
            case -1048765334:
                if (!str2.equals("bottom_item_edit_speed")) {
                    return;
                }
                LJI().getPlayer().pause();
                LJIIIZ();
                VideoPublishEditModel LJII5 = LJII();
                if (LJII5 != null) {
                    C5QW.LJIJJLI("speed", LJII5, LJI(), null, null, false, 56);
                }
                if (selectedTrackSlot == null) {
                    return;
                }
                selectedTrackSlot.setExtra("enter_video_speed_time", String.valueOf(System.currentTimeMillis()));
                return;
            case -1048758467:
                if (!str2.equals("bottom_item_edit_split")) {
                    return;
                }
                if (selectedTrackSlot != null) {
                    selectedTrackSlot.setExtra("is_editor_pro_split_used", "true");
                    selectedTrackSlot.setExtra("is_editorpro_split_video", "1");
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (!LJFF().splitClip()) {
                    ((InterfaceC1283852c) this.LJIILJJIL.getValue()).LIZ(view, EnumC1284052e.VIBRATE_NOTIFICATION_ERROR);
                }
                FMX.LJIIL("acc_advanced_edit_split_video_clip_duration", UFE.LIZ(System.currentTimeMillis() - currentTimeMillis, "acc_advanced_edit_split_video_clip_duration").LIZ);
                VideoPublishEditModel LJII6 = LJII();
                if (LJII6 == null) {
                    return;
                }
                C5QW.LJIJJLI("split", LJII6, LJI(), null, null, false, 56);
                return;
            case -871117775:
                if (!str2.equals("bottom_item_video_transition")) {
                    return;
                }
                LJ(new VideoTransitionFragment());
                return;
            case 261771799:
                if (!str2.equals("bottom_item_edit_replace")) {
                    return;
                }
                LJI().getPlayer().pause();
                VideoPublishEditModel LJII7 = LJII();
                if (LJII7 != null) {
                    z = false;
                    C5QW.LJIJJLI("replace", LJII7, LJI(), null, null, false, 56);
                }
                if (selectedTrackSlot == null) {
                    return;
                }
                if (C124574uj.LJJJLZIJ(selectedTrackSlot) || selectedTrackSlot.hasExtra("library_id") || (((LJII = LJII()) != null && LJII.mShootMode == 15) || (((LJII2 = LJII()) != null && LJII2.mShootMode == 17) || ((LJII3 = LJII()) != null && LJII3.mShootMode == 16)))) {
                    float measuredEndTime = (float) (selectedTrackSlot.getMeasuredEndTime() - selectedTrackSlot.getMeasuredStartTime());
                    o.LJIIIIZZ(selectedTrackSlot.LJI(), "curSlot.mainSegment");
                    C127804zw.LIZIZ(this.LIZ, (C124574uj.LJJI(r2) * measuredEndTime) / 1000, z, new AqS152S0100000_2(this, 868));
                    return;
                }
                LJIIJJI(true);
                return;
            case 1074070258:
                if (!str2.equals("bottom_item_edit_copy")) {
                    return;
                }
                LJI().getPlayer().pause();
                VideoPublishEditModel LJII8 = LJII();
                if (LJII8 != null) {
                    C5QW.LJIJJLI("copy", LJII8, LJI(), null, null, false, 56);
                }
                LJFF().slotCopy();
                return;
            case 1074073101:
                if (!str2.equals("bottom_item_edit_crop")) {
                    return;
                }
                LJI().getPlayer().pause();
                VideoPublishEditModel LJII9 = LJII();
                if (LJII9 != null) {
                    C5QW.LJIJJLI("crop", LJII9, LJI(), null, null, false, 56);
                }
                LJIIIIZZ(new AqS168S0100000_2(this, 522));
                return;
            case 1321770956:
                if (!str2.equals("bottom_item_edit_adjust")) {
                    return;
                }
                VideoPublishEditModel LJII10 = LJII();
                if (LJII10 != null) {
                    C5QW.LJIJJLI("adjust", LJII10, LJI(), null, null, false, 56);
                }
                LJI().getPlayer().pause();
                C79057V0z.LJJJJL(LJI(), "show_preview_placeholder", bool);
                C2ND.LIZIZ(new AqS152S0100000_2(this, 870), 50L);
                return;
            case 1376420205:
                if (!str2.equals("bottom_item_edit_capcut")) {
                    return;
                }
                int LIZIZ = C55R.LIZIZ();
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        if (LIZIZ != 3) {
                            str = "";
                        } else {
                            str = "motion_blur";
                        }
                    } else {
                        str = "animation";
                    }
                } else {
                    str = "cutout";
                }
                VideoPublishEditModel LJII11 = LJII();
                if (LJII11 != null) {
                    C5QW.LJIJJLI(str, LJII11, LJI(), null, null, true, 24);
                }
                AqS152S0100000_2 aqS152S0100000_2 = this.LJIILL;
                if (aqS152S0100000_2 == null) {
                    return;
                }
                aqS152S0100000_2.invoke();
                return;
            case 1408626152:
                if (!str2.equals("bottom_item_edit_delete")) {
                    return;
                }
                VideoPublishEditModel LJII12 = LJII();
                if (LJII12 != null) {
                    NLETrackSlot selectedTrackSlot2 = LJI().getSelectedTrackSlot();
                    if (selectedTrackSlot2 == null || !Boolean.parseBoolean(selectedTrackSlot2.getExtra("is_black_frame"))) {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    C5QW.LJIJJLI("delete", LJII12, LJI(), str3, null, false, 48);
                }
                if (C124574uj.LJJJJL(LJI())) {
                    CutViewModel.deleteClip$default(LJFF(), null, null, 3, null);
                } else {
                    NLETrack selectedTrack = LJI().getSelectedTrack();
                    if (selectedTrack == null || selectedTrack.LJIIJ()) {
                        int size = LJI().getMainTrack().LJIILL().size();
                        if (size == 1) {
                            VideoPublishEditModel LJII13 = LJII();
                            if (LJII13 != null) {
                                C5QW.LJJIFFI(LJII13, LJI());
                            }
                            AnonymousClass632.LIZ(this.LIZ);
                            C78920UyC.LIZLLL(R.string.fml, this.LIZ, 1039);
                        } else if (size != 2 || ((interfaceC132055Gf = (InterfaceC132055Gf) this.LJIIJJI.getValue()) != null && !interfaceC132055Gf.LIZJ())) {
                            long currentTimeMillis2 = System.currentTimeMillis();
                            CutViewModel.deleteClip$default(LJFF(), null, null, 3, null);
                            FMX.LJIIL("acc_advanced_edit_delete_video_clip_duration", UFE.LIZ(System.currentTimeMillis() - currentTimeMillis2, "acc_advanced_edit_delete_video_clip_duration").LIZ);
                        } else {
                            NLETrackSlot selectedTrackSlot3 = LJI().getSelectedTrackSlot();
                            if (selectedTrackSlot3 != null) {
                                C26227ARb LIZ = C3AW.LIZ(this.LIZ);
                                LIZ.LJII = false;
                                LIZ.LIZ(R.string.saa);
                                UC0.LIZJ(LIZ, new AqS133S0200000_2(this, selectedTrackSlot3, 123));
                                LIZ.LJI().LIZLLL();
                            }
                        }
                    }
                }
                if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_TRACK_LINKAGE, Boolean.FALSE)).booleanValue()) {
                    return;
                }
                C79057V0z.LJJJJL(LJI(), "check_effect_func_event", C76800UCe.LIZ);
                return;
            case 1818903960:
                if (!str2.equals("bottom_item_edit_rotate")) {
                    return;
                }
                LJI().getPlayer().pause();
                Long l = (Long) C79057V0z.LJJIIJ(LJI(), "video_position_event");
                if (l != null) {
                    l.longValue();
                    long[] jArr = new long[2];
                    LJI().getSelectedSlotTimeRange(jArr);
                    long j2 = jArr[0];
                    long j3 = jArr[1];
                    if (j2 >= l.longValue()) {
                        j = j2 + 1000;
                    } else if (l.longValue() >= j3) {
                        j = j3 - 1000;
                    }
                    if (j != -1) {
                        LJI().getPlayer().M9(j);
                    }
                }
                if (selectedTrackSlot != null) {
                    selectedTrackSlot.setExtra("is_editor_pro_rotate_used", "true");
                    selectedTrackSlot.setExtra("is_editorpro_rotate_video", "1");
                }
                LJFF().rotate();
                LJI().getPlayer().W9(Integer.valueOf(VEEditor.SEEK_MODE.EDITOR_REFRESH_MODE_FOECE.getValue()));
                VideoPublishEditModel LJII14 = LJII();
                if (LJII14 == null) {
                    return;
                }
                C5QW.LJIJJLI("rotate", LJII14, LJI(), null, null, false, 56);
                return;
            case 1933201239:
                if (!str2.equals("bottom_item_edit_volume")) {
                    return;
                }
                LJI().getPlayer().pause();
                LJIIJ();
                VideoPublishEditModel LJII15 = LJII();
                if (LJII15 != null) {
                    C5QW.LJIJJLI("volume", LJII15, LJI(), null, null, false, 56);
                }
                if (selectedTrackSlot == null) {
                    return;
                }
                selectedTrackSlot.setExtra("enter_video_volume_time", String.valueOf(System.currentTimeMillis()));
                return;
            case 2013259375:
                if (!str2.equals("bottom_item_edit_black_slot_delete")) {
                    return;
                }
                C124614un.LIZJ(LJI());
                C79057V0z.LJIILL(LJI(), C6YK.LIZ(new C139795eB(EnumC126814yL.DELETE.getNameId(), null, null, null, null, 30)));
                C79057V0z.LJJJJL(LJI(), "delete_slot_event", new C122684rg(EnumC123864ta.VIDEO, null, null));
                if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_BLACK_SLOT_OPERATE, Boolean.FALSE)).booleanValue()) {
                    C79057V0z.LJJJJL(LJI(), "check_effect_func_event", C76800UCe.LIZ);
                }
                VideoPublishEditModel LJII16 = LJII();
                if (LJII16 == null) {
                    return;
                }
                C5QW.LJIJJLI("delete", LJII16, LJI(), "1", null, false, 48);
                return;
            default:
                return;
        }
    }
}
