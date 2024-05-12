package com.bytedance.pitaya.cep_package;

import X.C36457ESn;
import X.ORZ;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import com.bytedance.pitaya.cep_package.port.CepSettingsCallback;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes7.dex */
public final class CepSetupInfo implements CepKeeper {
    public String aid;
    public String appVersion;
    public boolean autoRequestUpdate;
    public String channel;
    public String did;
    public String hostUrl;
    public CepSettingsCallback settingsCallback;

    public /* synthetic */ CepSetupInfo(C36457ESn c36457ESn, DefaultConstructorMarker defaultConstructorMarker) {
        this(c36457ESn);
    }

    public final String getAid() {
        return this.aid;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final boolean getAutoRequestUpdate() {
        return this.autoRequestUpdate;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getDid() {
        return this.did;
    }

    public final String getHostUrl() {
        return this.hostUrl;
    }

    public final CepSettingsCallback getSettingsCallback() {
        return this.settingsCallback;
    }

    public CepSetupInfo(C36457ESn c36457ESn) {
        this.aid = "";
        this.did = "";
        this.appVersion = "";
        this.channel = "";
        this.hostUrl = "https://pitaya.tiktokv.com";
        this.autoRequestUpdate = true;
        this.aid = c36457ESn.LIZ;
        this.did = c36457ESn.LIZIZ;
        this.appVersion = c36457ESn.LIZJ;
        this.channel = c36457ESn.LIZLLL;
        this.settingsCallback = c36457ESn.LJ;
        this.autoRequestUpdate = c36457ESn.LJFF;
    }

    public final void setAid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.aid = str;
    }

    public final void setAppVersion(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.appVersion = str;
    }

    public final void setAutoRequestUpdate(boolean z) {
        this.autoRequestUpdate = z;
    }

    public final void setChannel(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.channel = str;
    }

    public final void setDid(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.did = str;
    }

    public final void setHostUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.hostUrl = str;
    }

    public final void setSettingsCallback(CepSettingsCallback cepSettingsCallback) {
        this.settingsCallback = cepSettingsCallback;
    }

    public final String getSettings(String key, int i) {
        JSONObject settings;
        Boolean valueOf;
        o.LJIIIZ(key, "key");
        List LJLJJL = s.LJLJJL(key, new String[]{"."}, 0, 6);
        Object obj = null;
        if (LJLJJL.isEmpty()) {
            return null;
        }
        CepSettingsCallback cepSettingsCallback = this.settingsCallback;
        if (cepSettingsCallback == null) {
            settings = null;
        } else {
            settings = cepSettingsCallback.getSettings((String) ListProtector.get(LJLJJL, 0));
        }
        int i2 = 1;
        int size = LJLJJL.size() - 1;
        if (1 < size) {
            while (true) {
                int i3 = i2 + 1;
                if (settings == null) {
                    return null;
                }
                settings = settings.optJSONObject((String) ListProtector.get(LJLJJL, i2));
                if (i3 >= size) {
                    break;
                }
                i2 = i3;
            }
        }
        if (settings == null) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(settings.has((String) ORZ.LLFF(LJLJJL)));
        }
        if (o.LJ(valueOf, Boolean.TRUE)) {
            obj = settings.opt((String) ORZ.LLFF(LJLJJL));
        }
        return new JSONObject().put("rst", obj).toString();
    }
}
