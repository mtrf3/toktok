package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.C93651aUJ;
import X.C93970aZS;
import X.C93971aZT;
import X.C94207adH;
import X.C94214adO;
import X.C94251adz;
import X.C94252ae0;
import X.C94456ahI;
import X.C94457ahJ;
import X.C94518aiI;
import X.EnumC93674aUg;
import X.InterfaceC88472Yns;
import X.InterfaceC93649aUH;
import X.InterfaceC93786aWU;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.objectselect.api.AssetsLibData;
import com.bytedance.effectcreatormobile.objectselect.api.IAssetsLibResProvider;
import com.bytedance.effectcreatormobile.objectselect.viewmodel.StickerViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.news.common.service.manager.IService;
import java.util.List;

/* loaded from: classes34.dex */
public class IDqS5S0201000_42 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(IDqS5S0201000_42 iDqS5S0201000_42, Object it) {
        o.LJIIIZ(it, "it");
        InterfaceC93649aUH<T> interfaceC93649aUH = ((C93651aUJ) iDqS5S0201000_42.l0).LIZ;
        if (interfaceC93649aUH != 0) {
            int i = iDqS5S0201000_42.i2;
            interfaceC93649aUH.LIZ(i, ListProtector.get((List) iDqS5S0201000_42.l1, i));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS5S0201000_42 iDqS5S0201000_42, Object it) {
        IService iService;
        o.LJIIIZ(it, "it");
        C94457ahJ c94457ahJ = (C94457ahJ) iDqS5S0201000_42.l0;
        c94457ahJ.LJLLLLLL(ListProtector.get(c94457ahJ.LJLIL, iDqS5S0201000_42.i2), EnumC93674aUg.Loading);
        int adapterPosition = ((C94456ahI) iDqS5S0201000_42.l1).getAdapterPosition();
        C94457ahJ c94457ahJ2 = (C94457ahJ) iDqS5S0201000_42.l0;
        c94457ahJ2.LJLJI = adapterPosition;
        String str = ((AssetsLibData.AssetsItemData) ListProtector.get(c94457ahJ2.LJLIL, adapterPosition)).extra;
        C94207adH c94207adH = new C94207adH((C94457ahJ) iDqS5S0201000_42.l0, (C94456ahI) iDqS5S0201000_42.l1, str, adapterPosition);
        StickerViewModel stickerViewModel = ((C94457ahJ) iDqS5S0201000_42.l0).LJLJJL;
        IDqS446S0100000_42 iDqS446S0100000_42 = new IDqS446S0100000_42(c94207adH, 6);
        stickerViewModel.getClass();
        C93970aZS LIZ = C93971aZT.LIZ();
        if (LIZ != null) {
            iService = (IService) LIZ.LIZ(IAssetsLibResProvider.class);
        } else {
            iService = null;
        }
        IAssetsLibResProvider iAssetsLibResProvider = (IAssetsLibResProvider) iService;
        if (iAssetsLibResProvider != null) {
            iAssetsLibResProvider.downloadRes(str, new C94214adO(iDqS446S0100000_42));
        } else {
            iDqS446S0100000_42.invoke(Boolean.FALSE, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS5S0201000_42 iDqS5S0201000_42, Object it) {
        o.LJIIIZ(it, "it");
        InterfaceC93786aWU interfaceC93786aWU = ((C94251adz) iDqS5S0201000_42.l0).LJLIL;
        if (interfaceC93786aWU != null) {
            interfaceC93786aWU.LIZ((C94252ae0) iDqS5S0201000_42.l1, iDqS5S0201000_42.i2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(IDqS5S0201000_42 iDqS5S0201000_42, Object obj) {
        ((Boolean) obj).booleanValue();
        C94518aiI c94518aiI = (C94518aiI) iDqS5S0201000_42.l0;
        FragmentManager fragmentManager = (FragmentManager) iDqS5S0201000_42.l1;
        int i = iDqS5S0201000_42.i2;
        c94518aiI.getClass();
        C94518aiI.LJIIIZ(fragmentManager, i, false);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS5S0201000_42(C93651aUJ c93651aUJ, int i, List list, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c93651aUJ;
        this.i2 = i;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS5S0201000_42(C94251adz c94251adz, C94252ae0 c94252ae0, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c94251adz;
        this.l1 = c94252ae0;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS5S0201000_42(C94457ahJ c94457ahJ, int i, C94456ahI c94456ahI, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c94457ahJ;
        this.i2 = i;
        this.l1 = c94456ahI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS5S0201000_42(C94518aiI c94518aiI, FragmentManager fragmentManager, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c94518aiI;
        this.l1 = fragmentManager;
        this.i2 = i;
    }
}
