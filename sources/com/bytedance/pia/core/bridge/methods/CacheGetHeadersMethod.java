package com.bytedance.pia.core.bridge.methods;

import X.C141335gf;
import X.C37364ElU;
import X.C37372Elc;
import X.C37399Em3;
import X.C37400Em4;
import X.C37403Em7;
import X.C37449Emr;
import X.C37613EpV;
import X.C3C5;
import X.C85693Xx;
import X.EnumC37404Em8;
import X.InterfaceC37405Em9;
import X.InterfaceC65349Pkn;
import X.RunnableC37369ElZ;
import X.X1D;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.m;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CacheGetHeadersMethod implements InterfaceC37405Em9<Params, Result> {
    public static final C37403Em7<Params, Result> LIZ = new C37403Em7<>("pia.internal.cache.getHeaders", EnumC37404Em8.All, C37372Elc.LIZ);

    /* loaded from: classes7.dex */
    public static final class Result {

        @InterfaceC65349Pkn("headers")
        public final m headers;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Result) && o.LJ(this.headers, ((Result) obj).headers);
            }
            return true;
        }

        public final int hashCode() {
            m mVar = this.headers;
            if (mVar != null) {
                return mVar.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Result(headers=");
            LIZ.append(this.headers);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public Result(m mVar) {
            this.headers = mVar;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Params {

        @InterfaceC65349Pkn("extraVary")
        public final List<String> extraVary;

        @InterfaceC65349Pkn("url")
        public final String url;

        /* JADX WARN: Multi-variable type inference failed */
        public Params() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return o.LJ(this.url, params.url) && o.LJ(this.extraVary, params.extraVary);
        }

        public final int hashCode() {
            String str = this.url;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<String> list = this.extraVary;
            return hashCode + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Params(url=");
            LIZ.append(this.url);
            LIZ.append(", extraVary=");
            LIZ.append(this.extraVary);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public Params(String str, List<String> list) {
            this.url = str;
            this.extraVary = list;
        }

        public /* synthetic */ Params(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
        }
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        Object LIZ2;
        Params params = (Params) obj;
        o.LJIIJ(params, "params");
        if (TextUtils.isEmpty(params.url)) {
            C37364ElU.LIZ("Parameter 'url' required!", c37400Em4);
            return;
        }
        try {
            LIZ2 = UriProtector.parse(params.url);
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m10exceptionOrNullimpl(LIZ2) == null) {
            Uri uri = (Uri) LIZ2;
            String LIZJ = C85693Xx.LIZJ(uri, null);
            if (LIZJ == null || LIZJ.length() == 0) {
                C37364ElU.LIZ("Parameter 'url' invalid!", c37400Em4);
                return;
            }
            String LIZJ2 = C85693Xx.LIZJ(uri, params.extraVary);
            if (LIZJ2 == null || LIZJ2.length() == 0) {
                C37364ElU.LIZ("Parameter 'url' & 'extraVary' invalid!", c37400Em4);
                return;
            } else {
                C37613EpV.LIZJ(new RunnableC37369ElZ(c37399Em3, c37400Em4, LIZJ2));
                return;
            }
        }
        C37364ElU.LIZ("Parameter 'url' invalid!", c37400Em4);
    }
}
