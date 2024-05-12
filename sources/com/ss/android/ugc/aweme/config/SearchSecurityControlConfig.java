package com.ss.android.ugc.aweme.config;

import X.C221108m2;
import X.C50357JpZ;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.discover.abtest.SearchSecurityControlValue;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class SearchSecurityControlConfig {
    public static final SearchSecurityControlConfig LIZ = new SearchSecurityControlConfig();
    public static final HashMap<String, SearchSecurityControlValue> LIZIZ = new HashMap<>();
    public static final Gson LIZJ = GsonHolder.LIZLLL().LIZ();
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C50357JpZ.LJLIL);

    public static SearchSecurityControlValue LIZ() {
        return (SearchSecurityControlValue) LIZLLL.getValue();
    }

    /* loaded from: classes9.dex */
    public static final class FeelGoodConfig implements Serializable {

        @InterfaceC65349Pkn("ai")
        public Integer ageInterval;

        public final Integer getAgeInterval() {
            return this.ageInterval;
        }

        public final void setAgeInterval(Integer num) {
            this.ageInterval = num;
        }
    }
}
