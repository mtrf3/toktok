package com.ss.android.ugc.aweme.setting.api;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BetaVersionBody {

    @InterfaceC65349Pkn("data")
    public final Data data;

    public final Integer LIZ() {
        Data data = this.data;
        if (data != null) {
            return data.versionCode;
        }
        return null;
    }

    public final String LIZIZ() {
        Data data = this.data;
        if (data != null) {
            return data.versionName;
        }
        return null;
    }

    public final boolean LIZJ() {
        String str;
        Data data = this.data;
        if (data != null) {
            str = data.channel;
        } else {
            str = null;
        }
        return o.LJ(str, "beta_closedtesting");
    }

    public BetaVersionBody(Data data) {
        this.data = data;
    }

    /* loaded from: classes7.dex */
    public static final class Data {

        @InterfaceC65349Pkn("channel")
        public final String channel;

        @InterfaceC65349Pkn("tip_version_code")
        public final Integer versionCode;

        @InterfaceC65349Pkn("tip_version_name")
        public final String versionName;

        public Data(Integer num, String str, String str2) {
            this.versionCode = num;
            this.versionName = str;
            this.channel = str2;
        }
    }
}
