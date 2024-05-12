package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C70619Rnb;
import X.C72647SfD;
import X.C72648SfE;
import X.C72650SfG;
import X.C76800UCe;
import X.C7WG;
import X.H78;
import X.InterfaceC65784Pro;
import X.X1D;
import com.ss.android.ugc.aweme.view.profileImageEditor.ProfileNaviProfileImageEditorFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public class AqS39S0100100_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS39S0100100_12 aqS39S0100100_12) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("done handle dismissal ");
        LIZ.append(System.currentTimeMillis() - aqS39S0100100_12.j1);
        LIZ.append("ms");
        H78.LIZIZ("JEFF", X1D.LIZIZ(LIZ));
        ((ProfileNaviProfileImageEditorFragment) aqS39S0100100_12.l0).xl(false);
        ProfileNaviCreatorViewModel vl = ((ProfileNaviProfileImageEditorFragment) aqS39S0100100_12.l0).vl();
        vl.setStateImmediate(C72647SfD.LJLIL);
        vl.setStateImmediate(C72648SfE.LJLIL);
        C72650SfG.LIZ();
        ((ProfileNaviProfileImageEditorFragment) aqS39S0100100_12.l0).dismiss();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS39S0100100_12 aqS39S0100100_12) {
        ((C7WG) ((C70619Rnb) aqS39S0100100_12.l0)._$_findCachedViewById(R.id.ich)).LIZJ(aqS39S0100100_12.j1);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS39S0100100_12(long j, ProfileNaviProfileImageEditorFragment profileNaviProfileImageEditorFragment, int i) {
        super(0);
        this.$t = i;
        this.j1 = j;
        this.l0 = profileNaviProfileImageEditorFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS39S0100100_12(C70619Rnb c70619Rnb, long j, int i) {
        super(0);
        this.$t = i;
        this.l0 = c70619Rnb;
        this.j1 = j;
    }
}
