package X;

import com.ss.android.ugc.aweme.feed.assem.container.RightAreaContainerAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.87D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C87D extends AbstractC65781Prl implements InterfaceC88471Ynr<RightAreaContainerAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C87D LJLIL = new C87D();

    public C87D() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(RightAreaContainerAssem rightAreaContainerAssem, C43I<? extends Boolean> c43i) {
        RightAreaContainerAssem selectSubscribe = rightAreaContainerAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.a4(true);
        }
        return C76800UCe.LIZ;
    }
}
