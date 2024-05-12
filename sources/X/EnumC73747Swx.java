package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Swx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class EnumC73747Swx implements InterfaceC73632Sv6<Object> {
    public static final EnumC73747Swx INSTANCE;
    public static final /* synthetic */ EnumC73747Swx[] LJLIL;

    @Override // X.InterfaceC73651SvP
    public void cancel() {
    }

    @Override // X.InterfaceC73570Su6
    public void clear() {
    }

    @Override // X.InterfaceC73570Su6
    public boolean isEmpty() {
        return true;
    }

    @Override // X.InterfaceC73570Su6
    public Object poll() {
        return null;
    }

    @Override // X.InterfaceC73571Su7
    public int requestFusion(int i) {
        return i & 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        return "EmptySubscription";
    }

    static {
        EnumC73747Swx enumC73747Swx = new EnumC73747Swx();
        INSTANCE = enumC73747Swx;
        LJLIL = new EnumC73747Swx[]{enumC73747Swx};
    }

    public static EnumC73747Swx[] values() {
        return (EnumC73747Swx[]) LJLIL.clone();
    }

    public static void complete(InterfaceC73740Swq<?> interfaceC73740Swq) {
        interfaceC73740Swq.onSubscribe(INSTANCE);
        interfaceC73740Swq.onComplete();
    }

    public static EnumC73747Swx valueOf(String str) {
        return (EnumC73747Swx) V0N.LJJJ(EnumC73747Swx.class, str);
    }

    @Override // X.InterfaceC73570Su6
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // X.InterfaceC73651SvP
    public void request(long j) {
        EnumC73755Sx5.validate(j);
    }

    public static void error(Throwable th, InterfaceC73740Swq<?> interfaceC73740Swq) {
        interfaceC73740Swq.onSubscribe(INSTANCE);
        interfaceC73740Swq.onError(th);
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
