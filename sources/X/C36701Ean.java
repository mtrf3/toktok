package X;

import com.bytedance.android.live_settings.LiveSettingModel;
import com.bytedance.android.livesdk.livesetting.other.FollowingBubbleSettingOptSetting;
import com.bytedance.keva.Keva;
import com.google.gson.internal.p;
import com.google.gson.j;
import com.google.gson.m;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ean, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36701Ean {
    public volatile int LIZ;
    public final Keva LIZIZ;
    public volatile JSONObject LIZJ;
    public volatile JSONObject[] LIZLLL = new JSONObject[32];

    public C36701Ean(Keva keva) {
        this.LIZIZ = keva;
    }

    public static JSONObject LIZ(String str) {
        if (str == null || str.isEmpty()) {
            return new JSONObject();
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject LIZIZ(String str) {
        int i;
        if (this.LIZ == 0) {
            this.LIZ = this.LIZIZ.getInt("setting_part_enable", -1);
        }
        if (this.LIZ == -1) {
            if (this.LIZJ != null) {
                return this.LIZJ;
            }
            String string = this.LIZIZ.getString("setting_key", "");
            LIZJ(4, "get all raw setting from back up.");
            JSONObject LIZ = LIZ(string);
            if (LIZ == null) {
                return new JSONObject();
            }
            this.LIZJ = LIZ;
            return LIZ;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            i = hashCode ^ (hashCode >>> 16);
        } else {
            i = 0;
        }
        int i2 = i & 31;
        synchronized (C36701Ean.class) {
            JSONObject jSONObject = this.LIZLLL[i2];
            if (jSONObject != null) {
                return jSONObject;
            }
            String string2 = this.LIZIZ.getString(KMP.LJ("setting_key_part", i2), "");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("get part raw setting, hit index: ");
            LIZ2.append(i2);
            LIZJ(3, X1D.LIZIZ(LIZ2));
            JSONObject LIZ3 = LIZ(string2);
            if (LIZ3 == null) {
                return new JSONObject();
            }
            synchronized (C36701Ean.class) {
                this.LIZLLL[i2] = LIZ3;
            }
            return LIZ3;
        }
    }

    public static void LIZJ(int i, String str) {
        if (FollowingBubbleSettingOptSetting.INSTANCE.isOpt()) {
            return;
        }
        if (i == 3) {
            C0NB.LIZIZ("Live-SettingsOptCache", str);
        } else {
            C0NB.LJIIIZ("Live-SettingsOptCache", str);
        }
    }

    public static String LIZLLL(int i, m mVar) {
        if (mVar == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter(i);
            C65403Plf c65403Plf = new C65403Plf(stringWriter);
            c65403Plf.LJLJJLL = true;
            p.LIZIZ(mVar, c65403Plf);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final void LJ(List list, m mVar) {
        int i;
        if (mVar == null) {
            return;
        }
        HashSet hashSet = new HashSet(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((LiveSettingModel) it.next()).getSettingsKey());
        }
        m[] mVarArr = new m[32];
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("update raw setting, live setting size: ");
        LIZ.append(hashSet.size());
        LIZ.append(", new settings size: ");
        LIZ.append(mVar.size());
        LIZJ(4, X1D.LIZIZ(LIZ));
        Iterator<Map.Entry<String, j>> it2 = mVar.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, j> next = it2.next();
            String key = next.getKey();
            if (!hashSet.contains(key)) {
                j value = next.getValue();
                if (key != null) {
                    int hashCode = key.hashCode();
                    i = hashCode ^ (hashCode >>> 16);
                }
                int i2 = i & 31;
                m mVar2 = mVarArr[i2];
                if (mVar2 == null) {
                    mVar2 = new m();
                    mVarArr[i2] = mVar2;
                }
                mVar2.LJJII(key, value);
            }
        }
        String[] strArr = new String[32];
        JSONObject[] jSONObjectArr = new JSONObject[32];
        int i3 = 0;
        do {
            String LIZLLL = LIZLLL(30000, mVarArr[i3]);
            strArr[i3] = LIZLLL;
            jSONObjectArr[i3] = LIZ(LIZLLL);
            i3++;
        } while (i3 < 32);
        do {
            this.LIZIZ.storeString(KMP.LJ("setting_key_part", i), strArr[i]);
            i++;
        } while (i < 32);
        this.LIZIZ.storeInt("setting_part_enable", 1);
        this.LIZ = 1;
        synchronized (C36701Ean.class) {
            this.LIZLLL = jSONObjectArr;
        }
        this.LIZJ = null;
    }
}
