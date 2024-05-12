package com.ss.android.ugc.aweme.ecommerce.global.address.edit;

import X.C26059AKp;
import X.C27021Aj3;
import X.C27230AmQ;
import X.C27231AmR;
import X.C27739Aud;
import X.C32I;
import X.C76800UCe;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressVerifyData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CheckShippingAddressData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class GlobalAddressEditViewModel extends AddressEditViewModel {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final int Rv0() {
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Cw0(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r12, X.C27021Aj3 r13) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig r0 = r11.LLIIJI
            r8 = 0
            if (r0 == 0) goto L20
            java.lang.String r2 = r0.districtsConcatenateKeys
            if (r2 == 0) goto L20
            java.lang.String r0 = ","
            java.lang.String[] r1 = new java.lang.String[]{r0}
            r0 = 6
            java.util.List r1 = ujb.s.LJLJJL(r2, r1, r8, r0)
        L14:
            java.lang.Object r6 = r13.LIZIZ
            boolean r0 = r6 instanceof java.util.List
            r5 = 0
            if (r0 == 0) goto L1f
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L23
        L1f:
            return
        L20:
            X.OQg r1 = X.C61878OQg.INSTANCE
            goto L14
        L23:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r4 = r12.districts
            if (r4 == 0) goto Ld0
            java.util.Iterator r10 = r1.iterator()
        L2b:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Ld0
            java.lang.Object r2 = r10.next()
            int r9 = r8 + 1
            if (r8 < 0) goto Lcc
            java.util.Iterator r1 = r6.iterator()
        L3d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lca
            java.lang.Object r3 = r1.next()
            r0 = r3
            X.Aj3 r0 = (X.C27021Aj3) r0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r0.LIZ
            java.lang.String r0 = r0.key
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 == 0) goto L3d
        L54:
            X.Aj3 r3 = (X.C27021Aj3) r3
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem> r0 = r12.items
            if (r0 == 0) goto Lc8
            java.util.Iterator r7 = r0.iterator()
        L5e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lc6
            java.lang.Object r2 = r7.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r0
            java.lang.String r1 = r0.key
            if (r3 == 0) goto Lc4
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r3.LIZ
            if (r0 == 0) goto Lc4
            java.lang.String r0 = r0.key
        L75:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L5e
        L7b:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r2 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r2
            if (r2 == 0) goto Lc8
            java.lang.String r7 = r2.value
        L81:
            if (r3 == 0) goto Lc2
            java.lang.Object r0 = r3.LIZIZ
        L85:
            boolean r0 = kotlin.jvm.internal.o.LJ(r7, r0)
            if (r0 != 0) goto L92
            if (r3 != 0) goto L8f
        L8d:
            r8 = r9
            goto L2b
        L8f:
            r3.LIZJ = r5
            goto L94
        L92:
            if (r3 == 0) goto L8d
        L94:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r3.LIZ
            if (r0 == 0) goto L8d
            java.lang.Integer r2 = r0.type
            if (r2 != 0) goto L9d
            goto L8d
        L9d:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto Lb9
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r8, r4)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region) r0
            if (r0 == 0) goto L8d
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r0 = com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region.LIZ(r0, r7)
            if (r0 == 0) goto L8d
            java.util.List r0 = X.C47261Igj.LJJIJ(r0)
            r3.LIZIZ = r0
            goto L8d
        Lb9:
            int r0 = r2.intValue()
            if (r0 != 0) goto L8d
            r3.LIZIZ = r7
            goto L8d
        Lc2:
            r0 = r5
            goto L85
        Lc4:
            r0 = r5
            goto L75
        Lc6:
            r2 = r5
            goto L7b
        Lc8:
            r7 = r5
            goto L81
        Lca:
            r3 = r5
            goto L54
        Lcc:
            X.C47261Igj.LJJJJJ()
            throw r5
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.global.address.edit.GlobalAddressEditViewModel.Cw0(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, X.Aj3):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0121. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0187  */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.List] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address Nv0(java.util.List<X.C27021Aj3> r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.global.address.edit.GlobalAddressEditViewModel.Nv0(java.util.List, boolean):com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02fb, code lost:
    
        if (r5 != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0347, code lost:
    
        if (r14.equals("region") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03ec, code lost:
    
        if (r5.equals("email") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03fa, code lost:
    
        r27 = null;
        r19 = new X.C27021Aj3(r1, X.C79043V0l.LJ(r1.key, r10), false, null, false, null, 252);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x03f6, code lost:
    
        if (r5.equals("name") == false) goto L43;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:38:0x00f1. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02da  */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C27021Aj3> iw0(com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState r37, com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r38) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.global.address.edit.GlobalAddressEditViewModel.iw0(com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState, com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData):java.util.List");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final C27021Aj3 uw0(Address address, C27021Aj3 c27021Aj3) {
        Integer num = c27021Aj3.LIZ.type;
        if (num == null || num.intValue() != -100) {
            return null;
        }
        C27021Aj3 LIZ = C27021Aj3.LIZ(c27021Aj3, null, null, false, false, null, 123);
        Cw0(address, LIZ);
        return LIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel
    public final void aw0(Address address, CheckShippingAddressData checkShippingAddressData, Integer num) {
        Integer num2;
        o.LJIIIZ(address, "address");
        if (checkShippingAddressData == null || num == null || num.intValue() != 4) {
            return;
        }
        List<Error> list = checkShippingAddressData.errors;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (Error error : list) {
                arrayList.add(new C27230AmQ(error.key, error.error));
            }
            xw0(arrayList, C27231AmR.LJLIL);
            return;
        }
        AddressVerifyData addressVerifyData = checkShippingAddressData.verifyData;
        if (addressVerifyData == null || (num2 = addressVerifyData.status) == null || num2.intValue() != 1) {
            fw0(address);
            return;
        }
        if (checkShippingAddressData.verifyData.tipInfo != null) {
            C26059AKp.LIZ().LIZ("ec_show_check_address_result", C27739Aud.LJI(checkShippingAddressData));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        fw0(address);
    }
}
