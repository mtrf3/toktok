package X;

import Y.AfS21S1100000_6;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.s;
import java.util.List;
import kotlin.jvm.internal.AqS4S2101000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.EaH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36669EaH {
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.OSZ<java.lang.Integer, java.lang.String> LIZ(org.json.JSONObject r4) {
        /*
            java.lang.String r1 = "code"
            boolean r0 = r4.has(r1)
            r3 = -1
            if (r0 == 0) goto L1b
            int r3 = r4.optInt(r1, r3)
        Ld:
            if (r3 != 0) goto L28
            java.lang.String r2 = "success"
        L11:
            X.OSZ r1 = new X.OSZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.<init>(r0, r2)
            return r1
        L1b:
            java.lang.String r1 = "status_code"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L28
            int r3 = r4.optInt(r1, r3)
            goto Ld
        L28:
            java.lang.String r1 = "message"
            boolean r0 = r4.has(r1)
            java.lang.String r2 = "unknown"
            if (r0 == 0) goto L3c
            java.lang.String r2 = r4.optString(r1, r2)
            java.lang.String r0 = "jsonObject.optString(MESSAGE, errorMsg)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            goto L11
        L3c:
            java.lang.String r1 = "msg"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L4e
            java.lang.String r2 = r4.optString(r1, r2)
            java.lang.String r0 = "jsonObject.optString(MSG, errorMsg)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            goto L11
        L4e:
            java.lang.String r1 = "status_msg"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L11
            java.lang.String r2 = r4.optString(r1, r2)
            java.lang.String r0 = "jsonObject.optString(STATUS_MSG, errorMsg)"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36669EaH.LIZ(org.json.JSONObject):X.OSZ");
    }

    public static final String LIZIZ(C64797Pbt<?> c64797Pbt) {
        List<EJ6> list;
        o.LJIIIZ(c64797Pbt, "<this>");
        try {
            C36910EeA c36910EeA = c64797Pbt.LIZ;
            if (c36910EeA != null) {
                list = c36910EeA.LIZIZ("X-Tt-Logid");
            } else {
                list = null;
            }
            if (list == null || list.size() <= 0) {
                return "";
            }
            String str = ((EJ6) ListProtector.get(list, 0)).LIZIZ;
            if (str == null) {
                return "";
            }
            return str;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return "";
        }
    }

    public static final C73422Sri LIZJ(AbstractC73672Svk abstractC73672Svk, java.util.Map map) {
        o.LJIIIZ(abstractC73672Svk, "<this>");
        return abstractC73672Svk.LJIJJLI(new AfS21S1100000_6(map, 3)).LJIJJ(new AfS21S1100000_6(map, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[Catch: all -> 0x011c, CancellationException -> 0x0153, TryCatch #0 {CancellationException -> 0x0153, blocks: (B:12:0x0054, B:13:0x0057, B:15:0x005f, B:17:0x0065, B:18:0x0080, B:22:0x0088, B:24:0x008c, B:26:0x009b, B:27:0x00c7, B:29:0x00cb, B:30:0x00da, B:32:0x00de, B:36:0x00ec, B:38:0x00f0, B:39:0x00fe, B:41:0x0102, B:43:0x0116, B:61:0x0041), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0116 A[Catch: all -> 0x011c, CancellationException -> 0x0153, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0153, blocks: (B:12:0x0054, B:13:0x0057, B:15:0x005f, B:17:0x0065, B:18:0x0080, B:22:0x0088, B:24:0x008c, B:26:0x009b, B:27:0x00c7, B:29:0x00cb, B:30:0x00da, B:32:0x00de, B:36:0x00ec, B:38:0x00f0, B:39:0x00fe, B:41:0x0102, B:43:0x0116, B:61:0x0041), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object LIZLLL(java.lang.String r14, java.util.Map<java.lang.String, ? extends java.lang.Object> r15, X.InterfaceC88472Yns<? super X.InterfaceC67352kd<? super X.C64797Pbt<T>>, ? extends java.lang.Object> r16, X.InterfaceC67352kd<? super X.C64797Pbt<T>> r17) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36669EaH.LIZLLL(java.lang.String, java.util.Map, X.Yns, X.2kd):java.lang.Object");
    }

    public static void LJ(String str, int i, String str2, C64797Pbt c64797Pbt, C64799Pbv c64799Pbv, java.util.Map map, int i2) {
        String str3;
        m mVar;
        m LJJIJIL;
        j LJJIJ;
        String LJJIFFI;
        java.util.Map map2 = map;
        C64797Pbt c64797Pbt2 = c64797Pbt;
        C64799Pbv c64799Pbv2 = c64799Pbv;
        String str4 = null;
        if ((i2 & 8) != 0) {
            c64797Pbt2 = null;
        }
        if ((i2 & 16) != 0) {
            c64799Pbv2 = null;
        }
        if ((i2 & 32) != 0) {
            map2 = null;
        }
        try {
            if (c64797Pbt2 == null) {
                if (c64799Pbv2 != null) {
                    try {
                        Object LJII = C27739Aud.LJFF().LJII(c64799Pbv2.getRequestLog(), C65330PkU.LIZJ(C65352Pkq.LJI(m.class)));
                        if (!(LJII instanceof m)) {
                            LJII = null;
                        }
                        mVar = (m) LJII;
                    } catch (s unused) {
                    }
                    if (mVar != null && (LJJIJIL = mVar.LJJIJIL("base")) != null && (LJJIJ = LJJIJIL.LJJIJ("origin_url")) != null && (LJJIFFI = LJJIJ.LJJIFFI()) != null) {
                        java.net.URL url = new java.net.URL(LJJIFFI);
                        str3 = url.getPath();
                        str4 = url.getHost();
                        C76542zS.LIZJ("rd_tiktokec_network", new C36673EaL(i, str2, str3, str, str4, c64799Pbv2, c64799Pbv2.getRequestInfo(), map2));
                    }
                    str3 = null;
                    C76542zS.LIZJ("rd_tiktokec_network", new C36673EaL(i, str2, str3, str, str4, c64799Pbv2, c64799Pbv2.getRequestInfo(), map2));
                } else {
                    C76542zS.LIZJ("rd_tiktokec_network", new AqS4S2101000_4(map2, str2, i, str, 0));
                }
            } else {
                C76542zS.LIZJ("rd_tiktokec_network", new C36672EaK(i, str2, c64797Pbt2, str, c64797Pbt2.LIZ.LJFF, map2));
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
