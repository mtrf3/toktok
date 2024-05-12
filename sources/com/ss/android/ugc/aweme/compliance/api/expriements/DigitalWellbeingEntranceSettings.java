package com.ss.android.ugc.aweme.compliance.api.expriements;

import X.C78685UuP;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DigitalWellbeingEntranceSettings {
    public static final DigitalWellbeingEntranceSettings LIZ = new DigitalWellbeingEntranceSettings();

    /* loaded from: classes7.dex */
    public static final class Config {

        @InterfaceC65349Pkn("pns_cdn_fallback_host")
        public final String pnsCdnFallbackHost;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Config) && o.LJ(this.pnsCdnFallbackHost, ((Config) obj).pnsCdnFallbackHost);
        }

        public final int hashCode() {
            return this.pnsCdnFallbackHost.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Config(pnsCdnFallbackHost=");
            return q.LIZIZ(LIZ, this.pnsCdnFallbackHost, ')', LIZ);
        }

        public Config(String pnsCdnFallbackHost) {
            o.LJIIIZ(pnsCdnFallbackHost, "pnsCdnFallbackHost");
            this.pnsCdnFallbackHost = pnsCdnFallbackHost;
        }

        public /* synthetic */ Config(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static String LIZIZ() {
        Config config = (Config) SettingsManager.LIZLLL().LJIIIIZZ("digital_wellbeing_template", Config.class, null);
        if (config == null) {
            config = new Config("");
        }
        return config.pnsCdnFallbackHost;
    }

    public static String LIZ(String geckoUrl) {
        o.LJIIIZ(geckoUrl, "geckoUrl");
        Uri parse = UriProtector.parse(geckoUrl);
        String queryParameter = UriProtector.getQueryParameter(parse, "channel");
        String queryParameter2 = UriProtector.getQueryParameter(parse, "bundle");
        String LIZIZ = LIZIZ();
        if (C78685UuP.LJJJZ(queryParameter) && C78685UuP.LJJJZ(queryParameter2) && C78685UuP.LJJJZ(LIZIZ)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ());
            LIZ2.append('/');
            LIZ2.append(queryParameter);
            LIZ2.append('/');
            LIZ2.append(queryParameter2);
            String uri = parse.buildUpon().appendQueryParameter("surl", X1D.LIZIZ(LIZ2)).appendQueryParameter("bdhm_bid", "i18n_lynx_privacy_and_safety").build().toString();
            o.LJIIIIZZ(uri, "{\n            val cdnUrl…ld().toString()\n        }");
            return uri;
        }
        return geckoUrl;
    }
}
