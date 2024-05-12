package X;

import kotlin.jvm.internal.o;

/* renamed from: X.9iV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244399iV extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public static final C244399iV LJLIL = new C244399iV();

    public C244399iV() {
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
