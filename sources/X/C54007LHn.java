package X;

/* renamed from: X.LHn, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54007LHn<T> implements InterfaceC86003Zc {
    public static final C54007LHn<T> LJLIL = new C54007LHn<>();

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Boolean> interfaceC73573Su9) {
        interfaceC73573Su9.onNext(Boolean.valueOf(LHJ.LIZ.getBoolean("has_shown_guide_dot", false)));
        interfaceC73573Su9.onComplete();
    }
}
