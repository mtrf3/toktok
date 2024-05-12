package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4yr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127134yr {
    public static final /* synthetic */ int LIZ = 0;

    public static final LinkedHashMap<String, String> LIZ(VideoPublishEditModel editModel) {
        String str;
        boolean z;
        boolean z2;
        o.LJIIIZ(editModel, "editModel");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (editModel.getEditorProModel().isAdvancedEditDraft() && (str = editModel.nleData) != null && str.length() != 0) {
            C60903NvH.LJIIJJI().LJIJ();
            C5K0.LIZ(2);
            NLEEditor nLEEditor = new NLEEditor();
            nLEEditor.LJI(editModel.nleData);
            NLEModel LJ = nLEEditor.LJ();
            if (LJ != null) {
                ArrayList arrayList = new ArrayList();
                VecNLETrackSPtr sortedTracks = LJ.getSortedTracks();
                if (sortedTracks != null) {
                    Iterator<NLETrack> it = sortedTracks.iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(it.next().LJIILLIIL());
                    }
                }
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_trim_video_length");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_split_video");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_adjust_video_speed");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_rotate_video");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_add_video_material");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_add_library_material");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_adjust_video_volume");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_crop_video");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_adjust_video_order");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_start_over");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_trim_music_length");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_add_music_material");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_add_sound_effect");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_adjust_music_volume");
                StringBuilder sb = new StringBuilder();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) it2.next();
                    if (nLETrackSlot.LJI().LIZJ() == EnumC123874tb.AUDIO) {
                        sb.append(nLETrackSlot.getExtra("d_bgmId"));
                    }
                }
                if (sb.length() > 0) {
                    linkedHashMap.put("editorpro_music_id", sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    NLETrackSlot nLETrackSlot2 = (NLETrackSlot) it3.next();
                    if (nLETrackSlot2.LJI().LIZJ() == EnumC123874tb.SOUND) {
                        if (sb2.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            sb2.append(nLETrackSlot2.getExtra("slot_extra_music_id"));
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(',');
                            LIZ2.append(nLETrackSlot2.getExtra("slot_extra_music_id"));
                            sb2.append(X1D.LIZIZ(LIZ2));
                        }
                    }
                }
                if (sb2.length() > 0) {
                    linkedHashMap.put("editorpro_sound_effect_id", sb2.toString());
                }
                C5V5.LJFF(editModel, linkedHashMap, false);
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_effect");
                LJ(linkedHashMap, LJ, arrayList, "is_editorpro_trim_effect");
                StringBuilder sb3 = new StringBuilder();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    NLETrackSlot nLETrackSlot3 = (NLETrackSlot) it4.next();
                    if (nLETrackSlot3.LJI().LIZJ() == EnumC123874tb.EFFECT) {
                        if (sb3.length() == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            sb3.append(nLETrackSlot3.LJI().getExtra("nleExtraEffectKey"));
                        } else {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(',');
                            LIZ3.append(nLETrackSlot3.LJI().getExtra("nleExtraEffectKey"));
                            sb3.append(X1D.LIZIZ(LIZ3));
                        }
                    }
                }
                if (sb3.length() > 0) {
                    String sb4 = sb3.toString();
                    o.LJIIIIZZ(sb4, "effectIDList.toString()");
                    linkedHashMap.put("editorpro_effect_id", sb4);
                }
            }
        }
        return linkedHashMap;
    }

    public static final LinkedHashMap<String, String> LIZIZ(VideoPublishEditModel editModel, boolean z) {
        long j;
        boolean z2;
        String str;
        String str2;
        String str3;
        String str4;
        NLETrack mainTrack;
        NLETrack mainTrack2;
        ArrayList arrayList;
        String str5;
        NLETrack mainTrack3;
        NLETrack mainTrack4;
        o.LJIIIZ(editModel, "editModel");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        if (editModel.getEditorProModel().isAdvancedEditDraft()) {
            String str6 = editModel.nleData;
            int i = 0;
            if (str6 != null && str6.length() != 0) {
                C60903NvH.LJIIJJI().LJIJ();
                C5K0.LIZ(2);
                NLEEditor nLEEditor = new NLEEditor();
                nLEEditor.LJI(editModel.nleData);
                NLEModel LJ = nLEEditor.LJ();
                if (LJ != null) {
                    ArrayList arrayList2 = new ArrayList();
                    VecNLETrackSPtr sortedTracks = LJ.getSortedTracks();
                    if (sortedTracks != null) {
                        Iterator<NLETrack> it = sortedTracks.iterator();
                        while (it.hasNext()) {
                            arrayList2.addAll(it.next().LJIILLIIL());
                        }
                    }
                    LIZJ(linkedHashMap, LJ, arrayList2, "is_editor_pro_sync_used");
                    LIZJ(linkedHashMap, LJ, arrayList2, "is_editor_pro_add_sound_used");
                    LIZJ(linkedHashMap, LJ, arrayList2, "is_editor_pro_sound_effect_used");
                    LIZJ(linkedHashMap, LJ, arrayList2, "is_editor_pro_add_text_used");
                    LIZJ(linkedHashMap, LJ, arrayList2, "is_editor_pro_tts_used");
                    LIZJ(linkedHashMap, LJ, arrayList2, "is_editor_pro_split_used");
                    LIZJ(linkedHashMap, LJ, arrayList2, "is_editor_pro_speed_used");
                    LIZJ(linkedHashMap, LJ, arrayList2, "is_editor_pro_rotate_used");
                }
                if (z) {
                    NLEModel LJ2 = nLEEditor.LJ();
                    long j2 = 0;
                    if (LJ2 != null && (mainTrack4 = LJ2.getMainTrack()) != null) {
                        j = mainTrack4.LJIIJJI();
                    } else {
                        j = 0;
                    }
                    NLEModel LJ3 = nLEEditor.LJ();
                    if (LJ3 != null) {
                        j2 = LJ3.getMaxTargetEnd();
                    }
                    if (j < j2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String str7 = CardStruct.IStatusCode.DEFAULT;
                    if (z2) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    linkedHashMap.put("has_black_screen", str);
                    boolean hasExtra = nLEEditor.LJ().hasExtra("is_audio_record_edited");
                    boolean LJ4 = o.LJ(nLEEditor.LJ().getExtra("is_audio_record_overlap"), "1");
                    if (hasExtra) {
                        str2 = "1";
                    } else {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    linkedHashMap.put("is_editorpro_add_voiceover", str2);
                    if (LJ4) {
                        str3 = "1";
                    } else {
                        str3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    linkedHashMap.put("is_record_overlapping", str3);
                    if (C52B.LJIIIZ(nLEEditor.LJ())) {
                        boolean hasExtra2 = nLEEditor.LJ().hasExtra("is_editorpro_transition");
                        NLEModel LJ5 = nLEEditor.LJ();
                        if (LJ5 != null && (mainTrack3 = LJ5.getMainTrack()) != null) {
                            VecNLETrackSlotSPtr LJIILLIIL = mainTrack3.LJIILLIIL();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator<NLETrackSlot> it2 = LJIILLIIL.iterator();
                            while (it2.hasNext()) {
                                NLETrackSlot next = it2.next();
                                if (next.hasExtra("slot_extra_transition_effect_id")) {
                                    arrayList3.add(next);
                                }
                            }
                            arrayList = new ArrayList(C32I.LJJL(arrayList3, 10));
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(((NLENode) it3.next()).getExtra("slot_extra_transition_effect_id"));
                            }
                        } else {
                            arrayList = null;
                        }
                        if (hasExtra2) {
                            str5 = "1";
                        } else {
                            str5 = CardStruct.IStatusCode.DEFAULT;
                        }
                        linkedHashMap.put("is_editorpro_transition", str5);
                        linkedHashMap.put("transition_list", String.valueOf(arrayList));
                    }
                    boolean LJIIIIZZ = C52B.LJIIIIZZ(nLEEditor.LJ());
                    if (LJIIIIZZ) {
                        str7 = "1";
                    }
                    linkedHashMap.put("is_editorpro_magic_video", str7);
                    if (LJIIIIZZ) {
                        NLEModel LJ6 = nLEEditor.LJ();
                        ArrayList arrayList4 = new ArrayList();
                        if (LJ6 != null && (mainTrack2 = LJ6.getMainTrack()) != null) {
                            Iterator<NLETrackSlot> it4 = mainTrack2.LJIILLIIL().iterator();
                            while (it4.hasNext()) {
                                NLETrackSlot slot = it4.next();
                                o.LJIIIIZZ(slot, "slot");
                                if (C52B.LJI(slot)) {
                                    for (String str8 : C125204vk.LJ(slot)) {
                                        if (!ujb.o.LJJJJJL(str8)) {
                                            arrayList4.add(str8);
                                        }
                                    }
                                }
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            str4 = C124934vJ.LIZ(arrayList4);
                        } else {
                            str4 = "";
                        }
                        NLEModel LJ7 = nLEEditor.LJ();
                        if (LJ7 != null && (mainTrack = LJ7.getMainTrack()) != null) {
                            Iterator<NLETrackSlot> it5 = mainTrack.LJIILL().iterator();
                            while (it5.hasNext()) {
                                NLETrackSlot slot2 = it5.next();
                                o.LJIIIIZZ(slot2, "slot");
                                if (C124614un.LJIILIIL(slot2) && C124614un.LJIIL(slot2.LJIIIIZZ())) {
                                    i++;
                                }
                                Iterator<NLEVideoEffect> it6 = slot2.LJIIJ().iterator();
                                while (it6.hasNext()) {
                                    NLEVideoEffect effect = it6.next();
                                    o.LJIIIIZZ(effect, "effect");
                                    if (C124614un.LJIIJ(effect)) {
                                        i++;
                                    }
                                }
                                Iterator<NLEFilter> it7 = slot2.LJ().iterator();
                                while (it7.hasNext()) {
                                    NLEFilter filter = it7.next();
                                    o.LJIIIIZZ(filter, "filter");
                                    if (C124614un.LJIIJJI(filter)) {
                                        i++;
                                    }
                                }
                            }
                        }
                        linkedHashMap.put("editorpro_magic_cnt", String.valueOf(i));
                        linkedHashMap.put("editorpro_magic_id_list", str4);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static void LIZJ(LinkedHashMap linkedHashMap, NLEModel nLEModel, List list, String str) {
        if (!nLEModel.hasExtra(str) || !Boolean.parseBoolean(nLEModel.getExtra(str))) {
            if (!((ArrayList) list).isEmpty()) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    NLENode nLENode = (NLENode) it.next();
                    if (!nLENode.hasExtra(str) || !Boolean.parseBoolean(nLENode.getExtra(str))) {
                    }
                }
            }
            linkedHashMap.put(str, CardStruct.IStatusCode.DEFAULT);
            return;
        }
        linkedHashMap.put(str, "1");
    }

    public static void LIZLLL(LinkedHashMap linkedHashMap, NLEModel nLEModel, List list, String str) {
        if (!nLEModel.hasExtra(str) || !Boolean.parseBoolean(nLEModel.getExtra(str))) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    NLENode nLENode = (NLENode) it.next();
                    if (!nLENode.hasExtra(str) || !o.LJ(nLENode.getExtra(str), "1")) {
                    }
                }
            }
            linkedHashMap.put(str, CardStruct.IStatusCode.DEFAULT);
            return;
        }
        linkedHashMap.put(str, "1");
    }

    public static void LJ(LinkedHashMap linkedHashMap, NLEModel nLEModel, List list, String str) {
        if (!nLEModel.hasExtra(str) || !Boolean.parseBoolean(nLEModel.getExtra(str))) {
            if (((ArrayList) list).isEmpty()) {
                return;
            }
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                NLENode nLENode = (NLENode) it.next();
                if (!nLENode.hasExtra(str) || !o.LJ(nLENode.getExtra(str), "1")) {
                }
            }
            return;
        }
        linkedHashMap.put(str, "1");
    }
}
