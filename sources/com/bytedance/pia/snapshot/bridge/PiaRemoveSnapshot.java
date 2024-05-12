package com.bytedance.pia.snapshot.bridge;

import X.C19U;
import X.C37362ElS;
import X.C37399Em3;
import X.C37400Em4;
import X.C37403Em7;
import X.C37449Emr;
import X.C37613EpV;
import X.EnumC37404Em8;
import X.InterfaceC37405Em9;
import X.InterfaceC65349Pkn;
import X.X1D;
import Y.ARunnableS17S0300000_6;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PiaRemoveSnapshot implements InterfaceC37405Em9<Params, Result> {
    public static final C37403Em7<Params, Result> LIZ = new C37403Em7<>("pia.removeSnapshot", EnumC37404Em8.Render, C37362ElS.LIZ);

    /* loaded from: classes7.dex */
    public static final class Result {

        @InterfaceC65349Pkn("delete")
        public final boolean delete;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Result) && this.delete == ((Result) obj).delete;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.delete;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Result(delete=");
            return C19U.LIZ(LIZ, this.delete, ")", LIZ);
        }

        public Result(boolean z) {
            this.delete = z;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Params {

        @InterfaceC65349Pkn("query")
        public final m query;

        @InterfaceC65349Pkn("sdk")
        public final Number sdk;

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
            return o.LJ(this.query, params.query) && o.LJ(this.url, params.url) && o.LJ(this.sdk, params.sdk);
        }

        public final int hashCode() {
            m mVar = this.query;
            int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
            String str = this.url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Number number = this.sdk;
            return hashCode2 + (number != null ? number.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Params(query=");
            LIZ.append(this.query);
            LIZ.append(", url=");
            LIZ.append(this.url);
            LIZ.append(", sdk=");
            LIZ.append(this.sdk);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public Params(m mVar, String str, Number number) {
            this.query = mVar;
            this.url = str;
            this.sdk = number;
        }
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        Params params = (Params) obj;
        o.LJIIJ(params, "params");
        C37613EpV.LIZJ(new ARunnableS17S0300000_6(params, c37400Em4, c37399Em3, 10));
    }
}
