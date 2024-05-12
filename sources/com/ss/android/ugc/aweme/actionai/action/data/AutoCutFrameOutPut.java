package com.ss.android.ugc.aweme.actionai.action.data;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class AutoCutFrameOutPut {
    public final String featurebits;
    public final String rec_config;
    public final String zip_uri;

    public static /* synthetic */ AutoCutFrameOutPut copy$default(AutoCutFrameOutPut autoCutFrameOutPut, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = autoCutFrameOutPut.zip_uri;
        }
        if ((i & 2) != 0) {
            str2 = autoCutFrameOutPut.rec_config;
        }
        if ((i & 4) != 0) {
            str3 = autoCutFrameOutPut.featurebits;
        }
        return autoCutFrameOutPut.copy(str, str2, str3);
    }

    public final AutoCutFrameOutPut copy(String zip_uri, String str, String str2) {
        o.LJIIIZ(zip_uri, "zip_uri");
        return new AutoCutFrameOutPut(zip_uri, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCutFrameOutPut)) {
            return false;
        }
        AutoCutFrameOutPut autoCutFrameOutPut = (AutoCutFrameOutPut) obj;
        return o.LJ(this.zip_uri, autoCutFrameOutPut.zip_uri) && o.LJ(this.rec_config, autoCutFrameOutPut.rec_config) && o.LJ(this.featurebits, autoCutFrameOutPut.featurebits);
    }

    public int hashCode() {
        int hashCode = this.zip_uri.hashCode() * 31;
        String str = this.rec_config;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.featurebits;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("zip_uri", this.zip_uri);
        jSONObject.put("rec_config", this.rec_config);
        jSONObject.put("featurebits", this.featurebits);
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …its)\n        }.toString()");
        return jSONObject2;
    }

    public final String getFeaturebits() {
        return this.featurebits;
    }

    public final String getRec_config() {
        return this.rec_config;
    }

    public final String getZip_uri() {
        return this.zip_uri;
    }

    public AutoCutFrameOutPut(String zip_uri, String str, String str2) {
        o.LJIIIZ(zip_uri, "zip_uri");
        this.zip_uri = zip_uri;
        this.rec_config = str;
        this.featurebits = str2;
    }
}
