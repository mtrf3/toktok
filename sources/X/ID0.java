package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class ID0 {
    public static String LIZ(Effect effect) {
        String str;
        if (effect != null && effect.getTags() != null && !effect.getTags().isEmpty()) {
            Iterator<String> it = effect.getTags().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("challenge") && next.contains(":")) {
                    String[] split = next.split(":");
                    if (split.length > 1 && (str = split[1]) != null && !str.isEmpty() && split[1].matches("[0-9]+")) {
                        return split[1];
                    }
                }
            }
        }
        return null;
    }

    public static ArrayList<String> LIZIZ(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(",")) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    public static boolean LIZJ(Effect effect) {
        if (effect != null && ((effect.getTags() != null && effect.getTags().contains("text2d")) || effect.getTypes().contains("Text2D") || effect.getTypes().contains("Text2DV2"))) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(Effect effect) {
        if (effect != null) {
            if (effect.getTypes() != null && effect.getTypes().contains("AR")) {
                return true;
            }
            if (effect.getRequirements() != null && effect.getRequirements().contains("AR")) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJ(Effect effect) {
        if (LIZLLL(effect) || LJJI(effect) || LIZJ(effect)) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(Effect effect) {
        String str;
        AudioGraph audioGraph;
        if (effect != null) {
            str = effect.getSdkExtra();
        } else {
            str = null;
        }
        String LJII = V3N.LJII(str, "audio_graph");
        if (LJII != null && (audioGraph = (AudioGraph) GsonProtectorUtils.fromJson(C82891Wg3.LIZJ(), LJII, AudioGraph.class)) != null && audioGraph.enableMic()) {
            return true;
        }
        return false;
    }

    public static boolean LJI(Effect effect) {
        String LJII;
        AudioGraph audioGraph;
        if (effect == null || (LJII = V3N.LJII(effect.getSdkExtra(), "audio_graph")) == null || (audioGraph = (AudioGraph) GsonProtectorUtils.fromJson(C82891Wg3.LIZJ(), LJII, AudioGraph.class)) == null || !audioGraph.enableMusic()) {
            return false;
        }
        return true;
    }

    public static boolean LJII(Effect effect) {
        if ((effect == null || ((effect.getParentId() == null || effect.getParentId().isEmpty()) && effect.getEffectType() != 1 && !effect.getTypes().contains("Adaptive"))) && !LJIIIZ(effect) && !C79260V8u.LIZIZ(effect) && ((effect == null || effect.getTypes() == null || !effect.getTypes().contains("Composer")) && !LJIIIIZZ(effect) && !LJIILL(effect) && !LJIILJJIL(effect))) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (!V3N.LJIJ(effect.getExtra(), "is_avatar", false) && !V3N.LJIJ(effect.getSdkExtra(), "is_avatar", false)) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIZ(Effect effect) {
        if (LJIJJLI(effect, "BackgroundVideo")) {
            return true;
        }
        if (effect != null && V3N.LJIJ(effect.getSdkExtra(), "BackgroundVideo", false)) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJ(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (effect.isBusiness()) {
            return true;
        }
        try {
            if (1 != ((FaceStickerCommerceBean) new Gson().LJI(effect.getExtra(), FaceStickerCommerceBean.class)).commerceStickerType) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean LJIIJJI(Effect effect) {
        if (effect == null || !effect.isBusiness()) {
            return false;
        }
        try {
            if (1 != ((FaceStickerCommerceBean) new Gson().LJI(effect.getExtra(), FaceStickerCommerceBean.class)).commerceStickerType) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean LJIIL(Effect effect) {
        List asList = Arrays.asList(1, 6, 101, 102);
        if (effect != null && !TextUtils.isEmpty(effect.getDesignerId()) && asList.contains(Integer.valueOf(effect.getSource()))) {
            return true;
        }
        return false;
    }

    public static boolean LJIILIIL(Effect effect) {
        if (effect == null || !V3N.LJIJ(effect.getExtra(), "disturbing_effect", false)) {
            return false;
        }
        return true;
    }

    public static boolean LJIILJJIL(Effect effect) {
        if (effect != null && effect.getSource() == 10001) {
            return true;
        }
        return false;
    }

    public static boolean LJIILL(Effect effect) {
        if (effect == null || TextUtils.isEmpty(effect.getExtra())) {
            return false;
        }
        return V3N.LJIJ(effect.getExtra(), "half_customized", false);
    }

    public static boolean LJIILLIIL(Effect effect) {
        if (LJIIIZ(effect) && LJIJJLI(effect, "MultiScanBgVideo")) {
            return true;
        }
        return false;
    }

    public static boolean LJIIZILJ(Effect effect) {
        if (effect != null && effect.getEffectType() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LJIJ(Effect effect) {
        if (effect == null || !V3N.LJIJ(effect.getExtra(), "photosensitive", false)) {
            return false;
        }
        return true;
    }

    public static boolean LJIJI(Effect effect) {
        boolean z = false;
        if (effect == null) {
            return false;
        }
        String extra = effect.getExtra();
        if (TextUtils.isEmpty(extra)) {
            return false;
        }
        try {
            z = new JSONObject(extra).optBoolean("need_effect_to_capture_image", false);
            return z;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return z;
        }
    }

    public static boolean LJIJJ(Effect effect) {
        if (effect != null && effect.getEffectType() == 2) {
            return true;
        }
        return false;
    }

    public static boolean LJJ(Effect effect) {
        if (effect == null) {
            return false;
        }
        Iterator<String> it = effect.getTags().iterator();
        while (it.hasNext()) {
            if (it.next().contains(":1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJJI(Effect effect) {
        if (effect != null && ((effect.getTags() != null && effect.getTags().contains("TextEdit")) || effect.getTypes().contains("TextEdit"))) {
            return true;
        }
        return false;
    }

    public static boolean LJJIFFI(Effect effect) {
        if (effect == null || effect.getTypes() == null) {
            return false;
        }
        return effect.getTypes().contains("TouchGes");
    }

    public static boolean LJJII(Effect effect) {
        if (LJIJJLI(effect, "voice_recognization") || LJFF(effect)) {
            return true;
        }
        return false;
    }

    public static boolean LJJIII(Effect effect) {
        if (LJJI(effect)) {
            return true;
        }
        if (effect != null && effect.getTags() != null && effect.getTags().contains("textInShoot")) {
            return true;
        }
        return false;
    }

    public static boolean LJIJJLI(Effect effect, String str) {
        if (effect == null || C78886Uxe.LJJIJ(effect.getTags()) || !effect.getTags().contains(str)) {
            return false;
        }
        return true;
    }

    public static boolean LJIL(String str, FaceStickerBean faceStickerBean) {
        if (faceStickerBean == FaceStickerBean.NONE || C78886Uxe.LJJIJ(faceStickerBean.getTags()) || !faceStickerBean.getTags().contains(str)) {
            return false;
        }
        return true;
    }
}
