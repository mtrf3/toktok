package com.bytedance.pia.snapshot.bridge;

import X.C32037Chl;
import X.C37238EjS;
import X.C37360ElQ;
import X.C37361ElR;
import X.C37363ElT;
import X.C37394Ely;
import X.C37399Em3;
import X.C37400Em4;
import X.C37403Em7;
import X.C37449Emr;
import X.C37463En5;
import X.C37692Eqm;
import X.EnumC37404Em8;
import X.InterfaceC37405Em9;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.m;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class PiaSaveSnapshotMethod implements InterfaceC37405Em9<Params, Result> {
    public static final C37403Em7<Params, Result> LIZ = new C37403Em7<>("pia.saveSnapshot", EnumC37404Em8.Render, C37363ElT.LIZ);

    /* loaded from: classes7.dex */
    public static final class Result {

        @InterfaceC65349Pkn("update")
        public final Boolean update;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Result) && o.LJ(this.update, ((Result) obj).update);
            }
            return true;
        }

        public final int hashCode() {
            Boolean bool = this.update;
            if (bool != null) {
                return bool.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Result(update=");
            LIZ.append(this.update);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public Result(Boolean bool) {
            this.update = bool;
        }
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        long j;
        String str;
        int i;
        String str2;
        boolean z;
        Params params = (Params) obj;
        o.LJIIJ(params, "params");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[SnapShot] pia.saveSnapshot called (Expires: ");
        LIZ2.append(params.expires);
        LIZ2.append(", Query: ");
        LIZ2.append(params.query);
        LIZ2.append(", SDK: ");
        LIZ2.append(params.sdk);
        LIZ2.append(", Version: ");
        LIZ2.append(params.version);
        LIZ2.append(", URL: ");
        LIZ2.append(params.url);
        LIZ2.append("), Enforce: ");
        LIZ2.append(params.enforce);
        C37238EjS.LIZ(X1D.LIZIZ(LIZ2));
        String str3 = params.content;
        String str4 = params.head;
        Number number = params.expires;
        if (number != null) {
            j = number.longValue();
        } else {
            j = 604800000;
        }
        long currentTimeMillis = j + System.currentTimeMillis();
        m mVar = params.query;
        if (mVar == null || (str = mVar.toString()) == null) {
            str = "";
        }
        Integer num = params.sdk;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        Number number2 = params.version;
        if (number2 == null || (str2 = number2.toString()) == null) {
            str2 = "";
        }
        String str5 = params.url;
        Boolean bool = params.enforce;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str5)) {
            c37400Em4.accept(new C32037Chl());
            return;
        }
        try {
            JSONObject jSONObject = (JSONObject) GsonUtils.LIZ(str, JSONObject.class);
            if (jSONObject != null) {
                C37360ElQ c37360ElQ = C37360ElQ.LIZIZ;
                if (str3 != null) {
                    if (str5 != null) {
                        c37360ElQ.getClass();
                        c37399Em3.accept(new Result(Boolean.valueOf(C37360ElQ.LIZ(str3, str4, currentTimeMillis, jSONObject, i, str2, str5, z))));
                        return;
                    } else {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                o.LJIIZILJ();
                throw null;
            }
            c37400Em4.accept(new C32037Chl());
        } catch (C37361ElR e) {
            C37463En5 c37463En5 = c37449Emr.LIZIZ;
            if (c37463En5 != null) {
                c37463En5.LJII.LIZ(1015, "snapshot");
                c37400Em4.accept(new C37394Ely(e.toString()));
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.pia.core.PiaContext");
        }
    }

    /* loaded from: classes7.dex */
    public static final class Params {

        @InterfaceC65349Pkn("content")
        public final String content;

        @InterfaceC65349Pkn("enforce")
        public final Boolean enforce;

        @InterfaceC65349Pkn("expires")
        public final Number expires;

        @InterfaceC65349Pkn("head")
        public final String head;

        @InterfaceC65349Pkn("query")
        public final m query;

        @InterfaceC65349Pkn("sdk")
        public final Integer sdk;

        @InterfaceC65349Pkn("url")
        public final String url;

        @InterfaceC65349Pkn("version")
        public final Number version;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return o.LJ(this.content, params.content) && o.LJ(this.head, params.head) && o.LJ(this.expires, params.expires) && o.LJ(this.query, params.query) && o.LJ(this.sdk, params.sdk) && o.LJ(this.version, params.version) && o.LJ(this.url, params.url) && o.LJ(this.enforce, params.enforce);
        }

        public final int hashCode() {
            String str = this.content;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.head;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Number number = this.expires;
            int hashCode3 = (hashCode2 + (number != null ? number.hashCode() : 0)) * 31;
            m mVar = this.query;
            int hashCode4 = (hashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31;
            Integer num = this.sdk;
            int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
            Number number2 = this.version;
            int hashCode6 = (hashCode5 + (number2 != null ? number2.hashCode() : 0)) * 31;
            String str3 = this.url;
            int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Boolean bool = this.enforce;
            return hashCode7 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Params(content=");
            LIZ.append(this.content);
            LIZ.append(", head=");
            LIZ.append(this.head);
            LIZ.append(", expires=");
            LIZ.append(this.expires);
            LIZ.append(", query=");
            LIZ.append(this.query);
            LIZ.append(", sdk=");
            LIZ.append(this.sdk);
            LIZ.append(", version=");
            LIZ.append(this.version);
            LIZ.append(", url=");
            LIZ.append(this.url);
            LIZ.append(", enforce=");
            LIZ.append(this.enforce);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public Params(String str, String str2, Number number, m mVar, Integer num, Number number2, String str3, Boolean bool) {
            this.content = str;
            this.head = str2;
            this.expires = number;
            this.query = mVar;
            this.sdk = num;
            this.version = number2;
            this.url = str3;
            this.enforce = bool;
        }
    }
}
