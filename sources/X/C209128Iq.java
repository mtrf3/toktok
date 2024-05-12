package X;

import com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskVM;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8Iq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209128Iq extends AbstractC65781Prl implements InterfaceC88471Ynr<GeneralVideoMaskAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C209128Iq LJLIL = new C209128Iq();

    public C209128Iq() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(GeneralVideoMaskAssem generalVideoMaskAssem, C43I<? extends Boolean> c43i) {
        GeneralVideoMaskAssem selectSubscribe = generalVideoMaskAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (!C53324KwK.LIZ() || ((Boolean) it.LIZ).booleanValue()) {
            GeneralVideoMaskVM p4 = selectSubscribe.p4();
            p4.getClass();
            p4.withState(new AqS169S0100000_3(p4, 707));
        }
        return C76800UCe.LIZ;
    }
}
