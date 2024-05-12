package com.bytedance.pitaya.jniwrapper;

import X.C93317aOv;
import X.F9J;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.pitaya.log.PitayaLogger;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class DefaultMigrationAdapter implements IFEMigrationAdapter {
    public static final DefaultMigrationAdapter INSTANCE = new DefaultMigrationAdapter();

    @Override // com.bytedance.pitaya.jniwrapper.IFEMigrationAdapter
    public void deleteLegacyKVStoreValues() {
        try {
            Context LIZ = C93317aOv.LIZ();
            if (LIZ != null) {
                SharedPreferences LIZIZ = F9J.LIZIZ(LIZ, 0, "pty-user-default-store");
                if (LIZIZ != null) {
                    LIZIZ.edit().clear().apply();
                }
            }
        } catch (Throwable th) {
            PitayaLogger.LJ(th, null, 6);
        }
    }

    @Override // com.bytedance.pitaya.jniwrapper.IFEMigrationAdapter
    public String getLegacyKVStoreValues() {
        SharedPreferences sharedPreferences;
        String str;
        String str2;
        Context LIZ = C93317aOv.LIZ();
        if (LIZ != null) {
            sharedPreferences = F9J.LIZIZ(LIZ, 0, "pty-user-default-store");
        } else {
            sharedPreferences = null;
        }
        if (sharedPreferences == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    str2 = value.toString();
                } else {
                    str2 = null;
                }
                jSONObject.put(key, str2);
            }
        }
        try {
            str = jSONObject.toString();
        } catch (JSONException unused) {
            str = "";
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
