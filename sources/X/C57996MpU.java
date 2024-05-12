package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.relation.usercard.ability.AuthCardListScopeAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.MpU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57996MpU extends AbstractC65781Prl implements InterfaceC88472Yns<C57391Mfj, C76800UCe> {
    public final /* synthetic */ AuthCardListScopeAbility LJLIL;
    public final /* synthetic */ EnumC58046MqI LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57996MpU(AuthCardListScopeAbility authCardListScopeAbility, EnumC58046MqI enumC58046MqI) {
        super(1);
        this.LJLIL = authCardListScopeAbility;
        this.LJLILLLLZI = enumC58046MqI;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C57391Mfj c57391Mfj) {
        String str;
        boolean z;
        C57391Mfj c57391Mfj2 = c57391Mfj;
        if (!(this.LJLIL.LJLJLJ.invoke().LIZ instanceof C33X)) {
            Bundle bundle = c57391Mfj2.LJI;
            if (bundle != null) {
                str = bundle.getString("from_myself");
            } else {
                str = null;
            }
            boolean LJ = o.LJ(str, this.LJLIL.LJLL);
            boolean z2 = c57391Mfj2.LIZLLL;
            Bundle bundle2 = c57391Mfj2.LJI;
            if (bundle2 != null) {
                z = bundle2.getBoolean("should_upload");
            } else {
                z = false;
            }
            int i = C58005Mpd.LIZ[c57391Mfj2.LIZIZ.ordinal()];
            if (i != 1) {
                if (i == 2 && z2) {
                    AuthCardListScopeAbility authCardListScopeAbility = this.LJLIL;
                    authCardListScopeAbility.LJ(this.LJLILLLLZI, LJ, authCardListScopeAbility.LIZJ());
                }
            } else {
                this.LJLIL.LIZLLL(this.LJLILLLLZI, z2, LJ, z);
            }
            this.LJLIL.LJLLLLLL.put(this.LJLILLLLZI, Boolean.valueOf(z2));
        }
        return C76800UCe.LIZ;
    }
}
