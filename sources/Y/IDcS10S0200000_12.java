package Y;

import X.AbstractC028509h;
import X.AbstractC73295Spf;
import X.C0A2;
import X.C27500Aqm;
import X.C73228Soa;
import X.InterfaceC57784Mm4;
import X.ORZ;
import X.SBC;
import X.SIU;
import X.SYL;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.assem.MentionVideoListAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressAssemV2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardAssem;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileListFragment;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class IDcS10S0200000_12 extends AbstractC028509h {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC028509h
    public final int LJFF(int i) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, i);
            case 1:
                return LJFF$1(this, i);
            case 2:
                return LJFF$2(this, i);
            case 3:
                return LJFF$3(this, i);
            case 4:
                return LJFF$4(this, i);
            default:
                return super.LJFF(i);
        }
    }

    public static final int LJFF$0(IDcS10S0200000_12 iDcS10S0200000_12, int i) {
        List<InterfaceC57784Mm4> LJII = ((MentionVideoListAssem) iDcS10S0200000_12.l0).v3().getState().LJII();
        int headerCount = ((MentionVideoListAssem) iDcS10S0200000_12.l0).v3().getHeaderCount();
        if (i < headerCount) {
            return ((WrapGridLayoutManager) iDcS10S0200000_12.l1).LLIIIL;
        }
        if (i >= ((ArrayList) LJII).size() + headerCount) {
            return ((WrapGridLayoutManager) iDcS10S0200000_12.l1).LLIIIL;
        }
        if (ListProtector.get(LJII, i - headerCount) instanceof SIU) {
            return ((WrapGridLayoutManager) iDcS10S0200000_12.l1).LLIIIL;
        }
        return 1;
    }

    public static final int LJFF$1(IDcS10S0200000_12 iDcS10S0200000_12, int i) {
        SBC sbc;
        List<String> ids;
        if (C27500Aqm.LIZ()) {
            Object LJLLLLLL = ORZ.LJLLLLLL(i, ((SYL) iDcS10S0200000_12.l0).getState().LJII());
            Object obj = null;
            if ((LJLLLLLL instanceof SBC) && (sbc = (SBC) LJLLLLLL) != null && (ids = sbc.getIds()) != null) {
                obj = ORZ.LJLLLL(ids);
            }
            if (ORZ.LJLJJI(obj, ((CCDCAddCardAssem) iDcS10S0200000_12.l1).getViewModel().LJLJLJ)) {
                return 1;
            }
        }
        return 2;
    }

    public static final int LJFF$2(IDcS10S0200000_12 iDcS10S0200000_12, int i) {
        SBC sbc;
        List<String> ids;
        Object LJLLLLLL = ORZ.LJLLLLLL(i, ((SYL) iDcS10S0200000_12.l0).getState().LJII());
        Object obj = null;
        if ((LJLLLLLL instanceof SBC) && (sbc = (SBC) LJLLLLLL) != null && (ids = sbc.getIds()) != null) {
            obj = ORZ.LJLLLL(ids);
        }
        if (ORZ.LJLJJI(obj, ((BillingAddressAssemV2) iDcS10S0200000_12.l1).v3().LJLJJI)) {
            return 1;
        }
        return 2;
    }

    public static final int LJFF$3(IDcS10S0200000_12 iDcS10S0200000_12, int i) {
        AbstractC73295Spf abstractC73295Spf = (AbstractC73295Spf) iDcS10S0200000_12.l0;
        if (i != 0) {
            if (i != abstractC73295Spf.getItemCount() - 1) {
                return 1;
            }
        } else {
            abstractC73295Spf.getClass();
        }
        return ((GridLayoutManager) ((C0A2) iDcS10S0200000_12.l1)).LLIIIL;
    }

    public static final int LJFF$4(IDcS10S0200000_12 iDcS10S0200000_12, int i) {
        int i2;
        List<? extends NewFaceStickerBean> list = ((C73228Soa) iDcS10S0200000_12.l0).LJJIIZI().LIZJ;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        if (i < i2) {
            return 1;
        }
        return ((EffectProfileListFragment) iDcS10S0200000_12.l1).Il();
    }

    public IDcS10S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
