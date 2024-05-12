package com.ss.android.ugc.aweme.websocket.api.ab;

import X.C114914f9;
import X.C1NE;
import X.C221108m2;
import X.C35683DzT;
import X.C35684DzU;
import X.C62822Ol8;
import X.FMX;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EventSampleRateExp {
    public static final Config LIZ = new Config(false, null, 3, 0 == true ? 1 : 0);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C35684DzU.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C35683DzT.LJLIL);

    /* loaded from: classes7.dex */
    public static final class Config {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("rate_map")
        public final List<RateEntry> rateMap;

        /* JADX WARN: Multi-variable type inference failed */
        public Config() {
            this(false, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Config)) {
                return false;
            }
            Config config = (Config) obj;
            return this.enable == config.enable && o.LJ(this.rateMap, config.rateMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            List<RateEntry> list = this.rateMap;
            return i + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Config(enable=");
            LIZ.append(this.enable);
            LIZ.append(", rateMap=");
            return C1NE.LIZIZ(LIZ, this.rateMap, ')', LIZ);
        }

        public Config(boolean z, List<RateEntry> list) {
            this.enable = z;
            this.rateMap = list;
        }

        public /* synthetic */ Config(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? new ArrayList() : list);
        }
    }

    public static boolean LIZ(String str) {
        if (!C114914f9.LIZ()) {
            return FMX.LIZJ(str);
        }
        if (!((Config) LIZIZ.getValue()).enable || str.length() == 0) {
            return false;
        }
        Float f = (Float) ((Map) LIZJ.getValue()).get(str);
        if (f == null) {
            f = Float.valueOf(1.0f);
        }
        if (f.floatValue() < 1.0d && Math.random() >= f.floatValue()) {
            return false;
        }
        return true;
    }

    /* loaded from: classes7.dex */
    public static final class RateEntry {

        @InterfaceC65349Pkn("key")
        public final String key;

        @InterfaceC65349Pkn("value")
        public final Float value;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RateEntry)) {
                return false;
            }
            RateEntry rateEntry = (RateEntry) obj;
            return o.LJ(this.key, rateEntry.key) && o.LJ(this.value, rateEntry.value);
        }

        public final int hashCode() {
            String str = this.key;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Float f = this.value;
            return hashCode + (f != null ? f.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RateEntry(key=");
            LIZ.append(this.key);
            LIZ.append(", value=");
            LIZ.append(this.value);
            LIZ.append(')');
            return X1D.LIZIZ(LIZ);
        }

        public RateEntry(String str, Float f) {
            this.key = str;
            this.value = f;
        }
    }
}
