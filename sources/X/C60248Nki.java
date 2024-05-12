package X;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;

/* renamed from: X.Nki, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60248Nki implements InterfaceC60247Nkh {
    public final java.util.Map<Class<InterfaceC60250Nkk<?, ?, ?, ?>>, InterfaceC60253Nkn<?, ?>> LIZ = new LinkedHashMap();
    public final InterfaceC60262Nkw LIZIZ;
    public final F3T LIZJ;
    public final InterfaceC88472Yns<F3T, List<AbstractC59475NVv>> LIZLLL;

    @Override // X.InterfaceC60247Nkh
    public final InterfaceC60262Nkw LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC60247Nkh
    public final InterfaceC88472Yns<F3T, List<AbstractC59475NVv>> LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC60247Nkh
    public final F3T LLIIIILZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC60247Nkh
    public final <S extends InterfaceC60250Nkk<? extends T, ? extends U, ? extends V, ? extends X>, T extends InterfaceC60282NlG, U extends InterfaceC60281NlF, V extends InterfaceC40516FvE, X extends InterfaceC60227NkN> InterfaceC60253Nkn<T, U> LIZIZ(Class<? extends S> cls) {
        InterfaceC60253Nkn<T, U> interfaceC60253Nkn = (InterfaceC60253Nkn) ((LinkedHashMap) this.LIZ).get(cls);
        if (interfaceC60253Nkn != null) {
            return interfaceC60253Nkn;
        }
        return null;
    }

    public C60248Nki(C60264Nky c60264Nky, F3T f3t, AqS176S0100000_10 aqS176S0100000_10) {
        this.LIZIZ = c60264Nky;
        this.LIZJ = f3t;
        this.LIZLLL = aqS176S0100000_10;
    }
}
