package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.base.viewmodel.PreviewStickerViewModel;
import com.ss.ugc.android.editor.components.base.api.IAlbumService;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.track.SeekInfo;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127774zt extends C43001GuD {
    public final /* synthetic */ C127604zc LJLJJL;
    public final /* synthetic */ C58D LJLJJLL;

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onClickBlankArea() {
        C5DC c5dc;
        if (!((Boolean) C79057V0z.LJJIII(this.LJLJJL.LJIILL(), "is_bottom_popup_menu_showing", Boolean.FALSE)).booleanValue() && (c5dc = this.LJLJJL.LLIIIILZ) != null) {
            c5dc.LIZ(true);
        }
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onClipMainToMinDuration() {
        this.LJLJJL.LJJIL();
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onMainTrackDragBegin() {
        C53H LJIILIIL;
        C53H LJIILIIL2;
        this.LJLJJL.LJIILL().getPlayer().pause();
        EnumC127484zQ enumC127484zQ = EnumC127484zQ.DEFAULT_EDIT_MODE;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) C5BA.LIZ(enumC127484zQ, bool)).booleanValue();
        C50Q LJIILLIIL = this.LJLJJL.LJIILLIIL();
        if (LJIILLIIL != null && (LJIILIIL2 = LJIILLIIL.LJIILIIL()) != null) {
            LJIILIIL2.LJFF(!booleanValue);
        }
        C50Q LJIILLIIL2 = this.LJLJJL.LJIILLIIL();
        if (LJIILLIIL2 != null && (LJIILIIL = LJIILLIIL2.LJIILIIL()) != null) {
            LJIILIIL.LJ(false);
        }
        AqS168S0100000_2 aqS168S0100000_2 = this.LJLJJL.LLI;
        if (aqS168S0100000_2 != null) {
            aqS168S0100000_2.invoke(bool);
        }
        C51P.LIZ(this.LJLJJL.LJIILJJIL(), false, true);
        InterfaceC1278950f LJIJJ = this.LJLJJL.LJIJJ();
        if (LJIJJ != null) {
            LJIJJ.LJLJLLL(false);
        }
        Boolean bool2 = (Boolean) C79057V0z.LJJIIJ(this.LJLJJL.LJIILL(), "event_open_audio_record");
        if (bool2 != null && bool2.booleanValue()) {
            AnonymousClass520.LIZ(this.LJLJJL.LJLIL);
        }
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onScaleBegin() {
        this.LJLJJL.LJIILL().getPlayer().pause();
        this.LJLJJL.LLFZ = this.LJLJJLL.getScale();
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onAddResourceClick() {
        VideoPublishEditModel LJJIIZ = C127604zc.LJJIIZ();
        if (LJJIIZ != null) {
            EditorProContext editorContext = this.LJLJJL.LJIILL();
            o.LJIIIZ(editorContext, "editorContext");
            FMX.LJIIL("click_edit_add_material", C5QW.LJFF(LJJIIZ, editorContext).LIZ);
        }
        C79057V0z.LJJ(this.LJLJJL.LJIILL()).LJ().setExtra("enter_add_video_time", String.valueOf(System.currentTimeMillis()));
        C127604zc c127604zc = this.LJLJJL;
        ActivityC45651qj activity = c127604zc.LJLIL;
        AqS149S0200000_2 aqS149S0200000_2 = new AqS149S0200000_2(c127604zc, this.LJLJJLL, 59);
        o.LJIIIZ(activity, "activity");
        EditorProContext.Companion.getClass();
        C79057V0z.LJJJJL(C124994vP.LIZ(), "is_showing_album_page", Boolean.TRUE);
        IAlbumService iAlbumService = (IAlbumService) C127804zw.LIZ.getValue();
        if (iAlbumService != null) {
            iAlbumService.startSelectMedia(activity, 3001, new AnonymousClass508(388743680L, 35, null, EnumC127814zx.ADD, false, 52), aqS149S0200000_2);
        }
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onScaleEnd() {
        VideoPublishEditModel LJJIIZ = C127604zc.LJJIIZ();
        if (LJJIIZ != null) {
            C58D c58d = this.LJLJJLL;
            C127604zc c127604zc = this.LJLJJL;
            double scale = c58d.getScale();
            double d = c127604zc.LLFZ;
            if (scale >= d) {
                C5QW.LJJJI(LJJIIZ, c127604zc.LJIILL(), true);
            } else {
                if (scale >= d) {
                    return;
                }
                C5QW.LJJJI(LJJIIZ, c127604zc.LJIILL(), false);
            }
        }
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onMoveFail(NLETrackSlot nLETrackSlot) {
        int i;
        NLETrack trackBySlot = this.LJLJJL.LJIJI().getTrackBySlot(nLETrackSlot);
        if (trackBySlot != null) {
            C127604zc c127604zc = this.LJLJJL;
            if (C79057V0z.LJJIJIL(trackBySlot) == EnumC123864ta.VIDEO && !trackBySlot.LJIIJ()) {
                int intValue = ((Number) C5BA.LIZ(EnumC127484zQ.MAX_PIP_TRACK_COUNT, Integer.MAX_VALUE)).intValue();
                List<NLETrack> LJIJI = C124574uj.LJIJI(C79057V0z.LJJI(c127604zc.LJIILL()));
                int i2 = 0;
                if (LJIJI != null && !LJIJI.isEmpty()) {
                    Iterator<NLETrack> it = LJIJI.iterator();
                    if (it.hasNext()) {
                        int layer = it.next().getLayer();
                        while (it.hasNext()) {
                            int layer2 = it.next().getLayer();
                            if (layer < layer2) {
                                layer = layer2;
                            }
                        }
                        i2 = layer + 1;
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                if (i2 == intValue) {
                    C78920UyC.LIZLLL(R.string.saf, c127604zc.LJLIL, 1065);
                    return;
                }
                return;
            }
            if (!C124574uj.LJJJIL(trackBySlot)) {
                return;
            }
            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ORZ.LLFII(C124574uj.LJIILIIL(C79057V0z.LJJI(c127604zc.LJIILL())));
            if (nLETimeSpaceNode != null) {
                i = nLETimeSpaceNode.getLayer();
            } else {
                i = -1;
            }
            if (i + 1 < C123254sb.LIZ) {
                return;
            }
            C78920UyC.LIZLLL(R.string.flf, c127604zc.LJLIL, 1065);
        }
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onUnableToSetTransition(int i) {
        ActivityC45651qj activityC45651qj = this.LJLJJL.LJLIL;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        String string = this.LJLJJL.LJLIL.getString(R.string.sjd);
        o.LJIIIIZZ(string, "activity.getString(com.s…ro_addclip_toast_cantadd)");
        creativeToastBuilder.message(string);
        C78915Uy7.LJJIIZI(activityC45651qj, 1067, creativeToastBuilder);
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onVideoPositionChanged(SeekInfo seekInfo) {
        o.LJIIIZ(seekInfo, "seekInfo");
        boolean z = false;
        if (seekInfo.isFromUser()) {
            if (this.LJLJJL.LJIILL().getPlayer().isPlaying()) {
                InterfaceC127784zu player = this.LJLJJL.LJIILL().getPlayer();
                if (player != null) {
                    player.p0(false);
                }
                this.LJLJJL.LJIILL().getPlayer().pause();
            }
            long LJJII = C79057V0z.LJJII(this.LJLJJL.LJIILL());
            if (AnonymousClass504.LIZ) {
                if (seekInfo.isEnd()) {
                    if (seekInfo.getSeekFlag() == 1) {
                        this.LJLJJL.LJIILL().getPlayer().seek(LJJII);
                    } else if (seekInfo.getSeekFlag() == 6) {
                        this.LJLJJL.LJIILL().getPlayer().ca(LJJII, 0.0f, 0.0f);
                        this.LJLJJL.LJIILL().getPlayer().B3();
                    } else {
                        this.LJLJJL.LJIILL().getPlayer().ca(LJJII, 0.0f, 0.0f);
                    }
                    C127764zs.LJJIFFI(this.LJLJJL, Long.valueOf(LJJII), 2);
                } else if (seekInfo.getSeekFlag() == 0) {
                    InterfaceC127784zu player2 = this.LJLJJL.LJIILL().getPlayer();
                    TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                    player2.ca(timeUnit.toMillis(seekInfo.getPosition()), seekInfo.getSeekPxSpeed(), seekInfo.getSeekDurationSpeed());
                    C127764zs.LJJIFFI(this.LJLJJL, Long.valueOf(timeUnit.toMillis(seekInfo.getPosition())), 2);
                } else if (seekInfo.getSeekFlag() == 6) {
                    if (!AnonymousClass504.LIZJ) {
                        this.LJLJJL.LJIILL().getPlayer().ca(TimeUnit.MICROSECONDS.toMillis(seekInfo.getPosition()), seekInfo.getSeekPxSpeed(), seekInfo.getSeekDurationSpeed());
                    }
                    this.LJLJJL.LJIILL().getPlayer().B3();
                    C127764zs.LJJIFFI(this.LJLJJL, Long.valueOf(TimeUnit.MICROSECONDS.toMillis(seekInfo.getPosition())), 2);
                } else {
                    this.LJLJJL.LJIILL().getPlayer().seek(TimeUnit.MICROSECONDS.toMillis(seekInfo.getPosition()));
                    C127764zs.LJJIFFI(this.LJLJJL, null, 3);
                }
            } else if (seekInfo.isEnd()) {
                this.LJLJJL.LJIILL().getPlayer().seek(LJJII);
                C127764zs.LJJIFFI(this.LJLJJL, Long.valueOf(LJJII), 2);
            } else {
                this.LJLJJL.LJIILL().getPlayer().seek(TimeUnit.MICROSECONDS.toMillis(seekInfo.getPosition()));
                C127764zs.LJJIFFI(this.LJLJJL, null, 3);
            }
            long j = 1000;
            if (LJJII <= seekInfo.getPosition() / j) {
                this.LJLJJL.LJJI(Long.valueOf(seekInfo.getPosition() / j), Long.valueOf(seekInfo.getPosition() / j));
            }
        }
        C79057V0z.LJJJJL(this.LJLJJL.LJIILL(), "video_position_event", Long.valueOf(seekInfo.getPosition()));
        InterfaceC1278950f LJIJJ = this.LJLJJL.LJIJJ();
        if (LJIJJ != null) {
            long position = seekInfo.getPosition();
            if (seekInfo.isFromUser() && seekInfo.getSeekFlag() == 0) {
                z = true;
            }
            LJIJJ.Z8(position, z);
        }
        ((PreviewStickerViewModel) this.LJLJJL.LJZ.getValue()).onVideoPositionChange(seekInfo.getPosition());
        if (seekInfo.isFromUser() && seekInfo.isEnd()) {
            InterfaceC127634zf LJJIIZI = this.LJLJJL.LJJIIZI();
            if (LJJIIZI != null) {
                LJJIIZI.Cv(C79057V0z.LJJII(this.LJLJJL.LJIILL()) * 1000);
                return;
            }
            return;
        }
        InterfaceC127634zf LJJIIZI2 = this.LJLJJL.LJJIIZI();
        if (LJJIIZI2 == null) {
            return;
        }
        LJJIIZI2.Cv(seekInfo.getPosition());
    }

    public C127774zt(C127604zc c127604zc, C58D c58d) {
        this.LJLJJL = c127604zc;
        this.LJLJJLL = c58d;
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onAudioMuteClick(boolean z, boolean z2) {
        String str;
        this.LJLJJL.getClass();
        if (z2) {
            C79057V0z.LJJJJL(this.LJLJJL.LJIILL(), "ori_audio_mute_event", Boolean.valueOf(z));
        }
        VideoPublishEditModel LJJIIZ = C127604zc.LJJIIZ();
        if (LJJIIZ != null) {
            EditorProContext editorContext = this.LJLJJL.LJIILL();
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(LJJIIZ, editorContext);
            if (z) {
                str = "on";
            } else {
                str = "off";
            }
            LJFF.LJI("to_status", str);
            FMX.LJIIL("mute_original_sound", LJFF.LIZ);
        }
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onClip(long j, long j2) {
        if (j <= 100) {
            this.LJLJJL.LJJIL();
        }
        if (C124574uj.LJJJJL(this.LJLJJL.LJIILL())) {
            if (this.LJLJJL.LJIILL().getPlayer().isPlaying()) {
                this.LJLJJL.LJIILL().getPlayer().pause();
            }
            this.LJLJJL.LJIILL().getPlayer().seek(j2);
        }
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onMainTrackDragEnd(int i, int i2) {
        String str;
        NLENode nLENode;
        C53H LJIILIIL;
        C53H LJIILIIL2;
        C50Q LJIILLIIL = this.LJLJJL.LJIILLIIL();
        if (LJIILLIIL != null && (LJIILIIL2 = LJIILLIIL.LJIILIIL()) != null) {
            LJIILIIL2.LJFF(true);
        }
        C50Q LJIILLIIL2 = this.LJLJJL.LJIILLIIL();
        if (LJIILLIIL2 != null && (LJIILIIL = LJIILLIIL2.LJIILIIL()) != null) {
            LJIILIIL.LJ(true);
        }
        AqS168S0100000_2 aqS168S0100000_2 = this.LJLJJL.LLI;
        if (aqS168S0100000_2 != null) {
            aqS168S0100000_2.invoke(Boolean.TRUE);
        }
        C51P.LIZ(this.LJLJJL.LJIILJJIL(), true, true);
        InterfaceC1278950f LJIJJ = this.LJLJJL.LJIJJ();
        if (LJIJJ != null) {
            LJIJJ.LJLJLLL(true);
        }
        if (i != i2 && (nLENode = (NLENode) ORZ.LJLLLLLL(i2, this.LJLJJL.LJIILL().getMainTrack().LJIILLIIL())) != null) {
            nLENode.setExtra("is_editorpro_adjust_video_order", "1");
        }
        C1284452i LJIJ = this.LJLJJL.LJIJ();
        if (LJIJ != null) {
            C1284452i.LJIL(LJIJ, false, 3);
        }
        VideoPublishEditModel LJJIIZ = C127604zc.LJJIIZ();
        if (LJJIIZ != null) {
            C127604zc c127604zc = this.LJLJJL;
            int i3 = i + 1;
            String index = String.valueOf(i3);
            EditorProContext editorContext = c127604zc.LJIILL();
            o.LJIIIZ(index, "index");
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(LJJIIZ, editorContext);
            LJFF.LJI("track_type", C5QW.LJIIJ(editorContext));
            LJFF.LJI("material_location", index);
            FMX.LJIIL("long_press_material", LJFF.LIZ);
            String index2 = String.valueOf(i3);
            int i4 = i2 - i;
            EditorProContext editorContext2 = c127604zc.LJIILL();
            o.LJIIIZ(index2, "index");
            o.LJIIIZ(editorContext2, "editorContext");
            C145995oB LJFF2 = C5QW.LJFF(LJJIIZ, editorContext2);
            LJFF2.LJI("track_type", C5QW.LJIIJ(editorContext2));
            LJFF2.LJI("material_location", index2);
            if (i4 > 0) {
                str = "right";
            } else if (i4 < 0) {
                str = "left";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            LJFF2.LJI("action_type", str);
            FMX.LJIIL("move_material", LJFF2.LIZ);
        }
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onTransitionClick(NLETrackSlot segment, NLETrackSlot nextSegment) {
        C1297157f c1297157f;
        C1297157f c1297157f2;
        o.LJIIIZ(segment, "segment");
        o.LJIIIZ(nextSegment, "nextSegment");
        this.LJLJJL.LJIILL().getPlayer().pause();
        C79057V0z.LJJJJL(this.LJLJJL.LJIILL(), "transition_track_slot_click_event", new C125714wZ(segment, nextSegment));
        AnonymousClass516 anonymousClass516 = (AnonymousClass516) C79057V0z.LJJIIJ(this.LJLJJL.LJIILL(), "panel_bounce_event");
        if (anonymousClass516 != null && anonymousClass516.LIZ && o.LJ(anonymousClass516.LIZJ, "video_transition")) {
            C79057V0z.LJJJJL(this.LJLJJL.LJIILL(), "update_transition_select", C76800UCe.LIZ);
            return;
        }
        C127604zc c127604zc = this.LJLJJL;
        c127604zc.getClass();
        if (e1.LIZ(31744, "studio_editor_pro_transition_guide", true, false) && (c1297157f = (C1297157f) c127604zc.LJZI.getValue()) != null && !c1297157f.LJIILL() && (c1297157f2 = (C1297157f) c127604zc.LJZI.getValue()) != null) {
            c1297157f2.LJLJJL.storeBoolean("editor_pro_transition_guide_init", true);
        }
        C1284452i LJIJ = this.LJLJJL.LJIJ();
        if (LJIJ != null) {
            C1284452i.LJIL(LJIJ, false, 3);
        }
        VideoPublishEditModel LJJIIZ = C127604zc.LJJIIZ();
        if (LJJIIZ != null) {
            EditorProContext editorContext = this.LJLJJL.LJIILL();
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(LJJIIZ, editorContext);
            LJFF.LJI("music_id", LJJIIZ.getMusicId());
            LJFF.LJI("enter_from", LJJIIZ.enterFrom);
            LJFF.LIZ(1, "is_editor_pro");
            FMX.LJIIL("choose_transition", LJFF.LIZ);
        }
        C50Q LJIILLIIL = this.LJLJJL.LJIILLIIL();
        if (LJIILLIIL == null) {
            return;
        }
        LJIILLIIL.LJIIIZ();
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void switchPreviewEditType(boolean z, NLETrack nLETrack) {
        int i = C122744rm.LIZ[C79057V0z.LJJIJIL(nLETrack).ordinal()];
        if (i != 1) {
            if (i != 2) {
                InterfaceC1278950f LJIJJ = this.LJLJJL.LJIJJ();
                if (LJIJJ != null) {
                    LJIJJ.Bx();
                    return;
                }
                return;
            }
            InterfaceC1278950f LJIJJ2 = this.LJLJJL.LJIJJ();
            if (LJIJJ2 == null) {
                return;
            }
            LJIJJ2.k6("text_sticker_material");
            return;
        }
        InterfaceC1278950f LJIJJ3 = this.LJLJJL.LJIJJ();
        if (LJIJJ3 == null) {
            return;
        }
        LJIJJ3.k6("video_material");
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onClipEnd(NLETrackSlot slot, long j, long j2) {
        AnonymousClass525 LJI;
        AnonymousClass525 LJI2;
        VideoPublishEditModel LJJIIZ;
        int i;
        o.LJIIIZ(slot, "slot");
        boolean z = true;
        C79057V0z.LJJJJLI(this.LJLJJL.LJIILL(), "track_slot_clip_event", new C125854wn(slot, j, j2), true);
        if (C124574uj.LJJJJJL(this.LJLJJL.LJIILL().getSelectedTrack())) {
            NLESegmentVideo LJJ = NLESegmentVideo.LJJ(slot.LJI());
            if (LJJ == null) {
                return;
            }
            VideoPublishEditModel LJJIIZ2 = C127604zc.LJJIIZ();
            if (LJJIIZ2 != null) {
                C127604zc c127604zc = this.LJLJJL;
                long LJIIL = LJJ.LJIIL();
                long j3 = 1000;
                C5QW.LJJIII(LJIIL / j3, j2 / j3, LJJIIZ2, c127604zc.LJIILL());
            }
        }
        if (C124574uj.LJJJLIIL(this.LJLJJL.LJIILL().getSelectedTrack()) && (LJJIIZ = C127604zc.LJJIIZ()) != null) {
            EditorProContext editorContext = this.LJLJJL.LJIILL();
            o.LJIIIZ(editorContext, "editorContext");
            OSZ LIZJ = C124934vJ.LIZJ(C79057V0z.LJJI(editorContext), false);
            int intValue = ((Number) LIZJ.getFirst()).intValue();
            int intValue2 = ((Number) LIZJ.getSecond()).intValue();
            C145995oB LJFF = H8F.LJFF(LJJIIZ, false, false, 6);
            LJFF.LIZ(1, "is_editor_pro");
            LJFF.LIZIZ(editorContext.getPlayer().s5(), "creation_duration");
            LJFF.LIZ(intValue, "video_cnt");
            LJFF.LIZ(intValue2, "pic_cnt");
            if (intValue + intValue2 > 1) {
                i = 1;
            } else {
                i = 0;
            }
            LJFF.LIZ(i, "is_multi_content");
            FMX.LJIIL("text_duration_adjust", LJFF.LIZ);
        }
        if (C124604um.LJ(slot)) {
            if (this.LJLJJL.LJIILL().getPlayer().s5() - ((slot.getStartTime() + j2) / 1000) < 100) {
                z = false;
            }
            if (z) {
                C50Q LJIILLIIL = this.LJLJJL.LJIILLIIL();
                if (LJIILLIIL != null && (LJI2 = LJIILLIIL.LJI()) != null) {
                    LJI2.LJFF("bottom_item_voiceover_edit_copy");
                    return;
                }
                return;
            }
            C50Q LJIILLIIL2 = this.LJLJJL.LJIILLIIL();
            if (LJIILLIIL2 == null || (LJI = LJIILLIIL2.LJI()) == null) {
                return;
            }
            LJI.LJIIIIZZ("bottom_item_voiceover_edit_copy", false);
        }
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onMainTrackMoveSlot(NLETrackSlot nleTrackSlot, int i, int i2) {
        o.LJIIIZ(nleTrackSlot, "nleTrackSlot");
        long currentTimeMillis = System.currentTimeMillis();
        C79057V0z.LJJJJLI(this.LJLJJL.LJIILL(), "main_track_slot_move_event", new C125864wo(nleTrackSlot, i, i2), false);
        FMX.LJIIL("acc_advanced_edit_move_video_clip_duration", UFE.LIZ(System.currentTimeMillis() - currentTimeMillis, "acc_advanced_edit_move_video_clip_duration").LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStartAndDuration(com.bytedance.ies.nle.editor_jni.NLETrackSlot r18, long r19, long r21, int r23) {
        /*
            r17 = this;
            java.lang.String r0 = "slot"
            r8 = r18
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            long r5 = java.lang.System.currentTimeMillis()
            r4 = r17
            X.4zc r0 = r4.LJLJJL
            com.ss.ugc.android.editor.core.EditorProContext r2 = r0.LJIILL()
            X.4wp r9 = new X.4wp
            r11 = r19
            r7 = r23
            r13 = r21
            r10 = r8
            r15 = r7
            r9.<init>(r10, r11, r13, r15)
            java.lang.String r1 = "main_track_slot_clip_event"
            r0 = 0
            X.C79057V0z.LJJJJLI(r2, r1, r9, r0)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r5
            java.lang.String r1 = "acc_advanced_edit_trim_video_clip_duration"
            X.5oB r0 = X.UFE.LIZ(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.LIZ
            X.FMX.LJIIL(r1, r0)
            boolean r2 = X.C78596Usy.LJJJJI(r8)
            r0 = 0
            if (r2 != 0) goto L6b
            com.bytedance.ies.nle.editor_jni.NLESegment r5 = r8.LJI()
            long r2 = com.bytedance.ies.nle.editor_jni.NLENode.getCPtr(r5)
            long r5 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLESegmentImage_dynamicCast(r2, r5)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 != 0) goto L66
        L4e:
            kotlin.jvm.internal.AqS34S0301000_2 r6 = new kotlin.jvm.internal.AqS34S0301000_2
            X.58D r9 = r4.LJLJJLL
            X.4zc r10 = r4.LJLJJL
            r11 = 1
            r6.<init>(r7, r8, r9, r10, r11)
            X.C2ND.LIZ(r6, r0)
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r8.LJI()
            com.bytedance.ies.nle.editor_jni.NLESegmentVideo r1 = com.bytedance.ies.nle.editor_jni.NLESegmentVideo.LJJ(r0)
            if (r1 != 0) goto L73
            return
        L66:
            com.bytedance.ies.nle.editor_jni.NLESegmentImage r2 = new com.bytedance.ies.nle.editor_jni.NLESegmentImage
            r2.<init>(r5)
        L6b:
            java.lang.String r3 = "is_editorpro_trim_video_length"
            java.lang.String r2 = "1"
            r8.setExtra(r3, r2)
            goto L4e
        L73:
            X.4zc r0 = r4.LJLJJL
            X.5DC r0 = r0.LLIIIILZ
            if (r0 != 0) goto L91
        L79:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r15 = X.C127604zc.LJJIIZ()
            if (r15 == 0) goto L90
            X.4zc r2 = r4.LJLJJL
            long r11 = r1.LJIIL()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r11 = r11 / r0
            com.ss.ugc.android.editor.core.EditorProContext r16 = r2.LJIILL()
            X.C5QW.LJJIII(r11, r13, r15, r16)
        L90:
            return
        L91:
            r0.LJIIIZ()
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C127774zt.onStartAndDuration(com.bytedance.ies.nle.editor_jni.NLETrackSlot, long, long, int):void");
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void updateSelectSlot(NLETrack nLETrack, NLETrackSlot nLETrackSlot, EnumC127354zD style, boolean z) {
        o.LJIIIZ(style, "style");
        if (z && style == EnumC127354zD.CLIP) {
            this.LJLJJL.LJIILL().getPlayer().pause();
        }
        C79057V0z.LJJJJL(this.LJLJJL.LJIILL(), "selected_track_slot_event", new C125674wV(nLETrack, nLETrackSlot, z, 8));
    }

    @Override // com.ss.ugc.android.editor.track.TrackPanelActionListener
    public final void onMove(int i, int i2, NLETrackSlot slot, long j, long j2, long j3, boolean z) {
        C1284452i LJIJ;
        o.LJIIIZ(slot, "slot");
        C79057V0z.LJJJJL(this.LJLJJL.LJIILL(), "track_slot_move_event", new C125924wu(i, i2, slot, j, j2, j3, z));
        if ((NLESegmentTextSticker.LJFF(slot.LJI()) != null || NLESegmentInfoSticker.LJFF(slot.LJI()) != null || C124574uj.LJJJI(slot)) && (LJIJ = this.LJLJJL.LJIJ()) != null) {
            C1284452i.LJIJ(LJIJ, slot, null, false, 30);
        }
    }
}
