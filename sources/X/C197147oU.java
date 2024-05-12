package X;

import com.ss.android.ugc.aweme.nows.feed.ui.NowAreaMonitorAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7oU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197147oU extends AbstractC65781Prl implements InterfaceC88471Ynr<NowAreaMonitorAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C197147oU LJLIL = new C197147oU();

    public C197147oU() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowAreaMonitorAssem nowAreaMonitorAssem, C43I<? extends Integer> c43i) {
        NowAreaMonitorAssem selectSubscribe = nowAreaMonitorAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLIIIILZ = true;
            EnumC196967oC enumC196967oC = EnumC196967oC.HOLDER_CHANGE;
            selectSubscribe.a4(enumC196967oC, false);
            selectSubscribe.b4(enumC196967oC);
            selectSubscribe.g4(enumC196967oC);
        }
        return C76800UCe.LIZ;
    }
}
