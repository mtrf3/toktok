package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubListAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8k2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219868k2 extends AbstractC65781Prl implements InterfaceC88471Ynr<AddYoursHubListAssem, User, C76800UCe> {
    public static final C219868k2 LJLIL = new C219868k2();

    public C219868k2() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(AddYoursHubListAssem addYoursHubListAssem, User user) {
        AddYoursHubAbility addYoursHubAbility;
        AddYoursHubListAssem selectSubscribe = addYoursHubListAssem;
        User user2 = user;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (user2 != null && (addYoursHubAbility = (AddYoursHubAbility) selectSubscribe.LLFFF.getValue()) != null) {
            addYoursHubAbility.sD(user2);
        }
        return C76800UCe.LIZ;
    }
}
