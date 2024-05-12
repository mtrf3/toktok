package X;

import com.bytedance.keva.Keva;
import fjb.a;
import java.util.concurrent.ConcurrentHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.performance.IMTxtMsgCountHelper$reportTxtMsgCount$1", f = "IMTxtMsgCountHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80933Fp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;

    public C80933Fp(InterfaceC67352kd<? super C80933Fp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C80933Fp c80933Fp = new C80933Fp(interfaceC67352kd);
        c80933Fp.LJLIL = obj;
        return c80933Fp;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Object obj2 = this.LJLIL;
        if (!C80973Ft.LIZ) {
            return C76800UCe.LIZ;
        }
        long LIZIZ = C36L.LIZIZ();
        ConcurrentHashMap<Long, Keva> concurrentHashMap = C80953Fr.LIZIZ;
        Long l = new Long(LIZIZ);
        Keva keva = concurrentHashMap.get(l);
        if (keva == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("im_text_msg_count");
            LIZ.append(LIZIZ);
            keva = Keva.getRepo(X1D.LIZIZ(LIZ));
            Keva putIfAbsent = concurrentHashMap.putIfAbsent(l, keva);
            if (putIfAbsent != null) {
                keva = putIfAbsent;
            }
        }
        Keva keva2 = keva;
        synchronized (obj2) {
            long j = keva2.getLong("key_timestamp", -1L);
            long currentTimeMillis = System.currentTimeMillis();
            C98453th c98453th = C80953Fr.LIZJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("preTimestamp ");
            LIZ2.append(j);
            LIZ2.append(", curTimestamp ");
            LIZ2.append(currentTimeMillis);
            c98453th.LIZ(X1D.LIZIZ(LIZ2));
            if (Math.abs(currentTimeMillis - j) < 86400000) {
                return C76800UCe.LIZ;
            }
            keva2.storeLong("key_timestamp", currentTimeMillis);
            C85323Wm LIZ3 = C772831o.LIZ();
            C96423qQ.LIZ();
            long LJIILL = C4Z2.LJIILL(new int[]{7});
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("txtMsgCount ");
            LIZ4.append(LJIILL);
            c98453th.LIZ(X1D.LIZIZ(LIZ4));
            C65864Pt6 c65864Pt6 = new C65864Pt6();
            c65864Pt6.put("msg_count", String.valueOf(LJIILL));
            c65864Pt6.build();
            LIZ3.LIZIZ("im_msg_count", c65864Pt6);
            return C76800UCe.LIZ;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
