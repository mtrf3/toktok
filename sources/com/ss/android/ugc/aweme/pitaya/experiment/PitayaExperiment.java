package com.ss.android.ugc.aweme.pitaya.experiment;

import X.C35793E2z;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class PitayaExperiment {
    public static final PitayaExperiment LIZ = new PitayaExperiment();
    public static Config LIZIZ = LIZ();
    public static JSONObject LIZJ;

    /* loaded from: classes7.dex */
    public static final class Config {

        @InterfaceC65349Pkn("content")
        public final m content;

        @InterfaceC65349Pkn("enable")
        public final int enable;

        @InterfaceC65349Pkn("magi")
        public final m magi;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enable == config.enable && o.LJ(this.content, config.content) && o.LJ(this.magi, config.magi);
        }

        public final int hashCode() {
            int i = this.enable * 31;
            m mVar = this.content;
            int hashCode = (i + (mVar == null ? 0 : mVar.hashCode())) * 31;
            m mVar2 = this.magi;
            return hashCode + (mVar2 != null ? mVar2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Config(enable=");
            LIZ.append(this.enable);
            LIZ.append(", content=");
            LIZ.append(this.content);
            LIZ.append(", magi=");
            LIZ.append(this.magi);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public Config(int i, m mVar, m mVar2) {
            this.enable = i;
            this.content = mVar;
            this.magi = mVar2;
        }

        public /* synthetic */ Config(int i, m mVar, m mVar2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : mVar, (i2 & 4) != 0 ? null : mVar2);
        }
    }

    static {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(String.valueOf(LIZIZ.content));
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        LIZJ = jSONObject;
        try {
            new JSONObject(String.valueOf(LIZIZ.magi));
        } catch (Exception unused2) {
            new JSONObject();
        }
        SettingsManager.LIZLLL().LJIIIZ(C35793E2z.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Config LIZ() {
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("pitaya_general_settings", Config.class, null);
        if (config == null) {
            return new Config(0, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
        }
        return config;
    }
}
