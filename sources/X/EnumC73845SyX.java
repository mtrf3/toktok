package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.SyX, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class EnumC73845SyX {
    public static final EnumC73845SyX COMPLETE;
    public static final /* synthetic */ EnumC73845SyX[] LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t) {
        return t;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "NotificationLite.Complete";
    }

    static {
        EnumC73845SyX enumC73845SyX = new EnumC73845SyX();
        COMPLETE = enumC73845SyX;
        LJLIL = new EnumC73845SyX[]{enumC73845SyX};
    }

    public static EnumC73845SyX[] values() {
        return (EnumC73845SyX[]) LJLIL.clone();
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object disposable(InterfaceC92693kP interfaceC92693kP) {
        return new E4O(interfaceC92693kP);
    }

    public static Object error(Throwable th) {
        return new E42(th);
    }

    public static InterfaceC92693kP getDisposable(Object obj) {
        return ((E4O) obj).LJLIL;
    }

    public static Throwable getError(Object obj) {
        return ((E42) obj).LJLIL;
    }

    public static InterfaceC73651SvP getSubscription(Object obj) {
        return ((C73850Syc) obj).LJLIL;
    }

    public static boolean isComplete(Object obj) {
        if (obj == COMPLETE) {
            return true;
        }
        return false;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof E4O;
    }

    public static boolean isError(Object obj) {
        return obj instanceof E42;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof C73850Syc;
    }

    public static Object subscription(InterfaceC73651SvP interfaceC73651SvP) {
        return new C73850Syc(interfaceC73651SvP);
    }

    public static EnumC73845SyX valueOf(String str) {
        return (EnumC73845SyX) V0N.LJJJ(EnumC73845SyX.class, str);
    }

    public static <T> boolean accept(Object obj, InterfaceC116954iR<? super T> interfaceC116954iR) {
        if (obj == COMPLETE) {
            interfaceC116954iR.onComplete();
            return true;
        }
        if (obj instanceof E42) {
            interfaceC116954iR.onError(((E42) obj).LJLIL);
            return true;
        }
        interfaceC116954iR.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, InterfaceC116954iR<? super T> interfaceC116954iR) {
        if (obj == COMPLETE) {
            interfaceC116954iR.onComplete();
            return true;
        }
        if (obj instanceof E42) {
            interfaceC116954iR.onError(((E42) obj).LJLIL);
            return true;
        }
        if (obj instanceof E4O) {
            interfaceC116954iR.onSubscribe(((E4O) obj).LJLIL);
            return false;
        }
        interfaceC116954iR.onNext(obj);
        return false;
    }

    public static <T> boolean accept(Object obj, InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        if (obj == COMPLETE) {
            interfaceC73740Swq.onComplete();
            return true;
        }
        if (obj instanceof E42) {
            interfaceC73740Swq.onError(((E42) obj).LJLIL);
            return true;
        }
        interfaceC73740Swq.onNext(obj);
        return false;
    }

    public static <T> boolean acceptFull(Object obj, InterfaceC73740Swq<? super T> interfaceC73740Swq) {
        if (obj == COMPLETE) {
            interfaceC73740Swq.onComplete();
            return true;
        }
        if (obj instanceof E42) {
            interfaceC73740Swq.onError(((E42) obj).LJLIL);
            return true;
        }
        if (obj instanceof C73850Syc) {
            interfaceC73740Swq.onSubscribe(((C73850Syc) obj).LJLIL);
            return false;
        }
        interfaceC73740Swq.onNext(obj);
        return false;
    }
}
