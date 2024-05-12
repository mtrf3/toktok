package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.55n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1292755n {
    public static final C1292755n LIZ = new C1292755n();
    public static final List<String> LIZIZ = C47261Igj.LJJIJIIJI("is_editorpro_copy_video_clip", "is_editorpro_replace_video_clip", "is_editorpro_trim_video_length", "is_editorpro_split_video", "is_editorpro_adjust_video_speed", "is_editorpro_rotate_video", "is_editorpro_add_video_material", "is_editorpro_adjust_video_volume", "is_editorpro_adjust_video_order", "is_editorpro_start_over", "is_editorpro_crop_video");
    public static final List<String> LIZJ = C47261Igj.LJJIJIIJI("is_editorpro_tts", "is_editorpro_text", "is_editorpro_trim_text_length", "is_editorpro_copy_text", "is_editorpro_adjust_text_style", "is_editorpro_adjust_text_paragraph", "is_editorpro_adjust_text_font", "is_editorpro_adjust_text_color", "is_editorpro_adjust_text_position");
    public static final List<String> LIZLLL = C47261Igj.LJJIJIIJI("is_editorpro_trim_music_length", "is_editorpro_add_music_material", "is_editorpro_adjust_music_volume", "is_editorpro_add_sound_beat", "is_editor_pro_sync_used");
    public static final List<String> LJ = C47261Igj.LJJIJ("is_editorpro_add_sound_effect");
    public static final List<String> LJFF = C47261Igj.LJJIJ("is_editorpro_captions");
    public static final List<String> LJI = C47261Igj.LJJIJ("");
    public static final List<String> LJII = C47261Igj.LJJIJIIJI("is_editorpro_effect", "is_editorpro_trim_effect");
    public static final List<String> LJIIIIZZ = C47261Igj.LJJIJ("is_editorpro_transition");
    public static final List<String> LJIIIZ = C47261Igj.LJJIJ("is_audio_record_edited");

    public static String LIZ(String titleStr) {
        o.LJIIIZ(titleStr, "titleStr");
        return C63144OqK.LIZIZ(new Object[]{C1533360b.LIZ()}, 1, Locale.US, titleStr, "format(locale, format, *args)");
    }

    public static String LIZIZ(VideoPublishEditModel editModel) {
        boolean z;
        boolean z2;
        o.LJIIIZ(editModel, "editModel");
        String str = editModel.nleData;
        int i = 0;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (z) {
            return "";
        }
        C60903NvH.LJIIJJI().LJIJ();
        C5K0.LIZ(2);
        NLEEditor nLEEditor = new NLEEditor();
        nLEEditor.LJI(editModel.nleData);
        NLEModel LJ2 = nLEEditor.LJ();
        if (LJ2 == null) {
            return "";
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str3 : LIZIZ) {
            LIZ.getClass();
            if (LIZJ(LJ2, str3)) {
                linkedHashSet.add("edit");
            }
        }
        if (editModel.getEditorProModel().isPipUsed()) {
            linkedHashSet.add("pip");
        }
        for (String str4 : LIZJ) {
            LIZ.getClass();
            if (LIZJ(LJ2, str4)) {
                linkedHashSet.add("text");
            }
        }
        for (String str5 : LIZLLL) {
            LIZ.getClass();
            if (LIZJ(LJ2, str5)) {
                linkedHashSet.add("sound");
            }
        }
        for (String str6 : LJ) {
            LIZ.getClass();
            if (LIZJ(LJ2, str6)) {
                linkedHashSet.add("soundeffect");
            }
        }
        for (String str7 : LJFF) {
            LIZ.getClass();
            if (LIZJ(LJ2, str7)) {
                linkedHashSet.add("caption");
            }
        }
        if (C44384HbQ.LLJILJILJ(editModel) && H7R.LJJIIZ(editModel) && !linkedHashSet.contains("caption")) {
            linkedHashSet.add("caption_from_edit");
        }
        if (C1292855o.LIZ() && editModel.getEditEffectModel().effectSource != -1 && editModel.getEditEffectModel().effectSource != 1) {
            linkedHashSet.add("effect_from_edit");
        }
        for (String str8 : LJII) {
            LIZ.getClass();
            if (LIZJ(LJ2, str8)) {
                linkedHashSet.add("effect");
            }
        }
        for (String str9 : LJIIIZ) {
            LIZ.getClass();
            boolean LIZJ2 = LIZJ(LJ2, str9);
            VecNLETrackSPtr tracks = LJ2.getTracks();
            if (tracks != null && !tracks.isEmpty()) {
                Iterator<NLETrack> it = tracks.iterator();
                while (it.hasNext()) {
                    NLETrack next = it.next();
                    if (next.LJIIZILJ() == EnumC123864ta.AUDIO && o.LJ(next.getExtra("AudioTrackType"), "AUDIO_RECORD")) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (LIZJ2 && z2) {
                linkedHashSet.add("voiceover");
            }
        }
        for (String str10 : LJIIIIZZ) {
            LIZ.getClass();
            boolean LIZJ3 = LIZJ(LJ2, str10);
            boolean LJIIIZ2 = C52B.LJIIIZ(LJ2);
            if (LIZJ3 && LJIIIZ2) {
                linkedHashSet.add("transition");
            }
        }
        if (C52B.LJIIIIZZ(LJ2)) {
            linkedHashSet.add("magic");
        }
        if (!linkedHashSet.isEmpty()) {
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                int i2 = i + 1;
                if (i >= 0) {
                    String str11 = (String) next2;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str2);
                    if (i != linkedHashSet.size() - 1) {
                        str11 = C42398GkU.LIZIZ(str11, ',');
                    }
                    LIZ2.append(str11);
                    str2 = X1D.LIZIZ(LIZ2);
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        H78.LIZ("EP used functions = " + str2);
        return str2;
    }

    public static boolean LIZJ(NLEModel nLEModel, String str) {
        boolean z = true;
        if (o.LJ(nLEModel.getExtra(str), "1") || Boolean.parseBoolean(nLEModel.getExtra(str))) {
            return true;
        }
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        if (tracks == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it = tracks.iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL(it.next().LJIILL(), arrayList);
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                NLENode nLENode = (NLENode) it2.next();
                if (o.LJ(nLENode.getExtra(str), "1") || Boolean.parseBoolean(nLENode.getExtra(str))) {
                    break;
                }
            }
        }
        z = false;
        return z;
    }
}
