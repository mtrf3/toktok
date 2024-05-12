package X;

import com.ss.android.ugc.aweme.nows.feed.ui.NowAreaMonitorAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7oT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197137oT extends AbstractC65781Prl implements InterfaceC88471Ynr<NowAreaMonitorAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C197137oT LJLIL = new C197137oT();

    public C197137oT() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowAreaMonitorAssem nowAreaMonitorAssem, C43I<? extends C195357lb> c43i) {
        NowAreaMonitorAssem selectSubscribe = nowAreaMonitorAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            selectSubscribe.LLIIIILZ = false;
            EnumC196967oC enumC196967oC = EnumC196967oC.HOLDER_CHANGE;
            selectSubscribe.a4(enumC196967oC, false);
            selectSubscribe.b4(enumC196967oC);
            selectSubscribe.g4(enumC196967oC);
        }
        return C76800UCe.LIZ;
    }
}
