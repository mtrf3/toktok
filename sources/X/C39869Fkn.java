package X;

import android.text.TextUtils;
import com.bytedance.lynx.hybrid.ssp.base.SSPResponse;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.l;
import com.google.gson.m;
import com.google.gson.o;
import java.util.LinkedHashMap;

/* renamed from: X.Fkn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39869Fkn {
    public static SSPResponse LIZ(C39872Fkq c39872Fkq) {
        j LJJIJ;
        m LJIIZILJ;
        SSPResponse.Data data;
        int i;
        int i2;
        SSPResponse.Prefetch prefetch;
        int i3;
        String str;
        m mVar;
        j LJJIJ2;
        String str2 = c39872Fkq.LIZIZ;
        if (!TextUtils.isEmpty(str2)) {
            SSPResponse sSPResponse = new SSPResponse();
            j parse = GsonProtectorUtils.parse(new o(), str2);
            kotlin.jvm.internal.o.LJFF(parse, "JsonParser().parse(rawData)");
            m LJIIZILJ2 = parse.LJIIZILJ();
            sSPResponse.LIZ = LJIIZILJ2;
            j LJJIJ3 = LJIIZILJ2.LJJIJ("code");
            if (LJJIJ3 != null) {
                LJJIJ3.LJIILJJIL();
            }
            m mVar2 = sSPResponse.LIZ;
            if (mVar2 != null && (LJJIJ2 = mVar2.LJJIJ("message")) != null) {
                LJJIJ2.LJJIFFI();
            }
            m mVar3 = sSPResponse.LIZ;
            if (mVar3 != null && (LJJIJ = mVar3.LJJIJ("data")) != null && (LJIIZILJ = LJJIJ.LJIIZILJ()) != null && !(LJIIZILJ instanceof l)) {
                for (String url : LJIIZILJ.LJJIZ()) {
                    if (sSPResponse.LIZIZ == null) {
                        sSPResponse.LIZIZ = new LinkedHashMap();
                    }
                    java.util.Map<String, SSPResponse.Data> map = sSPResponse.LIZIZ;
                    if (map != null) {
                        kotlin.jvm.internal.o.LJFF(url, "url");
                        j LJJIJ4 = LJIIZILJ.LJJIJ(url);
                        kotlin.jvm.internal.o.LJFF(LJJIJ4, "rawDataJson.get(url)");
                        m LJIIZILJ3 = LJJIJ4.LJIIZILJ();
                        String str3 = c39872Fkq.LJ;
                        if (LJIIZILJ3 instanceof l) {
                            data = null;
                        } else {
                            data = new SSPResponse.Data();
                            if (str3 == null) {
                                str3 = "";
                            }
                            data.logID = str3;
                            j LJJIJ5 = LJIIZILJ3.LJJIJ("validity_period");
                            if (LJJIJ5 != null) {
                                i = LJJIJ5.LJIILJJIL();
                            } else {
                                i = 0;
                            }
                            data.validityPeriod = i;
                            j LJJIJ6 = LJIIZILJ3.LJJIJ("match_type");
                            if (LJJIJ6 != null) {
                                i2 = LJJIJ6.LJIILJJIL();
                            } else {
                                i2 = 0;
                            }
                            data.matchType = i2;
                            data.expire = System.currentTimeMillis() + (data.validityPeriod * 1000);
                            j LJJIJ7 = LJIIZILJ3.LJJIJ("prefetch_list");
                            if (LJJIJ7 != null) {
                                g LJIILLIIL = LJJIJ7.LJIILLIIL();
                                int size = LJIILLIIL.size();
                                SSPResponse.Prefetch[] prefetchArr = new SSPResponse.Prefetch[size];
                                for (int i4 = 0; i4 < size; i4++) {
                                    j LJJIIZ = LJIILLIIL.LJJIIZ(i4);
                                    kotlin.jvm.internal.o.LJFF(LJJIIZ, "this[it]");
                                    m LJIIZILJ4 = LJJIIZ.LJIIZILJ();
                                    if (LJIIZILJ4 instanceof l) {
                                        prefetch = new SSPResponse.Prefetch();
                                    } else {
                                        prefetch = new SSPResponse.Prefetch();
                                        j LJJIJ8 = LJIIZILJ4.LJJIJ("level");
                                        if (LJJIJ8 != null) {
                                            i3 = LJJIJ8.LJIILJJIL();
                                        } else {
                                            i3 = 1;
                                        }
                                        prefetch.level = Integer.valueOf(i3);
                                        j LJJIJ9 = LJIIZILJ4.LJJIJ("url");
                                        if (LJJIJ9 != null) {
                                            str = LJJIJ9.LJJIFFI();
                                        } else {
                                            str = null;
                                        }
                                        prefetch.url = str;
                                        j LJJIJ10 = LJIIZILJ4.LJJIJ("reqHeader");
                                        if (LJJIJ10 != null) {
                                            mVar = LJJIJ10.LJIIZILJ();
                                        } else {
                                            mVar = null;
                                        }
                                        prefetch.reqHeader = mVar;
                                    }
                                    prefetchArr[i4] = prefetch;
                                }
                                data.prefetchList = prefetchArr;
                            }
                            j LJJIJ11 = LJIIZILJ3.LJJIJ("preconnect_list");
                            if (LJJIJ11 != null) {
                                g LJIILLIIL2 = LJJIJ11.LJIILLIIL();
                                int size2 = LJIILLIIL2.size();
                                SSPResponse.PreConnect[] preConnectArr = new SSPResponse.PreConnect[size2];
                                for (int i5 = 0; i5 < size2; i5++) {
                                    j LJJIIZ2 = LJIILLIIL2.LJJIIZ(i5);
                                    kotlin.jvm.internal.o.LJFF(LJJIIZ2, "this[it]");
                                    SSPResponse.PreConnect LIZIZ = LIZIZ(LJJIIZ2.LJIIZILJ());
                                    if (LIZIZ == null) {
                                        LIZIZ = new SSPResponse.PreConnect();
                                    }
                                    preConnectArr[i5] = LIZIZ;
                                }
                                data.preConnectList = preConnectArr;
                            }
                            j LJJIJ12 = LJIIZILJ3.LJJIJ("subpage_preconnect_list");
                            if (LJJIJ12 != null) {
                                g LJIILLIIL3 = LJJIJ12.LJIILLIIL();
                                int size3 = LJIILLIIL3.size();
                                SSPResponse.PreConnect[] preConnectArr2 = new SSPResponse.PreConnect[size3];
                                for (int i6 = 0; i6 < size3; i6++) {
                                    j LJJIIZ3 = LJIILLIIL3.LJJIIZ(i6);
                                    kotlin.jvm.internal.o.LJFF(LJJIIZ3, "this[it]");
                                    SSPResponse.PreConnect LIZIZ2 = LIZIZ(LJJIIZ3.LJIIZILJ());
                                    if (LIZIZ2 == null) {
                                        LIZIZ2 = new SSPResponse.PreConnect();
                                    }
                                    preConnectArr2[i6] = LIZIZ2;
                                }
                                data.subpagePreConnectList = preConnectArr2;
                            }
                        }
                        map.put(url, data);
                    }
                }
                return sSPResponse;
            }
            throw new Exception("raw response data!!");
        }
        throw new Exception("raw response body!!");
    }

    public static SSPResponse.PreConnect LIZIZ(m mVar) {
        int i;
        String str;
        String str2 = null;
        if (mVar instanceof l) {
            return null;
        }
        SSPResponse.PreConnect preConnect = new SSPResponse.PreConnect();
        j LJJIJ = mVar.LJJIJ("level");
        if (LJJIJ != null) {
            i = LJJIJ.LJIILJJIL();
        } else {
            i = 1;
        }
        preConnect.level = i;
        j LJJIJ2 = mVar.LJJIJ("domain");
        if (LJJIJ2 != null) {
            str = LJJIJ2.LJJIFFI();
        } else {
            str = null;
        }
        preConnect.domain = str;
        j LJJIJ3 = mVar.LJJIJ("protocol");
        if (LJJIJ3 != null) {
            str2 = LJJIJ3.LJJIFFI();
        }
        preConnect.protocol = str2;
        return preConnect;
    }
}
