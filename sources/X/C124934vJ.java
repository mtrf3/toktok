package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4vJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124934vJ {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = ((ArrayList) list).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                sb.append((String) next);
                if (i != r5.size() - 1) {
                    sb.append(",");
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "listString.toString()");
        return sb2;
    }

    public static boolean LIZLLL(NLEModel nLEModel) {
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack == null) {
            return false;
        }
        VecNLETrackSlotSPtr LJIILL = mainTrack.LJIILL();
        if (LJIILL.isEmpty()) {
            return false;
        }
        Iterator<NLETrackSlot> it = LJIILL.iterator();
        while (it.hasNext()) {
            NLETrackSlot it2 = it.next();
            o.LJIIIIZZ(it2, "it");
            if (it2.hasExtra("slot_extra_source_type") && C64504PTg.LIZ(it2, "slot_extra_source_type", "getExtra(ExtraKeys.SLOT_EXTRA_SOURCE_TYPE)") == EnumC124594ul.UploadFromEditorPro.getValue()) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJ(NLEModel nleModel) {
        String str;
        o.LJIIIZ(nleModel, "nleModel");
        NLETrack mainTrack = nleModel.getMainTrack();
        if (mainTrack != null && mainTrack.hasExtra("track_extra_is_adjust_range")) {
            NLETrack mainTrack2 = nleModel.getMainTrack();
            if (mainTrack2 != null) {
                str = mainTrack2.getExtra("track_extra_is_adjust_range");
            } else {
                str = null;
            }
            if (Boolean.parseBoolean(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJFF(NLEModel nLEModel) {
        boolean z;
        String str;
        if (LJ(nLEModel) || LJIIIZ(nLEModel) || LJIIJJI(nLEModel)) {
            return true;
        }
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null) {
            z = mainTrack.hasExtra("track_extra_is_video_edit_volume");
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            NLETrack mainTrack2 = nLEModel.getMainTrack();
            if (mainTrack2 != null) {
                str = mainTrack2.getExtra("track_extra_is_video_edit_volume");
            } else {
                str = null;
            }
            if (Boolean.parseBoolean(str)) {
                return true;
            }
        }
        List<NLETrack> LJII = C124574uj.LJII(nLEModel);
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LJII).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            NLENode nLENode = (NLENode) next;
            if (nLENode.hasExtra("track_extra_is_audio_edit_volume") && Boolean.parseBoolean(nLENode.getExtra("track_extra_is_audio_edit_volume"))) {
                arrayList.add(next);
            }
        }
        if ((!arrayList.isEmpty()) || LJII(nLEModel)) {
            return true;
        }
        if (nLEModel.hasExtra("model_extra_is_video_deleted") && Boolean.parseBoolean(nLEModel.getExtra("model_extra_is_video_deleted"))) {
            return true;
        }
        if ((nLEModel.hasExtra("model_extra_is_audio_deleted") && Boolean.parseBoolean(nLEModel.getExtra("model_extra_is_audio_deleted"))) || LJIIIIZZ(nLEModel)) {
            return true;
        }
        List<NLETrack> LJII2 = C124574uj.LJII(nLEModel);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) LJII2).iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            NLENode nLENode2 = (NLENode) next2;
            if (nLENode2.hasExtra("track_extra_is_audio_adjust_duration") && Boolean.parseBoolean(nLENode2.getExtra("track_extra_is_audio_adjust_duration"))) {
                arrayList2.add(next2);
            }
        }
        if ((!arrayList2.isEmpty()) || LJIIJ(nLEModel)) {
            return true;
        }
        if ((nLEModel.hasExtra("model_extra_is_audio_edit_location") && Boolean.parseBoolean(nLEModel.getExtra("model_extra_is_audio_edit_location"))) || LIZLLL(nLEModel)) {
            return true;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it3 = tracks.iterator();
            while (it3.hasNext()) {
                NLETrack next3 = it3.next();
                if (next3.hasExtra("use_music_in_editor_pro") && o.LJ(next3.getExtra("use_music_in_editor_pro"), "true")) {
                    return true;
                }
            }
        }
        List<NLETrack> LJIJI = C124574uj.LJIJI(nLEModel);
        if (LJIJI != null && !LJIJI.isEmpty()) {
            return true;
        }
        if (nLEModel.hasExtra("use_text_in_editor_pro") && o.LJ(nLEModel.getExtra("use_text_in_editor_pro"), "true")) {
            return true;
        }
        VecNLETrackSPtr tracks2 = nLEModel.getTracks();
        if (tracks2 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<NLETrack> it4 = tracks2.iterator();
            while (it4.hasNext()) {
                NLETrack next4 = it4.next();
                NLETrack it5 = next4;
                o.LJIIIIZZ(it5, "it");
                if (C124574uj.LJJJJZ(it5) && it5.hasExtra("add_tts_from_editor_pro") && o.LJ(it5.getExtra("add_tts_from_editor_pro"), "true")) {
                    arrayList3.add(next4);
                }
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        NLETrack mainTrack3 = nLEModel.getMainTrack();
        if (mainTrack3 != null && mainTrack3.hasExtra("model_extra_is_preview_operated")) {
            NLETrack mainTrack4 = nLEModel.getMainTrack();
            if (mainTrack4 != null) {
                str2 = mainTrack4.getExtra("model_extra_is_preview_operated");
            }
            if (Boolean.parseBoolean(str2)) {
                return true;
            }
        }
        List<NLETrack> LJIILIIL = C124574uj.LJIILIIL(nLEModel);
        ArrayList arrayList4 = new ArrayList();
        Iterator<NLETrack> it6 = LJIILIIL.iterator();
        while (it6.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it6.next().LJIILL(), arrayList4);
        }
        if (!arrayList4.isEmpty()) {
            Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                if (o.LJ(((NLENode) it7.next()).getExtra("extra_video_effect_source"), String.valueOf(EnumC126794yJ.EDITOR_PRO.getValue()))) {
                    return true;
                }
            }
        }
        NLETrack mainTrack5 = nLEModel.getMainTrack();
        if (mainTrack5 != null) {
            VecNLETrackSlotSPtr LJIILL = mainTrack5.LJIILL();
            if (!LJIILL.isEmpty()) {
                Iterator<NLETrackSlot> it8 = LJIILL.iterator();
                while (it8.hasNext()) {
                    NLETrackSlot next5 = it8.next();
                    if (next5.hasExtra("slot_extra_transition_effect_id")) {
                        String extra = next5.getExtra("slot_extra_transition_effect_id");
                        o.LJIIIIZZ(extra, "it.getExtra(ExtraKeys.SL…TRA_TRANSITION_EFFECT_ID)");
                        if (extra.length() > 0) {
                            return true;
                        }
                    }
                }
            }
        }
        if (LJIIL(nLEModel) || LJIILIIL(nLEModel, false) || C52B.LJIIIIZZ(nLEModel)) {
            return true;
        }
        if (nLEModel.hasExtra("model_extra_is_sound_trim") && Boolean.parseBoolean(nLEModel.getExtra("model_extra_is_sound_trim"))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if (java.lang.Boolean.parseBoolean(r0) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(com.bytedance.ies.nle.editor_jni.NLEModel r4) {
        /*
            r3 = 0
            if (r4 != 0) goto L4
            return r3
        L4:
            boolean r0 = LJ(r4)
            r2 = 1
            if (r0 != 0) goto L2f
            boolean r0 = LJIIIZ(r4)
            if (r0 != 0) goto L2f
            boolean r0 = LJIIJJI(r4)
            if (r0 != 0) goto L2f
            boolean r0 = LJII(r4)
            if (r0 != 0) goto L2f
            java.lang.String r1 = "model_extra_is_video_deleted"
            boolean r0 = r4.hasExtra(r1)
            if (r0 == 0) goto L31
            java.lang.String r0 = r4.getExtra(r1)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L31
        L2f:
            r3 = 1
        L30:
            return r3
        L31:
            boolean r0 = LJIIIIZZ(r4)
            if (r0 != 0) goto L2f
            boolean r0 = LJIIJ(r4)
            if (r0 != 0) goto L2f
            boolean r0 = LIZLLL(r4)
            if (r0 != 0) goto L2f
            boolean r0 = LJIIL(r4)
            if (r0 != 0) goto L2f
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r4.getMainTrack()
            java.lang.String r1 = "is_editorpro_touch_main_track"
            if (r0 == 0) goto L6a
            boolean r0 = r0.hasExtra(r1)
            if (r0 == 0) goto L6a
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r4.getMainTrack()
            if (r0 == 0) goto L68
            java.lang.String r0 = r0.getExtra(r1)
        L61:
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            if (r0 == 0) goto L6a
            goto L2f
        L68:
            r0 = 0
            goto L61
        L6a:
            boolean r0 = LJIILIIL(r4, r2)
            if (r0 != 0) goto L2f
            boolean r0 = X.C52B.LJIIIIZZ(r4)
            if (r0 == 0) goto L30
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124934vJ.LJI(com.bytedance.ies.nle.editor_jni.NLEModel):boolean");
    }

    public static boolean LJII(NLEModel nLEModel) {
        String str;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && mainTrack.hasExtra("track_extra_is_rotated")) {
            NLETrack mainTrack2 = nLEModel.getMainTrack();
            if (mainTrack2 != null) {
                str = mainTrack2.getExtra("track_extra_is_rotated");
            } else {
                str = null;
            }
            if (Boolean.parseBoolean(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIIIZZ(NLEModel nLEModel) {
        String str;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && mainTrack.hasExtra("track_extra_is_video_adjust_duration")) {
            NLETrack mainTrack2 = nLEModel.getMainTrack();
            if (mainTrack2 != null) {
                str = mainTrack2.getExtra("track_extra_is_video_adjust_duration");
            } else {
                str = null;
            }
            if (Boolean.parseBoolean(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIIZ(NLEModel nLEModel) {
        String str;
        NLETrack mainTrack = nLEModel.getMainTrack();
        if (mainTrack != null && mainTrack.hasExtra("track_extra_is_video_divided")) {
            NLETrack mainTrack2 = nLEModel.getMainTrack();
            if (mainTrack2 != null) {
                str = mainTrack2.getExtra("track_extra_is_video_divided");
            } else {
                str = null;
            }
            if (Boolean.parseBoolean(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIJ(NLEModel nleModel) {
        String str;
        o.LJIIIZ(nleModel, "nleModel");
        NLETrack mainTrack = nleModel.getMainTrack();
        if (mainTrack != null && mainTrack.hasExtra("track_extra_is_video_edit_location")) {
            NLETrack mainTrack2 = nleModel.getMainTrack();
            if (mainTrack2 != null) {
                str = mainTrack2.getExtra("track_extra_is_video_edit_location");
            } else {
                str = null;
            }
            if (Boolean.parseBoolean(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIJJI(NLEModel nleModel) {
        String str;
        o.LJIIIZ(nleModel, "nleModel");
        NLETrack mainTrack = nleModel.getMainTrack();
        if (mainTrack != null && mainTrack.hasExtra("track_extra_is_video_edit_speed")) {
            NLETrack mainTrack2 = nleModel.getMainTrack();
            if (mainTrack2 != null) {
                str = mainTrack2.getExtra("track_extra_is_video_edit_speed");
            } else {
                str = null;
            }
            if (Boolean.parseBoolean(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJIIL(NLEModel nLEModel) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                Iterator<NLETrackSlot> it2 = it.next().LJIILL().iterator();
                while (it2.hasNext()) {
                    NLETrackSlot next = it2.next();
                    if (next.hasExtra("is_editorpro_copy_video_clip") || next.hasExtra("is_editorpro_replace_video_clip")) {
                        String extra = next.getExtra("is_editorpro_copy_video_clip");
                        o.LJIIIIZZ(extra, "it.getExtra(SLOT_EXTRA_IS_USE_COPY)");
                        if (extra.length() <= 0) {
                            String extra2 = next.getExtra("is_editorpro_replace_video_clip");
                            o.LJIIIIZZ(extra2, "it.getExtra(\n           …CE,\n                    )");
                            if (extra2.length() > 0) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static OSZ LIZIZ(NLEModel nLEModel, int i) {
        int size = nLEModel.getMainTrack().LJIILL().size();
        VecNLETrackSlotSPtr LJIILL = nLEModel.getMainTrack().LJIILL();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrackSlot> it = LJIILL.iterator();
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            NLETrackSlot it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (C124574uj.LJJJLZIJ(it2)) {
                arrayList.add(next);
            }
        }
        int size2 = arrayList.size();
        int i2 = 0;
        if (size - size2 == size) {
            i = 1;
        } else if (size2 != size ? !(1 > size2 || size2 >= size) : i == 1) {
            i = 2;
        }
        if (size2 != size) {
            i2 = i;
        }
        return new OSZ(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static OSZ LIZJ(NLEModel nLEModel, boolean z) {
        boolean LJJJJJ;
        if (nLEModel.getMainTrack() == null) {
            return new OSZ(0, 0);
        }
        int size = nLEModel.getMainTrack().LJIILL().size();
        VecNLETrackSlotSPtr LJIILL = nLEModel.getMainTrack().LJIILL();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrackSlot> it = LJIILL.iterator();
        while (it.hasNext()) {
            NLETrackSlot next = it.next();
            NLETrackSlot it2 = next;
            o.LJIIIIZZ(it2, "it");
            if (z) {
                LJJJJJ = C124574uj.LJJJJ(it2);
            } else {
                LJJJJJ = C124574uj.LJJJJJ(it2);
            }
            if (LJJJJJ) {
                arrayList.add(next);
            }
        }
        int size2 = arrayList.size();
        return new OSZ(Integer.valueOf(size - size2), Integer.valueOf(size2));
    }

    public static boolean LJIILIIL(NLEModel nLEModel, boolean z) {
        NLESegmentVideo LJJ;
        NLESegmentVideo LJJ2;
        if (z) {
            NLETrack mainTrack = nLEModel.getMainTrack();
            if (mainTrack != null) {
                Iterator<NLETrackSlot> it = mainTrack.LJIILL().iterator();
                while (it.hasNext()) {
                    NLETrackSlot next = it.next();
                    if (next.hasExtra("is_editorpro_crop_video") && (LJJ2 = NLESegmentVideo.LJJ(next.LJI())) != null && LJJ2.LJJIFFI() != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                Iterator<NLETrackSlot> it3 = it2.next().LJIILL().iterator();
                while (it3.hasNext()) {
                    NLETrackSlot next2 = it3.next();
                    if (next2.hasExtra("is_editorpro_crop_video") && (LJJ = NLESegmentVideo.LJJ(next2.LJI())) != null && LJJ.LJJIFFI() != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
