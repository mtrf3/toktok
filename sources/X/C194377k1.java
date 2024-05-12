package X;

import com.ss.android.ugc.aweme.nows.feed.ui.userrow.NowPostAggrUserRowAssem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7k1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C194377k1 extends AbstractC65781Prl implements InterfaceC88473Ynt<NowPostAggrUserRowAssem, Integer, List<? extends InterfaceC194547kI>, C76800UCe> {
    public static final C194377k1 LJLIL = new C194377k1();

    public C194377k1() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(NowPostAggrUserRowAssem nowPostAggrUserRowAssem, Integer num, List<? extends InterfaceC194547kI> list) {
        InterfaceC194547kI interfaceC194547kI;
        NowPostAggrUserRowAssem selectSubscribe = nowPostAggrUserRowAssem;
        int intValue = num.intValue();
        List<? extends InterfaceC194547kI> list2 = list;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (list2 != null && !list2.isEmpty() && (interfaceC194547kI = (InterfaceC194547kI) ORZ.LJLLLLLL(intValue, list2)) != null) {
            selectSubscribe.n4(interfaceC194547kI);
        }
        return C76800UCe.LIZ;
    }
}
