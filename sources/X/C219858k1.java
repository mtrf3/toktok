package X;

import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursTabAbility;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubListAssem;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8k1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219858k1 extends AbstractC65781Prl implements InterfaceC88471Ynr<AddYoursHubListAssem, List<? extends C220108kQ>, C76800UCe> {
    public static final C219858k1 LJLIL = new C219858k1();

    public C219858k1() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AddYoursHubListAssem addYoursHubListAssem, List<? extends C220108kQ> list) {
        AddYoursHubListAssem selectSubscribe = addYoursHubListAssem;
        List<? extends C220108kQ> it = list;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        AddYoursTabAbility addYoursTabAbility = (AddYoursTabAbility) selectSubscribe.LLFII.getValue();
        if (addYoursTabAbility != 0) {
            addYoursTabAbility.iq0(it);
        }
        return C76800UCe.LIZ;
    }
}
