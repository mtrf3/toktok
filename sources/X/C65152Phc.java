package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.CommandDispatcher;
import com.ss.android.ugc.aweme.net.IIESNetworkApi;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* renamed from: X.Phc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65152Phc implements InterfaceC65157Phh {
    public static final java.util.Map<String, C65019PfT> LIZLLL = new HashMap();
    public final List<InterfaceC37216Ej6> LIZ = new ArrayList();
    public C48153Iv7 LIZIZ;
    public PZL LIZJ;

    public final void LJIIL(InterfaceC37216Ej6 interfaceC37216Ej6) {
        if (interfaceC37216Ej6 != null) {
            ((ArrayList) this.LIZ).add(interfaceC37216Ej6);
        }
    }

    public final IIESNetworkApi LJIILIIL(String str) {
        if (C38354F3m.LJ(str)) {
            return null;
        }
        HashMap hashMap = (HashMap) LIZLLL;
        C65019PfT c65019PfT = (C65019PfT) hashMap.get(str);
        if (c65019PfT == null) {
            List<InterfaceC37216Ej6> list = this.LIZ;
            synchronized (C65083PgV.class) {
                c65019PfT = C65083PgV.LJII(str, list, null);
            }
            hashMap.put(str, c65019PfT);
        }
        return (IIESNetworkApi) C65083PgV.LJI(c65019PfT, IIESNetworkApi.class);
    }

    public static String LJIILLIIL(String str, List list) {
        if (list != null && !TextUtils.isEmpty(str)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EJ6 ej6 = (EJ6) it.next();
                if (str.equalsIgnoreCase(ej6.LIZ)) {
                    return ej6.LIZIZ;
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC65157Phh
    public final byte[] LIZJ(int i, String str) {
        TypedInput typedInput;
        long j;
        if (C38354F3m.LJ(str)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> LIZJ = EZX.LIZJ(str, linkedHashMap);
        String str2 = (String) LIZJ.first;
        String str3 = (String) LIZJ.second;
        IIESNetworkApi LJIILIIL = LJIILIIL(str2);
        if (LJIILIIL != null) {
            C64797Pbt<TypedInput> execute = LJIILIIL.downloadFile(true, i, str3, linkedHashMap).execute();
            if (execute.LIZIZ() && (typedInput = execute.LIZIZ) != null) {
                InputStream in = typedInput.in();
                String LJIILLIIL = LJIILLIIL("Content-Length", execute.LIZ.LIZLLL);
                if (LJIILLIIL != null) {
                    j = CastLongProtector.parseLong(LJIILLIIL);
                } else {
                    j = -1;
                }
                return NetworkUtils.stream2ByteArray(i, in, j);
            }
        }
        return null;
    }

    @Override // X.InterfaceC65157Phh
    public final String LIZLLL(int i, int i2, String str, List<InterfaceC61858OPm> list) {
        if (C38354F3m.LJ(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (InterfaceC61858OPm interfaceC61858OPm : list) {
                    String name = interfaceC61858OPm.getName();
                    String value = interfaceC61858OPm.getValue();
                    if (name != null && name.length() > 0) {
                        arrayList.add(new EJ6(name, value));
                    }
                }
            } catch (Exception e) {
                NetworkUtils.handleApiError(str, e, System.currentTimeMillis() - currentTimeMillis, null);
                C16880lQ.LLLLIIL(e);
                throw e;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> LIZJ = EZX.LIZJ(str, linkedHashMap);
        String str2 = (String) LIZJ.first;
        String str3 = (String) LIZJ.second;
        IIESNetworkApi LJIILIIL = LJIILIIL(str2);
        if (LJIILIIL == null) {
            return null;
        }
        PZL pzl = this.LIZJ;
        if (pzl != null && !pzl.LIZ) {
            PZM pzm = PZN.LIZ;
            if (pzm.LIZIZ.getAndIncrement() == 0) {
                pzm.LIZJ.sendEmptyMessage(1);
                pzm.LIZLLL = SystemClock.elapsedRealtime();
            }
            pzl.LIZIZ = str;
            pzl.LIZ = true;
        }
        InterfaceC37276Ek4<String> doDetete = LJIILIIL.doDetete(i2, str3, linkedHashMap, arrayList, this.LIZIZ);
        long currentTimeMillis2 = System.currentTimeMillis();
        C64797Pbt<String> execute = doDetete.execute();
        PZL pzl2 = this.LIZJ;
        if (pzl2 != null) {
            pzl2.LIZ(str);
        }
        long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
        if (NetworkUtils.getCommandListener() != null) {
            NetworkUtils.getCommandListener().getClass();
            if (!C38354F3m.LJ("X-SS-Command")) {
                ArrayList arrayList2 = new ArrayList();
                for (EJ6 ej6 : execute.LIZ.LIZLLL) {
                    if ("X-SS-Command".equalsIgnoreCase(ej6.LIZ)) {
                        arrayList2.add(ej6.LIZIZ);
                    }
                }
                ((CommandDispatcher) NetworkUtils.getCommandListener()).LIZIZ(arrayList2);
            }
        }
        if (execute.LIZIZ()) {
            String str4 = execute.LIZIZ;
            NetworkUtils.com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ServerTimeLancet_handleTimeStampFromResponse(str4);
            NetworkUtils.handleApiOk(str, currentTimeMillis3, null);
            return str4;
        }
        C36910EeA c36910EeA = execute.LIZ;
        throw new C64923Pdv(c36910EeA.LIZIZ, LJIILLIIL("Reason-Phrase", c36910EeA.LIZLLL));
    }

    @Override // X.InterfaceC65157Phh
    public final String LJIIJ(int i, String str, C65155Phf c65155Phf, long j, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        Iterator it = ((HashSet) c65155Phf.LIZ).iterator();
        while (it.hasNext()) {
            InterfaceC65161Phl interfaceC65161Phl = (InterfaceC65161Phl) it.next();
            if (interfaceC65161Phl instanceof C65162Phm) {
                multipartTypedOutput.addPart(interfaceC65161Phl.getName(), new TypedString((String) interfaceC65161Phl.getValue()));
            } else if (interfaceC65161Phl instanceof C65154Phe) {
                C65154Phe c65154Phe = (C65154Phe) interfaceC65161Phl;
                multipartTypedOutput.addPart(c65154Phe.LIZ, new TypedByteArray(null, c65154Phe.LIZIZ, c65154Phe.LIZJ));
            } else if (interfaceC65161Phl instanceof C65159Phj) {
                multipartTypedOutput.addPart(interfaceC65161Phl.getName(), new TypedFile(null, (File) interfaceC65161Phl.getValue()));
            }
        }
        return LJIILL(0, i, str, null, multipartTypedOutput, null, this.LIZIZ, interfaceC65171PhvArr);
    }

    @Override // X.InterfaceC65157Phh
    public final String LIZ(int i, int i2, String str, byte[] bArr, String str2, String str3) {
        return LJIIJJI(i, i2, str, bArr, str2, str3, null);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJFF(int i, String str, byte[] bArr, String str2, String str3, List list) {
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            C77800Ug8.LJFF("Content-Encoding", str2, arrayList);
        }
        if (str3 != null && str3.length() > 0) {
            C77800Ug8.LJFF("Content-Type", str3, arrayList);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC61858OPm interfaceC61858OPm = (InterfaceC61858OPm) it.next();
                arrayList.add(new EJ6(interfaceC61858OPm.getName(), interfaceC61858OPm.getValue()));
            }
        }
        return LJIILJJIL("put", i, str, null, new TypedByteArray(str3, bArr, new String[0]), arrayList, this.LIZIZ, null);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJI(int i, int i2, String str, List list, InterfaceC65171Phv[] interfaceC65171PhvArr, List list2) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66619QCp c66619QCp = (C66619QCp) it.next();
            hashMap.put(c66619QCp.LJLIL, c66619QCp.LJLILLLLZI);
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                InterfaceC61858OPm interfaceC61858OPm = (InterfaceC61858OPm) it2.next();
                arrayList.add(new EJ6(interfaceC61858OPm.getName(), interfaceC61858OPm.getValue()));
            }
        }
        return LJIILJJIL("put", i2, str, hashMap, null, arrayList, this.LIZIZ, interfaceC65171PhvArr);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJII(int i, int i2, String str, List list, InterfaceC65171Phv[] interfaceC65171PhvArr, List list2) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66619QCp c66619QCp = (C66619QCp) it.next();
            hashMap.put(c66619QCp.LJLIL, c66619QCp.LJLILLLLZI);
        }
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                InterfaceC61858OPm interfaceC61858OPm = (InterfaceC61858OPm) it2.next();
                arrayList.add(new EJ6(interfaceC61858OPm.getName(), interfaceC61858OPm.getValue()));
            }
        }
        return LJIILL(i, i2, str, hashMap, null, arrayList, this.LIZIZ, interfaceC65171PhvArr);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJIIIZ(int i, int i2, String str, C65155Phf c65155Phf, InterfaceC65171Phv[] interfaceC65171PhvArr, List list) {
        List arrayList = new ArrayList();
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C66619QCp c66619QCp = (C66619QCp) it.next();
            multipartTypedOutput.addPart(c66619QCp.LJLIL, new TypedString(c66619QCp.LJLILLLLZI));
        }
        Iterator it2 = ((HashSet) c65155Phf.LIZ).iterator();
        while (it2.hasNext()) {
            InterfaceC65161Phl interfaceC65161Phl = (InterfaceC65161Phl) it2.next();
            if (interfaceC65161Phl instanceof C65162Phm) {
                multipartTypedOutput.addPart(interfaceC65161Phl.getName(), new TypedString((String) interfaceC65161Phl.getValue()));
            } else if (interfaceC65161Phl instanceof C65154Phe) {
                C65154Phe c65154Phe = (C65154Phe) interfaceC65161Phl;
                multipartTypedOutput.addPart(c65154Phe.LIZ, new TypedByteArray(null, c65154Phe.LIZIZ, c65154Phe.LIZJ));
            } else if (interfaceC65161Phl instanceof C65159Phj) {
                multipartTypedOutput.addPart(interfaceC65161Phl.getName(), new TypedFile(null, (File) interfaceC65161Phl.getValue()));
            }
        }
        return LJIILL(i, i2, str, null, multipartTypedOutput, arrayList, this.LIZIZ, interfaceC65171PhvArr);
    }

    @Override // X.InterfaceC65157Phh
    public final String LJIIIIZZ(int i, int i2, String str, boolean z, List list, F30 f30, boolean z2) {
        if (C38354F3m.LJ(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InterfaceC61858OPm interfaceC61858OPm = (InterfaceC61858OPm) it.next();
                    String name = interfaceC61858OPm.getName();
                    String value = interfaceC61858OPm.getValue();
                    if (name != null && name.length() > 0) {
                        arrayList.add(new EJ6(name, value));
                    }
                }
            } catch (Exception e) {
                e = e;
                NetworkUtils.handleApiError(str, e, System.currentTimeMillis() - currentTimeMillis, null);
                C16880lQ.LLLLIIL(e);
                throw e;
            }
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> LIZJ = EZX.LIZJ(str, linkedHashMap);
            String str2 = (String) LIZJ.first;
            String str3 = (String) LIZJ.second;
            IIESNetworkApi LJIILIIL = LJIILIIL(str2);
            if (LJIILIIL == null) {
                return null;
            }
            PZL pzl = this.LIZJ;
            if (pzl != null) {
                try {
                    if (!pzl.LIZ) {
                        PZM pzm = PZN.LIZ;
                        if (pzm.LIZIZ.getAndIncrement() == 0) {
                            pzm.LIZJ.sendEmptyMessage(1);
                            try {
                                pzm.LIZLLL = SystemClock.elapsedRealtime();
                            } catch (Exception e2) {
                                e = e2;
                                NetworkUtils.handleApiError(str, e, System.currentTimeMillis() - currentTimeMillis, null);
                                C16880lQ.LLLLIIL(e);
                                throw e;
                            }
                        }
                        pzl.LIZIZ = str;
                        pzl.LIZ = true;
                    }
                } catch (Exception e3) {
                    e = e3;
                    NetworkUtils.handleApiError(str, e, System.currentTimeMillis() - currentTimeMillis, null);
                    C16880lQ.LLLLIIL(e);
                    throw e;
                }
            }
            InterfaceC37276Ek4<String> doGet = LJIILIIL.doGet(true, i2, str3, linkedHashMap, arrayList, this.LIZIZ);
            long currentTimeMillis2 = System.currentTimeMillis();
            C64797Pbt<String> execute = doGet.execute();
            PZL pzl2 = this.LIZJ;
            if (pzl2 != null) {
                pzl2.LIZ(str);
            }
            long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
            LJIILLIIL("X-TT-LOGID", execute.LIZ.LIZLLL);
            if (NetworkUtils.getCommandListener() != null) {
                NetworkUtils.getCommandListener().getClass();
                if (!C38354F3m.LJ("X-SS-Command")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (EJ6 ej6 : execute.LIZ.LIZLLL) {
                        if ("X-SS-Command".equalsIgnoreCase(ej6.LIZ)) {
                            arrayList2.add(ej6.LIZIZ);
                        }
                    }
                    ((CommandDispatcher) NetworkUtils.getCommandListener()).LIZIZ(arrayList2);
                }
            }
            if (f30 != null) {
                for (EJ6 ej62 : execute.LIZ.LIZLLL) {
                    String str4 = ej62.LIZ;
                    if ("ETag".equalsIgnoreCase(str4) || "Last-Modified".equalsIgnoreCase(str4) || "Cache-Control".equalsIgnoreCase(str4) || "X-SS-SIGN".equalsIgnoreCase(str4) || "X-TT-LOGID".equalsIgnoreCase(str4)) {
                        ((ArrayList) f30.LJLIL).add(new C66621QCr(str4, ej62.LIZIZ));
                    }
                }
            }
            if (execute.LIZIZ()) {
                String str5 = execute.LIZIZ;
                NetworkUtils.com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ServerTimeLancet_handleTimeStampFromResponse(str5);
                NetworkUtils.handleApiOk(str, currentTimeMillis3, null);
                return str5;
            }
            C36910EeA c36910EeA = execute.LIZ;
            throw new C64923Pdv(c36910EeA.LIZIZ, LJIILLIIL("Reason-Phrase", c36910EeA.LIZLLL));
        } catch (Exception e4) {
            e = e4;
        }
    }

    @Override // X.InterfaceC65157Phh
    public final String LJIIJJI(int i, int i2, String str, byte[] bArr, String str2, String str3, List<InterfaceC61858OPm> list) {
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            C77800Ug8.LJFF("Content-Encoding", str2, arrayList);
        }
        if (str3 != null && str3.length() > 0) {
            C77800Ug8.LJFF("Content-Type", str3, arrayList);
        }
        if (list != null) {
            for (InterfaceC61858OPm interfaceC61858OPm : list) {
                arrayList.add(new EJ6(interfaceC61858OPm.getName(), interfaceC61858OPm.getValue()));
            }
        }
        return LJIILL(i, i2, str, null, new TypedByteArray(str3, bArr, new String[0]), arrayList, this.LIZIZ, null);
    }

    public final String LJIILJJIL(String str, int i, String str2, java.util.Map map, TypedOutput typedOutput, List list, C48153Iv7 c48153Iv7, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        InterfaceC37276Ek4<String> doPost;
        java.util.Map map2 = map;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        if (!"get".equals(str)) {
            if (!"delete".equals(str)) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Pair<String, String> LIZJ = EZX.LIZJ(str2, linkedHashMap);
                    String str3 = (String) LIZJ.first;
                    String str4 = (String) LIZJ.second;
                    IIESNetworkApi LJIILIIL = LJIILIIL(str3);
                    if (LJIILIIL == null) {
                        return null;
                    }
                    if (typedOutput != null) {
                        if ("put".equals(str)) {
                            doPost = LJIILIIL.putBody(i, str4, linkedHashMap, typedOutput, list, c48153Iv7);
                        } else {
                            doPost = LJIILIIL.postBody(i, str4, linkedHashMap, typedOutput, list, c48153Iv7);
                        }
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        if ("put".equals(str)) {
                            doPost = LJIILIIL.doPut(i, str4, linkedHashMap, map2, list, c48153Iv7);
                        } else {
                            doPost = LJIILIIL.doPost(i, str4, linkedHashMap, map2, list, c48153Iv7);
                        }
                    }
                    if (interfaceC65171PhvArr != null && interfaceC65171PhvArr.length > 0) {
                        interfaceC65171PhvArr[0] = new C65163Phn(doPost);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    PZL pzl = this.LIZJ;
                    if (pzl != null && !pzl.LIZ) {
                        PZM pzm = PZN.LIZ;
                        if (pzm.LIZIZ.getAndIncrement() == 0) {
                            pzm.LIZJ.sendEmptyMessage(1);
                            pzm.LIZLLL = SystemClock.elapsedRealtime();
                        }
                        pzl.LIZIZ = str2;
                        pzl.LIZ = true;
                    }
                    C64797Pbt<String> execute = doPost.execute();
                    PZL pzl2 = this.LIZJ;
                    if (pzl2 != null) {
                        pzl2.LIZ(str2);
                    }
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis2;
                    LJIILLIIL("X-TT-LOGID", execute.LIZ.LIZLLL);
                    if (NetworkUtils.getCommandListener() != null) {
                        NetworkUtils.getCommandListener().getClass();
                        if (!C38354F3m.LJ("X-SS-Command")) {
                            ArrayList arrayList = new ArrayList();
                            for (EJ6 ej6 : execute.LIZ.LIZLLL) {
                                if ("X-SS-Command".equalsIgnoreCase(ej6.LIZ)) {
                                    arrayList.add(ej6.LIZIZ);
                                }
                            }
                            ((CommandDispatcher) NetworkUtils.getCommandListener()).LIZIZ(arrayList);
                        }
                    }
                    if (execute.LIZIZ()) {
                        String str5 = execute.LIZIZ;
                        NetworkUtils.com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ServerTimeLancet_handleTimeStampFromResponse(str5);
                        NetworkUtils.handleApiOk(str2, currentTimeMillis3, null);
                        return str5;
                    }
                    C36910EeA c36910EeA = execute.LIZ;
                    throw new C64923Pdv(c36910EeA.LIZIZ, LJIILLIIL("Reason-Phrase", c36910EeA.LIZLLL));
                } catch (Exception e) {
                    NetworkUtils.handleApiError(str2, e, System.currentTimeMillis() - currentTimeMillis, null);
                    C16880lQ.LLLLIIL(e);
                    throw e;
                }
            }
            throw new RuntimeException("doInternal temporary does not support delete ");
        }
        throw new RuntimeException("doInternal does not support get");
    }

    public final String LJIILL(int i, int i2, String str, java.util.Map map, TypedOutput typedOutput, List list, C48153Iv7 c48153Iv7, InterfaceC65171Phv[] interfaceC65171PhvArr) {
        return LJIILJJIL("post", i2, str, map, typedOutput, list, c48153Iv7, interfaceC65171PhvArr);
    }

    @Override // X.InterfaceC65157Phh
    public final boolean LIZIZ(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, InterfaceC65169Pht interfaceC65169Pht, String str2, List list, String[] strArr, int[] iArr) {
        return LJ(i, str, stringBuffer.toString(), stringBuffer2.toString(), stringBuffer3.toString(), interfaceC65169Pht, str2, list, strArr, iArr);
    }

    @Override // X.InterfaceC65157Phh
    public final boolean LJ(int i, String str, String str2, String str3, String str4, InterfaceC65169Pht interfaceC65169Pht, String str5, List list, String[] strArr, int[] iArr) {
        if (C38354F3m.LJ(str)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        String str6 = null;
        try {
            String userAgent = NetworkUtils.getUserAgent();
            if (TextUtils.isEmpty(userAgent)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(userAgent);
                LIZ.append(" cronet/1.0.3.2");
                userAgent = X1D.LIZIZ(LIZ);
            }
            arrayList.add(new EJ6("User-Agent", userAgent));
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C66619QCp c66619QCp = (C66619QCp) it.next();
                    arrayList.add(new EJ6(c66619QCp.LJLIL, c66619QCp.LJLILLLLZI));
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> LIZJ = EZX.LIZJ(str, linkedHashMap);
            String str7 = (String) LIZJ.first;
            String str8 = (String) LIZJ.second;
            IIESNetworkApi LJIILIIL = LJIILIIL(str7);
            if (LJIILIIL != null) {
                InterfaceC37276Ek4<TypedInput> downloadFile = LJIILIIL.downloadFile(true, i, str8, linkedHashMap, arrayList, this.LIZIZ);
                C64797Pbt<TypedInput> execute = downloadFile.execute();
                if (execute.LIZIZ()) {
                    TypedInput typedInput = execute.LIZIZ;
                    if (typedInput != null) {
                        InputStream in = typedInput.in();
                        List<EJ6> list2 = execute.LIZ.LIZLLL;
                        long j = -1;
                        if (list2 != null && !list2.isEmpty()) {
                            for (EJ6 ej6 : list2) {
                                if ("Content-Length".equals(ej6.LIZ)) {
                                    String str9 = ej6.LIZIZ;
                                    if (!TextUtils.isEmpty(str9)) {
                                        j = Long.parseLong(str9);
                                    }
                                } else if ("Content-Encoding".equals(ej6.LIZ)) {
                                    String str10 = ej6.LIZIZ;
                                    if (!TextUtils.isEmpty(str10) && "gzip".equalsIgnoreCase(str10)) {
                                        in = new GZIPInputStream(in);
                                    }
                                } else if ("x-snssdk.remoteaddr".equals(ej6.LIZ)) {
                                    str6 = ej6.LIZIZ;
                                }
                            }
                        }
                        if (iArr != null) {
                            try {
                                if (iArr.length > 0) {
                                    iArr[0] = 0;
                                    if (j <= 2147483647L) {
                                        iArr[0] = (int) j;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (strArr != null && strArr.length != 0 && !TextUtils.isEmpty(str6)) {
                                    try {
                                        strArr[0] = str6;
                                    } catch (Throwable unused) {
                                    }
                                }
                                throw th;
                            }
                        }
                        boolean stream2File = NetworkUtils.stream2File(in, j, new C65164Pho(str, downloadFile), i, str2, str3, str4, interfaceC65169Pht, str5, null);
                        if (strArr != null && strArr.length != 0 && !TextUtils.isEmpty(str6)) {
                            try {
                                strArr[0] = str6;
                            } catch (Throwable unused2) {
                            }
                        }
                        return stream2File;
                    }
                } else {
                    C36910EeA c36910EeA = execute.LIZ;
                    throw new C64923Pdv(c36910EeA.LIZIZ, LJIILLIIL("Reason-Phrase", c36910EeA.LIZLLL));
                }
            }
            if (strArr != null && strArr.length != 0 && !TextUtils.isEmpty(null)) {
                try {
                    strArr[0] = null;
                } catch (Throwable unused3) {
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
