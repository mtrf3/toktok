package com.bytedance.pia.core.utils;

import X.AnonymousClass028;
import X.BQ6;
import X.C141335gf;
import X.C32I;
import X.C36910EeA;
import X.C37238EjS;
import X.C37509Enp;
import X.C37597EpF;
import X.C37598EpG;
import X.C37600EpI;
import X.C37601EpJ;
import X.C37602EpK;
import X.C37603EpL;
import X.C39745Fin;
import X.C3C5;
import X.C51029K0z;
import X.C64797Pbt;
import X.C65083PgV;
import X.E8L;
import X.EJ6;
import X.ENX;
import X.EZX;
import X.EnumC37644Eq0;
import X.InterfaceC195747mE;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36228EJs;
import X.InterfaceC37169EiL;
import X.InterfaceC37276Ek4;
import X.InterfaceC37408EmC;
import X.InterfaceC37454Emw;
import X.InterfaceC37464En6;
import X.InterfaceC37489EnV;
import X.InterfaceC37599EpH;
import X.OSZ;
import X.X1D;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.retrofit2.mime.TypedInput;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DefaultResourceLoader implements InterfaceC37599EpH {
    public final InterfaceC37599EpH LIZ;

    /* loaded from: classes7.dex */
    public interface ResourceApi {
        @ENX
        @E8L
        InterfaceC37276Ek4<TypedInput> doGet(@InterfaceC30951CCt boolean z, @InterfaceC195747mE String str, @InterfaceC36228EJs(encode = true) Map<String, String> map, @InterfaceC195767mG List<EJ6> list);
    }

    public DefaultResourceLoader() {
        this(null);
    }

    public DefaultResourceLoader(InterfaceC37599EpH interfaceC37599EpH) {
        this.LIZ = interfaceC37599EpH instanceof DefaultResourceLoader ? null : interfaceC37599EpH;
    }

    public static C37601EpJ LJ(C64797Pbt c64797Pbt) {
        String LIZIZ;
        String str;
        String str2;
        Charset LIZ;
        List<EJ6> list = c64797Pbt.LIZ.LIZLLL;
        o.LJFF(list, "headers()");
        int LJJIIZ = C51029K0z.LJJIIZ(C32I.LJJL(list, 10));
        if (LJJIIZ < 16) {
            LJJIIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ);
        for (EJ6 it : list) {
            o.LJFF(it, "it");
            OSZ osz = new OSZ(it.LIZ, it.LIZIZ);
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        C39745Fin LIZJ = C39745Fin.LIZJ(C65083PgV.LJIIJ("Content-Type", c64797Pbt.LIZ.LIZLLL));
        if (LIZJ == null) {
            LIZIZ = "text/html";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZJ.LIZIZ);
            LIZ2.append("/");
            LIZ2.append(LIZJ.LIZJ);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        if (LIZJ == null || (LIZ = LIZJ.LIZ(null)) == null || (str = LIZ.toString()) == null) {
            str = "UTF-8";
        }
        C36910EeA c36910EeA = c64797Pbt.LIZ;
        int i = c36910EeA.LIZIZ;
        if (TextUtils.isEmpty(c36910EeA.LIZJ)) {
            str2 = "OK";
        } else {
            C36910EeA c36910EeA2 = c64797Pbt.LIZ;
            o.LJFF(c36910EeA2, "raw()");
            str2 = c36910EeA2.LIZJ;
        }
        return new C37601EpJ(LIZIZ, str, i, str2, linkedHashMap, ((TypedInput) c64797Pbt.LIZIZ).in());
    }

    public static InterfaceC37276Ek4 LIZLLL(String str, Map map) {
        ResourceApi resourceApi;
        InterfaceC37169EiL create;
        HashMap hashMap = new HashMap();
        Pair<String, String> LIZJ = EZX.LIZJ(str, hashMap);
        ArrayList arrayList = null;
        if (map != null) {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new EJ6((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        InterfaceC37408EmC<InterfaceC37169EiL> interfaceC37408EmC = C37509Enp.LJFF;
        if (interfaceC37408EmC == null || (create = interfaceC37408EmC.create()) == null || (resourceApi = (ResourceApi) create.LIZ(ResourceApi.class, (String) LIZJ.first)) == null) {
            resourceApi = (ResourceApi) C65083PgV.LJIIIIZZ(ResourceApi.class, (String) LIZJ.first);
        }
        return resourceApi.doGet(false, (String) LIZJ.second, hashMap, arrayList);
    }

    @Override // X.InterfaceC37599EpH
    public final InterfaceC37464En6 LIZIZ(InterfaceC37454Emw interfaceC37454Emw, EnumC37644Eq0 loadFrom) {
        Object LIZ;
        o.LJIIJ(loadFrom, "loadFrom");
        C37601EpJ c37601EpJ = null;
        try {
            InterfaceC37599EpH interfaceC37599EpH = this.LIZ;
            if (interfaceC37599EpH != null) {
                LIZ = interfaceC37599EpH.LIZIZ(interfaceC37454Emw, loadFrom);
            } else {
                LIZ = null;
            }
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        InterfaceC37464En6 interfaceC37464En6 = (InterfaceC37464En6) LIZ;
        if (interfaceC37464En6 != null) {
            C37238EjS.LJI(6, "[Resource] Custom resource loader load success.", null);
            return interfaceC37464En6;
        }
        C37238EjS.LJI(6, "[Resource] Custom resource loader load failed, fallback to default resource loader.", null);
        try {
            String uri = interfaceC37454Emw.getUrl().toString();
            o.LJFF(uri, "request.url.toString()");
            C64797Pbt execute = LIZLLL(uri, interfaceC37454Emw.getRequestHeaders()).execute();
            o.LJFF(execute, "call.execute()");
            c37601EpJ = LJ(execute);
            return c37601EpJ;
        } catch (Throwable th2) {
            Throwable LJFF = AnonymousClass028.LJFF(th2);
            if (LJFF != null) {
                C37238EjS.LJI(4, "[Resource] Load online failed:", LJFF);
                return c37601EpJ;
            }
            return c37601EpJ;
        }
    }

    public final InterfaceC37489EnV LIZJ(InterfaceC37454Emw request, BQ6<InterfaceC37464En6> bq6, BQ6<Throwable> bq62) {
        o.LJIIJ(request, "request");
        C37238EjS.LJI(6, "[Resource] Custom resource loader load failed, fallback to default resource loader.", null);
        try {
            String uri = request.getUrl().toString();
            o.LJFF(uri, "request.url.toString()");
            InterfaceC37276Ek4 LIZLLL = LIZLLL(uri, request.getRequestHeaders());
            LIZLLL.enqueue(new C37597EpF(this, request, bq62, bq6));
            return new C37602EpK(LIZLLL);
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            if (LJFF != null && bq62 != null) {
                bq62.accept(LJFF);
            }
            return C37603EpL.LIZ;
        }
    }

    @Override // X.InterfaceC37599EpH
    public final InterfaceC37489EnV LIZ(EnumC37644Eq0 loadFrom, InterfaceC37454Emw interfaceC37454Emw, BQ6<InterfaceC37464En6> bq6, BQ6<Throwable> bq62) {
        o.LJIIJ(loadFrom, "loadFrom");
        InterfaceC37599EpH interfaceC37599EpH = this.LIZ;
        if (interfaceC37599EpH != null) {
            return interfaceC37599EpH.LIZ(loadFrom, interfaceC37454Emw, new C37598EpG(this, interfaceC37454Emw, bq6, bq62), new C37600EpI(this, interfaceC37454Emw, bq6, bq62));
        }
        return LIZJ(interfaceC37454Emw, bq6, bq62);
    }
}
