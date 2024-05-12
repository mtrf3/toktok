package X;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Sre, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class EnumC73418Sre implements InterfaceC92693kP {
    public static final EnumC73418Sre DISPOSED;
    public static final /* synthetic */ EnumC73418Sre[] LJLIL;

    @Override // X.InterfaceC92693kP
    public void dispose() {
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        return true;
    }

    static {
        EnumC73418Sre enumC73418Sre = new EnumC73418Sre();
        DISPOSED = enumC73418Sre;
        LJLIL = new EnumC73418Sre[]{enumC73418Sre};
    }

    public static void reportDisposableSet() {
        C73548Stk.LIZIZ(new C73392SrE("Disposable already set!"));
    }

    public static EnumC73418Sre[] values() {
        return (EnumC73418Sre[]) LJLIL.clone();
    }

    public static boolean dispose(AtomicReference<InterfaceC92693kP> atomicReference) {
        InterfaceC92693kP andSet;
        InterfaceC92693kP interfaceC92693kP = atomicReference.get();
        EnumC73418Sre enumC73418Sre = DISPOSED;
        if (interfaceC92693kP != enumC73418Sre && (andSet = atomicReference.getAndSet(enumC73418Sre)) != enumC73418Sre) {
            if (andSet != null) {
                andSet.dispose();
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean isDisposed(InterfaceC92693kP interfaceC92693kP) {
        if (interfaceC92693kP == DISPOSED) {
            return true;
        }
        return false;
    }

    public static EnumC73418Sre valueOf(String str) {
        return (EnumC73418Sre) V0N.LJJJ(EnumC73418Sre.class, str);
    }

    public static boolean replace(AtomicReference<InterfaceC92693kP> atomicReference, InterfaceC92693kP interfaceC92693kP) {
        while (true) {
            InterfaceC92693kP interfaceC92693kP2 = atomicReference.get();
            if (interfaceC92693kP2 == DISPOSED) {
                if (interfaceC92693kP != null) {
                    interfaceC92693kP.dispose();
                }
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC92693kP2, interfaceC92693kP)) {
                if (atomicReference.get() != interfaceC92693kP2) {
                    break;
                }
            }
            return true;
        }
    }

    public static boolean set(AtomicReference<InterfaceC92693kP> atomicReference, InterfaceC92693kP interfaceC92693kP) {
        while (true) {
            InterfaceC92693kP interfaceC92693kP2 = atomicReference.get();
            if (interfaceC92693kP2 == DISPOSED) {
                if (interfaceC92693kP != null) {
                    interfaceC92693kP.dispose();
                }
                return false;
            }
            while (!atomicReference.compareAndSet(interfaceC92693kP2, interfaceC92693kP)) {
                if (atomicReference.get() != interfaceC92693kP2) {
                    break;
                }
            }
            if (interfaceC92693kP2 != null) {
                interfaceC92693kP2.dispose();
            }
            return true;
        }
    }

    public static boolean setOnce(AtomicReference<InterfaceC92693kP> atomicReference, InterfaceC92693kP interfaceC92693kP) {
        C73320Sq4.LIZ(interfaceC92693kP, "d is null");
        while (!atomicReference.compareAndSet(null, interfaceC92693kP)) {
            if (atomicReference.get() != null) {
                interfaceC92693kP.dispose();
                if (atomicReference.get() != DISPOSED) {
                    reportDisposableSet();
                }
                return false;
            }
        }
        return true;
    }

    public static boolean trySet(AtomicReference<InterfaceC92693kP> atomicReference, InterfaceC92693kP interfaceC92693kP) {
        while (!atomicReference.compareAndSet(null, interfaceC92693kP)) {
            if (atomicReference.get() != null) {
                if (atomicReference.get() == DISPOSED) {
                    interfaceC92693kP.dispose();
                }
                return false;
            }
        }
        return true;
    }

    public static boolean validate(InterfaceC92693kP interfaceC92693kP, InterfaceC92693kP interfaceC92693kP2) {
        if (interfaceC92693kP2 == null) {
            C73548Stk.LIZIZ(new NullPointerException("next is null"));
            return false;
        }
        if (interfaceC92693kP != null) {
            interfaceC92693kP2.dispose();
            reportDisposableSet();
            return false;
        }
        return true;
    }
}
