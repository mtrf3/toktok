package com.ss.android.ugc.aweme.effectcreator.net;

import X.C32I;
import X.C64797Pbt;
import X.C65019PfT;
import X.C65083PgV;
import X.C65238Pj0;
import X.C93424aQe;
import X.C93426aQg;
import X.EJ6;
import X.EZX;
import X.H78;
import android.util.Pair;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.net.INet;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class NetImpl implements INet {
    public final HashMap<String, C65019PfT> retrofitMap = new HashMap<>();

    private final C65019PfT retrofit(String str) {
        C65019PfT temp = this.retrofitMap.get(str);
        if (temp == null) {
            C65238Pj0 LJFF = C65238Pj0.LJFF();
            synchronized (C65083PgV.class) {
                temp = C65083PgV.LJII(str, null, LJFF);
            }
            HashMap<String, C65019PfT> hashMap = this.retrofitMap;
            o.LJIIIIZZ(temp, "temp");
            hashMap.put(str, temp);
        }
        return temp;
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.net.INet
    public C93426aQg doGet(String url, boolean z, int i, Map<String, String> map, List<C93424aQe> list) {
        o.LJIIIZ(url, "url");
        InputStream inputStream = null;
        try {
            Pair<String, String> LIZJ = EZX.LIZJ(url, map);
            String baseUrl = (String) LIZJ.first;
            String str = (String) LIZJ.second;
            o.LJIIIIZZ(baseUrl, "baseUrl");
            Object LIZ = retrofit(baseUrl).LIZ(NetApiService.class);
            o.LJIIIIZZ(LIZ, "retrofit(baseUrl).create…etApiService::class.java)");
            C64797Pbt<TypedInput> execute = ((NetApiService) LIZ).doGet(false, Integer.MAX_VALUE, str, map, null).execute();
            if (execute.LIZIZ()) {
                inputStream = execute.LIZIZ.in();
                return new C93426aQg(true, inputStream, execute.LIZIZ.length());
            }
        } catch (Exception e) {
            H78.LIZLLL("cke_net", e);
        }
        return new C93426aQg(false, inputStream, 0L);
    }

    @Override // com.bytedance.effectcreatormobile.ckeapi.api.foundation.net.INet
    public C93426aQg doPost(String url, boolean z, int i, Map<String, String> queryMap, Map<String, ? extends Object> map, List<C93424aQe> list) {
        ArrayList arrayList;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(queryMap, "queryMap");
        InputStream inputStream = null;
        try {
            Pair<String, String> LIZJ = EZX.LIZJ(url, queryMap);
            String baseUrl = (String) LIZJ.first;
            String str = (String) LIZJ.second;
            o.LJIIIIZZ(baseUrl, "baseUrl");
            Object LIZ = retrofit(baseUrl).LIZ(NetApiService.class);
            o.LJIIIIZZ(LIZ, "retrofit(baseUrl).create…etApiService::class.java)");
            NetApiService netApiService = (NetApiService) LIZ;
            if (list != null) {
                arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator<C93424aQe> it = list.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                    arrayList.add(new EJ6(null, null));
                }
            } else {
                arrayList = null;
            }
            C64797Pbt<TypedInput> execute = netApiService.doPost(false, Integer.MAX_VALUE, str, queryMap, map, arrayList).execute();
            if (execute.LIZIZ()) {
                inputStream = execute.LIZIZ.in();
                return new C93426aQg(true, inputStream, execute.LIZIZ.length());
            }
        } catch (Exception e) {
            H78.LIZLLL("cke_net", e);
        }
        return new C93426aQg(false, inputStream, 0L);
    }
}
