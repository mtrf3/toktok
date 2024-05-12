package X;

import Y.ARunnableS2S1400000_9;
import android.text.TextUtils;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.google.android.play.core.appupdate.u;
import java.io.InputStream;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Xyj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86597Xyj {
    public static final C86597Xyj LIZ = new C86597Xyj();

    static {
        C16880lQ.LJLLJ(C86597Xyj.class);
    }

    public static LinkedHashMap LIZIZ(InterfaceC78280Uns interfaceC78280Uns) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC78280Uns != null) {
            UFL LIZ2 = interfaceC78280Uns.LIZ();
            while (LIZ2.hasNextKey()) {
                String nextKey = LIZ2.nextKey();
                String LJJIJIL = u.LJJIJIL(interfaceC78280Uns, nextKey, "");
                if (LJJIJIL.length() > 0) {
                    linkedHashMap.put(nextKey, LJJIJIL);
                }
            }
        }
        return linkedHashMap;
    }

    public static void LIZLLL(C86624XzA c86624XzA, InterfaceC53758L7y interfaceC53758L7y) {
        String LJJJJJ = c86624XzA.LJJJJJ();
        if (LJJJJJ != null && LJJJJJ.length() > 0) {
            if (!LJ(interfaceC53758L7y, c86624XzA.LJJJJI(), c86624XzA.LJJJI(), c86624XzA.LJJJIL(), c86624XzA.LJJJJ())) {
                LJI(interfaceC53758L7y, c86624XzA.LJJJJI(), c86624XzA.LJJJI(), LJJJJJ, c86624XzA.LJLILLLLZI);
                return;
            }
            return;
        }
        if (!LJ(interfaceC53758L7y, c86624XzA.LJJJJI(), c86624XzA.LJJJI(), c86624XzA.LJJJIL(), c86624XzA.LJJJJ())) {
            LJI(interfaceC53758L7y, c86624XzA.LJJJJI(), c86624XzA.LJJJI(), null, c86624XzA.LJLILLLLZI);
        }
    }

    public static String LIZ(String url, InterfaceC78280Uns interfaceC78280Uns, EnumC37847EtH type) {
        String str;
        o.LJIIJ(url, "url");
        o.LJIIJ(type, "type");
        EZO ezo = new EZO(url);
        if (interfaceC78280Uns != null) {
            UFL LIZ2 = interfaceC78280Uns.LIZ();
            while (LIZ2.hasNextKey()) {
                String nextKey = LIZ2.nextKey();
                InterfaceC78505UrV interfaceC78505UrV = interfaceC78280Uns.get(nextKey);
                switch (C78514Ure.LIZIZ[interfaceC78505UrV.getType().ordinal()]) {
                    case 1:
                        ezo.LIZ(nextKey, String.valueOf(interfaceC78505UrV.asInt()));
                        break;
                    case 2:
                        ezo.LIZ(nextKey, String.valueOf(interfaceC78505UrV.asDouble()));
                        break;
                    case 3:
                        ezo.LIZ(nextKey, interfaceC78505UrV.asString());
                        break;
                    case 4:
                        ezo.LIZ(nextKey, String.valueOf(interfaceC78505UrV.asBoolean()));
                        break;
                    case 5:
                        InterfaceC78280Uns asMap = interfaceC78505UrV.asMap();
                        if (asMap != null) {
                            String jSONObject = C78501UrR.LIZIZ(asMap).toString();
                            o.LJFF(jSONObject, "XReadableJSONUtils.xRead…lue.asMap()!!).toString()");
                            ezo.LIZ(nextKey, jSONObject);
                            break;
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                    case 6:
                        InterfaceC78502UrS asArray = interfaceC78505UrV.asArray();
                        if (asArray != null) {
                            String jSONArray = C78501UrR.LIZ(asArray).toString();
                            o.LJFF(jSONArray, "XReadableJSONUtils.xRead…e.asArray()!!).toString()");
                            ezo.LIZ(nextKey, jSONArray);
                            break;
                        } else {
                            o.LJIIZILJ();
                            throw null;
                        }
                }
            }
        }
        if (type == EnumC37847EtH.WEB) {
            str = "h5";
        } else if (type == EnumC37847EtH.LYNX) {
            str = "lynx";
        } else {
            str = "";
        }
        ezo.LIZ("request_tag_from", str);
        return ezo.LIZIZ();
    }

    public static boolean LJ(InterfaceC53758L7y interfaceC53758L7y, Integer num, Integer num2, String str, Throwable th) {
        String str2 = str;
        if (th == null && TextUtils.isEmpty(str2)) {
            return false;
        }
        if ((str2 == null || str2.length() <= 0) && (th == null || (str2 = th.getMessage()) == null)) {
            str2 = "";
        }
        VFS.LIZ().post(new ARunnableS2S1400000_9(interfaceC53758L7y, num, num2, str2, th, 1));
        return true;
    }

    public static void LJFF(String str, String str2, InterfaceC86629XzF interfaceC86629XzF, C86623Xz9 c86623Xz9, C86602Xyo c86602Xyo) {
        byte[] LJFF;
        InputStream LLLLZLLIL = c86623Xz9.LLLLZLLIL();
        if (LLLLZLLIL == null || (LJFF = C62848OlY.LJFF(LLLLZLLIL)) == null) {
            if (!LJ(c86602Xyo, Integer.valueOf(c86623Xz9.LJLILLLLZI.element), Integer.valueOf(c86623Xz9.LJLJI.element), c86623Xz9.LLLLZ(), c86623Xz9.LLLLZIL())) {
                LJI(c86602Xyo, Integer.valueOf(c86623Xz9.LJLILLLLZI.element), Integer.valueOf(c86623Xz9.LJLJI.element), null, c86623Xz9.LJLIL);
            }
        } else if (!LJ(c86602Xyo, Integer.valueOf(c86623Xz9.LJLILLLLZI.element), Integer.valueOf(c86623Xz9.LJLJI.element), c86623Xz9.LLLLZ(), c86623Xz9.LLLLZIL())) {
            JSONObject LIZJ = interfaceC86629XzF.LIZJ(str, LJFF, str2);
            VFS.LIZ().post(new RunnableC53757L7x(c86602Xyo, Integer.valueOf(c86623Xz9.LJLILLLLZI.element), Integer.valueOf(c86623Xz9.LJLJI.element), c86623Xz9.LJLIL, LIZJ));
        }
    }

    public static void LJI(InterfaceC53758L7y interfaceC53758L7y, Integer num, Integer num2, String str, LinkedHashMap linkedHashMap) {
        VFS.LIZ().post(new ARunnableS2S1400000_9(linkedHashMap, interfaceC53758L7y, num, str, num2, 2));
    }

    public static void LIZJ(String targetUrl, java.util.Map map, boolean z, Boolean bool, InterfaceC53758L7y interfaceC53758L7y, IHostNetworkDepend iHostNetworkDepend) {
        boolean z2;
        o.LJIIJ(targetUrl, "targetUrl");
        EZA eza = new EZA(targetUrl);
        eza.LIZ = (LinkedHashMap) map;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        eza.LIZIZ = z2;
        eza.LIZJ = z;
        EZ9 ez9 = EZ9.LIZ;
        EZC ezc = EZC.GET;
        ez9.getClass();
        LIZLLL(EZ9.LJ(ezc, eza, iHostNetworkDepend), interfaceC53758L7y);
    }

    public static void LJII(String targetUrl, LinkedHashMap linkedHashMap, LinkedHashMap postFilePart, java.util.Map map, C86595Xyh c86595Xyh, IHostNetworkDepend iHostNetworkDepend) {
        o.LJIIJ(targetUrl, "targetUrl");
        o.LJIIJ(postFilePart, "postFilePart");
        EZA eza = new EZA(targetUrl);
        eza.LIZ = linkedHashMap;
        eza.LJI = postFilePart;
        eza.LIZLLL = map;
        eza.LIZIZ = true;
        LIZLLL(eza.LIZ(iHostNetworkDepend), c86595Xyh);
    }

    public static void LJIIIZ(String targetUrl, java.util.Map map, String str, boolean z, Boolean bool, byte[] bArr, InterfaceC53758L7y interfaceC53758L7y, IHostNetworkDepend iHostNetworkDepend) {
        boolean z2;
        o.LJIIJ(targetUrl, "targetUrl");
        try {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.putAll(map);
            EZA eza = new EZA(targetUrl);
            eza.LIZ = linkedHashMap;
            eza.LJFF = str;
            if (bool == null) {
                z2 = true;
            } else {
                z2 = bool.booleanValue();
            }
            eza.LIZIZ = z2;
            eza.LJ = bArr;
            eza.LIZJ = z;
            LIZLLL(eza.LIZ(iHostNetworkDepend), interfaceC53758L7y);
        } catch (Throwable unused) {
        }
    }

    public static void LJIIJ(String targetUrl, java.util.Map map, String str, boolean z, Boolean bool, byte[] bArr, InterfaceC86633XzJ interfaceC86633XzJ, IHostNetworkDepend iHostNetworkDepend) {
        boolean z2;
        o.LJIIJ(targetUrl, "targetUrl");
        try {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.putAll(map);
            EZA eza = new EZA(targetUrl);
            eza.LIZ = linkedHashMap;
            eza.LJFF = str;
            if (bool == null) {
                z2 = true;
            } else {
                z2 = bool.booleanValue();
            }
            eza.LIZIZ = z2;
            eza.LJ = bArr;
            eza.LIZJ = z;
            EZ9 ez9 = EZ9.LIZ;
            EZC ezc = EZC.POST;
            ez9.getClass();
            interfaceC86633XzJ.LIZ(EZ9.LIZLLL(ezc, eza, iHostNetworkDepend));
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(java.lang.String r7, java.util.Map r8, java.lang.String r9, boolean r10, java.lang.Boolean r11, org.json.JSONObject r12, X.InterfaceC53758L7y r13, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend r14, java.lang.Integer r15) {
        /*
            java.lang.String r0 = "targetUrl"
            kotlin.jvm.internal.o.LJIIJ(r7, r0)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lc4
            r3.<init>()     // Catch: java.lang.Throwable -> Lc4
            r3.putAll(r8)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "application/json"
            boolean r0 = kotlin.jvm.internal.o.LJ(r9, r0)     // Catch: java.lang.Throwable -> Lc4
            r4 = 1
            if (r0 == 0) goto L72
            java.lang.String r5 = "(this as java.lang.String).getBytes(charset)"
            java.lang.String r2 = "Charset.forName(charsetName)"
            java.lang.String r6 = "UTF-8"
            if (r15 != 0) goto L20
        L1e:
            r1 = 0
            goto L47
        L20:
            int r0 = r15.intValue()     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto L30
            r1 = 2
            if (r15 != 0) goto L2a
            goto L1e
        L2a:
            int r0 = r15.intValue()     // Catch: java.lang.Throwable -> Lc4
            if (r0 != r1) goto L51
        L30:
            java.lang.String r1 = r12.toString()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "postData.toString()"
            kotlin.jvm.internal.o.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lc4
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.Throwable -> Lc4
            kotlin.jvm.internal.o.LJFF(r0, r2)     // Catch: java.lang.Throwable -> Lc4
            byte[] r1 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> Lc4
            kotlin.jvm.internal.o.LJFF(r1, r5)     // Catch: java.lang.Throwable -> Lc4
        L47:
            X.EZA r0 = new X.EZA     // Catch: java.lang.Throwable -> Lc4
            r0.<init>(r7)     // Catch: java.lang.Throwable -> Lc4
            r0.LIZ = r3     // Catch: java.lang.Throwable -> Lc4
            r0.LJFF = r9     // Catch: java.lang.Throwable -> Lc4
            goto L6f
        L51:
            int r0 = r15.intValue()     // Catch: java.lang.Throwable -> Lc4
            if (r0 != r4) goto L1e
            java.lang.String r1 = r12.toString(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "postData.toString(2)"
            kotlin.jvm.internal.o.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lc4
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r6)     // Catch: java.lang.Throwable -> Lc4
            kotlin.jvm.internal.o.LJFF(r0, r2)     // Catch: java.lang.Throwable -> Lc4
            byte[] r1 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> Lc4
            kotlin.jvm.internal.o.LJFF(r1, r5)     // Catch: java.lang.Throwable -> Lc4
            goto L47
        L6f:
            if (r11 == 0) goto Lb7
            goto Lb3
        L72:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> Lc4
            r5.<init>()     // Catch: java.lang.Throwable -> Lc4
            java.util.Iterator r6 = r12.keys()     // Catch: java.lang.Throwable -> Lc4
        L7b:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> Lc4
            if (r0 == 0) goto L9b
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = ""
            java.lang.String r1 = r12.optString(r2, r0)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "key"
            kotlin.jvm.internal.o.LJFF(r2, r0)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r0 = "value"
            kotlin.jvm.internal.o.LJFF(r1, r0)     // Catch: java.lang.Throwable -> Lc4
            r5.put(r2, r1)     // Catch: java.lang.Throwable -> Lc4
            goto L7b
        L9b:
            X.EZA r0 = new X.EZA     // Catch: java.lang.Throwable -> Lc4
            r0.<init>(r7)     // Catch: java.lang.Throwable -> Lc4
            r0.LIZ = r3     // Catch: java.lang.Throwable -> Lc4
            r0.LIZLLL = r5     // Catch: java.lang.Throwable -> Lc4
            if (r11 == 0) goto Laa
            boolean r4 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lc4
        Laa:
            r0.LIZIZ = r4     // Catch: java.lang.Throwable -> Lc4
            r0.LIZJ = r10     // Catch: java.lang.Throwable -> Lc4
            X.XzA r0 = r0.LIZ(r14)     // Catch: java.lang.Throwable -> Lc4
            goto Lc1
        Lb3:
            boolean r4 = r11.booleanValue()     // Catch: java.lang.Throwable -> Lc4
        Lb7:
            r0.LIZIZ = r4     // Catch: java.lang.Throwable -> Lc4
            r0.LIZJ = r10     // Catch: java.lang.Throwable -> Lc4
            r0.LJ = r1     // Catch: java.lang.Throwable -> Lc4
            X.XzA r0 = r0.LIZ(r14)     // Catch: java.lang.Throwable -> Lc4
        Lc1:
            LIZLLL(r0, r13)     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86597Xyj.LJIIIIZZ(java.lang.String, java.util.Map, java.lang.String, boolean, java.lang.Boolean, org.json.JSONObject, X.L7y, com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend, java.lang.Integer):void");
    }

    public static void LJIIJJI(String channel, String dataMessage, String targetUrl, java.util.Map map, String str, boolean z, Boolean bool, byte[] bArr, C86602Xyo c86602Xyo, IHostNetworkDepend iHostNetworkDepend, InterfaceC86629XzF interfaceC86629XzF) {
        boolean z2;
        o.LJIIJ(channel, "channel");
        o.LJIIJ(dataMessage, "dataMessage");
        o.LJIIJ(targetUrl, "targetUrl");
        try {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.putAll(map);
            EZA eza = new EZA(targetUrl);
            eza.LIZ = linkedHashMap;
            eza.LJFF = str;
            if (bool == null) {
                z2 = true;
            } else {
                z2 = bool.booleanValue();
            }
            eza.LIZIZ = z2;
            eza.LJ = bArr;
            eza.LIZJ = z;
            EZ9 ez9 = EZ9.LIZ;
            EZC ezc = EZC.POST;
            ez9.getClass();
            LJFF(channel, dataMessage, interfaceC86629XzF, EZ9.LIZLLL(ezc, eza, iHostNetworkDepend), c86602Xyo);
        } catch (Throwable unused) {
        }
    }
}
