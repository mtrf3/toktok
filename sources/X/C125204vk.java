package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ujb.o;
import ujb.s;

/* renamed from: X.4vk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125204vk {
    public static final /* synthetic */ int LIZ = 0;

    public static List LJ(NLETrackSlot nLETrackSlot) {
        if (nLETrackSlot.hasExtra("ep_magic_effect_id")) {
            String extra = nLETrackSlot.getExtra("ep_magic_effect_id");
            if (extra != null) {
                List LJLJJL = s.LJLJJL(extra, new String[]{","}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : LJLJJL) {
                    if (!o.LJJJJJL((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    return C47261Igj.LJJIJ("");
                }
                return arrayList;
            }
            return C47261Igj.LJJIJ("");
        }
        return C47261Igj.LJJIJ("");
    }

    public static boolean LJFF(NLEVideoEffect nLEVideoEffect) {
        String NLESegmentEffect_getJsonParam;
        NLESegmentEffect LIZIZ = nLEVideoEffect.LIZIZ();
        if (LIZIZ != null && (NLESegmentEffect_getJsonParam = NLEEditorJniJNI.NLESegmentEffect_getJsonParam(LIZIZ.LIZJ, LIZIZ)) != null && !TextUtils.isEmpty(NLESegmentEffect_getJsonParam)) {
            return new JSONObject(NLESegmentEffect_getJsonParam).has("editing_effect_algorithm_cache_url");
        }
        return false;
    }

    public static void LIZ(NLETrackSlot nLETrackSlot, String str, String str2) {
        String LIZIZ;
        if (nLETrackSlot.hasExtra(str)) {
            StringBuilder sb = new StringBuilder(nLETrackSlot.getExtra(str));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str2);
            LIZ2.append(',');
            sb.append(X1D.LIZIZ(LIZ2));
            LIZIZ = sb.toString();
        } else {
            LIZIZ = C42398GkU.LIZIZ(str2, ',');
        }
        kotlin.jvm.internal.o.LJIIIIZZ(LIZIZ, "if (targetSlot.hasExtra(…ndMagicId,\"\n            }");
        nLETrackSlot.setExtra(str, LIZIZ);
    }

    public static void LIZIZ(NLETrackSlot targetSlot, String appendMagicResourceId, String appendMagicEffectId) {
        kotlin.jvm.internal.o.LJIIIZ(targetSlot, "targetSlot");
        kotlin.jvm.internal.o.LJIIIZ(appendMagicResourceId, "appendMagicResourceId");
        kotlin.jvm.internal.o.LJIIIZ(appendMagicEffectId, "appendMagicEffectId");
        LIZ(targetSlot, "ep_magic_resource_id", appendMagicResourceId);
        LIZ(targetSlot, "ep_magic_effect_id", appendMagicEffectId);
    }

    public static void LIZJ(NLETrackSlot nLETrackSlot, String str, String str2) {
        if (nLETrackSlot.hasExtra(str)) {
            String magicIdStr = nLETrackSlot.getExtra(str);
            ArrayList arrayList = new ArrayList();
            kotlin.jvm.internal.o.LJIIIIZZ(magicIdStr, "magicIdStr");
            List LJLJJL = s.LJLJJL(magicIdStr, new String[]{","}, 0, 6);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : LJLJJL) {
                if (!o.LJJJJJL((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (kotlin.jvm.internal.o.LJ(next, str2)) {
                    if (next != null) {
                        arrayList.remove(next);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (!o.LJJJJJL(str3)) {
                    sb.append(str3.concat(","));
                }
            }
            String sb2 = sb.toString();
            kotlin.jvm.internal.o.LJIIIIZZ(sb2, "montageIdStr.toString()");
            if (o.LJJJJJL(sb2)) {
                nLETrackSlot.removeExtraWithKey(str);
            } else {
                nLETrackSlot.setExtra(str, sb.toString());
            }
        }
    }

    public static void LIZLLL(NLETrackSlot nLETrackSlot, String removeMagicResourceId, String removeMagicEffectId) {
        kotlin.jvm.internal.o.LJIIIZ(removeMagicResourceId, "removeMagicResourceId");
        kotlin.jvm.internal.o.LJIIIZ(removeMagicEffectId, "removeMagicEffectId");
        LIZJ(nLETrackSlot, "ep_magic_resource_id", removeMagicResourceId);
        LIZJ(nLETrackSlot, "ep_magic_effect_id", removeMagicEffectId);
    }
}
