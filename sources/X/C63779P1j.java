package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.auth.model.RegisteredContactUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.P1j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63779P1j extends AbstractC65781Prl implements InterfaceC88472Yns<C63780P1k, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63779P1j(String str, int i) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C63780P1k c63780P1k) {
        List<RegisteredContactUser> registerItemList;
        C63780P1k vmState = c63780P1k;
        o.LJIIIZ(vmState, "vmState");
        C9U5 LIZ = vmState.LJLILLLLZI.LIZ();
        if (LIZ != null && (registerItemList = LIZ.getRegisterItemList()) != null) {
            String str = this.LJLIL;
            int i = this.LJLILLLLZI;
            for (RegisteredContactUser registeredContactUser : registerItemList) {
                if (o.LJ(registeredContactUser.getUid(), str)) {
                    registeredContactUser.setFollowStatus(i);
                }
            }
        }
        List<User> LIZ2 = vmState.LJLJI.LIZ();
        if (LIZ2 != null) {
            String str2 = this.LJLIL;
            int i2 = this.LJLILLLLZI;
            for (User user : LIZ2) {
                if (o.LJ(user.getUid(), str2)) {
                    user.setFollowStatus(i2);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
