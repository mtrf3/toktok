package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.retrofit2.client.Request;
import defpackage.i0;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.EaM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36674EaM extends AbstractC65781Prl implements InterfaceC88472Yns<java.util.Map<String, Object>, C76800UCe> {
    public final /* synthetic */ C76732zl LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ Request LJLJI;
    public final /* synthetic */ C64797Pbt<?> LJLJJI;
    public final /* synthetic */ Object LJLJJL;
    public final /* synthetic */ Object LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36674EaM(C76732zl c76732zl, C68322mC<String> c68322mC, Request request, C64797Pbt<?> c64797Pbt, Object obj, Object obj2) {
        super(1);
        this.LJLIL = c76732zl;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = request;
        this.LJLJJI = c64797Pbt;
        this.LJLJJL = obj;
        this.LJLJJLL = obj2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(java.util.Map<String, Object> map) {
        List<EJ6> list;
        Object LIZ;
        java.util.Map<String, Object> sendLog = map;
        o.LJIIIZ(sendLog, "$this$sendLog");
        String LIZ2 = C85990Xow.LIZ();
        Locale locale = Locale.ROOT;
        Object lowerCase = LIZ2.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        sendLog.put("priority_region", lowerCase);
        String str = C64707PaR.LIZJ;
        o.LJIIIIZZ(str, "getUserRegion()");
        Object lowerCase2 = str.toLowerCase(locale);
        o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        sendLog.put("store_region", lowerCase2);
        sendLog.put("error_code", Integer.valueOf(this.LJLIL.element));
        String errorMsg = this.LJLILLLLZI.element;
        o.LJIIIZ(errorMsg, "errorMsg");
        if (errorMsg.length() > 500) {
            errorMsg = errorMsg.substring(0, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
            o.LJIIIIZZ(errorMsg, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        sendLog.put("error_msg", errorMsg);
        Object path = this.LJLJI.getPath();
        o.LJIIIIZZ(path, "request.path");
        sendLog.put("path", path);
        sendLog.put("page_name", "interceptor");
        Object host = this.LJLJI.getHost();
        o.LJIIIIZZ(host, "request.host");
        sendLog.put("host", host);
        C64797Pbt<?> c64797Pbt = this.LJLJJI;
        if (c64797Pbt != null) {
            sendLog.put("log_id", C51029K0z.LJJIII(c64797Pbt));
            C64797Pbt<?> c64797Pbt2 = this.LJLJJI;
            o.LJIIIZ(c64797Pbt2, "<this>");
            C36910EeA c36910EeA = c64797Pbt2.LIZ;
            if (c36910EeA != null) {
                list = c36910EeA.LIZIZ("Server-Timing");
            } else {
                list = null;
            }
            long j = -1;
            if (list != null && list.size() > 0) {
                String serverTiming = ((EJ6) ListProtector.get(list, 0)).LIZIZ;
                o.LJIIIIZZ(serverTiming, "serverTiming");
                int LJJLIIIJL = s.LJJLIIIJL(serverTiming, "inner", 0, false, 6);
                if (LJJLIIIJL != -1) {
                    String substring = serverTiming.substring(LJJLIIIJL);
                    o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                    int LJJLIIIJL2 = s.LJJLIIIJL(substring, "dur=", 0, false, 6) + LJJLIIIJL + 4;
                    int length = serverTiming.length();
                    int LJJLIIIJ = s.LJJLIIIJ(serverTiming);
                    if (LJJLIIIJL2 <= LJJLIIIJ) {
                        int i = LJJLIIIJL2;
                        while (Character.isDigit(serverTiming.charAt(i))) {
                            if (i != LJJLIIIJ) {
                                i++;
                            }
                        }
                        length = i;
                    }
                    try {
                        String substring2 = serverTiming.substring(LJJLIIIJL2, length);
                        o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                        LIZ = Long.valueOf(CastLongProtector.parseLong(substring2));
                        C3C5.m7constructorimpl(LIZ);
                    } catch (Throwable th) {
                        LIZ = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ);
                    }
                    if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                        C78983UzD.LJIIZILJ(new RuntimeException(i0.LJFF("serverTiming: ", serverTiming)));
                    }
                    if (C3C5.m12isFailureimpl(LIZ)) {
                        LIZ = -1L;
                    }
                    j = ((Number) LIZ).longValue();
                }
            }
            sendLog.put("inner_cost", Long.valueOf(j));
        }
        Object obj = this.LJLJJL;
        if (obj != null) {
            sendLog.put("biz_type", obj);
        }
        Object obj2 = this.LJLJJLL;
        if (obj2 instanceof C64672PZs) {
            sendLog.put("duration", Long.valueOf(((C64668PZo) obj2).LJIILLIIL));
            sendLog.put("receive_byte", Long.valueOf(((C64668PZo) this.LJLJJLL).LJIJ));
            sendLog.put("dns_cost", Long.valueOf(((C64668PZo) this.LJLJJLL).LJIIIZ));
            sendLog.put("ssl_cost", Long.valueOf(((C64668PZo) this.LJLJJLL).LJIIJJI));
            sendLog.put("connect_cost", Long.valueOf(((C64668PZo) this.LJLJJLL).LJIIJ));
            sendLog.put("receive_cost", Long.valueOf(((C64668PZo) this.LJLJJLL).LJIILIIL));
            sendLog.put("send_cost", Long.valueOf(((C64668PZo) this.LJLJJLL).LJIIL));
            sendLog.put("ttfb_cost", Long.valueOf(((C64668PZo) this.LJLJJLL).LJIILL));
            sendLog.put("is_socket_reused", Integer.valueOf(((C64668PZo) this.LJLJJLL).LJIILJJIL ? 1 : 0));
        }
        return C76800UCe.LIZ;
    }
}
