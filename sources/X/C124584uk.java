package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.EditorProContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4uk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C124584uk {
    public static final /* synthetic */ int LIZ = 0;

    public static java.util.Map LIZ(EditorProContext editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        try {
            NLEModel LJJI = C79057V0z.LJJI(editorContext);
            HashMap hashMap = new HashMap();
            hashMap.put("editor_pro_main_track_slot_num", String.valueOf(LJJI.getMainTrack().LJIILL().size()));
            NLETrack mainTrack = LJJI.getMainTrack();
            o.LJIIIIZZ(mainTrack, "nleModel.mainTrack");
            Iterator<NLETrackSlot> it = mainTrack.LJIILL().iterator();
            long j = 0;
            while (it.hasNext()) {
                j += it.next().getDuration() / 1000;
            }
            hashMap.put("editor_pro_main_track_duration", String.valueOf(j));
            hashMap.put("editor_pro_pip_track_num", String.valueOf(C124574uj.LJIJI(LJJI).size()));
            hashMap.put("editor_pro_pip_slot_num", String.valueOf(C124574uj.LJIJ(LJJI)));
            hashMap.put("editor_pro_text_track_num", String.valueOf(((ArrayList) C124574uj.LJJIIJ(LJJI)).size()));
            hashMap.put("editor_pro_text_slot_num", String.valueOf(C124574uj.LJJIII(LJJI)));
            hashMap.put("editor_pro_audio_track_duration", String.valueOf(LIZIZ(LJJI)));
            hashMap.put("editor_pro_sound_effect_track_num", String.valueOf(((ArrayList) C124574uj.LJJ(LJJI)).size()));
            hashMap.put("editor_pro_sound_effect_slot_num", String.valueOf(C124574uj.LJIL(LJJI)));
            hashMap.put("editor_pro_total_duration", String.valueOf(editorContext.getPlayer().s5()));
            hashMap.put("editor_pro_effect_track_num", String.valueOf(C124574uj.LJIILIIL(LJJI).size()));
            hashMap.put("editor_pro_effect_slot_num", String.valueOf(C124574uj.LJIIL(LJJI)));
            hashMap.put("editor_pro_amazing_effect_slot_num", String.valueOf(C124574uj.LJI(LJJI)));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("editorProCommonParams::");
            LIZ2.append(hashMap);
            C131935Ft.LIZIZ("EditorProPerfManager", X1D.LIZIZ(LIZ2));
            return hashMap;
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("editorProCommonParams::Exception = ");
            LIZ3.append(e);
            C131935Ft.LIZLLL("EditorProPerfManager", X1D.LIZIZ(LIZ3));
            return null;
        }
    }

    public static long LIZIZ(NLEModel nLEModel) {
        Object obj;
        Iterator it = ((ArrayList) C124574uj.LJII(nLEModel)).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
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
        long j = 0;
        if (nLETrack2 != null) {
            Iterator<NLETrackSlot> it2 = nLETrack2.LJIILL().iterator();
            while (it2.hasNext()) {
                j += it2.next().getDuration() / 1000;
            }
        }
        return j;
    }
}
