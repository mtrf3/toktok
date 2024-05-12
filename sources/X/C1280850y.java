package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.audio.AudioRecordFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.SoundFilterFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.SoundSpeedFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.VoiceEffectPanelFragment;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.android.ugc.gamora.editorpro.soundeffect.ui.SoundEffectFragment;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.50y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1280850y extends AbstractC1282851s {
    public final C55Y LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final String[] LJIIIZ;

    public static final VideoPublishEditModel LJIIIZ() {
        return C132805Jc.LIZIZ(EditModelProvider.Companion);
    }

    public final void LJFF() {
        LJ(new AudioRecordFragment());
        VideoPublishEditModel LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            C145995oB LJII = C5QW.LJII(LJIIIZ);
            LJII.LJI("is_editor_pro", "1");
            FMX.LJIIL("click_dub", LJII.LIZ);
        }
    }

    public final EditorProContext LJIIIIZZ() {
        return (EditorProContext) this.LJFF.getValue();
    }

    public final void LJI() {
        C79057V0z.LJJJJL(LJIIIIZZ(), "event_click_add_music", "click_secondary_menu");
        C79057V0z.LJJI(LJIIIIZZ()).setExtra("enter_select_music_time", String.valueOf(System.currentTimeMillis()));
    }

    public final void LJII() {
        String str;
        String str2;
        VideoPublishEditModel LJIIIZ = LJIIIZ();
        String str3 = "";
        if (LJIIIZ != null) {
            EditorProContext editorContext = LJIIIIZZ();
            NLETrack LJIJI = C32151Nz.LJIJI(LJIIIIZZ());
            if (LJIJI != null) {
                str2 = LJIJI.getExtra("slot_extra_music_id");
            } else {
                str2 = null;
            }
            o.LJIIIZ(editorContext, "editorContext");
            C145995oB LJFF = C5QW.LJFF(LJIIIZ, editorContext);
            if (str2 == null) {
                str2 = "";
            }
            LJFF.LJI("music_id", str2);
            LJFF.LIZ(1, "is_editor_pro");
            FMX.LJIIL("click_sound_effect_entrance", LJFF.LIZ);
        }
        if (!C1B8.LIZJ()) {
            ActivityC45651qj activityC45651qj = this.LIZ;
            VideoPublishEditModel LJIIIZ2 = LJIIIZ();
            if (LJIIIZ2 != null && (str = LJIIIZ2.enterFrom) != null) {
                str3 = str;
            }
            J9P.LIZIZ(activityC45651qj, "video_edit_page", str3, null, new JJ4() { // from class: X.50z
                @Override // X.JJ4
                public final /* synthetic */ void LIZIZ() {
                }

                @Override // X.JJ4
                public final void LIZ() {
                    C1280850y.this.LJ(new SoundEffectFragment());
                    C79057V0z.LJJI(C1280850y.this.LJIIIIZZ()).setExtra("enter_sound_effect_time", String.valueOf(System.currentTimeMillis()));
                }
            });
            return;
        }
        if (!((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_SUBTRACK_OVER_MAIN, Boolean.TRUE)).booleanValue()) {
            if ((C124574uj.LIZLLL(C79057V0z.LJJI(LJIIIIZZ())) - (C79057V0z.LJIJJLI(LJIIIIZZ()) * 1000)) / 1000 < ((Number) C5BA.LIZ(EnumC127484zQ.IMPORT_LIMIT, 100)).intValue()) {
                C78920UyC.LIZLLL(R.string.ca4, this.LIZ, 6007);
                return;
            }
        }
        LJ(new SoundEffectFragment());
        C79057V0z.LJJI(LJIIIIZZ()).setExtra("enter_sound_effect_time", String.valueOf(System.currentTimeMillis()));
    }

    public final void LJIIJ() {
        C79057V0z.LJJJJL(LJIIIIZZ(), "event_click_replace_music", C76800UCe.LIZ);
        VideoPublishEditModel LJIIIZ = LJIIIZ();
        if (LJIIIZ != null) {
            C5QW.LJIJJLI("replace_sound", LJIIIZ, LJIIIIZZ(), null, null, false, 56);
        }
    }

    @Override // X.C52A
    public final boolean LIZ(AnonymousClass523 funcItem) {
        o.LJIIIZ(funcItem, "funcItem");
        return ORY.LJJIJIIJIL(funcItem.LJ, this.LJIIIZ);
    }

    @Override // X.AbstractC1282851s, X.C52A
    public final boolean LIZLLL(AnonymousClass523 funcItem) {
        o.LJIIIZ(funcItem, "funcItem");
        if (AnonymousClass515.LIZ() && TextUtils.equals(funcItem.LJ, "bottom_item_root_sound")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1280850y(ActivityC45651qj activity, C55Y actionMenuController) {
        super(activity);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(actionMenuController, "actionMenuController");
        this.LJ = actionMenuController;
        this.LJFF = C221108m2.LIZIZ(C123564t6.LJLIL);
        this.LJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 871));
        this.LJII = C221108m2.LIZIZ(C127064yk.LJLIL);
        this.LJIIIIZZ = C221108m2.LIZIZ(C127294z7.LJLIL);
        actionMenuController.LJ = new AqS168S0100000_2(this, 523);
        this.LJIIIZ = new String[]{"bottom_item_root_sound", "bottom_item_root_sound_sync", "bottom_item_sound_voiceover", "bottom_item_sound_add_sound", "bottom_item_bgm_edit_delete", "bottom_item_bgm_edit_volume", "bottom_item_sound_replace_sound", "bottom_item_bgm_edit_sound_beats", "bottom_item_bgm_edit_sound_speed", "bottom_item_bgm_edit_sound_filter", "bottom_item_bgm_edit_adjust", "bottom_item_sound_sound_effect", "bottom_item_sound_effect_edit_copy", "bottom_item_sound_effect_edit_volume", "bottom_item_sound_effect_edit_delete", "bottom_item_voiceover_edit_copy", "bottom_item_voiceover_edit_delete", "bottom_item_voiceover_edit_volume", "bottom_item_voiceover_edit_split", "bottom_item_voiceover_edit_voice_effect"};
    }

    @Override // X.C52A
    public final void LIZIZ(AnonymousClass523 funcItem, View view) {
        long endTime;
        o.LJIIIZ(funcItem, "funcItem");
        String str = funcItem.LJ;
        String str2 = null;
        switch (str.hashCode()) {
            case -2129872362:
                if (!str.equals("bottom_item_voiceover_edit_split") || !funcItem.LJFF) {
                    return;
                }
                VideoPublishEditModel LJIIIZ = LJIIIZ();
                if (LJIIIZ != null) {
                    C5QW.LJIILLIIL(LJIIIZ, LJIIIIZZ(), "split");
                }
                LJIIIIZZ().getPlayer().pause();
                LJIIIIZZ().getEditor().LJIIL(EnumC124724uy.DONE);
                return;
            case -2041133521:
                if (!str.equals("bottom_item_voiceover_edit_delete") || !funcItem.LJFF) {
                    return;
                }
                LJIIIIZZ().getPlayer().pause();
                long currentTimeMillis = System.currentTimeMillis();
                C125654wT c125654wT = (C125654wT) this.LJI.getValue();
                NLETrackSlot selectedTrackSlot = c125654wT.LIZ.getSelectedTrackSlot();
                NLETrack selectedTrack = c125654wT.LIZ.getSelectedTrack();
                if (selectedTrackSlot != null && selectedTrack != null) {
                    c125654wT.LIZ.getEditor().LJJIZ(selectedTrackSlot, EnumC124724uy.NONE);
                    C124614un.LIZLLL(C79057V0z.LJJI(c125654wT.LIZ), EnumC123864ta.AUDIO);
                    C32151Nz.LIZIZ(EnumC126814yL.DELETE.getNameId(), c125654wT.LIZ);
                    C79057V0z.LJJJJL(c125654wT.LIZ, "select_slot_event", new C127594zb(null, null, 14));
                }
                FMX.LJIIL("acc_advanced_edit_delete_audio_clip_duration", UFE.LIZ(System.currentTimeMillis() - currentTimeMillis, "acc_advanced_edit_delete_audio_clip_duration").LIZ);
                VideoPublishEditModel LJIIIZ2 = LJIIIZ();
                if (LJIIIZ2 == null) {
                    return;
                }
                C5QW.LJIILLIIL(LJIIIZ2, LJIIIIZZ(), "delete");
                return;
            case -1697152825:
                if (!str.equals("bottom_item_bgm_edit_sound_beats") || !funcItem.LJFF) {
                    return;
                }
                LJIIIIZZ().getPlayer().pause();
                VideoPublishEditModel LJIIIZ3 = LJIIIZ();
                if (LJIIIZ3 != null) {
                    FMX.LJIIL("click_sound_beat_entrance", C5QW.LJII(LJIIIZ3).LIZ);
                }
                LJ(new AudioBeatsPanelFragment());
                return;
            case -1681121903:
                if (!str.equals("bottom_item_bgm_edit_sound_speed") || !funcItem.LJFF) {
                    return;
                }
                VideoPublishEditModel LJIIIZ4 = LJIIIZ();
                if (LJIIIZ4 != null) {
                    EditorProContext editorContext = LJIIIIZZ();
                    o.LJIIIZ(editorContext, "editorContext");
                    FMX.LJIIL("click_sound_speed_tab", C5QW.LJFF(LJIIIZ4, editorContext).LIZ);
                }
                VideoPublishEditModel LJIIIZ5 = LJIIIZ();
                if (LJIIIZ5 != null) {
                    C5QW.LJIJJLI("delete", LJIIIZ5, LJIIIIZZ(), null, null, false, 56);
                }
                LJ(new SoundSpeedFragment());
                return;
            case -1516558434:
                if (!str.equals("bottom_item_voiceover_edit_volume") || !funcItem.LJFF) {
                    return;
                }
                LJIIIIZZ().getPlayer().pause();
                LJ(C1280350t.LIZ("audio_record"));
                VideoPublishEditModel LJIIIZ6 = LJIIIZ();
                if (LJIIIZ6 == null) {
                    return;
                }
                C5QW.LJIILLIIL(LJIIIZ6, LJIIIIZZ(), "volume");
                return;
            case -953591954:
                if (!str.equals("bottom_item_bgm_edit_sound_filter") || !funcItem.LJFF) {
                    return;
                }
                VideoPublishEditModel LJIIIZ7 = LJIIIZ();
                if (LJIIIZ7 != null) {
                    EditorProContext editorContext2 = LJIIIIZZ();
                    o.LJIIIZ(editorContext2, "editorContext");
                    FMX.LJIIL("click_sound_filter_tab", C5QW.LJFF(LJIIIZ7, editorContext2).LIZ);
                }
                VideoPublishEditModel LJIIIZ8 = LJIIIZ();
                if (LJIIIZ8 != null) {
                    C5QW.LJIJJLI("delete", LJIIIZ8, LJIIIIZZ(), null, null, false, 56);
                }
                LJ(new SoundFilterFragment());
                return;
            case -934571088:
                if (!str.equals("bottom_item_root_sound_sync")) {
                    return;
                }
                if (funcItem.LJFF) {
                    C79057V0z.LJJJJL(LJIIIIZZ(), "event_click_music_sync", C76800UCe.LIZ);
                    VideoPublishEditModel LJIIIZ9 = LJIIIZ();
                    if (LJIIIZ9 == null) {
                        return;
                    }
                    C5QW.LJIJJLI("sound_sync", LJIIIZ9, LJIIIIZZ(), null, null, false, 56);
                    return;
                }
                VideoPublishEditModel LJIIIZ10 = LJIIIZ();
                if (LJIIIZ10 != null) {
                    EditorProContext editorContext3 = LJIIIIZZ();
                    o.LJIIIZ(editorContext3, "editorContext");
                    C145995oB LJFF = C5QW.LJFF(LJIIIZ10, editorContext3);
                    LJFF.LIZ(1, "is_editor_pro");
                    FMX.LJIIL("sync_mode_disable_click_popup", LJFF.LIZ);
                }
                ActivityC45651qj activityC45651qj = this.LIZ;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                String string = this.LIZ.getString(R.string.fny);
                o.LJIIIIZZ(string, "activity.getString(R.str…itor_pro_soundsync_toast)");
                creativeToastBuilder.message(string);
                C78915Uy7.LJJIIZI(activityC45651qj, 1055, creativeToastBuilder);
                return;
            case -901309739:
                if (!str.equals("bottom_item_bgm_edit_adjust") || !funcItem.LJFF) {
                    return;
                }
                LJIIIIZZ().getPlayer().pause();
                C79057V0z.LJJJJL(LJIIIIZZ(), "show_preview_placeholder", Boolean.TRUE);
                VideoPublishEditModel LJIIIZ11 = LJIIIZ();
                if (LJIIIZ11 != null) {
                    EditorProContext editorContext4 = LJIIIIZZ();
                    o.LJIIIZ(editorContext4, "editorContext");
                    C145995oB LJFF2 = C5QW.LJFF(LJIIIZ11, editorContext4);
                    LJFF2.LJI("music_id", LJIIIZ11.getMusicId());
                    FMX.LJIIL("click_sound_adjust_tab", LJFF2.LIZ);
                }
                C2ND.LIZIZ(new AqS152S0100000_2(this, 869), 150L);
                return;
            case -814454543:
                if (!str.equals("bottom_item_bgm_edit_delete") || !funcItem.LJFF) {
                    return;
                }
                VideoPublishEditModel LJIIIZ12 = LJIIIZ();
                if (LJIIIZ12 != null) {
                    NLETrackSlot selectedTrackSlot2 = LJIIIIZZ().getSelectedTrackSlot();
                    if (selectedTrackSlot2 != null) {
                        str2 = selectedTrackSlot2.getExtra("slot_extra_music_id");
                    }
                    C5QW.LJIIZILJ(LJIIIZ12, LJIIIIZZ(), str2, true);
                }
                VideoPublishEditModel LJIIIZ13 = LJIIIZ();
                if (LJIIIZ13 != null) {
                    C5QW.LJIJJLI("delete", LJIIIZ13, LJIIIIZZ(), null, null, false, 56);
                }
                C79057V0z.LJJJJL(LJIIIIZZ(), "event_click_delete_music", C76800UCe.LIZ);
                return;
            case -593228548:
                if (!str.equals("bottom_item_sound_replace_sound") || !funcItem.LJFF) {
                    return;
                }
                LJIIJ();
                return;
            case -289879456:
                if (!str.equals("bottom_item_bgm_edit_volume") || !funcItem.LJFF) {
                    return;
                }
                LJIIIIZZ().getPlayer().pause();
                VideoPublishEditModel LJIIIZ14 = LJIIIZ();
                if (LJIIIZ14 != null) {
                    NLETrackSlot selectedTrackSlot3 = LJIIIIZZ().getSelectedTrackSlot();
                    if (selectedTrackSlot3 != null) {
                        str2 = selectedTrackSlot3.getExtra("slot_extra_music_id");
                    }
                    C5QW.LJIJI(LJIIIZ14, LJIIIIZZ(), str2, true);
                    C5QW.LJIJJLI("volume", LJIIIZ14, LJIIIIZZ(), null, null, false, 56);
                }
                LJ(C1280350t.LIZ("music"));
                C79057V0z.LJJI(LJIIIIZZ()).setExtra("enter_change_music_volume", String.valueOf(System.currentTimeMillis()));
                return;
            case -226453954:
                if (!str.equals("bottom_item_sound_voiceover") || !funcItem.LJFF) {
                    return;
                }
                LJFF();
                return;
            case -143690230:
                if (!str.equals("bottom_item_root_sound") || view == null) {
                    return;
                }
                C55Y c55y = this.LJ;
                c55y.getClass();
                view.setAlpha(0.6f);
                if (c55y.LIZJ().LIZJ()) {
                    c55y.LIZJ().LIZ();
                    View view2 = c55y.LIZ;
                    if (view2 != null) {
                        view2.setAlpha(1.0f);
                    }
                    c55y.LJI = true;
                }
                c55y.LIZIZ().LJ(view);
                c55y.LIZ = view;
                VideoPublishEditModel LJIIIZ15 = LJIIIZ();
                if (LJIIIZ15 == null) {
                    return;
                }
                C5QW.LJJIJLIJ(LJIIIZ15, LJIIIIZZ(), "click_button");
                return;
            case 541995812:
                if (!str.equals("bottom_item_sound_effect_edit_copy") || !funcItem.LJFF) {
                    return;
                }
                LJIIIIZZ().getPlayer().pause();
                InterfaceC1279450k interfaceC1279450k = (InterfaceC1279450k) this.LJII.getValue();
                if (interfaceC1279450k == null) {
                    return;
                }
                interfaceC1279450k.LJFF();
                return;
            case 702276233:
                if (!str.equals("bottom_item_sound_sound_effect") || !funcItem.LJFF) {
                    return;
                }
                LJII();
                return;
            case 1135167785:
                if (!str.equals("bottom_item_sound_add_sound") || !funcItem.LJFF) {
                    return;
                }
                LJI();
                return;
            case 1186191770:
                if (!str.equals("bottom_item_sound_effect_edit_delete") || !funcItem.LJFF) {
                    return;
                }
                VideoPublishEditModel LJIIIZ16 = LJIIIZ();
                if (LJIIIZ16 != null) {
                    NLETrackSlot selectedTrackSlot4 = LJIIIIZZ().getSelectedTrackSlot();
                    if (selectedTrackSlot4 != null) {
                        str2 = selectedTrackSlot4.getExtra("slot_extra_music_id");
                    }
                    C5QW.LJIIZILJ(LJIIIZ16, LJIIIIZZ(), str2, false);
                }
                LJIIIIZZ().getPlayer().pause();
                InterfaceC1279450k interfaceC1279450k2 = (InterfaceC1279450k) this.LJII.getValue();
                if (interfaceC1279450k2 == null) {
                    return;
                }
                interfaceC1279450k2.LIZLLL();
                return;
            case 1710766857:
                if (!str.equals("bottom_item_sound_effect_edit_volume") || !funcItem.LJFF) {
                    return;
                }
                VideoPublishEditModel LJIIIZ17 = LJIIIZ();
                if (LJIIIZ17 != null) {
                    NLETrackSlot selectedTrackSlot5 = LJIIIIZZ().getSelectedTrackSlot();
                    if (selectedTrackSlot5 != null) {
                        str2 = selectedTrackSlot5.getExtra("slot_extra_music_id");
                    }
                    C5QW.LJIJI(LJIIIZ17, LJIIIIZZ(), str2, false);
                    C5QW.LJIJJLI("volume", LJIIIZ17, LJIIIIZZ(), null, null, false, 56);
                }
                LJIIIIZZ().getPlayer().pause();
                LJ(C1280350t.LIZ("sound_effect"));
                return;
            case 1787184834:
                if (!str.equals("bottom_item_voiceover_edit_voice_effect") || !funcItem.LJFF) {
                    return;
                }
                LJIIIIZZ().getPlayer().pause();
                LJ(new VoiceEffectPanelFragment());
                return;
            case 1870479609:
                if (!str.equals("bottom_item_voiceover_edit_copy") || !funcItem.LJFF) {
                    return;
                }
                LJIIIIZZ().getPlayer().pause();
                C125654wT c125654wT2 = (C125654wT) this.LJI.getValue();
                NLETrackSlot selectedTrackSlot6 = c125654wT2.LIZ.getSelectedTrackSlot();
                NLETrack selectedTrack2 = c125654wT2.LIZ.getSelectedTrack();
                NLEModel LJJI = C79057V0z.LJJI(c125654wT2.LIZ);
                if (selectedTrackSlot6 != null && selectedTrack2 != null) {
                    NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ORZ.LJLLLLLL(selectedTrack2.LJIILJJIL(selectedTrackSlot6) + 1, selectedTrack2.LJIILLIIL());
                    long s5 = c125654wT2.LIZ.getPlayer().s5() * 1000;
                    if (nLETimeSpaceNode != null) {
                        endTime = nLETimeSpaceNode.getStartTime() - selectedTrackSlot6.getEndTime();
                    } else {
                        endTime = s5 - selectedTrackSlot6.getEndTime();
                    }
                    NLETrackSlot LIZ = NLETrackSlot.LIZ(selectedTrackSlot6.deepClone(true));
                    LIZ.setStartTime(selectedTrackSlot6.getEndTime());
                    LIZ.setEndTime(selectedTrackSlot6.getEndTime() + selectedTrackSlot6.getDuration());
                    LIZ.setExtra("audio_record_order", String.valueOf(C124614un.LJII(LJJI) + 1));
                    if (s5 - selectedTrackSlot6.getEndTime() < selectedTrackSlot6.getDuration()) {
                        long endTime2 = s5 - selectedTrackSlot6.getEndTime();
                        LIZ.setEndTime(s5);
                        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(LIZ.LJI());
                        if (LIZLLL != null) {
                            LIZLLL.LJIJJ(LIZLLL.LJIILIIL() + endTime2);
                        }
                    }
                    if (endTime > selectedTrackSlot6.getDuration() || nLETimeSpaceNode == null) {
                        selectedTrack2.LIZIZ(LIZ);
                    } else {
                        C52B.LJ(LJJI, LIZ, C124604um.LIZIZ(LJJI), new AqS152S0100000_2(LJJI, 858));
                    }
                    C32151Nz.LIZIZ(EnumC126814yL.COPY_RECORDED_AUDIO.getNameId(), c125654wT2.LIZ);
                    C79057V0z.LJJJJLI(c125654wT2.LIZ, "selected_audio_track_slot", LIZ, true);
                }
                VideoPublishEditModel LJIIIZ18 = LJIIIZ();
                if (LJIIIZ18 == null) {
                    return;
                }
                C5QW.LJIILLIIL(LJIIIZ18, LJIIIIZZ(), "copy");
                return;
            default:
                return;
        }
    }
}
