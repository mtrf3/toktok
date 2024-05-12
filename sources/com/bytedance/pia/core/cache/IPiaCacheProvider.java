package com.bytedance.pia.core.cache;

import X.InterfaceC65349Pkn;
import com.google.gson.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public interface IPiaCacheProvider {

    /* loaded from: classes7.dex */
    public static final class CacheConfig {

        @InterfaceC65349Pkn("expire")
        public Number expire;

        @InterfaceC65349Pkn("marked")
        public Boolean marked;

        @InterfaceC65349Pkn("maxAge")
        public final Number maxAge;

        @InterfaceC65349Pkn("meta")
        public final m meta;

        @InterfaceC65349Pkn("version")
        public final String version;

        /* JADX WARN: Multi-variable type inference failed */
        public CacheConfig() {
            this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
        }

        public final m LIZ() {
            m mVar = new m();
            Number number = this.maxAge;
            if (number != null) {
                mVar.LJJIIJ("maxAge", number);
            }
            String str = this.version;
            if (str != null) {
                mVar.LJJIIZ("version", str);
            }
            Number number2 = this.expire;
            if (number2 != null) {
                mVar.LJJIIJ("expire", number2);
            }
            m mVar2 = this.meta;
            if (mVar2 != null) {
                mVar.LJJII("meta", mVar2);
            }
            Boolean bool = this.marked;
            if (bool != null) {
                bool.booleanValue();
                mVar.LJJIII(this.marked, "marked");
            }
            return mVar;
        }

        public final String toString() {
            String jVar = LIZ().toString();
            o.LJFF(jVar, "toJsonObject().toString()");
            return jVar;
        }

        public CacheConfig(Number number, String str, m mVar, Number number2, Boolean bool) {
            this.maxAge = number;
            this.version = str;
            this.meta = mVar;
            this.expire = number2;
            this.marked = bool;
        }

        public /* synthetic */ CacheConfig(Number number, String str, m mVar, Number number2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : number, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : mVar, (i & 8) != 0 ? null : number2, (i & 16) == 0 ? bool : null);
        }
    }

    String LIZ();

    CacheConfig LIZIZ();

    String LIZJ();
}
