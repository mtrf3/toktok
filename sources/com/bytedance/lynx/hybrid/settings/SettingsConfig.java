package com.bytedance.lynx.hybrid.settings;

import X.C1DI;
import X.C1FJ;
import X.C39839FkJ;
import X.C39867Fkl;
import X.C42398GkU;
import X.InterfaceC39840FkK;
import X.InterfaceC65784Pro;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class SettingsConfig {
    public static final Companion Companion = new Companion();
    public final Companion.Builder builder;

    /* loaded from: classes7.dex */
    public static final class Companion {

        /* loaded from: classes7.dex */
        public static final class Builder {
            public Long absoluteInterval;
            public String host;
            public Long relativeInterval;
            public final Map<String, String> queries = new LinkedHashMap();
            public final Map<String, InterfaceC65784Pro<String>> queriesByExecution = new LinkedHashMap();
            public InterfaceC39840FkK configParser = new C39839FkJ();

            public final SettingsConfig build() {
                return new SettingsConfig(this, null);
            }

            public final String getHost$hybrid_settings_release() {
                String str = this.host;
                if (str != null) {
                    return str;
                }
                o.LJIJI("host");
                throw null;
            }

            public final Long getAbsoluteInterval$hybrid_settings_release() {
                return this.absoluteInterval;
            }

            public final InterfaceC39840FkK getConfigParser$hybrid_settings_release() {
                return this.configParser;
            }

            public final Map<String, String> getQueries$hybrid_settings_release() {
                return this.queries;
            }

            public final Map<String, InterfaceC65784Pro<String>> getQueriesByExecution$hybrid_settings_release() {
                return this.queriesByExecution;
            }

            public final Long getRelativeInterval$hybrid_settings_release() {
                return this.relativeInterval;
            }

            public final Builder addQueries(Map<String, String> map) {
                o.LJIIJ(map, "map");
                this.queries.putAll(map);
                return this;
            }

            public final Builder setAbsoluteInterval(long j) {
                this.absoluteInterval = Long.valueOf(j);
                return this;
            }

            public final void setAbsoluteInterval$hybrid_settings_release(Long l) {
                this.absoluteInterval = l;
            }

            public final Builder setConfigParser(InterfaceC39840FkK configParser) {
                o.LJIIJ(configParser, "configParser");
                this.configParser = configParser;
                return this;
            }

            public final void setConfigParser$hybrid_settings_release(InterfaceC39840FkK interfaceC39840FkK) {
                o.LJIIJ(interfaceC39840FkK, "<set-?>");
                this.configParser = interfaceC39840FkK;
            }

            public final Builder setHost(String host) {
                o.LJIIJ(host, "host");
                if (!s.LJJL(host, '/')) {
                    host = C42398GkU.LIZIZ(host, '/');
                }
                this.host = host;
                return this;
            }

            public final void setHost$hybrid_settings_release(String str) {
                o.LJIIJ(str, "<set-?>");
                this.host = str;
            }

            public final Builder setRelativeInterval(long j) {
                this.relativeInterval = Long.valueOf(j);
                return this;
            }

            public final void setRelativeInterval$hybrid_settings_release(Long l) {
                this.relativeInterval = l;
            }

            public final Builder appendQuery(String key, InterfaceC65784Pro<String> value) {
                o.LJIIJ(key, "key");
                o.LJIIJ(value, "value");
                this.queriesByExecution.put(key, value);
                return this;
            }

            public final Builder appendQuery(String key, String value) {
                o.LJIIJ(key, "key");
                o.LJIIJ(value, "value");
                this.queries.put(key, value);
                return this;
            }
        }
    }

    public final String buildUrl() {
        StringBuilder sb = new StringBuilder(this.builder.getHost$hybrid_settings_release());
        boolean z = true;
        for (Map.Entry<String, String> entry : this.builder.getQueries$hybrid_settings_release().entrySet()) {
            if (z) {
                sb.append("?");
                z = false;
            } else {
                sb.append("&");
            }
            sb.append((String) C1FJ.LIZJ(sb, entry.getKey(), "=", entry));
        }
        for (Map.Entry<String, InterfaceC65784Pro<String>> entry2 : this.builder.getQueriesByExecution$hybrid_settings_release().entrySet()) {
            if (z) {
                sb.append("?");
                z = false;
            } else {
                sb.append("&");
            }
            String invoke = entry2.getValue().invoke();
            if (invoke == null) {
                return null;
            }
            C1DI.LIZIZ(sb, entry2.getKey(), "=", invoke);
        }
        return sb.toString();
    }

    public final Long getAbsoluteInterval() {
        return this.builder.getAbsoluteInterval$hybrid_settings_release();
    }

    public final Long getRelativeInterval() {
        return this.builder.getRelativeInterval$hybrid_settings_release();
    }

    public SettingsConfig(Companion.Builder builder) {
        this.builder = builder;
    }

    public final C39867Fkl parseConfig(String content) {
        o.LJIIJ(content, "content");
        return this.builder.getConfigParser$hybrid_settings_release().LIZ(content);
    }

    public /* synthetic */ SettingsConfig(Companion.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }
}
