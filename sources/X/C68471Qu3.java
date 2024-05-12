package X;

/* renamed from: X.Qu3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68471Qu3<T> implements InterfaceC64592gB {
    public static final C68471Qu3<T> LJLIL = new C68471Qu3<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clearNonLoginTasks(NON_LOGIN_TYPE) END <==================================================: error: ");
        LIZ.append(((Throwable) obj).getMessage());
        C47629Imf.LIZIZ("LocalNotifyTasksPublisher", X1D.LIZIZ(LIZ));
    }
}
