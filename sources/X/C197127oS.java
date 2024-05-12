package X;

import com.ss.android.ugc.aweme.nows.feed.ui.NowAreaMonitorAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7oS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197127oS extends AbstractC65781Prl implements InterfaceC88471Ynr<NowAreaMonitorAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C197127oS LJLIL = new C197127oS();

    public C197127oS() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowAreaMonitorAssem nowAreaMonitorAssem, C43I<? extends Boolean> c43i) {
        NowAreaMonitorAssem selectSubscribe = nowAreaMonitorAssem;
        C43I<? extends Boolean> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null) {
            ((Boolean) c43i2.LIZ).booleanValue();
            EnumC196967oC enumC196967oC = EnumC196967oC.HOX_CHANGE;
            selectSubscribe.a4(enumC196967oC, false);
            selectSubscribe.g4(enumC196967oC);
        }
        return C76800UCe.LIZ;
    }
}
