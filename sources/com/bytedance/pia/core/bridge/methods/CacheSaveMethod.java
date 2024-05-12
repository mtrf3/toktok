package com.bytedance.pia.core.bridge.methods;

import X.C141335gf;
import X.C19U;
import X.C37364ElU;
import X.C37374Ele;
import X.C37376Elg;
import X.C37394Ely;
import X.C37399Em3;
import X.C37400Em4;
import X.C37403Em7;
import X.C37449Emr;
import X.C37613EpV;
import X.C37653Eq9;
import X.C3C5;
import X.C85693Xx;
import X.EnumC37404Em8;
import X.InterfaceC37405Em9;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.RunnableC37367ElX;
import X.X1D;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.cache.IPiaCacheProvider;
import com.google.gson.m;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CacheSaveMethod implements InterfaceC37405Em9<Params, Result> {
    public static final C37403Em7<Params, Result> LIZ = new C37403Em7<>("pia.internal.cache.save", EnumC37404Em8.All, C37374Ele.LIZ);

    /* loaded from: classes7.dex */
    public static final class Params {

        @InterfaceC65349Pkn("content")
        public final String content;

        @InterfaceC65349Pkn("extraVary")
        public final List<String> extraVary;

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
            return o.LJ(this.url, params.url) && o.LJ(this.extraVary, params.extraVary) && o.LJ(this.content, params.content);
        }

        public final int hashCode() {
            String str = this.url;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            List<String> list = this.extraVary;
            int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
            String str2 = this.content;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Params(url=");
            LIZ.append(this.url);
            LIZ.append(", extraVary=");
            LIZ.append(this.extraVary);
            LIZ.append(", content=");
            return JBR.LJFF(LIZ, this.content, ")", LIZ);
        }

        public Params(String str, List<String> list, String str2) {
            this.url = str;
            this.extraVary = list;
            this.content = str2;
        }
    }

    /* loaded from: classes7.dex */
    public static final class Result {

        @InterfaceC65349Pkn("isUpdate")
        public final boolean isUpdate;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Result) && this.isUpdate == ((Result) obj).isUpdate;
            }
            return true;
        }

        public final int hashCode() {
            boolean z = this.isUpdate;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Result(isUpdate=");
            return C19U.LIZ(LIZ, this.isUpdate, ")", LIZ);
        }

        public Result(boolean z) {
            this.isUpdate = z;
        }
    }

    @Override // X.InterfaceC37405Em9
    public final void LIZ(C37449Emr c37449Emr, Object obj, C37399Em3 c37399Em3, C37400Em4 c37400Em4) {
        Object LIZ2;
        Number number;
        Params params = (Params) obj;
        o.LJIIJ(params, "params");
        if (TextUtils.isEmpty(params.url)) {
            C37364ElU.LIZ("Parameter 'url' invalid!", c37400Em4);
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
            List<String> list = params.extraVary;
            String LIZJ2 = C85693Xx.LIZJ(uri, list);
            if (LIZJ2 == null || LIZJ2.length() == 0) {
                C37364ElU.LIZ("Parameter 'url' & 'extraVary' invalid!", c37400Em4);
                return;
            }
            if (o.LJ(LIZJ, LIZJ2)) {
                c37400Em4.accept(new C37394Ely(-10001, "Can't modify the original html."));
                return;
            }
            String str = params.content;
            if (str == null || str.length() == 0) {
                C37364ElU.LIZ("Parameter 'content' invalid!", c37400Em4);
                return;
            }
            String str2 = params.content;
            m LIZ3 = C37653Eq9.LIZ(str2);
            if (LIZ3 != null) {
                IPiaCacheProvider.CacheConfig LJI = C37376Elg.LJI(LIZ3);
                if (LJI == null || ((number = LJI.maxAge) != null && number.longValue() <= 0)) {
                    c37400Em4.accept(new C37394Ely(-10003, "Invalid cache in manifest."));
                    return;
                } else {
                    C37613EpV.LIZJ(new RunnableC37367ElX(uri, str2, LIZ3, list, c37399Em3, c37400Em4));
                    return;
                }
            }
            c37400Em4.accept(new C37394Ely(-10002, "Invalid manifest in content."));
            return;
        }
        C37364ElU.LIZ("Parameter 'url' invalid!", c37400Em4);
    }
}
