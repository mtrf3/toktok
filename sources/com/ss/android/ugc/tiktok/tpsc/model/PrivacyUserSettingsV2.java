package com.ss.android.ugc.tiktok.tpsc.model;

import X.C65413Plp;
import X.F9E;
import X.InterfaceC65404Plg;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.j;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

@InterfaceC65404Plg(PrivacyUserSettingsV2Deserializer.class)
/* loaded from: classes12.dex */
public final class PrivacyUserSettingsV2 extends F9E {
    public final Map<String, Integer> LJLIL;

    public PrivacyUserSettingsV2() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    /* loaded from: classes12.dex */
    public static final class PrivacyUserSettingsV2Deserializer implements i<PrivacyUserSettingsV2>, r<PrivacyUserSettingsV2> {
        public final Type LIZ;

        public PrivacyUserSettingsV2Deserializer() {
            Type type = new C65413Plp().getType();
            o.LJIIIIZZ(type, "object : TypeToken<Mutab…p<String, Int>>() {}.type");
            this.LIZ = type;
        }

        @Override // com.google.gson.i
        public final PrivacyUserSettingsV2 deserialize(j jVar, Type type, h hVar) {
            if (hVar == null) {
                return null;
            }
            try {
                Map map = (Map) ((TreeTypeAdapter.a) hVar).LIZ(jVar, this.LIZ);
                if (map == null) {
                    return null;
                }
                return new PrivacyUserSettingsV2((Map<String, Integer>) map);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // com.google.gson.r
        public final j serialize(PrivacyUserSettingsV2 privacyUserSettingsV2, Type typeOfSrc, q context) {
            PrivacyUserSettingsV2 src = privacyUserSettingsV2;
            o.LJIIIZ(src, "src");
            o.LJIIIZ(typeOfSrc, "typeOfSrc");
            o.LJIIIZ(context, "context");
            j LJIL = TreeTypeAdapter.this.LIZJ.LJIL(src.LJLIL, this.LIZ);
            o.LJIIIIZZ(LJIL, "context.serialize(src.privacyUserSettings, type)");
            return LJIL;
        }
    }

    public PrivacyUserSettingsV2(Map<String, Integer> privacyUserSettings) {
        o.LJIIIZ(privacyUserSettings, "privacyUserSettings");
        this.LJLIL = privacyUserSettings;
    }

    public static PrivacyUserSettingsV2 L(PrivacyUserSettingsV2 privacyUserSettingsV2) {
        Map<String, Integer> privacyUserSettings = privacyUserSettingsV2.LJLIL;
        privacyUserSettingsV2.getClass();
        o.LJIIIZ(privacyUserSettings, "privacyUserSettings");
        return new PrivacyUserSettingsV2(privacyUserSettings);
    }

    public final Integer M(String key) {
        o.LJIIIZ(key, "key");
        return this.LJLIL.get(key);
    }

    public /* synthetic */ PrivacyUserSettingsV2(int i) {
        this(new LinkedHashMap());
    }
}
