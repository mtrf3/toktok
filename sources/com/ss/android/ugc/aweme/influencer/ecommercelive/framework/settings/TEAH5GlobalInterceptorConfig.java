package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TEAH5GlobalInterceptorConfig {
    public static final TEAH5GlobalInterceptorConfigModel LIZ = new TEAH5GlobalInterceptorConfigModel(false, null, null);

    /* loaded from: classes7.dex */
    public static final class InterceptSchema {

        @InterfaceC65349Pkn("h5_path")
        public final List<String> h5Path;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InterceptSchema) && o.LJ(this.h5Path, ((InterceptSchema) obj).h5Path);
        }

        public final int hashCode() {
            List<String> list = this.h5Path;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("InterceptSchema(h5Path=");
            return C1NE.LIZIZ(LIZ, this.h5Path, ')', LIZ);
        }

        public InterceptSchema(List<String> list) {
            this.h5Path = list;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Interceptor {

        @InterfaceC65349Pkn("intercept_schema")
        public final InterceptSchema interceptSchema;

        @InterfaceC65349Pkn("name")
        public final String name;

        @InterfaceC65349Pkn("params")
        public final List<Param> params;

        @InterfaceC65349Pkn("prefix_rule")
        public final String prefixRule;

        @InterfaceC65349Pkn("replace_host")
        public final String replaceHost;

        @InterfaceC65349Pkn("replace_rule")
        public final List<Rule> replaceRule;

        @InterfaceC65349Pkn("suffix_rule")
        public final String suffixRule;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interceptor)) {
                return false;
            }
            Interceptor interceptor = (Interceptor) obj;
            return o.LJ(this.name, interceptor.name) && o.LJ(this.params, interceptor.params) && o.LJ(this.interceptSchema, interceptor.interceptSchema) && o.LJ(this.replaceRule, interceptor.replaceRule) && o.LJ(this.replaceHost, interceptor.replaceHost) && o.LJ(this.prefixRule, interceptor.prefixRule) && o.LJ(this.suffixRule, interceptor.suffixRule);
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            List<Param> list = this.params;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            InterceptSchema interceptSchema = this.interceptSchema;
            int hashCode3 = (hashCode2 + (interceptSchema == null ? 0 : interceptSchema.hashCode())) * 31;
            List<Rule> list2 = this.replaceRule;
            int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.replaceHost;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.prefixRule;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.suffixRule;
            return hashCode6 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Interceptor(name=");
            LIZ.append(this.name);
            LIZ.append(", params=");
            LIZ.append(this.params);
            LIZ.append(", interceptSchema=");
            LIZ.append(this.interceptSchema);
            LIZ.append(", replaceRule=");
            LIZ.append(this.replaceRule);
            LIZ.append(", replaceHost=");
            LIZ.append(this.replaceHost);
            LIZ.append(", prefixRule=");
            LIZ.append(this.prefixRule);
            LIZ.append(", suffixRule=");
            return q.LIZIZ(LIZ, this.suffixRule, ')', LIZ);
        }

        public Interceptor(String name, List<Param> list, InterceptSchema interceptSchema, List<Rule> list2, String str, String str2, String str3) {
            o.LJIIIZ(name, "name");
            this.name = name;
            this.params = list;
            this.interceptSchema = interceptSchema;
            this.replaceRule = list2;
            this.replaceHost = str;
            this.prefixRule = str2;
            this.suffixRule = str3;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Param {

        @InterfaceC65349Pkn("key")
        public final String key;

        @InterfaceC65349Pkn("value")
        public final String value;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Param)) {
                return false;
            }
            Param param = (Param) obj;
            return o.LJ(this.value, param.value) && o.LJ(this.key, param.key);
        }

        public final int hashCode() {
            return this.key.hashCode() + (this.value.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Param(value=");
            LIZ.append(this.value);
            LIZ.append(", key=");
            return q.LIZIZ(LIZ, this.key, ')', LIZ);
        }

        public Param(String value, String key) {
            o.LJIIIZ(value, "value");
            o.LJIIIZ(key, "key");
            this.value = value;
            this.key = key;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Rule {

        @InterfaceC65349Pkn("origin")
        public final String origin;

        @InterfaceC65349Pkn("value")
        public final String value;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rule)) {
                return false;
            }
            Rule rule = (Rule) obj;
            return o.LJ(this.origin, rule.origin) && o.LJ(this.value, rule.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + (this.origin.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Rule(origin=");
            LIZ.append(this.origin);
            LIZ.append(", value=");
            return q.LIZIZ(LIZ, this.value, ')', LIZ);
        }

        public Rule(String origin, String value) {
            o.LJIIIZ(origin, "origin");
            o.LJIIIZ(value, "value");
            this.origin = origin;
            this.value = value;
        }
    }

    /* loaded from: classes7.dex */
    public static final class TEAH5GlobalInterceptorConfigModel {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("intercept_schema")
        public final List<String> interceptSchema;

        @InterfaceC65349Pkn("interceptors")
        public final List<Interceptor> interceptors;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TEAH5GlobalInterceptorConfigModel)) {
                return false;
            }
            TEAH5GlobalInterceptorConfigModel tEAH5GlobalInterceptorConfigModel = (TEAH5GlobalInterceptorConfigModel) obj;
            return this.enable == tEAH5GlobalInterceptorConfigModel.enable && o.LJ(this.interceptSchema, tEAH5GlobalInterceptorConfigModel.interceptSchema) && o.LJ(this.interceptors, tEAH5GlobalInterceptorConfigModel.interceptors);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        public final int hashCode() {
            boolean z = this.enable;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            List<String> list = this.interceptSchema;
            int hashCode = (i + (list == null ? 0 : list.hashCode())) * 31;
            List<Interceptor> list2 = this.interceptors;
            return hashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TEAH5GlobalInterceptorConfigModel(enable=");
            LIZ.append(this.enable);
            LIZ.append(", interceptSchema=");
            LIZ.append(this.interceptSchema);
            LIZ.append(", interceptors=");
            return C1NE.LIZIZ(LIZ, this.interceptors, ')', LIZ);
        }

        public TEAH5GlobalInterceptorConfigModel(boolean z, List<String> list, List<Interceptor> list2) {
            this.enable = z;
            this.interceptSchema = list;
            this.interceptors = list2;
        }
    }
}
