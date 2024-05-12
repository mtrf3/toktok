package com.ss.android.ugc.aweme.poi.experiment;

import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PoiSearchConfig {
    public static final Config LIZ = new Config(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* loaded from: classes7.dex */
    public static final class Config {

        @InterfaceC65349Pkn("poi_search_highlight_from_server")
        public final Integer searchHighlightFromServer;

        @InterfaceC65349Pkn("poi_search_show_category_style")
        public final Integer showCategoryStyle;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return o.LJ(this.searchHighlightFromServer, config.searchHighlightFromServer) && o.LJ(this.showCategoryStyle, config.showCategoryStyle);
        }

        public final int hashCode() {
            Integer num = this.searchHighlightFromServer;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.showCategoryStyle;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Config(searchHighlightFromServer=");
            LIZ.append(this.searchHighlightFromServer);
            LIZ.append(", showCategoryStyle=");
            return s0.LIZJ(LIZ, this.showCategoryStyle, ')', LIZ);
        }

        public Config(Integer num, Integer num2) {
            this.searchHighlightFromServer = num;
            this.showCategoryStyle = num2;
        }

        public /* synthetic */ Config(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Config LIZ() {
        FFL LJIIIZ = FFL.LJIIIZ();
        Config config = LIZ;
        LJIIIZ.getClass();
        Config config2 = (Config) FFL.LJIJ(false, "poi_search_config", 31744, Config.class, config);
        if (config2 == null) {
            return new Config(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        return config2;
    }
}
