package X;

import com.ss.android.ugc.tools.net.WeakNetSortRule;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.T9h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74177T9h implements InterfaceC74217TAv {
    public static final C74177T9h LIZ = new C74177T9h();
    public static final HashMap<InterfaceC88471Ynr<T39, T39, C76800UCe>, InterfaceC69602oG> LIZIZ = new HashMap<>();

    @Override // X.InterfaceC74217TAv
    public final long LIZLLL() {
        return ((Number) C52378Kh4.LIZ.getValue()).longValue();
    }

    @Override // X.InterfaceC74217TAv
    public final WeakNetSortRule LJ() {
        return (WeakNetSortRule) C74179T9j.LIZIZ.getValue();
    }

    @Override // X.InterfaceC74217TAv
    public final boolean LJFF() {
        return ((Boolean) C45458Hsk.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC74217TAv
    public final T39 LJII() {
        EnumC111394Yt enumC111394Yt = C2NU.LIZ.LIZJ;
        o.LJIIIIZZ(enumC111394Yt, "getInstance().currentNetworkAvailableType");
        return LJIIIZ(enumC111394Yt);
    }

    @Override // X.InterfaceC74217TAv
    public final long LJIIIIZZ() {
        return ((Number) C52384KhA.LIZ.getValue()).longValue();
    }

    @Override // X.InterfaceC74217TAv
    public final boolean LIZIZ() {
        return C52908Kpc.LIZ();
    }

    @Override // X.InterfaceC74217TAv
    public final boolean LJI() {
        return C48203Ivv.LIZJ(EF7.LIZIZ());
    }

    public static T39 LJIIIZ(EnumC111394Yt enumC111394Yt) {
        int i = JDT.LIZ[enumC111394Yt.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return T39.UNKNOWN;
                }
                return T39.FAKE;
            }
            return T39.NOT_AVAILABLE;
        }
        return T39.AVAILABLE;
    }

    @Override // X.InterfaceC74217TAv
    public final void LIZ(InterfaceC88471Ynr<? super T39, ? super T39, C76800UCe> observer) {
        o.LJIIIZ(observer, "observer");
        HashMap<InterfaceC88471Ynr<T39, T39, C76800UCe>, InterfaceC69602oG> hashMap = LIZIZ;
        if (hashMap.containsKey(observer)) {
            C2NU.LIZ.LIZLLL(hashMap.remove(observer));
        }
    }

    @Override // X.InterfaceC74217TAv
    public final void LIZJ(InterfaceC88471Ynr<? super T39, ? super T39, C76800UCe> observer) {
        o.LJIIIZ(observer, "observer");
        HashMap<InterfaceC88471Ynr<T39, T39, C76800UCe>, InterfaceC69602oG> hashMap = LIZIZ;
        if (hashMap.containsKey(observer)) {
            return;
        }
        C74176T9g c74176T9g = new C74176T9g(observer);
        hashMap.put(observer, c74176T9g);
        C2NU.LIZ.LIZ(c74176T9g);
    }
}
