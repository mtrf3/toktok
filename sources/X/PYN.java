package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.services.BaseUserService;
import defpackage.i0;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import okhttp3.Request;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PYN implements PY9, PYA, PY8 {
    public static String LIZ;
    public static final Keva LIZIZ;

    @Override // X.PYA
    public final PPC<Request, C64598PWw> LIZIZ(PPC<Request, C64598PWw> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, Integer> LJ(PPC<HttpURLConnection, Integer> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<java.net.URL, URLConnection> LJFF(PPC<java.net.URL, URLConnection> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJII(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, Integer> LJIIIZ(PPC<HttpURLConnection, Integer> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIIL(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIILIIL(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIILL(PPC<HttpURLConnection, InputStream> ppc) {
        return ppc;
    }

    static {
        C16880lQ.LJLLJ(PYN.class);
        Keva repo = KevaImpl.getRepo("x-tt-cmpl-token", 1);
        o.LJIIIIZZ(repo, "getRepo(TOKEN_NAME, Keva…tants.MODE_MULTI_PROCESS)");
        LIZIZ = repo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
    
        if (r7 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIZILJ() {
        /*
            r10 = this;
            java.lang.String r0 = X.PYN.LIZ
            r1 = 0
            if (r0 == 0) goto Lb
            boolean r0 = ujb.o.LJJJJJL(r0)
            if (r0 == 0) goto L33
        Lb:
            com.bytedance.keva.Keva r2 = X.PYN.LIZIZ
            java.lang.String r3 = ""
            java.lang.String r0 = LIZJ(r3)
            java.lang.String r7 = r2.getString(r0, r3)
            if (r7 == 0) goto L1f
            boolean r0 = ujb.o.LJJJJJL(r7)
            if (r0 == 0) goto L55
        L1f:
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.ss.android.ugc.aweme.services.BaseUserService.createIUserServicebyMonsterPlugin(r1)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurrentUser()
            java.lang.String r1 = r0.getUid()
            if (r1 == 0) goto L33
            boolean r0 = ujb.o.LJJJJJL(r1)
            if (r0 == 0) goto L36
        L33:
            java.lang.String r0 = X.PYN.LIZ
            return r0
        L36:
            r0 = 0
            r7 = 0
            if (r0 == 0) goto L3b
            goto L33
        L3b:
            java.lang.String r1 = LIZJ(r1)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L49
            java.lang.String r7 = r2.getString(r1, r3)
        L49:
            java.lang.String r5 = "keva"
            r6 = 0
            r9 = 10
            r4 = r10
            r8 = r6
            LJIJI(r4, r5, r6, r7, r8, r9)
            if (r7 == 0) goto L33
        L55:
            boolean r0 = ujb.o.LJJJJJL(r7)
            if (r0 == 0) goto L5c
            goto L33
        L5c:
            java.lang.String r0 = "token"
            kotlin.jvm.internal.o.LJIIIIZZ(r7, r0)
            X.PYN.LIZ = r7
            java.lang.String r0 = LIZJ(r3)
            r2.storeString(r0, r7)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYN.LJIIZILJ():java.lang.String");
    }

    public static String LIZJ(String str) {
        if (ujb.o.LJJJJJL(str)) {
            return "x-tt-cmpl-token";
        }
        return i0.LJFF("x-tt-cmpl-token_", str);
    }

    public static boolean LJIJ(String str) {
        String str2;
        if (str == null || ujb.o.LJJJJJL(str)) {
            return false;
        }
        android.net.Uri parse = UriProtector.parse(str);
        if (parse != null) {
            str2 = parse.getHost();
        } else {
            str2 = null;
        }
        List<String> hostAllowList = C64734Pas.LJIIIZ(EF7.LIZIZ()).LIZLLL(str2);
        if (str2 != null && !ujb.o.LJJJJJL(str2) && hostAllowList != null && !((CopyOnWriteArrayList) hostAllowList).isEmpty()) {
            o.LJIIIIZZ(hostAllowList, "hostAllowList");
            Iterator it = ((CopyOnWriteArrayList) hostAllowList).iterator();
            while (it.hasNext()) {
                String it2 = (String) it.next();
                o.LJIIIIZZ(it2, "it");
                if (ujb.o.LJJJJ(str2, it2, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.retrofit2.client.Request, Q] */
    @Override // X.PY9
    public final PPC<com.bytedance.retrofit2.client.Request, C64797Pbt<?>> LIZ(PPC<com.bytedance.retrofit2.client.Request, C64797Pbt<?>> ppc) {
        List<EJ6> arrayList;
        com.bytedance.retrofit2.client.Request request = ppc.LIZ;
        if (request != null) {
            String url = request.getUrl();
            if (request != null && LJIJ(url)) {
                List<EJ6> headers = request.getHeaders();
                if (headers != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (EJ6 ej6 : headers) {
                        if (!o.LJ(ej6.LIZ, "x-tt-cmpl-token")) {
                            arrayList2.add(ej6);
                        }
                    }
                    arrayList = ORZ.LLJILJILJ(arrayList2);
                } else {
                    arrayList = new ArrayList<>();
                }
                StringBuilder sb = new StringBuilder();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("login=");
                LIZ2.append(((RBX) HG3.LJIILL()).isLogin() ? 1 : 0);
                LIZ2.append(';');
                sb.append(X1D.LIZIZ(LIZ2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("ct=");
                LIZ3.append(C39257Fav.LJ() ? 1 : 0);
                LIZ3.append(';');
                sb.append(X1D.LIZIZ(LIZ3));
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("rt=");
                LIZ4.append(C39257Fav.LIZIZ());
                sb.append(X1D.LIZIZ(LIZ4));
                arrayList.add(new EJ6("x-tt-dm-status", sb.toString()));
                String LJIIZILJ = LJIIZILJ();
                if (LJIIZILJ == null || ujb.o.LJJJJJL(LJIIZILJ)) {
                    LJIJI(this, "no token", url, null, "2", 4);
                } else {
                    arrayList.add(new EJ6("x-tt-cmpl-token", LJIIZILJ));
                }
                C64908Pdg newBuilder = request.newBuilder();
                newBuilder.LIZJ = arrayList;
                ppc.LIZ = newBuilder.LIZ();
            }
        }
        return ppc;
    }

    @Override // X.PY9
    public final PPC<com.bytedance.retrofit2.client.Request, C64797Pbt<?>> LIZLLL(PPC<com.bytedance.retrofit2.client.Request, C64797Pbt<?>> ppc) {
        String str;
        C64797Pbt<?> c64797Pbt;
        List<EJ6> list;
        EJ6 ej6;
        String str2;
        com.bytedance.retrofit2.client.Request request = ppc.LIZ;
        if (request != null) {
            str = request.getUrl();
        } else {
            str = null;
        }
        if (LJIJ(str) && (c64797Pbt = ppc.LIZIZ) != null && (list = c64797Pbt.LIZ.LIZLLL) != null) {
            Iterator<EJ6> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    ej6 = it.next();
                    String str3 = ej6.LIZ;
                    o.LJIIIIZZ(str3, "it.name");
                    Locale ROOT = Locale.ROOT;
                    o.LJIIIIZZ(ROOT, "ROOT");
                    String lowerCase = str3.toLowerCase(ROOT);
                    o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (o.LJ(lowerCase, "x-tt-cmpl-token")) {
                        break;
                    }
                } else {
                    ej6 = null;
                    break;
                }
            }
            EJ6 ej62 = ej6;
            if (ej62 != null && (str2 = ej62.LIZIZ) != null && !ujb.o.LJJJJJL(str2)) {
                LIZ = str2;
                LIZIZ.storeString(LIZJ(""), str2);
            }
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJI(PPC<HttpURLConnection, InputStream> ppc) {
        String str;
        HttpURLConnection httpURLConnection = ppc.LIZ;
        if (httpURLConnection != null) {
            java.net.URL url = httpURLConnection.getURL();
            if (url != null) {
                str = url.toString();
            } else {
                str = null;
            }
            if (httpURLConnection != null && LJIJ(str)) {
                String LJIIZILJ = LJIIZILJ();
                if (LJIIZILJ == null || ujb.o.LJJJJJL(LJIIZILJ)) {
                    LJIJI(this, "no token", str, null, "3", 4);
                } else {
                    httpURLConnection.setRequestProperty("x-tt-cmpl-token", LJIIZILJ);
                }
            }
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIIJJI(PPC<HttpURLConnection, InputStream> ppc) {
        String str;
        HttpURLConnection httpURLConnection = ppc.LIZ;
        if (httpURLConnection != null) {
            java.net.URL url = httpURLConnection.getURL();
            if (url != null) {
                str = url.toString();
            } else {
                str = null;
            }
            if (httpURLConnection != null && LJIJ(str)) {
                String LJIIZILJ = LJIIZILJ();
                if (LJIIZILJ == null || ujb.o.LJJJJJL(LJIIZILJ)) {
                    LJIJI(this, "no token", str, null, "3", 4);
                } else {
                    httpURLConnection.setRequestProperty("x-tt-cmpl-token", LJIIZILJ);
                }
            }
        }
        return ppc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r3 != null) goto L7;
     */
    @Override // X.PYA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.PPC<okhttp3.Request, X.C64598PWw> LJIILLIIL(X.PPC<okhttp3.Request, X.C64598PWw> r9) {
        /*
            r8 = this;
            Q r3 = r9.LIZ
            okhttp3.Request r3 = (okhttp3.Request) r3
            r5 = 0
            if (r3 == 0) goto L2a
            X.PXy r0 = r3.url()
            if (r0 == 0) goto L55
            java.lang.String r4 = r0.LJIIIIZZ
        Lf:
            boolean r0 = LJIJ(r4)
            if (r0 == 0) goto L2a
            r2 = r8
            java.lang.String r1 = r2.LJIIZILJ()
            if (r1 == 0) goto L22
            boolean r0 = ujb.o.LJJJJJL(r1)
            if (r0 == 0) goto L2b
        L22:
            java.lang.String r3 = "no token"
            java.lang.String r6 = "4"
            r7 = 4
            LJIJI(r2, r3, r4, r5, r6, r7)
        L2a:
            return r9
        L2b:
            X.PXe r0 = r3.headers()
            if (r0 == 0) goto L37
            X.PXd r2 = r0.LJI()
            if (r2 != 0) goto L3c
        L37:
            X.PXd r2 = new X.PXd
            r2.<init>()
        L3c:
            java.lang.String r0 = "x-tt-cmpl-token"
            r2.LJ(r0, r1)
            X.PXq r1 = r3.newBuilder()
            X.PXe r0 = new X.PXe
            r0.<init>(r2)
            r1.getClass()
            X.PXd r0 = r0.LJI()
            r1.LIZJ = r0
            goto L2a
        L55:
            r4 = r5
            if (r3 == 0) goto L2a
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYN.LJIILLIIL(X.PPC):X.PPC");
    }

    public static void LJIJI(PYN pyn, String str, String str2, String str3, String str4, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        pyn.getClass();
        try {
            String uid = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().getUid();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("op", str);
            jSONObject.put("uid", uid);
            if (str2 != null) {
                jSONObject.put("url", str2);
            }
            if (str3 != null) {
                jSONObject.put("value", str3);
            }
            if (str4 != null) {
                jSONObject.put("netType", str4);
            }
            C09900aA.LJ(EnumC58731N3f.PENETRATE_HEADER_LOG.getLogType(), jSONObject);
        } catch (Exception unused) {
        }
    }
}
