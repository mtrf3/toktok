package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C234109Gs;
import X.C27943Axv;
import X.C70355RjL;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.ProfileNavBarRootComponent;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarBaseComponent;
import java.util.Map;

/* loaded from: classes5.dex */
public class AqS6S1301000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS6S1301000_4 aqS6S1301000_4, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C70355RjL.LIZ(sendLog, (Map) aqS6S1301000_4.l1, (ProductPackStruct) aqS6S1301000_4.l2, (SkuPrice) aqS6S1301000_4.l3, aqS6S1301000_4.i4, aqS6S1301000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS6S1301000_4 aqS6S1301000_4, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        if (((ProfileNavBarRootComponent) aqS6S1301000_4.l1).LJLJJI.contains(aqS6S1301000_4.s0)) {
            ((ProfileNavBarRootComponent) aqS6S1301000_4.l1).H3(aqS6S1301000_4.i4, (ProfileComponents) aqS6S1301000_4.l2, aqS6S1301000_4.s0);
        } else {
            assemble.nv0((ProfileNavBarRootComponent) aqS6S1301000_4.l1, new AqS13S1101000_4(aqS6S1301000_4.i4, (ProfileComponents) aqS6S1301000_4.l2, aqS6S1301000_4.s0, 5));
            ProfileNavBarRootComponent profileNavBarRootComponent = (ProfileNavBarRootComponent) aqS6S1301000_4.l1;
            assemble.wv0(profileNavBarRootComponent, new AqS47S1200000_4((C234109Gs) aqS6S1301000_4.l3, aqS6S1301000_4.s0, profileNavBarRootComponent, 30));
            ((ProfileNavBarRootComponent) aqS6S1301000_4.l1).LJLJJI.add(aqS6S1301000_4.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS6S1301000_4 aqS6S1301000_4, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        ProfileNavBarBaseComponent profileNavBarBaseComponent = (ProfileNavBarBaseComponent) aqS6S1301000_4.l1;
        assemble.nv0(profileNavBarBaseComponent, new AqS8S1201000_4(profileNavBarBaseComponent, aqS6S1301000_4.i4, (ProfileComponents) aqS6S1301000_4.l3, aqS6S1301000_4.s0, 0));
        ProfileNavBarBaseComponent profileNavBarBaseComponent2 = (ProfileNavBarBaseComponent) aqS6S1301000_4.l1;
        assemble.wv0(profileNavBarBaseComponent2, new AqS47S1200000_4((C234109Gs) aqS6S1301000_4.l2, aqS6S1301000_4.s0, profileNavBarBaseComponent2, 33));
        ((ProfileNavBarBaseComponent) aqS6S1301000_4.l1).LJLJJL.put(((C234109Gs) aqS6S1301000_4.l2).LIZ, Integer.valueOf(aqS6S1301000_4.i4));
        ((ProfileNavBarBaseComponent) aqS6S1301000_4.l1).LJLJJI.add(aqS6S1301000_4.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S1301000_4(int i, ProductPackStruct productPackStruct, SkuPrice skuPrice, String str, Map map, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = map;
        this.l2 = productPackStruct;
        this.l3 = skuPrice;
        this.i4 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S1301000_4(ProfileNavBarRootComponent profileNavBarRootComponent, String str, int i, ProfileComponents profileComponents, C234109Gs c234109Gs, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = profileNavBarRootComponent;
        this.s0 = str;
        this.i4 = i;
        this.l2 = profileComponents;
        this.l3 = c234109Gs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S1301000_4(ProfileNavBarBaseComponent profileNavBarBaseComponent, C234109Gs c234109Gs, int i, String str, ProfileComponents profileComponents, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = profileNavBarBaseComponent;
        this.l2 = c234109Gs;
        this.i4 = i;
        this.s0 = str;
        this.l3 = profileComponents;
    }
}
