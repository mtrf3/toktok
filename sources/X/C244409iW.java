package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9iW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244409iW extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public static final C244409iW LJLIL = new C244409iW();

    public C244409iW() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN arn) {
        ARN actionEventArgs = arn;
        o.LJIIIZ(actionEventArgs, "actionEventArgs");
        actionEventArgs.LIZJ = true;
        STD.LJ("toggle", "cancel");
        return C76800UCe.LIZ;
    }
}
