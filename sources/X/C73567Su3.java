package X;

import defpackage.PasskeyFrequencySettingsModel;
import java.util.concurrent.Callable;

/* renamed from: X.Su3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73567Su3 {
    public static <T, R> boolean LIZ(InterfaceC115714gR<T> interfaceC115714gR, InterfaceC116954iR<? super R> interfaceC116954iR, InterfaceC48038ItG<? super T, ? extends InterfaceC115714gR<? extends R>> interfaceC48038ItG) {
        if (interfaceC115714gR instanceof Callable) {
            try {
                PasskeyFrequencySettingsModel passkeyFrequencySettingsModel = (Object) ((Callable) interfaceC115714gR).call();
                if (passkeyFrequencySettingsModel == null) {
                    EnumC73538Sta.complete(interfaceC116954iR);
                    return true;
                }
                try {
                    InterfaceC115714gR<? extends R> apply = interfaceC48038ItG.apply(passkeyFrequencySettingsModel);
                    C73320Sq4.LIZ(apply, "The mapper returned a null ObservableSource");
                    InterfaceC115714gR<? extends R> interfaceC115714gR2 = apply;
                    if (interfaceC115714gR2 instanceof Callable) {
                        try {
                            Object call = ((Callable) interfaceC115714gR2).call();
                            if (call == null) {
                                EnumC73538Sta.complete(interfaceC116954iR);
                                return true;
                            }
                            RunnableC73564Su0 runnableC73564Su0 = new RunnableC73564Su0(interfaceC116954iR, call);
                            interfaceC116954iR.onSubscribe(runnableC73564Su0);
                            runnableC73564Su0.run();
                        } catch (Throwable th) {
                            V0N.LJJIL(th);
                            EnumC73538Sta.error(th, interfaceC116954iR);
                            return true;
                        }
                    } else {
                        interfaceC115714gR2.LIZ(interfaceC116954iR);
                    }
                    return true;
                } catch (Throwable th2) {
                    V0N.LJJIL(th2);
                    EnumC73538Sta.error(th2, interfaceC116954iR);
                    return true;
                }
            } catch (Throwable th3) {
                V0N.LJJIL(th3);
                EnumC73538Sta.error(th3, interfaceC116954iR);
                return true;
            }
        }
        return false;
    }
}
