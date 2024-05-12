package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;

/* renamed from: X.Amn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27253Amn implements InterfaceC27028AjA {
    public final /* synthetic */ CandHelper LIZ;
    public final /* synthetic */ AddressEditViewModel LIZIZ;
    public final /* synthetic */ String LIZJ;

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
    
        if (r2 != null) goto L20;
     */
    @Override // X.InterfaceC27028AjA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onItemClick(int r13) {
        /*
            r12 = this;
            com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper r0 = r12.LIZ
            X.AjB r0 = r0.LJ
            java.lang.String r5 = "mAdapter"
            r3 = 0
            if (r0 == 0) goto Lbb
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData> r0 = r0.LJLIL
            r4 = 0
            if (r0 == 0) goto Lb1
            int r0 = r0.size()
            if (r0 <= 0) goto Lb1
            if (r13 < 0) goto Lb1
            if (r13 >= r0) goto Lb1
            com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper r0 = r12.LIZ
            X.AjB r0 = r0.LJ
            if (r0 == 0) goto Lad
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData> r0 = r0.LJLIL
            if (r0 == 0) goto La7
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r13)
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData r2 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData) r2
        L28:
            java.lang.String r1 = r12.LIZJ
            java.lang.String r0 = "address"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto La4
            if (r2 == 0) goto L43
            java.lang.Integer r0 = r2.placeType
            if (r0 != 0) goto L7e
        L38:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r2.address
            if (r0 == 0) goto L43
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = r12.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r2.address
            r1.vw0(r0)
        L43:
            com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper r0 = r12.LIZ
            int r6 = r0.LIZIZ()
            com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper r0 = r12.LIZ
            X.AjB r0 = r0.LJ
            if (r0 == 0) goto La9
            boolean r0 = r0.LJLJJI
            if (r0 == 0) goto L55
            int r13 = r13 + (-1)
        L55:
            if (r6 <= 0) goto L6c
            if (r13 < 0) goto L6c
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r5 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment.LLD
            if (r5 == 0) goto L6c
            X.Rta r2 = new X.Rta
            r2.<init>()
            X.Amq r1 = new X.Amq
            java.lang.String r0 = r12.LIZJ
            r1.<init>(r0, r6, r13)
            X.C78946Uyc.LJJII(r5, r2, r1)
        L6c:
            com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper r2 = r12.LIZ
            java.lang.String r0 = "sug"
            r2.LJIIIIZZ = r0
            r2.LJI = r4
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = r12.LIZIZ
            r1.LLIIII = r3
            java.lang.String r0 = r12.LIZJ
            r2.LIZ(r1, r0)
            return
        L7e:
            int r0 = r0.intValue()
            if (r0 != 0) goto L38
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r6 = r12.LIZIZ
            if (r2 == 0) goto La2
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r7 = r2.address
        L8a:
            com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper r1 = r12.LIZ
            java.lang.String r8 = r1.LJIIJ
            if (r2 == 0) goto L9f
            java.lang.String r9 = r2.autocompleteAddressId
            java.lang.Integer r10 = r2.placeType
        L94:
            kotlin.jvm.internal.AqS135S0200000_4 r11 = new kotlin.jvm.internal.AqS135S0200000_4
            r0 = 8
            r11.<init>(r6, r1, r0)
            r6.jw0(r7, r8, r9, r10, r11)
            goto L43
        L9f:
            r9 = r3
            r10 = r3
            goto L94
        La2:
            r7 = r3
            goto L8a
        La4:
            if (r2 == 0) goto L43
            goto L38
        La7:
            r2 = r3
            goto L28
        La9:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r3
        Lad:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r3
        Lb1:
            com.ss.android.ugc.aweme.ecommerce.base.address.candinput.CandHelper r2 = r12.LIZ
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r1 = r12.LIZIZ
            java.lang.String r0 = r12.LIZJ
            r2.LIZ(r1, r0)
            return
        Lbb:
            kotlin.jvm.internal.o.LJIJI(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27253Amn.onItemClick(int):void");
    }

    public C27253Amn(CandHelper candHelper, AddressEditViewModel addressEditViewModel, String str) {
        this.LIZ = candHelper;
        this.LIZIZ = addressEditViewModel;
        this.LIZJ = str;
    }
}
