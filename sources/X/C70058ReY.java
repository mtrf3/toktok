package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2.SpecListLayoutV2;
import java.util.List;
import kotlin.jvm.internal.AqS0S1011000_12;
import kotlin.jvm.internal.AqS2S1211000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.ReY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70058ReY implements InterfaceC70062Rec {
    public final InterfaceC70059ReZ LJLIL;
    public String[] LJLILLLLZI;
    public RWJ LJLJI;

    public C70058ReY(InterfaceC70059ReZ interfaceC70059ReZ) {
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
        String[] strArr;
        o.LJIIIZ(vo, "vo");
        this.LJLJI = vo;
        if (this.LJLILLLLZI == null) {
            List<String> list = vo.LJFF;
            if (list != null) {
                strArr = (String[]) list.toArray(new String[0]);
            } else {
                strArr = null;
            }
            this.LJLILLLLZI = strArr;
        }
        InterfaceC70059ReZ interfaceC70059ReZ = this.LJLIL;
        if (interfaceC70059ReZ != null) {
            interfaceC70059ReZ.onSpecListLayoutBind(specListLayoutV2, vo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    @Override // X.InterfaceC70059ReZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSpecLayoutBind(X.C70248Rhc r7, int r8, java.util.List<X.C70216Rh6> r9) {
        /*
            r6 = this;
            X.RWJ r5 = r6.LJLJI
            if (r5 != 0) goto Lc
        L4:
            X.ReZ r0 = r6.LJLIL
            if (r0 == 0) goto Lb
            r0.onSpecLayoutBind(r7, r8, r9)
        Lb:
            return
        Lc:
            r3 = 0
            if (r9 == 0) goto L59
            java.util.Iterator r2 = r9.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Rh6 r0 = (X.C70216Rh6) r0
            boolean r0 = r0.LJ
            if (r0 == 0) goto L13
        L24:
            if (r1 == 0) goto L55
            r4 = 1
        L27:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp> r0 = r5.LIZ
            if (r0 == 0) goto L52
            java.lang.Object r2 = X.ORZ.LJLLLLLL(r8, r0)
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp r2 = (com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp) r2
            if (r2 == 0) goto L53
            java.lang.String r1 = r2.propId
        L35:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo r0 = r5.LIZIZ
            if (r0 == 0) goto L3b
            java.lang.String r3 = r0.skcPropertyId
        L3b:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r3)
            if (r0 == 0) goto L5b
            X.RsS r3 = new X.RsS
            r3.<init>()
            X.Rea r2 = X.C70060Rea.LJLIL
            kotlin.jvm.internal.AqS31S0210000_12 r1 = new kotlin.jvm.internal.AqS31S0210000_12
            r0 = 5
            r1.<init>(r6, r5, r4, r0)
            X.C78946Uyc.LJJIIJZLJL(r7, r3, r2, r1)
            goto L4
        L52:
            r2 = r3
        L53:
            r1 = r3
            goto L35
        L55:
            r4 = 0
            goto L27
        L57:
            r1 = r3
            goto L24
        L59:
            r1 = r3
            goto L24
        L5b:
            if (r2 == 0) goto L67
            java.lang.Boolean r1 = r2.hasImage
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L4
        L67:
            X.RsS r3 = new X.RsS
            r3.<init>()
            X.Reb r2 = X.C70061Reb.LJLIL
            kotlin.jvm.internal.AqS54S0110000_12 r1 = new kotlin.jvm.internal.AqS54S0110000_12
            r0 = 17
            r1.<init>(r5, r4, r0)
            X.C78946Uyc.LJJIIJZLJL(r7, r3, r2, r1)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70058ReY.onSpecLayoutBind(X.Rhc, int, java.util.List):void");
    }

    @Override // X.InterfaceC70062Rec
    public final boolean LLLLLLZ(String[] strArr, int i, String propValueId, List<SkuItem> list) {
        int i2;
        o.LJIIIZ(propValueId, "propValueId");
        if (i == 0) {
            if (strArr != null) {
                i2 = strArr.length;
            } else {
                i2 = 1;
            }
            String[] strArr2 = new String[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                strArr2[i3] = "";
            }
            strArr2[0] = propValueId;
            if (RXW.LIZ(list, strArr2) > 0) {
                return true;
            }
            return false;
        }
        String[] LJ = C70053ReT.LJ(i + 1, strArr);
        LJ[i] = propValueId;
        if (RXW.LIZ(list, LJ) > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSpecItemBind(View view, int i, int i2, C70216Rh6 c70216Rh6) {
        InterfaceC70059ReZ interfaceC70059ReZ = this.LJLIL;
        if (interfaceC70059ReZ != null) {
            interfaceC70059ReZ.onSpecItemBind(view, i, i2, c70216Rh6);
        }
    }

    @Override // X.InterfaceC70059ReZ
    public final void onSpecChecked(View view, int i, int i2, C70216Rh6 c70216Rh6, boolean z) {
        String str;
        boolean z2;
        SkcInfo skcInfo;
        String str2;
        List<SaleProp> list;
        String str3;
        SkcInfo skcInfo2;
        List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc> list2;
        o.LJIIIZ(view, "view");
        if (c70216Rh6 == null || (str = c70216Rh6.LIZ) == null) {
            str = "";
        }
        if (c70216Rh6 != null && c70216Rh6.LJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        RWJ rwj = this.LJLJI;
        if (rwj != null) {
            if (i == 0) {
                SkcInfo skcInfo3 = rwj.LIZIZ;
                if (skcInfo3 != null && (str3 = skcInfo3.skcPropertyId) != null && !ujb.o.LJJJJJL(str3) && (skcInfo2 = rwj.LIZIZ) != null && (list2 = skcInfo2.skcList) != null && list2.size() > 1) {
                    C78946Uyc.LJJIIJ(view, new C70919RsR(), new AqS2S1211000_12(rwj, this, str, i2, z2, 2));
                }
            } else if (i == 1 && (skcInfo = rwj.LIZIZ) != null && (str2 = skcInfo.skcPropertyId) != null && !ujb.o.LJJJJJL(str2) && (list = rwj.LIZ) != null && list.size() > 1) {
                C78946Uyc.LJJIIJ(view, new C70919RsR(), new AqS0S1011000_12(str, i2, z2, 3));
            }
        }
        InterfaceC70059ReZ interfaceC70059ReZ = this.LJLIL;
        if (interfaceC70059ReZ != null) {
            interfaceC70059ReZ.onSpecChecked(view, i, i2, c70216Rh6, z);
        }
    }
}
