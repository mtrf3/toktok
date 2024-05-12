package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS26S0100100_1;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.4FC, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FC {
    public static boolean LIZIZ;
    public static final HashSet<String> LIZ = new HashSet<>();
    public static List<? extends Emoji> LIZJ = C61878OQg.INSTANCE;

    public static String LIZIZ() {
        if (C106034Ed.LIZIZ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append((String) ((LinkedHashMap) C107064Ic.LIZ).get("dm_common_channel_0"));
            LIZ3.append("/action_bar_resources/sticker");
            LIZ2.append(X1D.LIZIZ(LIZ3));
            LIZ2.append("/unzip/");
            return X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(LIZJ());
        LIZ4.append("/unzip/");
        return X1D.LIZIZ(LIZ4);
    }

    public static String LIZJ() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LLIIJLIL(EF7.LIZIZ()).getAbsolutePath());
        LIZ2.append("/action_bar_resources/sticker");
        return X1D.LIZIZ(LIZ2);
    }

    public static void LIZLLL(InterfaceC88472Yns interfaceC88472Yns) {
        String LIZ2;
        String str;
        Emoji LJ;
        if (!C106034Ed.LIZIZ()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(LIZIZ());
            LIZ3.append("info.json");
            File file = new File(X1D.LIZIZ(LIZ3));
            if (!file.exists() || !file.isFile()) {
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(null);
                    return;
                }
                return;
            }
        } else if (C106204Eu.LIZ(C106184Es.LIZJ()).length() == 0) {
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(null);
                return;
            }
            return;
        }
        if (!C106034Ed.LIZIZ()) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(LIZIZ());
            LIZ4.append("info.json");
            LIZ2 = C64544PUu.LIZ(new File(X1D.LIZIZ(LIZ4)));
        } else {
            LIZ2 = C106204Eu.LIZ(C106184Es.LIZJ());
        }
        ArrayList arrayList = new ArrayList();
        try {
            if (C106034Ed.LIZIZ()) {
                str = "action_bar_button_conf";
            } else {
                str = "stickers";
            }
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(new JSONObject(LIZ2), str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                if (jSONObject != null) {
                    long optLong = jSONObject.optLong("id");
                    if (optLong != 0 && (LJ = LJ(jSONObject, optLong)) != null) {
                        arrayList.add(LJ);
                    }
                }
            }
        } catch (JSONException e) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("convert to sticker list failed ");
            LIZ5.append(e);
            C34B.LJI("ActionBarStickerResHelper", X1D.LIZIZ(LIZ5));
        }
        LIZJ = arrayList;
        LIZIZ = true;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(arrayList);
        }
    }

    public static void LIZ(long j, InterfaceC88472Yns onEmojiLoaded) {
        o.LJIIIZ(onEmojiLoaded, "onEmojiLoaded");
        AqS26S0100100_1 aqS26S0100100_1 = new AqS26S0100100_1(j, onEmojiLoaded, 4);
        if (LIZIZ) {
            aqS26S0100100_1.invoke(LIZJ);
        } else if (C106034Ed.LIZIZ()) {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C65742i2(aqS26S0100100_1, null), 3);
        } else {
            LIZLLL(aqS26S0100100_1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Iterator] */
    public static Emoji LJ(JSONObject jSONObject, long j) {
        JSONObject jSONObject2;
        String str = "ActionBarStickerResHelper";
        try {
            Emoji emoji = new Emoji();
            emoji.setAnimateType(JSONObjectProtectorUtils.getString(jSONObject, "animate_type"));
            emoji.setStaticType(JSONObjectProtectorUtils.getString(jSONObject, "static_type"));
            emoji.setDisplayName(JSONObjectProtectorUtils.getString(jSONObject, "display_name"));
            emoji.setId(JSONObjectProtectorUtils.getLong(jSONObject, "id"));
            emoji.setWidth(JSONObjectProtectorUtils.getInt(jSONObject, "width"));
            emoji.setHeight(JSONObjectProtectorUtils.getInt(jSONObject, "height"));
            emoji.setStaticUrl(C77357UXp.LJII(emoji.getWidth(), emoji.getHeight(), JSONObjectProtectorUtils.getString(jSONObject, "static_url")));
            emoji.setAnimateUrl(C77357UXp.LJII(emoji.getWidth(), emoji.getHeight(), JSONObjectProtectorUtils.getString(jSONObject, "animate_url")));
            try {
                jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "display_name_lang");
            } catch (JSONException e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("get display name langs obj failed ");
                LIZ2.append(e);
                C34B.LJI("ActionBarStickerResHelper", X1D.LIZIZ(LIZ2));
                jSONObject2 = null;
            }
            HashMap<String, String> hashMap = new HashMap<>();
            if (jSONObject2 != null && jSONObject2.keys() != null) {
                try {
                    str = jSONObject2.keys();
                    if (str != 0) {
                        while (str.hasNext()) {
                            String str2 = (String) str.next();
                            String string = JSONObjectProtectorUtils.getString(jSONObject2, str2);
                            o.LJIIIIZZ(string, "displayNameLangsObj.getString(key)");
                            hashMap.put(str2, string);
                        }
                    }
                } catch (JSONException e2) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("get display name langs obj keys failed ");
                    LIZ3.append(e2);
                    C34B.LJI(str, X1D.LIZIZ(LIZ3));
                }
            }
            emoji.setDisplayNameLangs(hashMap);
            return emoji;
        } catch (JSONException unused) {
            C85323Wm LIZ4 = C772831o.LIZ();
            C1HQ LIZ5 = C77800Ug8.LIZ(LIZ4, "onEventV3");
            LIZ5.put("sticker_transform_id", String.valueOf(j));
            LIZ4.LIZIZ("sticker_res_transform_error", LIZ5);
            return null;
        }
    }
}
