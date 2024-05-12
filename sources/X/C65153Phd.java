package X;

import android.util.Pair;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.ss.android.ugc.aweme.net.IIESNetworkApi;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Phd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65153Phd implements InterfaceC65157Phh {
    public final InterfaceC65157Phh LIZ;
    public final String LIZIZ;

    public C65153Phd(C64852Pcm c64852Pcm) {
        this.LIZ = c64852Pcm;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(EF7.LJI.LIZ);
        this.LIZIZ = X1D.LIZIZ(LIZ);
    }

    public static ArrayList LJIILIIL(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC61858OPm interfaceC61858OPm = (InterfaceC61858OPm) it.next();
                String name = interfaceC61858OPm.getName();
                String value = interfaceC61858OPm.getValue();
                if (name != null && name.length() > 0) {
                    C77800Ug8.LJFF(name, value, arrayList);
                }
            }
        }
        return arrayList;
    }

    public static HashMap LJIILJJIL(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C66619QCp c66619QCp = (C66619QCp) it.next();
                String str = c66619QCp.LJLIL;
                o.LJIIIIZZ(str, "basicNameValuePair.getName()");
                String str2 = c66619QCp.LJLILLLLZI;
                o.LJIIIIZZ(str2, "basicNameValuePair.getValue()");
                hashMap.put(str, str2);
            }
        }
        return hashMap;
    }

    @Override // X.InterfaceC65157Phh
    public final byte[] LIZJ(int i, String str) {
        byte[] LIZJ = this.LIZ.LIZJ(i, str);
        o.LJIIIIZZ(LIZJ, "abOriginClient.downloadFile(maxBytes, url)");
        return LIZJ;
    }

    public static void LJIIL(String str, String str2, ArrayList arrayList) {
        if (str != null) {
            C77800Ug8.LJFF("Content-Encoding", str, arrayList);
        }
        if (str2 != null && str2.length() > 0) {
            C77800Ug8.LJFF("Content-Type", str2, arrayList);
        }
    }

    @Override // X.InterfaceC65157Phh
    public final String LIZLLL(int i, int i2, String str, List<InterfaceC61858OPm> list) {
        return LJIILL(i2, str, C1R5.LIZ(str, "url"), null, LJIILIIL(list), null);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJIIJ(int i, String str, C65155Phf c65155Phf, long j, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        String LJIIJ = this.LIZ.LJIIJ(i, str, c65155Phf, j, interfaceC65171PhvArr);
        o.LJIIIIZZ(LJIIJ, "abOriginClient.uploadFil…sher, id, requestHolders)");
        return LJIIJ;
    }

    public static String LJIILL(int i, String str, java.util.Map map, TypedOutput typedOutput, List list, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        InterfaceC37276Ek4<String> doPost;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> LIZJ = EZX.LIZJ(str, linkedHashMap);
        String baseUrl = (String) LIZJ.first;
        String str2 = (String) LIZJ.second;
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        o.LJIIIIZZ(baseUrl, "baseUrl");
        IIESNetworkApi iIESNetworkApi = (IIESNetworkApi) LIZLLL.LIZ(baseUrl).LJFF().LIZ.LIZ(IIESNetworkApi.class);
        if (typedOutput != null) {
            doPost = iIESNetworkApi.postBody(i, str2, linkedHashMap, typedOutput, list, null);
            o.LJIIIIZZ(doPost, "{\n            api.postBo… headers, null)\n        }");
        } else {
            doPost = iIESNetworkApi.doPost(i, str2, linkedHashMap, map, list, null);
            o.LJIIIIZZ(doPost, "{\n            api.doPost… headers, null)\n        }");
        }
        if (interfaceC65171PhvArr != null && interfaceC65171PhvArr.length != 0) {
            interfaceC65171PhvArr[0] = new C65163Phn(doPost);
        }
        String str3 = doPost.execute().LIZIZ;
        o.LJIIIIZZ(str3, "call.execute().body()");
        return str3;
    }

    @Override // X.InterfaceC65157Phh
    public final String LIZ(int i, int i2, String str, byte[] bArr, String str2, String str3) {
        return LJIIJJI(i, i2, str, bArr, str2, str3, null);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJFF(int i, String str, byte[] bArr, String str2, String str3, List list) {
        ArrayList LJIILIIL = LJIILIIL(list);
        LJIIL(str2, str3, LJIILIIL);
        return LJIILL(i, str, new HashMap(), new TypedByteArray(str3, bArr, new String[0]), LJIILIIL, null);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJI(int i, int i2, String url, List list, InterfaceC65171Phv[] interfaceC65171PhvArr, List list2) {
        o.LJIIIZ(url, "url");
        return LJIILL(i2, url, LJIILJJIL(list), null, LJIILIIL(list2), null);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJII(int i, int i2, String url, List list, InterfaceC65171Phv[] interfaceC65171PhvArr, List list2) {
        o.LJIIIZ(url, "url");
        return LJIILL(i2, url, LJIILJJIL(list), null, LJIILIIL(list2), interfaceC65171PhvArr);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJIIIZ(int i, int i2, String url, C65155Phf c65155Phf, InterfaceC65171Phv[] interfaceC65171PhvArr, List list) {
        o.LJIIIZ(url, "url");
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C66619QCp c66619QCp = (C66619QCp) it.next();
                multipartTypedOutput.addPart(c66619QCp.LJLIL, new TypedString(c66619QCp.LJLILLLLZI));
            }
        }
        if (c65155Phf != null) {
            Iterator it2 = ((HashSet) c65155Phf.LIZ).iterator();
            while (it2.hasNext()) {
                InterfaceC65161Phl interfaceC65161Phl = (InterfaceC65161Phl) it2.next();
                if (interfaceC65161Phl instanceof C65162Phm) {
                    Object value = interfaceC65161Phl.getValue();
                    o.LJII(value, "null cannot be cast to non-null type kotlin.String");
                    multipartTypedOutput.addPart(interfaceC65161Phl.getName(), new TypedString((String) value));
                } else if (interfaceC65161Phl instanceof C65154Phe) {
                    C65154Phe c65154Phe = (C65154Phe) interfaceC65161Phl;
                    byte[] bArr = c65154Phe.LIZIZ;
                    o.LJII(bArr, "null cannot be cast to non-null type kotlin.ByteArray");
                    multipartTypedOutput.addPart(c65154Phe.LIZ, new TypedByteArray(null, bArr, c65154Phe.LIZJ));
                } else if (interfaceC65161Phl instanceof C65159Phj) {
                    Object value2 = interfaceC65161Phl.getValue();
                    o.LJII(value2, "null cannot be cast to non-null type java.io.File");
                    multipartTypedOutput.addPart(interfaceC65161Phl.getName(), new TypedFile(null, (File) value2));
                }
            }
        }
        return LJIILL(i2, url, new HashMap(), multipartTypedOutput, null, interfaceC65171PhvArr);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJIIIIZZ(int i, int i2, String str, boolean z, List list, F30 f30, boolean z2) {
        String str2 = ((IIESNetworkApi) RetrofitFactory.LIZLLL().LIZ(this.LIZIZ).LJFF().LIZ.LIZ(IIESNetworkApi.class)).doGet(true, i2, str, new HashMap(), LJIILIIL(list), null).execute().LIZIZ;
        o.LJIIIIZZ(str2, "get().getService(IRetrof…ute()\n            .body()");
        return str2;
    }

    @Override // X.InterfaceC65157Phh
    public final String LJIIJJI(int i, int i2, String str, byte[] bArr, String str2, String str3, List<InterfaceC61858OPm> list) {
        ArrayList LJIILIIL = LJIILIIL(list);
        LJIIL(str2, str3, LJIILIIL);
        return LJIILL(i2, str, new HashMap(), new TypedByteArray(str3, bArr, new String[0]), LJIILIIL, null);
    }

    @Override // X.InterfaceC65157Phh
    public final boolean LIZIZ(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, InterfaceC65169Pht interfaceC65169Pht, String str2, List list, String[] strArr, int[] iArr) {
        return this.LIZ.LIZIZ(i, str, stringBuffer, stringBuffer2, stringBuffer3, interfaceC65169Pht, str2, list, strArr, iArr);
    }

    @Override // X.InterfaceC65157Phh
    public final boolean LJ(int i, String str, String str2, String str3, String str4, InterfaceC65169Pht interfaceC65169Pht, String str5, List list, String[] strArr, int[] iArr) {
        return this.LIZ.LJ(i, str, str2, str3, str4, interfaceC65169Pht, str5, list, strArr, iArr);
    }
}
