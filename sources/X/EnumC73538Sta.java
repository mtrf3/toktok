package X;

/* renamed from: X.Sta, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC73538Sta implements InterfaceC73558Stu<Object> {
    INSTANCE,
    NEVER;

    @Override // X.InterfaceC73570Su6
    public void clear() {
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
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

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        if (this == INSTANCE) {
            return true;
        }
        return false;
    }

    public static void complete(InterfaceC116954iR<?> interfaceC116954iR) {
        interfaceC116954iR.onSubscribe(INSTANCE);
        interfaceC116954iR.onComplete();
    }

    public static EnumC73538Sta valueOf(String str) {
        return (EnumC73538Sta) V0N.LJJJ(EnumC73538Sta.class, str);
    }

    @Override // X.InterfaceC73570Su6
    public boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void complete(InterfaceC73442Ss2 interfaceC73442Ss2) {
        interfaceC73442Ss2.onSubscribe(INSTANCE);
        interfaceC73442Ss2.onComplete();
    }

    public static void complete(InterfaceC73509St7<?> interfaceC73509St7) {
        interfaceC73509St7.onSubscribe(INSTANCE);
        interfaceC73509St7.onComplete();
    }

    public static void error(Throwable th, InterfaceC116954iR<?> interfaceC116954iR) {
        interfaceC116954iR.onSubscribe(INSTANCE);
        interfaceC116954iR.onError(th);
    }

    public boolean offer(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public static void error(Throwable th, InterfaceC73442Ss2 interfaceC73442Ss2) {
        interfaceC73442Ss2.onSubscribe(INSTANCE);
        interfaceC73442Ss2.onError(th);
    }

    public static void error(Throwable th, InterfaceC73463SsN<?> interfaceC73463SsN) {
        interfaceC73463SsN.onSubscribe(INSTANCE);
        interfaceC73463SsN.onError(th);
    }

    public static void error(Throwable th, InterfaceC73509St7<?> interfaceC73509St7) {
        interfaceC73509St7.onSubscribe(INSTANCE);
        interfaceC73509St7.onError(th);
    }
}
