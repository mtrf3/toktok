package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Owf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63537Owf {
    public static final C63440Ov6 LJ = new C63440Ov6();
    public final InterfaceC117594jT LIZ;
    public final InterfaceC65784Pro<C114444eO> LIZIZ;
    public final C63541Owj LIZJ;
    public volatile boolean LIZLLL;

    public C63537Owf(InterfaceC117594jT remoteFetcher) {
        C63554Oww getClientIMOptions = C63554Oww.LJLIL;
        o.LJIIIZ(remoteFetcher, "remoteFetcher");
        o.LJIIIZ(getClientIMOptions, "getClientIMOptions");
        this.LIZ = remoteFetcher;
        this.LIZIZ = getClientIMOptions;
        this.LIZJ = new C63541Owj();
    }

    public static void LIZ(C109544Rq c109544Rq, String str, Object obj) {
        if (obj == null) {
            c109544Rq.clearLocalExt(str);
        } else {
            c109544Rq.addLocalExt(str, obj.toString());
        }
    }

    public final Object LIZIZ(C63120Opw c63120Opw, C109544Rq c109544Rq, C63544Owm c63544Owm) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(c63544Owm));
        C115284fk LJIILIIL = C115284fk.LJIILIIL();
        String conversationId = c63120Opw.getConversationId();
        int value = EnumC63625Oy5.SEND_MESSAGE.getValue();
        C63446OvC c63446OvC = new C63446OvC(c109544Rq, this, c84654XKg);
        LJIILIIL.getClass();
        C115284fk.LJIL(value, c63446OvC, conversationId);
        return c84654XKg.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C63588OxU r9, X.C109544Rq r10, X.InterfaceC67352kd<? super com.bytedance.im.core.proto.SendMessageResponseBody> r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63537Owf.LIZJ(X.OxU, X.4Rq, X.2kd):java.lang.Object");
    }

    public final Object LIZLLL(C109544Rq c109544Rq, int i, C63544Owm c63544Owm) {
        this.LIZJ.LIZ.LJJIJIIJI = i;
        c109544Rq.setMsgStatus(3);
        Object LJI = XKX.LJI(C36636EZk.LIZ, new C63439Ov5(i, c109544Rq, this, null), c63544Owm);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|250|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04f7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04f8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x02cc, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x02c9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x02c7, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0029. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ae A[Catch: Exception -> 0x02c7, CancellationException -> 0x02c9, all -> 0x04f5, TRY_LEAVE, TryCatch #8 {all -> 0x04f5, blocks: (B:69:0x029c, B:71:0x02a4, B:72:0x02a8, B:158:0x02ae, B:166:0x02cd, B:168:0x02d1, B:170:0x02dc, B:171:0x02e0, B:172:0x02e7, B:174:0x02eb, B:176:0x02fb, B:178:0x0304, B:181:0x0312, B:182:0x0317, B:185:0x0323, B:187:0x0327, B:189:0x032b, B:192:0x0344, B:208:0x035f, B:209:0x0365, B:211:0x0369, B:212:0x0372, B:213:0x02f5, B:162:0x02c3, B:230:0x0299, B:232:0x02c0), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x026f A[Catch: all -> 0x0283, Exception -> 0x0286, CancellationException -> 0x0288, TryCatch #12 {CancellationException -> 0x0288, Exception -> 0x0286, all -> 0x0283, blocks: (B:64:0x0245, B:66:0x0251, B:159:0x026f), top: B:63:0x0245 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0517 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0251 A[Catch: all -> 0x0283, Exception -> 0x0286, CancellationException -> 0x0288, TryCatch #12 {CancellationException -> 0x0288, Exception -> 0x0286, all -> 0x0283, blocks: (B:64:0x0245, B:66:0x0251, B:159:0x026f), top: B:63:0x0245 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a4 A[Catch: Exception -> 0x02c7, CancellationException -> 0x02c9, all -> 0x04f5, TryCatch #8 {all -> 0x04f5, blocks: (B:69:0x029c, B:71:0x02a4, B:72:0x02a8, B:158:0x02ae, B:166:0x02cd, B:168:0x02d1, B:170:0x02dc, B:171:0x02e0, B:172:0x02e7, B:174:0x02eb, B:176:0x02fb, B:178:0x0304, B:181:0x0312, B:182:0x0317, B:185:0x0323, B:187:0x0327, B:189:0x032b, B:192:0x0344, B:208:0x035f, B:209:0x0365, B:211:0x0369, B:212:0x0372, B:213:0x02f5, B:162:0x02c3, B:230:0x0299, B:232:0x02c0), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, X.Opw] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v127 */
    /* JADX WARN: Type inference failed for: r2v128 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v79, types: [X.OxU] */
    /* JADX WARN: Type inference failed for: r2v87, types: [X.OxU] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, X.P0x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C109544Rq r20, X.C63686Oz4<com.bytedance.im.core.proto.SendMessageResponseBody> r21, X.InterfaceC67352kd<? super X.C3C5<? extends X.C109544Rq>> r22) {
        /*
            Method dump skipped, instructions count: 2038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63537Owf.LJ(X.4Rq, X.Oz4, X.2kd):java.lang.Object");
    }
}
