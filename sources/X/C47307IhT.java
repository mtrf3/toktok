package X;

import android.app.Application;
import android.content.res.Resources;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import defpackage.a1;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.IhT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47307IhT {
    public RateSettingsResponse LIZ;
    public RateSettingsResponse LIZIZ;

    public final synchronized RateSettingsResponse LIZ() {
        if (this.LIZ == null) {
            RateSettingsResponse rateSettingsResponse = C1DG.LIZ().getConfig().getCommonConfig().getRateSettingsResponse();
            if (rateSettingsResponse != null) {
                this.LIZ = rateSettingsResponse;
            } else {
                return LIZIZ();
            }
        }
        return this.LIZ;
    }

    public final RateSettingsResponse LIZIZ() {
        String str;
        String str2;
        if (this.LIZIZ == null) {
            RateSettingsResponse defaultRateSettingsResponse = C1DG.LIZ().getConfig().getCommonConfig().getDefaultRateSettingsResponse();
            this.LIZIZ = defaultRateSettingsResponse;
            if (defaultRateSettingsResponse == null) {
                Application application = C46982IcE.LIZ;
                String LIZ = C39399FdD.LIZ(Resources.getSystem().getConfiguration().locale);
                if (C86799Y4t.LIZIZ.contains(LIZ)) {
                    str = "ng";
                } else if (C86799Y4t.LIZ.contains(LIZ)) {
                    str = LIZ.toLowerCase();
                } else if (C86799Y4t.LIZJ.contains(LIZ)) {
                    str = "pe";
                } else {
                    str = "other";
                }
                try {
                    InputStream open = application.getAssets().open(a1.LJ("simkit_rate_settings/", str, ".json"));
                    try {
                        byte[] bArr = new byte[open.available()];
                        open.read(bArr);
                        str2 = new String(bArr, "UTF-8");
                        open.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    str2 = null;
                }
                this.LIZIZ = (RateSettingsResponse) GsonProtectorUtils.fromJson(new Gson(), str2, new C47308IhU().getType());
            }
        }
        return this.LIZIZ;
    }
}
