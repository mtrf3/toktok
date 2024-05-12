package com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TEARouterInterceptorConfig {
    public static final TEARouterInterceptorConfigModel LIZ = new TEARouterInterceptorConfigModel(false, null, null, null);

    /* loaded from: classes7.dex */
    public static final class InterceptSchema {

        @InterfaceC65349Pkn("h5_path")
        public final List<String> h5Path;

        @InterfaceC65349Pkn("lynx_path")
        public final List<LynxPath> lynxPath;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InterceptSchema)) {
                return false;
            }
            InterceptSchema interceptSchema = (InterceptSchema) obj;
            return o.LJ(this.lynxPath, interceptSchema.lynxPath) && o.LJ(this.h5Path, interceptSchema.h5Path);
        }

        public final int hashCode() {
            List<LynxPath> list = this.lynxPath;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<String> list2 = this.h5Path;
            return hashCode + (list2 != null ? list2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("InterceptSchema(lynxPath=");
            LIZ.append(this.lynxPath);
            LIZ.append(", h5Path=");
            return C1NE.LIZIZ(LIZ, this.h5Path, ')', LIZ);
        }

        public InterceptSchema(List<LynxPath> list, List<String> list2) {
            this.lynxPath = list;
            this.h5Path = list2;
        }

        public /* synthetic */ InterceptSchema(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : list, list2);
        }
    }

    /* loaded from: classes7.dex */
    public static final class Interceptor {

        @InterfaceC65349Pkn("intercept_schema")
        public final InterceptSchema interceptSchema;

        @InterfaceC65349Pkn("move_params")
        public final List<String> moveParams;

        @InterfaceC65349Pkn("name")
        public final String name;

        @InterfaceC65349Pkn("params")
        public final List<Status> params;

        @InterfaceC65349Pkn("redirect_schema")
        public final String redirectSchema;

        @InterfaceC65349Pkn("remove_params")
        public final List<String> removeParams;

        @InterfaceC65349Pkn("status")
        public final List<Status> status;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Interceptor)) {
                return false;
            }
            Interceptor interceptor = (Interceptor) obj;
            return o.LJ(this.name, interceptor.name) && o.LJ(this.params, interceptor.params) && o.LJ(this.status, interceptor.status) && o.LJ(this.interceptSchema, interceptor.interceptSchema) && o.LJ(this.redirectSchema, interceptor.redirectSchema) && o.LJ(this.moveParams, interceptor.moveParams) && o.LJ(this.removeParams, interceptor.removeParams);
        }

        public final int hashCode() {
            int hashCode = this.name.hashCode() * 31;
            List<Status> list = this.params;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<Status> list2 = this.status;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            InterceptSchema interceptSchema = this.interceptSchema;
            int hashCode4 = (hashCode3 + (interceptSchema == null ? 0 : interceptSchema.hashCode())) * 31;
            String str = this.redirectSchema;
            int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list3 = this.moveParams;
            int hashCode6 = (hashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
            List<String> list4 = this.removeParams;
            return hashCode6 + (list4 != null ? list4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Interceptor(name=");
            LIZ.append(this.name);
            LIZ.append(", params=");
            LIZ.append(this.params);
            LIZ.append(", status=");
            LIZ.append(this.status);
            LIZ.append(", interceptSchema=");
            LIZ.append(this.interceptSchema);
            LIZ.append(", redirectSchema=");
            LIZ.append(this.redirectSchema);
            LIZ.append(", moveParams=");
            LIZ.append(this.moveParams);
            LIZ.append(", removeParams=");
            return C1NE.LIZIZ(LIZ, this.removeParams, ')', LIZ);
        }

        public Interceptor(String name, List<Status> list, List<Status> list2, InterceptSchema interceptSchema, String str, List<String> list3, List<String> list4) {
            o.LJIIIZ(name, "name");
            this.name = name;
            this.params = list;
            this.status = list2;
            this.interceptSchema = interceptSchema;
            this.redirectSchema = str;
            this.moveParams = list3;
            this.removeParams = list4;
        }
    }

    /* loaded from: classes7.dex */
    public static final class LynxPath {

        @InterfaceC65349Pkn("bundle")
        public final String bundle;

        @InterfaceC65349Pkn("channel")
        public final String channel;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LynxPath)) {
                return false;
            }
            LynxPath lynxPath = (LynxPath) obj;
            return o.LJ(this.bundle, lynxPath.bundle) && o.LJ(this.channel, lynxPath.channel);
        }

        public final int hashCode() {
            return this.channel.hashCode() + (this.bundle.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LynxPath(bundle=");
            LIZ.append(this.bundle);
            LIZ.append(", channel=");
            return q.LIZIZ(LIZ, this.channel, ')', LIZ);
        }

        public LynxPath(String bundle, String channel) {
            o.LJIIIZ(bundle, "bundle");
            o.LJIIIZ(channel, "channel");
            this.bundle = bundle;
            this.channel = channel;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Status {

        @InterfaceC65349Pkn("key")
        public final String key;

        @InterfaceC65349Pkn("value")
        public final String value;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Status)) {
                return false;
            }
            Status status = (Status) obj;
            return o.LJ(this.value, status.value) && o.LJ(this.key, status.key);
        }

        public final int hashCode() {
            return this.key.hashCode() + (this.value.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Status(value=");
            LIZ.append(this.value);
            LIZ.append(", key=");
            return q.LIZIZ(LIZ, this.key, ')', LIZ);
        }

        public Status(String value, String key) {
            o.LJIIIZ(value, "value");
            o.LJIIIZ(key, "key");
            this.value = value;
            this.key = key;
        }
    }

    /* loaded from: classes7.dex */
    public static final class TEARouterInterceptorConfigModel {

        @InterfaceC65349Pkn("enable")
        public final boolean enable;

        @InterfaceC65349Pkn("force_interceptors")
        public final List<Interceptor> forceInterceptors;

        @InterfaceC65349Pkn("intercept_schema")
        public final List<String> interceptSchema;

        @InterfaceC65349Pkn("interceptors")
        public final List<Interceptor> interceptors;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TEARouterInterceptorConfigModel)) {
                return false;
            }
            TEARouterInterceptorConfigModel tEARouterInterceptorConfigModel = (TEARouterInterceptorConfigModel) obj;
            return this.enable == tEARouterInterceptorConfigModel.enable && o.LJ(this.interceptSchema, tEARouterInterceptorConfigModel.interceptSchema) && o.LJ(this.interceptors, tEARouterInterceptorConfigModel.interceptors) && o.LJ(this.forceInterceptors, tEARouterInterceptorConfigModel.forceInterceptors);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v12 */
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
            int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
            List<Interceptor> list3 = this.forceInterceptors;
            return hashCode2 + (list3 != null ? list3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TEARouterInterceptorConfigModel(enable=");
            LIZ.append(this.enable);
            LIZ.append(", interceptSchema=");
            LIZ.append(this.interceptSchema);
            LIZ.append(", interceptors=");
            LIZ.append(this.interceptors);
            LIZ.append(", forceInterceptors=");
            return C1NE.LIZIZ(LIZ, this.forceInterceptors, ')', LIZ);
        }

        public TEARouterInterceptorConfigModel(boolean z, List<String> list, List<Interceptor> list2, List<Interceptor> list3) {
            this.enable = z;
            this.interceptSchema = list;
            this.interceptors = list2;
            this.forceInterceptors = list3;
        }
    }
}
