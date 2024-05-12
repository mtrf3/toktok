package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMConvLoadAnalytics$tryReportInboxPerf$1", f = "IMConvLoadAnalytics.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Jv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82033Jv extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C82033Jv(InterfaceC67352kd<? super C82033Jv> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C82033Jv(interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C68322mC LIZ = C793239k.LIZ(obj);
        C68322mC c68322mC = new C68322mC();
        C68322mC c68322mC2 = new C68322mC();
        C68322mC c68322mC3 = new C68322mC();
        HashMap<String, C3JY> hashMap = C3K5.LJLL;
        synchronized (hashMap) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(EnumC82443Lk.SECONDARY);
            LIZ2.append('_');
            LIZ2.append(EnumC82403Lg.ALL);
            LIZ.element = hashMap.get(X1D.LIZIZ(LIZ2));
            StringBuilder LIZ3 = X1D.LIZ();
            EnumC82443Lk enumC82443Lk = EnumC82443Lk.PRIMARY;
            LIZ3.append(enumC82443Lk);
            LIZ3.append('_');
            LIZ3.append(EnumC82403Lg.UNREAD);
            c68322mC.element = hashMap.get(X1D.LIZIZ(LIZ3));
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(enumC82443Lk);
            LIZ4.append('_');
            LIZ4.append(EnumC82403Lg.FOLLOWING);
            c68322mC2.element = hashMap.get(X1D.LIZIZ(LIZ4));
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(enumC82443Lk);
            LIZ5.append('_');
            LIZ5.append(EnumC82403Lg.NOT_REPLY);
            c68322mC3.element = hashMap.get(X1D.LIZIZ(LIZ5));
            hashMap.clear();
        }
        if (C3TX.LIZIZ()) {
            Iterator it = ((ConcurrentHashMap) C771431a.LIZ().LJLJJLL).entrySet().iterator();
            i = 0;
            while (it.hasNext()) {
                i += ((InterfaceC82043Jw) ((Map.Entry) it.next()).getValue()).LIZIZ().size();
            }
        } else {
            Iterator it2 = ((ConcurrentHashMap) C37O.LIZIZ().LJLJI).entrySet().iterator();
            i = 0;
            while (it2.hasNext()) {
                i += ((InterfaceC81953Jn) ((Map.Entry) it2.next()).getValue()).LJII().size();
            }
        }
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        int size = ((ArrayList) C4WC.LJIILIIL()).size();
        OSZ[] oszArr = new OSZ[11];
        oszArr[0] = new OSZ("session_count_in_mem", String.valueOf(i));
        oszArr[1] = new OSZ("conv_count_in_mem", String.valueOf(size));
        C3JY c3jy = (C3JY) LIZ.element;
        int i9 = -1;
        if (c3jy != null) {
            i2 = c3jy.LJLJJLL;
        } else {
            i2 = -1;
        }
        oszArr[2] = new OSZ("secondary_duration", String.valueOf(i2));
        C3JY c3jy2 = (C3JY) LIZ.element;
        if (c3jy2 != null) {
            i3 = c3jy2.LJLJJL;
        } else {
            i3 = -1;
        }
        oszArr[3] = new OSZ("secondary_first_duration", String.valueOf(i3));
        C3JY c3jy3 = (C3JY) c68322mC.element;
        if (c3jy3 != null) {
            i4 = c3jy3.LJLJJLL;
        } else {
            i4 = -1;
        }
        oszArr[4] = new OSZ("unread_duration", String.valueOf(i4));
        C3JY c3jy4 = (C3JY) c68322mC.element;
        if (c3jy4 != null) {
            i5 = c3jy4.LJLJJL;
        } else {
            i5 = -1;
        }
        oszArr[5] = new OSZ("unread_first_duration", String.valueOf(i5));
        C3JY c3jy5 = (C3JY) c68322mC2.element;
        if (c3jy5 != null) {
            i6 = c3jy5.LJLJJLL;
        } else {
            i6 = -1;
        }
        oszArr[6] = new OSZ("following_duration", String.valueOf(i6));
        C3JY c3jy6 = (C3JY) c68322mC2.element;
        if (c3jy6 != null) {
            i7 = c3jy6.LJLJJL;
        } else {
            i7 = -1;
        }
        oszArr[7] = new OSZ("following_first_duration", String.valueOf(i7));
        C3JY c3jy7 = (C3JY) c68322mC3.element;
        if (c3jy7 != null) {
            i8 = c3jy7.LJLJJLL;
        } else {
            i8 = -1;
        }
        oszArr[8] = new OSZ("not_replied_duration", String.valueOf(i8));
        C3JY c3jy8 = (C3JY) c68322mC3.element;
        if (c3jy8 != null) {
            i9 = c3jy8.LJLJJL;
        }
        oszArr[9] = new OSZ("not_replied_first_duration", String.valueOf(i9));
        oszArr[10] = new OSZ("total_conv_size", String.valueOf(C3K5.LJLJLLL));
        C3K5.LIZLLL(C3K5.LJLIL, "im_inbox_perf", C113554cx.LJJL(oszArr), null, 4);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C82033Jv(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
