package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.ETi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36478ETi {
    public final Keva LIZ;

    public final Effect LIZIZ() {
        String string = this.LIZ.getString("special_plus_effect", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return (Effect) GsonProtectorUtils.fromJson(C44172HVg.LIZIZ, string, Effect.class);
    }

    public C36478ETi() {
        Keva repo = Keva.getRepo("special_plus_keva");
        o.LJIIIIZZ(repo, "getRepo(REPO_NAME)");
        this.LIZ = repo;
    }

    public final HashMap<String, Integer> LIZ(String tab) {
        o.LJIIIZ(tab, "tab");
        String currentUserID = C44172HVg.LJIJ.getCurrentUserID();
        String str = "";
        if (o.LJ(tab, "homepage_hot")) {
            Keva keva = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("effect_video_plus_transformations_map_tab_fyp");
            LIZ.append(currentUserID);
            str = keva.getString(X1D.LIZIZ(LIZ), "");
            o.LJIIIIZZ(str, "keva.getString(EFFECT_VI…MAP_TAB_FYP + userId, \"\")");
        } else if (o.LJ(tab, "homepage_follow")) {
            Keva keva2 = this.LIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("effect_video_plus_transformations_map_tab_following");
            LIZ2.append(currentUserID);
            str = keva2.getString(X1D.LIZIZ(LIZ2), "");
            o.LJIIIIZZ(str, "keva.getString(EFFECT_VI…B_FOLLOWING + userId, \"\")");
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        HashMap mapFromLocalStorage = (HashMap) GsonProtectorUtils.fromJson(C44172HVg.LIZIZ, str, HashMap.class);
        o.LJIIIIZZ(mapFromLocalStorage, "mapFromLocalStorage");
        for (Map.Entry entry : mapFromLocalStorage.entrySet()) {
            String obj = entry.getKey().toString();
            Object value = entry.getValue();
            o.LJII(value, "null cannot be cast to non-null type kotlin.Double");
            hashMap.put(obj, Integer.valueOf((int) ((Double) value).doubleValue()));
        }
        return hashMap;
    }

    public final void LIZJ(String str, List list) {
        String json = GsonProtectorUtils.toJson(C44172HVg.LIZIZ, list);
        o.LJIIIIZZ(json, "GSON.toJson(effectsUsedPreviously)");
        if (o.LJ(str, "homepage_hot")) {
            this.LIZ.storeString("effects_used_previously_fyp", json);
        } else {
            if (!o.LJ(str, "homepage_follow")) {
                return;
            }
            this.LIZ.storeString("effects_used_previously_following", json);
        }
    }

    public final void LIZLLL(HashMap<String, Integer> map, String tab) {
        o.LJIIIZ(map, "map");
        o.LJIIIZ(tab, "tab");
        String json = GsonProtectorUtils.toJson(C44172HVg.LIZIZ, map);
        o.LJIIIIZZ(json, "GSON.toJson(map)");
        String currentUserID = C44172HVg.LJIJ.getCurrentUserID();
        if (o.LJ(tab, "homepage_hot")) {
            Keva keva = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("effect_video_plus_transformations_map_tab_fyp");
            LIZ.append(currentUserID);
            keva.storeString(X1D.LIZIZ(LIZ), json);
            return;
        }
        if (!o.LJ(tab, "homepage_follow")) {
            return;
        }
        Keva keva2 = this.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("effect_video_plus_transformations_map_tab_following");
        LIZ2.append(currentUserID);
        keva2.storeString(X1D.LIZIZ(LIZ2), json);
    }
}
