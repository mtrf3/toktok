package X;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Sx5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class EnumC73755Sx5 implements InterfaceC73651SvP {
    public static final EnumC73755Sx5 CANCELLED;
    public static final /* synthetic */ EnumC73755Sx5[] LJLIL;

    @Override // X.InterfaceC73651SvP
    public void cancel() {
    }

    @Override // X.InterfaceC73651SvP
    public void request(long j) {
    }

    static {
        EnumC73755Sx5 enumC73755Sx5 = new EnumC73755Sx5();
        CANCELLED = enumC73755Sx5;
        LJLIL = new EnumC73755Sx5[]{enumC73755Sx5};
    }

    public static void reportSubscriptionSet() {
        C73548Stk.LIZIZ(new C73392SrE("Subscription already set!"));
    }

    public static EnumC73755Sx5[] values() {
        return (EnumC73755Sx5[]) LJLIL.clone();
    }

    public static boolean cancel(AtomicReference<InterfaceC73651SvP> atomicReference) {
        InterfaceC73651SvP andSet;
        InterfaceC73651SvP interfaceC73651SvP = atomicReference.get();
        EnumC73755Sx5 enumC73755Sx5 = CANCELLED;
        if (interfaceC73651SvP != enumC73755Sx5 && (andSet = atomicReference.getAndSet(enumC73755Sx5)) != enumC73755Sx5) {
            if (andSet != null) {
                andSet.cancel();
                return true;
            }
            return true;
        }
        return false;
    }

    public static void reportMoreProduced(long j) {
        C73548Stk.LIZIZ(new C73392SrE(C61845OOz.LIZ("More produced than requested: ", j)));
    }

    public static boolean validate(long j) {
        if (j <= 0) {
            C73548Stk.LIZIZ(new IllegalArgumentException(C61845OOz.LIZ("n > 0 required but it was ", j)));
            return false;
        }
        return true;
    }

    public static EnumC73755Sx5 valueOf(String str) {
        return (EnumC73755Sx5) V0N.LJJJ(EnumC73755Sx5.class, str);
    }

    public static boolean replace(AtomicReference<InterfaceC73651SvP> atomicReference, InterfaceC73651SvP interfaceC73651SvP) {
        while (true) {
            InterfaceC73651SvP interfaceC73651SvP2 = atomicReference.get();
            if (interfaceC73651SvP2 == CANCELLED) {
                if (interfaceC73651SvP != null) {
                    interfaceC73651SvP.cancel();
                }
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC73651SvP2, interfaceC73651SvP)) {
                if (atomicReference.get() != interfaceC73651SvP2) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean set(AtomicReference<InterfaceC73651SvP> atomicReference, InterfaceC73651SvP interfaceC73651SvP) {
        while (true) {
            InterfaceC73651SvP interfaceC73651SvP2 = atomicReference.get();
            if (interfaceC73651SvP2 == CANCELLED) {
                if (interfaceC73651SvP != null) {
                    interfaceC73651SvP.cancel();
                }
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC73651SvP2, interfaceC73651SvP)) {
                if (atomicReference.get() != interfaceC73651SvP2) {
                    break;
                }
            }
            if (interfaceC73651SvP2 != null) {
                interfaceC73651SvP2.cancel();
            }
            return true;
        }
    }

    public static boolean setOnce(AtomicReference<InterfaceC73651SvP> atomicReference, InterfaceC73651SvP interfaceC73651SvP) {
        C73320Sq4.LIZ(interfaceC73651SvP, "s is null");
        while (!atomicReference.compareAndSet(null, interfaceC73651SvP)) {
            if (atomicReference.get() != null) {
                interfaceC73651SvP.cancel();
                if (atomicReference.get() != CANCELLED) {
                    reportSubscriptionSet();
                }
                return false;
            }
        }
        return true;
    }

    public static boolean validate(InterfaceC73651SvP interfaceC73651SvP, InterfaceC73651SvP interfaceC73651SvP2) {
        if (interfaceC73651SvP2 == null) {
            C73548Stk.LIZIZ(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC73651SvP != null) {
            interfaceC73651SvP2.cancel();
            reportSubscriptionSet();
            return false;
        }
        return true;
    }

    public static void deferredRequest(AtomicReference<InterfaceC73651SvP> atomicReference, AtomicLong atomicLong, long j) {
        InterfaceC73651SvP interfaceC73651SvP = atomicReference.get();
        if (interfaceC73651SvP != null) {
            interfaceC73651SvP.request(j);
            return;
        }
        if (!validate(j)) {
            return;
        }
        V2B.LIZ(atomicLong, j);
        InterfaceC73651SvP interfaceC73651SvP2 = atomicReference.get();
        if (interfaceC73651SvP2 == null) {
            return;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return;
        }
        interfaceC73651SvP2.request(andSet);
    }

    public static boolean deferredSetOnce(AtomicReference<InterfaceC73651SvP> atomicReference, AtomicLong atomicLong, InterfaceC73651SvP interfaceC73651SvP) {
        if (setOnce(atomicReference, interfaceC73651SvP)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                interfaceC73651SvP.request(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean setOnce(AtomicReference<InterfaceC73651SvP> atomicReference, InterfaceC73651SvP interfaceC73651SvP, long j) {
        if (setOnce(atomicReference, interfaceC73651SvP)) {
            interfaceC73651SvP.request(j);
            return true;
        }
        return false;
    }
}
