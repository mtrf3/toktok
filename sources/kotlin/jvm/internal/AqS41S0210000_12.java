package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C26045AKb;
import X.C66647QDr;
import X.C70756Rpo;
import X.C70765Rpx;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.SL4;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike.PermissionSettingSheet;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.productinfo.UsProductInfoVH;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public class AqS41S0210000_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS41S0210000_12 aqS41S0210000_12) {
        if (aqS41S0210000_12.z2) {
            C26045AKb c26045AKb = new C26045AKb((PermissionSettingSheet) aqS41S0210000_12.l0);
            c26045AKb.LJIIIIZZ(R.string.dil);
            c26045AKb.LJIIJ();
        }
        PermissionSettingSheet permissionSettingSheet = (PermissionSettingSheet) aqS41S0210000_12.l0;
        C66647QDr.LIZIZ(permissionSettingSheet.LJLJJL, ((SL4) aqS41S0210000_12.l1).LJIILLIIL, permissionSettingSheet.LJLJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS41S0210000_12 aqS41S0210000_12) {
        ((UsProductInfoVH) aqS41S0210000_12.l0).getViewModel().Qv0((View) aqS41S0210000_12.l1, aqS41S0210000_12.z2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS41S0210000_12 aqS41S0210000_12) {
        C70765Rpx LJJIJ;
        if (aqS41S0210000_12.z2 && (LJJIJ = ((C70756Rpo) aqS41S0210000_12.l0).LJJIJ()) != null) {
            LJJIJ.LIZ((Image) aqS41S0210000_12.l1, true, true);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS41S0210000_12(UsProductInfoVH usProductInfoVH, View view, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = usProductInfoVH;
        this.l1 = view;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS41S0210000_12(boolean z, C70756Rpo c70756Rpo, Image image, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = c70756Rpo;
        this.l1 = image;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS41S0210000_12(boolean z, PermissionSettingSheet permissionSettingSheet, SL4 sl4, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = permissionSettingSheet;
        this.l1 = sl4;
    }
}
