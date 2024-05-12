package com.ss.android.ugc.aweme.experiment;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public interface RigPathBystanderSettings {
    public static final RigPathConfig LIZ = new RigPathConfig("/aweme/v1/aweme/stats/", "/service/2/app_log/");

    /* loaded from: classes7.dex */
    public static class RigPathConfig {

        @InterfaceC65349Pkn("cacheSizeCustom")
        public int cacheSizeCustom;

        @InterfaceC65349Pkn("pathFilter")
        public List<String> pathFilter;

        public RigPathConfig() {
            this.cacheSizeCustom = 10;
            this.pathFilter = new ArrayList();
        }

        public RigPathConfig(String str, String str2) {
            this.cacheSizeCustom = 10;
            ArrayList arrayList = new ArrayList();
            this.pathFilter = arrayList;
            arrayList.add(str);
            this.pathFilter.add(str2);
        }
    }
}
