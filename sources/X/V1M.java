package X;

import Y.ARunnableS0S6411000_11;
import Y.IDeS152S0200000_13;
import Y.IDeS360S0100000_1;
import android.graphics.Paint;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.InteractTextStructWrap;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.tools.mvtemplate.net.ImageResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS14S0000100_2;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class V1M implements InterfaceC78896Uxo, InterfaceC48038ItG, InterfaceC29074Bb4 {
    public static long LJLIL = 0;
    public static long LJLILLLLZI = 0;
    public static int LJLJI = 0;
    public static boolean LJLJJI = true;
    public static int LJLJJL;
    public static int LJLJL;
    public static final V1M LJLJJLL = new V1M();
    public static final V1M LJLJLJ = new V1M();

    public static final String LJJJJZ(boolean z) {
        return z ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static final String LJJJJZI(int i) {
        return i == 0 ? "server" : "pitaya";
    }

    @Override // X.InterfaceC78896Uxo
    public V8O Xk() {
        return V8O.LJ.Xk();
    }

    public static final C79863Bm LIZLLL(C33R c33r) {
        return new C79863Bm(c33r, null);
    }

    public static final C79793Bf LJFF(InterfaceC88471Ynr interfaceC88471Ynr) {
        return new C79793Bf(interfaceC88471Ynr, MBB.INSTANCE, -2, XKI.SUSPEND);
    }

    public static final String LJIIIZ(CreativeInfo creativeInfo) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        InterfaceC171126nc pathAdapter = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(System.currentTimeMillis());
        LIZ.append("-pin.json");
        return pathAdapter.LJJLIIIJ(creativeInfo, X1D.LIZIZ(LIZ));
    }

    public static final InterfaceC65462ha LJIIJJI(InterfaceC65462ha interfaceC65462ha) {
        if (interfaceC65462ha instanceof InterfaceC71762rk) {
            return interfaceC65462ha;
        }
        Object obj = V1X.LIZ;
        V1V v1v = V1X.LIZIZ;
        if (interfaceC65462ha instanceof V1N) {
            V1N v1n = (V1N) interfaceC65462ha;
            if (v1n.LJLILLLLZI == obj && v1n.LJLJI == v1v) {
                return interfaceC65462ha;
            }
        }
        return new V1N(interfaceC65462ha);
    }

    public static File LJIJ(String str) {
        File file = new File(str);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return file;
    }

    public static File LJIJI(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static final String LJIJJ(List list) {
        boolean z;
        int i = 0;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TextStickerTextWrap) obj).isValid()) {
                arrayList.add(obj);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        if (arrayList.size() > 1) {
            int size = arrayList.size() - 2;
            if (size >= 0) {
                while (true) {
                    sb.append(((TextStickerTextWrap) ListProtector.get(arrayList, i)).safeStrPair().first);
                    sb.append("\n");
                    if (i == size) {
                        break;
                    }
                    i++;
                }
            }
            sb.append(((TextStickerTextWrap) ListProtector.get(arrayList, arrayList.size() - 1)).safeStrPair().first);
        } else {
            sb.append(((TextStickerTextWrap) ListProtector.get(arrayList, 0)).safeStrPair().first);
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "result.toString()");
        return sb2;
    }

    public static final Object LJIJJLI(InterfaceC39071g7 interfaceC39071g7) {
        InterfaceC274715z interfaceC274715z;
        o.LJIIIZ(interfaceC39071g7, "<this>");
        Object LJIIJJI = interfaceC39071g7.LJIIJJI();
        if (!(LJIIJJI instanceof InterfaceC274715z) || (interfaceC274715z = (InterfaceC274715z) LJIIJJI) == null) {
            return null;
        }
        return interfaceC274715z.getLayoutId();
    }

    public static File LJJI(File file) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(file.getAbsolutePath());
        String str = File.separator;
        LIZ.append(str);
        LIZ.append("dns_dump");
        File LJIJI = LJIJI(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJIJI.getAbsolutePath());
        LIZ2.append(str);
        LIZ2.append(System.currentTimeMillis());
        return LJIJ(X1D.LIZIZ(LIZ2));
    }

    public static final Double LJJIFFI(AnoleComponentAppearModel anoleComponentAppearModel) {
        Object obj;
        Double d;
        java.util.Map<String, Object> params = anoleComponentAppearModel.getParams();
        if (params != null) {
            obj = params.get("speed");
        } else {
            obj = null;
        }
        if (!(obj instanceof Double) || (d = (Double) obj) == null) {
            return null;
        }
        double doubleValue = d.doubleValue();
        if (!o.LJ(anoleComponentAppearModel.getType(), "shake") || doubleValue <= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return null;
        }
        return Double.valueOf(doubleValue);
    }

    public static final String LJJIII(List list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append(((TextStickerTextWrap) it.next()).getText());
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public static final boolean LJJIIZI(YKR ykr) {
        String str;
        o.LJIIIZ(ykr, "<this>");
        TextStickerData data = ykr.getData();
        if (data != null) {
            str = data.getType();
        } else {
            str = null;
        }
        return o.LJ(str, "type_text_sticker");
    }

    public static final boolean LJJIJIIJI(List list) {
        for (Object obj : list) {
            if (((TextStickerTextWrap) obj).isValid()) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static final double LJJIJL(long j) {
        double currentTimeMillis = (System.currentTimeMillis() - j) / 86400000;
        StringBuilder LIZJ = V10.LIZJ("DraftEditHelper -> sinceFirstSaveTime: saveTime = ", j, "; time = ");
        LIZJ.append(currentTimeMillis);
        LIZJ.append('}');
        H78.LIZ(X1D.LIZIZ(LIZJ));
        return currentTimeMillis;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
    
        if (r2 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJJIL(java.lang.Throwable r4) {
        /*
            r0 = 0
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L25
            r3.<init>()     // Catch: java.lang.Throwable -> L25
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L25
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L25
            r4.printStackTrace(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.Throwable r1 = r4.getCause()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L20
            r1.printStackTrace(r2)     // Catch: java.lang.Throwable -> L26
            java.lang.Throwable r1 = r1.getCause()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L20
            r1.printStackTrace(r2)     // Catch: java.lang.Throwable -> L26
        L20:
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L26
            goto L28
        L25:
            r2 = r0
        L26:
            if (r2 == 0) goto L2b
        L28:
            r2.close()
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1M.LJJIL(java.lang.Throwable):java.lang.String");
    }

    public static final String LJJJLIIL(int i) {
        C17N.LJIIJ(16);
        String l = Long.toString(i & 4294967295L, 16);
        o.LJIIIIZZ(l, "toString(this, checkRadix(radix))");
        return l;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r1 == '+') goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJJLL(java.lang.String r14) {
        /*
            r9 = 10
            X.C17N.LJIIJ(r9)
            int r8 = r14.length()
            if (r8 != 0) goto L19
        Lb:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = "Invalid number format: '"
            r0 = 39
            java.lang.String r0 = X.C0F0.LIZLLL(r1, r14, r0)
            r2.<init>(r0)
            throw r2
        L19:
            r10 = 0
            char r1 = r14.charAt(r10)
            r0 = 48
            int r0 = kotlin.jvm.internal.o.LJIIJJI(r1, r0)
            if (r0 >= 0) goto L2e
            r7 = 1
            if (r8 == r7) goto Lb
            r0 = 43
            if (r1 == r0) goto L2f
            goto Lb
        L2e:
            r7 = 0
        L2f:
            r6 = 119304647(0x71c71c7, float:1.1769572E-34)
            r2 = 119304647(0x71c71c7, float:1.1769572E-34)
        L35:
            if (r7 >= r8) goto L76
            char r0 = r14.charAt(r7)
            int r13 = java.lang.Character.digit(r0, r9)
            if (r13 >= 0) goto L42
            goto Lb
        L42:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r10 ^ r12
            r0 = r2 ^ r12
            int r0 = kotlin.jvm.internal.o.LJIIJJI(r11, r0)
            if (r0 <= 0) goto L65
            if (r2 != r6) goto Lb
            r0 = -1
            long r4 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r0 = (long) r9
            long r2 = r2 & r0
            long r4 = r4 / r2
            int r2 = (int) r4
            r0 = r2 ^ r12
            int r0 = kotlin.jvm.internal.o.LJIIJJI(r11, r0)
            if (r0 <= 0) goto L65
            goto Lb
        L65:
            int r1 = r10 * 10
            int r13 = r13 + r1
            r0 = r13 ^ r12
            r1 = r1 ^ r12
            int r0 = kotlin.jvm.internal.o.LJIIJJI(r0, r1)
            if (r0 >= 0) goto L72
            goto Lb
        L72:
            int r7 = r7 + 1
            r10 = r13
            goto L35
        L76:
            X.OQc r0 = new X.OQc
            r0.<init>(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1M.LJJJLL(java.lang.String):void");
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        o.LJIIIZ(it, "it");
        ImageResponse imageResponse = new ImageResponse();
        imageResponse.status_code = -1;
        return imageResponse;
    }

    public static void LIZIZ(java.util.Map map, C64246PJi c64246PJi) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
                c64246PJi.LJIIJJI("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public static final Object LJII(InterfaceC65462ha interfaceC65462ha, InterfaceC67352kd interfaceC67352kd) {
        Object collect = interfaceC65462ha.collect(C79773Bd.LJLIL, interfaceC67352kd);
        if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return collect;
        }
        return C76800UCe.LIZ;
    }

    public static final InterfaceC65462ha LJIIJ(InterfaceC65462ha interfaceC65462ha, long j) {
        if (j >= 0) {
            if (j == 0) {
                return interfaceC65462ha;
            }
            return new IDeS360S0100000_1(new C3CC(null, new AqS14S0000100_2(j, 7), interfaceC65462ha), 0);
        }
        "Debounce timeout should not be negative".toString();
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.3BS, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIILIIL(X.InterfaceC65462ha r7, X.InterfaceC67352kd r8) {
        /*
            boolean r0 = r8 instanceof X.V1Q
            if (r0 == 0) goto L22
            r6 = r8
            X.V1Q r6 = (X.V1Q) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r5 = r6.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2e
            Y.IDfS126S0100000_1 r2 = r6.LJLILLLLZI
            X.2mC r3 = r6.LJLIL
            goto L28
        L22:
            X.V1Q r6 = new X.V1Q
            r6.<init>(r8)
            goto L12
        L28:
            X.C141335gf.LIZJ(r5)     // Catch: X.C3CM -> L2c
            goto L59
        L2c:
            r1 = move-exception
            goto L53
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.2mC r3 = X.C793239k.LIZ(r5)
            X.3BS r0 = X.C94103mg.LIZ
            r3.element = r0
            Y.IDfS126S0100000_1 r2 = new Y.IDfS126S0100000_1
            r0 = 23
            r2.<init>(r3, r0)
            r6.LJLIL = r3     // Catch: X.C3CM -> L52
            r6.LJLILLLLZI = r2     // Catch: X.C3CM -> L52
            r6.LJLJJI = r1     // Catch: X.C3CM -> L52
            java.lang.Object r0 = r7.collect(r2, r6)     // Catch: X.C3CM -> L52
            if (r0 != r4) goto L59
            goto L5f
        L52:
            r1 = move-exception
        L53:
            X.2gJ r0 = r1.getOwner()
            if (r0 != r2) goto L68
        L59:
            T r4 = r3.element
            X.3BS r0 = X.C94103mg.LIZ
            if (r4 == r0) goto L60
        L5f:
            return r4
        L60:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Expected at least one element"
            r1.<init>(r0)
            throw r1
        L68:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1M.LJIILIIL(X.2ha, X.2kd):java.lang.Object");
    }

    public static final IDeS360S0100000_1 LJIILLIIL(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC65462ha interfaceC65462ha) {
        return new IDeS360S0100000_1(new IDeS152S0200000_13(interfaceC88471Ynr, interfaceC65462ha, 0), 9);
    }

    public static final InterfaceC65462ha LJIIZILJ(XKW xkw, InterfaceC65462ha interfaceC65462ha) {
        if (xkw.get(InterfaceC79150V4o.LJJJJJ) == null) {
            if (o.LJ(xkw, MBB.INSTANCE)) {
                return interfaceC65462ha;
            }
            if (interfaceC65462ha instanceof InterfaceC79903Bq) {
                return C79913Br.LIZ((InterfaceC79903Bq) interfaceC65462ha, xkw, 0, null, 6);
            }
            return new C3BZ(interfaceC65462ha, xkw, 0, null, 12);
        }
        String LJIILLIIL = o.LJIILLIIL(xkw, "Flow context cannot contain job in it. Had ");
        LJIILLIIL.toString();
        throw new IllegalArgumentException(LJIILLIIL);
    }

    public static String LJIL(File file, boolean z) {
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(file.getAbsolutePath());
            String str = File.separator;
            LIZ.append(str);
            LIZ.append("local_dump");
            File LJIJI = LJIJI(X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJIJI.getAbsolutePath());
            LIZ2.append(str);
            LIZ2.append(System.currentTimeMillis());
            return LJIJ(X1D.LIZIZ(LIZ2)).getAbsolutePath();
        }
        return null;
    }

    public static String LJJ(String str, String... strArr) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        C276216o c276216o = C276216o.LJIIL;
        String LIZ = c276216o.LIZ().LIZ(str);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("key is ");
        LIZ2.append(str);
        LIZ2.append(" value is ");
        LIZ2.append(LIZ);
        X1D.LIZIZ(LIZ2);
        if (LIZ != null && LIZ.contains("{the_field}") && strArr.length > 0) {
            return LIZ.replace("{the_field}", c276216o.LIZ().LIZ(strArr[0]));
        }
        return LIZ;
    }

    public static String LJJII(int i, StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (i < stackTraceElementArr.length) {
            PKW.LJFF(stackTraceElementArr[i], sb);
            i++;
        }
        return sb.toString();
    }

    public static String LJJIIJZLJL(File file, boolean z) {
        if (z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(file.getAbsolutePath());
            String str = File.separator;
            LIZ.append(str);
            LIZ.append("dns_trace");
            File LJIJI = LJIJI(X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJIJI.getAbsolutePath());
            LIZ2.append(str);
            LIZ2.append(System.currentTimeMillis());
            return LJIJ(X1D.LIZIZ(LIZ2)).getAbsolutePath();
        }
        return null;
    }

    public static boolean LJJIIZ(String str, List list) {
        if (!C38354F3m.LJ(str) && !C32151Nz.LJJIIJZLJL(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (!C38354F3m.LJ(str2) && str.endsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJJIJ(int i, List list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((InteractTextStructWrap) next).isValid(i)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final XKQ LJJIJIIJIL(InterfaceC65462ha interfaceC65462ha, InterfaceC70422pa interfaceC70422pa) {
        return XKX.LIZLLL(interfaceC70422pa, null, null, new C65492hd(interfaceC65462ha, null), 3);
    }

    public static final InterfaceC07790Sh LJJIJIL(C1M1 c1m1, Object obj) {
        o.LJIIIZ(c1m1, "<this>");
        return new C536728t(obj);
    }

    public static void LJJIZ(String str, List list) {
        if (C38354F3m.LJ(str) || list == null) {
            return;
        }
        for (String str2 : str.split(",")) {
            if (!C38354F3m.LJ(str2) && !LJJIIZ(str2, list)) {
                list.add(str2.trim());
            }
        }
    }

    public static void LJJJJI(C35979EAd c35979EAd, InterfaceC37216Ej6 interfaceC37216Ej6) {
        if (c35979EAd != null && c35979EAd.LJFF() > 0) {
            java.util.Map LIZJ = c35979EAd.LIZJ();
            Collection values = LIZJ.values();
            synchronized (LIZJ) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    List<InterfaceC37216Ej6> list = ((C65019PfT) it.next()).LJIIIIZZ;
                    if (list != null && !list.contains(interfaceC37216Ej6)) {
                        list.add(interfaceC37216Ej6);
                    }
                }
            }
        }
    }

    public static void LJJJJIZL(C35979EAd c35979EAd, InterfaceC37216Ej6 interfaceC37216Ej6) {
        if (c35979EAd != null && c35979EAd.LJFF() > 0) {
            java.util.Map LIZJ = c35979EAd.LIZJ();
            Collection values = LIZJ.values();
            synchronized (LIZJ) {
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    List<InterfaceC37216Ej6> list = ((C65019PfT) it.next()).LJIIIIZZ;
                    if (list != null) {
                        list.remove(interfaceC37216Ej6);
                    }
                }
            }
        }
    }

    public static final void LJJJJJ(InterfaceC56316M8i interfaceC56316M8i, boolean z) {
        o.LJIIIZ(interfaceC56316M8i, "<this>");
        interfaceC56316M8i.LJII().set(z);
        interfaceC56316M8i.LJFF().set(z);
        interfaceC56316M8i.LJ().LJIIJJI(Boolean.valueOf(z));
        InterfaceC88472Yns<Boolean, C76800UCe> LIZIZ = interfaceC56316M8i.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.invoke(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r6.collect(r1, r5) == r4) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.3BS, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJJJJJL(X.InterfaceC65462ha r6, X.InterfaceC67352kd r7) {
        /*
            boolean r0 = r7 instanceof X.V1S
            if (r0 == 0) goto L43
            r5 = r7
            X.V1S r5 = (X.V1S) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 != r3) goto L51
            X.2mC r2 = r5.LJLIL
            X.C141335gf.LIZJ(r1)
        L22:
            T r4 = r2.element
            X.3BS r0 = X.C94103mg.LIZ
            if (r4 == r0) goto L49
        L28:
            return r4
        L29:
            X.2mC r2 = X.C793239k.LIZ(r1)
            X.3BS r0 = X.C94103mg.LIZ
            r2.element = r0
            Y.IDfS126S0100000_1 r1 = new Y.IDfS126S0100000_1
            r0 = 25
            r1.<init>(r2, r0)
            r5.LJLIL = r2
            r5.LJLJI = r3
            java.lang.Object r0 = r6.collect(r1, r5)
            if (r0 != r4) goto L22
            goto L28
        L43:
            X.V1S r5 = new X.V1S
            r5.<init>(r7)
            goto L12
        L49:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Flow is empty"
            r1.<init>(r0)
            throw r1
        L51:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1M.LJJJJJL(X.2ha, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.3BS, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJJJJL(X.InterfaceC65462ha r7, X.InterfaceC67352kd r8) {
        /*
            boolean r0 = r8 instanceof X.V1R
            if (r0 == 0) goto L22
            r6 = r8
            X.V1R r6 = (X.V1R) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r5 = r6.LJLJI
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r4 = 1
            if (r0 == 0) goto L36
            if (r0 != r4) goto L2e
            Y.IDfS126S0100000_1 r2 = r6.LJLILLLLZI
            X.2mC r3 = r6.LJLIL
            goto L28
        L22:
            X.V1R r6 = new X.V1R
            r6.<init>(r8)
            goto L12
        L28:
            X.C141335gf.LIZJ(r5)     // Catch: X.C3CM -> L2c
            goto L59
        L2c:
            r1 = move-exception
            goto L53
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.2mC r3 = X.C793239k.LIZ(r5)
            X.3BS r0 = X.C94103mg.LIZ
            r3.element = r0
            Y.IDfS126S0100000_1 r2 = new Y.IDfS126S0100000_1
            r0 = 26
            r2.<init>(r3, r0)
            r6.LJLIL = r3     // Catch: X.C3CM -> L52
            r6.LJLILLLLZI = r2     // Catch: X.C3CM -> L52
            r6.LJLJJI = r4     // Catch: X.C3CM -> L52
            java.lang.Object r0 = r7.collect(r2, r6)     // Catch: X.C3CM -> L52
            if (r0 != r1) goto L59
            goto L60
        L52:
            r1 = move-exception
        L53:
            X.2gJ r0 = r1.getOwner()
            if (r0 != r2) goto L61
        L59:
            T r1 = r3.element
            X.3BS r0 = X.C94103mg.LIZ
            if (r1 != r0) goto L60
            r1 = 0
        L60:
            return r1
        L61:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1M.LJJJJL(X.2ha, X.2kd):java.lang.Object");
    }

    public static final V1Z LJJJJLL(InterfaceC65462ha interfaceC65462ha, int i) {
        if (i > 0) {
            return new V1Z(interfaceC65462ha, i);
        }
        String LIZIZ = C0NY.LIZIZ("Requested element count ", i, " should be positive");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public static final C3BY LJJJLZIJ(InterfaceC65462ha interfaceC65462ha, InterfaceC88473Ynt interfaceC88473Ynt) {
        return new C3BY(interfaceC88473Ynt, interfaceC65462ha, MBB.INSTANCE, -2, XKI.SUSPEND);
    }

    public static final void LJJJZ(String str, ByteBuffer byteBuffer) {
        if (str == null || byteBuffer == null) {
            return;
        }
        FileChannel fileChannel = null;
        try {
            fileChannel = new FileOutputStream(str).getChannel();
            fileChannel.write(byteBuffer);
        } catch (Exception unused) {
            if (fileChannel == null) {
                return;
            }
        } catch (Throwable th) {
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
        fileChannel.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DraftFileSaveException LJJL(String str, String content) {
        o.LJIIIZ(content, "content");
        byte[] bytes = content.getBytes(PVC.LIZ);
        o.LJIIIIZZ(bytes, "this as java.lang.String).getBytes(charset)");
        int length = bytes.length;
        File file = new File(C43075GvP.LIZJ);
        C78966Uyw.LJJJJLL(file);
        long LJIJI = C38891fp.LJIJI(file.getAbsolutePath());
        StringBuilder LIZJ = C06490Nh.LIZJ("filePath: ", str, ", availableBytes: ", LJIJI);
        LIZJ.append(", contentLength: ");
        LIZJ.append(length);
        String LIZIZ = X1D.LIZIZ(LIZJ);
        if (LJIJI < length) {
            return new DraftFileSaveException(-553, new C249309qQ(LIZIZ));
        }
        C39579Fg7.LJJI(str, content);
        return new DraftFileSaveException(0, null, 3, 0 == true ? 1 : 0);
    }

    public static InterfaceC65462ha LJ(InterfaceC65462ha interfaceC65462ha, int i, int i2) {
        XKI xki;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = -2;
        }
        if ((i2 & 2) != 0) {
            xki = XKI.SUSPEND;
        } else {
            xki = null;
        }
        if (i3 < 0 && i3 != -2) {
            if (i3 == -1) {
                if (xki == XKI.SUSPEND) {
                    xki = XKI.DROP_OLDEST;
                    i3 = 0;
                } else {
                    "CONFLATED capacity cannot be used with non-default onBufferOverflow".toString();
                    throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
                }
            } else {
                String LJIILLIIL = o.LJIILLIIL(Integer.valueOf(i3), "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ");
                LJIILLIIL.toString();
                throw new IllegalArgumentException(LJIILLIIL);
            }
        }
        if (interfaceC65462ha instanceof InterfaceC79903Bq) {
            return C79913Br.LIZ((InterfaceC79903Bq) interfaceC65462ha, null, i3, xki, 1);
        }
        return new C3BZ(interfaceC65462ha, null, i3, xki, 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJI(X.InterfaceC67352kd r6, X.InterfaceC65462ha r7, X.InterfaceC64672gJ r8) {
        /*
            boolean r0 = r6 instanceof X.C63018OoI
            if (r0 == 0) goto L20
            r5 = r6
            X.OoI r5 = (X.C63018OoI) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 != r4) goto L2c
            X.2mC r3 = r5.LJLIL
            goto L26
        L20:
            X.OoI r5 = new X.OoI
            r5.<init>(r6)
            goto L12
        L26:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Throwable -> L2a
            goto L77
        L2a:
            r2 = move-exception
            goto L4a
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.2mC r3 = X.C793239k.LIZ(r1)
            Y.IDfS26S0200000_13 r1 = new Y.IDfS26S0200000_13     // Catch: java.lang.Throwable -> L49
            r0 = 4
            r1.<init>(r8, r3, r0)     // Catch: java.lang.Throwable -> L49
            r5.LJLIL = r3     // Catch: java.lang.Throwable -> L49
            r5.LJLJI = r4     // Catch: java.lang.Throwable -> L49
            java.lang.Object r0 = r7.collect(r1, r5)     // Catch: java.lang.Throwable -> L49
            if (r0 != r2) goto L77
            goto L78
        L49:
            r2 = move-exception
        L4a:
            T r0 = r3.element
            if (r0 == 0) goto L55
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 == 0) goto L55
        L54:
            throw r2
        L55:
            X.MBA r1 = r5.getContext()
            X.3T3 r0 = X.InterfaceC79150V4o.LJJJJJ
            X.MBD r1 = r1.get(r0)
            X.V4o r1 = (X.InterfaceC79150V4o) r1
            if (r1 == 0) goto L78
            boolean r0 = r1.isCancelled()
            if (r0 != 0) goto L6a
            goto L78
        L6a:
            java.util.concurrent.CancellationException r0 = r1.LJJIIJ()
            if (r0 == 0) goto L78
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 == 0) goto L78
            goto L54
        L77:
            r2 = 0
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1M.LJI(X.2kd, X.2ha, X.2gJ):java.lang.Object");
    }

    public static final Object LJIIIIZZ(InterfaceC65462ha interfaceC65462ha, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC67352kd interfaceC67352kd) {
        Object LJII = LJII(LJ(LJJJLZIJ(interfaceC65462ha, new C64442fw(interfaceC88471Ynr, null)), 0, 2), interfaceC67352kd);
        if (LJII == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJII;
        }
        return C76800UCe.LIZ;
    }

    public static final Object LJIIL(InterfaceC67352kd interfaceC67352kd, InterfaceC65462ha interfaceC65462ha, InterfaceC64672gJ interfaceC64672gJ) {
        if (!(interfaceC64672gJ instanceof C79953Bv)) {
            Object collect = interfaceC65462ha.collect(interfaceC64672gJ, interfaceC67352kd);
            if (collect == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return collect;
            }
            return C76800UCe.LIZ;
        }
        throw ((C79953Bv) interfaceC64672gJ).LJLIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.3BS, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIILJJIL(X.InterfaceC71762rk r7, X.InterfaceC88471Ynr r8, X.InterfaceC67352kd r9) {
        /*
            boolean r0 = r9 instanceof X.V1O
            if (r0 == 0) goto L24
            r6 = r9
            X.V1O r6 = (X.V1O) r6
            int r2 = r6.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r6.LJLJJL = r2
        L12:
            java.lang.Object r5 = r6.LJLJJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJL
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2e
            Y.IDfS26S0200000_13 r2 = r6.LJLJI
            X.2mC r3 = r6.LJLILLLLZI
            X.Ynr r8 = r6.LJLIL
            goto L2a
        L24:
            X.V1O r6 = new X.V1O
            r6.<init>(r9)
            goto L12
        L2a:
            X.C141335gf.LIZJ(r5)     // Catch: X.C3CM -> L55
            goto L5c
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.2mC r3 = X.C793239k.LIZ(r5)
            X.3BS r0 = X.C94103mg.LIZ
            r3.element = r0
            Y.IDfS26S0200000_13 r2 = new Y.IDfS26S0200000_13
            r0 = 2
            r2.<init>(r8, r3, r0)
            r6.LJLIL = r8     // Catch: X.C3CM -> L53
            r6.LJLILLLLZI = r3     // Catch: X.C3CM -> L53
            r6.LJLJI = r2     // Catch: X.C3CM -> L53
            r6.LJLJJL = r1     // Catch: X.C3CM -> L53
            java.lang.Object r0 = r7.collect(r2, r6)     // Catch: X.C3CM -> L53
            if (r0 != r4) goto L5c
            goto L62
        L53:
            r1 = move-exception
            goto L56
        L55:
            r1 = move-exception
        L56:
            X.2gJ r0 = r1.getOwner()
            if (r0 != r2) goto L6f
        L5c:
            T r4 = r3.element
            X.3BS r0 = X.C94103mg.LIZ
            if (r4 == r0) goto L63
        L62:
            return r4
        L63:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = "Expected at least one element matching the predicate "
            java.lang.String r0 = kotlin.jvm.internal.o.LJIILLIIL(r8, r0)
            r1.<init>(r0)
            throw r1
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1M.LJIILJJIL(X.2rk, X.Ynr, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJIILL(X.InterfaceC71762rk r7, X.InterfaceC88471Ynr r8, X.InterfaceC67352kd r9) {
        /*
            boolean r0 = r9 instanceof X.V1P
            if (r0 == 0) goto L22
            r6 = r9
            X.V1P r6 = (X.V1P) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r5 = r6.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 != r1) goto L2e
            Y.IDfS26S0200000_13 r2 = r6.LJLILLLLZI
            X.2mC r3 = r6.LJLIL
            goto L28
        L22:
            X.V1P r6 = new X.V1P
            r6.<init>(r9)
            goto L12
        L28:
            X.C141335gf.LIZJ(r5)     // Catch: X.C3CM -> L2c
            goto L54
        L2c:
            r1 = move-exception
            goto L4e
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.2mC r3 = X.C793239k.LIZ(r5)
            Y.IDfS26S0200000_13 r2 = new Y.IDfS26S0200000_13
            r0 = 3
            r2.<init>(r8, r3, r0)
            r6.LJLIL = r3     // Catch: X.C3CM -> L4d
            r6.LJLILLLLZI = r2     // Catch: X.C3CM -> L4d
            r6.LJLJJI = r1     // Catch: X.C3CM -> L4d
            java.lang.Object r0 = r7.collect(r2, r6)     // Catch: X.C3CM -> L4d
            if (r0 != r4) goto L54
            goto L56
        L4d:
            r1 = move-exception
        L4e:
            X.2gJ r0 = r1.getOwner()
            if (r0 != r2) goto L57
        L54:
            T r4 = r3.element
        L56:
            return r4
        L57:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.V1M.LJIILL(X.2rk, X.Ynr, X.2kd):java.lang.Object");
    }

    @Override // X.InterfaceC29074Bb4
    public void LIZ(ActivityC45651qj activity, C29930Bos c29930Bos, BNE bne) {
        if (C4LD.LIZIZ.LJJIJL()) {
            ShareService shareService = C4LD.LIZ;
            o.LJIIIIZZ(activity, "activity");
            shareService.LJIIJ(activity, c29930Bos, bne);
        } else {
            ShareService shareService2 = C4LD.LIZ;
            o.LJIIIIZZ(activity, "activity");
            C16880lQ.LIZ(shareService2.LJI(activity, c29930Bos, bne));
        }
    }

    public static final int LJJIIJ(Paint paint, String str, int i, int i2) {
        o.LJIIIZ(paint, "<this>");
        if (str == null || str.length() == 0 || i < 0 || i2 > str.length() || i >= i2) {
            return 0;
        }
        String substring = str.substring(i, i2);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        int length = substring.length();
        paint.getTextWidths(substring, new float[length]);
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            i3 += (int) Math.ceil(r4[i4]);
        }
        return i3;
    }

    public static final void LJJIJLIJ(int i, String pageType, String enterFrom, String str) {
        o.LJIIIZ(pageType, "pageType");
        o.LJIIIZ(enterFrom, "enterFrom");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_method", str);
        c145995oB.LIZ(i, "draft_cnt");
        c145995oB.LJI("enter_from", enterFrom);
        c145995oB.LJI("page_type", pageType);
        FMX.LJIIL("delete_drafts", c145995oB.LIZ);
    }

    public static final C79863Bm LJJJJLI(InterfaceC65462ha interfaceC65462ha, InterfaceC70422pa interfaceC70422pa, C3BD c3bd, Object obj) {
        V1U v1u;
        AbstractC79813Bh abstractC79813Bh;
        InterfaceC65462ha dropChannelOperators;
        InterfaceC78936UyS.LIZ.getClass();
        if ((interfaceC65462ha instanceof AbstractC79813Bh) && (dropChannelOperators = (abstractC79813Bh = (AbstractC79813Bh) interfaceC65462ha).dropChannelOperators()) != null) {
            if (abstractC79813Bh.capacity != -3) {
            }
            v1u = new V1U(abstractC79813Bh.context, dropChannelOperators);
        } else {
            v1u = new V1U(MBB.INSTANCE, interfaceC65462ha);
        }
        XLM LIZ = V8H.LIZ(obj);
        return new C79863Bm(LIZ, XKX.LIZLLL(interfaceC70422pa, v1u.LIZIZ, null, new C3BC(c3bd, v1u.LIZ, LIZ, obj, null), 2));
    }

    public static final void LIZJ(byte[] src, int i, int i2, byte[] dest, int i3) {
        o.LJIIJ(src, "src");
        o.LJIIJ(dest, "dest");
        System.arraycopy(src, i, dest, i2, i3);
    }

    public static void LJJJ(Throwable th, String str, boolean z, java.util.Map map, String str2) {
        try {
            LJJJJ(null, th, null, 0, str, z, map, C16880lQ.LLLLIIIILLL(), "EnsureNotReachHere", str2);
        } catch (Throwable unused) {
        }
    }

    public static void LJJJI(String str, String str2, String str3, String str4, Throwable th) {
        String str5 = str4;
        if (!PKZ.LIZ) {
            C78685UuP.LJJJLL();
            LJJJIL(0, null, str, str2, str3, null, "EnsureNotReachHere", str5, th, null, true, null);
            return;
        }
        if (TextUtils.isEmpty(str5)) {
            str5 = "core_exception_monitor";
        }
        Object obj = PJV.LIZIZ;
        String LIZ = PJV.LIZ(obj);
        if (PJ9.LJFF.get(LIZ) != null) {
            if (!PJA.LJIIIZ(obj, str5)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("exception has been discard due to not sampled: ");
                LIZ2.append(str5);
                X1D.LIZIZ(LIZ2);
                C78685UuP.LJJJLL();
                return;
            }
            if (!PJA.LJII(obj, str)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("exception has been discard due to not sampled message: ");
                LIZ3.append(str);
                X1D.LIZIZ(LIZ3);
                C78685UuP.LJJJLL();
                return;
            }
            boolean LIZ4 = C64250PJm.LJI().LIZ(r3.LJ, "exception", false);
            C64250PJm.LJ(LIZ4);
            if (!LIZ4) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("exception has been discard due to exceed limit: ");
                LIZ5.append(str5);
                LIZ5.append(" msg: ");
                LIZ5.append(str);
                X1D.LIZIZ(LIZ5);
                C78685UuP.LJLILLLLZI();
                return;
            }
            C64214PIc.LIZ().LIZ(new ARunnableS0S6411000_11(obj, str3, str, str2, str5, th, 1));
            return;
        }
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("npth config is not init:");
        LIZ6.append((Object) null);
        LIZ6.append(" ");
        LIZ6.append(LIZ);
        X1D.LIZIZ(LIZ6);
        C78685UuP.LJJJLL();
        LJJJIL(0, null, str, str2, str3, null, "EnsureNotReachHere", str5, th, null, true, null);
    }

    public static void LJJJJ(Object obj, Throwable th, StackTraceElement[] stackTraceElementArr, int i, String str, boolean z, java.util.Map map, Thread thread, String str2, String str3) {
        LJJJIL(i, obj, str, thread.getName(), null, null, str2, str3, th, map, z, stackTraceElementArr);
    }

    public static void LJJJIL(int i, Object obj, String str, String str2, String str3, String str4, String str5, String str6, Throwable th, java.util.Map map, boolean z, StackTraceElement[] stackTraceElementArr) {
        String str7 = str6;
        if (TextUtils.isEmpty(str7)) {
            str7 = "core_exception_monitor";
        }
        if (!PKZ.LIZ && LJLJL >= 100) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("exception has been discard due to exceed limit before Npth.init: ");
            LIZ.append(str7);
            X1D.LIZIZ(LIZ);
            C78685UuP.LJJJLL();
            return;
        }
        LJLJL++;
        if (PJ9.LJFF.get(PJV.LIZ(obj)) != null && 1 != 0) {
            if (!PJA.LJIIIZ(obj, str7)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("exception has been discard due to not sampled: ");
                LIZ2.append(str7);
                X1D.LIZIZ(LIZ2);
                C78685UuP.LJJJLL();
                return;
            }
            if (!PJA.LJII(obj, str)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("exception has been discard due to not sampled message: ");
                LIZ3.append(str);
                X1D.LIZIZ(LIZ3);
                C78685UuP.LJJJLL();
                return;
            }
        }
        if (PKZ.LIZ) {
            boolean LIZ4 = C64250PJm.LJI().LIZ(r3.LJ, "exception", false);
            C64250PJm.LJ(LIZ4);
            if (!LIZ4) {
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("exception has been discard due to exceed limit: ");
                LIZ5.append(str7);
                LIZ5.append(" msg: ");
                LIZ5.append(str);
                X1D.LIZIZ(LIZ5);
                C78685UuP.LJLILLLLZI();
                return;
            }
        }
        C64214PIc.LIZ().LIZ(new ARunnableS0S6411000_11(i, obj, str3, str4, str, str2, str7, str5, th, map, z, stackTraceElementArr, 0));
    }
}
