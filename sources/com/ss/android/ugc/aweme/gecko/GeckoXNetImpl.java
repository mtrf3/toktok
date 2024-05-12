package com.ss.android.ugc.aweme.gecko;

import X.C36910EeA;
import X.C38891fp;
import X.C46104I7o;
import X.C61538ODe;
import X.C64797Pbt;
import X.E8L;
import X.E8M;
import X.EFJ;
import X.EJ6;
import X.ENX;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC30952CCu;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import X.InterfaceC789838c;
import X.OEB;
import X.OEI;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public final class GeckoXNetImpl implements OEB {
    public GeckoXNetApi LIZ;

    /* loaded from: classes7.dex */
    public interface GeckoXNetApi {
        @E8L
        InterfaceC37276Ek4<String> doGet(@InterfaceC195747mE String str);

        @E8M
        @InterfaceC195757mF
        InterfaceC37276Ek4<String> doPost(@InterfaceC195747mE String str, @InterfaceC36229EJt Map<String, String> map);

        @ENX
        @E8L
        InterfaceC37276Ek4<TypedInput> downloadFile(@InterfaceC195747mE String str, @InterfaceC30952CCu Map<String, String> map);

        @E8M
        InterfaceC37276Ek4<String> postBody(@InterfaceC195747mE String str, @InterfaceC195727mC TypedOutput typedOutput);
    }

    @Override // X.InterfaceC61566OEg
    public final OEI LIZ(String str, String str2) {
        return doPost(str, str2, null);
    }

    @Override // X.InterfaceC61566OEg
    public final void LIZJ(String str, long j, C61538ODe c61538ODe) {
        LIZIZ(str, j, c61538ODe, null, 0L);
    }

    @Override // X.OEB
    public final OEI doPost(String url, String str, Map<String, String> map) {
        Object obj;
        o.LJIIIZ(url, "url");
        if (!s.LJJJLZIJ(url, ".snssdk.", false)) {
            TypedByteArray typedByteArray = new TypedByteArray("application/json", str.getBytes(Charset.forName("UTF-8")), new String[0]);
            if (this.LIZ == null) {
                String baseUrl = EFJ.LIZJ;
                o.LJIIIZ(baseUrl, "baseUrl");
                InterfaceC789838c create = C46104I7o.LJJII().create(baseUrl);
                if (create != null) {
                    obj = create.create(GeckoXNetApi.class);
                } else {
                    obj = null;
                }
                o.LJI(obj);
                this.LIZ = (GeckoXNetApi) obj;
            }
            C64797Pbt<String> execute = this.LIZ.postBody(url, typedByteArray).execute();
            List<EJ6> list = execute.LIZ.LIZLLL;
            HashMap hashMap = new HashMap();
            if (!C38891fp.LJJI(list)) {
                for (EJ6 ej6 : list) {
                    hashMap.put(ej6.LIZ, ej6.LIZIZ);
                }
            }
            String str2 = execute.LIZIZ;
            C36910EeA c36910EeA = execute.LIZ;
            return new OEI(hashMap, str2, c36910EeA.LIZIZ, c36910EeA.LIZJ);
        }
        throw new Exception("Cannot access this host");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C61538ODe r7, java.lang.String r8, long r9, int r11, X.C64672PZs r12) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.gecko.GeckoXNetImpl.LIZLLL(X.ODe, java.lang.String, long, int, X.PZs):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff A[Catch: all -> 0x0145, TryCatch #2 {all -> 0x0145, blocks: (B:40:0x00fb, B:42:0x00ff, B:44:0x0103, B:46:0x011b, B:47:0x0144, B:49:0x010f), top: B:39:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010f A[Catch: all -> 0x0145, TryCatch #2 {all -> 0x0145, blocks: (B:40:0x00fb, B:42:0x00ff, B:44:0x0103, B:46:0x011b, B:47:0x0144, B:49:0x010f), top: B:39:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.OEB
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(java.lang.String r21, long r22, X.C61538ODe r24, java.util.Map<java.lang.String, java.lang.String> r25, long r26) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.gecko.GeckoXNetImpl.LIZIZ(java.lang.String, long, X.ODe, java.util.Map, long):boolean");
    }
}
