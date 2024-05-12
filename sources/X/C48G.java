package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.QueryDataComponent;
import kotlin.jvm.internal.o;

/* renamed from: X.48G, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C48G {
    public static final C48G LIZ = new C48G();

    public static String LIZIZ(C109544Rq c109544Rq) {
        C98523to c98523to;
        C99033ud c99033ud = C3Y4.LIZLLL;
        if ((c99033ud instanceof C98523to) && (c98523to = (C98523to) c99033ud) != null && c98523to.isTCM()) {
            return "tcm";
        }
        if (c109544Rq.getConversationType() == AbstractC63505Ow9.LIZIZ) {
            return "group";
        }
        if (C93793mB.LJIIL(c109544Rq)) {
            return "tikbot";
        }
        return "private";
    }

    public static String LIZLLL(C109544Rq c109544Rq) {
        String localExtValue = c109544Rq.getLocalExtValue("enter_from");
        if (o.LJ(c109544Rq.getLocalExt().get("message_type"), "ttFarm")) {
            return localExtValue;
        }
        String LIZJ = LIZJ(c109544Rq, "enter_from");
        if (LIZJ != null) {
            return LIZJ;
        }
        if (localExtValue == null) {
            localExtValue = C3Y4.LIZJ("enter_from", null);
        }
        C3Y4.LJ("enter_from", localExtValue);
        return localExtValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070 A[Catch: Exception -> 0x0131, TryCatch #0 {Exception -> 0x0131, blocks: (B:2:0x0000, B:4:0x000f, B:6:0x001e, B:7:0x0022, B:11:0x0035, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:18:0x0054, B:20:0x005a, B:24:0x0070, B:25:0x007a, B:27:0x0081, B:29:0x0085, B:31:0x008d, B:33:0x0091, B:34:0x0095, B:36:0x009f, B:38:0x00a3, B:40:0x00a7, B:41:0x00ab, B:43:0x00b2, B:45:0x00b6, B:47:0x00be, B:49:0x00c5, B:51:0x00c9, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:60:0x00d2, B:61:0x0119, B:63:0x011f, B:67:0x0127, B:78:0x0109, B:79:0x00ef, B:81:0x0101, B:82:0x0105), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e0 A[Catch: Exception -> 0x0131, TryCatch #0 {Exception -> 0x0131, blocks: (B:2:0x0000, B:4:0x000f, B:6:0x001e, B:7:0x0022, B:11:0x0035, B:13:0x003d, B:15:0x0041, B:17:0x0045, B:18:0x0054, B:20:0x005a, B:24:0x0070, B:25:0x007a, B:27:0x0081, B:29:0x0085, B:31:0x008d, B:33:0x0091, B:34:0x0095, B:36:0x009f, B:38:0x00a3, B:40:0x00a7, B:41:0x00ab, B:43:0x00b2, B:45:0x00b6, B:47:0x00be, B:49:0x00c5, B:51:0x00c9, B:53:0x00d6, B:54:0x00da, B:56:0x00e0, B:60:0x00d2, B:61:0x0119, B:63:0x011f, B:67:0x0127, B:78:0x0109, B:79:0x00ef, B:81:0x0101, B:82:0x0105), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C109544Rq r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48G.LIZ(X.4Rq, java.util.Map):void");
    }

    public static String LIZJ(C109544Rq c109544Rq, String str) {
        BaseRequestComponent LLLL;
        QueryDataComponent queryDataComponent;
        java.util.Map<String, String> map;
        BaseTemplate LJIILL = C1DJ.LJIILL(c109544Rq);
        if (LJIILL != null && (LLLL = LJIILL.LLLL()) != null && (queryDataComponent = LLLL.queryData) != null && (map = queryDataComponent.extras) != null) {
            return map.get(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C109544Rq r17, X.C48M r18, X.InterfaceC67352kd<? super java.util.Map<java.lang.String, java.lang.String>> r19) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48G.LJI(X.4Rq, X.48M, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d8, code lost:
    
        if (r1.length() == 0) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C109544Rq r14, X.C48M r15, boolean r16, X.InterfaceC67352kd<? super java.util.Map<java.lang.String, java.lang.String>> r17) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48G.LJ(X.4Rq, X.48M, boolean, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(long r12, X.C109544Rq r14, X.C48M r15, X.InterfaceC67352kd<? super java.util.Map<java.lang.String, java.lang.String>> r16) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48G.LJII(long, X.4Rq, X.48M, X.2kd):java.lang.Object");
    }

    public static /* synthetic */ Object LJFF(C48G c48g, C109544Rq c109544Rq, C48M c48m, InterfaceC67352kd interfaceC67352kd, int i) {
        if ((i & 2) != 0) {
            c48m = new C84843Uq();
        }
        return c48g.LJ(c109544Rq, c48m, false, interfaceC67352kd);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(50:1|(2:3|(48:5|6|(1:(1:9)(2:143|144))(2:145|(1:147)(1:148))|10|(3:12|(1:14)(1:16)|15)|17|(1:19)|20|(1:24)|25|26|(1:28)|29|30|(1:32)|33|(2:35|(1:39))|40|(3:42|(4:45|(3:47|48|49)(1:51)|50|43)|52)|53|(1:55)|56|(1:58)(1:139)|59|(21:133|(1:135)(2:136|(1:138))|64|65|66|67|(1:129)(1:69)|70|(1:126)(1:76)|77|(3:79|(2:82|(2:84|(1:86)(2:87|(1:89))))|81)|90|(2:92|(1:98))|99|(1:101)|102|(5:104|(1:106)(1:113)|107|(1:111)|112)|114|(3:116|(1:122)(1:120)|121)|123|124)|61|(1:63)|64|65|66|67|(17:127|129|70|(1:72)|126|77|(0)|90|(0)|99|(0)|102|(0)|114|(0)|123|124)|69|70|(0)|126|77|(0)|90|(0)|99|(0)|102|(0)|114|(0)|123|124))|149|6|(0)(0)|10|(0)|17|(0)|20|(2:22|24)|25|26|(0)|29|30|(0)|33|(0)|40|(0)|53|(0)|56|(0)(0)|59|(0)|61|(0)|64|65|66|67|(0)|69|70|(0)|126|77|(0)|90|(0)|99|(0)|102|(0)|114|(0)|123|124) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01ab, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01ac, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00c9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00ca, code lost:
    
        X.C3C5.m7constructorimpl(X.C141335gf.LIZ(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:26:0x00a5, B:28:0x00c0, B:29:0x00c5), top: B:25:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.C109544Rq r15, X.C48N r16, X.C48M r17, X.InterfaceC75532xp r18, X.InterfaceC67352kd<? super X.C76800UCe> r19) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48G.LJIIIIZZ(X.4Rq, X.48N, X.48M, X.2xp, X.2kd):java.lang.Object");
    }
}
