package com.bytedance.pia.nsr.bridge;

import X.C37364ElU;
import X.C37365ElV;
import X.C37399Em3;
import X.C37400Em4;
import X.C37403Em7;
import X.C37440Emi;
import X.C37449Emr;
import X.C37463En5;
import X.C37499Enf;
import X.C37692Eqm;
import X.EnumC37404Em8;
import X.InterfaceC37405Em9;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS188S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PiaNsrMethod implements InterfaceC37405Em9<Params, Result> {
    public static final C37403Em7<Params, Result> LIZ = new C37403Em7<>("pia.nsr", EnumC37404Em8.Render, C37365ElV.LIZ);

    /* loaded from: classes7.dex */
    public static final class Params {

        @InterfaceC65349Pkn("expires")
        public final Long expires;

        @InterfaceC65349Pkn("namespace")
        public final String nameSpace;

        @InterfaceC65349Pkn("reuse")
        public final Boolean reuse;

        @InterfaceC65349Pkn("url")
        public final String url;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return o.LJ(this.url, params.url) && o.LJ(this.expires, params.expires) && o.LJ(this.reuse, params.reuse) && o.LJ(this.nameSpace, params.nameSpace);
        }

        public final int hashCode() {
            String str = this.url;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Long l = this.expires;
            int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
            Boolean bool = this.reuse;
            int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
            String str2 = this.nameSpace;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Params(url=");
            LIZ.append(this.url);
            LIZ.append(", expires=");
            LIZ.append(this.expires);
            LIZ.append(", reuse=");
            LIZ.append(this.reuse);
            LIZ.append(", nameSpace=");
            return JBR.LJFF(LIZ, this.nameSpace, ")", LIZ);
        }

        public Params(String str, Long l, Boolean bool, String str2) {
            this.url = str;
            this.expires = l;
            this.reuse = bool;
            this.nameSpace = str2;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Result {

        @InterfaceC65349Pkn("isUpdate")
        public final Boolean isUpdate;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Result) && o.LJ(this.isUpdate, ((Result) obj).isUpdate);
            }
            return true;
        }

        public final int hashCode() {
            Boolean bool = this.isUpdate;
            if (bool != null) {
                return bool.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Result(isUpdate=");
            LIZ.append(this.isUpdate);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public Result(Boolean bool) {
            this.isUpdate = bool;
        }
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        long j;
        boolean z;
        Params params = (Params) obj;
        o.LJIIJ(params, "params");
        String str = params.url;
        if (str == null) {
            C37364ElU.LIZ("Parameter 'url' requested!", c37400Em4);
            return;
        }
        C37463En5 c37463En5 = c37449Emr.LIZIZ;
        if (c37463En5 != null) {
            C37499Enf c37499Enf = (C37499Enf) c37463En5;
            C37440Emi c37440Emi = C37440Emi.LIZIZ;
            Long l = params.expires;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 60000;
            }
            String str2 = params.nameSpace;
            if (str2 == null) {
                str2 = c37499Enf.LIZLLL;
            }
            Boolean bool = params.reuse;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            AqS188S0100000_6 aqS188S0100000_6 = new AqS188S0100000_6(c37399Em3, 15);
            AqS172S0100000_6 aqS172S0100000_6 = new AqS172S0100000_6(c37400Em4, 95);
            c37440Emi.getClass();
            C37440Emi.LIZ(str, j, str2, !z, c37499Enf, aqS188S0100000_6, aqS172S0100000_6);
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.pia.core.runtime.PiaRuntime");
    }
}
