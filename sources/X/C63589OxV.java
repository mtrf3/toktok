package X;

import com.bytedance.im.core.proto.Response;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OxV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63589OxV implements InterfaceC117594jT {
    public final InterfaceC65784Pro<InterfaceC63292Osi> LIZ;
    public final InterfaceC65784Pro<C114444eO> LIZIZ;
    public final C63583OxP LIZJ;
    public final InterfaceC63605Oxl LIZLLL;
    public final XKW LJ;
    public final InterfaceC63617Oxx LJFF;
    public final ConcurrentHashMap<Long, InterfaceC43919HLn<Response>> LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;

    @Override // X.InterfaceC117594jT
    public final void clear() {
        this.LJI.clear();
    }

    @Override // X.InterfaceC117594jT
    public final boolean LIZJ(long j) {
        this.LJFF.reset();
        InterfaceC43919HLn<Response> interfaceC43919HLn = this.LJI.get(Long.valueOf(j));
        if (interfaceC43919HLn == null) {
            return false;
        }
        interfaceC43919HLn.LJJ(new C63599Oxf(-1035, "error ack received, most likely request timeout", null, 4, null));
        return true;
    }

    @Override // X.InterfaceC117594jT
    public final Object LIZLLL(Response response) {
        this.LJFF.reset();
        InterfaceC43919HLn<Response> interfaceC43919HLn = this.LJI.get(response.sequence_id);
        if (interfaceC43919HLn == null) {
            return Boolean.FALSE;
        }
        if (C73994T2g.LJJI(response)) {
            interfaceC43919HLn.LJ(response);
        } else {
            LJI(response);
            C63599Oxf.Companion.getClass();
            interfaceC43919HLn.LJJ(C63598Oxe.LIZ(response));
        }
        return Boolean.TRUE;
    }

    public final void LJI(Response response) {
        int intValue;
        Integer responseCode = response.status_code;
        int i = AbstractC63551Owt.LIZIZ;
        if (responseCode == null || responseCode.intValue() != i) {
            int i2 = AbstractC63551Owt.LIZJ;
            if (responseCode == null || responseCode.intValue() != i2) {
                return;
            }
        }
        InterfaceC63292Osi invoke = this.LIZ.invoke();
        Integer num = response.cmd;
        if (num == null) {
            intValue = -1;
        } else {
            intValue = num.intValue();
        }
        o.LJIIIIZZ(responseCode, "responseCode");
        invoke.LJI(intValue, responseCode.intValue());
    }

    @Override // X.InterfaceC117594jT
    public final Response LIZ(String str, byte[] bArr) {
        try {
            return this.LIZLLL.LJFF(str, bArr);
        } catch (C63616Oxw e) {
            this.LIZJ.getClass();
            C63337OtR.LJ("RemoteFetcherLogger decode", e);
            C63323OtD c63323OtD = new C63323OtD();
            c63323OtD.LIZJ("imsdk_network_request");
            c63323OtD.LIZ("-1", "imsdk_cmd");
            c63323OtD.LIZ("unknown", "url_path");
            c63323OtD.LIZ(0, "imsdk_result");
            c63323OtD.LIZ("-1", "seq_id");
            c63323OtD.LIZ("-1", "duration");
            String message = e.getMessage();
            if (message == null) {
                message = "decode failed";
            }
            c63323OtD.LIZ(message, "error_msg");
            c63323OtD.LIZ(Integer.valueOf(e.getErrorCode()), "error_code");
            c63323OtD.LIZ(C63337OtR.LIZIZ(e), "error_stack");
            c63323OtD.LIZ(C63337OtR.LIZ(e), "error_name");
            c63323OtD.LIZ("ws", "net_type");
            c63323OtD.LIZLLL();
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|(1:(1:(4:11|12|13|14)(2:17|18))(6:19|20|21|(2:23|24)|13|14))(3:25|(1:70)(1:29)|(12:31|32|33|34|(1:36)(1:64)|37|(1:39)(1:63)|40|(1:42)|43|44|(2:55|(1:(1:58)(2:59|60))(2:61|62))(2:51|(1:53)(6:54|20|21|(0)|13|14)))(2:68|69))))|73|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019c, code lost:
    
        r14 = r15;
        r15 = r0;
        r10.LJLJJL++;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.Throwable, X.2kd] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x018d -> B:13:0x0193). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C63588OxU r19, X.InterfaceC67352kd<? super X.C63675Oyt> r20) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63589OxV.LJ(X.OxU, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x001c. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f6 A[Catch: all -> 0x021e, TryCatch #16 {all -> 0x021e, blocks: (B:34:0x01a2, B:36:0x01ac, B:40:0x01bd, B:44:0x01ed, B:45:0x01f5, B:46:0x01f6), top: B:33:0x01a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022a A[Catch: all -> 0x026e, TRY_LEAVE, TryCatch #5 {all -> 0x026e, blocks: (B:55:0x0222, B:57:0x022a, B:60:0x0234, B:66:0x0259, B:67:0x026d), top: B:54:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0259 A[Catch: all -> 0x026e, TRY_ENTER, TryCatch #5 {all -> 0x026e, blocks: (B:55:0x0222, B:57:0x022a, B:60:0x0234, B:66:0x0259, B:67:0x026d), top: B:54:0x0222 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // X.InterfaceC117594jT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C63588OxU r11, boolean r12, X.InterfaceC67352kd<? super X.C63675Oyt> r13) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63589OxV.LIZIZ(X.OxU, boolean, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[Catch: IOException -> 0x0096, Oxo -> 0x0098, TryCatch #3 {Oxo -> 0x0098, IOException -> 0x0096, blocks: (B:11:0x004e, B:12:0x0051, B:14:0x0057, B:16:0x005d, B:19:0x0068, B:20:0x0080, B:21:0x0081, B:22:0x0095), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081 A[Catch: IOException -> 0x0096, Oxo -> 0x0098, TryCatch #3 {Oxo -> 0x0098, IOException -> 0x0096, blocks: (B:11:0x004e, B:12:0x0051, B:14:0x0057, B:16:0x005d, B:19:0x0068, B:20:0x0080, B:21:0x0081, B:22:0x0095), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C63588OxU r11, X.C63606Oxm r12, X.InterfaceC67352kd<? super X.C63675Oyt> r13) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63589OxV.LJII(X.OxU, X.Oxm, X.2kd):java.lang.Object");
    }

    public C63589OxV(C63401OuT clientBridge, C63402OuU clientIMOptions, C63583OxP c63583OxP, C78565UsT c78565UsT) {
        XIA ioDispatcher = C78613UtF.LIZJ;
        C63596Oxc c63596Oxc = new C63596Oxc(0);
        o.LJIIIZ(clientBridge, "clientBridge");
        o.LJIIIZ(clientIMOptions, "clientIMOptions");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LIZ = clientBridge;
        this.LIZIZ = clientIMOptions;
        this.LIZJ = c63583OxP;
        this.LIZLLL = c78565UsT;
        this.LJ = ioDispatcher;
        this.LJFF = c63596Oxc;
        this.LJI = new ConcurrentHashMap<>(50);
        this.LJII = C221108m2.LIZIZ(new AqS160S0100000_10(this, 585));
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 584));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006a -> B:11:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C84657XKj r18, X.C63588OxU r19, X.C63597Oxd r20, X.InterfaceC67352kd r21) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63589OxV.LJFF(X.XKj, X.OxU, X.Oxd, X.2kd):java.lang.Object");
    }
}
