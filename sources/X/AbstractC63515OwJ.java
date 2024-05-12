package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.OwJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC63515OwJ<T> {
    public final int LIZ;
    public final InterfaceC86963bA<T> LIZIZ;

    public boolean LJFF() {
        return this instanceof C120144na;
    }

    public int LJI() {
        return -1;
    }

    public abstract void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10);

    public void LJIIIIZZ(C63622Oy2 c63622Oy2) {
    }

    public abstract boolean LJIIIZ(C63622Oy2 c63622Oy2);

    public AbstractC63515OwJ(int i) {
        this.LIZ = i;
    }

    public final void LIZ(C63623Oy3 c63623Oy3) {
        InterfaceC86963bA<T> interfaceC86963bA = this.LIZIZ;
        if (interfaceC86963bA != null) {
            interfaceC86963bA.LIZIZ(c63623Oy3);
        }
    }

    public final void LIZIZ(C63622Oy2 c63622Oy2) {
        LIZ(C63623Oy3.LIZ(c63622Oy2));
    }

    public final void LIZLLL(T t) {
        InterfaceC86963bA<T> interfaceC86963bA = this.LIZIZ;
        if (interfaceC86963bA != null) {
            interfaceC86963bA.onSuccess(t);
        }
    }

    public AbstractC63515OwJ(int i, InterfaceC86963bA<T> interfaceC86963bA) {
        this.LIZ = i;
        if (interfaceC86963bA != null) {
            this.LIZIZ = interfaceC86963bA;
        }
    }

    public final void LJ(T t, C63622Oy2 c63622Oy2) {
        InterfaceC86963bA<T> interfaceC86963bA = this.LIZIZ;
        if (interfaceC86963bA != null) {
            try {
                if ((interfaceC86963bA instanceof AnonymousClass379) && c63622Oy2 != null) {
                    ((AnonymousClass379) interfaceC86963bA).LIZ(t, C63623Oy3.LIZ(c63622Oy2));
                } else {
                    interfaceC86963bA.onSuccess(t);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                C63337OtR.LJFF(e);
            }
        }
    }

    public final void LIZJ(long j, Object obj, boolean z) {
        InterfaceC86963bA<T> interfaceC86963bA = this.LIZIZ;
        if (interfaceC86963bA != null) {
            if (interfaceC86963bA instanceof AbstractC75682y4) {
                ((AbstractC75682y4) interfaceC86963bA).LIZJ(j, obj, z);
            } else {
                interfaceC86963bA.onSuccess(obj);
            }
        }
    }

    public final long LJIIJ(Request request, InterfaceC63361Otp interfaceC63361Otp, Object... objArr) {
        C63622Oy2 c63622Oy2 = new C63622Oy2(request.sequence_id.longValue(), this);
        LJIIIIZZ(c63622Oy2);
        c63622Oy2.LJLJJLL = request;
        c63622Oy2.LJLJJL = objArr;
        c63622Oy2.LJLILLLLZI = LJFF();
        c63622Oy2.LJLLLLLL = LJI();
        c63622Oy2.LJLZ = -1;
        c63622Oy2.LJLJJI = interfaceC63361Otp;
        Iterator<InterfaceC63520OwO> it = C63521OwP.LIZIZ().LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            InterfaceC63520OwO next = it.next();
            if (next.LIZLLL(c63622Oy2)) {
                next.LIZIZ().LJ(c63622Oy2);
                break;
            }
        }
        return c63622Oy2.LJLIL;
    }

    public final long LJIIJJI(int i, RequestBody requestBody, InterfaceC63361Otp interfaceC63361Otp, Object... objArr) {
        return LJIIJ(C63312Ot2.LIZ(i, this.LIZ, requestBody), interfaceC63361Otp, objArr);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.P0x] */
    public final void LJIIL(int i, RequestBody requestBody, InterfaceC63361Otp interfaceC63361Otp, java.util.Map map, Object... objArr) {
        Request LIZ = C63312Ot2.LIZ(i, this.LIZ, requestBody);
        HashMap hashMap = new HashMap();
        hashMap.putAll(LIZ.headers);
        hashMap.putAll(map);
        ?? newBuilder2 = LIZ.newBuilder2();
        newBuilder2.getClass();
        C63685Oz3.LIZIZ(hashMap);
        newBuilder2.LJIIZILJ = hashMap;
        LJIIJ(newBuilder2.build(), interfaceC63361Otp, objArr);
    }
}
