package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2.SpecListLayoutV2;
import java.util.List;
import kotlin.jvm.internal.AqS14S0102000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS5S1102000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RfJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70105RfJ implements InterfaceC70062Rec {
    public final InterfaceC70059ReZ LJLIL;
    public RWJ LJLILLLLZI;

    public C70105RfJ(InterfaceC70059ReZ interfaceC70059ReZ) {
        this.LJLIL = interfaceC70059ReZ;
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSizeGuideClick(SizeGuide sizeGuide) {
        InterfaceC70059ReZ interfaceC70059ReZ = this.LJLIL;
        if (interfaceC70059ReZ != null) {
            interfaceC70059ReZ.onSizeGuideClick(sizeGuide);
        }
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSpecListLayoutBind(SpecListLayoutV2 specListLayoutV2, RWJ vo) {
        o.LJIIIZ(vo, "vo");
        this.LJLILLLLZI = vo;
        if (specListLayoutV2 != null) {
            C78946Uyc.LJJIIJZLJL(specListLayoutV2, new C70920RsS(), C70106RfK.LJLIL, new AqS178S0100000_12(vo, 678));
        }
        InterfaceC70059ReZ interfaceC70059ReZ = this.LJLIL;
        if (interfaceC70059ReZ != null) {
            interfaceC70059ReZ.onSpecListLayoutBind(specListLayoutV2, vo);
        }
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSpecLayoutBind(C70248Rhc c70248Rhc, int i, List<C70216Rh6> list) {
        InterfaceC70059ReZ interfaceC70059ReZ = this.LJLIL;
        if (interfaceC70059ReZ != null) {
            interfaceC70059ReZ.onSpecLayoutBind(c70248Rhc, i, list);
        }
    }

    @Override // X.InterfaceC70062Rec
    public final boolean LLLLLLZ(String[] strArr, int i, String propValueId, List<SkuItem> list) {
        o.LJIIIZ(propValueId, "propValueId");
        String[] LJ = C70053ReT.LJ(i + 1, strArr);
        if (i >= LJ.length) {
            return false;
        }
        LJ[i] = propValueId;
        if (RXW.LIZ(list, LJ) <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSpecItemBind(View view, int i, int i2, C70216Rh6 c70216Rh6) {
        if (view != null) {
            C78946Uyc.LJJIIJZLJL(view, new C70918RsQ(0), new AqS162S0100000_12(c70216Rh6, 1213), new AqS14S0102000_12(i, i2, c70216Rh6, 3));
        }
        InterfaceC70059ReZ interfaceC70059ReZ = this.LJLIL;
        if (interfaceC70059ReZ != null) {
            interfaceC70059ReZ.onSpecItemBind(view, i, i2, c70216Rh6);
        }
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSpecChecked(View view, int i, int i2, C70216Rh6 c70216Rh6, boolean z) {
        List<String> list;
        Object[] array;
        o.LJIIIZ(view, "view");
        RWJ rwj = this.LJLILLLLZI;
        String str = null;
        if (rwj != null && (list = rwj.LJFF) != null && (array = list.toArray(new String[0])) != null) {
            Object LJJJJI = ORY.LJJJJI(i, array);
            if (c70216Rh6 != null) {
                str = c70216Rh6.LIZ;
            }
            str = o.LJ(LJJJJI, str) ? "cancel" : "select";
        }
        C78946Uyc.LJJIIJ(view, new C70917RsP(), new AqS5S1102000_12(str, i, i2, c70216Rh6, 4));
        InterfaceC70059ReZ interfaceC70059ReZ = this.LJLIL;
        if (interfaceC70059ReZ != null) {
            interfaceC70059ReZ.onSpecChecked(view, i, i2, c70216Rh6, z);
        }
    }
}
