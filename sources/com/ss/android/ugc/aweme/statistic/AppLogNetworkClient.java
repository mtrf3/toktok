package com.ss.android.ugc.aweme.statistic;

import X.AbstractC66805QJt;
import X.C36616EYq;
import X.C64799Pbv;
import X.C64923Pdv;
import X.C76L;
import X.E8L;
import X.E8M;
import X.EFJ;
import X.EJ6;
import X.ENW;
import X.InterfaceC195727mC;
import X.InterfaceC195747mE;
import X.InterfaceC195757mF;
import X.InterfaceC195767mG;
import X.InterfaceC30951CCt;
import X.InterfaceC36229EJt;
import X.InterfaceC37276Ek4;
import X.QJY;
import X.QKY;
import android.net.Uri;
import android.util.Pair;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.ss.android.common.util.NetworkUtils;
import defpackage.a1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* loaded from: classes7.dex */
public final class AppLogNetworkClient extends AbstractC66805QJt {
    public volatile AppLogGetApi LIZIZ;
    public volatile AppLogPostApi LIZJ;

    /* loaded from: classes7.dex */
    public interface AppLogGetApi {
        @E8L
        C76L<String> getResponse(@InterfaceC195747mE String str);
    }

    /* loaded from: classes7.dex */
    public interface AppLogPostApi {
        @E8M
        C76L<String> doPost(@InterfaceC195747mE String str, @InterfaceC195727mC TypedOutput typedOutput, @ENW int i, @InterfaceC195767mG List<EJ6> list);

        @E8M
        @InterfaceC195757mF
        C76L<String> getResponse(@InterfaceC195747mE String str, @InterfaceC36229EJt Map<String, String> map, @ENW int i);

        @E8M
        InterfaceC37276Ek4<TypedInput> postDataStream(@ENW int i, @InterfaceC195747mE String str, @InterfaceC195727mC TypedOutput typedOutput, @InterfaceC195767mG List<EJ6> list, @InterfaceC30951CCt boolean z);
    }

    public final AppLogPostApi LJI() {
        if (this.LIZJ == null) {
            this.LIZJ = (AppLogPostApi) RetrofitFactory.LIZLLL().LIZ(EFJ.LIZJ).LJFF().LIZ.LIZ(AppLogPostApi.class);
        }
        return this.LIZJ;
    }

    public static List<EJ6> LJII(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            arrayList.add(new EJ6((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    public static Pair<String, String> LJIIIIZZ(String str) {
        Uri parse = UriProtector.parse(str);
        StringBuilder sb = new StringBuilder();
        String scheme = parse.getScheme();
        String host = parse.getHost();
        int port = parse.getPort();
        if (host != null) {
            if (scheme != null) {
                sb.append(scheme);
                sb.append("://");
            }
            sb.append(host);
            if (port > 0) {
                sb.append(':');
                sb.append(port);
            }
        }
        String sb2 = sb.toString();
        String path = parse.getPath();
        String query = parse.getQuery();
        if (query != null) {
            path = a1.LJ(path, "?", query);
        }
        return new Pair<>(sb2, path);
    }

    @Override // X.AbstractC66805QJt
    public final String LIZIZ(String str, Map<String, String> map, QKY qky) {
        if (str == null) {
            return null;
        }
        try {
            if (this.LIZIZ == null) {
                this.LIZIZ = (AppLogGetApi) RetrofitFactory.LIZLLL().LIZ(EFJ.LIZJ).LJFF().LIZ.LIZ(AppLogGetApi.class);
            }
            return this.LIZIZ.getResponse(str).get();
        } catch (ExecutionException e) {
            if (e.getCause() instanceof C64923Pdv) {
                throw new C36616EYq(((C64923Pdv) e.getCause()).getStatusCode(), e.getMessage());
            }
            throw new C36616EYq(0, e.getMessage());
        } catch (Exception e2) {
            throw new C36616EYq(0, e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC66805QJt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] LJFF(java.lang.String r13, byte[] r14, java.util.Map r15) {
        /*
            r12 = this;
            r11 = 0
            r5 = 0
            android.util.Pair r1 = LJIIIIZZ(r13)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.Object r0 = r1.first     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.Object r8 = r1.second     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.String r2 = "Content-Type"
            r0 = r15
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            r0.remove(r2)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.util.List r10 = LJII(r15)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            com.bytedance.retrofit2.mime.TypedByteArray r9 = new com.bytedance.retrofit2.mime.TypedByteArray     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            r9.<init>(r1, r14, r0)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            com.bytedance.ies.ugc.aweme.network.IRetrofitFactory r1 = com.bytedance.ies.ugc.aweme.network.RetrofitFactory.LIZLLL()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.String r0 = "https://log-va.tiktokv.com/service/2/log_settings/"
            X.PgZ r0 = r1.LIZ(r0)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            X.PgU r0 = r0.LJFF()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.Class<com.ss.android.ugc.aweme.statistic.AppLogNetworkClient$AppLogPostApi> r1 = com.ss.android.ugc.aweme.statistic.AppLogNetworkClient.AppLogPostApi.class
            X.PfT r0 = r0.LIZ     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.lang.Object r6 = r0.LIZ(r1)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            com.ss.android.ugc.aweme.statistic.AppLogNetworkClient$AppLogPostApi r6 = (com.ss.android.ugc.aweme.statistic.AppLogNetworkClient.AppLogPostApi) r6     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            r7 = -1
            X.Ek4 r0 = r6.postDataStream(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            X.Pbt r0 = r0.execute()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            T r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            com.bytedance.retrofit2.mime.TypedInput r0 = (com.bytedance.retrofit2.mime.TypedInput) r0     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.io.InputStream r2 = r0.in()     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L83
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La6
            r4.<init>()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> La6
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
        L59:
            int r0 = r2.read(r1)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            if (r0 == r7) goto L63
            r4.write(r1, r11, r0)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            goto L59
        L63:
            byte[] r1 = r4.toByteArray()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r2.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L6f:
            r4.close()     // Catch: java.io.IOException -> L73
            goto L77
        L73:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L77:
            return r1
        L78:
            r1 = move-exception
            goto La8
        L7a:
            r3 = move-exception
            goto L7e
        L7c:
            r3 = move-exception
            r4 = r5
        L7e:
            r5 = r2
            goto L85
        L80:
            r1 = move-exception
            r4 = r5
            goto La9
        L83:
            r3 = move-exception
            r4 = r5
        L85:
            boolean r0 = r3 instanceof X.C64923Pdv     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L9a
            X.EYq r2 = new X.EYq     // Catch: java.lang.Throwable -> La4
            r0 = r3
            X.Pdv r0 = (X.C64923Pdv) r0     // Catch: java.lang.Throwable -> La4
            int r1 = r0.getStatusCode()     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> La4
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> La4
            throw r2     // Catch: java.lang.Throwable -> La4
        L9a:
            X.EYq r1 = new X.EYq     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> La4
            r1.<init>(r11, r0)     // Catch: java.lang.Throwable -> La4
            throw r1     // Catch: java.lang.Throwable -> La4
        La4:
            r1 = move-exception
            goto La9
        La6:
            r1 = move-exception
            r4 = r5
        La8:
            r5 = r2
        La9:
            if (r5 == 0) goto Lb3
            r5.close()     // Catch: java.io.IOException -> Laf
            goto Lb3
        Laf:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lb3:
            if (r4 == 0) goto Lbd
            r4.close()     // Catch: java.io.IOException -> Lb9
            goto Lbd
        Lb9:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        Lbd:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.statistic.AppLogNetworkClient.LJFF(java.lang.String, byte[], java.util.Map):byte[]");
    }

    @Override // X.AbstractC66805QJt
    public final String LIZLLL(String str, List<Pair<String, String>> list, Map<String, String> map, QKY qky) {
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            hashMap.put(pair.first, pair.second);
        }
        QJY.LJI(hashMap, true);
        try {
            return LJI().getResponse(str, hashMap, 204800).get();
        } catch (ExecutionException e) {
            if (!(e.getCause() instanceof C64923Pdv)) {
                if (e.getCause() instanceof C64799Pbv) {
                    C64799Pbv c64799Pbv = (C64799Pbv) e.getCause();
                    throw new C36616EYq(c64799Pbv.getStatusCode(), c64799Pbv.getMessage());
                }
                throw new C36616EYq(0, e.getMessage());
            }
            throw new C36616EYq(((C64923Pdv) e.getCause()).getStatusCode(), e.getMessage());
        } catch (Exception e2) {
            throw new C36616EYq(0, e2.getMessage());
        }
    }

    @Override // X.AbstractC66805QJt
    public final String LJ(String str, byte[] bArr, Map<String, String> map, QKY qky) {
        NetworkUtils.com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(str);
        if (str == null) {
            return null;
        }
        try {
            String str2 = map.get("Content-Encoding");
            String str3 = map.get("Content-Type");
            ArrayList arrayList = new ArrayList();
            if (str2 != null) {
                arrayList.add(new EJ6("Content-Encoding", str2));
            }
            if (str3 != null && str3.length() > 0) {
                arrayList.add(new EJ6("Content-Type", str3));
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new EJ6(entry.getKey(), entry.getValue()));
            }
            return LJI().doPost(str, new TypedByteArray(str3, bArr, new String[0]), 204800, arrayList).get();
        } catch (ExecutionException e) {
            if (!(e.getCause() instanceof C64923Pdv)) {
                if (e.getCause() instanceof C64799Pbv) {
                    C64799Pbv c64799Pbv = (C64799Pbv) e.getCause();
                    throw new C36616EYq(c64799Pbv.getStatusCode(), c64799Pbv.getMessage());
                }
                throw new C36616EYq(0, e.getMessage());
            }
            throw new C36616EYq(((C64923Pdv) e.getCause()).getStatusCode(), e.getMessage());
        } catch (Exception e2) {
            throw new C36616EYq(0, e2.getMessage());
        }
    }
}
